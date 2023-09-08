package com.tencent.p014mm.vfs;

import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import gy3.C87412m;
import java.util.Map;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: com.tencent.mm.vfs.l0 */
public final class C75065l0 extends C75059d {

    /* renamed from: b */
    public final long f220848b;

    /* renamed from: c */
    public final long f220849c;

    /* renamed from: d */
    public final long f220850d;

    public C75065l0(long j, long j2, long j3) {
        super(1);
        this.f220848b = j;
        this.f220849c = j2;
        this.f220850d = j3;
    }

    /* renamed from: b */
    public Map<String, String> mo104655b(String str, String str2) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, SharePatchInfo.OAT_DIR);
        return C90364q0.m113147f(new C13604l("name", str), new C13604l(SharePatchInfo.OAT_DIR, str2), new C13604l("target", String.valueOf(this.f220848b)), new C13604l("threshold", String.valueOf(this.f220849c)), new C13604l("expire", String.valueOf(this.f220850d)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75065l0)) {
            return false;
        }
        C75065l0 l0Var = (C75065l0) obj;
        return this.f220848b == l0Var.f220848b && this.f220849c == l0Var.f220849c && this.f220850d == l0Var.f220850d;
    }

    public int hashCode() {
        long j = this.f220848b;
        long j2 = this.f220849c;
        long j3 = this.f220850d;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "LruExpire(targetSize=" + this.f220848b + ", threshold=" + this.f220849c + ", expireTime=" + this.f220850d + ')';
    }
}
