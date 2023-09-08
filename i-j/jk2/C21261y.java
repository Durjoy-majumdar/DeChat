package jk2;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wechat.rtos.WeChatApi;
import kotlin.Metadata;
import nk2.C21641f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Ljk2/y;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: jk2.y */
public final class C21261y implements C80916r<IPCVoid, IPCVoid> {
    public Object invoke(Object obj) {
        IPCVoid iPCVoid = (IPCVoid) obj;
        C21641f a = C21641f.f61259l.mo33911a();
        a.getClass();
        Log.m105924i("MicroMsg.Rtos.RtosWatchService", "wechat logout, try notify unbind");
        WeChatApi weChatApi = a.f61262b;
        if (weChatApi != null) {
            weChatApi.notifyUnbindWechat();
        }
        return new IPCVoid();
    }
}
