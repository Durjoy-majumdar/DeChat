package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import ob0.C47350c;
import pe3.C47465a;
import te3.ms4;
import te3.rs4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.b0 */
public class C105599b0 implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ rs4 f314059a;

    /* renamed from: b */
    public final /* synthetic */ C105724z f314060b;

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.b0$a */
    public class C105600a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f314061d;

        /* renamed from: e */
        public final /* synthetic */ int f314062e;

        /* renamed from: f */
        public final /* synthetic */ C47350c f314063f;

        /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.b0$a$a */
        public class C105601a implements C105598b<String> {
            public C105601a() {
            }

            /* renamed from: a */
            public void mo150477a(int i, int i2, String str, Object obj) {
                String str2 = (String) obj;
                Log.m105925i("MicroMsg.Multitalk.ILinkService", "initEngine done! %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                if (i == 0 && i2 == 0) {
                    C105599b0 b0Var = C105599b0.this;
                    C105724z zVar = b0Var.f314060b;
                    rs4 rs4 = b0Var.f314059a;
                    if (zVar.f314406p0 != null) {
                        C105629g0 g0Var = new C105629g0(zVar);
                        zVar.f314356K = g0Var;
                        zVar.f314386e.mo150567b(8, g0Var);
                        C105641i0 i0Var = new C105641i0(zVar);
                        zVar.f314357L = i0Var;
                        zVar.f314386e.mo150567b(9, i0Var);
                        C105650k0 k0Var = new C105650k0(zVar);
                        zVar.f314365S = k0Var;
                        zVar.f314386e.mo150567b(16, k0Var);
                        C105654l0 l0Var = new C105654l0(zVar);
                        zVar.f314358M = l0Var;
                        zVar.f314386e.mo150567b(11, l0Var);
                        zVar.mo150593I();
                        byte[] bArr = rs4.f141121i.f257327a;
                        C105714w.f314302c.RecvNotify(bArr, bArr.length, zVar.f314370U0);
                    } else {
                        Log.m105924i("MicroMsg.Multitalk.ILinkService", "no delegate, return !");
                    }
                    synchronized (C105599b0.this.f314060b.f314400m1) {
                        Iterator<rs4> it = C105599b0.this.f314060b.f314400m1.iterator();
                        while (it.hasNext()) {
                            Log.m105924i("MicroMsg.Multitalk.ILinkService", "recvnotify deal with the cached invite notify");
                            C105599b0.this.f314060b.mo150593I();
                            byte[] bArr2 = it.next().f141121i.f257327a;
                            C105714w.f314302c.RecvNotify(bArr2, bArr2.length, C105599b0.this.f314060b.f314370U0);
                        }
                        C105599b0.this.f314060b.f314400m1.clear();
                    }
                    return;
                }
                Log.m105921e("MicroMsg.Multitalk.ILinkService", "initEngine fail errtype %d errcode %d", Integer.valueOf(i), Integer.valueOf(i2));
                if (i2 == -66) {
                    synchronized (C105599b0.this.f314060b.f314400m1) {
                        C105599b0 b0Var2 = C105599b0.this;
                        b0Var2.f314060b.f314400m1.add(b0Var2.f314059a);
                    }
                    return;
                }
                C105724z.m141930e(C105599b0.this.f314060b, true);
            }
        }

        public C105600a(int i, int i2, C47350c cVar) {
            this.f314061d = i;
            this.f314062e = i2;
            this.f314063f = cVar;
        }

        public void run() {
            C47465a aVar;
            if (this.f314061d == 0 && this.f314062e == 0 && (aVar = this.f314063f.f127056b.f127083a) != null) {
                ms4 ms4 = (ms4) aVar;
                C105724z.m141932g(C105599b0.this.f314060b, ms4.f138184d.mo123705h(), ms4.f138185e.mo123705h(), new C105601a());
                return;
            }
            Log.m105920e("MicroMsg.Multitalk.ILinkService", "cgiGetAuthCode fail, errType:" + this.f314061d + ",errCode:" + this.f314062e);
            C105599b0.this.f314060b.f314371V = false;
        }
    }

    public C105599b0(C105724z zVar, rs4 rs4) {
        this.f314060b = zVar;
        this.f314059a = rs4;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        this.f314060b.mo150614x(new C105600a(i, i2, cVar));
    }
}
