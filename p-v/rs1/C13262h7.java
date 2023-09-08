package rs1;

import hp3.C87581a;
import java.lang.ref.WeakReference;
import jq3.C60905o;
import te3.C51096re1;

/* renamed from: rs1.h7 */
public final class C13262h7<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ long f37636a;

    /* renamed from: b */
    public final /* synthetic */ C13502w6 f37637b;

    /* renamed from: c */
    public final /* synthetic */ WeakReference<C60905o> f37638c;

    /* renamed from: d */
    public final /* synthetic */ C51096re1 f37639d;

    public C13262h7(long j, C13502w6 w6Var, WeakReference<C60905o> weakReference, C51096re1 re12) {
        this.f37636a = j;
        this.f37637b = w6Var;
        this.f37638c = weakReference;
        this.f37639d = re12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            ob0.b$c r0 = (ob0.C89132b.C89134c) r0
            int r2 = r0.f256793a
            java.lang.String r4 = "Finder.FinderNpsSurveyUIC"
            if (r2 != 0) goto L_0x01ef
            int r2 = r0.f256794b
            if (r2 != 0) goto L_0x01ef
            T r0 = r0.f256796d
            te3.ep0 r0 = (te3.C49315ep0) r0
            te3.pe1 r0 = r0.f133046d
            if (r0 == 0) goto L_0x01ec
            long r5 = r1.f37636a
            rs1.w6 r2 = r1.f37637b
            java.lang.ref.WeakReference<jq3.o> r7 = r1.f37638c
            te3.re1 r8 = r1.f37639d
            java.lang.Long r9 = java.lang.Long.valueOf(r5)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, te3.pe1> r10 = rs1.C13502w6.f38269t
            r10.put(r9, r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "surveyGet succeed feedId = "
            r9.append(r10)
            java.lang.Class<kq.h> r10 = p185kq.C10383h.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            kq.h r10 = (p185kq.C10383h) r10
            java.lang.String r5 = r10.mo10700XQ(r5)
            r9.append(r5)
            java.lang.String r5 = " isFocusing = "
            r9.append(r5)
            r2.getClass()
            r5 = 0
            r9.append(r5)
            java.lang.String r6 = " survey = "
            r9.append(r6)
            java.lang.String r6 = " title = "
            r10 = 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0179 }
            r11.<init>()     // Catch:{ all -> 0x0179 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0179 }
            r12.<init>()     // Catch:{ all -> 0x0179 }
            java.lang.String r13 = "[FinderNpsSurveyInfo] surveyId = "
            r12.append(r13)     // Catch:{ all -> 0x0179 }
            long r13 = r0.f139721d     // Catch:{ all -> 0x0179 }
            r12.append(r13)     // Catch:{ all -> 0x0179 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0179 }
            r11.append(r12)     // Catch:{ all -> 0x0179 }
            r12 = 10
            r11.append(r12)     // Catch:{ all -> 0x0179 }
            java.util.LinkedList<te3.qe1> r13 = r0.f139722e     // Catch:{ all -> 0x0179 }
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r13)     // Catch:{ all -> 0x0179 }
            if (r13 != 0) goto L_0x016a
            java.util.LinkedList<te3.qe1> r0 = r0.f139722e     // Catch:{ all -> 0x0179 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0179 }
        L_0x0085:
            boolean r13 = r0.hasNext()     // Catch:{ all -> 0x0179 }
            if (r13 == 0) goto L_0x016a
            java.lang.Object r13 = r0.next()     // Catch:{ all -> 0x0179 }
            te3.qe1 r13 = (te3.C50949qe1) r13     // Catch:{ all -> 0x0179 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0179 }
            r14.<init>()     // Catch:{ all -> 0x0179 }
            java.lang.String r15 = "\t[Question] questionId = "
            r14.append(r15)     // Catch:{ all -> 0x0179 }
            r15 = r4
            long r3 = r13.f140257d     // Catch:{ all -> 0x0177 }
            r14.append(r3)     // Catch:{ all -> 0x0177 }
            r14.append(r6)     // Catch:{ all -> 0x0177 }
            java.lang.String r3 = r13.f140258e     // Catch:{ all -> 0x0177 }
            r14.append(r3)     // Catch:{ all -> 0x0177 }
            java.lang.String r3 = " questionStyle = "
            r14.append(r3)     // Catch:{ all -> 0x0177 }
            int r3 = r13.f140260g     // Catch:{ all -> 0x0177 }
            java.lang.String r4 = "Other"
            r5 = 2
            if (r3 == r10) goto L_0x00bc
            if (r3 == r5) goto L_0x00b9
            r3 = r4
            goto L_0x00be
        L_0x00b9:
            java.lang.String r3 = "FlowLayout"
            goto L_0x00be
        L_0x00bc:
            java.lang.String r3 = "RightLayout"
        L_0x00be:
            r14.append(r3)     // Catch:{ all -> 0x0177 }
            java.lang.String r3 = " questionType="
            r14.append(r3)     // Catch:{ all -> 0x0177 }
            int r3 = r13.f140261h     // Catch:{ all -> 0x0177 }
            if (r3 == r10) goto L_0x00d1
            if (r3 == r5) goto L_0x00ce
            r3 = r4
            goto L_0x00d3
        L_0x00ce:
            java.lang.String r3 = "StarScore"
            goto L_0x00d3
        L_0x00d1:
            java.lang.String r3 = "SingleOption"
        L_0x00d3:
            r14.append(r3)     // Catch:{ all -> 0x0177 }
            java.lang.String r3 = r14.toString()     // Catch:{ all -> 0x0177 }
            r11.append(r3)     // Catch:{ all -> 0x0177 }
            r11.append(r12)     // Catch:{ all -> 0x0177 }
            java.util.LinkedList<te3.oe1> r3 = r13.f140259f     // Catch:{ all -> 0x0177 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)     // Catch:{ all -> 0x0177 }
            if (r3 != 0) goto L_0x0161
            java.util.LinkedList<te3.oe1> r3 = r13.f140259f     // Catch:{ all -> 0x0177 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0177 }
        L_0x00ee:
            boolean r13 = r3.hasNext()     // Catch:{ all -> 0x0177 }
            if (r13 == 0) goto L_0x0161
            java.lang.Object r13 = r3.next()     // Catch:{ all -> 0x0177 }
            te3.oe1 r13 = (te3.C50668oe1) r13     // Catch:{ all -> 0x0177 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0177 }
            r14.<init>()     // Catch:{ all -> 0x0177 }
            java.lang.String r12 = "\t\t[Answer] answerId = "
            r14.append(r12)     // Catch:{ all -> 0x0177 }
            r16 = r11
            long r10 = r13.f139110d     // Catch:{ all -> 0x0177 }
            r14.append(r10)     // Catch:{ all -> 0x0177 }
            r14.append(r6)     // Catch:{ all -> 0x0177 }
            java.lang.String r10 = r13.f139111e     // Catch:{ all -> 0x0177 }
            r14.append(r10)     // Catch:{ all -> 0x0177 }
            java.lang.String r10 = " next_question = "
            r14.append(r10)     // Catch:{ all -> 0x0177 }
            long r10 = r13.f139116j     // Catch:{ all -> 0x0177 }
            r14.append(r10)     // Catch:{ all -> 0x0177 }
            java.lang.String r10 = " icon = "
            r14.append(r10)     // Catch:{ all -> 0x0177 }
            int r10 = r13.f139112f     // Catch:{ all -> 0x0177 }
            r11 = 1
            if (r10 == r11) goto L_0x0134
            if (r10 == r5) goto L_0x0131
            r11 = 3
            if (r10 == r11) goto L_0x012e
            r10 = r4
            goto L_0x0136
        L_0x012e:
            java.lang.String r10 = "Good"
            goto L_0x0136
        L_0x0131:
            java.lang.String r10 = "Bad"
            goto L_0x0136
        L_0x0134:
            java.lang.String r10 = "Normal"
        L_0x0136:
            r14.append(r10)     // Catch:{ all -> 0x0177 }
            java.lang.String r10 = " actionType = "
            r14.append(r10)     // Catch:{ all -> 0x0177 }
            int r10 = r13.f139115i     // Catch:{ all -> 0x0177 }
            r11 = 1
            if (r10 == r11) goto L_0x014a
            if (r10 == r5) goto L_0x0147
            r10 = r4
            goto L_0x014c
        L_0x0147:
            java.lang.String r10 = "NextQuestion"
            goto L_0x014c
        L_0x014a:
            java.lang.String r10 = "Finish"
        L_0x014c:
            r14.append(r10)     // Catch:{ all -> 0x0177 }
            java.lang.String r10 = r14.toString()     // Catch:{ all -> 0x0177 }
            r11 = r16
            r11.append(r10)     // Catch:{ all -> 0x0177 }
            r10 = 10
            r11.append(r10)     // Catch:{ all -> 0x0177 }
            r10 = 1
            r12 = 10
            goto L_0x00ee
        L_0x0161:
            r10 = 10
            r4 = r15
            r5 = 0
            r10 = 1
            r12 = 10
            goto L_0x0085
        L_0x016a:
            r15 = r4
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x0177 }
            java.lang.String r3 = "sb.toString()"
            gy3.C87412m.m108593f(r0, r3)     // Catch:{ all -> 0x0177 }
            r4 = r15
            goto L_0x018a
        L_0x0177:
            r0 = move-exception
            goto L_0x017b
        L_0x0179:
            r0 = move-exception
            r15 = r4
        L_0x017b:
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = "stringifyQuestion failed"
            r4 = r15
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r3)
            java.lang.String r0 = ""
        L_0x018a:
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            java.lang.Object r0 = r7.get()
            jq3.o r0 = (jq3.C60905o) r0
            if (r0 == 0) goto L_0x01ec
            boolean r3 = rs1.C13502w6.m12824d3(r2, r0)
            if (r3 == 0) goto L_0x01e9
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99505r7
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x01be
            float r3 = r8.f140861o
            r4 = 1000(0x3e8, float:1.401E-42)
            float r4 = (float) r4
            float r3 = r3 * r4
            long r3 = (long) r3
            goto L_0x01c3
        L_0x01be:
            long r3 = (long) r3
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
        L_0x01c3:
            boolean r5 = r2.f38281p
            if (r5 == 0) goto L_0x01d8
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x01e9
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r2.f38282q
            long r5 = r5 - r7
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x01e9
        L_0x01d8:
            com.tencent.mm.sdk.platformtools.MMHandler r3 = r2.f38274f
            r4 = 0
            r3.removeCallbacksAndMessages(r4)
            java.lang.System.currentTimeMillis()
            rs1.g7 r3 = new rs1.g7
            r3.<init>(r2, r0)
            r2.mo12911P3(r0, r3)
        L_0x01e9:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x0212
        L_0x01ec:
            r4 = 0
            r3 = r4
            goto L_0x0212
        L_0x01ef:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "surveyGet CgiFinderGetSurvey failed, errType = "
            r2.append(r3)
            int r3 = r0.f256793a
            r2.append(r3)
            java.lang.String r3 = ", errCode = "
            r2.append(r3)
            int r0 = r0.f256794b
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0212:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13262h7.call(java.lang.Object):java.lang.Object");
    }
}
