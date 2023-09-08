package f24;

import d24.C20387b0;
import d24.C20423t;

/* renamed from: f24.b */
public final class C20647b implements C20423t {

    /* renamed from: a */
    public final C20658g f58127a;

    public C20647b(C20658g gVar) {
        this.f58127a = gVar;
    }

    /* renamed from: b */
    public static boolean m22545b(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    /* renamed from: c */
    public static boolean m22546c(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    /* renamed from: d */
    public static C20387b0 m22547d(C20387b0 b0Var) {
        if (b0Var == null || b0Var.f57131j == null) {
            return b0Var;
        }
        C20387b0.C20388a aVar = new C20387b0.C20388a(b0Var);
        aVar.f57144g = null;
        return aVar.mo31889a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: d24.c$b} */
    /* JADX WARNING: type inference failed for: r4v1, types: [f24.e$c] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v20 ?
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.collectCodeVars(ProcessVariables.java:122)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:45)
        */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0288, code lost:
        if (r5 > 0) goto L_0x0275;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03f1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0436  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x05d7 A[SYNTHETIC, Splitter:B:270:0x05d7] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x05e4  */
    /* JADX WARNING: Removed duplicated region for block: B:306:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0132  */
    /* renamed from: a */
    public d24.C20387b0 mo31952a(d24.C20423t.C20424a r28) {
        /*
            r27 = this;
            r1 = r27
            f24.g r0 = r1.f58127a
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x0149
            r5 = r28
            h24.g r5 = (h24.C20889g) r5
            d24.y r5 = r5.f59021f
            d24.c$a r0 = (d24.C20389c.C20390a) r0
            d24.c r0 = d24.C20389c.this
            r0.getClass()
            d24.s r6 = r5.f57340a
            java.lang.String r6 = d24.C20389c.m21939a(r6)
            f24.e r0 = r0.f57151e     // Catch:{ IOException -> 0x0145 }
            f24.e$e r0 = r0.mo32333d(r6)     // Catch:{ IOException -> 0x0145 }
            if (r0 != 0) goto L_0x0025
            goto L_0x0146
        L_0x0025:
            d24.c$d r6 = new d24.c$d     // Catch:{ IOException -> 0x0141 }
            o24.d0[] r7 = r0.f58168f     // Catch:{ IOException -> 0x0141 }
            r7 = r7[r3]     // Catch:{ IOException -> 0x0141 }
            r6.<init>((o24.C21760d0) r7)     // Catch:{ IOException -> 0x0141 }
            d24.r r7 = r6.f57173g
            java.lang.String r8 = "Content-Type"
            java.lang.String r7 = r7.mo31926c(r8)
            d24.r r8 = r6.f57173g
            java.lang.String r9 = "Content-Length"
            java.lang.String r8 = r8.mo31926c(r9)
            d24.y$a r9 = new d24.y$a
            r9.<init>()
            java.lang.String r15 = r6.f57167a
            if (r15 == 0) goto L_0x0138
            r11 = 1
            r12 = 0
            r14 = 0
            r16 = 3
            java.lang.String r13 = "ws:"
            r10 = r15
            r2 = r15
            r15 = r16
            boolean r10 = r10.regionMatches(r11, r12, r13, r14, r15)
            if (r10 == 0) goto L_0x0070
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "http:"
            r10.append(r11)
            r11 = 3
            java.lang.String r2 = r2.substring(r11)
            r10.append(r2)
            java.lang.String r15 = r10.toString()
            goto L_0x0096
        L_0x0070:
            r11 = 1
            r12 = 0
            r14 = 0
            r15 = 4
            java.lang.String r13 = "wss:"
            r10 = r2
            boolean r10 = r10.regionMatches(r11, r12, r13, r14, r15)
            if (r10 == 0) goto L_0x0095
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "https:"
            r10.append(r11)
            r11 = 4
            java.lang.String r2 = r2.substring(r11)
            r10.append(r2)
            java.lang.String r15 = r10.toString()
            goto L_0x0096
        L_0x0095:
            r15 = r2
        L_0x0096:
            d24.s$a r2 = new d24.s$a
            r2.<init>()
            r2.mo31950b(r4, r15)
            d24.s r2 = r2.mo31949a()
            r9.mo31973e(r2)
            java.lang.String r2 = r6.f57169c
            r9.mo31971c(r2, r4)
            d24.r r2 = r6.f57168b
            d24.r$a r2 = r2.mo31928e()
            r9.f57347c = r2
            d24.y r2 = r9.mo31969a()
            d24.b0$a r9 = new d24.b0$a
            r9.<init>()
            r9.f57138a = r2
            d24.w r2 = r6.f57170d
            r9.f57139b = r2
            int r2 = r6.f57171e
            r9.f57140c = r2
            java.lang.String r2 = r6.f57172f
            r9.f57141d = r2
            d24.r r2 = r6.f57173g
            d24.r$a r2 = r2.mo31928e()
            r9.f57143f = r2
            d24.c$c r2 = new d24.c$c
            r2.<init>(r0, r7, r8)
            r9.f57144g = r2
            d24.q r0 = r6.f57174h
            r9.f57142e = r0
            long r7 = r6.f57175i
            r9.f57148k = r7
            long r7 = r6.f57176j
            r9.f57149l = r7
            d24.b0 r0 = r9.mo31889a()
            java.lang.String r2 = r6.f57167a
            d24.s r7 = r5.f57340a
            java.lang.String r7 = r7.f57273i
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x012f
            java.lang.String r2 = r6.f57169c
            java.lang.String r7 = r5.f57341b
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x012f
            d24.r r2 = r6.f57168b
            int r6 = h24.C20887e.f59015a
            d24.r r6 = r0.f57130i
            java.util.Set r6 = h24.C20887e.m22970f(r6)
            java.util.Iterator r6 = r6.iterator()
        L_0x010c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x012a
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.List r8 = r2.mo31931g(r7)
            d24.r r9 = r5.f57342c
            java.util.List r7 = r9.mo31931g(r7)
            boolean r7 = e24.C20509c.m22203i(r8, r7)
            if (r7 != 0) goto L_0x010c
            r2 = 0
            goto L_0x012b
        L_0x012a:
            r2 = 1
        L_0x012b:
            if (r2 == 0) goto L_0x012f
            r2 = 1
            goto L_0x0130
        L_0x012f:
            r2 = 0
        L_0x0130:
            if (r2 != 0) goto L_0x0147
            d24.d0 r0 = r0.f57131j
            e24.C20509c.m22197c(r0)
            goto L_0x0146
        L_0x0138:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "url == null"
            r0.<init>(r2)
            throw r0
        L_0x0141:
            e24.C20509c.m22197c(r0)
            goto L_0x0146
        L_0x0145:
        L_0x0146:
            r0 = r4
        L_0x0147:
            r2 = r0
            goto L_0x014a
        L_0x0149:
            r2 = r4
        L_0x014a:
            long r5 = java.lang.System.currentTimeMillis()
            r0 = r28
            h24.g r0 = (h24.C20889g) r0
            d24.y r7 = r0.f59021f
            if (r2 == 0) goto L_0x01c4
            long r11 = r2.f57135q
            long r13 = r2.f57136r
            d24.r r15 = r2.f57130i
            java.lang.String[] r3 = r15.f57262a
            int r3 = r3.length
            int r3 = r3 / 2
            r18 = r4
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r9 = 0
            r10 = -1
        L_0x016f:
            if (r9 >= r3) goto L_0x01d5
            java.lang.String r4 = r15.mo31927d(r9)
            java.lang.String r8 = r15.mo31930f(r9)
            r24 = r3
            java.lang.String r3 = "Date"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x018a
            java.util.Date r18 = h24.C117063d.m165079a(r8)
            r23 = r8
            goto L_0x01be
        L_0x018a:
            java.lang.String r3 = "Expires"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x0197
            java.util.Date r19 = h24.C117063d.m165079a(r8)
            goto L_0x01be
        L_0x0197:
            java.lang.String r3 = "Last-Modified"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x01a6
            java.util.Date r20 = h24.C117063d.m165079a(r8)
            r22 = r8
            goto L_0x01be
        L_0x01a6:
            java.lang.String r3 = "ETag"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x01b1
            r21 = r8
            goto L_0x01be
        L_0x01b1:
            java.lang.String r3 = "Age"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x01be
            r3 = -1
            int r10 = h24.C20887e.m22967c(r8, r3)
        L_0x01be:
            int r9 = r9 + 1
            r3 = r24
            r4 = 0
            goto L_0x016f
        L_0x01c4:
            r10 = -1
            r11 = 0
            r13 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
        L_0x01d5:
            if (r2 != 0) goto L_0x01de
            f24.d r3 = new f24.d
            r4 = 0
            r3.<init>(r7, r4)
            goto L_0x0201
        L_0x01de:
            d24.s r3 = r7.f57340a
            java.lang.String r3 = r3.f57265a
            java.lang.String r4 = "https"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01f5
            d24.q r3 = r2.f57129h
            if (r3 != 0) goto L_0x01f5
            f24.d r3 = new f24.d
            r4 = 0
            r3.<init>(r7, r4)
            goto L_0x0201
        L_0x01f5:
            r4 = 0
            boolean r3 = f24.C20649d.m22549a(r2, r7)
            if (r3 != 0) goto L_0x0205
            f24.d r3 = new f24.d
            r3.<init>(r7, r4)
        L_0x0201:
            r15 = r0
            r1 = r7
            goto L_0x03ac
        L_0x0205:
            d24.d r3 = r7.f57344e
            if (r3 == 0) goto L_0x020a
            goto L_0x0212
        L_0x020a:
            d24.r r3 = r7.f57342c
            d24.d r3 = d24.C20397d.m21952a(r3)
            r7.f57344e = r3
        L_0x0212:
            boolean r4 = r3.f57182a
            if (r4 != 0) goto L_0x03a4
            java.lang.String r4 = "If-Modified-Since"
            java.lang.String r8 = r7.mo31967a(r4)
            java.lang.String r9 = "If-None-Match"
            if (r8 != 0) goto L_0x0229
            java.lang.String r8 = r7.mo31967a(r9)
            if (r8 == 0) goto L_0x0227
            goto L_0x0229
        L_0x0227:
            r8 = 0
            goto L_0x022a
        L_0x0229:
            r8 = 1
        L_0x022a:
            if (r8 == 0) goto L_0x022e
            goto L_0x03a4
        L_0x022e:
            d24.d r8 = r2.mo31885a()
            if (r18 == 0) goto L_0x0246
            long r24 = r18.getTime()
            r15 = r0
            long r0 = r13 - r24
            r24 = r7
            r25 = r8
            r7 = 0
            long r0 = java.lang.Math.max(r7, r0)
            goto L_0x024d
        L_0x0246:
            r15 = r0
            r24 = r7
            r25 = r8
            r0 = 0
        L_0x024d:
            r7 = -1
            if (r10 == r7) goto L_0x025e
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r26 = r9
            long r8 = (long) r10
            long r7 = r7.toMillis(r8)
            long r0 = java.lang.Math.max(r0, r7)
            goto L_0x0260
        L_0x025e:
            r26 = r9
        L_0x0260:
            long r7 = r13 - r11
            long r5 = r5 - r13
            long r0 = r0 + r7
            long r0 = r0 + r5
            d24.d r5 = r2.mo31885a()
            int r5 = r5.f57184c
            r6 = -1
            if (r5 == r6) goto L_0x0277
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            long r7 = (long) r5
            long r5 = r6.toMillis(r7)
        L_0x0275:
            r7 = r5
            goto L_0x028b
        L_0x0277:
            if (r19 == 0) goto L_0x028f
            if (r18 == 0) goto L_0x027f
            long r13 = r18.getTime()
        L_0x027f:
            long r5 = r19.getTime()
            long r5 = r5 - r13
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x02c1
            goto L_0x0275
        L_0x028b:
            r5 = r7
            r7 = 0
            goto L_0x02c4
        L_0x028f:
            if (r20 == 0) goto L_0x02c1
            d24.y r5 = r2.f57125d
            d24.s r5 = r5.f57340a
            java.util.List<java.lang.String> r6 = r5.f57271g
            if (r6 != 0) goto L_0x029b
            r5 = 0
            goto L_0x02a9
        L_0x029b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.util.List<java.lang.String> r5 = r5.f57271g
            d24.C20421s.m21986i(r6, r5)
            java.lang.String r5 = r6.toString()
        L_0x02a9:
            if (r5 != 0) goto L_0x02c1
            if (r18 == 0) goto L_0x02b1
            long r11 = r18.getTime()
        L_0x02b1:
            long r5 = r20.getTime()
            long r11 = r11 - r5
            r7 = 0
            int r5 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x02c3
            r5 = 10
            long r5 = r11 / r5
            goto L_0x02c4
        L_0x02c1:
            r7 = 0
        L_0x02c3:
            r5 = r7
        L_0x02c4:
            int r9 = r3.f57184c
            r10 = -1
            if (r9 == r10) goto L_0x02d4
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            long r12 = (long) r9
            long r11 = r11.toMillis(r12)
            long r5 = java.lang.Math.min(r5, r11)
        L_0x02d4:
            int r9 = r3.f57190i
            if (r9 == r10) goto L_0x02e0
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            long r12 = (long) r9
            long r11 = r11.toMillis(r12)
            goto L_0x02e1
        L_0x02e0:
            r11 = r7
        L_0x02e1:
            r9 = r25
            boolean r13 = r9.f57188g
            if (r13 != 0) goto L_0x02f2
            int r3 = r3.f57189h
            if (r3 == r10) goto L_0x02f2
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            long r13 = (long) r3
            long r7 = r7.toMillis(r13)
        L_0x02f2:
            boolean r3 = r9.f57182a
            if (r3 != 0) goto L_0x034e
            long r11 = r11 + r0
            long r7 = r7 + r5
            int r3 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x034e
            d24.b0$a r3 = new d24.b0$a
            r3.<init>(r2)
            java.lang.String r4 = "Warning"
            int r7 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0317
            d24.r$a r5 = r3.f57143f
            java.lang.String r6 = "110 HttpURLConnection \"Response is stale\""
            r5.getClass()
            d24.C20419r.m21971a(r4)
            d24.C20419r.m21972b(r6, r4)
            r5.mo31935b(r4, r6)
        L_0x0317:
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0340
            d24.d r0 = r2.mo31885a()
            int r0 = r0.f57184c
            r1 = -1
            if (r0 != r1) goto L_0x032c
            if (r19 != 0) goto L_0x032c
            r17 = 1
            goto L_0x032e
        L_0x032c:
            r17 = 0
        L_0x032e:
            if (r17 == 0) goto L_0x0340
            d24.r$a r0 = r3.f57143f
            java.lang.String r1 = "113 HttpURLConnection \"Heuristic expiration\""
            r0.getClass()
            d24.C20419r.m21971a(r4)
            d24.C20419r.m21972b(r1, r4)
            r0.mo31935b(r4, r1)
        L_0x0340:
            f24.d r0 = new f24.d
            d24.b0 r1 = r3.mo31889a()
            r3 = 0
            r0.<init>(r3, r1)
            r3 = r0
            r1 = r24
            goto L_0x03ac
        L_0x034e:
            if (r21 == 0) goto L_0x0355
            r0 = r21
            r4 = r26
            goto L_0x035e
        L_0x0355:
            if (r20 == 0) goto L_0x035a
            r0 = r22
            goto L_0x035e
        L_0x035a:
            if (r18 == 0) goto L_0x039b
            r0 = r23
        L_0x035e:
            r1 = r24
            d24.r r3 = r1.f57342c
            d24.r$a r3 = r3.mo31928e()
            e24.a r5 = e24.C20507a.f57727a
            d24.v$a r5 = (d24.C20425v.C20426a) r5
            r5.getClass()
            r3.mo31935b(r4, r0)
            d24.y$a r0 = new d24.y$a
            r0.<init>(r1)
            java.util.List<java.lang.String> r3 = r3.f57263a
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r3 = r3.toArray(r4)
            java.lang.String[] r3 = (java.lang.String[]) r3
            d24.r$a r4 = new d24.r$a
            r4.<init>()
            java.util.List<java.lang.String> r5 = r4.f57263a
            java.util.Collections.addAll(r5, r3)
            r0.f57347c = r4
            d24.y r0 = r0.mo31969a()
            f24.d r3 = new f24.d
            r3.<init>(r0, r2)
            goto L_0x03ac
        L_0x039b:
            r1 = r24
            f24.d r3 = new f24.d
            r0 = 0
            r3.<init>(r1, r0)
            goto L_0x03ac
        L_0x03a4:
            r15 = r0
            r1 = r7
            r0 = 0
            f24.d r3 = new f24.d
            r3.<init>(r1, r0)
        L_0x03ac:
            d24.y r0 = r3.f58128a
            if (r0 == 0) goto L_0x03c8
            d24.d r0 = r1.f57344e
            if (r0 == 0) goto L_0x03b5
            goto L_0x03bd
        L_0x03b5:
            d24.r r0 = r1.f57342c
            d24.d r0 = d24.C20397d.m21952a(r0)
            r1.f57344e = r0
        L_0x03bd:
            boolean r0 = r0.f57191j
            if (r0 == 0) goto L_0x03c8
            f24.d r3 = new f24.d
            r4 = 0
            r3.<init>(r4, r4)
            goto L_0x03c9
        L_0x03c8:
            r4 = 0
        L_0x03c9:
            d24.y r0 = r3.f58128a
            d24.b0 r1 = r3.f58129b
            r5 = r27
            f24.g r6 = r5.f58127a
            if (r6 == 0) goto L_0x03e4
            d24.c$a r6 = (d24.C20389c.C20390a) r6
            d24.c r6 = d24.C20389c.this
            monitor-enter(r6)
            d24.y r7 = r3.f58128a     // Catch:{ all -> 0x03e1 }
            if (r7 == 0) goto L_0x03dd
            goto L_0x03df
        L_0x03dd:
            d24.b0 r3 = r3.f58129b     // Catch:{ all -> 0x03e1 }
        L_0x03df:
            monitor-exit(r6)
            goto L_0x03e4
        L_0x03e1:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x03e4:
            if (r2 == 0) goto L_0x03ed
            if (r1 != 0) goto L_0x03ed
            d24.d0 r3 = r2.f57131j
            e24.C20509c.m22197c(r3)
        L_0x03ed:
            r6 = -1
            if (r0 != 0) goto L_0x041a
            if (r1 != 0) goto L_0x041a
            d24.b0$a r0 = new d24.b0$a
            r0.<init>()
            r1 = r15
            d24.y r1 = r1.f59021f
            r0.f57138a = r1
            d24.w r1 = d24.C116554w.HTTP_1_1
            r0.f57139b = r1
            r1 = 504(0x1f8, float:7.06E-43)
            r0.f57140c = r1
            java.lang.String r1 = "Unsatisfiable Request (only-if-cached)"
            r0.f57141d = r1
            d24.d0 r1 = e24.C20509c.f57731c
            r0.f57144g = r1
            r0.f57148k = r6
            long r1 = java.lang.System.currentTimeMillis()
            r0.f57149l = r1
            d24.b0 r0 = r0.mo31889a()
            return r0
        L_0x041a:
            if (r0 != 0) goto L_0x0436
            r1.getClass()
            d24.b0$a r0 = new d24.b0$a
            r0.<init>(r1)
            d24.b0 r1 = m22547d(r1)
            if (r1 == 0) goto L_0x042f
            java.lang.String r2 = "cacheResponse"
            r0.mo31890b(r2, r1)
        L_0x042f:
            r0.f57146i = r1
            d24.b0 r0 = r0.mo31889a()
            return r0
        L_0x0436:
            r3 = r28
            h24.g r3 = (h24.C20889g) r3     // Catch:{ all -> 0x0626 }
            g24.g r8 = r3.f59017b     // Catch:{ all -> 0x0626 }
            h24.c r9 = r3.f59018c     // Catch:{ all -> 0x0626 }
            g24.c r10 = r3.f59019d     // Catch:{ all -> 0x0626 }
            d24.b0 r2 = r3.mo32602a(r0, r8, r9, r10)     // Catch:{ all -> 0x0626 }
            if (r1 == 0) goto L_0x0550
            int r3 = r2.f57127f
            r8 = 304(0x130, float:4.26E-43)
            if (r3 != r8) goto L_0x054b
            d24.b0$a r0 = new d24.b0$a
            r0.<init>(r1)
            d24.r r3 = r1.f57130i
            d24.r r6 = r2.f57130i
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 20
            r7.<init>(r8)
            java.lang.String[] r8 = r3.f57262a
            int r8 = r8.length
            int r8 = r8 / 2
            r9 = 0
        L_0x0462:
            if (r9 >= r8) goto L_0x04a3
            java.lang.String r10 = r3.mo31927d(r9)
            java.lang.String r11 = r3.mo31930f(r9)
            java.lang.String r12 = "Warning"
            boolean r12 = r12.equalsIgnoreCase(r10)
            if (r12 == 0) goto L_0x047d
            java.lang.String r12 = "1"
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto L_0x047d
            goto L_0x04a0
        L_0x047d:
            boolean r12 = m22545b(r10)
            if (r12 != 0) goto L_0x048f
            boolean r12 = m22546c(r10)
            if (r12 == 0) goto L_0x048f
            java.lang.String r12 = r6.mo31926c(r10)
            if (r12 != 0) goto L_0x04a0
        L_0x048f:
            e24.a r12 = e24.C20507a.f57727a
            d24.v$a r12 = (d24.C20425v.C20426a) r12
            r12.getClass()
            r7.add(r10)
            java.lang.String r10 = r11.trim()
            r7.add(r10)
        L_0x04a0:
            int r9 = r9 + 1
            goto L_0x0462
        L_0x04a3:
            java.lang.String[] r3 = r6.f57262a
            int r3 = r3.length
            int r3 = r3 / 2
            r8 = 0
        L_0x04a9:
            if (r8 >= r3) goto L_0x04d3
            java.lang.String r9 = r6.mo31927d(r8)
            boolean r10 = m22545b(r9)
            if (r10 != 0) goto L_0x04d0
            boolean r10 = m22546c(r9)
            if (r10 == 0) goto L_0x04d0
            e24.a r10 = e24.C20507a.f57727a
            java.lang.String r11 = r6.mo31930f(r8)
            d24.v$a r10 = (d24.C20425v.C20426a) r10
            r10.getClass()
            r7.add(r9)
            java.lang.String r9 = r11.trim()
            r7.add(r9)
        L_0x04d0:
            int r8 = r8 + 1
            goto L_0x04a9
        L_0x04d3:
            int r3 = r7.size()
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r3 = r7.toArray(r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            d24.r$a r6 = new d24.r$a
            r6.<init>()
            java.util.List<java.lang.String> r7 = r6.f57263a
            java.util.Collections.addAll(r7, r3)
            r0.f57143f = r6
            long r6 = r2.f57135q
            r0.f57148k = r6
            long r6 = r2.f57136r
            r0.f57149l = r6
            d24.b0 r3 = m22547d(r1)
            if (r3 == 0) goto L_0x04fe
            java.lang.String r6 = "cacheResponse"
            r0.mo31890b(r6, r3)
        L_0x04fe:
            r0.f57146i = r3
            d24.b0 r3 = m22547d(r2)
            if (r3 == 0) goto L_0x050b
            java.lang.String r6 = "networkResponse"
            r0.mo31890b(r6, r3)
        L_0x050b:
            r0.f57145h = r3
            d24.b0 r0 = r0.mo31889a()
            d24.d0 r2 = r2.f57131j
            r2.close()
            f24.g r2 = r5.f58127a
            d24.c$a r2 = (d24.C20389c.C20390a) r2
            d24.c r2 = d24.C20389c.this
            monitor-enter(r2)
            monitor-exit(r2)
            f24.g r2 = r5.f58127a
            d24.c$a r2 = (d24.C20389c.C20390a) r2
            d24.c r2 = d24.C20389c.this
            r2.getClass()
            d24.c$d r2 = new d24.c$d
            r2.<init>((d24.C20387b0) r0)
            d24.d0 r1 = r1.f57131j
            d24.c$c r1 = (d24.C20389c.C20393c) r1
            f24.e$e r1 = r1.f57160d
            f24.e r3 = f24.C20650e.this     // Catch:{ IOException -> 0x0545 }
            java.lang.String r6 = r1.f58166d     // Catch:{ IOException -> 0x0545 }
            long r7 = r1.f58167e     // Catch:{ IOException -> 0x0545 }
            f24.e$c r4 = r3.mo32331c(r6, r7)     // Catch:{ IOException -> 0x0545 }
            if (r4 == 0) goto L_0x054a
            r2.mo31902c(r4)     // Catch:{ IOException -> 0x0545 }
            r4.mo32348b()     // Catch:{ IOException -> 0x0545 }
            goto L_0x054a
        L_0x0545:
            if (r4 == 0) goto L_0x054a
            r4.mo32347a()     // Catch:{ IOException -> 0x054a }
        L_0x054a:
            return r0
        L_0x054b:
            d24.d0 r3 = r1.f57131j
            e24.C20509c.m22197c(r3)
        L_0x0550:
            d24.b0$a r3 = new d24.b0$a
            r3.<init>(r2)
            d24.b0 r1 = m22547d(r1)
            if (r1 == 0) goto L_0x0560
            java.lang.String r8 = "cacheResponse"
            r3.mo31890b(r8, r1)
        L_0x0560:
            r3.f57146i = r1
            d24.b0 r1 = m22547d(r2)
            if (r1 == 0) goto L_0x056d
            java.lang.String r2 = "networkResponse"
            r3.mo31890b(r2, r1)
        L_0x056d:
            r3.f57145h = r1
            d24.b0 r1 = r3.mo31889a()
            f24.g r2 = r5.f58127a
            if (r2 == 0) goto L_0x0625
            boolean r2 = h24.C20887e.m22966b(r1)
            if (r2 == 0) goto L_0x0614
            boolean r2 = f24.C20649d.m22549a(r1, r0)
            if (r2 == 0) goto L_0x0614
            f24.g r0 = r5.f58127a
            d24.c$a r0 = (d24.C20389c.C20390a) r0
            d24.c r0 = d24.C20389c.this
            r0.getClass()
            d24.y r2 = r1.f57125d
            java.lang.String r2 = r2.f57341b
            boolean r3 = h24.C20888f.m22971a(r2)
            if (r3 == 0) goto L_0x059c
            d24.y r2 = r1.f57125d     // Catch:{ IOException -> 0x05db }
            r0.mo31891c(r2)     // Catch:{ IOException -> 0x05db }
            goto L_0x05dc
        L_0x059c:
            java.lang.String r3 = "GET"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x05a5
            goto L_0x05dc
        L_0x05a5:
            d24.r r2 = r1.f57130i
            java.util.Set r2 = h24.C20887e.m22970f(r2)
            java.lang.String r3 = "*"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x05b4
            goto L_0x05dc
        L_0x05b4:
            d24.c$d r2 = new d24.c$d
            r2.<init>((d24.C20387b0) r1)
            f24.e r3 = r0.f57151e     // Catch:{ IOException -> 0x05d4 }
            d24.y r8 = r1.f57125d     // Catch:{ IOException -> 0x05d4 }
            d24.s r8 = r8.f57340a     // Catch:{ IOException -> 0x05d4 }
            java.lang.String r8 = d24.C20389c.m21939a(r8)     // Catch:{ IOException -> 0x05d4 }
            f24.e$c r3 = r3.mo32331c(r8, r6)     // Catch:{ IOException -> 0x05d4 }
            if (r3 != 0) goto L_0x05ca
            goto L_0x05dc
        L_0x05ca:
            r2.mo31902c(r3)     // Catch:{ IOException -> 0x05d5 }
            d24.c$b r2 = new d24.c$b     // Catch:{ IOException -> 0x05d5 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x05d5 }
            r4 = r2
            goto L_0x05dc
        L_0x05d4:
            r3 = r4
        L_0x05d5:
            if (r3 == 0) goto L_0x05dc
            r3.mo32347a()     // Catch:{ IOException -> 0x05db }
            goto L_0x05dc
        L_0x05db:
        L_0x05dc:
            if (r4 != 0) goto L_0x05df
            goto L_0x0613
        L_0x05df:
            o24.b0 r0 = r4.f57155c
            if (r0 != 0) goto L_0x05e4
            goto L_0x0613
        L_0x05e4:
            d24.d0 r2 = r1.f57131j
            o24.j r2 = r2.mo31898c()
            o24.i r0 = o24.C21777r.m24934a(r0)
            f24.a r3 = new f24.a
            r3.<init>(r5, r2, r4, r0)
            java.lang.String r0 = "Content-Type"
            java.lang.String r0 = r1.mo31886b(r0)
            d24.d0 r2 = r1.f57131j
            long r6 = r2.mo31896a()
            d24.b0$a r2 = new d24.b0$a
            r2.<init>(r1)
            h24.h r1 = new h24.h
            o24.j r3 = o24.C21777r.m24935b(r3)
            r1.<init>(r0, r6, r3)
            r2.f57144g = r1
            d24.b0 r1 = r2.mo31889a()
        L_0x0613:
            return r1
        L_0x0614:
            java.lang.String r2 = r0.f57341b
            boolean r2 = h24.C20888f.m22971a(r2)
            if (r2 == 0) goto L_0x0625
            f24.g r2 = r5.f58127a     // Catch:{ IOException -> 0x0625 }
            d24.c$a r2 = (d24.C20389c.C20390a) r2     // Catch:{ IOException -> 0x0625 }
            d24.c r2 = d24.C20389c.this     // Catch:{ IOException -> 0x0625 }
            r2.mo31891c(r0)     // Catch:{ IOException -> 0x0625 }
        L_0x0625:
            return r1
        L_0x0626:
            r0 = move-exception
            if (r2 == 0) goto L_0x062e
            d24.d0 r1 = r2.f57131j
            e24.C20509c.m22197c(r1)
        L_0x062e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f24.C20647b.mo31952a(d24.t$a):d24.b0");
    }
}
