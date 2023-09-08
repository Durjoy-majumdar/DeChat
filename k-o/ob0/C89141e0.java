package ob0;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: ob0.e0 */
public class C89141e0 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public long f256842d = 10;

    /* renamed from: e */
    public final /* synthetic */ C89137b0 f256843e;

    public C89141e0(C89137b0 b0Var) {
        this.f256843e = b0Var;
    }

    public boolean onTimerExpired() {
        C89137b0 b0Var = this.f256843e;
        if (b0Var.f256809d == null) {
            long j = this.f256842d;
            this.f256842d = j - 1;
            if (j > 0) {
                return true;
            }
        }
        b0Var.mo123475u();
        return false;
    }
}
