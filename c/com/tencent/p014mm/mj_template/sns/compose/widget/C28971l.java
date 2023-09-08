package com.tencent.p014mm.mj_template.sns.compose.widget;

import gy3.C87412m;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.l */
public final class C28971l<T> {

    /* renamed from: a */
    public final T f79451a;

    /* renamed from: b */
    public final long f79452b;

    public C28971l(T t, long j) {
        this.f79451a = t;
        this.f79452b = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28971l)) {
            return false;
        }
        C28971l lVar = (C28971l) obj;
        return C87412m.m108589b(this.f79451a, lVar.f79451a) && this.f79452b == lVar.f79452b;
    }

    public int hashCode() {
        T t = this.f79451a;
        int hashCode = t == null ? 0 : t.hashCode();
        long j = this.f79452b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "MusicSearchDataWrapper(data=" + this.f79451a + ", recId=" + this.f79452b + ')';
    }
}
