package com.tencent.p014mm.plugin.finder.gallery;

import android.view.View;
import android.widget.TextView;
import bl3.C39818r;
import cm1.C0790x;
import cm1.C55018j0;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullLiveConvert;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedLiveListConvert;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import di3.C86312j;
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
import p629ny.C76979h;
import rs1.C13442s8;
import tf0.C64916p1;
import ve1.C14445a2;
import ve1.C14590p;
import ve1.C14592p2;
import zf1.C16155m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/gallery/FinderGalleryTimelineContract$Presenter$buildItemCoverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryTimelineContract$Presenter$buildItemCoverts$1 */
public final class FinderGalleryTimelineContract$Presenter$buildItemCoverts$1 implements C9500j {
    public final /* synthetic */ FinderGalleryTimelineContract$Presenter this$0;

    /* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryTimelineContract$Presenter$buildItemCoverts$1$a */
    public static final class C3128a extends C14592p2 {

        /* renamed from: P */
        public final /* synthetic */ FinderGalleryTimelineContract$Presenter f15004P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3128a(FinderGalleryTimelineContract$Presenter finderGalleryTimelineContract$Presenter, FinderVideoCore finderVideoCore, boolean z, int i) {
            super(finderVideoCore, finderGalleryTimelineContract$Presenter, z, i, false, 16, (C8480h) null);
            this.f15004P = finderGalleryTimelineContract$Presenter;
        }

