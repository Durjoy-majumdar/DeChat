package com.tencent.p014mm.plugin.appbrand;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/BindRemoteServiceResult;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.BindRemoteServiceResult */
final class BindRemoteServiceResult implements Parcelable {
    public static final Parcelable.Creator<BindRemoteServiceResult> CREATOR = new C81098a();

    /* renamed from: d */
    public final int f238358d;

    /* renamed from: e */
    public final String f238359e;

    /* renamed from: com.tencent.mm.plugin.appbrand.BindRemoteServiceResult$a */
    public static final class C81098a implements Parcelable.Creator<BindRemoteServiceResult> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new BindRemoteServiceResult(parcel.readInt(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new BindRemoteServiceResult[i];
        }
    }

    public BindRemoteServiceResult(int i, String str) {
        this.f238358d = i;
        this.f238359e = str;
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
        return this.f238358d == bindRemoteServiceResult.f238358d && C87412m.m108589b(this.f238359e, bindRemoteServiceResult.f238359e);
    }

    public int hashCode() {
        int i = this.f238358d * 31;
        String str = this.f238359e;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BindRemoteServiceResult(errCode=" + this.f238358d + ", errMsg=" + this.f238359e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(this.f238358d);
        parcel.writeString(this.f238359e);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BindRemoteServiceResult(int i, String str, int i2, C8480h hVar) {
        this(i, (i2 & 2) != 0 ? null : str);
    }
}
