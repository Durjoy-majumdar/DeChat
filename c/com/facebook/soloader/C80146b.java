package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.C80159j;
import com.facebook.soloader.C80173r;
import java.io.File;
import java.util.zip.ZipEntry;

/* renamed from: com.facebook.soloader.b */
public class C80146b extends C80159j {

    /* renamed from: h */
    public final int f234645h;

    /* renamed from: com.facebook.soloader.b$a */
    public class C80147a extends C80159j.C80162c {

        /* renamed from: h */
        public File f234646h;

        /* renamed from: i */
        public final int f234647i;

        public C80147a(C80159j jVar) {
            super(jVar);
            this.f234646h = new File(C80146b.this.f234699c.getApplicationInfo().nativeLibraryDir);
            this.f234647i = C80146b.this.f234645h;
        }

        /* renamed from: d */
        public boolean mo110959d(ZipEntry zipEntry, String str) {
            String name = zipEntry.getName();
            if (str.equals(C80146b.this.f234700d)) {
                C80146b.this.f234700d = null;
                String.format("allowing consideration of corrupted lib %s", new Object[]{str});
            } else if ((this.f234647i & 1) != 0) {
                File file = new File(this.f234646h, str);
                if (!file.isFile()) {
                    String.format("allowing considering of %s: %s not in system lib dir", new Object[]{name, str});
                } else {
                    long length = file.length();
                    long size = zipEntry.getSize();
                    if (length == size) {
                        return false;
                    }
                    String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", new Object[]{file, Long.valueOf(length), Long.valueOf(size)});
                }
            }
            return true;
        }
    }

    public C80146b(Context context, File file, String str, int i) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.f234645h = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a A[Catch:{ all -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045 A[SYNTHETIC, Splitter:B:15:0x0045] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo110957h() {
        /*
            r5 = this;
            java.io.File r0 = r5.f234670f
            java.io.File r0 = r0.getCanonicalFile()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            r2 = 2
            r1.writeByte(r2)     // Catch:{ all -> 0x008d }
            java.lang.String r3 = r0.getPath()     // Catch:{ all -> 0x008d }
            r1.writeString(r3)     // Catch:{ all -> 0x008d }
            long r3 = r0.lastModified()     // Catch:{ all -> 0x008d }
            r1.writeLong(r3)     // Catch:{ all -> 0x008d }
            android.content.Context r0 = r5.f234699c     // Catch:{ all -> 0x008d }
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch:{ all -> 0x008d }
            r4 = 0
            if (r3 == 0) goto L_0x0030
            java.lang.String r0 = r0.getPackageName()     // Catch:{ NameNotFoundException | RuntimeException -> 0x0030 }
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r0, r4)     // Catch:{ NameNotFoundException | RuntimeException -> 0x0030 }
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException | RuntimeException -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            r1.writeInt(r0)     // Catch:{ all -> 0x008d }
            int r0 = r5.f234645h     // Catch:{ all -> 0x008d }
            r3 = 1
            r0 = r0 & r3
            if (r0 != 0) goto L_0x0045
            r1.writeByte(r4)     // Catch:{ all -> 0x008d }
            byte[] r0 = r1.marshall()     // Catch:{ all -> 0x008d }
            r1.recycle()
            return r0
        L_0x0045:
            android.content.Context r0 = r5.f234699c     // Catch:{ all -> 0x008d }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch:{ all -> 0x008d }
            java.lang.String r0 = r0.nativeLibraryDir     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x005a
            r1.writeByte(r3)     // Catch:{ all -> 0x008d }
            byte[] r0 = r1.marshall()     // Catch:{ all -> 0x008d }
            r1.recycle()
            return r0
        L_0x005a:
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x008d }
            r4.<init>(r0)     // Catch:{ all -> 0x008d }
            java.io.File r0 = r4.getCanonicalFile()     // Catch:{ all -> 0x008d }
            boolean r4 = r0.exists()     // Catch:{ all -> 0x008d }
            if (r4 != 0) goto L_0x0074
            r1.writeByte(r3)     // Catch:{ all -> 0x008d }
            byte[] r0 = r1.marshall()     // Catch:{ all -> 0x008d }
            r1.recycle()
            return r0
        L_0x0074:
            r1.writeByte(r2)     // Catch:{ all -> 0x008d }
            java.lang.String r2 = r0.getPath()     // Catch:{ all -> 0x008d }
            r1.writeString(r2)     // Catch:{ all -> 0x008d }
            long r2 = r0.lastModified()     // Catch:{ all -> 0x008d }
            r1.writeLong(r2)     // Catch:{ all -> 0x008d }
            byte[] r0 = r1.marshall()     // Catch:{ all -> 0x008d }
            r1.recycle()
            return r0
        L_0x008d:
            r0 = move-exception
            r1.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C80146b.mo110957h():byte[]");
    }

    /* renamed from: k */
    public C80173r.C80180g mo110958k() {
        return new C80147a(this);
    }
}
