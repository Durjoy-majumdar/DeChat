package com.tencent.luggage.sdk.launching;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/luggage/sdk/launching/OnWXAppResultEventBinder;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class OnWXAppResultEventBinder implements Parcelable {
    public static final Parcelable.Creator<OnWXAppResultEventBinder> CREATOR = new C28640a();

    /* renamed from: d */
    public final int f78579d;

    /* renamed from: e */
    public final String f78580e;

    /* renamed from: com.tencent.luggage.sdk.launching.OnWXAppResultEventBinder$a */
    public static final class C28640a implements Parcelable.Creator<OnWXAppResultEventBinder> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new OnWXAppResultEventBinder(parcel.readInt(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new OnWXAppResultEventBinder[i];
        }
    }

    public OnWXAppResultEventBinder(int i, String str) {
        this.f78579d = i;
        this.f78580e = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnWXAppResultEventBinder)) {
            return false;
        }
        OnWXAppResultEventBinder onWXAppResultEventBinder = (OnWXAppResultEventBinder) obj;
        return this.f78579d == onWXAppResultEventBinder.f78579d && C87412m.m108589b(this.f78580e, onWXAppResultEventBinder.f78580e);
    }

    public int hashCode() {
        int i = this.f78579d * 31;
        String str = this.f78580e;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "OnWXAppResultEventBinder(instance=" + this.f78579d + ", processName=" + this.f78580e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(this.f78579d);
        parcel.writeString(this.f78580e);
    }
}
