package com.tencent.luggage.sdk.processes.main;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/luggage/sdk/processes/main/LuggageUpdateTask;", "Lcom/tencent/luggage/sdk/processes/main/LuggageRegisterTask;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class LuggageUpdateTask extends LuggageRegisterTask {
    public static final Parcelable.Creator<LuggageUpdateTask> CREATOR = new C80276a();

    /* renamed from: h */
    public final RuntimeInfo f234987h;

    /* renamed from: com.tencent.luggage.sdk.processes.main.LuggageUpdateTask$a */
    public static final class C80276a implements Parcelable.Creator<LuggageUpdateTask> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new LuggageUpdateTask(RuntimeInfo.CREATOR.createFromParcel(parcel));
        }

        public Object[] newArray(int i) {
            return new LuggageUpdateTask[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LuggageUpdateTask(RuntimeInfo runtimeInfo) {
        super(runtimeInfo);
        C87412m.m108594g(runtimeInfo, "runtimeInfo");
        this.f234987h = runtimeInfo;
    }

    /* renamed from: q */
    public RuntimeInfo mo111416q() {
        return this.f234987h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        this.f234987h.writeToParcel(parcel, i);
    }
}
