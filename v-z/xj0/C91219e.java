package xj0;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: xj0.e */
public class C91219e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91216b0 f261766d;

    /* renamed from: e */
    public final /* synthetic */ C91220f f261767e;

    public C91219e(C91220f fVar, C91216b0 b0Var) {
        this.f261767e = fVar;
        this.f261766d = b0Var;
    }

    public void run() {
        Log.m105924i("MicroMsg.BaseGameRecord.HardwareMgrImp", "hy: stopRecord, stop callback");
        this.f261767e.f261768c.clear();
        this.f261766d.mo123718a(0, 0, "ok", "");
    }
}
