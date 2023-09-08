package p267x;

import a14.C0000n0;
import androidx.compose.foundation.lazy.layout.C103598t;
import fy3.C32227p;
import p175j0.C60690y0;
import p463c0.C104193e;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.FocusableKt$focusable$2$5$1", mo125469f = "Focusable.kt", mo125470l = {144}, mo125471m = "invokeSuspend")
/* renamed from: x.k0 */
public final class C111924k0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f335056d;

    /* renamed from: e */
    public int f335057e;

    /* renamed from: f */
    public final /* synthetic */ C104193e f335058f;

    /* renamed from: g */
    public final /* synthetic */ C60690y0<C103598t> f335059g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111924k0(C104193e eVar, C60690y0<C103598t> y0Var, C15601d<? super C111924k0> dVar) {
        super(2, dVar);
        this.f335058f = eVar;
        this.f335059g = y0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C111924k0(this.f335058f, this.f335059g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111924k0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: androidx.compose.foundation.lazy.layout.t$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r4.f335057e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            java.lang.Object r0 = r4.f335056d
            r3 = r0
            androidx.compose.foundation.lazy.layout.t$a r3 = (androidx.compose.foundation.lazy.layout.C103598t.C103599a) r3
            kotlin.ResultKt.throwOnFailure(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x003c
        L_0x0013:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x001b:
            kotlin.ResultKt.throwOnFailure(r5)
            j0.y0<androidx.compose.foundation.lazy.layout.t> r5 = r4.f335059g     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x0048 }
            androidx.compose.foundation.lazy.layout.t r5 = (androidx.compose.foundation.lazy.layout.C103598t) r5     // Catch:{ all -> 0x0048 }
            if (r5 == 0) goto L_0x002d
            androidx.compose.foundation.lazy.layout.t$a r5 = r5.mo144577b()     // Catch:{ all -> 0x0048 }
            goto L_0x002e
        L_0x002d:
            r5 = r3
        L_0x002e:
            c0.e r1 = r4.f335058f     // Catch:{ all -> 0x0044 }
            r4.f335056d = r5     // Catch:{ all -> 0x0044 }
            r4.f335057e = r2     // Catch:{ all -> 0x0044 }
            java.lang.Object r1 = r1.mo145810a(r3, r4)     // Catch:{ all -> 0x0044 }
            if (r1 != r0) goto L_0x003b
            return r0
        L_0x003b:
            r3 = r5
        L_0x003c:
            if (r3 == 0) goto L_0x0041
            r3.mo144578a()
        L_0x0041:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        L_0x0044:
            r0 = move-exception
            r3 = r5
            r5 = r0
            goto L_0x0049
        L_0x0048:
            r5 = move-exception
        L_0x0049:
            if (r3 == 0) goto L_0x004e
            r3.mo144578a()
        L_0x004e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p267x.C111924k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
