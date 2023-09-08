package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105703u;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C47350c;
import pe3.C47465a;
import te3.C50612nz;
import te3.C64540lz;
import te3.et4;
import te3.fs4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.p1 */
public class C105676p1 implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C105724z f314221a;

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.p1$a */
    public class C105677a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f314222d;

        /* renamed from: e */
        public final /* synthetic */ int f314223e;

        /* renamed from: f */
        public final /* synthetic */ C47350c f314224f;

        /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.p1$a$a */
        public class C105678a implements C105703u.C105704a<C50612nz, String> {

            /* renamed from: a */
            public final /* synthetic */ LinkedList f314226a;

            public C105678a(LinkedList linkedList) {
                this.f314226a = linkedList;
            }

            /* renamed from: a */
            public Object mo150478a(byte[] bArr) {
                C50612nz nzVar = new C50612nz();
                if (bArr != null) {
                    try {
                        nzVar.parseFrom(bArr);
                        return nzVar;
                    } catch (IOException e) {
                        Log.printErrStackTrace("MicroMsg.Multitalk.ILinkService", e, "hy: unable to parse from data", new Object[0]);
                    }
                }
                return null;
            }

            /* renamed from: b */
            public byte[] mo150479b(Object obj) {
                String str = (String) obj;
                return new byte[0];
            }

            /* renamed from: c */
            public Object mo150480c(int i, Object obj) {
                C105676p1.this.f314221a.mo150614x(new C105671o1(this, i, (C50612nz) obj));
                return "";
            }

            /* renamed from: d */
            public boolean mo150481d() {
                return false;
            }
        }

        public C105677a(int i, int i2, C47350c cVar) {
            this.f314222d = i;
            this.f314223e = i2;
            this.f314224f = cVar;
        }

        public void run() {
            C47465a aVar;
            if (this.f314222d == 0 && this.f314223e == 0 && (aVar = this.f314224f.f127056b.f127083a) != null) {
                fs4 fs4 = (fs4) aVar;
                String str = fs4.f133675d;
                LinkedList<et4> linkedList = fs4.f133676e;
                if (linkedList == null || linkedList.size() == 0) {
                    Log.m105921e("MicroMsg.Multitalk.ILinkService", "cgiAddMember fail, no members! input usrlist:%s", linkedList);
                    return;
                }
                LinkedList<String> linkedList2 = new LinkedList<>();
                Iterator<et4> it = linkedList.iterator();
                while (it.hasNext()) {
                    et4 next = it.next();
                    linkedList2.add(next.f133117e);
                    Log.m105925i("MicroMsg.Multitalk.ILinkService", "add new member username: %s, sdkname:%s", next.f133116d, next.f133117e);
                }
                C105724z zVar = C105676p1.this.f314221a;
                C105678a aVar2 = new C105678a(linkedList);
                zVar.f314367T = aVar2;
                zVar.f314386e.mo150567b(18, aVar2);
                C105724z zVar2 = C105676p1.this.f314221a;
                zVar2.f314386e.mo150567b(19, zVar2.f314367T);
                if (linkedList2.size() > 0) {
                    C105676p1.this.f314221a.mo150593I();
                    C105724z zVar3 = C105676p1.this.f314221a;
                    int i = zVar3.f314408q;
                    String str2 = zVar3.f314388f.f314256d;
                    int i2 = zVar3.f314370U0;
                    String[] strArr = C105714w.f314300a;
                    C64540lz lzVar = new C64540lz();
                    lzVar.f184181d = linkedList2;
                    lzVar.f184182e = i;
                    lzVar.f184184g = i2;
                    lzVar.f184186i = str;
                    try {
                        int Add = C105714w.f314302c.Add(lzVar.toByteArray(), lzVar.toByteArray().length);
                        Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "steve: addmember ret:" + Add);
                    } catch (IOException e) {
                        Log.printErrStackTrace("MicroMsg.Multitalk.ILinkNativeEngine", e, "Invite exception", new Object[0]);
                    }
                }
            } else {
                Log.m105920e("MicroMsg.Multitalk.ILinkService", "cgiAddMember fail, errType:" + this.f314222d + ",errCode:" + this.f314223e);
            }
        }
    }

    public C105676p1(C105724z zVar) {
        this.f314221a = zVar;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "on cgiAddMember result: %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        this.f314221a.mo150614x(new C105677a(i, i2, cVar));
    }
}
