package mf1;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import o40.C61926c;
import org.json.JSONObject;
import pf1.C11916o;
import pf1.C11918p;
import pf1.C11920q;
import rf1.C12982a;
import rf1.C12992d;
import rs1.C13383r;
import rs1.C13442s8;
import rs1.C13448t;
import rx3.C13598b0;

/* renamed from: mf1.u0 */
public final class C10871u0 extends C87413o implements C32226l<C12982a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60905o f32459d;

    /* renamed from: e */
    public final /* synthetic */ C10846o0 f32460e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10871u0(C60905o oVar, C10846o0 o0Var) {
        super(1);
        this.f32459d = oVar;
        this.f32460e = o0Var;
    }

    public Object invoke(Object obj) {
        String str;
        BaseFinderFeed baseFinderFeed;
        C12982a aVar = (C12982a) obj;
        C87412m.m108594g(aVar, "observer");
        C60905o oVar = this.f32459d;
        Object obj2 = oVar.f173503E;
        C11916o oVar2 = null;
        BaseFinderFeed baseFinderFeed2 = obj2 instanceof BaseFinderFeed ? (BaseFinderFeed) obj2 : null;
        long j = 0;
        if (baseFinderFeed2 != null && C58784w3.f168295a.mo83872H0(baseFinderFeed2.mo3513o().getFeedObject())) {
            Log.m105924i("Finder.BaseAdFeedJumperUIC", "onJumpViewFocus feedId=" + baseFinderFeed2.getItemId());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("hasObserver", String.valueOf(true));
            C11920q qVar = aVar.f37015d;
            C11918p pVar = qVar != null ? qVar.f34832f : null;
            if (pVar instanceof C11916o) {
                oVar2 = (C11916o) pVar;
            }
            long j2 = oVar2 != null ? oVar2.f34786i : 0;
            long itemId = (qVar == null || (baseFinderFeed = qVar.f34830d) == null) ? 0 : baseFinderFeed.getItemId();
            C39818r rVar = C39818r.f106831a;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            C13448t tVar = (C13448t) rVar.mo62443b(context).mo62449e(C13448t.class);
            if (tVar != null) {
                str = "holder.context";
                tVar.mo12876c3(itemId, "onJumpViewFocus", jSONObject, j2);
            } else {
                str = "holder.context";
            }
            C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
            Context context2 = oVar.f173499A;
            C87412m.m108593f(context2, str);
            C13442s8 f = aVar2.mo12873f(context2);
            int i = f != null ? f.mo12861q3().f134675i : 0;
            C13383r a = C13383r.f37907d.mo12791a();
            FinderObject feedObject = baseFinderFeed2.mo3513o().getFeedObject();
            a.getClass();
            C87412m.m108594g(feedObject, "feed");
            if (C13383r.f37908e.contains(Integer.valueOf(i))) {
                C13383r.C13386c cVar = a.f37910a.get(new C13383r.C13387d(feedObject.f164794id, i));
                if (cVar == null || cVar.f37919f < 2) {
                    Log.m105924i("Finder.AdTraceMgr", "onFeedFocused return! focus without consume and dispatch, commentScene=" + i + " feedId=" + C61926c.m72691p(feedObject.f164794id));
                } else {
                    cVar.f37919f = 3;
                    cVar.f37922i = System.currentTimeMillis();
                    Log.m105924i("Finder.AdTraceMgr", "onFeedFocused dispatchFeed=" + cVar + " [focus-consume]=" + (cVar.f37922i - cVar.f37921h) + LocaleUtil.MALAY);
                }
            }
        }
        C11920q qVar2 = aVar.f37015d;
        View view = aVar.f37012a;
        C60905o oVar3 = this.f32459d;
        C10846o0 o0Var = this.f32460e;
        if (!(qVar2 == null || view == null)) {
            oVar3.f44854d.setTag(C0966R.C0970id.ntt, Boolean.TRUE);
            StringBuilder sb = new StringBuilder();
            sb.append("onJumpViewFocus feedId=");
            BaseFinderFeed baseFinderFeed3 = qVar2.f34830d;
            sb.append(C61926c.m72691p(baseFinderFeed3 != null ? baseFinderFeed3.getItemId() : 0));
            sb.append(" isAppearUntilPlay=");
            sb.append(qVar2.f34847u);
            sb.append(" isRealShow=");
            C10817f1 f1Var = qVar2.f34823A;
            sb.append(f1Var != null && f1Var.f32317a);
            sb.append(" delayAppearMs=");
            sb.append(qVar2.f34843q);
            Log.m105924i("Finder.BaseAdFeedJumperUIC", sb.toString());
            if (!qVar2.f34847u) {
                C10817f1 f1Var2 = qVar2.f34823A;
                if (!(f1Var2 != null && f1Var2.f32317a)) {
                    int i2 = qVar2.f34843q;
                    if (i2 > 0) {
                        long uptimeMillis = SystemClock.uptimeMillis() + ((long) i2);
                        o0Var.f32391e.removeCallbacksAndMessages(qVar2.f34829c);
                        o0Var.f32391e.postAtTime(new C10868t0(qVar2, aVar, oVar3, view), qVar2.f34829c, uptimeMillis);
                        qVar2.f34846t = true;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("onJumpViewFocus feedId=");
                        BaseFinderFeed baseFinderFeed4 = qVar2.f34830d;
                        if (baseFinderFeed4 != null) {
                            j = baseFinderFeed4.getItemId();
                        }
                        sb4.append(C61926c.m72691p(j));
                        sb4.append(" not need delay, just show");
                        Log.m105924i("Finder.BaseAdFeedJumperUIC", sb4.toString());
                        C12992d.C12993a.m12459b(aVar, oVar3, view, qVar2, false, (C32224a) null, 16, (Object) null);
                    }
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("onJumpViewFocus feedId=");
                    BaseFinderFeed baseFinderFeed5 = qVar2.f34830d;
                    if (baseFinderFeed5 != null) {
                        j = baseFinderFeed5.getItemId();
                    }
                    sb5.append(C61926c.m72691p(j));
                    sb5.append(" not need delay, just show");
                    Log.m105924i("Finder.BaseAdFeedJumperUIC", sb5.toString());
                    C12992d.C12993a.m12459b(aVar, oVar3, view, qVar2, false, (C32224a) null, 16, (Object) null);
                }
            } else {
                C10817f1 f1Var3 = qVar2.f34823A;
                if (f1Var3 != null && f1Var3.f32317a) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("onJumpViewFocus feedId=");
                    BaseFinderFeed baseFinderFeed6 = qVar2.f34830d;
                    if (baseFinderFeed6 != null) {
                        j = baseFinderFeed6.getItemId();
                    }
                    sb6.append(C61926c.m72691p(j));
                    sb6.append(" not need delay, just show");
                    Log.m105924i("Finder.BaseAdFeedJumperUIC", sb6.toString());
                    C12992d.C12993a.m12459b(aVar, oVar3, view, qVar2, false, (C32224a) null, 16, (Object) null);
                }
            }
            aVar.mo11100m(oVar3, view, qVar2);
        }
        return C13598b0.f38549a;
    }
}
