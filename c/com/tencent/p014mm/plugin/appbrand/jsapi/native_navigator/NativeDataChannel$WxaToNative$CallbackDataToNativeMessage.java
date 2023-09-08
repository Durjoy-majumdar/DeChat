package com.tencent.p014mm.plugin.appbrand.jsapi.native_navigator;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/jsapi/native_navigator/NativeDataChannel$WxaToNative$CallbackDataToNativeMessage", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.native_navigator.NativeDataChannel$WxaToNative$CallbackDataToNativeMessage */
public final class NativeDataChannel$WxaToNative$CallbackDataToNativeMessage implements Parcelable {
    public static final Parcelable.Creator<NativeDataChannel$WxaToNative$CallbackDataToNativeMessage> CREATOR = new C1760a();

    /* renamed from: d */
    public final String f11497d;

    /* renamed from: e */
    public final String f11498e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.native_navigator.NativeDataChannel$WxaToNative$CallbackDataToNativeMessage$a */
    public static final class C1760a implements Parcelable.Creator<NativeDataChannel$WxaToNative$CallbackDataToNativeMessage> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new NativeDataChannel$WxaToNative$CallbackDataToNativeMessage(parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new NativeDataChannel$WxaToNative$CallbackDataToNativeMessage[i];
        }
    }

    public NativeDataChannel$WxaToNative$CallbackDataToNativeMessage(String str, String str2) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "data");
        this.f11497d = str;
        this.f11498e = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeDataChannel$WxaToNative$CallbackDataToNativeMessage)) {
            return false;
        }
        NativeDataChannel$WxaToNative$CallbackDataToNativeMessage nativeDataChannel$WxaToNative$CallbackDataToNativeMessage = (NativeDataChannel$WxaToNative$CallbackDataToNativeMessage) obj;
        return C87412m.m108589b(this.f11497d, nativeDataChannel$WxaToNative$CallbackDataToNativeMessage.f11497d) && C87412m.m108589b(this.f11498e, nativeDataChannel$WxaToNative$CallbackDataToNativeMessage.f11498e);
    }

    public int hashCode() {
        return (this.f11497d.hashCode() * 31) + this.f11498e.hashCode();
    }

    public String toString() {
        return "CallbackDataToNativeMessage(appId=" + this.f11497d + ", data=" + this.f11498e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f11497d);
        parcel.writeString(this.f11498e);
    }
}
