package jk2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wechat.rtos.WeChatApi;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import kotlin.Metadata;
import nk2.C21641f;
import q20.C89449a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Ljk2/l;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C89449a
/* renamed from: jk2.l */
public final class C21253l implements C80883e<Bundle, IPCVoid> {
    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt(StateEvent.Name.ERROR_CODE)) : null;
        Log.m105924i("MicroMsg.Rtos.IPCASyncInvokeTask_RtosClose", "invoke RtosClose " + valueOf);
        if ((valueOf == null || valueOf.intValue() != 11) && ((valueOf == null || valueOf.intValue() != 9) && (valueOf == null || valueOf.intValue() != 13))) {
            C21641f.C21643b bVar = C21641f.f61259l;
            C21641f a = bVar.mo33911a();
            if (!a.f61264d) {
                Log.m105924i("MicroMsg.Rtos.RtosWatchService", "already close");
            } else {
                WeChatApi weChatApi = a.f61262b;
                if (weChatApi != null) {
                    weChatApi.cancelLogin();
                }
                Log.m105924i("MicroMsg.Rtos.RtosWatchService", "sleep 1s for sending cancel login");
                Thread.sleep(1000);
            }
            bVar.mo33911a().mo33907a();
        }
        if (gVar != null) {
            gVar.mo894a(new IPCVoid());
        }
    }
}
