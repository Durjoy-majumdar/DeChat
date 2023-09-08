package xe1;

import a14.C0000n0;
import android.graphics.Bitmap;
import fy3.C32227p;
import java.util.List;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.core.WatermarkDetCore$detect$2", mo125469f = "WatermarkDetCore.kt", mo125470l = {56}, mo125471m = "invokeSuspend")
/* renamed from: xe1.a */
public final class C38488a extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

    /* renamed from: d */
    public int f101494d;

    /* renamed from: e */
    public Object f101495e;

    /* renamed from: f */
    public Object f101496f;

    /* renamed from: g */
    public Object f101497g;

    /* renamed from: h */
    public Object f101498h;

    /* renamed from: i */
    public int f101499i;

    /* renamed from: j */
    public final /* synthetic */ List<Bitmap> f101500j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38488a(List<Bitmap> list, C15601d<? super C38488a> dVar) {
        super(2, dVar);
        this.f101500j = list;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C38488a(this.f101500j, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C38488a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r13.f101499i
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r3) goto L_0x0028
            int r1 = r13.f101494d
            java.lang.Object r4 = r13.f101498h
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r13.f101497g
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r13.f101496f
            gy3.d0 r6 = (gy3.C8478d0) r6
            java.lang.Object r7 = r13.f101495e
            gy3.d0 r7 = (gy3.C8478d0) r7
            kotlin.ResultKt.throwOnFailure(r14)
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r13
            goto L_0x0088
        L_0x0028:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r14)
            java.util.List<android.graphics.Bitmap> r14 = r13.f101500j
            boolean r14 = r14.isEmpty()
            r14 = r14 ^ r3
            if (r14 == 0) goto L_0x00d0
            gy3.d0 r14 = new gy3.d0
            r14.<init>()
            gy3.d0 r1 = new gy3.d0
            r1.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List<android.graphics.Bitmap> r5 = r13.f101500j
            java.util.Iterator r5 = r5.iterator()
            r7 = r14
            r6 = r1
            r1 = 0
            r14 = r13
            r12 = r5
            r5 = r4
            r4 = r12
        L_0x0058:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x00b3
            java.lang.Object r8 = r4.next()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            r14.f101495e = r7
            r14.f101496f = r6
            r14.f101497g = r5
            r14.f101498h = r4
            r14.f101494d = r1
            r14.f101499i = r3
            au3.a r9 = au3.C54328a.f152462f
            xe1.b r10 = new xe1.b
            r11 = 0
            r10.<init>(r8, r11)
            java.lang.Object r8 = a14.C53895h.m60469g(r9, r10, r14)
            if (r8 != r0) goto L_0x007f
            return r0
        L_0x007f:
            r12 = r0
            r0 = r14
            r14 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r12
        L_0x0088:
            rx3.l r14 = (rx3.C13604l) r14
            A r9 = r14.f38555d
            r6.add(r9)
            B r9 = r14.f38556e
            rx3.l r9 = (rx3.C13604l) r9
            A r9 = r9.f38555d
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r8.f27483d = r9
            B r14 = r14.f38556e
            rx3.l r14 = (rx3.C13604l) r14
            B r14 = r14.f38556e
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            r7.f27483d = r14
            r14 = r0
            r0 = r1
            r1 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            goto L_0x0058
        L_0x00b3:
            boolean r14 = r5.isEmpty()
            r14 = r14 ^ r3
            if (r14 == 0) goto L_0x00d1
            int r14 = r7.f27483d
            if (r14 <= 0) goto L_0x00d1
            int r0 = r6.f27483d
            if (r0 <= 0) goto L_0x00d1
            long r6 = xe1.C66248c.f190306b
            long r0 = com.tencent.p014mm.xeffect.WeWatermarkDet.nApplyWatermarkDet(r6, r5, r14, r0)
            r4 = 1
            int r14 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r14 != 0) goto L_0x00d0
            r1 = 1
            goto L_0x00d1
        L_0x00d0:
            r1 = 0
        L_0x00d1:
            if (r1 == 0) goto L_0x00d4
            r2 = 1
        L_0x00d4:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r2)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: xe1.C38488a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
