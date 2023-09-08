package jk2;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;
import nk2.C21641f;
import q20.C89449a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Ljk2/j;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C89449a
/* renamed from: jk2.j */
public final class C21251j implements C80883e<IPCInteger, IPCVoid> {
    public void invoke(Object obj, C1256g gVar) {
        IPCInteger iPCInteger = (IPCInteger) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("invoke init service from ");
        sb.append(iPCInteger != null ? Integer.valueOf(iPCInteger.f10313d) : null);
        Log.m105924i("MicroMsg.Rtos.IPCASyncInvokeTask_InitService", sb.toString());
        C21641f.f61259l.mo33911a().mo33908b();
        if (gVar != null) {
            gVar.mo894a(new IPCVoid());
        }
    }
}
