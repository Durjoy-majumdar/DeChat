package bs0;

import a14.C53921m;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32230s;
import java.lang.ref.WeakReference;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import te3.x45;
import te3.y45;
import wx3.C15601d;
import xx3.C66447b;

/* renamed from: bs0.n */
public final class C28414n {

    /* renamed from: a */
    public static final C28414n f78142a = new C28414n();

    /* renamed from: bs0.n$a */
    public static final class C28415a implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ C32230s f78143d;

        public C28415a(C32230s sVar) {
            this.f78143d = sVar;
        }

        /* renamed from: a */
        public final /* synthetic */ int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            return ((Number) this.f78143d.mo237D(Integer.valueOf(i), Integer.valueOf(i2), str, cVar, yVar)).intValue();
        }
    }

    /* renamed from: a */
    public static Object m38189a(C28414n nVar, int i, int i2, C15601d dVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 2) != 0) {
            i2 = 32;
        }
        nVar.getClass();
        Log.m105924i("MicroMsg.CgiWxaAppGetUserAuthorizeScopeList", "doFetch, updateTime: " + i + ", maxFetchCount: " + i2);
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        WeakReference weakReference = new WeakReference(mVar);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaapp_getuserauthorizescopelist";
        bVar.f127069d = 5046;
        x45 x45 = new x45();
        x45.f144456d = i;
        x45.f144457e = i2;
        bVar.f127066a = x45;
        bVar.f127067b = new y45();
        mVar.mo74599v(new C28413l(C89144l0.m111430f(bVar.mo72403a(), new C28415a(new C0367m(weakReference)), false, (C9487b) null)));
        return mVar.mo74608o();
    }
}
