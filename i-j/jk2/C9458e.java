package jk2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import nk2.C21641f;

/* renamed from: jk2.e */
public final class C9458e implements C21641f.C21645d {

    /* renamed from: a */
    public final /* synthetic */ C1256g<Bundle> f29529a;

    public C9458e(C1256g<Bundle> gVar) {
        this.f29529a = gVar;
    }

    /* renamed from: a */
    public void mo10152a(String str, String str2) {
        if (WeChatEnvironment.isCoolassistEnv()) {
            Log.m105925i("MicroMsg.Rtos.IPCASyncInvokeTask_GetLicenceInfo", "invoke GetLicenceInfo deviceId:%s json:%s", str, str2);
        } else {
            Log.m105925i("MicroMsg.Rtos.IPCASyncInvokeTask_GetLicenceInfo", "invoke GetLicenceInfo deviceId:%s json:%s", str, Util.secPrint(str2));
        }
        Bundle bundle = new Bundle();
        bundle.putString("licence", str2);
        bundle.putString(TPDownloadProxyEnum.USER_DEVICE_ID, str);
        C1256g<Bundle> gVar = this.f29529a;
        if (gVar != null) {
            gVar.mo894a(bundle);
        }
    }
}
