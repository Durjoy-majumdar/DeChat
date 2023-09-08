package uz0;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.CouponAndGiftCardListV4UI;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.HistoryCardListUI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import te3.C22517nn;
import te3.C51997xn;
import wz0.C53246b;

/* renamed from: uz0.j */
public final class C22683j<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ CouponAndGiftCardListV4UI f65234d;

    public C22683j(CouponAndGiftCardListV4UI couponAndGiftCardListV4UI) {
        this.f65234d = couponAndGiftCardListV4UI;
    }

    public void onChanged(Object obj) {
        String str;
        C22517nn nnVar = (C22517nn) obj;
        CouponAndGiftCardListV4UI couponAndGiftCardListV4UI = this.f65234d;
        int i = CouponAndGiftCardListV4UI.f52260s;
        couponAndGiftCardListV4UI.getClass();
        if (nnVar != null) {
            int i2 = nnVar.f64330e;
            if (i2 == 1) {
                String str2 = nnVar.f64331f;
                if (str2 != null) {
                    C53246b.m59678j(couponAndGiftCardListV4UI, str2, 0);
                }
            } else if (i2 == 2) {
                C51997xn xnVar = nnVar.f64332g;
                if (xnVar != null) {
                    C53246b.m59674f(xnVar.f144755d, xnVar.f144756e, xnVar.f144757f);
                }
            } else if (i2 == 3 && (str = nnVar.f64333h) != null && C87412m.m108589b(str, "weixin://mktcard/couponv2history")) {
                String str3 = nnVar.f64329d;
                String str4 = couponAndGiftCardListV4UI.f52261i;
                Log.m105924i(str4, "go to coupon history card list: title " + str3);
                Intent intent = new Intent(couponAndGiftCardListV4UI.getContext(), HistoryCardListUI.class);
                intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str3);
                intent.putExtra("card_type", 2);
                AppCompatActivity context = couponAndGiftCardListV4UI.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                AppCompatActivity appCompatActivity = context;
                C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/v4/CouponAndGiftCardListV4UI", "gotoCouponHistoryCardListUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/card/ui/v4/CouponAndGiftCardListV4UI", "gotoCouponHistoryCardListUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C115669n.INSTANCE.mo160131h(19747, 3, 2);
            }
        }
    }
}
