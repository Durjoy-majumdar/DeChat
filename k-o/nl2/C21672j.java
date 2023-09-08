package nl2;

import com.tencent.p014mm.plugin.scanner.model.C19011d;
import com.tencent.p014mm.plugin.scanner.model.C19027m0;
import com.tencent.p014mm.plugin.scanner.model.ScanProductInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import dl2.C20469e;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import ml2.C10931f;
import nl2.C21681q;
import ql2.C22095a;
import ql2.C22105d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zt3.C119157j;

/* renamed from: nl2.j */
public final class C21672j extends C10931f<C21683r> {

    /* renamed from: g */
    public final C21671i f61334g;

    /* renamed from: h */
    public final C21656b f61335h = new C21656b(new C21673a(this));

    /* renamed from: i */
    public final C13601g f61336i = C36568h.m40985a(C21675b.f61341d);

    /* renamed from: nl2.j$a */
    public static final class C21673a implements C22095a.C22096a {

        /* renamed from: a */
        public final /* synthetic */ C21672j f61337a;

        /* renamed from: nl2.j$a$a */
        public static final class C21674a implements C19027m0 {

            /* renamed from: d */
            public final /* synthetic */ C21683r f61338d;

            /* renamed from: e */
            public final /* synthetic */ C21672j f61339e;

            /* renamed from: f */
            public final /* synthetic */ C32226l<Boolean, C13598b0> f61340f;

            public C21674a(C21683r rVar, C21672j jVar, C32226l<? super Boolean, C13598b0> lVar) {
                this.f61338d = rVar;
                this.f61339e = jVar;
                this.f61340f = lVar;
            }

            public final void run() {
                boolean contains;
                C21683r rVar = this.f61338d;
                C19011d.C19012a aVar = null;
                C21681q a = rVar != null ? rVar.mo33947a() : null;
                ScanProductInfo scanProductInfo = a != null ? a.f61358a : null;
                StringBuilder sb = new StringBuilder();
                sb.append("onAddScanProductResultForFullImage source: ");
                C21683r rVar2 = this.f61338d;
                sb.append(rVar2 != null ? Integer.valueOf(rVar2.f61380a) : null);
                sb.append(", session: ");
                C21683r rVar3 = this.f61338d;
                sb.append(rVar3 != null ? Long.valueOf(rVar3.f61381b) : null);
                sb.append(", trackId: ");
                sb.append(scanProductInfo != null ? Integer.valueOf(scanProductInfo.getId()) : null);
                sb.append(", detectByServer: ");
                sb.append(a != null ? Boolean.valueOf(a.f61359b) : null);
                sb.append(", scanProductInfo: %s");
                String sb4 = sb.toString();
                Object[] objArr = new Object[1];
                boolean z = false;
                objArr[0] = scanProductInfo != null ? Integer.valueOf(scanProductInfo.hashCode()) : null;
                Log.m105925i("MicroMsg.NewAiImageHandler", sb4, objArr);
                if (scanProductInfo != null) {
                    C20469e.C20472c cVar = C20469e.f57530v.f57536d;
                    if (cVar != null) {
                        int i = cVar.f57571l;
                        if (i > 0) {
                            z = true;
                        }
                        if (!z) {
                            cVar.f57572m = cVar.f57569j;
                        }
                        cVar.f57571l = i + 1;
                    }
                    C21672j jVar = this.f61339e;
                    int id = scanProductInfo.getId();
                    C21669g gVar = (C21669g) ((C36570n) jVar.f61336i).getValue();
                    synchronized (gVar.f61325b) {
                        contains = gVar.f61325b.contains(Integer.valueOf(id));
                    }
                    if (!contains) {
                        this.f61339e.mo33940d(scanProductInfo.getId());
                        C21672j jVar2 = this.f61339e;
                        C21683r rVar4 = this.f61338d;
                        boolean c = jVar2.f61334g.mo24284c(rVar4);
                        if (c) {
                            C21681q a2 = rVar4.mo33947a();
                            if (a2 != null) {
                                aVar = a2.f61364g;
                            }
                            C19011d.m20064a(2, aVar);
                        }
                        if (c) {
                            this.f61339e.mo33940d(scanProductInfo.getId());
                            this.f61340f.invoke(Boolean.TRUE);
                        } else {
                            Log.m105928w("MicroMsg.NewAiImageHandler", "onAddScanProductResultForFullImage addScanProduct failed");
                            this.f61340f.invoke(Boolean.FALSE);
                        }
                        this.f61339e.getClass();
                        return;
                    }
                    this.f61340f.invoke(Boolean.FALSE);
                    return;
                }
                C20469e.C20472c cVar2 = C20469e.f57530v.f57536d;
                if (cVar2 != null) {
                    cVar2.f57570k++;
                }
                this.f61340f.invoke(Boolean.FALSE);
            }
        }

