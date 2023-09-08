package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.base.preference.IconMsgPreference */
public class IconMsgPreference extends Preference {

    /* renamed from: J */
    public String f24245J;

    /* renamed from: K */
    public int f24246K;

    /* renamed from: L */
    public int f24247L;

    /* renamed from: M */
    public int f24248M;

    /* renamed from: N */
    public int f24249N;

    /* renamed from: P */
    public Context f24250P;

    /* renamed from: Q */
    public String f24251Q;

    public IconMsgPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f4k);
        if (imageView != null) {
            int i = this.f121282o;
            if (i != 0) {
                imageView.setImageResource(i);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.gv6);
        int i2 = this.f24249N;
        if (i2 != -1) {
            linearLayout.setMinimumHeight(i2);
        }
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.kiq);
        if (textView != null) {
            textView.setVisibility(this.f24247L);
            textView.setText(this.f24245J);
            int i3 = this.f24246K;
            if (i3 != -1) {
                textView.setBackgroundDrawable(C76577a.m92158i(this.f24250P, i3));
            }
        }
        ((ImageView) view.findViewById(C0966R.C0970id.kij)).setVisibility(this.f24248M);
        ((ViewGroup) view.findViewById(C0966R.C0970id.ity)).setVisibility(0);
        TextView textView2 = (TextView) view.findViewById(16908310);
        TextView textView3 = (TextView) view.findViewById(C0966R.C0970id.kir);
        if (Util.isNullOrNil(this.f24251Q)) {
            textView3.setVisibility(8);
            return;
        }
        textView3.setVisibility(0);
        textView3.setText(this.f24251Q);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        View.inflate(this.f121274d, C0966R.C0971layout.bea, viewGroup2);
        x.setMinimumHeight(x.getResources().getDimensionPixelSize(C0966R.dimen.f3955ld));
        return x;
    }

    public IconMsgPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24245J = "";
        this.f24246K = -1;
        this.f24247L = 8;
        this.f24248M = 8;
        this.f24249N = -1;
        this.f24251Q = "";
        this.f24250P = context;
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
