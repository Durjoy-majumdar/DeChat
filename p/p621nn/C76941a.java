package p621nn;

import com.tencent.p014mm.autogen.events.BannerOnInitEvent;
import com.tencent.p014mm.autogen.events.BannerToAddEvent;
import com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui.C92943c;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import iv0.C21140c;

/* renamed from: nn.a */
public class C76941a extends IStaticListener<BannerOnInitEvent> {
    public boolean callback(IEvent iEvent) {
        BannerOnInitEvent bannerOnInitEvent = (BannerOnInitEvent) iEvent;
        Log.m105924i("MicroMsg.BackupEventListener", "receive BannerOnInitEvent.");
        BannerToAddEvent bannerToAddEvent = new BannerToAddEvent();
        bannerToAddEvent.f193489d.f193492c = new C92943c(bannerOnInitEvent.f193487d.f193488a);
        bannerToAddEvent.f193489d.f193490a = false;
        bannerToAddEvent.publish();
        BannerToAddEvent bannerToAddEvent2 = new BannerToAddEvent();
        bannerToAddEvent2.f193489d.f193492c = new C21140c(bannerOnInitEvent.f193487d.f193488a);
        bannerToAddEvent2.f193489d.f193490a = false;
        bannerToAddEvent2.publish();
        return false;
    }
}
