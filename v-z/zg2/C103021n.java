package zg2;

import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordMediaReportInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.ArrayList;
import o40.C61926c;
import rx3.C13598b0;
import u60.C65220d;
import u60.C65222f;
import u60.C65231j;
import u60.C65234n;
import v60.C102152a;
import v60.C102156f;
import v60.C102157g;
import zt3.C119157j;

/* renamed from: zg2.n */
public final class C103021n {

    /* renamed from: a */
    public static final C103021n f303991a = new C103021n();

    /* renamed from: b */
    public static boolean f303992b;

    /* renamed from: c */
    public static boolean f303993c;

    /* renamed from: d */
    public static ArrayList<C103024b> f303994d = new ArrayList<>();

    /* renamed from: e */
    public static C65222f<C103022a> f303995e = new C65222f<>(new C102156f(new C102152a(5, Integer.MAX_VALUE), new C102157g(1, 5), 1, "videoMixTask"));

    /* renamed from: f */
    public static C32224a<C13598b0> f303996f;

    /* renamed from: zg2.n$a */
    public static final class C103022a extends C65220d {

        /* renamed from: f */
        public C103014f f303997f;

        /* renamed from: g */
        public CaptureDataManager.CaptureVideoNormalModel f303998g;

        /* renamed from: h */
        public int f303999h;

        /* renamed from: zg2.n$a$a */
        public static final class C103023a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C103022a f304000d;

