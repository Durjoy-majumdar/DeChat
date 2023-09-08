package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.os.Looper;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kotlin.Metadata;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.t2 */
public final class C29673t2 {

    /* renamed from: a */
    public static final C29673t2 f80631a = new C29673t2();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/t2$a;", "Lcom/tencent/mm/ipcinvoker/d;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.ui.t2$a */
    public static final class C29674a implements C1255d<IPCString, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            String str;
            IPCString iPCString = (IPCString) obj;
            AppBrandUIEnterAnimationCompleteEvent appBrandUIEnterAnimationCompleteEvent = new AppBrandUIEnterAnimationCompleteEvent();
            AppBrandUIEnterAnimationCompleteEvent.C29631a aVar = appBrandUIEnterAnimationCompleteEvent.f80563d;
            if (iPCString == null || (str = iPCString.f10315d) == null) {
                str = "";
            }
            aVar.f80564a = str;
            appBrandUIEnterAnimationCompleteEvent.asyncPublish(Looper.getMainLooper());
            if (gVar != null) {
                gVar.mo894a(IPCVoid.f10316d);
            }
        }
    }

    /* renamed from: a */
    public final void mo56894a(String str, String str2) {
        if (!(str == null || str.length() == 0)) {
            String str3 = str2 == null ? "null" : str2;
            Log.m105924i("MicroMsg.AppBrandUIEnterAnimationCompleteIPCNotify", "doNotify current:" + MMApplicationContext.getProcessName() + ", target:" + str + ", activity:" + str2);
            XIPCInvoker.m98748a(str, new IPCString(str3), C29674a.class, (C1256g) null);
        }
    }
}
