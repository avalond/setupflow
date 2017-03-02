package com.bzitrology.setupflow.ui;

import com.bzitrology.setupflow.MainActivity;
import com.bzitrology.setupflow.R;
import com.bzitrology.setupflow.base.AbstractAdapter;
import com.bzitrology.setupflow.utils.SpaceItemDecoration;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by kevin.
 */
public class BusinessHour extends AppCompatActivity {
  private RecyclerView mServerTypeRv;
  private RecyclerView.LayoutManager mGridLayoutManager;
  private ServerTypeAdapter mServerTypeAdapter;
  private List<String> server;
  private Context mContext;

  //
  private RecyclerView mDayRecycle;
  private DayAdapter mDayAdapter;
  private RecyclerView.LayoutManager mLayoutManager;
  private List<String> data;

  private RelativeLayout mRelativeLayout;
  private LinearLayout mLinearLayout;
  private Button mCancelBt;
  private Button mSaveBt;


  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.business_layout);
    mContext = BusinessHour.this;

    mRelativeLayout = (RelativeLayout) findViewById(R.id.layout);
    mRelativeLayout.setVisibility(View.GONE);

    mLinearLayout = (LinearLayout) findViewById(R.id.buttonlayout);
    mLinearLayout.setVisibility(View.GONE);

    mCancelBt = (Button) findViewById(R.id.cancel);
    mCancelBt.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        Intent intent = new Intent(mContext, MainActivity.class);
        startActivity(intent);
      }
    });
    mSaveBt = (Button) findViewById(R.id.save);
    mSaveBt.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        Toast.makeText(mContext, "Save is ok", Toast.LENGTH_SHORT).show();
      }
    });

    mServerTypeRv = (RecyclerView) findViewById(R.id.servertype);
    mGridLayoutManager = new GridLayoutManager(mContext, 4);
    mServerTypeRv.setLayoutManager(mGridLayoutManager);
    mServerTypeRv.setHasFixedSize(true);
    mServerTypeRv.setItemAnimator(new DefaultItemAnimator());
    mServerTypeRv.addItemDecoration(new SpaceItemDecoration(6));
    mServerTypeAdapter = new ServerTypeAdapter(mContext, new AbstractAdapter.ItemClickListener<ServerTypeAdapter.ServerTypeHolder>() {
      @Override public void onClick(ServerTypeAdapter.ServerTypeHolder holder, View view, int position) {
        if (view == holder.mTextView) {
          mRelativeLayout.setVisibility(View.VISIBLE);
        }
      }


      @Override public void onItemClick(ServerTypeAdapter.ServerTypeHolder holder, View view, int position) {

      }
    });

    mServerTypeRv.setAdapter(mServerTypeAdapter);

    ///
    mDayRecycle = (RecyclerView) findViewById(R.id.dayry);
    mLayoutManager = new LinearLayoutManager(mContext);
    mDayRecycle.setLayoutManager(mLayoutManager);
    mDayRecycle.setHasFixedSize(true);
    mDayRecycle.setItemAnimator(new DefaultItemAnimator());
    mDayAdapter = new DayAdapter(mContext, null);
    mDayRecycle.setAdapter(mDayAdapter);

    initData();
    setday();
  }


  private void setday() {
    data = new ArrayList<>();
    data.add("Monday");
    data.add("Tuesday");
    data.add("Wednesday");
    data.add("Thursday");
    data.add("Friday");
    data.add("Saturday");
    data.add("Sunday");
    mDayAdapter.bind(data, false);
  }


  private void initData() {
    server = new ArrayList<>();
    server.add("breakfast");
    server.add("lunch");
    server.add("dinner");
    server.add("Add new ");
    mServerTypeAdapter.bind(server, false);
  }


  public class DayAdapter extends AbstractAdapter<String, DayAdapter.DayHolder> {
    /**
     * AbstractAdapter.
     *
     * @param context context
     * @param itemClickListener listener
     */
    public DayAdapter(Context context, ItemClickListener<DayHolder> itemClickListener) {
      super(context, itemClickListener);
    }


    @Override public Object getItem(int position) {
      return mDataSource.get(position);
    }


    @Override public DayHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      return new DayHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.day_week_layout, parent, false));
    }


    @Override public void onBindViewHolder(DayHolder holder, int position) {
      DayHolder dayHolder = holder;
      dayHolder.bindData(mDataSource.get(position));
      dayHolder.mCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
          if (isChecked) {
            mLinearLayout.setVisibility(View.VISIBLE);
          }
          //else {
          //   mLinearLayout.setVisibility(View.GONE);
          // }
        }
      });
    }


    public class DayHolder extends RecyclerView.ViewHolder {
      private TextView mDayText;
      private CheckBox mCheckBox;


      public DayHolder(View itemView) {
        super(itemView);
        mDayText = (TextView) itemView.findViewById(R.id.textViews);
        mCheckBox = (CheckBox) itemView.findViewById(R.id.check);
      }


      public void bindData(String s) {
        mDayText.setText(s + "");
      }
    }
  }

  ////
  public class ServerTypeAdapter extends AbstractAdapter<String, ServerTypeAdapter.ServerTypeHolder> {
    /**
     * AbstractAdapter.
     *
     * @param context context
     * @param itemClickListener listener
     */
    public ServerTypeAdapter(Context context, ItemClickListener<ServerTypeHolder> itemClickListener) {
      super(context, itemClickListener);
    }


    @Override public Object getItem(int position) {
      return mDataSource.get(position);
    }


    @Override public ServerTypeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      return new ServerTypeHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.server_type_item, parent, false));
    }


    @Override public void onBindViewHolder(ServerTypeHolder holder, int position) {
      ServerTypeHolder serverTypeHolder = holder;
      serverTypeHolder.bindData(mDataSource.get(position));
    }


    class ServerTypeHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

      private Button mTextView;


      public ServerTypeHolder(View itemView) {
        super(itemView);
        mTextView = (Button) itemView.findViewById(R.id.text);
        mTextView.setOnClickListener(this);
      }


      public void bindData(String s) {
        mTextView.setText(s);
      }


      @Override public void onClick(View v) {
        if (v == mTextView) {
          mListener.onClick(this, v, getLayoutPosition());
        }
      }
    }
  }
}
