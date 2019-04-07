package com.example.jsonstudent.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jsonstudent.R;
import com.example.jsonstudent.model.Student;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentHolder> {
    private static final int MENU_ITEM_VIEW_TYPE = 0;
    private final Context mContext;

    // The list of Native Express ads and menu items.
    private final List<Object> mRecyclerViewItems;

    public StudentAdapter(Context mContext, List<Object> mRecyclerViewItems) {
        this.mContext = mContext;
        this.mRecyclerViewItems = mRecyclerViewItems;
    }

    public class StudentHolder extends RecyclerView.ViewHolder {


        TextView studentN;
        TextView studentId;
        TextView studentEmail;

        public StudentHolder(@NonNull View itemView) {
            super(itemView);
            studentN = (TextView) itemView.findViewById(R.id.text_student_name);
            studentId = (TextView) itemView.findViewById(R.id.text_student_id);
            studentEmail = (TextView) itemView.findViewById(R.id.text_student_email);

        }

    }

    @NonNull
    @Override
    public StudentAdapter.StudentHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        switch (viewType) {
            case MENU_ITEM_VIEW_TYPE:

         /*   case NATIVE_EXPRESS_AD_VIEW_TYPE:
                // fall through
            default:
                View nativeExpressLayoutView = LayoutInflater.from(
                        viewGroup.getContext()).inflate(R.layout.native_express_ad_container,
                        viewGroup, false);
                return new NativeExpressAdViewHolder(nativeExpressLayoutView);*/
            default:
                View menuItemLayoutView = LayoutInflater.from(viewGroup.getContext()).inflate(
                        R.layout.row_student, viewGroup, false);
                return new StudentHolder(menuItemLayoutView);
        }
    }

    @Override
    public void onBindViewHolder(StudentAdapter.StudentHolder holder, int position) {
        int viewType = getItemViewType(position);
        switch (viewType) {
            case MENU_ITEM_VIEW_TYPE:
            default:
                StudentHolder menuItemHolder = (StudentHolder) holder;
                Student menuItem = (Student) mRecyclerViewItems.get(position);

                // Add the menu item details to the menu item view.

                menuItemHolder.studentN.setText(menuItem.getStudentN());
                menuItemHolder.studentId.setText(menuItem.getStudentId());
                menuItemHolder.studentEmail.setText(menuItem.getStudentEmail());


        }
    }

        @Override
        public int getItemCount() {
            return mRecyclerViewItems.size();
        }


}
