package com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage;

import ar1.C54324i;
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

/* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage */
public final class FinderUploadStage extends C66177f {

    /* renamed from: h */
    public FinderItem f161596h;

    /* renamed from: i */
    public final String f161597i = "LogPost.FinderUploadStage";

    /* renamed from: j */
    public final C64736tq2 f161598j;

    /* renamed from: n */
    public final Map<String, Float> f161599n;

    /* renamed from: o */
    public final ConcurrentLinkedQueue<String> f161600o;

    /* renamed from: p */
    public long f161601p;

    /* renamed from: q */
    public boolean f161602q;

    /* renamed from: r */
    public List<C64689rq2> f161603r;

    /* renamed from: s */
    public boolean f161604s;

    /* renamed from: t */
    public List<String> f161605t;

    /* renamed from: u */
    public final List<C98124g> f161606u;

    /* renamed from: v */
    public byte[] f161607v;

    /* renamed from: w */
    public C66408e f161608w;

    /* renamed from: x */
    public CountDownLatch f161609x;

    /* renamed from: y */
    public final FinderUploadStage$feedDeleteListener$1 f161610y;

    /* renamed from: z */
    public final C56489a f161611z;

    /* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage$a */
    public static final class C56489a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ FinderUploadStage f161612d;

        public C56489a(FinderUploadStage finderUploadStage) {
            this.f161612d = finderUploadStage;
        }

