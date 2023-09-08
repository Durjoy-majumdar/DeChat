package u63;

import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.plugin.wallet_payu.create.p807ui.WalletPayUOpenIntroView;

/* renamed from: u63.a */
public class C78132a implements ViewPager.OnPageChangeListener {

    /* renamed from: d */
    public final /* synthetic */ WalletPayUOpenIntroView f228975d;

    public C78132a(WalletPayUOpenIntroView walletPayUOpenIntroView) {
        this.f228975d = walletPayUOpenIntroView;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        if (this.f228975d.f211159d.getParent() != null) {
            this.f228975d.f211159d.getParent().requestDisallowInterceptTouchEvent(true);
        }
        this.f228975d.f211160e.setPage(i);
    }
}
