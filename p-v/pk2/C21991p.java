package pk2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.rtos.p320ui.RtosWatchLoginUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import jk2.C21249h;

/* renamed from: pk2.p */
public final class C21991p<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ RtosWatchLoginUI f62245d;

    public C21991p(RtosWatchLoginUI rtosWatchLoginUI) {
        this.f62245d = rtosWatchLoginUI;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        IPCVoid iPCVoid = (IPCVoid) obj;
        RtosWatchLoginUI rtosWatchLoginUI = this.f62245d;
        if (!rtosWatchLoginUI.f53346C) {
            rtosWatchLoginUI.f53345B = true;
            Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "handleScanResult");
            Bundle bundle = new Bundle();
            bundle.putString(TPDownloadProxyEnum.USER_MAC, rtosWatchLoginUI.f53364s);
            bundle.putString("avatar", rtosWatchLoginUI.f53368w);
            C80907o.m98781d(WeChatProcess.PROCESS_EXDEVICE, bundle, C21249h.class, new C21982g(rtosWatchLoginUI));
            C115669n.INSTANCE.mo175911u(1904, 60);
            this.f62245d.f53369x.f60673a = 60;
            return;
        }
        Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "initRtosService ignore. had cancel login.");
    }
}
