package p429c.p790t.p791m.sapp.p792c;

import android.content.Context;
import dalvik.system.DexClassLoader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.t.m.sapp.c.b */
public class C113221b {

    /* renamed from: a */
    public static C113221b f338776a;

    /* renamed from: b */
    public Context f338777b;

    /* renamed from: c */
    public List<C113220a> f338778c = null;

    /* renamed from: d */
    public String f338779d = "";

    public C113221b(Context context) {
        this.f338777b = context;
        this.f338778c = new ArrayList();
    }

    /* renamed from: a */
    public static C113221b m154930a(Context context) {
        if (f338776a == null) {
            f338776a = new C113221b(context);
        }
        return f338776a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a3, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized dalvik.system.DexClassLoader mo165747a() {
        /*
            r12 = this;
            monitor-enter(r12)
            android.content.Context r0 = r12.f338777b     // Catch:{ all -> 0x01a4 }
            p429c.p790t.p791m.sapp.p792c.C113230l.m154973a(r0)     // Catch:{ all -> 0x01a4 }
            java.util.List<c.t.m.sapp.c.a> r0 = r12.f338778c     // Catch:{ all -> 0x01a4 }
            r1 = 0
            if (r0 == 0) goto L_0x01a2
            int r0 = r0.size()     // Catch:{ all -> 0x01a4 }
            if (r0 > 0) goto L_0x0013
            goto L_0x01a2
        L_0x0013:
            java.util.List<c.t.m.sapp.c.a> r0 = r12.f338778c     // Catch:{ all -> 0x01a4 }
            java.lang.String r0 = p429c.p790t.p791m.sapp.p792c.C113233r.m154992a((java.util.List<p429c.p790t.p791m.sapp.p792c.C113220a>) r0)     // Catch:{ all -> 0x01a4 }
            p429c.p790t.p791m.sapp.p792c.C113233r.f338825d = r0     // Catch:{ all -> 0x01a4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a4 }
            r0.<init>()     // Catch:{ all -> 0x01a4 }
            android.content.Context r2 = r12.f338777b     // Catch:{ all -> 0x01a4 }
            java.io.File r2 = r2.getFilesDir()     // Catch:{ all -> 0x01a4 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x01a4 }
            r0.append(r2)     // Catch:{ all -> 0x01a4 }
            java.lang.String r2 = java.io.File.separator     // Catch:{ all -> 0x01a4 }
            r0.append(r2)     // Catch:{ all -> 0x01a4 }
            java.lang.String r3 = r12.f338779d     // Catch:{ all -> 0x01a4 }
            r0.append(r3)     // Catch:{ all -> 0x01a4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01a4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a4 }
            r3.<init>()     // Catch:{ all -> 0x01a4 }
            android.content.Context r4 = r12.f338777b     // Catch:{ all -> 0x01a4 }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ all -> 0x01a4 }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ all -> 0x01a4 }
            r3.append(r4)     // Catch:{ all -> 0x01a4 }
            r3.append(r2)     // Catch:{ all -> 0x01a4 }
            java.lang.String r2 = p429c.p790t.p791m.sapp.p792c.C113233r.f338824c     // Catch:{ all -> 0x01a4 }
            r3.append(r2)     // Catch:{ all -> 0x01a4 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x01a4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a4 }
            r3.<init>()     // Catch:{ all -> 0x01a4 }
            java.util.List<c.t.m.sapp.c.a> r4 = r12.f338778c     // Catch:{ all -> 0x01a4 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x01a4 }
        L_0x0064:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x01a4 }
            if (r5 == 0) goto L_0x0085
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x01a4 }
            c.t.m.sapp.c.a r5 = (p429c.p790t.p791m.sapp.p792c.C113220a) r5     // Catch:{ all -> 0x01a4 }
            if (r5 == 0) goto L_0x0064
            r3.append(r0)     // Catch:{ all -> 0x01a4 }
            java.lang.String r6 = java.io.File.separator     // Catch:{ all -> 0x01a4 }
            r3.append(r6)     // Catch:{ all -> 0x01a4 }
            java.lang.String r5 = r5.f338772c     // Catch:{ all -> 0x01a4 }
            r3.append(r5)     // Catch:{ all -> 0x01a4 }
            java.lang.String r5 = java.io.File.pathSeparator     // Catch:{ all -> 0x01a4 }
            r3.append(r5)     // Catch:{ all -> 0x01a4 }
            goto L_0x0064
        L_0x0085:
            java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0130 }
            dalvik.system.DexClassLoader r4 = new dalvik.system.DexClassLoader     // Catch:{ Exception -> 0x0130 }
            java.lang.String r5 = r3.toString()     // Catch:{ Exception -> 0x0130 }
            java.lang.Class r6 = r12.getClass()     // Catch:{ Exception -> 0x0130 }
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch:{ Exception -> 0x0130 }
            r4.<init>(r5, r2, r1, r6)     // Catch:{ Exception -> 0x0130 }
            java.lang.String r5 = ""
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x012e }
            r6.<init>(r0)     // Catch:{ Exception -> 0x012e }
            boolean r0 = r6.exists()     // Catch:{ Exception -> 0x012e }
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r6.isDirectory()     // Catch:{ Exception -> 0x012e }
            if (r0 == 0) goto L_0x00fa
            java.io.File[] r0 = r6.listFiles()     // Catch:{ Exception -> 0x012e }
            if (r0 == 0) goto L_0x00fa
            int r6 = r0.length     // Catch:{ Exception -> 0x012e }
            if (r6 <= 0) goto L_0x00fa
            int r6 = r0.length     // Catch:{ Exception -> 0x012e }
            r7 = 0
        L_0x00b7:
            if (r7 >= r6) goto L_0x00fa
            r8 = r0[r7]     // Catch:{ Exception -> 0x012e }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012e }
            r9.<init>()     // Catch:{ Exception -> 0x012e }
            java.lang.String r10 = r8.getName()     // Catch:{ Exception -> 0x012e }
            r9.append(r10)     // Catch:{ Exception -> 0x012e }
            java.lang.String r10 = ","
            r9.append(r10)     // Catch:{ Exception -> 0x012e }
            long r10 = r8.length()     // Catch:{ Exception -> 0x012e }
            r9.append(r10)     // Catch:{ Exception -> 0x012e }
            java.lang.String r10 = ","
            r9.append(r10)     // Catch:{ Exception -> 0x012e }
            java.lang.String r8 = p429c.p790t.p791m.sapp.p792c.C113233r.m154991a((java.io.File) r8)     // Catch:{ Exception -> 0x012e }
            r9.append(r8)     // Catch:{ Exception -> 0x012e }
            java.lang.String r8 = r9.toString()     // Catch:{ Exception -> 0x012e }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012e }
            r9.<init>()     // Catch:{ Exception -> 0x012e }
            r9.append(r5)     // Catch:{ Exception -> 0x012e }
            r9.append(r8)     // Catch:{ Exception -> 0x012e }
            java.lang.String r5 = ";"
            r9.append(r5)     // Catch:{ Exception -> 0x012e }
            java.lang.String r5 = r9.toString()     // Catch:{ Exception -> 0x012e }
            int r7 = r7 + 1
            goto L_0x00b7
        L_0x00fa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012e }
            r0.<init>()     // Catch:{ Exception -> 0x012e }
            java.lang.String r6 = "before load ,private dir files:"
            r0.append(r6)     // Catch:{ Exception -> 0x012e }
            r0.append(r5)     // Catch:{ Exception -> 0x012e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x012e }
            p429c.p790t.p791m.sapp.p792c.C113229j.m154971a((java.lang.String) r0)     // Catch:{ Exception -> 0x012e }
            android.content.Context r0 = r12.f338777b     // Catch:{ Exception -> 0x012e }
            c.t.m.sapp.c.e r0 = p429c.p790t.p791m.sapp.p792c.C113223e.m154939a((android.content.Context) r0)     // Catch:{ Exception -> 0x012e }
            java.lang.String r5 = "CPL"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012e }
            r6.<init>()     // Catch:{ Exception -> 0x012e }
            java.lang.String r7 = "suc:"
            r6.append(r7)     // Catch:{ Exception -> 0x012e }
            java.lang.String r7 = p429c.p790t.p791m.sapp.p792c.C113233r.f338825d     // Catch:{ Exception -> 0x012e }
            r6.append(r7)     // Catch:{ Exception -> 0x012e }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x012e }
            r0.mo165758a((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ Exception -> 0x012e }
            monitor-exit(r12)
            return r4
        L_0x012e:
            r0 = move-exception
            goto L_0x0132
        L_0x0130:
            r0 = move-exception
            r4 = r1
        L_0x0132:
            java.lang.String r5 = "try once"
            p429c.p790t.p791m.sapp.p792c.C113229j.m154972a(r5, r0)     // Catch:{ all -> 0x01a4 }
            android.content.Context r5 = r12.f338777b     // Catch:{ all -> 0x01a4 }
            c.t.m.sapp.c.e r5 = p429c.p790t.p791m.sapp.p792c.C113223e.m154939a((android.content.Context) r5)     // Catch:{ all -> 0x01a4 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a4 }
            r6.<init>()     // Catch:{ all -> 0x01a4 }
            java.lang.String r7 = "fail:"
            r6.append(r7)     // Catch:{ all -> 0x01a4 }
            java.lang.String r7 = p429c.p790t.p791m.sapp.p792c.C113233r.f338825d     // Catch:{ all -> 0x01a4 }
            r6.append(r7)     // Catch:{ all -> 0x01a4 }
            java.lang.String r7 = ",exc:"
            r6.append(r7)     // Catch:{ all -> 0x01a4 }
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x01a4 }
            r6.append(r7)     // Catch:{ all -> 0x01a4 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x01a4 }
            java.lang.String r7 = "CPL"
            r5.mo165758a((java.lang.String) r7, (java.lang.String) r6)     // Catch:{ all -> 0x01a4 }
            android.content.Context r5 = r12.f338777b     // Catch:{ all -> 0x01a4 }
            p429c.p790t.p791m.sapp.p792c.C113230l.m154973a(r5)     // Catch:{ all -> 0x01a4 }
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x019b }
            dalvik.system.DexClassLoader r5 = new dalvik.system.DexClassLoader     // Catch:{ all -> 0x019b }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x019b }
            java.lang.Class r6 = r12.getClass()     // Catch:{ all -> 0x019b }
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch:{ all -> 0x019b }
            r5.<init>(r3, r2, r1, r6)     // Catch:{ all -> 0x019b }
            android.content.Context r1 = r12.f338777b     // Catch:{ all -> 0x019a }
            c.t.m.sapp.c.e r1 = p429c.p790t.p791m.sapp.p792c.C113223e.m154939a((android.content.Context) r1)     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "CPL"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x019a }
            r3.<init>()     // Catch:{ all -> 0x019a }
            java.lang.String r4 = "suc:c"
            r3.append(r4)     // Catch:{ all -> 0x019a }
            java.lang.String r4 = p429c.p790t.p791m.sapp.p792c.C113233r.f338825d     // Catch:{ all -> 0x019a }
            r3.append(r4)     // Catch:{ all -> 0x019a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x019a }
            r1.mo165758a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x019a }
            monitor-exit(r12)
            return r5
        L_0x019a:
            r4 = r5
        L_0x019b:
            java.lang.String r1 = "try once failed"
            p429c.p790t.p791m.sapp.p792c.C113229j.m154972a(r1, r0)     // Catch:{ all -> 0x01a4 }
            monitor-exit(r12)
            return r4
        L_0x01a2:
            monitor-exit(r12)
            return r1
        L_0x01a4:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p429c.p790t.p791m.sapp.p792c.C113221b.mo165747a():dalvik.system.DexClassLoader");
    }

    /* renamed from: a */
    public DexClassLoader mo165748a(List<C113220a> list, String str) {
        this.f338778c = list;
        this.f338779d = str;
        int i = 0;
        DexClassLoader dexClassLoader = null;
        while (true) {
            int i2 = i + 1;
            if (i >= 3) {
                break;
            }
            try {
                dexClassLoader = mo165747a();
                C113223e b = C113223e.m154940b();
                StringBuilder sb = new StringBuilder();
                sb.append("lcn:");
                sb.append(i2);
                b.mo165758a("CPL", sb.toString());
                if (dexClassLoader != null) {
                    C113230l.m154980f(this.f338777b);
                    return dexClassLoader;
                }
                i = i2;
            } catch (Throwable th) {
                C113223e b2 = C113223e.m154940b();
                b2.mo165758a("CPL", "fail:" + th.toString());
            }
        }
        C113230l.m154980f(this.f338777b);
        return dexClassLoader;
    }
}
