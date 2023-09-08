package com.tencent.p014mm.plugin.appbrand.headless;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/headless/BindRemoteServiceResult;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.headless.BindRemoteServiceResult */
final class BindRemoteServiceResult implements Parcelable {
    public static final Parcelable.Creator<BindRemoteServiceResult> CREATOR = new C81903a();

    /* renamed from: d */
    public final int f240239d;

    /* renamed from: e */
    public final String f240240e;

    /* renamed from: com.tencent.mm.plugin.appbrand.headless.BindRemoteServiceResult$a */
    public static final class C81903a implements Parcelable.Creator<BindRemoteServiceResult> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new BindRemoteServiceResult(parcel.readInt(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new BindRemoteServiceResult[i];
        }
    }

    public BindRemoteServiceResult(int i, String str) {
        this.f240239d = i;
        this.f240240e = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindRemoteServiceResult)) {
            return false;
        }
        BindRemoteServiceResult bindRemoteServiceResult = (BindRemoteServiceResult) obj;
        return this.f240239d == bindRemoteServiceResult.f240239d && C87412m.m108589b(this.f240240e, bindRemoteServiceResult.f240240e);
    }

    public int hashCode() {
        int i = this.f240239d * 31;
        String str = this.f240240e;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BindRemoteServiceResult(errCode=" + this.f240239d + ", errMsg=" + this.f240240e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(this.f240239d);
        parcel.writeString(this.f240240e);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BindRemoteServiceResult(int i, String str, int i2, C8480h hVar) {
        this(i, (i2 & 2) != 0 ? null : str);
    }
}
