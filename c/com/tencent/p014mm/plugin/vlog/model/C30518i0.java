package com.tencent.p014mm.plugin.vlog.model;

/* renamed from: com.tencent.mm.plugin.vlog.model.i0 */
public final class C30518i0 {

    /* renamed from: a */
    public long f82226a;

    /* renamed from: b */
    public long f82227b;

    public C30518i0(long j, long j2) {
        this.f82226a = j;
        this.f82227b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30518i0)) {
            return false;
        }
        C30518i0 i0Var = (C30518i0) obj;
        return this.f82226a == i0Var.f82226a && this.f82227b == i0Var.f82227b;
    }

    public int hashCode() {
        long j = this.f82226a;
        long j2 = this.f82227b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "PlayRange(start=" + this.f82226a + ", end=" + this.f82227b + ')';
    }
}
