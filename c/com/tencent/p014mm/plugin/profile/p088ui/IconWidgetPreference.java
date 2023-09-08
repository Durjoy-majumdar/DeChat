package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;

/* renamed from: com.tencent.mm.plugin.profile.ui.IconWidgetPreference */
public class IconWidgetPreference extends Preference {

    /* renamed from: J */
    public ImageView f20203J;

    /* renamed from: K */
    public int f20204K;

    /* renamed from: L */
    public Bitmap f20205L;

    public IconWidgetPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: I */
    public void mo5914I(Bitmap bitmap) {
        this.f20205L = bitmap;
        ImageView imageView = this.f20203J;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.i1e);
        this.f20203J = imageView;
        if (imageView != null) {
            imageView.setVisibility(8);
            int i = this.f20204K;
            if (i != -1) {
                this.f20203J.setImageResource(i);
                this.f20203J.setVisibility(0);
                return;
            }
            Bitmap bitmap = this.f20205L;
            if (bitmap != null) {
                this.f20203J.setImageBitmap(bitmap);
                this.f20203J.setVisibility(0);
            }
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        View.inflate(this.f121274d, C0966R.C0971layout.bfb, viewGroup2);
        return x;
    }

    public IconWidgetPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IconWidgetPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20203J = null;
        this.f20204K = -1;
        this.f20205L = null;
        this.f121271G = C0966R.C0971layout.bcy;
        this.f121272H = 0;
    }
}
