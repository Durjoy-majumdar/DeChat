package com.tencent.xweb.extension.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.xweb.C106947R;

public class VideoStatusLayout extends RelativeLayout {
    private static final String TAG = "VideoStatusLayout";
    private int duration = 1000;
    private HideRunnable mHideRunnable;
    private ImageView mImage;
    private VideoDotPercentIndicator mIndicator;
    private LinearLayout mLayoutStatus;
    private TextView mTvProgress;
    private TextView mTvStatus;

    public class HideRunnable implements Runnable {
        private HideRunnable() {
        }

        public void run() {
            VideoStatusLayout.this.setVisibility(8);
        }
    }

    public VideoStatusLayout(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(C106947R.C106949layout.cjm, this);
        this.mTvProgress = (TextView) findViewById(C106947R.C20125id.kxs);
        this.mImage = (ImageView) findViewById(C106947R.C20125id.f5f);
        this.mIndicator = (VideoDotPercentIndicator) findViewById(C106947R.C20125id.i88);
        this.mTvStatus = (TextView) findViewById(C106947R.C20125id.kiv);
        this.mLayoutStatus = (LinearLayout) findViewById(C106947R.C20125id.fll);
        this.mHideRunnable = new HideRunnable();
        setVisibility(8);
    }

    public void setBrightProgress(int i) {
        this.mIndicator.setProgress((float) i);
        this.mIndicator.setVisibility(0);
        this.mTvStatus.setText(C106947R.string.lpq);
        this.mLayoutStatus.setVisibility(0);
        this.mImage.setImageResource(C106947R.C106948drawable.b4b);
        this.mTvProgress.setVisibility(8);
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setVideoTimeProgress(String str) {
        this.mTvProgress.setText(str);
        this.mTvProgress.setVisibility(0);
        this.mLayoutStatus.setVisibility(8);
    }

    public void setVolumeProgress(int i) {
        this.mIndicator.setProgress((float) i);
        this.mIndicator.setVisibility(0);
        this.mTvStatus.setText(C106947R.string.lq7);
        this.mLayoutStatus.setVisibility(0);
        this.mImage.setImageResource(C106947R.C106948drawable.b4n);
        this.mTvProgress.setVisibility(8);
    }

    public void show() {
        setVisibility(0);
        removeCallbacks(this.mHideRunnable);
        postDelayed(this.mHideRunnable, (long) this.duration);
    }

    public VideoStatusLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }
}
