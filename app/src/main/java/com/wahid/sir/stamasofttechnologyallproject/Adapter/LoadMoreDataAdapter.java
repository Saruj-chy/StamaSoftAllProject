package com.wahid.sir.stamasofttechnologyallproject.Adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.wahid.sir.stamasofttechnologyallproject.Activity.DetailsActivity;
import com.wahid.sir.stamasofttechnologyallproject.Class.Country;
import com.wahid.sir.stamasofttechnologyallproject.Class.MoreData;
import com.wahid.sir.stamasofttechnologyallproject.R;

import java.util.List;

public class LoadMoreDataAdapter extends RecyclerView.Adapter<LoadMoreDataAdapter.CountryViewHolder> {


    private Context mCtx;
    private List<MoreData> countryList;

    public LoadMoreDataAdapter(Context mCtx, List<MoreData> productList) {
        this.mCtx = mCtx;
        this.countryList = productList;
    }

    //  subject search option
    public void filterList(List<MoreData> filteredList) {
        countryList = filteredList;
        notifyDataSetChanged();
    }

    @Override
    public CountryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.more_data_list, null);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CountryViewHolder holder, int position) {
        final MoreData dataList = countryList.get(position);





        holder.textViewUserId.setText(String.valueOf(dataList.getUserId()));
        holder.textViewId.setText(String.valueOf(dataList.getId()));
        holder.textViewTitle.setText(dataList.getTitle());
        holder.textViewBody.setText(dataList.getBody());



//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(mCtx, DetailsActivity.class) ;
//                intent.putExtra("id", country.getId()) ;
//                intent.putExtra("name",country.getName()) ;
//                intent.putExtra("price", country.getPrice()) ;
//                intent.putExtra("image", country.getImage()) ;
//                intent.putExtra("type", "price") ;
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                mCtx.startActivity(intent);
////                Toast.makeText(mCtx, "yes", Toast.LENGTH_SHORT).show();
//            }
//        });

    }

    @Override
    public int getItemCount() {
//        return 10;
        return countryList.size();
    }

    class CountryViewHolder extends RecyclerView.ViewHolder {

        TextView textViewUserId, textViewId, textViewTitle, textViewBody;
        ImageView imageView;

        public CountryViewHolder(View itemView) {
            super(itemView);

            textViewUserId = itemView.findViewById(R.id.text_user_id);
            textViewId = itemView.findViewById(R.id.text_id);
            textViewTitle = itemView.findViewById(R.id.text_title);
            textViewBody = itemView.findViewById(R.id.text_body);

            imageView = itemView.findViewById(R.id.image_view);
        }
    }
}