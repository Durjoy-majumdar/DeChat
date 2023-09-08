package uz0;

import android.content.DialogInterface;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.CouponAndGiftCardListV4UI;
import qo3.C89779i0;

/* renamed from: uz0.m */
public final class C14397m<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ CouponAndGiftCardListV4UI f39972d;

    public C14397m(CouponAndGiftCardListV4UI couponAndGiftCardListV4UI) {
        this.f39972d = couponAndGiftCardListV4UI;
    }

    public void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        CouponAndGiftCardListV4UI couponAndGiftCardListV4UI = this.f39972d;
        int i = CouponAndGiftCardListV4UI.f52260s;
        couponAndGiftCardListV4UI.getClass();
        if (bool != null) {
            C89779i0 i0Var = null;
            if (bool.booleanValue()) {
                i0Var = C89779i0.m112248e(couponAndGiftCardListV4UI.getContext(), couponAndGiftCardListV4UI.getString(C0966R.string.a4d), true, 3, (DialogInterface.OnCancelListener) null);
            } else {
                C89779i0 i0Var2 = couponAndGiftCardListV4UI.f52267r;
                if (i0Var2 != null) {
                    i0Var2.dismiss();
                }
            }
            couponAndGiftCardListV4UI.f52267r = i0Var;
        }
    }
}
