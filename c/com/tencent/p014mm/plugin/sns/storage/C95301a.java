package com.tencent.p014mm.plugin.sns.storage;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C8480h;
import gy3.C87412m;
import os2.C100397a;
import os2.C100413l;

/* renamed from: com.tencent.mm.plugin.sns.storage.a */
public final class C95301a {

    /* renamed from: c */
    public static final C95302a f276613c = new C95302a((C8480h) null);

    /* renamed from: a */
    public final C100413l f276614a;

    /* renamed from: b */
    public final C100397a f276615b;

    /* renamed from: com.tencent.mm.plugin.sns.storage.a$a */
    public static final class C95302a {
        public C95302a(C8480h hVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00cf, code lost:
            r8 = z04.C66731x.m78731e(r8);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.tencent.p014mm.plugin.sns.storage.C95301a mo132014a(java.util.Map<java.lang.String, java.lang.String> r33, java.lang.String r34) {
            /*
                r32 = this;
                r0 = r33
                r1 = r34
                java.lang.String r2 = "parse"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo$Companion"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                r4 = 0
                if (r0 != 0) goto L_0x0013
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                return r4
            L_0x0013:
                if (r1 != 0) goto L_0x0019
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                return r4
            L_0x0019:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r1)
                java.lang.String r6 = ".mediaType"
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.Object r5 = r0.get(r5)
                java.lang.String r5 = (java.lang.String) r5
                if (r5 != 0) goto L_0x0034
                java.lang.String r5 = ""
            L_0x0034:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r1)
                java.lang.String r7 = ".alphaVideoInfo"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r7 = "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo$Companion"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r7)
                if (r6 != 0) goto L_0x0054
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r7)
                r1 = r4
                r31 = r5
                goto L_0x027a
            L_0x0054:
                os2.q r10 = os2.C100415q.f294176a
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r6)
                java.lang.String r12 = ".media"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                te3.kv2 r13 = r10.mo139879a(r11, r0)
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r6)
                java.lang.String r12 = ".oneToOneHighMedia"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                te3.kv2 r14 = r10.mo139879a(r11, r0)
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r6)
                java.lang.String r12 = ".oneToOneLowMedia"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                te3.kv2 r15 = r10.mo139879a(r11, r0)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r6)
                java.lang.String r11 = ".playModeInfo"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                java.lang.String r11 = "com.tencent.mm.plugin.sns.storage.PlayModeInfo$Companion"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r11)
                if (r10 != 0) goto L_0x00b6
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r11)
                r16 = r4
                r31 = r5
                goto L_0x0242
            L_0x00b6:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r10)
                java.lang.String r8 = ".playMode"
                r12.append(r8)
                java.lang.String r8 = r12.toString()
                java.lang.Object r8 = r0.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L_0x00da
                java.lang.Integer r8 = z04.C66731x.m78731e(r8)
                if (r8 == 0) goto L_0x00da
                int r8 = r8.intValue()
                goto L_0x00db
            L_0x00da:
                r8 = 0
            L_0x00db:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r10)
                java.lang.String r9 = ".startOffset"
                r12.append(r9)
                java.lang.String r9 = r12.toString()
                java.lang.Object r9 = r0.get(r9)
                java.lang.String r9 = (java.lang.String) r9
                if (r9 == 0) goto L_0x0101
                java.lang.Float r9 = z04.C66730w.m78730d(r9)
                if (r9 == 0) goto L_0x0101
                float r9 = r9.floatValue()
                r20 = r9
                goto L_0x0103
            L_0x0101:
                r20 = 0
            L_0x0103:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r10)
                java.lang.String r12 = ".loopStartTime"
                r9.append(r12)
                java.lang.String r9 = r9.toString()
                java.lang.Object r9 = r0.get(r9)
                java.lang.String r9 = (java.lang.String) r9
                if (r9 == 0) goto L_0x0129
                java.lang.Float r9 = z04.C66730w.m78730d(r9)
                if (r9 == 0) goto L_0x0129
                float r9 = r9.floatValue()
                r21 = r9
                goto L_0x012b
            L_0x0129:
                r21 = 0
            L_0x012b:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r10)
                java.lang.String r12 = ".loopEndTime"
                r9.append(r12)
                java.lang.String r9 = r9.toString()
                java.lang.Object r9 = r0.get(r9)
                java.lang.String r9 = (java.lang.String) r9
                if (r9 == 0) goto L_0x0151
                java.lang.Float r9 = z04.C66730w.m78730d(r9)
                if (r9 == 0) goto L_0x0151
                float r9 = r9.floatValue()
                r22 = r9
                goto L_0x0153
            L_0x0151:
                r22 = 0
            L_0x0153:
                r9 = 1
                if (r8 != r9) goto L_0x0230
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r10)
                java.lang.String r10 = ".playStateInfo"
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                java.lang.String r10 = "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r10)
                if (r9 != 0) goto L_0x0175
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)
                r31 = r5
                goto L_0x020e
            L_0x0175:
                os2.u r12 = new os2.u
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r9)
                r31 = r5
                java.lang.String r5 = ".breakHideDuration"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.lang.Object r4 = r0.get(r4)
                java.lang.String r4 = (java.lang.String) r4
                if (r4 == 0) goto L_0x019f
                java.lang.Float r4 = z04.C66730w.m78730d(r4)
                if (r4 == 0) goto L_0x019f
                float r4 = r4.floatValue()
                r25 = r4
                goto L_0x01a1
            L_0x019f:
                r25 = 0
            L_0x01a1:
                os2.t$a r4 = os2.C62176t.f176778d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r9)
                java.lang.String r1 = ".breakState"
                r5.append(r1)
                java.lang.String r1 = r5.toString()
                os2.t r26 = r4.mo87232a(r0, r1)
                if (r26 != 0) goto L_0x01be
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)
                goto L_0x020e
            L_0x01be:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r9)
                java.lang.String r5 = ".stopState"
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                os2.t r27 = r4.mo87232a(r0, r1)
                if (r27 != 0) goto L_0x01d9
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)
                goto L_0x020e
            L_0x01d9:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r9)
                java.lang.String r5 = ".likeState"
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                os2.t r28 = r4.mo87232a(r0, r1)
                if (r28 != 0) goto L_0x01f4
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)
                goto L_0x020e
            L_0x01f4:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r9)
                java.lang.String r5 = ".commentState"
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                os2.t r29 = r4.mo87232a(r0, r1)
                if (r29 != 0) goto L_0x0210
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)
            L_0x020e:
                r12 = 0
                goto L_0x022d
            L_0x0210:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r9)
                java.lang.String r5 = ".cancelLikeState"
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                os2.t r30 = r4.mo87232a(r0, r1)
                r24 = r12
                r24.<init>(r25, r26, r27, r28, r29, r30)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)
            L_0x022d:
                r23 = r12
                goto L_0x0234
            L_0x0230:
                r31 = r5
                r23 = 0
            L_0x0234:
                os2.s r1 = new os2.s
                r18 = r1
                r19 = r8
                r18.<init>(r19, r20, r21, r22, r23)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r11)
                r16 = r1
            L_0x0242:
                if (r16 != 0) goto L_0x0249
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r7)
                r1 = 0
                goto L_0x027a
            L_0x0249:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                java.lang.String r4 = ".videoCompositeType"
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                java.lang.Object r1 = r0.get(r1)
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto L_0x026f
                java.lang.Integer r1 = z04.C66731x.m78731e(r1)
                if (r1 == 0) goto L_0x026f
                int r1 = r1.intValue()
                r17 = r1
                goto L_0x0271
            L_0x026f:
                r17 = 0
            L_0x0271:
                os2.l r1 = new os2.l
                r12 = r1
                r12.<init>(r13, r14, r15, r16, r17)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r7)
            L_0x027a:
                if (r1 != 0) goto L_0x0281
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            L_0x027f:
                r0 = 0
                return r0
            L_0x0281:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r5 = r34
                r4.append(r5)
                java.lang.String r5 = ".clickInfo"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo$Companion"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
                if (r4 != 0) goto L_0x02a1
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
                r0 = 0
                goto L_0x03a3
            L_0x02a1:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r4)
                java.lang.String r7 = ".areaLeft"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.Object r6 = r0.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                if (r6 == 0) goto L_0x02c6
                java.lang.Integer r6 = z04.C66731x.m78731e(r6)
                if (r6 == 0) goto L_0x02c6
                int r6 = r6.intValue()
                r8 = r6
                goto L_0x02c7
            L_0x02c6:
                r8 = 0
            L_0x02c7:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r4)
                java.lang.String r7 = ".areaTop"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.Object r6 = r0.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                if (r6 == 0) goto L_0x02ec
                java.lang.Integer r6 = z04.C66731x.m78731e(r6)
                if (r6 == 0) goto L_0x02ec
                int r6 = r6.intValue()
                r9 = r6
                goto L_0x02ed
            L_0x02ec:
                r9 = 0
            L_0x02ed:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r4)
                java.lang.String r7 = ".areaWidth"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.Object r6 = r0.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                if (r6 == 0) goto L_0x0312
                java.lang.Integer r6 = z04.C66731x.m78731e(r6)
                if (r6 == 0) goto L_0x0312
                int r6 = r6.intValue()
                r10 = r6
                goto L_0x0313
            L_0x0312:
                r10 = 0
            L_0x0313:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r4)
                java.lang.String r7 = ".areaHeight"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.Object r6 = r0.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                if (r6 == 0) goto L_0x0338
                java.lang.Integer r6 = z04.C66731x.m78731e(r6)
                if (r6 == 0) goto L_0x0338
                int r6 = r6.intValue()
                r11 = r6
                goto L_0x0339
            L_0x0338:
                r11 = 0
            L_0x0339:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r4)
                java.lang.String r7 = ".clickStartTime"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.Object r6 = r0.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                if (r6 == 0) goto L_0x035e
                java.lang.Float r6 = z04.C66730w.m78730d(r6)
                if (r6 == 0) goto L_0x035e
                float r6 = r6.floatValue()
                r12 = r6
                goto L_0x035f
            L_0x035e:
                r12 = 0
            L_0x035f:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r4)
                java.lang.String r7 = ".clickEndTime"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.Object r6 = r0.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                if (r6 == 0) goto L_0x0384
                java.lang.Float r6 = z04.C66730w.m78730d(r6)
                if (r6 == 0) goto L_0x0384
                float r6 = r6.floatValue()
                r13 = r6
                goto L_0x0385
            L_0x0384:
                r13 = 0
            L_0x0385:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r4)
                java.lang.String r4 = ".clickActionInfo"
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r14 = com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo.m119629b(r0, r4)
                os2.a r0 = new os2.a
                r7 = r0
                r7.<init>(r8, r9, r10, r11, r12, r13, r14)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            L_0x03a3:
                if (r0 != 0) goto L_0x03aa
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                goto L_0x027f
            L_0x03aa:
                com.tencent.mm.plugin.sns.storage.a r4 = new com.tencent.mm.plugin.sns.storage.a
                r5 = r31
                r4.<init>(r5, r1, r0)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.C95301a.C95302a.mo132014a(java.util.Map, java.lang.String):com.tencent.mm.plugin.sns.storage.a");
        }
    }

    public C95301a(String str, C100413l lVar, C100397a aVar) {
        C87412m.m108594g(str, "mediaType");
        C87412m.m108594g(lVar, "alphaVideoInfo");
        C87412m.m108594g(aVar, "clickInfo");
        this.f276614a = lVar;
        this.f276615b = aVar;
    }

    /* renamed from: a */
    public final C100413l mo132012a() {
        SnsMethodCalculate.markStartTimeMs("getAlphaVideoInfo", "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo");
        C100413l lVar = this.f276614a;
        SnsMethodCalculate.markEndTimeMs("getAlphaVideoInfo", "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo");
        return lVar;
    }

    /* renamed from: b */
    public final C100397a mo132013b() {
        SnsMethodCalculate.markStartTimeMs("getClickInfo", "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo");
        C100397a aVar = this.f276615b;
        SnsMethodCalculate.markEndTimeMs("getClickInfo", "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo");
        return aVar;
    }
}
