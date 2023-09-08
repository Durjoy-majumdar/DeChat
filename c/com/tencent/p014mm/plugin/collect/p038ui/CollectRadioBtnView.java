package com.tencent.p014mm.plugin.collect.p038ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;

/* renamed from: com.tencent.mm.plugin.collect.ui.CollectRadioBtnView */
public class CollectRadioBtnView extends LinearLayout {

    /* renamed from: d */
    public ImageView f12176d;

    /* renamed from: e */
    public TextView f12177e;

    public CollectRadioBtnView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo2072a(context);
    }

    /* renamed from: a */
    public final void mo2072a(Context context) {
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.f7018v2, this);
        this.f12176d = (ImageView) inflate.findViewById(C0966R.C0970id.ic5);
        this.f12177e = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
    }

    public void setRadioSrc(int i) {
        this.f12176d.setImageResource(i);
    }

    public void setTitleText(String str) {
        this.f12177e.setText(str);
    }

    public CollectRadioBtnView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo2072a(context);
    }
}
