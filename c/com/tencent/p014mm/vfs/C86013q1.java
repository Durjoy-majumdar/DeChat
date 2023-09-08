package com.tencent.p014mm.vfs;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.stubs.logger.Log;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import qp3.C118196a;

/* renamed from: com.tencent.mm.vfs.q1 */
public final class C86013q1 {

    /* renamed from: com.tencent.mm.vfs.q1$a */
    public class C86014a implements C116299g2.C86006b<C86001b0> {

        /* renamed from: a */
        public final /* synthetic */ int f250488a;

        /* renamed from: b */
        public final /* synthetic */ C116281f0.C116288h f250489b;

        /* renamed from: c */
        public final /* synthetic */ HashSet f250490c;

        public C86014a(int i, C116281f0.C116288h hVar, HashSet hashSet) {
            this.f250488a = i;
            this.f250489b = hVar;
            this.f250490c = hashSet;
        }

        public boolean accept(Object obj) {
            C86001b0 b0Var = (C86001b0) obj;
            String substring = b0Var.f250471a.substring(this.f250488a);
            if (!substring.startsWith("/")) {
                substring = "/" + substring;
            }
            String str = this.f250489b.f348992b + substring;
            boolean z = false;
            try {
                z = this.f250489b.f348991a.mo119946t(str, b0Var.f250477g, b0Var.f250471a);
            } catch (IOException unused) {
            }
            if (z) {
                this.f250490c.add(str);
            }
            return !z;
        }
    }

    /* renamed from: A */
    public static RandomAccessFile m106419A(Uri uri, boolean z) {
        String r = C116299g2.m163862r(uri, z);
        if (r != null) {
            return new RandomAccessFile(r, z ? "rw" : "r");
        }
        throw new FileNotFoundException("Cannot resolve path or URI: " + uri);
    }

    /* renamed from: B */
    public static RandomAccessFile m106420B(String str, boolean z) {
        return m106419A(C116299g2.m163858n(str), z);
    }

    /* renamed from: C */
    public static InputStream m106421C(Uri uri, C116281f0.C116288h hVar) {
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(uri, hVar);
        if (l.mo177810a()) {
            return l.f348991a.openRead(l.f348992b);
        }
        throw new FileNotFoundException("Cannot resolve path or URI: " + uri);
    }

    /* renamed from: D */
    public static InputStream m106422D(C86009m1 m1Var) {
        return m106421C(m1Var.f250486d, m1Var.mo119989z());
    }

    /* renamed from: E */
    public static InputStream m106423E(String str) {
        if (str != null && !str.isEmpty()) {
            return m106421C(C116299g2.m163858n(str), (C116281f0.C116288h) null);
        }
        throw new FileNotFoundException("path is empty");
    }

    /* renamed from: F */
    public static ReadableByteChannel m106424F(Uri uri, C116281f0.C116288h hVar) {
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(uri, hVar);
        if (l.mo177810a()) {
            return l.f348991a.mo119938h(l.f348992b);
        }
        throw new FileNotFoundException("Cannot resolve path or URI: " + uri);
    }

    /* renamed from: G */
    public static OutputStream m106425G(Uri uri, C116281f0.C116288h hVar, boolean z) {
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(uri, hVar);
        if (l.mo177810a()) {
            return l.f348991a.mo119941m(l.f348992b, z);
        }
        throw new FileNotFoundException("Cannot resolve path or URI: " + uri);
    }

    /* renamed from: H */
    public static OutputStream m106426H(C86009m1 m1Var) {
        return m106425G(m1Var.f250486d, m1Var.mo119989z(), false);
    }

    /* renamed from: I */
    public static OutputStream m106427I(C86009m1 m1Var, boolean z) {
        return m106425G(m1Var.f250486d, m1Var.mo119989z(), z);
    }

    /* renamed from: J */
    public static OutputStream m106428J(String str) {
        return m106429K(str, false);
    }

    /* renamed from: K */
    public static OutputStream m106429K(String str, boolean z) {
        if (str != null && !str.isEmpty()) {
            return m106425G(C116299g2.m163858n(str), (C116281f0.C116288h) null, z);
        }
        throw new FileNotFoundException("path is empty");
    }

    /* renamed from: L */
    public static WritableByteChannel m106430L(Uri uri, C116281f0.C116288h hVar, boolean z) {
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(uri, hVar);
        if (l.mo177810a()) {
            return l.f348991a.mo119932b(l.f348992b, z);
        }
        throw new FileNotFoundException("Cannot resolve path or URI: " + uri);
    }

