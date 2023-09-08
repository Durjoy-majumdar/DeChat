package cl1;

import c14.C54624g;
import cj1.C0581o5;
import cj1.C0584p5;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import d14.C58017a1;
import d14.C58056k1;
import d14.C58085t0;
import d14.C58087u0;
import d14.C58100z0;
import di3.C86312j;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o40.C61926c;
import rx3.C13604l;
import te3.C22532vt0;
import te3.C48770aw0;
import te3.C49035cp2;
import te3.C49765hx0;
import te3.C49893it0;
import te3.C52013xs0;
import te3.C64674r41;
import tf0.C13887q1;

/* renamed from: cl1.z0 */
public final class C0702z0 extends C39970c<C45795b> {

    /* renamed from: D */
    public static final C0703a f1668D = new C0703a((C8480h) null);

    /* renamed from: A */
    public List<? extends C49035cp2> f1669A;

    /* renamed from: B */
    public boolean f1670B;

    /* renamed from: C */
    public C13604l<String, Integer> f1671C;

    /* renamed from: f */
    public List<C0581o5> f1672f = Collections.synchronizedList(new ArrayList());

    /* renamed from: g */
    public List<C0581o5> f1673g = Collections.synchronizedList(new ArrayList());

    /* renamed from: h */
    public List<C64674r41> f1674h = Collections.synchronizedList(new ArrayList());

    /* renamed from: i */
    public List<C52013xs0> f1675i = Collections.synchronizedList(new ArrayList());

    /* renamed from: j */
    public List<C0581o5> f1676j = Collections.synchronizedList(new ArrayList());

    /* renamed from: n */
    public int f1677n = -1;

    /* renamed from: o */
    public int f1678o = -1;

    /* renamed from: p */
    public boolean f1679p = true;

    /* renamed from: q */
    public long f1680q;

    /* renamed from: r */
    public boolean f1681r;

    /* renamed from: s */
    public final Set<Integer> f1682s = new LinkedHashSet();

    /* renamed from: t */
    public final Map<Integer, Boolean> f1683t = new LinkedHashMap();

    /* renamed from: u */
    public LiveMutableData<C22532vt0> f1684u = new LiveMutableData<>();

    /* renamed from: v */
    public C58087u0<C49893it0> f1685v = C58056k1.m67214a(null);

    /* renamed from: w */
    public LiveMutableData<Integer> f1686w = new LiveMutableData<>();

    /* renamed from: x */
    public C58085t0<Boolean> f1687x;

    /* renamed from: y */
    public C58087u0<Boolean> f1688y;

    /* renamed from: z */
    public C58085t0<C0581o5> f1689z;

    /* renamed from: cl1.z0$a */
    public static final class C0703a {
        public C0703a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C48770aw0 mo676a(C0581o5 o5Var) {
            int n;
            LinkedList<C48770aw0> linkedList;
            boolean z;
            C49765hx0 i;
            LinkedList<C48770aw0> linkedList2;
            T t;
            boolean z2;
            boolean z3 = false;
            T t2 = null;
            if (!(o5Var != null && o5Var.mo578h()) || (n = o5Var.mo584n()) == 1) {
                return null;
            }
            if (n == 2) {
                C49765hx0 i2 = o5Var.mo579i();
                if (i2 == null || (linkedList = i2.f134930r) == null) {
                    return null;
                }
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (((C48770aw0) next).f130789d == 4) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        t2 = next;
                        break;
                    }
                }
                return (C48770aw0) t2;
            } else if (n != 3 || (i = o5Var.mo579i()) == null || (linkedList2 = i.f134930r) == null) {
                return null;
            } else {
                Iterator<T> it4 = linkedList2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it4.next();
                    if (((C48770aw0) t).f130789d == 2) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                }
                C48770aw0 aw02 = (C48770aw0) t;
                if (aw02 == null) {
                    return null;
                }
                if (aw02.f130791f >= 40) {
                    z3 = true;
                }
                if (z3) {
                    return aw02;
                }
                return null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0702z0(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        C54624g gVar = C54624g.DROP_OLDEST;
        this.f1687x = C58017a1.m67172a(0, 1, gVar);
        this.f1688y = C58056k1.m67214a(Boolean.TRUE);
        this.f1689z = C58017a1.m67172a(0, 1, gVar);
    }

