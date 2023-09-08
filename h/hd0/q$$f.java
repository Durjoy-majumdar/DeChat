package hd0;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import p206nj.C76861g;

public class q$$f implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C98415q f288660d;

    public q$$f(C98415q qVar) {
        this.f288660d = qVar;
    }

    public boolean onTimerExpired() {
        C98415q qVar = this.f288660d;
        if (qVar.doScene(qVar.dispatcher(), this.f288660d.f288617d) == -1) {
            this.f288660d.f288622i = 0 - (C76861g.m92658a() + 10000);
            C98415q qVar2 = this.f288660d;
            qVar2.f288617d.onSceneEnd(3, -1, "doScene failed", qVar2);
        }
        return false;
    }
}
