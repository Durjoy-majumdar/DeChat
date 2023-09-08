package p1059wd;

import com.tencent.magicbrush.MBRuntime;
import gy3.C87412m;

/* renamed from: wd.i$$a */
public final /* synthetic */ class i$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C90966i f261030d;

    public /* synthetic */ i$$a(C90966i iVar) {
        this.f261030d = iVar;
    }

    public final void run() {
        C90966i iVar = this.f261030d;
        C87412m.m108594g(iVar, "this$0");
        MBRuntime mBRuntime = iVar.f260998d;
        if (mBRuntime.f235052a != 0) {
            mBRuntime.nativeStopAnimationFrameLooper(mBRuntime.f235052a);
        }
    }
}
