package cd2;

import com.tencent.p014mm.autogen.events.SendMsgSuccessEvent;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;

/* renamed from: cd2.e */
public class C67356e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SendMsgSuccessEvent f193215d;

    /* renamed from: e */
    public final /* synthetic */ C28535f f193216e;

    public C67356e(C28535f fVar, SendMsgSuccessEvent sendMsgSuccessEvent) {
        this.f193216e = fVar;
        this.f193215d = sendMsgSuccessEvent;
    }

    public void run() {
        C72963f4 f4Var = this.f193215d.f193930d.f193931a;
        String t = f4Var.mo108768t();
        if ((!C72996z1.m85798E5(t) && !C72996z1.m85848s5(t)) || C72996z1.m85811N4(t)) {
            this.f193216e.mo175851q(f4Var);
        }
    }
}
