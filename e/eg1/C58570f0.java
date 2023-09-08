package eg1;

import ak1.C54067f0;
import ak1.C54116w;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.plugin.finder.live.FinderLiveViewCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: eg1.f0 */
public final class C58570f0 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ FinderLiveViewCallback f167654a;

    /* renamed from: b */
    public final /* synthetic */ boolean f167655b;

    /* renamed from: c */
    public final /* synthetic */ boolean f167656c;

    /* renamed from: eg1.f0$a */
    public static final class C58571a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveViewCallback f167657d;

        public C58571a(FinderLiveViewCallback finderLiveViewCallback) {
            this.f167657d = finderLiveViewCallback;
        }

        public final void run() {
            this.f167657d.f159210d.mo82442H(0);
        }
    }

    public C58570f0(FinderLiveViewCallback finderLiveViewCallback, boolean z, boolean z2) {
        this.f167654a = finderLiveViewCallback;
        this.f167655b = z;
        this.f167656c = z2;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        View c = this.f167654a.f159210d.mo82392c(C0966R.C0970id.dqh);
        View view = null;
        View findViewById = c != null ? c.findViewById(C0966R.C0970id.g3j) : null;
        MMProcessBar mMProcessBar = findViewById instanceof MMProcessBar ? (MMProcessBar) findViewById : null;
        View c2 = this.f167654a.f159210d.mo82392c(C0966R.C0970id.dqh);
        if (c2 != null) {
            view = c2.findViewById(C0966R.C0970id.g2q);
        }
        if (this.f167655b) {
            C58596u uVar = this.f167654a.f159214h;
            boolean z = true;
            if (uVar == null || !uVar.mo77506o()) {
                z = false;
            }
            if (z) {
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
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$refreshLayoutAction$1", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$refreshLayoutAction$1", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                Log.m105924i("Finder.FinderLiveViewCallback", "load more progress bar is show");
            }
        } else if (this.f167656c) {
            if (mMProcessBar != null) {
                mMProcessBar.setVisibility(8);
            }
            if (view != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view3 = view;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$refreshLayoutAction$1", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$refreshLayoutAction$1", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f167654a.f159210d.mo82440F(0);
            Log.m105924i("Finder.FinderLiveViewCallback", "live list load finish is show");
        }
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        Log.m105924i("Finder.FinderLiveViewCallback", "onLoadMoreEnd");
    }

    /* renamed from: d */
    public void mo3680d(int i) {
        Log.m105924i("Finder.FinderLiveViewCallback", "onRefreshBegin");
        FinderLiveViewCallback finderLiveViewCallback = this.f167654a;
        finderLiveViewCallback.f159210d.post(new C58571a(finderLiveViewCallback));
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        ((C54116w) c).jy0(C54067f0.C54082s.ExposureEmpty, -1, -1, -1);
    }

    /* renamed from: e */
    public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        Log.m105924i("Finder.FinderLiveViewCallback", "onRefreshEnd");
    }
}
