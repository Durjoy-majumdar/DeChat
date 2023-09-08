package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86300q;
import hp3.C87581a;
import ob0.C89132b;
import r53.C12953c;
import te3.C49584gn3;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.RealNameVerifyProcess$$a */
public final /* synthetic */ class RealNameVerifyProcess$$a implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ RealNameVerifyProcess f117283a;

    /* renamed from: b */
    public final /* synthetic */ Activity f117284b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f117285c;

    public /* synthetic */ RealNameVerifyProcess$$a(RealNameVerifyProcess realNameVerifyProcess, Activity activity, Bundle bundle) {
        this.f117283a = realNameVerifyProcess;
        this.f117284b = activity;
        this.f117285c = bundle;
    }

    public final Object call(Object obj) {
        RealNameVerifyProcess realNameVerifyProcess = this.f117283a;
        Activity activity = this.f117284b;
        Bundle bundle = this.f117285c;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        realNameVerifyProcess.getClass();
        Class<WcPayRealnameVerifyMainUI> cls = WcPayRealnameVerifyMainUI.class;
        if (C12953c.m12397f(cVar)) {
            Log.m105920e("MicroMsg.RealNameVerifyProcess", "cgi error");
            realNameVerifyProcess.mo109103B(activity, cls, bundle);
        } else {
            C49584gn3 gn32 = (C49584gn3) cVar.f256796d;
            if (gn32.f134144f != 2 || gn32.f134145g == null) {
                Log.m105924i("MicroMsg.RealNameVerifyProcess", "normal");
                realNameVerifyProcess.mo109103B(activity, cls, bundle);
            } else {
                Log.m105924i("MicroMsg.RealNameVerifyProcess", "open tiny app");
                realNameVerifyProcess.mo91259f(activity, bundle);
                C43423i0.m46932c((Context) null, ((C49584gn3) cVar.f256796d).f134145g, (Bundle) null, (C86300q) null, (C43423i0.C43429f) null);
            }
        }
        return null;
    }
}
