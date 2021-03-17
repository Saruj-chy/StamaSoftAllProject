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
import com.wahid.sir.stamasofttechnologyallproject.Class.Country;
import com.wahid.sir.stamasofttechnologyallproject.Activity.DetailsActivity;
import com.wahid.sir.stamasofttechnologyallproject.R;

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
        final Country country = countryList.get(position);

        Glide.with(mCtx)
                .load(country.getImage())
                .into(holder.imageView);



        holder.textViewName.setText(country.getName());
        holder.textViewStatus.setText(String.valueOf(country.getCountry()));


        Log.d("TAG", "name: "+ country.getImage() ) ;

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mCtx, DetailsActivity.class) ;
                intent.putExtra("id", country.getId()) ;
                intent.putExtra("name",country.getName()) ;
                intent.putExtra("country", country.getCountry()) ;
                intent.putExtra("image", country.getImage()) ;
                intent.putExtra("type", "country") ;
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mCtx.startActivity(intent);
//                Toast.makeText(mCtx, "yes", Toast.LENGTH_SHORT).show();
            }
        });

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