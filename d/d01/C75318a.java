package d01;

import android.app.Activity;
import com.tencent.p014mm.autogen.events.BannerOnInitEvent;
import com.tencent.p014mm.autogen.events.BannerToAddEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import gy3.C87412m;
import zz0.C16420b;

/* renamed from: d01.a */
public final class C75318a extends IStaticListener<BannerOnInitEvent> {
    public boolean callback(IEvent iEvent) {
        BannerOnInitEvent bannerOnInitEvent = (BannerOnInitEvent) iEvent;
        C87412m.m108594g(bannerOnInitEvent, "event");
        BannerToAddEvent bannerToAddEvent = new BannerToAddEvent();
        BannerToAddEvent.C67662a aVar = bannerToAddEvent.f193489d;
        Activity activity = bannerOnInitEvent.f193487d.f193488a;
        C87412m.m108593f(activity, "event.data.activity");
        aVar.f193492c = new C16420b(activity);
        bannerToAddEvent.publish();
        return false;
    }
}
