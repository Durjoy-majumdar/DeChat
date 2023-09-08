package p981ie;

import android.text.TextUtils;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import p212oe.b$$d;
import p723vf.C118672d;
import p723vf.C90779e;
import p981ie.C117176q;

/* renamed from: ie.r */
public final class C117178r {

    /* renamed from: a */
    public static final ThreadLocal<byte[]> f351047a = new ThreadLocal<>();

    /* renamed from: b */
    public static C117180b f351048b;

    /* renamed from: ie.r$a */
    public static final class C117179a {
        static {
            new InheritableThreadLocal();
        }

        /* renamed from: a */
        public static C117182d m165265a(String str, byte[] bArr) {
            C117176q qVar = new C117176q(str, bArr);
            try {
                qVar.mo181106f();
                boolean z = false;
                while (true) {
                    if (!qVar.mo181102b()) {
                        break;
                    }
                    qVar.mo181103c();
                    if (qVar.f351043f == '(') {
                        z = true;
                    } else if (z) {
                        qVar.mo181108g();
                        break;
                    }
                }
                CharBuffer d = qVar.mo181104d(')', CharBuffer.allocate(16));
                boolean z2 = false;
                while (true) {
                    if (!qVar.mo181102b()) {
                        break;
                    }
                    qVar.mo181103c();
                    if (qVar.f351043f == ' ') {
                        z2 = true;
                    } else if (z2) {
                        qVar.mo181108g();
                        break;
                    }
                }
                CharBuffer e = qVar.mo181105e(CharBuffer.allocate(1));
                for (int i = 0; i < 11; i++) {
                    boolean z3 = false;
                    while (true) {
                        if (!qVar.mo181102b()) {
                            break;
                        }
                        qVar.mo181103c();
                        if (qVar.f351043f == ' ') {
                            z3 = true;
                        } else if (z3) {
                            qVar.mo181108g();
                            break;
                        }
                    }
                }
                C117182d dVar = new C117182d();
                dVar.f351050a = String.valueOf(d);
                dVar.f351051b = String.valueOf(e);
                dVar.f351052c = m165266b(qVar);
                dVar.f351053d = m165266b(qVar);
                dVar.f351054e = m165266b(qVar);
                dVar.f351055f = m165266b(qVar);
                try {
                    qVar.mo181101a();
                } catch (Exception unused) {
                }
                return dVar;
            } catch (Exception e2) {
                if (e2 instanceof C117181c) {
                    throw e2;
                }
                throw new C117181c("ProcStatReader error: " + e2.getClass().getName() + ", " + e2.getMessage());
            } catch (Throwable th) {
                try {
                    qVar.mo181101a();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }

        /* renamed from: b */
        public static long m165266b(C117176q qVar) {
            boolean z = false;
            long j = 1;
            long j2 = 0;
            boolean z2 = true;
            while (true) {
                if (!qVar.mo181102b()) {
                    break;
                }
                qVar.mo181103c();
                if (!Character.isDigit(qVar.f351043f)) {
                    if (!z2) {
                        qVar.mo181108g();
                        break;
                    } else if (qVar.f351043f == '-') {
                        j = -1;
                    } else {
                        throw new C117176q.C117177a("Couldn't read number!");
                    }
                } else {
                    j2 = (j2 * 10) + ((long) (qVar.f351043f - '0'));
                }
                z2 = false;
            }
            if (!z2) {
                long j3 = j * j2;
                while (true) {
                    if (!qVar.mo181102b()) {
                        break;
                    }
                    qVar.mo181103c();
                    if (qVar.f351043f == ' ') {
                        z = true;
                    } else if (z) {
                        qVar.mo181108g();
                        break;
                    }
                }
                return j3;
            }
            throw new C117176q.C117177a("Couldn't read number because the file ended!");
        }
    }

    /* renamed from: ie.r$b */
    public interface C117180b {
    }

    /* renamed from: ie.r$c */
    public static class C117181c extends Exception {

        /* renamed from: d */
        public final String f351049d;

        public C117181c(String str) {
            this.f351049d = str;
        }
    }

    /* renamed from: ie.r$d */
    public static class C117182d {

        /* renamed from: a */
        public String f351050a = "";

        /* renamed from: b */
        public String f351051b = "_";

        /* renamed from: c */
        public long f351052c = -1;

        /* renamed from: d */
        public long f351053d = -1;

        /* renamed from: e */
        public long f351054e = -1;

        /* renamed from: f */
        public long f351055f = -1;

        /* renamed from: a */
        public long mo181109a() {
            return this.f351052c + this.f351053d + this.f351054e + this.f351055f;
        }
    }

    /* renamed from: a */
    public static boolean m165258a(int i) {
        return new File("/proc/" + i + "/stat").exists();
    }

    /* renamed from: b */
    public static boolean m165259b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("-") ? TextUtils.isDigitsOnly(str.substring(1)) : TextUtils.isDigitsOnly(str);
    }

