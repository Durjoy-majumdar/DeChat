package com.tencent.p014mm.plugin.magicbrush.jsapi.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/jsapi/base/RequestType;", "Landroid/os/Parcelable;", "mb-jsapi_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.magicbrush.jsapi.base.RequestType */
public final class RequestType implements Parcelable {
    public static final Parcelable.Creator<RequestType> CREATOR = new C85277a();

    /* renamed from: d */
    public final IPCString f248434d;

    /* renamed from: e */
    public final IPCString f248435e;

    /* renamed from: com.tencent.mm.plugin.magicbrush.jsapi.base.RequestType$a */
    public static final class C85277a implements Parcelable.Creator<RequestType> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new RequestType((IPCString) parcel.readParcelable(RequestType.class.getClassLoader()), (IPCString) parcel.readParcelable(RequestType.class.getClassLoader()));
        }

        public Object[] newArray(int i) {
            return new RequestType[i];
        }
    }

    public RequestType(IPCString iPCString, IPCString iPCString2) {
        C87412m.m108594g(iPCString, "jsApiName");
        C87412m.m108594g(iPCString2, "dataStr");
        this.f248434d = iPCString;
        this.f248435e = iPCString2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestType)) {
            return false;
        }
        RequestType requestType = (RequestType) obj;
        return C87412m.m108589b(this.f248434d, requestType.f248434d) && C87412m.m108589b(this.f248435e, requestType.f248435e);
    }

    public int hashCode() {
        return (this.f248434d.hashCode() * 31) + this.f248435e.hashCode();
    }

    public String toString() {
        return "RequestType(jsApiName=" + this.f248434d + ", dataStr=" + this.f248435e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeParcelable(this.f248434d, i);
        parcel.writeParcelable(this.f248435e, i);
    }
}
