package p425ze;

import p276y9.C26635k;

/* renamed from: ze.g */
public class C26703g {

    /* renamed from: a */
    public final C26635k f74244a;

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|(4:1|2|3|(1:5)(3:53|6|(3:7|(1:9)(1:10)|(4:12|13|(1:(2:16|(2:18|(2:20|(2:22|(3:24|25|55)(2:26|56))(2:27|57))(2:28|58))(2:29|59))(2:30|60))(2:31|61)|54))))|32|33|34|(4:38|(2:40|65)(1:64)|62|36)|63|41|(2:42|(1:51)(1:50))|51|52) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00a8 */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011a A[LOOP:3: B:42:0x0101->B:50:0x011a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011c A[EDGE_INSN: B:66:0x011c->B:51:0x011c ?: BREAK  
    EDGE_INSN: B:67:0x011c->B:51:0x011c ?: BREAK  ] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26703g(java.io.File r11) {
        /*
            r10 = this;
            r10.<init>()
            java.lang.String r0 = "hprofFile"
            p296bf.C79695b.m96813a(r11, r0)
            z9.b r0 = new z9.b
            r0.<init>(r11)
            y9.g r11 = new y9.g
            r11.<init>(r0)
            y9.k r0 = new y9.k
            z9.a r1 = r11.f74088a
            r0.<init>(r1)
            r11.f74090c = r0
        L_0x001b:
            r1 = 2
            r2 = 1
            r3 = 0
            z9.a r4 = r11.f74088a     // Catch:{ EOFException -> 0x00a8 }
            z9.b r4 = (p1224z9.C119087b) r4     // Catch:{ EOFException -> 0x00a8 }
            byte r4 = r4.mo183757c()     // Catch:{ EOFException -> 0x00a8 }
            if (r4 == 0) goto L_0x0029
            goto L_0x001b
        L_0x0029:
            z9.a r4 = r11.f74088a     // Catch:{ EOFException -> 0x00a8 }
            z9.b r4 = (p1224z9.C119087b) r4     // Catch:{ EOFException -> 0x00a8 }
            int r4 = r4.mo183758d()     // Catch:{ EOFException -> 0x00a8 }
            r11.f74089b = r4     // Catch:{ EOFException -> 0x00a8 }
            y9.k r5 = r11.f74090c     // Catch:{ EOFException -> 0x00a8 }
            r5.mo53644k(r4)     // Catch:{ EOFException -> 0x00a8 }
            z9.a r4 = r11.f74088a     // Catch:{ EOFException -> 0x00a8 }
            z9.b r4 = (p1224z9.C119087b) r4     // Catch:{ EOFException -> 0x00a8 }
            r4.mo183759e()     // Catch:{ EOFException -> 0x00a8 }
        L_0x003f:
            z9.a r4 = r11.f74088a     // Catch:{ EOFException -> 0x00a8 }
            z9.b r4 = (p1224z9.C119087b) r4     // Catch:{ EOFException -> 0x00a8 }
            long r5 = r4.f356638f     // Catch:{ EOFException -> 0x00a8 }
            long r7 = r4.f356637e     // Catch:{ EOFException -> 0x00a8 }
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x004d
            r4 = 1
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r4 == 0) goto L_0x00a8
            int r4 = r11.mo53627i()     // Catch:{ EOFException -> 0x00a8 }
            z9.a r5 = r11.f74088a     // Catch:{ EOFException -> 0x00a8 }
            z9.b r5 = (p1224z9.C119087b) r5     // Catch:{ EOFException -> 0x00a8 }
            r5.mo183758d()     // Catch:{ EOFException -> 0x00a8 }
            z9.a r5 = r11.f74088a     // Catch:{ EOFException -> 0x00a8 }
            z9.b r5 = (p1224z9.C119087b) r5     // Catch:{ EOFException -> 0x00a8 }
            int r5 = r5.mo183758d()     // Catch:{ EOFException -> 0x00a8 }
            long r5 = (long) r5
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            if (r4 == r2) goto L_0x00a0
            if (r4 == r1) goto L_0x009c
            r7 = 4
            if (r4 == r7) goto L_0x0098
            r7 = 5
            if (r4 == r7) goto L_0x0094
            r7 = 12
            java.lang.String r8 = "default"
            if (r4 == r7) goto L_0x008b
            r7 = 28
            if (r4 == r7) goto L_0x0082
            r11.mo53629k(r5)     // Catch:{ EOFException -> 0x00a8 }
            goto L_0x003f
        L_0x0082:
            r11.mo53621c(r5)     // Catch:{ EOFException -> 0x00a8 }
            y9.k r4 = r11.f74090c     // Catch:{ EOFException -> 0x00a8 }
            r4.mo53643j(r3, r8)     // Catch:{ EOFException -> 0x00a8 }
            goto L_0x003f
        L_0x008b:
            r11.mo53621c(r5)     // Catch:{ EOFException -> 0x00a8 }
            y9.k r4 = r11.f74090c     // Catch:{ EOFException -> 0x00a8 }
            r4.mo53643j(r3, r8)     // Catch:{ EOFException -> 0x00a8 }
            goto L_0x003f
        L_0x0094:
            r11.mo53624f()     // Catch:{ EOFException -> 0x00a8 }
            goto L_0x003f
        L_0x0098:
            r11.mo53623e()     // Catch:{ EOFException -> 0x00a8 }
            goto L_0x003f
        L_0x009c:
            r11.mo53620b()     // Catch:{ EOFException -> 0x00a8 }
            goto L_0x003f
        L_0x00a0:
            int r4 = (int) r5     // Catch:{ EOFException -> 0x00a8 }
            int r5 = r11.f74089b     // Catch:{ EOFException -> 0x00a8 }
            int r4 = r4 - r5
            r11.mo53625g(r4)     // Catch:{ EOFException -> 0x00a8 }
            goto L_0x003f
        L_0x00a8:
            y9.k r4 = r11.f74090c     // Catch:{ Exception -> 0x00b2 }
            r4.mo53641h()     // Catch:{ Exception -> 0x00b2 }
            y9.k r4 = r11.f74090c     // Catch:{ Exception -> 0x00b2 }
            r4.mo53642i()     // Catch:{ Exception -> 0x00b2 }
        L_0x00b2:
            aa.j<java.lang.String> r4 = r11.f74092e
            r4.clear()
            aa.j<java.lang.String> r11 = r11.f74091d
            r11.clear()
            aa.d r11 = new aa.d
            r11.<init>()
            java.util.ArrayList<y9.f> r4 = r0.f74117b
            java.lang.Object r4 = r4.get(r3)
            y9.f r4 = (p276y9.C26630f) r4
            java.util.ArrayList<y9.i> r4 = r4.f74082d
            java.util.Iterator r5 = r4.iterator()
        L_0x00cf:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00fb
            java.lang.Object r6 = r5.next()
            y9.i r6 = (p276y9.C26633i) r6
            java.lang.Object[] r7 = new java.lang.Object[r1]
            y9.j r8 = r6.f74097h
            java.lang.String r8 = r8.f74115d
            r7[r3] = r8
            long r8 = r6.f74093d
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r7[r2] = r8
            java.lang.String r8 = "%s@0x%08x"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            boolean r8 = r11.contains(r7)
            if (r8 != 0) goto L_0x00cf
            r11.put(r7, r6)
            goto L_0x00cf
        L_0x00fb:
            r4.clear()
            java.lang.Object[] r1 = r11.f67821i
            int r2 = r1.length
        L_0x0101:
            int r3 = r2 + -1
            if (r2 <= 0) goto L_0x011c
            r2 = r1[r3]
            if (r2 == 0) goto L_0x011a
            java.lang.Object r5 = p291aa.C23632k.f67819n
            if (r2 == r5) goto L_0x011a
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r11.get(r2)
            boolean r2 = r4.add(r2)
            if (r2 != 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r2 = r3
            goto L_0x0101
        L_0x011c:
            r10.f74244a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p425ze.C26703g.<init>(java.io.File):void");
    }
}
