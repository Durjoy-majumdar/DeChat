package com.tencent.p014mm.plugin.nearlife.p084ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.nearlife.ui.LoadingMoreView */
public class LoadingMoreView extends LinearLayout {

    /* renamed from: d */
    public Context f115220d;

    /* renamed from: e */
    public ImageView f115221e = ((ImageView) findViewById(C0966R.C0970id.fni));

    public LoadingMoreView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f115220d = context;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b5x, this, true);
        ((LinearLayout) inflate.findViewById(C0966R.C0970id.g3g)).setVisibility(0);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(1000);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.f115221e.startAnimation(rotateAnimation);
    }
}
