package com.tencent.luggage.sdk.processes;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/luggage/sdk/processes/LuggageClientProcessMessage2;", "Landroid/os/Parcelable;", "<init>", "()V", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
class LuggageClientProcessMessage2 implements Parcelable {
    public static final Parcelable.Creator<LuggageClientProcessMessage2> CREATOR = new C0931a();

    /* renamed from: com.tencent.luggage.sdk.processes.LuggageClientProcessMessage2$a */
    public static final class C0931a implements Parcelable.Creator<LuggageClientProcessMessage2> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            parcel.readInt();
            return new LuggageClientProcessMessage2();
        }

        public Object[] newArray(int i) {
            return new LuggageClientProcessMessage2[i];
        }
    }

    /* renamed from: a */
    public void mo886a() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(1);
    }
}
