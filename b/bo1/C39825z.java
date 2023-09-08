package bo1;

import android.os.SystemClock;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import fm0.C86991y0;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import je1.C46523h2;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C48864bj1;
import te3.C49008cj1;
import up1.C37521f;

/* renamed from: bo1.z */
public final class C39825z extends C117747y implements C11385n, C1311n {

    /* renamed from: g */
    public static int f106841g = 180000;

    /* renamed from: d */
    public long f106842d = SystemClock.uptimeMillis();

    /* renamed from: e */
    public C47350c f106843e;

    /* renamed from: f */
    public AtomicBoolean f106844f = new AtomicBoolean(false);

    public int doScene(C114770g gVar, C11385n nVar) {
        return dispatch(gVar, this.f106843e, this);
    }

    public int getType() {
        return C86991y0.CTRL_INDEX;
    }

    /* renamed from: j1 */
    public final void mo62457j1() {
        C37521f.f99374d.getClass();
        if (C37521f.f99364b7.mo60266n().intValue() == 0) {
            Log.m105928w("PreloadGlobalInfoFetcher", "fetch return for disable");
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.f106842d;
        if (uptimeMillis < ((long) f106841g)) {
            Log.m105928w("PreloadGlobalInfoFetcher", "fetch return for invalid interval:" + uptimeMillis + " < " + f106841g);
        } else if (this.f106844f.get()) {
            Log.m105928w("PreloadGlobalInfoFetcher", "fetch return for isRequesting");
        } else {
            Log.m105924i("PreloadGlobalInfoFetcher", "fetch start");
            C47350c.C47352b bVar = new C47350c.C47352b();
            C48864bj1 bj12 = new C48864bj1();
            C46523h2 h2Var = C46523h2.f125330a;
            bj12.f131149d = h2Var.mo71859a(C86991y0.CTRL_INDEX);
            bj12.f131150e = h2Var.mo71867j();
            bVar.f127066a = bj12;
            bVar.f127067b = new C49008cj1();
            bVar.f127068c = "/cgi-bin/micromsg-bin/finderrefreshpreloadinfo";
            bVar.f127069d = C86991y0.CTRL_INDEX;
            this.f106843e = bVar.mo72403a();
            C86709a0.m107524d().mo123455a(C86991y0.CTRL_INDEX, this);
            C86709a0.m107524d().mo123460f(this);
            this.f106844f.set(true);
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        setHasCallbackToQueue(true);
        onSceneEnd(i2, i3, str, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        this.f106844f.set(false);
        C86709a0.m107524d().mo123470p(C86991y0.CTRL_INDEX, this);
        if (i == 0 && i2 == 0) {
            C47350c cVar = this.f106843e;
            C87412m.m108591d(cVar);
            C47465a aVar = cVar.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderRefreshPreloadInfoResponse");
            C49008cj1 cj12 = (C49008cj1) aVar;
            int i3 = cj12.f131775e;
            if (i3 > 0) {
                f106841g = i3 * 1000;
            }
            Log.m105924i("PreloadGlobalInfoFetcher", "onSceneEnd min_refresh_interval:" + cj12.f131775e);
            C0344g.f929a.mo386b(cj12.f131774d, new LinkedList(), C86991y0.CTRL_INDEX);
            return;
        }
        Log.m105920e("PreloadGlobalInfoFetcher", "onSceneEnd handle MMFinderFunc_FinderRefreshPreloadInfo error");
    }
}
