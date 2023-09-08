package s33;

import com.tencent.p014mm.plugin.voip.model.C106377r;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.ia4;
import te3.vv4;
import te3.wv4;
import z33.C112597j;

/* renamed from: s33.k */
public class C101533k extends C63696n<vv4, wv4> {

    /* renamed from: s33.k$a */
    public class C101534a implements C11385n {
        public C101534a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C112597j.m153936a("MicroMsg.NetSceneVoipSpeedTest", "onSceneEnd type:" + yVar.getType() + " errType:" + i + " errCode:" + i2);
            try {
                wv4 wv4 = (wv4) C101533k.this.mo88543m1();
                if (wv4.f144312d != 0) {
                    if (wv4.f144314f != 0) {
                        C106377r rVar = C101533k.this.f180559g;
                        if (rVar.f317488l != 1) {
                            C112597j.m153937b("MicroMsg.NetSceneVoipSpeedTest", "onVoipSpeedTestResp: no need to do speed test, for mSpeedTestStatus = " + C101533k.this.f180559g.f317488l);
                            return;
                        }
                        rVar.f317488l = 2;
                        rVar.f317490n = wv4.f144313e;
                        rVar.f317500x.mo152766d(wv4);
                        return;
                    }
                }
                C112597j.m153937b("MicroMsg.NetSceneVoipSpeedTest", "onVoipSpeedTestResp: no need to do speed test, svrCount = " + wv4.f144314f);
            } catch (Exception unused) {
                C101533k.this.f180559g.f317488l = 0;
            }
        }
    }

    public C101533k(ia4 ia4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new vv4();
        bVar.f127067b = new wv4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/voipspeedtest";
        bVar.f127069d = 765;
        bVar.f127070e = 765;
        bVar.f127071f = 1000000765;
        C47350c a = bVar.mo72403a();
        this.f180556d = a;
        vv4 vv4 = (vv4) a.f127055a.f127080a;
        vv4.f299690d = ia4.f298395d;
        vv4.f299691e = ia4.f298396e;
        vv4.f299692f = ia4.f298397f;
        vv4.f299693g = ia4.f298398g;
        vv4.f299694h = ia4.f298399h;
        vv4.f299695i = ia4.f298400i;
        vv4.f299696j = ia4.f298401j;
        vv4.f299697n = ia4.f298402n;
        vv4.f299698o = ia4.f298403o;
        vv4.f299699p = ia4.f298404p;
        vv4.f299700q = ia4.f298405q;
        vv4.f299701r = ia4.f298406r;
        vv4.f299702s = ia4.f298407s;
    }

    public int getType() {
        return 765;
    }

    /* renamed from: l1 */
    public C11385n mo72979l1() {
        return new C101534a();
    }
}
