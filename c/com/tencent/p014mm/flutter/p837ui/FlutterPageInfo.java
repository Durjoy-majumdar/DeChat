package com.tencent.p014mm.flutter.p837ui;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/flutter/ui/FlutterPageInfo;", "Landroid/os/Parcelable;", "mm_foundation_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
/* renamed from: com.tencent.mm.flutter.ui.FlutterPageInfo */
public final class FlutterPageInfo implements Parcelable {
    public static final Parcelable.Creator<FlutterPageInfo> CREATOR = new C114722a();

    /* renamed from: d */
    public String f343916d;

    /* renamed from: e */
    public String f343917e;

    /* renamed from: f */
    public String f343918f;

    /* renamed from: g */
    public String f343919g;

    /* renamed from: com.tencent.mm.flutter.ui.FlutterPageInfo$a */
    public static final class C114722a implements Parcelable.Creator<FlutterPageInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new FlutterPageInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new FlutterPageInfo[i];
        }
    }

    public FlutterPageInfo(String str, String str2, String str3, String str4) {
        C87412m.m108594g(str, "engineId");
        C87412m.m108594g(str2, "engineGroupId");
        C87412m.m108594g(str3, "enginePlugin");
        C87412m.m108594g(str4, "engineRoute");
        this.f343916d = str;
        this.f343917e = str2;
        this.f343918f = str3;
        this.f343919g = str4;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f343916d);
        parcel.writeString(this.f343917e);
        parcel.writeString(this.f343918f);
        parcel.writeString(this.f343919g);
    }

    public FlutterPageInfo() {
        this("", "", "", "");
    }
}
