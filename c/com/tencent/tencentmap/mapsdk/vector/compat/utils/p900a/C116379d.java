package com.tencent.tencentmap.mapsdk.vector.compat.utils.p900a;

import com.tencent.tencentmap.mapsdk.vector.compat.utils.p900a.C116379d.C116380a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.a.d */
public class C116379d<T extends C116380a> {

    /* renamed from: a */
    private final C116376a f349211a;

    /* renamed from: b */
    private final int f349212b;

    /* renamed from: c */
    private List<T> f349213c;

    /* renamed from: d */
    private List<C116379d<T>> f349214d;

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.a.d$a */
    public interface C116380a {
        C116377b getPoint();
    }

    public C116379d(double d, double d2, double d3, double d4) {
        this(new C116376a(d, d2, d3, d4));
    }

    /* renamed from: b */
    private void m164045b() {
        ArrayList arrayList = new ArrayList(4);
        this.f349214d = arrayList;
        C116376a aVar = this.f349211a;
        arrayList.add(new C116379d(aVar.f349201a, aVar.f349205e, aVar.f349202b, aVar.f349206f, this.f349212b + 1));
        List<C116379d<T>> list = this.f349214d;
        C116376a aVar2 = this.f349211a;
        list.add(new C116379d(aVar2.f349205e, aVar2.f349203c, aVar2.f349202b, aVar2.f349206f, this.f349212b + 1));
        List<C116379d<T>> list2 = this.f349214d;
        C116376a aVar3 = this.f349211a;
        list2.add(new C116379d(aVar3.f349201a, aVar3.f349205e, aVar3.f349206f, aVar3.f349204d, this.f349212b + 1));
        List<C116379d<T>> list3 = this.f349214d;
        C116376a aVar4 = this.f349211a;
        list3.add(new C116379d(aVar4.f349205e, aVar4.f349203c, aVar4.f349206f, aVar4.f349204d, this.f349212b + 1));
        List<T> list4 = this.f349213c;
        this.f349213c = null;
        for (T t : list4) {
            m164043a(t.getPoint().f349207a, t.getPoint().f349208b, t);
        }
    }

    /* renamed from: a */
    public void mo178917a(T t) {
        C116377b point = t.getPoint();
        if (this.f349211a.mo178905a(point.f349207a, point.f349208b)) {
            m164043a(point.f349207a, point.f349208b, t);
        }
    }

    public C116379d(C116376a aVar) {
        this(aVar, 0);
    }

    private C116379d(double d, double d2, double d3, double d4, int i) {
        this(new C116376a(d, d2, d3, d4), i);
    }

    private C116379d(C116376a aVar, int i) {
        this.f349214d = null;
        this.f349211a = aVar;
        this.f349212b = i;
    }

    /* renamed from: a */
    private void m164043a(double d, double d2, T t) {
        List<C116379d<T>> list = this.f349214d;
        if (list != null) {
            C116376a aVar = this.f349211a;
            if (d2 < aVar.f349206f) {
                if (d < aVar.f349205e) {
                    list.get(0).m164043a(d, d2, t);
                } else {
                    list.get(1).m164043a(d, d2, t);
                }
            } else if (d < aVar.f349205e) {
                list.get(2).m164043a(d, d2, t);
            } else {
                list.get(3).m164043a(d, d2, t);
            }
        } else {
            if (this.f349213c == null) {
                this.f349213c = new ArrayList();
            }
            this.f349213c.add(t);
            if (this.f349213c.size() > 50 && this.f349212b < 40) {
                m164045b();
            }
        }
    }

    /* renamed from: b */
    public boolean mo178918b(T t) {
        C116377b point = t.getPoint();
        if (!this.f349211a.mo178905a(point.f349207a, point.f349208b)) {
            return false;
        }
        return m164046b(point.f349207a, point.f349208b, t);
    }

    /* renamed from: b */
    private boolean m164046b(double d, double d2, T t) {
        List<C116379d<T>> list = this.f349214d;
        if (list == null) {
            return this.f349213c.remove(t);
        }
        C116376a aVar = this.f349211a;
        if (d2 < aVar.f349206f) {
            if (d < aVar.f349205e) {
                return list.get(0).m164046b(d, d2, t);
            }
            return list.get(1).m164046b(d, d2, t);
        } else if (d < aVar.f349205e) {
            return list.get(2).m164046b(d, d2, t);
        } else {
            return list.get(3).m164046b(d, d2, t);
        }
    }

    /* renamed from: a */
    public void mo178916a() {
        this.f349214d = null;
        List<T> list = this.f349213c;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: a */
    public Collection<T> mo178915a(C116376a aVar) {
        ArrayList arrayList = new ArrayList();
        m164044a(aVar, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private void m164044a(C116376a aVar, Collection<T> collection) {
        if (this.f349211a.mo178907a(aVar)) {
            List<C116379d<T>> list = this.f349214d;
            if (list != null) {
                for (C116379d<T> a : list) {
                    a.m164044a(aVar, collection);
                }
            } else if (this.f349213c == null) {
            } else {
                if (aVar.mo178909b(this.f349211a)) {
                    collection.addAll(this.f349213c);
                    return;
                }
                for (T t : this.f349213c) {
                    if (aVar.mo178908a(t.getPoint())) {
                        collection.add(t);
                    }
                }
            }
        }
    }
}
