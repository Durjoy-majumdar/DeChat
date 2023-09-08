package fh1;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.GestureEffectPagController$enterGiftMode$1", mo125469f = "GestureEffectPagController.kt", mo125470l = {558, 572, 574}, mo125471m = "invokeSuspend")
/* renamed from: fh1.q */
public final class C8078q extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f26859d;

    /* renamed from: e */
    public int f26860e;

    /* renamed from: f */
    public long f26861f;

    /* renamed from: g */
    public long f26862g;

    /* renamed from: h */
    public Object f26863h;

    /* renamed from: i */
    public Object f26864i;

    /* renamed from: j */
    public Object f26865j;

    /* renamed from: n */
    public int f26866n;

    /* renamed from: o */
    public final /* synthetic */ C8070p f26867o;

    /* renamed from: p */
    public final /* synthetic */ String f26868p;

    /* renamed from: q */
    public final /* synthetic */ long f26869q;

    /* renamed from: r */
    public final /* synthetic */ int f26870r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8078q(C8070p pVar, String str, long j, int i, C15601d<? super C8078q> dVar) {
        super(2, dVar);
        this.f26867o = pVar;
        this.f26868p = str;
        this.f26869q = j;
        this.f26870r = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C8078q(this.f26867o, this.f26868p, this.f26869q, this.f26870r, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C8078q) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0128 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f26866n
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r5) goto L_0x002f
            if (r2 == r4) goto L_0x0022
            if (r2 != r3) goto L_0x001a
            java.lang.Object r1 = r0.f26863h
            fh1.p r1 = (fh1.C8070p) r1
            kotlin.ResultKt.throwOnFailure(r17)
            goto L_0x012a
        L_0x001a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0022:
            long r4 = r0.f26862g
            long r6 = r0.f26861f
            java.lang.Object r2 = r0.f26863h
            fh1.p r2 = (fh1.C8070p) r2
            kotlin.ResultKt.throwOnFailure(r17)
            goto L_0x0112
        L_0x002f:
            long r5 = r0.f26862g
            int r2 = r0.f26860e
            long r7 = r0.f26861f
            int r9 = r0.f26859d
            java.lang.Object r10 = r0.f26865j
            te3.bz0 r10 = (te3.C48928bz0) r10
            java.lang.Object r11 = r0.f26864i
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.f26863h
            fh1.p r12 = (fh1.C8070p) r12
            kotlin.ResultKt.throwOnFailure(r17)
            r13 = r5
            r6 = r7
            r5 = r17
            goto L_0x00a2
        L_0x004b:
            kotlin.ResultKt.throwOnFailure(r17)
            fh1.p r2 = r0.f26867o
            java.lang.String r2 = r2.f26840s
            java.lang.String r6 = r0.f26868p
            boolean r2 = gy3.C87412m.m108589b(r2, r6)
            r9 = r2 ^ 1
            if (r9 == 0) goto L_0x0065
            long r6 = r0.f26869q
            r10 = 3000(0xbb8, double:1.482E-320)
            long r6 = java.lang.Math.min(r6, r10)
            goto L_0x0067
        L_0x0065:
            r6 = 0
        L_0x0067:
            fh1.p r2 = r0.f26867o
            java.lang.Class<fh1.g> r8 = fh1.C8044g.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r2 = r2.controller(r8)
            fh1.g r2 = (fh1.C8044g) r2
            if (r2 != 0) goto L_0x0074
            goto L_0x0077
        L_0x0074:
            r2.mo9135m3(r5)
        L_0x0077:
            xh1.d r2 = xh1.C15685d.f42379a
            int r8 = r0.f26870r
            te3.bz0 r10 = r2.mo14430a(r8)
            if (r10 == 0) goto L_0x012d
            int r2 = r0.f26870r
            fh1.p r12 = r0.f26867o
            java.lang.String r11 = r0.f26868p
            long r13 = r0.f26869q
            xh1.a r8 = xh1.C23087a.f66318a
            r0.f26863h = r12
            r0.f26864i = r11
            r0.f26865j = r10
            r0.f26859d = r9
            r0.f26861f = r6
            r0.f26860e = r2
            r0.f26862g = r13
            r0.f26866n = r5
            java.lang.Object r5 = r8.mo36499f(r10, r0)
            if (r5 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            xh1.a$d r5 = (xh1.C23087a.C15679d) r5
            if (r5 == 0) goto L_0x012d
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.lang.Integer r15 = new java.lang.Integer
            r15.<init>(r4)
            java.lang.String r3 = "features_stage"
            r8.put(r3, r15)
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            java.lang.String r2 = "features_type"
            r8.put(r2, r3)
            java.lang.Class<ak1.o> r2 = ak1.C54108o.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ak1.o r2 = (ak1.C54108o) r2
            java.lang.String r3 = "live_anchor_gesture_features_hint"
            java.lang.String r15 = "view_exp"
            r2.Rx0(r3, r15, r8)
            r2 = 0
            if (r9 == 0) goto L_0x00f8
            android.widget.TextView r3 = r12.f26837p
            if (r3 != 0) goto L_0x00d7
            goto L_0x00e2
        L_0x00d7:
            te3.c51 r8 = r10.f131407o
            if (r8 == 0) goto L_0x00de
            java.lang.String r8 = r8.f131525j
            goto L_0x00df
        L_0x00de:
            r8 = r2
        L_0x00df:
            r3.setText(r8)
        L_0x00e2:
            android.widget.ImageView r3 = r12.f26836o
            if (r3 == 0) goto L_0x00ef
            java.lang.String r5 = r5.f42371a
            android.graphics.Bitmap r5 = com.tencent.p014mm.graphics.MMBitmapFactory.m98734c(r5)
            r3.setImageBitmap(r5)
        L_0x00ef:
            android.widget.LinearLayout r3 = r12.f26835n
            if (r3 != 0) goto L_0x00f4
            goto L_0x00f8
        L_0x00f4:
            r5 = 0
            r3.setVisibility(r5)
        L_0x00f8:
            r12.getClass()
            r12.f26840s = r11
            r0.f26863h = r12
            r0.f26864i = r2
            r0.f26865j = r2
            r0.f26861f = r6
            r0.f26862g = r13
            r0.f26866n = r4
            java.lang.Object r2 = a14.C53965x0.m60607b(r6, r0)
            if (r2 != r1) goto L_0x0110
            return r1
        L_0x0110:
            r2 = r12
            r4 = r13
        L_0x0112:
            android.widget.LinearLayout r3 = r2.f26835n
            if (r3 != 0) goto L_0x0117
            goto L_0x011c
        L_0x0117:
            r8 = 8
            r3.setVisibility(r8)
        L_0x011c:
            long r4 = r4 - r6
            r0.f26863h = r2
            r3 = 3
            r0.f26866n = r3
            java.lang.Object r3 = a14.C53965x0.m60607b(r4, r0)
            if (r3 != r1) goto L_0x0129
            return r1
        L_0x0129:
            r1 = r2
        L_0x012a:
            r1.mo9156G3()
        L_0x012d:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C8078q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
