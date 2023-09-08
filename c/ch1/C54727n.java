package ch1;

import cj1.C54795n5;
import cl1.C0651a;
import cl1.C0668l;
import cl1.C0696x;
import cl1.C39975j;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import fy3.C32227p;
import gy3.C87412m;
import ok1.C62042e;
import rl1.C13022d0;
import te3.C48742ao0;
import te3.C50326ly0;
import te3.C51463ty0;
import te3.C64273c21;
import te3.C64530lp2;
import yg1.C39014a;
import yg1.C66639f;

/* renamed from: ch1.n */
public final class C54727n extends C66639f {

    /* renamed from: a */
    public final C45795b f153369a;

    /* renamed from: b */
    public final String f153370b = "LiveMsgRespSimpleUpdateVarInterceptor";

    /* renamed from: c */
    public boolean f153371c;

    public C54727n(C45795b bVar) {
        C87412m.m108594g(bVar, "liveContext");
        this.f153369a = bVar;
    }

    /* renamed from: b */
    public boolean mo49b(C39014a.C39015a aVar) {
        C39014a.C39015a aVar2 = aVar;
        Class cls = C13022d0.class;
        Class cls2 = C0696x.class;
        Class cls3 = C55001u.class;
        Class cls4 = C54991o.class;
        C87412m.m108594g(aVar2, "respWrapper");
        C48742ao0 ao02 = aVar2.f105072a;
        boolean z = false;
        if (ao02 != null) {
            ((C54991o) this.f153369a.mo71262a(cls4)).f154271W = ao02.f130693x - ((C54991o) this.f153369a.mo71262a(cls4)).f154276X;
            C54991o oVar = (C54991o) this.f153369a.mo71262a(cls4);
            long j = ((C54991o) this.f153369a.mo71262a(cls4)).f154276X;
            long j2 = ao02.f130693x;
            if (j < j2) {
                j = j2;
            }
            oVar.f154276X = j;
            ((C55001u) this.f153369a.mo71262a(cls3)).f154420q.f182393e = ao02.f130680h;
            ((C54991o) this.f153369a.mo71262a(cls4)).f154242Q0 = ao02.f130688s;
            C64273c21 c212 = ao02.f130678f;
            if (c212 != null) {
                ((C55001u) this.f153369a.mo71262a(cls3)).f154420q.f182407u = c212.f182407u;
                ((C55001u) this.f153369a.mo71262a(cls3)).f154420q.f182355A = c212.f182355A;
                ((C55001u) this.f153369a.mo71262a(cls3)).f154420q.f182377T0 = c212.f182377T0;
                ((C55001u) this.f153369a.mo71262a(cls3)).f154420q.f182400o = c212.f182400o;
                int i = c212.f182406t;
                C0651a aVar3 = (C0651a) this.f153369a.mo71262a(C0651a.class);
                boolean z2 = (i & 16) > 0;
                Log.m105924i("AllowanceGiftSlice", "set isAnchorNeedShowGuide " + z2);
                aVar3.f1541i = z2;
                if (!C87412m.m108589b(((C13022d0) this.f153369a.mo71262a(cls)).f37101q.getValue(), Boolean.TRUE)) {
                    ((C13022d0) this.f153369a.mo71262a(cls)).f37101q.postValue(Boolean.valueOf((i & 1) > 0 || (i & 2) > 0));
                }
                if (((C54991o) this.f153369a.mo71262a(cls4)).f154287Z0 == 0 || ((C54991o) this.f153369a.mo71262a(cls4)).f154287Z0 == 1) {
                    ((C55001u) this.f153369a.mo71262a(cls3)).f154420q.f182363I = c212.f182363I;
                }
                ((C0668l) this.f153369a.mo71262a(C0668l.class)).mo634k3(String.valueOf(this.f153370b), c212.f182362H);
            }
        }
        C48742ao0 ao03 = aVar2.f105072a;
        if (ao03 != null) {
            ((C54991o) this.f153369a.mo71262a(cls4)).f154358r = ao03.f130668F;
            Boolean bool = null;
            if (ao03.f130695z != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("live_game_data.visibility:");
                C51463ty0 ty02 = ao03.f130695z;
                sb.append(ty02 != null ? Integer.valueOf(ty02.f142469d) : null);
                sb.append(", update:");
                C51463ty0 ty03 = ao03.f130695z;
                sb.append(ty03 != null ? Boolean.valueOf(ty03.f142472g) : null);
                Log.m105924i("Finder.FinderLiveService", sb.toString());
                C51463ty0 ty04 = ao03.f130695z;
                if (ty04 != null && ty04.f142472g) {
                    z = true;
                }
                if (z) {
                    ((C54991o) this.f153369a.mo71262a(cls4)).f154179A1 = ao03.f130695z;
                }
            } else {
                Log.m105924i("Finder.FinderLiveService", "live_game_data is null");
            }
            C64530lp2 lp22 = ao03.f130663A;
            if (lp22 != null) {
                int i2 = lp22.f184137n;
                if (i2 != C39975j.f107165v) {
                    Log.m105924i("Finder.LiveBoxSlice", "minimunShowMsgLikeCnt from " + C39975j.f107165v + " to " + i2 + '!');
                }
                C39975j.f107165v = i2;
            }
            ((C54991o) this.f153369a.mo71262a(cls4)).mo76018p4(ao03.f130694y);
            String str = this.f153370b;
            Log.m105924i(str, "[isMyserious] = " + C62042e.f176370a.mo87087i1(this.f153369a, ao03.f130694y));
            ((C0696x) this.f153369a.mo71262a(cls2)).mo660d3(ao03.f130669G);
            C50326ly0 ly02 = ((C0696x) this.f153369a.mo71262a(cls2)).f1644g;
            Boolean valueOf = ly02 != null ? Boolean.valueOf(ly02.f137707e) : null;
            C50326ly0 ly03 = ao03.f130670H;
            if (ly03 != null) {
                bool = Boolean.valueOf(ly03.f137707e);
            }
            ((C0696x) this.f153369a.mo71262a(cls2)).mo659c3(ao03.f130670H);
            if (!this.f153371c && C87412m.m108589b(valueOf, Boolean.FALSE) && C87412m.m108589b(bool, Boolean.TRUE)) {
                this.f153371c = true;
                Log.m105924i(this.f153370b, "try sync gift for new club_created!");
                FinderLiveService.f159376d.getClass();
                C54795n5 n5Var = FinderLiveService.f159396y;
                if (n5Var != null) {
                    C54795n5.C54796a.m61724b(n5Var, ((C55001u) this.f153369a.mo71262a(cls3)).f154420q.f182392d, ((C55001u) this.f153369a.mo71262a(cls3)).f154416j, ((C55001u) this.f153369a.mo71262a(cls3)).f154423t, 2, (C32227p) null, 16, (Object) null);
                }
            }
            ((C54979h1) this.f153369a.mo71262a(C54979h1.class)).f154133Z = ao03.f130673K;
        }
        return true;
    }
}
