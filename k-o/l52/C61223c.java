package l52;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.magicbrush.scldemo.component.MagicBrushSclDemoUIC$init$1$1", mo125469f = "MagicBrushSclDemoUIC.kt", mo125470l = {72, 73, 74}, mo125471m = "invokeSuspend")
/* renamed from: l52.c */
public final class C61223c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f174273d;

    /* renamed from: e */
    public final /* synthetic */ C61224d f174274e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61223c(C61224d dVar, C15601d<? super C61223c> dVar2) {
        super(2, dVar2);
        this.f174274e = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61223c(this.f174274e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61223c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f174273d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 == r4) goto L_0x001f
            if (r1 == r3) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0079
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x001b:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x005a
        L_0x001f:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0037
        L_0x0023:
            kotlin.ResultKt.throwOnFailure(r6)
            l52.d r6 = r5.f174274e
            o52.e r6 = r6.f174276e
            r5.f174273d = r4
            java.lang.String r1 = "frames"
            java.lang.String r4 = ""
            java.lang.Object r6 = r6.mo86858d3(r1, r4, r5)
            if (r6 != r0) goto L_0x0037
            return r0
        L_0x0037:
            l52.d r6 = r5.f174274e
            o52.e r1 = r6.f174276e
            bl3.r r4 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r6 = r6.getActivity()
            bl3.r$a r6 = r4.mo62444c(r6)
            java.lang.Class<l52.b> r4 = l52.C10463b.class
            androidx.lifecycle.i0 r6 = r6.mo75002a(r4)
            l52.b r6 = (l52.C10463b) r6
            java.lang.String r6 = r6.mo10776c3()
            r5.f174273d = r3
            java.lang.Object r6 = r1.mo86859e3(r6, r5)
            if (r6 != r0) goto L_0x005a
            return r0
        L_0x005a:
            l52.d r6 = r5.f174274e
            o52.e r1 = r6.f174276e
            com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView r6 = r6.f174275d
            if (r6 == 0) goto L_0x007c
            r5.f174273d = r2
            d14.t0<java.lang.Object> r1 = r1.f176075d
            o52.c r2 = new o52.c
            r2.<init>(r6)
            d14.z0 r1 = (d14.C58100z0) r1
            java.lang.Object r6 = r1.emit(r2, r5)
            if (r6 != r0) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            rx3.b0 r6 = rx3.C13598b0.f38549a
        L_0x0076:
            if (r6 != r0) goto L_0x0079
            return r0
        L_0x0079:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        L_0x007c:
            java.lang.String r6 = "frameSetView"
            gy3.C87412m.m108603p(r6)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l52.C61223c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
