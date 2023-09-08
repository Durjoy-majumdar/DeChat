package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/PublishTextStatusParams;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.PublishTextStatusParams */
final class PublishTextStatusParams implements Parcelable {
    public static final Parcelable.Creator<PublishTextStatusParams> CREATOR = new C82013a();

    /* renamed from: d */
    public final String f240479d;

    /* renamed from: e */
    public final String f240480e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.PublishTextStatusParams$a */
    public static final class C82013a implements Parcelable.Creator<PublishTextStatusParams> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new PublishTextStatusParams(parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new PublishTextStatusParams[i];
        }
    }

    public PublishTextStatusParams() {
        this((String) null, (String) null, 3, (C8480h) null);
    }

    public PublishTextStatusParams(String str, String str2) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
        this.f240479d = str;
        this.f240480e = str2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PublishTextStatusParams(appId='" + this.f240479d + "', token='" + this.f240480e + "')";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f240479d);
        parcel.writeString(this.f240480e);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PublishTextStatusParams(String str, String str2, int i, C8480h hVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
