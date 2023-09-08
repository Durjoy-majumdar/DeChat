package wf1;

import a14.C0000n0;
import bi1.C0287e;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.uic.FinderLiveGiftPkgUIC$makeOrder$$inlined$fail$default$1", mo125469f = "FinderLiveGiftPkgUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: wf1.u */
public final class C15241u extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C0287e f41463d;

    /* renamed from: e */
    public final /* synthetic */ C15193l f41464e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15241u(C0287e eVar, C15601d dVar, C15193l lVar) {
        super(2, dVar);
        this.f41463d = eVar;
        this.f41464e = lVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15241u(this.f41463d, dVar, this.f41464e);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15241u) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [te3.eu3] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001e, code lost:
        r2 = r2.f35060h;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.ResultKt.throwOnFailure(r5)
            bi1.e r5 = r4.f41463d
            bi1.b r5 = (bi1.C0281b) r5
            T r5 = r5.f843b
            bi1.a r5 = (bi1.C0280a) r5
            wf1.l r0 = r4.f41464e
            java.lang.String r0 = r0.f41381d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[FinderMakePackageOrderRequest] failed, pb = "
            r1.append(r2)
            q40.d r2 = r5.f841a
            r3 = 0
            if (r2 == 0) goto L_0x0027
            te3.eu3 r2 = r2.f35060h
            if (r2 == 0) goto L_0x0027
            org.json.JSONObject r2 = o40.C61937h.m72709h(r2)
            goto L_0x0028
        L_0x0027:
            r2 = r3
        L_0x0028:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            q40.d r0 = r5.f841a
            if (r0 == 0) goto L_0x0057
            te3.eu3 r1 = r0.f35060h
            boolean r2 = r1 instanceof te3.C51084rb1
            if (r2 == 0) goto L_0x003f
            r3 = r1
            te3.rb1 r3 = (te3.C51084rb1) r3
        L_0x003f:
            if (r3 == 0) goto L_0x0057
            te3.ay0 r1 = r3.f140806f
            if (r1 == 0) goto L_0x0057
            ot1.a r2 = ot1.C11767a.f34453a
            gy3.C87412m.m108591d(r0)
            int r0 = r0.f35057e
            q40.d r5 = r5.f841a
            gy3.C87412m.m108591d(r5)
            int r5 = r5.f35058f
            r2.mo11665g(r0, r5, r1)
            goto L_0x0061
        L_0x0057:
            wf1.y r5 = new wf1.y
            wf1.l r0 = r4.f41464e
            r5.<init>(r0)
            o40.C61926c.m72668M(r5)
        L_0x0061:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wf1.C15241u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