    /* renamed from: c */
    public static C117182d m165260c(int i, int i2) {
        return m165261d("/proc/" + i + "/task/" + i2 + "/stat");
    }

    /* renamed from: d */
    public static C117182d m165261d(String str) {
        C117182d dVar;
        try {
            ThreadLocal<byte[]> threadLocal = f351047a;
            if (threadLocal.get() == null) {
                threadLocal.set(new byte[128]);
            }
            dVar = C117179a.m165265a(str, threadLocal.get());
        } catch (C117181c e) {
            C117180b bVar = f351048b;
            if (bVar != null) {
                ((b$$d) bVar).mo182499a(3, e.f351049d);
            }
            try {
                ThreadLocal<byte[]> threadLocal2 = f351047a;
                if (threadLocal2.get() == null) {
                    threadLocal2.set(new byte[128]);
                }
                dVar = m165262e(str, threadLocal2.get());
            } catch (C117181c e2) {
                C117180b bVar2 = f351048b;
                if (bVar2 != null) {
                    ((b$$d) bVar2).mo182499a(1, e2.f351049d);
                }
                dVar = null;
            }
        } catch (Throwable th) {
            C118672d.m167356f("Matrix.battery.ProcStatUtil", "#parseJiffies fail: " + th.getMessage(), new Object[0]);
            C117180b bVar3 = f351048b;
            if (bVar3 != null) {
                ((b$$d) bVar3).mo182499a(0, C117159b.m165200a(str) + "\n" + th.getMessage());
            }
            return null;
        }
        if (dVar == null || dVar.f351050a == null) {
            C118672d.m167356f("Matrix.battery.ProcStatUtil", "#parseJiffies read with buffer fail, fallback with spilts", new Object[0]);
            try {
                dVar = m165263f(C117159b.m165200a(str));
            } catch (C117181c e3) {
                C117180b bVar4 = f351048b;
                if (bVar4 != null) {
                    ((b$$d) bVar4).mo182499a(2, e3.f351049d);
                }
            }
            if (dVar != null) {
                if (dVar.f351050a == null) {
                }
            }
            C118672d.m167356f("Matrix.battery.ProcStatUtil", "#parseJiffies read with splits fail", new Object[0]);
            return null;
        }
        return dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013c, code lost:
        r2 = r6;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p981ie.C117178r.C117182d m165262e(java.lang.String r9, byte[] r10) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r9)
            boolean r9 = r0.exists()
            r1 = 0
            if (r9 != 0) goto L_0x000d
            return r1
        L_0x000d:
            r9 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0025 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0025 }
            int r0 = r2.read(r10)     // Catch:{ all -> 0x001b }
            r2.close()     // Catch:{ IOException -> 0x0025 }
            goto L_0x0030
        L_0x001b:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            r2 = move-exception
            r0.addSuppressed(r2)     // Catch:{ IOException -> 0x0025 }
        L_0x0024:
            throw r0     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.String r3 = "Matrix.battery.ProcStatUtil"
            java.lang.String r4 = "read buffer from file fail"
            p723vf.C118672d.m167354d(r3, r0, r4, r2)
            r0 = -1
        L_0x0030:
            if (r0 > 0) goto L_0x0033
            return r1
        L_0x0033:
            ie.r$d r0 = new ie.r$d
            r0.<init>()
            int r1 = r10.length
            r2 = 0
            r3 = 0
        L_0x003b:
            if (r2 >= r1) goto L_0x01ab
            byte r4 = r10[r2]
            boolean r4 = java.lang.Character.isSpaceChar(r4)
            if (r4 == 0) goto L_0x0049
            int r3 = r3 + 1
            goto L_0x015e
        L_0x0049:
            r4 = 1
            if (r3 == r4) goto L_0x017c
            r4 = 3
            if (r3 == r4) goto L_0x0162
            r4 = 0
            switch(r3) {
                case 14: goto L_0x011b;
                case 15: goto L_0x00da;
                case 16: goto L_0x0098;
                case 17: goto L_0x0056;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x015e
        L_0x0056:
            r6 = r2
            r7 = 0
        L_0x0058:
            if (r6 >= r1) goto L_0x0067
            byte r8 = r10[r6]
            boolean r8 = java.lang.Character.isSpaceChar(r8)
            if (r8 != 0) goto L_0x0067
            int r6 = r6 + 1
            int r7 = r7 + 1
            goto L_0x0058
        L_0x0067:
            java.lang.String r2 = m165264g(r10, r2, r7)
            boolean r7 = m165259b(r2)
            if (r7 == 0) goto L_0x0079
            long r4 = p723vf.C90779e.m113848c(r2, r4)
            r0.f351055f = r4
            goto L_0x013c
        L_0x0079:
            ie.r$c r0 = new ie.r$c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = r10.length
            java.lang.String r9 = m165264g(r10, r9, r3)
            r1.append(r9)
            java.lang.String r9 = "\ncstime: "
            r1.append(r9)
            r1.append(r2)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L_0x0098:
            r6 = r2
            r7 = 0
        L_0x009a:
            if (r6 >= r1) goto L_0x00a9
            byte r8 = r10[r6]
            boolean r8 = java.lang.Character.isSpaceChar(r8)
            if (r8 != 0) goto L_0x00a9
            int r6 = r6 + 1
            int r7 = r7 + 1
            goto L_0x009a
        L_0x00a9:
            java.lang.String r2 = m165264g(r10, r2, r7)
            boolean r7 = m165259b(r2)
            if (r7 == 0) goto L_0x00bb
            long r4 = p723vf.C90779e.m113848c(r2, r4)
            r0.f351054e = r4
            goto L_0x013c
        L_0x00bb:
            ie.r$c r0 = new ie.r$c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = r10.length
            java.lang.String r9 = m165264g(r10, r9, r3)
            r1.append(r9)
            java.lang.String r9 = "\ncutime: "
            r1.append(r9)
            r1.append(r2)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L_0x00da:
            r6 = r2
            r7 = 0
        L_0x00dc:
            if (r6 >= r1) goto L_0x00eb
            byte r8 = r10[r6]
            boolean r8 = java.lang.Character.isSpaceChar(r8)
            if (r8 != 0) goto L_0x00eb
            int r6 = r6 + 1
            int r7 = r7 + 1
            goto L_0x00dc
        L_0x00eb:
            java.lang.String r2 = m165264g(r10, r2, r7)
            boolean r7 = m165259b(r2)
            if (r7 == 0) goto L_0x00fc
            long r4 = p723vf.C90779e.m113848c(r2, r4)
            r0.f351053d = r4
            goto L_0x013c
        L_0x00fc:
            ie.r$c r0 = new ie.r$c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = r10.length
            java.lang.String r9 = m165264g(r10, r9, r3)
            r1.append(r9)
            java.lang.String r9 = "\nstime: "
            r1.append(r9)
            r1.append(r2)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L_0x011b:
            r6 = r2
            r7 = 0
        L_0x011d:
            if (r6 >= r1) goto L_0x012c
            byte r8 = r10[r6]
            boolean r8 = java.lang.Character.isSpaceChar(r8)
            if (r8 != 0) goto L_0x012c
            int r6 = r6 + 1
            int r7 = r7 + 1
            goto L_0x011d
        L_0x012c:
            java.lang.String r2 = m165264g(r10, r2, r7)
            boolean r7 = m165259b(r2)
            if (r7 == 0) goto L_0x013f
            long r4 = p723vf.C90779e.m113848c(r2, r4)
            r0.f351052c = r4
        L_0x013c:
            r2 = r6
            goto L_0x003b
        L_0x013f:
            ie.r$c r0 = new ie.r$c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = r10.length
            java.lang.String r9 = m165264g(r10, r9, r3)
            r1.append(r9)
            java.lang.String r9 = "\nutime: "
            r1.append(r9)
            r1.append(r2)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L_0x015e:
            int r2 = r2 + 1
            goto L_0x003b
        L_0x0162:
            r4 = r2
            r5 = 0
        L_0x0164:
            if (r4 >= r1) goto L_0x0173
            byte r6 = r10[r4]
            boolean r6 = java.lang.Character.isSpaceChar(r6)
            if (r6 != 0) goto L_0x0173
            int r4 = r4 + 1
            int r5 = r5 + 1
            goto L_0x0164
        L_0x0173:
            java.lang.String r2 = m165264g(r10, r2, r5)
            r0.f351051b = r2
            r2 = r4
            goto L_0x003b
        L_0x017c:
            r3 = r2
            r5 = 0
        L_0x017e:
            r6 = 41
            if (r3 >= r1) goto L_0x018b
            byte r7 = r10[r3]
            if (r6 == r7) goto L_0x018b
            int r3 = r3 + 1
            int r5 = r5 + 1
            goto L_0x017e
        L_0x018b:
            r7 = 40
            byte r8 = r10[r2]
            if (r7 != r8) goto L_0x0195
            int r2 = r2 + 1
            int r5 = r5 + -1
        L_0x0195:
            int r7 = r2 + r5
            int r7 = r7 - r4
            byte r4 = r10[r7]
            if (r6 != r4) goto L_0x019e
            int r5 = r5 + -1
        L_0x019e:
            if (r5 <= 0) goto L_0x01a6
            java.lang.String r2 = m165264g(r10, r2, r5)
            r0.f351050a = r2
        L_0x01a6:
            r2 = 2
            r2 = r3
            r3 = 2
            goto L_0x003b
        L_0x01ab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p981ie.C117178r.m165262e(java.lang.String, byte[]):ie.r$d");
    }