    /* renamed from: M */
    public static WritableByteChannel m106431M(C86009m1 m1Var) {
        return m106430L(m1Var.f250486d, m1Var.mo119989z(), false);
    }

    /* renamed from: N */
    public static String m106432N(String str) {
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = null;
        try {
            InputStreamReader inputStreamReader2 = new InputStreamReader(m106423E(str));
            try {
                char[] cArr = new char[512];
                while (true) {
                    int read = inputStreamReader2.read(cArr);
                    if (read != -1) {
                        sb.append(cArr, 0, read);
                    } else {
                        C116299g2.m163847c(inputStreamReader2);
                        return sb.toString();
                    }
                }
            } catch (IOException e) {
                e = e;
                inputStreamReader = inputStreamReader2;
                try {
                    Log.m106498e("MicroMsg.VFSFileOp", "readFileAsString(\"%s\" failed: %s", str, e.getMessage());
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    C116299g2.m163847c(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader = inputStreamReader2;
                C116299g2.m163847c(inputStreamReader);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            Log.m106498e("MicroMsg.VFSFileOp", "readFileAsString(\"%s\" failed: %s", str, e.getMessage());
            throw e;
        }
    }

    /* renamed from: O */
    public static byte[] m106433O(String str, int i, int i2) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (str == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((i2 < 0 || i2 > 8388608) ? 4096 : i2);
        try {
            inputStream = m106423E(str);
            long j = (long) i;
            while (j > 0) {
                try {
                    j -= inputStream.skip(j);
                } catch (IOException e) {
                    e = e;
                    try {
                        Log.m106513w("MicroMsg.VFSFileOp", "readFromFile failed: " + str + ", " + e.getMessage());
                        C116299g2.m163847c(inputStream);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = inputStream;
                        C116299g2.m163847c(inputStream2);
                        throw th;
                    }
                }
            }
            byte[] bArr = new byte[1024];
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            while (true) {
                int read = inputStream.read(bArr, 0, Math.min(i2, 1024));
                if (read == -1 || i2 <= 0) {
                    C116299g2.m163847c(inputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                } else {
                    byteArrayOutputStream.write(bArr, 0, read);
                    i2 -= read;
                }
            }
            C116299g2.m163847c(inputStream);
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused) {
            }
            Log.m106494d("MicroMsg.VFSFileOp", "readFromFile: %s [%d]", str, Integer.valueOf(byteArray2.length));
            return byteArray2;
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
            Log.m106513w("MicroMsg.VFSFileOp", "readFromFile failed: " + str + ", " + e.getMessage());
            C116299g2.m163847c(inputStream);
            return null;
        } catch (Throwable th4) {
            th = th4;
            C116299g2.m163847c(inputStream2);
            throw th;
        }
    }

    /* renamed from: P */
    public static boolean m106434P(C116281f0.C116288h hVar, C116281f0.C116288h hVar2, boolean z) {
        if (!hVar.mo177810a() || !hVar2.mo177810a()) {
            return false;
        }
        HashSet hashSet = new HashSet();
        int length = hVar.f348992b.length();
        Iterable<C86001b0> p = C116299g2.m163860p(hVar.f348991a, hVar.f348992b, false, !z ? null : new C86014a(length, hVar2, hashSet));
        if (p == null) {
            return false;
        }
        hVar2.f348991a.mo119937g(hVar2.f348992b);
        hashSet.add(hVar2.f348992b);
        Iterator it = ((C118196a) p).iterator();
        while (it.hasNext()) {
            C86001b0 b0Var = (C86001b0) it.next();
            String substring = b0Var.f250471a.substring(length);
            if (!substring.startsWith("/")) {
                substring = "/" + substring;
            }
            String str = hVar2.f348992b + substring;
            if (!b0Var.f250476f) {
                int lastIndexOf = str.lastIndexOf(47);
                if (lastIndexOf > 0) {
                    String substring2 = str.substring(0, lastIndexOf);
                    if (hashSet.add(substring2)) {
                        hVar2.f348991a.mo119937g(substring2);
                    }
                }
                if (z) {
                    try {
                        if (!hVar2.f348991a.mo119946t(str, b0Var.f250477g, b0Var.f250471a)) {
                            hVar2.f348991a.mo119934d(str, b0Var.f250477g, b0Var.f250471a, false);
                            b0Var.mo119954a();
                        }
                    } catch (IOException e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to ");
                        sb.append(z ? "move" : "copy");
                        sb.append(" files.");
                        Log.m106515w("MicroMsg.VFSFileOp", (Throwable) e, sb.toString());
                        return false;
                    }
                } else {
                    hVar2.f348991a.mo119934d(str, b0Var.f250477g, b0Var.f250471a, false);
                }
            } else if (hashSet.add(str)) {
                hVar2.f348991a.mo119937g(str);
            }
        }
        return true;
    }

    /* renamed from: Q */
    public static boolean m106435Q(String str, String str2, String str3) {
        return m106463x(str + str2, str + str3);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:65:0x0155=Splitter:B:65:0x0155, B:60:0x014c=Splitter:B:60:0x014c} */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m106436R(java.lang.String r12, java.lang.String r13) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.VFSFileOp"
            r2 = -1
            r3 = 0
            java.util.zip.ZipInputStream r4 = new java.util.zip.ZipInputStream     // Catch:{ FileNotFoundException -> 0x0154, IOException -> 0x014b }
            java.io.InputStream r12 = m106423E(r12)     // Catch:{ FileNotFoundException -> 0x0154, IOException -> 0x014b }
            r4.<init>(r12)     // Catch:{ FileNotFoundException -> 0x0154, IOException -> 0x014b }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            r12.<init>()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
        L_0x0018:
            java.util.zip.ZipEntry r6 = r4.getNextEntry()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            r7 = 0
            if (r6 == 0) goto L_0x013c
            java.lang.String r8 = r6.getName()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            java.lang.String r9 = "../"
            boolean r9 = r8.contains(r9)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            if (r9 != 0) goto L_0x0018
            java.lang.String r9 = "..\\"
            boolean r9 = r8.contains(r9)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            if (r9 == 0) goto L_0x0034
            goto L_0x0018
        L_0x0034:
            boolean r6 = r6.isDirectory()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            java.lang.String r9 = "/"
            if (r6 == 0) goto L_0x0097
            int r6 = r8.length()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            int r6 = r6 + -1
            java.lang.String r6 = r8.substring(r7, r6)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            boolean r8 = r12.add(r6)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            if (r8 == 0) goto L_0x0018
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            r8.<init>()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            r8.append(r13)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            r8.append(r9)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            r8.append(r6)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            java.lang.String r6 = r8.toString()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            android.net.Uri r6 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            java.lang.String r8 = r6.getPath()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            if (r8 == 0) goto L_0x0082
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r8, r7, r7)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            java.lang.String r8 = r6.getPath()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            boolean r8 = r8.equals(r7)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            if (r8 != 0) goto L_0x0082
            android.net.Uri$Builder r6 = r6.buildUpon()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            android.net.Uri$Builder r6 = r6.path(r7)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            android.net.Uri r6 = r6.build()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
        L_0x0082:
            com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            com.tencent.mm.vfs.f0$h r6 = r7.mo177799l(r6, r3)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            boolean r7 = r6.mo177810a()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            if (r7 != 0) goto L_0x008f
            goto L_0x0018
        L_0x008f:
            com.tencent.mm.vfs.FileSystem$c r7 = r6.f348991a     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            java.lang.String r6 = r6.f348992b     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            r7.mo119937g(r6)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            goto L_0x0018
        L_0x0097:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            r6.append(r13)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            r6.append(r9)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            r6.append(r8)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            java.lang.String r6 = r6.toString()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            android.net.Uri r6 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            java.lang.String r10 = r6.getPath()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            if (r10 == 0) goto L_0x00cd
            java.lang.String r10 = com.tencent.p014mm.vfs.C116299g2.m163855k(r10, r7, r7)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            java.lang.String r11 = r6.getPath()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            boolean r11 = r11.equals(r10)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            if (r11 != 0) goto L_0x00cd
            android.net.Uri$Builder r6 = r6.buildUpon()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            android.net.Uri$Builder r6 = r6.path(r10)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            android.net.Uri r6 = r6.build()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
        L_0x00cd:
            java.lang.String r8 = com.tencent.p014mm.vfs.C116299g2.m163852h(r8)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            if (r8 == 0) goto L_0x0123
            boolean r10 = r12.add(r8)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            if (r10 == 0) goto L_0x0123
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            r10.<init>()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            r10.append(r13)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            r10.append(r9)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            r10.append(r8)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            java.lang.String r8 = r10.toString()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            android.net.Uri r8 = com.tencent.p014mm.vfs.C116299g2.m163858n(r8)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            java.lang.String r9 = r8.getPath()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            if (r9 == 0) goto L_0x010f
            java.lang.String r9 = com.tencent.p014mm.vfs.C116299g2.m163855k(r9, r7, r7)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            java.lang.String r10 = r8.getPath()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            boolean r10 = r10.equals(r9)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            if (r10 != 0) goto L_0x010f
            android.net.Uri$Builder r8 = r8.buildUpon()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            android.net.Uri$Builder r8 = r8.path(r9)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            android.net.Uri r8 = r8.build()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
        L_0x010f:
            com.tencent.mm.vfs.f0 r9 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            com.tencent.mm.vfs.f0$h r8 = r9.mo177799l(r8, r3)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            boolean r9 = r8.mo177810a()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            if (r9 != 0) goto L_0x011c
            goto L_0x0123
        L_0x011c:
            com.tencent.mm.vfs.FileSystem$c r9 = r8.f348991a     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            java.lang.String r8 = r8.f348992b     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            r9.mo119937g(r8)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
        L_0x0123:
            com.tencent.mm.vfs.f0 r8 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            com.tencent.mm.vfs.f0$h r8 = r8.mo177799l(r6, r3)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            java.io.OutputStream r6 = m106425G(r6, r8, r7)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
        L_0x012d:
            int r8 = r4.read(r5)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            if (r8 == r2) goto L_0x0137
            r6.write(r5, r7, r8)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            goto L_0x012d
        L_0x0137:
            r6.close()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x0143, all -> 0x0140 }
            goto L_0x0018
        L_0x013c:
            com.tencent.p014mm.vfs.C116299g2.m163847c(r4)
            return r7
        L_0x0140:
            r12 = move-exception
            r3 = r4
            goto L_0x015c
        L_0x0143:
            r12 = move-exception
            r3 = r4
            goto L_0x014c
        L_0x0146:
            r12 = move-exception
            r3 = r4
            goto L_0x0155
        L_0x0149:
            r12 = move-exception
            goto L_0x015c
        L_0x014b:
            r12 = move-exception
        L_0x014c:
            com.tencent.stubs.logger.Log.m106515w((java.lang.String) r1, (java.lang.Throwable) r12, (java.lang.String) r0)     // Catch:{ all -> 0x0149 }
            r12 = -2
            com.tencent.p014mm.vfs.C116299g2.m163847c(r3)
            return r12
        L_0x0154:
            r12 = move-exception
        L_0x0155:
            com.tencent.stubs.logger.Log.m106515w((java.lang.String) r1, (java.lang.Throwable) r12, (java.lang.String) r0)     // Catch:{ all -> 0x0149 }
            com.tencent.p014mm.vfs.C116299g2.m163847c(r3)
            return r2
        L_0x015c:
            com.tencent.p014mm.vfs.C116299g2.m163847c(r3)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.C86013q1.m106436R(java.lang.String, java.lang.String):int");
    }