            public C103023a(C103022a aVar) {
                this.f304000d = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:20:0x00a5  */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x010c  */
            /* JADX WARNING: Removed duplicated region for block: B:57:0x0229  */
            /* JADX WARNING: Removed duplicated region for block: B:63:0x0245  */
            /* JADX WARNING: Removed duplicated region for block: B:9:0x0056  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r25 = this;
                    r1 = r25
                    u60.n r2 = u60.C65234n.Fail
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r3 = "call background mix "
                    r0.append(r3)
                    zg2.n$a r3 = r1.f304000d
                    zg2.f r3 = r3.f303997f
                    java.lang.String r3 = r3.field_taskId
                    r0.append(r3)
                    java.lang.String r3 = ", mixRetryTime:"
                    r0.append(r3)
                    zg2.n$a r3 = r1.f304000d
                    zg2.f r3 = r3.f303997f
                    int r3 = r3.field_mixRetryTime
                    r0.append(r3)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r3 = "MicroMsg.mix_background.VideoMixHandler"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                    te3.e70 r0 = new te3.e70
                    r0.<init>()
                    zg2.n$a r4 = r1.f304000d
                    zg2.f r4 = r4.f303997f
                    byte[] r4 = r4.field_baseItemData
                    r5 = 1
                    r6 = 0
                    java.lang.String r7 = ""
                    java.lang.String r8 = "safeParser"
                    if (r4 != 0) goto L_0x0043
                    goto L_0x0050
                L_0x0043:
                    r0.parseFrom(r4)     // Catch:{ Exception -> 0x0047 }
                    goto L_0x0051
                L_0x0047:
                    r0 = move-exception
                    r4 = r0
                    java.lang.Object[] r0 = new java.lang.Object[r5]
                    r0[r6] = r4
                    com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r8, r7, r0)
                L_0x0050:
                    r0 = 0
                L_0x0051:
                    java.lang.String r4 = "MicroMsg.StoryRemuxDetailIDKeyStat"
                    r10 = 3
                    if (r0 == 0) goto L_0x009d
                    zg2.n$a r11 = r1.f304000d
                    zg2.f r11 = r11.f303997f
                    int r11 = r11.field_fromScene
                    if (r11 != r10) goto L_0x0060
                    r11 = 1
                    goto L_0x0061
                L_0x0060:
                    r11 = 0
                L_0x0061:
                    if (r11 == 0) goto L_0x009d
                    boolean r11 = r0.f298176y
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder
                    r12.<init>()
                    java.lang.String r13 = "markRemuxStart, isCaptureVideo:"
                    r12.append(r13)
                    r12.append(r11)
                    java.lang.String r12 = r12.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
                    com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r14 = 1005(0x3ed, double:4.965E-321)
                    r16 = 1
                    r18 = 1
                    r13 = r12
                    r13.mo175913w(r14, r16, r18)
                    if (r11 == 0) goto L_0x0093
                    r14 = 1005(0x3ed, double:4.965E-321)
                    r16 = 2
                    r18 = 1
                    r13 = r12
                    r13.mo175913w(r14, r16, r18)
                    goto L_0x009d
                L_0x0093:
                    r14 = 1005(0x3ed, double:4.965E-321)
                    r16 = 3
                    r18 = 1
                    r13 = r12
                    r13.mo175913w(r14, r16, r18)
                L_0x009d:
                    zg2.n$a r11 = r1.f304000d
                    zg2.f r11 = r11.f303997f
                    int r12 = r11.field_mixRetryTime
                    if (r12 >= r10) goto L_0x0245
                    zg2.m r12 = zg2.C103020m.f303985a
                    java.lang.String r11 = r11.field_taskId
                    java.lang.String r13 = "editorData.field_taskId"
                    gy3.C87412m.m108593f(r11, r13)
                    zg2.g r14 = zg2.C103020m.f303986b
                    zg2.f r15 = r14.mo62033jo(r11)
                    if (r15 == 0) goto L_0x00be
                    int r9 = r15.field_mixRetryTime
                    int r9 = r9 + r5
                    r15.field_mixRetryTime = r9
                    r14.mo62032Lo(r11, r15)
                L_0x00be:
                    if (r0 == 0) goto L_0x00d1
                    zg2.n$a r0 = r1.f304000d
                    zg2.f r9 = r0.f303997f
                    java.lang.String r9 = r9.field_taskId
                    gy3.C87412m.m108593f(r9, r13)
                    zg2.f r9 = r12.mo142735c(r9)
                    if (r9 == 0) goto L_0x00d1
                    r0.f303997f = r9
                L_0x00d1:
                    te3.gb0 r0 = new te3.gb0
                    r0.<init>()
                    zg2.n$a r9 = r1.f304000d
                    zg2.f r9 = r9.f303997f
                    byte[] r9 = r9.field_extraConfig
                    if (r9 != 0) goto L_0x00df
                    goto L_0x00ec
                L_0x00df:
                    r0.parseFrom(r9)     // Catch:{ Exception -> 0x00e3 }
                    goto L_0x00ed
                L_0x00e3:
                    r0 = move-exception
                    r9 = r0
                    java.lang.Object[] r0 = new java.lang.Object[r5]
                    r0[r6] = r9
                    com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r8, r7, r0)
                L_0x00ec:
                    r0 = 0
                L_0x00ed:
                    zg2.n$a r7 = r1.f304000d
                    r7.getClass()
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    java.lang.String r9 = "runMix from VideoMixHandler extraConfig:"
                    r8.append(r9)
                    r8.append(r0)
                    java.lang.String r8 = r8.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
                    java.lang.String r8 = "markMixErrorData"
                    if (r0 == 0) goto L_0x0229
                    java.util.HashMap<java.lang.Integer, ch2.c> r9 = ch2.C28563e.f78423a
                    zg2.f r9 = r7.f303997f
                    java.lang.String r11 = "editorData"
                    gy3.C87412m.m108594g(r9, r11)
                    java.util.HashMap<java.lang.Integer, ch2.c> r11 = ch2.C28563e.f78423a
                    int r12 = r0.f298302r
                    java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                    java.lang.Object r11 = r11.get(r12)
                    ch2.c r11 = (ch2.C92419c) r11
                    if (r11 != 0) goto L_0x0133
                    java.lang.Class<ch2.b> r11 = ch2.C28562b.class
                    di3.d r11 = di3.C86312j.m106911c(r11)
                    ch2.b r11 = (ch2.C28562b) r11
                    int r12 = r0.f298302r
                    ch2.c r11 = r11.mo56056Pp(r12)
                L_0x0133:
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder
                    r12.<init>()
                    java.lang.String r14 = "getMixer extraConfig.mixerType:"
                    r12.append(r14)
                    int r14 = r0.f298302r
                    r12.append(r14)
                    java.lang.String r14 = " mixInstanceManager:"
                    r12.append(r14)
                    r12.append(r11)
                    java.lang.String r12 = r12.toString()
                    java.lang.String r14 = "MicroMsg.VideoMixFactory"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r12)
                    if (r11 == 0) goto L_0x015a
                    ch2.d r9 = r11.mo126421a(r9, r0)
                    goto L_0x015b
                L_0x015a:
                    r9 = 0
                L_0x015b:
                    com.tencent.mm.hardcoder.WXHardCoderJNI r14 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                    com.tencent.mm.hardcoder.WXHardCoderJNI r11 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                    boolean r15 = r11.getHcEncodeVideoEnable()
                    com.tencent.mm.hardcoder.WXHardCoderJNI r11 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                    int r16 = r11.getHcEncodeVideoDelay()
                    com.tencent.mm.hardcoder.WXHardCoderJNI r11 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                    int r17 = r11.getHcEncodeVideoCPU()
                    com.tencent.mm.hardcoder.WXHardCoderJNI r11 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                    int r18 = r11.getHcEncodeVideoIO()
                    com.tencent.mm.hardcoder.WXHardCoderJNI r11 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                    boolean r11 = r11.getHcEncodeVideoThr()
                    if (r11 == 0) goto L_0x0190
                    int r11 = android.os.Process.myTid()
                    r19 = r11
                    goto L_0x0192
                L_0x0190:
                    r19 = 0
                L_0x0192:
                    r20 = 35000(0x88b8, float:4.9045E-41)
                    r21 = 603(0x25b, float:8.45E-43)
                    com.tencent.mm.hardcoder.WXHardCoderJNI r11 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                    long r22 = r11.getHcEncodeVideoAction()
                    java.lang.String r24 = "MicroMsg.mix_background.VideoMixHandler"
                    int r11 = r14.startPerformance(r15, r16, r17, r18, r19, r20, r21, r22, r24)
                    r7.f303999h = r11
                    java.lang.Object[] r12 = new java.lang.Object[r5]
                    java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                    r12[r6] = r11
                    java.lang.String r11 = "hardcoder summerPerformance startPerformance: %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r11, r12)
                    zg2.C103021n.f303992b = r5
                    zg2.a r3 = zg2.C53784a.f150949a
                    zg2.f r3 = r7.f303997f
                    int r11 = r3.field_fromScene
                    java.lang.String r3 = r3.field_taskId
                    gy3.C87412m.m108593f(r3, r13)
                    zg2.f r12 = r7.f303997f
                    int r12 = r12.field_mixRetryTime
                    java.lang.StringBuilder r13 = new java.lang.StringBuilder
                    r13.<init>()
                    java.lang.String r14 = "notifyRun, taskId:"
                    r13.append(r14)
                    r13.append(r3)
                    java.lang.String r14 = ", runNum:"
                    r13.append(r14)
                    r13.append(r12)
                    java.lang.String r13 = r13.toString()
                    java.lang.String r14 = "MicroMsg.mix_background.BgMixManager"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r13)
                    zt3.t r13 = zt3.C119157j.f356862d
                    zg2.b r14 = new zg2.b
                    r14.<init>(r11, r3, r12)
                    zt3.j r13 = (zt3.C119157j) r13
                    java.lang.String r3 = "BgMixManager_notifyRun"
                    r13.mo183876g(r14, r3)
                    long r21 = java.lang.System.currentTimeMillis()
                    long r19 = java.lang.System.currentTimeMillis()
                    if (r9 == 0) goto L_0x020a
                    zg2.o r3 = new zg2.o
                    r17 = r3
                    r18 = r7
                    r23 = r0
                    r17.<init>(r18, r19, r21, r23)
                    r9.mo126422a(r3)
                L_0x020a:
                    if (r9 != 0) goto L_0x02a3
                    zg2.f r0 = r7.f303997f
                    int r0 = r0.field_fromScene
                    if (r0 != r10) goto L_0x0213
                    goto L_0x0214
                L_0x0213:
                    r5 = 0
                L_0x0214:
                    if (r5 == 0) goto L_0x0224
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
                    com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r10 = 1005(0x3ed, double:4.965E-321)
                    r12 = 8
                    r14 = 1
                    r9.mo175913w(r10, r12, r14)
                L_0x0224:
                    r7.mo11853b(r2)
                    goto L_0x02a3
                L_0x0229:
                    zg2.f r0 = r7.f303997f
                    int r0 = r0.field_fromScene
                    if (r0 != r10) goto L_0x0230
                    goto L_0x0231
                L_0x0230:
                    r5 = 0
                L_0x0231:
                    if (r5 == 0) goto L_0x0241
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
                    com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r10 = 1005(0x3ed, double:4.965E-321)
                    r12 = 8
                    r14 = 1
                    r9.mo175913w(r10, r12, r14)
                L_0x0241:
                    r7.mo11853b(r2)
                    goto L_0x02a3
                L_0x0245:
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r8 = "retry mix taskId:"
                    r7.append(r8)
                    zg2.n$a r8 = r1.f304000d
                    zg2.f r8 = r8.f303997f
                    java.lang.String r8 = r8.field_taskId
                    r7.append(r8)
                    java.lang.String r8 = " third and still failed"
                    r7.append(r8)
                    java.lang.String r7 = r7.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
                    if (r0 == 0) goto L_0x029e
                    zg2.n$a r3 = r1.f304000d
                    zg2.f r3 = r3.f303997f
                    int r3 = r3.field_fromScene
                    if (r3 != r10) goto L_0x0270
                    goto L_0x0271
                L_0x0270:
                    r5 = 0
                L_0x0271:
                    if (r5 == 0) goto L_0x029e
                    boolean r0 = r0.f298176y
                    java.lang.String r3 = "markFail"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                    com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r6 = 1005(0x3ed, double:4.965E-321)
                    r8 = 21
                    r10 = 1
                    r5 = r3
                    r5.mo175913w(r6, r8, r10)
                    if (r0 == 0) goto L_0x0294
                    r6 = 1005(0x3ed, double:4.965E-321)
                    r8 = 22
                    r10 = 1
                    r5 = r3
                    r5.mo175913w(r6, r8, r10)
                    goto L_0x029e
                L_0x0294:
                    r6 = 1005(0x3ed, double:4.965E-321)
                    r8 = 23
                    r10 = 1
                    r5 = r3
                    r5.mo175913w(r6, r8, r10)
                L_0x029e:
                    zg2.n$a r0 = r1.f304000d
                    r0.mo11853b(r2)
                L_0x02a3:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: zg2.C103021n.C103022a.C103023a.run():void");
            }
        }

        public C103022a(C103014f fVar, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel) {
            C87412m.m108594g(fVar, "editorData");
            this.f303997f = fVar;
            this.f303998g = captureVideoNormalModel;
        }

        /* renamed from: a */
        public void mo11852a() {
            if (C103021n.f303993c) {
                Log.m105924i("MicroMsg.mix_background.VideoMixHandler", "running forground task");
                mo11853b(C65234n.Wait);
                return;
            }
            ((C119157j) C119157j.f356862d).mo183876g(new C103023a(this), "VideoMixHandler");
        }

        /* renamed from: d */
        public String mo11854d() {
            return "mixTask_" + this.f303997f.field_taskId;
        }
    }

