package ve1;

import android.content.Context;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.autogen.events.FinderFeedUiActionEvent;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import dp1.C7435f2;
import fe1.C58961d;
import fy3.C32224a;
import gy3.C87412m;
import iq1.C60592c;
import iq1.C60593d;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import kf1.C10008v1;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C64284cg;

/* renamed from: ve1.o3 */
public final class C14585o3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f40403d;

    /* renamed from: e */
    public final /* synthetic */ BaseFinderFeed f40404e;

    /* renamed from: f */
    public final /* synthetic */ C14567m3 f40405f;

    /* renamed from: g */
    public final /* synthetic */ int f40406g;

    /* renamed from: h */
    public final /* synthetic */ C10008v1 f40407h;

    public C14585o3(C60905o oVar, BaseFinderFeed baseFinderFeed, C14567m3 m3Var, int i, C10008v1 v1Var) {
        this.f40403d = oVar;
        this.f40404e = baseFinderFeed;
        this.f40405f = m3Var;
        this.f40406g = i;
        this.f40407h = v1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedSnsAdUIC$refreshAdFollow$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7435f2 f2Var = C7435f2.f25626a;
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context = this.f40403d.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13442s8 f = aVar.mo12873f(context);
        String str = null;
        C7435f2.m7551e(f2Var, f != null ? f.mo12861q3() : null, "follow", false, this.f40404e.getItemId(), (JSONObject) null, (String) null, 48, (Object) null);
        C14567m3.m13874f3(this.f40405f, 3, this.f40404e.mo3513o().getId(), this.f40406g, this.f40403d, 0, 0, 48, (Object) null);
        C58961d.C58963b bVar = C58961d.f168673a;
        String str2 = this.f40404e.mo3513o().field_username;
        C64284cg bizInfo = this.f40404e.mo3513o().getBizInfo();
        if (bizInfo != null) {
            str = bizInfo.f182468d;
        }
        if (!C58961d.C58963b.m68836h(bVar, str2, str, false, false, 12, (Object) null)) {
            this.f40407h.mo2572J0(this.f40404e, true, 0);
            this.f40405f.mo13814e3(this.f40403d, 0, this.f40404e, 2, this.f40407h, (C32224a<C13598b0>) null);
            FinderFeedUiActionEvent finderFeedUiActionEvent = new FinderFeedUiActionEvent();
            C60905o oVar = this.f40403d;
            FinderFeedUiActionEvent.C1047a aVar2 = finderFeedUiActionEvent.f9202d;
            aVar2.f9205c = 10000;
            aVar2.f9203a = ((BaseFinderFeed) oVar.f173503E).getItemId();
            finderFeedUiActionEvent.publish();
        }
        if (this.f40403d.mo17363j() == 0) {
            C39818r rVar = C39818r.f106831a;
            Context context2 = this.f40403d.f173499A;
            C87412m.m108593f(context2, "holder.context");
            C60592c cVar = ((C60593d) rVar.mo62443b(context2).mo75002a(C60593d.class)).f172693f;
            if (cVar != null) {
                cVar.mo85549a();
                cVar.mo85550b("follow");
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedSnsAdUIC$refreshAdFollow$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
