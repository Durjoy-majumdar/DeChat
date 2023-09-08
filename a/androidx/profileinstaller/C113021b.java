package androidx.profileinstaller;

import android.content.pm.PackageInfo;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: androidx.profileinstaller.b */
public class C113021b {

    /* renamed from: a */
    public static final C113023b f338307a = new C113022a();

    /* renamed from: androidx.profileinstaller.b$a */
    public class C113022a implements C113023b {
        /* renamed from: a */
        public void mo165382a(int i, Object obj) {
        }
    }

    /* renamed from: androidx.profileinstaller.b$b */
    public interface C113023b {
        /* renamed from: a */
        void mo165382a(int i, Object obj);
    }

    /* renamed from: a */
    public static void m154638a(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0243, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x024e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:?, code lost:
        r4.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:191:0x0237, B:201:0x024a] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c6  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m154639b(android.content.Context r18, java.util.concurrent.Executor r19, androidx.profileinstaller.C113021b.C113023b r20, boolean r21) {
        /*
            r4 = r20
            java.lang.String r9 = "Invalid magic"
            android.content.Context r0 = r18.getApplicationContext()
            java.lang.String r1 = r0.getPackageName()
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo()
            android.content.res.AssetManager r10 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r2.sourceDir
            r0.<init>(r2)
            java.lang.String r11 = r0.getName()
            android.content.pm.PackageManager r0 = r18.getPackageManager()
            r13 = 0
            android.content.pm.PackageInfo r14 = r0.getPackageInfo(r1, r13)     // Catch:{ NameNotFoundException -> 0x028f }
            java.io.File r15 = r18.getFilesDir()
            r8 = 0
            r7 = 1
            if (r21 != 0) goto L_0x0075
            java.io.File r0 = new java.io.File
            java.lang.String r2 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r15, r2)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L_0x003e
            goto L_0x006c
        L_0x003e:
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ IOException -> 0x006b }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006b }
            r3.<init>(r0)     // Catch:{ IOException -> 0x006b }
            r2.<init>(r3)     // Catch:{ IOException -> 0x006b }
            long r5 = r2.readLong()     // Catch:{ all -> 0x005f }
            r2.close()     // Catch:{ IOException -> 0x006b }
            long r2 = r14.lastUpdateTime
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0057
            r0 = 1
            goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            if (r0 == 0) goto L_0x006d
            r2 = 2
            r4.mo165382a(r2, r8)
            goto L_0x006d
        L_0x005f:
            r0 = move-exception
            r3 = r0
            r2.close()     // Catch:{ all -> 0x0065 }
            goto L_0x006a
        L_0x0065:
            r0 = move-exception
            r2 = r0
            r3.addSuppressed(r2)     // Catch:{ IOException -> 0x006b }
        L_0x006a:
            throw r3     // Catch:{ IOException -> 0x006b }
        L_0x006b:
        L_0x006c:
            r0 = 0
        L_0x006d:
            if (r0 != 0) goto L_0x0070
            goto L_0x0075
        L_0x0070:
            r18.getPackageName()
            goto L_0x027d
        L_0x0075:
            r18.getPackageName()
            int r0 = android.os.Build.VERSION.SDK_INT
            java.io.File r6 = new java.io.File
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "/data/misc/profiles/cur/0"
            r2.<init>(r3, r1)
            java.lang.String r1 = "primary.prof"
            r6.<init>(r2, r1)
            androidx.profileinstaller.a r5 = new androidx.profileinstaller.a
            java.lang.String r3 = "dexopt/baseline.prof"
            java.lang.String r16 = "dexopt/baseline.profm"
            r1 = r5
            r2 = r10
            r18 = r3
            r3 = r19
            r4 = r20
            r13 = r5
            r5 = r11
            r17 = r6
            r6 = r18
            r12 = 1
            r7 = r16
            r12 = r8
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            byte[] r1 = r13.f338302d
            r2 = 4
            if (r1 != 0) goto L_0x00b3
            r1 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13.mo165383a(r1, r0)
            goto L_0x00bc
        L_0x00b3:
            boolean r0 = r17.canWrite()
            if (r0 != 0) goto L_0x00be
            r13.mo165383a(r2, r12)
        L_0x00bc:
            r7 = 0
            goto L_0x00c2
        L_0x00be:
            r1 = 1
            r13.f338304f = r1
            r7 = 1
        L_0x00c2:
            if (r7 != 0) goto L_0x00c6
            goto L_0x027d
        L_0x00c6:
            boolean r0 = r13.f338304f
            java.lang.String r1 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L_0x0289
            byte[] r0 = r13.f338302d
            r3 = 6
            r4 = 8
            if (r0 != 0) goto L_0x00d5
            goto L_0x01b3
        L_0x00d5:
            r0 = r18
            android.content.res.AssetFileDescriptor r5 = r10.openFd(r0)     // Catch:{ FileNotFoundException -> 0x012d, IOException -> 0x0125, IllegalStateException -> 0x011e }
            java.io.FileInputStream r6 = r5.createInputStream()     // Catch:{ all -> 0x0110 }
            byte[] r0 = p1062x3.C118821h.f355509a     // Catch:{ all -> 0x0102 }
            byte[] r7 = p1062x3.C91136c.m114341b(r6, r2)     // Catch:{ all -> 0x0102 }
            boolean r0 = java.util.Arrays.equals(r0, r7)     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x00fc
            byte[] r0 = p1062x3.C91136c.m114341b(r6, r2)     // Catch:{ all -> 0x0102 }
            x3.b[] r0 = p1062x3.C118821h.m167521h(r6, r0, r11)     // Catch:{ all -> 0x0102 }
            r13.f338305g = r0     // Catch:{ all -> 0x0102 }
            r6.close()     // Catch:{ all -> 0x0110 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x012d, IOException -> 0x0125, IllegalStateException -> 0x011e }
            goto L_0x0133
        L_0x00fc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0102 }
            r0.<init>(r9)     // Catch:{ all -> 0x0102 }
            throw r0     // Catch:{ all -> 0x0102 }
        L_0x0102:
            r0 = move-exception
            r7 = r0
            if (r6 == 0) goto L_0x010f
            r6.close()     // Catch:{ all -> 0x010a }
            goto L_0x010f
        L_0x010a:
            r0 = move-exception
            r6 = r0
            r7.addSuppressed(r6)     // Catch:{ all -> 0x0110 }
        L_0x010f:
            throw r7     // Catch:{ all -> 0x0110 }
        L_0x0110:
            r0 = move-exception
            r6 = r0
            if (r5 == 0) goto L_0x011d
            r5.close()     // Catch:{ all -> 0x0118 }
            goto L_0x011d
        L_0x0118:
            r0 = move-exception
            r5 = r0
            r6.addSuppressed(r5)     // Catch:{ FileNotFoundException -> 0x012d, IOException -> 0x0125, IllegalStateException -> 0x011e }
        L_0x011d:
            throw r6     // Catch:{ FileNotFoundException -> 0x012d, IOException -> 0x0125, IllegalStateException -> 0x011e }
        L_0x011e:
            r0 = move-exception
            androidx.profileinstaller.b$b r5 = r13.f338301c
            r5.mo165382a(r4, r0)
            goto L_0x0133
        L_0x0125:
            r0 = move-exception
            androidx.profileinstaller.b$b r5 = r13.f338301c
            r6 = 7
            r5.mo165382a(r6, r0)
            goto L_0x0133
        L_0x012d:
            r0 = move-exception
            androidx.profileinstaller.b$b r5 = r13.f338301c
            r5.mo165382a(r3, r0)
        L_0x0133:
            x3.b[] r0 = r13.f338305g
            if (r0 == 0) goto L_0x01b3
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 24
            if (r5 >= r6) goto L_0x013e
            goto L_0x0148
        L_0x013e:
            if (r5 == r6) goto L_0x014a
            r6 = 25
            if (r5 == r6) goto L_0x014a
            r6 = 31
            if (r5 == r6) goto L_0x014a
        L_0x0148:
            r7 = 0
            goto L_0x014b
        L_0x014a:
            r7 = 1
        L_0x014b:
            if (r7 == 0) goto L_0x01b3
            android.content.res.AssetManager r5 = r13.f338299a     // Catch:{ FileNotFoundException -> 0x01ab, IOException -> 0x01a3, IllegalStateException -> 0x019a }
            java.lang.String r6 = "dexopt/baseline.profm"
            android.content.res.AssetFileDescriptor r5 = r5.openFd(r6)     // Catch:{ FileNotFoundException -> 0x01ab, IOException -> 0x01a3, IllegalStateException -> 0x019a }
            java.io.FileInputStream r6 = r5.createInputStream()     // Catch:{ all -> 0x018c }
            byte[] r7 = p1062x3.C118821h.f355510b     // Catch:{ all -> 0x017e }
            byte[] r8 = p1062x3.C91136c.m114341b(r6, r2)     // Catch:{ all -> 0x017e }
            boolean r7 = java.util.Arrays.equals(r7, r8)     // Catch:{ all -> 0x017e }
            if (r7 == 0) goto L_0x0178
            byte[] r2 = p1062x3.C91136c.m114341b(r6, r2)     // Catch:{ all -> 0x017e }
            byte[] r7 = r13.f338302d     // Catch:{ all -> 0x017e }
            x3.b[] r0 = p1062x3.C118821h.m167518e(r6, r2, r7, r0)     // Catch:{ all -> 0x017e }
            r13.f338305g = r0     // Catch:{ all -> 0x017e }
            r6.close()     // Catch:{ all -> 0x018c }
            r5.close()     // Catch:{ FileNotFoundException -> 0x01ab, IOException -> 0x01a3, IllegalStateException -> 0x019a }
            goto L_0x01b3
        L_0x0178:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x017e }
            r0.<init>(r9)     // Catch:{ all -> 0x017e }
            throw r0     // Catch:{ all -> 0x017e }
        L_0x017e:
            r0 = move-exception
            r2 = r0
            if (r6 == 0) goto L_0x018b
            r6.close()     // Catch:{ all -> 0x0186 }
            goto L_0x018b
        L_0x0186:
            r0 = move-exception
            r6 = r0
            r2.addSuppressed(r6)     // Catch:{ all -> 0x018c }
        L_0x018b:
            throw r2     // Catch:{ all -> 0x018c }
        L_0x018c:
            r0 = move-exception
            r2 = r0
            if (r5 == 0) goto L_0x0199
            r5.close()     // Catch:{ all -> 0x0194 }
            goto L_0x0199
        L_0x0194:
            r0 = move-exception
            r5 = r0
            r2.addSuppressed(r5)     // Catch:{ FileNotFoundException -> 0x01ab, IOException -> 0x01a3, IllegalStateException -> 0x019a }
        L_0x0199:
            throw r2     // Catch:{ FileNotFoundException -> 0x01ab, IOException -> 0x01a3, IllegalStateException -> 0x019a }
        L_0x019a:
            r0 = move-exception
            r13.f338305g = r12
            androidx.profileinstaller.b$b r2 = r13.f338301c
            r2.mo165382a(r4, r0)
            goto L_0x01b3
        L_0x01a3:
            r0 = move-exception
            androidx.profileinstaller.b$b r2 = r13.f338301c
            r5 = 7
            r2.mo165382a(r5, r0)
            goto L_0x01b3
        L_0x01ab:
            r0 = move-exception
            androidx.profileinstaller.b$b r2 = r13.f338301c
            r5 = 9
            r2.mo165382a(r5, r0)
        L_0x01b3:
            x3.b[] r0 = r13.f338305g
            byte[] r2 = r13.f338302d
            if (r0 == 0) goto L_0x020c
            if (r2 != 0) goto L_0x01bc
            goto L_0x020c
        L_0x01bc:
            boolean r5 = r13.f338304f
            if (r5 == 0) goto L_0x0206
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x01fc, IllegalStateException -> 0x01f5 }
            r5.<init>()     // Catch:{ IOException -> 0x01fc, IllegalStateException -> 0x01f5 }
            byte[] r6 = p1062x3.C118821h.f355509a     // Catch:{ all -> 0x01e9 }
            r5.write(r6)     // Catch:{ all -> 0x01e9 }
            r5.write(r2)     // Catch:{ all -> 0x01e9 }
            boolean r0 = p1062x3.C118821h.m167523j(r5, r2, r0)     // Catch:{ all -> 0x01e9 }
            if (r0 != 0) goto L_0x01df
            androidx.profileinstaller.b$b r0 = r13.f338301c     // Catch:{ all -> 0x01e9 }
            r2 = 5
            r0.mo165382a(r2, r12)     // Catch:{ all -> 0x01e9 }
            r13.f338305g = r12     // Catch:{ all -> 0x01e9 }
            r5.close()     // Catch:{ IOException -> 0x01fc, IllegalStateException -> 0x01f5 }
            goto L_0x020c
        L_0x01df:
            byte[] r0 = r5.toByteArray()     // Catch:{ all -> 0x01e9 }
            r13.f338306h = r0     // Catch:{ all -> 0x01e9 }
            r5.close()     // Catch:{ IOException -> 0x01fc, IllegalStateException -> 0x01f5 }
            goto L_0x0203
        L_0x01e9:
            r0 = move-exception
            r2 = r0
            r5.close()     // Catch:{ all -> 0x01ef }
            goto L_0x01f4
        L_0x01ef:
            r0 = move-exception
            r5 = r0
            r2.addSuppressed(r5)     // Catch:{ IOException -> 0x01fc, IllegalStateException -> 0x01f5 }
        L_0x01f4:
            throw r2     // Catch:{ IOException -> 0x01fc, IllegalStateException -> 0x01f5 }
        L_0x01f5:
            r0 = move-exception
            androidx.profileinstaller.b$b r2 = r13.f338301c
            r2.mo165382a(r4, r0)
            goto L_0x0203
        L_0x01fc:
            r0 = move-exception
            androidx.profileinstaller.b$b r2 = r13.f338301c
            r4 = 7
            r2.mo165382a(r4, r0)
        L_0x0203:
            r13.f338305g = r12
            goto L_0x020c
        L_0x0206:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x020c:
            byte[] r0 = r13.f338306h
            if (r0 != 0) goto L_0x0213
            r5 = 0
            goto L_0x0277
        L_0x0213:
            boolean r2 = r13.f338304f
            if (r2 == 0) goto L_0x0283
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ FileNotFoundException -> 0x026e, IOException -> 0x0267 }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x026e, IOException -> 0x0267 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0254 }
            java.io.File r0 = r13.f338303e     // Catch:{ all -> 0x0254 }
            r2.<init>(r0)     // Catch:{ all -> 0x0254 }
            r0 = 512(0x200, float:7.175E-43)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0247 }
        L_0x0227:
            int r4 = r1.read(r0)     // Catch:{ all -> 0x0247 }
            if (r4 <= 0) goto L_0x0232
            r5 = 0
            r2.write(r0, r5, r4)     // Catch:{ all -> 0x0245 }
            goto L_0x0227
        L_0x0232:
            r4 = 1
            r5 = 0
            r13.mo165383a(r4, r12)     // Catch:{ all -> 0x0245 }
            r2.close()     // Catch:{ all -> 0x0243 }
            r1.close()     // Catch:{ FileNotFoundException -> 0x0263, IOException -> 0x0261 }
            r13.f338306h = r12
            r13.f338305g = r12
            r13 = 1
            goto L_0x0278
        L_0x0243:
            r0 = move-exception
            goto L_0x0256
        L_0x0245:
            r0 = move-exception
            goto L_0x0249
        L_0x0247:
            r0 = move-exception
            r5 = 0
        L_0x0249:
            r4 = r0
            r2.close()     // Catch:{ all -> 0x024e }
            goto L_0x0253
        L_0x024e:
            r0 = move-exception
            r2 = r0
            r4.addSuppressed(r2)     // Catch:{ all -> 0x0243 }
        L_0x0253:
            throw r4     // Catch:{ all -> 0x0243 }
        L_0x0254:
            r0 = move-exception
            r5 = 0
        L_0x0256:
            r2 = r0
            r1.close()     // Catch:{ all -> 0x025b }
            goto L_0x0260
        L_0x025b:
            r0 = move-exception
            r1 = r0
            r2.addSuppressed(r1)     // Catch:{ FileNotFoundException -> 0x0263, IOException -> 0x0261 }
        L_0x0260:
            throw r2     // Catch:{ FileNotFoundException -> 0x0263, IOException -> 0x0261 }
        L_0x0261:
            r0 = move-exception
            goto L_0x0269
        L_0x0263:
            r0 = move-exception
            goto L_0x0270
        L_0x0265:
            r0 = move-exception
            goto L_0x027e
        L_0x0267:
            r0 = move-exception
            r5 = 0
        L_0x0269:
            r1 = 7
            r13.mo165383a(r1, r0)     // Catch:{ all -> 0x0265 }
            goto L_0x0273
        L_0x026e:
            r0 = move-exception
            r5 = 0
        L_0x0270:
            r13.mo165383a(r3, r0)     // Catch:{ all -> 0x0265 }
        L_0x0273:
            r13.f338306h = r12
            r13.f338305g = r12
        L_0x0277:
            r13 = 0
        L_0x0278:
            if (r13 == 0) goto L_0x027d
            m154638a(r14, r15)
        L_0x027d:
            return
        L_0x027e:
            r13.f338306h = r12
            r13.f338305g = r12
            throw r0
        L_0x0283:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0289:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x028f:
            r0 = move-exception
            r1 = r0
            r2 = 7
            r4.mo165382a(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.C113021b.m154639b(android.content.Context, java.util.concurrent.Executor, androidx.profileinstaller.b$b, boolean):void");
    }
}
