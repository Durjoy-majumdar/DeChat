package com.tencent.luggage.sdk.processes.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.processes.C80250c;
import com.tencent.luggage.sdk.processes.C80254f;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.luggage.sdk.processes.C80278n;
import com.tencent.p014mm.plugin.appbrand.C1523c3;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/luggage/sdk/processes/main/LuggageStashRuntimeTask;", "Lcom/tencent/luggage/sdk/processes/main/LuggageMainProcessTaskExt;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class LuggageStashRuntimeTask extends LuggageMainProcessTaskExt {
    public static final Parcelable.Creator<LuggageStashRuntimeTask> CREATOR = new C80275a();

    /* renamed from: g */
    public RuntimeInfo f234986g;

    /* renamed from: com.tencent.luggage.sdk.processes.main.LuggageStashRuntimeTask$a */
    public static final class C80275a implements Parcelable.Creator<LuggageStashRuntimeTask> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new LuggageStashRuntimeTask(RuntimeInfo.CREATOR.createFromParcel(parcel));
        }

        public Object[] newArray(int i) {
            return new LuggageStashRuntimeTask[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LuggageStashRuntimeTask(RuntimeInfo runtimeInfo) {
        super(runtimeInfo);
        C87412m.m108594g(runtimeInfo, "runtimeInfo");
        this.f234986g = runtimeInfo;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: j */
    public void mo1553j() {
        super.mo1553j();
        Class cls = C1523c3.class;
        if (C86312j.m106916h(cls)) {
            ((C1523c3) C86312j.m106911c(cls)).waitFor();
        }
        C80254f<C80250c<C80278n>, C80278n> fVar = C80254f.f234946e;
        if (fVar != null) {
            RuntimeInfo runtimeInfo = this.f234986g;
            String str = runtimeInfo.f234989e;
            int i = runtimeInfo.f234990f;
            int i2 = runtimeInfo.f234988d;
            String str2 = runtimeInfo.f234993i;
            C87412m.m108594g(str, "appId");
            C87412m.m108594g(str2, "instanceId");
            Log.m105925i("Luggage.LuggageMiniProgramProcessManager", "stashPersistentApp: appId[%s]versionType[%d]instanceId[%s]processIndex[%d]", str, Integer.valueOf(i), str2, Integer.valueOf(i2));
            C80264l d = fVar.mo111388c(i2).mo111359d(str);
            if (d == null) {
                fVar.mo111388c(i2).mo111370o(str, true, i, str2);
            } else {
                d.f234968d = true;
            }
        } else {
            C87412m.m108603p("INSTANCE_");
            throw null;
        }
    }

    /* renamed from: q */
    public RuntimeInfo mo111416q() {
        return this.f234986g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        this.f234986g.writeToParcel(parcel, i);
    }
}
