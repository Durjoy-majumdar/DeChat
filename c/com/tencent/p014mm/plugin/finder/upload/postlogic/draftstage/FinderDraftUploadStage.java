package com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.protocal.protobuf.FinderMediaReportInfo;
import com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import dp1.C58386m;
import eb0.C31543z5;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import p1081gi.C98124g;
import p707tz.C65000f;
import rx3.C13598b0;
import te3.C64689rq2;
import te3.C64736tq2;
import up1.C65418l;
import wp1.C66166c;
import wq1.C66177f;
import xq1.C66408e;
import z04.C112551y;
import zq1.C66961c;

/* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage */
public final class FinderDraftUploadStage extends C66177f {

    /* renamed from: A */
    public final C56477a f161493A;

    /* renamed from: h */
    public C65418l f161494h;

    /* renamed from: i */
    public final String f161495i = "LogPost.FinderDraftUploadStage";

    /* renamed from: j */
    public final FinderItem f161496j;

    /* renamed from: n */
    public final C64736tq2 f161497n;

    /* renamed from: o */
    public final Map<String, Float> f161498o;

    /* renamed from: p */
    public final ConcurrentLinkedQueue<String> f161499p;

    /* renamed from: q */
    public long f161500q;

    /* renamed from: r */
    public boolean f161501r;

    /* renamed from: s */
    public List<C64689rq2> f161502s;

    /* renamed from: t */
    public boolean f161503t;

    /* renamed from: u */
    public List<String> f161504u;

    /* renamed from: v */
    public final List<C98124g> f161505v;

    /* renamed from: w */
    public byte[] f161506w;

    /* renamed from: x */
    public C66408e f161507x;

    /* renamed from: y */
    public CountDownLatch f161508y;

    /* renamed from: z */
    public final FinderDraftUploadStage$draftModifyListener$1 f161509z;

    /* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage$a */
    public static final class C56477a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ FinderDraftUploadStage f161510d;

        public C56477a(FinderDraftUploadStage finderDraftUploadStage) {
            this.f161510d = finderDraftUploadStage;
        }

