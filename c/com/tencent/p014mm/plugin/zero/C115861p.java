package com.tencent.p014mm.plugin.zero;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import eb0.C116758u5;
import ei3.C86522b;
import f40.C86709a0;
import java.util.concurrent.ConcurrentLinkedQueue;
import lc3.C117474c;
import pc0.C118002e0;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.zero.p */
public class C115861p extends C86301e implements C117474c {

    /* renamed from: d */
    public C116758u5 f347632d;

    /* renamed from: e */
    public volatile C118002e0 f347633e;

    /* renamed from: com.tencent.mm.plugin.zero.p$a */
    public class C115862a implements C116758u5.C116759a {
        public C115862a() {
        }
    }

    public C116758u5 Rk0() {
        C86709a0.m107523b().mo121108c();
        if (this.f347632d == null) {
            this.f347632d = new C116758u5(new C115862a());
        }
        return this.f347632d;
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        if (this.f347633e != null) {
            C118002e0 e0Var = this.f347633e;
            Log.m105925i("MicroMsg.SyncService", "clear synclist:%s notify:%s running:%s", Integer.valueOf(((ConcurrentLinkedQueue) e0Var.f352706b).size()), Integer.valueOf(((ConcurrentLinkedQueue) e0Var.f352707c).size()), e0Var.f352709e);
            e0Var.f352706b.clear();
            e0Var.f352707c.clear();
        }
        C116758u5 u5Var = this.f347632d;
        if (u5Var != null) {
            u5Var.mo180730a();
        }
    }

    public C118002e0 yn0() {
        C86709a0.m107523b().mo121108c();
        if (this.f347633e == null) {
            synchronized (C115861p.class) {
                if (this.f347633e == null) {
                    this.f347633e = new C118002e0();
                }
            }
        }
        return this.f347633e;
    }
}
