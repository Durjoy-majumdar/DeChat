package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandActionSingleHeaderView */
public class AppBrandActionSingleHeaderView extends LinearLayout {

    /* renamed from: d */
    public ImageView f11832d;

    /* renamed from: e */
    public TextView f11833e;

    public AppBrandActionSingleHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo1844a(context);
    }

    /* renamed from: a */
    public final void mo1844a(Context context) {
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.f6503gl, this);
        this.f11832d = (ImageView) findViewById(C0966R.C0970id.f6082ws);
        this.f11833e = (TextView) findViewById(C0966R.C0970id.f6083wt);
    }

    public ImageView getImageView() {
        return this.f11832d;
    }

    public void setImageDrawable(Drawable drawable) {
        this.f11832d.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        this.f11832d.setImageResource(i);
    }

    public void setTextViewText(String str) {
        this.f11833e.setText(str);
    }

    public void setTextViewTextColor(int i) {
        this.f11833e.setTextColor(i);
    }

    public AppBrandActionSingleHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo1844a(context);
    }
}
