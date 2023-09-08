package p247u3;

import c14.C54614c;
import c14.C54624g;
import c14.C54625h;
import c14.C54629k;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k14.C60949f;
import k14.C99088c;
import p247u3.C65056f2;
import p247u3.C65060g0;
import p247u3.C65086n0;
import p247u3.C65145q1;
import rx3.C13603j;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C64197v;

/* renamed from: u3.u0 */
public final class C65173u0<Key, Value> {

    /* renamed from: a */
    public final List<C65145q1.C65150b.C65152b<Key, Value>> f187628a;

    /* renamed from: b */
    public final List<C65145q1.C65150b.C65152b<Key, Value>> f187629b;

    /* renamed from: c */
    public int f187630c;

    /* renamed from: d */
    public int f187631d;

    /* renamed from: e */
    public int f187632e;

    /* renamed from: f */
    public int f187633f;

    /* renamed from: g */
    public int f187634g;

    /* renamed from: h */
    public final C54625h<Integer> f187635h = C54629k.m61479a(-1, (C54624g) null, (C32226l) null, 6, (Object) null);

    /* renamed from: i */
    public final C54625h<Integer> f187636i = C54629k.m61479a(-1, (C54624g) null, (C32226l) null, 6, (Object) null);

    /* renamed from: j */
    public final Map<C65069i0, C65056f2> f187637j = new LinkedHashMap();

    /* renamed from: k */
    public C65066h0 f187638k = C65066h0.f187268d;

    /* renamed from: l */
    public final C65078l1 f187639l;

    /* renamed from: u3.u0$a */
    public static final class C65174a<Key, Value> {

        /* renamed from: a */
        public final C99088c f187640a = C60949f.m71437a(false, 1, (Object) null);

        /* renamed from: b */
        public final C65173u0<Key, Value> f187641b;

        public C65174a(C65078l1 l1Var) {
            C87412m.m108594g(l1Var, "config");
            this.f187641b = new C65173u0<>(l1Var, (C8480h) null);
        }
    }

    public C65173u0(C65078l1 l1Var, C8480h hVar) {
        this.f187639l = l1Var;
        ArrayList arrayList = new ArrayList();
        this.f187628a = arrayList;
        this.f187629b = arrayList;
    }

    /* renamed from: a */
    public final C65164r1<Key, Value> mo89329a(C65056f2.C65057a aVar) {
        Integer num;
        int i;
        List<T> y0 = C110818d0.m150953y0(this.f187629b);
        if (aVar != null) {
            int d = mo89332d();
            int i2 = -this.f187630c;
            int e = C64197v.m75536e(this.f187629b) - this.f187630c;
            int i3 = aVar.f187256e;
            for (int i4 = i2; i4 < i3; i4++) {
                if (i4 > e) {
                    i = this.f187639l.f187298a;
                } else {
                    i = ((C65145q1.C65150b.C65152b) ((ArrayList) this.f187629b).get(this.f187630c + i4)).f187562a.size();
                }
                d += i;
            }
            int i5 = d + aVar.f187257f;
            if (aVar.f187256e < i2) {
                i5 -= this.f187639l.f187298a;
            }
            num = Integer.valueOf(i5);
        } else {
            num = null;
        }
        return new C65164r1<>(y0, num, this.f187639l, mo89332d());
    }

    /* renamed from: b */
    public final void mo89330b(C65086n0.C65087a<Value> aVar) {
        C87412m.m108594g(aVar, "event");
        int i = 0;
        if (aVar.mo89283b() <= ((ArrayList) this.f187629b).size()) {
            this.f187637j.remove(aVar.f187321a);
            this.f187638k = this.f187638k.mo89265c(aVar.f187321a, C65060g0.C65063c.f187265c);
            int ordinal = aVar.f187321a.ordinal();
            if (ordinal == 1) {
                int b = aVar.mo89283b();
                for (int i2 = 0; i2 < b; i2++) {
                    ((ArrayList) this.f187628a).remove(0);
                }
                this.f187630c -= aVar.mo89283b();
                int i3 = aVar.f187324d;
                if (i3 != Integer.MIN_VALUE) {
                    i = i3;
                }
                this.f187631d = i;
                int i4 = this.f187633f + 1;
                this.f187633f = i4;
                ((C54614c) this.f187635h).offer(Integer.valueOf(i4));
            } else if (ordinal == 2) {
                int b2 = aVar.mo89283b();
                for (int i5 = 0; i5 < b2; i5++) {
                    ((ArrayList) this.f187628a).remove(((ArrayList) this.f187629b).size() - 1);
                }
                int i6 = aVar.f187324d;
                if (i6 != Integer.MIN_VALUE) {
                    i = i6;
                }
                this.f187632e = i;
                int i7 = this.f187634g + 1;
                this.f187634g = i7;
                ((C54614c) this.f187636i).offer(Integer.valueOf(i7));
            } else {
                throw new IllegalArgumentException("cannot drop " + aVar.f187321a);
            }
        } else {
            throw new IllegalStateException(("invalid drop count. have " + ((ArrayList) this.f187629b).size() + " but wanted to drop " + aVar.mo89283b()).toString());
        }
    }

