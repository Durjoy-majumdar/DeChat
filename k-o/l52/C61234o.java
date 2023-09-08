package l52;

import a14.C0000n0;
import com.tencent.p014mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView;
import fy3.C32227p;
import o52.C61945f;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.magicbrush.scldemo.component.MagicBrushSclListDemoUIC$MagicItem$1$2$1", mo125469f = "MagicBrushSclListDemoUIC.kt", mo125470l = {133, 134, 135}, mo125471m = "invokeSuspend")
/* renamed from: l52.o */
public final class C61234o extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f174292d;

    /* renamed from: e */
    public final /* synthetic */ C109271t f174293e;

    /* renamed from: f */
    public final /* synthetic */ MagicBrushSclDemoView f174294f;

    /* renamed from: g */
    public final /* synthetic */ C61945f f174295g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61234o(C109271t tVar, MagicBrushSclDemoView magicBrushSclDemoView, C61945f fVar, C15601d<? super C61234o> dVar) {
        super(2, dVar);
        this.f174293e = tVar;
        this.f174294f = magicBrushSclDemoView;
        this.f174295g = fVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61234o(this.f174293e, this.f174294f, this.f174295g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61234o) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f174292d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 == r4) goto L_0x001f
            if (r1 == r3) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0063
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x001b:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0052
        L_0x001f:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0043
        L_0x0023:
            kotlin.ResultKt.throwOnFailure(r6)
            l52.t r6 = r5.f174293e
            o52.e r6 = r6.f327143d
            com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView r1 = r5.f174294f
            r5.f174292d = r4
            d14.t0<java.lang.Object> r6 = r6.f176075d
            o52.c r4 = new o52.c
            r4.<init>(r1)
            d14.z0 r6 = (d14.C58100z0) r6
            java.lang.Object r6 = r6.emit(r4, r5)
            if (r6 != r0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            rx3.b0 r6 = rx3.C13598b0.f38549a
        L_0x0040:
            if (r6 != r0) goto L_0x0043
            return r0
        L_0x0043:
            l52.t r6 = r5.f174293e
            o52.e r6 = r6.f327143d
            com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView r1 = r5.f174294f
            r5.f174292d = r3
            java.lang.Object r6 = r6.mo86857c3(r1, r5)
            if (r6 != r0) goto L_0x0052
            return r0
        L_0x0052:
            l52.t r6 = r5.f174293e
            o52.e r6 = r6.f327143d
            o52.f r1 = r5.f174295g
            java.lang.String r1 = r1.f176078b
            r5.f174292d = r2
            java.lang.Object r6 = r6.mo86859e3(r1, r5)
            if (r6 != r0) goto L_0x0063
            return r0
        L_0x0063:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l52.C61234o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
