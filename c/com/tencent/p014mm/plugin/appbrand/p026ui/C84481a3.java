package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.os.Looper;
import com.tencent.p014mm.autogen.events.AppBrandUIOnStartEvent;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import kotlin.Metadata;
import q20.C89449a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/a3;", "Lcom/tencent/mm/ipcinvoker/d;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C89449a
/* renamed from: com.tencent.mm.plugin.appbrand.ui.a3 */
final class C84481a3 implements C1255d<IPCString, IPCVoid> {
    public void invoke(Object obj, C1256g gVar) {
        String str;
        IPCString iPCString = (IPCString) obj;
        AppBrandUIOnStartEvent appBrandUIOnStartEvent = new AppBrandUIOnStartEvent();
        AppBrandUIOnStartEvent.C80705a aVar = appBrandUIOnStartEvent.f236154d;
        if (iPCString == null || (str = iPCString.f10315d) == null) {
            str = "";
        }
        aVar.f236155a = str;
        appBrandUIOnStartEvent.asyncPublish(Looper.getMainLooper());
        if (gVar != null) {
            gVar.mo894a(IPCVoid.f10316d);
        }
    }
}
