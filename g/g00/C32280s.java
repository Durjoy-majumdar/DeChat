package g00;

import com.tencent.p014mm.autogen.events.WxaPkgDownloadCompleteNotifyEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gy3.C87412m;
import kj2.C117407d;
import kr0.C33987b1;
import q73.C35796c0;
import q73.C35801d0;
import te3.C49168dn;
import zt3.C119157j;

/* renamed from: g00.s */
public final class C32280s extends IStaticListener<WxaPkgDownloadCompleteNotifyEvent> {

    /* renamed from: d */
    public final String f85741d = "WebCanvasPkgUpdateEventListener";

    public boolean callback(IEvent iEvent) {
        WxaPkgDownloadCompleteNotifyEvent wxaPkgDownloadCompleteNotifyEvent = (WxaPkgDownloadCompleteNotifyEvent) iEvent;
        C87412m.m108594g(wxaPkgDownloadCompleteNotifyEvent, "event");
        String str = this.f85741d;
        WxaPkgDownloadCompleteNotifyEvent.C28858a aVar = wxaPkgDownloadCompleteNotifyEvent.f79073d;
        Log.m105927v(str, "pkgUpdateEventListener appId=%s, debugType: %s", aVar.f79074a, Integer.valueOf(aVar.f79078e));
        WxaPkgDownloadCompleteNotifyEvent.C28858a aVar2 = wxaPkgDownloadCompleteNotifyEvent.f79073d;
        if (aVar2.f79078e != 0) {
            return true;
        }
        String str2 = aVar2.f79074a;
        C35796c0 c0Var = C35796c0.f95588a;
        if (!c0Var.mo60407i().contains(str2)) {
            return false;
        }
        C33987b1 b1Var = (C33987b1) C86312j.m106911c(C33987b1.class);
        if (b1Var != null) {
            b1Var.mo59394hF(str2, wxaPkgDownloadCompleteNotifyEvent.f79073d.f79077d);
        }
        Log.m105925i(this.f85741d, "pkgUpdateEventListener appId=%s, version=%d, md5=%s", str2, Integer.valueOf(wxaPkgDownloadCompleteNotifyEvent.f79073d.f79077d), wxaPkgDownloadCompleteNotifyEvent.f79073d.f79076c);
        C117407d.INSTANCE.mo182089r(1454, 62, 1);
        C87412m.m108593f(str2, "tmpAppId");
        String str3 = wxaPkgDownloadCompleteNotifyEvent.f79073d.f79075b;
        C87412m.m108593f(str3, "event.data.filePath");
        ((C119157j) C119157j.f356862d).mo183875f(new C35801d0(str3, str2, 0));
        if (!C86013q1.m106450k(wxaPkgDownloadCompleteNotifyEvent.f79073d.f79075b)) {
            return false;
        }
        String str4 = C35796c0.f95589b + XVFSFile.SEPARATOR_CHAR + str2;
        if (!C86013q1.m106450k(str4)) {
            C86013q1.m106461v(str4);
        }
        String str5 = str4 + XVFSFile.SEPARATOR_CHAR + System.currentTimeMillis() + ".wcpkg";
        C86013q1.m106442c(wxaPkgDownloadCompleteNotifyEvent.f79073d.f79075b, str5);
        C49168dn dnVar = new C49168dn();
        dnVar.f132423d = str2;
        dnVar.f132424e = new C86009m1(str5).mo119971i();
        WxaPkgDownloadCompleteNotifyEvent.C28858a aVar3 = wxaPkgDownloadCompleteNotifyEvent.f79073d;
        dnVar.f132425f = aVar3.f79077d;
        dnVar.f132426g = aVar3.f79078e;
        dnVar.f132427h = aVar3.f79076c;
        try {
            c0Var.mo60412n(str2, dnVar);
            return false;
        } catch (Exception e) {
            Log.m105920e(this.f85741d, "save pkg info fail " + e.getMessage());
            return false;
        }
    }
}
