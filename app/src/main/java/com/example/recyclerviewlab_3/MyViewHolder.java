package com.example.recyclerviewlab_3;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MyViewHolder extends RecyclerView.ViewHolder {

    private View view;

    MyViewHolder(@NonNull View itemView) {
        super(itemView);
        this.view = itemView;
    }

    void bind(final Cactusic cactusic){

        TextView cactusName = view.findViewById(R.id.cactusName);
        TextView familyCactus = view.findViewById(R.id.familyCactus);
        ImageView image = view.findViewById(R.id.image);

        cactusName.setText(cactusic.getCactusName());
        familyCactus.setText(cactusic.getFamilyCactus());
       image.setImageResource(cactusic.getImage());

        view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(view.getContext(), ClickOnActivity.class);
                        intent.putExtra("cactusic", cactusic);
                        view.getContext().startActivity(intent);
                    }
                }
        );
    }
}