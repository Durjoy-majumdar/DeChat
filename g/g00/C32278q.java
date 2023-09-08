package g00;

import com.tencent.p014mm.autogen.events.WxaPkgDownloadCompleteNotifyEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import kj2.C117407d;
import q73.C35812s;
import rx3.C36570n;

/* renamed from: g00.q */
public final class C32278q extends IStaticListener<WxaPkgDownloadCompleteNotifyEvent> {

    /* renamed from: d */
    public final String f85737d = "WebCanvasDownPkgUpdateEventListener";

    public boolean callback(IEvent iEvent) {
        WxaPkgDownloadCompleteNotifyEvent wxaPkgDownloadCompleteNotifyEvent = (WxaPkgDownloadCompleteNotifyEvent) iEvent;
        C87412m.m108594g(wxaPkgDownloadCompleteNotifyEvent, "event");
        String str = this.f85737d;
        WxaPkgDownloadCompleteNotifyEvent.C28858a aVar = wxaPkgDownloadCompleteNotifyEvent.f79073d;
        Log.m105927v(str, "pkgUpdateEventListener appId=%s, debugType: %s", aVar.f79074a, Integer.valueOf(aVar.f79078e));
        WxaPkgDownloadCompleteNotifyEvent.C28858a aVar2 = wxaPkgDownloadCompleteNotifyEvent.f79073d;
        if (aVar2.f79078e != 0) {
            return true;
        }
        String str2 = aVar2.f79074a;
        C35812s sVar = C35812s.f95615a;
        if (!((LinkedList) ((C36570n) C35812s.f95616b).getValue()).contains(str2)) {
            return false;
        }
        C117407d.INSTANCE.mo182089r(1454, 55, 1);
        C87412m.m108593f(str2, "tmpAppId");
        sVar.mo60425f(str2, wxaPkgDownloadCompleteNotifyEvent.f79073d.f79077d);
        Log.m105925i(this.f85737d, "pkgUpdateEventListener appId=%s, version=%d, md5=%s", str2, Integer.valueOf(wxaPkgDownloadCompleteNotifyEvent.f79073d.f79077d), wxaPkgDownloadCompleteNotifyEvent.f79073d.f79076c);
        return false;
    }
}
