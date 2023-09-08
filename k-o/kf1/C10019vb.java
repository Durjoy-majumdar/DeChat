package kf1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.FinderTopicTimelineUIContract$Presenter;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C51270sn1;

/* renamed from: kf1.vb */
public final class C10019vb extends C9854m5 {

    /* renamed from: q */
    public int f30719q;

    /* renamed from: r */
    public final C13601g f30720r;

    /* renamed from: kf1.vb$a */
    public static final class C10020a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f30721d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10020a(MMActivity mMActivity) {
            super(0);
            this.f30721d = mMActivity;
        }

        public Object invoke() {
            return this.f30721d.findViewById(C0966R.C0970id.cjg);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10019vb(MMActivity mMActivity, FinderTopicTimelineUIContract$Presenter finderTopicTimelineUIContract$Presenter, int i, int i2) {
        super(mMActivity, finderTopicTimelineUIContract$Presenter, i, i2);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(finderTopicTimelineUIContract$Presenter, "presenter");
        this.f30720r = C36568h.m40985a(new C10020a(mMActivity));
    }

    /* renamed from: H0 */
    public void mo10403H0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        int i = this.f30719q;
        if (i == 5) {
            E e = cVar.f24950e;
            if ((e instanceof C51270sn1) && cVar.f24947b != -1) {
                C87412m.m108592e(e, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderTopicInfo");
                C51270sn1 sn12 = (C51270sn1) e;
                mo10484I0();
                return;
            }
        }
        if (i == 16) {
            mo10484I0();
            this.f30123e.onRefreshEnd(cVar);
            ArrayList<C0740i2> n = this.f30123e.mo2492n();
            boolean z = true;
            if (n == null || !n.isEmpty()) {
                z = false;
            }
            if (z) {
                ((FrameLayout) this.f30122d.findViewById(C0966R.C0970id.cjg)).setVisibility(0);
                ((TextView) this.f30122d.findViewById(C0966R.C0970id.cj7)).setVisibility(0);
            }
        }
    }

    /* renamed from: I0 */
    public final void mo10484I0() {
        ((FrameLayout) this.f30122d.findViewById(C0966R.C0970id.cjg)).setVisibility(8);
        ((ProgressBar) this.f30122d.findViewById(C0966R.C0970id.i7j)).setVisibility(8);
    }

    /* renamed from: J0 */
    public final void mo10485J0() {
        ((FrameLayout) this.f30122d.findViewById(C0966R.C0970id.cjg)).setVisibility(0);
        ((ProgressBar) this.f30122d.findViewById(C0966R.C0970id.i7j)).setVisibility(0);
    }

    /* renamed from: k0 */
    public void mo9301k0(ArrayList<C0740i2> arrayList) {
        C87412m.m108594g(arrayList, "data");
        super.mo9301k0(arrayList);
        RefreshLoadMoreLayout D = mo10308D();
        View inflate = C85868k2.m106137b(this.f30122d).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
        C87412m.m108593f(inflate, "getInflater(context).inf…t.load_more_footer, null)");
        D.setLoadMoreFooter(inflate);
        View loadMoreFooter = mo10308D().getLoadMoreFooter();
        if (loadMoreFooter != null) {
            int color = loadMoreFooter.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_3_White_Mode);
            TextView textView = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t);
            if (textView != null) {
                textView.setTextColor(color);
            }
            View findViewById = loadMoreFooter.findViewById(C0966R.C0970id.aym);
            if (findViewById != null) {
                findViewById.setBackgroundColor(color);
            }
            View findViewById2 = loadMoreFooter.findViewById(C0966R.C0970id.fms);
            if (findViewById2 != null) {
                findViewById2.setBackgroundColor(color);
            }
            View findViewById3 = loadMoreFooter.findViewById(C0966R.C0970id.itl);
            if (findViewById3 != null) {
                findViewById3.setBackgroundColor(color);
            }
        }
        this.f30719q = this.f30122d.getIntent().getIntExtra("key_topic_type", 0);
        this.f30122d.getIntent().getLongExtra("LoaderCacheStoreIntentKey", 0);
        int i = this.f30719q;
        if (i == 5) {
            MMActivity mMActivity = this.f30122d;
            RefreshLoadMoreLayout D2 = mo10308D();
            C87412m.m108594g(mMActivity, "context");
            C87412m.m108594g(D2, "rlLayout");
            mo10485J0();
        } else if (i == 16) {
            mo10485J0();
        }
    }

    /* renamed from: x */
    public View mo5184x() {
        if (this.f30719q == 16) {
            return (View) ((C36570n) this.f30720r).getValue();
        }
        return null;
    }
}
