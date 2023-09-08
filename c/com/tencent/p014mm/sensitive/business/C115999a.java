package com.tencent.p014mm.sensitive.business;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sensitive.business.BusinessStackRecorder;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.sensitive.business.a */
public final class C115999a implements MMHandler.Callback {

    /* renamed from: d */
    public static final C115999a f347924d = new C115999a();

    /* renamed from: com.tencent.mm.sensitive.business.a$a */
    public static final class C116000a extends C87413o implements C32226l<BusinessStackRecorder.C115997c, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ BusinessStackRecorder.C115997c f347925d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C116000a(BusinessStackRecorder.C115997c cVar) {
            super(1);
            this.f347925d = cVar;
        }

        public Object invoke(Object obj) {
            BusinessStackRecorder.C115997c cVar = (BusinessStackRecorder.C115997c) obj;
            C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
            return Boolean.valueOf(C87412m.m108589b(cVar.f347918c, this.f347925d.f347918c));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: bh3.k$a} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Number] */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r12) {
        /*
            r11 = this;
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r12, r0)
            java.util.LinkedList<com.tencent.mm.sensitive.business.BusinessStackRecorder$c> r0 = com.tencent.p014mm.sensitive.business.BusinessStackRecorder.f347909i
            monitor-enter(r0)
            java.lang.Object r1 = r12.obj     // Catch:{ all -> 0x01da }
            boolean r1 = r1 instanceof com.tencent.p014mm.sensitive.business.BusinessStackRecorder.C115997c     // Catch:{ all -> 0x01da }
            r2 = 0
            if (r1 == 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r12 = r2
        L_0x0011:
            r1 = 1
            if (r12 == 0) goto L_0x01d8
            java.lang.Object r12 = r12.obj     // Catch:{ all -> 0x01da }
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.sensitive.business.BusinessStackRecorder.MsgData"
            gy3.C87412m.m108592e(r12, r3)     // Catch:{ all -> 0x01da }
            com.tencent.mm.sensitive.business.BusinessStackRecorder$c r12 = (com.tencent.p014mm.sensitive.business.BusinessStackRecorder.C115997c) r12     // Catch:{ all -> 0x01da }
            java.lang.String r3 = r12.f347916a     // Catch:{ all -> 0x01da }
            com.tencent.mm.sensitive.business.BusinessStackRecorder$b r4 = com.tencent.p014mm.sensitive.business.BusinessStackRecorder.f347906f     // Catch:{ all -> 0x01da }
            java.lang.String r5 = "com.tencent.mm.sensitive.SENSITIVE_PAGE_ENTER"
            boolean r5 = gy3.C87412m.m108589b(r3, r5)     // Catch:{ all -> 0x01da }
            r6 = 0
            if (r5 == 0) goto L_0x0093
            boolean r3 = r0.contains(r12)     // Catch:{ all -> 0x01da }
            r3 = r3 ^ r1
            if (r3 == 0) goto L_0x0033
            r3 = r0
            goto L_0x0034
        L_0x0033:
            r3 = r2
        L_0x0034:
            if (r3 == 0) goto L_0x0039
            r3.add(r12)     // Catch:{ all -> 0x01da }
        L_0x0039:
            java.lang.String r3 = r12.f347921f     // Catch:{ all -> 0x01da }
            int r5 = r3.length()     // Catch:{ all -> 0x01da }
            if (r5 <= 0) goto L_0x0043
            r5 = 1
            goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            if (r5 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r3 = r2
        L_0x0048:
            if (r3 == 0) goto L_0x004b
            goto L_0x0055
        L_0x004b:
            java.util.HashMap<java.lang.String, java.lang.String> r3 = com.tencent.p014mm.sensitive.business.BusinessStackRecorder.f347907g     // Catch:{ all -> 0x01da }
            java.lang.String r5 = r12.f347917b     // Catch:{ all -> 0x01da }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x01da }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01da }
        L_0x0055:
            if (r3 == 0) goto L_0x01d8
            bh3.k$a[] r5 = bh3.C113177k.C113178a.values()     // Catch:{ IllegalArgumentException -> 0x006d }
            int r7 = r5.length     // Catch:{ IllegalArgumentException -> 0x006d }
        L_0x005c:
            if (r6 >= r7) goto L_0x006d
            r8 = r5[r6]     // Catch:{ IllegalArgumentException -> 0x006d }
            java.lang.String r9 = r8.f338661d     // Catch:{ IllegalArgumentException -> 0x006d }
            boolean r9 = z04.C112551y.m153809i(r9, r3, r1)     // Catch:{ IllegalArgumentException -> 0x006d }
            if (r9 == 0) goto L_0x006a
            r2 = r8
            goto L_0x006d
        L_0x006a:
            int r6 = r6 + 1
            goto L_0x005c
        L_0x006d:
            if (r2 == 0) goto L_0x01d8
            r12.f347922g = r2     // Catch:{ all -> 0x01da }
            java.lang.String r3 = "BusinessStackRecorder"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01da }
            r5.<init>()     // Catch:{ all -> 0x01da }
            java.lang.String r6 = "enter business:"
            r5.append(r6)     // Catch:{ all -> 0x01da }
            r5.append(r2)     // Catch:{ all -> 0x01da }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x01da }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)     // Catch:{ all -> 0x01da }
            java.util.LinkedList<com.tencent.mm.sensitive.business.BusinessStackRecorder$c> r2 = com.tencent.p014mm.sensitive.business.BusinessStackRecorder.f347910j     // Catch:{ all -> 0x01da }
            r2.add(r12)     // Catch:{ all -> 0x01da }
            com.tencent.p014mm.sensitive.business.BusinessStackRecorder.C115996b.m163120a(r4)     // Catch:{ all -> 0x01da }
            rx3.b0 r12 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x01da }
            goto L_0x01d8
        L_0x0093:
            java.lang.String r5 = "com.tencent.mm.sensitive.SENSITIVE_PAGE_RESUME"
            boolean r5 = gy3.C87412m.m108589b(r3, r5)     // Catch:{ all -> 0x01da }
            if (r5 == 0) goto L_0x0168
            boolean r3 = r0.contains(r12)     // Catch:{ all -> 0x01da }
            r3 = r3 ^ r1
            if (r3 == 0) goto L_0x00a4
            r3 = r0
            goto L_0x00a5
        L_0x00a4:
            r3 = r2
        L_0x00a5:
            if (r3 == 0) goto L_0x00aa
            r3.add(r12)     // Catch:{ all -> 0x01da }
        L_0x00aa:
            java.lang.String r3 = r12.f347921f     // Catch:{ all -> 0x01da }
            int r5 = r3.length()     // Catch:{ all -> 0x01da }
            if (r5 <= 0) goto L_0x00b4
            r5 = 1
            goto L_0x00b5
        L_0x00b4:
            r5 = 0
        L_0x00b5:
            if (r5 == 0) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            r3 = r2
        L_0x00b9:
            if (r3 == 0) goto L_0x00bc
            goto L_0x00c6
        L_0x00bc:
            java.util.HashMap<java.lang.String, java.lang.String> r3 = com.tencent.p014mm.sensitive.business.BusinessStackRecorder.f347907g     // Catch:{ all -> 0x01da }
            java.lang.String r5 = r12.f347917b     // Catch:{ all -> 0x01da }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x01da }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01da }
        L_0x00c6:
            if (r3 == 0) goto L_0x01d8
            bh3.k$a[] r5 = bh3.C113177k.C113178a.values()     // Catch:{ IllegalArgumentException -> 0x00de }
            int r7 = r5.length     // Catch:{ IllegalArgumentException -> 0x00de }
            r8 = 0
        L_0x00ce:
            if (r8 >= r7) goto L_0x00de
            r9 = r5[r8]     // Catch:{ IllegalArgumentException -> 0x00de }
            java.lang.String r10 = r9.f338661d     // Catch:{ IllegalArgumentException -> 0x00de }
            boolean r10 = z04.C112551y.m153809i(r10, r3, r1)     // Catch:{ IllegalArgumentException -> 0x00de }
            if (r10 == 0) goto L_0x00db
            goto L_0x00df
        L_0x00db:
            int r8 = r8 + 1
            goto L_0x00ce
        L_0x00de:
            r9 = r2
        L_0x00df:
            if (r9 == 0) goto L_0x01d8
            r12.f347922g = r9     // Catch:{ all -> 0x01da }
            java.lang.String r3 = "BusinessStackRecorder"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01da }
            r5.<init>()     // Catch:{ all -> 0x01da }
            java.lang.String r7 = "resume business:"
            r5.append(r7)     // Catch:{ all -> 0x01da }
            r5.append(r9)     // Catch:{ all -> 0x01da }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x01da }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)     // Catch:{ all -> 0x01da }
            java.util.LinkedList<com.tencent.mm.sensitive.business.BusinessStackRecorder$c> r3 = com.tencent.p014mm.sensitive.business.BusinessStackRecorder.f347910j     // Catch:{ all -> 0x01da }
            java.lang.Object r5 = sx3.C110818d0.m150925W(r3)     // Catch:{ all -> 0x01da }
            boolean r5 = gy3.C87412m.m108589b(r5, r12)     // Catch:{ all -> 0x01da }
            if (r5 != 0) goto L_0x010f
            r3.add(r12)     // Catch:{ all -> 0x01da }
            com.tencent.p014mm.sensitive.business.BusinessStackRecorder.C115996b.m163120a(r4)     // Catch:{ all -> 0x01da }
            rx3.b0 r12 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x01da }
            goto L_0x01d8
        L_0x010f:
            int r4 = r3.size()     // Catch:{ all -> 0x01da }
            java.util.ListIterator r3 = r3.listIterator(r4)     // Catch:{ all -> 0x01da }
        L_0x0117:
            boolean r4 = r3.hasPrevious()     // Catch:{ all -> 0x01da }
            r5 = -1
            if (r4 == 0) goto L_0x0133
            java.lang.Object r4 = r3.previous()     // Catch:{ all -> 0x01da }
            com.tencent.mm.sensitive.business.BusinessStackRecorder$c r4 = (com.tencent.p014mm.sensitive.business.BusinessStackRecorder.C115997c) r4     // Catch:{ all -> 0x01da }
            java.lang.String r4 = r4.f347917b     // Catch:{ all -> 0x01da }
            java.lang.String r7 = r12.f347917b     // Catch:{ all -> 0x01da }
            boolean r4 = gy3.C87412m.m108589b(r4, r7)     // Catch:{ all -> 0x01da }
            if (r4 == 0) goto L_0x0117
            int r3 = r3.nextIndex()     // Catch:{ all -> 0x01da }
            goto L_0x0134
        L_0x0133:
            r3 = -1
        L_0x0134:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01da }
            int r4 = r3.intValue()     // Catch:{ all -> 0x01da }
            if (r4 == r5) goto L_0x013f
            r6 = 1
        L_0x013f:
            if (r6 == 0) goto L_0x0142
            r2 = r3
        L_0x0142:
            if (r2 == 0) goto L_0x015b
            int r2 = r2.intValue()     // Catch:{ all -> 0x01da }
            com.tencent.mm.sensitive.business.BusinessStackRecorder$b r3 = com.tencent.p014mm.sensitive.business.BusinessStackRecorder.f347906f     // Catch:{ all -> 0x01da }
            java.lang.String r3 = "BusinessStackRecorder"
            java.lang.String r4 = "already exist，move to Top"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ all -> 0x01da }
            java.util.LinkedList<com.tencent.mm.sensitive.business.BusinessStackRecorder$c> r3 = com.tencent.p014mm.sensitive.business.BusinessStackRecorder.f347910j     // Catch:{ all -> 0x01da }
            r3.remove(r2)     // Catch:{ all -> 0x01da }
            r3.add(r12)     // Catch:{ all -> 0x01da }
            goto L_0x01d8
        L_0x015b:
            com.tencent.mm.sensitive.business.BusinessStackRecorder$b r12 = com.tencent.p014mm.sensitive.business.BusinessStackRecorder.f347906f     // Catch:{ all -> 0x01da }
            java.lang.String r12 = "BusinessStackRecorder"
            java.lang.String r2 = "resume not exist，do nothing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)     // Catch:{ all -> 0x01da }
            rx3.b0 r12 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x01da }
            goto L_0x01d8
        L_0x0168:
            java.lang.String r5 = "com.tencent.mm.sensitive.SENSITIVE_PAGE_EXIT"
            boolean r3 = gy3.C87412m.m108589b(r3, r5)     // Catch:{ all -> 0x01da }
            if (r3 == 0) goto L_0x01cf
            r0.remove(r12)     // Catch:{ all -> 0x01da }
            java.lang.String r3 = r12.f347921f     // Catch:{ all -> 0x01da }
            int r5 = r3.length()     // Catch:{ all -> 0x01da }
            if (r5 <= 0) goto L_0x017d
            r5 = 1
            goto L_0x017e
        L_0x017d:
            r5 = 0
        L_0x017e:
            if (r5 == 0) goto L_0x0181
            goto L_0x0182
        L_0x0181:
            r3 = r2
        L_0x0182:
            if (r3 == 0) goto L_0x0185
            goto L_0x018f
        L_0x0185:
            java.util.HashMap<java.lang.String, java.lang.String> r3 = com.tencent.p014mm.sensitive.business.BusinessStackRecorder.f347907g     // Catch:{ all -> 0x01da }
            java.lang.String r5 = r12.f347917b     // Catch:{ all -> 0x01da }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x01da }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01da }
        L_0x018f:
            if (r3 == 0) goto L_0x01d8
            bh3.k$a[] r5 = bh3.C113177k.C113178a.values()     // Catch:{ IllegalArgumentException -> 0x01a7 }
            int r7 = r5.length     // Catch:{ IllegalArgumentException -> 0x01a7 }
        L_0x0196:
            if (r6 >= r7) goto L_0x01a7
            r8 = r5[r6]     // Catch:{ IllegalArgumentException -> 0x01a7 }
            java.lang.String r9 = r8.f338661d     // Catch:{ IllegalArgumentException -> 0x01a7 }
            boolean r9 = z04.C112551y.m153809i(r9, r3, r1)     // Catch:{ IllegalArgumentException -> 0x01a7 }
            if (r9 == 0) goto L_0x01a4
            r2 = r8
            goto L_0x01a7
        L_0x01a4:
            int r6 = r6 + 1
            goto L_0x0196
        L_0x01a7:
            if (r2 == 0) goto L_0x01d8
            java.lang.String r3 = "BusinessStackRecorder"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01da }
            r5.<init>()     // Catch:{ all -> 0x01da }
            java.lang.String r6 = "exit business:"
            r5.append(r6)     // Catch:{ all -> 0x01da }
            r5.append(r2)     // Catch:{ all -> 0x01da }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x01da }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)     // Catch:{ all -> 0x01da }
            java.util.LinkedList<com.tencent.mm.sensitive.business.BusinessStackRecorder$c> r2 = com.tencent.p014mm.sensitive.business.BusinessStackRecorder.f347910j     // Catch:{ all -> 0x01da }
            com.tencent.mm.sensitive.business.a$a r3 = new com.tencent.mm.sensitive.business.a$a     // Catch:{ all -> 0x01da }
            r3.<init>(r12)     // Catch:{ all -> 0x01da }
            o40.C61926c.m72675T(r2, r3)     // Catch:{ all -> 0x01da }
            com.tencent.p014mm.sensitive.business.BusinessStackRecorder.C115996b.m163120a(r4)     // Catch:{ all -> 0x01da }
            rx3.b0 r12 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x01da }
            goto L_0x01d8
        L_0x01cf:
            java.lang.String r12 = "BusinessStackRecorder"
            java.lang.String r2 = "handle illegal msg, do nothing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)     // Catch:{ all -> 0x01da }
            rx3.b0 r12 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x01da }
        L_0x01d8:
            monitor-exit(r0)
            return r1
        L_0x01da:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sensitive.business.C115999a.handleMessage(android.os.Message):boolean");
    }
}
