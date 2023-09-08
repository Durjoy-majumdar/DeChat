package com.tencent.p014mm.plugin.finder.feed;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import cm1.C0768q0;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer;
import com.tencent.p014mm.plugin.report.service.C115669n;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9500j;
import kotlin.Metadata;
import o40.C61926c;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C49712hj1;
import ur1.C14378f;
import ve1.C14645u2;
import vq1.C65866w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderLikeDrawerPresenter$getItemConvertFactory$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderLikeDrawerPresenter$getItemConvertFactory$1 */
public final class FinderLikeDrawerPresenter$getItemConvertFactory$1 implements C9500j {
    public final /* synthetic */ FinderLikeDrawerPresenter this$0;

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderLikeDrawerPresenter$getItemConvertFactory$1$a */
    public static final class C2528a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderLikeDrawerPresenter f13120d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2528a(FinderLikeDrawerPresenter finderLikeDrawerPresenter) {
            super(0);
            this.f13120d = finderLikeDrawerPresenter;
        }

        public Object invoke() {
            C13604l<Boolean, Boolean> g = C65866w.f189407h.mo89908g(this.f13120d.mo2551i().getFeedObject());
            return Boolean.valueOf(((Boolean) g.f38555d).booleanValue() && !((Boolean) g.f38556e).booleanValue());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderLikeDrawerPresenter$getItemConvertFactory$1$b */
    public static final class C2529b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLikeDrawerPresenter f13121d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2529b(FinderLikeDrawerPresenter finderLikeDrawerPresenter) {
            super(1);
            this.f13121d = finderLikeDrawerPresenter;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C14378f fVar = this.f13121d.f13106j;
            Context b = fVar != null ? fVar.mo13677b() : null;
            if (b instanceof MMFragmentActivity) {
                int scene = this.f13121d.getScene();
                FinderLikeDrawer.Companion companion = FinderLikeDrawer.f17829D;
                int i = 2;
                if (scene == 2) {
                    C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62444c((AppCompatActivity) b).mo75002a(C13442s8.class)).mo12861q3();
                    FinderLikeDrawerPresenter finderLikeDrawerPresenter = this.f13121d;
                    C60905o oVar = finderLikeDrawerPresenter.f13105i;
                    if (oVar != null) {
                        ((C58417y0) C86312j.m106911c(C58417y0.class)).wx0(oVar, finderLikeDrawerPresenter.mo2551i().getId(), finderLikeDrawerPresenter.mo2551i());
                    }
                    C0768q0.f1810a.mo710a(q3, 1, this.f13121d.mo2551i(), booleanValue, false, 2, false, false, false);
                    FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
                    feedUpdateEvent.f9173d.f9174a = this.f13121d.mo2551i().getId();
                    FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
                    aVar.f9175b = 4;
                    aVar.f9178e = booleanValue ? 1 : 0;
                    feedUpdateEvent.publish();
                    if (booleanValue) {
                        this.f13121d.f13109p++;
                        C115669n nVar = C115669n.INSTANCE;
                        StringBuilder sb = new StringBuilder();
                        sb.append(C61926c.m72691p(this.f13121d.mo2551i().getId()));
                        sb.append(",2,");
                        FinderLikeDrawerPresenter finderLikeDrawerPresenter2 = this.f13121d;
                        if (finderLikeDrawerPresenter2.f13114u) {
                            i = 1;
                        } else if (finderLikeDrawerPresenter2.f13115v) {
                            i = 3;
                        }
                        sb.append(i);
                        nVar.kvStat(20851, sb.toString());
                    } else {
                        FinderLikeDrawerPresenter finderLikeDrawerPresenter3 = this.f13121d;
                        finderLikeDrawerPresenter3.f13109p--;
                        C115669n nVar2 = C115669n.INSTANCE;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(C61926c.m72691p(this.f13121d.mo2551i().getId()));
                        sb4.append(",3,");
                        FinderLikeDrawerPresenter finderLikeDrawerPresenter4 = this.f13121d;
                        if (finderLikeDrawerPresenter4.f13114u) {
                            i = 1;
                        } else if (finderLikeDrawerPresenter4.f13115v) {
                            i = 3;
                        }
                        sb4.append(i);
                        nVar2.kvStat(20851, sb4.toString());
                    }
                    this.f13121d.mo2555o();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderLikeDrawerPresenter$getItemConvertFactory$1$c */
    public static final class C2530c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLikeDrawerPresenter f13122d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2530c(FinderLikeDrawerPresenter finderLikeDrawerPresenter) {
            super(0);
            this.f13122d = finderLikeDrawerPresenter;
        }

        public Object invoke() {
            C115669n nVar = C115669n.INSTANCE;
            StringBuilder sb = new StringBuilder();
            sb.append(C61926c.m72691p(this.f13122d.mo2551i().getId()));
            sb.append(",1,");
            FinderLikeDrawerPresenter finderLikeDrawerPresenter = this.f13122d;
            sb.append(finderLikeDrawerPresenter.f13114u ? 1 : finderLikeDrawerPresenter.f13115v ? 3 : 2);
            nVar.kvStat(20851, sb.toString());
            return C13598b0.f38549a;
        }
    }

    public FinderLikeDrawerPresenter$getItemConvertFactory$1(FinderLikeDrawerPresenter finderLikeDrawerPresenter) {
        this.this$0 = finderLikeDrawerPresenter;
    }

    public C60896i<?> getItemConvert(int i) {
        return new C14645u2(FinderLikeDrawerPresenter.m2448h(this.this$0), new C2528a(this.this$0), new C2529b(this.this$0), new C2530c(this.this$0));
    }
}
