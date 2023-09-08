package ve1;

import android.content.Context;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.feed.model.C2778b;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import iq1.C60592c;
import iq1.C60593d;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import jr2.C9510k;

/* renamed from: ve1.n3 */
public final class C14578n3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f40391d;

    /* renamed from: e */
    public final /* synthetic */ C2778b f40392e;

    /* renamed from: f */
    public final /* synthetic */ C14567m3 f40393f;

    /* renamed from: g */
    public final /* synthetic */ BaseFinderFeed f40394g;

    /* renamed from: h */
    public final /* synthetic */ int f40395h;

    public C14578n3(C60905o oVar, C2778b bVar, C14567m3 m3Var, BaseFinderFeed baseFinderFeed, int i) {
        this.f40391d = oVar;
        this.f40392e = bVar;
        this.f40393f = m3Var;
        this.f40394g = baseFinderFeed;
        this.f40395h = i;
    }

    public final void onClick(View view) {
        Class cls = C9510k.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedSnsAdUIC$refreshAdDetail$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("FinderFeedSnsAdUIC", "refreshAdDetail onClick");
        if (this.f40391d.mo17363j() == 0) {
            C39818r rVar = C39818r.f106831a;
            Context context = this.f40391d.f173499A;
            C87412m.m108593f(context, "holder.context");
            C60592c cVar = ((C60593d) rVar.mo62443b(context).mo75002a(C60593d.class)).f172693f;
            if (cVar != null) {
                cVar.mo85549a();
                cVar.mo85550b("big_btn_click");
            }
        }
        C2778b bVar = this.f40392e;
        if (bVar != null) {
            C14567m3 m3Var = this.f40393f;
            BaseFinderFeed baseFinderFeed = this.f40394g;
            C14567m3.m13874f3(m3Var, 2, baseFinderFeed.mo3513o().getId(), this.f40395h, this.f40391d, 0, 0, 48, (Object) null);
            ((C9510k) C86312j.m106911c(cls)).mo10204lW(bVar.f13958g, ((C9510k) C86312j.m106911c(cls)).mo10203I9(bVar.f13960i), "", 30);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedSnsAdUIC$refreshAdDetail$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
