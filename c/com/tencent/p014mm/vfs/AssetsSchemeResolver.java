package com.tencent.p014mm.vfs;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.stubs.logger.Log;
import com.tencent.xweb.file.XVFSFile;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;
import qp3.C118204f;

/* renamed from: com.tencent.mm.vfs.AssetsSchemeResolver */
public final class AssetsSchemeResolver extends SingletonSchemeResolver {
    public static final C116193b CREATOR = new C116193b((C116192a) null);

    /* renamed from: d */
    public final AssetsFileSystem f348712d = new AssetsFileSystem(C116281f0.C116289i.f348994a.f348960d);

    /* renamed from: com.tencent.mm.vfs.AssetsSchemeResolver$AssetsFileSystem */
    public static final class AssetsFileSystem extends C116264a implements FileSystem {
        public static final Parcelable.Creator<AssetsFileSystem> CREATOR = null;

        /* renamed from: e */
        public final AssetManager f348713e;

        /* renamed from: com.tencent.mm.vfs.AssetsSchemeResolver$AssetsFileSystem$a */
        public class C116191a implements C118204f.C118205a<String, C86001b0> {

            /* renamed from: d */
            public final /* synthetic */ String f348714d;

            public C116191a(String str) {
                this.f348714d = str;
            }

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0034 */
            /* renamed from: f */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object mo105957f(java.lang.Object r15) {
                /*
                    r14 = this;
                    java.lang.String r15 = (java.lang.String) r15
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = r14.f348714d
                    r0.append(r1)
                    r0.append(r15)
                    java.lang.String r11 = r0.toString()
                    r0 = 0
                    com.tencent.mm.vfs.AssetsSchemeResolver$AssetsFileSystem r1 = com.tencent.p014mm.vfs.AssetsSchemeResolver.AssetsFileSystem.this     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
                    android.content.res.AssetManager r1 = r1.f348713e     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
                    java.io.InputStream r12 = r1.open(r11)     // Catch:{ IOException -> 0x0033, all -> 0x0031 }
                    int r0 = r12.available()     // Catch:{ IOException -> 0x0034 }
                    long r4 = (long) r0     // Catch:{ IOException -> 0x0034 }
                    com.tencent.mm.vfs.b0 r13 = new com.tencent.mm.vfs.b0     // Catch:{ IOException -> 0x0034 }
                    com.tencent.mm.vfs.AssetsSchemeResolver$AssetsFileSystem r1 = com.tencent.p014mm.vfs.AssetsSchemeResolver.AssetsFileSystem.this     // Catch:{ IOException -> 0x0034 }
                    r6 = 0
                    r8 = 0
                    r10 = 0
                    r0 = r13
                    r2 = r11
                    r3 = r15
                    r0.<init>(r1, r2, r3, r4, r6, r8, r10)     // Catch:{ IOException -> 0x0034 }
                    goto L_0x0045
                L_0x0031:
                    r15 = move-exception
                    goto L_0x004b
                L_0x0033:
                    r12 = r0
                L_0x0034:
                    com.tencent.mm.vfs.b0 r13 = new com.tencent.mm.vfs.b0     // Catch:{ all -> 0x0049 }
                    com.tencent.mm.vfs.AssetsSchemeResolver$AssetsFileSystem r1 = com.tencent.p014mm.vfs.AssetsSchemeResolver.AssetsFileSystem.this     // Catch:{ all -> 0x0049 }
                    r4 = 0
                    r6 = 0
                    r8 = 0
                    r10 = 1
                    r0 = r13
                    r2 = r11
                    r3 = r15
                    r0.<init>(r1, r2, r3, r4, r6, r8, r10)     // Catch:{ all -> 0x0049 }
                L_0x0045:
                    com.tencent.p014mm.vfs.C116299g2.m163847c(r12)
                    return r13
                L_0x0049:
                    r15 = move-exception
                    r0 = r12
                L_0x004b:
                    com.tencent.p014mm.vfs.C116299g2.m163847c(r0)
                    throw r15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.AssetsSchemeResolver.AssetsFileSystem.C116191a.mo105957f(java.lang.Object):java.lang.Object");
            }
        }

        public AssetsFileSystem(Context context) {
            this.f348713e = context.getAssets();
        }

        /* renamed from: c */
        public boolean mo119933c(String str) {
            return false;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public boolean mo119935e(String str, long j) {
            return false;
        }

        /* renamed from: f */
        public int mo119936f() {
            return 12;
        }

        /* renamed from: g */
        public boolean mo119937g(String str) {
            return false;
        }

        public Iterable<C86001b0> list(String str) {
            String str2;
            String k = C116299g2.m163855k(str, true, false);
            try {
                String[] list = this.f348713e.list(k);
                if (list == null) {
                    return null;
                }
                if (k.isEmpty()) {
                    str2 = k;
                } else {
                    str2 = k + XVFSFile.SEPARATOR_CHAR;
                }
                return new C118204f(Arrays.asList(list), new C116191a(str2), false);
            } catch (IOException e) {
                Log.m106499e("VFS.AssetsFileSystem", (Throwable) e, "Cannot list: " + k);
                return null;
            }
        }

        /* renamed from: m */
        public OutputStream mo119941m(String str, boolean z) {
            throw new FileNotFoundException("Cannot open files for writing on read-only filesystems");
        }

        /* renamed from: o */
        public boolean mo119942o(String str, boolean z) {
            return false;
        }

        public InputStream openRead(String str) {
            try {
                return this.f348713e.open(str);
            } catch (IOException e) {
                if (e instanceof FileNotFoundException) {
                    throw ((FileNotFoundException) e);
                }
                throw new FileNotFoundException(e.getMessage());
            }
        }

        /* renamed from: p */
        public FileSystem.C116215a mo119944p(String str) {
            return null;
        }

        /* renamed from: q */
        public C86001b0 mo119945q(String str) {
            try {
                InputStream openRead = openRead(str);
                int available = openRead.available();
                openRead.close();
                int lastIndexOf = str.lastIndexOf(47);
                return new C86001b0(this, str, lastIndexOf < 0 ? str : str.substring(lastIndexOf + 1), (long) available, 0, 0, false);
            } catch (IOException unused) {
                return null;
            }
        }

        public String toString() {
            return TPMediaCompositionHelper.XML_TAG_ASSERT;
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return this;
        }

        /* renamed from: v */
        public Object mo177578v(Map map) {
            return this;
        }

        /* renamed from: w */
        public String mo119947w(String str, boolean z) {
            return null;
        }

        public void writeToParcel(Parcel parcel, int i) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: x */
        public boolean mo119948x(String str) {
            try {
                openRead(str).close();
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        /* renamed from: z */
        public long mo177589z(String str, FileSystem.C85995c cVar, String str2, boolean z) {
            throw new IOException("Not implemented");
        }
    }

    /* renamed from: com.tencent.mm.vfs.AssetsSchemeResolver$b */
    public static class C116193b implements Parcelable.Creator<AssetsSchemeResolver> {

        /* renamed from: a */
        public static final AssetsSchemeResolver f348716a = new AssetsSchemeResolver((C116192a) null);

        public C116193b(C116192a aVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            return f348716a;
        }

        public Object[] newArray(int i) {
            return new AssetsSchemeResolver[i];
        }
    }

    public AssetsSchemeResolver(C116192a aVar) {
    }

    /* renamed from: b */
    public Pair<FileSystem.C85995c, String> mo177604b(C116328u0 u0Var, Uri uri) {
        String path = uri.getPath();
        return Pair.create(this.f348712d, path == null ? "" : C116299g2.m163855k(path, true, true));
    }
}
