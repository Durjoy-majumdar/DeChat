package v21;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: v21.k */
public class C102135k implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C102132i f300784d;

    public C102135k(C102132i iVar) {
        this.f300784d = iVar;
    }

    public boolean onTimerExpired() {
        if (this.f300784d.mo141664m() == 1 && this.f300784d.mo141666o(2)) {
            this.f300784d.mo141667p();
        }
        return true;
    }
}
