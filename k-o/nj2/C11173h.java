package nj2;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.PluginRingtone$Companion$setRingtoneSelf$2$1", mo125469f = "PluginRingtone.kt", mo125470l = {282}, mo125471m = "invokeSuspend")
/* renamed from: nj2.h */
public final class C11173h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f32969d;

    /* renamed from: e */
    public Object f32970e;

    /* renamed from: f */
    public int f32971f;

    /* renamed from: g */
    public /* synthetic */ Object f32972g;

    /* renamed from: h */
    public final /* synthetic */ C15601d<Boolean> f32973h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11173h(C15601d<? super Boolean> dVar, C15601d<? super C11173h> dVar2) {
        super(2, dVar2);
        this.f32973h = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C11173h hVar = new C11173h(this.f32973h, dVar);
        hVar.f32972g = obj;
        return hVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C11173h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r10.f32971f
            r2 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            java.lang.Object r0 = r10.f32970e
            wx3.d r0 = (wx3.C15601d) r0
            java.lang.Object r1 = r10.f32969d
            wj2.f r1 = (wj2.C66132f) r1
            java.lang.Object r2 = r10.f32972g
            a14.n0 r2 = (a14.C0000n0) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0054
        L_0x0019:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0021:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.f32972g
            a14.n0 r11 = (a14.C0000n0) r11
            androidx.lifecycle.z<wj2.f> r1 = nj2.C61767o.f175578d
            java.lang.Object r1 = r1.getValue()
            wj2.f r1 = (wj2.C66132f) r1
            if (r1 == 0) goto L_0x0066
            wx3.d<java.lang.Boolean> r9 = r10.f32973h
            nj2.g$a r3 = nj2.C61759g.f175551f
            r10.f32972g = r11
            r10.f32969d = r1
            r10.f32970e = r9
            r10.f32971f = r2
            java.lang.String r5 = eb0.C75592q0.m90789s()
            java.lang.String r11 = "getUsernameFromUserInfo()"
            gy3.C87412m.m108593f(r5, r11)
            r6 = 0
            java.lang.String r7 = ""
            r4 = r1
            r8 = r10
            java.lang.Object r11 = r3.mo86682f(r4, r5, r6, r7, r8)
            if (r11 != r0) goto L_0x0053
            return r0
        L_0x0053:
            r0 = r9
        L_0x0054:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            java.lang.Object r11 = kotlin.Result.m168114constructorimpl(r11)
            r0.resumeWith(r11)
            goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            if (r1 != 0) goto L_0x0076
            wx3.d<java.lang.Boolean> r11 = r10.f32973h
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
            r11.resumeWith(r0)
        L_0x0076:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nj2.C11173h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
