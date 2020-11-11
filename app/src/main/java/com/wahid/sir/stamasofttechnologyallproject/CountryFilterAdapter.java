package com.wahid.sir.stamasofttechnologyallproject;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class CountryFilterAdapter extends RecyclerView.Adapter<CountryFilterAdapter.CountryViewHolder> {


    private Context mCtx;
    private List<Country> countryList;

    public CountryFilterAdapter(Context mCtx, List<Country> productList) {
        this.mCtx = mCtx;
        this.countryList = productList;
    }

    //  subject search option
    public void filterList(List<Country> filteredList) {
        countryList = filteredList;
        notifyDataSetChanged();
    }

    @Override
    public CountryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.filter_list, null);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CountryViewHolder holder, int position) {
        final Country product = countryList.get(position);

        Glide.with(mCtx)
                .load(product.getImage())
                .into(holder.imageView);



        holder.textViewName.setText(product.getName());
        holder.textViewStatus.setText(String.valueOf(product.getCountry()));


        Log.d("TAG", "name: "+ product.getImage() ) ;

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(mCtx, FoodDetailsActivity.class) ;
//                intent.putExtra("foodName", product.getFood_name()) ;
//                intent.putExtra("price", String.valueOf(product.getPrice())) ;
//                intent.putExtra("resturantName", product.getResturant_name()) ;
//                intent.putExtra("rating", product.getRating()) ;
//                intent.putExtra("image", product.getImage()) ;
//                mCtx.startActivity(intent);
//                Toast.makeText(mCtx, "yes", Toast.LENGTH_SHORT).show();
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    class CountryViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName, textViewStatus;
        ImageView imageView;

        public CountryViewHolder(View itemView) {
            super(itemView);

            textViewName = itemView.findViewById(R.id.textViewName);
            textViewStatus = itemView.findViewById(R.id.textViewStatus);

            imageView = itemView.findViewById(R.id.image_view);
        }
    }
}