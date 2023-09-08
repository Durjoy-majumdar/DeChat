package p165hr;

import a14.C0000n0;
import android.content.Context;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import fy3.C32227p;
import ns3.C11269h;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.feature.finder.live.FinderLiveFeatureService$circulationFillingActivityIconInner$2", mo125469f = "FinderLiveFeatureService.kt", mo125470l = {1001, 1002}, mo125471m = "invokeSuspend")
/* renamed from: hr.x */
public final class C8727x extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f27983d;

    /* renamed from: e */
    public Object f27984e;

    /* renamed from: f */
    public int f27985f;

    /* renamed from: g */
    public /* synthetic */ Object f27986g;

    /* renamed from: h */
    public final /* synthetic */ long f27987h;

    /* renamed from: i */
    public final /* synthetic */ C60106t f27988i;

    /* renamed from: j */
    public final /* synthetic */ Context f27989j;

    /* renamed from: n */
    public final /* synthetic */ String f27990n;

    /* renamed from: o */
    public final /* synthetic */ ImageView f27991o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8727x(long j, C60106t tVar, Context context, String str, ImageView imageView, C15601d<? super C8727x> dVar) {
        super(2, dVar);
        this.f27987h = j;
        this.f27988i = tVar;
        this.f27989j = context;
        this.f27990n = str;
        this.f27991o = imageView;
    }

    /* renamed from: f */
    public static final void m8552f(ImageView imageView, int i) {
        int i2 = C11269h.f33201a;
        int i3 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : C0966R.C0969drawable.bpb : C0966R.C0969drawable.bpa : C0966R.C0969drawable.bp_ : C0966R.C0969drawable.bp9 : C0966R.C0969drawable.bp8;
        if (i3 == 0) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setImageResource(i3);
        imageView.setVisibility(0);
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C8727x xVar = new C8727x(this.f27987h, this.f27988i, this.f27989j, this.f27990n, this.f27991o, dVar);
        xVar.f27986g = obj;
        return xVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C8727x) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f27985f
            java.lang.String r3 = " second(s)"
            r4 = 2
            r5 = 1
            java.lang.String r6 = "#circulationFillingActivityIconInner feedId="
            java.lang.String r7 = "MicroMsg.FinderLiveFeatureService"
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            java.lang.Object r2 = r0.f27984e
            gy3.d0 r2 = (gy3.C8478d0) r2
            java.lang.Object r8 = r0.f27983d
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.f27986g
            a14.n0 r9 = (a14.C0000n0) r9
            kotlin.ResultKt.throwOnFailure(r26)
            r10 = r0
            r0 = r26
            r24 = r9
            r9 = r2
            r2 = r24
            goto L_0x017e
        L_0x002d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0035:
            java.lang.Object r2 = r0.f27984e
            gy3.d0 r2 = (gy3.C8478d0) r2
            java.lang.Object r8 = r0.f27983d
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.f27986g
            a14.n0 r9 = (a14.C0000n0) r9
            kotlin.ResultKt.throwOnFailure(r26)
            r10 = r0
            goto L_0x00f9
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r26)
            java.lang.Object r2 = r0.f27986g
            a14.n0 r2 = (a14.C0000n0) r2
            long r8 = r0.f27987h
            java.lang.String r8 = o40.C61926c.m72691p(r8)
            hr.t r9 = r0.f27988i
            java.util.LinkedHashMap<java.lang.Long, java.lang.Integer> r9 = r9.f171525y
            long r10 = r0.f27987h
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r10)
            java.lang.Object r9 = r9.get(r12)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L_0x0087
            android.widget.ImageView r10 = r0.f27991o
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            r11.append(r8)
            java.lang.String r12 = " cache match: type=it"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
            int r9 = r9.intValue()
            m8552f(r10, r9)
        L_0x0087:
            gy3.d0 r9 = new gy3.d0
            r9.<init>()
            r9.f27483d = r5
            r10 = r0
        L_0x008f:
            boolean r11 = a14.C53930o0.m60560g(r2)
            if (r11 == 0) goto L_0x0221
            int r11 = r9.f27483d
            if (r11 > 0) goto L_0x00bc
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            r11.append(r8)
            java.lang.String r12 = " delayValue="
            r11.append(r12)
            int r12 = r9.f27483d
            r11.append(r12)
            java.lang.String r12 = " return"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
            r11 = 0
            goto L_0x00bd
        L_0x00bc:
            r11 = 1
        L_0x00bd:
            if (r11 == 0) goto L_0x0221
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            r11.append(r8)
            java.lang.String r12 = " ready to delay: "
            r11.append(r12)
            int r12 = r9.f27483d
            r11.append(r12)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
            int r11 = r9.f27483d
            long r11 = (long) r11
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r13
            r10.f27986g = r2
            r10.f27983d = r8
            r10.f27984e = r9
            r10.f27985f = r5
            java.lang.Object r11 = a14.C53965x0.m60607b(r11, r10)
            if (r11 != r1) goto L_0x00f4
            return r1
        L_0x00f4:
            r24 = r9
            r9 = r2
            r2 = r24
        L_0x00f9:
            hr.t r11 = r10.f27988i
            android.content.Context r12 = r10.f27989j
            long r13 = r10.f27987h
            java.lang.String r15 = r10.f27990n
            r10.f27986g = r9
            r10.f27983d = r8
            r10.f27984e = r2
            r10.f27985f = r4
            r11.getClass()
            wx3.h r11 = new wx3.h
            wx3.d r4 = xx3.C66447b.m78392b(r10)
            r11.<init>(r4)
            java.lang.String r4 = o40.C61926c.m72691p(r13)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "#requestAndRefreshActivityIcon feedId="
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = " nonceId="
            r5.append(r0)
            r5.append(r15)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            rx3.l r5 = new rx3.l
            r26 = r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r13)
            r5.<init>(r2, r15)
            r0.add(r5)
            r18 = 5
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 28
            r23 = 0
            je1.l r2 = new je1.l
            r16 = r2
            r17 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            nr3.e r0 = r2.mo9225i()
            hr.b0 r2 = new hr.b0
            r2.<init>(r4, r11)
            lp3.c r0 = o40.C61926c.m72665J(r0, r2)
            boolean r2 = r12 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r2 == 0) goto L_0x0174
            jp3.b r12 = (jp3.C9487b) r12
            r0.mo11397F(r12)
        L_0x0174:
            java.lang.Object r0 = r11.mo90314b()
            if (r0 != r1) goto L_0x017b
            return r1
        L_0x017b:
            r2 = r9
            r9 = r26
        L_0x017e:
            hr.t$a r0 = (p165hr.C60106t.C8714a) r0
            int r4 = r0.f27946a
            r9.f27483d = r4
            boolean r4 = a14.C53930o0.m60560g(r2)
            if (r4 == 0) goto L_0x0191
            android.widget.ImageView r4 = r10.f27991o
            int r5 = r0.f27947b
            m8552f(r4, r5)
        L_0x0191:
            hr.t r4 = r10.f27988i
            java.util.LinkedHashMap<java.lang.Long, java.lang.Integer> r4 = r4.f171525y
            long r11 = r10.f27987h
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r11)
            int r0 = r0.f27947b
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r0)
            r4.put(r5, r11)
            hr.t r0 = r10.f27988i
            java.util.LinkedHashMap<java.lang.Long, java.lang.Integer> r0 = r0.f171525y
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01b2:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01fc
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            hr.t r5 = r10.f27988i
            java.util.LinkedHashMap<java.lang.Long, java.lang.Integer> r5 = r5.f171525y
            int r5 = r5.size()
            r11 = 500(0x1f4, float:7.0E-43)
            if (r5 <= r11) goto L_0x01fc
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "#circulationFillingActivityIconInner historiesList.size="
            r12.append(r13)
            r12.append(r5)
            java.lang.String r5 = ", max="
            r12.append(r5)
            r12.append(r11)
            java.lang.String r5 = ". remove "
            r12.append(r5)
            java.lang.Object r4 = r4.getKey()
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            r12.append(r4)
            java.lang.String r4 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            r0.remove()
            goto L_0x01b2
        L_0x01fc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r8)
            java.lang.String r4 = " update delayValue: "
            r0.append(r4)
            int r4 = r9.f27483d
            r0.append(r4)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r0 = r25
            r4 = 2
            r5 = 1
            goto L_0x008f
        L_0x0221:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r8)
            java.lang.String r1 = " end"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p165hr.C8727x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
