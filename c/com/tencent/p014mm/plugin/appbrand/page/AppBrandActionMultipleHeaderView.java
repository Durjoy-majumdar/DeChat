package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandActionMultipleHeaderView */
public class AppBrandActionMultipleHeaderView extends LinearLayout {

    /* renamed from: d */
    public ImageView f11830d;

    /* renamed from: e */
    public TextView f11831e;

    public AppBrandActionMultipleHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo1834a(context);
    }

    /* renamed from: a */
    public final void mo1834a(Context context) {
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.f6502gk, this);
        this.f11830d = (ImageView) findViewById(C0966R.C0970id.f6076wm);
        this.f11831e = (TextView) findViewById(C0966R.C0970id.f6077wn);
    }

    public String getH5Url() {
        return null;
    }

    public ImageView getImageView() {
        return this.f11830d;
    }

    public String getPath() {
        return null;
    }

    public int getType() {
        return 0;
    }

    public String getUsername() {
        return null;
    }

    public void setImageDrawable(Drawable drawable) {
        this.f11830d.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        this.f11830d.setImageResource(i);
    }

    public void setTextViewText(String str) {
        this.f11831e.setText(str);
    }

    public void setTextViewTextColor(int i) {
        this.f11831e.setTextColor(i);
    }

    public AppBrandActionMultipleHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo1834a(context);
    }
}
