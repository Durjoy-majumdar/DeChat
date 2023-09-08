package com.tencent.p014mm.vfs;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.FileSystem;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import qe3.C89625d;

/* renamed from: com.tencent.mm.vfs.ApkCleanupFileSystem */
public class ApkCleanupFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<ApkCleanupFileSystem> CREATOR = new C116190a();

    /* renamed from: e */
    public final FileSystem f348711e;

    /* renamed from: com.tencent.mm.vfs.ApkCleanupFileSystem$b */
    public class C85993b extends C116309m {

        /* renamed from: e */
        public final FileSystem.C85995c f250450e;

        /* renamed from: f */
        public final List<FileSystem.C85995c> f250451f;

        public C85993b(FileSystem.C85995c cVar) {
            this.f250450e = cVar;
            this.f250451f = Collections.singletonList(cVar);
        }

        /* renamed from: G */
        public List<FileSystem.C85995c> mo119926G() {
            return this.f250451f;
        }

        /* renamed from: H */
        public FileSystem.C85995c mo119927H(String str, int i) {
            return this.f250450e;
        }

        /* renamed from: a */
        public void mo119928a(CancellationSignal cancellationSignal) {
            Bundle bundle;
            Iterable<C86001b0> list = this.f250450e.list("");
            if (list == null) {
                list = Collections.emptyList();
            }
            C86001b0 b0Var = null;
            C86001b0 b0Var2 = null;
            int i = 0;
            for (C86001b0 b0Var3 : list) {
                if (!b0Var3.f250476f) {
                    if (b0Var3.f250472b.endsWith(".temp")) {
                        if (Util.milliSecondsToNow(b0Var3.f250475e) > 86400000) {
                            b0Var3.mo119954a();
                        } else {
                            if (b0Var != null) {
                                if (b0Var3.f250475e > b0Var.f250475e) {
                                    b0Var.mo119954a();
                                } else {
                                    b0Var3.mo119954a();
                                }
                            }
                            b0Var = b0Var3;
                        }
                    } else if (b0Var3.f250472b.endsWith(".apk")) {
                        PackageInfo packageArchiveInfo = MMApplicationContext.getContext().getPackageManager().getPackageArchiveInfo(b0Var3.f250477g.mo119947w(b0Var3.f250471a, false), 128);
                        if (packageArchiveInfo != null) {
                            String str = packageArchiveInfo.packageName;
                            if (str == null || str.equals(MMApplicationContext.getApplicationId())) {
                                ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
                                if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                                    int i2 = bundle.getInt("com.tencent.mm.BuildInfo.CLIENT_VERSION");
                                    Log.m105919d("VFS.QQMusicCacheCleanupFileSystem", "startCleanAPKFiles:%d, currentVersion;%d", Integer.valueOf(i2), Integer.valueOf(C89625d.f257841g));
                                    if (i2 <= C89625d.f257841g) {
                                        b0Var3.mo119954a();
                                    } else {
                                        if (b0Var2 != null) {
                                            if (i2 > i) {
                                                b0Var2.mo119954a();
                                            } else {
                                                b0Var3.mo119954a();
                                            }
                                        }
                                        b0Var2 = b0Var3;
                                        i = i2;
                                    }
                                }
                            } else {
                                b0Var3.mo119954a();
                            }
                        }
                        if (i != 0) {
                            b0Var3.mo119954a();
                        } else {
                            if (b0Var2 != null) {
                                if (b0Var3.f250475e > b0Var2.f250475e) {
                                    b0Var2.mo119954a();
                                } else {
                                    b0Var3.mo119954a();
                                }
                            }
                            b0Var2 = b0Var3;
                        }
                    }
                }
            }
            super.mo119928a(cancellationSignal);
        }

        public String toString() {
            return "apkClean <- " + this.f250450e;
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return ApkCleanupFileSystem.this;
        }
    }

    /* renamed from: com.tencent.mm.vfs.ApkCleanupFileSystem$a */
    public class C116190a implements Parcelable.Creator<ApkCleanupFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new ApkCleanupFileSystem(parcel);
        }

        public Object[] newArray(int i) {
            return new ApkCleanupFileSystem[i];
        }
    }

    public ApkCleanupFileSystem(FileSystem fileSystem) {
        this.f348711e = fileSystem;
    }

    public String toString() {
        return "apkClean <- " + this.f348711e;
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        return new C85993b((FileSystem.C85995c) this.f348711e.mo177578v(map));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, ApkCleanupFileSystem.class, 1);
        parcel.writeParcelable(this.f348711e, i);
    }

    public ApkCleanupFileSystem(Parcel parcel) {
        C116299g2.m163845a(parcel, ApkCleanupFileSystem.class, 1);
        this.f348711e = (FileSystem) parcel.readParcelable(ApkCleanupFileSystem.class.getClassLoader());
    }
}
