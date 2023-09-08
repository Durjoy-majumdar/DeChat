package jk2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.wechat.rtos.WeChatApi;
import kotlin.Metadata;
import nk2.C21641f;
import q20.C89449a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Ljk2/f;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Landroid/os/Bundle;", "<init>", "()V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C89449a
/* renamed from: jk2.f */
public final class C21247f implements C80883e<IPCVoid, Bundle> {
    public void invoke(Object obj, C1256g gVar) {
        IPCVoid iPCVoid = (IPCVoid) obj;
        Log.m105924i("MicroMsg.Rtos.IPCASyncInvokeTask_GetLicenceInfo", "invoke GetLicenceInfo");
        C21641f a = C21641f.f61259l.mo33911a();
        C9458e eVar = new C9458e(gVar);
        a.getClass();
        if (!a.f61264d) {
            Log.m105928w("MicroMsg.Rtos.RtosWatchService", "getLicenceInfo but noe init");
            return;
        }
        Log.m105924i("MicroMsg.Rtos.RtosWatchService", "getLicenceInfo");
        a.f61267g = eVar;
        WeChatApi weChatApi = a.f61262b;
        if (weChatApi != null) {
            weChatApi.requireLogin("");
        }
        MTimerHandler mTimerHandler = a.f61263c;
        if (mTimerHandler != null) {
            mTimerHandler.startTimer(10000);
        }
    }
}
