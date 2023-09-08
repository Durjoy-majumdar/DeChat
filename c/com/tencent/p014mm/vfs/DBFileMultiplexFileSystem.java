package com.tencent.p014mm.vfs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.vfs.FileSystem;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import sx3.C110821n;
import sx3.C64197v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/vfs/DBFileMultiplexFileSystem;", "Lcom/tencent/mm/vfs/AbstractFileSystem;", "b", "mmkernel_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.vfs.DBFileMultiplexFileSystem */
final class DBFileMultiplexFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<DBFileMultiplexFileSystem> CREATOR = new C116204a();

    /* renamed from: e */
    public final FileSystem f348738e;

    /* renamed from: f */
    public final FileSystem f348739f;

    /* renamed from: com.tencent.mm.vfs.DBFileMultiplexFileSystem$a */
    public static final class C116204a implements Parcelable.Creator<DBFileMultiplexFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new DBFileMultiplexFileSystem(parcel, (C8480h) null);
        }

        public Object[] newArray(int i) {
            return new DBFileMultiplexFileSystem[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.DBFileMultiplexFileSystem$b */
    public final class C116205b extends C116309m {

        /* renamed from: e */
        public final List<FileSystem.C85995c> f348740e;

        /* renamed from: f */
        public final /* synthetic */ DBFileMultiplexFileSystem f348741f;

        public C116205b(DBFileMultiplexFileSystem dBFileMultiplexFileSystem, FileSystem.C85995c cVar, FileSystem.C85995c cVar2) {
            C87412m.m108594g(cVar, "dbFs");
            C87412m.m108594g(cVar2, "fbFs");
            this.f348741f = dBFileMultiplexFileSystem;
            this.f348740e = C64197v.m75537f(cVar2, cVar);
        }

        /* renamed from: G */
        public List<FileSystem.C85995c> mo119926G() {
            return this.f348740e;
        }

        /* renamed from: H */
        public FileSystem.C85995c mo119927H(String str, int i) {
            C87412m.m108594g(str, "path");
            return i == 0 ? this.f348740e.get(0) : C110821n.m150959f(C116308l.f349026a, str, 0, 0, 6, (Object) null) >= 0 ? this.f348740e.get(1) : this.f348740e.get(0);
        }

        /* renamed from: K */
        public Iterable<FileSystem.C85995c> mo177633K(String str, int i) {
            C87412m.m108594g(str, "path");
            if (C110821n.m150959f(C116308l.f349026a, str, 0, 0, 6, (Object) null) >= 0) {
                Set singleton = Collections.singleton(this.f348740e.get(1));
                C87412m.m108593f(singleton, "singleton(fsList[1])");
                return singleton;
            }
            Set singleton2 = Collections.singleton(this.f348740e.get(0));
            C87412m.m108593f(singleton2, "singleton(fsList[0])");
            return singleton2;
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return this.f348741f;
        }
    }

    public DBFileMultiplexFileSystem(FileSystem fileSystem, FileSystem fileSystem2) {
        C87412m.m108594g(fileSystem, "dbFs");
        C87412m.m108594g(fileSystem2, "fbFs");
        this.f348738e = fileSystem;
        this.f348739f = fileSystem2;
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        C87412m.m108594g(map, "env");
        Object v = this.f348738e.mo177578v(map);
        C87412m.m108593f(v, "dbFileSystem.configure(env)");
        Object v2 = this.f348739f.mo177578v(map);
        C87412m.m108593f(v2, "fallbackFileSystem.configure(env)");
        return new C116205b(this, (FileSystem.C85995c) v, (FileSystem.C85995c) v2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        C116299g2.m163866v(parcel, DBFileMultiplexFileSystem.class, 1);
        parcel.writeParcelable(this.f348738e, i);
        parcel.writeParcelable(this.f348739f, i);
    }

    public DBFileMultiplexFileSystem(Parcel parcel, C8480h hVar) {
        C116299g2.m163845a(parcel, DBFileMultiplexFileSystem.class, 1);
        Parcelable readParcelable = parcel.readParcelable(DBFileMultiplexFileSystem.class.getClassLoader());
        C87412m.m108591d(readParcelable);
        this.f348738e = (FileSystem) readParcelable;
        Parcelable readParcelable2 = parcel.readParcelable(DBFileMultiplexFileSystem.class.getClassLoader());
        C87412m.m108591d(readParcelable2);
        this.f348739f = (FileSystem) readParcelable2;
    }
}
