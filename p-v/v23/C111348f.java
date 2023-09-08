package v23;

import com.tencent.p014mm.timelineedit.TimelineEditor;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.codec.DefaultMediaFactory;
import com.tencent.tav.decoder.IEncoderFactory;
import ff3.C107537a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki3.C109012c;
import ki3.C109013d;
import ki3.C109016g;
import ki3.C109017h;
import ki3.C109018i;
import ki3.C109019j;
import ki3.C109022m;
import ki3.C109023n;
import ki3.C109024o;
import ki3.C109025p;
import lh2.C99417a;
import li3.C109385a;
import li3.C109386b;
import li3.C109388f;
import li3.C109389g;
import li3.C99482e;
import mi3.C25007m;
import mi3.C25016p;
import qh2.C101198e;
import rr3.C110647w;
import rx3.C13598b0;
import rx3.C13605o;
import sp3.C110801c;
import sp3.C110807k;
import sx3.C36907w;
import tp3.C111047a;
import y13.C112374d;
import z04.C112550d0;

/* renamed from: v23.f */
public final class C111348f extends C99417a {

    /* renamed from: f */
    public C109386b f333355f;

    /* renamed from: g */
    public TimelineEditor f333356g = new TimelineEditor();

    /* renamed from: h */
    public C110807k f333357h;

    /* renamed from: i */
    public int f333358i = 44100;

    /* renamed from: j */
    public int f333359j = 1;

    /* renamed from: n */
    public final ArrayList<C111349a> f333360n = new ArrayList<>();

