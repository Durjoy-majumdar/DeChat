package com.tencent.luggage.sdk.config;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/luggage/sdk/config/LaunchWxaAppMigrateInfoParcelized;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class LaunchWxaAppMigrateInfoParcelized implements Parcelable {
    public static final Parcelable.Creator<LaunchWxaAppMigrateInfoParcelized> CREATOR = new C80227a();

    /* renamed from: d */
    public String f234901d;

    /* renamed from: com.tencent.luggage.sdk.config.LaunchWxaAppMigrateInfoParcelized$a */
    public static final class C80227a implements Parcelable.Creator<LaunchWxaAppMigrateInfoParcelized> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new LaunchWxaAppMigrateInfoParcelized(parcel.readString());
        }

        public Object[] newArray(int i) {
            return new LaunchWxaAppMigrateInfoParcelized[i];
        }
    }

    public LaunchWxaAppMigrateInfoParcelized(String str) {
        this.f234901d = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f234901d);
    }

    public LaunchWxaAppMigrateInfoParcelized() {
        this((String) null);
    }
}
