package com.tencent.luggage.sdk.processes;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/luggage/sdk/processes/LuggageServiceType;", "", "Landroid/os/Parcelable;", "WASERVICE", "WAGAME", "NIL", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public enum LuggageServiceType implements Parcelable {
    WASERVICE,
    WAGAME,
    NIL;
    
    public static final Parcelable.Creator<LuggageServiceType> CREATOR = null;

    /* renamed from: com.tencent.luggage.sdk.processes.LuggageServiceType$a */
    public static final class C80248a implements Parcelable.Creator<LuggageServiceType> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return LuggageServiceType.valueOf(parcel.readString());
        }

        public Object[] newArray(int i) {
            return new LuggageServiceType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new C80248a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(name());
    }
}
