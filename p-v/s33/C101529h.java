package s33;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82543i5;
import com.tencent.p014mm.plugin.voip.model.C106373o0;
import com.tencent.p014mm.plugin.voip.model.C106401z;
import com.tencent.p014mm.plugin.voip.model.C96586q0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C86709a0;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C101851uq3;
import te3.C101858vq3;
import te3.C101864x23;
import te3.iv4;
import te3.nv4;
import te3.ov4;
import te3.qv4;
import te3.wt4;
import z33.C112597j;

/* renamed from: s33.h */
public class C101529h extends C63696n<nv4, ov4> {

    /* renamed from: s33.h$a */
    public class C101530a implements C11385n {
        public C101530a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C112597j.m153938c("MicroMsg.Voip.Redirect", "Redirect response:" + i + " errCode:" + i2 + " status:" + C101529h.this.f180559g.f317476a);
            if (i == 0 && i2 == 0) {
                C106401z zVar = C101529h.this.f180559g.f317500x.f317568G1;
                zVar.getClass();
                zVar.mo152874f((long) ((int) (System.currentTimeMillis() - zVar.f317761P)));
                ov4 ov4 = (ov4) C101529h.this.mo88543m1();
                C112597j.m153938c("MicroMsg.Voip.Redirect", "room " + ov4.f299075d + " member " + ov4.f299081j + " key " + ov4.f299080i + " relay addr cnt " + ov4.f299076e + " RedirectThreshold " + ov4.f299084p + " RedirectDecision " + ov4.f299085q);
                wt4 wt4 = new wt4();
                wt4 wt42 = new wt4();
                wt4 wt43 = new wt4();
                wt4.f299810d = ov4.f299076e;
                wt4.f299811e = ov4.f299077f;
                wt42.f299810d = ov4.f299078g;
                wt42.f299811e = ov4.f299079h;
                wt43.f299810d = ov4.f299082n;
                wt43.f299811e = ov4.f299083o;
                boolean z = ov4.f299085q == 2;
                C106373o0 o0Var = C101529h.this.f180559g.f317451B;
                iv4 iv4 = ov4.f299086r;
                o0Var.getClass();
                C86709a0.m107525e().postToWorker(new C96586q0(o0Var, iv4, z));
                iv4 iv42 = ov4.f299086r;
                if ((iv42 == null || iv42.f298420j == 0) && ov4.f299076e > 0) {
                    C112597j.m153938c("MicroMsg.Voip.Redirect", "use old method to add redirect conn");
                    C101858vq3 vq32 = new C101858vq3();
                    C101851uq3 uq32 = new C101851uq3();
                    uq32.f299626d = 0;
                    uq32.f299627e = "";
                    uq32.f299628f = "";
                    uq32.f299629g = C112597j.m153940e(MMApplicationContext.getContext());
                    uq32.f299630h = 4;
                    uq32.f299631i = 2;
                    uq32.f299632j = new wt4();
                    wt4 wt44 = new wt4();
                    uq32.f299633n = wt44;
                    wt4 wt45 = uq32.f299632j;
                    wt45.f299810d = ov4.f299076e;
                    wt45.f299811e = ov4.f299077f;
                    wt44.f299810d = ov4.f299082n;
                    wt44.f299811e = ov4.f299083o;
                    vq32.f299683e.add(uq32);
                    vq32.f299682d = 1;
                    byte[] bArr = null;
                    try {
                        bArr = vq32.toByteArray();
                    } catch (Exception unused) {
                        Log.m105920e("MicroMsg.Voip.Redirect", "conn info to byte array fail..");
                    }
                    int AddNewRelayConns = C101529h.this.f180559g.f317500x.AddNewRelayConns(bArr, bArr.length, 1, z);
                    if (AddNewRelayConns != 0) {
                        C112597j.m153937b("MicroMsg.Voip.Redirect", "redirect relay conns fail ret:" + AddNewRelayConns);
                        return;
                    }
                    return;
                }
                return;
            }
            C112597j.m153937b("MicroMsg.Voip.Redirect", " redirect response with error code:" + i2 + "error type" + i);
        }
    }

    public C101529h(int i, long j, int i2, int i3, int i4, int[] iArr, LinkedList<C101864x23> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new nv4();
        bVar.f127067b = new ov4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/voipRedirect";
        bVar.f127069d = C82543i5.CTRL_INDEX;
        bVar.f127070e = 240;
        bVar.f127071f = 1000000240;
        C47350c a = bVar.mo72403a();
        this.f180556d = a;
        nv4 nv4 = (nv4) a.f127055a.f127080a;
        nv4.f298933d = i;
        nv4.f298934e = j;
        nv4.f298935f = i2;
        nv4.f298936g = i3;
        nv4.f298937h = i4;
        nv4.f298944r = System.currentTimeMillis();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            qv4 qv4 = new qv4();
            int i8 = i7 + 1;
            qv4.f299231d = iArr[i7];
            int i9 = i8 + 1;
            qv4.f299232e = iArr[i8];
            int i15 = i9 + 1;
            qv4.f299233f = iArr[i9];
            int i16 = i15 + 1;
            qv4.f299234g = iArr[i15];
            qv4.f299235h = iArr[i16];
            nv4.f298938i.add(qv4);
            i6++;
            i7 = i16 + 1;
        }
        nv4.f298939j = this.f180559g.f317500x.f317568G1.f317747B != 0 ? (int) ((System.currentTimeMillis() - this.f180559g.f317500x.f317568G1.f317747B) / 1000) : i5;
        if (linkedList != null) {
            nv4.f298940n = linkedList.size();
            nv4.f298941o = linkedList;
        }
    }

    public int getType() {
        return C82543i5.CTRL_INDEX;
    }

    /* renamed from: k1 */
    public void mo72978k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (i2 == 0 && i3 == 0) {
            ov4 ov4 = (ov4) this.f180556d.f127056b.f127083a;
            if (ov4 != null) {
                Log.m105925i("MicroMsg.Voip.Redirect", "roomId:%d, roomKey:%s, member:%d", Integer.valueOf(ov4.f299075d), Long.valueOf(ov4.f299080i), Integer.valueOf(ov4.f299081j));
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.Voip.Redirect", "Redirect error");
    }

    /* renamed from: l1 */
    public C11385n mo72979l1() {
        return new C101530a();
    }
}