        /* JADX WARNING: Removed duplicated region for block: B:113:0x038c  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x03e8  */
        /* JADX WARNING: Removed duplicated region for block: B:200:0x0570  */
        /* renamed from: g0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo1773g0(java.lang.String r17, int r18, p1081gi.C98120c r19, p1081gi.C98121d r20, boolean r21) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                r2 = r18
                r3 = r19
                r4 = r20
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r5 = r0.f161510d
                java.lang.String r5 = r5.f161495i
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "on cdn callback someOneFailed:"
                r6.append(r7)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r7 = r0.f161510d
                boolean r7 = r7.f161503t
                r6.append(r7)
                java.lang.String r7 = ", mediaId = %s, startRet = %d, sceneResult %s"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                r7 = 3
                java.lang.Object[] r8 = new java.lang.Object[r7]
                r9 = 0
                r8[r9] = r1
                java.lang.Integer r10 = java.lang.Integer.valueOf(r18)
                r11 = 1
                r8[r11] = r10
                if (r4 == 0) goto L_0x003d
                java.lang.String r10 = r20.toString()
                if (r10 != 0) goto L_0x003f
            L_0x003d:
                java.lang.String r10 = "null"
            L_0x003f:
                r12 = 2
                r8[r12] = r10
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r8)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r5 = r0.f161510d
                boolean r6 = r5.f161501r
                if (r6 != 0) goto L_0x0583
                boolean r6 = r5.f161503t
                if (r6 == 0) goto L_0x0051
                goto L_0x0583
            L_0x0051:
                r5.getClass()
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r17)
                if (r6 != 0) goto L_0x0139
                java.util.Map<java.lang.String, java.lang.Float> r6 = r5.f161498o
                boolean r6 = r6.containsKey(r1)
                if (r6 == 0) goto L_0x0139
                if (r3 != 0) goto L_0x0066
                goto L_0x0139
            L_0x0066:
                r6 = 1065353216(0x3f800000, float:1.0)
                long r13 = r3.field_finishedLength
                float r8 = (float) r13
                float r8 = r8 * r6
                long r13 = r3.field_toltalLength
                float r6 = (float) r13
                float r8 = r8 / r6
                java.lang.String r6 = r5.f161495i
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r13 = "finished "
                r10.append(r13)
                long r13 = r3.field_finishedLength
                r10.append(r13)
                java.lang.String r13 = ", total "
                r10.append(r13)
                long r13 = r3.field_toltalLength
                r10.append(r13)
                java.lang.String r3 = ", progress "
                r10.append(r3)
                r10.append(r8)
                java.lang.String r3 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r3)
                java.util.Map<java.lang.String, java.lang.Float> r3 = r5.f161498o
                java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
                java.lang.Object r3 = r3.get(r1)
                gy3.C87412m.m108591d(r3)
                java.lang.Number r3 = (java.lang.Number) r3
                float r3 = r3.floatValue()
                int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r3 <= 0) goto L_0x00bc
                java.util.Map<java.lang.String, java.lang.Float> r3 = r5.f161498o
                gy3.C87412m.m108591d(r17)
                java.lang.Float r6 = java.lang.Float.valueOf(r8)
                r3.put(r1, r6)
            L_0x00bc:
                java.util.Map<java.lang.String, java.lang.Float> r3 = r5.f161498o
                java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
                java.util.Collection r3 = r3.values()
                float r3 = sx3.C110818d0.m150944p0(r3)
                java.util.Map<java.lang.String, java.lang.Float> r6 = r5.f161498o
                int r6 = r6.size()
                float r6 = (float) r6
                float r3 = r3 / r6
                up1.f r6 = up1.C37521f.f99374d
                r6.getClass()
                int r6 = up1.C37521f.f99147D
                float r8 = (float) r6
                float r8 = r8 * r3
                int r8 = (int) r8
                int r6 = r6 + r8
                java.lang.String r8 = r5.f161495i
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r13 = "feed "
                r10.append(r13)
                up1.l r13 = r5.f161494h
                long r13 = r13.field_localId
                r10.append(r13)
                java.lang.String r13 = " updateProgress  "
                r10.append(r13)
                r10.append(r3)
                java.lang.String r3 = ", "
                r10.append(r3)
                r10.append(r6)
                java.lang.String r3 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r5.f161496j
                te3.tq2 r3 = r3.getPostInfo()
                int r3 = r3.f185649h
                if (r3 >= r6) goto L_0x011f
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r5.f161496j
                te3.tq2 r3 = r3.getPostInfo()
                r3.f185649h = r6
                wp1.c r3 = wp1.C66166c.f190172a
                up1.l r6 = r5.f161494h
                r3.mo90231b(r6)
            L_0x011f:
                com.tencent.mm.autogen.events.FeedPostProgressEvent r3 = new com.tencent.mm.autogen.events.FeedPostProgressEvent
                r3.<init>()
                com.tencent.mm.autogen.events.FeedPostProgressEvent$a r6 = r3.f154751d
                up1.l r8 = r5.f161494h
                long r13 = r8.field_localId
                r6.f154752a = r13
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.f161496j
                te3.tq2 r5 = r5.getPostInfo()
                int r5 = r5.f185649h
                r6.f154753b = r5
                r3.publish()
            L_0x0139:
                java.lang.String r3 = ""
                r5 = 0
                if (r2 == 0) goto L_0x01de
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r4 = r0.f161510d
                java.lang.String r4 = r4.f161495i
                java.lang.Object[] r6 = new java.lang.Object[r12]
                java.lang.Integer r7 = java.lang.Integer.valueOf(r18)
                r6[r9] = r7
                r6[r11] = r1
                java.lang.String r7 = "start failed : %d, media id is :%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r7, r6)
                r4 = -21005(0xffffffffffffadf3, float:NaN)
                if (r2 == r4) goto L_0x01dd
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r4 = r0.f161510d
                java.util.List<java.lang.String> r4 = r4.f161504u
                if (r1 != 0) goto L_0x015d
                goto L_0x015e
            L_0x015d:
                r3 = r1
            L_0x015e:
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                r4.add(r3)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r3 = r0.f161510d
                r3.f161503t = r11
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.f161496j
                java.util.LinkedList r3 = r3.getHalfVideoMediaExtList()
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r4 = r0.f161510d
                java.util.Iterator r3 = r3.iterator()
            L_0x0173:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x018d
                java.lang.Object r6 = r3.next()
                r7 = r6
                te3.rq2 r7 = (te3.C64689rq2) r7
                java.lang.String r7 = r7.f185275p
                java.lang.String r8 = com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64817h(r4, r1)
                boolean r7 = gy3.C87412m.m108589b(r7, r8)
                if (r7 == 0) goto L_0x0173
                goto L_0x018e
            L_0x018d:
                r6 = r5
            L_0x018e:
                te3.rq2 r6 = (te3.C64689rq2) r6
                if (r6 == 0) goto L_0x0199
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r3 = r0.f161510d
                com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64819j(r3, r2, r6)
                rx3.b0 r3 = rx3.C13598b0.f38549a
            L_0x0199:
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r3 = r0.f161510d
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.f161496j
                java.util.LinkedList r3 = r3.getMediaList()
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r4 = r0.f161510d
                java.util.Iterator r3 = r3.iterator()
            L_0x01a7:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x01c1
                java.lang.Object r6 = r3.next()
                r7 = r6
                te3.rq2 r7 = (te3.C64689rq2) r7
                java.lang.String r7 = r7.f185275p
                java.lang.String r8 = com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64817h(r4, r1)
                boolean r7 = gy3.C87412m.m108589b(r7, r8)
                if (r7 == 0) goto L_0x01a7
                r5 = r6
            L_0x01c1:
                te3.rq2 r5 = (te3.C64689rq2) r5
                if (r5 == 0) goto L_0x01cc
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r1 = r0.f161510d
                com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64819j(r1, r2, r5)
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x01cc:
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r1 = r0.f161510d
                r1.mo79339p(r9)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r1 = r0.f161510d
                zq1.c r2 = new zq1.c
                up1.l r3 = r1.f161494h
                r2.<init>(r3, r12)
                com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64818i(r1, r2)
            L_0x01dd:
                return r9
            L_0x01de:
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r17)
                if (r2 != 0) goto L_0x0583
                if (r4 == 0) goto L_0x0583
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r2 = r0.f161510d
                java.lang.String r2 = r2.f161495i
                java.lang.Object[] r6 = new java.lang.Object[r7]
                int r7 = r4.field_retCode
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r6[r9] = r7
                java.lang.String r7 = r4.field_fileId
                r6[r11] = r7
                java.lang.String r7 = r4.field_fileUrl
                r6[r12] = r7
                java.lang.String r7 = "retCode %d, fileId %s, url %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r6)
                int r2 = r4.field_retCode
                if (r2 == 0) goto L_0x02c3
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r2 = r0.f161510d
                java.util.List<java.lang.String> r2 = r2.f161504u
                if (r1 != 0) goto L_0x020c
                goto L_0x020d
            L_0x020c:
                r3 = r1
            L_0x020d:
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                r2.add(r3)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r2 = r0.f161510d
                r2.f161503t = r11
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f161496j
                java.util.LinkedList r2 = r2.getHalfVideoMediaExtList()
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r3 = r0.f161510d
                java.util.Iterator r2 = r2.iterator()
            L_0x0222:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L_0x023c
                java.lang.Object r6 = r2.next()
                r7 = r6
                te3.rq2 r7 = (te3.C64689rq2) r7
                java.lang.String r7 = r7.f185275p
                java.lang.String r8 = com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64817h(r3, r1)
                boolean r7 = gy3.C87412m.m108589b(r7, r8)
                if (r7 == 0) goto L_0x0222
                goto L_0x023d
            L_0x023c:
                r6 = r5
            L_0x023d:
                te3.rq2 r6 = (te3.C64689rq2) r6
                if (r6 == 0) goto L_0x024a
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r2 = r0.f161510d
                int r3 = r4.field_retCode
                com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64819j(r2, r3, r6)
                rx3.b0 r2 = rx3.C13598b0.f38549a
            L_0x024a:
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r2 = r0.f161510d
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f161496j
                java.util.LinkedList r2 = r2.getMediaList()
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r3 = r0.f161510d
                java.util.Iterator r2 = r2.iterator()
            L_0x0258:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L_0x0272
                java.lang.Object r6 = r2.next()
                r7 = r6
                te3.rq2 r7 = (te3.C64689rq2) r7
                java.lang.String r7 = r7.f185275p
                java.lang.String r8 = com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64817h(r3, r1)
                boolean r7 = gy3.C87412m.m108589b(r7, r8)
                if (r7 == 0) goto L_0x0258
                goto L_0x0273
            L_0x0272:
                r6 = r5
            L_0x0273:
                te3.rq2 r6 = (te3.C64689rq2) r6
                if (r6 == 0) goto L_0x0280
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r2 = r0.f161510d
                int r3 = r4.field_retCode
                com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64819j(r2, r3, r6)
                rx3.b0 r2 = rx3.C13598b0.f38549a
            L_0x0280:
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r2 = r0.f161510d
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f161496j
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
                if (r2 == 0) goto L_0x0292
                te3.ve1 r2 = r2.feedBgmInfo
                if (r2 == 0) goto L_0x0292
                te3.td1 r5 = r2.f185873d
            L_0x0292:
                if (r5 == 0) goto L_0x02b1
                java.lang.String r2 = r5.f185539i
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r2)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r3 = r0.f161510d
                java.lang.String r1 = com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64817h(r3, r1)
                boolean r1 = gy3.C87412m.m108589b(r2, r1)
                if (r1 == 0) goto L_0x02b1
                com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r3 = 1530(0x5fa, double:7.56E-321)
                r5 = 3
                r7 = 1
                r2.mo175913w(r3, r5, r7)
            L_0x02b1:
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r1 = r0.f161510d
                r1.mo79339p(r9)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r1 = r0.f161510d
                zq1.c r2 = new zq1.c
                up1.l r3 = r1.f161494h
                r2.<init>(r3, r12)
                com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64818i(r1, r2)
                return r9
            L_0x02c3:
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r2 = r0.f161510d
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r2 = r2.f161499p
                r2.remove(r1)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r2 = r0.f161510d
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f161496j
                java.util.LinkedList r2 = r2.getMediaList()
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r6 = r0.f161510d
                com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.f161496j
                java.util.LinkedList r6 = r6.getHalfVideoMediaExtList()
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r7 = r0.f161510d
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r7 = r7.f161499p
                int r7 = r7.size()
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r8 = r0.f161510d
                java.lang.String r8 = r8.f161495i
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r13 = "%s waitToUpload %d media localId:"
                r10.append(r13)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r13 = r0.f161510d
                up1.l r13 = r13.f161494h
                long r13 = r13.field_localId
                r10.append(r13)
                java.lang.String r10 = r10.toString()
                java.lang.Object[] r12 = new java.lang.Object[r12]
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r13 = r0.f161510d
                up1.l r13 = r13.f161494h
                long r13 = r13.field_localId
                java.lang.Long r13 = java.lang.Long.valueOf(r13)
                r12[r9] = r13
                java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
                r12[r11] = r13
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r12)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r8 = r0.f161510d
                java.util.List<te3.rq2> r10 = r8.f161502s
                java.util.Iterator r10 = r10.iterator()
            L_0x031c:
                boolean r12 = r10.hasNext()
                if (r12 == 0) goto L_0x0336
                java.lang.Object r12 = r10.next()
                r13 = r12
                te3.rq2 r13 = (te3.C64689rq2) r13
                java.lang.String r13 = r13.f185275p
                java.lang.String r14 = com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64817h(r8, r1)
                boolean r13 = gy3.C87412m.m108589b(r13, r14)
                if (r13 == 0) goto L_0x031c
                goto L_0x0337
            L_0x0336:
                r12 = r5
            L_0x0337:
                if (r12 == 0) goto L_0x033b
                r8 = 1
                goto L_0x033c
            L_0x033b:
                r8 = 0
            L_0x033c:
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r10 = r0.f161510d
                java.util.Iterator r12 = r2.iterator()
            L_0x0342:
                boolean r13 = r12.hasNext()
                if (r13 == 0) goto L_0x035c
                java.lang.Object r13 = r12.next()
                r14 = r13
                te3.rq2 r14 = (te3.C64689rq2) r14
                java.lang.String r14 = r14.f185275p
                java.lang.String r15 = com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64817h(r10, r1)
                boolean r14 = gy3.C87412m.m108589b(r14, r15)
                if (r14 == 0) goto L_0x0342
                goto L_0x035d
            L_0x035c:
                r13 = r5
            L_0x035d:
                te3.rq2 r13 = (te3.C64689rq2) r13
                if (r13 != 0) goto L_0x0389
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r10 = r0.f161510d
                java.util.Iterator r6 = r6.iterator()
            L_0x0367:
                boolean r12 = r6.hasNext()
                if (r12 == 0) goto L_0x0381
                java.lang.Object r12 = r6.next()
                r13 = r12
                te3.rq2 r13 = (te3.C64689rq2) r13
                java.lang.String r13 = r13.f185275p
                java.lang.String r14 = com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64817h(r10, r1)
                boolean r13 = gy3.C87412m.m108589b(r13, r14)
                if (r13 == 0) goto L_0x0367
                goto L_0x0382
            L_0x0381:
                r12 = r5
            L_0x0382:
                r13 = r12
                te3.rq2 r13 = (te3.C64689rq2) r13
                if (r13 == 0) goto L_0x0389
                r6 = 1
                goto L_0x038a
            L_0x0389:
                r6 = 0
            L_0x038a:
                if (r13 == 0) goto L_0x03e6
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r10 = r0.f161510d
                java.lang.String r12 = r10.f161495i
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "hitMedia, isLongVideo:"
                r14.append(r15)
                r14.append(r8)
                java.lang.String r15 = ", isHalf:"
                r14.append(r15)
                r14.append(r6)
                java.lang.String r14 = r14.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r14)
                java.lang.String r12 = r13.f185266d
                java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r12)
                r13.f185275p = r12
                java.lang.String r12 = r4.field_fileUrl
                r13.f185278r = r12
                java.lang.String r12 = r4.field_thumbUrl
                r13.f185279s = r12
                java.lang.String r12 = r4.field_filemd5
                r13.f185272j = r12
                if (r8 != 0) goto L_0x03d1
                if (r6 == 0) goto L_0x03c8
                com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64819j(r10, r9, r13)
                goto L_0x03df
            L_0x03c8:
                com.tencent.mm.plugin.finder.storage.FinderItem r6 = r10.f161496j
                r6.setMediaList(r2)
                com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64819j(r10, r9, r13)
                goto L_0x03df
            L_0x03d1:
                r2.clear()
                r2.add(r13)
                com.tencent.mm.plugin.finder.storage.FinderItem r6 = r10.f161496j
                r6.setMediaList(r2)
                com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64819j(r10, r9, r13)
            L_0x03df:
                wp1.c r6 = wp1.C66166c.f190172a
                up1.l r8 = r10.f161494h
                r6.mo90231b(r8)
            L_0x03e6:
                if (r13 != 0) goto L_0x056e
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r6 = r0.f161510d
                com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.f161496j
                com.tencent.mm.protocal.protobuf.FinderObject r6 = r6.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r6.objectDesc
                if (r6 == 0) goto L_0x03fb
                te3.ve1 r6 = r6.feedBgmInfo
                if (r6 == 0) goto L_0x03fb
                te3.td1 r6 = r6.f185873d
                goto L_0x03fc
            L_0x03fb:
                r6 = r5
            L_0x03fc:
                if (r6 == 0) goto L_0x0461
                java.lang.String r6 = r6.f185539i
                if (r6 != 0) goto L_0x0403
                r6 = r3
            L_0x0403:
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r6)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r8 = r0.f161510d
                java.lang.String r8 = com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64817h(r8, r1)
                boolean r6 = gy3.C87412m.m108589b(r6, r8)
                if (r6 == 0) goto L_0x0461
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r1 = r0.f161510d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.f161496j
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x0426
                te3.ve1 r1 = r1.feedBgmInfo
                if (r1 == 0) goto L_0x0426
                te3.td1 r1 = r1.f185873d
                goto L_0x0427
            L_0x0426:
                r1 = r5
            L_0x0427:
                if (r1 != 0) goto L_0x042a
                goto L_0x042e
            L_0x042a:
                java.lang.String r2 = r4.field_fileUrl
                r1.f185539i = r2
            L_0x042e:
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r1 = r0.f161510d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.f161496j
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x0441
                te3.ve1 r1 = r1.feedBgmInfo
                if (r1 == 0) goto L_0x0441
                te3.td1 r1 = r1.f185873d
                goto L_0x0442
            L_0x0441:
                r1 = r5
            L_0x0442:
                if (r1 != 0) goto L_0x0445
                goto L_0x0447
            L_0x0445:
                r1.f185534d = r3
            L_0x0447:
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r1 = r0.f161510d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.f161496j
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x0459
                te3.ve1 r1 = r1.feedBgmInfo
                if (r1 == 0) goto L_0x0459
                te3.td1 r5 = r1.f185873d
            L_0x0459:
                if (r5 != 0) goto L_0x045d
                goto L_0x0565
            L_0x045d:
                r5.f185536f = r3
                goto L_0x0565
            L_0x0461:
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r6 = r0.f161510d
                java.util.Iterator r8 = r2.iterator()
            L_0x0467:
                boolean r10 = r8.hasNext()
                if (r10 == 0) goto L_0x0488
                java.lang.Object r10 = r8.next()
                r12 = r10
                te3.rq2 r12 = (te3.C64689rq2) r12
                java.lang.String r12 = r12.f185261W
                if (r12 != 0) goto L_0x0479
                r12 = r3
            L_0x0479:
                java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r12)
                java.lang.String r13 = com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64817h(r6, r1)
                boolean r12 = gy3.C87412m.m108589b(r12, r13)
                if (r12 == 0) goto L_0x0467
                goto L_0x0489
            L_0x0488:
                r10 = r5
            L_0x0489:
                te3.rq2 r10 = (te3.C64689rq2) r10
                if (r10 == 0) goto L_0x04bd
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r6 = r0.f161510d
                java.lang.String r8 = r6.f161495i
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "upload fullCover ok, url:"
                r12.append(r13)
                java.lang.String r13 = r4.field_fileUrl
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r12)
                java.lang.String r8 = r4.field_fileUrl
                r10.f185259V = r8
                java.util.List<te3.rq2> r6 = r6.f161502s
                java.lang.Object r6 = sx3.C110818d0.m150916N(r6)
                te3.rq2 r6 = (te3.C64689rq2) r6
                if (r6 != 0) goto L_0x04b7
                goto L_0x04bb
            L_0x04b7:
                java.lang.String r8 = r4.field_fileUrl
                r6.f185259V = r8
            L_0x04bb:
                rx3.b0 r6 = rx3.C13598b0.f38549a
            L_0x04bd:
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r6 = r0.f161510d
                java.util.Iterator r8 = r2.iterator()
            L_0x04c3:
                boolean r10 = r8.hasNext()
                if (r10 == 0) goto L_0x04e4
                java.lang.Object r10 = r8.next()
                r12 = r10
                te3.rq2 r12 = (te3.C64689rq2) r12
                java.lang.String r12 = r12.f185283w
                if (r12 != 0) goto L_0x04d5
                r12 = r3
            L_0x04d5:
                java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r12)
                java.lang.String r13 = com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64817h(r6, r1)
                boolean r12 = gy3.C87412m.m108589b(r12, r13)
                if (r12 == 0) goto L_0x04c3
                goto L_0x04e5
            L_0x04e4:
                r10 = r5
            L_0x04e5:
                te3.rq2 r10 = (te3.C64689rq2) r10
                if (r10 == 0) goto L_0x0519
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r6 = r0.f161510d
                java.lang.String r8 = r6.f161495i
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "upload cover ok, url:"
                r12.append(r13)
                java.lang.String r13 = r4.field_fileUrl
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r12)
                java.lang.String r8 = r4.field_fileUrl
                r10.f185237D = r8
                java.util.List<te3.rq2> r6 = r6.f161502s
                java.lang.Object r6 = sx3.C110818d0.m150916N(r6)
                te3.rq2 r6 = (te3.C64689rq2) r6
                if (r6 != 0) goto L_0x0513
                goto L_0x0517
            L_0x0513:
                java.lang.String r8 = r4.field_fileUrl
                r6.f185237D = r8
            L_0x0517:
                rx3.b0 r6 = rx3.C13598b0.f38549a
            L_0x0519:
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r6 = r0.f161510d
                java.util.Iterator r2 = r2.iterator()
            L_0x051f:
                boolean r8 = r2.hasNext()
                if (r8 == 0) goto L_0x0540
                java.lang.Object r8 = r2.next()
                r10 = r8
                te3.rq2 r10 = (te3.C64689rq2) r10
                java.lang.String r10 = r10.f185239F
                if (r10 != 0) goto L_0x0531
                r10 = r3
            L_0x0531:
                java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r10)
                java.lang.String r12 = com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64817h(r6, r1)
                boolean r10 = gy3.C87412m.m108589b(r10, r12)
                if (r10 == 0) goto L_0x051f
                r5 = r8
            L_0x0540:
                te3.rq2 r5 = (te3.C64689rq2) r5
                if (r5 == 0) goto L_0x0565
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r1 = r0.f161510d
                java.lang.String r1 = r1.f161495i
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "upload fullThumb ok, url:"
                r2.append(r3)
                java.lang.String r3 = r4.field_fileUrl
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                java.lang.String r1 = r4.field_fileUrl
                r5.f185241H = r1
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x0565:
                wp1.c r1 = wp1.C66166c.f190172a
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r2 = r0.f161510d
                up1.l r2 = r2.f161494h
                r1.mo90231b(r2)
            L_0x056e:
                if (r7 != 0) goto L_0x0583
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r1 = r0.f161510d
                r1.mo79339p(r11)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage r1 = r0.f161510d
                zq1.g r2 = new zq1.g
                up1.l r3 = r1.f161494h
                byte[] r4 = r1.f161506w
                r2.<init>(r3, r4)
                com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.m64818i(r1, r2)
            L_0x0583:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.C56477a.mo1773g0(java.lang.String, int, gi.c, gi.d, boolean):int");
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderDraftUploadStage(C65418l lVar) {
        super("draft_" + lVar.field_localId);
        C87412m.m108594g(lVar, "draftItem");
        this.f161494h = lVar;
        FinderItem l2 = lVar.mo89514l2();
        this.f161496j = l2;
        this.f161497n = l2.getPostInfo();
        this.f161498o = new LinkedHashMap();
        this.f161499p = new ConcurrentLinkedQueue<>();
        this.f161502s = new ArrayList();
        this.f161504u = new ArrayList();
        this.f161505v = new ArrayList();
        this.f161507x = new C66961c(this.f161494h, 2);
        this.f161508y = new CountDownLatch(1);
        this.f161509z = new FinderDraftUploadStage$draftModifyListener$1(this, C40008f.f107254d);
        this.f161493A = new C56477a(this);
    }

    /* renamed from: h */
    public static final String m64817h(FinderDraftUploadStage finderDraftUploadStage, String str) {
        finderDraftUploadStage.getClass();
        boolean z = true;
        if (str == null || !C112551y.m153819s(str, "uploaddraft_", false)) {
            z = false;
        }
        if (z) {
            String substring = str.substring(12);
            C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        if (str == null) {
            str = "";
        }
        return str;
    }

    /* renamed from: i */
    public static final void m64818i(FinderDraftUploadStage finderDraftUploadStage, C66408e eVar) {
        Log.m105924i(finderDraftUploadStage.f161495i, "");
        finderDraftUploadStage.f161509z.dead();
        finderDraftUploadStage.f161507x = eVar;
        finderDraftUploadStage.f161508y.countDown();
    }

    /* renamed from: j */
    public static final void m64819j(FinderDraftUploadStage finderDraftUploadStage, int i, C64689rq2 rq22) {
        finderDraftUploadStage.mo79334k(rq22);
        FinderMediaReportObject finderMediaReportObject = rq22.f185262W0;
        if (finderMediaReportObject != null) {
            finderMediaReportObject.cdnUploadRetCode = i;
        }
        FinderItem finderItem = finderDraftUploadStage.f161496j;
        FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.retryCount = finderItem.getPostInfo().f185646e;
            finderFeedReportObject.cdnEndTime = C31543z5.m39453c();
            if (i == 0) {
                finderFeedReportObject.mediaList.add(rq22.f185262W0);
            }
        }
    }

