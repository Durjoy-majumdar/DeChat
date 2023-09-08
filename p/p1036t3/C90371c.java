package p1036t3;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import p1036t3.C90373d;

/* renamed from: t3.c */
public final class C90371c implements Closeable {

    /* renamed from: d */
    public final File f259379d;

    /* renamed from: e */
    public final long f259380e;

    /* renamed from: f */
    public final File f259381f;

    /* renamed from: g */
    public final RandomAccessFile f259382g;

    /* renamed from: h */
    public final FileChannel f259383h;

    /* renamed from: i */
    public final FileLock f259384i;

    /* renamed from: t3.c$a */
    public static class C90372a extends File {

        /* renamed from: d */
        public long f259385d = -1;

        public C90372a(File file, String str) {
            super(file, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        r3 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0041 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042 A[ExcHandler: Error | RuntimeException (e java.lang.Throwable), Splitter:B:1:0x0024] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90371c(java.io.File r3, java.io.File r4) {
        /*
            r2 = this;
            r2.<init>()
            r3.getPath()
            r4.getPath()
            r2.f259379d = r3
            r2.f259381f = r4
            long r0 = m113165b(r3)
            r2.f259380e = r0
            java.io.File r3 = new java.io.File
            java.lang.String r0 = "MultiDex.lock"
            r3.<init>(r4, r0)
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile
            java.lang.String r0 = "rw"
            r4.<init>(r3, r0)
            r2.f259382g = r4
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch:{ IOException -> 0x0046, RuntimeException -> 0x0044, Error -> 0x0042 }
            r2.f259383h = r4     // Catch:{ IOException -> 0x0046, RuntimeException -> 0x0044, Error -> 0x0042 }
            r3.getPath()     // Catch:{ IOException -> 0x003b, RuntimeException -> 0x0039, Error -> 0x0037 }
            java.nio.channels.FileLock r4 = r4.lock()     // Catch:{ IOException -> 0x003b, RuntimeException -> 0x0039, Error -> 0x0037 }
            r2.f259384i = r4     // Catch:{ IOException -> 0x003b, RuntimeException -> 0x0039, Error -> 0x0037 }
            r3.getPath()     // Catch:{ IOException -> 0x0046, RuntimeException -> 0x0044, Error -> 0x0042 }
            return
        L_0x0037:
            r3 = move-exception
            goto L_0x003c
        L_0x0039:
            r3 = move-exception
            goto L_0x003c
        L_0x003b:
            r3 = move-exception
        L_0x003c:
            java.nio.channels.FileChannel r4 = r2.f259383h     // Catch:{ IOException -> 0x0046, RuntimeException -> 0x0044, Error -> 0x0042 }
            r4.close()     // Catch:{ IOException -> 0x0041, RuntimeException -> 0x0044, Error -> 0x0042 }
        L_0x0041:
            throw r3     // Catch:{ IOException -> 0x0046, RuntimeException -> 0x0044, Error -> 0x0042 }
        L_0x0042:
            r3 = move-exception
            goto L_0x0047
        L_0x0044:
            r3 = move-exception
            goto L_0x0047
        L_0x0046:
            r3 = move-exception
        L_0x0047:
            java.io.RandomAccessFile r4 = r2.f259382g
            r4.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p1036t3.C90371c.<init>(java.io.File, java.io.File):void");
    }

    /* renamed from: a */
    public static void m113164a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        createTempFile.getPath();
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                file.getPath();
                if (createTempFile.renameTo(file)) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + FastJsonResponse.QUOTE);
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            createTempFile.delete();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static long m113165b(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            C90373d.C90374a a = C90373d.m113170a(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = a.f259387b;
            randomAccessFile.seek(a.f259386a);
            byte[] bArr = new byte[16384];
            int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
            while (true) {
                if (read == -1) {
                    break;
                }
                crc32.update(bArr, 0, read);
                j -= (long) read;
                if (j == 0) {
                    break;
                }
                read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    /* renamed from: g */
    public static void m113166g(Context context, String str, long j, long j2, List<C90372a> list) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong(str + AppMeasurement.Param.TIMESTAMP, j);
        edit.putLong(str + "crc", j2);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        for (C90372a next : list) {
            edit.putLong(str + "dex.crc." + i, next.f259385d);
            edit.putLong(str + "dex.time." + i, next.lastModified());
            i++;
        }
        edit.commit();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066 A[SYNTHETIC, Splitter:B:14:0x0066] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<? extends java.io.File> mo124594c(android.content.Context r17, java.lang.String r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r2 = r18
            java.io.File r1 = r0.f259379d
            r1.getPath()
            java.nio.channels.FileLock r1 = r0.f259384i
            boolean r1 = r1.isValid()
            if (r1 == 0) goto L_0x00a7
            r3 = 1
            r5 = -1
            if (r19 != 0) goto L_0x0086
            java.io.File r1 = r0.f259379d
            long r7 = r0.f259380e
            r9 = 4
            java.lang.String r10 = "multidex.version"
            r11 = r17
            android.content.SharedPreferences r9 = r11.getSharedPreferences(r10, r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            java.lang.String r12 = "timestamp"
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            long r12 = r9.getLong(r10, r5)
            long r14 = r1.lastModified()
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0043
            long r14 = r14 - r3
        L_0x0043:
            int r1 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x0063
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r10 = "crc"
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            long r9 = r9.getLong(r1, r5)
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r1 = 0
            goto L_0x0064
        L_0x0063:
            r1 = 1
        L_0x0064:
            if (r1 != 0) goto L_0x0088
            java.util.List r1 = r16.mo124596d(r17, r18)     // Catch:{ IOException -> 0x006b }
            goto L_0x00a3
        L_0x006b:
            java.util.List r8 = r16.mo124597e()
            java.io.File r1 = r0.f259379d
            long r9 = r1.lastModified()
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x007a
            long r9 = r9 - r3
        L_0x007a:
            r3 = r9
            long r5 = r0.f259380e
            r1 = r17
            r2 = r18
            r7 = r8
            m113166g(r1, r2, r3, r5, r7)
            goto L_0x00a2
        L_0x0086:
            r11 = r17
        L_0x0088:
            java.util.List r8 = r16.mo124597e()
            java.io.File r1 = r0.f259379d
            long r9 = r1.lastModified()
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0097
            long r9 = r9 - r3
        L_0x0097:
            r3 = r9
            long r5 = r0.f259380e
            r1 = r17
            r2 = r18
            r7 = r8
            m113166g(r1, r2, r3, r5, r7)
        L_0x00a2:
            r1 = r8
        L_0x00a3:
            r1.size()
            return r1
        L_0x00a7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "MultiDexExtractor was closed"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1036t3.C90371c.mo124594c(android.content.Context, java.lang.String, boolean):java.util.List");
    }

    public void close() {
        this.f259384i.release();
        this.f259383h.close();
        this.f259382g.close();
    }

    /* renamed from: d */
    public final List<C90372a> mo124596d(Context context, String str) {
        String str2 = str;
        String str3 = this.f259379d.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i = sharedPreferences.getInt(str2 + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + -1);
        int i2 = 2;
        while (i2 <= i) {
            C90372a aVar = new C90372a(this.f259381f, str3 + i2 + ".zip");
            if (aVar.isFile()) {
                aVar.f259385d = m113165b(aVar);
                long j = sharedPreferences.getLong(str2 + "dex.crc." + i2, -1);
                long j2 = sharedPreferences.getLong(str2 + "dex.time." + i2, -1);
                long lastModified = aVar.lastModified();
                if (j2 == lastModified) {
                    String str4 = str3;
                    SharedPreferences sharedPreferences2 = sharedPreferences;
                    if (j == aVar.f259385d) {
                        arrayList.add(aVar);
                        i2++;
                        sharedPreferences = sharedPreferences2;
                        str3 = str4;
                    }
                }
                throw new IOException("Invalid extracted dex: " + aVar + " (key \"" + str2 + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + aVar.f259385d);
            }
            throw new IOException("Missing extracted secondary dex file '" + aVar.getPath() + "'");
        }
        return arrayList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r7.getAbsolutePath();
        r8 = false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0091 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p1036t3.C90371c.C90372a> mo124597e() {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = r10.f259379d
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ".classes"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.File r1 = r10.f259381f
            t3.b r2 = new t3.b
            r2.<init>(r10)
            java.io.File[] r1 = r1.listFiles(r2)
            r2 = 0
            if (r1 != 0) goto L_0x002b
            java.io.File r1 = r10.f259381f
            r1.getPath()
            goto L_0x0047
        L_0x002b:
            int r3 = r1.length
            r4 = 0
        L_0x002d:
            if (r4 >= r3) goto L_0x0047
            r5 = r1[r4]
            r5.getPath()
            r5.length()
            boolean r6 = r5.delete()
            if (r6 != 0) goto L_0x0041
            r5.getPath()
            goto L_0x0044
        L_0x0041:
            r5.getPath()
        L_0x0044:
            int r4 = r4 + 1
            goto L_0x002d
        L_0x0047:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile
            java.io.File r4 = r10.f259379d
            r3.<init>(r4)
            r4 = 2
            java.lang.String r5 = "classes2.dex"
            java.util.zip.ZipEntry r5 = r3.getEntry(r5)     // Catch:{ all -> 0x00f5 }
        L_0x005a:
            if (r5 == 0) goto L_0x00f1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r6.<init>()     // Catch:{ all -> 0x00f5 }
            r6.append(r0)     // Catch:{ all -> 0x00f5 }
            r6.append(r4)     // Catch:{ all -> 0x00f5 }
            java.lang.String r7 = ".zip"
            r6.append(r7)     // Catch:{ all -> 0x00f5 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00f5 }
            t3.c$a r7 = new t3.c$a     // Catch:{ all -> 0x00f5 }
            java.io.File r8 = r10.f259381f     // Catch:{ all -> 0x00f5 }
            r7.<init>(r8, r6)     // Catch:{ all -> 0x00f5 }
            r1.add(r7)     // Catch:{ all -> 0x00f5 }
            r7.toString()     // Catch:{ all -> 0x00f5 }
            r6 = 0
            r8 = 0
        L_0x007f:
            r9 = 3
            if (r6 >= r9) goto L_0x00aa
            if (r8 != 0) goto L_0x00aa
            int r6 = r6 + 1
            m113164a(r3, r5, r7, r0)     // Catch:{ all -> 0x00f5 }
            long r8 = m113165b(r7)     // Catch:{ IOException -> 0x0091 }
            r7.f259385d = r8     // Catch:{ IOException -> 0x0091 }
            r8 = 1
            goto L_0x0095
        L_0x0091:
            r7.getAbsolutePath()     // Catch:{ all -> 0x00f5 }
            r8 = 0
        L_0x0095:
            r7.getAbsolutePath()     // Catch:{ all -> 0x00f5 }
            r7.length()     // Catch:{ all -> 0x00f5 }
            if (r8 != 0) goto L_0x007f
            r7.delete()     // Catch:{ all -> 0x00f5 }
            boolean r9 = r7.exists()     // Catch:{ all -> 0x00f5 }
            if (r9 == 0) goto L_0x007f
            r7.getPath()     // Catch:{ all -> 0x00f5 }
            goto L_0x007f
        L_0x00aa:
            if (r8 == 0) goto L_0x00c9
            int r4 = r4 + 1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r5.<init>()     // Catch:{ all -> 0x00f5 }
            java.lang.String r6 = "classes"
            r5.append(r6)     // Catch:{ all -> 0x00f5 }
            r5.append(r4)     // Catch:{ all -> 0x00f5 }
            java.lang.String r6 = ".dex"
            r5.append(r6)     // Catch:{ all -> 0x00f5 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00f5 }
            java.util.zip.ZipEntry r5 = r3.getEntry(r5)     // Catch:{ all -> 0x00f5 }
            goto L_0x005a
        L_0x00c9:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00f5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r1.<init>()     // Catch:{ all -> 0x00f5 }
            java.lang.String r2 = "Could not create zip file "
            r1.append(r2)     // Catch:{ all -> 0x00f5 }
            java.lang.String r2 = r7.getAbsolutePath()     // Catch:{ all -> 0x00f5 }
            r1.append(r2)     // Catch:{ all -> 0x00f5 }
            java.lang.String r2 = " for secondary dex ("
            r1.append(r2)     // Catch:{ all -> 0x00f5 }
            r1.append(r4)     // Catch:{ all -> 0x00f5 }
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f5 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x00f1:
            r3.close()     // Catch:{ IOException -> 0x00f4 }
        L_0x00f4:
            return r1
        L_0x00f5:
            r0 = move-exception
            r3.close()     // Catch:{ IOException -> 0x00f9 }
        L_0x00f9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1036t3.C90371c.mo124597e():java.util.List");
    }
}
