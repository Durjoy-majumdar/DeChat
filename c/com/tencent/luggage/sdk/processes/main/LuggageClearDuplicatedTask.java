package com.tencent.luggage.sdk.processes.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.processes.C80250c;
import com.tencent.luggage.sdk.processes.C80254f;
import com.tencent.luggage.sdk.processes.C80259g;
import com.tencent.luggage.sdk.processes.C80278n;
import com.tencent.p014mm.plugin.appbrand.C1523c3;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/luggage/sdk/processes/main/LuggageClearDuplicatedTask;", "Lcom/tencent/luggage/sdk/processes/main/LuggageMainProcessTaskExt;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class LuggageClearDuplicatedTask extends LuggageMainProcessTaskExt {
    public static final Parcelable.Creator<LuggageClearDuplicatedTask> CREATOR = new C80266a();

    /* renamed from: g */
    public RuntimeInfo f234976g;

    /* renamed from: com.tencent.luggage.sdk.processes.main.LuggageClearDuplicatedTask$a */
    public static final class C80266a implements Parcelable.Creator<LuggageClearDuplicatedTask> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new LuggageClearDuplicatedTask(RuntimeInfo.CREATOR.createFromParcel(parcel));
        }

        public Object[] newArray(int i) {
            return new LuggageClearDuplicatedTask[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LuggageClearDuplicatedTask(RuntimeInfo runtimeInfo) {
        super(runtimeInfo);
        C87412m.m108594g(runtimeInfo, "runtimeInfo");
        this.f234976g = runtimeInfo;
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
            RuntimeInfo runtimeInfo = this.f234976g;
            int i = runtimeInfo.f234988d;
            String str = runtimeInfo.f234989e;
            C87412m.m108594g(str, "appId");
            fVar.mo111393h(str, -1, new C80259g(fVar, i));
            return;
        }
        C87412m.m108603p("INSTANCE_");
        throw null;
    }

    /* renamed from: q */
    public RuntimeInfo mo111416q() {
        return this.f234976g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        this.f234976g.writeToParcel(parcel, i);
    }
}
