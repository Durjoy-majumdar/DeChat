package cm1;

import android.content.Context;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dp1.C58417y0;
import fe1.C58969q;
import gy3.C87412m;
import je1.C60811w;
import kj2.C117407d;
import ks3.C10407d;
import o40.C61926c;
import org.json.JSONObject;
import p565ir.C60606n;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C64284cg;
import te3.C64414h71;
import vq1.C65859p;
import vq1.C65861r;
import wc3.C15130a;
import wc3.C15140v;
import wd3.C78545b;
import wd3.C78574s0;
import z04.C112551y;

/* renamed from: cm1.m0 */
public final class C0751m0 {

    /* renamed from: a */
    public static final C0751m0 f1769a = new C0751m0();

    /* renamed from: cm1.m0$a */
    public static final class C0752a implements C78574s0 {

        /* renamed from: a */
        public final /* synthetic */ BaseFinderFeed f1770a;

        public C0752a(BaseFinderFeed baseFinderFeed) {
            this.f1770a = baseFinderFeed;
        }

        /* renamed from: a */
        public final void mo708a(int i) {
            Log.m105924i("Finder.FinderFollowLogic", "follow biz result = " + i);
            FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
            feedUpdateEvent.f9173d.f9174a = this.f1770a.getItemId();
            feedUpdateEvent.f9173d.f9175b = i == -1 ? 1 : 22;
            feedUpdateEvent.publish();
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m691b(C0751m0 m0Var, Context context, C49712hj1 hj12, BaseFinderFeed baseFinderFeed, int i, boolean z, int i2, int i3, Object obj) {
        m0Var.mo706a(context, hj12, baseFinderFeed, i, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? 0 : i2);
    }

    /* renamed from: c */
    public static void m692c(C0751m0 m0Var, C49712hj1 hj12, String str, int i, long j, boolean z, int i2, C64414h71 h712, Integer num, int i3, Object obj) {
        C49712hj1 hj13 = hj12;
        String str2 = str;
        int i4 = i;
        int i5 = i3;
        boolean z2 = (i5 & 16) != 0 ? false : z;
        int i6 = (i5 & 32) != 0 ? 0 : i2;
        C64414h71 h713 = (i5 & 64) != 0 ? null : h712;
        Integer num2 = (i5 & 128) != 0 ? 0 : num;
        m0Var.getClass();
        C87412m.m108594g(hj13, "contextObj");
        C87412m.m108594g(str2, "finderUser");
        Log.m105924i("Finder.FinderFollowLogic", "follow event commentScene:" + hj13.f134677n + " user:" + str2 + " opType: " + i4 + " form " + Util.getStack());
        int i7 = 2;
        C117407d.INSTANCE.idkeyStat(1278, i4 == 2 ? 5 : 4, 1, false);
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        long j2 = hj13.f134676j;
        if (i4 == 2) {
            i7 = 1;
        }
        y0Var.Rx0(hj12, j2, str, i7);
        new C60811w(new C65859p(str, i, j, hj12, false, i6, "", h713, num2), z2).mo9225i();
    }

    /* renamed from: a */
    public final void mo706a(Context context, C49712hj1 hj12, BaseFinderFeed baseFinderFeed, int i, boolean z, int i2) {
        C13598b0 b0Var;
        C49712hj1 hj13 = hj12;
        BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
        Class cls = C58417y0.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(hj13, "contextObj");
        C87412m.m108594g(baseFinderFeed2, "feed");
        C64284cg bizInfo = baseFinderFeed.mo3513o().getBizInfo();
        if (bizInfo != null) {
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
            long j = hj13.f134676j;
            C58969q l = baseFinderFeed.mo3507l();
            boolean z2 = true;
            y0Var.Rx0(hj12, j, l != null ? l.getUsername() : "", i == 2 ? 1 : 2);
            C15130a aVar = new C15130a();
            aVar.f41261f = false;
            String str = baseFinderFeed.mo3513o().getFeedObject().sessionBuffer;
            if (!(str == null || str.length() == 0)) {
                z2 = false;
            }
            aVar.f41258c = z2 ? ((C58417y0) C86312j.m106911c(cls)).mo83281Cu(baseFinderFeed.mo3513o().getId(), hj13.f134675i) : baseFinderFeed.mo3513o().getFeedObject().sessionBuffer;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("commentscene", hj13.f134675i);
            jSONObject.put("clicktabcontextid", hj13.f134672f);
            jSONObject.put("findercontextid", hj13.f134671e);
            jSONObject.put("feedid", C61926c.m72691p(baseFinderFeed.getItemId()));
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
            aVar.f41259d = C112551y.m153814n(jSONObject2, ",", ";", false);
            aVar.f41262g = false;
            ((C78545b) ((C15140v) C86312j.m106911c(C15140v.class)).mo14099ne(context, bizInfo.f182468d, 212, true, new C0752a(baseFinderFeed2), aVar)).mo108519f();
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C58969q l2 = baseFinderFeed.mo3507l();
            m692c(this, hj12, l2 != null ? l2.getUsername() : "", i, baseFinderFeed.getItemId(), z, i2, (C64414h71) null, (Integer) null, 192, (Object) null);
        }
    }

    /* renamed from: d */
    public final void mo707d(C49712hj1 hj12, String str, int i, long j, boolean z, String str2, C64414h71 h712, Integer num, int i2) {
        C49712hj1 hj13 = hj12;
        String str3 = str;
        int i3 = i;
        String str4 = str2;
        C87412m.m108594g(hj13, "contextObj");
        C87412m.m108594g(str3, "finderUser");
        C87412m.m108594g(str4, "participantFinderUsername");
        Log.m105924i("Finder.FinderFollowLogic", "follow event commentScene:" + hj13.f134677n + " user:" + str3 + " opType: " + i3 + " participantFinderUsername:" + str4 + " form " + Util.getStack() + " enterType:" + i2);
        C117407d.INSTANCE.idkeyStat(1278, i3 == 2 ? 5 : 4, 1, false);
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Rx0(hj12, hj13.f134676j, str, i3 == 2 ? 1 : 2);
        C65861r rVar = C65861r.f189395e;
        C65861r.f189395e.mo89898a(str, i, j, hj12, z, i2, str2, h712, num);
        if (i3 == 2) {
            ((C60606n) C86312j.m106911c(C60606n.class)).mo85097vi(str3, C10407d.UnFollowAnchor);
        }
    }
}