    /* renamed from: zg2.n$b */
    public static final class C103024b implements Runnable {

        /* renamed from: d */
        public String f304001d;

        /* renamed from: e */
        public CaptureDataManager.CaptureVideoNormalModel f304002e;

        public C103024b(String str, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel) {
            C87412m.m108594g(str, "taskId");
            this.f304001d = str;
            this.f304002e = captureVideoNormalModel;
        }

        public void run() {
            C103021n.f303994d.remove(this);
            C103021n.f303991a.mo142742c(C103020m.f303985a.mo142735c(this.f304001d), this.f304002e);
        }
    }

    /* renamed from: zg2.n$c */
    public static final class C103025c implements C65231j<C103022a> {
        /* renamed from: a */
        public void mo539a(C65220d dVar, C65234n nVar) {
            C103022a aVar = (C103022a) dVar;
            C87412m.m108594g(aVar, "task");
            C87412m.m108594g(nVar, "status");
            Log.m105924i("MicroMsg.mix_background.VideoMixHandler", "loader finish! taskId:" + aVar.f303997f.field_taskId + ", status " + nVar);
            C103021n.f303992b = false;
            C32224a<C13598b0> aVar2 = C103021n.f303996f;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            C103021n.f303996f = null;
            int ordinal = nVar.ordinal();
            if (ordinal == 2) {
                C103021n nVar2 = C103021n.f303991a;
                C103014f fVar = aVar.f303997f;
                int i = fVar.field_fromScene;
                String str = fVar.field_taskId;
                C87412m.m108593f(str, "task.editorData.field_taskId");
                C103021n.m136250a(nVar2, i, str, true, aVar.f303998g);
                nVar2.mo142741b();
            } else if (ordinal == 3) {
                C103021n nVar3 = C103021n.f303991a;
                C103014f fVar2 = aVar.f303997f;
                int i2 = fVar2.field_fromScene;
                String str2 = fVar2.field_taskId;
                C87412m.m108593f(str2, "task.editorData.field_taskId");
                C103021n.m136250a(nVar3, i2, str2, false, aVar.f303998g);
                nVar3.mo142741b();
            } else if (ordinal == 4) {
                C53784a aVar3 = C53784a.f150949a;
                C103014f fVar3 = aVar.f303997f;
                int i3 = fVar3.field_fromScene;
                String str3 = fVar3.field_taskId;
                C87412m.m108593f(str3, "task.editorData.field_taskId");
                Log.m105924i("MicroMsg.mix_background.BgMixManager", "notifyWait, taskId:" + str3);
                ((C119157j) C119157j.f356862d).mo183876g(new C53788c(i3, str3), "BgMixManager_notifyWait");
                C8479f0 f0Var = new C8479f0();
                String str4 = aVar.f303997f.field_taskId;
                C87412m.m108593f(str4, "task.editorData.field_taskId");
                T bVar = new C103024b(str4, aVar.f303998g);
                f0Var.f27484d = bVar;
                C103021n.f303994d.add(bVar);
                C61926c.m72666K(30000, new C16193p(f0Var));
            }
        }
    }

