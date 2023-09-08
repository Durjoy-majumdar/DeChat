package uz0;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.CouponAndGiftCardListV4UI;

/* renamed from: uz0.q */
public final class C14398q implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ CouponAndGiftCardListV4UI f39973d;

    public C14398q(CouponAndGiftCardListV4UI couponAndGiftCardListV4UI) {
        this.f39973d = couponAndGiftCardListV4UI;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f39973d.getString(C0966R.string.f7944x1));
    }
}