    /* renamed from: a */
    public int mo75100a() {
        return 3;
    }

    /* renamed from: d */
    public void mo75102d(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
        boolean isLongVideo = this.f161496j.isLongVideo();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1718, 22, 1);
        if (isLongVideo) {
            if ((1718 == 1718 ? 1719 : 0) > 0) {
                nVar.mo175913w(1718 == 1718 ? 1719 : 0, 22, 1);
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
        boolean isLongVideo = this.f161496j.isLongVideo();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1718, 22, 1);
        if (isLongVideo) {
            if ((1718 == 1718 ? 1719 : 0) > 0) {
                nVar.mo175913w(1718 == 1718 ? 1719 : 0, 22, 1);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v18, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x04f9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0521 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xq1.C66408e mo75105g() {
        /*
            r30 = this;
            r1 = r30
            java.lang.String r0 = r1.f161495i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "start localId:"
            r2.append(r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.f161496j
            long r3 = r3.getLocalId()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage$draftModifyListener$1 r0 = r1.f161509z
            r0.alive()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161496j
            java.lang.String r2 = "upload"
            r0.trackDraftPost(r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161496j
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            if (r0 != 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            r2 = 3
            r0.postStage = r2
        L_0x0036:
            long r2 = eb0.C31543z5.m39453c()
            r1.f161500q = r2
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99463n2
            java.lang.Object r2 = r0.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 <= 0) goto L_0x006c
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r2 != 0) goto L_0x005b
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r2 != 0) goto L_0x005b
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r2 == 0) goto L_0x006c
        L_0x005b:
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            java.lang.Thread.sleep(r2)
        L_0x006c:
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99562y
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2 = 2
            if (r0 != r2) goto L_0x0083
            zq1.c r0 = new zq1.c
            up1.l r3 = r1.f161494h
            r0.<init>(r3, r2)
            return r0
        L_0x0083:
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161496j
            java.util.LinkedList r0 = r0.getHalfVideoMediaExtList()
            r3.addAll(r0)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161496j
            boolean r0 = r0.isLongVideo()
            if (r0 == 0) goto L_0x00a9
            r3.clear()
            java.util.List<te3.rq2> r0 = r1.f161502s
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.f161496j
            java.util.LinkedList r4 = r4.getMediaList()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r4)
        L_0x00a9:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161496j
            java.util.LinkedList r0 = r0.getMediaList()
            r3.addAll(r0)
            java.lang.Class<qo.l> r4 = p663qo.C101213l.class
            java.lang.String r5 = ""
            r6 = 0
            te3.tq2 r0 = r1.f161497n     // Catch:{ Exception -> 0x00c8 }
            r0.f185647f = r6     // Catch:{ Exception -> 0x00c8 }
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r1.f161496j     // Catch:{ Exception -> 0x00c8 }
            r7.setPostInfo(r0)     // Catch:{ Exception -> 0x00c8 }
            wp1.c r0 = wp1.C66166c.f190172a     // Catch:{ Exception -> 0x00c8 }
            up1.l r7 = r1.f161494h     // Catch:{ Exception -> 0x00c8 }
            r0.mo90231b(r7)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00d0
        L_0x00c8:
            r0 = move-exception
            java.lang.String r7 = r1.f161495i
            java.lang.Object[] r8 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r5, r8)
        L_0x00d0:
            java.util.List<gi.g> r0 = r1.f161505v
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161496j
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x00e4
            te3.ve1 r0 = r0.feedBgmInfo
            goto L_0x00e5
        L_0x00e4:
            r0 = 0
        L_0x00e5:
            java.lang.String r8 = "info.field_mediaId"
            java.lang.String r9 = " is not file"
            r11 = 8
            r12 = 20302(0x4f4e, float:2.8449E-41)
            r13 = 600(0x258, float:8.41E-43)
            r14 = 251(0xfb, float:3.52E-43)
            r15 = 1
            if (r0 == 0) goto L_0x01c8
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161496j
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x0108
            te3.ve1 r0 = r0.feedBgmInfo
            if (r0 == 0) goto L_0x0108
            int r0 = r0.f185875f
            if (r0 != r15) goto L_0x0108
            r0 = 1
            goto L_0x0109
        L_0x0108:
            r0 = 0
        L_0x0109:
            if (r0 == 0) goto L_0x01c8
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161496j
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x011c
            te3.ve1 r0 = r0.feedBgmInfo
            if (r0 == 0) goto L_0x011c
            te3.td1 r0 = r0.f185873d
            goto L_0x011d
        L_0x011c:
            r0 = 0
        L_0x011d:
            if (r0 == 0) goto L_0x01c8
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161496j
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x0134
            te3.ve1 r0 = r0.feedBgmInfo
            if (r0 == 0) goto L_0x0134
            te3.td1 r0 = r0.f185873d
            if (r0 == 0) goto L_0x0134
            java.lang.String r0 = r0.f185534d
            goto L_0x0135
        L_0x0134:
            r0 = 0
        L_0x0135:
            if (r0 == 0) goto L_0x0140
            int r0 = r0.length()
            if (r0 != 0) goto L_0x013e
            goto L_0x0140
        L_0x013e:
            r0 = 0
            goto L_0x0141
        L_0x0140:
            r0 = 1
        L_0x0141:
            if (r0 == 0) goto L_0x01c8
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161496j
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x01c8
            te3.ve1 r0 = r0.feedBgmInfo
            if (r0 == 0) goto L_0x01c8
            te3.td1 r0 = r0.f185873d
            if (r0 == 0) goto L_0x01c8
            java.lang.String r0 = r0.f185539i
            if (r0 == 0) goto L_0x01c8
            java.lang.String r7 = "http"
            boolean r7 = z04.C112551y.m153819s(r0, r7, r15)
            if (r7 != 0) goto L_0x01c8
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r7 != 0) goto L_0x0181
            java.lang.String r7 = r1.f161495i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "audio track "
            r6.append(r10)
            r6.append(r0)
            r6.append(r9)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x01c8
        L_0x0181:
            gi.g r6 = new gi.g
            r6.<init>()
            com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage$a r7 = r1.f161493A
            r6.f287662f = r7
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)
            java.lang.String r10 = "getMD5String(path)"
            gy3.C87412m.m108593f(r7, r10)
            java.lang.String r7 = r1.mo79337n(r7)
            r6.field_mediaId = r7
            r6.field_fullpath = r0
            r6.field_needStorage = r15
            r6.field_fileType = r12
            r6.field_appType = r14
            r6.f287655L = r11
            r6.field_bzScene = r2
            r0 = 60
            r6.f287673t = r0
            r6.f287674u = r13
            r6.field_priority = r2
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r0 = r1.f161499p
            r0.add(r7)
            java.util.Map<java.lang.String, java.lang.Float> r0 = r1.f161498o
            java.lang.String r7 = r6.field_mediaId
            gy3.C87412m.m108593f(r7, r8)
            r10 = 0
            java.lang.Float r13 = java.lang.Float.valueOf(r10)
            r0.put(r7, r13)
            java.util.List<gi.g> r0 = r1.f161505v
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r6)
        L_0x01c8:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161496j
            te3.tq2 r0 = r0.getPostInfo()
            te3.br3 r0 = r0.f185657s
            if (r0 == 0) goto L_0x01d5
            java.lang.String r0 = r0.f182331f
            goto L_0x01d6
        L_0x01d5:
            r0 = 0
        L_0x01d6:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r0 = r0 ^ r15
            if (r0 != 0) goto L_0x056b
            java.util.Iterator r0 = r3.iterator()
            r3 = 0
        L_0x01e2:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0593
            java.lang.Object r6 = r0.next()
            int r7 = r3 + 1
            if (r3 < 0) goto L_0x0566
            te3.rq2 r6 = (te3.C64689rq2) r6
            java.lang.String r10 = r6.f185266d
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            r11 = 4
            if (r10 != 0) goto L_0x0510
            java.lang.String r10 = r6.f185275p
            java.lang.String r14 = r1.f161495i
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "uploading media "
            r12.append(r13)
            r12.append(r10)
            java.lang.String r10 = ", "
            r12.append(r10)
            java.lang.String r10 = r6.f185266d
            r12.append(r10)
            java.lang.String r10 = " size:"
            r12.append(r10)
            java.lang.String r13 = r6.f185266d
            long r18 = com.tencent.p014mm.vfs.C86013q1.m106451l(r13)
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r18)
            r12.append(r13)
            java.lang.String r13 = " thumb: "
            r12.append(r13)
            java.lang.String r13 = r6.f185267e
            r12.append(r13)
            r12.append(r10)
            java.lang.String r13 = r6.f185267e
            long r18 = com.tencent.p014mm.vfs.C86013q1.m106451l(r13)
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r18)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r12)
            java.lang.String r12 = r6.f185278r
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 != 0) goto L_0x0274
            java.lang.String r12 = r6.f185279s
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 != 0) goto L_0x0274
            java.lang.String r10 = r1.f161495i
            java.lang.String r12 = "mediaObject svr_url and svr_thumbUrl exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r12)
            int r10 = r1.mo79340q(r6)
            r1.mo79341r(r6)
            if (r10 == 0) goto L_0x026b
            goto L_0x026f
        L_0x026b:
            int r10 = r1.mo79342s(r6)
        L_0x026f:
            r20 = r3
            r15 = r10
            goto L_0x0318
        L_0x0274:
            java.lang.String r12 = r6.f185266d
            boolean r12 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
            if (r12 != 0) goto L_0x029b
            java.lang.String r10 = r1.f161495i
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "mediaObject.url "
            r12.append(r13)
            java.lang.String r13 = r6.f185266d
            r12.append(r13)
            r12.append(r9)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r12)
            r20 = r3
            goto L_0x0318
        L_0x029b:
            gi.g r12 = new gi.g
            r12.<init>()
            java.lang.String r13 = "task_FinderUploadTask_1"
            r12.f287660d = r13
            com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage$a r13 = r1.f161493A
            r12.f287662f = r13
            java.lang.String r13 = r6.f185266d
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r13)
            java.lang.String r14 = "getMD5String(mediaObject.url)"
            gy3.C87412m.m108593f(r13, r14)
            java.lang.String r13 = r1.mo79337n(r13)
            r12.field_mediaId = r13
            java.lang.String r13 = r6.f185266d
            r12.field_fullpath = r13
            java.lang.String r13 = r6.f185267e
            r12.field_thumbpath = r13
            r12.field_talker = r5
            r12.field_needStorage = r15
            java.lang.String r13 = r1.f161495i
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "upload file length "
            r14.append(r15)
            java.lang.String r15 = r6.f185266d
            r20 = r3
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r15)
            r14.append(r2)
            java.lang.String r2 = " mediaId: "
            r14.append(r2)
            java.lang.String r2 = r12.field_mediaId
            r14.append(r2)
            java.lang.String r2 = " localId:"
            r14.append(r2)
            up1.l r2 = r1.f161494h
            long r2 = r2.field_localId
            r14.append(r2)
            java.lang.String r2 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            int r2 = r6.f185268f
            r3 = 2
            if (r2 == r3) goto L_0x0472
            if (r2 == r11) goto L_0x031f
            r3 = 7
            if (r2 == r3) goto L_0x0472
            java.lang.String r3 = r1.f161495i
            r10 = 1
            java.lang.Object[] r12 = new java.lang.Object[r10]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10 = 0
            r12[r10] = r2
            java.lang.String r2 = "unknown media type %d, quit upload"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r2, r12)
            r15 = 0
        L_0x0318:
            r2 = 600(0x258, float:8.41E-43)
            r3 = 251(0xfb, float:3.52E-43)
            r13 = 0
            goto L_0x04e1
        L_0x031f:
            java.lang.Class<com.tencent.mm.feature.sight.api.ISightJNIService> r2 = com.tencent.p014mm.feature.sight.api.ISightJNIService.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            com.tencent.mm.feature.sight.api.ISightJNIService r2 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r2
            java.lang.String r3 = r12.field_fullpath
            boolean r2 = r2.optimizeMP4VFS(r3)
            er1.w3 r3 = er1.C58784w3.f168295a
            java.lang.String r13 = r12.field_fullpath
            java.lang.String r14 = "info.field_fullpath"
            gy3.C87412m.m108593f(r13, r14)
            boolean r3 = r3.mo83883L0(r13)
            java.lang.String r13 = r1.f161495i
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = r30.mo79338o()
            r14.append(r15)
            java.lang.String r15 = " optimize result: "
            r14.append(r15)
            r14.append(r2)
            java.lang.String r15 = ", isOptimize:"
            r14.append(r15)
            r14.append(r3)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r14)
            if (r2 != 0) goto L_0x037b
            ft1.a r21 = ft1.C59319a.f169618b
            r24 = 0
            r25 = 0
            r26 = 0
            zq1.i r2 = new zq1.i
            r2.<init>(r1)
            r28 = 28
            r29 = 0
            java.lang.String r22 = "optimizeMP4VFS_fail"
            r23 = r3
            r27 = r2
            o40.C11348f.C11349a.m11178b(r21, r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x037b:
            ft1.a r21 = ft1.C59319a.f169618b
            r24 = 0
            r25 = 0
            r26 = 0
            zq1.j r2 = new zq1.j
            r2.<init>(r1)
            r28 = 28
            r29 = 0
            java.lang.String r22 = "opt_moov_fail"
            r23 = r3
            r27 = r2
            o40.C11348f.C11349a.m11178b(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r2 = 20302(0x4f4e, float:2.8449E-41)
            r12.field_fileType = r2
            r3 = 251(0xfb, float:3.52E-43)
            r12.field_appType = r3
            r3 = 8
            r12.f287655L = r3
            r13 = 2
            r12.field_bzScene = r13
            r13 = 600(0x258, float:8.41E-43)
            r12.f287673t = r13
            r13 = 1200(0x4b0, float:1.682E-42)
            r12.f287674u = r13
            up1.f r14 = up1.C37521f.f99374d
            long r16 = r14.mo61164R()
            int r15 = r14.mo61179e()
            long r2 = (long) r15
            java.lang.String r15 = ", path:"
            int r22 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r22 > 0) goto L_0x03c7
            boolean r2 = r1.mo79336m(r6)
            if (r2 == 0) goto L_0x03c4
            goto L_0x03c7
        L_0x03c4:
            r22 = r14
            goto L_0x0418
        L_0x03c7:
            java.lang.String r2 = r12.field_fullpath
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            int r11 = r14.mo61179e()
            r22 = r14
            long r13 = (long) r11
            int r11 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0418
            com.tencent.mm.plugin.sight.base.a r2 = r1.mo79335l(r12)
            java.lang.String r3 = r1.f161495i
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "MultiBitrate_Video_Enable1, mediaInfo null?"
            r11.append(r13)
            if (r2 != 0) goto L_0x03ec
            r2 = 1
            goto L_0x03ed
        L_0x03ec:
            r2 = 0
        L_0x03ed:
            r11.append(r2)
            r11.append(r15)
            java.lang.String r2 = r12.field_fullpath
            r11.append(r2)
            java.lang.String r2 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            r1.mo79334k(r6)
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r2 = r6.f185262W0
            if (r2 != 0) goto L_0x0407
            goto L_0x040a
        L_0x0407:
            r3 = 1
            r2.isBigFile = r3
        L_0x040a:
            if (r2 != 0) goto L_0x040d
            goto L_0x0410
        L_0x040d:
            r3 = 0
            r2.cdnControl = r3
        L_0x0410:
            er1.b0 r2 = er1.C58695b0.f168022a
            er1.b0$a r3 = er1.C58695b0.f168023b
            r2.mo83612a(r3)
            goto L_0x045d
        L_0x0418:
            int r2 = r22.mo61181g()
            r3 = 1
            if (r2 != r3) goto L_0x045d
            com.tencent.mm.plugin.sight.base.a r2 = r1.mo79335l(r12)
            java.lang.String r3 = r1.f161495i
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "MultiBitrate_Video_Enable2, mediaInfo null?"
            r11.append(r13)
            if (r2 != 0) goto L_0x0433
            r2 = 1
            goto L_0x0434
        L_0x0433:
            r2 = 0
        L_0x0434:
            r11.append(r2)
            r11.append(r15)
            java.lang.String r2 = r12.field_fullpath
            r11.append(r2)
            java.lang.String r2 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            r1.mo79334k(r6)
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r2 = r6.f185262W0
            r3 = 1
            if (r2 != 0) goto L_0x044f
            goto L_0x0451
        L_0x044f:
            r2.isBigFile = r3
        L_0x0451:
            if (r2 != 0) goto L_0x0454
            goto L_0x0456
        L_0x0454:
            r2.cdnControl = r3
        L_0x0456:
            er1.b0 r2 = er1.C58695b0.f168022a
            er1.b0$a r3 = er1.C58695b0.f168023b
            r2.mo83612a(r3)
        L_0x045d:
            boolean r2 = r1.mo79336m(r6)
            if (r2 == 0) goto L_0x046c
            r2 = 600(0x258, float:8.41E-43)
            r12.f287673t = r2
            r3 = 1200(0x4b0, float:1.682E-42)
            r12.f287674u = r3
            goto L_0x046e
        L_0x046c:
            r2 = 600(0x258, float:8.41E-43)
        L_0x046e:
            r3 = 251(0xfb, float:3.52E-43)
            r11 = 2
            goto L_0x0485
        L_0x0472:
            r2 = 600(0x258, float:8.41E-43)
            r3 = 20304(0x4f50, float:2.8452E-41)
            r12.field_fileType = r3
            r3 = 251(0xfb, float:3.52E-43)
            r12.field_appType = r3
            r11 = 2
            r12.field_bzScene = r11
            r13 = 300(0x12c, float:4.2E-43)
            r12.f287673t = r13
            r12.f287674u = r13
        L_0x0485:
            r12.field_priority = r11
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r11 = r1.f161499p
            java.lang.String r13 = r12.field_mediaId
            r11.add(r13)
            java.lang.String r11 = r1.f161495i
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "add uploadingFeed "
            r13.append(r14)
            java.lang.String r14 = r12.field_mediaId
            r13.append(r14)
            r13.append(r10)
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r10 = r1.f161499p
            int r10 = r10.size()
            r13.append(r10)
            java.lang.String r10 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            java.util.Map<java.lang.String, java.lang.Float> r10 = r1.f161498o
            java.lang.String r11 = r12.field_mediaId
            gy3.C87412m.m108593f(r11, r8)
            r13 = 0
            java.lang.Float r14 = java.lang.Float.valueOf(r13)
            r10.put(r11, r14)
            di3.d r10 = di3.C86312j.m106911c(r4)
            qo.l r10 = (p663qo.C101213l) r10
            java.lang.String r11 = r12.field_mediaId
            r10.gn0(r11)
            java.util.List<gi.g> r10 = r1.f161505v
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r10.add(r12)
            int r15 = r1.mo79340q(r6)
            r1.mo79341r(r6)
            if (r15 == 0) goto L_0x04dd
            goto L_0x04e1
        L_0x04dd:
            int r15 = r1.mo79342s(r6)
        L_0x04e1:
            int r10 = r6.f185268f
            r11 = 4
            if (r10 == r11) goto L_0x04eb
            r11 = 2
            if (r10 != r11) goto L_0x04f7
            if (r20 != 0) goto L_0x04f7
        L_0x04eb:
            uq1.m r10 = uq1.C65449m.f188332a
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r1.f161496j
            int r11 = r11.field_watermarkFlag
            byte[] r6 = r10.mo89562a(r6, r11)
            r1.f161506w = r6
        L_0x04f7:
            if (r15 == 0) goto L_0x0521
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161496j
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            if (r0 != 0) goto L_0x0500
            goto L_0x0502
        L_0x0500:
            r0.uploadLogicError = r15
        L_0x0502:
            r2 = 0
            r1.mo79339p(r2)
            zq1.c r0 = new zq1.c
            up1.l r2 = r1.f161494h
            r10 = 2
            r0.<init>(r2, r10)
            goto L_0x0628
        L_0x0510:
            r2 = 600(0x258, float:8.41E-43)
            r3 = 251(0xfb, float:3.52E-43)
            r10 = 2
            r13 = 0
            int r11 = r6.f185268f
            if (r11 == r10) goto L_0x052c
            r10 = 7
            if (r11 == r10) goto L_0x052c
            r10 = 4
            if (r11 != r10) goto L_0x0521
            goto L_0x052c
        L_0x0521:
            r3 = r7
            r2 = 2
            r11 = 8
            r12 = 20302(0x4f4e, float:2.8449E-41)
            r14 = 251(0xfb, float:3.52E-43)
            r15 = 1
            goto L_0x01e2
        L_0x052c:
            java.lang.String r0 = r1.f161495i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "uploadFinderContent media.url invalid, url:"
            r2.append(r3)
            java.lang.String r3 = r6.f185266d
            r2.append(r3)
            java.lang.String r3 = ", type:"
            r2.append(r3)
            int r3 = r6.f185268f
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161496j
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            r2 = 2
            if (r0 != 0) goto L_0x0557
            goto L_0x0559
        L_0x0557:
            r0.uploadLogicError = r2
        L_0x0559:
            r3 = 0
            r1.mo79339p(r3)
            zq1.c r0 = new zq1.c
            up1.l r3 = r1.f161494h
            r0.<init>(r3, r2)
            goto L_0x0628
        L_0x0566:
            sx3.C64197v.m75542k()
            r0 = 0
            throw r0
        L_0x056b:
            java.lang.Object r0 = sx3.C110818d0.m150916N(r3)
            te3.rq2 r0 = (te3.C64689rq2) r0
            if (r0 == 0) goto L_0x0593
            int r2 = r1.mo79340q(r0)
            r1.mo79341r(r0)
            if (r2 == 0) goto L_0x0593
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161496j
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            if (r0 != 0) goto L_0x0583
            goto L_0x0585
        L_0x0583:
            r0.uploadLogicError = r2
        L_0x0585:
            r2 = 0
            r1.mo79339p(r2)
            zq1.c r0 = new zq1.c
            up1.l r2 = r1.f161494h
            r3 = 2
            r0.<init>(r2, r3)
            goto L_0x0628
        L_0x0593:
            java.lang.String r0 = r1.f161495i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "upload info count:"
            r2.append(r3)
            java.util.List<gi.g> r3 = r1.f161505v
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.util.List<gi.g> r0 = r1.f161505v
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L_0x05bc:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x05d9
            java.lang.Object r5 = r0.next()
            gi.g r5 = (p1081gi.C98124g) r5
            di3.d r6 = di3.C86312j.m106911c(r4)
            qo.l r6 = (p663qo.C101213l) r6
            r6.if0(r5)
            java.lang.String r5 = r5.field_fullpath
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r5)
            long r2 = r2 + r5
            goto L_0x05bc
        L_0x05d9:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161496j
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            if (r0 != 0) goto L_0x05e0
            goto L_0x05e2
        L_0x05e0:
            r0.uploadMediaTotalSize = r2
        L_0x05e2:
            if (r0 == 0) goto L_0x05eb
            uq1.m r2 = uq1.C65449m.f188332a
            java.lang.String r3 = "beginUpload"
            r2.mo89571k(r0, r3)
        L_0x05eb:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r0 = r1.f161499p
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0601
            r0 = 1
            r1.mo79339p(r0)
            zq1.g r0 = new zq1.g
            up1.l r2 = r1.f161494h
            byte[] r3 = r1.f161506w
            r0.<init>(r2, r3)
            goto L_0x0628
        L_0x0601:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161496j
            boolean r0 = r0.isLongVideo()
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 21
            r12 = 1
            r3 = 1718(0x6b6, double:8.49E-321)
            r5 = 21
            r7 = 1
            r2 = r9
            r2.mo175913w(r3, r5, r7)
            if (r0 == 0) goto L_0x0621
            r3 = 1719(0x6b7, double:8.493E-321)
            r2 = r9
            r5 = r10
            r7 = r12
            r2.mo175913w(r3, r5, r7)
        L_0x0621:
            java.util.concurrent.CountDownLatch r0 = r1.f161508y
            r0.await()
            xq1.e r0 = r1.f161507x
        L_0x0628:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStage.mo75105g():xq1.e");
    }

    /* renamed from: k */
    public final void mo79334k(C64689rq2 rq22) {
        C13598b0 b0Var;
        FinderMediaReportObject finderMediaReportObject = rq22.f185262W0;
        if (finderMediaReportObject != null) {
            finderMediaReportObject.mediaType = rq22.f185268f;
            finderMediaReportObject.mediaId = rq22.f185275p;
            finderMediaReportObject.cdnUploadTime = (int) (C31543z5.m39453c() - this.f161500q);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            FinderMediaReportObject finderMediaReportObject2 = new FinderMediaReportObject();
            finderMediaReportObject2.mediaType = rq22.f185268f;
            finderMediaReportObject2.mediaId = rq22.f185275p;
            finderMediaReportObject2.cdnUploadTime = (int) (C31543z5.m39453c() - this.f161500q);
            FinderMediaReportInfo finderMediaReportInfo = new FinderMediaReportInfo();
            finderMediaReportInfo.width = (int) rq22.f185270h;
            finderMediaReportInfo.height = (int) rq22.f185271i;
            int l = (int) C86013q1.m106451l(rq22.f185266d);
            finderMediaReportInfo.fileSize = l;
            finderMediaReportInfo.videoDuration = rq22.f185269g;
            finderMediaReportInfo.videoBitrate = rq22.f185274o;
            finderMediaReportObject2.videoFinalSize = l;
            finderMediaReportObject2.target = finderMediaReportInfo;
            rq22.f185262W0 = finderMediaReportObject2;
        }
    }

    /* renamed from: l */
    public final C94554a mo79335l(C98124g gVar) {
        Class cls = C65000f.class;
        gVar.getClass();
        C94554a Yp = ((C65000f) C86312j.m106911c(cls)).mo89183Yp(gVar.field_fullpath);
        if (Yp != null) {
            int i = Yp.f273444b;
            String str = gVar.field_fullpath;
            C87412m.m108593f(str, "info.field_fullpath");
            String str2 = "videobitrate:" + i + "\r\nvideoformat:" + (((C65000f) C86312j.m106911c(cls)).mo89194iu(str) ? WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE : 28) + APLogFileUtil.SEPARATOR_LINE;
            Log.m105924i(this.f161495i, "customHeader " + str2);
            gVar.f287653J = str2;
        }
        return Yp;
    }

    /* renamed from: m */
    public final boolean mo79336m(C64689rq2 rq22) {
        Iterator it = ((ArrayList) this.f161502s).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (C87412m.m108589b(((C64689rq2) it.next()).f185275p, rq22.f185275p)) {
                break;
            } else {
                i++;
            }
        }
        return i >= 0;
    }

    /* renamed from: n */
    public final String mo79337n(String str) {
        return "uploaddraft_" + str;
    }

    /* renamed from: o */
    public final String mo79338o() {
        return "uploaddraft_" + this.f161494h.field_localId;
    }

    /* renamed from: p */
    public final void mo79339p(boolean z) {
        if (!z) {
            try {
                this.f161497n.f185647f = 2;
            } catch (Exception e) {
                Log.printErrStackTrace(this.f161495i, e, "", new Object[0]);
                return;
            }
        }
        this.f161497n.f185654p = C31543z5.m39451a() - this.f161500q;
        this.f161496j.setPostInfo(this.f161497n);
        long j = this.f161497n.f185654p;
        boolean isLongVideo = this.f161496j.isLongVideo();
        C58386m mVar = C58386m.f167284a;
        mVar.mo83220a(1718, 9, 1, isLongVideo);
        mVar.mo83220a(1718, 10, j, isLongVideo);
        C66166c.f190172a.mo90231b(this.f161494h);
    }

    /* renamed from: q */
    public final int mo79340q(C64689rq2 rq22) {
        if (rq22.f185268f == 4 && !Util.isNullOrNil(rq22.f185283w)) {
            if (!Util.isNullOrNil(rq22.f185237D)) {
                Log.m105924i(this.f161495i, "mediaObject svr_coverUrl exist");
                return 0;
            } else if (!C86013q1.m106450k(rq22.f185283w)) {
                String str = this.f161495i;
                Log.m105924i(str, "upload failed, coverUrl not exist, " + rq22.f185283w);
                return 5;
            } else {
                C98124g gVar = new C98124g();
                gVar.f287660d = "task_FinderUploadTask_2";
                gVar.f287662f = this.f161493A;
                String mD5String = MD5Util.getMD5String(rq22.f185283w);
                C87412m.m108593f(mD5String, "getMD5String(mediaObject.coverUrl)");
                gVar.field_mediaId = mo79337n(mD5String);
                String str2 = rq22.f185283w;
                gVar.field_fullpath = str2;
                gVar.field_thumbpath = str2;
                gVar.field_talker = "";
                gVar.field_needStorage = true;
                String str3 = this.f161495i;
                Log.m105924i(str3, "upload cover file length " + C86013q1.m106451l(rq22.f185283w));
                gVar.field_fileType = 20304;
                gVar.field_appType = 251;
                gVar.field_bzScene = 2;
                gVar.f287673t = 120;
                gVar.f287674u = 300;
                gVar.field_priority = 2;
                this.f161499p.add(gVar.field_mediaId);
                Map<String, Float> map = this.f161498o;
                String str4 = gVar.field_mediaId;
                C87412m.m108593f(str4, "info.field_mediaId");
                map.put(str4, Float.valueOf(0.0f));
                ((ArrayList) this.f161505v).add(gVar);
            }
        }
        return 0;
    }

    /* renamed from: r */
    public final int mo79341r(C64689rq2 rq22) {
        if (rq22.f185268f == 4 && !Util.isNullOrNil(rq22.f185261W)) {
            if (!Util.isNullOrNil(rq22.f185259V)) {
                Log.m105924i(this.f161495i, "mediaObject svr_fullCoverUrl exist");
                return 0;
            } else if (!C86013q1.m106450k(rq22.f185261W)) {
                String str = this.f161495i;
                Log.m105924i(str, "upload failed, fullCoverUrl not exist, " + rq22.f185261W);
                return 0;
            } else {
                C98124g gVar = new C98124g();
                gVar.f287660d = "task_FinderUploadTask_2";
                gVar.f287662f = this.f161493A;
                String mD5String = MD5Util.getMD5String(rq22.f185261W);
                C87412m.m108593f(mD5String, "getMD5String(mediaObject.fullCoverUrl)");
                gVar.field_mediaId = mo79337n(mD5String);
                String str2 = rq22.f185261W;
                gVar.field_fullpath = str2;
                gVar.field_thumbpath = str2;
                gVar.field_talker = "";
                gVar.field_needStorage = true;
                String str3 = this.f161495i;
                Log.m105924i(str3, "upload fullCover file length " + C86013q1.m106451l(rq22.f185261W));
                gVar.field_fileType = 20304;
                gVar.field_appType = 251;
                gVar.field_bzScene = 2;
                gVar.f287673t = 120;
                gVar.f287674u = 300;
                gVar.field_priority = 2;
                this.f161499p.add(gVar.field_mediaId);
                Map<String, Float> map = this.f161498o;
                String str4 = gVar.field_mediaId;
                C87412m.m108593f(str4, "info.field_mediaId");
                map.put(str4, Float.valueOf(0.0f));
                ((ArrayList) this.f161505v).add(gVar);
            }
        }
        return 0;
    }

    /* renamed from: s */
    public final int mo79342s(C64689rq2 rq22) {
        if (!Util.isNullOrNil(rq22.f185239F)) {
            if (!Util.isNullOrNil(rq22.f185241H)) {
                Log.m105924i(this.f161495i, "mediaObject svr_fullThumbUrl exist");
                return 0;
            } else if (!C86013q1.m106450k(rq22.f185239F)) {
                String str = this.f161495i;
                Log.m105924i(str, "upload failed, fullThumbUrl not exist, " + rq22.f185239F);
                return 6;
            } else {
                C98124g gVar = new C98124g();
                gVar.f287660d = "task_FinderUploadTask_2";
                gVar.f287662f = this.f161493A;
                String mD5String = MD5Util.getMD5String(rq22.f185239F);
                C87412m.m108593f(mD5String, "getMD5String(mediaObject.fullThumbUrl)");
                gVar.field_mediaId = mo79337n(mD5String);
                String str2 = rq22.f185239F;
                gVar.field_fullpath = str2;
                gVar.field_thumbpath = str2;
                gVar.field_talker = "";
                gVar.field_needStorage = true;
                String str3 = this.f161495i;
                Log.m105924i(str3, "upload fullthumb file length " + C86013q1.m106451l(rq22.f185239F));
                gVar.field_fileType = 20304;
                gVar.field_appType = 251;
                gVar.field_bzScene = 2;
                gVar.f287673t = 120;
                gVar.f287674u = 300;
                gVar.field_priority = 2;
                this.f161499p.add(gVar.field_mediaId);
                Map<String, Float> map = this.f161498o;
                String str4 = gVar.field_mediaId;
                C87412m.m108593f(str4, "info.field_mediaId");
                map.put(str4, Float.valueOf(0.0f));
                ((ArrayList) this.f161505v).add(gVar);
            }
        }
        return 0;
    }
}
