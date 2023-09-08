package np1;

import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;

/* renamed from: np1.k */
public final class C61873k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MMSwitchBtn f175937d;

    /* renamed from: e */
    public final /* synthetic */ C61874l f175938e;

    public C61873k(MMSwitchBtn mMSwitchBtn, C61874l lVar) {
        this.f175937d = mMSwitchBtn;
        this.f175938e = lVar;
    }

    public final void run() {
        this.f175937d.setSwitchListener(this.f175938e);
    }
}
