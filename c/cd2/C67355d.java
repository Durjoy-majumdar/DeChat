package cd2;

import com.tencent.p014mm.autogen.events.SendMsgFailEvent;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;

/* renamed from: cd2.d */
public class C67355d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SendMsgFailEvent f193213d;

    /* renamed from: e */
    public final /* synthetic */ C28535f f193214e;

    public C67355d(C28535f fVar, SendMsgFailEvent sendMsgFailEvent) {
        this.f193214e = fVar;
        this.f193213d = sendMsgFailEvent;
    }

    public void run() {
        C72963f4 f4Var = this.f193213d.f193928d.f193929a;
        String t = f4Var.mo108768t();
        if ((!C72996z1.m85798E5(t) && !C72996z1.m85848s5(t)) || C72996z1.m85811N4(t)) {
            this.f193214e.mo175850p(f4Var);
        }
    }
}