    /* renamed from: c3 */
    public final void mo669c3(C0581o5 o5Var) {
        C87412m.m108594g(o5Var, "msg");
        if (mo670d3() && this.f1670B && f1668D.mo676a(o5Var) != null) {
            this.f1676j.add(o5Var);
            ((C58100z0) this.f1687x).mo82832d(Boolean.TRUE);
            C13887q1 q1Var = (C13887q1) C86312j.m106911c(C13887q1.class);
            int n = o5Var.mo584n();
            q1Var.mo13320MZ(0, 2, n != 2 ? n != 3 ? 0 : 1 : 2);
            Log.m105924i("MMFinder.LiveMsgSlice", "LiveDanmaku_step1:self msg,type:" + o5Var.getType() + ',' + o5Var.mo573g() + XVFSFile.PATH_SEPARATOR_CHAR + o5Var.getContent());
        }
    }

    /* renamed from: d3 */
    public final boolean mo670d3() {
        return !C61926c.m72696u(((C54991o) business(C54991o.class)).f154388y0, 536870912);
    }

    /* renamed from: e3 */
    public final int mo671e3() {
        if (this.f1670B) {
            List<? extends C49035cp2> list = this.f1669A;
            if (!(list == null || list.isEmpty())) {
                return mo672f3();
            }
        }
        return -1;
    }

    /* renamed from: f3 */
    public final int mo672f3() {
        int i;
        List<? extends C49035cp2> list = this.f1669A;
        int i2 = -1;
        if (list != null) {
            int i3 = Integer.MAX_VALUE;
            for (C49035cp2 cp22 : list) {
                if (cp22.f131891f > 0 && (i = cp22.f131892g) < i3) {
                    i2 = cp22.f131889d;
                    i3 = i;
                }
            }
        }
        return i2;
    }

    /* renamed from: g3 */
    public final void mo673g3(C13604l<String, Integer> lVar) {
        Log.m105924i("MMFinder.LiveMsgSlice", "updateLikeMsgCallback " + lVar);
        this.f1671C = lVar;
    }

    /* renamed from: i3 */
    public final void mo674i3(String str, C0581o5 o5Var) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(o5Var, "updateMsg");
        Log.m105924i("MMFinder.LiveMsgSlice", str + " syncFloatLikeMsg " + o5Var.mo573g() + XVFSFile.PATH_SEPARATOR_CHAR + o5Var.getContent());
        ((C58100z0) this.f1689z).mo82832d(o5Var);
    }

    /* renamed from: j3 */
    public final void mo675j3(C0581o5 o5Var) {
        C87412m.m108594g(o5Var, "updateMsg");
        String f = o5Var.mo572f();
        C13604l<String, Integer> lVar = this.f1671C;
        C0584p5 p5Var = null;
        if (C87412m.m108589b(f, lVar != null ? (String) lVar.f38555d : null)) {
            C13604l<String, Integer> lVar2 = this.f1671C;
            boolean z = false;
            if (lVar2 != null && ((Number) lVar2.f38556e).intValue() == 1) {
                mo673g3((C13604l<String, Integer>) null);
                mo674i3("commentMsg", o5Var);
                return;
            }
            C13604l<String, Integer> lVar3 = this.f1671C;
            if (lVar3 != null && ((Number) lVar3.f38556e).intValue() == 2) {
                z = true;
            }
            if (z) {
                mo673g3((C13604l<String, Integer>) null);
                if (o5Var instanceof C0584p5) {
                    p5Var = (C0584p5) o5Var;
                }
                if (p5Var != null) {
                    p5Var.mo570d(true);
                }
                Log.m105924i("MMFinder.LiveMsgSlice", "syncLikeMsg for danmaku, " + o5Var.mo573g() + XVFSFile.PATH_SEPARATOR_CHAR + o5Var.getContent());
            }
        }
    }

    public void onCleared() {
        this.f1672f.clear();
        this.f1673g.clear();
        this.f1674h.clear();
        this.f1675i.clear();
        this.f1682s.clear();
        ((LinkedHashMap) this.f1683t).clear();
        this.f1679p = true;
        this.f1680q = 0;
        this.f1669A = null;
        this.f1670B = false;
        mo673g3((C13604l<String, Integer>) null);
    }
}
