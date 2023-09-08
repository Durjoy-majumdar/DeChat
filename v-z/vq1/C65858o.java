package vq1;

import android.content.Context;
import com.tencent.p014mm.autogen.events.FollowUserEvent;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import hp3.C87581a;
import nj3.C76912y0;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49712hj1;
import u60.C65234n;
import vq1.C65869y;

/* renamed from: vq1.o */
public final class C65858o<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C65859p f189382a;

    /* renamed from: b */
    public final /* synthetic */ C65869y.C65870a f189383b;

    public C65858o(C65859p pVar, C65869y.C65870a aVar) {
        this.f189382a = pVar;
        this.f189383b = aVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C65234n nVar = C65234n.Fail;
        Log.m105924i("Finder.FollowActionTask", "FollowAction callback " + cVar.f256793a + ' ' + cVar.f256794b + ' ' + cVar.f256795c);
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C65861r.f189395e.mo89900d(this.f189382a);
            FollowUserEvent followUserEvent = new FollowUserEvent();
            C65859p pVar = this.f189382a;
            FollowUserEvent.C55139a aVar = followUserEvent.f154820d;
            aVar.f154821a = pVar.f189384c;
            aVar.f154822b = pVar.f189385d;
            C49712hj1 hj12 = pVar.f189387f;
            aVar.f154824d = hj12 != null ? hj12.f134677n : 0;
            aVar.f154823c = true;
            followUserEvent.publish();
            this.f189383b.mo14006a(C65234n.OK, false);
        } else {
            if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
                Context context = MMApplicationContext.getContext();
                C76912y0.makeText(context, (CharSequence) "is debug info finderfollow: " + cVar.f256793a + ' ' + cVar.f256794b, 1).show();
            }
            if (cVar.f256793a == 4) {
                C65861r.f189395e.mo89900d(this.f189382a);
                FollowUserEvent followUserEvent2 = new FollowUserEvent();
                C65859p pVar2 = this.f189382a;
                FollowUserEvent.C55139a aVar2 = followUserEvent2.f154820d;
                aVar2.f154821a = pVar2.f189384c;
                aVar2.f154822b = pVar2.f189385d;
                C49712hj1 hj13 = pVar2.f189387f;
                aVar2.f154824d = hj13 != null ? hj13.f134677n : 0;
                aVar2.f154823c = false;
                followUserEvent2.publish();
                this.f189383b.mo14006a(nVar, false);
            } else {
                this.f189383b.mo14006a(nVar, true);
            }
        }
        return C13598b0.f38549a;
    }
}
