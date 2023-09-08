package p541gv;

import com.tencent.p014mm.autogen.events.BannerOnInitEvent;
import com.tencent.p014mm.autogen.events.BannerToAddEvent;
import com.tencent.p014mm.plugin.music.p080ui.C94242j;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import f40.C86709a0;

/* renamed from: gv.j */
public class C76069j extends IStaticListener<BannerOnInitEvent> {
    public boolean callback(IEvent iEvent) {
        BannerOnInitEvent bannerOnInitEvent = (BannerOnInitEvent) iEvent;
        if (!C86709a0.m107522a()) {
            return false;
        }
        BannerToAddEvent bannerToAddEvent = new BannerToAddEvent();
        bannerToAddEvent.f193489d.f193492c = new C94242j(bannerOnInitEvent.f193487d.f193488a);
        bannerToAddEvent.publish();
        return false;
    }
}
