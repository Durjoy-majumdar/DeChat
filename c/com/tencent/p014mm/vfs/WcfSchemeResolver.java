package com.tencent.p014mm.vfs;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.p014mm.vfs.SchemeResolver;

/* renamed from: com.tencent.mm.vfs.WcfSchemeResolver */
public final class WcfSchemeResolver extends SingletonSchemeResolver {
    public static final C116262b CREATOR = new C116262b((C116261a) null);

    /* renamed from: com.tencent.mm.vfs.WcfSchemeResolver$b */
    public static class C116262b implements Parcelable.Creator<WcfSchemeResolver> {

        /* renamed from: a */
        public static final C116342y0<SchemeResolver, SchemeResolver.C116250a> f348891a = new C116342y0<>(new WcfSchemeResolver());

        public C116262b(C116261a aVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            return (WcfSchemeResolver) f348891a.f349131a;
        }

        public Object[] newArray(int i) {
            return new WcfSchemeResolver[i];
        }
    }

    /* renamed from: b */
    public Pair<FileSystem.C85995c, String> mo177604b(C116328u0 u0Var, Uri uri) {
        FileSystem.C85995c b = ((C116340x0) u0Var).mo177847b(uri.getAuthority());
        String path = uri.getPath();
        return new Pair<>(b, path == null ? "" : C116299g2.m163855k(path, true, true));
    }
}
