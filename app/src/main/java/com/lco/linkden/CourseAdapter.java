package com.lco.linkden;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseviewHolder>{
    private String[] data;
    private int[] images;
    public CourseAdapter(int[] images,String[] data){
        this.images=images;
        this.data=data;
    }
    @NonNull
    @Override
    public CourseviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item,parent,false);
        return new CourseviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseviewHolder holder, int position) {
         String title=data[position];
         holder.textView.setText(title);
        int image_id=images[position];
        holder.imageView.setImageResource(image_id);


    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class CourseviewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;

        public CourseviewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.profile_image);
            textView=itemView.findViewById(R.id.textView);
        }
    }
}
