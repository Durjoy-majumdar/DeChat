package hd0;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

public class z0$$b implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C98447z0 f288769d;

    public z0$$b(C98447z0 z0Var) {
        this.f288769d = z0Var;
    }

    public boolean onTimerExpired() {
        C98447z0.m127870a(this.f288769d);
        return false;
    }

    public String toString() {
        return super.toString() + "|scenePusher";
    }
}
