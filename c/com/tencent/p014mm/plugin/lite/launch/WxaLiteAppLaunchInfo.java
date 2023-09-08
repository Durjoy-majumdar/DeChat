package com.tencent.p014mm.plugin.lite.launch;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/lite/launch/WxaLiteAppLaunchInfo;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "luggage-lite-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.lite.launch.WxaLiteAppLaunchInfo */
public final class WxaLiteAppLaunchInfo implements Parcelable {
    public static final C115481a CREATOR = new C115481a((C8480h) null);

    /* renamed from: d */
    public String f346214d = "";

    /* renamed from: e */
    public String f346215e = "";

    /* renamed from: f */
    public String f346216f = "";

    /* renamed from: g */
    public String f346217g = "";

    /* renamed from: h */
    public String f346218h = "";

    /* renamed from: i */
    public String f346219i = "";

    /* renamed from: j */
    public long f346220j;

    /* renamed from: com.tencent.mm.plugin.lite.launch.WxaLiteAppLaunchInfo$a */
    public static final class C115481a implements Parcelable.Creator<WxaLiteAppLaunchInfo> {
        public C115481a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            WxaLiteAppLaunchInfo wxaLiteAppLaunchInfo = new WxaLiteAppLaunchInfo();
            String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            wxaLiteAppLaunchInfo.f346214d = readString;
            wxaLiteAppLaunchInfo.f346215e = parcel.readString();
            wxaLiteAppLaunchInfo.f346216f = parcel.readString();
            wxaLiteAppLaunchInfo.f346217g = parcel.readString();
            wxaLiteAppLaunchInfo.f346218h = parcel.readString();
            wxaLiteAppLaunchInfo.f346219i = parcel.readString();
            wxaLiteAppLaunchInfo.f346220j = parcel.readLong();
            return wxaLiteAppLaunchInfo;
        }

        public Object[] newArray(int i) {
            return new WxaLiteAppLaunchInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "appId:" + this.f346214d + " \n pkgPath: " + this.f346215e + " signatureKey :xxx";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        parcel.writeString(this.f346214d);
        parcel.writeString(this.f346215e);
        parcel.writeString(this.f346216f);
        parcel.writeString(this.f346217g);
        parcel.writeString(this.f346218h);
        parcel.writeString(this.f346219i);
        parcel.writeLong(this.f346220j);
    }
}
