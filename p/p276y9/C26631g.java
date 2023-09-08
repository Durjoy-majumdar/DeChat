package p276y9;

import androidx.exifinterface.media.ExifInterface;
import p1224z9.C119086a;
import p1224z9.C119087b;
import p291aa.C23631j;

/* renamed from: y9.g */
public class C26631g {

    /* renamed from: a */
    public final C119086a f74088a;

    /* renamed from: b */
    public int f74089b;

    /* renamed from: c */
    public C26635k f74090c;

    /* renamed from: d */
    public C23631j<String> f74091d = new C23631j<>();

    /* renamed from: e */
    public C23631j<String> f74092e = new C23631j<>();

    public C26631g(C119086a aVar) {
        this.f74088a = aVar;
    }

    /* renamed from: a */
    public final int mo53619a(C26634j jVar) {
        this.f74090c.mo53634a(new C26633i(jVar, mo53626h(), 0, (C26636m) null));
        return this.f74089b;
    }

    /* renamed from: b */
    public final void mo53620b() {
        ((C119087b) this.f74088a).mo183758d();
        long h = mo53626h();
        ((C119087b) this.f74088a).mo183758d();
        this.f74092e.mo37174w(h, this.f74091d.mo37171s(mo53626h()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b3, code lost:
        r19 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e0, code lost:
        r19 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0147, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01fc, code lost:
        r1 = (long) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x039c, code lost:
        r1 = r1 - ((long) r3);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53621c(long r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
        L_0x0004:
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x03ea
            int r3 = r18.mo53627i()
            r4 = 1
            long r1 = r1 - r4
            r4 = 144(0x90, float:2.02E-43)
            if (r3 == r4) goto L_0x03db
            r4 = 195(0xc3, float:2.73E-43)
            if (r3 == r4) goto L_0x03c9
            r4 = 254(0xfe, float:3.56E-43)
            if (r3 == r4) goto L_0x03a9
            r4 = 255(0xff, float:3.57E-43)
            if (r3 == r4) goto L_0x03a0
            switch(r3) {
                case 1: goto L_0x014a;
                case 2: goto L_0x0116;
                case 3: goto L_0x00e4;
                case 4: goto L_0x00b7;
                case 5: goto L_0x00ad;
                case 6: goto L_0x0083;
                case 7: goto L_0x007c;
                case 8: goto L_0x0056;
                default: goto L_0x0024;
            }
        L_0x0024:
            switch(r3) {
                case 32: goto L_0x01ff;
                case 33: goto L_0x01b4;
                case 34: goto L_0x015f;
                case 35: goto L_0x0159;
                default: goto L_0x0027;
            }
        L_0x0027:
            r19 = r1
            switch(r3) {
                case 137: goto L_0x0394;
                case 138: goto L_0x038d;
                case 139: goto L_0x0386;
                case 140: goto L_0x037f;
                case 141: goto L_0x0378;
                case 142: goto L_0x0342;
                default: goto L_0x002c;
            }
        L_0x002c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "loadHeapDump loop with unknown tag "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r3 = " with "
            r2.append(r3)
            z9.a r3 = r0.f74088a
            z9.b r3 = (p1224z9.C119087b) r3
            long r4 = r3.f356637e
            long r6 = r3.f356638f
            long r4 = r4 - r6
            r2.append(r4)
            java.lang.String r3 = " bytes possibly remaining"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0056:
            long r3 = r18.mo53626h()
            z9.a r5 = r0.f74088a
            z9.b r5 = (p1224z9.C119087b) r5
            int r5 = r5.mo183758d()
            z9.a r6 = r0.f74088a
            z9.b r6 = (p1224z9.C119087b) r6
            int r6 = r6.mo183758d()
            y9.n r7 = new y9.n
            r7.<init>(r3, r6)
            y9.k r3 = r0.f74090c
            y9.f r3 = r3.f74118c
            aa.g<y9.n> r3 = r3.f74083e
            r3.mo37166v(r5, r7)
            int r3 = r0.f74089b
            goto L_0x0147
        L_0x007c:
            y9.j r3 = p276y9.C26634j.BUSY_MONITOR
            int r3 = r0.mo53619a(r3)
            goto L_0x00b3
        L_0x0083:
            long r6 = r18.mo53626h()
            z9.a r3 = r0.f74088a
            z9.b r3 = (p1224z9.C119087b) r3
            int r8 = r3.mo183758d()
            y9.k r3 = r0.f74090c
            y9.n r3 = r3.mo53640g(r8)
            y9.k r4 = r0.f74090c
            int r3 = r3.f74124b
            y9.m r9 = r4.mo53638e(r3)
            y9.i r3 = new y9.i
            y9.j r5 = p276y9.C26634j.THREAD_BLOCK
            r4 = r3
            r4.<init>(r5, r6, r8, r9)
            y9.k r4 = r0.f74090c
            r4.mo53634a(r3)
            int r3 = r0.f74089b
            goto L_0x00e0
        L_0x00ad:
            y9.j r3 = p276y9.C26634j.SYSTEM_CLASS
            int r3 = r0.mo53619a(r3)
        L_0x00b3:
            r19 = r1
            goto L_0x03e3
        L_0x00b7:
            long r6 = r18.mo53626h()
            z9.a r3 = r0.f74088a
            z9.b r3 = (p1224z9.C119087b) r3
            int r8 = r3.mo183758d()
            y9.k r3 = r0.f74090c
            y9.n r3 = r3.mo53640g(r8)
            y9.k r4 = r0.f74090c
            int r3 = r3.f74124b
            y9.m r9 = r4.mo53638e(r3)
            y9.i r3 = new y9.i
            y9.j r5 = p276y9.C26634j.NATIVE_STACK
            r4 = r3
            r4.<init>(r5, r6, r8, r9)
            y9.k r4 = r0.f74090c
            r4.mo53634a(r3)
            int r3 = r0.f74089b
        L_0x00e0:
            r19 = r1
            goto L_0x03c6
        L_0x00e4:
            long r6 = r18.mo53626h()
            z9.a r3 = r0.f74088a
            z9.b r3 = (p1224z9.C119087b) r3
            int r8 = r3.mo183758d()
            z9.a r3 = r0.f74088a
            z9.b r3 = (p1224z9.C119087b) r3
            int r3 = r3.mo183758d()
            y9.k r4 = r0.f74090c
            y9.n r4 = r4.mo53640g(r8)
            y9.k r5 = r0.f74090c
            int r4 = r4.f74124b
            y9.m r9 = r5.mo53639f(r4, r3)
            y9.i r3 = new y9.i
            y9.j r5 = p276y9.C26634j.JAVA_LOCAL
            r4 = r3
            r4.<init>(r5, r6, r8, r9)
            y9.k r4 = r0.f74090c
            r4.mo53634a(r3)
            int r3 = r0.f74089b
            goto L_0x0147
        L_0x0116:
            long r6 = r18.mo53626h()
            z9.a r3 = r0.f74088a
            z9.b r3 = (p1224z9.C119087b) r3
            int r8 = r3.mo183758d()
            z9.a r3 = r0.f74088a
            z9.b r3 = (p1224z9.C119087b) r3
            int r3 = r3.mo183758d()
            y9.k r4 = r0.f74090c
            y9.n r4 = r4.mo53640g(r8)
            y9.k r5 = r0.f74090c
            int r4 = r4.f74124b
            y9.m r9 = r5.mo53639f(r4, r3)
            y9.i r3 = new y9.i
            y9.j r5 = p276y9.C26634j.NATIVE_LOCAL
            r4 = r3
            r4.<init>(r5, r6, r8, r9)
            y9.k r4 = r0.f74090c
            r4.mo53634a(r3)
            int r3 = r0.f74089b
        L_0x0147:
            int r3 = r3 + 4
            goto L_0x00e0
        L_0x014a:
            y9.j r3 = p276y9.C26634j.NATIVE_STATIC
            int r3 = r0.mo53619a(r3)
            long r3 = (long) r3
            long r1 = r1 - r3
            r18.mo53626h()
            int r3 = r0.f74089b
            goto L_0x039c
        L_0x0159:
            int r3 = r18.mo53622d()
            goto L_0x039c
        L_0x015f:
            long r12 = r18.mo53626h()
            z9.a r3 = r0.f74088a
            z9.b r3 = (p1224z9.C119087b) r3
            int r3 = r3.mo183758d()
            y9.k r4 = r0.f74090c
            y9.m r7 = r4.mo53638e(r3)
            z9.a r3 = r0.f74088a
            z9.b r3 = (p1224z9.C119087b) r3
            int r3 = r3.mo183758d()
            long r14 = r18.mo53626h()
            y9.a r10 = new y9.a
            y9.o r8 = p276y9.C23282o.OBJECT
            z9.a r4 = r0.f74088a
            z9.b r4 = (p1224z9.C119087b) r4
            long r5 = r4.f356638f
            r4 = r10
            r16 = r5
            r5 = r12
            r9 = r3
            r19 = r1
            r1 = r10
            r10 = r16
            r4.<init>(r5, r7, r8, r9, r10)
            r1.f74094e = r14
            y9.k r2 = r0.f74090c
            y9.f r4 = r2.f74118c
            aa.j<y9.h> r4 = r4.f74086h
            r4.mo37174w(r12, r1)
            y9.f r2 = r2.f74118c
            r1.f74095f = r2
            int r1 = r0.f74089b
            int r3 = r3 * r1
            long r1 = (long) r3
            r0.mo53629k(r1)
            int r1 = r0.f74089b
            int r2 = r1 + 4
            int r2 = r2 + 4
            int r2 = r2 + r1
            int r2 = r2 + r3
            goto L_0x01fc
        L_0x01b4:
            r19 = r1
            long r1 = r18.mo53626h()
            z9.a r3 = r0.f74088a
            z9.b r3 = (p1224z9.C119087b) r3
            int r3 = r3.mo183758d()
            y9.k r4 = r0.f74090c
            y9.m r6 = r4.mo53638e(r3)
            long r9 = r18.mo53626h()
            z9.a r3 = r0.f74088a
            z9.b r3 = (p1224z9.C119087b) r3
            int r11 = r3.mo183758d()
            z9.a r3 = r0.f74088a
            z9.b r3 = (p1224z9.C119087b) r3
            long r7 = r3.f356638f
            y9.b r12 = new y9.b
            r3 = r12
            r4 = r1
            r3.<init>(r4, r6, r7)
            r12.f74094e = r9
            y9.k r3 = r0.f74090c
            y9.f r4 = r3.f74118c
            aa.j<y9.h> r4 = r4.f74086h
            r4.mo37174w(r1, r12)
            y9.f r1 = r3.f74118c
            r12.f74095f = r1
            long r1 = (long) r11
            r0.mo53629k(r1)
            int r1 = r0.f74089b
            int r2 = r1 + 4
            int r2 = r2 + r1
            int r2 = r2 + 4
            int r2 = r2 + r11
        L_0x01fc:
            long r1 = (long) r2
            goto L_0x03e4
        L_0x01ff:
            r19 = r1
            long r1 = r18.mo53626h()
            z9.a r3 = r0.f74088a
            z9.b r3 = (p1224z9.C119087b) r3
            int r3 = r3.mo183758d()
            y9.k r4 = r0.f74090c
            y9.m r6 = r4.mo53638e(r3)
            long r10 = r18.mo53626h()
            r18.mo53626h()
            r18.mo53626h()
            r18.mo53626h()
            r18.mo53626h()
            r18.mo53626h()
            z9.a r3 = r0.f74088a
            z9.b r3 = (p1224z9.C119087b) r3
            int r12 = r3.mo183758d()
            int r3 = r0.f74089b
            int r3 = r3 * 7
            int r3 = r3 + 4
            int r3 = r3 + 4
            int r4 = r18.mo53628j()
            int r3 = r3 + 2
            r13 = 0
            r14 = r3
            r3 = 0
        L_0x023f:
            if (r3 >= r4) goto L_0x0260
            r18.mo53628j()
            int r5 = r18.mo53627i()
            y9.o r5 = p276y9.C23282o.m27763a(r5)
            y9.k r7 = r0.f74090c
            int[] r7 = r7.f74120e
            int r5 = r5.f66919d
            r5 = r7[r5]
            long r7 = (long) r5
            r0.mo53629k(r7)
            int r5 = r5 + 1
            int r5 = r5 + 2
            int r14 = r14 + r5
            int r3 = r3 + 1
            goto L_0x023f
        L_0x0260:
            y9.c r15 = new y9.c
            aa.j<java.lang.String> r3 = r0.f74092e
            java.lang.Object r3 = r3.mo37171s(r1)
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            z9.a r3 = r0.f74088a
            z9.b r3 = (p1224z9.C119087b) r3
            long r8 = r3.f356638f
            r3 = r15
            r4 = r1
            r3.<init>(r4, r6, r7, r8)
            r15.f74072j = r10
            int r3 = r18.mo53628j()
            int r14 = r14 + 2
            y9.d[] r4 = new p276y9.C23280d[r3]
            r5 = 0
        L_0x0281:
            if (r5 >= r3) goto L_0x02bf
            aa.j<java.lang.String> r6 = r0.f74091d
            long r7 = r18.mo53626h()
            java.lang.Object r6 = r6.mo37171s(r7)
            java.lang.String r6 = (java.lang.String) r6
            z9.a r7 = r0.f74088a
            z9.b r7 = (p1224z9.C119087b) r7
            byte r7 = r7.mo183757c()
            y9.o r7 = p276y9.C23282o.m27763a(r7)
            y9.d r8 = new y9.d
            r8.<init>(r7, r6)
            r4[r5] = r8
            y9.k r6 = r0.f74090c
            int[] r6 = r6.f74120e
            int r8 = r7.f66919d
            r6 = r6[r8]
            long r8 = (long) r6
            r0.mo53629k(r8)
            int r6 = r0.f74089b
            int r6 = r6 + 1
            y9.k r8 = r0.f74090c
            int[] r8 = r8.f74120e
            int r7 = r7.f66919d
            r7 = r8[r7]
            int r6 = r6 + r7
            int r14 = r14 + r6
            int r5 = r5 + 1
            goto L_0x0281
        L_0x02bf:
            r15.f74074o = r4
            int r3 = r18.mo53628j()
            int r14 = r14 + 2
            y9.d[] r4 = new p276y9.C23280d[r3]
        L_0x02c9:
            if (r13 >= r3) goto L_0x02ee
            aa.j<java.lang.String> r5 = r0.f74091d
            long r6 = r18.mo53626h()
            java.lang.Object r5 = r5.mo37171s(r6)
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r18.mo53627i()
            y9.o r6 = p276y9.C23282o.m27763a(r6)
            y9.d r7 = new y9.d
            r7.<init>(r6, r5)
            r4[r13] = r7
            int r5 = r0.f74089b
            int r5 = r5 + 1
            int r14 = r14 + r5
            int r13 = r13 + 1
            goto L_0x02c9
        L_0x02ee:
            r15.f74073n = r4
            r15.f74075p = r12
            y9.k r3 = r0.f74090c
            y9.f r4 = r3.f74118c
            aa.j<y9.c> r5 = r4.f74084f
            r5.mo37174w(r1, r15)
            x9.l<java.lang.String, y9.c> r1 = r4.f74085g
            java.lang.String r2 = r15.f74070h
            x9.a r1 = (p398x9.C23034a) r1
            java.util.Map<K, java.util.Collection<V>> r4 = r1.f66232g
            java.lang.Object r4 = r4.get(r2)
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 != 0) goto L_0x032f
            r4 = r1
            x9.f r4 = (p398x9.C23053f) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            int r4 = r4.f66268i
            r5.<init>(r4)
            boolean r4 = r5.add(r15)
            if (r4 == 0) goto L_0x0327
            int r4 = r1.f66233h
            int r4 = r4 + 1
            r1.f66233h = r4
            java.util.Map<K, java.util.Collection<V>> r1 = r1.f66232g
            r1.put(r2, r5)
            goto L_0x033b
        L_0x0327:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "New Collection violated the Collection spec"
            r1.<init>(r2)
            throw r1
        L_0x032f:
            boolean r2 = r4.add(r15)
            if (r2 == 0) goto L_0x033b
            int r2 = r1.f66233h
            int r2 = r2 + 1
            r1.f66233h = r2
        L_0x033b:
            y9.f r1 = r3.f74118c
            r15.f74095f = r1
            long r1 = (long) r14
            goto L_0x03e4
        L_0x0342:
            long r5 = r18.mo53626h()
            z9.a r1 = r0.f74088a
            z9.b r1 = (p1224z9.C119087b) r1
            int r7 = r1.mo183758d()
            z9.a r1 = r0.f74088a
            z9.b r1 = (p1224z9.C119087b) r1
            int r1 = r1.mo183758d()
            y9.k r2 = r0.f74090c
            y9.n r2 = r2.mo53640g(r7)
            y9.k r3 = r0.f74090c
            int r2 = r2.f74124b
            y9.m r8 = r3.mo53639f(r2, r1)
            y9.i r1 = new y9.i
            y9.j r4 = p276y9.C26634j.NATIVE_MONITOR
            r3 = r1
            r3.<init>(r4, r5, r7, r8)
            y9.k r2 = r0.f74090c
            r2.mo53634a(r1)
            int r1 = r0.f74089b
            int r1 = r1 + 4
            int r3 = r1 + 4
            goto L_0x039a
        L_0x0378:
            y9.j r1 = p276y9.C26634j.VM_INTERNAL
            int r3 = r0.mo53619a(r1)
            goto L_0x039a
        L_0x037f:
            y9.j r1 = p276y9.C26634j.REFERENCE_CLEANUP
            int r3 = r0.mo53619a(r1)
            goto L_0x039a
        L_0x0386:
            y9.j r1 = p276y9.C26634j.DEBUGGER
            int r3 = r0.mo53619a(r1)
            goto L_0x039a
        L_0x038d:
            y9.j r1 = p276y9.C26634j.FINALIZING
            int r3 = r0.mo53619a(r1)
            goto L_0x039a
        L_0x0394:
            y9.j r1 = p276y9.C26634j.INTERNED_STRING
            int r3 = r0.mo53619a(r1)
        L_0x039a:
            r1 = r19
        L_0x039c:
            long r3 = (long) r3
            long r1 = r1 - r3
            goto L_0x0004
        L_0x03a0:
            r19 = r1
            y9.j r1 = p276y9.C26634j.UNKNOWN
            int r3 = r0.mo53619a(r1)
            goto L_0x03e3
        L_0x03a9:
            r19 = r1
            z9.a r1 = r0.f74088a
            z9.b r1 = (p1224z9.C119087b) r1
            int r1 = r1.mo183758d()
            long r2 = r18.mo53626h()
            aa.j<java.lang.String> r4 = r0.f74091d
            java.lang.Object r2 = r4.mo37171s(r2)
            java.lang.String r2 = (java.lang.String) r2
            y9.k r3 = r0.f74090c
            r3.mo53643j(r1, r2)
            int r3 = r0.f74089b
        L_0x03c6:
            int r3 = r3 + 4
            goto L_0x03e3
        L_0x03c9:
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.String r2 = "+--- PRIMITIVE ARRAY NODATA DUMP"
            r1.println(r2)
            r18.mo53622d()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Don't know how to load a nodata array"
            r1.<init>(r2)
            throw r1
        L_0x03db:
            r19 = r1
            y9.j r1 = p276y9.C26634j.UNREACHABLE
            int r3 = r0.mo53619a(r1)
        L_0x03e3:
            long r1 = (long) r3
        L_0x03e4:
            r3 = r19
            long r1 = r3 - r1
            goto L_0x0004
        L_0x03ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p276y9.C26631g.mo53621c(long):void");
    }

    /* renamed from: d */
    public final int mo53622d() {
        long h = mo53626h();
        C26636m e = this.f74090c.mo53638e(((C119087b) this.f74088a).mo183758d());
        int d = ((C119087b) this.f74088a).mo183758d();
        C23282o a = C23282o.m27763a(mo53627i());
        int i = this.f74090c.f74120e[a.f66919d];
        C26626a aVar = new C26626a(h, e, a, d, ((C119087b) this.f74088a).f356638f);
        C26635k kVar = this.f74090c;
        kVar.f74118c.f74086h.mo37174w(h, aVar);
        aVar.f74095f = kVar.f74118c;
        int i2 = d * i;
        mo53629k((long) i2);
        return this.f74089b + 4 + 4 + 1 + i2;
    }

    /* renamed from: e */
    public final void mo53623e() {
        long h = mo53626h();
        this.f74090c.f74118c.f74080b.mo37174w(h, new C15938l(h, this.f74091d.mo37171s(mo53626h()), this.f74091d.mo37171s(mo53626h()), this.f74091d.mo37171s(mo53626h()), ((C119087b) this.f74088a).mo183758d(), ((C119087b) this.f74088a).mo183758d()));
    }

    /* renamed from: f */
    public final void mo53624f() {
        int d = ((C119087b) this.f74088a).mo183758d();
        int d2 = ((C119087b) this.f74088a).mo183758d();
        int d3 = ((C119087b) this.f74088a).mo183758d();
        C15938l[] lVarArr = new C15938l[d3];
        for (int i = 0; i < d3; i++) {
            C26635k kVar = this.f74090c;
            lVarArr[i] = kVar.f74118c.f74080b.mo37171s(mo53626h());
        }
        this.f74090c.f74118c.f74081c.mo37166v(d, new C26636m(d, d2, lVarArr));
    }

    /* renamed from: g */
    public final void mo53625g(int i) {
        long h = mo53626h();
        byte[] bArr = new byte[i];
        C119087b bVar = (C119087b) this.f74088a;
        int a = bVar.mo183755a();
        bVar.f356636d[a].position(bVar.mo183756b());
        if (i <= bVar.f356636d[a].remaining()) {
            bVar.f356636d[a].get(bArr, 0, i);
        } else {
            int position = bVar.f356634b - bVar.f356636d[a].position();
            bVar.f356636d[a].get(bArr, 0, position);
            int i2 = a + 1;
            bVar.f356636d[i2].position(0);
            bVar.f356636d[i2].get(bArr, position, i - position);
        }
        bVar.f356638f += (long) i;
        this.f74091d.mo37174w(h, new String(bArr, "utf-8"));
    }

    /* renamed from: h */
    public final long mo53626h() {
        int i = this.f74089b;
        if (i == 1) {
            return (long) ((C119087b) this.f74088a).mo183757c();
        }
        if (i == 2) {
            return (long) ((C119087b) this.f74088a).mo183760f();
        }
        if (i == 4) {
            return (long) ((C119087b) this.f74088a).mo183758d();
        }
        if (i == 8) {
            return ((C119087b) this.f74088a).mo183759e();
        }
        throw new IllegalArgumentException("ID Length must be 1, 2, 4, or 8");
    }

    /* renamed from: i */
    public final int mo53627i() {
        return ((C119087b) this.f74088a).mo183757c() & ExifInterface.MARKER;
    }

    /* renamed from: j */
    public final int mo53628j() {
        return ((C119087b) this.f74088a).mo183760f() & 65535;
    }

    /* renamed from: k */
    public final void mo53629k(long j) {
        ((C119087b) this.f74088a).f356638f += j;
    }
}
