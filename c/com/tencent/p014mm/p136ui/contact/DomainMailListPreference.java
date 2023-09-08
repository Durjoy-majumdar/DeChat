package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.ui.contact.DomainMailListPreference */
public class DomainMailListPreference extends Preference {

    /* renamed from: J */
    public String f24387J = "";

    /* renamed from: K */
    public String f24388K = "";

    /* renamed from: L */
    public TextView f24389L;

    /* renamed from: M */
    public TextView f24390M;

    /* renamed from: N */
    public TextView f24391N;

    /* renamed from: P */
    public TextView f24392P;

    public DomainMailListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        this.f24389L = (TextView) view.findViewById(C0966R.C0970id.knx);
        this.f24390M = (TextView) view.findViewById(C0966R.C0970id.e_5);
        this.f24391N = (TextView) view.findViewById(C0966R.C0970id.j7_);
        this.f24392P = (TextView) view.findViewById(C0966R.C0970id.kj9);
        this.f24389L.setText(Util.nullAsNil(this.f24387J));
        String[] split = this.f24388K.split(";");
        if (Util.nullAsNil(this.f24388K).length() <= 0) {
            this.f24390M.setVisibility(8);
            this.f24391N.setVisibility(8);
            this.f24392P.setVisibility(8);
        } else {
            if (split.length > 0) {
                this.f24390M.setVisibility(0);
                this.f24390M.setText(Util.nullAsNil(split[0]));
            } else {
                this.f24390M.setVisibility(8);
            }
            if (split.length > 1) {
                this.f24391N.setVisibility(0);
                this.f24391N.setText(Util.nullAsNil(split[1]));
            } else {
                this.f24391N.setVisibility(8);
            }
            if (split.length > 2) {
                this.f24392P.setVisibility(0);
                this.f24392P.setText(Util.nullAsNil(split[2]));
            } else {
                this.f24392P.setVisibility(8);
            }
        }
        super.mo1086w(view);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.bdg, viewGroup2);
        return x;
    }

    public DomainMailListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
