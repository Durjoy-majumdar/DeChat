package jk2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Ljk2/u;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Landroid/os/Bundle;", "<init>", "()V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: jk2.u */
public final class C9459u implements C80916r<IPCVoid, Bundle> {
    public Object invoke(Object obj) {
        IPCVoid iPCVoid = (IPCVoid) obj;
        Log.m105924i("MicroMsg.Rtos.IPCSyncInvokeTask_GetUserName", "invoke get username");
        Bundle bundle = new Bundle();
        bundle.putString("username", C86709a0.m107523b().mo121112j());
        return bundle;
    }
}
