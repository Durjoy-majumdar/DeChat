package p697tm;

import com.tencent.p014mm.autogen.events.AppBrandNotifyMessageStatusChangedEvent;
import com.tencent.p014mm.autogen.events.UpdateAppBrandNotifyMessageEvent;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import wi0.C90992p;

/* renamed from: tm.u1 */
public class C78041u1 extends IStaticListener<UpdateAppBrandNotifyMessageEvent> {
    public boolean callback(IEvent iEvent) {
        UpdateAppBrandNotifyMessageEvent updateAppBrandNotifyMessageEvent = (UpdateAppBrandNotifyMessageEvent) iEvent;
        if (!C86709a0.m107522a()) {
            return false;
        }
        boolean booleanValue = Boolean.valueOf(C81161g2.m99451h1().mo61553Lo(C90992p.C90996d.m114165a(updateAppBrandNotifyMessageEvent.f193976d.f193977a), "true")).booleanValue();
        UpdateAppBrandNotifyMessageEvent.C67804a aVar = updateAppBrandNotifyMessageEvent.f193976d;
        if (booleanValue == aVar.f193978b) {
            Log.m105925i("MicroMsg.SubCoreAppBrand", "update with same value, appId:%s", aVar.f193977a);
        } else {
            C81161g2.m99451h1().mo61552B9(C90992p.C90996d.m114165a(updateAppBrandNotifyMessageEvent.f193976d.f193977a), Boolean.toString(updateAppBrandNotifyMessageEvent.f193976d.f193978b));
            AppBrandNotifyMessageStatusChangedEvent appBrandNotifyMessageStatusChangedEvent = new AppBrandNotifyMessageStatusChangedEvent();
            AppBrandNotifyMessageStatusChangedEvent.C67657a aVar2 = appBrandNotifyMessageStatusChangedEvent.f193472d;
            UpdateAppBrandNotifyMessageEvent.C67804a aVar3 = updateAppBrandNotifyMessageEvent.f193976d;
            aVar2.f193473a = aVar3.f193977a;
            aVar2.f193474b = aVar3.f193978b;
            appBrandNotifyMessageStatusChangedEvent.publish();
        }
        return true;
    }
}