    /* renamed from: f */
    public static C117182d m165263f(String str) {
        C117182d dVar = new C117182d();
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf(")");
            if (indexOf > 0) {
                String substring = str.substring(0, indexOf);
                dVar.f351050a = substring.substring(substring.indexOf("(") + 1, indexOf);
                String[] split = str.substring(indexOf + 1).split(" ");
                if (!m165259b(split[12])) {
                    throw new C117181c(str + "\nutime: " + split[12]);
                } else if (!m165259b(split[13])) {
                    throw new C117181c(str + "\nstime: " + split[13]);
                } else if (!m165259b(split[14])) {
                    throw new C117181c(str + "\ncutime: " + split[14]);
                } else if (m165259b(split[15])) {
                    dVar.f351051b = split[1];
                    dVar.f351052c = C90779e.m113848c(split[12], 0);
                    dVar.f351053d = C90779e.m113848c(split[13], 0);
                    dVar.f351054e = C90779e.m113848c(split[14], 0);
                    dVar.f351055f = C90779e.m113848c(split[15], 0);
                } else {
                    throw new C117181c(str + "\ncstime: " + split[15]);
                }
            } else {
                throw new IllegalStateException(str + " has not ')'");
            }
        }
        return dVar;
    }

    /* renamed from: g */
    public static String m165264g(byte[] bArr, int i, int i2) {
        try {
            CharBuffer decode = StandardCharsets.UTF_8.decode(ByteBuffer.wrap(bArr, i, i2));
            return String.valueOf(decode.array(), 0, decode.limit());
        } catch (IndexOutOfBoundsException e) {
            C118672d.m167356f("Matrix.battery.ProcStatUtil", "#safeBytesToString failed: " + e.getMessage(), new Object[0]);
            return "";
        }
    }
}
