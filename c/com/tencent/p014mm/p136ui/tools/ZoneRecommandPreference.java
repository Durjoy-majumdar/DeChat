package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.RegionCodeDecoder;

/* renamed from: com.tencent.mm.ui.tools.ZoneRecommandPreference */
public class ZoneRecommandPreference extends Preference {

    /* renamed from: J */
    public RegionCodeDecoder.Region f348589J;

    /* renamed from: K */
    public RegionCodeDecoder.Region f348590K;

    /* renamed from: L */
    public RegionCodeDecoder.Region f348591L;

    /* renamed from: M */
    public int f348592M;

    /* renamed from: N */
    public TextView f348593N;

    /* renamed from: P */
    public TextView f348594P;

    /* renamed from: Q */
    public ImageView f348595Q;

    public ZoneRecommandPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: I */
    public final void mo177483I() {
        TextView textView = this.f348593N;
        if (textView != null && this.f348594P != null) {
            int i = this.f348592M;
            if (i == 0) {
                textView.setVisibility(8);
                this.f348594P.setVisibility(0);
                this.f348594P.setText(C0966R.string.ipa);
                this.f348595Q.setImageResource(C0966R.raw.get_location_icon);
                mo69932y(false);
                if (this.f121288u) {
                    this.f121288u = false;
                }
            } else if (i == 1) {
                textView.setVisibility(0);
                this.f348594P.setVisibility(8);
                this.f348595Q.setImageResource(C0966R.raw.get_location_icon);
                String str = "";
                RegionCodeDecoder.Region region = this.f348589J;
                if (region != null && !Util.isNullOrNil(region.getName())) {
                    str = str + this.f348589J.getName();
                }
                RegionCodeDecoder.Region region2 = this.f348590K;
                if (region2 != null && !Util.isNullOrNil(region2.getName())) {
                    str = str + " " + this.f348590K.getName();
                }
                RegionCodeDecoder.Region region3 = this.f348591L;
                if (region3 != null && !Util.isNullOrNil(region3.getName())) {
                    str = str + " " + this.f348591L.getName();
                }
                this.f348593N.setText(str);
                mo69932y(true);
                if (!this.f121288u) {
                    this.f121288u = true;
                }
            } else if (i == 2) {
                textView.setVisibility(8);
                this.f348594P.setVisibility(0);
                this.f348594P.setText(C0966R.string.ip8);
                this.f348595Q.setImageResource(C0966R.raw.get_location_failed_icon);
                mo69932y(false);
                if (this.f121288u) {
                    this.f121288u = false;
                }
            }
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        mo177483I();
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.be4, viewGroup2);
        this.f348593N = (TextView) x.findViewById(C0966R.C0970id.lvn);
        this.f348594P = (TextView) x.findViewById(C0966R.C0970id.f359289k14);
        this.f348595Q = (ImageView) x.findViewById(C0966R.C0970id.k1b);
        return x;
    }

    public ZoneRecommandPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f348592M = 0;
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
