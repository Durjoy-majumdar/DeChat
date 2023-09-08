package il1;

import android.os.Message;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveTaskBannerView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;
import gy3.C87412m;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: il1.l6 */
public final class C60455l6 implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveTaskBannerView f172365d;

    /* renamed from: il1.l6$a */
    public static final class C60456a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveTaskBannerView f172366d;

        public C60456a(FinderLiveTaskBannerView finderLiveTaskBannerView) {
            this.f172366d = finderLiveTaskBannerView;
        }

        public final void run() {
            RecyclerHorizontalViewPager pagerView = this.f172366d.getPagerView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(pagerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$handler$1$1$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            pagerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(pagerView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$handler$1$1$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            this.f172366d.f160100s = 0;
            this.f172366d.mo78259d();
        }
    }

    public C60455l6(FinderLiveTaskBannerView finderLiveTaskBannerView) {
        this.f172365d = finderLiveTaskBannerView;
    }

    public final boolean handleMessage(Message message) {
        FinderLiveTaskBannerView finderLiveTaskBannerView;
        LinkedList<FinderLiveTaskBannerView.C56133c> linkedList;
        C87412m.m108594g(message, LocaleUtil.ITALIAN);
        int i = message.what;
        FinderLiveTaskBannerView finderLiveTaskBannerView2 = this.f172365d;
        if (i == finderLiveTaskBannerView2.f160094j && finderLiveTaskBannerView2.f160098q) {
            int i2 = message.arg1;
            this.f172365d.f160100s = i2;
            RecyclerHorizontalViewPager pagerView = this.f172365d.getPagerView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i2));
            RecyclerHorizontalViewPager recyclerHorizontalViewPager = pagerView;
            C117292a.m165358d(recyclerHorizontalViewPager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$handler$1", "handleMessage", "(Landroid/os/Message;)Z", "Undefined", "smoothScrollToPosition", "(I)V");
            pagerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerHorizontalViewPager, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$handler$1", "handleMessage", "(Landroid/os/Message;)Z", "Undefined", "smoothScrollToPosition", "(I)V");
            FinderLiveTaskBannerView finderLiveTaskBannerView3 = this.f172365d;
            LinkedList<FinderLiveTaskBannerView.C56133c> linkedList2 = finderLiveTaskBannerView3.f160091g;
            finderLiveTaskBannerView3.mo78258c(linkedList2 != null ? linkedList2.get(i2) : null);
            if (this.f172365d.f160097p && (linkedList = finderLiveTaskBannerView.f160091g) != null) {
                if (i2 == linkedList.size() - 1) {
                    finderLiveTaskBannerView.getPagerView().postDelayed(new C60456a(finderLiveTaskBannerView), 200);
                } else {
                    (finderLiveTaskBannerView = this.f172365d).mo78259d();
                }
            }
        }
        return true;
    }
}