    /* renamed from: S */
    public static int m106437S(String str, byte[] bArr) {
        return m106438T(str, bArr, 0, bArr.length);
    }

    /* renamed from: T */
    public static int m106438T(String str, byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return -2;
        }
        if (bArr.length < i + i2) {
            return -3;
        }
        OutputStream outputStream = null;
        try {
            outputStream = m106429K(str, false);
            outputStream.write(bArr, i, i2);
            return 0;
        } catch (IOException e) {
            Log.m106498e("MicroMsg.VFSFileOp", "writeFile '%s' Failed: %s", str, e.getMessage());
            return -1;
        } finally {
            C116299g2.m163847c(outputStream);
        }
    }

    /* renamed from: U */
    public static boolean m106439U(String str, String str2) {
        ZipOutputStream zipOutputStream;
        Iterable<C86001b0> iterable;
        int i;
        if (str == null || str.isEmpty()) {
            return false;
        }
        List<String> singletonList = Collections.singletonList(str);
        if (str2 == null || str2.isEmpty()) {
            return false;
        }
        m106461v(m106458s(str2));
        byte[] bArr = new byte[4096];
        InputStream inputStream = null;
        try {
            zipOutputStream = new ZipOutputStream(m106429K(str2, false));
            try {
                for (String n : singletonList) {
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(C116299g2.m163858n(n), (C116281f0.C116288h) null);
                    if (l.mo177810a()) {
                        C86001b0 q = l.f348991a.mo119945q(l.f348992b);
                        if (q != null) {
                            if (q.f250476f) {
                                i = l.f348992b.length() + (true ^ l.f348992b.endsWith("/") ? 1 : 0);
                                iterable = C116299g2.m163859o(l.f348991a, l.f348992b);
                                if (iterable == null) {
                                }
                            } else {
                                List singletonList2 = Collections.singletonList(q);
                                i = l.f348992b.lastIndexOf(47) + 1;
                                iterable = singletonList2;
                            }
                            for (C86001b0 next : iterable) {
                                if (!next.f250476f) {
                                    String substring = next.f250471a.length() < i ? next.f250472b : next.f250471a.substring(i);
                                    InputStream openRead = next.f250477g.openRead(next.f250471a);
                                    try {
                                        zipOutputStream.putNextEntry(new ZipEntry(substring));
                                        while (true) {
                                            int read = openRead.read(bArr);
                                            if (read < 0) {
                                                break;
                                            }
                                            zipOutputStream.write(bArr, 0, read);
                                        }
                                        openRead.close();
                                        zipOutputStream.closeEntry();
                                    } catch (IOException e) {
                                        e = e;
                                        inputStream = openRead;
                                        try {
                                            Log.m106515w("MicroMsg.VFSFileOp", (Throwable) e, "Failed to write ZipFile");
                                            C116299g2.m163847c(inputStream);
                                            C116299g2.m163847c(zipOutputStream);
                                            return false;
                                        } catch (Throwable th) {
                                            th = th;
                                            C116299g2.m163847c(inputStream);
                                            C116299g2.m163847c(zipOutputStream);
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        inputStream = openRead;
                                        C116299g2.m163847c(inputStream);
                                        C116299g2.m163847c(zipOutputStream);
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                }
                C116299g2.m163847c(zipOutputStream);
                return true;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e = e3;
            zipOutputStream = null;
            Log.m106515w("MicroMsg.VFSFileOp", (Throwable) e, "Failed to write ZipFile");
            C116299g2.m163847c(inputStream);
            C116299g2.m163847c(zipOutputStream);
            return false;
        } catch (Throwable th5) {
            th = th5;
            zipOutputStream = null;
            C116299g2.m163847c(inputStream);
            C116299g2.m163847c(zipOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static int m106440a(String str, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        if (bArr.length == 0 || bArr.length < 0 + length) {
            return -2;
        }
        OutputStream outputStream = null;
        try {
            outputStream = m106429K(str, true);
            outputStream.write(bArr, 0, length);
        } catch (Exception e) {
            Log.m106515w("MicroMsg.VFSFileOp", (Throwable) e, "");
            Log.m106514w("MicroMsg.VFSFileOp", "file op appendToFile e type:%s, e msg:%s, fileName:%s, buf len:%d, bufOffset:%d, writeLen:%d", e.getClass().getSimpleName(), e.getMessage(), str, Integer.valueOf(bArr.length), 0, Integer.valueOf(length));
            i = -1;
        } catch (Throwable th) {
            C116299g2.m163847c(outputStream);
            throw th;
        }
        C116299g2.m163847c(outputStream);
        return i;
    }

    /* renamed from: b */
    public static boolean m106441b(String str, String str2) {
        Uri n = C116299g2.m163858n(str);
        C116281f0 f0Var = C116281f0.C116289i.f348994a;
        return m106434P(f0Var.mo177799l(n, (C116281f0.C116288h) null), f0Var.mo177799l(C116299g2.m163858n(str2), (C116281f0.C116288h) null), false);
    }

    /* renamed from: c */
    public static long m106442c(String str, String str2) {
        return m106443d(str, str2, false);
    }

    /* renamed from: d */
    public static long m106443d(String str, String str2, boolean z) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || str.equals(str2)) {
            return -1;
        }
        C116281f0 f0Var = C116281f0.C116289i.f348994a;
        C116281f0.C116288h l = f0Var.mo177799l(C116299g2.m163858n(str), (C116281f0.C116288h) null);
        C116281f0.C116288h l2 = f0Var.mo177799l(C116299g2.m163858n(str2), (C116281f0.C116288h) null);
        if (l.mo177810a() && l2.mo177810a()) {
            try {
                return l2.f348991a.mo119934d(l2.f348992b, l.f348991a, l.f348992b, z);
            } catch (IOException e) {
                Log.m106513w("MicroMsg.VFSFileOp", "Failed to copy file " + str + " -> " + str2 + ": " + e.getMessage());
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static boolean m106444e(String str) {
        try {
            C86009m1 m1Var = new C86009m1(str);
            return m1Var.mo119967g() || m1Var.mo119964e();
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m106445f(String str) {
        return m106446g(str, true);
    }

    /* renamed from: g */
    public static boolean m106446g(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return false;
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(C116299g2.m163858n(str), (C116281f0.C116288h) null);
        if (!l.mo177810a()) {
            return false;
        }
        return l.f348991a.mo119942o(l.f348992b, z);
    }

    /* renamed from: h */
    public static boolean m106447h(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        Uri n = C116299g2.m163858n(str);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        return l.mo177810a() && l.f348991a.mo119933c(l.f348992b);
    }

    /* renamed from: i */
    public static String m106448i(String str, boolean z) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return C116299g2.m163862r(C116299g2.m163858n(str), z);
    }

    /* renamed from: j */
    public static Uri m106449j(C86009m1 m1Var, String str) {
        Uri uri = m1Var.f250486d;
        Uri e = C116281f0.C116289i.f348994a.mo177792e(uri);
        if (e == null) {
            Log.m106513w("MicroMsg.VFSFileOp", "Cannot get URI for export: " + uri);
            return null;
        }
        Uri vfsUriToContentUri = VFSFileProvider.vfsUriToContentUri(e, str);
        if (vfsUriToContentUri == null) {
            Log.m106513w("MicroMsg.VFSFileOp", "Cannot convert export URI to content URI: " + e);
        }
        return vfsUriToContentUri;
    }

    /* renamed from: k */
    public static boolean m106450k(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(C116299g2.m163858n(str), (C116281f0.C116288h) null);
        if (!l.mo177810a()) {
            return false;
        }
        return l.f348991a.mo119948x(l.f348992b);
    }

    /* renamed from: l */
    public static long m106451l(String str) {
        C86001b0 q;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(C116299g2.m163858n(str), (C116281f0.C116288h) null);
        if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
            return q.f250473c;
        }
        return 0;
    }

    /* renamed from: m */
    public static long m106452m(String str) {
        C86001b0 q;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(C116299g2.m163858n(str), (C116281f0.C116288h) null);
        if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
            return q.f250475e;
        }
        return 0;
    }

    /* renamed from: n */
    public static C86001b0 m106453n(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(C116299g2.m163858n(str), (C116281f0.C116288h) null);
        if (!l.mo177810a()) {
            return null;
        }
        return l.f348991a.mo119945q(l.f348992b);
    }

    /* renamed from: o */
    public static String m106454o(String str) {
        if (str != null && str.length() > 0) {
            Uri n = C116299g2.m163858n(str);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            String path2 = n.getPath();
            int lastIndexOf = path2.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                path2 = path2.substring(lastIndexOf + 1);
            }
            int lastIndexOf2 = path2.lastIndexOf(46);
            if (lastIndexOf2 > 0 && lastIndexOf2 != path2.length() - 1) {
                return path2.substring(lastIndexOf2 + 1);
            }
        }
        return "";
    }

    /* renamed from: p */
    public static byte[] m106455p(String str) {
        InputStream inputStream;
        Throwable th;
        if (str == null) {
            return null;
        }
        try {
            inputStream = m106423E(str);
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read >= 0) {
                        instance.update(bArr, 0, read);
                    } else {
                        byte[] digest = instance.digest();
                        C116299g2.m163847c(inputStream);
                        return digest;
                    }
                }
            } catch (Exception unused) {
                C116299g2.m163847c(inputStream);
                return null;
            } catch (Throwable th4) {
                th = th4;
                C116299g2.m163847c(inputStream);
                throw th;
            }
        } catch (Exception unused2) {
            inputStream = null;
            C116299g2.m163847c(inputStream);
            return null;
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            C116299g2.m163847c(inputStream);
            throw th;
        }
    }

    /* renamed from: q */
    public static String m106456q(String str) {
        byte[] p = m106455p(str);
        if (p == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        for (byte b : p) {
            sb.append(Integer.toString((b & ExifInterface.MARKER) + 256, 16).substring(1));
        }
        return sb.toString();
    }

    /* renamed from: r */
    public static String m106457r(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        Uri n = C116299g2.m163858n(str);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        String path2 = n.getPath();
        int lastIndexOf = path2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            path2 = path2.substring(lastIndexOf + 1);
        }
        int lastIndexOf2 = path2.lastIndexOf(46);
        return lastIndexOf2 < 0 ? str : lastIndexOf2 == 0 ? "" : path2.substring(0, lastIndexOf2);
    }

    /* renamed from: s */
    public static String m106458s(String str) {
        return new C86009m1(str).mo119969h().mo119973k();
    }

    /* renamed from: t */
    public static Iterable<C86001b0> m106459t(String str, boolean z) {
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(C116299g2.m163858n(str), (C116281f0.C116288h) null);
        if (!l.mo177810a()) {
            return null;
        }
        return z ? C116299g2.m163859o(l.f348991a, l.f348992b) : l.f348991a.list(l.f348992b);
    }

    /* renamed from: u */
    public static void m106460u(String str) {
        if (str != null && !str.isEmpty()) {
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(C116299g2.m163858n(str), (C116281f0.C116288h) null);
            if (l.mo177810a() && (l.f348991a.mo119936f() & 2) != 0 && l.f348991a.mo119947w(l.f348992b, true) != null) {
                try {
                    FileSystem.C85995c cVar = l.f348991a;
                    cVar.mo119941m(l.f348992b + "/.nomedia", false).close();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: v */
    public static boolean m106461v(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        C86009m1 m1Var = new C86009m1(str);
        return m1Var.mo119987x() || m1Var.mo119977o();
    }

    /* renamed from: w */
    public static boolean m106462w(String str, String str2) {
        Uri n = C116299g2.m163858n(str);
        C116281f0 f0Var = C116281f0.C116289i.f348994a;
        C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
        C116281f0.C116288h l2 = f0Var.mo177799l(C116299g2.m163858n(str2), (C116281f0.C116288h) null);
        if (!l.mo177810a() || !l2.mo177810a() || l.equals(l2)) {
            return false;
        }
        try {
            if (l2.f348991a.mo119946t(l2.f348992b, l.f348991a, l.f348992b)) {
                return true;
            }
            return m106434P(l, l2, true) && m106446g(str, false);
        } catch (IOException e) {
            Log.m106498e("MicroMsg.VFSFileOp", "Cannot move dir: " + str + " -> " + str2, e);
            return false;
        }
    }

    /* renamed from: x */
    public static boolean m106463x(String str, String str2) {
        if (str == null || str2 == null || str.length() == 0 || str2.length() == 0) {
            return false;
        }
        C116281f0 f0Var = C116281f0.C116289i.f348994a;
        C116281f0.C116288h l = f0Var.mo177799l(C116299g2.m163858n(str), (C116281f0.C116288h) null);
        C116281f0.C116288h l2 = f0Var.mo177799l(C116299g2.m163858n(str2), (C116281f0.C116288h) null);
        if (!l.mo177810a() || !l2.mo177810a()) {
            return false;
        }
        try {
            boolean t = l2.f348991a.mo119946t(l2.f348992b, l.f348991a, l.f348992b);
            if (t) {
                return t;
            }
            boolean z = l2.f348991a.mo119934d(l2.f348992b, l.f348991a, l.f348992b, false) >= 0;
            if (z) {
                l.f348991a.mo119933c(l.f348992b);
            }
            return z;
        } catch (IOException e) {
            Log.m106513w("MicroMsg.VFSFileOp", "Failed to move file " + str + " -> " + str2 + ": " + e.getMessage());
            return false;
        }
    }

    /* renamed from: y */
    public static ParcelFileDescriptor m106464y(Uri uri, C116281f0.C116288h hVar, String str) {
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(uri, hVar);
        if (l.mo177810a()) {
            return l.f348991a.mo119939i(l.f348992b, str);
        }
        throw new FileNotFoundException("Cannot resolve path or URI: " + uri);
    }

    /* renamed from: z */
    public static ParcelFileDescriptor m106465z(String str, String str2) {
        return m106464y(C116299g2.m163858n(str), (C116281f0.C116288h) null, str2);
    }
}
