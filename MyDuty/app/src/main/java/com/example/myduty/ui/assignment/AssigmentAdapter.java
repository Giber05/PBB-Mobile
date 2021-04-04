package com.example.myduty.ui.assignment;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.myduty.R;
import com.example.myduty.ui.assignment.dummy.DummyContent.DummyItem;

import java.util.Arrays;
import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class AssigmentAdapter extends RecyclerView.Adapter<AssigmentAdapter.ViewHolder> {

    private final List<Assignment> mValues;

    public AssigmentAdapter(Assignment[] items) {
        mValues = Arrays.asList(items);
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView topicCourse;
        public final TextView deadlineText;
        public final TextView topicText;
        public Button doneButton;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            topicCourse = (TextView) view.findViewById(R.id.task_topic);
            deadlineText = (TextView) view.findViewById(R.id.deadline);
            doneButton = (Button) view.findViewById(R.id.done_btn);
            topicText = (TextView)view.findViewById(R.id.topic);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + deadlineText.getText() + "'";
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_assignment_list2, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
//        holder.mView = mValues.get(position);
        holder.topicCourse.setText(mValues.get(position).getCourse());
        holder.deadlineText.setText(mValues.get(position).getDeadline());
        holder.topicText.setText(mValues.get(position).getTopic());
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }


}