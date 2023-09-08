package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import java.util.Iterator;
import l33.C109247e;
import ob0.C47350c;
import pe3.C47465a;
import te3.C110968oz;
import te3.rs4;
import te3.ws4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.y1 */
public class C105721y1 implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ String f314331a;

    /* renamed from: b */
    public final /* synthetic */ String f314332b;

    /* renamed from: c */
    public final /* synthetic */ C105724z f314333c;

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.y1$a */
    public class C105722a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f314334d;

        /* renamed from: e */
        public final /* synthetic */ int f314335e;

        /* renamed from: f */
        public final /* synthetic */ C47350c f314336f;

        /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.y1$a$a */
        public class C105723a implements C105598b<String> {

            /* renamed from: a */
            public final /* synthetic */ String f314338a;

            public C105723a(String str) {
                this.f314338a = str;
            }

            /* renamed from: a */
            public void mo150477a(int i, int i2, String str, Object obj) {
                int i3;
                String str2 = (String) obj;
                Log.m105925i("MicroMsg.Multitalk.ILinkService", "joinSync initEngine done! %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                if (i == 0 && i2 == 0) {
                    C105721y1 y1Var = C105721y1.this;
                    C105724z zVar = y1Var.f314333c;
                    String str3 = y1Var.f314331a;
                    String str4 = y1Var.f314332b;
                    String str5 = this.f314338a;
                    zVar.f314366S0 = str4;
                    zVar.f314368T0 = str3;
                    zVar.f314380Z0 = C105724z.C105743t.ILinkMemberRoleJoin;
                    zVar.f314423x0 = false;
                    zVar.f314388f.f314253a.clear();
                    zVar.mo150585A();
                    zVar.mo150604n();
                    C105627f2 f2Var = new C105627f2(zVar, str4, str3);
                    zVar.f314345B = f2Var;
                    zVar.f314347C = new C105639h2(zVar);
                    zVar.f314349D = new C105648j2(zVar);
                    zVar.f314350E = new C105652k2(zVar);
                    zVar.f314386e.mo150567b(3, f2Var);
                    zVar.f314386e.mo150567b(4, zVar.f314347C);
                    zVar.f314386e.mo150567b(22, zVar.f314349D);
                    zVar.f314386e.mo150567b(23, zVar.f314350E);
                    Log.m105925i("MicroMsg.Multitalk.ILinkService", "join sdkGroupId:%s", str3);
                    if (C109247e.zx0()) {
                        zVar.mo150611u();
                    }
                    zVar.mo150593I();
                    int i4 = zVar.f314408q;
                    int i5 = zVar.f314370U0;
                    String[] strArr = C105714w.f314300a;
                    C110968oz ozVar = new C110968oz();
                    ozVar.f332190e = str3;
                    ozVar.f332191f = i4;
                    ozVar.f332194i = i5;
                    ozVar.f332193h = true;
                    ozVar.f332196n = str5;
                    try {
                        i3 = C105714w.f314302c.JoinRoom(ozVar.toByteArray(), ozVar.toByteArray().length);
                    } catch (IOException e) {
                        Log.printErrStackTrace("MicroMsg.Multitalk.ILinkNativeEngine", e, "JoinRoom exception", new Object[0]);
                        i3 = -1;
                    }
                    Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "joinRoom ret:" + i3 + ", groupId:" + str3);
                    if (i3 == 0) {
                        zVar.f314429z1 = true;
                        zVar.mo150592H(new C105595a0(zVar));
                    }
                    synchronized (C105721y1.this.f314333c.f314400m1) {
                        Iterator<rs4> it = C105721y1.this.f314333c.f314400m1.iterator();
                        while (it.hasNext()) {
                            Log.m105924i("MicroMsg.Multitalk.ILinkService", "joinSync deal with the cached invite notify");
                            C105721y1.this.f314333c.mo150593I();
                            byte[] bArr = it.next().f141121i.f257327a;
                            C105714w.f314302c.RecvNotify(bArr, bArr.length, C105721y1.this.f314333c.f314370U0);
                        }
                        C105721y1.this.f314333c.f314400m1.clear();
                    }
                    return;
                }
                if (i2 != -66) {
                    C105724z.m141930e(C105721y1.this.f314333c, true);
                }
                C105724z zVar2 = C105721y1.this.f314333c;
                zVar2.f314406p0.mo150490c(2, zVar2.f314366S0, (byte[]) null);
                Log.m105921e("MicroMsg.Multitalk.ILinkService", "joinSync initEngine fail errtype %d errcode %d", Integer.valueOf(i), Integer.valueOf(i2));
            }
        }

        public C105722a(int i, int i2, C47350c cVar) {
            this.f314334d = i;
            this.f314335e = i2;
            this.f314336f = cVar;
        }

        public void run() {
            C47465a aVar;
            if (this.f314334d == 0 && this.f314335e == 0 && (aVar = this.f314336f.f127056b.f127083a) != null) {
                ws4 ws4 = (ws4) aVar;
                String str = ws4.f144250f;
                C105724z.m141932g(C105721y1.this.f314333c, ws4.f144248d.mo123705h(), ws4.f144249e.mo123705h(), new C105723a(str));
                return;
            }
            Log.m105920e("MicroMsg.Multitalk.ILinkService", "cgiJoin fail, errType:" + this.f314334d + ",errCode:" + this.f314335e);
            C105724z.m141930e(C105721y1.this.f314333c, false);
            C105724z zVar = C105721y1.this.f314333c;
            zVar.f314406p0.mo150490c(2, zVar.f314366S0, (byte[]) null);
        }
    }

    public C105721y1(C105724z zVar, String str, String str2) {
        this.f314333c = zVar;
        this.f314331a = str;
        this.f314332b = str2;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "on cgiJoin result: %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        this.f314333c.mo150614x(new C105722a(i, i2, cVar));
    }
}
