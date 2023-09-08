package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import l33.C109247e;
import ob0.C47350c;
import pe3.C47465a;
import te3.C64540lz;
import te3.et4;
import te3.is4;
import te3.rs4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.r1 */
public class C105685r1 implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C105724z f314245a;

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.r1$a */
    public class C105686a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f314246d;

        /* renamed from: e */
        public final /* synthetic */ int f314247e;

        /* renamed from: f */
        public final /* synthetic */ C47350c f314248f;

        /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.r1$a$a */
        public class C105687a implements C105598b<String> {

            /* renamed from: a */
            public final /* synthetic */ LinkedList f314250a;

            /* renamed from: b */
            public final /* synthetic */ String f314251b;

            public C105687a(LinkedList linkedList, String str) {
                this.f314250a = linkedList;
                this.f314251b = str;
            }

            /* renamed from: a */
            public void mo150477a(int i, int i2, String str, Object obj) {
                String str2 = (String) obj;
                Log.m105925i("MicroMsg.Multitalk.ILinkService", "initEngine done! %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                if (i == 0 && i2 == 0) {
                    C105724z zVar = C105685r1.this.f314245a;
                    LinkedList linkedList = this.f314250a;
                    String str3 = this.f314251b;
                    C105724z zVar2 = C105724z.INSTANCE;
                    zVar.getClass();
                    LinkedList<String> linkedList2 = new LinkedList<>();
                    ArrayList<C105683r> arrayList = new ArrayList<>();
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        et4 et4 = (et4) it.next();
                        if (!et4.f133116d.equals(zVar.f314362Q0)) {
                            linkedList2.add(et4.f133117e);
                        }
                        C105683r rVar = new C105683r();
                        rVar.f314238b = et4.f133117e;
                        rVar.f314239c = et4.f133116d;
                        arrayList.add(rVar);
                        Log.m105925i("MicroMsg.Multitalk.ILinkService", "on invite users: %s, usrname:%s", et4.f133117e, et4.f133116d);
                    }
                    zVar.f314388f.f314257e = arrayList;
                    C105715w0 w0Var = new C105715w0(zVar, linkedList, (C105598b) null);
                    zVar.f314351F = w0Var;
                    zVar.f314352G = new C105720y0(zVar, (C105598b) null);
                    zVar.f314349D = new C105596a1(zVar);
                    zVar.f314350E = new C105602b1(zVar, (C105598b) null);
                    zVar.f314355J = new C105606c1(zVar);
                    zVar.f314386e.mo150567b(5, w0Var);
                    zVar.f314386e.mo150567b(6, zVar.f314352G);
                    zVar.f314386e.mo150567b(22, zVar.f314349D);
                    zVar.f314386e.mo150567b(23, zVar.f314350E);
                    zVar.f314386e.mo150567b(7, zVar.f314355J);
                    zVar.mo150604n();
                    zVar.f314388f.f314253a.clear();
                    zVar.mo150585A();
                    if (C109247e.zx0()) {
                        zVar.mo150611u();
                    }
                    zVar.mo150593I();
                    int i3 = zVar.f314408q;
                    String str4 = zVar.f314366S0;
                    int i4 = zVar.f314370U0;
                    String[] strArr = C105714w.f314300a;
                    C64540lz lzVar = new C64540lz();
                    lzVar.f184181d = linkedList2;
                    lzVar.f184182e = i3;
                    lzVar.f184183f = true;
                    lzVar.f184184g = i4;
                    lzVar.f184185h = str4;
                    lzVar.f184186i = str3;
                    int i5 = -1;
                    try {
                        i5 = C105714w.f314302c.Invite(lzVar.toByteArray(), lzVar.toByteArray().length);
                        Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "steve: invite ret:" + i5);
                    } catch (IOException e) {
                        Log.printErrStackTrace("MicroMsg.Multitalk.ILinkNativeEngine", e, "Invite exception", new Object[0]);
                    }
                    if (i5 != 0) {
                        zVar.mo150601k((C105598b<ArrayList<C105683r>>) null, -10086, -4, "join room sdk failed: " + i5, (byte[]) null);
                    } else {
                        zVar.f314429z1 = true;
                        zVar.mo150591G(new C105616d1(zVar));
                    }
                    synchronized (C105685r1.this.f314245a.f314400m1) {
                        Iterator<rs4> it4 = C105685r1.this.f314245a.f314400m1.iterator();
                        while (it4.hasNext()) {
                            Log.m105924i("MicroMsg.Multitalk.ILinkService", "inviteSync deal with the cached invite notify");
                            C105685r1.this.f314245a.mo150593I();
                            byte[] bArr = it4.next().f141121i.f257327a;
                            C105714w.f314302c.RecvNotify(bArr, bArr.length, C105685r1.this.f314245a.f314370U0);
                        }
                        C105685r1.this.f314245a.f314400m1.clear();
                    }
                    return;
                }
                if (i2 != -66) {
                    C105724z.m141930e(C105685r1.this.f314245a, true);
                }
                C105724z zVar3 = C105685r1.this.f314245a;
                zVar3.f314406p0.mo150490c(16, zVar3.f314366S0, (byte[]) null);
                Log.m105921e("MicroMsg.Multitalk.ILinkService", "initEngine fail errtype %d errcode %d", Integer.valueOf(i), Integer.valueOf(i2));
            }
        }

        public C105686a(int i, int i2, C47350c cVar) {
            this.f314246d = i;
            this.f314247e = i2;
            this.f314248f = cVar;
        }

        public void run() {
            C47465a aVar;
            if (this.f314246d == 0 && this.f314247e == 0 && (aVar = this.f314248f.f127056b.f127083a) != null) {
                is4 is4 = (is4) aVar;
                String str = is4.f135652f;
                LinkedList<et4> linkedList = is4.f135653g;
                C105724z.m141932g(C105685r1.this.f314245a, is4.f135650d.mo123705h(), is4.f135651e.mo123705h(), new C105687a(linkedList, str));
                return;
            }
            Log.m105920e("MicroMsg.Multitalk.ILinkService", "cgiAddMember fail, errType:" + this.f314246d + ",errCode:" + this.f314247e);
            C105724z.m141930e(C105685r1.this.f314245a, false);
            C105724z zVar = C105685r1.this.f314245a;
            zVar.f314406p0.mo150490c(16, zVar.f314366S0, (byte[]) null);
        }
    }

    public C105685r1(C105724z zVar) {
        this.f314245a = zVar;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "on cgiCreate result: %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        this.f314245a.mo150614x(new C105686a(i, i2, cVar));
    }
}
