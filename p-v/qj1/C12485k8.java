package qj1;

import fy3.C32228q;
import gy3.C87413o;
import ig1.C8916d;
import rx3.C13598b0;
import te3.C50643o71;

/* renamed from: qj1.k8 */
public final class C12485k8 extends C87413o implements C32228q<Integer, String, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f35910d;

    /* renamed from: e */
    public final /* synthetic */ C12360e8 f35911e;

    /* renamed from: f */
    public final /* synthetic */ C8916d f35912f;

    /* renamed from: g */
    public final /* synthetic */ String f35913g;

    /* renamed from: h */
    public final /* synthetic */ C50643o71 f35914h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12485k8(String str, C12360e8 e8Var, C8916d dVar, String str2, C50643o71 o712) {
        super(3);
        this.f35910d = str;
        this.f35911e = e8Var;
        this.f35912f = dVar;
        this.f35913g = str2;
        this.f35914h = o712;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: sx3.f0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            r0 = r21
            java.lang.String r0 = (java.lang.String) r0
            r15 = r22
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            java.lang.String r3 = "Finder.FinderLiveGiftSendPlugin"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "doPostGift, giftId:"
            r4.append(r5)
            java.lang.String r5 = r1.f35910d
            r4.append(r5)
            java.lang.String r5 = ", cnt:"
            r4.append(r5)
            r4.append(r9)
            java.lang.String r5 = ", pkgBatchId:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = ", pkgDurationId:"
            r4.append(r5)
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            qj1.e8 r3 = r1.f35911e
            boolean r4 = r3.f35614x
            if (r4 != 0) goto L_0x004d
            r4 = 0
            r13 = 0
            goto L_0x0051
        L_0x004d:
            r4 = 8
            r13 = 8
        L_0x0051:
            cj1.n5 r3 = r3.mo14476D0()
            if (r3 == 0) goto L_0x0138
            qj1.e8 r4 = r1.f35911e
            android.view.ViewGroup r4 = r4.f166287d
            android.content.Context r4 = r4.getContext()
            java.lang.String r5 = "root.context"
            gy3.C87412m.m108593f(r4, r5)
            qj1.e8 r5 = r1.f35911e
            androidx.lifecycle.i0 r5 = r5.mo87696x0(r2)
            cl1.u r5 = (cl1.C55001u) r5
            te3.c21 r5 = r5.f154420q
            long r5 = r5.f182392d
            qj1.e8 r7 = r1.f35911e
            androidx.lifecycle.i0 r2 = r7.mo87696x0(r2)
            cl1.u r2 = (cl1.C55001u) r2
            long r7 = r2.f154416j
            java.lang.String r10 = r1.f35910d
            ig1.d r2 = r1.f35912f
            float r2 = r2.field_price
            int r11 = (int) r2
            java.lang.String r12 = r1.f35913g
            qj1.e8 r2 = r1.f35911e
            java.lang.String r14 = r2.f35595H
            te3.o71 r2 = r1.f35914h
            byte[] r2 = r2.toByteArray()
            pe3.b r16 = pe3.C89349b.m111674a(r2)
            qj1.e8 r2 = r1.f35911e
            qj1.si r2 = r2.f35605S
            if (r2 == 0) goto L_0x0111
            r20 = r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            monitor-enter(r2)
            r21 = r0
            java.lang.String r0 = r2.f36268b     // Catch:{ all -> 0x010e }
            r22 = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r13.<init>()     // Catch:{ all -> 0x010e }
            r17 = r14
            java.lang.String r14 = "onBatch prepareSuccList:"
            r13.append(r14)     // Catch:{ all -> 0x010e }
            java.util.ArrayList<qj1.si$a> r14 = r2.f36270d     // Catch:{ all -> 0x010e }
            int r14 = r14.size()     // Catch:{ all -> 0x010e }
            r13.append(r14)     // Catch:{ all -> 0x010e }
            java.lang.String r14 = ", rawList:"
            r13.append(r14)     // Catch:{ all -> 0x010e }
            java.util.ArrayList<qj1.si$a> r14 = r2.f36269c     // Catch:{ all -> 0x010e }
            int r14 = r14.size()     // Catch:{ all -> 0x010e }
            r13.append(r14)     // Catch:{ all -> 0x010e }
            java.lang.String r14 = ", prepareJobList:"
            r13.append(r14)     // Catch:{ all -> 0x010e }
            java.util.ArrayList<a14.z1> r14 = r2.f36271e     // Catch:{ all -> 0x010e }
            r13.append(r14)     // Catch:{ all -> 0x010e }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x010e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)     // Catch:{ all -> 0x010e }
            java.util.ArrayList<qj1.si$a> r0 = r2.f36270d     // Catch:{ all -> 0x010e }
            r15.addAll(r0)     // Catch:{ all -> 0x010e }
            java.util.ArrayList<qj1.si$a> r0 = r2.f36269c     // Catch:{ all -> 0x010e }
            r15.addAll(r0)     // Catch:{ all -> 0x010e }
            java.util.ArrayList<qj1.si$a> r0 = r2.f36270d     // Catch:{ all -> 0x010e }
            r0.clear()     // Catch:{ all -> 0x010e }
            java.util.ArrayList<qj1.si$a> r0 = r2.f36269c     // Catch:{ all -> 0x010e }
            r0.clear()     // Catch:{ all -> 0x010e }
            java.util.ArrayList<a14.z1> r0 = r2.f36271e     // Catch:{ all -> 0x010e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x010e }
        L_0x00f4:
            boolean r13 = r0.hasNext()     // Catch:{ all -> 0x010e }
            if (r13 == 0) goto L_0x010a
            java.lang.Object r13 = r0.next()     // Catch:{ all -> 0x010e }
            a14.z1 r13 = (a14.C53973z1) r13     // Catch:{ all -> 0x010e }
            r14 = 1
            r18 = r0
            r0 = 0
            a14.C53973z1.C53974a.m60623a(r13, r0, r14, r0)     // Catch:{ all -> 0x010e }
            r0 = r18
            goto L_0x00f4
        L_0x010a:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x010e }
            monitor-exit(r2)
            goto L_0x011c
        L_0x010e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0111:
            r21 = r0
            r22 = r13
            r17 = r14
            r20 = r15
            sx3.f0 r0 = sx3.C64186f0.f181907d
            r15 = r0
        L_0x011c:
            qj1.e8 r0 = r1.f35911e
            qj1.e8$d r0 = r0.f35593F
            r18 = r0
            r2 = r3
            r3 = r4
            r4 = r5
            r6 = r7
            r8 = r10
            r10 = r11
            r11 = r12
            r12 = r17
            r13 = r22
            r14 = r16
            r0 = r20
            r16 = r21
            r17 = r0
            r2.mo75750r(r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x0138:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12485k8.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
