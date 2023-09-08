package com.tencent.p014mm.vfs;

import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import gy3.C87412m;
import java.util.Map;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: com.tencent.mm.vfs.k0 */
public final class C75064k0 extends C75059d {

    /* renamed from: b */
    public final long f220845b;

    /* renamed from: c */
    public final long f220846c;

    /* renamed from: d */
    public final long f220847d;

    public C75064k0(long j, long j2, long j3) {
        super(3);
        this.f220845b = j;
        this.f220846c = j2;
        this.f220847d = j3;
    }

    /* renamed from: b */
    public Map<String, String> mo104655b(String str, String str2) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, SharePatchInfo.OAT_DIR);
        return C90364q0.m113147f(new C13604l("name", str), new C13604l(SharePatchInfo.OAT_DIR, str2), new C13604l("target", String.valueOf(this.f220845b)), new C13604l("threshold", String.valueOf(this.f220846c)), new C13604l("expire", String.valueOf(this.f220847d)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75064k0)) {
            return false;
        }
        C75064k0 k0Var = (C75064k0) obj;
        return this.f220845b == k0Var.f220845b && this.f220846c == k0Var.f220846c && this.f220847d == k0Var.f220847d;
    }

    public int hashCode() {
        long j = this.f220845b;
        long j2 = this.f220846c;
        long j3 = this.f220847d;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "Lru(targetSize=" + this.f220845b + ", threshold=" + this.f220846c + ", expireTime=" + this.f220847d + ')';
    }
}
