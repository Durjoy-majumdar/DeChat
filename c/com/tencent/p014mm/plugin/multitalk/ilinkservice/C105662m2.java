package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105699t0;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.m2 */
public class C105662m2 {

    /* renamed from: a */
    public final Map<String, C105656l2> f314175a = new ConcurrentHashMap(1);

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.m2$a */
    public class C105663a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C105664b f314176d;

        /* renamed from: e */
        public final /* synthetic */ int f314177e;

        /* renamed from: f */
        public final /* synthetic */ int f314178f;

        /* renamed from: g */
        public final /* synthetic */ C105656l2 f314179g;

        public C105663a(C105662m2 m2Var, C105664b bVar, int i, int i2, String str, C105656l2 l2Var, boolean z) {
            this.f314176d = bVar;
            this.f314177e = i;
            this.f314178f = i2;
            this.f314179g = l2Var;
        }

        public void run() {
            C105664b bVar = this.f314176d;
            int i = this.f314177e;
            int i2 = this.f314178f;
            C105656l2 l2Var = this.f314179g;
            C105699t0.C105700a aVar = (C105699t0.C105700a) bVar;
            aVar.getClass();
            if (i != 0 || i2 != 0 || l2Var == null || !l2Var.mo150521a()) {
                Log.m105928w("MicroMsg.Multitalk.ILinkService", "hy: refresh session key error!");
                C105724z zVar = C105699t0.this.f314277d.f314288a;
                C105724z.C85291s sVar = C105724z.C85291s.ReasonSessionUpdateFailed;
                C105724z zVar2 = C105724z.INSTANCE;
                zVar.mo150605o(sVar);
                return;
            }
            String str = l2Var.f314150a;
            C105714w.f314302c.UpdateAuthKey(str.getBytes(), str.getBytes().length);
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.m2$b */
    public interface C105664b {
    }

    /* renamed from: a */
    public final void mo150532a(int i, int i2, String str, C105656l2 l2Var, boolean z, C105664b bVar) {
        C105724z.INSTANCE.mo150614x(new C105663a(this, bVar, i, i2, str, l2Var, z));
    }

    /* renamed from: b */
    public void mo150533b(String str) {
        Log.m105924i("MicroMsg.Multitalk.ILinkSessionMgr", "hy: on exit");
        if (!Util.isNullOrNil(str)) {
            ((ConcurrentHashMap) this.f314175a).remove(str);
        }
    }
}
