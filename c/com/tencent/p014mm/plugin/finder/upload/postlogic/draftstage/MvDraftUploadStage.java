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

/* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage */
public final class MvDraftUploadStage extends C66177f {

    /* renamed from: h */
    public C65418l f161519h;

    /* renamed from: i */
    public final String f161520i = "LogPost.MvDraftUploadStage";

    /* renamed from: j */
    public final FinderItem f161521j;

    /* renamed from: n */
    public final C64736tq2 f161522n;

    /* renamed from: o */
    public final Map<String, Float> f161523o;

    /* renamed from: p */
    public final ConcurrentLinkedQueue<String> f161524p;

    /* renamed from: q */
    public long f161525q;

    /* renamed from: r */
    public boolean f161526r;

    /* renamed from: s */
    public List<C64689rq2> f161527s;

    /* renamed from: t */
    public boolean f161528t;

    /* renamed from: u */
    public List<String> f161529u;

    /* renamed from: v */
    public final List<C98124g> f161530v;

    /* renamed from: w */
    public C66408e f161531w;

    /* renamed from: x */
    public CountDownLatch f161532x;

    /* renamed from: y */
    public final MvDraftUploadStage$draftModifyListener$1 f161533y;

    /* renamed from: z */
    public final C56478a f161534z;

    /* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage$a */
    public static final class C56478a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ MvDraftUploadStage f161535d;