    /* renamed from: c */
    public final C65086n0.C65087a<Value> mo89331c(C65069i0 i0Var, C65056f2 f2Var) {
        int i;
        int i2;
        int i3;
        C87412m.m108594g(i0Var, "loadType");
        C87412m.m108594g(f2Var, "hint");
        C65086n0.C65087a<Value> aVar = null;
        if (this.f187639l.f187302e == Integer.MAX_VALUE || ((ArrayList) this.f187629b).size() <= 2) {
            return null;
        }
        Iterator it = ((ArrayList) this.f187629b).iterator();
        int i4 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            i5 += ((C65145q1.C65150b.C65152b) it.next()).f187562a.size();
        }
        if (i5 <= this.f187639l.f187302e) {
            return null;
        }
        if (i0Var != C65069i0.REFRESH) {
            int i6 = 0;
            int i7 = 0;
            while (i6 < ((ArrayList) this.f187629b).size()) {
                Iterator it4 = ((ArrayList) this.f187629b).iterator();
                int i8 = 0;
                while (it4.hasNext()) {
                    i8 += ((C65145q1.C65150b.C65152b) it4.next()).f187562a.size();
                }
                if (i8 - i7 <= this.f187639l.f187302e) {
                    break;
                }
                if (i0Var.ordinal() != 1) {
                    List<C65145q1.C65150b.C65152b<Key, Value>> list = this.f187629b;
                    i3 = ((C65145q1.C65150b.C65152b) ((ArrayList) list).get(C64197v.m75536e(list) - i6)).f187562a.size();
                } else {
                    i3 = ((C65145q1.C65150b.C65152b) ((ArrayList) this.f187629b).get(i6)).f187562a.size();
                }
                if (((i0Var.ordinal() != 1 ? f2Var.f187253b : f2Var.f187252a) - i7) - i3 < this.f187639l.f187299b) {
                    break;
                }
                i7 += i3;
                i6++;
            }
            if (i6 != 0) {
                int e = i0Var.ordinal() != 1 ? (C64197v.m75536e(this.f187629b) - this.f187630c) - (i6 - 1) : -this.f187630c;
                if (i0Var.ordinal() != 1) {
                    i2 = C64197v.m75536e(this.f187629b);
                    i = this.f187630c;
                } else {
                    i2 = i6 - 1;
                    i = this.f187630c;
                }
                int i9 = i2 - i;
                boolean z = this.f187639l.f187300c;
                if (z) {
                    if (i0Var == C65069i0.PREPEND) {
                        i4 = mo89332d();
                    } else if (z) {
                        i4 = this.f187632e;
                    }
                    i4 += i7;
                }
                aVar = new C65086n0.C65087a<>(i0Var, e, i9, i4);
            }
            return aVar;
        }
        throw new IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + i0Var).toString());
    }

    /* renamed from: d */
    public final int mo89332d() {
        if (this.f187639l.f187300c) {
            return this.f187631d;
        }
        return 0;
    }

    /* renamed from: e */
    public final boolean mo89333e(int i, C65069i0 i0Var, C65145q1.C65150b.C65152b<Key, Value> bVar) {
        C87412m.m108594g(i0Var, "loadType");
        C87412m.m108594g(bVar, "page");
        int ordinal = i0Var.ordinal();
        int i2 = 0;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (!(!((ArrayList) this.f187629b).isEmpty())) {
                        throw new IllegalStateException("should've received an init before append".toString());
                    } else if (i != this.f187634g) {
                        return false;
                    } else {
                        ((ArrayList) this.f187628a).add(bVar);
                        int i3 = bVar.f187566e;
                        if (i3 == Integer.MIN_VALUE) {
                            i3 = (this.f187639l.f187300c ? this.f187632e : 0) - bVar.f187562a.size();
                            if (i3 < 0) {
                                i3 = 0;
                            }
                        }
                        if (i3 != Integer.MIN_VALUE) {
                            i2 = i3;
                        }
                        this.f187632e = i2;
                        this.f187637j.remove(C65069i0.APPEND);
                    }
                }
            } else if (!(!((ArrayList) this.f187629b).isEmpty())) {
                throw new IllegalStateException("should've received an init before prepend".toString());
            } else if (i != this.f187633f) {
                return false;
            } else {
                ((ArrayList) this.f187628a).add(0, bVar);
                this.f187630c++;
                int i4 = bVar.f187565d;
                if (i4 == Integer.MIN_VALUE && (i4 = mo89332d() - bVar.f187562a.size()) < 0) {
                    i4 = 0;
                }
                if (i4 != Integer.MIN_VALUE) {
                    i2 = i4;
                }
                this.f187631d = i2;
                this.f187637j.remove(C65069i0.PREPEND);
            }
        } else if (((ArrayList) this.f187629b).isEmpty()) {
            if (i == 0) {
                ((ArrayList) this.f187628a).add(bVar);
                this.f187630c = 0;
                int i5 = bVar.f187566e;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = 0;
                }
                this.f187632e = i5;
                int i6 = bVar.f187565d;
                if (i6 != Integer.MIN_VALUE) {
                    i2 = i6;
                }
                this.f187631d = i2;
            } else {
                throw new IllegalStateException("init loadId must be the initial value, 0".toString());
            }
        } else {
            throw new IllegalStateException("cannot receive multiple init calls".toString());
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo89334f(C65069i0 i0Var, C65060g0 g0Var) {
        C87412m.m108594g(i0Var, "type");
        C87412m.m108594g(g0Var, "newState");
        if (C87412m.m108589b(this.f187638k.mo89264b(i0Var), g0Var)) {
            return false;
        }
        this.f187638k = this.f187638k.mo89265c(i0Var, g0Var);
        return true;
    }

    /* renamed from: g */
    public final C65086n0<Value> mo89335g(C65145q1.C65150b.C65152b<Key, Value> bVar, C65069i0 i0Var) {
        int i;
        C65145q1.C65150b.C65152b<Key, Value> bVar2 = bVar;
        C87412m.m108594g(bVar2, "$this$toPageEvent");
        C87412m.m108594g(i0Var, "loadType");
        int ordinal = i0Var.ordinal();
        int i2 = 0;
        if (ordinal == 0) {
            i = 0;
        } else if (ordinal == 1) {
            i = 0 - this.f187630c;
        } else if (ordinal == 2) {
            i = (((ArrayList) this.f187629b).size() - this.f187630c) - 1;
        } else {
            throw new C13603j();
        }
        List b = C26236u.m33719b(new C65048d2(i, bVar2.f187562a));
        int ordinal2 = i0Var.ordinal();
        if (ordinal2 == 0) {
            C65086n0.C65088b.C65089a aVar = C65086n0.C65088b.f187326g;
            int d = mo89332d();
            if (this.f187639l.f187300c) {
                i2 = this.f187632e;
            }
            C65066h0 h0Var = this.f187638k;
            return aVar.mo89290a(b, d, i2, new C65079m(h0Var.f187269a, h0Var.f187270b, h0Var.f187271c, h0Var, (C65066h0) null));
        } else if (ordinal2 == 1) {
            C65086n0.C65088b<Object> bVar3 = C65086n0.C65088b.f187325f;
            int d2 = mo89332d();
            C65066h0 h0Var2 = this.f187638k;
            return new C65086n0.C65088b(C65069i0.PREPEND, b, d2, -1, new C65079m(h0Var2.f187269a, h0Var2.f187270b, h0Var2.f187271c, h0Var2, (C65066h0) null));
        } else if (ordinal2 == 2) {
            C65086n0.C65088b<Object> bVar4 = C65086n0.C65088b.f187325f;
            int i3 = this.f187639l.f187300c ? this.f187632e : 0;
            C65066h0 h0Var3 = this.f187638k;
            return new C65086n0.C65088b(C65069i0.APPEND, b, -1, i3, new C65079m(h0Var3.f187269a, h0Var3.f187270b, h0Var3.f187271c, h0Var3, (C65066h0) null));
        } else {
            throw new C13603j();
        }
    }
}
