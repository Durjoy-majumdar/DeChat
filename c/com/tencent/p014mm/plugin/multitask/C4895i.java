package com.tencent.p014mm.plugin.multitask;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitask/i;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-multitask_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitask.i */
public final class C4895i implements C80916r<IPCString, IPCBoolean> {
    public C4895i() {
        Log.m105924i("MicroMsg.MultiTask.GetTaskInfo", "create has task info");
    }

    public Object invoke(Object obj) {
        IPCString iPCString = (IPCString) obj;
        C87412m.m108594g(iPCString, "id");
        String str = iPCString.f10315d;
        C87412m.m108593f(str, "id.value");
        return new IPCBoolean(((C105923s) C86312j.m106911c(C105923s.class)).wx0(str));
    }
}