        /* renamed from: F */
        public void mo2258F(C60905o oVar, boolean z) {
            C87412m.m108594g(oVar, "holder");
            FinderFullSeekBarLayout finderFullSeekBarLayout = (FinderFullSeekBarLayout) oVar.mo85812D(C0966R.C0970id.eh4);
            View bulletBtn = finderFullSeekBarLayout != null ? finderFullSeekBarLayout.getBulletBtn() : null;
            if (bulletBtn != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = bulletBtn;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryTimelineContract$Presenter$buildItemCoverts$1$getItemConvert$1", "initBulletLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                bulletBtn.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/gallery/FinderGalleryTimelineContract$Presenter$buildItemCoverts$1$getItemConvert$1", "initBulletLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        /* renamed from: G */
        public boolean mo2260G() {
            return true;
        }

        /* renamed from: N */
        public void mo2274N(C60905o oVar, int i, int i2, int i3) {
            C87412m.m108594g(oVar, "holder");
        }

        /* renamed from: O */
        public void mo2276O(C60905o oVar) {
            C87412m.m108594g(oVar, "holder");
        }

        /* renamed from: P */
        public void mo2278P(C60905o oVar, int i) {
            C87412m.m108594g(oVar, "holder");
        }

        /* renamed from: R0 */
        public void mo44e(C60905o oVar, C55018j0 j0Var, int i, int i2, boolean z, List<Object> list) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(j0Var, "item");
            super.mo44e(oVar, j0Var, i, i2, z, list);
            C16155m.f43352a.mo14720a(oVar);
            ((NeatTextView) oVar.mo85812D(C0966R.C0970id.ki5)).mo104279b(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f15004P.f29961d, ((C64916p1) C86312j.m106911c(C64916p1.class)).du0(j0Var.mo3513o().getDescription()), oVar.f173499A.getResources().getDimension(C0966R.dimen.f3879hn)));
            View D = oVar.mo85812D(C0966R.C0970id.d9e);
            if (D != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = D;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryTimelineContract$Presenter$buildItemCoverts$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/gallery/FinderGalleryTimelineContract$Presenter$buildItemCoverts$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View D2 = oVar.mo85812D(C0966R.C0970id.d9f);
            if (D2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view2 = D2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryTimelineContract$Presenter$buildItemCoverts$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/gallery/FinderGalleryTimelineContract$Presenter$buildItemCoverts$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            mo2303l(oVar);
        }

        /* renamed from: V */
        public void mo2285V(C60905o oVar) {
            C87412m.m108594g(oVar, "holder");
        }

        /* renamed from: f0 */
        public void mo2295f0(C60905o oVar, boolean z) {
            C87412m.m108594g(oVar, "holder");
        }

        /* renamed from: l0 */
        public void mo2304l0(C60905o oVar, BaseFinderFeed baseFinderFeed) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g((C55018j0) baseFinderFeed, "item");
        }

        /* renamed from: m0 */
        public void mo2306m0(C60905o oVar) {
            C87412m.m108594g(oVar, "holder");
            ((TextView) oVar.mo85812D(C0966R.C0970id.fpi)).setVisibility(8);
        }

        /* renamed from: o0 */
        public void mo2310o0(C60905o oVar) {
            C87412m.m108594g(oVar, "holder");
            ((TextView) oVar.mo85812D(C0966R.C0970id.egm)).setVisibility(8);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryTimelineContract$Presenter$buildItemCoverts$1$b */
    public static final class C3129b extends C14445a2 {

        /* renamed from: L */
        public final /* synthetic */ FinderGalleryTimelineContract$Presenter f15005L;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3129b(FinderGalleryTimelineContract$Presenter finderGalleryTimelineContract$Presenter, boolean z, int i) {
            super(finderGalleryTimelineContract$Presenter, z, i, false, 8, (C8480h) null);
            this.f15005L = finderGalleryTimelineContract$Presenter;
        }

        /* renamed from: G */
        public boolean mo2260G() {
            return true;
        }

        /* renamed from: N */
        public void mo2274N(C60905o oVar, int i, int i2, int i3) {
            C87412m.m108594g(oVar, "holder");
        }

        /* renamed from: P */
        public void mo2278P(C60905o oVar, int i) {
            C87412m.m108594g(oVar, "holder");
        }

        /* renamed from: S0 */
        public void mo2304l0(C60905o oVar, C0790x xVar) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(xVar, "item");
        }

        /* renamed from: U0 */
        public void mo44e(C60905o oVar, C0790x xVar, int i, int i2, boolean z, List<Object> list) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(xVar, "item");
            super.mo44e(oVar, xVar, i, i2, z, list);
            C16155m.f43352a.mo14720a(oVar);
            ((NeatTextView) oVar.mo85812D(C0966R.C0970id.ki5)).mo104279b(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f15005L.f29961d, ((C64916p1) C86312j.m106911c(C64916p1.class)).du0(xVar.mo3513o().getDescription()), oVar.f173499A.getResources().getDimension(C0966R.dimen.f3879hn)));
            View D = oVar.mo85812D(C0966R.C0970id.d9e);
            if (D != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = D;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryTimelineContract$Presenter$buildItemCoverts$1$getItemConvert$2", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedImage;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/gallery/FinderGalleryTimelineContract$Presenter$buildItemCoverts$1$getItemConvert$2", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedImage;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View D2 = oVar.mo85812D(C0966R.C0970id.d9f);
            if (D2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view2 = D2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryTimelineContract$Presenter$buildItemCoverts$1$getItemConvert$2", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedImage;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/gallery/FinderGalleryTimelineContract$Presenter$buildItemCoverts$1$getItemConvert$2", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedImage;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            mo2303l(oVar);
        }

        /* renamed from: V */
        public void mo2285V(C60905o oVar) {
            C87412m.m108594g(oVar, "holder");
        }

        /* renamed from: m0 */
        public void mo2306m0(C60905o oVar) {
            C87412m.m108594g(oVar, "holder");
            ((TextView) oVar.mo85812D(C0966R.C0970id.fpi)).setVisibility(8);
        }

        /* renamed from: o0 */
        public void mo2310o0(C60905o oVar) {
            C87412m.m108594g(oVar, "holder");
            ((TextView) oVar.mo85812D(C0966R.C0970id.egm)).setVisibility(8);
        }
    }

    public FinderGalleryTimelineContract$Presenter$buildItemCoverts$1(FinderGalleryTimelineContract$Presenter finderGalleryTimelineContract$Presenter) {
        this.this$0 = finderGalleryTimelineContract$Presenter;
    }

    public C60896i<?> getItemConvert(int i) {
        if (i == 2) {
            this.this$0.getClass();
            FinderGalleryTimelineContract$Presenter finderGalleryTimelineContract$Presenter = this.this$0;
            return new C3129b(finderGalleryTimelineContract$Presenter, false, finderGalleryTimelineContract$Presenter.f29967j);
        } else if (i == 4) {
            FinderGalleryTimelineContract$Presenter finderGalleryTimelineContract$Presenter2 = this.this$0;
            FinderVideoCore finderVideoCore = finderGalleryTimelineContract$Presenter2.f29969o;
            finderGalleryTimelineContract$Presenter2.getClass();
            FinderGalleryTimelineContract$Presenter finderGalleryTimelineContract$Presenter3 = this.this$0;
            return new C3128a(finderGalleryTimelineContract$Presenter3, finderVideoCore, false, finderGalleryTimelineContract$Presenter3.f29967j);
        } else if (i == 9) {
            FinderGalleryTimelineContract$Presenter finderGalleryTimelineContract$Presenter4 = this.this$0;
            FinderVideoCore finderVideoCore2 = finderGalleryTimelineContract$Presenter4.f29969o;
            finderGalleryTimelineContract$Presenter4.getClass();
            FinderGalleryTimelineContract$Presenter finderGalleryTimelineContract$Presenter5 = this.this$0;
            int i2 = finderGalleryTimelineContract$Presenter5.f29967j;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(finderGalleryTimelineContract$Presenter5.f29961d);
            return new FinderFeedFullLiveConvert(finderVideoCore2, finderGalleryTimelineContract$Presenter4, false, i2, f != null ? f.f38096i : 0);
        } else if (i != 2003) {
            C58784w3.f168295a.mo83916b(this.this$0.f13123r, i);
            return new C14590p();
        } else {
            FinderGalleryTimelineContract$Presenter finderGalleryTimelineContract$Presenter6 = this.this$0;
            return new FinderFeedLiveListConvert(finderGalleryTimelineContract$Presenter6, ((C13442s8) C39818r.f106831a.mo62444c(finderGalleryTimelineContract$Presenter6.f29961d).mo75002a(C13442s8.class)).mo12861q3(), 0);
        }
    }
}
