package com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedPostProgressEvent;
import com.tencent.p014mm.autogen.events.FinderDraftModifyEvent;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.vlog.model.C57463v;
import com.tencent.p014mm.plugin.vlog.model.C96553q;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import dp1.C58386m;
import fy3.C32226l;
import gy3.C59741c0;
import gy3.C8477a0;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import up1.C37521f;
import up1.C65418l;
import wp1.C66166c;
import wq1.C66177f;
import xq1.C66408e;

/* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStage */
public final class FinderDraftMediaProcessStage extends C66177f {

    /* renamed from: h */
    public final C65418l f161471h;

    /* renamed from: i */
    public final String f161472i = "LogPost.FinderDraftMediaProcessStage";

    /* renamed from: j */
    public final FinderItem f161473j;

    /* renamed from: n */
    public C57463v f161474n;

    /* renamed from: o */
    public boolean f161475o;

    /* renamed from: p */
    public final IListener<FinderDraftModifyEvent> f161476p;

    /* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStage$a */
    public static final class C56475a extends C87413o implements C32226l<Float, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59741c0 f161477d;

        /* renamed from: e */
        public final /* synthetic */ FinderDraftMediaProcessStage f161478e;

        /* renamed from: f */
        public final /* synthetic */ int f161479f;

        /* renamed from: g */
        public final /* synthetic */ int f161480g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56475a(C59741c0 c0Var, FinderDraftMediaProcessStage finderDraftMediaProcessStage, int i, int i2) {
            super(1);
            this.f161477d = c0Var;
            this.f161478e = finderDraftMediaProcessStage;
            this.f161479f = i;
            this.f161480g = i2;
        }

