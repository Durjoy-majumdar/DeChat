package com.tencent.p014mm.plugin.appbrand;

import android.content.Context;
import android.os.Parcel;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.RuntimeMigrateRestartHelper;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPreInitTask;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.task.C29636c;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs;", "kotlin.jvm.PlatformType", "args", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/plugin/appbrand/RuntimeMigrateRestartHelper$MigrateRestartPreLaunchResult;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.a4 */
final class C81110a4<InputType, ResultType> implements C1255d {

    /* renamed from: d */
    public static final C81110a4<InputType, ResultType> f238381d = new C81110a4<>();

    public void invoke(Object obj, C1256g gVar) {
        LaunchParcel launchParcel;
        LaunchParcel launchParcel2;
        RuntimeMigrateRestartHelper.MigrateRestartPreLaunchArgs migrateRestartPreLaunchArgs = (RuntimeMigrateRestartHelper.MigrateRestartPreLaunchArgs) obj;
        String str = migrateRestartPreLaunchArgs.f238365d;
        String str2 = migrateRestartPreLaunchArgs.f238366e;
        C29636c cVar = (C29636c) C86312j.m106911c(C29636c.class);
        if (cVar != null) {
            boolean z = true;
            if (str == null || str.length() == 0) {
                launchParcel2 = null;
            } else {
                launchParcel2 = cVar.f80569d.get(str);
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                sb.append(cVar.hashCode());
                sb.append("]get(instanceId:");
                sb.append(str);
                sb.append("), return?");
                if (launchParcel2 == null) {
                    z = false;
                }
                sb.append(z);
                Log.m105924i("MicroMsg.AppBrandLaunchParcelStoreService", sb.toString());
            }
            if (launchParcel2 != null) {
                Parcel obtain = Parcel.obtain();
                obtain.setDataPosition(0);
                launchParcel2.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                launchParcel = new LaunchParcel(obtain);
                obtain.recycle();
                RuntimeMigrateRestartHelper.m99332a(launchParcel, str, str2);
                new AppBrandPreInitTask((Context) null, launchParcel, false, new C85049z3(gVar)).mo115494v();
            }
        }
        launchParcel = new LaunchParcel();
        RuntimeMigrateRestartHelper.m99332a(launchParcel, str, str2);
        new AppBrandPreInitTask((Context) null, launchParcel, false, new C85049z3(gVar)).mo115494v();
    }
}
