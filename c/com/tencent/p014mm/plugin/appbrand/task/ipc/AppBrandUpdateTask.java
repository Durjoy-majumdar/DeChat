package com.tencent.p014mm.plugin.appbrand.task.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.processes.main.RuntimeInfo;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandUpdateTask;", "Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandRegisterTask;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandUpdateTask */
public final class AppBrandUpdateTask extends AppBrandRegisterTask {
    public static final Parcelable.Creator<AppBrandUpdateTask> CREATOR = new C84305a();

    /* renamed from: j */
    public final RuntimeInfo f246189j;

    /* renamed from: n */
    public final int f246190n;

    /* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandUpdateTask$a */
    public static final class C84305a implements Parcelable.Creator<AppBrandUpdateTask> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new AppBrandUpdateTask((RuntimeInfo) parcel.readParcelable(AppBrandUpdateTask.class.getClassLoader()), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new AppBrandUpdateTask[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandUpdateTask(RuntimeInfo runtimeInfo, int i) {
        super(runtimeInfo, i);
        C87412m.m108594g(runtimeInfo, "runtimeinfo");
        this.f246189j = runtimeInfo;
        this.f246190n = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeParcelable(this.f246189j, i);
        parcel.writeInt(this.f246190n);
    }
}
