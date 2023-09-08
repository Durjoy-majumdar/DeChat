package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/v8_snapshot/AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult */
final class C84810x3fae91e0 implements Parcelable {
    public static final Parcelable.Creator<C84810x3fae91e0> CREATOR = new C84811a();

    /* renamed from: d */
    public final int f247247d;

    /* renamed from: e */
    public final String f247248e;

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult$a */
    public static final class C84811a implements Parcelable.Creator<C84810x3fae91e0> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new C84810x3fae91e0(parcel.readInt(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new C84810x3fae91e0[i];
        }
    }

    public C84810x3fae91e0(int i, String str) {
        C87412m.m108594g(str, "errMsg");
        this.f247247d = i;
        this.f247248e = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(this.f247247d);
        parcel.writeString(this.f247248e);
    }
}
