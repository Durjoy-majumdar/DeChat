package com.tencent.p014mm.plugin.wallet_core.utils;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import di0.C86300q;
import te3.C48730al;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.d0 */
public class C43419d0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ Context f117379g;

    /* renamed from: h */
    public final /* synthetic */ C48730al f117380h;

    /* renamed from: i */
    public final /* synthetic */ View.OnClickListener f117381i;

    public C43419d0(Context context, C48730al alVar, View.OnClickListener onClickListener) {
        this.f117379g = context;
        this.f117380h = alVar;
        this.f117381i = onClickListener;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        C43423i0.m46932c(this.f117379g, this.f117380h.f130603e, (Bundle) null, (C86300q) null, (C43423i0.C43429f) null);
        View.OnClickListener onClickListener = this.f117381i;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
