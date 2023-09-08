package uz0;

import android.view.MenuItem;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.CouponAndGiftCardListV4UI;
import java.util.List;

/* renamed from: uz0.i */
public final class C22681i<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ CouponAndGiftCardListV4UI f65230d;

    public C22681i(CouponAndGiftCardListV4UI couponAndGiftCardListV4UI) {
        this.f65230d = couponAndGiftCardListV4UI;
    }

    public void onChanged(Object obj) {
        List list = (List) obj;
        CouponAndGiftCardListV4UI couponAndGiftCardListV4UI = this.f65230d;
        int i = CouponAndGiftCardListV4UI.f52260s;
        couponAndGiftCardListV4UI.getClass();
        if (!(list == null || list.isEmpty())) {
            couponAndGiftCardListV4UI.removeAllOptionMenu();
            couponAndGiftCardListV4UI.addIconOptionMenu(0, 0, (int) C0966R.raw.icons_outlined_more, (MenuItem.OnMenuItemClickListener) new C22696u(couponAndGiftCardListV4UI, list));
        }
    }
}
