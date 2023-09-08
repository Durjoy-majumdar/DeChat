package com.tencent.p014mm.vfs;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.p014mm.vfs.SchemeResolver;

/* renamed from: com.tencent.mm.vfs.FileSchemeResolver */
public class FileSchemeResolver extends SingletonSchemeResolver {
    public static final C116214b CREATOR = new C116214b((C116213a) null);

    /* renamed from: com.tencent.mm.vfs.FileSchemeResolver$b */
    public static class C116214b implements Parcelable.Creator<FileSchemeResolver> {

        /* renamed from: a */
        public static final C116342y0<SchemeResolver, SchemeResolver.C116250a> f348758a = new C116342y0<>(new FileSchemeResolver());

        public C116214b(C116213a aVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            return (FileSchemeResolver) f348758a.f349131a;
        }

        public Object[] newArray(int i) {
            return new FileSchemeResolver[i];
        }
    }

    /* renamed from: b */
    public Pair<FileSystem.C85995c, String> mo177604b(C116328u0 u0Var, Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        return ((C116340x0) u0Var).mo177850e(path, (String[]) null);
    }

    /* renamed from: c */
    public Uri mo177659c(C116328u0 u0Var, Uri uri) {
        String[] strArr = new String[1];
        Pair<FileSystem.C85995c, String> e = ((C116340x0) u0Var).mo177850e(uri.getPath(), strArr);
        if (e == null || strArr[0] == null) {
            return null;
        }
        return new Uri.Builder().scheme("wcf").authority(strArr[0]).path((String) e.second).build();
    }
}