        public C21673a(C21672j jVar) {
            this.f61337a = jVar;
        }

        /* renamed from: a */
        public void mo33919a(C22105d dVar) {
            C87412m.m108594g(dVar, "task");
            if (dVar instanceof C22095a) {
                C22095a aVar = (C22095a) dVar;
                C21681q.C21682a aVar2 = aVar.f62490d.f61326f.f61363f;
                if (aVar2.f61365a > 0) {
                    aVar2.f61374j = System.currentTimeMillis() - aVar.f62490d.f61326f.f61363f.f61365a;
                }
            }
        }

        /* renamed from: b */
        public void mo33920b(C21683r rVar, C32226l<? super Boolean, C13598b0> lVar) {
            C87412m.m108594g(lVar, "addResultCallback");
            C20469e.m22085e(new C21674a(rVar, this.f61337a, lVar));
        }

        /* renamed from: c */
        public void mo33921c(C22105d dVar) {
            C87412m.m108594g(dVar, "task");
            Log.m105925i("MicroMsg.NewAiImageHandler", "getProductTask onTaskFinish %d", Integer.valueOf(dVar.hashCode()));
        }

        /* renamed from: d */
        public void mo33922d(C21680p pVar, int i, long j, int i2, String str) {
            C87412m.m108594g(pVar, "result");
            Log.m105920e("MicroMsg.NewAiImageHandler", "onRetrievalFailed source: " + pVar.f61353a + ", session: " + pVar.f61354b + ", scanImageType: " + pVar.f61355c + ", errCode: " + i2 + ", errMsg: " + str);
            this.f61337a.f61334g.mo24283b(pVar, i2, str);
            if (pVar.f61355c == 1) {
                C19011d.m20064a(15, pVar.f61357e);
            } else {
                C19011d.m20064a(26, pVar.f61357e);
            }
        }

        /* renamed from: e */
        public void mo33923e(C22105d dVar) {
            C87412m.m108594g(dVar, "task");
            if (dVar instanceof C22095a) {
                ((C22095a) dVar).f62490d.f61326f.f61363f.f61365a = System.currentTimeMillis();
            }
        }

