package cj1;

import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import qj1.C12490l0;
import rx3.C13598b0;
import te3.C48933c01;
import te3.C52005xq0;
import te3.C64247az0;
import te3.C64789vy0;

/* renamed from: cj1.h0 */
public final class C54765h0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C54820t f153489a;

    /* renamed from: b */
    public final /* synthetic */ C52005xq0 f153490b;

    public C54765h0(C54820t tVar, C52005xq0 xq02) {
        this.f153489a = tVar;
        this.f153490b = xq02;
    }

    public Object call(Object obj) {
        C12490l0 l0Var;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Class cls = C54991o.class;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C64247az0 az02 = ((C48933c01) cVar.f256796d).f131419d;
            ((C54991o) this.f153489a.mo75777m0(cls)).f154294a4 = ((C48933c01) cVar.f256796d).f131420e;
            ((C54991o) this.f153489a.mo75777m0(cls)).mo76024u4(az02);
            C54991o oVar = (C54991o) this.f153489a.mo75777m0(cls);
            C64789vy0 vy02 = ((C48933c01) cVar.f256796d).f131420e;
            String str = null;
            oVar.f154306d4 = vy02 != null ? vy02.f186016h : null;
            ((C54991o) this.f153489a.f153692b.mo71262a(cls)).mo76006j3(this.f153490b.f144870x0);
            FinderLiveService.f159376d.getClass();
            C56032b bVar = FinderLiveService.f159379g;
            if (!(bVar == null || (l0Var = (C12490l0) bVar.getPlugin(C12490l0.class)) == null)) {
                l0Var.mo12142b1();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("doCgiToRefresh gameTeamInfo status:");
            sb.append(az02 != null ? Integer.valueOf(az02.f182177d) : null);
            sb.append(", in_teaming_up:");
            sb.append(az02 != null ? Integer.valueOf(az02.f182182i) : null);
            sb.append(", toast: ");
            C64789vy0 vy03 = ((C48933c01) cVar.f256796d).f131420e;
            if (vy03 != null) {
                str = vy03.f186016h;
            }
            sb.append(str);
            Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", sb.toString());
        }
        return C13598b0.f38549a;
    }
}
