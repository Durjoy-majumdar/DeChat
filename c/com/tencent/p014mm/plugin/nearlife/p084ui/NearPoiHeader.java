package com.tencent.p014mm.plugin.nearlife.p084ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.nearlife.ui.NearPoiHeader */
public class NearPoiHeader extends LinearLayout {

    /* renamed from: d */
    public TextView f20078d;

    public NearPoiHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = View.inflate(context, C0966R.C0971layout.bjr, this);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.g47);
        this.f20078d = (TextView) inflate.findViewById(C0966R.C0970id.fnh);
    }

    public void setText(CharSequence charSequence) {
        this.f20078d.setText(charSequence);
    }

    public NearPoiHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = View.inflate(context, C0966R.C0971layout.bjr, this);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.g47);
        this.f20078d = (TextView) inflate.findViewById(C0966R.C0970id.fnh);
    }
}
