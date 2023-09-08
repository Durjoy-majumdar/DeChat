package cb3;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: cb3.m */
public class C92403m implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C92400k f264454d;

    public C92403m(C92400k kVar) {
        this.f264454d = kVar;
    }

    public boolean onTimerExpired() {
        if (this.f264454d.mo126386m() == 1 && this.f264454d.mo126388o(2)) {
            this.f264454d.mo126389p();
        }
        return true;
    }
}
