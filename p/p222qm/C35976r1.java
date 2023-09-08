package p222qm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.StartWebViewEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import ke3.C88144b;

/* renamed from: qm.r1 */
public class C35976r1 extends IStaticListener<StartWebViewEvent> {
    public boolean callback(IEvent iEvent) {
        C80610p1 p1Var = C80610p1.f235824f;
        StartWebViewEvent.C28835a aVar = ((StartWebViewEvent) iEvent).f79011d;
        Context context = aVar.f79013b;
        String str = aVar.f79012a;
        if (context == null || Util.isNullOrNil(str)) {
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        return false;
    }
}
