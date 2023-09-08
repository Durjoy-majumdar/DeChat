package je1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import it1.C9251d;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import o40.C61926c;
import ob0.C117747y;
import rx3.C13604l;
import sx3.C36907w;
import te3.C49173do1;
import te3.C49335eu3;
import te3.C49842ig0;
import te3.C51840wj0;
import te3.C51981xj0;

/* renamed from: je1.s */
public final class C9372s extends C9251d<C51981xj0> {

    /* renamed from: s */
    public final List<C49173do1> f29265s;

    /* renamed from: t */
    public final C51840wj0 f29266t;

    /* renamed from: je1.s$a */
    public static final class C9373a extends C87413o implements C32226l<C13604l<? extends Integer, ? extends Long>, CharSequence> {

        /* renamed from: d */
        public static final C9373a f29267d = new C9373a();

        public C9373a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C13604l lVar = (C13604l) obj;
            C87412m.m108594g(lVar, LocaleUtil.ITALIAN);
            return C61926c.m72691p(((Number) lVar.f38556e).longValue());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9372s(te3.C49712hj1 r26, com.tencent.p014mm.protocal.protobuf.FinderObject r27, pe3.C89349b r28, java.util.List<? extends te3.db4> r29, java.util.List<? extends te3.C49173do1> r30, int r31, int r32, int r33) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            r6 = r31
            r7 = r32
            java.lang.String r8 = "enhanceFeed"
            gy3.C87412m.m108594g(r2, r8)
            java.lang.String r8 = "statsList"
            gy3.C87412m.m108594g(r4, r8)
            java.lang.String r8 = "unreadFeedList"
            gy3.C87412m.m108594g(r5, r8)
            r8 = 0
            r9 = 2
            r0.<init>(r1, r8, r9, r8)
            r0.f29265s = r5
            te3.wj0 r9 = new te3.wj0
            r9.<init>()
            r0.f29266t = r9
            bl3.r r10 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r11 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r10 = r10.mo62446e(r11)
            java.lang.Class<os1.d> r11 = os1.C62153d.class
            androidx.lifecycle.i0 r10 = r10.mo75002a(r11)
            os1.d r10 = (os1.C62153d) r10
            rx3.l r10 = r10.mo9104X0()
            je1.h2 r11 = je1.C46523h2.f125330a
            r12 = 4004(0xfa4, float:5.611E-42)
            te3.ig0 r13 = r11.mo71860b(r12, r1)
            r9.f144072d = r13
            r9.f144073e = r3
            A r13 = r10.f38555d
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            r9.f144076h = r13
            B r10 = r10.f38556e
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            r9.f144077i = r10
            long r13 = r2.f164794id
            r9.f144074f = r13
            java.lang.String r10 = r2.objectNonceId
            r9.f144078j = r10
            java.util.LinkedList<te3.db4> r10 = r9.f144079n
            r10.addAll(r4)
            java.util.LinkedList<te3.do1> r10 = r9.f144080o
            r10.addAll(r5)
            r9.f144075g = r6
            r9.f144082q = r7
            te3.hh0 r5 = r11.mo71867j()
            r9.f144081p = r5
            r5 = r33
            r9.f144083r = r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
            java.lang.String r9 = "Cgi.FinderEnhanceStream"
            r10 = 1
            if (r10 > r5) goto L_0x00ac
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r5 != 0) goto L_0x0096
            boolean r5 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r5 == 0) goto L_0x00ac
        L_0x0096:
            java.util.Iterator r5 = r29.iterator()
        L_0x009a:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x00ac
            java.lang.Object r11 = r5.next()
            te3.db4 r11 = (te3.db4) r11
            dp1.j1$a r13 = dp1.C58378j1.f167214j0
            r13.mo83213c(r11, r9)
            goto L_0x009a
        L_0x00ac:
            rx3.l[] r5 = new rx3.C13604l[r10]
            rx3.l r11 = new rx3.l
            r13 = 0
            if (r1 == 0) goto L_0x00b6
            int r14 = r1.f134675i
            goto L_0x00b7
        L_0x00b6:
            r14 = 0
        L_0x00b7:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            te3.wj0 r15 = r0.f29266t
            r30 = r9
            long r8 = r15.f144074f
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r11.<init>(r14, r8)
            r5[r13] = r11
            java.util.List r5 = sx3.C64197v.m75539h(r5)
            te3.wj0 r8 = r0.f29266t
            java.util.LinkedList<te3.do1> r8 = r8.f144080o
            java.lang.String r9 = "request.mark_unread_object_list"
            gy3.C87412m.m108593f(r8, r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r11 = 10
            int r14 = sx3.C36907w.m41090l(r8, r11)
            r9.<init>(r14)
            java.util.Iterator r8 = r8.iterator()
        L_0x00e6:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x010d
            java.lang.Object r14 = r8.next()
            te3.do1 r14 = (te3.C49173do1) r14
            rx3.l r15 = new rx3.l
            if (r1 == 0) goto L_0x00f9
            int r10 = r1.f134675i
            goto L_0x00fa
        L_0x00f9:
            r10 = 0
        L_0x00fa:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            long r13 = r14.f132446d
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r15.<init>(r10, r13)
            r9.add(r15)
            r10 = 1
            r13 = 0
            goto L_0x00e6
        L_0x010d:
            r5.addAll(r9)
            je1.h2 r1 = je1.C46523h2.f125330a
            te3.wj0 r8 = r0.f29266t
            te3.ig0 r8 = r8.f144072d
            r9 = 0
            r1.mo71865g(r8, r5, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = "[INIT] tabType="
            r1.append(r8)
            r1.append(r6)
            java.lang.String r6 = " listen_event_type="
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = " lastStreamBuffer="
            r1.append(r6)
            if (r3 == 0) goto L_0x0138
            r10 = 1
            goto L_0x0139
        L_0x0138:
            r10 = 0
        L_0x0139:
            r1.append(r10)
            java.lang.String r3 = " object_id="
            r1.append(r3)
            long r2 = r2.f164794id
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            r1.append(r2)
            java.lang.String r2 = " statsList="
            r1.append(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = sx3.C36907w.m41090l(r4, r11)
            r2.<init>(r3)
            java.util.Iterator r3 = r29.iterator()
        L_0x015c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0172
            java.lang.Object r4 = r3.next()
            te3.db4 r4 = (te3.db4) r4
            long r6 = r4.f182676d
            java.lang.String r4 = o40.C61926c.m72691p(r6)
            r2.add(r4)
            goto L_0x015c
        L_0x0172:
            r1.append(r2)
            java.lang.String r2 = " unreadFeedList="
            r1.append(r2)
            java.util.List<te3.do1> r2 = r0.f29265s
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = sx3.C36907w.m41090l(r2, r11)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x0189:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x019f
            java.lang.Object r4 = r2.next()
            te3.do1 r4 = (te3.C49173do1) r4
            long r6 = r4.f132446d
            java.lang.String r4 = o40.C61926c.m72691p(r6)
            r3.add(r4)
            goto L_0x0189
        L_0x019f:
            r1.append(r3)
            java.lang.String r2 = " objBaseInfoList=["
            r1.append(r2)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            je1.s$a r22 = je1.C9372s.C9373a.f29267d
            r23 = 31
            r24 = 0
            r16 = r5
            java.lang.String r2 = sx3.C110818d0.m150921S(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1.append(r2)
            r2 = 93
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            ob0.c$b r1 = new ob0.c$b
            r1.<init>()
            te3.wj0 r2 = r0.f29266t
            r1.f127066a = r2
            te3.xj0 r2 = new te3.xj0
            r2.<init>()
            te3.ja r3 = new te3.ja
            r3.<init>()
            r2.setBaseResponse(r3)
            te3.ja r3 = r2.getBaseResponse()
            te3.rv3 r4 = new te3.rv3
            r4.<init>()
            r3.f135956e = r4
            r1.f127067b = r2
            java.lang.String r2 = "/cgi-bin/micromsg-bin/finderenhance"
            r1.f127068c = r2
            r1.f127069d = r12
            ob0.c r1 = r1.mo72403a()
            r0.mo123453j(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C9372s.<init>(te3.hj1, com.tencent.mm.protocal.protobuf.FinderObject, pe3.b, java.util.List, java.util.List, int, int, int):void");
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C51981xj0 xj02 = (C51981xj0) eu32;
        C87412m.m108594g(xj02, "resp");
        super.mo332r(i, i2, str, xj02, yVar);
        StringBuilder sb = new StringBuilder();
        sb.append("[onCgiBack] errType=");
        sb.append(i);
        sb.append(" errCode=");
        sb.append(i2);
        sb.append(" errMsg=");
        sb.append(str);
        sb.append(' ');
        LinkedList<FinderObject> linkedList = xj02.f144695d;
        C87412m.m108593f(linkedList, "resp.`object`");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (FinderObject finderObject : linkedList) {
            arrayList.add(C61926c.m72691p(finderObject.f164794id));
        }
        sb.append(arrayList);
        Log.m105924i("Cgi.FinderEnhanceStream", sb.toString());
    }

    /* renamed from: s */
    public List mo10027s(C49335eu3 eu32) {
        C51981xj0 xj02 = (C51981xj0) eu32;
        C87412m.m108594g(xj02, "resp");
        LinkedList<FinderObject> linkedList = xj02.f144695d;
        C87412m.m108593f(linkedList, "resp.`object`");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (FinderObject finderObject : linkedList) {
            FinderItem.C56324a aVar = FinderItem.Companion;
            C87412m.m108593f(finderObject, LocaleUtil.ITALIAN);
            arrayList.add(aVar.mo79056a(finderObject, 0));
        }
        return arrayList;
    }

    /* renamed from: t */
    public long mo10028t() {
        C49842ig0 ig02 = this.f29266t.f144072d;
        if (ig02 != null) {
            return ig02.f135317i;
        }
        return 0;
    }
}
