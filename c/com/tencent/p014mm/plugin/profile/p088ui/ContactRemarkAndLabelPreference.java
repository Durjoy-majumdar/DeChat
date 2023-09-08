package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactRemarkAndLabelPreference */
public class ContactRemarkAndLabelPreference extends Preference {

    /* renamed from: J */
    public TextView f20169J;

    /* renamed from: K */
    public TextView f20170K;

    /* renamed from: L */
    public TextView f20171L;

    /* renamed from: M */
    public Context f20172M;

    public ContactRemarkAndLabelPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20172M = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00aa  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1086w(android.view.View r9) {
        /*
            r8 = this;
            r0 = 2131315360(0x7f094aa0, float:1.8249171E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.f20169J = r0
            r0 = 2131312151(0x7f093e17, float:1.8242662E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.f20170K = r0
            r0 = 2131306942(0x7f0929be, float:1.8232097E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.f20171L = r0
            android.widget.TextView r0 = r8.f20169J
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x004f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r0 != 0) goto L_0x004f
            android.widget.TextView r0 = r8.f20169J
            r0.setVisibility(r2)
            android.widget.TextView r0 = r8.f20169J
            r0.setText(r1)
            android.widget.TextView r0 = r8.f20169J
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            android.content.Context r3 = r8.f20172M
            r4 = 2131165442(0x7f070102, float:1.7945101E38)
            int r3 = kg3.C76577a.m92157h(r3, r4)
            r0.width = r3
            android.widget.TextView r3 = r8.f20169J
            r3.setLayoutParams(r0)
        L_0x004f:
            android.widget.TextView r0 = r8.f20170K
            r3 = 1
            if (r0 == 0) goto L_0x0081
            r0.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r2, r2)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r0 != 0) goto L_0x0081
            android.widget.TextView r0 = r8.f20170K
            r0.setVisibility(r2)
            android.widget.TextView r0 = r8.f20170K
            java.lang.Class<ny.h> r4 = p629ny.C76979h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ny.h r4 = (p629ny.C76979h) r4
            android.content.Context r5 = r8.f20172M
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            android.widget.TextView r7 = r8.f20170K
            float r7 = r7.getTextSize()
            android.text.SpannableString r4 = r4.yp0(r5, r6, r7)
            r0.setText(r4)
            r0 = 1
            goto L_0x0082
        L_0x0081:
            r0 = 0
        L_0x0082:
            android.widget.TextView r4 = r8.f20171L
            if (r4 == 0) goto L_0x0098
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 != 0) goto L_0x0098
            r0 = r0 | 2
            android.widget.TextView r4 = r8.f20171L
            r4.setVisibility(r2)
            android.widget.TextView r4 = r8.f20171L
            r4.setText(r1)
        L_0x0098:
            r1 = 15
            if (r0 != r3) goto L_0x00a7
            android.widget.TextView r3 = r8.f20170K
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
            r3.addRule(r1)
        L_0x00a7:
            r3 = 2
            if (r0 != r3) goto L_0x00b9
            android.widget.TextView r0 = r8.f20171L
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            r3 = 3
            r0.addRule(r3, r2)
            r0.addRule(r1)
        L_0x00b9:
            super.mo1086w(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.ContactRemarkAndLabelPreference.mo1086w(android.view.View):void");
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.bdy, viewGroup2);
        return x;
    }

    public ContactRemarkAndLabelPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20172M = context;
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
