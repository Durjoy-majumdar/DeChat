package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.RegionCodeDecoder;

/* renamed from: com.tencent.mm.ui.tools.ZonePreference */
public class ZonePreference extends Preference {

    /* renamed from: J */
    public RegionCodeDecoder.Region f348586J;

    /* renamed from: K */
    public CharSequence f348587K;

    /* renamed from: L */
    public TextView f348588L;

    public ZonePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: E */
    public void mo7741E(CharSequence charSequence) {
        this.f348587K = charSequence;
        mo177481I();
    }

    /* renamed from: I */
    public final void mo177481I() {
        if (this.f348588L != null) {
            CharSequence charSequence = this.f348587K;
            if (charSequence == null || Util.isNullOrNil(charSequence.toString())) {
                this.f348588L.setVisibility(8);
            } else {
                this.f348588L.setVisibility(0);
            }
            this.f348588L.setText(this.f348587K);
        }
    }

    /* renamed from: J */
    public void mo177482J(RegionCodeDecoder.Region region) {
        if (region == null || Util.isNullOrNil(region.getName()) || Util.isNullOrNil(region.getCode())) {
            Log.m105920e("MicroMsg.ZonePreference", "setZoneItem item = null");
            return;
        }
        mo26273A(region.getCode() + region.isCity());
        this.f348586J = region;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        if (this.f348586J != null) {
            ((TextView) view.findViewById(C0966R.C0970id.lvn)).setText(this.f348586J.getName());
            this.f348588L = (TextView) view.findViewById(C0966R.C0970id.ka9);
            mo177481I();
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.f359890be3, viewGroup2);
        return x;
    }

    public ZonePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
