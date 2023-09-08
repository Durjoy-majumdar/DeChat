package cl1;

import d50.C58111e;
import fj1.C45795b;
import gy3.C87412m;

/* renamed from: cl1.v */
public final class C55002v extends C39970c<C45795b> {

    /* renamed from: h */
    public static boolean f154429h;

    /* renamed from: f */
    public C58111e f154430f;

    /* renamed from: g */
    public int f154431g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55002v(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* JADX WARNING: type inference failed for: r3v35, types: [java.lang.Long] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x053b  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x055e  */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo76045c3(boolean r24, java.lang.String r25) {
        /*
            r23 = this;
            r0 = r23
            r7 = r25
            java.lang.Class<cl1.o> r8 = cl1.C54991o.class
            java.lang.Class<cl1.u> r9 = cl1.C55001u.class
            java.lang.String r1 = "key"
            gy3.C87412m.m108594g(r7, r1)
            d50.e r1 = r0.f154430f
            if (r1 != 0) goto L_0x0014
            java.lang.String r1 = "last qosInfo is null"
            return r1
        L_0x0014:
            int r2 = r1.f166202c
            r10 = 1
            r11 = 0
            if (r2 != r10) goto L_0x001c
            r2 = 1
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            r3 = 0
            if (r2 == 0) goto L_0x00d9
            nk1.n r2 = nk1.C61790n.f175670a
            nk1.d r4 = nk1.C61790n.f175672c
            if (r4 != 0) goto L_0x002d
            nk1.d r4 = new nk1.d
            r4.<init>()
            nk1.C61790n.f175672c = r4
        L_0x002d:
            float r4 = r1.f166194D
            int r4 = (int) r4
            nk1.d r5 = nk1.C61790n.f175672c
            if (r5 == 0) goto L_0x0037
            nk1.p r5 = r5.f175612b
            goto L_0x0038
        L_0x0037:
            r5 = r3
        L_0x0038:
            r2.mo86718a(r4, r5)
            int r4 = r1.f166205f
            nk1.d r5 = nk1.C61790n.f175672c
            if (r5 == 0) goto L_0x0044
            nk1.p r5 = r5.f175616f
            goto L_0x0045
        L_0x0044:
            r5 = r3
        L_0x0045:
            r2.mo86718a(r4, r5)
            int r4 = r1.f166206g
            nk1.d r5 = nk1.C61790n.f175672c
            if (r5 == 0) goto L_0x0051
            nk1.p r5 = r5.f175617g
            goto L_0x0052
        L_0x0051:
            r5 = r3
        L_0x0052:
            r2.mo86718a(r4, r5)
            int r4 = r1.f166208i
            nk1.d r5 = nk1.C61790n.f175672c
            if (r5 == 0) goto L_0x005e
            nk1.p r5 = r5.f175618h
            goto L_0x005f
        L_0x005e:
            r5 = r3
        L_0x005f:
            r2.mo86718a(r4, r5)
            int r4 = r1.f166207h
            nk1.d r5 = nk1.C61790n.f175672c
            if (r5 == 0) goto L_0x006b
            nk1.p r5 = r5.f175615e
            goto L_0x006c
        L_0x006b:
            r5 = r3
        L_0x006c:
            r2.mo86718a(r4, r5)
            int r4 = r1.f166209j
            nk1.d r5 = nk1.C61790n.f175672c
            if (r5 == 0) goto L_0x0078
            nk1.p r5 = r5.f175613c
            goto L_0x0079
        L_0x0078:
            r5 = r3
        L_0x0079:
            r2.mo86718a(r4, r5)
            int r4 = r1.f166210k
            nk1.d r5 = nk1.C61790n.f175672c
            if (r5 == 0) goto L_0x0085
            nk1.p r5 = r5.f175614d
            goto L_0x0086
        L_0x0085:
            r5 = r3
        L_0x0086:
            r2.mo86718a(r4, r5)
            int r4 = r1.f166211l
            nk1.d r5 = nk1.C61790n.f175672c
            if (r5 == 0) goto L_0x0092
            nk1.p r5 = r5.f175619i
            goto L_0x0093
        L_0x0092:
            r5 = r3
        L_0x0093:
            r2.mo86718a(r4, r5)
            int r4 = r1.f166218s
            nk1.d r5 = nk1.C61790n.f175672c
            if (r5 == 0) goto L_0x009f
            nk1.p r5 = r5.f175620j
            goto L_0x00a0
        L_0x009f:
            r5 = r3
        L_0x00a0:
            r2.mo86718a(r4, r5)
            int r4 = r1.f166216q
            nk1.d r5 = nk1.C61790n.f175672c
            if (r5 == 0) goto L_0x00ac
            nk1.p r5 = r5.f175621k
            goto L_0x00ad
        L_0x00ac:
            r5 = r3
        L_0x00ad:
            r2.mo86718a(r4, r5)
            int r4 = r1.f166215p
            nk1.d r5 = nk1.C61790n.f175672c
            if (r5 == 0) goto L_0x00b9
            nk1.p r5 = r5.f175622l
            goto L_0x00ba
        L_0x00b9:
            r5 = r3
        L_0x00ba:
            r2.mo86718a(r4, r5)
            int r4 = r1.f166212m
            nk1.d r5 = nk1.C61790n.f175672c
            if (r5 == 0) goto L_0x00c6
            nk1.p r5 = r5.f175623m
            goto L_0x00c7
        L_0x00c6:
            r5 = r3
        L_0x00c7:
            r2.mo86718a(r4, r5)
            int r1 = r1.f166214o
            nk1.d r4 = nk1.C61790n.f175672c
            if (r4 == 0) goto L_0x00d3
            nk1.p r4 = r4.f175624n
            goto L_0x00d4
        L_0x00d3:
            r4 = r3
        L_0x00d4:
            r2.mo86718a(r1, r4)
            goto L_0x017d
        L_0x00d9:
            nk1.n r2 = nk1.C61790n.f175670a
            nk1.q r4 = nk1.C61790n.f175671b
            if (r4 != 0) goto L_0x00e6
            nk1.q r4 = new nk1.q
            r4.<init>()
            nk1.C61790n.f175671b = r4
        L_0x00e6:
            float r4 = r1.f166194D
            int r4 = (int) r4
            nk1.q r5 = nk1.C61790n.f175671b
            if (r5 == 0) goto L_0x00f0
            nk1.p r5 = r5.f175678a
            goto L_0x00f1
        L_0x00f0:
            r5 = r3
        L_0x00f1:
            r2.mo86718a(r4, r5)
            int r4 = r1.f166225z
            nk1.q r5 = nk1.C61790n.f175671b
            if (r5 == 0) goto L_0x00fd
            nk1.p r5 = r5.f175681d
            goto L_0x00fe
        L_0x00fd:
            r5 = r3
        L_0x00fe:
            r2.mo86718a(r4, r5)
            int r4 = r1.f166196F
            nk1.q r5 = nk1.C61790n.f175671b
            if (r5 == 0) goto L_0x010a
            nk1.p r5 = r5.f175682e
            goto L_0x010b
        L_0x010a:
            r5 = r3
        L_0x010b:
            r2.mo86718a(r4, r5)
            int r4 = r1.f166197G
            nk1.q r5 = nk1.C61790n.f175671b
            if (r5 == 0) goto L_0x0117
            nk1.p r5 = r5.f175683f
            goto L_0x0118
        L_0x0117:
            r5 = r3
        L_0x0118:
            r2.mo86718a(r4, r5)
            long r4 = r1.f166198H
            r6 = 1000(0x3e8, float:1.401E-42)
            long r12 = (long) r6
            long r4 = r4 / r12
            int r5 = (int) r4
            nk1.q r4 = nk1.C61790n.f175671b
            if (r4 == 0) goto L_0x0129
            nk1.p r4 = r4.f175684g
            goto L_0x012a
        L_0x0129:
            r4 = r3
        L_0x012a:
            r2.mo86718a(r5, r4)
            long r4 = r1.f166199I
            long r4 = r4 / r12
            int r5 = (int) r4
            nk1.q r4 = nk1.C61790n.f175671b
            if (r4 == 0) goto L_0x0138
            nk1.p r4 = r4.f175685h
            goto L_0x0139
        L_0x0138:
            r4 = r3
        L_0x0139:
            r2.mo86718a(r5, r4)
            int r4 = r1.f166205f
            nk1.q r5 = nk1.C61790n.f175671b
            if (r5 == 0) goto L_0x0145
            nk1.p r5 = r5.f175687j
            goto L_0x0146
        L_0x0145:
            r5 = r3
        L_0x0146:
            r2.mo86718a(r4, r5)
            int r4 = r1.f166206g
            nk1.q r5 = nk1.C61790n.f175671b
            if (r5 == 0) goto L_0x0152
            nk1.p r5 = r5.f175688k
            goto L_0x0153
        L_0x0152:
            r5 = r3
        L_0x0153:
            r2.mo86718a(r4, r5)
            int r4 = r1.f166207h
            nk1.q r5 = nk1.C61790n.f175671b
            if (r5 == 0) goto L_0x015f
            nk1.p r5 = r5.f175686i
            goto L_0x0160
        L_0x015f:
            r5 = r3
        L_0x0160:
            r2.mo86718a(r4, r5)
            int r4 = r1.f166209j
            nk1.q r5 = nk1.C61790n.f175671b
            if (r5 == 0) goto L_0x016c
            nk1.p r5 = r5.f175679b
            goto L_0x016d
        L_0x016c:
            r5 = r3
        L_0x016d:
            r2.mo86718a(r4, r5)
            int r1 = r1.f166210k
            nk1.q r4 = nk1.C61790n.f175671b
            if (r4 == 0) goto L_0x0179
            nk1.p r4 = r4.f175680c
            goto L_0x017a
        L_0x0179:
            r4 = r3
        L_0x017a:
            r2.mo86718a(r1, r4)
        L_0x017d:
            nk1.d r1 = nk1.C61790n.f175672c
            r12 = 10
            if (r1 == 0) goto L_0x0431
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            nk1.p r5 = r1.f175616f
            nk1.e r5 = r5.f175675b
            java.lang.String r5 = r5.f175625a
            r4.append(r5)
            r5 = 58
            r4.append(r5)
            nk1.p r6 = r1.f175616f
            nk1.e r6 = r6.f175675b
            int r6 = r6.f175626b
            r4.append(r6)
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            nk1.p r6 = r1.f175617g
            nk1.e r6 = r6.f175675b
            java.lang.String r6 = r6.f175625a
            r4.append(r6)
            r4.append(r5)
            nk1.p r6 = r1.f175617g
            nk1.e r6 = r6.f175675b
            int r6 = r6.f175626b
            r4.append(r6)
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            nk1.p r6 = r1.f175618h
            nk1.e r6 = r6.f175675b
            java.lang.String r6 = r6.f175625a
            r4.append(r6)
            r4.append(r5)
            nk1.p r6 = r1.f175618h
            nk1.e r6 = r6.f175675b
            int r6 = r6.f175626b
            r4.append(r6)
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            nk1.p r6 = r1.f175612b
            nk1.e r6 = r6.f175675b
            java.lang.String r6 = r6.f175625a
            r4.append(r6)
            r4.append(r5)
            nk1.p r6 = r1.f175612b
            nk1.e r6 = r6.f175675b
            int r6 = r6.f175626b
            r4.append(r6)
            r6 = 40
            r4.append(r6)
            nk1.p r13 = r1.f175612b
            nk1.a r13 = r13.f175676c
            if (r13 == 0) goto L_0x0222
            long r13 = r13.f93651d
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            goto L_0x0223
        L_0x0222:
            r13 = r3
        L_0x0223:
            r4.append(r13)
            java.lang.String r13 = ")\n"
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            nk1.p r14 = r1.f175615e
            nk1.e r14 = r14.f175675b
            java.lang.String r14 = r14.f175625a
            r4.append(r14)
            r4.append(r5)
            nk1.p r14 = r1.f175615e
            nk1.e r14 = r14.f175675b
            int r14 = r14.f175626b
            r4.append(r14)
            r4.append(r6)
            nk1.p r14 = r1.f175615e
            nk1.a r14 = r14.f175676c
            if (r14 == 0) goto L_0x025c
            long r14 = r14.f93651d
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            goto L_0x025d
        L_0x025c:
            r14 = r3
        L_0x025d:
            r4.append(r14)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            nk1.p r14 = r1.f175613c
            nk1.e r14 = r14.f175675b
            java.lang.String r14 = r14.f175625a
            r4.append(r14)
            r4.append(r5)
            nk1.p r14 = r1.f175613c
            nk1.e r14 = r14.f175675b
            int r14 = r14.f175626b
            r4.append(r14)
            r4.append(r6)
            nk1.p r14 = r1.f175613c
            nk1.a r14 = r14.f175676c
            if (r14 == 0) goto L_0x0294
            long r14 = r14.f93651d
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            goto L_0x0295
        L_0x0294:
            r14 = r3
        L_0x0295:
            r4.append(r14)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            nk1.p r14 = r1.f175614d
            nk1.e r14 = r14.f175675b
            java.lang.String r14 = r14.f175625a
            r4.append(r14)
            r4.append(r5)
            nk1.p r14 = r1.f175614d
            nk1.e r14 = r14.f175675b
            int r14 = r14.f175626b
            r4.append(r14)
            r4.append(r6)
            nk1.p r14 = r1.f175614d
            nk1.a r14 = r14.f175676c
            if (r14 == 0) goto L_0x02cc
            long r14 = r14.f93651d
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            goto L_0x02cd
        L_0x02cc:
            r14 = r3
        L_0x02cd:
            r4.append(r14)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            nk1.p r14 = r1.f175619i
            nk1.e r14 = r14.f175675b
            java.lang.String r14 = r14.f175625a
            r4.append(r14)
            r4.append(r5)
            nk1.p r14 = r1.f175619i
            nk1.e r14 = r14.f175675b
            int r14 = r14.f175626b
            r4.append(r14)
            r4.append(r6)
            nk1.p r14 = r1.f175619i
            nk1.a r14 = r14.f175676c
            if (r14 == 0) goto L_0x0304
            long r14 = r14.f93651d
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            goto L_0x0305
        L_0x0304:
            r14 = r3
        L_0x0305:
            r4.append(r14)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            nk1.p r14 = r1.f175620j
            nk1.e r14 = r14.f175675b
            java.lang.String r14 = r14.f175625a
            r4.append(r14)
            r4.append(r5)
            nk1.p r14 = r1.f175620j
            nk1.e r14 = r14.f175675b
            int r14 = r14.f175626b
            r4.append(r14)
            r4.append(r6)
            nk1.p r14 = r1.f175620j
            nk1.a r14 = r14.f175676c
            if (r14 == 0) goto L_0x033c
            long r14 = r14.f93651d
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            goto L_0x033d
        L_0x033c:
            r14 = r3
        L_0x033d:
            r4.append(r14)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            nk1.p r14 = r1.f175621k
            nk1.e r14 = r14.f175675b
            java.lang.String r14 = r14.f175625a
            r4.append(r14)
            r4.append(r5)
            nk1.p r14 = r1.f175621k
            nk1.e r14 = r14.f175675b
            int r14 = r14.f175626b
            r4.append(r14)
            r4.append(r6)
            nk1.p r14 = r1.f175621k
            nk1.a r14 = r14.f175676c
            if (r14 == 0) goto L_0x0374
            long r14 = r14.f93651d
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            goto L_0x0375
        L_0x0374:
            r14 = r3
        L_0x0375:
            r4.append(r14)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            nk1.p r14 = r1.f175622l
            nk1.e r14 = r14.f175675b
            java.lang.String r14 = r14.f175625a
            r4.append(r14)
            r4.append(r5)
            nk1.p r14 = r1.f175622l
            nk1.e r14 = r14.f175675b
            int r14 = r14.f175626b
            r4.append(r14)
            r4.append(r6)
            nk1.p r14 = r1.f175622l
            nk1.a r14 = r14.f175676c
            if (r14 == 0) goto L_0x03ac
            long r14 = r14.f93651d
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            goto L_0x03ad
        L_0x03ac:
            r14 = r3
        L_0x03ad:
            r4.append(r14)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            nk1.p r14 = r1.f175623m
            nk1.e r14 = r14.f175675b
            java.lang.String r14 = r14.f175625a
            r4.append(r14)
            r4.append(r5)
            nk1.p r14 = r1.f175623m
            nk1.e r14 = r14.f175675b
            int r14 = r14.f175626b
            r4.append(r14)
            r4.append(r6)
            nk1.p r14 = r1.f175623m
            nk1.a r14 = r14.f175676c
            if (r14 == 0) goto L_0x03e4
            long r14 = r14.f93651d
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            goto L_0x03e5
        L_0x03e4:
            r14 = r3
        L_0x03e5:
            r4.append(r14)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            nk1.p r14 = r1.f175624n
            nk1.e r14 = r14.f175675b
            java.lang.String r14 = r14.f175625a
            r4.append(r14)
            r4.append(r5)
            nk1.p r5 = r1.f175624n
            nk1.e r5 = r5.f175675b
            int r5 = r5.f175626b
            r4.append(r5)
            r4.append(r6)
            nk1.p r1 = r1.f175624n
            nk1.a r1 = r1.f175676c
            if (r1 == 0) goto L_0x041b
            long r5 = r1.f93651d
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
        L_0x041b:
            r4.append(r3)
            r4.append(r13)
            java.lang.String r1 = r4.toString()
            r2.append(r1)
            java.lang.String r3 = r2.toString()
            java.lang.String r1 = "sb.toString()"
            gy3.C87412m.m108593f(r3, r1)
        L_0x0431:
            java.lang.String r13 = ""
            if (r24 == 0) goto L_0x046e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r12)
            w50.o r2 = w50.C38014o.f100509a
            rx3.g r2 = w50.C38014o.f100510b
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            com.tencent.mm.sdk.platformtools.LruCache r2 = (com.tencent.p014mm.sdk.platformtools.LruCache) r2
            java.lang.Object r2 = r2.get(r7)
            java.lang.String r3 = "isHevcMap.get(id)"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0460
            java.lang.String r2 = "H265"
            goto L_0x0462
        L_0x0460:
            java.lang.String r2 = "H264"
        L_0x0462:
            r1.append(r2)
            r1.append(r12)
            java.lang.String r3 = r1.toString()
            goto L_0x0596
        L_0x046e:
            int r1 = r25.length()
            if (r1 != 0) goto L_0x0476
            r1 = 1
            goto L_0x0477
        L_0x0476:
            r1 = 0
        L_0x0477:
            if (r1 != 0) goto L_0x0596
            java.lang.Class<rz.q> r1 = p682rz.C36594q.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            rz.q r1 = (p682rz.C36594q) r1
            r2 = 5
            boolean r14 = r1.mo60733UY(r2)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r3)
            w50.o r1 = w50.C38014o.f100509a
            w50.b r1 = w50.C65928b.f189533a
            boolean r2 = r1.mo89967f()
            if (r2 == 0) goto L_0x0589
            java.lang.String r1 = r1.mo89966e(r7)
            rx3.g r2 = w50.C38014o.f100511c
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            com.tencent.mm.sdk.platformtools.LruCache r2 = (com.tencent.p014mm.sdk.platformtools.LruCache) r2
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            w50.o$a r6 = (w50.C38014o.C38015a) r6
            if (r6 != 0) goto L_0x04b4
            java.lang.String r1 = "解码方式:[NULL,NULL]"
            goto L_0x058a
        L_0x04b4:
            java.lang.String r1 = ".flv"
            boolean r1 = z04.C112550d0.m153801u(r7, r1, r11)
            if (r1 == 0) goto L_0x04cd
            r3 = 0
            r4 = 0
            r5 = 6
            r16 = 0
            java.lang.String r2 = ".flv"
            r1 = r25
            r12 = r6
            r6 = r16
            int r1 = z04.C112550d0.m153769E(r1, r2, r3, r4, r5, r6)
            goto L_0x04e4
        L_0x04cd:
            r12 = r6
            java.lang.String r1 = ".m3u8"
            boolean r1 = z04.C112550d0.m153801u(r7, r1, r11)
            if (r1 == 0) goto L_0x04e3
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            java.lang.String r2 = ".m3u8"
            r1 = r25
            int r1 = z04.C112550d0.m153769E(r1, r2, r3, r4, r5, r6)
            goto L_0x04e4
        L_0x04e3:
            r1 = 0
        L_0x04e4:
            if (r1 <= 0) goto L_0x0526
            if (r1 < 0) goto L_0x04f0
            int r2 = r25.length()
            if (r1 >= r2) goto L_0x04f0
            r2 = 1
            goto L_0x04f1
        L_0x04f0:
            r2 = 0
        L_0x04f1:
            if (r2 == 0) goto L_0x0526
            java.lang.String r1 = r7.substring(r11, r1)
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r1, r2)
            r19 = 0
            r20 = 0
            r21 = 6
            r22 = 0
            java.lang.String r18 = "_"
            r17 = r1
            int r2 = z04.C112550d0.m153772H(r17, r18, r19, r20, r21, r22)
            int r2 = r2 + r10
            if (r2 < 0) goto L_0x0518
            int r3 = r1.length()
            if (r2 >= r3) goto L_0x0518
            r3 = 1
            goto L_0x0519
        L_0x0518:
            r3 = 0
        L_0x0519:
            if (r3 == 0) goto L_0x0526
            java.lang.String r1 = r1.substring(r2)
            java.lang.String r2 = "this as java.lang.String).substring(startIndex)"
            gy3.C87412m.m108593f(r1, r2)
            goto L_0x0527
        L_0x0526:
            r1 = r13
        L_0x0527:
            int r2 = r1.length()
            if (r2 != 0) goto L_0x052f
            r2 = 1
            goto L_0x0530
        L_0x052f:
            r2 = 0
        L_0x0530:
            r3 = 93
            java.lang.String r4 = "),"
            java.lang.String r5 = "(supportHevc:"
            java.lang.String r6 = "解码方式:["
            if (r2 == 0) goto L_0x055e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r2 = r12.f100512a
            r1.append(r2)
            r1.append(r5)
            r1.append(r14)
            r1.append(r4)
            java.lang.String r2 = r12.f100513b
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            goto L_0x058a
        L_0x055e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = r12.f100512a
            r2.append(r6)
            r2.append(r5)
            r2.append(r14)
            r2.append(r4)
            java.lang.String r4 = r12.f100513b
            r2.append(r4)
            r4 = 44
            r2.append(r4)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            goto L_0x058a
        L_0x0589:
            r1 = r13
        L_0x058a:
            r15.append(r1)
            r1 = 10
            r15.append(r1)
            java.lang.String r3 = r15.toString()
        L_0x0596:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r3 != 0) goto L_0x059b
            goto L_0x059c
        L_0x059b:
            r13 = r3
        L_0x059c:
            r1.<init>(r13)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "liveId:"
            r2.append(r3)
            androidx.lifecycle.i0 r3 = r0.business(r9)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            long r3 = r3.f182392d
            r2.append(r3)
            r3 = 10
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "objectId:"
            r2.append(r3)
            androidx.lifecycle.i0 r3 = r0.business(r9)
            cl1.u r3 = (cl1.C55001u) r3
            long r3 = r3.f154416j
            java.lang.String r3 = o40.C61926c.m72691p(r3)
            r2.append(r3)
            r3 = 10
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            d50.e r2 = r0.f154430f
            if (r2 == 0) goto L_0x05f4
            int r2 = r2.f166202c
            if (r2 != r10) goto L_0x05f4
            goto L_0x05f5
        L_0x05f4:
            r10 = 0
        L_0x05f5:
            if (r10 == 0) goto L_0x0616
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Mode CDN\n"
            r2.append(r3)
            androidx.lifecycle.i0 r3 = r0.business(r8)
            cl1.o r3 = (cl1.C54991o) r3
            java.lang.String r3 = r3.mo75981R3()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x0634
        L_0x0616:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Mode Trtc\n"
            r2.append(r3)
            androidx.lifecycle.i0 r3 = r0.business(r8)
            cl1.o r3 = (cl1.C54991o) r3
            java.lang.String r3 = r3.mo75981R3()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x0634:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C55002v.mo76045c3(boolean, java.lang.String):java.lang.String");
    }

    public void onCleared() {
        this.f154430f = null;
        this.f154431g = 0;
    }
}
