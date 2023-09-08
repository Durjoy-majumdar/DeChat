package com.tencent.p014mm.plugin.wallet_core.utils;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import di0.C86300q;
import te3.C50456mv3;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.h0 */
public class C43422h0 implements C72476y0.C72477a {

    /* renamed from: a */
    public final /* synthetic */ C43423i0.C43428e f117387a;

    /* renamed from: b */
    public final /* synthetic */ C50456mv3 f117388b;

    /* renamed from: c */
    public final /* synthetic */ Context f117389c;

    public C43422h0(C43423i0.C43428e eVar, C50456mv3 mv32, Context context) {
        this.f117387a = eVar;
        this.f117388b = mv32;
        this.f117389c = context;
    }

    /* renamed from: a */
    public void mo66525a(View view) {
        C43423i0.C43428e eVar = this.f117387a;
        if (eVar != null) {
            if (!eVar.mo66652b(this.f117388b, view)) {
                C43423i0.m46932c(this.f117389c, this.f117388b, (Bundle) null, (C86300q) null, (C43423i0.C43429f) null);
                this.f117387a.mo66651a(this.f117388b, view);
                return;
            }
        }
        C43423i0.m46932c(this.f117389c, this.f117388b, (Bundle) null, (C86300q) null, (C43423i0.C43429f) null);
    }
}
