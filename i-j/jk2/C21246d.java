package jk2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.rtos.bluetooth.RtosBCChannel;
import com.tencent.p014mm.sdk.platformtools.Log;
import ik2.C21096a;
import kotlin.Metadata;
import nk2.C21641f;
import q20.C89449a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Ljk2/d;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Landroid/os/Bundle;", "<init>", "()V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C89449a
/* renamed from: jk2.d */
public final class C21246d implements C80883e<IPCVoid, Bundle> {
    public void invoke(Object obj, C1256g gVar) {
        IPCVoid iPCVoid = (IPCVoid) obj;
        Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "invoke check channel ready");
        C21641f a = C21641f.f61259l.mo33911a();
        C87988c cVar = new C87988c(gVar);
        a.getClass();
        if (!a.f61264d) {
            Log.m105928w("MicroMsg.Rtos.RtosWatchService", "getChannelReady not init");
            return;
        }
        String str = "";
        if (a.f61265e) {
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "ChannelReady");
            boolean z = a.f61265e;
            C21096a aVar = a.f61261a;
            if (aVar != null) {
                str = ((RtosBCChannel) aVar).mo24198n();
            }
            cVar.mo33912a(z, str);
            return;
        }
        Log.m105924i("MicroMsg.Rtos.RtosWatchService", "ChannelReady no ready. wait");
        C21096a aVar2 = a.f61261a;
        boolean z2 = true;
        if (aVar2 == null || !((RtosBCChannel) aVar2).mo24199o()) {
            z2 = false;
        }
        if (z2) {
            a.f61266f = cVar;
            C21096a aVar3 = a.f61261a;
            if (aVar3 != null) {
                ((RtosBCChannel) aVar3).mo24197m();
                return;
            }
            return;
        }
        Log.m105928w("MicroMsg.Rtos.RtosWatchService", "no bonded device, can`t establish channel");
        cVar.mo33912a(false, str);
    }
}
