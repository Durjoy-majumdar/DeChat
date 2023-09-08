package vq1;

import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.plugin.finder.feed.model.C2815r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import rx3.C13598b0;
import u60.C65234n;
import vq1.C65869y;

/* renamed from: vq1.g0 */
public final class C14959g0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C14960h0 f41012a;

    /* renamed from: b */
    public final /* synthetic */ C65869y.C65870a f41013b;

    public C14959g0(C14960h0 h0Var, C65869y.C65870a aVar) {
        this.f41012a = h0Var;
        this.f41013b = aVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C65234n nVar = C65234n.Fail;
        Log.m105924i("Finder.WordingOpAction", "doOpWording callback op = " + this.f41012a.f41015d + ' ' + cVar.f256793a + ' ' + cVar.f256794b + ' ' + cVar.f256795c);
        int i = cVar.f256793a;
        if (i == 0 && cVar.f256794b == 0) {
            C14951b0.f40992g.mo14000b(this.f41012a);
            this.f41013b.mo14006a(C65234n.OK, false);
            FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
            FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
            C2815r0 r0Var = this.f41012a.f41014c;
            aVar.f9174a = r0Var.f14070h;
            aVar.f9184k = r0Var.f131802d;
            aVar.f9175b = 26;
            return Boolean.valueOf(feedUpdateEvent.publish());
        }
        if (i == 4) {
            C14951b0.f40992g.mo14000b(this.f41012a);
            FeedUpdateEvent feedUpdateEvent2 = new FeedUpdateEvent();
            FeedUpdateEvent.C1041a aVar2 = feedUpdateEvent2.f9173d;
            C2815r0 r0Var2 = this.f41012a.f41014c;
            aVar2.f9174a = r0Var2.f14070h;
            aVar2.f9184k = r0Var2.f131802d;
            aVar2.f9175b = 26;
            feedUpdateEvent2.publish();
            this.f41013b.mo14006a(nVar, false);
        } else {
            this.f41013b.mo14006a(nVar, true);
        }
        return C13598b0.f38549a;
    }
}
