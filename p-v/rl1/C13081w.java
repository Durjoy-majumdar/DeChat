package rl1;

import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import android.view.View;
import cm1.C0718c1;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLiveLotteryListLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import di3.C86312j;
import dp1.C58363h;
import gy3.C87412m;
import ht1.C60172g4;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import nj3.C76912y0;
import te3.C51773w21;
import tf0.C13883o1;
import tf0.C64916p1;
import up1.C37521f;
import zc1.C66785b;

/* renamed from: rl1.w */
public final class C13081w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C0718c1 f37242d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f37243e;

    /* renamed from: f */
    public final /* synthetic */ C13082x f37244f;

    public C13081w(C0718c1 c1Var, C60905o oVar, C13082x xVar) {
        this.f37242d = c1Var;
        this.f37243e = oVar;
        this.f37244f = xVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C37521f.f99374d.getClass();
        if (C37521f.f99376d2.mo60266n().intValue() <= 0) {
            C76912y0.makeText(view.getContext(), (CharSequence) view.getContext().getResources().getString(C0966R.string.d2x), 0).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        String str = this.f37242d.f1725d.f143824d;
        C58363h hVar = C58363h.f167137a;
        C58363h.C58364b bVar = C58363h.f167143g;
        String O5 = C66785b.f191882e.mo90662O5();
        if (str == null) {
            str = "";
        }
        bVar.mo83123c(O5, str, "");
        C13883o1 o1Var = (C13883o1) C86312j.m106911c(C13883o1.class);
        Context context = this.f37243e.f173499A;
        C87412m.m108593f(context, "holder.context");
        C51773w21 w212 = this.f37242d.f1725d;
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f37244f.f37245e.f15880d;
        C87412m.m108592e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader");
        String str2 = ((FinderLiveLotteryListLoader) baseFeedLoader).f13739d;
        BaseFeedLoader<C0740i2> baseFeedLoader2 = this.f37244f.f37245e.f15880d;
        C87412m.m108592e(baseFeedLoader2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader");
        long j = ((FinderLiveLotteryListLoader) baseFeedLoader2).f13741f;
        Context context2 = this.f37243e.f173499A;
        C87412m.m108593f(context2, "holder.context");
        C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(context2);
        o1Var.mo13254H9(context, 1, w212, str2, j, gr02 != null ? gr02.mo12861q3() : null, true);
        ((C54108o) C86312j.m106911c(C54108o.class)).Mx0(C54067f0.C0051c.CLICK_WINNER_AVATAR_ENTER_PRIVATE_MSG_UI, "");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
