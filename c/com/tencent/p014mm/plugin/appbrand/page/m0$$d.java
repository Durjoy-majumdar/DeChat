package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import sq0.C13773f;

/* renamed from: com.tencent.mm.plugin.appbrand.page.m0$$d */
public class m0$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83820i0 f244768d;

    /* renamed from: e */
    public final /* synthetic */ String f244769e;

    /* renamed from: f */
    public final /* synthetic */ C83849m0 f244770f;

    public m0$$d(C83849m0 m0Var, C83820i0 i0Var, String str) {
        this.f244770f = m0Var;
        this.f244768d = i0Var;
        this.f244769e = str;
    }

    public void run() {
        int indexOf;
        C83849m0 m0Var = this.f244770f;
        C83820i0 i0Var = this.f244768d;
        synchronized (m0Var.f244744o) {
            indexOf = m0Var.f244745p.indexOf(i0Var);
        }
        if (indexOf < 0) {
            Log.m105929w("MicroMsg.AppBrandPageContainer", "navigateBack with appId(%s) Page(%s), but already off stack, maybe frequent clicks were performed", this.f244770f.getAppId(), this.f244768d.getCurrentUrl());
            return;
        }
        C83849m0.m103129f(this.f244770f, indexOf + 1, this.f244769e, (JSONObject) null, (C13773f) null);
    }
}
