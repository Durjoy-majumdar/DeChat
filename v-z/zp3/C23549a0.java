package zp3;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.view.MediaBanner;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: zp3.a0 */
public final class C23549a0 extends RecyclerView.C16615g {

    /* renamed from: a */
    public final /* synthetic */ MediaBanner<RecyclerView.C16631z> f67527a;

    public C23549a0(MediaBanner<RecyclerView.C16631z> mediaBanner) {
        this.f67527a = mediaBanner;
    }

    /* renamed from: b */
    public void mo2556b() {
        RecyclerView.C16613e<RecyclerView.C16631z> adapter = this.f67527a.getAdapter();
        if (adapter != null) {
            MediaBanner<RecyclerView.C16631z> mediaBanner = this.f67527a;
            mediaBanner.getIndicator().setCount(adapter.getItemCount());
            if (mediaBanner.getIndicator().getCount() > 0) {
                RecyclerHorizontalViewPager pagerView = mediaBanner.getPagerView();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                RecyclerHorizontalViewPager recyclerHorizontalViewPager = pagerView;
                C117292a.m165358d(recyclerHorizontalViewPager, aVar.mo10232b(), "com/tencent/mm/view/MediaBanner$dataObserver$1", "onChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
                pagerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerHorizontalViewPager, "com/tencent/mm/view/MediaBanner$dataObserver$1", "onChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
    }

    /* renamed from: e */
    public void mo2559e(int i, int i2) {
        RecyclerView.C16613e<RecyclerView.C16631z> adapter = this.f67527a.getAdapter();
        if (adapter != null) {
            this.f67527a.getIndicator().setCount(adapter.getItemCount());
        }
    }

    /* renamed from: g */
    public void mo2560g(int i, int i2) {
        RecyclerView.C16613e<RecyclerView.C16631z> adapter = this.f67527a.getAdapter();
        if (adapter != null) {
            this.f67527a.getIndicator().setCount(adapter.getItemCount());
        }
    }
}
