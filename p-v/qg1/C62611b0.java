package qg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import o40.C61937h;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49255ea1;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C64281ca1;
import te3.C64309da1;

/* renamed from: qg1.b0 */
public final class C62611b0<Req extends C47465a> extends C60625c<C49255ea1> {

    /* renamed from: u */
    public static final C35849a f177808u = new C35849a((C8480h) null);

    /* renamed from: s */
    public final String f177809s;

    /* renamed from: t */
    public final String f177810t = "Finder.CgiFinderLiveTransferBuffer";

    /* renamed from: qg1.b0$a */
    public static final class C35849a {
        public C35849a(C8480h hVar) {
        }

        /* renamed from: a */
        public final <Resp extends C47465a> Resp mo60444a(C89132b.C89134c<C49255ea1> cVar, Resp resp) {
            C89349b bVar;
            C87412m.m108594g(cVar, "<this>");
            C87412m.m108594g(resp, "resp");
            C49255ea1 ea12 = (C49255ea1) cVar.f256796d;
            if (ea12 == null || (bVar = ea12.f132825d) == null) {
                return null;
            }
            try {
                resp.parseFrom(bVar.mo123703f());
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
                resp = null;
            }
            if (resp == null) {
                return null;
            }
            return resp;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62611b0(String str, int i, Req req, C64281ca1 ca12, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, "cgiUri");
        C87412m.m108594g(req, "req");
        C87412m.m108594g(ca12, "baseRequest");
        this.f177809s = str;
        C64309da1 da12 = new C64309da1();
        da12.f182657d = C46523h2.f125330a.mo71860b(i, hj12);
        da12.f182658e = ca12;
        da12.f182659f = C58739j4.f168176a.mo83710g0(req);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = da12;
        C49255ea1 ea12 = new C49255ea1();
        ea12.setBaseResponse(new C49966ja());
        ea12.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = ea12;
        bVar.f127068c = str;
        bVar.f127069d = i;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveTransferBuffer", "init cgiUri:" + str + ", cgiNumber:" + i + ", baseRequest:" + C61937h.m72709h(ca12));
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C49255ea1) eu32, "resp");
        String str2 = this.f177810t;
        Log.m105924i(str2, "[onCgiBack] cgiUri:" + this.f177809s + " errType=" + i + " errCode=" + i2 + " errMsg=" + str);
    }
}
