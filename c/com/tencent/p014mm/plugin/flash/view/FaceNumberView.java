package com.tencent.p014mm.plugin.flash.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.flash.view.FaceNumberView */
public class FaceNumberView extends RelativeLayout {

    /* renamed from: d */
    public View f313149d;

    /* renamed from: e */
    public TextView f313150e;

    /* renamed from: f */
    public Animation f313151f;

    public FaceNumberView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setNumber(String str) {
        Log.m105925i("MicroMsg.FaceFlashManagerNumberView", "setNumber :%s", str);
        this.f313150e.setText(str);
    }

    public FaceNumberView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f313151f = new AlphaAnimation(0.0f, 1.0f);
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.a5n, this, true);
        setGravity(17);
        this.f313149d = findViewById(C0966R.C0970id.cq9);
        this.f313150e = (TextView) findViewById(C0966R.C0970id.cq5);
    }
}
