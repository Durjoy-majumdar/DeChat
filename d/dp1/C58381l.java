package dp1;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.Vector;
import sx3.C64175a0;
import up1.C65418l;
import uq1.C65463v;

/* renamed from: dp1.l */
public final class C58381l {

    /* renamed from: a */
    public static final C58381l f167278a = new C58381l();

    /* renamed from: b */
    public static final Vector<C65418l> f167279b = new Vector<>();

    /* renamed from: c */
    public static C65463v f167280c = new C58383b();

    /* renamed from: dp1.l$a */
    public static final class C58382a extends C87413o implements C32226l<C65418l, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C65418l f167281d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58382a(C65418l lVar) {
            super(1);
            this.f167281d = lVar;
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(((C65418l) obj).field_localId == this.f167281d.field_localId);
        }
    }

    /* renamed from: dp1.l$b */
    public static final class C58383b implements C65463v {
        public void onPostEnd(long j, boolean z) {
            T t;
            boolean z2;
            try {
                Iterator<T> it = C58381l.f167279b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((C65418l) t).field_localId == j) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                }
                C65418l lVar = (C65418l) t;
                if (lVar != null) {
                    C58381l.f167278a.mo83216b(lVar.mo89514l2(), false);
                }
            } catch (Throwable unused) {
            }
        }

        public void onPostOk(long j, long j2) {
            T t;
            boolean z;
            try {
                Iterator<T> it = C58381l.f167279b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((C65418l) t).field_localId == j) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                C65418l lVar = (C65418l) t;
                if (lVar != null) {
                    C58381l.f167278a.mo83216b(lVar.mo89514l2(), true);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo83215a(C65418l lVar) {
        C87412m.m108594g(lVar, "draftItem");
        try {
            lVar.mo89516n2();
            C65418l lVar2 = new C65418l();
            lVar2.field_localId = lVar.field_localId;
            lVar2.field_createTime = lVar.field_createTime;
            lVar2.field_localFlag = lVar.field_localFlag;
            lVar2.field_finderItem = lVar.field_finderItem;
            lVar2.field_objectType = lVar.field_objectType;
            lVar2.field_postIntent = lVar.field_postIntent;
            lVar2.field_originMvInfo = lVar.field_originMvInfo;
            lVar2.field_objectId = lVar.field_objectId;
            lVar2.field_markDeleted = lVar.field_markDeleted;
            lVar2.field_version = lVar.field_version;
            lVar2.field_dbversion = lVar.field_dbversion;
            Vector<C65418l> vector = f167279b;
            C64175a0.m75512t(vector, new C58382a(lVar2));
            vector.add(lVar2);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03d8, code lost:
        if (r0 == null) goto L_0x03da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x056e  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x057d  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x05a2  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x05a4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83216b(com.tencent.p014mm.plugin.finder.storage.FinderItem r38, boolean r39) {
        /*
            r37 = this;
            r1 = r38
            r2 = r39
            java.lang.Class<dp1.y0> r3 = dp1.C58417y0.class
            java.lang.String r0 = "finderItem"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "report23348 localId:"
            r0.append(r4)
            long r4 = r38.getLocalId()
            r0.append(r4)
            java.lang.String r4 = ", "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "Finder.FinderDraftReportLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r5 = r1.field_reportObject
            if (r5 != 0) goto L_0x0043
            java.lang.String r0 = "report23348, feedReportObj is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            kj2.d r5 = kj2.C117407d.INSTANCE
            r6 = 1253(0x4e5, double:6.19E-321)
            r8 = 38
            r10 = 1
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)
            return
        L_0x0043:
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99562y
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            r0.intValue()
            r6 = 4
            r7 = 2
            r8 = 1
            if (r2 != 0) goto L_0x0111
            int r0 = r5.postStage
            if (r0 == r8) goto L_0x00ed
            if (r0 == r7) goto L_0x00c8
            r9 = 3
            if (r0 == r9) goto L_0x00a3
            if (r0 == r6) goto L_0x007d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "postStage range error, "
            r0.append(r9)
            int r9 = r5.postStage
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0111
        L_0x007d:
            boolean r0 = r38.isLongVideo()
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 46
            r19 = 1
            r10 = 1718(0x6b6, double:8.49E-321)
            r12 = 46
            r14 = 1
            r9 = r16
            r9.mo175913w(r10, r12, r14)
            if (r0 == 0) goto L_0x009f
            r10 = 1719(0x6b7, double:8.493E-321)
            r9 = r16
            r12 = r17
            r14 = r19
            r9.mo175913w(r10, r12, r14)
        L_0x009f:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0111
        L_0x00a3:
            boolean r0 = r38.isLongVideo()
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 45
            r19 = 1
            r10 = 1718(0x6b6, double:8.49E-321)
            r12 = 45
            r14 = 1
            r9 = r16
            r9.mo175913w(r10, r12, r14)
            if (r0 == 0) goto L_0x00c5
            r10 = 1719(0x6b7, double:8.493E-321)
            r9 = r16
            r12 = r17
            r14 = r19
            r9.mo175913w(r10, r12, r14)
        L_0x00c5:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0111
        L_0x00c8:
            boolean r0 = r38.isLongVideo()
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 44
            r19 = 1
            r10 = 1718(0x6b6, double:8.49E-321)
            r12 = 44
            r14 = 1
            r9 = r16
            r9.mo175913w(r10, r12, r14)
            if (r0 == 0) goto L_0x00ea
            r10 = 1719(0x6b7, double:8.493E-321)
            r9 = r16
            r12 = r17
            r14 = r19
            r9.mo175913w(r10, r12, r14)
        L_0x00ea:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0111
        L_0x00ed:
            boolean r0 = r38.isLongVideo()
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 43
            r19 = 1
            r10 = 1718(0x6b6, double:8.49E-321)
            r12 = 43
            r14 = 1
            r9 = r16
            r9.mo175913w(r10, r12, r14)
            if (r0 == 0) goto L_0x010f
            r10 = 1719(0x6b7, double:8.493E-321)
            r9 = r16
            r12 = r17
            r14 = r19
            r9.mo175913w(r10, r12, r14)
        L_0x010f:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0111:
            boolean r9 = r38.isMvFeed()
            boolean r10 = r38.isLongVideo()
            int r11 = r5.uploadCost
            int r12 = r5.mediaProcessCost
            int r13 = r5.postTaskCost
            int r14 = r5.clickRepostCount
            long r6 = r5.uploadMediaTotalSize
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r1 = com.tencent.mars.cdn.CdnLogic.getRecentAverageSpeed(r8)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMediaReportObject> r8 = r5.mediaList
            r15.addAll(r8)
            if (r2 != 0) goto L_0x0174
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMediaReportObject> r8 = r5.mediaList
            r15.addAll(r8)
            java.util.LinkedList r8 = r38.getMediaList()
            java.util.Iterator r8 = r8.iterator()
            r20 = 0
        L_0x0147:
            boolean r21 = r8.hasNext()
            if (r21 == 0) goto L_0x016f
            java.lang.Object r21 = r8.next()
            r22 = r0
            r0 = r21
            te3.rq2 r0 = (te3.C64689rq2) r0
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r0 = r0.f185262W0
            r21 = r8
            if (r0 == 0) goto L_0x016a
            int r8 = r0.cdnUploadRetCode
            if (r8 == 0) goto L_0x0168
            r15.add(r0)
            int r0 = r0.cdnUploadRetCode
            r20 = r0
        L_0x0168:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x016a:
            r8 = r21
            r0 = r22
            goto L_0x0147
        L_0x016f:
            r22 = r0
            r8 = r20
            goto L_0x0177
        L_0x0174:
            r22 = r0
            r8 = 0
        L_0x0177:
            java.util.Iterator r0 = r15.iterator()
            java.lang.String r20 = ""
            r21 = r9
            r9 = r22
            r22 = r6
            r7 = r20
            r6 = 0
        L_0x0186:
            boolean r24 = r0.hasNext()
            if (r24 == 0) goto L_0x0322
            java.lang.Object r9 = r0.next()
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r9 = (com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject) r9
            r24 = r0
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            o40.C61937h.m72704c(r9, r0)
            if (r6 != 0) goto L_0x01a5
            int r6 = r9.zipTime
            if (r6 <= 0) goto L_0x01a4
            r6 = 1
            goto L_0x01a5
        L_0x01a4:
            r6 = 0
        L_0x01a5:
            java.lang.Class r25 = r9.getClass()
            r26 = r0
            java.lang.reflect.Field[] r0 = r25.getDeclaredFields()
            r25 = r6
            java.lang.String r6 = "fields"
            gy3.C87412m.m108593f(r0, r6)
            int r6 = r0.length
            r27 = r14
            r14 = 0
        L_0x01ba:
            if (r14 >= r6) goto L_0x02ff
            r28 = r6
            r6 = r0[r14]
            r29 = r0
            java.lang.Object r0 = r6.get(r9)
            if (r0 != 0) goto L_0x01d2
            r32 = r1
            r36 = r8
            r30 = r9
            r31 = r13
            goto L_0x02ef
        L_0x01d2:
            r30 = r9
            boolean r9 = r0 instanceof java.lang.Integer
            r31 = r13
            if (r9 == 0) goto L_0x020c
            r9 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            boolean r9 = gy3.C87412m.m108589b(r0, r13)
            if (r9 != 0) goto L_0x020c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            java.lang.String r6 = r6.getName()
            r9.append(r6)
            r6 = 58
            r9.append(r6)
            r9.append(r0)
            r0 = 59
            r9.append(r0)
            java.lang.String r0 = r9.toString()
        L_0x0205:
            r7 = r0
        L_0x0206:
            r32 = r1
        L_0x0208:
            r36 = r8
            goto L_0x02ef
        L_0x020c:
            boolean r9 = r0 instanceof java.lang.String
            if (r9 == 0) goto L_0x023f
            r9 = r0
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x021b
            r9 = 1
            goto L_0x021c
        L_0x021b:
            r9 = 0
        L_0x021c:
            if (r9 == 0) goto L_0x023f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            java.lang.String r6 = r6.getName()
            r9.append(r6)
            r6 = 58
            r9.append(r6)
            r9.append(r0)
            r0 = 59
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            goto L_0x0205
        L_0x023f:
            boolean r9 = r0 instanceof pe3.C47465a
            if (r9 == 0) goto L_0x0206
            java.lang.Class r9 = r0.getClass()
            java.lang.reflect.Field[] r9 = r9.getDeclaredFields()
            java.lang.String r13 = "innerFields"
            gy3.C87412m.m108593f(r9, r13)
            int r13 = r9.length
            r32 = r1
            r1 = 0
        L_0x0254:
            if (r1 >= r13) goto L_0x0208
            r33 = r13
            r13 = r9[r1]
            r34 = r9
            java.lang.Object r9 = r13.get(r0)
            r35 = r0
            boolean r0 = r9 instanceof java.lang.Integer
            r36 = r8
            r8 = 45
            if (r0 == 0) goto L_0x02a6
            r19 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            boolean r0 = gy3.C87412m.m108589b(r9, r0)
            if (r0 != 0) goto L_0x02a6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = r6.getName()
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = r13.getName()
            r0.append(r7)
            r7 = 58
            r0.append(r7)
            r0.append(r9)
            r7 = 59
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r7 = r0
        L_0x02a1:
            r8 = 58
            r9 = 59
            goto L_0x02e3
        L_0x02a6:
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L_0x02a1
            r0 = r9
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x02b5
            r0 = 1
            goto L_0x02b6
        L_0x02b5:
            r0 = 0
        L_0x02b6:
            if (r0 == 0) goto L_0x02a1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = r6.getName()
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = r13.getName()
            r0.append(r7)
            r8 = 58
            r0.append(r8)
            r0.append(r9)
            r9 = 59
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r7 = r0
        L_0x02e3:
            int r1 = r1 + 1
            r13 = r33
            r9 = r34
            r0 = r35
            r8 = r36
            goto L_0x0254
        L_0x02ef:
            int r14 = r14 + 1
            r6 = r28
            r0 = r29
            r9 = r30
            r13 = r31
            r1 = r32
            r8 = r36
            goto L_0x01ba
        L_0x02ff:
            r32 = r1
            r36 = r8
            r31 = r13
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r1 = 35
            r0.append(r1)
            java.lang.String r7 = r0.toString()
            r0 = r24
            r6 = r25
            r9 = r26
            r14 = r27
            r1 = r32
            goto L_0x0186
        L_0x0322:
            r32 = r1
            r36 = r8
            r31 = r13
            r27 = r14
            r1 = 0
            zc1.b r0 = zc1.C66785b.f191882e     // Catch:{ all -> 0x03a1 }
            r8 = 1
            r13 = 0
            bd1.b r0 = zc1.C66783a.C66784a.m78800c(r0, r13, r8, r1)     // Catch:{ all -> 0x03a1 }
            if (r0 == 0) goto L_0x0338
            java.lang.String r0 = r0.field_nickname     // Catch:{ all -> 0x03a1 }
            goto L_0x0339
        L_0x0338:
            r0 = r1
        L_0x0339:
            if (r0 != 0) goto L_0x033d
            r0 = r20
        L_0x033d:
            java.lang.String r8 = "snn"
            r9.put(r8, r0)     // Catch:{ all -> 0x03a1 }
            java.util.LinkedList r0 = r38.getMediaList()     // Catch:{ all -> 0x03a1 }
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)     // Catch:{ all -> 0x03a1 }
            te3.rq2 r0 = (te3.C64689rq2) r0     // Catch:{ all -> 0x03a1 }
            if (r0 == 0) goto L_0x03aa
            te3.xb1 r0 = r0.f185236C     // Catch:{ all -> 0x03a1 }
            if (r0 == 0) goto L_0x03aa
            java.lang.String r8 = "codecInfo"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x03a1 }
            r13.<init>()     // Catch:{ all -> 0x03a1 }
            java.lang.String r14 = "video_score:"
            r13.append(r14)     // Catch:{ all -> 0x03a1 }
            float r14 = r0.f186282d     // Catch:{ all -> 0x03a1 }
            r13.append(r14)     // Catch:{ all -> 0x03a1 }
            java.lang.String r14 = ",video_cover_score:"
            r13.append(r14)     // Catch:{ all -> 0x03a1 }
            float r14 = r0.f186283e     // Catch:{ all -> 0x03a1 }
            r13.append(r14)     // Catch:{ all -> 0x03a1 }
            java.lang.String r14 = ",video_audio_score:"
            r13.append(r14)     // Catch:{ all -> 0x03a1 }
            float r14 = r0.f186284f     // Catch:{ all -> 0x03a1 }
            r13.append(r14)     // Catch:{ all -> 0x03a1 }
            java.lang.String r14 = ",thumb_score:"
            r13.append(r14)     // Catch:{ all -> 0x03a1 }
            float r14 = r0.f186285g     // Catch:{ all -> 0x03a1 }
            r13.append(r14)     // Catch:{ all -> 0x03a1 }
            java.lang.String r14 = ",hdimg_score:"
            r13.append(r14)     // Catch:{ all -> 0x03a1 }
            float r14 = r0.f186286h     // Catch:{ all -> 0x03a1 }
            r13.append(r14)     // Catch:{ all -> 0x03a1 }
            java.lang.String r14 = ",has_stickers:"
            r13.append(r14)     // Catch:{ all -> 0x03a1 }
            boolean r0 = r0.f186287i     // Catch:{ all -> 0x03a1 }
            r13.append(r0)     // Catch:{ all -> 0x03a1 }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x03a1 }
            r9.put(r8, r0)     // Catch:{ all -> 0x03a1 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x03a1 }
            goto L_0x03aa
        L_0x03a1:
            r0 = move-exception
            r8 = 0
            java.lang.Object[] r13 = new java.lang.Object[r8]
            java.lang.String r8 = "mediaInfoJson put snn"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r8, r13)
        L_0x03aa:
            java.util.LinkedList r0 = r38.getMediaList()
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            te3.rq2 r0 = (te3.C64689rq2) r0
            if (r0 == 0) goto L_0x03da
            java.lang.String r8 = r0.f185278r
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x03d6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r13 = r0.f185266d
            r8.append(r13)
            java.lang.String r0 = r0.f185286y
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            goto L_0x03d8
        L_0x03d6:
            java.lang.String r0 = r0.f185278r
        L_0x03d8:
            if (r0 != 0) goto L_0x03dc
        L_0x03da:
            r0 = r20
        L_0x03dc:
            if (r10 == 0) goto L_0x040f
            java.util.LinkedList r8 = r38.getMediaList()
            if (r8 == 0) goto L_0x0411
            java.lang.Object r8 = sx3.C110818d0.m150916N(r8)
            te3.rq2 r8 = (te3.C64689rq2) r8
            if (r8 == 0) goto L_0x0411
            java.lang.String r1 = r8.f185278r
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x040c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r13 = r8.f185266d
            r1.append(r13)
            java.lang.String r8 = r8.f185286y
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            goto L_0x0411
        L_0x040c:
            java.lang.String r1 = r8.f185278r
            goto L_0x0411
        L_0x040f:
            r1 = r20
        L_0x0411:
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "mediaInfoJson.toString()"
            gy3.C87412m.m108593f(r8, r9)
            java.lang.String r9 = ","
            java.lang.String r13 = ";"
            r14 = 0
            java.lang.String r8 = z04.C112551y.m153814n(r8, r9, r13, r14)
            java.lang.Object r14 = sx3.C110818d0.m150916N(r15)
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r14 = (com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject) r14
            if (r14 == 0) goto L_0x0448
            int r14 = r14.mediaType
            r24 = r1
            r1 = 4
            if (r14 != r1) goto L_0x044a
            dp1.t0 r1 = dp1.C58408t0.f167336a
            java.lang.Object r14 = sx3.C110818d0.m150914L(r15)
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r14 = (com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject) r14
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMediaReportInfo> r14 = r14.multiMediaInfo
            java.lang.String r15 = "mediaReportList.first().multiMediaInfo"
            gy3.C87412m.m108593f(r14, r15)
            java.lang.String r1 = r1.mo83255a(r14)
            r20 = r1
            goto L_0x044a
        L_0x0448:
            r24 = r1
        L_0x044a:
            r1 = r20
            r14 = 0
            java.lang.String r1 = z04.C112551y.m153814n(r1, r9, r13, r14)
            int r9 = r5.dumpCgiErrorCode
            int r13 = r5.dumpCgiErrorType
            int r14 = r5.sdkShareType
            com.tencent.mm.protocal.protobuf.FinderObject r15 = r38.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r15 = r15.objectDesc
            if (r15 == 0) goto L_0x0471
            te3.ef1 r15 = r15.event
            if (r15 == 0) goto L_0x0471
            r17 = r0
            r20 = r1
            long r0 = r15.f132898d
            r25 = 0
            int r15 = (r0 > r25 ? 1 : (r0 == r25 ? 0 : -1))
            if (r15 != 0) goto L_0x0475
            r0 = 1
            goto L_0x0476
        L_0x0471:
            r17 = r0
            r20 = r1
        L_0x0475:
            r0 = 0
        L_0x0476:
            r1 = 1
            r0 = r0 ^ r1
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r1 = "23348, sdkShareType:"
            r15.append(r1)
            r15.append(r14)
            java.lang.String r1 = ", isActivityEvent:"
            r15.append(r1)
            r15.append(r0)
            java.lang.String r1 = ", dumpCgiErrorType:"
            r15.append(r1)
            r15.append(r13)
            java.lang.String r1 = ", dumpCgiErrorCode:"
            r15.append(r1)
            r15.append(r9)
            java.lang.String r1 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r15 = r5.enterScene
            r1.append(r15)
            r15 = 44
            r1.append(r15)
            r25 = r4
            java.lang.String r4 = r5.sessionId
            r1.append(r4)
            r1.append(r15)
            if (r2 == 0) goto L_0x04d2
            di3.d r4 = di3.C86312j.m106911c(r3)
            dp1.y0 r4 = (dp1.C58417y0) r4
            r26 = r13
            r28 = r14
            long r13 = r38.getId()
            java.lang.String r4 = r4.xx0(r13)
            goto L_0x04dc
        L_0x04d2:
            r26 = r13
            r28 = r14
            r4 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)
            r4 = r13
        L_0x04dc:
            r1.append(r4)
            r1.append(r15)
            int r4 = r5.videoSource
            r1.append(r4)
            r1.append(r15)
            long r13 = eb0.C31543z5.m39453c()
            r29 = r9
            r4 = r10
            long r9 = r5.sendOrExitButtonTime
            long r13 = r13 - r9
            r1.append(r13)
            r1.append(r15)
            r1.append(r6)
            r1.append(r15)
            r1.append(r11)
            r1.append(r15)
            r1.append(r7)
            r1.append(r15)
            r1.append(r2)
            r1.append(r15)
            r1.append(r12)
            r1.append(r15)
            r6 = 14
            r1.append(r6)
            r1.append(r15)
            r6 = r36
            r1.append(r6)
            r1.append(r15)
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetTypeString(r6)
            r1.append(r6)
            r1.append(r15)
            int r6 = r5.retryCount
            r1.append(r6)
            r1.append(r15)
            r6 = r32
            r1.append(r6)
            r1.append(r15)
            r1.append(r8)
            r1.append(r15)
            int r6 = r5.videoPostType
            r1.append(r6)
            r1.append(r15)
            int r6 = r5.uploadLogicError
            r1.append(r6)
            r1.append(r15)
            int r6 = r5.postStage
            r1.append(r6)
            r1.append(r15)
            r6 = r20
            r1.append(r6)
            r1.append(r15)
            if (r2 == 0) goto L_0x057d
            di3.d r2 = di3.C86312j.m106911c(r3)
            dp1.y0 r2 = (dp1.C58417y0) r2
            long r6 = r38.getId()
            java.lang.String r2 = r2.xx0(r6)
            goto L_0x0582
        L_0x057d:
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0582:
            r1.append(r2)
            r1.append(r15)
            int r2 = r5.cgiErrorCode
            r1.append(r2)
            r1.append(r15)
            int r2 = r5.cgiErrorType
            r1.append(r2)
            r1.append(r15)
            r2 = r17
            r1.append(r2)
            r1.append(r15)
            if (r4 == 0) goto L_0x05a4
            r7 = 1
            goto L_0x05a5
        L_0x05a4:
            r7 = 2
        L_0x05a5:
            r1.append(r7)
            r1.append(r15)
            r2 = r24
            r1.append(r2)
            r1.append(r15)
            int r2 = r5.megaCgiErrorCode
            r1.append(r2)
            r1.append(r15)
            int r2 = r5.megaCgiErrorType
            r1.append(r2)
            r1.append(r15)
            int r2 = r5.longVideoSizeInvalid
            r1.append(r2)
            r1.append(r15)
            r2 = r31
            r1.append(r2)
            r1.append(r15)
            r2 = r27
            r1.append(r2)
            r1.append(r15)
            r2 = r22
            r1.append(r2)
            r1.append(r15)
            r2 = r29
            r1.append(r2)
            r1.append(r15)
            r2 = r26
            r1.append(r2)
            r1.append(r15)
            r2 = r28
            r1.append(r2)
            r1.append(r15)
            r1.append(r0)
            r1.append(r15)
            r2 = r21
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "23348 "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r2 = r25
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            kj2.d r1 = kj2.C117407d.INSTANCE
            r2 = 23348(0x5b34, float:3.2718E-41)
            r1.kvStat(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58381l.mo83216b(com.tencent.mm.plugin.finder.storage.FinderItem, boolean):void");
    }
}
