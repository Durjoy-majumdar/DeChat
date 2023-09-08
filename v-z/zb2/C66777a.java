package zb2;

import gy3.C87412m;
import zb2.C103001d;

/* renamed from: zb2.a */
public abstract class C66777a<T extends C103001d<T>> implements C103001d<T>, Cloneable {
    /* renamed from: Yt */
    public boolean mo90778Yt(Object obj) {
        C103001d dVar = (C103001d) obj;
        C87412m.m108594g(dVar, "other");
        return getItemId() == dVar.getItemId();
    }

    /* renamed from: a */
    public T mo90777Ow() {
        T clone = super.clone();
        C87412m.m108592e(clone, "null cannot be cast to non-null type T of com.tencent.mm.plugin.mvvmlist.BaseMvvmListItem");
        return (C103001d) clone;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        C103001d dVar = obj instanceof C103001d ? (C103001d) obj : null;
        return dVar != null && getItemId() == dVar.getItemId();
    }

    public final long getItemId() {
        return (long) mo344Oa().hashCode();
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    /* renamed from: kD */
    public C16133i mo90782kD(Object obj) {
        C103001d dVar = (C103001d) obj;
        C87412m.m108594g(dVar, "old");
        return new C16133i(dVar);
    }
}
