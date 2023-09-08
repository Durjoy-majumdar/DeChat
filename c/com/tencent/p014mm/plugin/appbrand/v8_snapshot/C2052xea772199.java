package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/v8_snapshot/AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult */
final class C2052xea772199 implements Parcelable {
    public static final Parcelable.Creator<C2052xea772199> CREATOR = new C2053a();

    /* renamed from: d */
    public final String f11998d;

    /* renamed from: e */
    public final Map<String, Integer> f11999e;

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult$a */
    public static final class C2053a implements Parcelable.Creator<C2052xea772199> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
            }
            return new C2052xea772199(readString, linkedHashMap);
        }

        public Object[] newArray(int i) {
            return new C2052xea772199[i];
        }
    }

    public C2052xea772199(String str, Map<String, Integer> map) {
        C87412m.m108594g(str, "snapshotPath");
        C87412m.m108594g(map, "contextNameToSnapshotIndexMap");
        this.f11998d = str;
        this.f11999e = map;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f11998d);
        Map<String, Integer> map = this.f11999e;
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeInt(((Number) next.getValue()).intValue());
        }
    }
}
