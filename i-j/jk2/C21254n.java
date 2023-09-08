package jk2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wechat.rtos.WeChatApi;
import gy3.C8479f0;
import kotlin.Metadata;
import nk2.C21641f;
import q20.C89449a;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Ljk2/n;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C89449a
/* renamed from: jk2.n */
public final class C21254n implements C80883e<Bundle, Bundle> {
    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        Log.m105924i("MicroMsg.Rtos.IPCASyncInvokeTask_RtosLogin", "invoke login");
        byte[] bArr = null;
        String string = bundle != null ? bundle.getString("username") : null;
        String string2 = bundle != null ? bundle.getString("ticket") : null;
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = new Bundle();
        if (Util.isNullOrNil(string2)) {
            Log.m105928w("MicroMsg.Rtos.IPCASyncInvokeTask_RtosLogin", "ticket is empty");
            if (gVar != null) {
                gVar.mo894a(f0Var.f27484d);
                return;
            }
            return;
        }
        C21641f a = C21641f.f61259l.mo33911a();
        C117357m mVar = new C117357m(f0Var, gVar);
        a.getClass();
        if (!a.f61264d) {
            Log.m105928w("MicroMsg.Rtos.RtosWatchService", "inited but not init");
            return;
        }
        a.f61268h = mVar;
        Log.m105924i("MicroMsg.Rtos.RtosWatchService", "onGetOAuthTicket " + string + "  " + string2);
        WeChatApi weChatApi = a.f61262b;
        if (weChatApi != null) {
            if (string2 != null) {
                bArr = C112551y.m153807g(string2);
            }
            weChatApi.onGetOAuthTicket(string, bArr);
        }
    }
}
