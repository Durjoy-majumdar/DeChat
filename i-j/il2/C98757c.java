package il2;

import il2.C98760e;
import sk2.C101645e;
import sk2.C101648g;
import wl2.C102461j;

/* renamed from: il2.c */
public final class C98757c implements C102461j.C102462a {

    /* renamed from: a */
    public final /* synthetic */ C98760e.C98761a f289555a;

    /* renamed from: b */
    public final /* synthetic */ long f289556b;

    /* renamed from: c */
    public final /* synthetic */ C101645e f289557c;

    /* renamed from: d */
    public final /* synthetic */ C101648g f289558d;

    public C98757c(C98760e.C98761a aVar, long j, C101645e eVar, C101648g gVar) {
        this.f289555a = aVar;
        this.f289556b = j;
        this.f289557c = eVar;
        this.f289558d = gVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: com.tencent.mm.plugin.scanner.model.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: com.tencent.mm.plugin.scanner.model.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: com.tencent.mm.plugin.scanner.model.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: kl2.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: com.tencent.mm.plugin.scanner.model.k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo138141a(boolean r18, byte[] r19) {
        /*
            r17 = this;
            r0 = r17
            r2 = r19
            r1 = 2
            r3 = 1
            r4 = 0
            r5 = 3
            if (r18 == 0) goto L_0x009e
            if (r2 == 0) goto L_0x009e
            il2.e$a r14 = r0.f289555a
            sk2.e r6 = r14.f289562a
            gy3.C87412m.m108591d(r6)
            r7 = 6
            java.lang.Object[] r7 = new java.lang.Object[r7]
            int r8 = r2.length
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r4] = r8
            long r8 = r6.f297532a
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            r7[r3] = r4
            int r4 = r6.f297537f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7[r1] = r4
            boolean r1 = r6.f297541j
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7[r5] = r1
            r1 = 4
            com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo r4 = r6.f297540i
            r8 = 0
            if (r4 == 0) goto L_0x003e
            java.lang.String r9 = r4.pHash
            goto L_0x003f
        L_0x003e:
            r9 = r8
        L_0x003f:
            r7[r1] = r9
            r1 = 5
            if (r4 == 0) goto L_0x0047
            java.lang.String r4 = r4.pHashVersion
            goto L_0x0048
        L_0x0047:
            r4 = r8
        L_0x0048:
            r7[r1] = r4
            java.lang.String r1 = "MicroMsg.AiImageDefaultUploader"
            java.lang.String r4 = "uploadImageDefault imageData: %d, session: %s, mode: %d, needPHash: %s, pHash: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r7)
            int r1 = r6.f297533b
            if (r1 == r3) goto L_0x006e
            if (r1 == r5) goto L_0x0059
            goto L_0x008e
        L_0x0059:
            kl2.k r12 = new kl2.k
            long r3 = r6.f297532a
            int r5 = r6.f297543l
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 112(0x70, float:1.57E-43)
            r11 = 0
            r1 = r12
            r2 = r19
            r1.<init>(r2, r3, r5, r6, r7, r8, r9, r10, r11)
            r8 = r12
            goto L_0x008e
        L_0x006e:
            com.tencent.mm.plugin.scanner.model.k r15 = new com.tencent.mm.plugin.scanner.model.k
            long r3 = r6.f297532a
            int r5 = r6.f297536e
            int r7 = r6.f297537f
            te3.he r8 = r6.f297538g
            te3.yd r9 = r6.f297539h
            com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo r10 = r6.f297540i
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r1 = r15
            r2 = r19
            r6 = r7
            r7 = r11
            r11 = r12
            r12 = r13
            r13 = r16
            r1.<init>(r2, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r8 = r15
        L_0x008e:
            if (r8 == 0) goto L_0x00df
            int r1 = r8.hashCode()
            r14.f289563b = r1
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r1.mo123460f(r8)
            goto L_0x00df
        L_0x009e:
            long r6 = r0.f289556b
            sk2.e r2 = r0.f289557c
            int r2 = r2.f297533b
            r8 = 101(0x65, float:1.42E-43)
            java.lang.String r9 = "decode image failed"
            sk2.g r10 = r0.f289558d
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Long r12 = java.lang.Long.valueOf(r6)
            r11[r4] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r11[r3] = r12
            r11[r1] = r9
            java.lang.String r1 = "MicroMsg.BaseAiImageUploader"
            java.lang.String r3 = "onScanFailed session: %d, errCode: %d, errMsg: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r3, r11)
            sk2.f r1 = new sk2.f
            r1.<init>()
            r1.f297547a = r2
            r1.f297548b = r6
            r1.f297549c = r4
            r1.f297550d = r5
            r1.f297551e = r8
            r1.f297552f = r9
            zt3.t r2 = zt3.C119157j.f356862d
            il2.j r3 = new il2.j
            r3.<init>(r10, r6, r1)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183895z(r3)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il2.C98757c.mo138141a(boolean, byte[]):void");
    }
}
