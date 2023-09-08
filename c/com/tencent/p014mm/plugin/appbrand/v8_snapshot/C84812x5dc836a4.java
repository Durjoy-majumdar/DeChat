package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/v8_snapshot/AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult */
final class C84812x5dc836a4 implements Parcelable {
    public static final Parcelable.Creator<C84812x5dc836a4> CREATOR = new C84813a();

    /* renamed from: d */
    public final boolean f247249d;

    /* renamed from: e */
    public final C2052xea772199 f247250e;

    /* renamed from: f */
    public final C84810x3fae91e0 f247251f;

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult$a */
    public static final class C84813a implements Parcelable.Creator<C84812x5dc836a4> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            boolean z = parcel.readInt() != 0;
            C84810x3fae91e0 androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult = null;
            C2052xea772199 createFromParcel = parcel.readInt() == 0 ? null : C2052xea772199.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult = C84810x3fae91e0.CREATOR.createFromParcel(parcel);
            }
            return new C84812x5dc836a4(z, createFromParcel, androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult);
        }

        public Object[] newArray(int i) {
            return new C84812x5dc836a4[i];
        }
    }

    public C84812x5dc836a4(boolean z, C2052xea772199 androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult, C84810x3fae91e0 androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult) {
        this.f247249d = z;
        this.f247250e = androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult;
        this.f247251f = androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(this.f247249d ? 1 : 0);
        C2052xea772199 androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult = this.f247250e;
        if (androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult.writeToParcel(parcel, i);
        }
        C84810x3fae91e0 androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult = this.f247251f;
        if (androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult.writeToParcel(parcel, i);
    }
}
