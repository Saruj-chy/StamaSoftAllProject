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
import com.wahid.sir.stamasofttechnologyallproject.Class.Product;
import com.wahid.sir.stamasofttechnologyallproject.R;

import java.util.List;

public class DateFromToAdapter extends RecyclerView.Adapter<DateFromToAdapter.CountryViewHolder> {


    private Context mCtx;
    private List<Product> productList;

    public DateFromToAdapter(Context mCtx, List<Product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }


    @Override
    public CountryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_fromto, null);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CountryViewHolder holder, int position) {
        final Product country = productList.get(position);




        holder.textViewName.setText(country.getName());
        holder.textViewDes.setText(country.getDes());
        holder.textViewPrice.setText(country.getPrice());
        holder.textViewEntrydate.setText(country.getEntrydate());



//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(mCtx, DetailsActivity.class) ;
//                intent.putExtra("id", country.getId()) ;
//                intent.putExtra("name",country.getName()) ;
//                intent.putExtra("phone", country.getPhone()) ;
//                intent.putExtra("image", country.getImage()) ;
//                intent.putExtra("type", "phone") ;
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                mCtx.startActivity(intent);
////                Toast.makeText(mCtx, "yes", Toast.LENGTH_SHORT).show();
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class CountryViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName, textViewDes, textViewPrice, textViewEntrydate;

        public CountryViewHolder(View itemView) {
            super(itemView);

            textViewName = itemView.findViewById(R.id.text_name);
            textViewDes = itemView.findViewById(R.id.text_des);
            textViewPrice = itemView.findViewById(R.id.text_price);
            textViewEntrydate = itemView.findViewById(R.id.text_entrydate);

        }
    }
}