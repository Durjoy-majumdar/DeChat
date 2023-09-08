package il2;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import il2.C98760e;
import java.util.HashMap;
import ob0.C11385n;
import sk2.C101645e;
import sk2.C101647f;
import sk2.C101648g;
import zt3.C119157j;

/* renamed from: il2.f */
public final class C98762f implements C11385n {

    /* renamed from: d */
    public HashMap<Long, C98760e.C98761a> f289564d = new HashMap<>();

    /* renamed from: e */
    public HashMap<Long, C101648g> f289565e = new HashMap<>();

    /* renamed from: il2.f$a */
    public static final class C98763a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98762f f289566d;

        /* renamed from: e */
        public final /* synthetic */ long f289567e;

        /* renamed from: f */
        public final /* synthetic */ C101647f f289568f;

        public C98763a(C98762f fVar, long j, C101647f fVar2) {
            this.f289566d = fVar;
            this.f289567e = j;
            this.f289568f = fVar2;
        }

        public final void run() {
            String str;
            C98760e.C98761a remove = this.f289566d.f289564d.remove(Long.valueOf(this.f289567e));
            if (remove != null) {
                C101647f fVar = this.f289568f;
                C101645e eVar = remove.f289562a;
                if (eVar == null || (str = eVar.f297535d) == null) {
                    str = "";
                }
                fVar.f297553g = str;
            }
            C101648g remove2 = this.f289566d.f289565e.remove(Long.valueOf(this.f289567e));
            if (remove2 != null) {
                remove2.mo33401c(this.f289567e, this.f289568f);
            }
        }
    }

    public C98762f() {
        C86709a0.m107524d().mo123455a(1100, this);
        C86709a0.m107524d().mo123455a(5079, this);
        C86709a0.m107524d().mo123455a(5131, this);
    }

    /* renamed from: a */
    public final void mo138143a(long j) {
        C98760e b;
        Log.m105924i("MicroMsg.AiScanImageSceneUploader", "cancel");
        this.f289565e.remove(Long.valueOf(j));
        C98760e.C98761a remove = this.f289564d.remove(Long.valueOf(j));
        if (remove != null) {
            Log.m105926v("MicroMsg.AiScanImageSceneUploader", "alvinluo cancelUploadImage");
            C86709a0.m107524d().mo123457c(remove.f289563b);
            C101645e eVar = remove.f289562a;
            if (eVar != null && (b = mo138144b(eVar)) != null) {
                b.mo138138x0(j);
            }
        }
    }

    /* renamed from: b */
    public final C98760e mo138144b(C101645e eVar) {
        int i = eVar.f297533b;
        if (i == 1 || i == 3) {
            return C98755b.f289551a;
        }
        if (i == 2) {
            return C98758d.f289559a;
        }
        Log.m105921e("MicroMsg.AiScanImageSceneUploader", "alvinluo uploadImage unknown opImageType: %d", Integer.valueOf(i));
        return null;
    }

    /* renamed from: c */
    public final void mo138145c(long j, int i, int i2, int i3, String str) {
        Log.m105921e("MicroMsg.AiScanImageSceneUploader", "onScanFailed session: %d, opImageType: %s, errType: %s, errCode: %d, errMsg: %s", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        C101647f fVar = new C101647f();
        fVar.f297547a = i;
        fVar.f297548b = j;
        fVar.f297549c = false;
        fVar.f297550d = i2;
        fVar.f297551e = i3;
        fVar.f297552f = str;
        ((C119157j) C119157j.f356862d).mo183895z(new C98763a(this, j, fVar));
    }

    /* renamed from: d */
    public final void mo138146d(long j, C101645e eVar, C101648g gVar) {
        C87412m.m108594g(gVar, "callback");
        if (eVar != null) {
            C98760e.C98761a aVar = new C98760e.C98761a();
            aVar.f289562a = eVar;
            this.f289565e.put(Long.valueOf(j), gVar);
            this.f289564d.put(Long.valueOf(j), aVar);
            C98760e b = mo138144b(eVar);
            if (b != null) {
                Log.m105925i("MicroMsg.AiScanImageSceneUploader", "alvinluo uploadImage session: %s, opImageType: %s, useCdnOpt: %s, useCache: %s, uploader: %s", Long.valueOf(j), Integer.valueOf(eVar.f297533b), Boolean.valueOf(eVar.f297542k), Boolean.TRUE, b);
                b.mo138139y0(aVar, gVar);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: te3.tg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: te3.ee} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: te3.ge} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r17, int r18, java.lang.String r19, ob0.C117747y r20) {
        /*
            r16 = this;
            r0 = r20
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            int r3 = r20.getType()
            r4 = 1100(0x44c, float:1.541E-42)
            if (r3 != r4) goto L_0x0010
            r3 = 1
            goto L_0x0011
        L_0x0010:
            r3 = 0
        L_0x0011:
            java.lang.String r4 = ""
            r5 = 0
            r6 = 0
            r8 = 2
            java.lang.String r9 = "MicroMsg.AiScanImageSceneUploader"
            if (r3 == 0) goto L_0x00ae
            if (r17 != 0) goto L_0x0097
            if (r18 != 0) goto L_0x0097
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.model.NetSceneAiScanImageScene"
            gy3.C87412m.m108592e(r0, r3)
            com.tencent.mm.plugin.scanner.model.k r0 = (com.tencent.p014mm.plugin.scanner.model.C57319k) r0
            ob0.c r3 = r0.f164196e
            ob0.c$d r3 = r3.f127056b
            pe3.a r3 = r3.f127083a
            if (r3 == 0) goto L_0x0032
            r5 = r3
            te3.ge r5 = (te3.C49547ge) r5
        L_0x0032:
            if (r5 == 0) goto L_0x003e
            long r6 = r5.f133990h
            long r10 = r0.f164197f
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 == 0) goto L_0x008f
            java.lang.Object[] r0 = new java.lang.Object[r8]
            long r6 = r5.f133990h
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r0[r1] = r3
            int r3 = r5.f133992j
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r3 = "uploadImageForSearch onSceneEnd sessionId: %s, seqNum: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r3, r0)
            sk2.f r15 = new sk2.f
            r15.<init>()
            r15.f297547a = r2
            long r12 = r5.f133990h
            r15.f297548b = r12
            r15.f297549c = r2
            r15.f297550d = r1
            r15.f297551e = r1
            r15.f297552f = r4
            java.lang.String r0 = r5.f133987e
            r15.f297554h = r0
            int r0 = r5.f133986d
            r15.f297555i = r0
            java.lang.String r0 = r5.f133993n
            if (r0 != 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r4 = r0
        L_0x007a:
            r15.f297556j = r4
            il2.h r14 = il2.C98765h.f289570d
            zt3.t r0 = zt3.C119157j.f356862d
            il2.i r1 = new il2.i
            r10 = r1
            r11 = r16
            r10.<init>(r11, r12, r14, r15)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183895z(r1)
            goto L_0x01e6
        L_0x008f:
            java.lang.String r0 = "uploadImageForSearch onSceneEnd success sessionId not the same"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
            goto L_0x01e6
        L_0x0097:
            com.tencent.mm.plugin.scanner.model.k r0 = (com.tencent.p014mm.plugin.scanner.model.C57319k) r0
            if (r0 == 0) goto L_0x009f
            long r0 = r0.f164197f
            r1 = r0
            goto L_0x00a0
        L_0x009f:
            r1 = r6
        L_0x00a0:
            r3 = 1
            r0 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.mo138145c(r1, r3, r4, r5, r6)
            goto L_0x01e6
        L_0x00ae:
            if (r0 == 0) goto L_0x00ba
            int r3 = r20.getType()
            r10 = 5079(0x13d7, float:7.117E-42)
            if (r3 != r10) goto L_0x00ba
            r3 = 1
            goto L_0x00bb
        L_0x00ba:
            r3 = 0
        L_0x00bb:
            if (r3 == 0) goto L_0x0148
            if (r17 != 0) goto L_0x0131
            if (r18 != 0) goto L_0x0131
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.model.NetSceneAiScanImageScenePreview"
            gy3.C87412m.m108592e(r0, r3)
            com.tencent.mm.plugin.scanner.model.l r0 = (com.tencent.p014mm.plugin.scanner.model.C42905l) r0
            ob0.c r3 = r0.f116173e
            ob0.c$d r3 = r3.f127056b
            pe3.a r3 = r3.f127083a
            if (r3 == 0) goto L_0x00d4
            r5 = r3
            te3.ee r5 = (te3.C49270ee) r5
        L_0x00d4:
            if (r5 == 0) goto L_0x00e0
            long r6 = r5.f132881e
            long r10 = r0.f116174f
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x00e0
            r0 = 1
            goto L_0x00e1
        L_0x00e0:
            r0 = 0
        L_0x00e1:
            if (r0 == 0) goto L_0x0129
            java.lang.Object[] r0 = new java.lang.Object[r8]
            long r6 = r5.f132881e
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r0[r1] = r3
            int r3 = r5.f132882f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r3 = "previewImage onSceneEnd sessionId: %s, seqNum: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r3, r0)
            sk2.f r15 = new sk2.f
            r15.<init>()
            r15.f297547a = r8
            long r12 = r5.f132881e
            r15.f297548b = r12
            r15.f297549c = r2
            r15.f297550d = r1
            r15.f297551e = r1
            r15.f297552f = r4
            java.lang.String r0 = r5.f132880d
            if (r0 != 0) goto L_0x0113
            goto L_0x0114
        L_0x0113:
            r4 = r0
        L_0x0114:
            r15.f297557k = r4
            il2.h r14 = il2.C98765h.f289570d
            zt3.t r0 = zt3.C119157j.f356862d
            il2.i r1 = new il2.i
            r10 = r1
            r11 = r16
            r10.<init>(r11, r12, r14, r15)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183895z(r1)
            goto L_0x01e6
        L_0x0129:
            java.lang.String r0 = "previewImage onSceneEnd success sessionId not the same"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
            goto L_0x01e6
        L_0x0131:
            com.tencent.mm.plugin.scanner.model.l r0 = (com.tencent.p014mm.plugin.scanner.model.C42905l) r0
            if (r0 == 0) goto L_0x0139
            long r0 = r0.f116174f
            r1 = r0
            goto L_0x013a
        L_0x0139:
            r1 = r6
        L_0x013a:
            r3 = 2
            r0 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.mo138145c(r1, r3, r4, r5, r6)
            goto L_0x01e6
        L_0x0148:
            if (r0 == 0) goto L_0x0154
            int r3 = r20.getType()
            r10 = 5131(0x140b, float:7.19E-42)
            if (r3 != r10) goto L_0x0154
            r3 = 1
            goto L_0x0155
        L_0x0154:
            r3 = 0
        L_0x0155:
            if (r3 == 0) goto L_0x01e6
            if (r17 != 0) goto L_0x01d1
            if (r18 != 0) goto L_0x01d1
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.ocr.NetSceneBizImageOCR"
            gy3.C87412m.m108592e(r0, r3)
            kl2.k r0 = (kl2.C46732k) r0
            ob0.c r3 = r0.f125811e
            ob0.c$d r3 = r3.f127056b
            pe3.a r3 = r3.f127083a
            if (r3 == 0) goto L_0x016e
            r5 = r3
            te3.tg r5 = (te3.C51391tg) r5
        L_0x016e:
            if (r5 == 0) goto L_0x017a
            long r6 = r5.f142204g
            long r10 = r0.f125812f
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x017a
            r0 = 1
            goto L_0x017b
        L_0x017a:
            r0 = 0
        L_0x017b:
            if (r0 == 0) goto L_0x01ca
            java.lang.Object[] r0 = new java.lang.Object[r8]
            long r6 = r5.f142204g
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r0[r1] = r3
            int r3 = r5.f142205h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r3 = "uploadImageForOcr onSceneEnd sessionId: %s, seqNum: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r3, r0)
            sk2.f r15 = new sk2.f
            r15.<init>()
            r0 = 3
            r15.f297547a = r0
            long r12 = r5.f142204g
            r15.f297548b = r12
            r15.f297549c = r2
            r15.f297550d = r1
            r15.f297551e = r1
            r15.f297552f = r4
            java.lang.String r0 = r5.f142202e
            r15.f297554h = r0
            java.lang.String r0 = r5.f142201d
            r15.f297558l = r0
            boolean r0 = r5.f142203f
            r15.f297559m = r0
            il2.g r14 = new il2.g
            r14.<init>(r15)
            zt3.t r0 = zt3.C119157j.f356862d
            il2.i r1 = new il2.i
            r10 = r1
            r11 = r16
            r10.<init>(r11, r12, r14, r15)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183895z(r1)
            goto L_0x01e6
        L_0x01ca:
            java.lang.String r0 = "uploadImageForOcr onSceneEnd success sessionId not the same"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
            goto L_0x01e6
        L_0x01d1:
            kl2.k r0 = (kl2.C46732k) r0
            if (r0 == 0) goto L_0x01d9
            long r0 = r0.f125812f
            r1 = r0
            goto L_0x01da
        L_0x01d9:
            r1 = r6
        L_0x01da:
            r3 = 3
            r0 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.mo138145c(r1, r3, r4, r5, r6)
        L_0x01e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il2.C98762f.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
