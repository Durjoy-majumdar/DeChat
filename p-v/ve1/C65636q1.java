package ve1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;

/* renamed from: ve1.q1 */
public final class C65636q1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedFullConvert<BaseFinderFeed> f188859d;

    /* renamed from: e */
    public final /* synthetic */ BaseFinderFeed f188860e;

    public C65636q1(FinderFeedFullConvert<BaseFinderFeed> finderFeedFullConvert, BaseFinderFeed baseFinderFeed) {
        this.f188859d = finderFeedFullConvert;
        this.f188860e = baseFinderFeed;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x03bb, code lost:
        if (r0 == null) goto L_0x03bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x04b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r29) {
        /*
            r28 = this;
            r7 = r28
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r29
            r0.add(r1)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshPostProgress$3"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r28
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r0 = r7.f188859d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r7.f188860e
            r0.getClass()
            java.lang.Class<lr.b> r2 = p599lr.C61381b.class
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.mo3513o()
            long r3 = r0.getId()
            java.lang.String r5 = "Finder.FeedFullConvert"
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0078
            wp1.f$a r0 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.mo3513o()
            long r2 = r2.getId()
            r0.mo14339b(r2)
            com.tencent.mm.autogen.events.FeedDeleteEvent r0 = new com.tencent.mm.autogen.events.FeedDeleteEvent
            r0.<init>()
            com.tencent.mm.autogen.events.FeedDeleteEvent$a r2 = r0.f9154d
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.mo3513o()
            long r3 = r3.getId()
            r2.f9155a = r3
            r0.publish()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "deleteItem by id "
            r0.append(r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            long r1 = r1.getId()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x050a
        L_0x0078:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.mo3513o()
            long r3 = r0.getLocalId()
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x050a
            wp1.f$a r0 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.mo3513o()
            long r3 = r3.getLocalId()
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r0.mo14341d(r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.mo3513o()
            long r10 = r4.getLocalId()
            r0.mo14340c(r10)
            di3.d r0 = di3.C86312j.m106911c(r2)
            lr.b r0 = (p599lr.C61381b) r0
            qo1.j r0 = r0.mo78555oT()
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.mo3513o()
            boolean r4 = r4.isLongVideo()
            r0.mo12427b(r4)
            r4 = 1
            if (r3 == 0) goto L_0x04a6
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.mo3513o()
            java.lang.String r0 = "finderItem"
            gy3.C87412m.m108594g(r3, r0)
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r6 = r3.field_reportObject
            java.lang.String r10 = "Finder.FinderPostReportLogic"
            if (r6 != 0) goto L_0x00cb
            java.lang.String r0 = "report21666, feedReportObj is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x04a6
        L_0x00cb:
            com.tencent.mm.autogen.mmdata.rpt.FinderPostDeleteStruct r11 = new com.tencent.mm.autogen.mmdata.rpt.FinderPostDeleteStruct
            r11.<init>()
            long r12 = r3.getLocalId()
            r11.f155773d = r12
            long r12 = eb0.C31543z5.m39453c()
            long r14 = r6.sendOrExitButtonTime
            long r12 = r12 - r14
            r11.f155774e = r12
            int r0 = r6.uploadCost
            long r12 = (long) r0
            r11.f155775f = r12
            int r0 = r6.mediaProcessCost
            long r12 = (long) r0
            r11.f155777h = r12
            r12 = 15
            r11.f155778i = r12
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetTypeString(r0)
            java.lang.String r12 = "NetType"
            java.lang.String r0 = r11.mo86045b(r12, r0, r4)
            r11.f155780k = r0
            int r0 = r6.retryCount
            long r12 = (long) r0
            r11.f155781l = r12
            int r0 = com.tencent.mars.cdn.CdnLogic.getRecentAverageSpeed(r4)
            long r12 = (long) r0
            r11.f155782m = r12
            int r0 = r6.videoPostType
            long r12 = (long) r0
            r11.f155784o = r12
            int r0 = r6.postStage
            long r12 = (long) r0
            r11.f155785p = r12
            te3.tq2 r0 = r3.getPostInfo()
            int r0 = r0.f185649h
            long r12 = (long) r0
            r11.f155795z = r12
            boolean r12 = r3.isLongVideo()
            int r0 = r6.postTaskCost
            long r13 = (long) r0
            r11.f155766A = r13
            int r0 = r6.clickRepostCount
            long r13 = (long) r0
            r11.f155767B = r13
            long r13 = r6.uploadMediaTotalSize
            r11.f155768C = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMediaReportObject> r14 = r6.mediaList
            r13.addAll(r14)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMediaReportObject> r14 = r6.mediaList
            r13.addAll(r14)
            java.util.LinkedList r14 = r3.getMediaList()
            java.util.Iterator r14 = r14.iterator()
            r8 = 0
        L_0x014b:
            boolean r9 = r14.hasNext()
            if (r9 == 0) goto L_0x0166
            java.lang.Object r9 = r14.next()
            te3.rq2 r9 = (te3.C64689rq2) r9
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r9 = r9.f185262W0
            if (r9 == 0) goto L_0x0164
            int r4 = r9.cdnUploadRetCode
            if (r4 == 0) goto L_0x0164
            r13.add(r9)
            int r8 = r9.cdnUploadRetCode
        L_0x0164:
            r4 = 1
            goto L_0x014b
        L_0x0166:
            r11.f155779j = r8
            java.util.Iterator r4 = r13.iterator()
            java.lang.String r8 = ""
            r9 = r0
            r14 = r8
            r0 = 0
        L_0x0171:
            boolean r16 = r4.hasNext()
            if (r16 == 0) goto L_0x0303
            java.lang.Object r9 = r4.next()
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r9 = (com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject) r9
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            o40.C61937h.m72704c(r9, r15)
            if (r0 != 0) goto L_0x018e
            int r0 = r9.zipTime
            if (r0 <= 0) goto L_0x018d
            r0 = 1
            goto L_0x018e
        L_0x018d:
            r0 = 0
        L_0x018e:
            java.lang.Class r17 = r9.getClass()
            r18 = r0
            java.lang.reflect.Field[] r0 = r17.getDeclaredFields()
            r17 = r4
            java.lang.String r4 = "fields"
            gy3.C87412m.m108593f(r0, r4)
            int r4 = r0.length
            r19 = r8
            r8 = 0
        L_0x01a3:
            if (r8 >= r4) goto L_0x02e2
            r20 = r4
            r4 = r0[r8]
            r21 = r0
            java.lang.Object r0 = r4.get(r9)
            if (r0 != 0) goto L_0x01b9
            r27 = r5
            r22 = r9
            r23 = r15
            goto L_0x02d2
        L_0x01b9:
            r22 = r9
            boolean r9 = r0 instanceof java.lang.Integer
            r23 = r15
            if (r9 == 0) goto L_0x01ef
            r9 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
            boolean r9 = gy3.C87412m.m108589b(r0, r15)
            if (r9 != 0) goto L_0x01ef
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r14)
            java.lang.String r4 = r4.getName()
            r9.append(r4)
            r4 = 58
            r9.append(r4)
            r9.append(r0)
            r0 = 59
            r9.append(r0)
            java.lang.String r0 = r9.toString()
        L_0x01ec:
            r14 = r0
            goto L_0x02d0
        L_0x01ef:
            boolean r9 = r0 instanceof java.lang.String
            if (r9 == 0) goto L_0x0222
            r9 = r0
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x01fe
            r9 = 1
            goto L_0x01ff
        L_0x01fe:
            r9 = 0
        L_0x01ff:
            if (r9 == 0) goto L_0x0222
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r14)
            java.lang.String r4 = r4.getName()
            r9.append(r4)
            r4 = 58
            r9.append(r4)
            r9.append(r0)
            r0 = 59
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            goto L_0x01ec
        L_0x0222:
            boolean r9 = r0 instanceof pe3.C47465a
            if (r9 == 0) goto L_0x02d0
            java.lang.Class r9 = r0.getClass()
            java.lang.reflect.Field[] r9 = r9.getDeclaredFields()
            java.lang.String r15 = "innerFields"
            gy3.C87412m.m108593f(r9, r15)
            int r15 = r9.length
            r7 = 0
        L_0x0235:
            if (r7 >= r15) goto L_0x02d0
            r24 = r15
            r15 = r9[r7]
            r25 = r9
            java.lang.Object r9 = r15.get(r0)
            r26 = r0
            boolean r0 = r9 instanceof java.lang.Integer
            r27 = r5
            r5 = 45
            if (r0 == 0) goto L_0x0282
            r16 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            boolean r0 = gy3.C87412m.m108589b(r9, r0)
            if (r0 != 0) goto L_0x0282
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r14 = r4.getName()
            r0.append(r14)
            r0.append(r5)
            java.lang.String r5 = r15.getName()
            r0.append(r5)
            r5 = 58
            r0.append(r5)
            r0.append(r9)
            r5 = 59
            r0.append(r5)
            java.lang.String r14 = r0.toString()
            goto L_0x02c0
        L_0x0282:
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L_0x02c0
            r0 = r9
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0291
            r0 = 1
            goto L_0x0292
        L_0x0291:
            r0 = 0
        L_0x0292:
            if (r0 == 0) goto L_0x02c0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r14 = r4.getName()
            r0.append(r14)
            r0.append(r5)
            java.lang.String r5 = r15.getName()
            r0.append(r5)
            r5 = 58
            r0.append(r5)
            r0.append(r9)
            r9 = 59
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r14 = r0
            goto L_0x02c4
        L_0x02c0:
            r5 = 58
            r9 = 59
        L_0x02c4:
            int r7 = r7 + 1
            r15 = r24
            r9 = r25
            r0 = r26
            r5 = r27
            goto L_0x0235
        L_0x02d0:
            r27 = r5
        L_0x02d2:
            int r8 = r8 + 1
            r7 = r28
            r4 = r20
            r0 = r21
            r9 = r22
            r15 = r23
            r5 = r27
            goto L_0x01a3
        L_0x02e2:
            r27 = r5
            r23 = r15
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r4 = 35
            r0.append(r4)
            java.lang.String r14 = r0.toString()
            r7 = r28
            r4 = r17
            r0 = r18
            r8 = r19
            r9 = r23
            goto L_0x0171
        L_0x0303:
            r27 = r5
            r19 = r8
            java.lang.String r0 = "MediaInfo"
            r4 = 1
            java.lang.String r0 = r11.mo86045b(r0, r14, r4)
            r11.f155776g = r0
            r5 = 0
            zc1.b r0 = zc1.C66785b.f191882e     // Catch:{ all -> 0x0384 }
            r7 = 0
            bd1.b r0 = zc1.C66783a.C66784a.m78800c(r0, r7, r4, r5)     // Catch:{ all -> 0x0384 }
            if (r0 == 0) goto L_0x031d
            java.lang.String r0 = r0.field_nickname     // Catch:{ all -> 0x0384 }
            goto L_0x031e
        L_0x031d:
            r0 = r5
        L_0x031e:
            if (r0 != 0) goto L_0x0322
            r0 = r19
        L_0x0322:
            java.lang.String r4 = "snn"
            r9.put(r4, r0)     // Catch:{ all -> 0x0384 }
            java.util.LinkedList r0 = r3.getMediaList()     // Catch:{ all -> 0x0384 }
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)     // Catch:{ all -> 0x0384 }
            te3.rq2 r0 = (te3.C64689rq2) r0     // Catch:{ all -> 0x0384 }
            if (r0 == 0) goto L_0x038d
            te3.xb1 r0 = r0.f185236C     // Catch:{ all -> 0x0384 }
            if (r0 == 0) goto L_0x038d
            java.lang.String r4 = "codecInfo"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0384 }
            r7.<init>()     // Catch:{ all -> 0x0384 }
            java.lang.String r8 = "video_score:"
            r7.append(r8)     // Catch:{ all -> 0x0384 }
            float r8 = r0.f186282d     // Catch:{ all -> 0x0384 }
            r7.append(r8)     // Catch:{ all -> 0x0384 }
            java.lang.String r8 = ",video_cover_score:"
            r7.append(r8)     // Catch:{ all -> 0x0384 }
            float r8 = r0.f186283e     // Catch:{ all -> 0x0384 }
            r7.append(r8)     // Catch:{ all -> 0x0384 }
            java.lang.String r8 = ",video_audio_score:"
            r7.append(r8)     // Catch:{ all -> 0x0384 }
            float r8 = r0.f186284f     // Catch:{ all -> 0x0384 }
            r7.append(r8)     // Catch:{ all -> 0x0384 }
            java.lang.String r8 = ",thumb_score:"
            r7.append(r8)     // Catch:{ all -> 0x0384 }
            float r8 = r0.f186285g     // Catch:{ all -> 0x0384 }
            r7.append(r8)     // Catch:{ all -> 0x0384 }
            java.lang.String r8 = ",hdimg_score:"
            r7.append(r8)     // Catch:{ all -> 0x0384 }
            float r8 = r0.f186286h     // Catch:{ all -> 0x0384 }
            r7.append(r8)     // Catch:{ all -> 0x0384 }
            java.lang.String r8 = ",has_stickers:"
            r7.append(r8)     // Catch:{ all -> 0x0384 }
            boolean r0 = r0.f186287i     // Catch:{ all -> 0x0384 }
            r7.append(r0)     // Catch:{ all -> 0x0384 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0384 }
            r9.put(r4, r0)     // Catch:{ all -> 0x0384 }
            goto L_0x038d
        L_0x0384:
            r0 = move-exception
            r4 = 0
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r4 = "mediaInfoJson put snn"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r4, r7)
        L_0x038d:
            java.util.LinkedList r0 = r3.getMediaList()
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            te3.rq2 r0 = (te3.C64689rq2) r0
            if (r0 == 0) goto L_0x03bd
            java.lang.String r4 = r0.f185278r
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x03b9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = r0.f185266d
            r4.append(r7)
            java.lang.String r0 = r0.f185286y
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            goto L_0x03bb
        L_0x03b9:
            java.lang.String r0 = r0.f185278r
        L_0x03bb:
            if (r0 != 0) goto L_0x03bf
        L_0x03bd:
            r0 = r19
        L_0x03bf:
            if (r12 == 0) goto L_0x03f2
            java.util.LinkedList r4 = r3.getMediaList()
            if (r4 == 0) goto L_0x03f4
            java.lang.Object r4 = sx3.C110818d0.m150916N(r4)
            te3.rq2 r4 = (te3.C64689rq2) r4
            if (r4 == 0) goto L_0x03f4
            java.lang.String r5 = r4.f185278r
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x03ef
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = r4.f185266d
            r5.append(r7)
            java.lang.String r4 = r4.f185286y
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            goto L_0x03f4
        L_0x03ef:
            java.lang.String r5 = r4.f185278r
            goto L_0x03f4
        L_0x03f2:
            r5 = r19
        L_0x03f4:
            java.lang.String r4 = r9.toString()
            java.lang.String r7 = "mediaInfoJson.toString()"
            gy3.C87412m.m108593f(r4, r7)
            java.lang.String r7 = ","
            java.lang.String r8 = ";"
            r9 = 0
            java.lang.String r4 = z04.C112551y.m153814n(r4, r7, r8, r9)
            java.lang.String r9 = "mediaInfoJson"
            r10 = 1
            java.lang.String r4 = r11.mo86045b(r9, r4, r10)
            r11.f155783n = r4
            java.lang.Object r4 = sx3.C110818d0.m150916N(r13)
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r4 = (com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject) r4
            if (r4 == 0) goto L_0x0430
            int r4 = r4.mediaType
            r9 = 4
            if (r4 != r9) goto L_0x0430
            dp1.t0 r4 = dp1.C58408t0.f167336a
            java.lang.Object r9 = sx3.C110818d0.m150914L(r13)
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r9 = (com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject) r9
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMediaReportInfo> r9 = r9.multiMediaInfo
            java.lang.String r10 = "mediaReportList.first().multiMediaInfo"
            gy3.C87412m.m108593f(r9, r10)
            java.lang.String r4 = r4.mo83255a(r9)
            goto L_0x0432
        L_0x0430:
            r4 = r19
        L_0x0432:
            r9 = 0
            java.lang.String r4 = z04.C112551y.m153814n(r4, r7, r8, r9)
            java.lang.String r7 = "multiMediaInfo"
            r8 = 1
            java.lang.String r4 = r11.mo86045b(r7, r4, r8)
            r11.f155786q = r4
            int r4 = r6.cgiErrorCode
            r11.f155787r = r4
            int r4 = r6.cgiErrorType
            r11.f155788s = r4
            java.lang.String r4 = "firstUrl"
            java.lang.String r0 = r11.mo86045b(r4, r0, r8)
            r11.f155789t = r0
            if (r12 == 0) goto L_0x0455
            r12 = 1
            goto L_0x0457
        L_0x0455:
            r12 = 2
        L_0x0457:
            r11.f155790u = r12
            java.lang.String r0 = "longVideoUrl"
            java.lang.String r0 = r11.mo86045b(r0, r5, r8)
            r11.f155791v = r0
            int r0 = r6.megaCgiErrorCode
            r11.f155792w = r0
            int r0 = r6.megaCgiErrorType
            r11.f155793x = r0
            int r0 = r6.longVideoSizeInvalid
            long r4 = (long) r0
            r11.f155794y = r4
            int r0 = r6.dumpCgiErrorCode
            r11.f155769D = r0
            int r0 = r6.dumpCgiErrorType
            r11.f155770E = r0
            int r0 = r6.sdkShareType
            r11.f155771F = r0
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r3.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x0491
            te3.ef1 r0 = r0.event
            if (r0 == 0) goto L_0x0491
            long r3 = r0.f132898d
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0491
            r3 = 1
            r15 = 1
            goto L_0x0493
        L_0x0491:
            r3 = 1
            r15 = 0
        L_0x0493:
            r0 = r15 ^ 1
            r11.f155772G = r0
            r11.mo86054n()
            java.lang.Class<dp1.y0> r0 = dp1.C58417y0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            dp1.y0 r0 = (dp1.C58417y0) r0
            r0.Ec0(r11)
            goto L_0x04a8
        L_0x04a6:
            r27 = r5
        L_0x04a8:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.mo3513o()
            boolean r0 = r0.isLongVideo()
            if (r0 == 0) goto L_0x04bf
            di3.d r0 = di3.C86312j.m106911c(r2)
            lr.b r0 = (p599lr.C61381b) r0
            qo1.j r0 = r0.mo78555oT()
            r0.mo12433h()
        L_0x04bf:
            fp1.a r2 = fp1.C59266a.f169452a
            fp1.c r3 = fp1.C59267b.f169462j
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.mo3513o()
            r5 = 0
            r6 = 0
            r7 = 12
            r8 = 0
            fp1.C59266a.m69196d(r2, r3, r4, r5, r6, r7, r8)
            com.tencent.mm.autogen.events.FeedDeleteEvent r0 = new com.tencent.mm.autogen.events.FeedDeleteEvent
            r0.<init>()
            com.tencent.mm.autogen.events.FeedDeleteEvent$a r2 = r0.f9154d
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.mo3513o()
            long r3 = r3.getLocalId()
            r2.f9156b = r3
            r0.publish()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "deleteItem by localId "
            r0.append(r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            long r1 = r1.getLocalId()
            r0.append(r1)
            java.lang.String r1 = ", posting:"
            r0.append(r1)
            r1 = 1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r27
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x050a:
            java.lang.String r0 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshPostProgress$3"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r28
            j20.C117292a.m165361g(r4, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C65636q1.onClick(android.view.View):void");
    }
}
