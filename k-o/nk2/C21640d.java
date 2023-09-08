package nk2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import jk2.C21250i;

/* renamed from: nk2.d */
public final class C21640d<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C21635b f61258d;

    public C21640d(C21635b bVar) {
        this.f61258d = bVar;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        IPCVoid iPCVoid = (IPCVoid) obj;
        C21635b bVar = this.f61258d;
        String str = bVar.f61243e;
        String str2 = bVar.f61244f;
        if (!Util.isNullOrNil(str2) || !Util.isNullOrNil(str)) {
            Log.m105925i("MicroMsg.Rtos.RtosServiceImpl", "handleStartUpCheck mac:%s username:%s", str, str2);
            Bundle bundle = new Bundle();
            bundle.putString(TPDownloadProxyEnum.USER_MAC, str);
            bundle.putString("username", str2);
            C80907o.m98781d(WeChatProcess.PROCESS_EXDEVICE, bundle, C21250i.class, new C21639c(bVar));
        }
    }
}
