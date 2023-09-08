package com.tencent.p014mm.pluginsdk.p133ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.HeadImgPreference */
public final class HeadImgPreference extends Preference {

    /* renamed from: J */
    public int f24026J;

    /* renamed from: K */
    public ImageView f24027K;

    public HeadImgPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        if (this.f24027K == null) {
            this.f24027K = (ImageView) view.findViewById(C0966R.C0970id.f4h);
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.gv6);
        int i = this.f24026J;
        if (i != -1) {
            linearLayout.setMinimumHeight(i);
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        View.inflate(this.f121274d, C0966R.C0971layout.bdj, viewGroup2);
        this.f24027K = (ImageView) x.findViewById(C0966R.C0970id.f4h);
        return x;
    }

    public HeadImgPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24026J = -1;
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
