package h24;

import d24.C20387b0;
import d24.C20419r;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import o24.C21769k;

/* renamed from: h24.e */
public final class C20887e {

    /* renamed from: a */
    public static final /* synthetic */ int f59015a = 0;

    static {
        C21769k.C21770a aVar = C21769k.f61697h;
        aVar.mo34164a("\"\\");
        aVar.mo34164a("\t ,=");
    }

    /* renamed from: a */
    public static long m22965a(C20387b0 b0Var) {
        String c = b0Var.f57130i.mo31926c("Content-Length");
        if (c == null) {
            return -1;
        }
        try {
            return Long.parseLong(c);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static boolean m22966b(C20387b0 b0Var) {
        if (b0Var.f57125d.f57341b.equals("HEAD")) {
            return false;
        }
        int i = b0Var.f57127f;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && m22965a(b0Var) == -1 && !"chunked".equalsIgnoreCase(b0Var.mo31886b("Transfer-Encoding"))) ? false : true;
    }

    /* renamed from: c */
    public static int m22967c(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01be, code lost:
        if ((r0.equals(r14) || (r0.endsWith(r14) && r0.charAt((r0.length() - r14.length()) - 1) == '.' && !e24.C20509c.f57736h.matcher(r0).matches())) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01f1, code lost:
        if (r11 != false) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0200, code lost:
        if (r11 == false) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0202, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0312, code lost:
        if (r0 == null) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e2, code lost:
        if (r20 <= 0) goto L_0x00f7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x020a */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x02f8 A[LOOP:9: B:201:0x02f5->B:203:0x02f8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0368 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m22968d(d24.C20409l r33, d24.C20421s r34, d24.C20419r r35) {
        /*
            d24.l r0 = d24.C20409l.f57248a
            r1 = r33
            if (r1 != r0) goto L_0x0007
            return
        L_0x0007:
            java.util.regex.Pattern r0 = d24.C116553k.f349554j
            java.lang.String r0 = "Set-Cookie"
            r2 = r35
            java.util.List r2 = r2.mo31931g(r0)
            int r3 = r2.size()
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0018:
            if (r6 >= r3) goto L_0x0371
            java.lang.Object r0 = r2.get(r6)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            long r9 = java.lang.System.currentTimeMillis()
            int r11 = r8.length()
            r12 = 59
            int r0 = e24.C20509c.m22201g(r8, r5, r11, r12)
            r13 = 61
            int r14 = e24.C20509c.m22201g(r8, r5, r0, r13)
            if (r14 != r0) goto L_0x003d
        L_0x0037:
            r5 = r34
        L_0x0039:
            r26 = r2
            goto L_0x0314
        L_0x003d:
            java.lang.String r15 = e24.C20509c.m22215u(r8, r5, r14)
            boolean r16 = r15.isEmpty()
            if (r16 != 0) goto L_0x0037
            int r4 = r15.length()
        L_0x004b:
            r12 = 31
            if (r5 >= r4) goto L_0x005f
            char r13 = r15.charAt(r5)
            if (r13 <= r12) goto L_0x0060
            r12 = 127(0x7f, float:1.78E-43)
            if (r13 < r12) goto L_0x005a
            goto L_0x0060
        L_0x005a:
            int r5 = r5 + 1
            r12 = 59
            goto L_0x004b
        L_0x005f:
            r5 = -1
        L_0x0060:
            r4 = -1
            if (r5 == r4) goto L_0x0064
            goto L_0x0037
        L_0x0064:
            int r14 = r14 + 1
            java.lang.String r4 = e24.C20509c.m22215u(r8, r14, r0)
            int r5 = r4.length()
            r12 = 0
        L_0x006f:
            if (r12 >= r5) goto L_0x0081
            char r13 = r4.charAt(r12)
            r14 = 31
            if (r13 <= r14) goto L_0x0082
            r14 = 127(0x7f, float:1.78E-43)
            if (r13 < r14) goto L_0x007e
            goto L_0x0082
        L_0x007e:
            int r12 = r12 + 1
            goto L_0x006f
        L_0x0081:
            r12 = -1
        L_0x0082:
            r5 = -1
            if (r12 == r5) goto L_0x0086
            goto L_0x0037
        L_0x0086:
            int r0 = r0 + 1
            r18 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r26 = r18
            r14 = 0
            r20 = -1
            r22 = 0
            r23 = 0
            r24 = 1
            r25 = 0
            r28 = 0
        L_0x009c:
            r29 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r31 = -9223372036854775808
            if (r0 >= r11) goto L_0x0156
            r12 = 59
            int r13 = e24.C20509c.m22201g(r8, r0, r11, r12)
            r12 = 61
            int r5 = e24.C20509c.m22201g(r8, r0, r13, r12)
            java.lang.String r0 = e24.C20509c.m22215u(r8, r0, r5)
            if (r5 >= r13) goto L_0x00be
            int r5 = r5 + 1
            java.lang.String r5 = e24.C20509c.m22215u(r8, r5, r13)
            goto L_0x00c0
        L_0x00be:
            java.lang.String r5 = ""
        L_0x00c0:
            java.lang.String r12 = "expires"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x00d2
            int r0 = r5.length()     // Catch:{ IllegalArgumentException -> 0x0152 }
            r12 = 0
            long r26 = d24.C116553k.m164394b(r5, r12, r0)     // Catch:{ IllegalArgumentException -> 0x0152 }
            goto L_0x00fc
        L_0x00d2:
            java.lang.String r12 = "max-age"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x0100
            long r20 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x00e5 }
            r29 = 0
            int r0 = (r20 > r29 ? 1 : (r20 == r29 ? 0 : -1))
            if (r0 > 0) goto L_0x00fc
            goto L_0x00f7
        L_0x00e5:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = "-?\\d+"
            boolean r0 = r5.matches(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x00ff
            java.lang.String r0 = "-"
            boolean r0 = r5.startsWith(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x00fa
        L_0x00f7:
            r20 = r31
            goto L_0x00fc
        L_0x00fa:
            r20 = r29
        L_0x00fc:
            r25 = 1
            goto L_0x0152
        L_0x00ff:
            throw r12     // Catch:{  }
        L_0x0100:
            java.lang.String r12 = "domain"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x0131
            java.lang.String r0 = "."
            boolean r12 = r5.endsWith(r0)     // Catch:{ IllegalArgumentException -> 0x0152 }
            if (r12 != 0) goto L_0x012b
            boolean r0 = r5.startsWith(r0)     // Catch:{ IllegalArgumentException -> 0x0152 }
            if (r0 == 0) goto L_0x011b
            r12 = 1
            java.lang.String r5 = r5.substring(r12)     // Catch:{ IllegalArgumentException -> 0x0152 }
        L_0x011b:
            java.lang.String r0 = e24.C20509c.m22196b(r5)     // Catch:{ IllegalArgumentException -> 0x0152 }
            if (r0 == 0) goto L_0x0125
            r14 = r0
            r24 = 0
            goto L_0x0152
        L_0x0125:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0152 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0152 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0152 }
        L_0x012b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0152 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0152 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0152 }
        L_0x0131:
            java.lang.String r12 = "path"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x013c
            r28 = r5
            goto L_0x0152
        L_0x013c:
            java.lang.String r5 = "secure"
            boolean r5 = r0.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0148
            r22 = 1
            goto L_0x0152
        L_0x0148:
            java.lang.String r5 = "httponly"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L_0x0152
            r23 = 1
        L_0x0152:
            int r0 = r13 + 1
            goto L_0x009c
        L_0x0156:
            int r0 = (r20 > r31 ? 1 : (r20 == r31 ? 0 : -1))
            if (r0 != 0) goto L_0x015f
            r5 = r34
            r18 = r31
            goto L_0x0189
        L_0x015f:
            r11 = -1
            int r0 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0185
            r11 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0172
            r11 = 1000(0x3e8, double:4.94E-321)
            long r29 = r20 * r11
        L_0x0172:
            long r29 = r9 + r29
            int r0 = (r29 > r9 ? 1 : (r29 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0182
            int r0 = (r29 > r18 ? 1 : (r29 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x017d
            goto L_0x0182
        L_0x017d:
            r5 = r34
            r18 = r29
            goto L_0x0189
        L_0x0182:
            r5 = r34
            goto L_0x0189
        L_0x0185:
            r5 = r34
            r18 = r26
        L_0x0189:
            java.lang.String r0 = r5.f57268d
            r8 = 46
            if (r14 != 0) goto L_0x0191
            r14 = r0
            goto L_0x01c2
        L_0x0191:
            boolean r9 = r0.equals(r14)
            if (r9 == 0) goto L_0x0198
            goto L_0x01bb
        L_0x0198:
            boolean r9 = r0.endsWith(r14)
            if (r9 == 0) goto L_0x01bd
            int r9 = r0.length()
            int r10 = r14.length()
            int r9 = r9 - r10
            r10 = 1
            int r9 = r9 - r10
            char r9 = r0.charAt(r9)
            if (r9 != r8) goto L_0x01bd
            java.util.regex.Pattern r9 = e24.C20509c.f57736h
            java.util.regex.Matcher r9 = r9.matcher(r0)
            boolean r9 = r9.matches()
            if (r9 != 0) goto L_0x01bd
        L_0x01bb:
            r9 = 1
            goto L_0x01be
        L_0x01bd:
            r9 = 0
        L_0x01be:
            if (r9 != 0) goto L_0x01c2
            goto L_0x0039
        L_0x01c2:
            int r0 = r0.length()
            int r9 = r14.length()
            if (r0 == r9) goto L_0x0321
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r9 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f61771h
            r9.getClass()
            java.lang.String r0 = java.net.IDN.toUnicode(r14)
            java.lang.String r10 = "\\."
            java.lang.String[] r10 = r0.split(r10)
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.f61772a
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x021b
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.f61772a
            r11 = 0
            r12 = 1
            boolean r0 = r0.compareAndSet(r11, r12)
            if (r0 == 0) goto L_0x021b
            r11 = 0
        L_0x01ee:
            r9.mo34203b()     // Catch:{ InterruptedIOException -> 0x020a, IOException -> 0x01f6 }
            if (r11 == 0) goto L_0x0228
            goto L_0x0202
        L_0x01f4:
            r0 = move-exception
            goto L_0x0211
        L_0x01f6:
            r0 = move-exception
            r12 = r0
            l24.g r0 = l24.C117443g.f351507a     // Catch:{ all -> 0x01f4 }
            r13 = 5
            java.lang.String r8 = "Failed to read public suffix list"
            r0.mo182134l(r13, r8, r12)     // Catch:{ all -> 0x01f4 }
            if (r11 == 0) goto L_0x0228
        L_0x0202:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x0228
        L_0x020a:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x01f4 }
            r8 = 46
            r11 = 1
            goto L_0x01ee
        L_0x0211:
            if (r11 == 0) goto L_0x021a
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x021a:
            throw r0
        L_0x021b:
            java.util.concurrent.CountDownLatch r0 = r9.f61773b     // Catch:{ InterruptedException -> 0x0221 }
            r0.await()     // Catch:{ InterruptedException -> 0x0221 }
            goto L_0x0228
        L_0x0221:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0228:
            monitor-enter(r9)
            byte[] r0 = r9.f61774c     // Catch:{ all -> 0x031e }
            if (r0 == 0) goto L_0x0316
            monitor-exit(r9)     // Catch:{ all -> 0x031e }
            int r0 = r10.length
            byte[][] r8 = new byte[r0][]
            r11 = 0
        L_0x0232:
            int r12 = r10.length
            if (r11 >= r12) goto L_0x0242
            r12 = r10[r11]
            java.nio.charset.Charset r13 = e24.C20509c.f57732d
            byte[] r12 = r12.getBytes(r13)
            r8[r11] = r12
            int r11 = r11 + 1
            goto L_0x0232
        L_0x0242:
            r11 = 0
        L_0x0243:
            if (r11 >= r0) goto L_0x0252
            byte[] r12 = r9.f61774c
            java.lang.String r12 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.m24985a(r12, r8, r11)
            if (r12 == 0) goto L_0x024f
            r11 = 1
            goto L_0x0254
        L_0x024f:
            int r11 = r11 + 1
            goto L_0x0243
        L_0x0252:
            r11 = 1
            r12 = 0
        L_0x0254:
            if (r0 <= r11) goto L_0x0274
            java.lang.Object r13 = r8.clone()
            byte[][] r13 = (byte[][]) r13
            r26 = r2
            r1 = 0
        L_0x025f:
            int r2 = r13.length
            int r2 = r2 - r11
            if (r1 >= r2) goto L_0x0276
            byte[] r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f61768e
            r13[r1] = r2
            byte[] r2 = r9.f61774c
            java.lang.String r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.m24985a(r2, r13, r1)
            if (r2 == 0) goto L_0x0270
            goto L_0x0277
        L_0x0270:
            int r1 = r1 + 1
            r11 = 1
            goto L_0x025f
        L_0x0274:
            r26 = r2
        L_0x0276:
            r2 = 0
        L_0x0277:
            if (r2 == 0) goto L_0x028a
            r1 = 0
        L_0x027a:
            int r11 = r0 + -1
            if (r1 >= r11) goto L_0x028a
            byte[] r11 = r9.f61775d
            java.lang.String r11 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.m24985a(r11, r8, r1)
            if (r11 == 0) goto L_0x0287
            goto L_0x028b
        L_0x0287:
            int r1 = r1 + 1
            goto L_0x027a
        L_0x028a:
            r11 = 0
        L_0x028b:
            if (r11 == 0) goto L_0x02a5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "!"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            goto L_0x02c8
        L_0x02a5:
            if (r12 != 0) goto L_0x02ac
            if (r2 != 0) goto L_0x02ac
            java.lang.String[] r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f61770g
            goto L_0x02c8
        L_0x02ac:
            if (r12 == 0) goto L_0x02b5
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r12.split(r0)
            goto L_0x02b7
        L_0x02b5:
            java.lang.String[] r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f61769f
        L_0x02b7:
            if (r2 == 0) goto L_0x02c0
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r2.split(r1)
            goto L_0x02c2
        L_0x02c0:
            java.lang.String[] r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f61769f
        L_0x02c2:
            int r2 = r0.length
            int r8 = r1.length
            if (r2 <= r8) goto L_0x02c7
            goto L_0x02c8
        L_0x02c7:
            r0 = r1
        L_0x02c8:
            int r1 = r10.length
            int r2 = r0.length
            r8 = 33
            if (r1 != r2) goto L_0x02d9
            r1 = 0
            r2 = r0[r1]
            char r2 = r2.charAt(r1)
            if (r2 == r8) goto L_0x02da
            r0 = 0
            goto L_0x0312
        L_0x02d9:
            r1 = 0
        L_0x02da:
            r2 = r0[r1]
            char r2 = r2.charAt(r1)
            if (r2 != r8) goto L_0x02e5
            int r1 = r10.length
            int r0 = r0.length
            goto L_0x02e9
        L_0x02e5:
            int r1 = r10.length
            int r0 = r0.length
            r2 = 1
            int r0 = r0 + r2
        L_0x02e9:
            int r1 = r1 - r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "\\."
            java.lang.String[] r2 = r14.split(r2)
        L_0x02f5:
            int r8 = r2.length
            if (r1 >= r8) goto L_0x0305
            r8 = r2[r1]
            r0.append(r8)
            r8 = 46
            r0.append(r8)
            int r1 = r1 + 1
            goto L_0x02f5
        L_0x0305:
            int r1 = r0.length()
            r2 = 1
            int r1 = r1 - r2
            r0.deleteCharAt(r1)
            java.lang.String r0 = r0.toString()
        L_0x0312:
            if (r0 != 0) goto L_0x0323
        L_0x0314:
            r2 = 0
            goto L_0x0359
        L_0x0316:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x031e }
            java.lang.String r1 = "Unable to load publicsuffixes.gz resource from the classpath."
            r0.<init>(r1)     // Catch:{ all -> 0x031e }
            throw r0     // Catch:{ all -> 0x031e }
        L_0x031e:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x031e }
            throw r0
        L_0x0321:
            r26 = r2
        L_0x0323:
            r1 = r28
            if (r1 == 0) goto L_0x0334
            java.lang.String r0 = "/"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0330
            goto L_0x0334
        L_0x0330:
            r21 = r1
            r2 = 0
            goto L_0x034b
        L_0x0334:
            java.lang.String r0 = r34.mo31940e()
            r1 = 47
            int r1 = r0.lastIndexOf(r1)
            if (r1 == 0) goto L_0x0346
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
            goto L_0x0349
        L_0x0346:
            r2 = 0
            java.lang.String r0 = "/"
        L_0x0349:
            r21 = r0
        L_0x034b:
            d24.k r0 = new d24.k
            r1 = r15
            r15 = r0
            r16 = r1
            r17 = r4
            r20 = r14
            r15.<init>(r16, r17, r18, r20, r21, r22, r23, r24, r25)
            goto L_0x035a
        L_0x0359:
            r0 = 0
        L_0x035a:
            if (r0 != 0) goto L_0x035d
            goto L_0x0368
        L_0x035d:
            if (r7 != 0) goto L_0x0365
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7 = r1
        L_0x0365:
            r7.add(r0)
        L_0x0368:
            int r6 = r6 + 1
            r5 = 0
            r1 = r33
            r2 = r26
            goto L_0x0018
        L_0x0371:
            if (r7 == 0) goto L_0x0378
            java.util.List r0 = java.util.Collections.unmodifiableList(r7)
            goto L_0x037c
        L_0x0378:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x037c:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0383
            return
        L_0x0383:
            r33.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h24.C20887e.m22968d(d24.l, d24.s, d24.r):void");
    }

    /* renamed from: e */
    public static int m22969e(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: f */
    public static Set<String> m22970f(C20419r rVar) {
        Set<String> emptySet = Collections.emptySet();
        int length = rVar.f57262a.length / 2;
        for (int i = 0; i < length; i++) {
            if ("Vary".equalsIgnoreCase(rVar.mo31927d(i))) {
                String f = rVar.mo31930f(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : f.split(",")) {
                    emptySet.add(trim.trim());
                }
            }
        }
        return emptySet;
    }
}
