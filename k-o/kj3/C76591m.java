package kj3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import nj3.C76901s0;

/* renamed from: kj3.m */
public class C76591m implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C76593o f224172d;

    public C76591m(C76593o oVar) {
        this.f224172d = oVar;
    }

    public boolean onTimerExpired() {
        C76593o oVar = this.f224172d;
        oVar.getClass();
        Log.m105918d("MicroMsg.AppBrandServiceImageBubble", "hide");
        C76901s0 s0Var = oVar.f224177g;
        if (s0Var == null) {
            return false;
        }
        s0Var.dismiss();
        return false;
    }
}
