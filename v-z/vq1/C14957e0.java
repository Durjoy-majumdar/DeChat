package vq1;

import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.plugin.finder.feed.model.C2815r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import rx3.C13598b0;
import u60.C65234n;
import vq1.C65869y;

/* renamed from: vq1.e0 */
public final class C14957e0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C14958f0 f41007a;

    /* renamed from: b */
    public final /* synthetic */ C65869y.C65870a f41008b;

    public C14957e0(C14958f0 f0Var, C65869y.C65870a aVar) {
        this.f41007a = f0Var;
        this.f41008b = aVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C65234n nVar = C65234n.Fail;
        Log.m105924i("Finder.WordingLikeAction", "doLikeWording callback " + cVar.f256793a + ' ' + cVar.f256794b + ' ' + cVar.f256795c);
        int i = cVar.f256793a;
        int i2 = 1;
        if (i == 0 && cVar.f256794b == 0) {
            C14958f0 f0Var = this.f41007a;
            boolean z = f0Var.f41010d;
            if (z) {
                C2815r0 r0Var = f0Var.f41009c;
                r0Var.f131804f += (long) (r0Var.f131805g == 1 ? 0 : 1);
            } else {
                C2815r0 r0Var2 = f0Var.f41009c;
                r0Var2.f131804f += (long) (r0Var2.f131805g == 1 ? -1 : 0);
            }
            f0Var.f41009c.f131805g = z ? 1 : 2;
            FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
            FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
            C14958f0 f0Var2 = this.f41007a;
            C2815r0 r0Var3 = f0Var2.f41009c;
            aVar.f9174a = r0Var3.f14070h;
            aVar.f9180g = 1;
            aVar.f9184k = r0Var3.f131802d;
            if (!f0Var2.f41010d) {
                i2 = 2;
            }
            aVar.f9178e = i2;
            aVar.f9175b = 25;
            feedUpdateEvent.publish();
            C14951b0.f40992g.mo14001c(this.f41007a);
            this.f41008b.mo14006a(C65234n.OK, false);
        } else if (i == 4) {
            C14951b0.f40992g.mo14001c(this.f41007a);
            FeedUpdateEvent feedUpdateEvent2 = new FeedUpdateEvent();
            FeedUpdateEvent.C1041a aVar2 = feedUpdateEvent2.f9173d;
            C2815r0 r0Var4 = this.f41007a.f41009c;
            aVar2.f9174a = r0Var4.f14070h;
            aVar2.f9184k = r0Var4.f131802d;
            aVar2.f9175b = 25;
            feedUpdateEvent2.publish();
            this.f41008b.mo14006a(nVar, false);
        } else {
            this.f41008b.mo14006a(nVar, true);
        }
        return C13598b0.f38549a;
    }
}
