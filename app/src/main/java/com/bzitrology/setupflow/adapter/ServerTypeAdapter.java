package com.bzitrology.setupflow.adapter;

import com.bzitrology.setupflow.R;
import com.bzitrology.setupflow.base.AbstractAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kevin.
 */

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


  class ServerTypeHolder extends RecyclerView.ViewHolder {

    public ServerTypeHolder(View itemView) {
      super(itemView);
    }


    public void bindData(String s) {

    }
  }
}
