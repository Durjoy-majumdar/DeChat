package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import bl3.C39818r;
import cm1.C0740i2;
import cm1.C0790x;
import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter$buildItemCoverts$1;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9500j;
import kotlin.Metadata;
import lp1.C10617j;
import rs1.C13442s8;
import sf1.C13674c;
import te3.C64629pl1;
import up1.C65426w0;
import ve1.C14445a2;
import ve1.C14592p2;
import ve1.C14634t6;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¨\u0006\u000b"}, mo182094d2 = {"com/tencent/mm/plugin/finder/ui/ShareRelPresenter$buildItemCoverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "Ljq3/o;", "holder", "position", "Lrx3/b0;", "addListener", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.ShareRelPresenter$buildItemCoverts$1 */
public final class ShareRelPresenter$buildItemCoverts$1 implements C9500j {
    public final /* synthetic */ ShareRelPresenter this$0;

    /* renamed from: com.tencent.mm.plugin.finder.ui.ShareRelPresenter$buildItemCoverts$1$a */
    public static final class C3765a extends C14592p2 {

        /* renamed from: P */
        public final /* synthetic */ ShareRelPresenter f17225P;

        /* renamed from: Q */
        public final /* synthetic */ ShareRelPresenter$buildItemCoverts$1 f17226Q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3765a(ShareRelPresenter shareRelPresenter, ShareRelPresenter$buildItemCoverts$1 shareRelPresenter$buildItemCoverts$1, FinderVideoCore finderVideoCore, boolean z, int i) {
            super(finderVideoCore, shareRelPresenter, z, i, false, 16, (C8480h) null);
            this.f17225P = shareRelPresenter;
            this.f17226Q = shareRelPresenter$buildItemCoverts$1;
        }

        /* renamed from: M */
        public void mo2272M(C60905o oVar, BaseFinderFeed baseFinderFeed, View view, int i) {
            C55018j0 j0Var = (C55018j0) baseFinderFeed;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(j0Var, "item");
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            super.mo2272M(oVar, j0Var, view, i);
            ((C10617j) C39818r.f106831a.mo62444c(this.f17225P.f29961d).mo75002a(C10617j.class)).getClass();
            Log.m105924i("Finder.ShareGuideNextUIC", "[forbidToShow]");
        }

        /* renamed from: R0 */
        public void mo44e(C60905o oVar, C55018j0 j0Var, int i, int i2, boolean z, List<Object> list) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(j0Var, "item");
            super.mo44e(oVar, j0Var, i, i2, z, list);
            if (this.f17225P.f17206K) {
                C13674c.f38721a.mo13060a(oVar);
            }
            this.f17226Q.addListener(oVar, i);
        }

