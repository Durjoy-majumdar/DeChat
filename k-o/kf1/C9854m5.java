package kf1;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.regex.Pattern;
import lp3.C88643g;
import o40.C61926c;
import rx3.C13598b0;
import zp3.C16389w;

/* renamed from: kf1.m5 */
public abstract class C9854m5 extends C9707f {

    /* renamed from: p */
    public C16389w f30432p = new C9855a(this);

    /* renamed from: kf1.m5$a */
    public static final class C9855a implements C16389w {

        /* renamed from: d */
        public final /* synthetic */ RefreshLoadMoreLayout f30433d;

        /* renamed from: e */
        public final /* synthetic */ C9854m5 f30434e;

        public C9855a(C9854m5 m5Var) {
            this.f30434e = m5Var;
            this.f30433d = m5Var.mo10308D();
        }

        public void onChanged() {
            this.f30433d.onChanged();
        }

        public void onItemRangeChanged(int i, int i2) {
            RefreshLoadMoreLayout D = this.f30434e.mo10308D();
            this.f30434e.getClass();
            D.onItemRangeChanged(i + 0, i2);
        }

        public void onItemRangeInserted(int i, int i2) {
            RefreshLoadMoreLayout D = this.f30434e.mo10308D();
            this.f30434e.getClass();
            D.onItemRangeInserted(i + 0, i2);
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            RefreshLoadMoreLayout D = this.f30434e.mo10308D();
            this.f30434e.getClass();
            this.f30434e.getClass();
            D.onItemRangeMoved(i + 0, i2 + 0, i3);
        }

        public void onItemRangeRemoved(int i, int i2) {
            RefreshLoadMoreLayout D = this.f30434e.mo10308D();
            this.f30434e.getClass();
            D.onItemRangeRemoved(i + 0, i2);
        }

        public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f30434e.getClass();
        }

        public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f30433d.onPreFinishLoadMoreSmooth(cVar);
        }

        public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f30434e.mo10403H0(cVar);
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            RefreshLoadMoreLayout D = this.f30434e.mo10308D();
            this.f30434e.getClass();
            D.onItemRangeChanged(i + 0, i2, obj);
        }
    }

    /* renamed from: kf1.m5$b */
    public static final class C9856b extends C87413o implements C32226l<Void, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9854m5 f30435d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9856b(C9854m5 m5Var) {
            super(1);
            this.f30435d = m5Var;
        }

        public Object invoke(Object obj) {
            Void voidR = (Void) obj;
            C9640c cVar = this.f30435d.f30123e;
            C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderLoaderFeedUIContract.Presenter");
            ((FinderLoaderFeedUIContract$Presenter) cVar).mo2565s1();
            RefreshLoadMoreLayout.m66897N(this.f30435d.mo10308D(), 0, false, 3, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9854m5(MMActivity mMActivity, FinderLoaderFeedUIContract$Presenter finderLoaderFeedUIContract$Presenter, int i, int i2) {
        super(mMActivity, finderLoaderFeedUIContract$Presenter, i, i2, false);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(finderLoaderFeedUIContract$Presenter, "presenter");
    }

    /* renamed from: F0 */
    public void mo5181F0() {
        Pattern pattern = C61926c.f176038a;
        C61926c.m72701z(C88643g.m110546d(), new C9856b(this));
    }

    /* renamed from: H0 */
    public void mo10403H0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }

    /* renamed from: x0 */
    public C16389w mo10283x0() {
        return this.f30432p;
    }
}
