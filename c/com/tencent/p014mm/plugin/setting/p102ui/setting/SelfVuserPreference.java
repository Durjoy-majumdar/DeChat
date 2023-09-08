package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SelfVuserPreference */
public class SelfVuserPreference extends Preference {

    /* renamed from: J */
    public Drawable f20789J;

    /* renamed from: K */
    public String f20790K;

    public SelfVuserPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f4k);
        if (imageView != null) {
            imageView.setImageDrawable(this.f20789J);
            Log.m105918d("MicroMsg.SelfVuserPreference", "onBindView set icon=" + this.f20789J);
            if (!Util.isNullOrNil((String) null)) {
                imageView.setContentDescription((CharSequence) null);
            }
        }
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.kip);
        if (textView != null) {
            textView.setVisibility(0);
            textView.setText(this.f20790K);
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        View.inflate(this.f121274d, C0966R.C0971layout.bez, viewGroup2);
        return x;
    }

    public SelfVuserPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelfVuserPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
