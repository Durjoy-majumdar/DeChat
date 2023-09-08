package com.tencent.p014mm.plugin.profile.logic;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.KeyValuePreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gc0.C20828a;
import he0.C76160m;

/* renamed from: com.tencent.mm.plugin.profile.logic.OpenIMPreference */
public class OpenIMPreference extends KeyValuePreference {

    /* renamed from: Q0 */
    public boolean f115282Q0 = false;

    /* renamed from: x0 */
    public String f115283x0 = "MicroMsg.OpenIMPreference";

    /* renamed from: y0 */
    public C76160m f115284y0 = null;

    public OpenIMPreference(Context context) {
        super(context);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        C76160m mVar = this.f115284y0;
        if (mVar == null) {
            Log.m105928w(this.f115283x0, "onBindView detail null");
            return;
        }
        TextView textView = this.f121238J;
        if (textView != null) {
            int i = mVar.f223093d;
            if (i == 2 || i == 3) {
                textView.setTextColor(MMApplicationContext.getResources().getColorStateList(C0966R.color.a87));
            }
        }
        if (this.f121248U != null && !TextUtils.isEmpty(this.f115284y0.f223090a)) {
            this.f121248U.setVisibility(0);
            C20828a.m22825b().mo32518g(this.f115284y0.f223090a, this.f121248U);
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        if (!this.f115282Q0) {
            return super.mo1087x(viewGroup);
        }
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.bdn, viewGroup2);
        return x;
    }

    public OpenIMPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OpenIMPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
