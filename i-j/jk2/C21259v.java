package jk2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wechat.rtos.WeChatApi;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import kotlin.Metadata;
import nk2.C21641f;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Ljk2/v;", "Lcom/tencent/mm/ipcinvoker/r;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: jk2.v */
public final class C21259v implements C80916r<Bundle, IPCVoid> {
    public Object invoke(Object obj) {
        WeChatApi weChatApi;
        Bundle bundle = (Bundle) obj;
        Log.m105924i("MicroMsg.Rtos.IPCSyncInvokeTask_OnGetTicketEvent", "invoke OnGetTicketEvent");
        int i = 0;
        int i2 = bundle != null ? bundle.getInt("error_type", 0) : 0;
        if (bundle != null) {
            i = bundle.getInt(StateEvent.Name.ERROR_CODE, 0);
        }
        C21641f a = C21641f.f61259l.mo33911a();
        a.getClass();
        Log.m105924i("MicroMsg.Rtos.RtosWatchService", "onGetTicketEvent errorType:" + i2 + " errorCode:" + i);
        if (!(i == 0 || (weChatApi = a.f61262b) == null)) {
            weChatApi.onGetOAuthTicket("", C112551y.m153807g(""));
        }
        return new IPCVoid();
    }
}