    /* renamed from: v23.f$a */
    public interface C111349a {
        /* renamed from: h */
        void mo152387h(C110807k kVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111348f(C101198e eVar, C109386b bVar) {
        super(eVar, (String) null);
        C87412m.m108594g(eVar, "status");
        C87412m.m108594g(bVar, "config");
        this.f333355f = bVar;
    }

    /* renamed from: A */
    public final void mo163025A(C110807k kVar) {
        this.f333357h = kVar;
        if (kVar != null) {
            kVar.f331510k = new C111047a(new C107537a(this.f333358i, this.f333359j));
        }
        C110807k kVar2 = this.f333357h;
        if (kVar2 != null) {
            kVar2.f331516q = new DefaultMediaFactory((IEncoderFactory) null, new C112374d(false, false, 3, (C8480h) null));
        }
    }

    /* renamed from: B */
    public final C110807k mo163026B(boolean z) {
        ArrayList<C110801c> arrayList;
        C25007m.C25009b bVar = (C25007m.C25009b) this.f333355f.mo160583a();
        bVar.f71256p = !z;
        bVar.onChanged();
        TimelineEditor timelineEditor = this.f333356g;
        C109386b bVar2 = this.f333355f;
        timelineEditor.getClass();
        C87412m.m108595h(bVar2, "config");
        C110807k kVar = (C110807k) timelineEditor.mo153351v(new C109024o(timelineEditor, bVar2), new C109025p(timelineEditor));
        C110807k kVar2 = this.f333357h;
        if (!(kVar2 == null || (arrayList = kVar2.f331511l) == null)) {
            Iterator<C110801c> it = arrayList.iterator();
            while (it.hasNext()) {
                C110801c next = it.next();
                if (next.f331483u != 3) {
                    next.mo162369g(z ? 0.0f : 1.0f);
                }
            }
        }
        return this.f333357h;
    }

    /* renamed from: C */
    public final void mo163027C() {
        for (C111349a h : this.f333360n) {
            h.mo152387h(this.f333357h);
        }
    }

    /* renamed from: D */
    public final C110807k mo163028D(List<C13605o<String, Long, Long>> list) {
        ArrayList<C110801c> arrayList;
        C13605o oVar;
        T t;
        C110801c cVar;
        C13598b0 b0Var;
        ArrayList<C110801c> arrayList2;
        C110801c cVar2;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(C36907w.m41090l(list, 10));
            for (C13605o oVar2 : list) {
                String str = (String) oVar2.f38557d;
                long longValue = ((Number) oVar2.f38558e).longValue();
                long longValue2 = ((Number) oVar2.f38559f).longValue();
                C110807k kVar = this.f333357h;
                if (kVar == null || (arrayList2 = kVar.f331511l) == null) {
                    cVar = null;
                } else {
                    Iterator<C110801c> it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            cVar2 = null;
                            break;
                        }
                        cVar2 = it.next();
                        if (C87412m.m108589b(str, cVar2.f331482t)) {
                            break;
                        }
                    }
                    cVar = cVar2;
                }
                if (cVar == null) {
                    C109388f q = this.f333356g.mo153346q(str, 2);
                    if (q != null) {
                        q.mo160588f(new C99482e(longValue, longValue2));
                        q.mo160589g(new C99482e(0, ((C25016p.C25018b) q.mo160583a()).f71300n));
                        C25016p.C25018b bVar = (C25016p.C25018b) q.mo160583a();
                        bVar.f71304r = 3.0f;
                        bVar.onChanged();
                        mo163025A(this.f333356g.mo153343n(q));
                        b0Var = C13598b0.f38549a;
                    } else {
                        b0Var = null;
                    }
                } else {
                    cVar.mo162366d(longValue);
                    cVar.mo162365c(longValue2);
                    mo163025A(this.f333356g.mo153353x(C109385a.m148548c(cVar)));
                    b0Var = C13598b0.f38549a;
                }
                arrayList3.add(b0Var);
            }
        }
        C110807k kVar2 = this.f333357h;
        if (!(kVar2 == null || (arrayList = kVar2.f331511l) == null)) {
            Iterator<C110801c> it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C110801c next = it4.next();
                if (next.f331483u == 3 && C112550d0.m153803w(next.f331482t, "tts", false, 2, (Object) null)) {
                    if (list != null) {
                        Iterator<T> it5 = list.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it5.next();
                            if (C87412m.m108589b(((C13605o) t).f38557d, next.f331482t)) {
                                break;
                            }
                        }
                        oVar = (C13605o) t;
                    } else {
                        oVar = null;
                    }
                    if (oVar == null) {
                        TimelineEditor timelineEditor = this.f333356g;
                        C109388f c = C109385a.m148548c(next);
                        timelineEditor.getClass();
                        mo163025A((C110807k) timelineEditor.mo153351v(new C109016g(timelineEditor, c), new C109017h(timelineEditor)));
                    }
                }
            }
        }
        return this.f333357h;
    }

    public void reset() {
        this.f333356g = new TimelineEditor();
    }

    /* renamed from: x */
    public final C110807k mo163029x(String str, long j, int i) {
        ArrayList<C110801c> arrayList;
        ArrayList<C110801c> arrayList2;
        int i2 = 0;
        if (C86013q1.m106450k(str)) {
            String i3 = C86013q1.m106448i(str, false);
            if (i3 != null) {
                C110807k kVar = this.f333357h;
                if (!(kVar == null || (arrayList2 = kVar.f331511l) == null)) {
                    i2 = arrayList2.size();
                }
                if (i < i2 - 1) {
                    C110807k kVar2 = this.f333357h;
                    C87412m.m108591d(kVar2);
                    C110801c cVar = kVar2.f331511l.get(i);
                    C110807k kVar3 = this.f333357h;
                    C87412m.m108591d(kVar3);
                    C110801c cVar2 = kVar3.f331511l.get(i + 1);
                    C110647w r = this.f333356g.mo153347r(i3);
                    if (r != null) {
                        TimelineEditor timelineEditor = this.f333356g;
                        C109388f c = C109385a.m148548c(cVar);
                        C109388f c2 = C109385a.m148548c(cVar2);
                        C87412m.m108591d(str);
                        C109389g gVar = new C109389g(c, c2, r, j, str);
                        timelineEditor.getClass();
                        mo163025A((C110807k) timelineEditor.mo153351v(new C109022m(timelineEditor, gVar), new C109023n(timelineEditor)));
                    }
                }
            }
        } else {
            C110807k kVar4 = this.f333357h;
            if (!(kVar4 == null || (arrayList = kVar4.f331511l) == null)) {
                i2 = arrayList.size();
            }
            if (i < i2 - 1) {
                C110807k kVar5 = this.f333357h;
                C87412m.m108591d(kVar5);
                TimelineEditor timelineEditor2 = this.f333356g;
                C109388f c3 = C109385a.m148548c(kVar5.f331511l.get(i + 1));
                timelineEditor2.getClass();
                mo163025A((C110807k) timelineEditor2.mo153351v(new C109018i(timelineEditor2, c3), new C109019j(timelineEditor2)));
            }
        }
        return this.f333357h;
    }

    /* renamed from: y */
    public final C110807k mo163030y() {
        TimelineEditor timelineEditor = this.f333356g;
        timelineEditor.getClass();
        C110807k kVar = (C110807k) timelineEditor.mo153351v(new C109012c(timelineEditor), new C109013d(timelineEditor));
        if (kVar != null) {
            kVar.f331516q = new DefaultMediaFactory((IEncoderFactory) null, new C112374d(false, false, 3, (C8480h) null));
        }
        if (kVar != null) {
            kVar.f331510k = new C111047a(new C107537a(this.f333358i, this.f333359j));
        }
        return kVar;
    }

    /* renamed from: z */
    public final C110807k mo163031z(long j) {
        ArrayList<C110801c> arrayList;
        C110807k kVar = this.f333357h;
        if (!(kVar == null || (arrayList = kVar.f331511l) == null)) {
            Iterator<C110801c> it = arrayList.iterator();
            long j2 = 0;
            while (it.hasNext()) {
                C110801c next = it.next();
                if (j2 >= j) {
                    TimelineEditor timelineEditor = this.f333356g;
                    C109388f c = C109385a.m148548c(next);
                    timelineEditor.getClass();
                    mo163025A((C110807k) timelineEditor.mo153351v(new C109016g(timelineEditor, c), new C109017h(timelineEditor)));
                } else {
                    long j3 = next.f331465c;
                    long j4 = next.f331464b;
                    if ((j3 - j4) + j2 > j) {
                        next.mo162366d(j2);
                        next.mo162365c(j);
                        next.mo162368f(next.f331466d);
                        next.mo162367e((long) ((((float) (next.f331465c - next.f331464b)) * next.f331468f) + ((float) next.f331466d)));
                        mo163025A(this.f333356g.mo153353x(C109385a.m148548c(next)));
                        j3 = next.f331465c;
                        j4 = next.f331464b;
                    }
                    j2 += j3 - j4;
                }
            }
        }
        return this.f333357h;
    }
}
