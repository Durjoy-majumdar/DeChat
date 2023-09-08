package com.tencent.p014mm.vfs;

import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import gy3.C87412m;
import java.util.Map;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: com.tencent.mm.vfs.z */
public final class C75070z extends C75059d {

    /* renamed from: b */
    public final long f220854b;

    public C75070z(long j) {
        super(2);
        this.f220854b = j;
    }

    /* renamed from: b */
    public Map<String, String> mo104655b(String str, String str2) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, SharePatchInfo.OAT_DIR);
        return C90364q0.m113147f(new C13604l("name", str), new C13604l(SharePatchInfo.OAT_DIR, str2), new C13604l("expire", String.valueOf(this.f220854b)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C75070z) && this.f220854b == ((C75070z) obj).f220854b;
    }

    public int hashCode() {
        long j = this.f220854b;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "Expire(expireTime=" + this.f220854b + ')';
    }
}
