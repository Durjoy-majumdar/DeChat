package jk2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import kotlin.Metadata;
import nk2.C21641f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Ljk2/p;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "<init>", "()V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: jk2.p */
public final class C21256p implements C80883e<Bundle, IPCInteger> {
    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        String str = null;
        String string = bundle != null ? bundle.getString(TPDownloadProxyEnum.USER_MAC) : null;
        if (bundle != null) {
            str = bundle.getString("avatar");
        }
        Log.m105925i("MicroMsg.Rtos.IPCASyncInvokeTask_WaitScan", "WaitScan mac:%s avatar:%s", string, str);
        C21641f a = C21641f.f61259l.mo33911a();
        C21255o oVar = new C21255o(gVar);
        a.getClass();
        Log.m105924i("MicroMsg.Rtos.RtosWatchService", "begin waitScanResult");
        a.f61269i = new C21641f.C21648g(string, str, oVar);
    }
}
