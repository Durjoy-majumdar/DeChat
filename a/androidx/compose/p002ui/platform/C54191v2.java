package androidx.compose.p002ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import c14.C54625h;
import d14.C45253g;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", mo125469f = "WindowRecomposer.android.kt", mo125470l = {116, 122}, mo125471m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.v2 */
public final class C54191v2 extends C91594j implements C32227p<C45253g<? super Float>, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f152143d;

    /* renamed from: e */
    public int f152144e;

    /* renamed from: f */
    public /* synthetic */ Object f152145f;

    /* renamed from: g */
    public final /* synthetic */ ContentResolver f152146g;

    /* renamed from: h */
    public final /* synthetic */ Uri f152147h;

    /* renamed from: i */
    public final /* synthetic */ C54193w2 f152148i;

    /* renamed from: j */
    public final /* synthetic */ C54625h<C13598b0> f152149j;

    /* renamed from: n */
    public final /* synthetic */ Context f152150n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54191v2(ContentResolver contentResolver, Uri uri, C54193w2 w2Var, C54625h<C13598b0> hVar, Context context, C15601d<? super C54191v2> dVar) {
        super(2, dVar);
        this.f152146g = contentResolver;
        this.f152147h = uri;
        this.f152148i = w2Var;
        this.f152149j = hVar;
        this.f152150n = context;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C54191v2 v2Var = new C54191v2(this.f152146g, this.f152147h, this.f152148i, this.f152149j, this.f152150n, dVar);
        v2Var.f152145f = obj;
        return v2Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54191v2) create((C45253g) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054 A[Catch:{ all -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f A[Catch:{ all -> 0x008e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r9.f152144e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x002f
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            java.lang.Object r1 = r9.f152143d
            c14.j r1 = (c14.C54628j) r1
            java.lang.Object r4 = r9.f152145f
            d14.g r4 = (d14.C45253g) r4
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0090 }
            r10 = r4
            goto L_0x0046
        L_0x0019:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0021:
            java.lang.Object r1 = r9.f152143d
            c14.j r1 = (c14.C54628j) r1
            java.lang.Object r4 = r9.f152145f
            d14.g r4 = (d14.C45253g) r4
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0090 }
            r5 = r4
            r4 = r9
            goto L_0x0057
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.f152145f
            d14.g r10 = (d14.C45253g) r10
            android.content.ContentResolver r1 = r9.f152146g
            android.net.Uri r4 = r9.f152147h
            r5 = 0
            androidx.compose.ui.platform.w2 r6 = r9.f152148i
            r1.registerContentObserver(r4, r5, r6)
            c14.h<rx3.b0> r1 = r9.f152149j     // Catch:{ all -> 0x0090 }
            c14.j r1 = r1.iterator()     // Catch:{ all -> 0x0090 }
        L_0x0046:
            r4 = r9
        L_0x0047:
            r4.f152145f = r10     // Catch:{ all -> 0x008e }
            r4.f152143d = r1     // Catch:{ all -> 0x008e }
            r4.f152144e = r3     // Catch:{ all -> 0x008e }
            java.lang.Object r5 = r1.mo75523a(r4)     // Catch:{ all -> 0x008e }
            if (r5 != r0) goto L_0x0054
            return r0
        L_0x0054:
            r8 = r5
            r5 = r10
            r10 = r8
        L_0x0057:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x008e }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x008e }
            if (r10 == 0) goto L_0x0084
            r1.next()     // Catch:{ all -> 0x008e }
            android.content.Context r10 = r4.f152150n     // Catch:{ all -> 0x008e }
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "animator_duration_scale"
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch:{ all -> 0x008e }
            java.lang.Float r6 = new java.lang.Float     // Catch:{ all -> 0x008e }
            r6.<init>(r10)     // Catch:{ all -> 0x008e }
            r4.f152145f = r5     // Catch:{ all -> 0x008e }
            r4.f152143d = r1     // Catch:{ all -> 0x008e }
            r4.f152144e = r2     // Catch:{ all -> 0x008e }
            java.lang.Object r10 = r5.emit(r6, r4)     // Catch:{ all -> 0x008e }
            if (r10 != r0) goto L_0x0082
            return r0
        L_0x0082:
            r10 = r5
            goto L_0x0047
        L_0x0084:
            android.content.ContentResolver r10 = r4.f152146g
            androidx.compose.ui.platform.w2 r0 = r4.f152148i
            r10.unregisterContentObserver(r0)
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        L_0x008e:
            r10 = move-exception
            goto L_0x0092
        L_0x0090:
            r10 = move-exception
            r4 = r9
        L_0x0092:
            android.content.ContentResolver r0 = r4.f152146g
            androidx.compose.ui.platform.w2 r1 = r4.f152148i
            r0.unregisterContentObserver(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.C54191v2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
