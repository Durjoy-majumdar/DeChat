package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.kinda.gen.KOnePxLineView;
import com.tencent.p014mm.sdk.platformtools.Log;

public class MMKOnePxLineView extends MMKView<LinearLayout> implements KOnePxLineView {
    private static final String TAG = "MMKOnePxLineView";
    private View mOnePxView;
    private float mOnePxViewHeight;
    private float mOnePxViewWidth;

    private void updateOrientation() {
        LinearLayout.LayoutParams layoutParams;
        Log.m105918d(TAG, "updateOrientation，更新分隔线方向前，本控件宽度：" + this.mOnePxViewWidth + "，高度：" + this.mOnePxViewHeight);
        if (this.mOnePxViewWidth >= this.mOnePxViewHeight) {
            Log.m105918d(TAG, "updateOrientation，分隔线为横向");
            layoutParams = new LinearLayout.LayoutParams(-1, 1);
        } else {
            Log.m105918d(TAG, "updateOrientation，分隔线为纵向");
            layoutParams = new LinearLayout.LayoutParams(1, -1);
        }
        this.mOnePxView.setLayoutParams(layoutParams);
    }

    public void setHeight(float f) {
        super.setHeight(f);
        this.mOnePxViewHeight = f;
        updateOrientation();
    }

    public void setWidth(float f) {
        super.setWidth(f);
        this.mOnePxViewWidth = f;
        updateOrientation();
    }

    public LinearLayout createView(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.mOnePxView = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        this.mOnePxViewWidth = -1.0f;
        this.mOnePxViewHeight = 1.0f;
        linearLayout.addView(this.mOnePxView, layoutParams);
        return linearLayout;
    }
}
