package jk2;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.rtos.bluetooth.RtosBCChannel;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ik2.C21096a;
import ik2.C21097b;
import kotlin.Metadata;
import nk2.C21641f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Ljk2/q;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: jk2.q */
public final class C21257q implements C80916r<IPCBoolean, IPCVoid> {
    public Object invoke(Object obj) {
        C21096a aVar;
        IPCBoolean iPCBoolean = (IPCBoolean) obj;
        Log.m105924i("MicroMsg.Rtos.IPCSyncINvokeTask_OnForegroundChange", "invoke OnForegroundChange");
        C21641f a = C21641f.f61259l.mo33911a();
        Boolean valueOf = iPCBoolean != null ? Boolean.valueOf(iPCBoolean.f10312d) : null;
        a.getClass();
        Log.m105924i("MicroMsg.Rtos.RtosWatchService", "isForeground: " + valueOf);
        if (C87412m.m108589b(valueOf, Boolean.TRUE) && (aVar = a.f61261a) != null) {
            RtosBCChannel rtosBCChannel = (RtosBCChannel) aVar;
            Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "onForeground");
            C21097b bVar = rtosBCChannel.f53339j;
            bVar.f59653a = 0;
            bVar.f59654b = 1000;
            if (!rtosBCChannel.f53338i && !rtosBCChannel.f53337h && rtosBCChannel.mo24199o()) {
                rtosBCChannel.mo24197m();
            }
        }
        return new IPCVoid();
    }
}
