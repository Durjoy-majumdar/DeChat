package ua3;

import com.tencent.p014mm.autogen.events.BannerOnInitEvent;
import com.tencent.p014mm.autogen.events.BannerToAddEvent;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96740q;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: ua3.a */
public class C78141a extends IStaticListener<BannerOnInitEvent> {
    public boolean callback(IEvent iEvent) {
        BannerToAddEvent bannerToAddEvent = new BannerToAddEvent();
        bannerToAddEvent.f193489d.f193492c = new C96740q(((BannerOnInitEvent) iEvent).f193487d.f193488a);
        bannerToAddEvent.publish();
        return false;
    }
}
