package com.tencent.p014mm.plugin.profile.p088ui;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p196ln.C76708i;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.profile.ui.t0 */
public class C5016t0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f20328d;

    /* renamed from: e */
    public final /* synthetic */ C42660o0 f20329e;

    public C5016t0(C42660o0 o0Var, String str) {
        this.f20329e = o0Var;
        this.f20328d = str;
    }

    public void run() {
        Bitmap N50;
        C47511g gVar = this.f20329e.f115488e;
        if (gVar == null) {
            Log.m105928w("MicroMsg.ContactWidgetBizInfo", "LazyGetAvatar screen is null");
            return;
        }
        IconWidgetPreference iconWidgetPreference = (IconWidgetPreference) gVar.mo72519a("contact_info_kf_worker");
        if (iconWidgetPreference != null && this.f20329e.f115488e != null && (N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(this.f20328d)) != null) {
            Log.m105919d("MicroMsg.ContactWidgetBizInfo", "LazyGetAvatar success %s, update screen", this.f20328d);
            iconWidgetPreference.mo5914I(N50);
            this.f20329e.f115488e.notifyDataSetChanged();
        }
    }
}