    /* renamed from: a */
    public static final void m136250a(C103021n nVar, int i, String str, boolean z, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel) {
        nVar.getClass();
        Log.m105924i("MicroMsg.mix_background.VideoMixHandler", "taskId:" + str + ", success:" + z + ", model:" + captureVideoNormalModel);
        if (z) {
            C103020m mVar = C103020m.f303985a;
            C87412m.m108594g(str, "taskId");
            C39357g gVar = C103020m.f303986b;
            C103014f jo = gVar.mo62033jo(str);
            if (jo != null) {
                jo.field_status = 2;
                gVar.mo62032Lo(str, jo);
            }
        } else {
            C103020m mVar2 = C103020m.f303985a;
            C87412m.m108594g(str, "taskId");
            C39357g gVar2 = C103020m.f303986b;
            C103014f jo4 = gVar2.mo62033jo(str);
            if (jo4 != null) {
                jo4.field_status = 3;
                gVar2.mo62032Lo(str, jo4);
            }
        }
        if (captureVideoNormalModel == null) {
            C53784a aVar = C53784a.f150949a;
            Boolean bool = Boolean.FALSE;
            aVar.mo74351a(i, str, z, new CaptureDataManager.CaptureVideoNormalModel(bool, "", "", 0L, bool, new RecordMediaReportInfo()));
            return;
        }
        C53784a.f150949a.mo74351a(i, str, z, captureVideoNormalModel);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0070, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0071, code lost:
        cy3.C58003b.m67160a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0074, code lost:
        throw r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo142741b() {
        /*
            r9 = this;
            zg2.m r0 = zg2.C103020m.f303985a
            long r0 = java.lang.System.currentTimeMillis()
            zg2.g r2 = zg2.C103020m.f303986b
            r2.getClass()
            r3 = 8
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = zg2.C39357g.f105781f
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "status"
            r7 = 1
            r4[r7] = r5
            r5 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r4[r5] = r8
            r5 = 3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r4[r5] = r8
            r5 = 4
            java.lang.String r8 = "timeStamp"
            r4[r5] = r8
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 5
            r4[r1] = r0
            r0 = 6
            java.lang.String r1 = "expiredTime"
            r4[r0] = r1
            r0 = 7
            r4[r0] = r8
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r3)
            java.lang.String r1 = "select * from %s where %s not in (%d, %d) and %s > %d - %s order by %s asc limit 1"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.String r1 = "format(format, *args)"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String[] r1 = new java.lang.String[r6]
            android.database.Cursor r0 = r2.rawQuery(r0, r1)
            r1 = 0
            if (r0 == 0) goto L_0x0075
            boolean r2 = r0.moveToFirst()     // Catch:{ all -> 0x006e }
            if (r2 == 0) goto L_0x0068
            zg2.f r2 = new zg2.f     // Catch:{ all -> 0x006e }
            r2.<init>()     // Catch:{ all -> 0x006e }
            r2.convertFrom(r0)     // Catch:{ all -> 0x006e }
            cy3.C58003b.m67160a(r0, r1)
            goto L_0x0076
        L_0x0068:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x006e }
            cy3.C58003b.m67160a(r0, r1)
            goto L_0x0075
        L_0x006e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r2 = move-exception
            cy3.C58003b.m67160a(r0, r1)
            throw r2
        L_0x0075:
            r2 = r1
        L_0x0076:
            if (r2 == 0) goto L_0x007f
            zg2.n r0 = f303991a
            r0.mo142742c(r2, r1)
            r6 = 1
            goto L_0x0087
        L_0x007f:
            java.lang.String r0 = "MicroMsg.mix_background.VideoMixHandler"
            java.lang.String r1 = "mix task is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
        L_0x0087:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zg2.C103021n.mo142741b():boolean");
    }

    /* renamed from: c */
    public final boolean mo142742c(C103014f fVar, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel) {
        if (fVar != null) {
            Log.m105924i("MicroMsg.mix_background.VideoMixHandler", "start background mix, taskId:" + fVar.field_taskId + ", reyTime:" + fVar.field_mixRetryTime);
            f303995e.mo89349c(new C103022a(fVar, captureVideoNormalModel), new C103025c());
        }
        return true;
    }
}
