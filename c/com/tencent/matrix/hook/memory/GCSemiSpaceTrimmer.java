package com.tencent.matrix.hook.memory;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.hook.HookManager;
import j20.C117292a;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k20.C9556a;
import p723vf.C118672d;

public final class GCSemiSpaceTrimmer {

    /* renamed from: h */
    public static final GCSemiSpaceTrimmer f235282h = new GCSemiSpaceTrimmer();

    /* renamed from: i */
    public static final Pattern f235283i = Pattern.compile("[^0-9]");

    /* renamed from: j */
    public static final long f235284j = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: a */
    public HookManager.C80378b f235285a = null;

    /* renamed from: b */
    public float f235286b = 0.0f;

    /* renamed from: c */
    public long f235287c = f235284j;

    /* renamed from: d */
    public HandlerThread f235288d = null;

    /* renamed from: e */
    public Handler f235289e = null;

    /* renamed from: f */
    public boolean f235290f = false;

    /* renamed from: g */
    public final Runnable f235291g = new C80381a();

    /* renamed from: com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer$a */
    public class C80381a implements Runnable {
        public C80381a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r4.close();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                java.lang.String r0 = "Matrix.GCSemiSpaceTrimmer"
                com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer r1 = com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer.f235282h
                r1 = -1
                r3 = 0
                java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x0051 }
                java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x0051 }
                java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0051 }
                java.lang.String r7 = "/proc/self/status"
                r6.<init>(r7)     // Catch:{ all -> 0x0051 }
                r5.<init>(r6)     // Catch:{ all -> 0x0051 }
                r4.<init>(r5)     // Catch:{ all -> 0x0051 }
            L_0x0018:
                java.lang.String r5 = r4.readLine()     // Catch:{ all -> 0x0047 }
                if (r5 == 0) goto L_0x0043
                java.lang.String r5 = r5.toLowerCase()     // Catch:{ all -> 0x0047 }
                java.lang.String r6 = "vmsize"
                boolean r6 = r5.contains(r6)     // Catch:{ all -> 0x0047 }
                if (r6 == 0) goto L_0x0018
                java.util.regex.Pattern r6 = com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer.f235283i     // Catch:{ all -> 0x0047 }
                java.util.regex.Matcher r5 = r6.matcher(r5)     // Catch:{ all -> 0x0047 }
                java.lang.String r6 = ""
                java.lang.String r5 = r5.replaceAll(r6)     // Catch:{ all -> 0x0047 }
                java.lang.String r5 = r5.trim()     // Catch:{ all -> 0x0047 }
                long r1 = java.lang.Long.parseLong(r5)     // Catch:{ all -> 0x0047 }
                r5 = 1024(0x400, double:5.06E-321)
                long r1 = r1 * r5
            L_0x0043:
                r4.close()     // Catch:{ all -> 0x0051 }
                goto L_0x005a
            L_0x0047:
                r5 = move-exception
                r4.close()     // Catch:{ all -> 0x004c }
                goto L_0x0050
            L_0x004c:
                r4 = move-exception
                r5.addSuppressed(r4)     // Catch:{ all -> 0x0051 }
            L_0x0050:
                throw r5     // Catch:{ all -> 0x0051 }
            L_0x0051:
                r4 = move-exception
                java.lang.Object[] r5 = new java.lang.Object[r3]
                java.lang.String r6 = "read proc status failed."
                p723vf.C118672d.m167354d(r0, r4, r6, r5)
            L_0x005a:
                r4 = 0
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 >= 0) goto L_0x0071
                java.lang.Object[] r1 = new java.lang.Object[r3]
                java.lang.String r2 = "Fail to read vss size, skip checking this time."
                p723vf.C118672d.m167352b(r0, r2, r1)
                com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer r0 = com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer.this
                android.os.Handler r1 = r0.f235289e
                long r2 = r0.f235287c
                r1.postDelayed(r8, r2)
                goto L_0x00cf
            L_0x0071:
                float r4 = (float) r1
                r5 = 1333788672(0x4f800000, float:4.2949673E9)
                com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer r6 = com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer.this
                float r6 = r6.f235286b
                float r6 = r6 * r5
                r5 = 1
                r7 = 2
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 <= 0) goto L_0x00af
                java.lang.Object[] r4 = new java.lang.Object[r7]
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r4[r3] = r1
                com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer r1 = com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer.this
                float r1 = r1.f235286b
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r4[r5] = r1
                java.lang.String r1 = "VmSize usage reaches above critical level, trigger native install. vmsize: %s, critical_ratio: %s"
                p723vf.C118672d.m167353c(r0, r1, r4)
                com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer r1 = com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer.this
                boolean r1 = r1.nativeInstall()
                if (r1 == 0) goto L_0x00a7
                java.lang.Object[] r1 = new java.lang.Object[r3]
                java.lang.String r2 = "nativeInstall triggered successfully."
                p723vf.C118672d.m167353c(r0, r2, r1)
                goto L_0x00cf
            L_0x00a7:
                java.lang.Object[] r1 = new java.lang.Object[r3]
                java.lang.String r2 = "Fail to trigger nativeInstall."
                p723vf.C118672d.m167353c(r0, r2, r1)
                goto L_0x00cf
            L_0x00af:
                java.lang.Object[] r4 = new java.lang.Object[r7]
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r4[r3] = r1
                com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer r1 = com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer.this
                float r1 = r1.f235286b
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r4[r5] = r1
                java.lang.String r1 = "VmSize usage is under critical level, check next time. vmsize: %s, critical_ratio: %s"
                p723vf.C118672d.m167353c(r0, r1, r4)
                com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer r0 = com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer.this
                android.os.Handler r1 = r0.f235289e
                long r2 = r0.f235287c
                r1.postDelayed(r8, r2)
            L_0x00cf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.hook.memory.GCSemiSpaceTrimmer.C80381a.run():void");
        }
    }

    /* access modifiers changed from: private */
    public native boolean nativeInstall();

    private native boolean nativeIsCompatible();

    /* renamed from: b */
    public final boolean mo111838b() {
        synchronized (this) {
            if (this.f235290f) {
                return true;
            }
            try {
                HookManager.C80378b bVar = this.f235285a;
                if (bVar != null) {
                    bVar.loadLibrary("matrix-hookcommon");
                    this.f235285a.loadLibrary("matrix-memoryhook");
                } else {
                    C9556a aVar = new C9556a();
                    aVar.mo10233c("matrix-hookcommon");
                    Object obj = new Object();
                    C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/matrix/hook/memory/GCSemiSpaceTrimmer", "ensureNativeLibLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    System.loadLibrary((String) aVar.mo10231a(0));
                    C117292a.m165359e(obj, "com/tencent/matrix/hook/memory/GCSemiSpaceTrimmer", "ensureNativeLibLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c("matrix-memoryhook");
                    Object obj2 = new Object();
                    C117292a.m165358d(obj2, aVar2.mo10232b(), "com/tencent/matrix/hook/memory/GCSemiSpaceTrimmer", "ensureNativeLibLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    System.loadLibrary((String) aVar2.mo10231a(0));
                    C117292a.m165359e(obj2, "com/tencent/matrix/hook/memory/GCSemiSpaceTrimmer", "ensureNativeLibLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                }
                this.f235290f = true;
            } catch (Throwable th) {
                C118672d.m167354d("Matrix.GCSemiSpaceTrimmer", th, "Fail to load native library.", new Object[0]);
                this.f235290f = false;
            }
            boolean z = this.f235290f;
            return z;
        }
    }

    /* renamed from: c */
    public boolean mo111839c(float f, long j, Looper looper) {
        synchronized (this) {
            if (!mo111838b()) {
                C118672d.m167352b("Matrix.GCSemiSpaceTrimmer", "Fail to load native library.", new Object[0]);
                return false;
            }
            this.f235286b = f;
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i > 0) {
                this.f235287c = j;
            } else if (i == 0) {
                this.f235287c = f235284j;
            } else {
                C118672d.m167352b("Matrix.GCSemiSpaceTrimmer", "vmsizeSampleInterval cannot less than zero. (value: " + j + ")", new Object[0]);
                return false;
            }
            if (looper != null) {
                this.f235289e = new Handler(looper);
            } else {
                HandlerThread handlerThread = new HandlerThread("Matrix.GCSST");
                this.f235288d = handlerThread;
                handlerThread.start();
                this.f235289e = new Handler(this.f235288d.getLooper());
            }
            this.f235289e.postDelayed(this.f235291g, this.f235287c);
            C118672d.m167353c("Matrix.GCSemiSpaceTrimmer", "Installed, critcal_vmsize_ratio: %s, vmsize_sample_interval: %s", Float.valueOf(f), Long.valueOf(j));
            return true;
        }
    }

    /* renamed from: d */
    public boolean mo111840d() {
        synchronized (this) {
            if (!mo111838b()) {
                return false;
            }
            boolean nativeIsCompatible = nativeIsCompatible();
            return nativeIsCompatible;
        }
    }
}
