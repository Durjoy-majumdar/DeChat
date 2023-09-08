package com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate;

import com.tencent.p014mm.pluginsdk.res.downloader.model.C85637n;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85638o;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85639p;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85640q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import qd3.C89600c;
import qd3.C89602e;
import rd3.C48020a;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e */
public final class C85625e extends C85640q.C85641a<C115883d> {
    public C85625e(C115883d dVar) {
        super(dVar);
    }

    /* renamed from: b */
    public boolean mo113637b(long j) {
        Req req = this.f249577d;
        if (((C115883d) req).f347703n <= 0 || ((C115883d) req).f347703n == C48020a.m53386c(mo119191e()) + j) {
            return super.mo113637b(j);
        }
        return false;
    }

    /* renamed from: g */
    public C85639p mo113639g(C85637n nVar) {
        C115883d dVar = (C115883d) this.f249577d;
        dVar.getClass();
        String c = dVar.mo119181c();
        String str = dVar.f347702m;
        if (dVar.f347705p && Util.nullAsNil(C86013q1.m106456q(dVar.mo119181c())).equals(str)) {
            Log.m105924i("MicroMsg.ResDownloader.CheckResUpdate.NetworkRequestRunner", "file already cached and valid, send complete status");
            return new C85639p((C85638o) dVar, 2, C48020a.m53386c(c), (String) null);
        } else if (Util.isNullOrNil(((C115883d) this.f249577d).f347704o) || !C48020a.m53389f(((C115883d) this.f249577d).mo119181c(), ((C115883d) this.f249577d).f347704o) || !Util.nullAsNil(C86013q1.m106456q(((C115883d) this.f249577d).mo119181c())).equals(((C115883d) this.f249577d).f347702m)) {
            C85639p g = super.mo113639g(nVar);
            Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.NetworkRequestRunner", "%s: network get over, received response = " + g, dVar.f249581a);
            if (g == null) {
                return new C85639p("CheckResUpdate", mo119192f(), mo113636a(), mo119191e(), 0, "", 3, new C89602e());
            }
            if (g.f249598g == 2) {
                if (Util.isNullOrNil(((C115883d) this.f249577d).f347702m) || !((C115883d) this.f249577d).f347702m.equals(C86013q1.m106456q(mo119191e()))) {
                    Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.NetworkRequestRunner", "%s: file invalid, md5 not match", dVar.f249581a);
                    return new C85639p("CheckResUpdate", mo119192f(), mo113636a(), mo119191e(), g.f249595d, g.f249596e, 3, new C89600c());
                }
                Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.NetworkRequestRunner", "%s: file valid, md5 ok", dVar.f249581a);
            }
            return g;
        } else {
            Req req = this.f249577d;
            return new C85639p((C85638o) req, 2, C48020a.m53386c(((C115883d) req).mo119181c()), (String) null);
        }
    }

    public String getGroupId() {
        return "CheckResUpdate";
    }

    public boolean retry() {
        if (super.retry()) {
            C115891k.m163010a(((C115883d) this.f249577d).f347701l, 12);
            return true;
        }
        C115891k.m163010a(((C115883d) this.f249577d).f347701l, 27);
        return false;
    }
}
