package com.tencent.p014mm.vfs;

import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116344z0;
import com.tencent.p014mm.vfs.FileSystem;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kj2.C117407d;

/* renamed from: com.tencent.mm.vfs.QQMusicCacheCleanupFileSystem */
public class QQMusicCacheCleanupFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<QQMusicCacheCleanupFileSystem> CREATOR = new C116232a();

    /* renamed from: e */
    public final FileSystem f348796e;

    /* renamed from: com.tencent.mm.vfs.QQMusicCacheCleanupFileSystem$a */
    public class C116232a implements Parcelable.Creator<QQMusicCacheCleanupFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new QQMusicCacheCleanupFileSystem(parcel);
        }

        public Object[] newArray(int i) {
            return new QQMusicCacheCleanupFileSystem[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.QQMusicCacheCleanupFileSystem$b */
    public static final class C116233b implements C116344z0.C116345a {
        /* renamed from: a */
        public void mo177613a(String str, FileSystem fileSystem, int i, Map<String, Object> map) {
            C117407d.INSTANCE.mo160131h(22046, str, map.get("deletedFiles"), map.get("deletedSize"), map.get("keptFiles"), map.get("keptSize"), 0, 0, 0, 0, 0, 0, -1, -1);
        }
    }

    /* renamed from: com.tencent.mm.vfs.QQMusicCacheCleanupFileSystem$c */
    public class C116234c extends C116309m {

        /* renamed from: e */
        public final FileSystem.C85995c f348797e;

        /* renamed from: f */
        public final List<FileSystem.C85995c> f348798f;

        public C116234c(FileSystem.C85995c cVar) {
            this.f348797e = cVar;
            this.f348798f = Collections.singletonList(cVar);
        }

        /* renamed from: G */
        public List<FileSystem.C85995c> mo119926G() {
            return this.f348798f;
        }

        /* renamed from: H */
        public FileSystem.C85995c mo119927H(String str, int i) {
            return this.f348797e;
        }

        /* renamed from: a */
        public void mo119928a(CancellationSignal cancellationSignal) {
            long s = C116299g2.m163863s("qq-music-cache-clean");
            if (s < 1209600000) {
                Log.m105925i("VFS.QQMusicCacheCleanupFileSystem", "Image cleanup interval not match, skip cleanup. %d / %d", Long.valueOf(s), 1209600000L);
            } else {
                Iterable<C86001b0> list = list("");
                if (list == null) {
                    list = Collections.emptyList();
                }
                Pattern compile = Pattern.compile("mediaHttpCommonPlayer[0-9]+tmp");
                long j = 0;
                long j2 = 0;
                int i = 0;
                int i2 = 0;
                for (C86001b0 b0Var : list) {
                    if (!b0Var.f250476f) {
                        if (compile.matcher(b0Var.f250472b).matches()) {
                            b0Var.mo119954a();
                            i++;
                            j += b0Var.f250474d;
                        } else {
                            i2++;
                            j2 += b0Var.f250474d;
                        }
                        cancellationSignal.throwIfCanceled();
                    }
                }
                Log.m105925i("VFS.QQMusicCacheCleanupFileSystem", " > deletedFiles: %d, deletedSize: %d\n > keptFiles: %d, keptSize: %d", Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2), Long.valueOf(j2));
                mo177781F(2, "deletedFiles", Integer.valueOf(i), "deletedSize", Long.valueOf(j), "keptFiles", Integer.valueOf(i2), "keptSize", Long.valueOf(j2));
                C116299g2.m163864t("qq-music-cache-clean");
            }
            cancellationSignal.throwIfCanceled();
            super.mo119928a(cancellationSignal);
        }

        public String toString() {
            return "qqMusicCacheGC <- " + this.f348797e;
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return QQMusicCacheCleanupFileSystem.this;
        }
    }

    public QQMusicCacheCleanupFileSystem(FileSystem fileSystem) {
        this.f348796e = fileSystem;
    }

    public String toString() {
        return "qqMusicCacheGC <- " + this.f348796e;
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        return new C116234c((FileSystem.C85995c) this.f348796e.mo177578v(map));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, QQMusicCacheCleanupFileSystem.class, 1);
        parcel.writeParcelable(this.f348796e, i);
    }

    public QQMusicCacheCleanupFileSystem(Parcel parcel) {
        C116299g2.m163845a(parcel, QQMusicCacheCleanupFileSystem.class, 1);
        this.f348796e = (FileSystem) parcel.readParcelable(QQMusicCacheCleanupFileSystem.class.getClassLoader());
    }
}
