package s33;

import com.tencent.p014mm.plugin.voip.model.C106357m;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51163rv3;
import te3.pu4;
import te3.qu4;
import te3.xv4;
import z33.C112597j;

/* renamed from: s33.c */
public class C110728c extends C63696n<pu4, qu4> {

    /* renamed from: s33.c$a */
    public class C110729a implements C11385n {
        public C110729a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C112597j.m153936a("MicroMsg.NetSceneVoipCancelInvite", "onSceneEnd type:" + yVar.getType() + " errType:" + i + " errCode:" + i2);
            if (i == 0 && i2 == 0) {
                pu4 pu4 = (pu4) C110728c.this.f180556d.f127055a.f127080a;
                if (pu4 != null) {
                    C106357m.m143313k((long) pu4.f332245e, pu4.f332246f, pu4.f332251n);
                    return;
                }
                return;
            }
            Log.m105929w("MicroMsg.NetSceneVoipCancelInvite", "onSceneEnd: error %d %d %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        }
    }

    public C110728c(int i, long j, String str, String str2, int i2, int i3, int i4, int i5) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new pu4();
        bVar.f127067b = new qu4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/voipcancelinvite";
        bVar.f127069d = 171;
        bVar.f127070e = 64;
        bVar.f127071f = 1000000064;
        C47350c a = bVar.mo72403a();
        this.f180556d = a;
        pu4 pu4 = (pu4) a.f127055a.f127080a;
        pu4.f332245e = i;
        pu4.f332246f = j;
        pu4.f332247g = str;
        pu4.f332251n = i2;
        pu4.f332244d = C75592q0.m90789s();
        pu4.f332249i = i5;
        xv4 xv4 = new xv4();
        C51163rv3 rv32 = new C51163rv3();
        rv32.mo73357f(str2);
        xv4.f144999d = rv32;
        pu4.f332248h = xv4;
        pu4.f332250j = System.currentTimeMillis();
        pu4.f332252o = i3;
        pu4.f332253p = i4;
    }

    public int getType() {
        return 171;
    }

    /* renamed from: j1 */
    public int mo88542j1() {
        pu4 pu4 = (pu4) this.f180556d.f127055a.f127080a;
        return (pu4.f332245e == 0 && pu4.f332251n == 0) ? -1 : 0;
    }

    /* renamed from: l1 */
    public C11385n mo72979l1() {
        return new C110729a();
    }
}
