package z24;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: z24.f */
public class C91609f {

    /* renamed from: a */
    public final Set<String> f262448a = new HashSet();

    /* renamed from: b */
    public final C91608d f262449b;

    /* renamed from: c */
    public final C91607c f262450c;

    /* renamed from: z24.f$a */
    public class C91610a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f262451d;

        /* renamed from: e */
        public final /* synthetic */ String f262452e;

        /* renamed from: f */
        public final /* synthetic */ String f262453f;

        public C91610a(Context context, String str, String str2, C66732e eVar) {
            this.f262451d = context;
            this.f262452e = str;
            this.f262453f = str2;
        }

        public void run() {
            try {
                C91609f.this.mo125479c(this.f262451d, this.f262452e, this.f262453f);
                throw null;
            } catch (UnsatisfiedLinkError unused) {
                throw null;
            } catch (C91606b unused2) {
                throw null;
            }
        }
    }

    public C91609f() {
        C91612h hVar = new C91612h();
        C91604a aVar = new C91604a();
        this.f262449b = hVar;
        this.f262450c = aVar;
    }

    /* renamed from: a */
    public File mo125477a(Context context, String str, String str2) {
        String b = ((C91612h) this.f262449b).mo125484b(str);
        if (str2 == null || str2.length() == 0) {
            return new File(context.getDir("lib", 0), b);
        }
        File dir = context.getDir("lib", 0);
        return new File(dir, b + "." + str2);
    }

    /* renamed from: b */
    public void mo125478b(Context context, String str, String str2, C66732e eVar) {
        if (context != null) {
            if (!(str == null || str.length() == 0)) {
                mo125480d("Beginning load of %s...", str);
                if (eVar == null) {
                    mo125479c(context, str, str2);
                } else {
                    new Thread(new C91610a(context, str, str2, eVar)).start();
                }
            } else {
                throw new IllegalArgumentException("Given library is either null or empty");
            }
        } else {
            throw new IllegalArgumentException("Given context is null");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r7.mo125475a(r8);
        r7.mo125475a(r12);
        r0.setReadable(r5, false);
        r0.setExecutable(r5, false);
        r0.setWritable(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r2 = r2.f262446a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0130, code lost:
        if (r2 == null) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r2 = r2.f262446a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x015e, code lost:
        if (r2 == null) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0160, code lost:
        r2.close();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0193 A[SYNTHETIC, Splitter:B:100:0x0193] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo125479c(android.content.Context r19, java.lang.String r20, java.lang.String r21) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r3 = r20
            java.util.Set<java.lang.String> r0 = r1.f262448a
            java.util.HashSet r0 = (java.util.HashSet) r0
            boolean r0 = r0.contains(r3)
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x001c
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r3
            java.lang.String r2 = "%s already loaded previously!"
            r1.mo125480d(r2, r0)
            return
        L_0x001c:
            r6 = 2
            z24.d r0 = r1.f262449b     // Catch:{ UnsatisfiedLinkError -> 0x0037 }
            z24.h r0 = (z24.C91612h) r0     // Catch:{ UnsatisfiedLinkError -> 0x0037 }
            r0.mo125483a(r3)     // Catch:{ UnsatisfiedLinkError -> 0x0037 }
            java.util.Set<java.lang.String> r0 = r1.f262448a     // Catch:{ UnsatisfiedLinkError -> 0x0037 }
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ UnsatisfiedLinkError -> 0x0037 }
            r0.add(r3)     // Catch:{ UnsatisfiedLinkError -> 0x0037 }
            java.lang.String r0 = "%s (%s) was loaded normally!"
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ UnsatisfiedLinkError -> 0x0037 }
            r7[r4] = r3     // Catch:{ UnsatisfiedLinkError -> 0x0037 }
            r7[r5] = r21     // Catch:{ UnsatisfiedLinkError -> 0x0037 }
            r1.mo125480d(r0, r7)     // Catch:{ UnsatisfiedLinkError -> 0x0037 }
            return
        L_0x0037:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r7[r4] = r0
            java.lang.String r0 = "Loading the library normally failed: %s"
            r1.mo125480d(r0, r7)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r4] = r3
            r0[r5] = r21
            java.lang.String r7 = "%s (%s) was not loaded normally, re-linking..."
            r1.mo125480d(r7, r0)
            java.io.File r0 = r18.mo125477a(r19, r20, r21)
            boolean r7 = r0.exists()
            if (r7 == 0) goto L_0x005c
            goto L_0x0163
        L_0x005c:
            java.lang.String r7 = "lib"
            java.io.File r7 = r2.getDir(r7, r4)
            java.io.File r8 = r18.mo125477a(r19, r20, r21)
            z24.d r9 = r1.f262449b
            z24.h r9 = (z24.C91612h) r9
            java.lang.String r9 = r9.mo125484b(r3)
            z24.g r10 = new z24.g
            r10.<init>(r1, r9)
            java.io.File[] r7 = r7.listFiles(r10)
            if (r7 != 0) goto L_0x007a
            goto L_0x0094
        L_0x007a:
            int r9 = r7.length
            r10 = 0
        L_0x007c:
            if (r10 >= r9) goto L_0x0094
            r11 = r7[r10]
            java.lang.String r12 = r11.getAbsolutePath()
            java.lang.String r13 = r8.getAbsolutePath()
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0091
            r11.delete()     // Catch:{ SecurityException -> 0x0091 }
        L_0x0091:
            int r10 = r10 + 1
            goto L_0x007c
        L_0x0094:
            z24.c r7 = r1.f262450c
            z24.d r8 = r1.f262449b
            z24.h r8 = (z24.C91612h) r8
            r8.getClass()
            java.lang.String[] r8 = android.os.Build.SUPPORTED_ABIS
            int r9 = r8.length
            if (r9 <= 0) goto L_0x00a3
            goto L_0x00c3
        L_0x00a3:
            java.lang.String r8 = android.os.Build.CPU_ABI2
            if (r8 == 0) goto L_0x00b0
            int r9 = r8.length()
            if (r9 != 0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r9 = 0
            goto L_0x00b1
        L_0x00b0:
            r9 = 1
        L_0x00b1:
            if (r9 != 0) goto L_0x00bd
            java.lang.String[] r9 = new java.lang.String[r6]
            java.lang.String r10 = android.os.Build.CPU_ABI
            r9[r4] = r10
            r9[r5] = r8
            r8 = r9
            goto L_0x00c3
        L_0x00bd:
            java.lang.String[] r8 = new java.lang.String[r5]
            java.lang.String r9 = android.os.Build.CPU_ABI
            r8[r4] = r9
        L_0x00c3:
            z24.d r9 = r1.f262449b
            z24.h r9 = (z24.C91612h) r9
            java.lang.String r9 = r9.mo125484b(r3)
            z24.a r7 = (z24.C91604a) r7
            r7.getClass()
            z24.a$a r2 = r7.mo125476b(r2, r8, r9, r1)     // Catch:{ all -> 0x018f }
            if (r2 == 0) goto L_0x0186
            r8 = 0
        L_0x00d7:
            int r11 = r8 + 1
            r12 = 5
            if (r8 >= r12) goto L_0x015c
            java.lang.String r8 = "Found %s! Extracting..."
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x018c }
            r12[r4] = r9     // Catch:{ all -> 0x018c }
            r1.mo125480d(r8, r12)     // Catch:{ all -> 0x018c }
            boolean r8 = r0.exists()     // Catch:{ IOException -> 0x0156 }
            if (r8 != 0) goto L_0x00f2
            boolean r8 = r0.createNewFile()     // Catch:{ IOException -> 0x0156 }
            if (r8 != 0) goto L_0x00f2
            goto L_0x0157
        L_0x00f2:
            java.util.zip.ZipFile r8 = r2.f262446a     // Catch:{ FileNotFoundException | IOException -> 0x014d, all -> 0x0143 }
            java.util.zip.ZipEntry r12 = r2.f262447b     // Catch:{ FileNotFoundException | IOException -> 0x014d, all -> 0x0143 }
            java.io.InputStream r8 = r8.getInputStream(r12)     // Catch:{ FileNotFoundException | IOException -> 0x014d, all -> 0x0143 }
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException | IOException -> 0x014e, all -> 0x013e }
            r12.<init>(r0)     // Catch:{ FileNotFoundException | IOException -> 0x014e, all -> 0x013e }
            r13 = 4096(0x1000, float:5.74E-42)
            byte[] r13 = new byte[r13]     // Catch:{ FileNotFoundException | IOException -> 0x014f, all -> 0x013b }
            r14 = 0
        L_0x0105:
            int r10 = r8.read(r13)     // Catch:{ FileNotFoundException | IOException -> 0x014f, all -> 0x013b }
            r6 = -1
            if (r10 != r6) goto L_0x0133
            r12.flush()     // Catch:{ FileNotFoundException | IOException -> 0x014f, all -> 0x013b }
            java.io.FileDescriptor r6 = r12.getFD()     // Catch:{ FileNotFoundException | IOException -> 0x014f, all -> 0x013b }
            r6.sync()     // Catch:{ FileNotFoundException | IOException -> 0x014f, all -> 0x013b }
            long r16 = r0.length()     // Catch:{ FileNotFoundException | IOException -> 0x014f, all -> 0x013b }
            int r6 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x011f
            goto L_0x014f
        L_0x011f:
            r7.mo125475a(r8)     // Catch:{ all -> 0x018c }
            r7.mo125475a(r12)     // Catch:{ all -> 0x018c }
            r0.setReadable(r5, r4)     // Catch:{ all -> 0x018c }
            r0.setExecutable(r5, r4)     // Catch:{ all -> 0x018c }
            r0.setWritable(r5)     // Catch:{ all -> 0x018c }
            java.util.zip.ZipFile r2 = r2.f262446a     // Catch:{ IOException -> 0x0163 }
            if (r2 == 0) goto L_0x0163
            goto L_0x0160
        L_0x0133:
            r12.write(r13, r4, r10)     // Catch:{ FileNotFoundException | IOException -> 0x014f, all -> 0x013b }
            long r5 = (long) r10
            long r14 = r14 + r5
            r5 = 1
            r6 = 2
            goto L_0x0105
        L_0x013b:
            r0 = move-exception
            r10 = r12
            goto L_0x0140
        L_0x013e:
            r0 = move-exception
            r10 = 0
        L_0x0140:
            r3 = r10
            r10 = r8
            goto L_0x0146
        L_0x0143:
            r0 = move-exception
            r3 = 0
            r10 = 0
        L_0x0146:
            r7.mo125475a(r10)     // Catch:{ all -> 0x018c }
            r7.mo125475a(r3)     // Catch:{ all -> 0x018c }
            throw r0     // Catch:{ all -> 0x018c }
        L_0x014d:
            r8 = 0
        L_0x014e:
            r12 = 0
        L_0x014f:
            r7.mo125475a(r8)     // Catch:{ all -> 0x018c }
            r7.mo125475a(r12)     // Catch:{ all -> 0x018c }
            goto L_0x0157
        L_0x0156:
        L_0x0157:
            r8 = r11
            r5 = 1
            r6 = 2
            goto L_0x00d7
        L_0x015c:
            java.util.zip.ZipFile r2 = r2.f262446a     // Catch:{ IOException -> 0x0163 }
            if (r2 == 0) goto L_0x0163
        L_0x0160:
            r2.close()     // Catch:{ IOException -> 0x0163 }
        L_0x0163:
            z24.d r2 = r1.f262449b
            java.lang.String r0 = r0.getAbsolutePath()
            z24.h r2 = (z24.C91612h) r2
            r2.getClass()
            java.lang.System.load(r0)
            java.util.Set<java.lang.String> r0 = r1.f262448a
            java.util.HashSet r0 = (java.util.HashSet) r0
            r0.add(r3)
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r3
            r2 = 1
            r0[r2] = r21
            java.lang.String r2 = "%s (%s) was re-linked!"
            r1.mo125480d(r2, r0)
            return
        L_0x0186:
            z24.b r0 = new z24.b     // Catch:{ all -> 0x018c }
            r0.<init>(r9)     // Catch:{ all -> 0x018c }
            throw r0     // Catch:{ all -> 0x018c }
        L_0x018c:
            r0 = move-exception
            r10 = r2
            goto L_0x0191
        L_0x018f:
            r0 = move-exception
            r10 = 0
        L_0x0191:
            if (r10 == 0) goto L_0x019a
            java.util.zip.ZipFile r2 = r10.f262446a     // Catch:{ IOException -> 0x019a }
            if (r2 == 0) goto L_0x019a
            r2.close()     // Catch:{ IOException -> 0x019a }
        L_0x019a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z24.C91609f.mo125479c(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* renamed from: d */
    public void mo125480d(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }
}
