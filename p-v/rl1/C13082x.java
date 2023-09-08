package rl1;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0718c1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.lottery.history.FinderLotteryListContract$Presenter;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import up1.C27696y;

/* renamed from: rl1.x */
public final class C13082x extends C60896i<C0718c1> {

    /* renamed from: e */
    public final FinderLotteryListContract$Presenter f37245e;

    /* renamed from: f */
    public int f37246f;

    /* renamed from: rl1.x$a */
    public static final class C13083a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f37247d;

        public C13083a(View view) {
            this.f37247d = view;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f37247d.getHitRect(rect);
            int i = -MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);
            rect.inset(i, i);
            ViewParent parent = this.f37247d.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            ((View) parent).setTouchDelegate(new TouchDelegate(rect, this.f37247d));
        }
    }

    public C13082x(FinderLotteryListContract$Presenter finderLotteryListContract$Presenter) {
        C87412m.m108594g(finderLotteryListContract$Presenter, "presenter");
        this.f37245e = finderLotteryListContract$Presenter;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.ahy;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C60905o oVar2 = oVar;
        C0718c1 c1Var = (C0718c1) cVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(c1Var, "item");
        oVar2.f173503E = c1Var;
        C39818r rVar = C39818r.f106831a;
        C60979d<C100810g0> K1 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11865K1();
        C62345f fVar = new C62345f(c1Var.f1725d.f143826f, (C27696y) null, 2, (C8480h) null);
        View D = oVar2.mo85812D(C0966R.C0970id.f358645g82);
        C87412m.m108593f(D, "holder.getView<ImageView…id.lottery_winner_avatar)");
        K1.mo85957c(fVar, (ImageView) D, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
        ((TextView) oVar2.mo85812D(C0966R.C0970id.f358647g83)).setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(oVar2.f173499A, c1Var.f1725d.f143825e));
        String str = c1Var.f1725d.f143830j;
        int i3 = 8;
        if (str == null || str.length() == 0) {
            ((TextView) oVar2.mo85812D(C0966R.C0970id.f358646nb3)).setVisibility(8);
        } else {
            ((TextView) oVar2.mo85812D(C0966R.C0970id.f358646nb3)).setText(c1Var.f1725d.f143830j);
            ((TextView) oVar2.mo85812D(C0966R.C0970id.f358646nb3)).setVisibility(0);
        }
        View D2 = oVar2.mo85812D(C0966R.C0970id.jb6);
        FinderLotteryListContract$Presenter finderLotteryListContract$Presenter = this.f37245e;
        if (finderLotteryListContract$Presenter.f15480h && !finderLotteryListContract$Presenter.f15481i) {
            i3 = 0;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i3));
        View view = D2;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLotteryWinnerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLotteryWinnerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D2.setOnClickListener(new C13081w(c1Var, oVar2, this));
        if (D2.getVisibility() == 0 && this.f37246f == 0) {
            TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.e65);
            this.f37246f = Math.max(oVar2.f173499A.getResources().getDimensionPixelOffset(C0966R.dimen.f3749d0), ((int) textView.getPaint().measureText(textView.getText().toString())) + oVar2.f173499A.getResources().getDimensionPixelOffset(C0966R.dimen.f3743cv));
        }
        ((TextView) oVar2.mo85812D(C0966R.C0970id.f358647g83)).setPadding(0, 0, this.f37246f, 0);
        ((TextView) oVar2.mo85812D(C0966R.C0970id.f358646nb3)).setPadding(0, 0, this.f37246f, 0);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        C85875k4.m106189j0(((TextView) oVar.mo85812D(C0966R.C0970id.e65)).getPaint(), 0.8f);
        View D = oVar.mo85812D(C0966R.C0970id.jb6);
        D.post(new C13083a(D));
    }
}
