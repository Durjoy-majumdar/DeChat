package g00;

import android.content.Intent;
import com.tencent.p014mm.autogen.events.ConsumedCouponCardCodeEvent;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: g00.a0 */
public class C75821a0 extends IStaticListener<ConsumedCouponCardCodeEvent> {
    public boolean callback(IEvent iEvent) {
        ConsumedCouponCardCodeEvent consumedCouponCardCodeEvent = (ConsumedCouponCardCodeEvent) iEvent;
        if (consumedCouponCardCodeEvent instanceof ConsumedCouponCardCodeEvent) {
            Intent intent = new Intent();
            ConsumedCouponCardCodeEvent.C67676a aVar = consumedCouponCardCodeEvent.f193543d;
            if (aVar == null || aVar.f193544a != -1) {
                C44040v3.m48331b().mmOnActivityResult(29, 0, intent);
            } else {
                C44040v3.m48331b().mmOnActivityResult(29, -1, intent);
            }
        }
        return false;
    }
}
