package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/bluetooth/WCBluetoothBackgroundApp;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.WCBluetoothBackgroundApp */
final class WCBluetoothBackgroundApp implements Parcelable {
    public static final Parcelable.Creator<WCBluetoothBackgroundApp> CREATOR = new C29507a();

    /* renamed from: d */
    public final String f80383d;

    /* renamed from: e */
    public final int f80384e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.WCBluetoothBackgroundApp$a */
    public static final class C29507a implements Parcelable.Creator<WCBluetoothBackgroundApp> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new WCBluetoothBackgroundApp(parcel.readString(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new WCBluetoothBackgroundApp[i];
        }
    }

    public WCBluetoothBackgroundApp(String str, int i) {
        C87412m.m108594g(str, "appId");
        this.f80383d = str;
        this.f80384e = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCBluetoothBackgroundApp)) {
            return false;
        }
        WCBluetoothBackgroundApp wCBluetoothBackgroundApp = (WCBluetoothBackgroundApp) obj;
        return C87412m.m108589b(this.f80383d, wCBluetoothBackgroundApp.f80383d) && this.f80384e == wCBluetoothBackgroundApp.f80384e;
    }

    public int hashCode() {
        return (this.f80383d.hashCode() * 31) + this.f80384e;
    }

    public String toString() {
        return "WCBluetoothBackgroundApp(appId=" + this.f80383d + ", versionType=" + this.f80384e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f80383d);
        parcel.writeInt(this.f80384e);
    }
}
