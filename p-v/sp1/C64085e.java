package sp1;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: sp1.e */
public final class C64085e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextView f181700d;

    /* renamed from: e */
    public final /* synthetic */ View f181701e;

    /* renamed from: f */
    public final /* synthetic */ FinderLiveShopHotSellView f181702f;

    /* renamed from: g */
    public final /* synthetic */ FinderLiveShopHotSellView.C56310b f181703g;

    public C64085e(TextView textView, View view, FinderLiveShopHotSellView finderLiveShopHotSellView, FinderLiveShopHotSellView.C56310b bVar) {
        this.f181700d = textView;
        this.f181701e = view;
        this.f181702f = finderLiveShopHotSellView;
        this.f181703g = bVar;
    }

    public final void run() {
        this.f181700d.setVisibility(0);
        View view = this.f181701e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopHotSellView$bgEnterAnim$2$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopHotSellView$bgEnterAnim$2$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f181701e.setTranslationY((float) this.f181702f.getE_A());
        ViewPropertyAnimator translationY = this.f181701e.animate().translationY(0.0f);
        FinderLiveShopHotSellView.C56310b bVar = this.f181703g;
        int i = bVar.f160956a - bVar.f160957b;
        if (i < 100) {
            i = 100;
        }
        translationY.setDuration((long) i).start();
    }
}
