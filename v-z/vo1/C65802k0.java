package vo1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayViewCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import te3.C49431fj1;
import yo1.C16058c;

/* renamed from: vo1.k0 */
public final class C65802k0 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ FinderLiveReplayViewCallback f189248a;

    /* renamed from: vo1.k0$a */
    public static final class C65803a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveReplayViewCallback f189249d;

        public C65803a(FinderLiveReplayViewCallback finderLiveReplayViewCallback) {
            this.f189249d = finderLiveReplayViewCallback;
        }

        public final void run() {
            this.f189249d.f160732g.mo82442H(0);
        }
    }

    public C65802k0(FinderLiveReplayViewCallback finderLiveReplayViewCallback) {
        this.f189248a = finderLiveReplayViewCallback;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        C49431fj1 fj12;
        View c = this.f189248a.f160732g.mo82392c(C0966R.C0970id.dqh);
        View view = null;
        View findViewById = c != null ? c.findViewById(C0966R.C0970id.g3j) : null;
        MMProcessBar mMProcessBar = findViewById instanceof MMProcessBar ? (MMProcessBar) findViewById : null;
        View c2 = this.f189248a.f160732g.mo82392c(C0966R.C0970id.dqh);
        if (c2 != null) {
            view = c2.findViewById(C0966R.C0970id.g2q);
        }
        C16058c cVar = C65770a0.f189184r.mo89819a().f189188b;
        if (!((cVar == null || (fj12 = cVar.f43186a) == null || fj12.f133535g != 0) ? false : true)) {
            this.f189248a.f160730e.mo3868o();
            if (mMProcessBar != null) {
                mMProcessBar.mo82302b(C0966R.raw.finder_live_icon_location_loading, MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2975b6));
            }
            if (mMProcessBar != null) {
                mMProcessBar.setVisibility(0);
            }
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback$initView$2$1", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback$initView$2$1", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            Log.m105924i("FinderLiveReplayViewCallback", "load more progress bar is show");
            return;
        }
        if (mMProcessBar != null) {
            mMProcessBar.setVisibility(8);
        }
        if (view != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view3 = view;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback$initView$2$1", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback$initView$2$1", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f189248a.f160732g.mo82440F(0);
        Log.m105924i("FinderLiveReplayViewCallback", "live list load finish is show");
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        Log.m105924i("FinderLiveReplayViewCallback", "onLoadMoreEnd");
    }

    /* renamed from: d */
    public void mo3680d(int i) {
        Log.m105924i("FinderLiveReplayViewCallback", "onRefreshBegin");
        FinderLiveReplayViewCallback finderLiveReplayViewCallback = this.f189248a;
        finderLiveReplayViewCallback.f160732g.post(new C65803a(finderLiveReplayViewCallback));
    }

    /* renamed from: e */
    public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        Log.m105924i("FinderLiveReplayViewCallback", "onRefreshEnd");
    }
}
