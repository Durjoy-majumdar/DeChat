package xa0;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import iy3.C60641c;
import java.util.Iterator;
import my3.C61595o;
import p004b0.C103953l0;
import p004b0.C54380k;
import p004b0.C54390x;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import p257w.C37940v;
import p257w.C37946x;
import sx3.C110818d0;
import y04.C112354s;
import y04.C66488v;

/* renamed from: xa0.c */
public final class C66239c extends C66244k {

    /* renamed from: a */
    public final C103953l0 f190292a;

    /* renamed from: b */
    public final C32227p<C66244k, C66245l, Integer> f190293b;

    /* renamed from: c */
    public final C60690y0 f190294c;

    public C66239c(C103953l0 l0Var, C32227p pVar, int i, int i2, C8480h hVar) {
        i = (i2 & 4) != 0 ? 0 : i;
        C87412m.m108594g(l0Var, "lazyListState");
        C87412m.m108594g(pVar, "snapOffsetForItem");
        this.f190292a = l0Var;
        this.f190293b = pVar;
        this.f190294c = C108500f2.m146996c(Integer.valueOf(i), (C108497e2) null, 2, (Object) null);
    }

    /* renamed from: a */
    public boolean mo90330a() {
        C54380k kVar = (C54380k) C110818d0.m150925W(this.f190292a.mo145573g().mo55835f());
        return kVar != null && (kVar.getIndex() < this.f190292a.mo145573g().mo55834e() - 1 || kVar.getOffset() + kVar.getSize() > mo90335f());
    }

    /* renamed from: b */
    public boolean mo90331b() {
        C54380k kVar = (C54380k) C110818d0.m150916N(this.f190292a.mo145573g().mo55835f());
        if (kVar != null) {
            return kVar.getIndex() > 0 || kVar.getOffset() < 0;
        }
        return false;
    }

    /* renamed from: c */
    public int mo90332c(float f, C37940v<Float> vVar, float f2) {
        C87412m.m108594g(vVar, "decayAnimationSpec");
        C66245l e = mo90334e();
        if (e == null) {
            return -1;
        }
        float h = mo90337h();
        if (h <= 0.0f) {
            return e.mo90338a();
        }
        float d = C61595o.m72296d(C37946x.m41665a(vVar, 0.0f, f), -f2, f2);
        int d2 = mo90333d(e.mo90338a() + 1);
        int d3 = mo90333d(e.mo90338a());
        if ((d >= 0.0f && d < ((float) d2)) || (d < 0.0f && d > ((float) d3))) {
            return d2 < (-d3) ? C61595o.m72297e(e.mo90338a() + 1, 0, this.f190292a.mo145573g().mo55834e() - 1) : e.mo90338a();
        }
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i <= 0) {
            d2 = d3;
        }
        float f3 = (d - ((float) d2)) / h;
        if (!Float.isNaN(f3) && !Float.isInfinite(f3)) {
            f3 = (float) (f3 > 0.0f ? Math.floor((double) f3) : Math.ceil((double) f3));
        }
        int i2 = i > 0 ? ((int) f3) + 1 : (int) f3;
        Log.m105924i("SnapperLazyList", "current item: " + e + ", distancePerChild: " + h + ", maximumFlingDistance: " + f2 + ", flingDistance: " + d + ", indexDelta: " + i2);
        return C61595o.m72297e(e.mo90338a() + i2, 0, this.f190292a.mo145573g().mo55834e() - 1);
    }

    /* renamed from: d */
    public int mo90333d(int i) {
        R r;
        int i2;
        int i3;
        boolean z;
        C66488v vVar = (C66488v) C112354s.m153290m(C110818d0.m150897A(this.f190292a.mo145573g().mo55835f()), C66238b.f190291d);
        Iterator<T> it = vVar.f191269a.iterator();
        while (true) {
            if (!it.hasNext()) {
                r = null;
                break;
            }
            r = vVar.f191270b.invoke(it.next());
            if (((C66245l) r).mo90338a() == i) {
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
        C66245l lVar = (C66245l) r;
        if (lVar != null) {
            i2 = lVar.mo90339b();
            i3 = this.f190293b.invoke(this, lVar).intValue();
        } else {
            C66245l e = mo90334e();
            if (e == null) {
                return 0;
            }
            i2 = C60641c.m70921b(((float) (i - e.mo90338a())) * mo90337h()) + e.mo90339b();
            i3 = this.f190293b.invoke(this, e).intValue();
        }
        return i2 - i3;
    }

    /* renamed from: e */
    public C66245l mo90334e() {
        C66488v vVar = (C66488v) C112354s.m153290m(C110818d0.m150897A(this.f190292a.mo145573g().mo55835f()), C66238b.f190291d);
        R r = null;
        for (T invoke : vVar.f191269a) {
            R invoke2 = vVar.f191270b.invoke(invoke);
            C66245l lVar = (C66245l) invoke2;
            if (lVar.mo90339b() <= this.f190293b.invoke(this, lVar).intValue()) {
                r = invoke2;
            }
        }
        return (C66245l) r;
    }

    /* renamed from: f */
    public int mo90335f() {
        return this.f190292a.mo145573g().mo55833c() - ((Number) ((C108494d2) this.f190294c).getValue()).intValue();
    }

    /* renamed from: g */
    public int mo90336g() {
        return 0;
    }

    /* renamed from: h */
    public final float mo90337h() {
        T t;
        int max;
        C54390x g = this.f190292a.mo145573g();
        if (g.mo55835f().isEmpty()) {
            return -1.0f;
        }
        Iterator<T> it = g.mo55835f().iterator();
        T t2 = null;
        if (!it.hasNext()) {
            t = null;
        } else {
            t = it.next();
            if (it.hasNext()) {
                int offset = ((C54380k) t).getOffset();
                do {
                    T next = it.next();
                    int offset2 = ((C54380k) next).getOffset();
                    if (offset > offset2) {
                        t = next;
                        offset = offset2;
                    }
                } while (it.hasNext());
            }
        }
        C54380k kVar = (C54380k) t;
        if (kVar == null) {
            return -1.0f;
        }
        Iterator<T> it4 = g.mo55835f().iterator();
        if (it4.hasNext()) {
            t2 = it4.next();
            if (it4.hasNext()) {
                C54380k kVar2 = (C54380k) t2;
                int offset3 = kVar2.getOffset() + kVar2.getSize();
                do {
                    T next2 = it4.next();
                    C54380k kVar3 = (C54380k) next2;
                    int offset4 = kVar3.getOffset() + kVar3.getSize();
                    if (offset3 < offset4) {
                        t2 = next2;
                        offset3 = offset4;
                    }
                } while (it4.hasNext());
            }
        }
        C54380k kVar4 = (C54380k) t2;
        if (kVar4 == null || (max = Math.max(kVar.getOffset() + kVar.getSize(), kVar4.getOffset() + kVar4.getSize()) - Math.min(kVar.getOffset(), kVar4.getOffset())) == 0) {
            return -1.0f;
        }
        C54390x g2 = this.f190292a.mo145573g();
        int i = 0;
        if (g2.mo55835f().size() >= 2) {
            C54380k kVar5 = g2.mo55835f().get(0);
            i = g2.mo55835f().get(1).getOffset() - (kVar5.getSize() + kVar5.getOffset());
        }
        return ((float) (max + i)) / ((float) g.mo55835f().size());
    }
}
