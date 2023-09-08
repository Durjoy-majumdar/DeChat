package p429c.p790t.p791m.sapp.p792c;

import android.content.Context;
import java.io.File;
import java.util.List;

/* renamed from: c.t.m.sapp.c.c */
public class C113222c implements Runnable {

    /* renamed from: a */
    public static int f338780a;

    /* renamed from: b */
    public final int f338781b = 30000;

    /* renamed from: c */
    public final int f338782c = 20000;

    /* renamed from: d */
    public Context f338783d;

    /* renamed from: e */
    public List<C113220a> f338784e = null;

    /* renamed from: f */
    public String f338785f = null;

    /* renamed from: g */
    public boolean f338786g = false;

    public C113222c(Context context) {
        this.f338783d = context;
        this.f338785f = this.f338783d.getFilesDir().getAbsolutePath() + File.separator + "TencentLocation_sapp/UpCp";
        File file = new File(this.f338783d.getFilesDir().getAbsolutePath(), "TencentLocation_sapp/UpCp");
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0133, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo165749a() {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.List<c.t.m.sapp.c.a> r0 = r11.f338784e     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x0132
            int r0 = r0.size()     // Catch:{ all -> 0x0134 }
            if (r0 <= 0) goto L_0x0132
            r0 = 1
            f338780a = r0     // Catch:{ all -> 0x0134 }
            android.content.Context r1 = r11.f338783d     // Catch:{ all -> 0x0134 }
            p429c.p790t.p791m.sapp.p792c.C113233r.m155029i(r1)     // Catch:{ all -> 0x0134 }
            long r1 = p429c.p790t.p791m.sapp.p792c.C113233r.m155017d()     // Catch:{ all -> 0x0134 }
            r3 = 10485760(0xa00000, double:5.180654E-317)
            r5 = 2
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x0023
            f338780a = r5     // Catch:{ all -> 0x0134 }
            monitor-exit(r11)
            return
        L_0x0023:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0134 }
            r1.<init>()     // Catch:{ all -> 0x0134 }
            java.util.List<c.t.m.sapp.c.a> r2 = r11.f338784e     // Catch:{ all -> 0x0134 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0134 }
            r3 = 0
            r4 = 1
        L_0x0030:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x0134 }
            if (r6 == 0) goto L_0x0048
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x0134 }
            c.t.m.sapp.c.a r6 = (p429c.p790t.p791m.sapp.p792c.C113220a) r6     // Catch:{ all -> 0x0134 }
            boolean r7 = r11.mo165751a((p429c.p790t.p791m.sapp.p792c.C113220a) r6)     // Catch:{ all -> 0x0134 }
            if (r7 != 0) goto L_0x0044
            r4 = 0
            goto L_0x0030
        L_0x0044:
            r1.add(r6)     // Catch:{ all -> 0x0134 }
            goto L_0x0030
        L_0x0048:
            if (r4 != 0) goto L_0x0051
            f338780a = r5     // Catch:{ all -> 0x0134 }
            r11.mo165750a((java.util.List<p429c.p790t.p791m.sapp.p792c.C113220a>) r1)     // Catch:{ all -> 0x0134 }
            monitor-exit(r11)
            return
        L_0x0051:
            int r2 = r1.size()     // Catch:{ all -> 0x0134 }
            java.util.List<c.t.m.sapp.c.a> r4 = r11.f338784e     // Catch:{ all -> 0x0134 }
            int r4 = r4.size()     // Catch:{ all -> 0x0134 }
            if (r2 != r4) goto L_0x011b
            android.content.Context r2 = r11.f338783d     // Catch:{ all -> 0x0134 }
            java.lang.String r4 = "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_"
            java.lang.String r6 = ""
            p429c.p790t.p791m.sapp.p792c.C113233r.m155014c(r2, r4, r6)     // Catch:{ all -> 0x0134 }
            android.content.Context r2 = r11.f338783d     // Catch:{ all -> 0x0134 }
            java.util.List<c.t.m.sapp.c.a> r4 = r11.f338784e     // Catch:{ all -> 0x0134 }
            boolean r2 = p429c.p790t.p791m.sapp.p792c.C113233r.m155001a((android.content.Context) r2, (java.util.List<p429c.p790t.p791m.sapp.p792c.C113220a>) r4)     // Catch:{ all -> 0x0134 }
            if (r2 == 0) goto L_0x0114
            android.content.Context r2 = r11.f338783d     // Catch:{ all -> 0x0134 }
            java.lang.String r4 = p429c.p790t.p791m.sapp.p792c.C113227h.f338802a     // Catch:{ all -> 0x0134 }
            java.lang.String r6 = "__SP_UPDATE_TencentLoc_COMP_SDK_VER__sapp_"
            p429c.p790t.p791m.sapp.p792c.C113233r.m155020d(r2, r6, r4)     // Catch:{ all -> 0x0134 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0134 }
        L_0x007d:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0134 }
            if (r2 == 0) goto L_0x00f0
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0134 }
            c.t.m.sapp.c.a r2 = (p429c.p790t.p791m.sapp.p792c.C113220a) r2     // Catch:{ all -> 0x0134 }
            java.lang.String r4 = r2.f338772c     // Catch:{ all -> 0x0134 }
            java.lang.String r6 = ".dex"
            boolean r4 = r4.contains(r6)     // Catch:{ all -> 0x0134 }
            if (r4 != 0) goto L_0x00a8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            r4.<init>()     // Catch:{ all -> 0x0134 }
            java.lang.String r6 = r2.f338772c     // Catch:{ all -> 0x0134 }
            r4.append(r6)     // Catch:{ all -> 0x0134 }
            java.lang.String r6 = ".dex"
            r4.append(r6)     // Catch:{ all -> 0x0134 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0134 }
            r2.f338772c = r4     // Catch:{ all -> 0x0134 }
        L_0x00a8:
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0134 }
            java.lang.String r6 = r11.f338785f     // Catch:{ all -> 0x0134 }
            java.lang.String r7 = r2.f338772c     // Catch:{ all -> 0x0134 }
            r4.<init>(r6, r7)     // Catch:{ all -> 0x0134 }
            boolean r6 = r4.exists()     // Catch:{ all -> 0x0134 }
            if (r6 == 0) goto L_0x00bc
            boolean r4 = r4.delete()     // Catch:{ all -> 0x0134 }
            goto L_0x00bd
        L_0x00bc:
            r4 = 1
        L_0x00bd:
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x0134 }
            java.lang.String r7 = r11.f338785f     // Catch:{ all -> 0x0134 }
            java.lang.String r8 = r2.f338772c     // Catch:{ all -> 0x0134 }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x0134 }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0134 }
            java.lang.String r8 = r11.f338785f     // Catch:{ all -> 0x0134 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0134 }
            r9.<init>()     // Catch:{ all -> 0x0134 }
            java.lang.String r10 = "tmp__sapp"
            r9.append(r10)     // Catch:{ all -> 0x0134 }
            java.lang.String r10 = r2.f338772c     // Catch:{ all -> 0x0134 }
            r9.append(r10)     // Catch:{ all -> 0x0134 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0134 }
            r7.<init>(r8, r9)     // Catch:{ all -> 0x0134 }
            boolean r7 = r7.renameTo(r6)     // Catch:{ all -> 0x0134 }
            boolean r2 = r11.mo165752a(r2, r6)     // Catch:{ all -> 0x0134 }
            if (r4 == 0) goto L_0x007d
            if (r7 == 0) goto L_0x007d
            if (r2 == 0) goto L_0x007d
            r3 = 1
            goto L_0x007d
        L_0x00f0:
            if (r3 != 0) goto L_0x0104
            android.content.Context r0 = r11.f338783d     // Catch:{ all -> 0x0134 }
            java.lang.String r1 = "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_"
            java.lang.String r2 = ""
            p429c.p790t.p791m.sapp.p792c.C113233r.m155020d(r0, r1, r2)     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = r11.f338785f     // Catch:{ all -> 0x0134 }
            p429c.p790t.p791m.sapp.p792c.C113233r.m155002a((java.lang.String) r0)     // Catch:{ all -> 0x0134 }
            f338780a = r5     // Catch:{ all -> 0x0134 }
            monitor-exit(r11)
            return
        L_0x0104:
            f338780a = r0     // Catch:{ all -> 0x0134 }
            android.content.Context r0 = r11.f338783d     // Catch:{ all -> 0x0134 }
            c.t.m.sapp.c.e r0 = p429c.p790t.p791m.sapp.p792c.C113223e.m154939a((android.content.Context) r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r1 = "CPU"
            java.lang.String r2 = "down suc"
            r0.mo165758a((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0134 }
            goto L_0x0132
        L_0x0114:
            r11.mo165750a((java.util.List<p429c.p790t.p791m.sapp.p792c.C113220a>) r1)     // Catch:{ all -> 0x0134 }
            f338780a = r5     // Catch:{ all -> 0x0134 }
            monitor-exit(r11)
            return
        L_0x011b:
            java.lang.String r0 = "down load failed"
            p429c.p790t.p791m.sapp.p792c.C113229j.m154971a((java.lang.String) r0)     // Catch:{ all -> 0x0134 }
            android.content.Context r0 = r11.f338783d     // Catch:{ all -> 0x0134 }
            c.t.m.sapp.c.e r0 = p429c.p790t.p791m.sapp.p792c.C113223e.m154939a((android.content.Context) r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r2 = "CPU"
            java.lang.String r3 = "down failed"
            r0.mo165758a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0134 }
            r11.mo165750a((java.util.List<p429c.p790t.p791m.sapp.p792c.C113220a>) r1)     // Catch:{ all -> 0x0134 }
            f338780a = r5     // Catch:{ all -> 0x0134 }
        L_0x0132:
            monitor-exit(r11)
            return
        L_0x0134:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p429c.p790t.p791m.sapp.p792c.C113222c.mo165749a():void");
    }

    /* renamed from: b */
    public void mo165753b(List<C113220a> list) {
        this.f338784e = list;
        if (f338780a != 1) {
            new Thread(this).start();
        }
    }

    public void run() {
        C79907d.m97052a(this.f338783d).mo110068b("updatelock_sapp");
        mo165749a();
        C113223e.m154939a(this.f338783d).mo165762d();
        C79907d.m97052a(this.f338783d).mo110069c("updatelock_sapp");
    }

    /* renamed from: a */
    public final void mo165750a(List<C113220a> list) {
        for (C113220a aVar : list) {
            String str = this.f338785f;
            File file = new File(str, "tmp__sapp" + aVar.f338772c);
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:62|63|64|65|66|67) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x012c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo165751a(p429c.p790t.p791m.sapp.p792c.C113220a r12) {
        /*
            r11 = this;
            java.lang.String r0 = "failed:"
            java.lang.String r1 = "CPU"
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r3.<init>()     // Catch:{ all -> 0x0135 }
            java.lang.String r4 = "https://maplbs-40171.sh.gfp.tencent-cloud.com/Index/"
            r3.append(r4)     // Catch:{ all -> 0x0135 }
            java.lang.String r4 = r12.f338774e     // Catch:{ all -> 0x0135 }
            r3.append(r4)     // Catch:{ all -> 0x0135 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0135 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r4.<init>()     // Catch:{ all -> 0x0135 }
            java.lang.String r5 = "start down load:"
            r4.append(r5)     // Catch:{ all -> 0x0135 }
            java.lang.String r5 = r12.f338774e     // Catch:{ all -> 0x0135 }
            r4.append(r5)     // Catch:{ all -> 0x0135 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0135 }
            p429c.p790t.p791m.sapp.p792c.C113229j.m154971a((java.lang.String) r4)     // Catch:{ all -> 0x0135 }
            r4 = 0
            r5 = 0
        L_0x0030:
            int r6 = r5 + 1
            r7 = 3
            if (r5 >= r7) goto L_0x0135
            byte[] r5 = p429c.p790t.p791m.sapp.p792c.C39880p.m42652a(r3)     // Catch:{ all -> 0x0135 }
            if (r5 == 0) goto L_0x012d
            java.lang.String r7 = "sE0zy%DVqLnXA$hmNZ8NBwcg7FDrvi!q"
            byte[] r5 = p429c.p790t.p791m.sapp.p792c.C79909m.m97066a((byte[]) r5, (java.lang.String) r7)     // Catch:{ all -> 0x0135 }
            byte[] r5 = p429c.p790t.p791m.sapp.p792c.C113233r.m155016c((byte[]) r5)     // Catch:{ all -> 0x0135 }
            if (r5 == 0) goto L_0x012d
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0135 }
            java.lang.String r8 = r11.f338785f     // Catch:{ all -> 0x0135 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r9.<init>()     // Catch:{ all -> 0x0135 }
            java.lang.String r10 = "tmp__sapp"
            r9.append(r10)     // Catch:{ all -> 0x0135 }
            java.lang.String r10 = r12.f338772c     // Catch:{ all -> 0x0135 }
            r9.append(r10)     // Catch:{ all -> 0x0135 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0135 }
            r7.<init>(r8, r9)     // Catch:{ all -> 0x0135 }
            java.io.BufferedOutputStream r8 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00f4, all -> 0x00f2 }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00f4, all -> 0x00f2 }
            r9.<init>(r7, r2)     // Catch:{ Exception -> 0x00f4, all -> 0x00f2 }
            r10 = 1024(0x400, float:1.435E-42)
            r8.<init>(r9, r10)     // Catch:{ Exception -> 0x00f4, all -> 0x00f2 }
            r8.write(r5)     // Catch:{ Exception -> 0x00f0 }
            boolean r4 = r11.mo165752a(r12, r7)     // Catch:{ Exception -> 0x00f0 }
            if (r4 == 0) goto L_0x00ad
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f0 }
            r4.<init>()     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r5 = "down load available:"
            r4.append(r5)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r5 = r12.f338774e     // Catch:{ Exception -> 0x00f0 }
            r4.append(r5)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00f0 }
            p429c.p790t.p791m.sapp.p792c.C113229j.m154971a((java.lang.String) r4)     // Catch:{ Exception -> 0x00f0 }
            android.content.Context r4 = r11.f338783d     // Catch:{ Exception -> 0x00f0 }
            c.t.m.sapp.c.e r4 = p429c.p790t.p791m.sapp.p792c.C113223e.m154939a((android.content.Context) r4)     // Catch:{ Exception -> 0x00f0 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f0 }
            r5.<init>()     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r9 = "sud:"
            r5.append(r9)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r9 = r12.f338774e     // Catch:{ Exception -> 0x00f0 }
            r5.append(r9)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00f0 }
            r4.mo165758a((java.lang.String) r1, (java.lang.String) r5)     // Catch:{ Exception -> 0x00f0 }
            r8.close()     // Catch:{ Exception -> 0x00ab }
        L_0x00ab:
            r12 = 1
            return r12
        L_0x00ad:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f0 }
            r4.<init>()     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r5 = "down load unavailable:"
            r4.append(r5)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r5 = r12.f338774e     // Catch:{ Exception -> 0x00f0 }
            r4.append(r5)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00f0 }
            p429c.p790t.p791m.sapp.p792c.C113229j.m154971a((java.lang.String) r4)     // Catch:{ Exception -> 0x00f0 }
            android.content.Context r4 = r11.f338783d     // Catch:{ Exception -> 0x00f0 }
            c.t.m.sapp.c.e r4 = p429c.p790t.p791m.sapp.p792c.C113223e.m154939a((android.content.Context) r4)     // Catch:{ Exception -> 0x00f0 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f0 }
            r5.<init>()     // Catch:{ Exception -> 0x00f0 }
            r5.append(r0)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r9 = r12.f338774e     // Catch:{ Exception -> 0x00f0 }
            r5.append(r9)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00f0 }
            r4.mo165758a((java.lang.String) r1, (java.lang.String) r5)     // Catch:{ Exception -> 0x00f0 }
            boolean r4 = r7.exists()     // Catch:{ Exception -> 0x00f0 }
            if (r4 == 0) goto L_0x00ec
            boolean r4 = r7.isFile()     // Catch:{ Exception -> 0x00f0 }
            if (r4 == 0) goto L_0x00ec
            r7.delete()     // Catch:{ Exception -> 0x00f0 }
        L_0x00ec:
            r8.close()     // Catch:{ Exception -> 0x0125 }
            goto L_0x0125
        L_0x00f0:
            r4 = move-exception
            goto L_0x00f7
        L_0x00f2:
            r12 = move-exception
            goto L_0x0129
        L_0x00f4:
            r5 = move-exception
            r8 = r4
            r4 = r5
        L_0x00f7:
            boolean r5 = r7.exists()     // Catch:{ all -> 0x0127 }
            if (r5 == 0) goto L_0x0106
            boolean r5 = r7.isFile()     // Catch:{ all -> 0x0127 }
            if (r5 == 0) goto L_0x0106
            r7.delete()     // Catch:{ all -> 0x0127 }
        L_0x0106:
            android.content.Context r5 = r11.f338783d     // Catch:{ all -> 0x0127 }
            c.t.m.sapp.c.e r5 = p429c.p790t.p791m.sapp.p792c.C113223e.m154939a((android.content.Context) r5)     // Catch:{ all -> 0x0127 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0127 }
            r7.<init>()     // Catch:{ all -> 0x0127 }
            r7.append(r0)     // Catch:{ all -> 0x0127 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0127 }
            r7.append(r4)     // Catch:{ all -> 0x0127 }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x0127 }
            r5.mo165758a((java.lang.String) r1, (java.lang.String) r4)     // Catch:{ all -> 0x0127 }
            r8.close()     // Catch:{ Exception -> 0x0125 }
        L_0x0125:
            r4 = r8
            goto L_0x012d
        L_0x0127:
            r12 = move-exception
            r4 = r8
        L_0x0129:
            r4.close()     // Catch:{ Exception -> 0x012c }
        L_0x012c:
            throw r12     // Catch:{ all -> 0x0135 }
        L_0x012d:
            r7 = 5000(0x1388, double:2.4703E-320)
            p429c.p790t.p791m.sapp.p792c.C113233r.m154996a((long) r7)     // Catch:{ all -> 0x0135 }
            r5 = r6
            goto L_0x0030
        L_0x0135:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p429c.p790t.p791m.sapp.p792c.C113222c.mo165751a(c.t.m.sapp.c.a):boolean");
    }

    /* renamed from: a */
    public final boolean mo165752a(C113220a aVar, File file) {
        if (file != null && file.exists()) {
            return aVar.f338773d == ((int) file.length()) && aVar.f338774e.equals(C113233r.m154991a(file));
        }
    }
}
