package g00;

import android.content.Intent;
import com.tencent.p014mm.autogen.events.AcceptCouponCardEvent;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: g00.y */
public class C75823y extends IStaticListener<AcceptCouponCardEvent> {
    public boolean callback(IEvent iEvent) {
        AcceptCouponCardEvent acceptCouponCardEvent = (AcceptCouponCardEvent) iEvent;
        if (acceptCouponCardEvent instanceof AcceptCouponCardEvent) {
            Intent intent = new Intent();
            AcceptCouponCardEvent.C67655a aVar = acceptCouponCardEvent.f193467d;
            if (aVar != null) {
                intent.putExtra("card_list", aVar.f193468a);
                intent.putExtra("result_code", acceptCouponCardEvent.f193467d.f193469b);
            }
            AcceptCouponCardEvent.C67655a aVar2 = acceptCouponCardEvent.f193467d;
            if (aVar2 == null || aVar2.f193469b != -1) {
                C44040v3.m48331b().mmOnActivityResult(16, 0, intent);
            } else {
                C44040v3.m48331b().mmOnActivityResult(16, -1, intent);
            }
        }
        return false;
    }
}
