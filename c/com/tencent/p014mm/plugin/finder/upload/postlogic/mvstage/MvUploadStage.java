package com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage;

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
import cr1.C57985h;
import di3.C86312j;
import dp1.C58384l1;
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
import p749xh.C66261f3;
import rx3.C13598b0;
import te3.C64689rq2;
import te3.C64736tq2;
import wp1.C15585f;
import wq1.C66177f;
import xq1.C66408e;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage */
public final class MvUploadStage extends C66177f {

    /* renamed from: h */
    public final FinderItem f161619h;

    /* renamed from: i */
    public final String f161620i = "LogPost.MvUploadStage";

    /* renamed from: j */
    public final C64736tq2 f161621j;

    /* renamed from: n */
    public final Map<String, Float> f161622n;

    /* renamed from: o */
    public final ConcurrentLinkedQueue<String> f161623o;

    /* renamed from: p */
    public long f161624p;

    /* renamed from: q */
    public boolean f161625q;

    /* renamed from: r */
    public List<C64689rq2> f161626r;

    /* renamed from: s */
    public boolean f161627s;

    /* renamed from: t */
    public List<String> f161628t;

    /* renamed from: u */
    public final List<C98124g> f161629u;

    /* renamed from: v */
    public C66408e f161630v;

    /* renamed from: w */
    public CountDownLatch f161631w;

    /* renamed from: x */
    public final MvUploadStage$feedDeleteListener$1 f161632x;

    /* renamed from: y */
    public final C56491a f161633y;

    /* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage$a */
    public static final class C56491a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ MvUploadStage f161634d;

