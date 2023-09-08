package jk2;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import hk2.C32939b;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Ljk2/s;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: jk2.s */
public final class C33588s implements C80916r<IPCVoid, IPCVoid> {
    public Object invoke(Object obj) {
        IPCVoid iPCVoid = (IPCVoid) obj;
        Log.m105924i("MicroMsg.Rtos.IPCSyncInvokeTask_ClearBindInfo", "invoke ClearBindInfo");
        ((C32939b) C86312j.m106911c(C32939b.class)).mo33888DL();
        return new IPCVoid();
    }
}
