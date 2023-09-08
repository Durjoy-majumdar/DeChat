package kf1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderSnsGridFeedUI;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import dp1.C58380k1;
import er1.C7888v2;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60898l;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import nj3.C76912y0;
import rs1.C13442s8;

/* renamed from: kf1.j9 */
public final class C9813j9 extends C9753h {

    /* renamed from: u */
    public final String f30350u = "Finder.FinderSnsPostUIContract.ViewCallback";

    /* renamed from: kf1.j9$a */
    public static final class C9814a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9813j9 f30351d;

        public C9814a(C9813j9 j9Var) {
            this.f30351d = j9Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback$showEmptyView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MMActivity mMActivity = this.f30351d.f30214d;
            FinderSnsGridFeedUI finderSnsGridFeedUI = mMActivity instanceof FinderSnsGridFeedUI ? (FinderSnsGridFeedUI) mMActivity : null;
            if (finderSnsGridFeedUI != null) {
                finderSnsGridFeedUI.mo3110R7(true);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback$showEmptyView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9813j9(MMActivity mMActivity, int i, int i2, boolean z) {
        super(mMActivity, i, i2, z, 0, 16, (C8480h) null);
        C87412m.m108594g(mMActivity, "context");
    }

    /* renamed from: F0 */
    public /* bridge */ /* synthetic */ View mo9289F0() {
        return null;
    }

    /* renamed from: G0 */
    public RecyclerView.C0129l mo9290G0() {
        ((FinderStaggeredConfig) this.f30224q).getClass();
        return new FinderStaggeredConfig.C3631b();
    }

    /* renamed from: H0 */
    public RecyclerView.LayoutManager mo9291H0(Context context) {
        C87412m.m108594g(context, "context");
        return this.f30224q.mo3666d(context);
    }

    /* renamed from: J0 */
    public CharSequence mo9292J0(RefreshLoadMoreLayout.C7080c cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        return "";
    }

    /* renamed from: P0 */
    public void mo9293P0(C60905o oVar, int i) {
        C60905o oVar2 = oVar;
        C87412m.m108594g(oVar2, "holder");
        View D = oVar2.mo85812D(C0966R.C0970id.d78);
        if (D != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(D, "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View D2 = oVar2.mo85812D(C0966R.C0970id.e3v);
        if (D2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(D2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(D2, "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View D3 = oVar2.mo85812D(C0966R.C0970id.a0g);
        if (D3 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            C117292a.m165358d(D3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(D3, "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View D4 = oVar2.mo85812D(C0966R.C0970id.da7);
        if (D4 != null) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(8);
            C117292a.m165358d(D4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(D4, "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.d86);
        if (textView != null && textView.getVisibility() == 8) {
            View D5 = oVar2.mo85812D(C0966R.C0970id.e2z);
            if (D5 != null) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar5.mo10233c(8);
                C117292a.m165358d(D5, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(D5, "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        View D6 = oVar2.mo85812D(C0966R.C0970id.e2z);
        if (D6 != null) {
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
            aVar6.mo10233c(0);
            C117292a.m165358d(D6, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D6.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(D6, "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D6.setBackgroundColor(oVar2.f173499A.getResources().getColor(C0966R.color.f2949a6));
        }
        TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.d86);
        if (textView2 != null) {
            textView2.setTextColor(-1);
        }
    }

    /* renamed from: Q0 */
    public void mo9294Q0(RecyclerView.C16613e<?> eVar, View view, int i) {
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        int c6 = i - ((C60898l) eVar).mo85796c6();
        if (c6 >= 0 && c6 < mo10348I0().f30175e.getSize()) {
            C0740i2 i2Var = (C0740i2) mo10348I0().f30175e.getDataListJustForAdapter().get(c6);
            if (i2Var instanceof BaseFinderFeed) {
                String str = this.f30350u;
                StringBuilder sb = new StringBuilder();
                sb.append("onClick ");
                sb.append(c6);
                sb.append(" id:");
                BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                sb.append(baseFinderFeed.mo3513o().getId());
                sb.append(", pos:");
                sb.append(c6);
                Log.m105924i(str, sb.toString());
                if (baseFinderFeed.mo3513o().isPostFinish()) {
                    C7888v2.C7889a.m8057w(C7888v2.f26513a, this.f30214d, baseFinderFeed, (Bundle) null, 5, 0, 20, (Object) null);
                    MMActivity mMActivity = this.f30214d;
                    FinderSnsGridFeedUI finderSnsGridFeedUI = mMActivity instanceof FinderSnsGridFeedUI ? (FinderSnsGridFeedUI) mMActivity : null;
                    if (finderSnsGridFeedUI != null) {
                        finderSnsGridFeedUI.f14827q = true;
                    }
                    C58380k1 k1Var = C58380k1.f167276a;
                    String str2 = ((C13442s8) C39818r.f106831a.mo62444c(mMActivity).mo75002a(C13442s8.class)).f38099o;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C58380k1.m67708a(k1Var, str2, 3, (String) null, false, false, baseFinderFeed.mo3513o().getId(), 28, (Object) null);
                    return;
                }
                C76912y0.makeText((Context) this.f30214d, (int) C0966R.string.d_b, 0).show();
            }
        }
    }

    /* renamed from: R0 */
    public void mo9295R0() {
    }

    /* renamed from: Z0 */
    public void mo10335Z0() {
        super.mo10335Z0();
        View m0 = mo9299m0();
        View findViewById = m0 != null ? m0.findViewById(C0966R.C0970id.ciz) : null;
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.findViewById(C0966R.C0970id.cim).setOnClickListener(new C9814a(this));
            View findViewById2 = this.f30214d.findViewById(C0966R.C0970id.f5385dq);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view = findViewById2;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderSnsPostUIContract$ViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f30214d;
    }

    /* renamed from: k0 */
    public String mo9298k0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        return "";
    }

    /* renamed from: m0 */
    public View mo9299m0() {
        return this.f30214d.findViewById(C0966R.C0970id.cjg);
    }
}