        /* renamed from: Z */
        public void mo2289Z(C60905o oVar, BaseFinderFeed baseFinderFeed, boolean z, long j, C65426w0 w0Var, int i, int i2, boolean z2, long j2, int i3, int i4) {
            C55018j0 j0Var = (C55018j0) baseFinderFeed;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(j0Var, "item");
            super.mo2289Z(oVar, j0Var, z, j, w0Var, i, i2, z2, j2, i3, i4);
            ((C10617j) C39818r.f106831a.mo62444c(this.f17225P.f29961d).mo75002a(C10617j.class)).getClass();
            Log.m105924i("Finder.ShareGuideNextUIC", "[forbidToShow]");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.ShareRelPresenter$buildItemCoverts$1$b */
    public static final class C3766b extends C14445a2 {

        /* renamed from: L */
        public final /* synthetic */ ShareRelPresenter f17227L;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3766b(ShareRelPresenter shareRelPresenter, boolean z, int i) {
            super(shareRelPresenter, z, i, false, 8, (C8480h) null);
            this.f17227L = shareRelPresenter;
        }

        /* renamed from: L */
        public void mo2270L(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2, boolean z, List list) {
            C0790x xVar = (C0790x) baseFinderFeed;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(xVar, "item");
            super.mo44e(oVar, xVar, i, i2, z, list);
            if (this.f17227L.f17206K) {
                C13674c.f38721a.mo13060a(oVar);
            }
        }

        /* renamed from: M */
        public void mo2272M(C60905o oVar, BaseFinderFeed baseFinderFeed, View view, int i) {
            C0790x xVar = (C0790x) baseFinderFeed;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(xVar, "item");
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            super.mo2272M(oVar, xVar, view, i);
            ((C10617j) C39818r.f106831a.mo62444c(this.f17227L.f29961d).mo75002a(C10617j.class)).getClass();
            Log.m105924i("Finder.ShareGuideNextUIC", "[forbidToShow]");
        }

        /* renamed from: Z */
        public void mo2289Z(C60905o oVar, BaseFinderFeed baseFinderFeed, boolean z, long j, C65426w0 w0Var, int i, int i2, boolean z2, long j2, int i3, int i4) {
            C0790x xVar = (C0790x) baseFinderFeed;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(xVar, "item");
            super.mo2289Z(oVar, xVar, z, j, w0Var, i, i2, z2, j2, i3, i4);
            ((C10617j) C39818r.f106831a.mo62444c(this.f17227L.f29961d).mo75002a(C10617j.class)).getClass();
            Log.m105924i("Finder.ShareGuideNextUIC", "[forbidToShow]");
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            C0790x xVar = (C0790x) cVar;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(xVar, "item");
            super.mo44e(oVar, xVar, i, i2, z, list);
            if (this.f17227L.f17206K) {
                C13674c.f38721a.mo13060a(oVar);
            }
        }
    }

    public ShareRelPresenter$buildItemCoverts$1(ShareRelPresenter shareRelPresenter) {
        this.this$0 = shareRelPresenter;
    }

    public final void addListener(C60905o oVar, int i) {
        C87412m.m108594g(oVar, "holder");
        if (oVar.f44854d.getTag(C0966R.C0970id.e7a) == null) {
            ShareRelPresenter$buildItemCoverts$1$addListener$1 shareRelPresenter$buildItemCoverts$1$addListener$1 = new ShareRelPresenter$buildItemCoverts$1$addListener$1(i, this.this$0, oVar, C40008f.f107254d);
            oVar.f44854d.setTag(C0966R.C0970id.e7a, shareRelPresenter$buildItemCoverts$1$addListener$1);
            this.this$0.f17209N.add(shareRelPresenter$buildItemCoverts$1$addListener$1);
            shareRelPresenter$buildItemCoverts$1$addListener$1.alive();
        }
    }

    public C60896i<?> getItemConvert(int i) {
        if (i == 2016) {
            BaseFeedLoader<C0740i2> baseFeedLoader = this.this$0.f13124s;
            C87412m.m108592e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader");
            List<? extends C64629pl1> list = ((FinderFeedShareRelativeListLoader) baseFeedLoader).f13560A;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.this$0.f29961d);
            return new C14634t6(f != null ? f.mo12861q3() : null, this.this$0.f29967j, list);
        }
        ShareRelPresenter shareRelPresenter = this.this$0;
        shareRelPresenter.getClass();
        C60896i<?> itemConvert = new FinderLoaderFeedUIContract$Presenter$buildItemCoverts$1(shareRelPresenter).getItemConvert(i);
        if (itemConvert instanceof C14592p2) {
            ShareRelPresenter shareRelPresenter2 = this.this$0;
            return new C3765a(shareRelPresenter2, this, shareRelPresenter2.f29969o, shareRelPresenter2.f30770u, shareRelPresenter2.f29967j);
        } else if (!(itemConvert instanceof C14445a2)) {
            return itemConvert;
        } else {
            ShareRelPresenter shareRelPresenter3 = this.this$0;
            return new C3766b(shareRelPresenter3, shareRelPresenter3.f30770u, shareRelPresenter3.f29967j);
        }
    }
}
