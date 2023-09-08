package com.tencent.p014mm.plugin.subapp.p109ui.pluginapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.AddFriendItemPreference */
public class AddFriendItemPreference extends Preference {

    /* renamed from: J */
    public String f21319J;

    /* renamed from: K */
    public int f21320K;

    /* renamed from: L */
    public int f21321L;

    /* renamed from: M */
    public int f21322M;

    /* renamed from: N */
    public Context f21323N;

    public AddFriendItemPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f4k);
        if (imageView != null) {
            imageView.setVisibility(8);
            Drawable drawable = this.f121284q;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
            } else {
                int i = this.f121282o;
                if (i != 0) {
                    imageView.setImageResource(i);
                    imageView.setVisibility(0);
                }
            }
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.gv6);
        int i2 = this.f21322M;
        if (i2 != -1) {
            linearLayout.setMinimumHeight(i2);
        }
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.kiq);
        if (textView != null) {
            textView.setVisibility(this.f21321L);
            textView.setText(this.f21319J);
            int i3 = this.f21320K;
            if (i3 != -1) {
                textView.setBackgroundDrawable(C76577a.m92158i(this.f21323N, i3));
            }
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        View.inflate(this.f121274d, C0966R.C0971layout.bda, viewGroup2);
        viewGroup2.setPadding(0, viewGroup2.getPaddingTop(), viewGroup2.getPaddingRight(), viewGroup2.getPaddingBottom());
        return x;
    }

    public AddFriendItemPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddFriendItemPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21319J = "";
        this.f21320K = -1;
        this.f21321L = 8;
        this.f21322M = -1;
        this.f21323N = context;
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
