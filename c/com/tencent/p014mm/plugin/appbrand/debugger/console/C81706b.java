package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;
import zp3.C23564m;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "kotlin.jvm.PlatformType", "bundle", "Landroid/os/Bundle;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.b */
final class C81706b<InputType, ResultType> implements C80916r {

    /* renamed from: a */
    public static final C81706b<InputType, ResultType> f239811a = new C81706b<>();

    public Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.setClassLoader(ConsoleDebugLogImpl.LogInfo.class.getClassLoader());
        Parcelable[] parcelableArray = bundle.getParcelableArray("BatchLogInfo");
        if (parcelableArray == null) {
            Log.m105924i("MicroMsg.AppBrand.ConsoleDebugLogImpl", "flushLogBuffer, uncheckedBatchLogInfo is null");
            return IPCVoid.f10316d;
        }
        C23564m.m28136f(new C81705a(parcelableArray));
        return IPCVoid.f10316d;
    }
}
