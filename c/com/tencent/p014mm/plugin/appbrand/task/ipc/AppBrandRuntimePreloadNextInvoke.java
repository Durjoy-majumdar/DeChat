package com.tencent.p014mm.plugin.appbrand.task.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.processes.LuggageServiceType;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import kr0.C88273g1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandRuntimePreloadNextInvoke;", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandRuntimePreloadNextInvoke */
public final class AppBrandRuntimePreloadNextInvoke extends MainProcessTask {
    public static final Parcelable.Creator<AppBrandRuntimePreloadNextInvoke> CREATOR = new C29651a();

    /* renamed from: f */
    public final LuggageServiceType f246188f;

    /* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandRuntimePreloadNextInvoke$a */
    public static final class C29651a implements Parcelable.Creator<AppBrandRuntimePreloadNextInvoke> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new AppBrandRuntimePreloadNextInvoke((LuggageServiceType) parcel.readParcelable(AppBrandRuntimePreloadNextInvoke.class.getClassLoader()));
        }

        public Object[] newArray(int i) {
            return new AppBrandRuntimePreloadNextInvoke[i];
        }
    }

    public AppBrandRuntimePreloadNextInvoke(LuggageServiceType luggageServiceType) {
        C87412m.m108594g(luggageServiceType, "serviceType");
        this.f246188f = luggageServiceType;
    }

    /* renamed from: j */
    public void mo1553j() {
        StringBuilder sb = new StringBuilder();
        sb.append("runInMainProcess, serviceType:");
        sb.append(this.f246188f);
        sb.append(", isAppForeground:");
        AppForegroundDelegate appForegroundDelegate = AppForegroundDelegate.INSTANCE;
        sb.append(appForegroundDelegate.f343454n);
        Log.m105924i("MicroMsg.AppBrandRuntimePreloadNextInvoke", sb.toString());
        if (appForegroundDelegate.f343454n) {
            AppBrandProcessesManager.f246131g.mo116962a().mo116954S(this.f246188f, C88273g1.APPBRAND_RUNTIME_PRELOAD_NEXT);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeParcelable(this.f246188f, i);
    }
}
