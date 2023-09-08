package s33;

import com.tencent.p014mm.plugin.voip.model.C106357m;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import kk0.C88191m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51163rv3;
import te3.rv4;
import te3.sv4;
import te3.xv4;
import z33.C112597j;

/* renamed from: s33.i */
public class C110732i extends C63696n<rv4, sv4> {

    /* renamed from: h */
    public String f331193h = "MicroMsg.NetSceneVoipShutDown";

    /* renamed from: s33.i$a */
    public class C110733a implements C11385n {
        public C110733a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            String str2 = C110732i.this.f331193h;
            C112597j.m153936a(str2, "onSceneEnd type:" + yVar.getType() + " errType:" + i + " errCode:" + i2);
            if (i == 0 && i2 == 0) {
                rv4 rv4 = (rv4) C110732i.this.f180556d.f127055a.f127080a;
                if (rv4 != null) {
                    C106357m.m143313k((long) rv4.f332257e, rv4.f332258f, 0);
                    return;
                }
                return;
            }
            Log.m105929w(C110732i.this.f331193h, "onSceneEnd: error %d %d %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        }
    }

    public C110732i(int i, long j, String str, int i2, int i3, int i4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new rv4();
        bVar.f127067b = new sv4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/voipshutdown";
        bVar.f127069d = C88191m.CTRL_INDEX;
        bVar.f127070e = 66;
        bVar.f127071f = 1000000066;
        C47350c a = bVar.mo72403a();
        this.f180556d = a;
        rv4 rv4 = (rv4) a.f127055a.f127080a;
        rv4.f332257e = i;
        rv4.f332258f = j;
        rv4.f332256d = C75592q0.m90789s();
        rv4.f332261i = i4;
        rv4.f332262j = i2;
        rv4.f332263n = i3;
        xv4 xv4 = new xv4();
        C51163rv3 rv32 = new C51163rv3();
        rv32.mo73357f(str);
        xv4.f144999d = rv32;
        rv4.f332259g = xv4;
        rv4.f332260h = System.currentTimeMillis();
    }

    public int getType() {
        return C88191m.CTRL_INDEX;
    }

    /* renamed from: l1 */
    public C11385n mo72979l1() {
        return new C110733a();
    }
}
