package com.tencent.p014mm.plugin.finder.feed;

import android.text.SpannableString;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import cm1.C55034v;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import ve1.C14510f0;
import ve1.C14590p;
import ve1.C14680x;
import ve1.C65592g0;
import ve1.C65638r;
import wp1.C15585f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$getAdapter$adapter$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$getAdapter$adapter$1 */
public final class FinderCommentDrawerPresenter$getAdapter$adapter$1 implements C9500j {
    public final /* synthetic */ FinderCommentDrawerPresenter this$0;

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$getAdapter$adapter$1$a */
    public static final class C2500a extends C14680x {
        public C2500a(FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
            super(finderCommentDrawerPresenter, true);
        }

        /* renamed from: l */
        public SpannableString mo2481l(C55034v vVar) {
            C87412m.m108594g(vVar, "item");
            return vVar.f154508w.createDescSpanWithoutClick();
        }

        /* renamed from: n */
        public void mo44e(C60905o oVar, C55034v vVar, int i, int i2, boolean z, List<Object> list) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(vVar, "item");
            super.mo44e(oVar, vVar, i, i2, z, list);
            TextView textView = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.hft);
            View D = oVar.mo85812D(C0966R.C0970id.a27);
            FinderCollapsibleTextView finderCollapsibleTextView = (FinderCollapsibleTextView) oVar.mo85812D(C0966R.C0970id.ki5);
            textView.setClickable(false);
            textView.setEnabled(false);
            D.setClickable(false);
            D.setEnabled(false);
            finderCollapsibleTextView.getContentTextView().setClickable(false);
            finderCollapsibleTextView.getContentTextView().setEnabled(false);
            ((LinearLayout) oVar.f44854d.findViewById(C0966R.C0970id.bjp)).setBackgroundColor(oVar.f173499A.getResources().getColor(C0966R.color.f2932f));
            textView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.BW_0_Alpha_0_5));
        }

        /* renamed from: o */
        public void mo2483o(C60905o oVar, C55034v vVar) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(vVar, "item");
            View D = oVar.mo85812D(C0966R.C0970id.f5487gh);
            if (D != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = D;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$getAdapter$adapter$1$getItemConvert$1", "refreshActivity", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$getAdapter$adapter$1$getItemConvert$1", "refreshActivity", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        /* renamed from: q */
        public void mo2484q(C60905o oVar, C55034v vVar) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(vVar, "item");
            View D = oVar.mo85812D(C0966R.C0970id.fow);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$getAdapter$adapter$1$getItemConvert$1", "refreshLink", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(D, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$getAdapter$adapter$1$getItemConvert$1", "refreshLink", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        /* renamed from: r */
        public void mo2485r(C60905o oVar, C55034v vVar) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(vVar, "item");
            View D = oVar.mo85812D(C0966R.C0970id.hzg);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$getAdapter$adapter$1$getItemConvert$1", "refreshPoi", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(D, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$getAdapter$adapter$1$getItemConvert$1", "refreshPoi", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public FinderCommentDrawerPresenter$getAdapter$adapter$1(FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
        this.this$0 = finderCommentDrawerPresenter;
    }

    public C60896i<?> getItemConvert(int i) {
        FinderCommentDrawerPresenter finderCommentDrawerPresenter = this.this$0;
        if (finderCommentDrawerPresenter.f158629u) {
            if (i == 3) {
                return new C14680x(finderCommentDrawerPresenter, false, 2, (C8480h) null);
            }
            C15585f.C15586a aVar = C15585f.f42211a;
            FinderItem finderItem = finderCommentDrawerPresenter.f158620i;
            if (finderItem != null) {
                return new C65638r(finderCommentDrawerPresenter, true, aVar.mo14348k(finderItem));
            }
            C87412m.m108603p("feedObj");
            throw null;
        } else if (i == 1) {
            C15585f.C15586a aVar2 = C15585f.f42211a;
            FinderItem finderItem2 = finderCommentDrawerPresenter.f158620i;
            if (finderItem2 != null) {
                return new C65638r(finderCommentDrawerPresenter, false, aVar2.mo14348k(finderItem2));
            }
            C87412m.m108603p("feedObj");
            throw null;
        } else if (i == 2) {
            return new C65592g0(finderCommentDrawerPresenter);
        } else {
            if (i == 3) {
                return finderCommentDrawerPresenter.f158607J ? new C14510f0(finderCommentDrawerPresenter, false, 2, (C8480h) null) : finderCommentDrawerPresenter.f158606I ? new C2500a(finderCommentDrawerPresenter) : new C14680x(finderCommentDrawerPresenter, false, 2, (C8480h) null);
            }
            C58784w3.f168295a.mo83916b("Finder.DrawerPresenter", i);
            return new C14590p();
        }
    }
}
