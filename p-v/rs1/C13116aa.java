package rs1;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: rs1.aa */
public final class C13116aa implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C13572z9 f37340d;

    /* renamed from: e */
    public final /* synthetic */ long f37341e;

    public C13116aa(C13572z9 z9Var, long j) {
        this.f37340d = z9Var;
        this.f37341e = j;
    }

    public final void run() {
        Log.m105924i("Finder.SlideMoreGuideUIC", "[delayDismissGuide] delay " + this.f37340d.mo12967g3().f34355f + "s dismiss");
        C13572z9.m12884d3(this.f37340d, this.f37341e, Integer.MAX_VALUE);
    }
}
