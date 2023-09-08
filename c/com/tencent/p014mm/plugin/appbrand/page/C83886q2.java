package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.SyncTask;

/* renamed from: com.tencent.mm.plugin.appbrand.page.q2 */
public class C83886q2 extends SyncTask<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ C83873p2 f244928a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83886q2(C83873p2 p2Var, long j, Boolean bool) {
        super(j, bool);
        this.f244928a = p2Var;
    }

    public Object run() {
        try {
            C83873p2.m103216d(this.f244928a);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.AppBrandWebViewCustomViewContainer", "removeAll error " + e);
        }
        return Boolean.FALSE;
    }
}
