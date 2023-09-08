package cj1;

import android.content.Context;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p565ir.C60606n;
import te3.C49712hj1;
import te3.C64273c21;

/* renamed from: cj1.u1 */
public final class C28592u1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f78477d;

    /* renamed from: e */
    public final /* synthetic */ Context f78478e;

    /* renamed from: f */
    public final /* synthetic */ FinderObject f78479f;

    /* renamed from: g */
    public final /* synthetic */ C49712hj1 f78480g;

    public C28592u1(int i, Context context, FinderObject finderObject, C49712hj1 hj12) {
        this.f78477d = i;
        this.f78478e = context;
        this.f78479f = finderObject;
        this.f78480g = hj12;
    }

    public final void run() {
        Class cls = C60606n.class;
        if (((C60606n) C86312j.m106911c(cls)).mo85017L5() || ((C60606n) C86312j.m106911c(cls)).mo85002F()) {
            Log.m105924i("Finder.FinderLiveFeedFlowReporter", "startPlayLiveOnFeedFlow: isVisitorLiving or isAnchorLiving, next loop");
            C54813s1.f153667d.startTimer(((long) this.f78477d) * 1000, 0);
            return;
        }
        C54813s1 s1Var = C54813s1.f153664a;
        Context context = this.f78478e;
        FinderObject finderObject = this.f78479f;
        C49712hj1 hj12 = this.f78480g;
        s1Var.getClass();
        C64273c21 c212 = finderObject.liveInfo;
        if (c212 != null) {
            Log.m105924i("Finder.FinderLiveFeedFlowReporter", "[reportJoinLiveOnFeedFlow]， liveid = " + c212.f182392d);
            s1Var.mo75773c(context, finderObject, hj12);
        }
    }
}
