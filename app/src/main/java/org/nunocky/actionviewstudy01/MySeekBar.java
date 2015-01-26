package org.nunocky.actionviewstudy01;

import android.content.Context;
import android.support.v7.view.CollapsibleActionView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;


/**
 * TODO: document your custom view class.
 */
public class MySeekBar extends LinearLayout implements CollapsibleActionView {
    public MySeekBar(Context context) {
        super(context);

        setGravity(Gravity.CENTER_VERTICAL);
        LinearLayout.LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        setLayoutParams(params);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View child = inflater.inflate(R.layout.actionview_seekbar, this, true);
        final SeekBar seekBar = (SeekBar) child.findViewById(R.id.seekbar);
        final TextView seekValue = (TextView) child.findViewById(R.id.seek_value);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekValue.setText(progress + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        seekBar.setProgress(50);
        seekValue.setText("50");
    }


    @Override
    public void onActionViewExpanded() {

    }

    @Override
    public void onActionViewCollapsed() {

    }
}