        public C56478a(MvDraftUploadStage mvDraftUploadStage) {
            this.f161535d = mvDraftUploadStage;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: te3.rq2} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: te3.rq2} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: te3.rq2} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: te3.rq2} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x0361  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x039e  */
        /* renamed from: g0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo1773g0(java.lang.String r10, int r11, p1081gi.C98120c r12, p1081gi.C98121d r13, boolean r14) {
            /*
                r9 = this;
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r14 = r9.f161535d
                java.lang.String r14 = r14.f161520i
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "on cdn callback someOneFailed:"
                r0.append(r1)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r1 = r9.f161535d
                boolean r1 = r1.f161528t
                r0.append(r1)
                java.lang.String r1 = ", mediaId = %s, startRet = %d, sceneResult %s"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 3
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r3 = 0
                r2[r3] = r10
                java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
                r5 = 1
                r2[r5] = r4
                if (r13 == 0) goto L_0x0033
                java.lang.String r4 = r13.toString()
                if (r4 != 0) goto L_0x0035
            L_0x0033:
                java.lang.String r4 = "null"
            L_0x0035:
                r6 = 2
                r2[r6] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r0, r2)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r14 = r9.f161535d
                boolean r0 = r14.f161526r
                if (r0 != 0) goto L_0x03af
                boolean r0 = r14.f161528t
                if (r0 == 0) goto L_0x0047
                goto L_0x03af
            L_0x0047:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
                if (r0 != 0) goto L_0x012c
                java.util.Map<java.lang.String, java.lang.Float> r0 = r14.f161523o
                boolean r0 = r0.containsKey(r10)
                if (r0 == 0) goto L_0x012c
                if (r12 != 0) goto L_0x0059
                goto L_0x012c
            L_0x0059:
                r0 = 1065353216(0x3f800000, float:1.0)
                long r7 = r12.field_finishedLength
                float r2 = (float) r7
                float r2 = r2 * r0
                long r7 = r12.field_toltalLength
                float r0 = (float) r7
                float r2 = r2 / r0
                java.lang.String r0 = r14.f161520i
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "finished "
                r4.append(r7)
                long r7 = r12.field_finishedLength
                r4.append(r7)
                java.lang.String r7 = ", total "
                r4.append(r7)
                long r7 = r12.field_toltalLength
                r4.append(r7)
                java.lang.String r12 = ", progress "
                r4.append(r12)
                r4.append(r2)
                java.lang.String r12 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r12)
                java.util.Map<java.lang.String, java.lang.Float> r12 = r14.f161523o
                java.util.LinkedHashMap r12 = (java.util.LinkedHashMap) r12
                java.lang.Object r12 = r12.get(r10)
                gy3.C87412m.m108591d(r12)
                java.lang.Number r12 = (java.lang.Number) r12
                float r12 = r12.floatValue()
                int r12 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
                if (r12 <= 0) goto L_0x00af
                java.util.Map<java.lang.String, java.lang.Float> r12 = r14.f161523o
                gy3.C87412m.m108591d(r10)
                java.lang.Float r0 = java.lang.Float.valueOf(r2)
                r12.put(r10, r0)
            L_0x00af:
                java.util.Map<java.lang.String, java.lang.Float> r12 = r14.f161523o
                java.util.LinkedHashMap r12 = (java.util.LinkedHashMap) r12
                java.util.Collection r12 = r12.values()
                float r12 = sx3.C110818d0.m150944p0(r12)
                java.util.Map<java.lang.String, java.lang.Float> r0 = r14.f161523o
                int r0 = r0.size()
                float r0 = (float) r0
                float r12 = r12 / r0
                up1.f r0 = up1.C37521f.f99374d
                r0.getClass()
                int r0 = up1.C37521f.f99147D
                float r2 = (float) r0
                float r2 = r2 * r12
                int r2 = (int) r2
                int r0 = r0 + r2
                java.lang.String r2 = r14.f161520i
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "feed "
                r4.append(r7)
                up1.l r7 = r14.f161519h
                long r7 = r7.field_localId
                r4.append(r7)
                java.lang.String r7 = " updateProgress  "
                r4.append(r7)
                r4.append(r12)
                java.lang.String r12 = ", "
                r4.append(r12)
                r4.append(r0)
                java.lang.String r12 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r12)
                com.tencent.mm.plugin.finder.storage.FinderItem r12 = r14.f161521j
                te3.tq2 r12 = r12.getPostInfo()
                int r12 = r12.f185649h
                if (r12 >= r0) goto L_0x0112
                com.tencent.mm.plugin.finder.storage.FinderItem r12 = r14.f161521j
                te3.tq2 r12 = r12.getPostInfo()
                r12.f185649h = r0
                wp1.c r12 = wp1.C66166c.f190172a
                up1.l r0 = r14.f161519h
                r12.mo90231b(r0)
            L_0x0112:
                com.tencent.mm.autogen.events.FeedPostProgressEvent r12 = new com.tencent.mm.autogen.events.FeedPostProgressEvent
                r12.<init>()
                com.tencent.mm.autogen.events.FeedPostProgressEvent$a r0 = r12.f154751d
                up1.l r2 = r14.f161519h
                long r7 = r2.field_localId
                r0.f154752a = r7
                com.tencent.mm.plugin.finder.storage.FinderItem r14 = r14.f161521j
                te3.tq2 r14 = r14.getPostInfo()
                int r14 = r14.f185649h
                r0.f154753b = r14
                r12.publish()
            L_0x012c:
                java.lang.String r12 = ""
                r14 = 0
                if (r11 == 0) goto L_0x01e1
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r13 = r9.f161535d
                java.lang.String r13 = r13.f161520i
                java.lang.Object[] r0 = new java.lang.Object[r6]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
                r0[r3] = r1
                r0[r5] = r10
                java.lang.String r1 = "start failed : %d, media id is :%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r1, r0)
                r13 = -21005(0xffffffffffffadf3, float:NaN)
                if (r11 == r13) goto L_0x01e0
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r13 = r9.f161535d
                java.util.List<java.lang.String> r13 = r13.f161529u
                if (r10 != 0) goto L_0x0150
                goto L_0x0151
            L_0x0150:
                r12 = r10
            L_0x0151:
                java.util.ArrayList r13 = (java.util.ArrayList) r13
                r13.add(r12)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r12 = r9.f161535d
                r12.f161528t = r5
                com.tencent.mm.plugin.finder.storage.FinderItem r12 = r12.f161521j
                java.util.LinkedList r12 = r12.getMediaList()
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r13 = r9.f161535d
                java.util.Iterator r12 = r12.iterator()
            L_0x0166:
                boolean r0 = r12.hasNext()
                if (r0 == 0) goto L_0x0180
                java.lang.Object r0 = r12.next()
                r1 = r0
                te3.rq2 r1 = (te3.C64689rq2) r1
                java.lang.String r1 = r1.f185275p
                java.lang.String r2 = com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage.m64843h(r13, r10)
                boolean r1 = gy3.C87412m.m108589b(r1, r2)
                if (r1 == 0) goto L_0x0166
                goto L_0x0181
            L_0x0180:
                r0 = r14
            L_0x0181:
                te3.rq2 r0 = (te3.C64689rq2) r0
                if (r0 == 0) goto L_0x018a
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r12 = r9.f161535d
                com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage.m64845j(r12, r11, r0)
            L_0x018a:
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r12 = r9.f161535d
                com.tencent.mm.plugin.finder.storage.FinderItem r12 = r12.f161521j
                java.util.LinkedList r12 = r12.getClipListExt()
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r13 = r9.f161535d
                java.util.Iterator r12 = r12.iterator()
            L_0x0198:
                boolean r0 = r12.hasNext()
                if (r0 == 0) goto L_0x01cf
                java.lang.Object r0 = r12.next()
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r0
                java.util.LinkedList r0 = r0.getMediaList()
                java.util.Iterator r0 = r0.iterator()
            L_0x01ac:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x01c6
                java.lang.Object r1 = r0.next()
                r2 = r1
                te3.rq2 r2 = (te3.C64689rq2) r2
                java.lang.String r2 = r2.f185275p
                java.lang.String r4 = com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage.m64843h(r13, r10)
                boolean r2 = gy3.C87412m.m108589b(r2, r4)
                if (r2 == 0) goto L_0x01ac
                goto L_0x01c7
            L_0x01c6:
                r1 = r14
            L_0x01c7:
                te3.rq2 r1 = (te3.C64689rq2) r1
                if (r1 == 0) goto L_0x0198
                com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage.m64845j(r13, r11, r1)
                goto L_0x0198
            L_0x01cf:
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r10 = r9.f161535d
                r10.mo79349p(r3)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r10 = r9.f161535d
                zq1.c r11 = new zq1.c
                up1.l r12 = r10.f161519h
                r11.<init>(r12, r6)
                com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage.m64844i(r10, r11)
            L_0x01e0:
                return r3
            L_0x01e1:
                boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
                if (r11 != 0) goto L_0x03af
                if (r13 == 0) goto L_0x03af
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r11 = r9.f161535d
                java.lang.String r11 = r11.f161520i
                java.lang.Object[] r0 = new java.lang.Object[r1]
                int r1 = r13.field_retCode
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r3] = r1
                java.lang.String r1 = r13.field_fileId
                r0[r5] = r1
                java.lang.String r1 = r13.field_fileUrl
                r0[r6] = r1
                java.lang.String r1 = "retCode %d, fileId %s, url %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r0)
                int r11 = r13.field_retCode
                if (r11 == 0) goto L_0x02a4
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r11 = r9.f161535d
                java.util.List<java.lang.String> r11 = r11.f161529u
                if (r10 != 0) goto L_0x020f
                goto L_0x0210
            L_0x020f:
                r12 = r10
            L_0x0210:
                java.util.ArrayList r11 = (java.util.ArrayList) r11
                r11.add(r12)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r11 = r9.f161535d
                r11.f161528t = r5
                com.tencent.mm.plugin.finder.storage.FinderItem r11 = r11.f161521j
                java.util.LinkedList r11 = r11.getMediaList()
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r12 = r9.f161535d
                java.util.Iterator r11 = r11.iterator()
            L_0x0225:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L_0x023f
                java.lang.Object r0 = r11.next()
                r1 = r0
                te3.rq2 r1 = (te3.C64689rq2) r1
                java.lang.String r1 = r1.f185275p
                java.lang.String r2 = com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage.m64843h(r12, r10)
                boolean r1 = gy3.C87412m.m108589b(r1, r2)
                if (r1 == 0) goto L_0x0225
                goto L_0x0240
            L_0x023f:
                r0 = r14
            L_0x0240:
                te3.rq2 r0 = (te3.C64689rq2) r0
                if (r0 == 0) goto L_0x024b
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r11 = r9.f161535d
                int r12 = r13.field_retCode
                com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage.m64845j(r11, r12, r0)
            L_0x024b:
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r11 = r9.f161535d
                com.tencent.mm.plugin.finder.storage.FinderItem r11 = r11.f161521j
                java.util.LinkedList r11 = r11.getClipListExt()
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r12 = r9.f161535d
                java.util.Iterator r11 = r11.iterator()
            L_0x0259:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L_0x0292
                java.lang.Object r0 = r11.next()
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r0
                java.util.LinkedList r0 = r0.getMediaList()
                java.util.Iterator r0 = r0.iterator()
            L_0x026d:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0287
                java.lang.Object r1 = r0.next()
                r2 = r1
                te3.rq2 r2 = (te3.C64689rq2) r2
                java.lang.String r2 = r2.f185275p
                java.lang.String r4 = com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage.m64843h(r12, r10)
                boolean r2 = gy3.C87412m.m108589b(r2, r4)
                if (r2 == 0) goto L_0x026d
                goto L_0x0288
            L_0x0287:
                r1 = r14
            L_0x0288:
                te3.rq2 r1 = (te3.C64689rq2) r1
                if (r1 == 0) goto L_0x0259
                int r0 = r13.field_retCode
                com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage.m64845j(r12, r0, r1)
                goto L_0x0259
            L_0x0292:
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r10 = r9.f161535d
                r10.mo79349p(r3)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r10 = r9.f161535d
                zq1.c r11 = new zq1.c
                up1.l r12 = r10.f161519h
                r11.<init>(r12, r6)
                com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage.m64844i(r10, r11)
                return r3
            L_0x02a4:
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r11 = r9.f161535d
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r11 = r11.f161524p
                r11.remove(r10)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r11 = r9.f161535d
                com.tencent.mm.plugin.finder.storage.FinderItem r11 = r11.f161521j
                java.util.LinkedList r11 = r11.getMediaList()
                java.util.LinkedList r12 = new java.util.LinkedList
                r12.<init>()
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r0 = r9.f161535d
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.f161521j
                java.util.LinkedList r0 = r0.getClipListExt()
                java.util.Iterator r0 = r0.iterator()
            L_0x02c4:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x02d8
                java.lang.Object r1 = r0.next()
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r1
                java.util.LinkedList r1 = r1.getMediaList()
                r12.addAll(r1)
                goto L_0x02c4
            L_0x02d8:
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r0 = r9.f161535d
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r0 = r0.f161524p
                int r0 = r0.size()
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r1 = r9.f161535d
                java.lang.String r1 = r1.f161520i
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "%s waitToUpload %d media localId:"
                r2.append(r4)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r4 = r9.f161535d
                up1.l r4 = r4.f161519h
                long r7 = r4.field_localId
                r2.append(r7)
                java.lang.String r2 = r2.toString()
                java.lang.Object[] r4 = new java.lang.Object[r6]
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r6 = r9.f161535d
                up1.l r6 = r6.f161519h
                long r6 = r6.field_localId
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                r4[r3] = r6
                java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
                r4[r5] = r6
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r1 = r9.f161535d
                java.util.Iterator r2 = r11.iterator()
            L_0x0318:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x0332
                java.lang.Object r4 = r2.next()
                r6 = r4
                te3.rq2 r6 = (te3.C64689rq2) r6
                java.lang.String r6 = r6.f185275p
                java.lang.String r7 = com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage.m64843h(r1, r10)
                boolean r6 = gy3.C87412m.m108589b(r6, r7)
                if (r6 == 0) goto L_0x0318
                goto L_0x0333
            L_0x0332:
                r4 = r14
            L_0x0333:
                te3.rq2 r4 = (te3.C64689rq2) r4
                if (r4 != 0) goto L_0x035e
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r1 = r9.f161535d
                java.util.Iterator r12 = r12.iterator()
            L_0x033d:
                boolean r2 = r12.hasNext()
                if (r2 == 0) goto L_0x0357
                java.lang.Object r2 = r12.next()
                r4 = r2
                te3.rq2 r4 = (te3.C64689rq2) r4
                java.lang.String r4 = r4.f185275p
                java.lang.String r6 = com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage.m64843h(r1, r10)
                boolean r4 = gy3.C87412m.m108589b(r4, r6)
                if (r4 == 0) goto L_0x033d
                r14 = r2
            L_0x0357:
                r4 = r14
                te3.rq2 r4 = (te3.C64689rq2) r4
                if (r4 == 0) goto L_0x035e
                r10 = 1
                goto L_0x035f
            L_0x035e:
                r10 = 0
            L_0x035f:
                if (r4 == 0) goto L_0x039c
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r12 = r9.f161535d
                java.lang.String r14 = r12.f161520i
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "hitMedia, isClip:"
                r1.append(r2)
                r1.append(r10)
                java.lang.String r10 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r10)
                java.lang.String r10 = r4.f185266d
                java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r10)
                r4.f185275p = r10
                java.lang.String r10 = r13.field_fileUrl
                r4.f185278r = r10
                java.lang.String r10 = r13.field_thumbUrl
                r4.f185279s = r10
                java.lang.String r10 = r13.field_filemd5
                r4.f185272j = r10
                com.tencent.mm.plugin.finder.storage.FinderItem r10 = r12.f161521j
                r10.setMediaList(r11)
                com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage.m64845j(r12, r3, r4)
                wp1.c r10 = wp1.C66166c.f190172a
                up1.l r11 = r12.f161519h
                r10.mo90231b(r11)
            L_0x039c:
                if (r0 != 0) goto L_0x03af
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r10 = r9.f161535d
                r10.mo79349p(r5)
                com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage r10 = r9.f161535d
                zq1.k r11 = new zq1.k
                up1.l r12 = r10.f161519h
                r11.<init>(r12)
                com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage.m64844i(r10, r11)
            L_0x03af:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage.C56478a.mo1773g0(java.lang.String, int, gi.c, gi.d, boolean):int");
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
    public MvDraftUploadStage(C65418l lVar) {
        super("draft_" + lVar.field_localId);
        C87412m.m108594g(lVar, "draftItem");
        this.f161519h = lVar;
        FinderItem l2 = lVar.mo89514l2();
        this.f161521j = l2;
        this.f161522n = l2.getPostInfo();
        this.f161523o = new LinkedHashMap();
        this.f161524p = new ConcurrentLinkedQueue<>();
        this.f161527s = new ArrayList();
        this.f161529u = new ArrayList();
        this.f161530v = new ArrayList();
        this.f161531w = new C66961c(this.f161519h, 2);
        this.f161532x = new CountDownLatch(1);
        this.f161533y = new MvDraftUploadStage$draftModifyListener$1(this, C40008f.f107254d);
        this.f161534z = new C56478a(this);
    }

    /* renamed from: h */
    public static final String m64843h(MvDraftUploadStage mvDraftUploadStage, String str) {
        mvDraftUploadStage.getClass();
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
    public static final void m64844i(MvDraftUploadStage mvDraftUploadStage, C66408e eVar) {
        mvDraftUploadStage.f161533y.dead();
        mvDraftUploadStage.f161531w = eVar;
        mvDraftUploadStage.f161532x.countDown();
    }

    /* renamed from: j */
    public static final void m64845j(MvDraftUploadStage mvDraftUploadStage, int i, C64689rq2 rq22) {
        mvDraftUploadStage.mo79344k(rq22);
        FinderMediaReportObject finderMediaReportObject = rq22.f185262W0;
        if (finderMediaReportObject != null) {
            finderMediaReportObject.cdnUploadRetCode = i;
        }
        FinderItem finderItem = mvDraftUploadStage.f161521j;
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
        boolean isLongVideo = this.f161521j.isLongVideo();
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
        boolean isLongVideo = this.f161521j.isLongVideo();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1718, 22, 1);
        if (isLongVideo) {
            if ((1718 == 1718 ? 1719 : 0) > 0) {
                nVar.mo175913w(1718 == 1718 ? 1719 : 0, 22, 1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0350, code lost:
        if (r11 == false) goto L_0x04a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x049d  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xq1.C66408e mo75105g() {
        /*
            r26 = this;
            r1 = r26
            java.lang.String r0 = r1.f161520i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "start localId:"
            r2.append(r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.f161521j
            long r3 = r3.getLocalId()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage$draftModifyListener$1 r0 = r1.f161533y
            r0.alive()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161521j
            java.lang.String r2 = "upload"
            r0.trackPost(r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161521j
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            if (r0 != 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            r2 = 3
            r0.postStage = r2
        L_0x0036:
            long r2 = eb0.C31543z5.m39453c()
            r1.f161525q = r2
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
            up1.l r3 = r1.f161519h
            r0.<init>(r3, r2)
            return r0
        L_0x0083:
            up1.l r0 = r1.f161519h
            long r3 = r0.field_localId
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            wp1.b r0 = r0.Cx0()
            up1.l r0 = r0.mo90229qq(r3)
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x009d
            r0 = 1
            goto L_0x009e
        L_0x009d:
            r0 = 0
        L_0x009e:
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = r1.f161520i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "start but not exist: "
            r2.append(r4)
            up1.l r4 = r1.f161519h
            long r4 = r4.field_localId
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            zq1.c r0 = new zq1.c
            up1.l r2 = r1.f161519h
            r0.<init>(r2, r3)
            return r0
        L_0x00c3:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161521j
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            r5 = 0
            if (r0 == 0) goto L_0x00d1
            te3.hb1 r0 = r0.mvInfo
            goto L_0x00d2
        L_0x00d1:
            r0 = r5
        L_0x00d2:
            if (r0 != 0) goto L_0x00dc
            zq1.c r0 = new zq1.c
            up1.l r3 = r1.f161519h
            r0.<init>(r3, r2)
            return r0
        L_0x00dc:
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            int r7 = r0.f183461j
            r8 = 0
            if (r7 != r3) goto L_0x0117
            java.util.LinkedList<te3.mb1> r0 = r0.f183460i
            java.lang.String r7 = "mvInfo.ordered_track_list_flex_clip"
            gy3.C87412m.m108593f(r0, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00f7:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x0113
            java.lang.Object r10 = r0.next()
            r11 = r10
            te3.mb1 r11 = (te3.C64550mb1) r11
            long r11 = r11.f184260f
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 != 0) goto L_0x010c
            r11 = 1
            goto L_0x010d
        L_0x010c:
            r11 = 0
        L_0x010d:
            if (r11 == 0) goto L_0x00f7
            r7.add(r10)
            goto L_0x00f7
        L_0x0113:
            r6.addAll(r7)
            goto L_0x0146
        L_0x0117:
            java.util.LinkedList<te3.mb1> r0 = r0.f183455d
            java.lang.String r7 = "mvInfo.orderedTrackList"
            gy3.C87412m.m108593f(r0, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0127:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x0143
            java.lang.Object r10 = r0.next()
            r11 = r10
            te3.mb1 r11 = (te3.C64550mb1) r11
            long r11 = r11.f184260f
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 != 0) goto L_0x013c
            r11 = 1
            goto L_0x013d
        L_0x013c:
            r11 = 0
        L_0x013d:
            if (r11 == 0) goto L_0x0127
            r7.add(r10)
            goto L_0x0127
        L_0x0143:
            r6.addAll(r7)
        L_0x0146:
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161521j
            java.util.LinkedList r0 = r0.getMediaList()
            r7.addAll(r0)
            java.util.Iterator r0 = r6.iterator()
            r6 = 0
        L_0x0159:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x019f
            java.lang.Object r10 = r0.next()
            int r11 = r6 + 1
            if (r6 < 0) goto L_0x019b
            te3.mb1 r10 = (te3.C64550mb1) r10
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r1.f161521j
            java.util.LinkedList r6 = r6.getClipListExt()
            java.util.Iterator r6 = r6.iterator()
        L_0x0173:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x018d
            java.lang.Object r12 = r6.next()
            r13 = r12
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r13
            java.lang.String r13 = r13.getObjectNonceId()
            java.lang.String r14 = r10.f184261g
            boolean r13 = gy3.C87412m.m108589b(r13, r14)
            if (r13 == 0) goto L_0x0173
            goto L_0x018e
        L_0x018d:
            r12 = r5
        L_0x018e:
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r12
            if (r12 == 0) goto L_0x0199
            java.util.LinkedList r6 = r12.getMediaList()
            r7.addAll(r6)
        L_0x0199:
            r6 = r11
            goto L_0x0159
        L_0x019b:
            sx3.C64197v.m75542k()
            throw r5
        L_0x019f:
            java.lang.Class<qo.l> r5 = p663qo.C101213l.class
            java.lang.String r6 = ""
            te3.tq2 r0 = r1.f161522n     // Catch:{ Exception -> 0x01b4 }
            r0.f185647f = r4     // Catch:{ Exception -> 0x01b4 }
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r1.f161521j     // Catch:{ Exception -> 0x01b4 }
            r10.setPostInfo(r0)     // Catch:{ Exception -> 0x01b4 }
            wp1.c r0 = wp1.C66166c.f190172a     // Catch:{ Exception -> 0x01b4 }
            up1.l r10 = r1.f161519h     // Catch:{ Exception -> 0x01b4 }
            r0.mo90231b(r10)     // Catch:{ Exception -> 0x01b4 }
            goto L_0x01bc
        L_0x01b4:
            r0 = move-exception
            java.lang.String r10 = r1.f161520i
            java.lang.Object[] r11 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r6, r11)
        L_0x01bc:
            java.util.List<gi.g> r0 = r1.f161530v
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.util.Iterator r0 = r7.iterator()
        L_0x01c7:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0501
            java.lang.Object r7 = r0.next()
            te3.rq2 r7 = (te3.C64689rq2) r7
            java.lang.String r10 = r7.f185266d
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            r11 = 7
            r12 = 4
            if (r10 != 0) goto L_0x04b9
            java.lang.String r10 = r7.f185275p
            java.lang.String r13 = r1.f161520i
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "uploading media "
            r14.append(r15)
            r14.append(r10)
            java.lang.String r10 = ", "
            r14.append(r10)
            java.lang.String r10 = r7.f185266d
            r14.append(r10)
            java.lang.String r10 = " size:"
            r14.append(r10)
            java.lang.String r15 = r7.f185266d
            long r15 = com.tencent.p014mm.vfs.C86013q1.m106451l(r15)
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r15)
            r14.append(r15)
            java.lang.String r15 = " thumb: "
            r14.append(r15)
            java.lang.String r15 = r7.f185267e
            r14.append(r15)
            r14.append(r10)
            java.lang.String r15 = r7.f185267e
            long r15 = com.tencent.p014mm.vfs.C86013q1.m106451l(r15)
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r15)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r14)
            java.lang.String r13 = r7.f185278r
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x0251
            java.lang.String r13 = r7.f185279s
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x0251
            java.lang.String r10 = r1.f161520i
            java.lang.String r11 = "mediaObject svr_url and svr_thumbUrl exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            int r12 = r1.mo79350q(r7)
            if (r12 == 0) goto L_0x024b
            goto L_0x04a1
        L_0x024b:
            int r12 = r1.mo79351r(r7)
            goto L_0x04a1
        L_0x0251:
            java.lang.String r13 = r7.f185266d
            boolean r13 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r13 != 0) goto L_0x0279
            java.lang.String r10 = r1.f161520i
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "mediaObject.url "
            r11.append(r12)
            java.lang.String r7 = r7.f185266d
            r11.append(r7)
            java.lang.String r7 = " is not file"
            r11.append(r7)
            java.lang.String r7 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r7)
            r12 = 1
            goto L_0x04a1
        L_0x0279:
            gi.g r13 = new gi.g
            r13.<init>()
            java.lang.String r14 = "task_FinderUploadTask_1"
            r13.f287660d = r14
            com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage$a r14 = r1.f161534z
            r13.f287662f = r14
            java.lang.String r14 = r7.f185266d
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r14)
            java.lang.String r15 = "getMD5String(mediaObject.url)"
            gy3.C87412m.m108593f(r14, r15)
            java.lang.String r14 = r1.mo79347n(r14)
            r13.field_mediaId = r14
            java.lang.String r14 = r7.f185266d
            r13.field_fullpath = r14
            java.lang.String r14 = r7.f185267e
            r13.field_thumbpath = r14
            r13.field_talker = r6
            r13.field_needStorage = r3
            java.lang.String r14 = r1.f161520i
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r8 = "upload file length "
            r15.append(r8)
            java.lang.String r8 = r7.f185266d
            long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r8)
            r15.append(r8)
            java.lang.String r8 = " mediaId: "
            r15.append(r8)
            java.lang.String r8 = r13.field_mediaId
            r15.append(r8)
            java.lang.String r8 = " localId:"
            r15.append(r8)
            up1.l r8 = r1.f161519h
            long r8 = r8.field_localId
            r15.append(r8)
            java.lang.String r8 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r8)
            int r8 = r7.f185268f
            r9 = 251(0xfb, float:3.52E-43)
            if (r8 == r2) goto L_0x0433
            if (r8 == r12) goto L_0x02f4
            if (r8 == r11) goto L_0x0433
            java.lang.String r7 = r1.f161520i
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9[r4] = r8
            java.lang.String r8 = "unknown media type %d, quit upload"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r8, r9)
            r12 = 0
            goto L_0x04a1
        L_0x02f4:
            java.lang.Class<com.tencent.mm.feature.sight.api.ISightJNIService> r8 = com.tencent.p014mm.feature.sight.api.ISightJNIService.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            com.tencent.mm.feature.sight.api.ISightJNIService r8 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r8
            java.lang.String r11 = r13.field_fullpath
            boolean r8 = r8.optimizeMP4VFS(r11)
            er1.w3 r11 = er1.C58784w3.f168295a
            java.lang.String r14 = r13.field_fullpath
            java.lang.String r15 = "info.field_fullpath"
            gy3.C87412m.m108593f(r14, r15)
            boolean r11 = r11.mo83883L0(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = r26.mo79348o()
            r14.append(r15)
            java.lang.String r15 = " optimize result: "
            r14.append(r15)
            r14.append(r8)
            java.lang.String r15 = ", isOptimize:"
            r14.append(r15)
            r14.append(r11)
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "Finder.LogPost.MusicMvFinderUploadTask"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r14)
            if (r8 != 0) goto L_0x0354
            ft1.a r17 = ft1.C59319a.f169618b
            r20 = 0
            r21 = 0
            r22 = 0
            zq1.o r8 = new zq1.o
            r8.<init>(r1)
            r24 = 28
            r25 = 0
            java.lang.String r18 = "optimizeMP4VFS_fail"
            r19 = r11
            r23 = r8
            o40.C11348f.C11349a.m11178b(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            if (r11 != 0) goto L_0x0354
            goto L_0x04a1
        L_0x0354:
            ft1.a r17 = ft1.C59319a.f169618b
            r20 = 0
            r21 = 0
            r22 = 0
            zq1.p r8 = new zq1.p
            r8.<init>(r1)
            r24 = 28
            r25 = 0
            java.lang.String r18 = "opt_moov_fail"
            r19 = r11
            r23 = r8
            o40.C11348f.C11349a.m11178b(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r8 = 20302(0x4f4e, float:2.8449E-41)
            r13.field_fileType = r8
            r13.field_appType = r9
            r8 = 8
            r13.f287655L = r8
            r13.field_bzScene = r2
            r8 = 1200(0x4b0, float:1.682E-42)
            r13.f287673t = r8
            r13.f287674u = r8
            up1.f r9 = up1.C37521f.f99374d
            long r11 = r9.mo61164R()
            int r14 = r9.mo61179e()
            long r14 = (long) r14
            java.lang.String r2 = ", path:"
            int r18 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r18 > 0) goto L_0x0397
            boolean r11 = r1.mo79346m(r7)
            if (r11 == 0) goto L_0x03e4
        L_0x0397:
            java.lang.String r11 = r13.field_fullpath
            long r11 = com.tencent.p014mm.vfs.C86013q1.m106451l(r11)
            int r14 = r9.mo61179e()
            long r14 = (long) r14
            int r18 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x03e4
            com.tencent.mm.plugin.sight.base.a r9 = r1.mo79345l(r13)
            java.lang.String r11 = r1.f161520i
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "MultiBitrate_Video_Enable1, mediaInfo null?"
            r12.append(r14)
            if (r9 != 0) goto L_0x03ba
            r9 = 1
            goto L_0x03bb
        L_0x03ba:
            r9 = 0
        L_0x03bb:
            r12.append(r9)
            r12.append(r2)
            java.lang.String r2 = r13.field_fullpath
            r12.append(r2)
            java.lang.String r2 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            r1.mo79344k(r7)
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r2 = r7.f185262W0
            if (r2 != 0) goto L_0x03d5
            goto L_0x03d7
        L_0x03d5:
            r2.isBigFile = r3
        L_0x03d7:
            if (r2 != 0) goto L_0x03da
            goto L_0x03dc
        L_0x03da:
            r2.cdnControl = r4
        L_0x03dc:
            er1.b0 r2 = er1.C58695b0.f168022a
            er1.b0$a r9 = er1.C58695b0.f168023b
            r2.mo83612a(r9)
            goto L_0x0427
        L_0x03e4:
            int r9 = r9.mo61181g()
            if (r9 != r3) goto L_0x0427
            com.tencent.mm.plugin.sight.base.a r9 = r1.mo79345l(r13)
            java.lang.String r11 = r1.f161520i
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "MultiBitrate_Video_Enable2, mediaInfo null?"
            r12.append(r14)
            if (r9 != 0) goto L_0x03fe
            r9 = 1
            goto L_0x03ff
        L_0x03fe:
            r9 = 0
        L_0x03ff:
            r12.append(r9)
            r12.append(r2)
            java.lang.String r2 = r13.field_fullpath
            r12.append(r2)
            java.lang.String r2 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            r1.mo79344k(r7)
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r2 = r7.f185262W0
            if (r2 != 0) goto L_0x0419
            goto L_0x041b
        L_0x0419:
            r2.isBigFile = r3
        L_0x041b:
            if (r2 != 0) goto L_0x041e
            goto L_0x0420
        L_0x041e:
            r2.cdnControl = r3
        L_0x0420:
            er1.b0 r2 = er1.C58695b0.f168022a
            er1.b0$a r9 = er1.C58695b0.f168023b
            r2.mo83612a(r9)
        L_0x0427:
            boolean r2 = r1.mo79346m(r7)
            if (r2 == 0) goto L_0x0431
            r13.f287673t = r8
            r13.f287674u = r8
        L_0x0431:
            r2 = 2
            goto L_0x0446
        L_0x0433:
            java.lang.String r2 = r7.f185266d
            r13.field_thumbpath = r2
            r2 = 20304(0x4f50, float:2.8452E-41)
            r13.field_fileType = r2
            r13.field_appType = r9
            r2 = 2
            r13.field_bzScene = r2
            r8 = 300(0x12c, float:4.2E-43)
            r13.f287673t = r8
            r13.f287674u = r8
        L_0x0446:
            r13.field_priority = r2
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r2 = r1.f161524p
            java.lang.String r8 = r13.field_mediaId
            r2.add(r8)
            java.lang.String r2 = r1.f161520i
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "add uploadingFeed "
            r8.append(r9)
            java.lang.String r9 = r13.field_mediaId
            r8.append(r9)
            r8.append(r10)
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r9 = r1.f161524p
            int r9 = r9.size()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            java.util.Map<java.lang.String, java.lang.Float> r2 = r1.f161523o
            java.lang.String r8 = r13.field_mediaId
            java.lang.String r9 = "info.field_mediaId"
            gy3.C87412m.m108593f(r8, r9)
            r9 = 0
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r2.put(r8, r9)
            di3.d r2 = di3.C86312j.m106911c(r5)
            qo.l r2 = (p663qo.C101213l) r2
            java.lang.String r8 = r13.field_mediaId
            r2.gn0(r8)
            java.util.List<gi.g> r2 = r1.f161530v
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r13)
            int r12 = r1.mo79350q(r7)
            if (r12 == 0) goto L_0x049d
            goto L_0x04a1
        L_0x049d:
            int r12 = r1.mo79351r(r7)
        L_0x04a1:
            if (r12 == 0) goto L_0x04c3
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161521j
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            if (r0 != 0) goto L_0x04aa
            goto L_0x04ac
        L_0x04aa:
            r0.uploadLogicError = r12
        L_0x04ac:
            r1.mo79349p(r4)
            zq1.c r0 = new zq1.c
            up1.l r2 = r1.f161519h
            r8 = 2
            r0.<init>(r2, r8)
            goto L_0x0593
        L_0x04b9:
            r8 = 2
            int r2 = r7.f185268f
            if (r2 == r8) goto L_0x04c8
            if (r2 == r11) goto L_0x04c8
            if (r2 != r12) goto L_0x04c3
            goto L_0x04c8
        L_0x04c3:
            r2 = 2
            r8 = 0
            goto L_0x01c7
        L_0x04c8:
            java.lang.String r0 = r1.f161520i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "uploadFinderContent media.url invalid, url:"
            r2.append(r3)
            java.lang.String r3 = r7.f185266d
            r2.append(r3)
            java.lang.String r3 = ", type:"
            r2.append(r3)
            int r3 = r7.f185268f
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161521j
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            r2 = 2
            if (r0 != 0) goto L_0x04f3
            goto L_0x04f5
        L_0x04f3:
            r0.uploadLogicError = r2
        L_0x04f5:
            r1.mo79349p(r4)
            zq1.c r0 = new zq1.c
            up1.l r3 = r1.f161519h
            r0.<init>(r3, r2)
            goto L_0x0593
        L_0x0501:
            java.lang.String r0 = r1.f161520i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "upload info count:"
            r2.append(r4)
            java.util.List<gi.g> r4 = r1.f161530v
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.util.List<gi.g> r0 = r1.f161530v
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            r8 = 0
        L_0x052a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0547
            java.lang.Object r2 = r0.next()
            gi.g r2 = (p1081gi.C98124g) r2
            di3.d r4 = di3.C86312j.m106911c(r5)
            qo.l r4 = (p663qo.C101213l) r4
            r4.if0(r2)
            java.lang.String r2 = r2.field_fullpath
            long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            long r8 = r8 + r6
            goto L_0x052a
        L_0x0547:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161521j
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            if (r0 != 0) goto L_0x054e
            goto L_0x0550
        L_0x054e:
            r0.uploadMediaTotalSize = r8
        L_0x0550:
            if (r0 == 0) goto L_0x0559
            uq1.m r2 = uq1.C65449m.f188332a
            java.lang.String r4 = "beginUpload"
            r2.mo89571k(r0, r4)
        L_0x0559:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r0 = r1.f161524p
            int r0 = r0.size()
            if (r0 != 0) goto L_0x056c
            r1.mo79349p(r3)
            zq1.k r0 = new zq1.k
            up1.l r2 = r1.f161519h
            r0.<init>(r2)
            goto L_0x0593
        L_0x056c:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161521j
            boolean r0 = r0.isLongVideo()
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 21
            r12 = 1
            r3 = 1718(0x6b6, double:8.49E-321)
            r5 = 21
            r7 = 1
            r2 = r9
            r2.mo175913w(r3, r5, r7)
            if (r0 == 0) goto L_0x058c
            r3 = 1719(0x6b7, double:8.493E-321)
            r2 = r9
            r5 = r10
            r7 = r12
            r2.mo175913w(r3, r5, r7)
        L_0x058c:
            java.util.concurrent.CountDownLatch r0 = r1.f161532x
            r0.await()
            xq1.e r0 = r1.f161531w
        L_0x0593:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.MvDraftUploadStage.mo75105g():xq1.e");
    }

    /* renamed from: k */
    public final void mo79344k(C64689rq2 rq22) {
        C13598b0 b0Var;
        FinderMediaReportObject finderMediaReportObject = rq22.f185262W0;
        if (finderMediaReportObject != null) {
            finderMediaReportObject.mediaType = rq22.f185268f;
            finderMediaReportObject.mediaId = rq22.f185275p;
            finderMediaReportObject.cdnUploadTime = (int) (C31543z5.m39453c() - this.f161525q);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            FinderMediaReportObject finderMediaReportObject2 = new FinderMediaReportObject();
            finderMediaReportObject2.mediaType = rq22.f185268f;
            finderMediaReportObject2.mediaId = rq22.f185275p;
            finderMediaReportObject2.cdnUploadTime = (int) (C31543z5.m39453c() - this.f161525q);
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
    public final C94554a mo79345l(C98124g gVar) {
        Class cls = C65000f.class;
        gVar.getClass();
        C94554a Yp = ((C65000f) C86312j.m106911c(cls)).mo89183Yp(gVar.field_fullpath);
        if (Yp != null) {
            int i = Yp.f273444b;
            String str = gVar.field_fullpath;
            C87412m.m108593f(str, "info.field_fullpath");
            String str2 = "videobitrate:" + i + "\r\nvideoformat:" + (((C65000f) C86312j.m106911c(cls)).mo89194iu(str) ? WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE : 28) + APLogFileUtil.SEPARATOR_LINE;
            Log.m105924i(this.f161520i, "customHeader " + str2);
            gVar.f287653J = str2;
        }
        return Yp;
    }

    /* renamed from: m */
    public final boolean mo79346m(C64689rq2 rq22) {
        Iterator it = ((ArrayList) this.f161527s).iterator();
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
    public final String mo79347n(String str) {
        return "uploaddraft_" + str;
    }

    /* renamed from: o */
    public final String mo79348o() {
        return "uploaddraft_" + this.f161519h.field_localId;
    }

    /* renamed from: p */
    public final void mo79349p(boolean z) {
        if (!z) {
            try {
                this.f161522n.f185647f = 2;
            } catch (Exception e) {
                Log.printErrStackTrace(this.f161520i, e, "", new Object[0]);
                return;
            }
        } else {
            this.f161522n.f185647f = 1;
        }
        this.f161522n.f185654p = C31543z5.m39451a() - this.f161525q;
        this.f161521j.setPostInfo(this.f161522n);
        long j = this.f161522n.f185654p;
        boolean isLongVideo = this.f161521j.isLongVideo();
        C58386m mVar = C58386m.f167284a;
        mVar.mo83220a(1718, 9, 1, isLongVideo);
        mVar.mo83220a(1718, 10, j, isLongVideo);
        C66166c.f190172a.mo90231b(this.f161519h);
    }

    /* renamed from: q */
    public final int mo79350q(C64689rq2 rq22) {
        if (rq22.f185268f == 4 && !Util.isNullOrNil(rq22.f185283w)) {
            if (!Util.isNullOrNil(rq22.f185237D)) {
                Log.m105924i(this.f161520i, "mediaObject svr_coverUrl exist");
                return 0;
            } else if (!C86013q1.m106450k(rq22.f185283w)) {
                String str = this.f161520i;
                Log.m105928w(str, "upload failed, coverUrl not exist, " + rq22.f185283w);
                return 5;
            } else {
                C98124g gVar = new C98124g();
                gVar.f287660d = "task_FinderUploadTask_2";
                gVar.f287662f = this.f161534z;
                String mD5String = MD5Util.getMD5String(rq22.f185283w);
                C87412m.m108593f(mD5String, "getMD5String(mediaObject.coverUrl)");
                gVar.field_mediaId = mo79347n(mD5String);
                String str2 = rq22.f185283w;
                gVar.field_fullpath = str2;
                gVar.field_thumbpath = str2;
                gVar.field_talker = "";
                gVar.field_needStorage = true;
                String str3 = this.f161520i;
                Log.m105924i(str3, "upload cover file length " + C86013q1.m106451l(rq22.f185283w));
                gVar.field_fileType = 20304;
                gVar.field_appType = 251;
                gVar.field_bzScene = 2;
                gVar.f287673t = 120;
                gVar.f287674u = 300;
                gVar.field_priority = 2;
                this.f161524p.add(gVar.field_mediaId);
                Map<String, Float> map = this.f161523o;
                String str4 = gVar.field_mediaId;
                C87412m.m108593f(str4, "info.field_mediaId");
                map.put(str4, Float.valueOf(0.0f));
                ((ArrayList) this.f161530v).add(gVar);
            }
        }
        return 0;
    }

    /* renamed from: r */
    public final int mo79351r(C64689rq2 rq22) {
        if (!Util.isNullOrNil(rq22.f185239F)) {
            if (!Util.isNullOrNil(rq22.f185241H)) {
                Log.m105924i(this.f161520i, "mediaObject svr_fullThumbUrl exist");
                return 0;
            } else if (!C86013q1.m106450k(rq22.f185239F)) {
                String str = this.f161520i;
                Log.m105928w(str, "upload failed, fullThumbUrl not exist, " + rq22.f185239F);
                return 6;
            } else {
                C98124g gVar = new C98124g();
                gVar.f287660d = "task_FinderUploadTask_2";
                gVar.f287662f = this.f161534z;
                String mD5String = MD5Util.getMD5String(rq22.f185239F);
                C87412m.m108593f(mD5String, "getMD5String(mediaObject.fullThumbUrl)");
                gVar.field_mediaId = mo79347n(mD5String);
                String str2 = rq22.f185239F;
                gVar.field_fullpath = str2;
                gVar.field_thumbpath = str2;
                gVar.field_talker = "";
                gVar.field_needStorage = true;
                String str3 = this.f161520i;
                Log.m105924i(str3, "upload fullthumb file length " + C86013q1.m106451l(rq22.f185239F));
                gVar.field_fileType = 20304;
                gVar.field_appType = 251;
                gVar.field_bzScene = 2;
                gVar.f287673t = 120;
                gVar.f287674u = 300;
                gVar.field_priority = 2;
                this.f161524p.add(gVar.field_mediaId);
                Map<String, Float> map = this.f161523o;
                String str4 = gVar.field_mediaId;
                C87412m.m108593f(str4, "info.field_mediaId");
                map.put(str4, Float.valueOf(0.0f));
                ((ArrayList) this.f161530v).add(gVar);
            }
        }
        return 0;
    }
}
