package kd0;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

public class f$$c implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C76539f f224009d;

    public f$$c(C76539f fVar) {
        this.f224009d = fVar;
    }

    public boolean onTimerExpired() {
        C76539f fVar = this.f224009d;
        if (fVar.doScene(fVar.dispatcher(), this.f224009d.f223994d) != -1) {
            return false;
        }
        C76539f fVar2 = this.f224009d;
        fVar2.f223994d.onSceneEnd(3, -1, "doScene failed", fVar2);
        return false;
    }
}
