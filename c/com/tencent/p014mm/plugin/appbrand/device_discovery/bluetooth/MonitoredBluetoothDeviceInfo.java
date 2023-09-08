package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import org.json.JSONObject;
import p749xh.C91205f6;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/device_discovery/bluetooth/MonitoredBluetoothDeviceInfo;", "Lxh/f6;", "", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo */
public final class MonitoredBluetoothDeviceInfo extends C91205f6 implements Parcelable {

    /* renamed from: A */
    public static final IAutoDBItem.MAutoDBInfo f239963A = C91205f6.initAutoDBInfo(MonitoredBluetoothDeviceInfo.class);
    public static final C81770a CREATOR = new C81770a((C8480h) null);

    /* renamed from: z */
    public final C13601g f239964z = C36568h.m40985a(new C81771b(this));

    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo$a */
    public static final class C81770a implements Parcelable.Creator<MonitoredBluetoothDeviceInfo> {
        public C81770a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = new MonitoredBluetoothDeviceInfo();
            monitoredBluetoothDeviceInfo.field_appId = parcel.readString();
            monitoredBluetoothDeviceInfo.field_bluetoothDeviceId = parcel.readString();
            monitoredBluetoothDeviceInfo.field_wechatToken = parcel.readString();
            monitoredBluetoothDeviceInfo.field_versionType = parcel.readInt();
            monitoredBluetoothDeviceInfo.field_entryPackage = parcel.readString();
            monitoredBluetoothDeviceInfo.field_updateTime = parcel.readLong();
            return monitoredBluetoothDeviceInfo;
        }

        public Object[] newArray(int i) {
            return new MonitoredBluetoothDeviceInfo[i];
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo$b */
    public static final class C81771b extends C87413o implements C32224a<JSONObject> {

        /* renamed from: d */
        public final /* synthetic */ MonitoredBluetoothDeviceInfo f239965d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81771b(MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
            super(0);
            this.f239965d = monitoredBluetoothDeviceInfo;
        }

        public Object invoke() {
            JSONObject jSONObject = new JSONObject();
            MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = this.f239965d;
            jSONObject.put("appid", monitoredBluetoothDeviceInfo.field_appId);
            jSONObject.put("bluetoothDeviceId", monitoredBluetoothDeviceInfo.field_bluetoothDeviceId);
            jSONObject.put("deviceId", monitoredBluetoothDeviceInfo.field_wechatToken);
            return jSONObject;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C87412m.m108589b(MonitoredBluetoothDeviceInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo");
        MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = (MonitoredBluetoothDeviceInfo) obj;
        String str = this.field_appId;
        if (C87412m.m108589b(str, str)) {
            String str2 = this.field_entryPackage;
            if (C87412m.m108589b(str2, str2)) {
                String str3 = this.field_wechatToken;
                if (C87412m.m108589b(str3, str3)) {
                    String str4 = this.field_bluetoothDeviceId;
                    return C87412m.m108589b(str4, str4);
                }
            }
        }
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f239963A;
    }

    public int hashCode() {
        return (((((((this.field_appId.hashCode() * 31) + this.field_versionType) * 31) + this.field_entryPackage.hashCode()) * 31) + this.field_wechatToken.hashCode()) * 31) + this.field_bluetoothDeviceId.hashCode();
    }

    public boolean isValid() {
        String str = this.field_appId;
        if (str == null || str.length() == 0) {
            return false;
        }
        String str2 = this.field_bluetoothDeviceId;
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        String str3 = this.field_wechatToken;
        if (str3 == null || str3.length() == 0) {
            return false;
        }
        int i = this.field_versionType;
        return 1 == i || 2 == i || i == 0;
    }

    public String toString() {
        return "MonitoredBluetoothDeviceInfo(appId=" + this.field_appId + ", bluetoothDeviceId=" + this.field_bluetoothDeviceId + ", wechatToken=" + this.field_wechatToken + ", versionType=" + this.field_versionType + ", entryPackage=" + this.field_entryPackage + ", updateTime=" + this.field_updateTime + ", isBlocked=" + this.field_isBlocked + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.field_appId);
        parcel.writeString(this.field_bluetoothDeviceId);
        parcel.writeString(this.field_wechatToken);
        parcel.writeInt(this.field_versionType);
        parcel.writeString(this.field_entryPackage);
        parcel.writeLong(this.field_updateTime);
    }
}