        public C56491a(MvUploadStage mvUploadStage) {
            this.f161634d = mvUploadStage;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: te3.rq2} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: te3.rq2} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: te3.rq2} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: te3.rq2} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x036b  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x03a8  */
        /* renamed from: g0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo1773g0(java.lang.String r10, int r11, p1081gi.C98120c r12, p1081gi.C98121d r13, boolean r14) {
            /*
                r9 = this;
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r14 = r9.f161634d
                java.lang.String r14 = r14.f161620i
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "on cdn callback someOneFailed:"
                r0.append(r1)
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r1 = r9.f161634d
                boolean r1 = r1.f161627s
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
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r14 = r9.f161634d
                boolean r0 = r14.f161625q
                if (r0 != 0) goto L_0x03b9
                boolean r0 = r14.f161627s
                if (r0 == 0) goto L_0x0047
                goto L_0x03b9
            L_0x0047:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
                if (r0 != 0) goto L_0x0132
                java.util.Map<java.lang.String, java.lang.Float> r0 = r14.f161622n
                boolean r0 = r0.containsKey(r10)
                if (r0 == 0) goto L_0x0132
                if (r12 != 0) goto L_0x0059
                goto L_0x0132
            L_0x0059:
                r0 = 1065353216(0x3f800000, float:1.0)
                long r7 = r12.field_finishedLength
                float r2 = (float) r7
                float r2 = r2 * r0
                long r7 = r12.field_toltalLength
                float r0 = (float) r7
                float r2 = r2 / r0
                java.lang.String r0 = r14.f161620i
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
                java.util.Map<java.lang.String, java.lang.Float> r12 = r14.f161622n
                java.util.LinkedHashMap r12 = (java.util.LinkedHashMap) r12
                java.lang.Object r12 = r12.get(r10)
                gy3.C87412m.m108591d(r12)
                java.lang.Number r12 = (java.lang.Number) r12
                float r12 = r12.floatValue()
                int r12 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
                if (r12 <= 0) goto L_0x00af
                java.util.Map<java.lang.String, java.lang.Float> r12 = r14.f161622n
                gy3.C87412m.m108591d(r10)
                java.lang.Float r0 = java.lang.Float.valueOf(r2)
                r12.put(r10, r0)
            L_0x00af:
                java.util.Map<java.lang.String, java.lang.Float> r12 = r14.f161622n
                java.util.LinkedHashMap r12 = (java.util.LinkedHashMap) r12
                java.util.Collection r12 = r12.values()
                float r12 = sx3.C110818d0.m150944p0(r12)
                java.util.Map<java.lang.String, java.lang.Float> r0 = r14.f161622n
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
                java.lang.String r2 = r14.f161620i
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "feed "
                r4.append(r7)
                com.tencent.mm.plugin.finder.storage.FinderItem r7 = r14.f161619h
                long r7 = r7.getLocalId()
                r4.append(r7)
                java.lang.String r7 = " updateProgress  "
                r4.append(r7)
                r4.append(r12)
                java.lang.String r12 = ", "
                r4.append(r12)
                r4.append(r0)
                java.lang.String r12 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r12)
                com.tencent.mm.plugin.finder.storage.FinderItem r12 = r14.f161619h
                te3.tq2 r12 = r12.getPostInfo()
                int r12 = r12.f185649h
                if (r12 >= r0) goto L_0x0114
                com.tencent.mm.plugin.finder.storage.FinderItem r12 = r14.f161619h
                te3.tq2 r12 = r12.getPostInfo()
                r12.f185649h = r0
                wp1.f$a r12 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r14.f161619h
                r12.mo14347j(r0)
            L_0x0114:
                com.tencent.mm.autogen.events.FeedPostProgressEvent r12 = new com.tencent.mm.autogen.events.FeedPostProgressEvent
                r12.<init>()
                com.tencent.mm.autogen.events.FeedPostProgressEvent$a r0 = r12.f154751d
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r14.f161619h
                long r7 = r2.getLocalId()
                r0.f154752a = r7
                com.tencent.mm.autogen.events.FeedPostProgressEvent$a r0 = r12.f154751d
                com.tencent.mm.plugin.finder.storage.FinderItem r14 = r14.f161619h
                te3.tq2 r14 = r14.getPostInfo()
                int r14 = r14.f185649h
                r0.f154753b = r14
                r12.publish()
            L_0x0132:
                java.lang.String r12 = ""
                r14 = 0
                if (r11 == 0) goto L_0x01e7
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r13 = r9.f161634d
                java.lang.String r13 = r13.f161620i
                java.lang.Object[] r0 = new java.lang.Object[r6]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
                r0[r3] = r1
                r0[r5] = r10
                java.lang.String r1 = "start failed : %d, media id is :%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r1, r0)
                r13 = -21005(0xffffffffffffadf3, float:NaN)
                if (r11 == r13) goto L_0x01e6
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r13 = r9.f161634d
                java.util.List<java.lang.String> r13 = r13.f161628t
                if (r10 != 0) goto L_0x0156
                goto L_0x0157
            L_0x0156:
                r12 = r10
            L_0x0157:
                java.util.ArrayList r13 = (java.util.ArrayList) r13
                r13.add(r12)
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r12 = r9.f161634d
                r12.f161627s = r5
                com.tencent.mm.plugin.finder.storage.FinderItem r12 = r12.f161619h
                java.util.LinkedList r12 = r12.getMediaList()
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r13 = r9.f161634d
                java.util.Iterator r12 = r12.iterator()
            L_0x016c:
                boolean r0 = r12.hasNext()
                if (r0 == 0) goto L_0x0186
                java.lang.Object r0 = r12.next()
                r1 = r0
                te3.rq2 r1 = (te3.C64689rq2) r1
                java.lang.String r1 = r1.f185275p
                java.lang.String r2 = com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage.m64904h(r13, r10)
                boolean r1 = gy3.C87412m.m108589b(r1, r2)
                if (r1 == 0) goto L_0x016c
                goto L_0x0187
            L_0x0186:
                r0 = r14
            L_0x0187:
                te3.rq2 r0 = (te3.C64689rq2) r0
                if (r0 == 0) goto L_0x0190
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r12 = r9.f161634d
                com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage.m64906j(r12, r11, r0)
            L_0x0190:
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r12 = r9.f161634d
                com.tencent.mm.plugin.finder.storage.FinderItem r12 = r12.f161619h
                java.util.LinkedList r12 = r12.getClipListExt()
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r13 = r9.f161634d
                java.util.Iterator r12 = r12.iterator()
            L_0x019e:
                boolean r0 = r12.hasNext()
                if (r0 == 0) goto L_0x01d5
                java.lang.Object r0 = r12.next()
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r0
                java.util.LinkedList r0 = r0.getMediaList()
                java.util.Iterator r0 = r0.iterator()
            L_0x01b2:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x01cc
                java.lang.Object r1 = r0.next()
                r2 = r1
                te3.rq2 r2 = (te3.C64689rq2) r2
                java.lang.String r2 = r2.f185275p
                java.lang.String r4 = com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage.m64904h(r13, r10)
                boolean r2 = gy3.C87412m.m108589b(r2, r4)
                if (r2 == 0) goto L_0x01b2
                goto L_0x01cd
            L_0x01cc:
                r1 = r14
            L_0x01cd:
                te3.rq2 r1 = (te3.C64689rq2) r1
                if (r1 == 0) goto L_0x019e
                com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage.m64906j(r13, r11, r1)
                goto L_0x019e
            L_0x01d5:
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r10 = r9.f161634d
                r10.mo79379p(r3)
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r10 = r9.f161634d
                cr1.h r11 = new cr1.h
                com.tencent.mm.plugin.finder.storage.FinderItem r12 = r10.f161619h
                r11.<init>(r12, r6)
                com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage.m64905i(r10, r11)
            L_0x01e6:
                return r3
            L_0x01e7:
                boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
                if (r11 != 0) goto L_0x03b9
                if (r13 == 0) goto L_0x03b9
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r11 = r9.f161634d
                java.lang.String r11 = r11.f161620i
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
                if (r11 == 0) goto L_0x02aa
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r11 = r9.f161634d
                java.util.List<java.lang.String> r11 = r11.f161628t
                if (r10 != 0) goto L_0x0215
                goto L_0x0216
            L_0x0215:
                r12 = r10
            L_0x0216:
                java.util.ArrayList r11 = (java.util.ArrayList) r11
                r11.add(r12)
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r11 = r9.f161634d
                r11.f161627s = r5
                com.tencent.mm.plugin.finder.storage.FinderItem r11 = r11.f161619h
                java.util.LinkedList r11 = r11.getMediaList()
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r12 = r9.f161634d
                java.util.Iterator r11 = r11.iterator()
            L_0x022b:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L_0x0245
                java.lang.Object r0 = r11.next()
                r1 = r0
                te3.rq2 r1 = (te3.C64689rq2) r1
                java.lang.String r1 = r1.f185275p
                java.lang.String r2 = com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage.m64904h(r12, r10)
                boolean r1 = gy3.C87412m.m108589b(r1, r2)
                if (r1 == 0) goto L_0x022b
                goto L_0x0246
            L_0x0245:
                r0 = r14
            L_0x0246:
                te3.rq2 r0 = (te3.C64689rq2) r0
                if (r0 == 0) goto L_0x0251
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r11 = r9.f161634d
                int r12 = r13.field_retCode
                com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage.m64906j(r11, r12, r0)
            L_0x0251:
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r11 = r9.f161634d
                com.tencent.mm.plugin.finder.storage.FinderItem r11 = r11.f161619h
                java.util.LinkedList r11 = r11.getClipListExt()
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r12 = r9.f161634d
                java.util.Iterator r11 = r11.iterator()
            L_0x025f:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L_0x0298
                java.lang.Object r0 = r11.next()
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r0
                java.util.LinkedList r0 = r0.getMediaList()
                java.util.Iterator r0 = r0.iterator()
            L_0x0273:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x028d
                java.lang.Object r1 = r0.next()
                r2 = r1
                te3.rq2 r2 = (te3.C64689rq2) r2
                java.lang.String r2 = r2.f185275p
                java.lang.String r4 = com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage.m64904h(r12, r10)
                boolean r2 = gy3.C87412m.m108589b(r2, r4)
                if (r2 == 0) goto L_0x0273
                goto L_0x028e
            L_0x028d:
                r1 = r14
            L_0x028e:
                te3.rq2 r1 = (te3.C64689rq2) r1
                if (r1 == 0) goto L_0x025f
                int r0 = r13.field_retCode
                com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage.m64906j(r12, r0, r1)
                goto L_0x025f
            L_0x0298:
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r10 = r9.f161634d
                r10.mo79379p(r3)
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r10 = r9.f161634d
                cr1.h r11 = new cr1.h
                com.tencent.mm.plugin.finder.storage.FinderItem r12 = r10.f161619h
                r11.<init>(r12, r6)
                com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage.m64905i(r10, r11)
                return r3
            L_0x02aa:
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r11 = r9.f161634d
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r11 = r11.f161623o
                r11.remove(r10)
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r11 = r9.f161634d
                com.tencent.mm.plugin.finder.storage.FinderItem r11 = r11.f161619h
                java.util.LinkedList r11 = r11.getMediaList()
                java.util.LinkedList r12 = new java.util.LinkedList
                r12.<init>()
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r0 = r9.f161634d
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.f161619h
                java.util.LinkedList r0 = r0.getClipListExt()
                java.util.Iterator r0 = r0.iterator()
            L_0x02ca:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x02de
                java.lang.Object r1 = r0.next()
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r1
                java.util.LinkedList r1 = r1.getMediaList()
                r12.addAll(r1)
                goto L_0x02ca
            L_0x02de:
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r0 = r9.f161634d
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r0 = r0.f161623o
                int r0 = r0.size()
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r1 = r9.f161634d
                java.lang.String r1 = r1.f161620i
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "%s waitToUpload %d media localId:"
                r2.append(r4)
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r4 = r9.f161634d
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.f161619h
                long r7 = r4.getLocalId()
                r2.append(r7)
                java.lang.String r2 = r2.toString()
                java.lang.Object[] r4 = new java.lang.Object[r6]
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r6 = r9.f161634d
                com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.f161619h
                long r6 = r6.getLocalId()
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                r4[r3] = r6
                java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
                r4[r5] = r6
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r1 = r9.f161634d
                java.util.Iterator r2 = r11.iterator()
            L_0x0322:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x033c
                java.lang.Object r4 = r2.next()
                r6 = r4
                te3.rq2 r6 = (te3.C64689rq2) r6
                java.lang.String r6 = r6.f185275p
                java.lang.String r7 = com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage.m64904h(r1, r10)
                boolean r6 = gy3.C87412m.m108589b(r6, r7)
                if (r6 == 0) goto L_0x0322
                goto L_0x033d
            L_0x033c:
                r4 = r14
            L_0x033d:
                te3.rq2 r4 = (te3.C64689rq2) r4
                if (r4 != 0) goto L_0x0368
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r1 = r9.f161634d
                java.util.Iterator r12 = r12.iterator()
            L_0x0347:
                boolean r2 = r12.hasNext()
                if (r2 == 0) goto L_0x0361
                java.lang.Object r2 = r12.next()
                r4 = r2
                te3.rq2 r4 = (te3.C64689rq2) r4
                java.lang.String r4 = r4.f185275p
                java.lang.String r6 = com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage.m64904h(r1, r10)
                boolean r4 = gy3.C87412m.m108589b(r4, r6)
                if (r4 == 0) goto L_0x0347
                r14 = r2
            L_0x0361:
                r4 = r14
                te3.rq2 r4 = (te3.C64689rq2) r4
                if (r4 == 0) goto L_0x0368
                r10 = 1
                goto L_0x0369
            L_0x0368:
                r10 = 0
            L_0x0369:
                if (r4 == 0) goto L_0x03a6
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r12 = r9.f161634d
                java.lang.String r14 = r12.f161620i
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
                com.tencent.mm.plugin.finder.storage.FinderItem r10 = r12.f161619h
                r10.setMediaList(r11)
                com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage.m64906j(r12, r3, r4)
                wp1.f$a r10 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.storage.FinderItem r11 = r12.f161619h
                r10.mo14347j(r11)
            L_0x03a6:
                if (r0 != 0) goto L_0x03b9
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r10 = r9.f161634d
                r10.mo79379p(r5)
                com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage r10 = r9.f161634d
                cr1.c r11 = new cr1.c
                com.tencent.mm.plugin.finder.storage.FinderItem r12 = r10.f161619h
                r11.<init>(r12)
                com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage.m64905i(r10, r11)
            L_0x03b9:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage.C56491a.mo1773g0(java.lang.String, int, gi.c, gi.d, boolean):int");
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
    public MvUploadStage(FinderItem finderItem) {
        super(String.valueOf(finderItem.getLocalId()));
        C87412m.m108594g(finderItem, "finderObj");
        this.f161619h = finderItem;
        this.f161621j = finderItem.field_postinfo;
        this.f161622n = new LinkedHashMap();
        this.f161623o = new ConcurrentLinkedQueue<>();
        this.f161626r = new ArrayList();
        this.f161628t = new ArrayList();
        this.f161629u = new ArrayList();
        this.f161630v = new C57985h(finderItem, 2);
        this.f161631w = new CountDownLatch(1);
        this.f161632x = new MvUploadStage$feedDeleteListener$1(this, C40008f.f107254d);
        this.f161633y = new C56491a(this);
    }

    /* renamed from: h */
    public static final String m64904h(MvUploadStage mvUploadStage, String str) {
        mvUploadStage.getClass();
        boolean z = true;
        if (str == null || !C112551y.m153819s(str, "upload_", false)) {
            z = false;
        }
        if (z) {
            String substring = str.substring(7);
            C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        if (str == null) {
            str = "";
        }
        return str;
    }

    /* renamed from: i */
    public static final void m64905i(MvUploadStage mvUploadStage, C66408e eVar) {
        mvUploadStage.f161632x.dead();
        mvUploadStage.f161630v = eVar;
        mvUploadStage.f161631w.countDown();
    }

    /* renamed from: j */
    public static final void m64906j(MvUploadStage mvUploadStage, int i, C64689rq2 rq22) {
        mvUploadStage.mo79374k(rq22);
        FinderMediaReportObject finderMediaReportObject = rq22.f185262W0;
        if (finderMediaReportObject != null) {
            finderMediaReportObject.cdnUploadRetCode = i;
        }
        FinderItem finderItem = mvUploadStage.f161619h;
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
        boolean isLongVideo = this.f161619h.isLongVideo();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1253, 22, 1);
        if (isLongVideo) {
            if ((1253 == 1253 ? 1523 : 0) > 0) {
                nVar.mo175913w(1253 == 1253 ? 1523 : 0, 22, 1);
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
        boolean isLongVideo = this.f161619h.isLongVideo();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1253, 22, 1);
        if (isLongVideo) {
            if ((1253 == 1253 ? 1523 : 0) > 0) {
                nVar.mo175913w(1253 == 1253 ? 1523 : 0, 22, 1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0314, code lost:
        if (r11 == false) goto L_0x0465;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0461  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xq1.C66408e mo75105g() {
        /*
            r26 = this;
            r1 = r26
            java.lang.String r0 = r1.f161620i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "start localId:"
            r2.append(r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.f161619h
            long r3 = r3.getLocalId()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage$feedDeleteListener$1 r0 = r1.f161632x
            r0.alive()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161619h
            java.lang.String r2 = "upload"
            r0.trackPost(r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161619h
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            if (r0 != 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            r2 = 3
            r0.postStage = r2
        L_0x0036:
            long r2 = eb0.C31543z5.m39453c()
            r1.f161624p = r2
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
            cr1.h r0 = new cr1.h
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.f161619h
            r0.<init>(r3, r2)
            return r0
        L_0x0083:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161619h
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            r3 = 0
            if (r0 == 0) goto L_0x0091
            te3.hb1 r0 = r0.mvInfo
            goto L_0x0092
        L_0x0091:
            r0 = r3
        L_0x0092:
            if (r0 != 0) goto L_0x009c
            cr1.h r0 = new cr1.h
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.f161619h
            r0.<init>(r3, r2)
            return r0
        L_0x009c:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            int r5 = r0.f183461j
            r6 = 0
            r8 = 1
            r9 = 0
            if (r5 != r8) goto L_0x00d9
            java.util.LinkedList<te3.mb1> r0 = r0.f183460i
            java.lang.String r5 = "mvInfo.ordered_track_list_flex_clip"
            gy3.C87412m.m108593f(r0, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00b9:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x00d5
            java.lang.Object r10 = r0.next()
            r11 = r10
            te3.mb1 r11 = (te3.C64550mb1) r11
            long r11 = r11.f184260f
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 != 0) goto L_0x00ce
            r11 = 1
            goto L_0x00cf
        L_0x00ce:
            r11 = 0
        L_0x00cf:
            if (r11 == 0) goto L_0x00b9
            r5.add(r10)
            goto L_0x00b9
        L_0x00d5:
            r4.addAll(r5)
            goto L_0x0108
        L_0x00d9:
            java.util.LinkedList<te3.mb1> r0 = r0.f183455d
            java.lang.String r5 = "mvInfo.orderedTrackList"
            gy3.C87412m.m108593f(r0, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00e9:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x0105
            java.lang.Object r10 = r0.next()
            r11 = r10
            te3.mb1 r11 = (te3.C64550mb1) r11
            long r11 = r11.f184260f
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 != 0) goto L_0x00fe
            r11 = 1
            goto L_0x00ff
        L_0x00fe:
            r11 = 0
        L_0x00ff:
            if (r11 == 0) goto L_0x00e9
            r5.add(r10)
            goto L_0x00e9
        L_0x0105:
            r4.addAll(r5)
        L_0x0108:
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161619h
            java.util.LinkedList r0 = r0.getMediaList()
            r5.addAll(r0)
            java.util.Iterator r0 = r4.iterator()
            r4 = 0
        L_0x011b:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x0161
            java.lang.Object r10 = r0.next()
            int r11 = r4 + 1
            if (r4 < 0) goto L_0x015d
            te3.mb1 r10 = (te3.C64550mb1) r10
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.f161619h
            java.util.LinkedList r4 = r4.getClipListExt()
            java.util.Iterator r4 = r4.iterator()
        L_0x0135:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x014f
            java.lang.Object r12 = r4.next()
            r13 = r12
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r13
            java.lang.String r13 = r13.getObjectNonceId()
            java.lang.String r14 = r10.f184261g
            boolean r13 = gy3.C87412m.m108589b(r13, r14)
            if (r13 == 0) goto L_0x0135
            goto L_0x0150
        L_0x014f:
            r12 = r3
        L_0x0150:
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r12
            if (r12 == 0) goto L_0x015b
            java.util.LinkedList r4 = r12.getMediaList()
            r5.addAll(r4)
        L_0x015b:
            r4 = r11
            goto L_0x011b
        L_0x015d:
            sx3.C64197v.m75542k()
            throw r3
        L_0x0161:
            java.lang.Class<qo.l> r3 = p663qo.C101213l.class
            java.lang.String r4 = ""
            te3.tq2 r0 = r1.f161621j     // Catch:{ Exception -> 0x0176 }
            r0.f185647f = r9     // Catch:{ Exception -> 0x0176 }
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r1.f161619h     // Catch:{ Exception -> 0x0176 }
            r10.setPostInfo(r0)     // Catch:{ Exception -> 0x0176 }
            wp1.f$a r0 = wp1.C15585f.f42211a     // Catch:{ Exception -> 0x0176 }
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r1.f161619h     // Catch:{ Exception -> 0x0176 }
            r0.mo14347j(r10)     // Catch:{ Exception -> 0x0176 }
            goto L_0x017e
        L_0x0176:
            r0 = move-exception
            java.lang.String r10 = r1.f161620i
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r4, r11)
        L_0x017e:
            java.util.List<gi.g> r0 = r1.f161629u
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.util.Iterator r0 = r5.iterator()
        L_0x0189:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x04c5
            java.lang.Object r5 = r0.next()
            te3.rq2 r5 = (te3.C64689rq2) r5
            java.lang.String r10 = r5.f185266d
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            r11 = 7
            r12 = 4
            if (r10 != 0) goto L_0x047d
            java.lang.String r10 = r5.f185275p
            java.lang.String r13 = r1.f161620i
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "uploading media "
            r14.append(r15)
            r14.append(r10)
            java.lang.String r10 = ", "
            r14.append(r10)
            java.lang.String r10 = r5.f185266d
            r14.append(r10)
            java.lang.String r10 = " size:"
            r14.append(r10)
            java.lang.String r15 = r5.f185266d
            long r15 = com.tencent.p014mm.vfs.C86013q1.m106451l(r15)
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r15)
            r14.append(r15)
            java.lang.String r15 = " thumb: "
            r14.append(r15)
            java.lang.String r15 = r5.f185267e
            r14.append(r15)
            r14.append(r10)
            java.lang.String r15 = r5.f185267e
            long r15 = com.tencent.p014mm.vfs.C86013q1.m106451l(r15)
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r15)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r14)
            java.lang.String r13 = r5.f185278r
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x0213
            java.lang.String r13 = r5.f185279s
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x0213
            java.lang.String r10 = r1.f161620i
            java.lang.String r11 = "mediaObject svr_url and svr_thumbUrl exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            int r12 = r1.mo79380q(r5)
            if (r12 == 0) goto L_0x020d
            goto L_0x0465
        L_0x020d:
            int r12 = r1.mo79381r(r5)
            goto L_0x0465
        L_0x0213:
            java.lang.String r13 = r5.f185266d
            boolean r13 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r13 != 0) goto L_0x023b
            java.lang.String r10 = r1.f161620i
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "mediaObject.url "
            r11.append(r12)
            java.lang.String r5 = r5.f185266d
            r11.append(r5)
            java.lang.String r5 = " is not file"
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)
            r12 = 1
            goto L_0x0465
        L_0x023b:
            gi.g r13 = new gi.g
            r13.<init>()
            java.lang.String r14 = "task_FinderUploadTask_1"
            r13.f287660d = r14
            com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage$a r14 = r1.f161633y
            r13.f287662f = r14
            java.lang.String r14 = r5.f185266d
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r14)
            java.lang.String r15 = "getMD5String(mediaObject.url)"
            gy3.C87412m.m108593f(r14, r15)
            java.lang.String r14 = r1.mo79377n(r14)
            r13.field_mediaId = r14
            java.lang.String r14 = r5.f185266d
            r13.field_fullpath = r14
            java.lang.String r14 = r5.f185267e
            r13.field_thumbpath = r14
            r13.field_talker = r4
            r13.field_needStorage = r8
            java.lang.String r14 = r1.f161620i
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "upload file length "
            r15.append(r6)
            java.lang.String r6 = r5.f185266d
            long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
            r15.append(r6)
            java.lang.String r6 = " mediaId: "
            r15.append(r6)
            java.lang.String r6 = r13.field_mediaId
            r15.append(r6)
            java.lang.String r6 = " localId:"
            r15.append(r6)
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r1.f161619h
            long r6 = r6.getLocalId()
            r15.append(r6)
            java.lang.String r6 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r6)
            int r6 = r5.f185268f
            r7 = 251(0xfb, float:3.52E-43)
            if (r6 == r2) goto L_0x03f7
            if (r6 == r12) goto L_0x02b8
            if (r6 == r11) goto L_0x03f7
            java.lang.String r5 = r1.f161620i
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7[r9] = r6
            java.lang.String r6 = "unknown media type %d, quit upload"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r6, r7)
            r12 = 0
            goto L_0x0465
        L_0x02b8:
            java.lang.Class<com.tencent.mm.feature.sight.api.ISightJNIService> r6 = com.tencent.p014mm.feature.sight.api.ISightJNIService.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            com.tencent.mm.feature.sight.api.ISightJNIService r6 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r6
            java.lang.String r11 = r13.field_fullpath
            boolean r6 = r6.optimizeMP4VFS(r11)
            er1.w3 r11 = er1.C58784w3.f168295a
            java.lang.String r14 = r13.field_fullpath
            java.lang.String r15 = "info.field_fullpath"
            gy3.C87412m.m108593f(r14, r15)
            boolean r11 = r11.mo83883L0(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = r26.mo79378o()
            r14.append(r15)
            java.lang.String r15 = " optimize result: "
            r14.append(r15)
            r14.append(r6)
            java.lang.String r15 = ", isOptimize:"
            r14.append(r15)
            r14.append(r11)
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "Finder.LogPost.MusicMvFinderUploadTask"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r14)
            if (r6 != 0) goto L_0x0318
            ft1.a r17 = ft1.C59319a.f169618b
            r20 = 0
            r21 = 0
            r22 = 0
            cr1.f r6 = new cr1.f
            r6.<init>(r1)
            r24 = 28
            r25 = 0
            java.lang.String r18 = "optimizeMP4VFS_fail"
            r19 = r11
            r23 = r6
            o40.C11348f.C11349a.m11178b(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            if (r11 != 0) goto L_0x0318
            goto L_0x0465
        L_0x0318:
            ft1.a r17 = ft1.C59319a.f169618b
            r20 = 0
            r21 = 0
            r22 = 0
            cr1.g r6 = new cr1.g
            r6.<init>(r1)
            r24 = 28
            r25 = 0
            java.lang.String r18 = "opt_moov_fail"
            r19 = r11
            r23 = r6
            o40.C11348f.C11349a.m11178b(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r6 = 20302(0x4f4e, float:2.8449E-41)
            r13.field_fileType = r6
            r13.field_appType = r7
            r6 = 8
            r13.f287655L = r6
            r13.field_bzScene = r2
            r6 = 1200(0x4b0, float:1.682E-42)
            r13.f287673t = r6
            r13.f287674u = r6
            up1.f r7 = up1.C37521f.f99374d
            long r11 = r7.mo61164R()
            int r14 = r7.mo61179e()
            long r14 = (long) r14
            java.lang.String r2 = ", path:"
            int r18 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r18 > 0) goto L_0x035b
            boolean r11 = r1.mo79376m(r5)
            if (r11 == 0) goto L_0x03a8
        L_0x035b:
            java.lang.String r11 = r13.field_fullpath
            long r11 = com.tencent.p014mm.vfs.C86013q1.m106451l(r11)
            int r14 = r7.mo61179e()
            long r14 = (long) r14
            int r18 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x03a8
            com.tencent.mm.plugin.sight.base.a r7 = r1.mo79375l(r13)
            java.lang.String r11 = r1.f161620i
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "MultiBitrate_Video_Enable1, mediaInfo null?"
            r12.append(r14)
            if (r7 != 0) goto L_0x037e
            r7 = 1
            goto L_0x037f
        L_0x037e:
            r7 = 0
        L_0x037f:
            r12.append(r7)
            r12.append(r2)
            java.lang.String r2 = r13.field_fullpath
            r12.append(r2)
            java.lang.String r2 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            r1.mo79374k(r5)
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r2 = r5.f185262W0
            if (r2 != 0) goto L_0x0399
            goto L_0x039b
        L_0x0399:
            r2.isBigFile = r8
        L_0x039b:
            if (r2 != 0) goto L_0x039e
            goto L_0x03a0
        L_0x039e:
            r2.cdnControl = r9
        L_0x03a0:
            er1.b0 r2 = er1.C58695b0.f168022a
            er1.b0$a r7 = er1.C58695b0.f168023b
            r2.mo83612a(r7)
            goto L_0x03eb
        L_0x03a8:
            int r7 = r7.mo61181g()
            if (r7 != r8) goto L_0x03eb
            com.tencent.mm.plugin.sight.base.a r7 = r1.mo79375l(r13)
            java.lang.String r11 = r1.f161620i
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "MultiBitrate_Video_Enable2, mediaInfo null?"
            r12.append(r14)
            if (r7 != 0) goto L_0x03c2
            r7 = 1
            goto L_0x03c3
        L_0x03c2:
            r7 = 0
        L_0x03c3:
            r12.append(r7)
            r12.append(r2)
            java.lang.String r2 = r13.field_fullpath
            r12.append(r2)
            java.lang.String r2 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            r1.mo79374k(r5)
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r2 = r5.f185262W0
            if (r2 != 0) goto L_0x03dd
            goto L_0x03df
        L_0x03dd:
            r2.isBigFile = r8
        L_0x03df:
            if (r2 != 0) goto L_0x03e2
            goto L_0x03e4
        L_0x03e2:
            r2.cdnControl = r8
        L_0x03e4:
            er1.b0 r2 = er1.C58695b0.f168022a
            er1.b0$a r7 = er1.C58695b0.f168023b
            r2.mo83612a(r7)
        L_0x03eb:
            boolean r2 = r1.mo79376m(r5)
            if (r2 == 0) goto L_0x03f5
            r13.f287673t = r6
            r13.f287674u = r6
        L_0x03f5:
            r2 = 2
            goto L_0x040a
        L_0x03f7:
            java.lang.String r2 = r5.f185266d
            r13.field_thumbpath = r2
            r2 = 20304(0x4f50, float:2.8452E-41)
            r13.field_fileType = r2
            r13.field_appType = r7
            r2 = 2
            r13.field_bzScene = r2
            r6 = 300(0x12c, float:4.2E-43)
            r13.f287673t = r6
            r13.f287674u = r6
        L_0x040a:
            r13.field_priority = r2
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r2 = r1.f161623o
            java.lang.String r6 = r13.field_mediaId
            r2.add(r6)
            java.lang.String r2 = r1.f161620i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "add uploadingFeed "
            r6.append(r7)
            java.lang.String r7 = r13.field_mediaId
            r6.append(r7)
            r6.append(r10)
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r7 = r1.f161623o
            int r7 = r7.size()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            java.util.Map<java.lang.String, java.lang.Float> r2 = r1.f161622n
            java.lang.String r6 = r13.field_mediaId
            java.lang.String r7 = "info.field_mediaId"
            gy3.C87412m.m108593f(r6, r7)
            r7 = 0
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r2.put(r6, r7)
            di3.d r2 = di3.C86312j.m106911c(r3)
            qo.l r2 = (p663qo.C101213l) r2
            java.lang.String r6 = r13.field_mediaId
            r2.gn0(r6)
            java.util.List<gi.g> r2 = r1.f161629u
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r13)
            int r12 = r1.mo79380q(r5)
            if (r12 == 0) goto L_0x0461
            goto L_0x0465
        L_0x0461:
            int r12 = r1.mo79381r(r5)
        L_0x0465:
            if (r12 == 0) goto L_0x0487
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161619h
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            if (r0 != 0) goto L_0x046e
            goto L_0x0470
        L_0x046e:
            r0.uploadLogicError = r12
        L_0x0470:
            r1.mo79379p(r9)
            cr1.h r0 = new cr1.h
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.f161619h
            r6 = 2
            r0.<init>(r2, r6)
            goto L_0x0557
        L_0x047d:
            r6 = 2
            int r2 = r5.f185268f
            if (r2 == r6) goto L_0x048c
            if (r2 == r11) goto L_0x048c
            if (r2 != r12) goto L_0x0487
            goto L_0x048c
        L_0x0487:
            r2 = 2
            r6 = 0
            goto L_0x0189
        L_0x048c:
            java.lang.String r0 = r1.f161620i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "uploadFinderContent media.url invalid, url:"
            r2.append(r3)
            java.lang.String r3 = r5.f185266d
            r2.append(r3)
            java.lang.String r3 = ", type:"
            r2.append(r3)
            int r3 = r5.f185268f
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161619h
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            r2 = 2
            if (r0 != 0) goto L_0x04b7
            goto L_0x04b9
        L_0x04b7:
            r0.uploadLogicError = r2
        L_0x04b9:
            r1.mo79379p(r9)
            cr1.h r0 = new cr1.h
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.f161619h
            r0.<init>(r3, r2)
            goto L_0x0557
        L_0x04c5:
            java.lang.String r0 = r1.f161620i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "upload info count:"
            r2.append(r4)
            java.util.List<gi.g> r4 = r1.f161629u
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.util.List<gi.g> r0 = r1.f161629u
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            r6 = 0
        L_0x04ee:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x050b
            java.lang.Object r2 = r0.next()
            gi.g r2 = (p1081gi.C98124g) r2
            di3.d r4 = di3.C86312j.m106911c(r3)
            qo.l r4 = (p663qo.C101213l) r4
            r4.if0(r2)
            java.lang.String r2 = r2.field_fullpath
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            long r6 = r6 + r4
            goto L_0x04ee
        L_0x050b:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161619h
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            if (r0 != 0) goto L_0x0512
            goto L_0x0514
        L_0x0512:
            r0.uploadMediaTotalSize = r6
        L_0x0514:
            if (r0 == 0) goto L_0x051d
            uq1.m r2 = uq1.C65449m.f188332a
            java.lang.String r3 = "beginUpload"
            r2.mo89571k(r0, r3)
        L_0x051d:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r0 = r1.f161623o
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0530
            r1.mo79379p(r8)
            cr1.c r0 = new cr1.c
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.f161619h
            r0.<init>(r2)
            goto L_0x0557
        L_0x0530:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161619h
            boolean r0 = r0.isLongVideo()
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 21
            r12 = 1
            r3 = 1253(0x4e5, double:6.19E-321)
            r5 = 21
            r7 = 1
            r2 = r9
            r2.mo175913w(r3, r5, r7)
            if (r0 == 0) goto L_0x0550
            r3 = 1523(0x5f3, double:7.525E-321)
            r2 = r9
            r5 = r10
            r7 = r12
            r2.mo175913w(r3, r5, r7)
        L_0x0550:
            java.util.concurrent.CountDownLatch r0 = r1.f161631w
            r0.await()
            xq1.e r0 = r1.f161630v
        L_0x0557:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvUploadStage.mo75105g():xq1.e");
    }

    /* renamed from: k */
    public final void mo79374k(C64689rq2 rq22) {
        C13598b0 b0Var;
        FinderMediaReportObject finderMediaReportObject = rq22.f185262W0;
        if (finderMediaReportObject != null) {
            finderMediaReportObject.mediaType = rq22.f185268f;
            finderMediaReportObject.mediaId = rq22.f185275p;
            finderMediaReportObject.cdnUploadTime = (int) (C31543z5.m39453c() - this.f161624p);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            FinderMediaReportObject finderMediaReportObject2 = new FinderMediaReportObject();
            finderMediaReportObject2.mediaType = rq22.f185268f;
            finderMediaReportObject2.mediaId = rq22.f185275p;
            finderMediaReportObject2.cdnUploadTime = (int) (C31543z5.m39453c() - this.f161624p);
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
    public final C94554a mo79375l(C98124g gVar) {
        Class cls = C65000f.class;
        gVar.getClass();
        C94554a Yp = ((C65000f) C86312j.m106911c(cls)).mo89183Yp(gVar.field_fullpath);
        if (Yp != null) {
            int i = Yp.f273444b;
            String str = gVar.field_fullpath;
            C87412m.m108593f(str, "info.field_fullpath");
            String str2 = "videobitrate:" + i + "\r\nvideoformat:" + (((C65000f) C86312j.m106911c(cls)).mo89194iu(str) ? WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE : 28) + APLogFileUtil.SEPARATOR_LINE;
            Log.m105924i(this.f161620i, "customHeader " + str2);
            gVar.f287653J = str2;
        }
        return Yp;
    }

    /* renamed from: m */
    public final boolean mo79376m(C64689rq2 rq22) {
        Iterator it = ((ArrayList) this.f161626r).iterator();
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
    public final String mo79377n(String str) {
        return "upload_" + str;
    }

    /* renamed from: o */
    public final String mo79378o() {
        return "upload_" + this.f161619h.getLocalId();
    }

    /* renamed from: p */
    public final void mo79379p(boolean z) {
        if (!z) {
            try {
                this.f161621j.f185647f = 2;
            } catch (Exception e) {
                Log.printErrStackTrace(this.f161620i, e, "", new Object[0]);
                return;
            }
        } else {
            this.f161621j.f185647f = 1;
        }
        this.f161621j.f185654p = C31543z5.m39451a() - this.f161624p;
        FinderItem finderItem = this.f161619h;
        C64736tq2 tq22 = this.f161621j;
        C87412m.m108593f(tq22, C66261f3.COL_POSTINFO);
        finderItem.setPostInfo(tq22);
        long j = this.f161621j.f185654p;
        boolean isLongVideo = this.f161619h.isLongVideo();
        C58384l1 l1Var = C58384l1.f167282a;
        l1Var.mo83217a(1253, 9, 1, isLongVideo);
        l1Var.mo83217a(1253, 10, j, isLongVideo);
        C15585f.f42211a.mo14347j(this.f161619h);
    }

    /* renamed from: q */
    public final int mo79380q(C64689rq2 rq22) {
        if (rq22.f185268f == 4 && !Util.isNullOrNil(rq22.f185283w)) {
            if (!Util.isNullOrNil(rq22.f185237D)) {
                Log.m105924i(this.f161620i, "mediaObject svr_coverUrl exist");
                return 0;
            } else if (!C86013q1.m106450k(rq22.f185283w)) {
                String str = this.f161620i;
                Log.m105928w(str, "upload failed, coverUrl not exist, " + rq22.f185283w);
                return 5;
            } else {
                C98124g gVar = new C98124g();
                gVar.f287660d = "task_FinderUploadTask_2";
                gVar.f287662f = this.f161633y;
                String mD5String = MD5Util.getMD5String(rq22.f185283w);
                C87412m.m108593f(mD5String, "getMD5String(mediaObject.coverUrl)");
                gVar.field_mediaId = mo79377n(mD5String);
                String str2 = rq22.f185283w;
                gVar.field_fullpath = str2;
                gVar.field_thumbpath = str2;
                gVar.field_talker = "";
                gVar.field_needStorage = true;
                String str3 = this.f161620i;
                Log.m105924i(str3, "upload cover file length " + C86013q1.m106451l(rq22.f185283w));
                gVar.field_fileType = 20304;
                gVar.field_appType = 251;
                gVar.field_bzScene = 2;
                gVar.f287673t = 120;
                gVar.f287674u = 300;
                gVar.field_priority = 2;
                this.f161623o.add(gVar.field_mediaId);
                Map<String, Float> map = this.f161622n;
                String str4 = gVar.field_mediaId;
                C87412m.m108593f(str4, "info.field_mediaId");
                map.put(str4, Float.valueOf(0.0f));
                ((ArrayList) this.f161629u).add(gVar);
            }
        }
        return 0;
    }

    /* renamed from: r */
    public final int mo79381r(C64689rq2 rq22) {
        if (!Util.isNullOrNil(rq22.f185239F)) {
            if (!Util.isNullOrNil(rq22.f185241H)) {
                Log.m105924i(this.f161620i, "mediaObject svr_fullThumbUrl exist");
                return 0;
            } else if (!C86013q1.m106450k(rq22.f185239F)) {
                String str = this.f161620i;
                Log.m105928w(str, "upload failed, fullThumbUrl not exist, " + rq22.f185239F);
                return 6;
            } else {
                C98124g gVar = new C98124g();
                gVar.f287660d = "task_FinderUploadTask_2";
                gVar.f287662f = this.f161633y;
                String mD5String = MD5Util.getMD5String(rq22.f185239F);
                C87412m.m108593f(mD5String, "getMD5String(mediaObject.fullThumbUrl)");
                gVar.field_mediaId = mo79377n(mD5String);
                String str2 = rq22.f185239F;
                gVar.field_fullpath = str2;
                gVar.field_thumbpath = str2;
                gVar.field_talker = "";
                gVar.field_needStorage = true;
                String str3 = this.f161620i;
                Log.m105924i(str3, "upload fullthumb file length " + C86013q1.m106451l(rq22.f185239F));
                gVar.field_fileType = 20304;
                gVar.field_appType = 251;
                gVar.field_bzScene = 2;
                gVar.f287673t = 120;
                gVar.f287674u = 300;
                gVar.field_priority = 2;
                this.f161623o.add(gVar.field_mediaId);
                Map<String, Float> map = this.f161622n;
                String str4 = gVar.field_mediaId;
                C87412m.m108593f(str4, "info.field_mediaId");
                map.put(str4, Float.valueOf(0.0f));
                ((ArrayList) this.f161629u).add(gVar);
            }
        }
        return 0;
    }
}
