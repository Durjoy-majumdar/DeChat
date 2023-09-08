package ly2;

import com.tencent.tmassistantsdk.downloadservice.Downloads;
import ky2.C10431b;

/* renamed from: ly2.e */
public final class C10674e implements C10431b {

    /* renamed from: d */
    public static final C10674e f32094d = new C10674e();

    /* renamed from: d */
    public boolean mo10734d(long j, long j2) {
        return j2 - j > 3600000;
    }

    /* renamed from: q */
    public boolean mo10735q(long j, long j2) {
        long j3 = (long) Downloads.MAX_RETYR_AFTER;
        return j2 / j3 != j / j3;
    }
}
