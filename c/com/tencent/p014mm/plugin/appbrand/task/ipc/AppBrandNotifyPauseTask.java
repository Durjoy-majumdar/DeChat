package com.tencent.p014mm.plugin.appbrand.task.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.processes.main.LuggageMainProcessTaskExt;
import com.tencent.luggage.sdk.processes.main.RuntimeInfo;
import com.tencent.p014mm.plugin.appbrand.report.model.C84144h;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandNotifyPauseTask;", "Lcom/tencent/luggage/sdk/processes/main/LuggageMainProcessTaskExt;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandNotifyPauseTask */
public final class AppBrandNotifyPauseTask extends LuggageMainProcessTaskExt {
    public static final Parcelable.Creator<AppBrandNotifyPauseTask> CREATOR = new C84301a();

    /* renamed from: g */
    public final RuntimeInfo f246183g;

    /* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandNotifyPauseTask$a */
    public static final class C84301a implements Parcelable.Creator<AppBrandNotifyPauseTask> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new AppBrandNotifyPauseTask((RuntimeInfo) parcel.readParcelable(AppBrandNotifyPauseTask.class.getClassLoader()));
        }

        public Object[] newArray(int i) {
            return new AppBrandNotifyPauseTask[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandNotifyPauseTask(RuntimeInfo runtimeInfo) {
        super(runtimeInfo);
        C87412m.m108594g(runtimeInfo, "runtimeInfo");
        this.f246183g = runtimeInfo;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: j */
    public void mo1553j() {
        super.mo1553j();
        C84144h hVar = C84144h.INSTANCE;
        C84144h.C84145a aVar = (C84144h.C84145a) ((HashMap) hVar.f245651d).get(this.f246183g.f234989e);
        if (aVar != null) {
            aVar.f245652a = Util.nowMilliSecond();
        }
    }

    /* renamed from: q */
    public RuntimeInfo mo111416q() {
        return this.f246183g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeParcelable(this.f246183g, i);
    }
}
