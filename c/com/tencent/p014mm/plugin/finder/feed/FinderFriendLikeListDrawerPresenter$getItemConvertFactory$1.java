package com.tencent.p014mm.plugin.finder.feed;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import dp1.C58417y0;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import je1.C46541v0;
import je1.C9384w2;
import jq3.C60896i;
import jq3.C9500j;
import kf1.C10053y2;
import kotlin.Metadata;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C50581nr0;
import te3.C51431tq1;
import ur1.C14378f;
import ve1.C14512f1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderFriendLikeListDrawerPresenter$getItemConvertFactory$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderFriendLikeListDrawerPresenter$getItemConvertFactory$1 */
public final class FinderFriendLikeListDrawerPresenter$getItemConvertFactory$1 implements C9500j {
    public final /* synthetic */ FinderFriendLikeListDrawerPresenter this$0;

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderFriendLikeListDrawerPresenter$getItemConvertFactory$1$a */
    public static final class C2517a extends C87413o implements C32226l<C50581nr0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFriendLikeListDrawerPresenter f13079d;

        /* renamed from: e */
        public final /* synthetic */ C51431tq1 f13080e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2517a(FinderFriendLikeListDrawerPresenter finderFriendLikeListDrawerPresenter, C51431tq1 tq12) {
            super(1);
            this.f13079d = finderFriendLikeListDrawerPresenter;
            this.f13080e = tq12;
        }

        public Object invoke(Object obj) {
            C50581nr0 nr02 = (C50581nr0) obj;
            C87412m.m108594g(nr02, LocaleUtil.ITALIAN);
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f13079d.f13075x);
            if (f != null) {
                ((C58417y0) C86312j.m106911c(C58417y0.class)).Jx0(f.mo12861q3(), this.f13079d.mo2551i().getId(), nr02.f138727g == 1 ? 1 : 2, nr02.f138729i);
            }
            C51431tq1 tq12 = this.f13080e;
            new C46541v0(tq12, nr02, tq12.f142360g).mo9225i();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderFriendLikeListDrawerPresenter$getItemConvertFactory$1$b */
    public static final class C2518b extends C87413o implements C32226l<C50581nr0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFriendLikeListDrawerPresenter f13081d;

        /* renamed from: e */
        public final /* synthetic */ C51431tq1 f13082e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2518b(FinderFriendLikeListDrawerPresenter finderFriendLikeListDrawerPresenter, C51431tq1 tq12) {
            super(1);
            this.f13081d = finderFriendLikeListDrawerPresenter;
            this.f13082e = tq12;
        }

        public Object invoke(Object obj) {
            C50581nr0 nr02 = (C50581nr0) obj;
            C87412m.m108594g(nr02, "likeInfo");
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f13081d.f13075x);
            if (f != null) {
                ((C58417y0) C86312j.m106911c(C58417y0.class)).Jx0(f.mo12861q3(), this.f13081d.mo2551i().getId(), nr02.f138728h == 1 ? 3 : 4, nr02.f138729i);
            }
            C9384w2 w2Var = nr02.f138728h == 1 ? new C9384w2(nr02.f138729i, 1, this.f13082e.f142359f) : new C9384w2(nr02.f138729i, 2, this.f13082e.f142359f);
            w2Var.f29315n = nr02;
            C86709a0.m107524d().mo123460f(w2Var);
            FinderFriendLikeListDrawerPresenter finderFriendLikeListDrawerPresenter = this.f13081d;
            finderFriendLikeListDrawerPresenter.getClass();
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_HAS_SHOWN_BLACK_LIST_TIPS_BOOLEAN_SYNC;
            Object f2 = i.mo119685f(aVar, Boolean.FALSE);
            C87412m.m108592e(f2, "null cannot be cast to non-null type kotlin.Boolean");
            if (!((Boolean) f2).booleanValue()) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
                C14378f fVar = finderFriendLikeListDrawerPresenter.f13106j;
                Context b = fVar != null ? fVar.mo13677b() : null;
                C87412m.m108591d(b);
                C4191v0 v0Var = new C4191v0(b);
                v0Var.mo5070e(C0966R.C0971layout.aqy);
                ((TextView) v0Var.f18463f.findViewById(C0966R.C0970id.l05)).setText(finderFriendLikeListDrawerPresenter.f13075x.getString(C0966R.string.luj));
                ((TextView) v0Var.f18463f.findViewById(C0966R.C0970id.f359460l03)).setText(finderFriendLikeListDrawerPresenter.f13075x.getString(C0966R.string.lub));
                TextView textView = (TextView) v0Var.f18463f.findViewById(C0966R.C0970id.f359459l02);
                textView.setOnClickListener(new C10053y2(v0Var));
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
                int i2 = C0966R.C0969drawable.f357393ci1;
                if (C85875k4.m106211z()) {
                    i2 = C0966R.C0969drawable.f357394ci2;
                }
                ((ImageView) v0Var.f18463f.findViewById(C0966R.C0970id.f359461l04)).setImageResource(i2);
                v0Var.mo5073h();
            }
            return C13598b0.f38549a;
        }
    }

    public FinderFriendLikeListDrawerPresenter$getItemConvertFactory$1(FinderFriendLikeListDrawerPresenter finderFriendLikeListDrawerPresenter) {
        this.this$0 = finderFriendLikeListDrawerPresenter;
    }

    public C60896i<?> getItemConvert(int i) {
        C14512f1 f1Var = new C14512f1(this.this$0.mo2551i().getId());
        C51431tq1 tq12 = new C51431tq1();
        FinderFriendLikeListDrawerPresenter finderFriendLikeListDrawerPresenter = this.this$0;
        tq12.f142357d = finderFriendLikeListDrawerPresenter.mo2551i().field_id;
        tq12.f142358e = finderFriendLikeListDrawerPresenter.mo2551i().getFeedObject().objectNonceId;
        tq12.f142359f = 2;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(finderFriendLikeListDrawerPresenter.f13075x);
        tq12.f142360g = f != null ? f.mo12861q3() : null;
        new C2517a(this.this$0, tq12);
        f1Var.f40234g = new C2518b(this.this$0, tq12);
        return f1Var;
    }
}
