package com.tencent.p014mm.plugin.finder.feed;

import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullFoldedConvert;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullLiveConvert;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedLiveListConvert;
import com.tencent.p014mm.plugin.finder.convert.FinderStreamCardAlbumConvert;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87413o;
import j20.C117292a;
import jq3.C60896i;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import kf1.C9878n9;
import kotlin.Metadata;
import rs1.C13442s8;
import rx3.C13598b0;
import ve1.C14443a1;
import ve1.C14445a2;
import ve1.C14467b3;
import ve1.C14468b4;
import ve1.C14477c3;
import ve1.C14482c5;
import ve1.C14531g4;
import ve1.C14548j3;
import ve1.C14570m4;
import ve1.C14576n2;
import ve1.C14590p;
import ve1.C14592p2;
import ve1.C14670w;
import ve1.C14706z2;
import ve1.C14710z6;
import ve1.C65626m8;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$buildItemCoverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$buildItemCoverts$1 */
public final class FinderTimelinePresenter$buildItemCoverts$1 implements C9500j {
    public final /* synthetic */ FinderTimelinePresenter this$0;

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$buildItemCoverts$1$a */
    public static final class C2611a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13386d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2611a(FinderTimelinePresenter finderTimelinePresenter) {
            super(0);
            this.f13386d = finderTimelinePresenter;
        }

        public Object invoke() {
            this.f13386d.f13285z.requestRefresh();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$buildItemCoverts$1$b */
    public static final class C2612b extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13387d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2612b(FinderTimelinePresenter finderTimelinePresenter) {
            super(1);
            this.f13387d = finderTimelinePresenter;
        }

        public Object invoke(Object obj) {
            C9878n9 n9Var;
            RecyclerView recyclerView;
            int intValue = ((Number) obj).intValue();
            if (!(this.f13387d.f13285z.getDataList().size() <= 1 || (n9Var = this.f13387d.f13269j) == null || (recyclerView = n9Var.getRecyclerView()) == null)) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(intValue + 1));
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$buildItemCoverts$1$getItemConvert$2", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$buildItemCoverts$1$getItemConvert$2", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
            return C13598b0.f38549a;
        }
    }

    public FinderTimelinePresenter$buildItemCoverts$1(FinderTimelinePresenter finderTimelinePresenter) {
        this.this$0 = finderTimelinePresenter;
    }

    public C60896i<?> getItemConvert(int i) {
        int i2 = i;
        Class cls = C13442s8.class;
        if (i2 == -7) {
            return new C14467b3();
        }
        if (i2 == -6) {
            return new C14710z6();
        }
        if (i2 == -5) {
            return new C14706z2();
        }
        if (i2 == -4) {
            return new C14670w();
        }
        if (i2 == -3) {
            return new C14548j3();
        }
        if (i2 == -1) {
            return new C14443a1(new C2611a(this.this$0), (C32224a) null, false, 6, (C8480h) null);
        }
        if (i2 == 2) {
            FinderTimelinePresenter finderTimelinePresenter = this.this$0;
            return new C14445a2(finderTimelinePresenter, false, finderTimelinePresenter.f13272p, false, 10, (C8480h) null);
        } else if (i2 == 4) {
            FinderTimelinePresenter finderTimelinePresenter2 = this.this$0;
            return new C14592p2(finderTimelinePresenter2.f13242B, finderTimelinePresenter2, false, finderTimelinePresenter2.f13272p, false, 20, (C8480h) null);
        } else if (i2 == 9) {
            FinderTimelinePresenter finderTimelinePresenter3 = this.this$0;
            FinderVideoCore finderVideoCore = finderTimelinePresenter3.f13242B;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(finderTimelinePresenter3.f13266g);
            int i3 = f != null ? f.f38096i : 0;
            FinderTimelinePresenter finderTimelinePresenter4 = this.this$0;
            return new FinderFeedFullLiveConvert(finderVideoCore, finderTimelinePresenter4, false, finderTimelinePresenter4.f13272p, i3, 4, (C8480h) null);
        } else if (i2 == 15) {
            C2612b bVar = new C2612b(this.this$0);
            FinderTimelinePresenter finderTimelinePresenter5 = this.this$0;
            return new C14477c3(bVar, finderTimelinePresenter5, finderTimelinePresenter5.f13272p);
        } else if (i2 == 2017) {
            return new FinderFeedFullFoldedConvert(this.this$0);
        } else {
            if (i2 == 2019) {
                return new C14576n2(this.this$0);
            }
            if (i2 == 2002) {
                return new C14482c5();
            }
            if (i2 == 2003) {
                FinderTimelinePresenter finderTimelinePresenter6 = this.this$0;
                return new FinderFeedLiveListConvert(finderTimelinePresenter6, ((C13442s8) C39818r.f106831a.mo62444c(finderTimelinePresenter6.f13266g).mo75002a(cls)).mo12861q3(), this.this$0.f13272p);
            } else if (i2 == 3001) {
                FinderTimelinePresenter finderTimelinePresenter7 = this.this$0;
                int i4 = finderTimelinePresenter7.f13272p;
                return i4 == 1 ? new C14570m4() : new C14445a2(finderTimelinePresenter7, false, i4, false, 10, (C8480h) null);
            } else if (i2 != 3002) {
                switch (i2) {
                    case 2010:
                        return new C65626m8(((C13442s8) C39818r.f106831a.mo62444c(this.this$0.f13266g).mo75002a(cls)).mo12861q3(), this.this$0.f13272p);
                    case 2011:
                        return new C14468b4(this.this$0.f13272p);
                    case 2012:
                        return new C14531g4();
                    case 2013:
                        FinderTimelinePresenter finderTimelinePresenter8 = this.this$0;
                        return new FinderStreamCardAlbumConvert(finderTimelinePresenter8, finderTimelinePresenter8.f13272p);
                    default:
                        C58784w3.f168295a.mo83916b(this.this$0.f13249I, i2);
                        return new C14590p();
                }
            } else {
                FinderTimelinePresenter finderTimelinePresenter9 = this.this$0;
                int i5 = finderTimelinePresenter9.f13272p;
                return i5 == 1 ? new C14570m4() : new C14592p2(finderTimelinePresenter9.f13242B, finderTimelinePresenter9, false, i5, false, 20, (C8480h) null);
            }
        }
    }
}