        public Object invoke(Object obj) {
            float floatValue = ((Number) obj).floatValue();
            if (floatValue - this.f161477d.f170634d > 0.1f) {
                this.f161478e.mo79333j((((float) this.f161479f) + floatValue) / ((float) this.f161480g));
                this.f161477d.f170634d = floatValue;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStage$b */
    public static final class C56476b extends C87413o implements C32226l<C96553q, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderDraftMediaProcessStage f161481d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f161482e;

        /* renamed from: f */
        public final /* synthetic */ FinderMediaReportObject f161483f;

        /* renamed from: g */
        public final /* synthetic */ long f161484g;

        /* renamed from: h */
        public final /* synthetic */ String f161485h;

        /* renamed from: i */
        public final /* synthetic */ boolean f161486i;

        /* renamed from: j */
        public final /* synthetic */ C8478d0 f161487j;

        /* renamed from: n */
        public final /* synthetic */ C8478d0 f161488n;

        /* renamed from: o */
        public final /* synthetic */ VideoTransPara f161489o;

        /* renamed from: p */
        public final /* synthetic */ Object f161490p;

        /* renamed from: q */
        public final /* synthetic */ C8477a0 f161491q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56476b(FinderDraftMediaProcessStage finderDraftMediaProcessStage, C8478d0 d0Var, FinderMediaReportObject finderMediaReportObject, long j, String str, boolean z, C8478d0 d0Var2, C8478d0 d0Var3, VideoTransPara videoTransPara, Object obj, C8477a0 a0Var) {
            super(1);
            this.f161481d = finderDraftMediaProcessStage;
            this.f161482e = d0Var;
            this.f161483f = finderMediaReportObject;
            this.f161484g = j;
            this.f161485h = str;
            this.f161486i = z;
            this.f161487j = d0Var2;
            this.f161488n = d0Var3;
            this.f161489o = videoTransPara;
            this.f161490p = obj;
            this.f161491q = a0Var;
        }

        public Object invoke(Object obj) {
            C96553q qVar = (C96553q) obj;
            C87412m.m108594g(qVar, "result");
            FinderDraftMediaProcessStage finderDraftMediaProcessStage = this.f161481d;
            finderDraftMediaProcessStage.f161474n = null;
            String str = finderDraftMediaProcessStage.f161472i;
            Log.m105924i(str, "buildFromFilePath: success " + qVar.f282582a);
            C8478d0 d0Var = this.f161482e;
            int i = -1;
            if (!qVar.f282582a) {
                String str2 = this.f161481d.f161472i;
                Log.m105924i(str2, "remuxer failed longvideo localId:" + this.f161481d.f161471h.field_localId);
                C58386m.C58387a aVar = C58386m.C58387a.f167285a;
                aVar.mo83221a(true);
                aVar.mo83221a(true);
                this.f161483f.remuxTime = (int) Util.ticksToNow(this.f161484g);
                this.f161483f.remuxRetCode = -1;
            } else {
                this.f161483f.remuxTime = (int) Util.ticksToNow(this.f161484g);
                i = 0;
                this.f161483f.remuxRetCode = 0;
                long ticksToNow = Util.ticksToNow(this.f161484g);
                C115669n nVar = C115669n.INSTANCE;
                C115669n nVar2 = nVar;
                long j = ticksToNow;
                nVar2.mo175913w(1718, 1, j);
                nVar2.mo175913w(1719, 1, j);
                long l = C86013q1.m106451l(this.f161485h);
                String str3 = this.f161481d.f161472i;
                Log.m105924i(str3, "remuxer succ longvideo, size:" + l + ", cost: " + Util.ticksToNow(this.f161484g) + ", path:" + this.f161485h + " localId:" + this.f161481d.f161471h.field_localId);
                if (!this.f161486i) {
                    long currentTicks = Util.currentTicks();
                    i = FinderMediaProcessStage.f161539p.mo41037a(this.f161485h, this.f161487j.f27483d, this.f161488n.f27483d, this.f161489o, this.f161481d.f161471h.field_localId, !this.f161486i);
                    C37521f fVar = C37521f.f99374d;
                    if (l > fVar.mo61164R() && fVar.mo61181g() != 1) {
                        this.f161483f.zipTime = (int) Util.ticksToNow(currentTicks);
                        if (i == 0) {
                            this.f161483f.zipRetCode = 1;
                        } else {
                            this.f161483f.zipRetCode = 2;
                        }
                    }
                } else if (l > C37521f.f99374d.mo61148B()) {
                    Log.m105924i(this.f161481d.f161472i, "remux longvideo, size out of range");
                    nVar.mo175913w(1719, 101, 1);
                    FinderDraftMediaProcessStage finderDraftMediaProcessStage2 = this.f161481d;
                    FinderFeedReportObject finderFeedReportObject = finderDraftMediaProcessStage2.f161473j.field_reportObject;
                    if (finderFeedReportObject != null) {
                        finderFeedReportObject.longVideoSizeInvalid = 1;
                    }
                    C66166c.f190172a.mo90231b(finderDraftMediaProcessStage2.f161471h);
                    i = -4;
                }
            }
            d0Var.f27483d = i;
            Object obj2 = this.f161490p;
            C8477a0 a0Var = this.f161491q;
            synchronized (obj2) {
                a0Var.f27482d = true;
                obj2.notifyAll();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderDraftMediaProcessStage(C65418l lVar) {
        super("draft_" + lVar.field_localId);
        C87412m.m108594g(lVar, "draftItem");
        this.f161471h = lVar;
        this.f161473j = lVar.mo89514l2();
        this.f161476p = new FinderDraftMediaProcessStage$draftModifyListener$1(this, C40008f.f107254d);
    }

    /* renamed from: a */
    public int mo75100a() {
        return 2;
    }

    /* renamed from: d */
    public void mo75102d(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
        boolean isLongVideo = this.f161473j.isLongVideo();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1718, 20, 1);
        if (isLongVideo) {
            if ((1718 == 1718 ? 1719 : 0) > 0) {
                nVar.mo175913w(1718 == 1718 ? 1719 : 0, 20, 1);
            }
        }
    }

    /* renamed from: e */
    public void mo75103e(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
    }

    /* renamed from: f */
    public void mo75104f(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
        boolean isLongVideo = this.f161473j.isLongVideo();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1718, 20, 1);
        if (isLongVideo) {
            if ((1718 == 1718 ? 1719 : 0) > 0) {
                nVar.mo175913w(1718 == 1718 ? 1719 : 0, 20, 1);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:298|299|300|301|302|303) */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0311, code lost:
        if ((r5 == null || r5.length() == 0) != false) goto L_0x0313;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0761, code lost:
        if (r2 == null) goto L_0x076a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0763, code lost:
        r8 = java.lang.Integer.valueOf(r2.f180525a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x076a, code lost:
        r8 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x076c, code lost:
        r3.append(r8);
        r3.append(' ');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0774, code lost:
        if (r2 == null) goto L_0x077d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0776, code lost:
        r8 = java.lang.Integer.valueOf(r2.f180526b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x077d, code lost:
        r8 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x077f, code lost:
        r3.append(r8);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3.toString());
        ((p707tz.C65002h) di3.C86312j.m106911c(r16)).mo89213hQ(r1);
        r0 = new zq1.C66961c(r14.f161471h, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x091a, code lost:
        if (r0 == null) goto L_0x0923;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x091c, code lost:
        r8 = java.lang.Integer.valueOf(r0.f180525a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0923, code lost:
        r8 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0925, code lost:
        r2.append(r8);
        r2.append(' ');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x092d, code lost:
        if (r0 == null) goto L_0x0936;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x092f, code lost:
        r8 = java.lang.Integer.valueOf(r0.f180526b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0936, code lost:
        r8 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0938, code lost:
        r2.append(r8);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2.toString());
        r0 = new zq1.C66961c(r14.f161471h, 2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:301:0x08a5 */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03ba A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x05f8  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x063c  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x094e  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x09a2  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x0972 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xq1.C66408e mo75105g() {
        /*
            r56 = this;
            r14 = r56
            java.lang.String r0 = r14.f161472i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "start localId:"
            r1.append(r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r14.f161473j
            long r2 = r2.getLocalId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderDraftModifyEvent> r0 = r14.f161476p
            r0.alive()
            java.lang.Class<com.tencent.mm.feature.sight.api.ISightJNIService> r0 = com.tencent.p014mm.feature.sight.api.ISightJNIService.class
            java.lang.Class<h81.h> r15 = h81.C32735h.class
            java.lang.Class<tz.h> r16 = p707tz.C65002h.class
            java.lang.Class<rw.m> r17 = p232rw.C63679m.class
            java.lang.Class<tz.f> r18 = p707tz.C65000f.class
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r14.f161473j
            java.lang.String r2 = "mediaProcess"
            r1.trackDraftPost(r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r14.f161473j
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r1 = r1.field_reportObject
            r13 = 2
            if (r1 != 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r1.postStage = r13
        L_0x003f:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r14.f161473j
            java.util.LinkedList r1 = r1.getHalfVideoMediaExtList()
            java.util.Iterator r1 = r1.iterator()
        L_0x004e:
            boolean r2 = r1.hasNext()
            r10 = 1
            if (r2 == 0) goto L_0x006c
            java.lang.Object r2 = r1.next()
            te3.rq2 r2 = (te3.C64689rq2) r2
            te3.zy r3 = r2.f185235B
            if (r3 == 0) goto L_0x0065
            boolean r3 = r3.f186905j
            if (r3 != r10) goto L_0x0065
            r11 = 1
            goto L_0x0066
        L_0x0065:
            r11 = 0
        L_0x0066:
            if (r11 == 0) goto L_0x004e
            r12.add(r2)
            goto L_0x004e
        L_0x006c:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r14.f161473j
            boolean r9 = r1.isLongVideo()
            if (r9 == 0) goto L_0x0077
            r12.clear()
        L_0x0077:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r14.f161473j
            java.util.LinkedList r1 = r1.getMediaList()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x0082:
            boolean r3 = r1.hasNext()
            r8 = 0
            if (r3 == 0) goto L_0x00c0
            java.lang.Object r3 = r1.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L_0x00bc
            te3.rq2 r3 = (te3.C64689rq2) r3
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r14.f161473j
            boolean r5 = r5.isNeedCrop(r2)
            if (r5 == 0) goto L_0x00a7
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r14.f161473j
            te3.rq2 r2 = r5.getCropInfo(r2)
            if (r2 == 0) goto L_0x00ba
            r12.add(r3)
            goto L_0x00ba
        L_0x00a7:
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r14.f161473j
            boolean r5 = r5.isNeedVideoCompositionPlay(r2)
            if (r5 == 0) goto L_0x00ba
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r14.f161473j
            te3.rq2 r2 = r5.getCropInfo(r2)
            if (r2 == 0) goto L_0x00ba
            r12.add(r3)
        L_0x00ba:
            r2 = r4
            goto L_0x0082
        L_0x00bc:
            sx3.C64197v.m75542k()
            throw r8
        L_0x00c0:
            up1.f r1 = up1.C37521f.f99374d
            r1.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99562y
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != r10) goto L_0x00dc
            zq1.c r0 = new zq1.c
            up1.l r1 = r14.f161471h
            r0.<init>(r1, r13)
            goto L_0x0b25
        L_0x00dc:
            int r1 = r12.size()
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r1 > 0) goto L_0x00f7
            java.lang.String r0 = r14.f161472i
            java.lang.String r1 = "nothing need to be processed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r14.mo79333j(r7)
            com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r0 = new com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage
            up1.l r1 = r14.f161471h
            r0.<init>(r1)
            goto L_0x0b25
        L_0x00f7:
            java.lang.String r1 = r14.f161472i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "process media count "
            r2.append(r3)
            int r3 = r12.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r14.f161473j
            boolean r1 = r1.isLongVideo()
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 19
            r5 = 1
            r20 = 1718(0x6b6, double:8.49E-321)
            r22 = 19
            r24 = 1
            r19 = r2
            r19.mo175913w(r20, r22, r24)
            if (r1 == 0) goto L_0x0135
            r20 = 1719(0x6b7, double:8.493E-321)
            r19 = r2
            r22 = r3
            r24 = r5
            r19.mo175913w(r20, r22, r24)
        L_0x0135:
            java.util.Iterator r19 = r12.iterator()
            r6 = 0
        L_0x013a:
            boolean r1 = r19.hasNext()
            if (r1 == 0) goto L_0x0ae0
            java.lang.Object r1 = r19.next()
            int r20 = r6 + 1
            if (r6 < 0) goto L_0x0ada
            r4 = r1
            te3.rq2 r4 = (te3.C64689rq2) r4
            te3.jr2 r1 = r4.f185281u
            if (r1 == 0) goto L_0x0152
            int r1 = r1.f183837n
            goto L_0x0153
        L_0x0152:
            r1 = 0
        L_0x0153:
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            int r3 = up1.C37521f.f99120A
            if (r1 <= r3) goto L_0x0165
            zq1.c r0 = new zq1.c
            up1.l r1 = r14.f161471h
            r0.<init>(r1, r13)
            goto L_0x0b25
        L_0x0165:
            if (r9 == 0) goto L_0x016e
            dq1.c r1 = dq1.C31252c.f83719a
            com.tencent.mm.modelcontrol.VideoTransPara r1 = r1.mo58041a()
            goto L_0x0172
        L_0x016e:
            com.tencent.mm.modelcontrol.VideoTransPara r1 = r2.mo61161O()
        L_0x0172:
            r2 = r1
            java.lang.String r1 = r14.f161472i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "FinderMediaProcessTask index "
            r3.append(r7)
            r3.append(r6)
            java.lang.String r7 = " isLongVideo:"
            r3.append(r7)
            r3.append(r9)
            java.lang.String r7 = " videoParams "
            r3.append(r7)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            te3.jr2 r1 = r4.f185281u
            if (r1 != 0) goto L_0x019e
            goto L_0x01a3
        L_0x019e:
            int r3 = r1.f183837n
            int r3 = r3 + r10
            r1.f183837n = r3
        L_0x01a3:
            if (r9 == 0) goto L_0x01af
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r14.f161473j
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r1 = r1.field_reportObject
            if (r1 != 0) goto L_0x01ac
            goto L_0x01af
        L_0x01ac:
            r3 = 6
            r1.postStage = r3
        L_0x01af:
            wp1.c r1 = wp1.C66166c.f190172a
            up1.l r3 = r14.f161471h
            r1.mo90231b(r3)
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r7 = new com.tencent.mm.protocal.protobuf.FinderMediaReportObject
            r7.<init>()
            int r1 = r4.f185268f
            r7.mediaType = r1
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r1 = new com.tencent.mm.protocal.protobuf.FinderMediaReportInfo
            r1.<init>()
            r7.origin = r1
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r7.multiMediaInfo = r1
            te3.zy r1 = r4.f185235B
            if (r1 == 0) goto L_0x024a
            java.util.LinkedList<te3.hi4> r1 = r1.f186899d
            if (r1 == 0) goto L_0x024a
            java.util.Iterator r1 = r1.iterator()
        L_0x01d9:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0245
            java.lang.Object r3 = r1.next()
            te3.hi4 r3 = (te3.hi4) r3
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r13 = new com.tencent.mm.protocal.protobuf.FinderMediaReportInfo
            r13.<init>()
            java.lang.String r5 = r3.f183504d
            r33 = r9
            long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r5)
            int r5 = (int) r8
            r13.fileSize = r5
            di3.d r5 = di3.C86312j.m106911c(r17)
            rw.m r5 = (p232rw.C63679m) r5
            java.lang.String r3 = r3.f183504d
            java.lang.String r8 = "track.path"
            gy3.C87412m.m108593f(r3, r8)
            rw.m$a r3 = r5.mo88483M1(r3)
            if (r3 == 0) goto L_0x023b
            int r5 = r3.f180525a
            r13.width = r5
            int r5 = r3.f180526b
            r13.height = r5
            int r5 = r3.f180529e
            r13.videoBitrate = r5
            long r8 = r3.f180528d
            int r5 = (int) r8
            r13.videoDuration = r5
            int r5 = r3.f180532h
            r13.audioBitrate = r5
            float r5 = r3.f180527c
            int r5 = (int) r5
            r13.fps = r5
            java.lang.String r5 = r14.f161472i
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "put multiMediaInfo:"
            r8.append(r9)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x023b:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMediaReportInfo> r3 = r7.multiMediaInfo
            r3.add(r13)
            r9 = r33
            r8 = 0
            r13 = 2
            goto L_0x01d9
        L_0x0245:
            r33 = r9
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x024c
        L_0x024a:
            r33 = r9
        L_0x024c:
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r13 = r1.toString()
            java.lang.String r1 = "randomUUID().toString()"
            gy3.C87412m.m108593f(r13, r1)
            di3.d r1 = di3.C86312j.m106911c(r16)
            tz.h r1 = (p707tz.C65002h) r1
            com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct r35 = r1.s30(r13)
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            pl1.r0 r1 = new pl1.r0
            up1.y r23 = up1.C27696y.V99_VIDEO
            java.lang.String r24 = "xV99"
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 56
            r29 = 0
            r21 = r1
            r22 = r4
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
            er1.j5 r3 = er1.C58741j5.f168184a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r14.f161473j
            long r10 = r11.getCreateTime()
            r5.append(r10)
            boolean r10 = r4.f185255T
            if (r10 == 0) goto L_0x0296
            java.lang.String r10 = "_half"
            goto L_0x0298
        L_0x0296:
            java.lang.String r10 = ""
        L_0x0298:
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            java.lang.String r11 = r3.mo83734h(r1, r5)
            di3.d r1 = di3.C86312j.m106911c(r15)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_finder_use_check_no_need_remux
            r5 = 1
            int r1 = r1.mo58779Qe(r3, r5)
            te3.zy r3 = r4.f185235B
            if (r3 == 0) goto L_0x02bf
            java.util.LinkedList<te3.hi4> r3 = r3.f186899d
            if (r3 == 0) goto L_0x02bf
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            te3.hi4 r3 = (te3.hi4) r3
            goto L_0x02c0
        L_0x02bf:
            r3 = 0
        L_0x02c0:
            te3.zy r5 = r4.f185235B
            if (r5 == 0) goto L_0x02d1
            java.util.LinkedList<te3.hi4> r5 = r5.f186899d
            if (r5 == 0) goto L_0x02d1
            int r5 = r5.size()
            r10 = 1
            if (r5 != r10) goto L_0x02d1
            r5 = 1
            goto L_0x02d2
        L_0x02d1:
            r5 = 0
        L_0x02d2:
            if (r5 == 0) goto L_0x032a
            te3.zy r5 = r4.f185235B
            if (r5 == 0) goto L_0x02e5
            te3.yy r5 = r5.f186906n
            if (r5 == 0) goto L_0x02e5
            java.util.LinkedList<te3.ea> r5 = r5.f186611e
            if (r5 == 0) goto L_0x02e5
            int r5 = r5.size()
            goto L_0x02e6
        L_0x02e5:
            r5 = 0
        L_0x02e6:
            if (r5 != 0) goto L_0x032a
            te3.zy r5 = r4.f185235B
            if (r5 == 0) goto L_0x02f2
            boolean r10 = r5.f186909q
            if (r10 != 0) goto L_0x02f2
            r10 = 1
            goto L_0x02f3
        L_0x02f2:
            r10 = 0
        L_0x02f3:
            if (r10 == 0) goto L_0x032a
            if (r5 == 0) goto L_0x02fa
            te3.rr4 r5 = r5.f186908p
            goto L_0x02fb
        L_0x02fa:
            r5 = 0
        L_0x02fb:
            if (r5 != 0) goto L_0x032a
            if (r3 == 0) goto L_0x032a
            te3.tj4 r5 = r3.f183517t
            if (r5 == 0) goto L_0x0313
            java.lang.String r5 = r5.f142248d
            if (r5 == 0) goto L_0x0310
            int r5 = r5.length()
            if (r5 != 0) goto L_0x030e
            goto L_0x0310
        L_0x030e:
            r5 = 0
            goto L_0x0311
        L_0x0310:
            r5 = 1
        L_0x0311:
            if (r5 == 0) goto L_0x032a
        L_0x0313:
            r10 = r6
            long r5 = r3.f183507g
            r23 = r7
            r24 = r8
            long r7 = r3.f183506f
            long r5 = r5 - r7
            long r7 = r3.f183509i
            r26 = r10
            long r9 = r3.f183508h
            long r7 = r7 - r9
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0330
            r5 = 1
            goto L_0x0331
        L_0x032a:
            r26 = r6
            r23 = r7
            r24 = r8
        L_0x0330:
            r5 = 0
        L_0x0331:
            java.lang.String r3 = r14.f161472i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "process: checkNoNeedRemux:"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = ", trackSize: "
            r6.append(r7)
            te3.zy r7 = r4.f185235B
            if (r7 == 0) goto L_0x0356
            java.util.LinkedList<te3.hi4> r7 = r7.f186899d
            if (r7 == 0) goto L_0x0356
            int r7 = r7.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0357
        L_0x0356:
            r7 = 0
        L_0x0357:
            r6.append(r7)
            java.lang.String r7 = ", editSize: "
            r6.append(r7)
            te3.zy r7 = r4.f185235B
            if (r7 == 0) goto L_0x0374
            te3.yy r7 = r7.f186906n
            if (r7 == 0) goto L_0x0374
            java.util.LinkedList<te3.ea> r7 = r7.f186611e
            if (r7 == 0) goto L_0x0374
            int r7 = r7.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0375
        L_0x0374:
            r7 = 0
        L_0x0375:
            r6.append(r7)
            java.lang.String r7 = ", videoIsNoEffect:"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            di3.d r3 = di3.C86312j.m106911c(r15)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_audio_quality_analysis_switch
            r7 = 0
            int r3 = r3.mo58779Qe(r6, r7)
            r6 = 1
            if (r3 != r6) goto L_0x0399
            r10 = 1
            goto L_0x039a
        L_0x0399:
            r10 = 0
        L_0x039a:
            int r3 = r2.f267173n
            float r3 = (float) r3
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r9 = r3 / r6
            int r3 = r2.f267174o
            float r8 = (float) r3
            int r7 = r2.f267175p
            te3.zy r3 = r4.f185235B
            if (r3 == 0) goto L_0x03b1
            boolean r6 = r3.f186902g
            r29 = r6
            r28 = r7
            goto L_0x03b5
        L_0x03b1:
            r28 = r7
            r29 = 1
        L_0x03b5:
            r48 = 0
            r6 = 1
            if (r1 != r6) goto L_0x062b
            if (r5 == 0) goto L_0x062b
            if (r3 == 0) goto L_0x03cb
            java.util.LinkedList<te3.hi4> r1 = r3.f186899d
            if (r1 == 0) goto L_0x03cb
            r3 = 0
            java.lang.Object r1 = r1.get(r3)
            te3.hi4 r1 = (te3.hi4) r1
            if (r1 != 0) goto L_0x03d0
        L_0x03cb:
            te3.hi4 r1 = new te3.hi4
            r1.<init>()
        L_0x03d0:
            java.lang.String r3 = r1.f183504d
            java.lang.String r7 = "track.path"
            gy3.C87412m.m108593f(r3, r7)
            di3.d r7 = di3.C86312j.m106911c(r17)
            rw.m r7 = (p232rw.C63679m) r7
            rw.m$a r3 = r7.mo88483M1(r3)
            if (r3 == 0) goto L_0x0488
            r36 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r7 = r3.f180530f
            r6 = 90
            r49 = r8
            r8 = 270(0x10e, float:3.78E-43)
            if (r7 == r6) goto L_0x03f6
            if (r7 != r8) goto L_0x03f3
            goto L_0x03f6
        L_0x03f3:
            int r8 = r3.f180525a
            goto L_0x03f8
        L_0x03f6:
            int r8 = r3.f180526b
        L_0x03f8:
            r50 = r9
            double r8 = (double) r8
            double r36 = r36 * r8
            if (r7 == r6) goto L_0x0407
            r6 = 270(0x10e, float:3.78E-43)
            if (r7 != r6) goto L_0x0404
            goto L_0x0407
        L_0x0404:
            int r6 = r3.f180526b
            goto L_0x0409
        L_0x0407:
            int r6 = r3.f180525a
        L_0x0409:
            double r6 = (double) r6
            double r6 = r36 / r6
            java.lang.String r8 = r14.f161472i
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r51 = r10
            java.lang.String r10 = "origin videoInfo:"
            r9.append(r10)
            r9.append(r3)
            java.lang.String r10 = ", videoParams:"
            r9.append(r10)
            r9.append(r2)
            java.lang.String r10 = ", videoRatio:"
            r9.append(r10)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            java.lang.String r8 = r14.f161472i
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "videoRatio in range:"
            r9.append(r10)
            up1.f r10 = up1.C37521f.f99374d
            r10.getClass()
            my3.f<java.lang.Double> r10 = up1.C37521f.f99341Z
            r52 = r15
            java.lang.Double r15 = java.lang.Double.valueOf(r6)
            r53 = r13
            r13 = r10
            my3.d r13 = (my3.C34688d) r13
            boolean r15 = r13.mo59684a(r15)
            r9.append(r15)
            java.lang.String r15 = ", finderVideoRatioRange:"
            r9.append(r15)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            boolean r8 = r3.f180531g
            if (r8 != 0) goto L_0x0492
            int r8 = r3.f180529e
            int r9 = r2.f267169g
            if (r8 > r9) goto L_0x0492
            float r3 = r3.f180527c
            int r8 = r2.f267168f
            float r8 = (float) r8
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x0492
            java.lang.Double r3 = java.lang.Double.valueOf(r6)
            boolean r3 = r13.mo59684a(r3)
            if (r3 == 0) goto L_0x0492
            r3 = 1
            goto L_0x0493
        L_0x0488:
            r49 = r8
            r50 = r9
            r51 = r10
            r53 = r13
            r52 = r15
        L_0x0492:
            r3 = 0
        L_0x0493:
            te3.zy r6 = r4.f185235B
            if (r6 == 0) goto L_0x049a
            java.lang.String r6 = r6.f186903h
            goto L_0x049b
        L_0x049a:
            r6 = 0
        L_0x049b:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            java.lang.String r7 = r14.f161472i
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "isVideoSizeMatch:"
            r8.append(r9)
            r8.append(r3)
            java.lang.String r9 = "， noMusic:"
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            if (r3 == 0) goto L_0x0628
            if (r6 == 0) goto L_0x0628
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            di3.d r7 = di3.C86312j.m106911c(r18)
            tz.f r7 = (p707tz.C65000f) r7
            te3.m10 r8 = r1.f183515r
            te3.ep3 r8 = r8.f184196e
            r7.mo89209x8(r8, r3)
            di3.d r7 = di3.C86312j.m106911c(r18)
            tz.f r7 = (p707tz.C65000f) r7
            te3.m10 r8 = r1.f183515r
            te3.ep3 r8 = r8.f184198g
            r7.mo89209x8(r8, r6)
            java.lang.String r7 = r14.f161472i
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "cropRect:"
            r8.append(r9)
            r8.append(r3)
            java.lang.String r9 = ", contentRect:"
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = ", track:["
            r8.append(r9)
            long r9 = r1.f183508h
            r8.append(r9)
            java.lang.String r9 = ", "
            r8.append(r9)
            long r9 = r1.f183509i
            r8.append(r9)
            java.lang.String r9 = ", "
            r8.append(r9)
            long r9 = r1.f183510j
            r8.append(r9)
            r9 = 93
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            long r7 = r1.f183508h
            r9 = 0
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x0628
            long r7 = r1.f183510j
            long r9 = r1.f183509i
            long r9 = r7 - r9
            r36 = 10
            int r13 = (r9 > r36 ? 1 : (r9 == r36 ? 0 : -1))
            if (r13 > 0) goto L_0x0628
            int r9 = r2.f267170h
            int r9 = r9 * 1000
            long r9 = (long) r9
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 > 0) goto L_0x0628
            boolean r3 = gy3.C87412m.m108589b(r3, r6)
            if (r3 == 0) goto L_0x0628
            di3.d r3 = di3.C86312j.m106911c(r0)
            com.tencent.mm.feature.sight.api.ISightJNIService r3 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r3
            java.lang.String r6 = r1.f183504d
            boolean r3 = r3.optimizeMP4VFS(r6)
            er1.w3 r6 = er1.C58784w3.f168295a
            java.lang.String r7 = r1.f183504d
            java.lang.String r8 = "track.path"
            gy3.C87412m.m108593f(r7, r8)
            boolean r6 = r6.mo83883L0(r7)
            java.lang.String r7 = r14.f161472i
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "moovSucc:"
            r8.append(r9)
            r8.append(r3)
            java.lang.String r9 = ", isOptimize:"
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            if (r6 == 0) goto L_0x0607
            java.lang.String r6 = r14.f161472i
            java.lang.String r7 = "no need remux!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            java.lang.String r6 = r1.f183504d
            com.tencent.p014mm.vfs.C86013q1.m106442c(r6, r11)
            int r6 = r1.f183511n     // Catch:{ all -> 0x05e2 }
            int r7 = r1.f183512o     // Catch:{ all -> 0x05e2 }
            int r8 = r2.f267168f     // Catch:{ all -> 0x05e2 }
            int r9 = r2.f267169g     // Catch:{ all -> 0x05e2 }
            r15 = r12
            long r12 = r1.f183510j     // Catch:{ all -> 0x05df }
            float r1 = (float) r12     // Catch:{ all -> 0x05df }
            r10 = 1148846080(0x447a0000, float:1000.0)
            float r41 = r1 / r10
            r42 = 0
            r43 = 4
            float r1 = r2.f267182w     // Catch:{ all -> 0x05df }
            r45 = 0
            int r10 = r2.f267154A     // Catch:{ all -> 0x05df }
            int r12 = r2.f267155B     // Catch:{ all -> 0x05df }
            r36 = r11
            r37 = r6
            r38 = r7
            r39 = r8
            r40 = r9
            r44 = r1
            r46 = r10
            r47 = r12
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate.m119560f(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)     // Catch:{ all -> 0x05df }
            if (r1 == 0) goto L_0x05c9
            int r1 = r1.qualityLevel     // Catch:{ all -> 0x05c6 }
            float r1 = (float) r1
            goto L_0x05ca
        L_0x05c6:
            r1 = 0
            goto L_0x05dd
        L_0x05c9:
            r1 = 0
        L_0x05ca:
            if (r3 == 0) goto L_0x05dd
            di3.d r3 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x05da }
            com.tencent.mm.feature.sight.api.ISightJNIService r3 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r3     // Catch:{ all -> 0x05da }
            int r6 = r2.f267180u     // Catch:{ all -> 0x05da }
            r7 = 0
            r8 = 0
            r3.addReportMetadata(r11, r8, r6, r7)     // Catch:{ all -> 0x05db }
            goto L_0x05e5
        L_0x05da:
            r8 = 0
        L_0x05db:
            goto L_0x05e5
        L_0x05dd:
            r8 = 0
            goto L_0x05e5
        L_0x05df:
            r8 = 0
            goto L_0x05e4
        L_0x05e2:
            r15 = r12
            goto L_0x05df
        L_0x05e4:
            r1 = 0
        L_0x05e5:
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 36
            r9 = 1
            r37 = 1718(0x6b6, double:8.49E-321)
            r39 = 36
            r41 = 1
            r36 = r3
            r36.mo175913w(r37, r39, r41)
            if (r33 == 0) goto L_0x0603
            r37 = 1719(0x6b7, double:8.493E-321)
            r36 = r3
            r39 = r6
            r41 = r9
            r36.mo175913w(r37, r39, r41)
        L_0x0603:
            r12 = r1
            r1 = 3
            r13 = 3
            goto L_0x063a
        L_0x0607:
            r15 = r12
            r8 = 0
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 64
            r9 = 1
            r40 = 1718(0x6b6, double:8.49E-321)
            r42 = 64
            r44 = 1
            r39 = r1
            r39.mo175913w(r40, r42, r44)
            if (r33 == 0) goto L_0x0637
            r40 = 1719(0x6b7, double:8.493E-321)
            r39 = r1
            r42 = r6
            r44 = r9
            r39.mo175913w(r40, r42, r44)
            goto L_0x0637
        L_0x0628:
            r15 = r12
            r8 = 0
            goto L_0x0637
        L_0x062b:
            r49 = r8
            r50 = r9
            r51 = r10
            r53 = r13
            r52 = r15
            r8 = 0
            r15 = r12
        L_0x0637:
            r1 = 3
            r12 = 0
            r13 = 2
        L_0x063a:
            if (r13 == r1) goto L_0x094e
            te3.zy r1 = r4.f185235B
            if (r1 == 0) goto L_0x064c
            java.util.LinkedList<te3.hi4> r1 = r1.f186899d
            if (r1 == 0) goto L_0x064c
            r10 = 0
            java.lang.Object r1 = r1.get(r10)
            te3.hi4 r1 = (te3.hi4) r1
            goto L_0x064e
        L_0x064c:
            r10 = 0
            r1 = r8
        L_0x064e:
            if (r5 == 0) goto L_0x0697
            if (r1 == 0) goto L_0x0697
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            di3.d r6 = di3.C86312j.m106911c(r18)
            tz.f r6 = (p707tz.C65000f) r6
            te3.m10 r7 = r1.f183515r
            te3.ep3 r7 = r7.f184196e
            r6.mo89209x8(r7, r3)
            di3.d r6 = di3.C86312j.m106911c(r18)
            tz.f r6 = (p707tz.C65000f) r6
            te3.m10 r1 = r1.f183515r
            te3.ep3 r1 = r1.f184199h
            r6.mo89209x8(r1, r5)
            r5.contains(r3)
            java.lang.String r1 = r14.f161472i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "process: crop: "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = ", content: "
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
        L_0x0697:
            boolean r1 = r14.f161475o
            if (r1 == 0) goto L_0x06cb
            java.lang.String r0 = r14.f161472i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "run canceled "
            r1.append(r2)
            up1.l r2 = r14.f161471h
            long r2 = r2.field_localId
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            up1.l r2 = r14.f161471h
            long r2 = r2.field_objectId
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            zq1.c r0 = new zq1.c
            up1.l r1 = r14.f161471h
            r5 = 3
            r0.<init>(r1, r5)
            goto L_0x0b25
        L_0x06cb:
            r5 = 3
            r9 = 32
            if (r33 == 0) goto L_0x079c
            int r21 = r15.size()
            r1 = r56
            r7 = r2
            r2 = r24
            r6 = r4
            r4 = r7
            r32 = r0
            r0 = 3
            r5 = r6
            r0 = r6
            r34 = r26
            r24 = 1
            r6 = r11
            r26 = r13
            r30 = r23
            r36 = r28
            r37 = 1065353216(0x3f800000, float:1.0)
            r13 = r7
            r7 = r30
            r38 = r8
            r8 = r33
            r23 = r12
            r12 = 32
            r9 = r34
            r39 = r51
            r24 = 0
            r10 = r21
            r12 = r11
            r11 = r35
            rx3.l r1 = r1.mo79331h(r2, r4, r5, r6, r7, r8, r9, r10, r11)
            A r1 = r1.f38555d
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 >= 0) goto L_0x0726
            di3.d r0 = di3.C86312j.m106911c(r16)
            tz.h r0 = (p707tz.C65002h) r0
            r1 = r53
            r0.mo89213hQ(r1)
            zq1.c r0 = new zq1.c
            up1.l r1 = r14.f161471h
            r2 = 2
            r0.<init>(r1, r2)
            goto L_0x0b25
        L_0x0726:
            r1 = r53
            di3.d r2 = di3.C86312j.m106911c(r17)
            rw.m r2 = (p232rw.C63679m) r2
            rw.m$a r2 = r2.mo88483M1(r12)
            if (r2 == 0) goto L_0x0755
            int r3 = r2.f180525a
            if (r3 <= 0) goto L_0x0755
            int r3 = r2.f180526b
            if (r3 <= 0) goto L_0x0755
            float r3 = r2.f180527c
            int r3 = (r3 > r48 ? 1 : (r3 == r48 ? 0 : -1))
            if (r3 > 0) goto L_0x0743
            goto L_0x0755
        L_0x0743:
            r42 = r0
            r4 = r12
            r43 = r13
            r40 = r15
            r55 = r26
            r15 = r34
            r11 = 2
            r31 = 1
            r41 = 0
            goto L_0x096c
        L_0x0755:
            java.lang.String r0 = r14.f161472i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "remuxVideo file error: "
            r3.append(r4)
            if (r2 == 0) goto L_0x076a
            int r4 = r2.f180525a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            goto L_0x076c
        L_0x076a:
            r8 = r38
        L_0x076c:
            r3.append(r8)
            r11 = 32
            r3.append(r11)
            if (r2 == 0) goto L_0x077d
            int r2 = r2.f180526b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            goto L_0x077f
        L_0x077d:
            r8 = r38
        L_0x077f:
            r3.append(r8)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            di3.d r0 = di3.C86312j.m106911c(r16)
            tz.h r0 = (p707tz.C65002h) r0
            r0.mo89213hQ(r1)
            zq1.c r0 = new zq1.c
            up1.l r1 = r14.f161471h
            r10 = 2
            r0.<init>(r1, r10)
            goto L_0x0b25
        L_0x079c:
            r32 = r0
            r0 = r4
            r38 = r8
            r12 = r11
            r30 = r23
            r34 = r26
            r36 = r28
            r39 = r51
            r10 = 2
            r11 = 32
            r37 = 1065353216(0x3f800000, float:1.0)
            r26 = r13
            r13 = r2
            int r1 = r15.size()
            java.lang.String r2 = r14.f161472i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "remuxComposition outputPath:"
            r3.append(r4)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            te3.zy r2 = r0.f185235B
            if (r2 != 0) goto L_0x07d5
            te3.zy r2 = new te3.zy
            r2.<init>()
        L_0x07d5:
            r9 = r2
            gy3.d0 r8 = new gy3.d0
            r8.<init>()
            r2 = -1
            r8.f27483d = r2
            te3.az r2 = r9.f186904i
            if (r2 != 0) goto L_0x07e7
            te3.az r2 = new te3.az
            r2.<init>()
        L_0x07e7:
            r6 = r2
            r6.f297896d = r12
            di3.d r2 = di3.C86312j.m106911c(r18)
            java.lang.String r3 = "getService(IFinderVlogFinderService::class.java)"
            gy3.C87412m.m108593f(r2, r3)
            tz.f r2 = (p707tz.C65000f) r2
            r3 = 0
            r7 = 0
            boolean r2 = r2.vm0(r7, r3)
            r6.f297913x = r2
            java.lang.Object r21 = new java.lang.Object
            r21.<init>()
            gy3.a0 r5 = new gy3.a0
            r5.<init>()
            di3.d r2 = di3.C86312j.m106911c(r18)
            tz.f r2 = (p707tz.C65000f) r2
            com.tencent.mm.plugin.vlog.model.v r4 = r2.mo89198mn()
            te3.jr2 r2 = r0.f185281u
            if (r2 == 0) goto L_0x0819
            int r2 = r2.f183837n
            goto L_0x081a
        L_0x0819:
            r2 = 0
        L_0x081a:
            r4.mo81178f(r2)
            r3 = 1
            r4.mo81176d(r3)
            up1.f r2 = up1.C37521f.f99374d
            boolean r2 = r2.mo61153G()
            if (r2 == 0) goto L_0x082c
            r4.mo81173a(r3, r13)
        L_0x082c:
            gy3.c0 r2 = new gy3.c0
            r2.<init>()
            zq1.d r3 = new zq1.d
            r27 = r15
            r15 = r34
            r3.<init>(r2, r14, r15, r1)
            r4.mo81174b(r3)
            r14.f161474n = r4
            r23 = 0
            zq1.e r28 = new zq1.e
            r1 = r28
            r2 = r56
            r31 = 1
            r3 = r8
            r34 = r4
            r4 = r15
            r35 = r5
            r5 = r30
            r40 = r6
            r41 = 0
            r6 = r24
            r42 = r0
            r0 = r8
            r8 = r12
            r24 = r9
            r9 = r40
            r25 = 2
            r10 = r13
            r40 = 32
            r11 = r24
            r54 = r12
            r40 = r27
            r12 = r21
            r43 = r13
            r55 = r26
            r13 = r35
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13)
            r7 = 2
            r8 = 0
            r3 = r34
            r4 = r24
            r5 = r23
            r6 = r28
            float r1 = com.tencent.p014mm.plugin.vlog.model.C57463v.C57464a.m66220b(r3, r4, r5, r6, r7, r8)
            monitor-enter(r21)
            r2 = r35
            boolean r2 = r2.f27482d     // Catch:{ all -> 0x094b }
            if (r2 != 0) goto L_0x08cd
            java.lang.String r2 = r14.f161472i     // Catch:{ all -> 0x094b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x094b }
            r3.<init>()     // Catch:{ all -> 0x094b }
            java.lang.String r4 = "wait "
            r3.append(r4)     // Catch:{ all -> 0x094b }
            r3.append(r15)     // Catch:{ all -> 0x094b }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x094b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x094b }
            r21.wait()     // Catch:{ InterruptedException -> 0x08a5 }
            goto L_0x08ad
        L_0x08a5:
            java.lang.String r2 = r14.f161472i     // Catch:{ all -> 0x094b }
            java.lang.String r3 = "wait interrupted"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)     // Catch:{ all -> 0x094b }
        L_0x08ad:
            java.lang.String r2 = r14.f161472i     // Catch:{ all -> 0x094b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x094b }
            r3.<init>()     // Catch:{ all -> 0x094b }
            java.lang.String r4 = "notify "
            r3.append(r4)     // Catch:{ all -> 0x094b }
            r3.append(r15)     // Catch:{ all -> 0x094b }
            java.lang.String r4 = ", "
            r3.append(r4)     // Catch:{ all -> 0x094b }
            int r4 = r0.f27483d     // Catch:{ all -> 0x094b }
            r3.append(r4)     // Catch:{ all -> 0x094b }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x094b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x094b }
        L_0x08cd:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x094b }
            monitor-exit(r21)
            int r0 = r0.f27483d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            int r0 = r0.intValue()
            float r1 = r1.floatValue()
            if (r0 >= 0) goto L_0x08ee
            zq1.c r0 = new zq1.c
            up1.l r1 = r14.f161471h
            r11 = 2
            r0.<init>(r1, r11)
            goto L_0x0b25
        L_0x08ee:
            r11 = 2
            di3.d r0 = di3.C86312j.m106911c(r17)
            rw.m r0 = (p232rw.C63679m) r0
            r4 = r54
            rw.m$a r0 = r0.mo88483M1(r4)
            if (r0 == 0) goto L_0x090e
            int r2 = r0.f180525a
            if (r2 <= 0) goto L_0x090e
            int r2 = r0.f180526b
            if (r2 <= 0) goto L_0x090e
            float r2 = r0.f180527c
            int r2 = (r2 > r48 ? 1 : (r2 == r48 ? 0 : -1))
            if (r2 > 0) goto L_0x090c
            goto L_0x090e
        L_0x090c:
            r9 = r1
            goto L_0x096e
        L_0x090e:
            java.lang.String r1 = r14.f161472i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "remuxVideo file error: "
            r2.append(r3)
            if (r0 == 0) goto L_0x0923
            int r3 = r0.f180525a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            goto L_0x0925
        L_0x0923:
            r8 = r38
        L_0x0925:
            r2.append(r8)
            r3 = 32
            r2.append(r3)
            if (r0 == 0) goto L_0x0936
            int r0 = r0.f180526b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            goto L_0x0938
        L_0x0936:
            r8 = r38
        L_0x0938:
            r2.append(r8)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            zq1.c r0 = new zq1.c
            up1.l r1 = r14.f161471h
            r0.<init>(r1, r11)
            goto L_0x0b25
        L_0x094b:
            r0 = move-exception
            monitor-exit(r21)
            throw r0
        L_0x094e:
            r32 = r0
            r43 = r2
            r42 = r4
            r38 = r8
            r4 = r11
            r55 = r13
            r40 = r15
            r30 = r23
            r15 = r26
            r36 = r28
            r39 = r51
            r11 = 2
            r31 = 1
            r37 = 1065353216(0x3f800000, float:1.0)
            r41 = 0
            r23 = r12
        L_0x096c:
            r9 = r23
        L_0x096e:
            boolean r0 = r14.f161475o
            if (r0 == 0) goto L_0x09a2
            java.lang.String r0 = r14.f161472i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "run2 canceled "
            r1.append(r2)
            up1.l r2 = r14.f161471h
            long r2 = r2.field_localId
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            up1.l r2 = r14.f161471h
            long r2 = r2.field_objectId
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            zq1.c r0 = new zq1.c
            up1.l r1 = r14.f161471h
            r2 = 3
            r0.<init>(r1, r2)
            goto L_0x0b25
        L_0x09a2:
            java.lang.String r0 = r14.f161472i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "hseasunhan, video quality level: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$a r0 = com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage.f161539p
            java.lang.String r0 = "input"
            gy3.C87412m.m108594g(r4, r0)
            up1.f r0 = up1.C37521f.f99374d
            boolean r0 = r0.mo61155I()
            if (r0 == 0) goto L_0x09d9
            r23 = r4
            r24 = r50
            r25 = r49
            r26 = r36
            r27 = r39
            r28 = r29
            float r0 = com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate.m119556a(r23, r24, r25, r26, r27, r28)
            r8 = r0
            goto L_0x09da
        L_0x09d9:
            r8 = 0
        L_0x09da:
            java.lang.String r0 = r14.f161472i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "qipengfeng, audio quality level: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = ", bitrate:"
            r1.append(r2)
            r3 = r50
            r1.append(r3)
            java.lang.String r2 = ", samplerate:"
            r1.append(r2)
            r2 = r49
            r1.append(r2)
            java.lang.String r2 = ", channels:"
            r1.append(r2)
            r2 = r36
            r1.append(r2)
            java.lang.String r2 = ", enableAuQA:"
            r1.append(r2)
            r2 = r39
            r1.append(r2)
            java.lang.String r2 = ", useOriAu:"
            r1.append(r2)
            r6 = r29
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            float r0 = (float) r15
            float r0 = r0 + r37
            int r1 = r40.size()
            float r1 = (float) r1
            float r0 = r0 / r1
            r14.mo79333j(r0)
            r0 = r42
            boolean r1 = r0.f185255T
            if (r1 == 0) goto L_0x0a73
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r14.f161473j
            java.util.LinkedList r1 = r1.getHalfVideoMediaExtList()
            java.util.Iterator r1 = r1.iterator()
        L_0x0a3e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0a56
            java.lang.Object r2 = r1.next()
            r3 = r2
            te3.rq2 r3 = (te3.C64689rq2) r3
            java.lang.String r5 = r0.f185275p
            java.lang.String r3 = r3.f185275p
            boolean r3 = gy3.C87412m.m108589b(r5, r3)
            if (r3 == 0) goto L_0x0a3e
            goto L_0x0a58
        L_0x0a56:
            r2 = r38
        L_0x0a58:
            r5 = r2
            te3.rq2 r5 = (te3.C64689rq2) r5
            if (r5 == 0) goto L_0x0ac8
            r10 = 0
            r1 = r56
            r2 = r43
            r3 = r0
            r6 = r15
            r7 = r30
            r1.mo79332i(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            wp1.c r0 = wp1.C66166c.f190172a
            up1.l r1 = r14.f161471h
            r0.mo90231b(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0ac8
        L_0x0a73:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r14.f161473j
            java.util.LinkedList r12 = r1.getMediaList()
            java.util.Iterator r1 = r12.iterator()
        L_0x0a7d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0a95
            java.lang.Object r2 = r1.next()
            r3 = r2
            te3.rq2 r3 = (te3.C64689rq2) r3
            java.lang.String r5 = r0.f185275p
            java.lang.String r3 = r3.f185275p
            boolean r3 = gy3.C87412m.m108589b(r5, r3)
            if (r3 == 0) goto L_0x0a7d
            goto L_0x0a97
        L_0x0a95:
            r2 = r38
        L_0x0a97:
            r5 = r2
            te3.rq2 r5 = (te3.C64689rq2) r5
            if (r5 == 0) goto L_0x0ac8
            r10 = 0
            r1 = r56
            r2 = r43
            r3 = r0
            r6 = r15
            r7 = r30
            r1.mo79332i(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r14.f161473j
            r0.setMediaList(r12)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r14.f161473j
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            if (r0 == 0) goto L_0x0abf
            long r1 = eb0.C31543z5.m39453c()
            r0.remuxEndTime = r1
            r1 = r55
            r0.remuxType = r1
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0abf:
            wp1.c r0 = wp1.C66166c.f190172a
            up1.l r1 = r14.f161471h
            r0.mo90231b(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0ac8:
            r6 = r20
            r0 = r32
            r9 = r33
            r8 = r38
            r12 = r40
            r15 = r52
            r7 = 1065353216(0x3f800000, float:1.0)
            r10 = 1
            r13 = 2
            goto L_0x013a
        L_0x0ada:
            r38 = r8
            sx3.C64197v.m75542k()
            throw r38
        L_0x0ae0:
            java.lang.Class<tz.e> r0 = p707tz.C64999e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tz.e r0 = (p707tz.C64999e) r0
            r0.reset()
            boolean r0 = r14.f161475o
            if (r0 == 0) goto L_0x0b1e
            java.lang.String r0 = r14.f161472i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "run3 canceled "
            r1.append(r2)
            up1.l r2 = r14.f161471h
            long r2 = r2.field_localId
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            up1.l r2 = r14.f161471h
            long r2 = r2.field_objectId
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            zq1.c r0 = new zq1.c
            up1.l r1 = r14.f161471h
            r2 = 3
            r0.<init>(r1, r2)
            goto L_0x0b25
        L_0x0b1e:
            com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r0 = new com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage
            up1.l r1 = r14.f161471h
            r0.<init>(r1)
        L_0x0b25:
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderDraftModifyEvent> r1 = r14.f161476p
            r1.dead()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStage.mo75105g():xq1.e");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0256  */
    /* renamed from: h */
    public final rx3.C13604l<java.lang.Integer, java.lang.Float> mo79331h(long r24, com.tencent.p014mm.modelcontrol.VideoTransPara r26, te3.C64689rq2 r27, java.lang.String r28, com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject r29, boolean r30, int r31, int r32, com.tencent.p014mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct r33) {
        /*
            r23 = this;
            r14 = r23
            r0 = r26
            r8 = r27
            r9 = r30
            java.lang.Class<tz.f> r10 = p707tz.C65000f.class
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 0
            r15 = 1
            r2 = 1718(0x6b6, double:8.49E-321)
            r4 = 0
            r6 = 1
            r1 = r11
            r1.mo175913w(r2, r4, r6)
            r2 = 1719(0x6b7, double:8.493E-321)
            r1 = r11
            r4 = r12
            r6 = r15
            r1.mo175913w(r2, r4, r6)
            java.lang.Class<tz.e> r1 = p707tz.C64999e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            tz.e r1 = (p707tz.C64999e) r1
            r1.mo89164pj(r9)
            java.lang.Object r15 = new java.lang.Object
            r15.<init>()
            gy3.a0 r13 = new gy3.a0
            r13.<init>()
            java.lang.String r1 = r8.f185266d
            r16 = 0
            if (r1 != 0) goto L_0x004d
            rx3.l r0 = new rx3.l
            r1 = -1000(0xfffffffffffffc18, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Float r2 = java.lang.Float.valueOf(r16)
            r0.<init>(r1, r2)
            return r0
        L_0x004d:
            te3.jr2 r2 = r8.f185281u
            if (r2 != 0) goto L_0x0061
            rx3.l r0 = new rx3.l
            r1 = -1001(0xfffffffffffffc17, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Float r2 = java.lang.Float.valueOf(r16)
            r0.<init>(r1, r2)
            return r0
        L_0x0061:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            gy3.d0 r11 = new gy3.d0
            r11.<init>()
            gy3.d0 r12 = new gy3.d0
            r12.<init>()
            int r3 = r0.f267169g
            java.lang.Class<rw.m> r3 = p232rw.C63679m.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            rw.m r3 = (p232rw.C63679m) r3
            r7 = 1
            rw.m$a r3 = r3.mo88484UU(r1, r7)
            di3.d r4 = di3.C86312j.m106911c(r10)
            java.lang.String r6 = "getService(IFinderVlogFinderService::class.java)"
            gy3.C87412m.m108593f(r4, r6)
            tz.f r4 = (p707tz.C65000f) r4
            r6 = 2
            r7 = 0
            r17 = r13
            r13 = 0
            com.tencent.mm.plugin.vlog.model.y r1 = p707tz.C65000f.C65001a.m76631a(r4, r1, r13, r6, r7)
            int r4 = r2.f183833g
            long r6 = (long) r4
            r1.mo81188b(r6)
            int r4 = r2.f183833g
            long r6 = (long) r4
            r1.mo81187a(r6)
            di3.d r4 = di3.C86312j.m106911c(r10)
            tz.f r4 = (p707tz.C65000f) r4
            java.util.List r6 = sx3.C26236u.m33719b(r1)
            com.tencent.mm.plugin.vlog.model.x r7 = r4.mo89196la(r6)
            if (r3 == 0) goto L_0x0109
            int r4 = r3.f180525a
            int r6 = r3.f180526b
            int r13 = r3.f180530f
            r19 = r4
            r4 = 90
            if (r13 == r4) goto L_0x00c3
            r4 = 270(0x10e, float:3.78E-43)
            if (r13 != r4) goto L_0x00c0
            goto L_0x00c3
        L_0x00c0:
            r4 = r19
            goto L_0x00c6
        L_0x00c3:
            r4 = r6
            r6 = r19
        L_0x00c6:
            com.tencent.mm.plugin.vlog.model.p r1 = r1.mo81192f()
            android.graphics.Rect r1 = r1.f316486d
            r13 = 0
            r1.set(r13, r13, r4, r6)
            r7.mo81184c(r4, r6)
            r5.set(r13, r13, r4, r6)
            r1 = r29
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r13 = r1.origin
            r19 = r15
            if (r13 != 0) goto L_0x00df
            goto L_0x00e4
        L_0x00df:
            long r14 = r3.f180528d
            int r15 = (int) r14
            r13.videoDuration = r15
        L_0x00e4:
            if (r13 != 0) goto L_0x00e7
            goto L_0x00eb
        L_0x00e7:
            int r14 = r3.f180525a
            r13.width = r14
        L_0x00eb:
            if (r13 != 0) goto L_0x00ee
            goto L_0x00f2
        L_0x00ee:
            int r14 = r3.f180526b
            r13.height = r14
        L_0x00f2:
            if (r13 != 0) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            int r14 = r3.f180529e
            r13.videoBitrate = r14
        L_0x00f9:
            if (r13 != 0) goto L_0x00fc
            goto L_0x0100
        L_0x00fc:
            int r14 = r3.f180532h
            r13.audioBitrate = r14
        L_0x0100:
            if (r13 != 0) goto L_0x0103
            goto L_0x010f
        L_0x0103:
            float r14 = r3.f180527c
            int r14 = (int) r14
            r13.fps = r14
            goto L_0x010f
        L_0x0109:
            r1 = r29
            r19 = r15
            r4 = 0
            r6 = 0
        L_0x010f:
            te3.zr4 r13 = r2.f183830d
            if (r13 == 0) goto L_0x0183
            if (r9 == 0) goto L_0x0121
            int r14 = r13.f186847d
            int r15 = r13.f186850g
            int r1 = r13.f186849f
            int r13 = r13.f186848e
            r5.set(r14, r15, r1, r13)
            goto L_0x0183
        L_0x0121:
            te3.bp1 r1 = r2.f183831e
            if (r1 == 0) goto L_0x0183
            java.util.LinkedList<java.lang.Float> r1 = r1.f131245d
            if (r1 == 0) goto L_0x0183
            android.graphics.Matrix r14 = new android.graphics.Matrix
            r14.<init>()
            float[] r1 = sx3.C110818d0.m150950v0(r1)
            r14.setValues(r1)
            float r1 = uq1.C65451n.m77120a(r14)
            double r14 = (double) r1
            r20 = 0
            int r1 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r1 > 0) goto L_0x0142
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0142:
            er1.w3 r1 = er1.C58784w3.f168295a
            int r8 = r13.f186848e
            r20 = r4
            int r4 = r13.f186850g
            int r8 = r8 - r4
            r21 = r3
            double r3 = (double) r8
            double r3 = r3 / r14
            double r3 = java.lang.Math.floor(r3)
            int r3 = (int) r3
            int r3 = r1.mo83981y1(r3)
            int r4 = r13.f186849f
            int r8 = r13.f186847d
            int r4 = r4 - r8
            r22 = r6
            r8 = r7
            double r6 = (double) r4
            double r6 = r6 / r14
            double r6 = java.lang.Math.floor(r6)
            int r4 = (int) r6
            int r1 = r1.mo83981y1(r4)
            int r4 = r13.f186847d
            double r6 = (double) r4
            double r6 = r6 / r14
            double r6 = java.lang.Math.floor(r6)
            int r4 = (int) r6
            int r6 = r13.f186850g
            double r6 = (double) r6
            double r6 = r6 / r14
            double r6 = java.lang.Math.floor(r6)
            int r6 = (int) r6
            int r1 = r1 + r4
            int r3 = r3 + r6
            r5.set(r4, r6, r1, r3)
            goto L_0x018a
        L_0x0183:
            r21 = r3
            r20 = r4
            r22 = r6
            r8 = r7
        L_0x018a:
            if (r9 == 0) goto L_0x018f
            int r1 = r2.f183834h
            goto L_0x0197
        L_0x018f:
            er1.w3 r1 = er1.C58784w3.f168295a
            int r3 = r2.f183834h
            int r1 = r1.mo83981y1(r3)
        L_0x0197:
            r11.f27483d = r1
            if (r9 == 0) goto L_0x019e
            int r1 = r2.f183835i
            goto L_0x01a6
        L_0x019e:
            er1.w3 r1 = er1.C58784w3.f168295a
            int r2 = r2.f183835i
            int r1 = r1.mo83981y1(r2)
        L_0x01a6:
            r12.f27483d = r1
            r7 = r8
            r7.mo81183b(r5)
            if (r21 == 0) goto L_0x01b3
            r1 = r21
            float r1 = r1.f180527c
            goto L_0x01b4
        L_0x01b3:
            r1 = 0
        L_0x01b4:
            int r2 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r2 < 0) goto L_0x01bd
            int r2 = r0.f267168f
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
        L_0x01bd:
            if (r9 == 0) goto L_0x01f6
            up1.f r1 = up1.C37521f.f99374d
            long r2 = r1.mo61147A()
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.getClass()
            int r4 = up1.C37521f.f99383e
            float r4 = (float) r4
            float r4 = r4 * r3
            float r2 = r2 / r4
            r1.getClass()
            float r1 = up1.C37521f.f99392f
            float r2 = r2 * r1
            int r1 = (int) r2
            r0.f267156C = r1
            r14 = r23
            java.lang.String r1 = r14.f161472i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ABA:  finder video maxVideoSize:"
            r2.append(r3)
            int r3 = r0.f267156C
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x01f8
        L_0x01f6:
            r14 = r23
        L_0x01f8:
            di3.d r1 = di3.C86312j.m106911c(r10)
            tz.f r1 = (p707tz.C65000f) r1
            com.tencent.mm.plugin.vlog.model.w r8 = r1.mo89207wN(r7)
            android.util.Size r4 = new android.util.Size
            r1 = r20
            r6 = r22
            r4.<init>(r1, r6)
            r6 = 0
            r13 = 1
            r1 = r8
            r2 = r28
            r3 = r26
            r15 = r7
            r33 = r12
            r12 = 1
            r7 = r13
            r1.mo81181b(r2, r3, r4, r5, r6, r7)
            te3.zy r13 = r8.mo81180a()
            te3.az r1 = r13.f186904i
            r7 = r28
            r1.f297896d = r7
            di3.d r2 = di3.C86312j.m106911c(r10)
            tz.f r2 = (p707tz.C65000f) r2
            long r3 = r15.getDurationMs()
            boolean r2 = r2.vm0(r9, r3)
            r1.f297913x = r2
            di3.d r1 = di3.C86312j.m106911c(r10)
            tz.f r1 = (p707tz.C65000f) r1
            com.tencent.mm.plugin.vlog.model.v r15 = r1.mo89198mn()
            java.lang.Class<tz.h> r1 = p707tz.C65002h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            tz.h r1 = (p707tz.C65002h) r1
            int r1 = r1.mo89212hE()
            r15.mo81175c(r1)
            r1 = r27
            te3.jr2 r1 = r1.f185281u
            if (r1 == 0) goto L_0x0256
            int r1 = r1.f183837n
            goto L_0x0257
        L_0x0256:
            r1 = 0
        L_0x0257:
            r15.mo81178f(r1)
            r15.mo81173a(r12, r0)
            gy3.c0 r1 = new gy3.c0
            r1.<init>()
            com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStage$a r2 = new com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStage$a
            r3 = r31
            r4 = r32
            r2.<init>(r1, r14, r3, r4)
            r15.mo81174b(r2)
            gy3.d0 r12 = new gy3.d0
            r12.<init>()
            r1 = -1
            r12.f27483d = r1
            r14.f161474n = r15
            r18 = 0
            com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStage$b r20 = new com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStage$b
            r1 = r20
            r2 = r23
            r3 = r12
            r4 = r29
            r5 = r24
            r7 = r28
            r8 = r30
            r9 = r11
            r10 = r33
            r11 = r26
            r0 = r12
            r12 = r19
            r30 = r17
            r17 = r13
            r13 = r30
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13)
            r1 = 2
            r2 = 0
            r24 = r15
            r25 = r17
            r26 = r18
            r27 = r20
            r28 = r1
            r29 = r2
            com.tencent.p014mm.plugin.vlog.model.C57463v.C57464a.m66220b(r24, r25, r26, r27, r28, r29)
            monitor-enter(r19)
            r1 = r30
            boolean r1 = r1.f27482d     // Catch:{ all -> 0x02f1 }
            if (r1 != 0) goto L_0x02de
            java.lang.String r1 = r14.f161472i     // Catch:{ all -> 0x02f1 }
            java.lang.String r2 = "wait longvideo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x02f1 }
            r19.wait()     // Catch:{ InterruptedException -> 0x02be }
            goto L_0x02c6
        L_0x02be:
            java.lang.String r1 = r14.f161472i     // Catch:{ all -> 0x02f1 }
            java.lang.String r2 = "wait interrupted"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)     // Catch:{ all -> 0x02f1 }
        L_0x02c6:
            java.lang.String r1 = r14.f161472i     // Catch:{ all -> 0x02f1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02f1 }
            r2.<init>()     // Catch:{ all -> 0x02f1 }
            java.lang.String r3 = "notify longvideo, "
            r2.append(r3)     // Catch:{ all -> 0x02f1 }
            int r3 = r0.f27483d     // Catch:{ all -> 0x02f1 }
            r2.append(r3)     // Catch:{ all -> 0x02f1 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x02f1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x02f1 }
        L_0x02de:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x02f1 }
            monitor-exit(r19)
            rx3.l r1 = new rx3.l
            int r0 = r0.f27483d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Float r2 = java.lang.Float.valueOf(r16)
            r1.<init>(r0, r2)
            return r1
        L_0x02f1:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStage.mo79331h(long, com.tencent.mm.modelcontrol.VideoTransPara, te3.rq2, java.lang.String, com.tencent.mm.protocal.protobuf.FinderMediaReportObject, boolean, int, int, com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct):rx3.l");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x025e  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79332i(com.tencent.p014mm.modelcontrol.VideoTransPara r18, te3.C64689rq2 r19, java.lang.String r20, te3.C64689rq2 r21, int r22, com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject r23, float r24, float r25, boolean r26) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r9 = r20
            r10 = r21
            r3 = r23
            r11 = r25
            r12 = r26
            java.lang.Class<tz.e> r13 = p707tz.C64999e.class
            java.lang.String r4 = "videoParams"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.String r4 = "localMedia"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.String r4 = "outputPath"
            gy3.C87412m.m108594g(r9, r4)
            java.lang.String r4 = "media"
            gy3.C87412m.m108594g(r10, r4)
            java.lang.String r4 = "reportObject"
            gy3.C87412m.m108594g(r3, r4)
            er1.w3 r4 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.sight.base.a r4 = r4.mo83971v0(r9)
            if (r4 == 0) goto L_0x0044
            int r5 = r4.f273445c
            float r6 = (float) r5
            r2.f185270h = r6
            int r4 = r4.f273446d
            float r6 = (float) r4
            r2.f185271i = r6
            float r5 = (float) r5
            r10.f185270h = r5
            float r4 = (float) r4
            r10.f185271i = r4
        L_0x0044:
            int r4 = r0.f267179t
            float r5 = r2.f185271i
            float r6 = r2.f185270h
            float r5 = r5 / r6
            float r6 = (float) r4
            float r5 = r5 * r6
            int r5 = (int) r5
            uq1.e r6 = uq1.C65433e.f188292a
            r14 = 0
            java.lang.String r15 = r6.mo89555f(r9, r4, r5, r14)
            up1.f r7 = up1.C37521f.f99374d
            boolean r8 = r7.mo61155I()
            r14 = 0
            if (r8 == 0) goto L_0x006d
            r7.getClass()
            int r7 = up1.C37521f.f99419i
            r8 = 1061997773(0x3f4ccccd, float:0.8)
            int r4 = com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate.m119559e(r7, r14, r4, r5, r8)
            r8 = r4
            goto L_0x006e
        L_0x006d:
            r8 = 0
        L_0x006e:
            r10.f185262W0 = r3
            r10.f185266d = r9
            r10.f185267e = r15
            if (r12 != 0) goto L_0x015d
            boolean r3 = r2.f185255T
            if (r3 != 0) goto L_0x015d
            te3.iq0 r3 = r10.f185248P
            if (r3 == 0) goto L_0x015d
            te3.zy r4 = r2.f185235B     // Catch:{ Exception -> 0x0136 }
            if (r4 == 0) goto L_0x015d
            te3.az r4 = r4.f186904i     // Catch:{ Exception -> 0x0136 }
            if (r4 == 0) goto L_0x015d
            android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ Exception -> 0x0136 }
            r5.<init>()     // Catch:{ Exception -> 0x0136 }
            te3.n93 r5 = r4.f297915z     // Catch:{ Exception -> 0x0136 }
            if (r5 == 0) goto L_0x00d1
            android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ Exception -> 0x0136 }
            r5.<init>()     // Catch:{ Exception -> 0x0136 }
            java.lang.Class<tz.f> r7 = p707tz.C65000f.class
            di3.d r7 = di3.C86312j.m106911c(r7)     // Catch:{ Exception -> 0x0136 }
            tz.f r7 = (p707tz.C65000f) r7     // Catch:{ Exception -> 0x0136 }
            te3.n93 r4 = r4.f297915z     // Catch:{ Exception -> 0x0136 }
            te3.ep3 r4 = r4.f184446d     // Catch:{ Exception -> 0x0136 }
            r7.mo89209x8(r4, r5)     // Catch:{ Exception -> 0x0136 }
            float r4 = r10.f185270h     // Catch:{ Exception -> 0x0136 }
            int r5 = r5.width()     // Catch:{ Exception -> 0x0136 }
            float r5 = (float) r5     // Catch:{ Exception -> 0x0136 }
            float r4 = r4 / r5
            android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ Exception -> 0x0136 }
            float r7 = r3.f183717d     // Catch:{ Exception -> 0x0136 }
            int r7 = (int) r7     // Catch:{ Exception -> 0x0136 }
            float r14 = r3.f183718e     // Catch:{ Exception -> 0x0136 }
            float r14 = r14 * r4
            int r14 = (int) r14
            r16 = r8
            float r8 = r3.f183719f     // Catch:{ Exception -> 0x0132 }
            float r8 = r8 * r4
            int r8 = (int) r8     // Catch:{ Exception -> 0x0132 }
            float r3 = r3.f183720g     // Catch:{ Exception -> 0x0132 }
            float r3 = r3 * r4
            int r3 = (int) r3     // Catch:{ Exception -> 0x0132 }
            r5.<init>(r7, r14, r8, r3)     // Catch:{ Exception -> 0x0132 }
            int r3 = r5.bottom     // Catch:{ Exception -> 0x0132 }
            float r3 = (float) r3     // Catch:{ Exception -> 0x0132 }
            float r4 = r10.f185271i     // Catch:{ Exception -> 0x0132 }
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x00f9
            int r3 = (int) r4     // Catch:{ Exception -> 0x0132 }
            r5.bottom = r3     // Catch:{ Exception -> 0x0132 }
            goto L_0x00f9
        L_0x00d1:
            r16 = r8
            float r5 = r10.f185270h     // Catch:{ Exception -> 0x0132 }
            int r7 = r4.f297897e     // Catch:{ Exception -> 0x0132 }
            float r7 = (float) r7     // Catch:{ Exception -> 0x0132 }
            float r5 = r5 / r7
            float r7 = r10.f185271i     // Catch:{ Exception -> 0x0132 }
            int r4 = r4.f297898f     // Catch:{ Exception -> 0x0132 }
            float r4 = (float) r4     // Catch:{ Exception -> 0x0132 }
            float r7 = r7 / r4
            android.graphics.Rect r4 = new android.graphics.Rect     // Catch:{ Exception -> 0x0132 }
            float r8 = r3.f183717d     // Catch:{ Exception -> 0x0132 }
            float r8 = r8 * r5
            int r8 = (int) r8     // Catch:{ Exception -> 0x0132 }
            float r14 = r3.f183718e     // Catch:{ Exception -> 0x0132 }
            float r14 = r14 * r7
            int r14 = (int) r14     // Catch:{ Exception -> 0x0132 }
            float r12 = r3.f183719f     // Catch:{ Exception -> 0x0132 }
            float r12 = r12 * r5
            int r5 = (int) r12     // Catch:{ Exception -> 0x0132 }
            float r3 = r3.f183720g     // Catch:{ Exception -> 0x0132 }
            float r3 = r3 * r7
            int r3 = (int) r3     // Catch:{ Exception -> 0x0132 }
            r4.<init>(r8, r14, r5, r3)     // Catch:{ Exception -> 0x0132 }
            r5 = r4
        L_0x00f9:
            int r0 = r0.f267179t     // Catch:{ Exception -> 0x0132 }
            int r3 = r5.height()     // Catch:{ Exception -> 0x0132 }
            float r3 = (float) r3     // Catch:{ Exception -> 0x0132 }
            int r4 = r5.width()     // Catch:{ Exception -> 0x0132 }
            float r4 = (float) r4     // Catch:{ Exception -> 0x0132 }
            float r3 = r3 / r4
            float r4 = (float) r0     // Catch:{ Exception -> 0x0132 }
            float r3 = r3 * r4
            int r7 = (int) r3     // Catch:{ Exception -> 0x0132 }
            er1.j5 r3 = er1.C58741j5.f168184a     // Catch:{ Exception -> 0x0132 }
            java.lang.String r8 = r3.mo83733g(r9)     // Catch:{ Exception -> 0x0132 }
            android.graphics.Rect r12 = new android.graphics.Rect     // Catch:{ Exception -> 0x0132 }
            int r3 = r5.left     // Catch:{ Exception -> 0x0132 }
            int r4 = r5.bottom     // Catch:{ Exception -> 0x0132 }
            int r14 = r5.right     // Catch:{ Exception -> 0x0132 }
            int r5 = r5.top     // Catch:{ Exception -> 0x0132 }
            r12.<init>(r3, r4, r14, r5)     // Catch:{ Exception -> 0x0132 }
            r3 = r6
            r4 = r20
            r5 = r8
            r6 = r0
            r14 = r16
            r8 = r12
            java.lang.String r0 = r3.mo89556g(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0130 }
            r10.f185267e = r0     // Catch:{ Exception -> 0x0130 }
            r10.f185239F = r15     // Catch:{ Exception -> 0x0130 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0130 }
            goto L_0x015e
        L_0x0130:
            r0 = move-exception
            goto L_0x0138
        L_0x0132:
            r0 = move-exception
            r14 = r16
            goto L_0x0138
        L_0x0136:
            r0 = move-exception
            r14 = r8
        L_0x0138:
            java.lang.String r3 = r1.f161472i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "crop halfThumb from "
            r4.append(r5)
            r4.append(r15)
            java.lang.String r5 = " fail:"
            r4.append(r5)
            java.lang.String r0 = r0.getLocalizedMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x015d:
            r14 = r8
        L_0x015e:
            r3 = 0
            r10.f185280t = r3
            java.lang.String r0 = r2.f185266d
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)
            r10.f185275p = r0
            er1.w3 r0 = er1.C58784w3.f168295a
            java.lang.String r3 = r10.f185267e
            java.lang.String r0 = r0.mo83984z1(r3)
            r10.f185285x0 = r0
            long r3 = com.tencent.p014mm.vfs.C86013q1.m106451l(r20)
            int r0 = (int) r3
            r10.f185273n = r0
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r0 = r10.f185262W0
            if (r0 != 0) goto L_0x017f
            goto L_0x0186
        L_0x017f:
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r3 = new com.tencent.mm.protocal.protobuf.FinderMediaReportInfo
            r3.<init>()
            r0.target = r3
        L_0x0186:
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r0 = r10.f185262W0
            if (r0 == 0) goto L_0x018d
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r3 = r0.target
            goto L_0x018e
        L_0x018d:
            r3 = 0
        L_0x018e:
            if (r3 != 0) goto L_0x0191
            goto L_0x0195
        L_0x0191:
            int r4 = r10.f185273n
            r3.fileSize = r4
        L_0x0195:
            if (r0 != 0) goto L_0x0198
            goto L_0x01a4
        L_0x0198:
            if (r0 == 0) goto L_0x01a1
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r3 = r0.target
            if (r3 == 0) goto L_0x01a1
            int r3 = r3.fileSize
            goto L_0x01a2
        L_0x01a1:
            r3 = 0
        L_0x01a2:
            r0.videoFinalSize = r3
        L_0x01a4:
            te3.zy r0 = r10.f185235B
            r3 = 0
            if (r0 != 0) goto L_0x01aa
            goto L_0x01ac
        L_0x01aa:
            r0.f186905j = r3
        L_0x01ac:
            te3.xb1 r0 = r10.f185236C
            if (r0 != 0) goto L_0x01b7
            te3.xb1 r0 = new te3.xb1
            r0.<init>()
            r10.f185236C = r0
        L_0x01b7:
            te3.xb1 r0 = r10.f185236C
            if (r0 == 0) goto L_0x023f
            r0.f186282d = r11
            r4 = r24
            r0.f186284f = r4
            float r4 = (float) r14
            r0.f186285g = r4
            te3.zy r4 = r10.f185235B
            if (r4 == 0) goto L_0x01d5
            te3.yy r4 = r4.f186906n
            if (r4 == 0) goto L_0x01d5
            java.util.LinkedList<te3.ea> r4 = r4.f186611e
            if (r4 == 0) goto L_0x01d5
            int r4 = r4.size()
            goto L_0x01d6
        L_0x01d5:
            r4 = 0
        L_0x01d6:
            r5 = 1
            if (r4 <= 0) goto L_0x01db
            r4 = 1
            goto L_0x01dc
        L_0x01db:
            r4 = 0
        L_0x01dc:
            r0.f186287i = r4
            te3.nr3 r4 = r10.f185258U0
            if (r4 == 0) goto L_0x01e8
            int r4 = r4.f184548n
            if (r4 != r5) goto L_0x01e8
            r14 = 1
            goto L_0x01e9
        L_0x01e8:
            r14 = 0
        L_0x01e9:
            r0.f186288j = r14
            java.lang.String r3 = r1.f161472i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "codec_info use_algorithm_cover:"
            r4.append(r5)
            boolean r5 = r0.f186288j
            r4.append(r5)
            java.lang.String r5 = " video_score:"
            r4.append(r5)
            float r5 = r0.f186282d
            r4.append(r5)
            java.lang.String r5 = ",video_cover_score:"
            r4.append(r5)
            float r5 = r0.f186283e
            r4.append(r5)
            java.lang.String r5 = ",video_audio_score:"
            r4.append(r5)
            float r5 = r0.f186284f
            r4.append(r5)
            java.lang.String r5 = ",thumb_score:"
            r4.append(r5)
            float r5 = r0.f186285g
            r4.append(r5)
            java.lang.String r5 = ",hdimg_score:"
            r4.append(r5)
            float r5 = r0.f186286h
            r4.append(r5)
            java.lang.String r5 = ",has_stickers:"
            r4.append(r5)
            boolean r0 = r0.f186287i
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x023f:
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r0 = r10.f185262W0
            if (r0 == 0) goto L_0x0246
            te3.xb1 r3 = r0.codecInfo
            goto L_0x0247
        L_0x0246:
            r3 = 0
        L_0x0247:
            if (r3 != 0) goto L_0x0250
            if (r0 != 0) goto L_0x024c
            goto L_0x0250
        L_0x024c:
            te3.xb1 r3 = r10.f185236C
            r0.codecInfo = r3
        L_0x0250:
            java.lang.Class<rw.m> r0 = p232rw.C63679m.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            rw.m r0 = (p232rw.C63679m) r0
            rw.m$a r0 = r0.mo88483M1(r9)
            if (r0 == 0) goto L_0x02bc
            long r3 = r0.f180528d
            float r3 = (float) r3
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r4
            int r3 = iy3.C60641c.m70921b(r3)
            r10.f185269g = r3
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r3 = r10.f185262W0
            if (r3 == 0) goto L_0x0271
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r4 = r3.target
            goto L_0x0272
        L_0x0271:
            r4 = 0
        L_0x0272:
            if (r4 != 0) goto L_0x0275
            goto L_0x027a
        L_0x0275:
            long r5 = r0.f180528d
            int r6 = (int) r5
            r4.videoDuration = r6
        L_0x027a:
            if (r3 == 0) goto L_0x027f
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r4 = r3.target
            goto L_0x0280
        L_0x027f:
            r4 = 0
        L_0x0280:
            if (r4 != 0) goto L_0x0283
            goto L_0x0287
        L_0x0283:
            int r5 = r0.f180525a
            r4.width = r5
        L_0x0287:
            if (r3 == 0) goto L_0x028c
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r4 = r3.target
            goto L_0x028d
        L_0x028c:
            r4 = 0
        L_0x028d:
            if (r4 != 0) goto L_0x0290
            goto L_0x0294
        L_0x0290:
            int r5 = r0.f180526b
            r4.height = r5
        L_0x0294:
            if (r3 == 0) goto L_0x0299
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r4 = r3.target
            goto L_0x029a
        L_0x0299:
            r4 = 0
        L_0x029a:
            if (r4 != 0) goto L_0x029d
            goto L_0x02a1
        L_0x029d:
            int r5 = r0.f180529e
            r4.videoBitrate = r5
        L_0x02a1:
            if (r3 == 0) goto L_0x02a6
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r4 = r3.target
            goto L_0x02a7
        L_0x02a6:
            r4 = 0
        L_0x02a7:
            if (r4 != 0) goto L_0x02aa
            goto L_0x02ae
        L_0x02aa:
            int r5 = r0.f180532h
            r4.audioBitrate = r5
        L_0x02ae:
            if (r3 == 0) goto L_0x02b3
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r14 = r3.target
            goto L_0x02b4
        L_0x02b3:
            r14 = 0
        L_0x02b4:
            if (r14 != 0) goto L_0x02b7
            goto L_0x02bc
        L_0x02b7:
            float r0 = r0.f180527c
            int r0 = (int) r0
            r14.fps = r0
        L_0x02bc:
            java.lang.String r0 = r1.f161472i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "processList index "
            r3.append(r4)
            r4 = r22
            r3.append(r4)
            java.lang.String r4 = " url "
            r3.append(r4)
            java.lang.String r4 = r2.f185266d
            r3.append(r4)
            java.lang.String r4 = " thumbUrl: "
            r3.append(r4)
            java.lang.String r4 = r2.f185267e
            r3.append(r4)
            java.lang.String r4 = " newMd5: "
            r3.append(r4)
            java.lang.String r4 = r2.f185266d
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r4)
            r3.append(r4)
            java.lang.String r4 = " size:"
            r3.append(r4)
            java.lang.String r2 = r2.f185266d
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            di3.d r0 = di3.C86312j.m106911c(r13)
            tz.e r0 = (p707tz.C64999e) r0
            r2 = r26
            r0.R60(r9, r11, r2)
            di3.d r0 = di3.C86312j.m106911c(r13)
            tz.e r0 = (p707tz.C64999e) r0
            r0.mo89163kC()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStage.mo79332i(com.tencent.mm.modelcontrol.VideoTransPara, te3.rq2, java.lang.String, te3.rq2, int, com.tencent.mm.protocal.protobuf.FinderMediaReportObject, float, float, boolean):void");
    }

    /* renamed from: j */
    public final void mo79333j(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        C37521f.f99374d.getClass();
        int i = (int) (((float) C37521f.f99138C) * f);
        String str = this.f161472i;
        Log.m105924i(str, "feed " + this.f161471h.field_localId + " updateProgress  " + f + ", " + i);
        if (this.f161473j.getPostInfo().f185649h < i) {
            this.f161473j.getPostInfo().f185649h = i;
            C66166c.f190172a.mo90231b(this.f161471h);
        }
        FeedPostProgressEvent feedPostProgressEvent = new FeedPostProgressEvent();
        FeedPostProgressEvent.C55119a aVar = feedPostProgressEvent.f154751d;
        aVar.f154752a = this.f161471h.field_localId;
        aVar.f154753b = this.f161473j.getPostInfo().f185649h;
        feedPostProgressEvent.publish();
    }
}
