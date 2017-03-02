package com.bzitrology.setupflow.base;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * @author kevin.
 */
public abstract class AbstractAdapter<IT, VH extends RecyclerView.ViewHolder>
    extends RecyclerView.Adapter<VH> {

  //数据源
  protected List<IT> mDataSource = new ArrayList<>();
  protected Context mContext;
  //点击事件的接口
  protected ItemClickListener<VH> mListener;

  private int mLastPosition = -1;
  private static final int DELAY = 138;


  @Override
  public int getItemCount() {

    return mDataSource.size();
  }


  /**
   * AbstractAdapter.
   *
   * @param context context
   * @param itemClickListener listener
   */
  public AbstractAdapter(Context context, ItemClickListener<VH> itemClickListener) {

    this.mContext = context;
    this.mListener = itemClickListener;
  }


  /**
   * bindData.
   *
   * @param conveyData convey data
   * @param append false,true
   */
  public void bind(final List<IT> conveyData, boolean append) {

    if (!append) {
      this.mDataSource.clear();
      notifyDataSetChanged();
    }
    this.mDataSource.addAll(conveyData);
    notifyDataSetChanged();
  }


  /**
   * delete.
   *
   * @param position position
   */
  public void delete(int position) {

    this.mDataSource.remove(position);
    notifyItemRemoved(position);
  }


  /**
   * remove.
   *
   * @param position position
   */
  public void remove(int position) {

    this.mDataSource.remove(position);
    notifyItemRemoved(position);
  }


  /**
   * update.
   *
   * @param position position
   * @param item IT
   */
  public void update(int position, IT item) {

    this.mDataSource.remove(position);
    this.mDataSource.add(position, item);
    notifyDataSetChanged();
  }


  /**
   * click interfaces .
   */
  public interface ItemClickListener<VH> {

    void onClick(VH holder, View view, int position);

    void onItemClick(VH holder, View view, int position);
  }


  public abstract Object getItem(int position);
}
