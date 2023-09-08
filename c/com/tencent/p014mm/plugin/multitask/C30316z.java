package com.tencent.p014mm.plugin.multitask;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.multitask.C105923s;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitask/z;", "Lcom/tencent/mm/ipcinvoker/r;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-multitask_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitask.z */
public final class C30316z implements C80916r<Bundle, IPCString> {
    public C30316z() {
        Log.m105924i("MicroMsg.MultiTask.getMultiTaskItemPosition", "create multiTaskItemPosition");
    }

    public Object invoke(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        if (bundle == null || (str = bundle.getString("id")) == null) {
            str = "";
        }
        int i = -1;
        int i2 = bundle != null ? bundle.getInt("curPos") : -1;
        if (bundle != null) {
            i = bundle.getInt("way");
        }
        ((C105923s) C86312j.m106911c(C105923s.class)).getClass();
        C105923s.C30306a aVar = C105923s.f315123o;
        return new IPCString(aVar != null ? aVar.mo57275P(str, i2, i) : null);
    }
}
