package ga0;

import com.tencent.p014mm.mj_template.sns.compose.widget.C28971l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p247u3.C65145q1;
import p247u3.C65164r1;
import pe3.C89349b;
import te3.o74;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: ga0.f */
public final class C59403f extends C65145q1<Integer, C28971l<o74>> {

    /* renamed from: c */
    public final String f169766c;

    /* renamed from: d */
    public final List<String> f169767d = new ArrayList();

    /* renamed from: e */
    public C89349b f169768e;

    @C91590f(mo125468c = "com.tencent.mm.mj_template.compose_widget.model.MusicSearchDataSource", mo125469f = "MusicSearchDataSource.kt", mo125470l = {51}, mo125471m = "load")
    /* renamed from: ga0.f$a */
    public static final class C59404a extends C66704d {

        /* renamed from: d */
        public Object f169769d;

        /* renamed from: e */
        public int f169770e;

        /* renamed from: f */
        public /* synthetic */ Object f169771f;

        /* renamed from: g */
        public final /* synthetic */ C59403f f169772g;

        /* renamed from: h */
        public int f169773h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59404a(C59403f fVar, C15601d<? super C59404a> dVar) {
            super(dVar);
            this.f169772g = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f169771f = obj;
            this.f169773h |= Integer.MIN_VALUE;
            return this.f169772g.mo72456d((C65145q1.C65146a<Integer>) null, this);
        }
    }

    public C59403f(String str) {
        C87412m.m108594g(str, "keyword");
        this.f169766c = str;
    }

    /* renamed from: b */
    public Object mo72455b(C65164r1 r1Var) {
        int i;
        Integer num;
        Integer num2;
        C87412m.m108594g(r1Var, "state");
        Integer num3 = r1Var.f187591b;
        if (num3 == null) {
            return null;
        }
        C65145q1.C65150b.C65152b a = r1Var.mo89319a(num3.intValue());
        if (a != null && (num2 = (Integer) a.f187563b) != null) {
            i = num2.intValue() + 1;
        } else if (a == null || (num = (Integer) a.f187564c) == null) {
            return null;
        } else {
            i = num.intValue() - 1;
        }
        return Integer.valueOf(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo72456d(p247u3.C65145q1.C65146a<java.lang.Integer> r11, wx3.C15601d<? super p247u3.C65145q1.C65150b<java.lang.Integer, com.tencent.p014mm.mj_template.sns.compose.widget.C28971l<te3.o74>>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof ga0.C59403f.C59404a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            ga0.f$a r0 = (ga0.C59403f.C59404a) r0
            int r1 = r0.f169773h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f169773h = r1
            goto L_0x0018
        L_0x0013:
            ga0.f$a r0 = new ga0.f$a
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f169771f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f169773h
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r5) goto L_0x002f
            int r11 = r0.f169770e
            java.lang.Object r0 = r0.f169769d
            ga0.f r0 = (ga0.C59403f) r0
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0065
        L_0x002f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r11 = r11.mo89309a()
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 == 0) goto L_0x0047
            int r11 = r11.intValue()
            goto L_0x0048
        L_0x0047:
            r11 = 0
        L_0x0048:
            java.lang.String r12 = r10.f169766c
            if (r11 != 0) goto L_0x004e
            r2 = r4
            goto L_0x0050
        L_0x004e:
            pe3.b r2 = r10.f169768e
        L_0x0050:
            r0.f169769d = r10
            r0.f169770e = r11
            r0.f169773h = r5
            a14.h0 r6 = a14.C53872d1.f151119c
            ga0.c r7 = new ga0.c
            r7.<init>(r2, r12, r4)
            java.lang.Object r12 = a14.C53895h.m60469g(r6, r7, r0)
            if (r12 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r0 = r10
        L_0x0065:
            te3.s64 r12 = (te3.s64) r12
            java.lang.String r1 = "MicroMsg.MusicSearchDataSource"
            if (r12 != 0) goto L_0x007d
            java.lang.String r11 = "load: cgi error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r11)
            u3.q1$b$a r11 = new u3.q1$b$a
            java.lang.Throwable r12 = new java.lang.Throwable
            java.lang.String r0 = "music search cgi error"
            r12.<init>(r0)
            r11.<init>(r12)
            return r11
        L_0x007d:
            java.util.LinkedList<te3.o74> r2 = r12.f141349d
            java.lang.String r6 = "cgiRet.music_list"
            gy3.C87412m.m108593f(r2, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x008d:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x00af
            java.lang.Object r7 = r2.next()
            r8 = r7
            te3.o74 r8 = (te3.o74) r8
            java.lang.String r8 = r8.f139006d
            if (r8 == 0) goto L_0x00a7
            int r8 = r8.length()
            if (r8 != 0) goto L_0x00a5
            goto L_0x00a7
        L_0x00a5:
            r8 = 0
            goto L_0x00a8
        L_0x00a7:
            r8 = 1
        L_0x00a8:
            r8 = r8 ^ r5
            if (r8 == 0) goto L_0x008d
            r6.add(r7)
            goto L_0x008d
        L_0x00af:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r6.iterator()
        L_0x00b8:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00d6
            java.lang.Object r6 = r3.next()
            r7 = r6
            te3.o74 r7 = (te3.o74) r7
            java.util.List<java.lang.String> r8 = r0.f169767d
            java.lang.String r7 = r7.f139006d
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            boolean r7 = r8.contains(r7)
            r7 = r7 ^ r5
            if (r7 == 0) goto L_0x00b8
            r2.add(r6)
            goto L_0x00b8
        L_0x00d6:
            java.util.List<java.lang.String> r3 = r0.f169767d
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r8 = sx3.C36907w.m41090l(r2, r7)
            r6.<init>(r8)
            java.util.Iterator r8 = r2.iterator()
        L_0x00e7:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00f9
            java.lang.Object r9 = r8.next()
            te3.o74 r9 = (te3.o74) r9
            java.lang.String r9 = r9.f139006d
            r6.add(r9)
            goto L_0x00e7
        L_0x00f9:
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.addAll(r6)
            pe3.b r3 = r12.f141351f
            r0.f169768e = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "load: loadKey "
            r0.append(r3)
            r0.append(r11)
            java.lang.String r3 = " cgiListSize "
            r0.append(r3)
            java.util.LinkedList<te3.o74> r3 = r12.f141349d
            int r3 = r3.size()
            r0.append(r3)
            java.lang.String r3 = ", filtered size "
            r0.append(r3)
            int r3 = r2.size()
            r0.append(r3)
            java.lang.String r3 = ", hasNext "
            r0.append(r3)
            boolean r3 = r12.f141350e
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = sx3.C36907w.m41090l(r2, r7)
            r0.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        L_0x0147:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0163
            java.lang.Object r2 = r1.next()
            te3.o74 r2 = (te3.o74) r2
            com.tencent.mm.mj_template.sns.compose.widget.l r3 = new com.tencent.mm.mj_template.sns.compose.widget.l
            java.lang.String r6 = "it"
            gy3.C87412m.m108593f(r2, r6)
            r6 = 0
            r3.<init>(r2, r6)
            r0.add(r3)
            goto L_0x0147
        L_0x0163:
            boolean r12 = r12.f141350e
            if (r12 == 0) goto L_0x016e
            int r11 = r11 + r5
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            goto L_0x016f
        L_0x016e:
            r12 = r4
        L_0x016f:
            u3.q1$b$b r11 = new u3.q1$b$b
            r11.<init>(r0, r4, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ga0.C59403f.mo72456d(u3.q1$a, wx3.d):java.lang.Object");
    }
}
