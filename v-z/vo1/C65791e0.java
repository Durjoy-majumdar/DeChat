package vo1;

import bp1.C54515a;
import bp1.C54519d;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import cp1.C57957o;
import gr1.C59673q2;
import gr1.C59684w2;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import mr1.C61575s;
import mr1.C61576t;
import qt1.C12931a;
import rx3.C13598b0;
import sk1.C63947a;
import te3.C48742ao0;
import te3.C50996qq1;
import te3.C52013xs0;
import te3.C64273c21;
import te3.C64674r41;
import te3.C64689rq2;
import vo1.C65770a0;
import wo1.C66162t;
import yo1.C66688d;

/* renamed from: vo1.e0 */
public final class C65791e0 implements C59684w2 {

    /* renamed from: a */
    public final /* synthetic */ C65770a0 f189233a;

    public C65791e0(C65770a0 a0Var) {
        this.f189233a = a0Var;
    }

    /* renamed from: b */
    public void mo78295b(float f) {
        for (C66162t b : this.f189233a.f189197k) {
            b.mo78295b(f);
        }
    }

    /* renamed from: c */
    public void mo78294c(C64689rq2 rq22, int i, int i2) {
        C50996qq1 qq12;
        LinkedList<C52013xs0> linkedList;
        LinkedList<C64674r41> linkedList2;
        boolean z;
        Class cls = C54519d.class;
        C54519d dVar = (C54519d) this.f189233a.mo89804e(cls);
        if (dVar != null) {
            C65770a0 a0Var = this.f189233a;
            dVar.mo75361F3(i);
            if (i2 > 0) {
                dVar.mo75367M3(i2);
            }
            if ((dVar.f152856s && dVar.f152857t <= 0 && i2 > 0) || ((C54519d) dVar.business(cls)).f152861x) {
                dVar.mo75363I3(i2, (Boolean) null);
            }
            C57957o oVar = a0Var.f189191e;
            if (oVar != null) {
                oVar.mo78579d(dVar.f152854q, dVar.f152855r);
            }
            C65768a aVar = a0Var.f189202p;
            if (aVar != null) {
                int i3 = dVar.f152854q;
                C54515a aVar2 = (C54515a) aVar.mo89803a(C54515a.class);
                if (aVar2 != null) {
                    int i4 = i3 + aVar2.f152829q;
                    aVar2.mo75359g3(i4, false);
                    if (aVar2.f152825j.isEmpty()) {
                        C66688d dVar2 = aVar2.f152824i;
                        if (dVar2 != null) {
                            dVar2.mo89822b((C48742ao0) null);
                        }
                    } else {
                        try {
                            Iterator<C50996qq1> it = aVar2.f152825j.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    qq12 = null;
                                    break;
                                }
                                qq12 = it.next();
                                if (qq12.f140454d == i4) {
                                    z = true;
                                    continue;
                                } else {
                                    z = false;
                                    continue;
                                }
                                if (z) {
                                    break;
                                }
                            }
                            C50996qq1 qq13 = qq12;
                            if (qq13 != null) {
                                C48742ao0 ao02 = qq13.f140455e;
                                if (!(ao02 == null || (linkedList2 = ao02.f130677e) == null)) {
                                    for (C64674r41 r412 : linkedList2) {
                                        r412.f185138u = i4;
                                    }
                                }
                                C48742ao0 ao03 = qq13.f140455e;
                                if (!(ao03 == null || (linkedList = ao03.f130689t) == null)) {
                                    for (C52013xs0 xs02 : linkedList) {
                                        xs02.f144916u = i4;
                                    }
                                }
                                C66688d dVar3 = aVar2.f152824i;
                                if (dVar3 != null) {
                                    dVar3.mo89822b(qq13.f140455e);
                                }
                                aVar2.f152825j.remove(qq13);
                                aVar2.mo75357e3("after updateMessage msg(" + C63947a.f181274a.mo88718c(qq13) + ')');
                                C13598b0 b0Var = C13598b0.f38549a;
                            }
                        } catch (NoSuchElementException e) {
                            Log.m105928w("LiveMsgOffsetSlice", "updateMessage err: " + e.getMessage());
                        }
                    }
                }
            }
        }
        for (C66162t c : this.f189233a.f189197k) {
            c.mo78294c(rq22, i, i2);
        }
    }

    /* renamed from: d */
    public void mo78296d(C64689rq2 rq22, long j, long j2) {
        for (C66162t d : this.f189233a.f189197k) {
            d.mo78296d(rq22, j, j2);
        }
    }

    /* renamed from: e */
    public void mo77475e(C64689rq2 rq22) {
        FinderObject finderObject;
        C64273c21 c212;
        FinderObject finderObject2;
        C64273c21 c213;
        Class cls = C54991o.class;
        StringBuilder sb = new StringBuilder();
        sb.append("replay_step3-4:playVideo");
        C63947a aVar = C63947a.f181274a;
        C54991o oVar = (C54991o) this.f189233a.mo89804e(cls);
        Integer num = null;
        sb.append(aVar.mo88735u(oVar != null ? oVar.f154341n : null, -1));
        sb.append(",url:");
        C54991o oVar2 = (C54991o) this.f189233a.mo89804e(cls);
        sb.append((oVar2 == null || (finderObject2 = oVar2.f154341n) == null || (c213 = finderObject2.liveInfo) == null) ? null : C63947a.m75194h(aVar, c213, "FinderLiveReplayService-onPlay", false, 2, (Object) null));
        sb.append(" ,status:");
        C54991o oVar3 = (C54991o) this.f189233a.mo89804e(cls);
        sb.append((oVar3 == null || (finderObject = oVar3.f154341n) == null || (c212 = finderObject.liveInfo) == null) ? null : Integer.valueOf(c212.f182366L));
        sb.append(",offset:");
        C54519d dVar = (C54519d) this.f189233a.mo89804e(C54519d.class);
        if (dVar != null) {
            num = Integer.valueOf(dVar.f152854q);
        }
        sb.append(num);
        sb.append(',');
        sb.append(this.f189233a.mo89808i());
        Log.m105924i("FinderLiveReplayService", sb.toString());
        for (C66162t e : this.f189233a.f189197k) {
            e.mo77475e(rq22);
        }
    }

    /* renamed from: f */
    public void mo78297f(C64689rq2 rq22, long j, C12931a aVar) {
        LiveMutableData<Boolean> liveMutableData;
        StringBuilder sb = new StringBuilder();
        sb.append("onFirstVideoFrameRendered,");
        C65770a0 a0Var = this.f189233a;
        C65770a0.C65771b bVar = C65770a0.f189184r;
        sb.append(a0Var.mo89808i());
        Log.m105924i("FinderLiveReplayService", sb.toString());
        C54519d dVar = (C54519d) this.f189233a.mo89804e(C54519d.class);
        if (!(dVar == null || (liveMutableData = dVar.f152848h) == null)) {
            liveMutableData.postValue(Boolean.TRUE);
        }
        for (C66162t f : this.f189233a.f189197k) {
            f.mo78297f(rq22, j, aVar);
        }
    }

    /* renamed from: g */
    public void mo78298g(C64689rq2 rq22, C59673q2 q2Var, int i) {
        for (C66162t g : this.f189233a.f189197k) {
            g.mo78298g(rq22, q2Var, i);
        }
    }

    /* renamed from: h */
    public void mo78299h(C64689rq2 rq22) {
        StringBuilder sb = new StringBuilder();
        sb.append("onReplay,");
        C65770a0 a0Var = this.f189233a;
        C65770a0.C65771b bVar = C65770a0.f189184r;
        sb.append(a0Var.mo89808i());
        Log.m105924i("FinderLiveReplayService", sb.toString());
        for (C66162t h : this.f189233a.f189197k) {
            h.mo78299h(rq22);
        }
    }

    /* renamed from: i */
    public void mo78300i(C64689rq2 rq22, C61576t tVar) {
        for (C66162t i : this.f189233a.f189197k) {
            i.mo78300i(rq22, tVar);
        }
    }

    /* renamed from: j */
    public void mo78301j(C64689rq2 rq22, C61575s sVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("onPause,");
        C65770a0 a0Var = this.f189233a;
        C65770a0.C65771b bVar = C65770a0.f189184r;
        sb.append(a0Var.mo89808i());
        Log.m105924i("FinderLiveReplayService", sb.toString());
        for (C66162t j : this.f189233a.f189197k) {
            j.mo78301j(rq22, sVar);
        }
    }

    /* renamed from: k */
    public void mo78302k(C64689rq2 rq22) {
        StringBuilder sb = new StringBuilder();
        sb.append("onBgPrepared,");
        C65770a0 a0Var = this.f189233a;
        C65770a0.C65771b bVar = C65770a0.f189184r;
        sb.append(a0Var.mo89808i());
        Log.m105924i("FinderLiveReplayService", sb.toString());
        for (C66162t k : this.f189233a.f189197k) {
            k.mo78302k(rq22);
        }
    }

    /* renamed from: l */
    public void mo78303l(C64689rq2 rq22, C59673q2 q2Var, int i) {
        for (C66162t l : this.f189233a.f189197k) {
            l.mo78303l(rq22, q2Var, i);
        }
    }

    /* renamed from: m */
    public void mo78304m(C64689rq2 rq22, long j) {
        C54519d dVar = (C54519d) this.f189233a.mo89804e(C54519d.class);
        int i = dVar != null ? dVar.f152854q : 0;
        Log.m105924i("FinderLiveReplayService", "onFirstFrameUpdate,prepareCostTime:" + j + ",cur offsetL" + i + ',' + this.f189233a.mo89808i());
        C57957o oVar = this.f189233a.f189191e;
        if (oVar != null) {
            oVar.mo78586i();
        }
        C65770a0.m77401c(this.f189233a, i);
        for (C66162t m : this.f189233a.f189197k) {
            m.mo78304m(rq22, j);
        }
    }

    /* renamed from: n */
    public void mo78305n(C64689rq2 rq22, C59673q2 q2Var, int i) {
        for (C66162t n : this.f189233a.f189197k) {
            n.mo78305n(rq22, q2Var, i);
        }
    }

    /* renamed from: o */
    public void mo78306o(C59673q2 q2Var, C61575s sVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("onStopPlay,");
        C65770a0 a0Var = this.f189233a;
        C65770a0.C65771b bVar = C65770a0.f189184r;
        sb.append(a0Var.mo89808i());
        Log.m105924i("FinderLiveReplayService", sb.toString());
        C65770a0.m77400b(this.f189233a, 2);
        for (C66162t o : this.f189233a.f189197k) {
            o.mo78306o(q2Var, sVar);
        }
    }
}
