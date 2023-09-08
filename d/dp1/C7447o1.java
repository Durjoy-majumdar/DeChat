package dp1;

import android.text.SpannableString;
import android.view.View;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import zp3.C23555k;

/* renamed from: dp1.o1 */
public final class C7447o1 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ SpannableString f25636a;

    /* renamed from: b */
    public final /* synthetic */ BaseFinderFeed f25637b;

    /* renamed from: c */
    public final /* synthetic */ View f25638c;

    public C7447o1(SpannableString spannableString, BaseFinderFeed baseFinderFeed, View view) {
        this.f25636a = spannableString;
        this.f25637b = baseFinderFeed;
        this.f25638c = view;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01dd  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo53b(android.view.View r25, long r26, long r28, boolean r30) {
        /*
            r24 = this;
            r0 = r24
            java.lang.String r1 = "view"
            r2 = r25
            gy3.C87412m.m108594g(r2, r1)
            if (r30 == 0) goto L_0x01e6
            android.text.SpannableString r1 = r0.f25636a
            int r2 = r1.length()
            java.lang.Class<com.tencent.mm.plugin.finder.view.g5> r3 = com.tencent.p014mm.plugin.finder.view.C4059g5.class
            r4 = 0
            java.lang.Object[] r1 = r1.getSpans(r4, r2, r3)
            java.lang.String r2 = "spannableString.getSpans…extClickSpan::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            com.tencent.mm.plugin.finder.view.g5[] r1 = (com.tencent.p014mm.plugin.finder.view.C4059g5[]) r1
            int r2 = r1.length
            r3 = 0
        L_0x0023:
            if (r3 >= r2) goto L_0x01e6
            r5 = r1[r3]
            boolean r6 = r5.f18185j
            java.lang.String r7 = "contentTv.context"
            if (r6 == 0) goto L_0x014a
            er1.w3 r6 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r9 = r0.f25637b
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r9.mo3513o()
            te3.db1 r9 = r9.getLocation()
            java.lang.String r9 = r9.f182663f
            r10 = 1
            if (r9 == 0) goto L_0x0047
            int r11 = r9.length()
            if (r11 != 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r11 = 0
            goto L_0x0048
        L_0x0047:
            r11 = 1
        L_0x0048:
            if (r11 == 0) goto L_0x004b
            r9 = 0
        L_0x004b:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r11 = r0.f25637b
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r11.mo3513o()
            te3.db1 r11 = r11.getLocation()
            java.lang.String r11 = r11.f182664g
            if (r11 == 0) goto L_0x0062
            int r12 = r11.length()
            if (r12 != 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r12 = 0
            goto L_0x0063
        L_0x0062:
            r12 = 1
        L_0x0063:
            if (r12 == 0) goto L_0x0066
            r11 = 0
        L_0x0066:
            java.lang.String r6 = r6.mo83946l0(r9, r11)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r9 = r0.f25637b
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r9.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.getFeedObject()
            int r9 = r9.recommendType
            java.lang.String r11 = "link_poi"
            java.lang.String r12 = "poi_name"
            if (r9 != r10) goto L_0x011b
            bl3.r r9 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r10 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r9 = r9.mo62446e(r10)
            java.lang.Class<os1.d> r10 = os1.C62153d.class
            androidx.lifecycle.i0 r9 = r9.mo75002a(r10)
            os1.d r9 = (os1.C62153d) r9
            rx3.l r9 = r9.mo9104X0()
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r10 = r0.f25637b
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r10.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r10 = r10.objectDesc
            if (r10 == 0) goto L_0x00a1
            te3.db1 r10 = r10.location
            goto L_0x00a2
        L_0x00a1:
            r10 = 0
        L_0x00a2:
            if (r10 == 0) goto L_0x014a
            android.view.View r13 = r0.f25638c
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r14 = r0.f25637b
            B r15 = r9.f38556e
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            r26 = r5
            double r4 = (double) r15
            A r9 = r9.f38555d
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            double r8 = (double) r9
            float r15 = r10.f182662e
            r28 = r1
            r29 = r2
            double r1 = (double) r15
            float r10 = r10.f182661d
            r30 = r11
            double r10 = (double) r10
            r16 = r4
            r18 = r8
            r20 = r1
            r22 = r10
            double r1 = pl0.C118116u.m166641f(r16, r18, r20, r22)
            android.content.Context r4 = r13.getContext()
            gy3.C87412m.m108593f(r4, r7)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r14.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.getFeedObject()
            java.lang.String r5 = r5.recommendReason
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            r8.put(r12, r6)     // Catch:{ JSONException -> 0x0101 }
            java.lang.String r6 = "geo_distance"
            int r1 = (int) r1     // Catch:{ JSONException -> 0x0101 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ JSONException -> 0x0101 }
            r8.put(r6, r1)     // Catch:{ JSONException -> 0x0101 }
            java.lang.String r1 = "content"
            if (r5 != 0) goto L_0x00fd
            java.lang.String r5 = ""
        L_0x00fd:
            r8.put(r1, r5)     // Catch:{ JSONException -> 0x0101 }
            goto L_0x0102
        L_0x0101:
        L_0x0102:
            dp1.f2 r1 = dp1.C7435f2.f25626a
            rs1.s8$a r2 = rs1.C13442s8.f38060Q0
            rs1.s8 r2 = r2.mo12873f(r4)
            if (r2 == 0) goto L_0x0113
            te3.hj1 r2 = r2.mo12861q3()
            r4 = r30
            goto L_0x0116
        L_0x0113:
            r4 = r30
            r2 = 0
        L_0x0116:
            r5 = 0
            r1.mo8577a(r2, r4, r5, r8)
            goto L_0x0150
        L_0x011b:
            r28 = r1
            r29 = r2
            r26 = r5
            r4 = r11
            android.view.View r1 = r0.f25638c
            android.content.Context r1 = r1.getContext()
            gy3.C87412m.m108593f(r1, r7)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r2.put(r12, r6)     // Catch:{ JSONException -> 0x0134 }
            goto L_0x0135
        L_0x0134:
        L_0x0135:
            dp1.f2 r5 = dp1.C7435f2.f25626a
            rs1.s8$a r6 = rs1.C13442s8.f38060Q0
            rs1.s8 r1 = r6.mo12873f(r1)
            if (r1 == 0) goto L_0x0144
            te3.hj1 r1 = r1.mo12861q3()
            goto L_0x0145
        L_0x0144:
            r1 = 0
        L_0x0145:
            r6 = 0
            r5.mo8577a(r1, r4, r6, r2)
            goto L_0x0150
        L_0x014a:
            r28 = r1
            r29 = r2
            r26 = r5
        L_0x0150:
            r1 = r26
            boolean r2 = r1.f18186n
            if (r2 == 0) goto L_0x0183
            android.view.View r2 = r0.f25638c
            android.content.Context r2 = r2.getContext()
            gy3.C87412m.m108593f(r2, r7)
            java.lang.String r4 = r1.f18179d
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r6 = "nickname"
            r5.put(r6, r4)     // Catch:{ JSONException -> 0x016c }
            goto L_0x016d
        L_0x016c:
        L_0x016d:
            dp1.f2 r4 = dp1.C7435f2.f25626a
            rs1.s8$a r6 = rs1.C13442s8.f38060Q0
            rs1.s8 r2 = r6.mo12873f(r2)
            if (r2 == 0) goto L_0x017c
            te3.hj1 r2 = r2.mo12861q3()
            goto L_0x017d
        L_0x017c:
            r2 = 0
        L_0x017d:
            java.lang.String r6 = "link_at_profile"
            r8 = 0
            r4.mo8577a(r2, r6, r8, r5)
        L_0x0183:
            boolean r1 = r1.f18187o
            if (r1 == 0) goto L_0x01dd
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f25637b
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            if (r1 == 0) goto L_0x019c
            te3.ef1 r1 = r1.event
            if (r1 == 0) goto L_0x019c
            long r1 = r1.f132898d
            goto L_0x019e
        L_0x019c:
            r1 = 0
        L_0x019e:
            java.lang.String r1 = o40.C61926c.m72691p(r1)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f25637b
            long r4 = r2.getItemId()
            java.lang.String r2 = o40.C61926c.m72691p(r4)
            android.view.View r4 = r0.f25638c
            android.content.Context r4 = r4.getContext()
            gy3.C87412m.m108593f(r4, r7)
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r6 = "activityid"
            r5.put(r6, r1)     // Catch:{ JSONException -> 0x01c5 }
            java.lang.String r1 = "feedid"
            r5.put(r1, r2)     // Catch:{ JSONException -> 0x01c5 }
            goto L_0x01c6
        L_0x01c5:
        L_0x01c6:
            dp1.f2 r1 = dp1.C7435f2.f25626a
            rs1.s8$a r2 = rs1.C13442s8.f38060Q0
            rs1.s8 r2 = r2.mo12873f(r4)
            if (r2 == 0) goto L_0x01d5
            te3.hj1 r8 = r2.mo12861q3()
            goto L_0x01d6
        L_0x01d5:
            r8 = 0
        L_0x01d6:
            java.lang.String r2 = "link_activity"
            r4 = 0
            r1.mo8577a(r8, r2, r4, r5)
            goto L_0x01de
        L_0x01dd:
            r4 = 0
        L_0x01de:
            int r3 = r3 + 1
            r1 = r28
            r2 = r29
            goto L_0x0023
        L_0x01e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C7447o1.mo53b(android.view.View, long, long, boolean):void");
    }
}
