package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.appcache.IPkgInfo;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/v8_snapshot/NodeFakePkgInfo;", "Lcom/tencent/mm/plugin/appbrand/appcache/IPkgInfo;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.NodeFakePkgInfo */
public final class NodeFakePkgInfo implements IPkgInfo {
    public static final Parcelable.Creator<NodeFakePkgInfo> CREATOR = new C84820a();

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.NodeFakePkgInfo$a */
    public static final class C84820a implements Parcelable.Creator<NodeFakePkgInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            parcel.readInt();
            return new NodeFakePkgInfo();
        }

        public Object[] newArray(int i) {
            return new NodeFakePkgInfo[i];
        }
    }

    public String checksumMd5() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public long lastModified() {
        return 0;
    }

    public String pkgPath() {
        return "/assets/node";
    }

    public int pkgVersion() {
        return Integer.MAX_VALUE;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(1);
    }
}
