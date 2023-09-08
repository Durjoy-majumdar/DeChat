package de3;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;

/* renamed from: de3.k */
public final class C75365k<T> {

    /* renamed from: a */
    public final T f221575a;

    /* renamed from: b */
    public final int f221576b;

    /* renamed from: c */
    public final int f221577c;

    /* renamed from: d */
    public int f221578d = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2958ae);

    /* renamed from: e */
    public int f221579e = MMApplicationContext.getContext().getResources().getColor(C0966R.color.Link_Alpha_0_6);

    /* renamed from: f */
    public C75364j<T> f221580f;

    public C75365k(T t, int i, int i2) {
        this.f221575a = t;
        this.f221576b = i;
        this.f221577c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75365k)) {
            return false;
        }
        C75365k kVar = (C75365k) obj;
        return C87412m.m108589b(this.f221575a, kVar.f221575a) && this.f221576b == kVar.f221576b && this.f221577c == kVar.f221577c;
    }

    public int hashCode() {
        T t = this.f221575a;
        return ((((t == null ? 0 : t.hashCode()) * 31) + this.f221576b) * 31) + this.f221577c;
    }

    public String toString() {
        return "LinkSpanObj(content=" + this.f221575a + ", start=" + this.f221576b + ", end=" + this.f221577c + ')';
    }
}