        /* renamed from: f */
        public void mo33924f(C21670h hVar) {
            C87412m.m108594g(hVar, "request");
            Log.m105918d("MicroMsg.NewAiImageHandler", "onUploadStart");
            hVar.f61326f.f61363f.f61366b = System.currentTimeMillis();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
            r0 = (nl2.C109753o) sx3.C110818d0.m150916N(r0);
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo33925g(nl2.C21680p r8) {
            /*
                r7 = this;
                java.lang.String r0 = "result"
                gy3.C87412m.m108594g(r8, r0)
                nl2.j r0 = r7.f61337a
                r0.getClass()
                java.util.ArrayList<nl2.o> r0 = r8.f61356d
                r1 = 0
                if (r0 == 0) goto L_0x001b
                java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
                nl2.o r0 = (nl2.C109753o) r0
                if (r0 == 0) goto L_0x001b
                nl2.q r0 = r0.f328497d
                goto L_0x001c
            L_0x001b:
                r0 = r1
            L_0x001c:
                if (r0 == 0) goto L_0x002b
                nl2.q$a r2 = r0.f61363f
                long r3 = java.lang.System.currentTimeMillis()
                nl2.q$a r5 = r0.f61363f
                long r5 = r5.f61366b
                long r3 = r3 - r5
                r2.f61375k = r3
            L_0x002b:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "onUploadSuccess source: "
                r2.append(r3)
                int r3 = r8.f61353a
                r2.append(r3)
                java.lang.String r3 = ", session: "
                r2.append(r3)
                long r3 = r8.f61354b
                r2.append(r3)
                java.lang.String r3 = ", scanImageType: "
                r2.append(r3)
                int r3 = r8.f61355c
                r2.append(r3)
                java.lang.String r3 = ", uploadDuration: "
                r2.append(r3)
                if (r0 == 0) goto L_0x0060
                nl2.q$a r0 = r0.f61363f
                if (r0 == 0) goto L_0x0060
                long r0 = r0.f61375k
                java.lang.Long r1 = java.lang.Long.valueOf(r0)
            L_0x0060:
                r2.append(r1)
                java.lang.String r0 = r2.toString()
                java.lang.String r1 = "MicroMsg.NewAiImageHandler"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                nl2.j r0 = r7.f61337a
                nl2.i r0 = r0.f61334g
                r0.mo24282a(r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nl2.C21672j.C21673a.mo33925g(nl2.p):void");
        }

        /* renamed from: h */
        public void mo33926h(C22105d dVar) {
            C87412m.m108594g(dVar, "task");
            if (dVar instanceof C22095a) {
                C22095a aVar = (C22095a) dVar;
                Log.m105929w("MicroMsg.NewAiImageHandler", "getProductTask onTaskCancel %s", Integer.valueOf(aVar.f62490d.f61327g));
                C21670h hVar = aVar.f62490d;
                if (hVar.f61327g == 1) {
                    C19011d.m20064a(16, hVar.f61326f.f61364g);
                } else {
                    C19011d.m20064a(27, hVar.f61326f.f61364g);
                }
            }
        }

        /* renamed from: i */
        public void mo33927i(C21680p pVar, int i, long j, int i2, int i3, String str) {
            C87412m.m108594g(pVar, "result");
            Log.m105920e("MicroMsg.NewAiImageHandler", "onUploadFailed source: " + pVar.f61353a + ", session: " + pVar.f61354b + ", scanImageType: " + pVar.f61355c + ", errType: " + i2 + ", errCode: " + i3 + ", errMsg: " + str);
            this.f61337a.f61334g.mo24285d(pVar, i3, str);
            C20469e.C20472c cVar = C20469e.f57530v.f57536d;
            boolean z = true;
            if (cVar != null) {
                cVar.f57570k++;
            }
            if (pVar.f61355c == 1) {
                C19011d.m20064a(13, pVar.f61357e);
            } else if (i == 3) {
                C19011d.m20064a(23, pVar.f61357e);
            } else if (i == 4) {
                if (i3 != 1003) {
                    ArrayList<C109753o> arrayList = pVar.f61356d;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        z = false;
                    }
                    if (!z) {
                        return;
                    }
                }
                C19011d.m20064a(43, pVar.f61357e);
            }
        }

        /* renamed from: j */
        public void mo33928j(C21668f fVar) {
            C87412m.m108594g(fVar, "request");
            Log.m105918d("MicroMsg.NewAiImageHandler", "onRetrievalStart");
            fVar.f61322f.f61363f.f61367c = System.currentTimeMillis();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0047, code lost:
            r2 = (nl2.C109753o) sx3.C110818d0.m150916N(r2);
         */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0158  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0160  */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo33929k(nl2.C21680p r26) {
            /*
                r25 = this;
                r0 = r25
                r1 = r26
                java.lang.String r2 = "result"
                gy3.C87412m.m108594g(r1, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "onRetrievalSuccess source: "
                r2.append(r3)
                int r3 = r1.f61353a
                r2.append(r3)
                java.lang.String r3 = ", session: "
                r2.append(r3)
                long r3 = r1.f61354b
                r2.append(r3)
                java.lang.String r3 = ", scanImageType: "
                r2.append(r3)
                int r3 = r1.f61355c
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MicroMsg.NewAiImageHandler"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                nl2.j r2 = r0.f61337a
                nl2.i r2 = r2.f61334g
                r2.mo24286e(r1)
                nl2.j r2 = r0.f61337a
                r2.getClass()
                java.util.ArrayList<nl2.o> r2 = r1.f61356d
                if (r2 == 0) goto L_0x0052
                java.lang.Object r2 = sx3.C110818d0.m150916N(r2)
                nl2.o r2 = (nl2.C109753o) r2
                if (r2 == 0) goto L_0x0052
                nl2.q r2 = r2.f328497d
                goto L_0x0053
            L_0x0052:
                r2 = 0
            L_0x0053:
                r3 = 1
                if (r2 == 0) goto L_0x0151
                nl2.q$a r4 = r2.f61363f
                long r5 = r1.f61354b
                java.lang.String r5 = java.lang.String.valueOf(r5)
                r4.getClass()
                java.lang.String r6 = "<set-?>"
                gy3.C87412m.m108594g(r5, r6)
                r4.f61368d = r5
                nl2.q$a r4 = r2.f61363f
                long r5 = java.lang.System.currentTimeMillis()
                nl2.q$a r7 = r2.f61363f
                long r8 = r7.f61367c
                long r5 = r5 - r8
                r4.f61376l = r5
                int r4 = r1.f61355c
                r5 = 3
                r6 = 2
                if (r4 != r3) goto L_0x007e
                r7.f61369e = r3
                goto L_0x0087
            L_0x007e:
                if (r4 != r6) goto L_0x0083
                r7.f61369e = r6
                goto L_0x0087
            L_0x0083:
                if (r4 != r5) goto L_0x0087
                r7.f61369e = r5
            L_0x0087:
                int r4 = vl2.C37764q.m41536a()
                r7.f61379o = r4
                nl2.q$a r4 = r2.f61363f
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = ss3.C36788a.f97694i
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = ss3.C36788a.f97694i
                r8 = 0
                if (r7 == 0) goto L_0x009e
                java.lang.String r9 = "scan_code_last_frame_cost"
                int r7 = r7.getInt(r9, r8)
                goto L_0x009f
            L_0x009e:
                r7 = 0
            L_0x009f:
                r4.f61378n = r7
                nl2.q$a r2 = r2.f61363f
                if (r2 != 0) goto L_0x00a8
                r0 = r1
                goto L_0x0153
            L_0x00a8:
                java.lang.String r4 = r2.f61368d
                int r7 = r2.f61369e
                long r9 = r2.f61370f
                long r11 = r2.f61371g
                long r13 = r2.f61372h
                int r15 = r2.f61373i
                long r5 = r2.f61374j
                r19 = r4
                long r3 = r2.f61375k
                r21 = r9
                long r8 = r2.f61376l
                int r10 = r2.f61377m
                int r0 = r2.f61378n
                int r2 = r2.f61379o
                com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r23 = r1
                r1 = 16
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r20 = 0
                java.lang.Integer r24 = java.lang.Integer.valueOf(r20)
                r1[r20] = r24
                r18 = 1
                r1[r18] = r19
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r17 = 2
                r1[r17] = r7
                java.lang.Long r7 = java.lang.Long.valueOf(r21)
                r16 = 3
                r1[r16] = r7
                java.lang.Long r7 = java.lang.Long.valueOf(r11)
                r11 = 4
                r1[r11] = r7
                java.lang.Long r7 = java.lang.Long.valueOf(r13)
                r11 = 5
                r1[r11] = r7
                java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
                r11 = 6
                r1[r11] = r7
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r6 = 7
                r1[r6] = r5
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r4 = 8
                r1[r4] = r3
                java.lang.Long r3 = java.lang.Long.valueOf(r8)
                r4 = 9
                r1[r4] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
                r4 = 10
                r1[r4] = r3
                r3 = 11
                java.lang.String r4 = ""
                r1[r3] = r4
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3 = 12
                r1[r3] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                r2 = 13
                r1[r2] = r0
                r0 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2 = 14
                r1[r2] = r0
                boolean r0 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53474t
                if (r0 == 0) goto L_0x0141
                r6 = 1
                goto L_0x0142
            L_0x0141:
                r6 = 2
            L_0x0142:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
                r2 = 15
                r1[r2] = r0
                r0 = 24129(0x5e41, float:3.3812E-41)
                r2 = r23
                r2.mo160131h(r0, r1)
            L_0x0151:
                r0 = r26
            L_0x0153:
                int r1 = r0.f61355c
                r2 = 1
                if (r1 != r2) goto L_0x0160
                r1 = 19
                com.tencent.mm.plugin.scanner.model.d$a r0 = r0.f61357e
                com.tencent.p014mm.plugin.scanner.model.C19011d.m20064a(r1, r0)
                goto L_0x0167
            L_0x0160:
                r1 = 34
                com.tencent.mm.plugin.scanner.model.d$a r0 = r0.f61357e
                com.tencent.p014mm.plugin.scanner.model.C19011d.m20064a(r1, r0)
            L_0x0167:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nl2.C21672j.C21673a.mo33929k(nl2.p):void");
        }
    }

    /* renamed from: nl2.j$b */
    public static final class C21675b extends C87413o implements C32224a<C21669g> {

        /* renamed from: d */
        public static final C21675b f61341d = new C21675b();

        public C21675b() {
            super(0);
        }

        public Object invoke() {
            return new C21669g();
        }
    }

    public C21672j(C21671i iVar) {
        C87412m.m108594g(iVar, "handleCallback");
        this.f61334g = iVar;
    }

    /* renamed from: d */
    public final void mo33940d(int i) {
        Log.m105925i("MicroMsg.NewAiImageHandler", "addTrackId: %s", Integer.valueOf(i));
        C21669g gVar = (C21669g) ((C36570n) this.f61336i).getValue();
        synchronized (gVar.f61325b) {
            gVar.f61325b.add(Integer.valueOf(i));
        }
    }

    public void destroy() {
        Log.m105924i("MicroMsg.NewAiImageHandler", "destroy NewAiImageHandler");
        C21656b bVar = this.f61335h;
        bVar.getClass();
        Log.m105924i("MicroMsg.AiScanImageGetProductManager", "getProduct cancel");
        bVar.f61293g = true;
        ((C119157j) C119157j.f356862d).mo183876g(new C21665c(bVar), "AiScanImageGetProductManager");
        C21669g gVar = (C21669g) ((C36570n) this.f61336i).getValue();
        synchronized (gVar.f61325b) {
            gVar.f61325b.clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
        synchronized (Integer.valueOf(gVar.f61324a)) {
            gVar.f61324a = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x01c9  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rx3.C13604l<byte[], java.lang.Integer> mo33941e(byte[] r24, int r25, int r26, android.graphics.Point r27) {
        /*
            r23 = this;
            r10 = r24
            r11 = r25
            r12 = r27
            r14 = -1
            r9 = 1
            r0 = r26
            if (r0 != r9) goto L_0x0025
            if (r11 != r9) goto L_0x0021
            r1 = 17
            r3 = 70
            r4 = 0
            r5 = 16
            r6 = 0
            r0 = r24
            r2 = r27
            byte[] r15 = vl2.C102223z.m134694a(r0, r1, r2, r3, r4, r5, r6)
            r13 = 1
            goto L_0x01f1
        L_0x0021:
            r13 = -1
            r15 = 0
            goto L_0x01f1
        L_0x0025:
            r8 = 4
            java.lang.String r7 = ".wxam"
            java.lang.String r6 = "temp_"
            java.lang.String r5 = "MicroMsg.ScanYuvUtils"
            r3 = 2
            if (r11 == r9) goto L_0x00fa
            if (r11 == r3) goto L_0x0036
            r7 = 3
            r15 = 0
            goto L_0x01c7
        L_0x0036:
            vl2.z r0 = vl2.C102223z.f301005a
            java.lang.String r0 = "rgba"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "imageSize"
            gy3.C87412m.m108594g(r12, r0)
            vl2.z r0 = vl2.C102223z.f301005a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            long r3 = java.lang.System.currentTimeMillis()
            r1.append(r3)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = r0.mo141781b(r1)
            long r17 = java.lang.System.currentTimeMillis()
            int r6 = r12.x
            int r4 = r12.y
            java.lang.Class<com.tencent.mm.feature.emoji.api.IWXGFJNIService> r0 = com.tencent.p014mm.feature.emoji.api.IWXGFJNIService.class
            di3.d r1 = di3.C86312j.m106911c(r0)
            com.tencent.mm.feature.emoji.api.IWXGFJNIService r1 = (com.tencent.p014mm.feature.emoji.api.IWXGFJNIService) r1
            int r1 = r1.getErrorCode()
            if (r1 != 0) goto L_0x00ad
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.feature.emoji.api.IWXGFJNIService r0 = (com.tencent.p014mm.feature.emoji.api.IWXGFJNIService) r0
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106448i(r7, r9)
            int r3 = r10.length
            r19 = 7
            r20 = 37
            r2 = r24
            r16 = 2
            r21 = r4
            r15 = 0
            r4 = r19
            r22 = r5
            r5 = r20
            r19 = r6
            r26 = r7
            r7 = r21
            r8 = r19
            r13 = 1
            r9 = r21
            int r1 = r0.pic2WxamWithWH(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r26)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x00b5
            r1 = -10
            goto L_0x00b5
        L_0x00ad:
            r22 = r5
            r26 = r7
            r13 = 1
            r15 = 0
            r16 = 2
        L_0x00b5:
            long r2 = java.lang.System.currentTimeMillis()
            if (r1 != 0) goto L_0x00c2
            r0 = r26
            byte[] r4 = com.tencent.p014mm.vfs.C86013q1.m106433O(r0, r15, r14)
            goto L_0x00c5
        L_0x00c2:
            r0 = r26
            r4 = 0
        L_0x00c5:
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            long r2 = r2 - r17
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r5[r15] = r2
            int r2 = r10.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5[r13] = r2
            if (r4 == 0) goto L_0x00df
            int r2 = r4.length
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            goto L_0x00e0
        L_0x00df:
            r15 = 0
        L_0x00e0:
            r5[r16] = r15
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            r5[r2] = r1
            r8 = 4
            r5[r8] = r12
            java.lang.String r1 = "convertRGBAToWxam pic2wxam cost: %s, rgbaSize: %s, wxamSize: %s, ret: %s, imageSize: %s"
            r9 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r1, r5)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            r15 = r4
            r7 = 3
            goto L_0x01c6
        L_0x00fa:
            r9 = r5
            r13 = 1
            r15 = 0
            r16 = 2
            r1 = 17
            vl2.z r0 = vl2.C102223z.f301005a
            java.lang.String r0 = "yuv"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "yuvSize"
            gy3.C87412m.m108594g(r12, r0)
            long r17 = java.lang.System.currentTimeMillis()
            r3 = 70
            r4 = 0
            r5 = 16
            r20 = 0
            r0 = r24
            r2 = r27
            r8 = r6
            r6 = r20
            byte[] r0 = vl2.C102223z.m134694a(r0, r1, r2, r3, r4, r5, r6)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r17
            java.lang.Object[] r3 = new java.lang.Object[r13]
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3[r15] = r1
            java.lang.String r1 = "convertYUVToWxam yuv2jpg cost: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r1, r3)
            if (r0 == 0) goto L_0x01c4
            vl2.z r1 = vl2.C102223z.f301005a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            long r3 = java.lang.System.currentTimeMillis()
            r2.append(r3)
            java.lang.String r3 = ".jpg"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r1.mo141781b(r2)
            int r3 = r0.length
            com.tencent.p014mm.vfs.C86013q1.m106438T(r2, r0, r15, r3)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            long r13 = java.lang.System.currentTimeMillis()
            r5.append(r13)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = r1.mo141781b(r5)
            java.lang.Class<z51.i> r5 = z51.C102975i.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            z51.i r5 = (z51.C102975i) r5
            int r5 = r5.mo141699lT(r2, r1)
            long r7 = java.lang.System.currentTimeMillis()
            if (r5 != 0) goto L_0x0192
            r6 = -1
            byte[] r6 = com.tencent.p014mm.vfs.C86013q1.m106433O(r1, r15, r6)
            goto L_0x0193
        L_0x0192:
            r6 = 0
        L_0x0193:
            r13 = 4
            java.lang.Object[] r13 = new java.lang.Object[r13]
            long r7 = r7 - r3
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r13[r15] = r3
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 1
            r13[r3] = r0
            if (r6 == 0) goto L_0x01ad
            int r0 = r6.length
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            goto L_0x01ae
        L_0x01ad:
            r15 = 0
        L_0x01ae:
            r13[r16] = r15
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r7 = 3
            r13[r7] = r0
            java.lang.String r0 = "convertYUVToWxam pic2Wxam cost: %s, jpgSize: %s, wxamSize: %s, ret: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r13)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r2)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r1)
            r15 = r6
            goto L_0x01c6
        L_0x01c4:
            r7 = 3
            r15 = 0
        L_0x01c6:
            r14 = 2
        L_0x01c7:
            if (r15 != 0) goto L_0x01f0
            java.lang.String r0 = "MicroMsg.NewAiImageHandler"
            java.lang.String r1 = "convertYUVToWxam failed use jpeg"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            com.tencent.mm.plugin.scanner.model.e1 r0 = com.tencent.p014mm.plugin.scanner.model.C19016e1.f53424a
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 1259(0x4eb, float:1.764E-42)
            r2 = 90
            r0.mo175911u(r1, r2)
            r0 = 1
            if (r11 != r0) goto L_0x01f0
            r1 = 17
            r3 = 70
            r4 = 0
            r5 = 16
            r6 = 0
            r0 = r24
            r2 = r27
            byte[] r15 = vl2.C102223z.m134694a(r0, r1, r2, r3, r4, r5, r6)
            r13 = 3
            goto L_0x01f1
        L_0x01f0:
            r13 = r14
        L_0x01f1:
            rx3.l r0 = new rx3.l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0.<init>(r15, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nl2.C21672j.mo33941e(byte[], int, int, android.graphics.Point):rx3.l");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo360a(long r24, nl2.C21683r r26) {
        /*
            r23 = this;
            r1 = r23
            r0 = r26
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r2 = r0.f61385f
            if (r2 == 0) goto L_0x001d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r2 == 0) goto L_0x0014
            nl2.k r2 = nl2.C11218k.f33075d
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
        L_0x0014:
            nl2.l r2 = new nl2.l
            r2.<init>(r0, r1)
            dl2.C20469e.m22085e(r2)
            return
        L_0x001d:
            nl2.q r4 = r26.mo33947a()
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            com.tencent.mm.plugin.scanner.model.d$a r2 = r4.f61364g
            r10 = 0
            if (r2 != 0) goto L_0x0030
            com.tencent.mm.plugin.scanner.model.d$a r2 = new com.tencent.mm.plugin.scanner.model.d$a
            r2.<init>(r10)
            r4.f61364g = r2
        L_0x0030:
            int r2 = r0.f61380a
            r3 = 3
            r5 = 4
            r11 = 1
            if (r2 != r3) goto L_0x0272
            com.tencent.mm.plugin.scanner.model.ScanProductInfo r2 = r4.f61358a
            java.lang.Object[] r6 = new java.lang.Object[r5]
            boolean r7 = r2.getShouldShow()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r6[r10] = r7
            int r7 = r0.f61380a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r11] = r7
            long r7 = r0.f61381b
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 2
            r6[r8] = r7
            int r7 = r2.getId()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r3] = r7
            java.lang.String r7 = "MicroMsg.NewAiImageHandler"
            java.lang.String r9 = "uploadNormalImage shouldShow: %s, source: %s, session: %s, tracId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r6)
            boolean r6 = r2.getShouldShow()
            if (r6 == 0) goto L_0x02a4
            int r6 = r2.getId()
            rx3.g r9 = r1.f61336i
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            nl2.g r9 = (nl2.C21669g) r9
            java.util.HashSet<java.lang.Integer> r12 = r9.f61325b
            monitor-enter(r12)
            java.util.HashSet<java.lang.Integer> r9 = r9.f61325b     // Catch:{ all -> 0x026f }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x026f }
            boolean r6 = r9.contains(r6)     // Catch:{ all -> 0x026f }
            monitor-exit(r12)
            if (r6 != 0) goto L_0x02a4
            int r6 = cl2.C28609a.f78508h
            long r12 = java.lang.System.currentTimeMillis()
            if (r6 == r11) goto L_0x0141
            if (r6 == r8) goto L_0x00b1
            int r5 = r2.getId()
            float r6 = r2.getX1()
            float r14 = r2.getY1()
            float r15 = r2.getX2()
            float r9 = r2.getY2()
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r5 = com.tencent.p014mm.plugin.scanner.model.C19021i0.m20099e(r5, r6, r14, r15, r9)
            r6 = 1
            goto L_0x0159
        L_0x00b1:
            int r9 = r2.getId()
            float r14 = r2.getX1()
            float r15 = r2.getY1()
            float r5 = r2.getX2()
            float r3 = r2.getY2()
            boolean r16 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53461g
            if (r16 == 0) goto L_0x013f
            long r20 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r16 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53460f
            r16.resetStatus()
            android.graphics.RectF r3 = com.tencent.p014mm.plugin.scanner.model.C19021i0.m20100f(r14, r15, r5, r3)
            java.lang.Object[] r5 = new java.lang.Object[r11]
            r5[r10] = r3
            java.lang.String r15 = "MicroMsg.ScanFastFocusEngineManager"
            java.lang.String r14 = "getCropRGBAByTrackId expandCropSize: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r15, r14, r5)
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r14 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53460f
            float r5 = r3.left
            float r8 = r3.top
            float r11 = r3.right
            float r3 = r3.bottom
            r22 = r15
            r15 = r9
            r16 = r5
            r17 = r8
            r18 = r11
            r19 = r3
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r5 = r14.getCropRGBAByTrackId(r15, r16, r17, r18, r19)
            long r14 = java.lang.System.currentTimeMillis()
            r3 = 6
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r3[r10] = r8
            byte[] r8 = r5.bestImageData
            r9 = 1
            r3[r9] = r8
            if (r8 == 0) goto L_0x0114
            int r8 = r8.length
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0115
        L_0x0114:
            r8 = 0
        L_0x0115:
            r9 = 2
            r3[r9] = r8
            long r14 = r14 - r20
            java.lang.Long r8 = java.lang.Long.valueOf(r14)
            r9 = 3
            r3[r9] = r8
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r8 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53460f
            int r8 = r8.width
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 4
            r3[r9] = r8
            r8 = 5
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r9 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53460f
            int r9 = r9.height
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r3[r8] = r9
            java.lang.String r8 = "getCropRGBAByTrackId trackId: %s, result image: %s, yuv size: %d, cost: %d, width: %d, height: %d"
            r9 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r8, r3)
            goto L_0x0159
        L_0x013f:
            r5 = 0
            goto L_0x0159
        L_0x0141:
            int r3 = r2.getId()
            float r5 = r2.getX1()
            float r8 = r2.getY1()
            float r9 = r2.getX2()
            float r11 = r2.getY2()
            com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative r5 = com.tencent.p014mm.plugin.scanner.model.C19021i0.m20099e(r3, r5, r8, r9, r11)
        L_0x0159:
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r12
            if (r5 == 0) goto L_0x0163
            byte[] r3 = r5.bestImageData
            goto L_0x0164
        L_0x0163:
            r3 = 0
        L_0x0164:
            if (r3 == 0) goto L_0x02a4
            int r3 = cl2.C28609a.f78509i
            long r11 = java.lang.System.currentTimeMillis()
            byte[] r13 = r5.bestImageData
            java.lang.String r14 = "result.bestImageData"
            gy3.C87412m.m108593f(r13, r14)
            android.graphics.Point r14 = new android.graphics.Point
            int r15 = r5.width
            int r10 = r5.height
            r14.<init>(r15, r10)
            rx3.l r3 = r1.mo33941e(r13, r6, r3, r14)
            A r6 = r3.f38555d
            byte[] r6 = (byte[]) r6
            B r3 = r3.f38556e
            java.lang.Number r3 = (java.lang.Number) r3
            int r10 = r3.intValue()
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r11
            if (r6 == 0) goto L_0x0256
            nl2.q$a r3 = r4.f61363f
            r3.f61371g = r8
            r3.f61372h = r13
            int r8 = r6.length
            r3.f61373i = r8
            r8 = 1
            if (r10 == r8) goto L_0x01aa
            r8 = 2
            if (r10 == r8) goto L_0x01a8
            r8 = 3
            if (r10 == r8) goto L_0x01ab
            r8 = -1
            goto L_0x01ab
        L_0x01a8:
            r8 = 1
            goto L_0x01ab
        L_0x01aa:
            r8 = 2
        L_0x01ab:
            r3.f61377m = r8
            java.util.ArrayList<nl2.q> r3 = r0.f61383d
            java.util.Iterator r3 = r3.iterator()
        L_0x01b3:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x01ee
            java.lang.Object r8 = r3.next()
            nl2.q r8 = (nl2.C21681q) r8
            com.tencent.mm.plugin.scanner.model.ScanProductInfo r9 = r8.f61358a
            int r9 = r9.getId()
            int r11 = r2.getId()
            if (r9 != r11) goto L_0x01b3
            r9 = 2
            java.lang.Object[] r11 = new java.lang.Object[r9]
            boolean r9 = r2.getShouldShow()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r12 = 0
            r11[r12] = r9
            int r9 = r2.getId()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12 = 1
            r11[r12] = r9
            java.lang.String r9 = "handleResult shouldShow: %s, trackId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r7, r9, r11)
            r8.f61360c = r6
            r8.f61361d = r10
            goto L_0x01b3
        L_0x01ee:
            com.tencent.mm.plugin.scanner.model.d$a r3 = r4.f61364g
            if (r3 == 0) goto L_0x01fc
            nl2.q$a r8 = r4.f61363f
            int r9 = r8.f61377m
            r3.f53411a = r9
            int r8 = r8.f61373i
            r3.f53412b = r8
        L_0x01fc:
            nl2.i r3 = r1.f61334g
            boolean r3 = r3.mo24284c(r0)
            if (r3 == 0) goto L_0x0213
            nl2.q r8 = r26.mo33947a()
            if (r8 == 0) goto L_0x020e
            com.tencent.mm.plugin.scanner.model.d$a r9 = r8.f61364g
            r8 = 2
            goto L_0x0210
        L_0x020e:
            r8 = 2
            r9 = 0
        L_0x0210:
            com.tencent.p014mm.plugin.scanner.model.C19011d.m20064a(r8, r9)
        L_0x0213:
            if (r3 == 0) goto L_0x024f
            r3 = 10
            com.tencent.mm.plugin.scanner.model.d$a r7 = r4.f61364g
            com.tencent.p014mm.plugin.scanner.model.C19011d.m20064a(r3, r7)
            int r2 = r2.getId()
            r1.mo33940d(r2)
            nl2.h r2 = new nl2.h
            r7 = 1
            int r8 = r5.width
            int r9 = r5.height
            r3 = r2
            r5 = r7
            r7 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.f61380a
            r2.f61284c = r3
            long r3 = r0.f61381b
            r2.f61283b = r3
            r0 = 0
            r2.f61285d = r0
            nl2.b r0 = r1.f61335h
            r0.getClass()
            nl2.e r3 = new nl2.e
            r3.<init>(r2, r0)
            zt3.t r0 = zt3.C119157j.f356862d
            zt3.j r0 = (zt3.C119157j) r0
            java.lang.String r2 = "AiScanImageGetProductManager"
            r0.mo183876g(r3, r2)
            goto L_0x02a4
        L_0x024f:
            java.lang.String r0 = "uploadNormalImage addScanProduct failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            goto L_0x02a4
        L_0x0256:
            java.lang.String r3 = "handleResult get jpg failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r3)
            r3 = 11
            com.tencent.mm.plugin.scanner.model.d$a r4 = r4.f61364g
            com.tencent.p014mm.plugin.scanner.model.C19011d.m20064a(r3, r4)
            zt3.t r3 = zt3.C119157j.f356862d
            nl2.m r4 = new nl2.m
            r4.<init>(r1, r0, r2)
            zt3.j r3 = (zt3.C119157j) r3
            r3.mo183895z(r4)
            goto L_0x02a4
        L_0x026f:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x0272:
            r3 = 4
            if (r2 != r3) goto L_0x02a4
            byte[] r6 = r4.f61362e
            if (r6 == 0) goto L_0x02a4
            nl2.h r2 = new nl2.h
            r5 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.f61380a
            r2.f61284c = r3
            long r3 = r0.f61381b
            r2.f61283b = r3
            r0 = 1
            r2.f61285d = r0
            r0 = 0
            r2.f61332l = r0
            nl2.b r0 = r1.f61335h
            r0.getClass()
            nl2.e r3 = new nl2.e
            r3.<init>(r2, r0)
            zt3.t r0 = zt3.C119157j.f356862d
            zt3.j r0 = (zt3.C119157j) r0
            java.lang.String r2 = "AiScanImageGetProductManager"
            r0.mo183876g(r3, r2)
        L_0x02a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nl2.C21672j.mo360a(long, nl2.r):void");
    }
}
