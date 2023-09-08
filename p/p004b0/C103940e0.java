package p004b0;

import a14.C53895h;
import a14.C53934p0;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p175j0.C108494d2;
import p257w.C37892b0;
import p436a1.C103224b0;
import p560i2.C33177j;
import p560i2.C33179k;
import p560i2.C33183o;
import p631o1.C109854n0;
import p631o1.C109859o0;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: b0.e0 */
public final class C103940e0 implements C54380k {

    /* renamed from: a */
    public final int f307356a;

    /* renamed from: b */
    public final int f307357b;

    /* renamed from: c */
    public final Object f307358c;

    /* renamed from: d */
    public final int f307359d;

    /* renamed from: e */
    public final int f307360e;

    /* renamed from: f */
    public final int f307361f;

    /* renamed from: g */
    public final int f307362g;

    /* renamed from: h */
    public final boolean f307363h;

    /* renamed from: i */
    public final List<C103936d0> f307364i;

    /* renamed from: j */
    public final C103956m f307365j;

    /* renamed from: k */
    public final long f307366k;

    /* renamed from: l */
    public final boolean f307367l;

    public C103940e0(int i, int i2, Object obj, int i3, int i4, int i5, int i6, boolean z, List list, C103956m mVar, long j, C8480h hVar) {
        this.f307356a = i;
        this.f307357b = i2;
        this.f307358c = obj;
        this.f307359d = i3;
        this.f307360e = i4;
        this.f307361f = i5;
        this.f307362g = i6;
        this.f307363h = z;
        this.f307364i = list;
        this.f307365j = mVar;
        this.f307366k = j;
        int size = list.size();
        boolean z2 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            } else if (mo145555a(i7) != null) {
                z2 = true;
                break;
            } else {
                i7++;
            }
        }
        this.f307367l = z2;
    }

    /* renamed from: a */
    public final C37892b0<C33177j> mo145555a(int i) {
        Object obj = this.f307364i.get(i).f307333c;
        if (obj instanceof C37892b0) {
            return (C37892b0) obj;
        }
        return null;
    }

    /* renamed from: b */
    public final int mo145556b(int i) {
        C109854n0 n0Var = this.f307364i.get(i).f307332b;
        return this.f307363h ? n0Var.f328780e : n0Var.f328779d;
    }

    /* renamed from: c */
    public final long mo145557c(int i) {
        return this.f307364i.get(i).f307331a;
    }

    /* renamed from: d */
    public final void mo145558d(C109854n0.C109855a aVar) {
        int i;
        long j;
        C103940e0 e0Var;
        int i2;
        int i3;
        C87412m.m108594g(aVar, "scope");
        C103940e0 e0Var2 = this;
        int i4 = 0;
        for (int size = this.f307364i.size(); i4 < size; size = i) {
            C109854n0 n0Var = e0Var2.f307364i.get(i4).f307332b;
            int i5 = e0Var2.f307361f - (e0Var2.f307363h ? n0Var.f328780e : n0Var.f328779d);
            int i6 = e0Var2.f307362g;
            if (e0Var2.mo145555a(i4) != null) {
                C103956m mVar = e0Var2.f307365j;
                Object obj = e0Var2.f307358c;
                j = e0Var2.mo145557c(i4);
                mVar.getClass();
                C87412m.m108594g(obj, "key");
                C103935c cVar = (C103935c) ((LinkedHashMap) mVar.f307437c).get(obj);
                if (cVar == null) {
                    i = size;
                    i3 = i4;
                } else {
                    C103930a1 a1Var = (C103930a1) ((ArrayList) cVar.f307330b).get(i4);
                    long j2 = a1Var.f307318b.mo163295c().f90052a;
                    long j3 = cVar.f307329a;
                    i = size;
                    i3 = i4;
                    j = C33179k.m39964a(((int) (j2 >> 32)) + ((int) (j3 >> 32)), C33177j.m39962a(j2) + C33177j.m39962a(j3));
                    long j4 = a1Var.f307319c;
                    long j5 = cVar.f307329a;
                    long a = C33179k.m39964a(((int) (j4 >> 32)) + ((int) (j5 >> 32)), C33177j.m39962a(j4) + C33177j.m39962a(j5));
                    if (((Boolean) ((C108494d2) a1Var.f307320d).getValue()).booleanValue() && ((mVar.mo145578b(a) < i5 && mVar.mo145578b(j) < i5) || (mVar.mo145578b(a) > i6 && mVar.mo145578b(j) > i6))) {
                        C53895h.m60466d(mVar.f307435a, (C66212f) null, (C53934p0) null, new C103952l(a1Var, (C15601d<? super C103952l>) null), 3, (Object) null);
                    }
                }
                e0Var = this;
                i2 = i3;
            } else {
                i = size;
                i2 = i4;
                j = e0Var2.mo145557c(i2);
                e0Var = e0Var2;
            }
            if (e0Var.f307363h) {
                long j6 = e0Var.f307366k;
                C109854n0.C109855a.m149309j(aVar, n0Var, C33179k.m39964a(((int) (j >> 32)) + ((int) (j6 >> 32)), C33177j.m39962a(j) + C33177j.m39962a(j6)), 0.0f, (C32226l) null, 6, (Object) null);
            } else {
                long j7 = e0Var.f307366k;
                long a2 = C33179k.m39964a(((int) (j >> 32)) + ((int) (j7 >> 32)), C33177j.m39962a(j) + C33177j.m39962a(j7));
                C109854n0.C109855a.C109856a aVar2 = C109854n0.C109855a.f328783a;
                C32226l<C103224b0, C13598b0> lVar = C109859o0.f328786a;
                C87412m.m108594g(lVar, "layerBlock");
                if (aVar.mo161172a() == C33183o.Ltr || aVar.mo161173b() == 0) {
                    long a0 = n0Var.mo161165a0();
                    n0Var.mo161160j0(C33179k.m39964a(((int) (a2 >> 32)) + ((int) (a0 >> 32)), C33177j.m39962a(a2) + C33177j.m39962a(a0)), 0.0f, lVar);
                } else {
                    long a3 = C33179k.m39964a((aVar.mo161173b() - ((int) (n0Var.f328781f >> 32))) - ((int) (a2 >> 32)), C33177j.m39962a(a2));
                    long a05 = n0Var.mo161165a0();
                    n0Var.mo161160j0(C33179k.m39964a(((int) (a3 >> 32)) + ((int) (a05 >> 32)), C33177j.m39962a(a3) + C33177j.m39962a(a05)), 0.0f, lVar);
                }
            }
            i4 = i2 + 1;
            C109854n0.C109855a aVar3 = aVar;
            e0Var2 = e0Var;
        }
    }

    public int getIndex() {
        return this.f307357b;
    }

    public int getOffset() {
        return this.f307356a;
    }

    public int getSize() {
        return this.f307359d;
    }
}
