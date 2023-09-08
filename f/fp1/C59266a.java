package fp1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import dp1.C58408t0;
import eb0.C31543z5;
import zc1.C66785b;

/* renamed from: fp1.a */
public final class C59266a {

    /* renamed from: a */
    public static final C59266a f169452a = new C59266a();

    /* renamed from: d */
    public static /* synthetic */ void m69196d(C59266a aVar, C59268c cVar, FinderItem finderItem, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        aVar.mo84409a(cVar, finderItem, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00af, code lost:
        if (r9.put("target", r8) == null) goto L_0x00b1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010d A[SYNTHETIC, Splitter:B:64:0x010d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84409a(fp1.C59268c r15, com.tencent.p014mm.plugin.finder.storage.FinderItem r16, int r17, int r18) {
        /*
            r14 = this;
            r2 = r15
            r0 = r16
            java.lang.String r1 = ";"
            java.lang.String r3 = ","
            java.lang.String r4 = "json.toString()"
            java.lang.String r5 = "finderObj"
            gy3.C87412m.m108594g(r0, r5)
            r5 = 0
            if (r2 == 0) goto L_0x0014
            int r6 = r2.f169473b
            goto L_0x0015
        L_0x0014:
            r6 = 0
        L_0x0015:
            fp1.c r7 = fp1.C59267b.f169453a
            fp1.c r7 = fp1.C59267b.f169461i
            int r7 = r7.f169473b
            r8 = 0
            if (r6 >= r7) goto L_0x0064
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r6 = r0.field_reportObject
            if (r6 != 0) goto L_0x0029
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r6 = new com.tencent.mm.protocal.protobuf.FinderFeedReportObject
            r6.<init>()
            r0.field_reportObject = r6
        L_0x0029:
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r6 = r0.field_reportObject
            if (r6 == 0) goto L_0x0030
            java.lang.String r6 = r6.flowId
            goto L_0x0031
        L_0x0030:
            r6 = r8
        L_0x0031:
            if (r6 == 0) goto L_0x003c
            int r6 = r6.length()
            if (r6 != 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r6 = 0
            goto L_0x003d
        L_0x003c:
            r6 = 1
        L_0x003d:
            if (r6 == 0) goto L_0x0064
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r6 = r0.field_reportObject
            if (r6 != 0) goto L_0x0044
            goto L_0x0064
        L_0x0044:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            long r9 = eb0.C31543z5.m39453c()
            r7.append(r9)
            r9 = 95
            r7.append(r9)
            zc1.b r9 = zc1.C66785b.f191882e
            java.lang.String r9 = r9.mo90662O5()
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            r6.flowId = r7
        L_0x0064:
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r6 = r0.field_reportObject
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x006e
            java.lang.String r6 = r6.flowId
            if (r6 != 0) goto L_0x006f
        L_0x006e:
            r6 = r7
        L_0x006f:
            int r9 = r16.getMediaType()     // Catch:{ all -> 0x0106 }
            r10 = 4
            if (r9 == r10) goto L_0x0078
            goto L_0x0106
        L_0x0078:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ all -> 0x0106 }
            r9.<init>()     // Catch:{ all -> 0x0106 }
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r10 = r0.field_reportObject     // Catch:{ all -> 0x0106 }
            java.lang.String r11 = "origin"
            if (r10 == 0) goto L_0x00b1
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMediaReportObject> r10 = r10.mediaList     // Catch:{ all -> 0x0106 }
            if (r10 == 0) goto L_0x00b1
            java.lang.Object r10 = sx3.C110818d0.m150916N(r10)     // Catch:{ all -> 0x0106 }
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r10 = (com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject) r10     // Catch:{ all -> 0x0106 }
            if (r10 == 0) goto L_0x00b1
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r12 = r10.origin     // Catch:{ all -> 0x0106 }
            if (r12 == 0) goto L_0x0098
            org.json.JSONObject r12 = o40.C61937h.m72703b(r12)     // Catch:{ all -> 0x0106 }
            goto L_0x009d
        L_0x0098:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ all -> 0x0106 }
            r12.<init>()     // Catch:{ all -> 0x0106 }
        L_0x009d:
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r10 = r10.target     // Catch:{ all -> 0x0106 }
            if (r10 == 0) goto L_0x00a5
            org.json.JSONObject r8 = o40.C61937h.m72703b(r10)     // Catch:{ all -> 0x0106 }
        L_0x00a5:
            r9.put(r11, r12)     // Catch:{ all -> 0x0106 }
            java.lang.String r10 = "target"
            org.json.JSONObject r8 = r9.put(r10, r8)     // Catch:{ all -> 0x0106 }
            if (r8 != 0) goto L_0x00fa
        L_0x00b1:
            java.util.LinkedList r8 = r16.getMediaList()     // Catch:{ all -> 0x0106 }
            java.lang.Object r8 = sx3.C110818d0.m150916N(r8)     // Catch:{ all -> 0x0106 }
            te3.rq2 r8 = (te3.C64689rq2) r8     // Catch:{ all -> 0x0106 }
            if (r8 == 0) goto L_0x00fa
            com.tencent.mm.protocal.protobuf.FinderMediaReportInfo r10 = new com.tencent.mm.protocal.protobuf.FinderMediaReportInfo     // Catch:{ all -> 0x0106 }
            r10.<init>()     // Catch:{ all -> 0x0106 }
            int r12 = r8.f185273n     // Catch:{ all -> 0x0106 }
            r10.fileSize = r12     // Catch:{ all -> 0x0106 }
            java.lang.Class<rw.m> r12 = p232rw.C63679m.class
            di3.d r12 = di3.C86312j.m106911c(r12)     // Catch:{ all -> 0x0106 }
            rw.m r12 = (p232rw.C63679m) r12     // Catch:{ all -> 0x0106 }
            java.lang.String r8 = r8.f185266d     // Catch:{ all -> 0x0106 }
            if (r8 != 0) goto L_0x00d3
            r8 = r7
        L_0x00d3:
            rw.m$a r8 = r12.mo88483M1(r8)     // Catch:{ all -> 0x0106 }
            if (r8 == 0) goto L_0x00f3
            long r12 = r8.f180528d     // Catch:{ all -> 0x0106 }
            int r13 = (int) r12     // Catch:{ all -> 0x0106 }
            r10.videoDuration = r13     // Catch:{ all -> 0x0106 }
            int r12 = r8.f180525a     // Catch:{ all -> 0x0106 }
            r10.width = r12     // Catch:{ all -> 0x0106 }
            int r12 = r8.f180526b     // Catch:{ all -> 0x0106 }
            r10.height = r12     // Catch:{ all -> 0x0106 }
            int r12 = r8.f180529e     // Catch:{ all -> 0x0106 }
            r10.videoBitrate = r12     // Catch:{ all -> 0x0106 }
            int r12 = r8.f180532h     // Catch:{ all -> 0x0106 }
            r10.audioBitrate = r12     // Catch:{ all -> 0x0106 }
            float r8 = r8.f180527c     // Catch:{ all -> 0x0106 }
            int r8 = (int) r8     // Catch:{ all -> 0x0106 }
            r10.fps = r8     // Catch:{ all -> 0x0106 }
        L_0x00f3:
            org.json.JSONObject r8 = o40.C61937h.m72703b(r10)     // Catch:{ all -> 0x0106 }
            r9.put(r11, r8)     // Catch:{ all -> 0x0106 }
        L_0x00fa:
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x0106 }
            gy3.C87412m.m108593f(r8, r4)     // Catch:{ all -> 0x0106 }
            java.lang.String r8 = z04.C112551y.m153814n(r8, r3, r1, r5)     // Catch:{ all -> 0x0106 }
            goto L_0x0107
        L_0x0106:
            r8 = r7
        L_0x0107:
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r9 = r0.field_reportObject
            if (r9 != 0) goto L_0x010d
        L_0x010b:
            r4 = r7
            goto L_0x016c
        L_0x010d:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ all -> 0x010b }
            r10.<init>()     // Catch:{ all -> 0x010b }
            java.lang.String r11 = "megaCgiErrorType"
            int r12 = r9.megaCgiErrorType     // Catch:{ all -> 0x010b }
            r10.put(r11, r12)     // Catch:{ all -> 0x010b }
            java.lang.String r11 = "megaCgiErrorCode"
            int r12 = r9.megaCgiErrorCode     // Catch:{ all -> 0x010b }
            r10.put(r11, r12)     // Catch:{ all -> 0x010b }
            java.lang.String r11 = "dumpCgiErrorType"
            int r12 = r9.dumpCgiErrorType     // Catch:{ all -> 0x010b }
            r10.put(r11, r12)     // Catch:{ all -> 0x010b }
            java.lang.String r11 = "dumpCgiErrorCode"
            int r12 = r9.dumpCgiErrorCode     // Catch:{ all -> 0x010b }
            r10.put(r11, r12)     // Catch:{ all -> 0x010b }
            java.lang.String r11 = "videoSource"
            int r12 = r9.videoSource     // Catch:{ all -> 0x010b }
            r10.put(r11, r12)     // Catch:{ all -> 0x010b }
            java.lang.String r11 = "draft"
            int r12 = r9.draft     // Catch:{ all -> 0x010b }
            r10.put(r11, r12)     // Catch:{ all -> 0x010b }
            java.lang.String r11 = "retryCount"
            int r12 = r9.retryCount     // Catch:{ all -> 0x010b }
            r10.put(r11, r12)     // Catch:{ all -> 0x010b }
            java.lang.String r11 = "postStage"
            int r12 = r9.postStage     // Catch:{ all -> 0x010b }
            r10.put(r11, r12)     // Catch:{ all -> 0x010b }
            java.lang.String r11 = "sdkShareType"
            int r12 = r9.sdkShareType     // Catch:{ all -> 0x010b }
            r10.put(r11, r12)     // Catch:{ all -> 0x010b }
            java.lang.String r11 = "draftType"
            int r12 = r9.draftType     // Catch:{ all -> 0x010b }
            r10.put(r11, r12)     // Catch:{ all -> 0x010b }
            java.lang.String r11 = "fromDraft"
            int r9 = r9.fromDraft     // Catch:{ all -> 0x010b }
            r10.put(r11, r9)     // Catch:{ all -> 0x010b }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x010b }
            gy3.C87412m.m108593f(r9, r4)     // Catch:{ all -> 0x010b }
            java.lang.String r1 = z04.C112551y.m153814n(r9, r3, r1, r5)     // Catch:{ all -> 0x010b }
            r4 = r1
        L_0x016c:
            int r5 = r16.getMediaType()
            r0 = r14
            r1 = r6
            r2 = r15
            r3 = r8
            r6 = r17
            r7 = r18
            r0.mo84411c(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fp1.C59266a.mo84409a(fp1.c, com.tencent.mm.plugin.finder.storage.FinderItem, int, int):void");
    }

    /* renamed from: b */
    public final void mo84410b(String str, C59268c cVar) {
        FinderFeedReportObject finderFeedReportObject;
        if (C58408t0.f167337b == null) {
            C58408t0.f167337b = new FinderFeedReportObject();
        }
        FinderFeedReportObject finderFeedReportObject2 = C58408t0.f167337b;
        String str2 = finderFeedReportObject2 != null ? finderFeedReportObject2.flowId : null;
        if ((str2 == null || str2.length() == 0) && (finderFeedReportObject = C58408t0.f167337b) != null) {
            finderFeedReportObject.flowId = C31543z5.m39453c() + '_' + C66785b.f191882e.mo90662O5();
        }
        mo84411c(str, cVar, "", "", 0, 0, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r2 == null) goto L_0x001a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84411c(java.lang.String r6, fp1.C59268c r7, java.lang.String r8, java.lang.String r9, int r10, int r11, int r12) {
        /*
            r5 = this;
            java.lang.String r0 = "mediaInfoJson"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "customInfoJson"
            gy3.C87412m.m108594g(r9, r0)
            com.tencent.mm.autogen.mmdata.rpt.FinderPostFlowStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.FinderPostFlowStruct     // Catch:{ all -> 0x0064 }
            r0.<init>()     // Catch:{ all -> 0x0064 }
            r1 = 2
            r0.f155796d = r1     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = ""
            if (r7 == 0) goto L_0x001a
            java.lang.String r2 = r7.f169472a     // Catch:{ all -> 0x0064 }
            if (r2 != 0) goto L_0x001b
        L_0x001a:
            r2 = r1
        L_0x001b:
            java.lang.String r3 = "StageName"
            r4 = 1
            java.lang.String r2 = r0.mo86045b(r3, r2, r4)     // Catch:{ all -> 0x0064 }
            r0.f155799g = r2     // Catch:{ all -> 0x0064 }
            r2 = 0
            if (r7 == 0) goto L_0x002a
            int r3 = r7.f169473b     // Catch:{ all -> 0x0064 }
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            r0.f155798f = r3     // Catch:{ all -> 0x0064 }
            r0.f155800h = r4     // Catch:{ all -> 0x0064 }
            if (r6 != 0) goto L_0x0032
            r6 = r1
        L_0x0032:
            java.lang.String r1 = "FlowId"
            java.lang.String r6 = r0.mo86045b(r1, r6, r4)     // Catch:{ all -> 0x0064 }
            r0.f155797e = r6     // Catch:{ all -> 0x0064 }
            if (r7 == 0) goto L_0x003e
            int r2 = r7.f169474c     // Catch:{ all -> 0x0064 }
        L_0x003e:
            r0.f155801i = r2     // Catch:{ all -> 0x0064 }
            java.lang.String r6 = "MediaInfoJson"
            java.lang.String r6 = r0.mo86045b(r6, r8, r4)     // Catch:{ all -> 0x0064 }
            r0.f155802j = r6     // Catch:{ all -> 0x0064 }
            java.lang.String r6 = "CustomInfoJson"
            java.lang.String r6 = r0.mo86045b(r6, r9, r4)     // Catch:{ all -> 0x0064 }
            r0.f155803k = r6     // Catch:{ all -> 0x0064 }
            r0.f155804l = r10     // Catch:{ all -> 0x0064 }
            r0.f155805m = r11     // Catch:{ all -> 0x0064 }
            r0.f155806n = r12     // Catch:{ all -> 0x0064 }
            r0.mo86054n()     // Catch:{ all -> 0x0064 }
            java.lang.Class<dp1.y0> r6 = dp1.C58417y0.class
            di3.d r6 = di3.C86312j.m106911c(r6)     // Catch:{ all -> 0x0064 }
            dp1.y0 r6 = (dp1.C58417y0) r6     // Catch:{ all -> 0x0064 }
            r6.Ec0(r0)     // Catch:{ all -> 0x0064 }
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fp1.C59266a.mo84411c(java.lang.String, fp1.c, java.lang.String, java.lang.String, int, int, int):void");
    }
}
