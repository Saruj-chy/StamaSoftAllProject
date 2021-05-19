package com.wahid.sir.stamasofttechnologyallproject.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.wahid.sir.stamasofttechnologyallproject.R;

import java.util.List;

public class DateDifferenceAdapter extends RecyclerView.Adapter<DateDifferenceAdapter.CountryViewHolder> {


    private Context mCtx;
    private List<String> dateList;

    public DateDifferenceAdapter(Context mCtx, List<String> dateList) {
        this.mCtx = mCtx;
        this.dateList = dateList;
    }

//    //  subject search option
//    public void filterList(List<MoreData> filteredList) {
//        countryList = filteredList;
//        notifyDataSetChanged();
//    }

    @Override
    public CountryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_date_list, null);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CountryViewHolder holder, int position) {
//        final MoreData dataList = countryList.get(position);





        holder.textViewDate.setText(String.valueOf(dateList.get(position)));
//        holder.textViewId.setText(String.valueOf(dataList.getId()));
//        holder.textViewTitle.setText(dataList.getTitle());
//        holder.textViewBody.setText(dataList.getBody());



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
        return dateList.size();
    }

    class CountryViewHolder extends RecyclerView.ViewHolder {

        TextView textViewDate ;

        public CountryViewHolder(View itemView) {
            super(itemView);

            textViewDate = itemView.findViewById(R.id.text_date_layout);

        }
    }
}