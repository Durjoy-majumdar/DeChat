package com.tencent.p014mm.plugin.mall.p075ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.mall.ui.CdnImageIconPreference */
public class CdnImageIconPreference extends IconPreference {

    /* renamed from: l1 */
    public CdnImageView f115099l1;

    public CdnImageIconPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        this.f115099l1 = (CdnImageView) view.findViewById(C0966R.C0970id.f4k);
        if (!Util.isNullOrNil((String) null)) {
            this.f115099l1.setUseSdcardCache(true);
            this.f115099l1.setUrl((String) null);
            this.f115099l1.setVisibility(0);
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        View.inflate(this.f121274d, C0966R.C0971layout.f6795or, viewGroup2);
        return x;
    }

    public CdnImageIconPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