        /* JADX WARNING: Removed duplicated region for block: B:119:0x03a8  */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x0404  */
        /* JADX WARNING: Removed duplicated region for block: B:227:0x05f7  */
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
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r5 = r0.f161612d
                java.lang.String r5 = r5.f161597i
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "on cdn callback someOneFailed:"
                r6.append(r7)
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r7 = r0.f161612d
                boolean r7 = r7.f161604s
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
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r5 = r0.f161612d
                boolean r6 = r5.f161602q
                if (r6 != 0) goto L_0x060a
                boolean r6 = r5.f161604s
                if (r6 == 0) goto L_0x0051
                goto L_0x060a
            L_0x0051:
                r5.getClass()
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r17)
                if (r6 != 0) goto L_0x013f
                java.util.Map<java.lang.String, java.lang.Float> r6 = r5.f161599n
                boolean r6 = r6.containsKey(r1)
                if (r6 == 0) goto L_0x013f
                if (r3 != 0) goto L_0x0066
                goto L_0x013f
            L_0x0066:
                r6 = 1065353216(0x3f800000, float:1.0)
                long r13 = r3.field_finishedLength
                float r8 = (float) r13
                float r8 = r8 * r6
                long r13 = r3.field_toltalLength
                float r6 = (float) r13
                float r8 = r8 / r6
                java.lang.String r6 = r5.f161597i
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
                java.util.Map<java.lang.String, java.lang.Float> r3 = r5.f161599n
                java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
                java.lang.Object r3 = r3.get(r1)
                gy3.C87412m.m108591d(r3)
                java.lang.Number r3 = (java.lang.Number) r3
                float r3 = r3.floatValue()
                int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r3 <= 0) goto L_0x00bc
                java.util.Map<java.lang.String, java.lang.Float> r3 = r5.f161599n
                gy3.C87412m.m108591d(r17)
                java.lang.Float r6 = java.lang.Float.valueOf(r8)
                r3.put(r1, r6)
            L_0x00bc:
                java.util.Map<java.lang.String, java.lang.Float> r3 = r5.f161599n
                java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
                java.util.Collection r3 = r3.values()
                float r3 = sx3.C110818d0.m150944p0(r3)
                java.util.Map<java.lang.String, java.lang.Float> r6 = r5.f161599n
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
                java.lang.String r8 = r5.f161597i
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r13 = "feed "
                r10.append(r13)
                com.tencent.mm.plugin.finder.storage.FinderItem r13 = r5.f161596h
                long r13 = r13.getLocalId()
                r10.append(r13)
                java.lang.String r13 = " updateProgress  "
                r10.append(r13)
                r10.append(r3)
                java.lang.String r3 = ", "
                r10.append(r3)
                r10.append(r6)
                java.lang.String r3 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r5.f161596h
                te3.tq2 r3 = r3.getPostInfo()
                int r3 = r3.f185649h
                if (r3 >= r6) goto L_0x0121
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r5.f161596h
                te3.tq2 r3 = r3.getPostInfo()
                r3.f185649h = r6
                wp1.f$a r3 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.storage.FinderItem r6 = r5.f161596h
                r3.mo14345h(r6)
            L_0x0121:
                com.tencent.mm.autogen.events.FeedPostProgressEvent r3 = new com.tencent.mm.autogen.events.FeedPostProgressEvent
                r3.<init>()
                com.tencent.mm.autogen.events.FeedPostProgressEvent$a r6 = r3.f154751d
                com.tencent.mm.plugin.finder.storage.FinderItem r8 = r5.f161596h
                long r13 = r8.getLocalId()
                r6.f154752a = r13
                com.tencent.mm.autogen.events.FeedPostProgressEvent$a r6 = r3.f154751d
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.f161596h
                te3.tq2 r5 = r5.getPostInfo()
                int r5 = r5.f185649h
                r6.f154753b = r5
                r3.publish()
            L_0x013f:
                java.lang.String r3 = ""
                r5 = 0
                if (r2 == 0) goto L_0x01ed
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r4 = r0.f161612d
                java.lang.String r4 = r4.f161597i
                java.lang.Object[] r6 = new java.lang.Object[r12]
                java.lang.Integer r7 = java.lang.Integer.valueOf(r18)
                r6[r9] = r7
                r6[r11] = r1
                java.lang.String r7 = "start failed : %d, media id is :%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r7, r6)
                r4 = -21005(0xffffffffffffadf3, float:NaN)
                if (r2 == r4) goto L_0x01ec
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r4 = r0.f161612d
                boolean r4 = com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage.m64878h(r4, r1)
                if (r4 == 0) goto L_0x0165
                return r9
            L_0x0165:
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r4 = r0.f161612d
                java.util.List<java.lang.String> r4 = r4.f161605t
                if (r1 != 0) goto L_0x016c
                goto L_0x016d
            L_0x016c:
                r3 = r1
            L_0x016d:
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                r4.add(r3)
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r3 = r0.f161612d
                r3.f161604s = r11
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.f161596h
                java.util.LinkedList r3 = r3.getHalfVideoMediaExtList()
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r4 = r0.f161612d
                java.util.Iterator r3 = r3.iterator()
            L_0x0182:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x019c
                java.lang.Object r6 = r3.next()
                r7 = r6
                te3.rq2 r7 = (te3.C64689rq2) r7
                java.lang.String r7 = r7.f185275p
                java.lang.String r8 = r4.mo79368o(r1)
                boolean r7 = gy3.C87412m.m108589b(r7, r8)
                if (r7 == 0) goto L_0x0182
                goto L_0x019d
            L_0x019c:
                r6 = r5
            L_0x019d:
                te3.rq2 r6 = (te3.C64689rq2) r6
                if (r6 == 0) goto L_0x01a8
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r3 = r0.f161612d
                com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage.m64880j(r3, r2, r6)
                rx3.b0 r3 = rx3.C13598b0.f38549a
            L_0x01a8:
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r3 = r0.f161612d
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.f161596h
                java.util.LinkedList r3 = r3.getMediaList()
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r4 = r0.f161612d
                java.util.Iterator r3 = r3.iterator()
            L_0x01b6:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x01d0
                java.lang.Object r6 = r3.next()
                r7 = r6
                te3.rq2 r7 = (te3.C64689rq2) r7
                java.lang.String r7 = r7.f185275p
                java.lang.String r8 = r4.mo79368o(r1)
                boolean r7 = gy3.C87412m.m108589b(r7, r8)
                if (r7 == 0) goto L_0x01b6
                r5 = r6
            L_0x01d0:
                te3.rq2 r5 = (te3.C64689rq2) r5
                if (r5 == 0) goto L_0x01db
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r1 = r0.f161612d
                com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage.m64880j(r1, r2, r5)
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x01db:
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r1 = r0.f161612d
                r1.mo79370q(r9)
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r1 = r0.f161612d
                ar1.i r2 = new ar1.i
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.f161596h
                r2.<init>(r3, r12)
                com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage.m64879i(r1, r2)
            L_0x01ec:
                return r9
            L_0x01ed:
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r17)
                if (r2 != 0) goto L_0x060a
                if (r4 == 0) goto L_0x060a
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r2 = r0.f161612d
                java.lang.String r2 = r2.f161597i
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
                if (r2 == 0) goto L_0x02db
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r2 = r0.f161612d
                boolean r2 = com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage.m64878h(r2, r1)
                if (r2 == 0) goto L_0x021d
                return r9
            L_0x021d:
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r2 = r0.f161612d
                java.util.List<java.lang.String> r2 = r2.f161605t
                if (r1 != 0) goto L_0x0224
                goto L_0x0225
            L_0x0224:
                r3 = r1
            L_0x0225:
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                r2.add(r3)
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r2 = r0.f161612d
                r2.f161604s = r11
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f161596h
                java.util.LinkedList r2 = r2.getHalfVideoMediaExtList()
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r3 = r0.f161612d
                java.util.Iterator r2 = r2.iterator()
            L_0x023a:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L_0x0254
                java.lang.Object r6 = r2.next()
                r7 = r6
                te3.rq2 r7 = (te3.C64689rq2) r7
                java.lang.String r7 = r7.f185275p
                java.lang.String r8 = r3.mo79368o(r1)
                boolean r7 = gy3.C87412m.m108589b(r7, r8)
                if (r7 == 0) goto L_0x023a
                goto L_0x0255
            L_0x0254:
                r6 = r5
            L_0x0255:
                te3.rq2 r6 = (te3.C64689rq2) r6
                if (r6 == 0) goto L_0x0262
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r2 = r0.f161612d
                int r3 = r4.field_retCode
                com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage.m64880j(r2, r3, r6)
                rx3.b0 r2 = rx3.C13598b0.f38549a
            L_0x0262:
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r2 = r0.f161612d
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f161596h
                java.util.LinkedList r2 = r2.getMediaList()
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r3 = r0.f161612d
                java.util.Iterator r2 = r2.iterator()
            L_0x0270:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L_0x028a
                java.lang.Object r6 = r2.next()
                r7 = r6
                te3.rq2 r7 = (te3.C64689rq2) r7
                java.lang.String r7 = r7.f185275p
                java.lang.String r8 = r3.mo79368o(r1)
                boolean r7 = gy3.C87412m.m108589b(r7, r8)
                if (r7 == 0) goto L_0x0270
                goto L_0x028b
            L_0x028a:
                r6 = r5
            L_0x028b:
                te3.rq2 r6 = (te3.C64689rq2) r6
                if (r6 == 0) goto L_0x0298
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r2 = r0.f161612d
                int r3 = r4.field_retCode
                com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage.m64880j(r2, r3, r6)
                rx3.b0 r2 = rx3.C13598b0.f38549a
            L_0x0298:
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r2 = r0.f161612d
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f161596h
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
                if (r2 == 0) goto L_0x02aa
                te3.ve1 r2 = r2.feedBgmInfo
                if (r2 == 0) goto L_0x02aa
                te3.td1 r5 = r2.f185873d
            L_0x02aa:
                if (r5 == 0) goto L_0x02c9
                java.lang.String r2 = r5.f185539i
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r2)
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r3 = r0.f161612d
                java.lang.String r1 = r3.mo79368o(r1)
                boolean r1 = gy3.C87412m.m108589b(r2, r1)
                if (r1 == 0) goto L_0x02c9
                com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r3 = 1530(0x5fa, double:7.56E-321)
                r5 = 3
                r7 = 1
                r2.mo175913w(r3, r5, r7)
            L_0x02c9:
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r1 = r0.f161612d
                r1.mo79370q(r9)
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r1 = r0.f161612d
                ar1.i r2 = new ar1.i
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.f161596h
                r2.<init>(r3, r12)
                com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage.m64879i(r1, r2)
                return r9
            L_0x02db:
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r2 = r0.f161612d
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r2 = r2.f161600o
                r2.remove(r1)
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r2 = r0.f161612d
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f161596h
                java.util.LinkedList r2 = r2.getMediaList()
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r6 = r0.f161612d
                com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.f161596h
                java.util.LinkedList r6 = r6.getHalfVideoMediaExtList()
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r7 = r0.f161612d
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r7 = r7.f161600o
                int r7 = r7.size()
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r8 = r0.f161612d
                java.lang.String r8 = r8.f161597i
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r13 = "%s waitToUpload %d media localId:"
                r10.append(r13)
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r13 = r0.f161612d
                com.tencent.mm.plugin.finder.storage.FinderItem r13 = r13.f161596h
                long r13 = r13.getLocalId()
                r10.append(r13)
                java.lang.String r10 = r10.toString()
                java.lang.Object[] r12 = new java.lang.Object[r12]
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r13 = r0.f161612d
                com.tencent.mm.plugin.finder.storage.FinderItem r13 = r13.f161596h
                long r13 = r13.getLocalId()
                java.lang.Long r13 = java.lang.Long.valueOf(r13)
                r12[r9] = r13
                java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
                r12[r11] = r13
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r12)
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r8 = r0.f161612d
                java.util.List<te3.rq2> r10 = r8.f161603r
                java.util.Iterator r10 = r10.iterator()
            L_0x0338:
                boolean r12 = r10.hasNext()
                if (r12 == 0) goto L_0x0352
                java.lang.Object r12 = r10.next()
                r13 = r12
                te3.rq2 r13 = (te3.C64689rq2) r13
                java.lang.String r13 = r13.f185275p
                java.lang.String r14 = r8.mo79368o(r1)
                boolean r13 = gy3.C87412m.m108589b(r13, r14)
                if (r13 == 0) goto L_0x0338
                goto L_0x0353
            L_0x0352:
                r12 = r5
            L_0x0353:
                if (r12 == 0) goto L_0x0357
                r8 = 1
                goto L_0x0358
            L_0x0357:
                r8 = 0
            L_0x0358:
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r10 = r0.f161612d
                java.util.Iterator r12 = r2.iterator()
            L_0x035e:
                boolean r13 = r12.hasNext()
                if (r13 == 0) goto L_0x0378
                java.lang.Object r13 = r12.next()
                r14 = r13
                te3.rq2 r14 = (te3.C64689rq2) r14
                java.lang.String r14 = r14.f185275p
                java.lang.String r15 = r10.mo79368o(r1)
                boolean r14 = gy3.C87412m.m108589b(r14, r15)
                if (r14 == 0) goto L_0x035e
                goto L_0x0379
            L_0x0378:
                r13 = r5
            L_0x0379:
                te3.rq2 r13 = (te3.C64689rq2) r13
                if (r13 != 0) goto L_0x03a5
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r10 = r0.f161612d
                java.util.Iterator r6 = r6.iterator()
            L_0x0383:
                boolean r12 = r6.hasNext()
                if (r12 == 0) goto L_0x039d
                java.lang.Object r12 = r6.next()
                r13 = r12
                te3.rq2 r13 = (te3.C64689rq2) r13
                java.lang.String r13 = r13.f185275p
                java.lang.String r14 = r10.mo79368o(r1)
                boolean r13 = gy3.C87412m.m108589b(r13, r14)
                if (r13 == 0) goto L_0x0383
                goto L_0x039e
            L_0x039d:
                r12 = r5
            L_0x039e:
                r13 = r12
                te3.rq2 r13 = (te3.C64689rq2) r13
                if (r13 == 0) goto L_0x03a5
                r6 = 1
                goto L_0x03a6
            L_0x03a5:
                r6 = 0
            L_0x03a6:
                if (r13 == 0) goto L_0x0402
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r10 = r0.f161612d
                java.lang.String r12 = r10.f161597i
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
                if (r8 != 0) goto L_0x03ed
                if (r6 == 0) goto L_0x03e4
                com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage.m64880j(r10, r9, r13)
                goto L_0x03fb
            L_0x03e4:
                com.tencent.mm.plugin.finder.storage.FinderItem r6 = r10.f161596h
                r6.setMediaList(r2)
                com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage.m64880j(r10, r9, r13)
                goto L_0x03fb
            L_0x03ed:
                r2.clear()
                r2.add(r13)
                com.tencent.mm.plugin.finder.storage.FinderItem r6 = r10.f161596h
                r6.setMediaList(r2)
                com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage.m64880j(r10, r9, r13)
            L_0x03fb:
                wp1.f$a r6 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.storage.FinderItem r8 = r10.f161596h
                r6.mo14345h(r8)
            L_0x0402:
                if (r13 != 0) goto L_0x05f5
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r6 = r0.f161612d
                com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.f161596h
                com.tencent.mm.protocal.protobuf.FinderObject r6 = r6.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r6.objectDesc
                if (r6 == 0) goto L_0x0417
                te3.ve1 r6 = r6.feedBgmInfo
                if (r6 == 0) goto L_0x0417
                te3.td1 r6 = r6.f185873d
                goto L_0x0418
            L_0x0417:
                r6 = r5
            L_0x0418:
                if (r6 == 0) goto L_0x047d
                java.lang.String r6 = r6.f185539i
                if (r6 != 0) goto L_0x041f
                r6 = r3
            L_0x041f:
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r6)
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r8 = r0.f161612d
                java.lang.String r8 = r8.mo79368o(r1)
                boolean r6 = gy3.C87412m.m108589b(r6, r8)
                if (r6 == 0) goto L_0x047d
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r1 = r0.f161612d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.f161596h
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x0442
                te3.ve1 r1 = r1.feedBgmInfo
                if (r1 == 0) goto L_0x0442
                te3.td1 r1 = r1.f185873d
                goto L_0x0443
            L_0x0442:
                r1 = r5
            L_0x0443:
                if (r1 != 0) goto L_0x0446
                goto L_0x044a
            L_0x0446:
                java.lang.String r2 = r4.field_fileUrl
                r1.f185539i = r2
            L_0x044a:
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r1 = r0.f161612d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.f161596h
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x045d
                te3.ve1 r1 = r1.feedBgmInfo
                if (r1 == 0) goto L_0x045d
                te3.td1 r1 = r1.f185873d
                goto L_0x045e
            L_0x045d:
                r1 = r5
            L_0x045e:
                if (r1 != 0) goto L_0x0461
                goto L_0x0463
            L_0x0461:
                r1.f185534d = r3
            L_0x0463:
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r1 = r0.f161612d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.f161596h
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x0475
                te3.ve1 r1 = r1.feedBgmInfo
                if (r1 == 0) goto L_0x0475
                te3.td1 r5 = r1.f185873d
            L_0x0475:
                if (r5 != 0) goto L_0x0479
                goto L_0x05ec
            L_0x0479:
                r5.f185536f = r3
                goto L_0x05ec
            L_0x047d:
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r6 = r0.f161612d
                java.util.Iterator r8 = r2.iterator()
            L_0x0483:
                boolean r10 = r8.hasNext()
                if (r10 == 0) goto L_0x04a4
                java.lang.Object r10 = r8.next()
                r12 = r10
                te3.rq2 r12 = (te3.C64689rq2) r12
                java.lang.String r12 = r12.f185261W
                if (r12 != 0) goto L_0x0495
                r12 = r3
            L_0x0495:
                java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r12)
                java.lang.String r13 = r6.mo79368o(r1)
                boolean r12 = gy3.C87412m.m108589b(r12, r13)
                if (r12 == 0) goto L_0x0483
                goto L_0x04a5
            L_0x04a4:
                r10 = r5
            L_0x04a5:
                te3.rq2 r10 = (te3.C64689rq2) r10
                if (r10 == 0) goto L_0x04d9
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r6 = r0.f161612d
                java.lang.String r8 = r6.f161597i
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
                java.util.List<te3.rq2> r6 = r6.f161603r
                java.lang.Object r6 = sx3.C110818d0.m150916N(r6)
                te3.rq2 r6 = (te3.C64689rq2) r6
                if (r6 != 0) goto L_0x04d3
                goto L_0x04d7
            L_0x04d3:
                java.lang.String r8 = r4.field_fileUrl
                r6.f185259V = r8
            L_0x04d7:
                rx3.b0 r6 = rx3.C13598b0.f38549a
            L_0x04d9:
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r6 = r0.f161612d
                java.util.Iterator r8 = r2.iterator()
            L_0x04df:
                boolean r10 = r8.hasNext()
                if (r10 == 0) goto L_0x0500
                java.lang.Object r10 = r8.next()
                r12 = r10
                te3.rq2 r12 = (te3.C64689rq2) r12
                java.lang.String r12 = r12.f185283w
                if (r12 != 0) goto L_0x04f1
                r12 = r3
            L_0x04f1:
                java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r12)
                java.lang.String r13 = r6.mo79368o(r1)
                boolean r12 = gy3.C87412m.m108589b(r12, r13)
                if (r12 == 0) goto L_0x04df
                goto L_0x0501
            L_0x0500:
                r10 = r5
            L_0x0501:
                te3.rq2 r10 = (te3.C64689rq2) r10
                if (r10 == 0) goto L_0x0535
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r6 = r0.f161612d
                java.lang.String r8 = r6.f161597i
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
                java.util.List<te3.rq2> r6 = r6.f161603r
                java.lang.Object r6 = sx3.C110818d0.m150916N(r6)
                te3.rq2 r6 = (te3.C64689rq2) r6
                if (r6 != 0) goto L_0x052f
                goto L_0x0533
            L_0x052f:
                java.lang.String r8 = r4.field_fileUrl
                r6.f185237D = r8
            L_0x0533:
                rx3.b0 r6 = rx3.C13598b0.f38549a
            L_0x0535:
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r6 = r0.f161612d
                java.util.Iterator r2 = r2.iterator()
            L_0x053b:
                boolean r8 = r2.hasNext()
                if (r8 == 0) goto L_0x055c
                java.lang.Object r8 = r2.next()
                r10 = r8
                te3.rq2 r10 = (te3.C64689rq2) r10
                java.lang.String r10 = r10.f185239F
                if (r10 != 0) goto L_0x054d
                r10 = r3
            L_0x054d:
                java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r10)
                java.lang.String r12 = r6.mo79368o(r1)
                boolean r10 = gy3.C87412m.m108589b(r10, r12)
                if (r10 == 0) goto L_0x053b
                goto L_0x055d
            L_0x055c:
                r8 = r5
            L_0x055d:
                te3.rq2 r8 = (te3.C64689rq2) r8
                if (r8 == 0) goto L_0x0582
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r2 = r0.f161612d
                java.lang.String r2 = r2.f161597i
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r10 = "upload fullThumb ok, url:"
                r6.append(r10)
                java.lang.String r10 = r4.field_fileUrl
                r6.append(r10)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
                java.lang.String r2 = r4.field_fileUrl
                r8.f185241H = r2
                rx3.b0 r2 = rx3.C13598b0.f38549a
            L_0x0582:
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r2 = r0.f161612d
                java.lang.String r4 = r4.field_fileUrl
                com.tencent.mm.plugin.finder.storage.FinderItem r6 = r2.f161596h
                com.tencent.mm.protocal.protobuf.FinderObject r6 = r6.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r6.objectDesc
                if (r6 == 0) goto L_0x0597
                te3.ap1 r6 = r6.video_tmpl_info
                if (r6 == 0) goto L_0x0597
                te3.gz3 r6 = r6.f182122n
                goto L_0x0598
            L_0x0597:
                r6 = r5
            L_0x0598:
                if (r6 == 0) goto L_0x05ec
                java.util.LinkedList<java.lang.String> r6 = r6.f134371d
                if (r6 == 0) goto L_0x05ec
                java.util.Iterator r8 = r6.iterator()
            L_0x05a2:
                boolean r10 = r8.hasNext()
                if (r10 == 0) goto L_0x05be
                java.lang.Object r10 = r8.next()
                r12 = r10
                java.lang.String r12 = (java.lang.String) r12
                java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r12)
                java.lang.String r13 = r2.mo79368o(r1)
                boolean r12 = gy3.C87412m.m108589b(r12, r13)
                if (r12 == 0) goto L_0x05a2
                r5 = r10
            L_0x05be:
                java.lang.String r5 = (java.lang.String) r5
                if (r5 != 0) goto L_0x05c3
                goto L_0x05ec
            L_0x05c3:
                int r8 = r6.indexOf(r5)
                if (r4 != 0) goto L_0x05ca
                goto L_0x05cb
            L_0x05ca:
                r3 = r4
            L_0x05cb:
                r6.set(r8, r3)
                java.lang.String r2 = r2.f161597i
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "handleTemplateScyThumb target:"
                r3.append(r4)
                r3.append(r5)
                java.lang.String r4 = " to mediaId:"
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            L_0x05ec:
                wp1.f$a r1 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r2 = r0.f161612d
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f161596h
                r1.mo14345h(r2)
            L_0x05f5:
                if (r7 != 0) goto L_0x060a
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r1 = r0.f161612d
                r1.mo79370q(r11)
                com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r1 = r0.f161612d
                ar1.c r2 = new ar1.c
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.f161596h
                byte[] r4 = r1.f161607v
                r2.<init>(r3, r4)
                com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage.m64879i(r1, r2)
            L_0x060a:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage.C56489a.mo1773g0(java.lang.String, int, gi.c, gi.d, boolean):int");
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
    public FinderUploadStage(FinderItem finderItem) {
        super(String.valueOf(finderItem.getLocalId()));
        C87412m.m108594g(finderItem, "finderObj");
        this.f161596h = finderItem;
        this.f161598j = finderItem.field_postinfo;
        this.f161599n = new LinkedHashMap();
        this.f161600o = new ConcurrentLinkedQueue<>();
        this.f161603r = new ArrayList();
        this.f161605t = new ArrayList();
        this.f161606u = new ArrayList();
        this.f161608w = new C54324i(this.f161596h, 2);
        this.f161609x = new CountDownLatch(1);
        this.f161610y = new FinderUploadStage$feedDeleteListener$1(this, C40008f.f107254d);
        this.f161611z = new C56489a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = r0.video_tmpl_info;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m64878h(com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage r7, java.lang.String r8) {
        /*
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r7.f161596h
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            r1 = 0
            if (r0 == 0) goto L_0x0012
            te3.ap1 r0 = r0.video_tmpl_info
            if (r0 == 0) goto L_0x0012
            te3.gz3 r0 = r0.f182122n
            goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            r2 = 0
            if (r0 == 0) goto L_0x006c
            java.util.LinkedList<java.lang.String> r0 = r0.f134371d
            if (r0 == 0) goto L_0x006c
            java.util.Iterator r3 = r0.iterator()
        L_0x001e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r5)
            java.lang.String r6 = r7.mo79368o(r8)
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            if (r5 == 0) goto L_0x001e
            r1 = r4
        L_0x003a:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x003f
            goto L_0x006c
        L_0x003f:
            int r2 = r0.indexOf(r1)
            java.lang.String r3 = ""
            r0.set(r2, r3)
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r0 = r7.f161600o
            r0.remove(r8)
            java.lang.String r7 = r7.f161597i
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "handleTemplateScyThumb upload fail target:"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " to mediaId:"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            r2 = 1
        L_0x006c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage.m64878h(com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage, java.lang.String):boolean");
    }

    /* renamed from: i */
    public static final void m64879i(FinderUploadStage finderUploadStage, C66408e eVar) {
        finderUploadStage.f161610y.dead();
        finderUploadStage.f161608w = eVar;
        finderUploadStage.f161609x.countDown();
    }

    /* renamed from: j */
    public static final void m64880j(FinderUploadStage finderUploadStage, int i, C64689rq2 rq22) {
        finderUploadStage.mo79364k(rq22);
        FinderMediaReportObject finderMediaReportObject = rq22.f185262W0;
        if (finderMediaReportObject != null) {
            finderMediaReportObject.cdnUploadRetCode = i;
        }
        FinderItem finderItem = finderUploadStage.f161596h;
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
        boolean isLongVideo = this.f161596h.isLongVideo();
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
        boolean isLongVideo = this.f161596h.isLongVideo();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1253, 22, 1);
        if (isLongVideo) {
            if ((1253 == 1253 ? 1523 : 0) > 0) {
                nVar.mo175913w(1253 == 1253 ? 1523 : 0, 22, 1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bc, code lost:
        r0 = r0.video_tmpl_info;
     */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04fa  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0503  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x05ba  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x05bd  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x05c2  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x05c5  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x05ca  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x05cd  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x05d2  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x05d5  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x05da  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0607  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x06dd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0705 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xq1.C66408e mo75105g() {
        /*
            r30 = this;
            r1 = r30
            java.lang.String r0 = r1.f161597i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "start localId:"
            r2.append(r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.f161596h
            long r3 = r3.getLocalId()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage$feedDeleteListener$1 r0 = r1.f161610y
            r0.alive()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161596h
            java.lang.String r2 = "upload"
            r0.trackPost(r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161596h
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            if (r0 != 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            r2 = 3
            r0.postStage = r2
        L_0x0036:
            long r2 = eb0.C31543z5.m39453c()
            r1.f161601p = r2
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
            ar1.i r0 = new ar1.i
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.f161596h
            r0.<init>(r3, r2)
            return r0
        L_0x0083:
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161596h
            java.util.LinkedList r0 = r0.getHalfVideoMediaExtList()
            r3.addAll(r0)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161596h
            boolean r0 = r0.isLongVideo()
            if (r0 == 0) goto L_0x00a9
            r3.clear()
            java.util.List<te3.rq2> r0 = r1.f161603r
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.f161596h
            java.util.LinkedList r4 = r4.getMediaList()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r4)
        L_0x00a9:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161596h
            java.util.LinkedList r0 = r0.getMediaList()
            r3.addAll(r0)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161596h
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x00c3
            te3.ap1 r0 = r0.video_tmpl_info
            if (r0 == 0) goto L_0x00c3
            te3.gz3 r0 = r0.f182122n
            goto L_0x00c4
        L_0x00c3:
            r0 = 0
        L_0x00c4:
            java.lang.String r5 = "http"
            r6 = 0
            if (r0 == 0) goto L_0x013c
            java.util.LinkedList<java.lang.String> r7 = r0.f134371d
            int r7 = r7.size()
            if (r7 != 0) goto L_0x00d2
            goto L_0x013c
        L_0x00d2:
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            java.util.LinkedList<java.lang.String> r0 = r0.f134371d
            java.lang.String r8 = "templateScyList.frame_urls"
            gy3.C87412m.m108593f(r0, r8)
            java.util.Iterator r0 = r0.iterator()
        L_0x00e3:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x013d
            java.lang.Object r8 = r0.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r9 == 0) goto L_0x0125
            te3.rq2 r9 = new te3.rq2
            r9.<init>()
            r9.f185268f = r2
            r9.f185266d = r8
            java.lang.String r10 = "it"
            gy3.C87412m.m108593f(r8, r10)
            boolean r10 = z04.C112550d0.m153801u(r8, r5, r6)
            if (r10 == 0) goto L_0x010b
            r9.f185278r = r8
        L_0x010b:
            r7.add(r9)
            java.lang.String r9 = r1.f161597i
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "add TemplateScy media:"
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            goto L_0x00e3
        L_0x0125:
            java.lang.String r9 = r1.f161597i
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "TemplateScyImgToLocalFinderMedia error,for file not exist:"
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r8)
            goto L_0x00e3
        L_0x013c:
            r7 = 0
        L_0x013d:
            if (r7 == 0) goto L_0x0142
            r3.addAll(r7)
        L_0x0142:
            java.lang.Class<qo.l> r7 = p663qo.C101213l.class
            java.lang.String r8 = ""
            te3.tq2 r0 = r1.f161598j     // Catch:{ Exception -> 0x0157 }
            r0.f185647f = r6     // Catch:{ Exception -> 0x0157 }
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r1.f161596h     // Catch:{ Exception -> 0x0157 }
            r9.setPostInfo(r0)     // Catch:{ Exception -> 0x0157 }
            wp1.f$a r0 = wp1.C15585f.f42211a     // Catch:{ Exception -> 0x0157 }
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r1.f161596h     // Catch:{ Exception -> 0x0157 }
            r0.mo14345h(r9)     // Catch:{ Exception -> 0x0157 }
            goto L_0x015f
        L_0x0157:
            r0 = move-exception
            java.lang.String r9 = r1.f161597i
            java.lang.Object[] r10 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r8, r10)
        L_0x015f:
            java.util.List<gi.g> r0 = r1.f161606u
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161596h
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x0173
            te3.ve1 r0 = r0.feedBgmInfo
            goto L_0x0174
        L_0x0173:
            r0 = 0
        L_0x0174:
            java.lang.String r9 = "info.field_mediaId"
            java.lang.String r10 = " is not file"
            r11 = 8
            r12 = 20302(0x4f4e, float:2.8449E-41)
            r14 = 600(0x258, float:8.41E-43)
            r15 = 251(0xfb, float:3.52E-43)
            r4 = 1
            if (r0 == 0) goto L_0x0255
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161596h
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x0197
            te3.ve1 r0 = r0.feedBgmInfo
            if (r0 == 0) goto L_0x0197
            int r0 = r0.f185875f
            if (r0 != r4) goto L_0x0197
            r0 = 1
            goto L_0x0198
        L_0x0197:
            r0 = 0
        L_0x0198:
            if (r0 == 0) goto L_0x0255
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161596h
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x01ab
            te3.ve1 r0 = r0.feedBgmInfo
            if (r0 == 0) goto L_0x01ab
            te3.td1 r0 = r0.f185873d
            goto L_0x01ac
        L_0x01ab:
            r0 = 0
        L_0x01ac:
            if (r0 == 0) goto L_0x0255
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161596h
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x01c3
            te3.ve1 r0 = r0.feedBgmInfo
            if (r0 == 0) goto L_0x01c3
            te3.td1 r0 = r0.f185873d
            if (r0 == 0) goto L_0x01c3
            java.lang.String r0 = r0.f185534d
            goto L_0x01c4
        L_0x01c3:
            r0 = 0
        L_0x01c4:
            if (r0 == 0) goto L_0x01cf
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01cd
            goto L_0x01cf
        L_0x01cd:
            r0 = 0
            goto L_0x01d0
        L_0x01cf:
            r0 = 1
        L_0x01d0:
            if (r0 == 0) goto L_0x0255
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161596h
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x0255
            te3.ve1 r0 = r0.feedBgmInfo
            if (r0 == 0) goto L_0x0255
            te3.td1 r0 = r0.f185873d
            if (r0 == 0) goto L_0x0255
            java.lang.String r0 = r0.f185539i
            if (r0 == 0) goto L_0x0255
            boolean r5 = z04.C112551y.m153819s(r0, r5, r4)
            if (r5 != 0) goto L_0x0255
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r5 != 0) goto L_0x020e
            java.lang.String r5 = r1.f161597i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r13 = "audio track "
            r6.append(r13)
            r6.append(r0)
            r6.append(r10)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x0255
        L_0x020e:
            gi.g r5 = new gi.g
            r5.<init>()
            com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage$a r6 = r1.f161611z
            r5.f287662f = r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)
            java.lang.String r13 = "getMD5String(path)"
            gy3.C87412m.m108593f(r6, r13)
            java.lang.String r6 = r1.mo79367n(r6)
            r5.field_mediaId = r6
            r5.field_fullpath = r0
            r5.field_needStorage = r4
            r5.field_fileType = r12
            r5.field_appType = r15
            r5.f287655L = r11
            r5.field_bzScene = r2
            r0 = 60
            r5.f287673t = r0
            r5.f287674u = r14
            r5.field_priority = r2
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r0 = r1.f161600o
            r0.add(r6)
            java.util.Map<java.lang.String, java.lang.Float> r0 = r1.f161599n
            java.lang.String r6 = r5.field_mediaId
            gy3.C87412m.m108593f(r6, r9)
            r13 = 0
            java.lang.Float r14 = java.lang.Float.valueOf(r13)
            r0.put(r6, r14)
            java.util.List<gi.g> r0 = r1.f161606u
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r5)
        L_0x0255:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161596h
            te3.tq2 r0 = r0.getPostInfo()
            te3.br3 r0 = r0.f185657s
            if (r0 == 0) goto L_0x0262
            java.lang.String r0 = r0.f182331f
            goto L_0x0263
        L_0x0262:
            r0 = 0
        L_0x0263:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r0 = r0 ^ r4
            if (r0 != 0) goto L_0x074f
            java.util.Iterator r0 = r3.iterator()
            r3 = 0
        L_0x026f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0777
            java.lang.Object r5 = r0.next()
            int r6 = r3 + 1
            if (r3 < 0) goto L_0x074a
            te3.rq2 r5 = (te3.C64689rq2) r5
            java.lang.String r13 = r5.f185266d
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            r11 = 4
            if (r13 != 0) goto L_0x06f4
            java.lang.String r13 = r5.f185275p
            java.lang.String r15 = r1.f161597i
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "uploading media "
            r12.append(r14)
            r12.append(r13)
            java.lang.String r13 = ", index:"
            r12.append(r13)
            r12.append(r3)
            r13 = 32
            r12.append(r13)
            java.lang.String r13 = r5.f185266d
            r12.append(r13)
            java.lang.String r13 = " size:"
            r12.append(r13)
            java.lang.String r14 = r5.f185266d
            long r18 = com.tencent.p014mm.vfs.C86013q1.m106451l(r14)
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r18)
            r12.append(r14)
            java.lang.String r14 = " thumb: "
            r12.append(r14)
            java.lang.String r14 = r5.f185267e
            r12.append(r14)
            r12.append(r13)
            java.lang.String r14 = r5.f185267e
            long r18 = com.tencent.p014mm.vfs.C86013q1.m106451l(r14)
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r18)
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r12)
            java.lang.String r12 = r5.f185278r
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 != 0) goto L_0x02fa
            java.lang.String r12 = r5.f185279s
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 != 0) goto L_0x02fa
            java.lang.String r12 = r1.f161597i
            java.lang.String r13 = "mediaObject svr_url and svr_thumbUrl exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
            r20 = r3
            goto L_0x03b2
        L_0x02fa:
            java.lang.String r12 = r5.f185266d
            boolean r12 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
            if (r12 != 0) goto L_0x032a
            java.lang.String r12 = r1.f161597i
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "mediaObject.url "
            r13.append(r14)
            java.lang.String r14 = r5.f185266d
            r13.append(r14)
            r13.append(r10)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r1.f161596h
            r13 = 0
            r12.setPostFailedAndNotRetry(r13)
            r20 = r3
            r2 = 1
        L_0x0326:
            r3 = 600(0x258, float:8.41E-43)
            goto L_0x0642
        L_0x032a:
            gi.g r12 = new gi.g
            r12.<init>()
            java.lang.String r14 = "task_FinderUploadTask_1"
            r12.f287660d = r14
            com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage$a r14 = r1.f161611z
            r12.f287662f = r14
            java.lang.String r14 = r5.f185266d
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r14)
            java.lang.String r15 = "getMD5String(mediaObject.url)"
            gy3.C87412m.m108593f(r14, r15)
            java.lang.String r14 = r1.mo79367n(r14)
            r12.field_mediaId = r14
            java.lang.String r14 = r5.f185266d
            r12.field_fullpath = r14
            java.lang.String r14 = r5.f185267e
            r12.field_thumbpath = r14
            r12.field_talker = r8
            r12.field_needStorage = r4
            java.lang.String r14 = r1.f161597i
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r4 = "upload file length "
            r15.append(r4)
            java.lang.String r4 = r5.f185266d
            r20 = r3
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)
            r15.append(r2)
            java.lang.String r2 = " mediaId: "
            r15.append(r2)
            java.lang.String r2 = r12.field_mediaId
            r15.append(r2)
            java.lang.String r2 = " localId:"
            r15.append(r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.f161596h
            long r2 = r2.getLocalId()
            r15.append(r2)
            java.lang.String r2 = " mediaType:"
            r15.append(r2)
            int r2 = r5.f185268f
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
            int r2 = r5.f185268f
            r14 = 2
            if (r2 == r14) goto L_0x0507
            if (r2 == r11) goto L_0x03b5
            r14 = 7
            if (r2 == r14) goto L_0x0507
            java.lang.String r3 = r1.f161597i
            r4 = 1
            java.lang.Object[] r12 = new java.lang.Object[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r12[r4] = r2
            java.lang.String r2 = "unknown media type %d, quit upload"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r2, r12)
        L_0x03b2:
            r2 = 0
            goto L_0x0326
        L_0x03b5:
            java.lang.Class<com.tencent.mm.feature.sight.api.ISightJNIService> r2 = com.tencent.p014mm.feature.sight.api.ISightJNIService.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            com.tencent.mm.feature.sight.api.ISightJNIService r2 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r2
            java.lang.String r14 = r12.field_fullpath
            boolean r2 = r2.optimizeMP4VFS(r14)
            er1.w3 r14 = er1.C58784w3.f168295a
            java.lang.String r15 = r12.field_fullpath
            java.lang.String r11 = "info.field_fullpath"
            gy3.C87412m.m108593f(r15, r11)
            boolean r11 = r14.mo83883L0(r15)
            java.lang.String r14 = r1.f161597i
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r3 = r30.mo79369p()
            r15.append(r3)
            java.lang.String r3 = " optimize result: "
            r15.append(r3)
            r15.append(r2)
            java.lang.String r3 = ", isOptimize:"
            r15.append(r3)
            r15.append(r11)
            java.lang.String r3 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r3)
            if (r2 != 0) goto L_0x0411
            ft1.a r21 = ft1.C59319a.f169618b
            r24 = 0
            r25 = 0
            r26 = 0
            ar1.g r2 = new ar1.g
            r2.<init>(r1)
            r28 = 28
            r29 = 0
            java.lang.String r22 = "optimizeMP4VFS_fail"
            r23 = r11
            r27 = r2
            o40.C11348f.C11349a.m11178b(r21, r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x0411:
            ft1.a r21 = ft1.C59319a.f169618b
            r24 = 0
            r25 = 0
            r26 = 0
            ar1.h r2 = new ar1.h
            r2.<init>(r1)
            r28 = 28
            r29 = 0
            java.lang.String r22 = "opt_moov_fail"
            r23 = r11
            r27 = r2
            o40.C11348f.C11349a.m11178b(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r2 = 20302(0x4f4e, float:2.8449E-41)
            r12.field_fileType = r2
            r3 = 251(0xfb, float:3.52E-43)
            r12.field_appType = r3
            r3 = 8
            r12.f287655L = r3
            r11 = 2
            r12.field_bzScene = r11
            r11 = 600(0x258, float:8.41E-43)
            r12.f287673t = r11
            r11 = 1200(0x4b0, float:1.682E-42)
            r12.f287674u = r11
            up1.f r14 = up1.C37521f.f99374d
            long r21 = r14.mo61164R()
            int r15 = r14.mo61179e()
            long r2 = (long) r15
            java.lang.String r15 = ", path:"
            int r23 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
            if (r23 > 0) goto L_0x045c
            boolean r2 = r1.mo79366m(r5)
            if (r2 == 0) goto L_0x045a
            goto L_0x045c
        L_0x045a:
            r2 = r12
            goto L_0x04af
        L_0x045c:
            java.lang.String r2 = r12.field_fullpath
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            int r4 = r14.mo61179e()
            r22 = r12
            long r11 = (long) r4
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            r2 = r22
            if (r4 <= 0) goto L_0x04af
            com.tencent.mm.plugin.sight.base.a r3 = r1.mo79365l(r2)
            java.lang.String r4 = r1.f161597i
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "MultiBitrate_Video_Enable1, mediaInfo null?"
            r11.append(r12)
            if (r3 != 0) goto L_0x0483
            r3 = 1
            goto L_0x0484
        L_0x0483:
            r3 = 0
        L_0x0484:
            r11.append(r3)
            r11.append(r15)
            java.lang.String r3 = r2.field_fullpath
            r11.append(r3)
            java.lang.String r3 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            r1.mo79364k(r5)
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r3 = r5.f185262W0
            if (r3 != 0) goto L_0x049e
            goto L_0x04a1
        L_0x049e:
            r4 = 1
            r3.isBigFile = r4
        L_0x04a1:
            if (r3 != 0) goto L_0x04a4
            goto L_0x04a7
        L_0x04a4:
            r4 = 0
            r3.cdnControl = r4
        L_0x04a7:
            er1.b0 r3 = er1.C58695b0.f168022a
            er1.b0$a r4 = er1.C58695b0.f168023b
            r3.mo83612a(r4)
            goto L_0x04f4
        L_0x04af:
            int r3 = r14.mo61181g()
            r4 = 1
            if (r3 != r4) goto L_0x04f4
            com.tencent.mm.plugin.sight.base.a r3 = r1.mo79365l(r2)
            java.lang.String r4 = r1.f161597i
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "MultiBitrate_Video_Enable2, mediaInfo null?"
            r11.append(r12)
            if (r3 != 0) goto L_0x04ca
            r3 = 1
            goto L_0x04cb
        L_0x04ca:
            r3 = 0
        L_0x04cb:
            r11.append(r3)
            r11.append(r15)
            java.lang.String r3 = r2.field_fullpath
            r11.append(r3)
            java.lang.String r3 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            r1.mo79364k(r5)
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r3 = r5.f185262W0
            r4 = 1
            if (r3 != 0) goto L_0x04e6
            goto L_0x04e8
        L_0x04e6:
            r3.isBigFile = r4
        L_0x04e8:
            if (r3 != 0) goto L_0x04eb
            goto L_0x04ed
        L_0x04eb:
            r3.cdnControl = r4
        L_0x04ed:
            er1.b0 r3 = er1.C58695b0.f168022a
            er1.b0$a r4 = er1.C58695b0.f168023b
            r3.mo83612a(r4)
        L_0x04f4:
            boolean r3 = r1.mo79366m(r5)
            if (r3 == 0) goto L_0x0503
            r3 = 600(0x258, float:8.41E-43)
            r2.f287673t = r3
            r4 = 1200(0x4b0, float:1.682E-42)
            r2.f287674u = r4
            goto L_0x0505
        L_0x0503:
            r3 = 600(0x258, float:8.41E-43)
        L_0x0505:
            r4 = 2
            goto L_0x051b
        L_0x0507:
            r2 = r12
            r3 = 600(0x258, float:8.41E-43)
            r4 = 20304(0x4f50, float:2.8452E-41)
            r2.field_fileType = r4
            r4 = 251(0xfb, float:3.52E-43)
            r2.field_appType = r4
            r4 = 2
            r2.field_bzScene = r4
            r11 = 300(0x12c, float:4.2E-43)
            r2.f287673t = r11
            r2.f287674u = r11
        L_0x051b:
            r2.field_priority = r4
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r4 = r1.f161600o
            java.lang.String r11 = r2.field_mediaId
            r4.add(r11)
            java.util.Map<java.lang.String, java.lang.Float> r4 = r1.f161599n
            java.lang.String r11 = r2.field_mediaId
            gy3.C87412m.m108593f(r11, r9)
            r12 = 0
            java.lang.Float r14 = java.lang.Float.valueOf(r12)
            r4.put(r11, r14)
            java.lang.String r4 = r1.f161597i
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "add uploadingFeed before cancel "
            r11.append(r12)
            java.lang.String r12 = r2.field_mediaId
            r11.append(r12)
            r11.append(r13)
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r12 = r1.f161600o
            int r12 = r12.size()
            r11.append(r12)
            java.lang.String r12 = " appType:"
            r11.append(r12)
            int r14 = r2.field_appType
            r11.append(r14)
            java.lang.String r14 = " fileType:"
            r11.append(r14)
            int r15 = r2.field_fileType
            r11.append(r15)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            di3.d r4 = di3.C86312j.m106911c(r7)
            qo.l r4 = (p663qo.C101213l) r4
            java.lang.String r11 = r2.field_mediaId
            r4.gn0(r11)
            java.lang.String r4 = r1.f161597i
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r15 = "add uploadingFeed after cancel "
            r11.append(r15)
            java.lang.String r15 = r2.field_mediaId
            r11.append(r15)
            r11.append(r13)
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r13 = r1.f161600o
            int r13 = r13.size()
            r11.append(r13)
            r11.append(r12)
            int r12 = r2.field_appType
            r11.append(r12)
            r11.append(r14)
            int r12 = r2.field_fileType
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            java.util.List<gi.g> r4 = r1.f161606u
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r4.add(r2)
            com.tencent.mm.autogen.mmdata.rpt.FinderThumbCheckReportStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.FinderThumbCheckReportStruct
            r2.<init>()
            te3.nr3 r4 = r5.f185258U0
            if (r4 == 0) goto L_0x05bd
            int r11 = r4.f184546i
            goto L_0x05be
        L_0x05bd:
            r11 = -1
        L_0x05be:
            r2.f156149f = r11
            if (r4 == 0) goto L_0x05c5
            int r11 = r4.f184545h
            goto L_0x05c6
        L_0x05c5:
            r11 = 0
        L_0x05c6:
            r2.f156148e = r11
            if (r4 == 0) goto L_0x05cd
            int r11 = r4.f184548n
            goto L_0x05ce
        L_0x05cd:
            r11 = 0
        L_0x05ce:
            r2.f156151h = r11
            if (r4 == 0) goto L_0x05d5
            int r11 = r4.f184544g
            goto L_0x05d6
        L_0x05d5:
            r11 = 0
        L_0x05d6:
            r2.f156147d = r11
            if (r4 == 0) goto L_0x05dd
            int r4 = r4.f184547j
            goto L_0x05de
        L_0x05dd:
            r4 = 0
        L_0x05de:
            r2.f156150g = r4
            r2.mo86054n()
            java.lang.String r4 = r1.f161597i
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "reportReplaceCover struct:"
            r11.append(r12)
            java.lang.String r2 = r2.mo1006q()
            r11.append(r2)
            java.lang.String r2 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            int r2 = r1.mo79371r(r5)
            r1.mo79372s(r5)
            if (r2 == 0) goto L_0x0607
            goto L_0x0642
        L_0x0607:
            java.lang.String r2 = r5.f185239F
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x06c1
            java.lang.String r2 = r5.f185241H
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0620
            java.lang.String r2 = r1.f161597i
            java.lang.String r4 = "mediaObject svr_fullThumbUrl exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            goto L_0x06c1
        L_0x0620:
            java.lang.String r2 = r5.f185239F
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r2 != 0) goto L_0x0647
            java.lang.String r2 = r1.f161597i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r11 = "upload failed, fullThumbUrl not exist, "
            r4.append(r11)
            java.lang.String r11 = r5.f185239F
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            r2 = 6
        L_0x0642:
            r4 = 251(0xfb, float:3.52E-43)
            r13 = 0
            goto L_0x06c5
        L_0x0647:
            gi.g r2 = new gi.g
            r2.<init>()
            java.lang.String r4 = "task_FinderUploadTask_2"
            r2.f287660d = r4
            com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage$a r4 = r1.f161611z
            r2.f287662f = r4
            java.lang.String r4 = r5.f185239F
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r4)
            java.lang.String r11 = "getMD5String(mediaObject.fullThumbUrl)"
            gy3.C87412m.m108593f(r4, r11)
            java.lang.String r4 = r1.mo79367n(r4)
            r2.field_mediaId = r4
            java.lang.String r4 = r5.f185239F
            r2.field_fullpath = r4
            r2.field_thumbpath = r4
            r2.field_talker = r8
            r4 = 1
            r2.field_needStorage = r4
            java.lang.String r4 = r1.f161597i
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "upload fullthumb file length "
            r11.append(r12)
            java.lang.String r12 = r5.f185239F
            long r12 = com.tencent.p014mm.vfs.C86013q1.m106451l(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            r4 = 20304(0x4f50, float:2.8452E-41)
            r2.field_fileType = r4
            r4 = 251(0xfb, float:3.52E-43)
            r2.field_appType = r4
            r11 = 2
            r2.field_bzScene = r11
            r12 = 120(0x78, float:1.68E-43)
            r2.f287673t = r12
            r12 = 300(0x12c, float:4.2E-43)
            r2.f287674u = r12
            r2.field_priority = r11
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r11 = r1.f161600o
            java.lang.String r12 = r2.field_mediaId
            r11.add(r12)
            java.util.Map<java.lang.String, java.lang.Float> r11 = r1.f161599n
            java.lang.String r12 = r2.field_mediaId
            gy3.C87412m.m108593f(r12, r9)
            r13 = 0
            java.lang.Float r14 = java.lang.Float.valueOf(r13)
            r11.put(r12, r14)
            java.util.List<gi.g> r11 = r1.f161606u
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            r11.add(r2)
            goto L_0x06c4
        L_0x06c1:
            r4 = 251(0xfb, float:3.52E-43)
            r13 = 0
        L_0x06c4:
            r2 = 0
        L_0x06c5:
            int r11 = r5.f185268f
            r12 = 4
            if (r11 == r12) goto L_0x06cf
            r12 = 2
            if (r11 != r12) goto L_0x06db
            if (r20 != 0) goto L_0x06db
        L_0x06cf:
            uq1.m r11 = uq1.C65449m.f188332a
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r1.f161596h
            int r12 = r12.field_watermarkFlag
            byte[] r5 = r11.mo89562a(r5, r12)
            r1.f161607v = r5
        L_0x06db:
            if (r2 == 0) goto L_0x0705
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161596h
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            if (r0 != 0) goto L_0x06e4
            goto L_0x06e6
        L_0x06e4:
            r0.uploadLogicError = r2
        L_0x06e6:
            r2 = 0
            r1.mo79370q(r2)
            ar1.i r0 = new ar1.i
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.f161596h
            r11 = 2
            r0.<init>(r2, r11)
            goto L_0x0903
        L_0x06f4:
            r3 = 600(0x258, float:8.41E-43)
            r4 = 251(0xfb, float:3.52E-43)
            r11 = 2
            r13 = 0
            int r2 = r5.f185268f
            if (r2 == r11) goto L_0x0710
            r11 = 7
            if (r2 == r11) goto L_0x0710
            r11 = 4
            if (r2 != r11) goto L_0x0705
            goto L_0x0710
        L_0x0705:
            r3 = r6
            r2 = 2
            r4 = 1
            r11 = 8
            r12 = 20302(0x4f4e, float:2.8449E-41)
            r15 = 251(0xfb, float:3.52E-43)
            goto L_0x026f
        L_0x0710:
            java.lang.String r0 = r1.f161597i
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
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161596h
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            r2 = 2
            if (r0 != 0) goto L_0x073b
            goto L_0x073d
        L_0x073b:
            r0.uploadLogicError = r2
        L_0x073d:
            r3 = 0
            r1.mo79370q(r3)
            ar1.i r0 = new ar1.i
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.f161596h
            r0.<init>(r3, r2)
            goto L_0x0903
        L_0x074a:
            sx3.C64197v.m75542k()
            r2 = 0
            throw r2
        L_0x074f:
            java.lang.Object r0 = sx3.C110818d0.m150916N(r3)
            te3.rq2 r0 = (te3.C64689rq2) r0
            if (r0 == 0) goto L_0x0777
            int r2 = r1.mo79371r(r0)
            r1.mo79372s(r0)
            if (r2 == 0) goto L_0x0777
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161596h
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            if (r0 != 0) goto L_0x0767
            goto L_0x0769
        L_0x0767:
            r0.uploadLogicError = r2
        L_0x0769:
            r2 = 0
            r1.mo79370q(r2)
            ar1.i r0 = new ar1.i
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.f161596h
            r3 = 2
            r0.<init>(r2, r3)
            goto L_0x0903
        L_0x0777:
            java.lang.String r0 = r1.f161597i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "upload info count:"
            r2.append(r3)
            java.util.List<gi.g> r3 = r1.f161606u
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.util.List<gi.g> r0 = r1.f161606u
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
            r3 = 0
        L_0x07a0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x08b4
            java.lang.Object r0 = r2.next()
            gi.g r0 = (p1081gi.C98124g) r0
            int r5 = r0.field_appType
            int r6 = r0.field_fileType
            java.lang.String r8 = r1.f161597i
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "[cdn task info] before add mediaId:"
            r9.append(r10)
            java.lang.String r10 = r0.field_mediaId
            r9.append(r10)
            java.lang.String r10 = ", appType:"
            r9.append(r10)
            int r11 = r0.field_appType
            r9.append(r11)
            java.lang.String r11 = ", fileType:"
            r9.append(r11)
            int r12 = r0.field_fileType
            r9.append(r12)
            java.lang.String r12 = " bizType:"
            r9.append(r12)
            int r13 = r0.f287663g
            r9.append(r13)
            java.lang.String r13 = " fullPath:"
            r9.append(r13)
            java.lang.String r14 = r0.field_fullpath
            r9.append(r14)
            java.lang.String r14 = " totalSize:"
            r9.append(r14)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            di3.d r8 = di3.C86312j.m106911c(r7)
            qo.l r8 = (p663qo.C101213l) r8
            r8.if0(r0)
            java.lang.String r8 = r0.field_fullpath
            long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r8)
            long r3 = r3 + r8
            java.lang.String r8 = r1.f161597i
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r15 = "[cdn task info] after add mediaId:"
            r9.append(r15)
            java.lang.String r15 = r0.field_mediaId
            r9.append(r15)
            r9.append(r10)
            int r10 = r0.field_appType
            r9.append(r10)
            r9.append(r11)
            int r10 = r0.field_fileType
            r9.append(r10)
            r9.append(r12)
            int r10 = r0.f287663g
            r9.append(r10)
            r9.append(r13)
            java.lang.String r10 = r0.field_fullpath
            r9.append(r10)
            r9.append(r14)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            int r8 = r0.field_appType
            if (r8 == r5) goto L_0x07a0
            int r8 = r0.field_fileType
            if (r8 == r6) goto L_0x07a0
            up1.f r8 = up1.C37521f.f99374d
            r8.getClass()
            pe1.c<java.lang.Integer> r8 = up1.C37521f.f99508s1
            java.lang.Object r8 = r8.mo60266n()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r9 = 1
            if (r8 != r9) goto L_0x0866
            r0.field_appType = r5
            r0.field_fileType = r6
        L_0x0866:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r9 = "appType1"
            r8.put(r9, r5)     // Catch:{ JSONException -> 0x0894 }
            java.lang.String r5 = "fileType1"
            r8.put(r5, r6)     // Catch:{ JSONException -> 0x0894 }
            java.lang.String r5 = "appType2"
            int r6 = r0.field_appType     // Catch:{ JSONException -> 0x0894 }
            r8.put(r5, r6)     // Catch:{ JSONException -> 0x0894 }
            java.lang.String r5 = "fileType2"
            int r6 = r0.field_fileType     // Catch:{ JSONException -> 0x0894 }
            r8.put(r5, r6)     // Catch:{ JSONException -> 0x0894 }
            java.lang.String r5 = "mediaId"
            java.lang.String r0 = r0.field_mediaId     // Catch:{ JSONException -> 0x0894 }
            r8.put(r5, r0)     // Catch:{ JSONException -> 0x0894 }
            java.lang.String r0 = "id"
            java.lang.String r5 = r30.mo79369p()     // Catch:{ JSONException -> 0x0894 }
            r8.put(r0, r5)     // Catch:{ JSONException -> 0x0894 }
            goto L_0x089e
        L_0x0894:
            r0 = move-exception
            java.lang.String r5 = r1.f161597i
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x089e:
            ft1.a r9 = ft1.C59319a.f169618b
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            ar1.f r15 = new ar1.f
            r15.<init>(r8)
            r16 = 28
            r17 = 0
            java.lang.String r10 = "post_upload_type_error"
            o40.C11348f.C11349a.m11178b(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x07a0
        L_0x08b4:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161596h
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r0.field_reportObject
            if (r0 != 0) goto L_0x08bb
            goto L_0x08bd
        L_0x08bb:
            r0.uploadMediaTotalSize = r3
        L_0x08bd:
            if (r0 == 0) goto L_0x08c6
            uq1.m r2 = uq1.C65449m.f188332a
            java.lang.String r3 = "beginUpload"
            r2.mo89571k(r0, r3)
        L_0x08c6:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r0 = r1.f161600o
            int r0 = r0.size()
            if (r0 != 0) goto L_0x08dc
            r2 = 1
            r1.mo79370q(r2)
            ar1.c r0 = new ar1.c
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.f161596h
            byte[] r3 = r1.f161607v
            r0.<init>(r2, r3)
            goto L_0x0903
        L_0x08dc:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f161596h
            boolean r0 = r0.isLongVideo()
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 21
            r12 = 1
            r3 = 1253(0x4e5, double:6.19E-321)
            r5 = 21
            r7 = 1
            r2 = r9
            r2.mo175913w(r3, r5, r7)
            if (r0 == 0) goto L_0x08fc
            r3 = 1523(0x5f3, double:7.525E-321)
            r2 = r9
            r5 = r10
            r7 = r12
            r2.mo175913w(r3, r5, r7)
        L_0x08fc:
            java.util.concurrent.CountDownLatch r0 = r1.f161609x
            r0.await()
            xq1.e r0 = r1.f161608w
        L_0x0903:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage.mo75105g():xq1.e");
    }

    /* renamed from: k */
    public final void mo79364k(C64689rq2 rq22) {
        C13598b0 b0Var;
        FinderMediaReportObject finderMediaReportObject = rq22.f185262W0;
        if (finderMediaReportObject != null) {
            finderMediaReportObject.mediaType = rq22.f185268f;
            finderMediaReportObject.mediaId = rq22.f185275p;
            finderMediaReportObject.cdnUploadTime = (int) (C31543z5.m39453c() - this.f161601p);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            FinderMediaReportObject finderMediaReportObject2 = new FinderMediaReportObject();
            finderMediaReportObject2.mediaType = rq22.f185268f;
            finderMediaReportObject2.mediaId = rq22.f185275p;
            finderMediaReportObject2.cdnUploadTime = (int) (C31543z5.m39453c() - this.f161601p);
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
    public final C94554a mo79365l(C98124g gVar) {
        Class cls = C65000f.class;
        gVar.getClass();
        C94554a Yp = ((C65000f) C86312j.m106911c(cls)).mo89183Yp(gVar.field_fullpath);
        if (Yp != null) {
            int i = Yp.f273444b;
            String str = gVar.field_fullpath;
            C87412m.m108593f(str, "info.field_fullpath");
            String str2 = "videobitrate:" + i + "\r\nvideoformat:" + (((C65000f) C86312j.m106911c(cls)).mo89194iu(str) ? WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE : 28) + APLogFileUtil.SEPARATOR_LINE;
            Log.m105924i(this.f161597i, "customHeader " + str2);
            gVar.f287653J = str2;
        }
        return Yp;
    }

    /* renamed from: m */
    public final boolean mo79366m(C64689rq2 rq22) {
        Iterator it = ((ArrayList) this.f161603r).iterator();
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
    public final String mo79367n(String str) {
        return "upload_" + str;
    }

    /* renamed from: o */
    public final String mo79368o(String str) {
        boolean z = true;
        if (str == null || !C112551y.m153819s(str, "upload_", false)) {
            z = false;
        }
        if (!z) {
            return str == null ? "" : str;
        }
        String substring = str.substring(7);
        C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: p */
    public final String mo79369p() {
        return "upload_" + this.f161596h.getLocalId();
    }

    /* renamed from: q */
    public final void mo79370q(boolean z) {
        if (!z) {
            try {
                this.f161598j.f185647f = 2;
            } catch (Exception e) {
                Log.printErrStackTrace(this.f161597i, e, "", new Object[0]);
                return;
            }
        } else {
            this.f161598j.f185647f = 1;
        }
        this.f161598j.f185654p = C31543z5.m39451a() - this.f161601p;
        FinderItem finderItem = this.f161596h;
        C64736tq2 tq22 = this.f161598j;
        C87412m.m108593f(tq22, C66261f3.COL_POSTINFO);
        finderItem.setPostInfo(tq22);
        long j = this.f161598j.f185654p;
        boolean isLongVideo = this.f161596h.isLongVideo();
        C58384l1 l1Var = C58384l1.f167282a;
        l1Var.mo83217a(1253, 9, 1, isLongVideo);
        l1Var.mo83217a(1253, 10, j, isLongVideo);
        C15585f.f42211a.mo14345h(this.f161596h);
    }

    /* renamed from: r */
    public final int mo79371r(C64689rq2 rq22) {
        if (rq22.f185268f == 4 && !Util.isNullOrNil(rq22.f185283w)) {
            if (!Util.isNullOrNil(rq22.f185237D)) {
                Log.m105924i(this.f161597i, "mediaObject svr_coverUrl exist");
                return 0;
            } else if (!C86013q1.m106450k(rq22.f185283w)) {
                String str = this.f161597i;
                Log.m105924i(str, "upload failed, coverUrl not exist, " + rq22.f185283w);
                return 5;
            } else {
                C98124g gVar = new C98124g();
                gVar.f287660d = "task_FinderUploadTask_2";
                gVar.f287662f = this.f161611z;
                String mD5String = MD5Util.getMD5String(rq22.f185283w);
                C87412m.m108593f(mD5String, "getMD5String(mediaObject.coverUrl)");
                gVar.field_mediaId = mo79367n(mD5String);
                String str2 = rq22.f185283w;
                gVar.field_fullpath = str2;
                gVar.field_thumbpath = str2;
                gVar.field_talker = "";
                gVar.field_needStorage = true;
                String str3 = this.f161597i;
                Log.m105924i(str3, "upload cover file length " + C86013q1.m106451l(rq22.f185283w));
                gVar.field_fileType = 20304;
                gVar.field_appType = 251;
                gVar.field_bzScene = 2;
                gVar.f287673t = 120;
                gVar.f287674u = 300;
                gVar.field_priority = 2;
                this.f161600o.add(gVar.field_mediaId);
                Map<String, Float> map = this.f161599n;
                String str4 = gVar.field_mediaId;
                C87412m.m108593f(str4, "info.field_mediaId");
                map.put(str4, Float.valueOf(0.0f));
                ((ArrayList) this.f161606u).add(gVar);
            }
        }
        return 0;
    }

    /* renamed from: s */
    public final int mo79372s(C64689rq2 rq22) {
        if (rq22.f185268f == 4 && !Util.isNullOrNil(rq22.f185261W)) {
            if (!Util.isNullOrNil(rq22.f185259V)) {
                Log.m105924i(this.f161597i, "mediaObject svr_fullCoverUrl exist");
                return 0;
            } else if (!C86013q1.m106450k(rq22.f185261W)) {
                String str = this.f161597i;
                Log.m105924i(str, "upload failed, fullCoverUrl not exist, " + rq22.f185261W);
                return 0;
            } else {
                C98124g gVar = new C98124g();
                gVar.f287660d = "task_FinderUploadTask_2";
                gVar.f287662f = this.f161611z;
                String mD5String = MD5Util.getMD5String(rq22.f185261W);
                C87412m.m108593f(mD5String, "getMD5String(mediaObject.fullCoverUrl)");
                gVar.field_mediaId = mo79367n(mD5String);
                String str2 = rq22.f185261W;
                gVar.field_fullpath = str2;
                gVar.field_thumbpath = str2;
                gVar.field_talker = "";
                gVar.field_needStorage = true;
                String str3 = this.f161597i;
                Log.m105924i(str3, "upload fullCover file length " + C86013q1.m106451l(rq22.f185261W));
                gVar.field_fileType = 20304;
                gVar.field_appType = 251;
                gVar.field_bzScene = 2;
                gVar.f287673t = 120;
                gVar.f287674u = 300;
                gVar.field_priority = 2;
                this.f161600o.add(gVar.field_mediaId);
                Map<String, Float> map = this.f161599n;
                String str4 = gVar.field_mediaId;
                C87412m.m108593f(str4, "info.field_mediaId");
                map.put(str4, Float.valueOf(0.0f));
                ((ArrayList) this.f161606u).add(gVar);
            }
        }
        return 0;
    }
}
