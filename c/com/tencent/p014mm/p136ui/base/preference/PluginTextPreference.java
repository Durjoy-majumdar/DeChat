package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import t40.C77853a;

/* renamed from: com.tencent.mm.ui.base.preference.PluginTextPreference */
public final class PluginTextPreference extends Preference {

    /* renamed from: J */
    public ImageView f121259J;

    /* renamed from: K */
    public TextView f121260K;

    /* renamed from: L */
    public int f121261L;

    /* renamed from: M */
    public String f121262M;

    /* renamed from: N */
    public int f121263N;

    /* renamed from: P */
    public int f121264P;

    public PluginTextPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f4k);
        this.f121259J = imageView;
        imageView.setImageResource(this.f121261L);
        this.f121259J.setVisibility(this.f121264P);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.kip);
        this.f121260K = textView;
        textView.setText(this.f121262M);
        this.f121260K.setTextColor(this.f121263N);
    }

    public PluginTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PluginTextPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121259J = null;
        this.f121260K = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226876v);
        this.f121271G = obtainStyledAttributes.getResourceId(1, C0966R.C0971layout.bdv);
        this.f121261L = obtainStyledAttributes.getResourceId(0, 0);
        this.f121262M = obtainStyledAttributes.getString(2);
        this.f121263N = obtainStyledAttributes.getColor(3, -7039852);
        obtainStyledAttributes.recycle();
    }
}
