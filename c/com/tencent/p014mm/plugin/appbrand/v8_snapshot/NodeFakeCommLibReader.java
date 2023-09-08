package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import android.content.res.AssetFileDescriptor;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.appcache.IPkgInfo;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import gy3.C8480h;
import gy3.C87412m;
import java.io.InputStream;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/v8_snapshot/NodeFakeCommLibReader;", "Lcom/tencent/mm/plugin/appbrand/appstorage/ICommLibReader;", "Lcom/tencent/mm/plugin/appbrand/appcache/IPkgInfo;", "pkgInfo", "<init>", "(Lcom/tencent/mm/plugin/appbrand/appcache/IPkgInfo;)V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.NodeFakeCommLibReader */
public final class NodeFakeCommLibReader implements ICommLibReader {
    public static final Parcelable.Creator<NodeFakeCommLibReader> CREATOR = new C84819a();

    /* renamed from: d */
    public final IPkgInfo f247257d;

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.NodeFakeCommLibReader$a */
    public static final class C84819a implements Parcelable.Creator<NodeFakeCommLibReader> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new NodeFakeCommLibReader((IPkgInfo) parcel.readParcelable(NodeFakeCommLibReader.class.getClassLoader()));
        }

        public Object[] newArray(int i) {
            return new NodeFakeCommLibReader[i];
        }
    }

    public NodeFakeCommLibReader() {
        this((IPkgInfo) null, 1, (C8480h) null);
    }

    public NodeFakeCommLibReader(IPkgInfo iPkgInfo) {
        C87412m.m108594g(iPkgInfo, "pkgInfo");
        this.f247257d = iPkgInfo;
    }

    /* renamed from: M */
    public String mo113367M() {
        return String.valueOf(mo113371a());
    }

    public String Yk0(String str) {
        return null;
    }

    /* renamed from: a */
    public int mo113371a() {
        return this.f247257d.pkgVersion();
    }

    /* renamed from: b */
    public String mo113372b(String str) {
        return null;
    }

    /* renamed from: c */
    public IPkgInfo mo113379c() {
        return this.f247257d;
    }

    public void close() {
    }

    public int compareTo(Object obj) {
        ICommLibReader iCommLibReader = (ICommLibReader) obj;
        if (iCommLibReader == null) {
            return -1;
        }
        if (C87412m.m108589b(iCommLibReader.getClass(), NodeFakeCommLibReader.class) && iCommLibReader.mo113371a() > 0 && iCommLibReader.mo113371a() == mo113371a()) {
            return 0;
        }
        String M = mo113367M();
        String M2 = iCommLibReader.mo113367M();
        C87412m.m108593f(M2, "other.versionBuildInfo()");
        return M.compareTo(M2);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public AssetFileDescriptor mo113382g(String str) {
        return null;
    }

    /* renamed from: i */
    public String mo113377i() {
        return String.valueOf(mo113371a());
    }

    /* renamed from: ld */
    public String mo113378ld() {
        return null;
    }

    public InputStream openRead(String str) {
        return null;
    }

    public String toString() {
        return "NodeFakeCommLibReader()";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeParcelable(this.f247257d, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NodeFakeCommLibReader(IPkgInfo iPkgInfo, int i, C8480h hVar) {
        this((i & 1) != 0 ? new NodeFakePkgInfo() : iPkgInfo);
    }
}
