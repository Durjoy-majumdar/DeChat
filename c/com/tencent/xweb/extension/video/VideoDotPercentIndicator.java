package com.tencent.xweb.extension.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.xweb.C106947R;

public class VideoDotPercentIndicator extends LinearLayout {
    private static final int DOTS_NUM_DEFAULT = 8;
    private static final String TAG = "VideoDotPercentIndicator";
    private int mDotsNum;
    private LayoutInflater mInflater;

    public VideoDotPercentIndicator(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        this.mInflater = LayoutInflater.from(context);
        setDotsNum(0);
    }

    public void setDotsNum(int i) {
        if (i <= 1) {
            i = 8;
        }
        this.mDotsNum = i;
        removeAllViews();
        for (int i2 = 0; i2 < this.mDotsNum; i2++) {
            addView((ImageView) this.mInflater.inflate(C106947R.C106949layout.cjj, this, false));
        }
    }

    public void setProgress(float f) {
        int rint = (int) Math.rint((double) (Math.min(Math.max(f / 100.0f, 0.0f), 1.0f) * ((float) this.mDotsNum)));
        int i = 0;
        while (i < rint && i < getChildCount()) {
            ((ImageView) getChildAt(i)).setImageResource(C106947R.C106948drawable.b4i);
            i++;
        }
        while (i < getChildCount()) {
            ((ImageView) getChildAt(i)).setImageResource(C106947R.C106948drawable.b4h);
            i++;
        }
    }

    public VideoDotPercentIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public VideoDotPercentIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
