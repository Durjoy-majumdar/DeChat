package il1;

import android.os.Message;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveLoopBannerView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;
import gy3.C87412m;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: il1.i5 */
public final class C60437i5 implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveLoopBannerView<Object, RecyclerView.C16631z> f172324d;

    /* renamed from: il1.i5$a */
    public static final class C60438a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveLoopBannerView<Object, RecyclerView.C16631z> f172325d;

        public C60438a(FinderLiveLoopBannerView<Object, RecyclerView.C16631z> finderLiveLoopBannerView) {
            this.f172325d = finderLiveLoopBannerView;
        }

        public final void run() {
            RecyclerHorizontalViewPager pagerView = this.f172325d.getPagerView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(pagerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoopBannerView$handler$1$1$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            pagerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(pagerView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoopBannerView$handler$1$1$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            this.f172325d.f160084i = 0;
            FinderLiveLoopBannerView.m64078b(this.f172325d);
        }
    }

    public C60437i5(FinderLiveLoopBannerView<Object, RecyclerView.C16631z> finderLiveLoopBannerView) {
        this.f172324d = finderLiveLoopBannerView;
    }

    public final boolean handleMessage(Message message) {
        C87412m.m108594g(message, LocaleUtil.ITALIAN);
        if (message.what == 1) {
            int i = message.arg1;
            this.f172324d.f160084i = i;
            RecyclerHorizontalViewPager pagerView = this.f172324d.getPagerView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(pagerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoopBannerView$handler$1", "handleMessage", "(Landroid/os/Message;)Z", "Undefined", "smoothScrollToPosition", "(I)V");
            pagerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(pagerView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoopBannerView$handler$1", "handleMessage", "(Landroid/os/Message;)Z", "Undefined", "smoothScrollToPosition", "(I)V");
            if (this.f172324d.f160085j) {
                LinkedList<Object> dataList = this.f172324d.getDataList();
                FinderLiveLoopBannerView<Object, RecyclerView.C16631z> finderLiveLoopBannerView = this.f172324d;
                if (i == dataList.size() - 1) {
                    finderLiveLoopBannerView.getPagerView().postDelayed(new C60438a(finderLiveLoopBannerView), 200);
                } else {
                    FinderLiveLoopBannerView.m64078b(finderLiveLoopBannerView);
                }
            }
        }
        return true;
    }
}
