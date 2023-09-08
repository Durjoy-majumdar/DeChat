package hl1;

import al1.C54129i;
import android.os.SystemClock;
import cl1.C0690t1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import fj1.C45795b;
import gy3.C87412m;
import il1.C60424h8;
import il1.C60463n8;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import o40.C61926c;
import ok1.C62042e;
import qj1.C12399ff;
import qj1.C12690u1;
import qj1.C12703v1;
import qj1.C62632a6;
import qj1.C62741dg;
import rx3.C13604l;

/* renamed from: hl1.e4 */
public final class C59969e4 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final String f171109d;

    /* renamed from: e */
    public WeakReference<C59988k> f171110e;

    public C59969e4(C59988k kVar, String str, C45795b bVar) {
        C87412m.m108594g(kVar, "pluginLayout");
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(bVar, "liveData");
        this.f171109d = str;
        this.f171110e = new WeakReference<>(kVar);
    }

    public boolean onTimerExpired() {
        C12690u1 u1Var;
        Class cls = C55001u.class;
        Class cls2 = C0690t1.class;
        Class cls3 = C54991o.class;
        C59988k kVar = this.f171110e.get();
        boolean z = false;
        if (kVar == null) {
            Log.m105924i(this.f171109d, "VisitorTimerCallbackImpl onTimerExpired curPluginLayout is empty!");
            return false;
        }
        C62632a6 a6Var = kVar.f171246v;
        C62741dg dgVar = kVar.f171228m1;
        if (a6Var != null && a6Var.mo14483f0() == 0) {
            if (((C54991o) kVar.mo83051g(cls3)).f154364s2) {
                C12399ff ffVar = kVar.f171244u;
                if (!(ffVar != null && ffVar.mo14483f0() == 0)) {
                    return true;
                }
            }
            LinkedList linkedList = new LinkedList();
            C62042e eVar = C62042e.f176370a;
            if (eVar.mo87090j1(kVar.f166851d)) {
                linkedList.add(new C13604l(6, null));
            } else {
                linkedList.add(new C13604l(2, null));
                if (((C0690t1) kVar.mo83051g(cls2)).f1633p || ((C54991o) kVar.mo83051g(cls3)).f154190D) {
                    linkedList.add(new C13604l(3, null));
                }
                if (((C54991o) kVar.mo83051g(cls3)).f154243Q1 && ((C54991o) kVar.mo83051g(cls3)).mo75963I3() && (((C0690t1) kVar.mo83051g(cls2)).f1633p || eVar.mo87096m0(((C55001u) kVar.mo83051g(cls)).f154420q) > 0)) {
                    linkedList.add(new C13604l(4, null));
                }
            }
            a6Var.mo87672f1(linkedList, false, false);
        }
        C12690u1 u1Var2 = kVar.f171169L;
        if ((u1Var2 != null && u1Var2.mo14483f0() == 0) && (u1Var = kVar.f171169L) != null) {
            C61926c.m72668M(new C12703v1(u1Var, ((C54991o) kVar.mo83051g(cls3)).f154276X));
        }
        if (dgVar != null) {
            if (dgVar.f178125t.f166287d.getVisibility() == 0) {
                z = true;
            }
            if (z) {
                C60424h8 h8Var = dgVar.f178125t;
                h8Var.f166287d.post(new C60463n8(h8Var, ((C54991o) dgVar.mo87696x0(cls3)).f154276X));
            }
        }
        if (((C54991o) kVar.mo83051g(cls3)).f154346o1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((C54991o) kVar.mo83051g(cls3)).f154346o1;
            if (elapsedRealtime >= ((long) C54129i.f151985m) && ((C54991o) kVar.mo83051g(cls3)).mo75999e4()) {
                String str = this.f171109d;
                Log.m105924i(str, "visitor join time:" + ((C54991o) kVar.mo83051g(cls3)).f154346o1 + ",watch live duration:" + elapsedRealtime + '!');
                ((C54991o) kVar.mo83051g(cls3)).mo75964I4(MAlarmHandler.NEXT_FIRE_INTERVAL);
                FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
                feedUpdateEvent.f9173d.f9174a = ((C55001u) kVar.mo83051g(cls)).f154420q.f182392d;
                feedUpdateEvent.f9173d.f9175b = 21;
                feedUpdateEvent.publish();
            }
        }
        return true;
    }
}
