package com.tencent.p014mm.plugin.appbrand.utils;

import android.widget.ImageView;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.f1 */
public final class C2036f1 {

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.utils.IconAttacherKt", mo125469f = "IconAttacher.kt", mo125470l = {28}, mo125471m = "attachTo")
    /* renamed from: com.tencent.mm.plugin.appbrand.utils.f1$a */
    public static final class C2037a extends C66704d {

        /* renamed from: d */
        public Object f11982d;

        /* renamed from: e */
        public Object f11983e;

        /* renamed from: f */
        public /* synthetic */ Object f11984f;

        /* renamed from: g */
        public int f11985g;

        public C2037a(C15601d<? super C2037a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f11984f = obj;
            this.f11985g |= Integer.MIN_VALUE;
            return C2036f1.m1986a((String) null, (ImageView) null, this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: android.widget.ImageView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086 A[Catch:{ IOException -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a A[Catch:{ IOException -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m1986a(java.lang.String r5, android.widget.ImageView r6, wx3.C15601d<? super rx3.C13598b0> r7) {
        /*
            boolean r0 = r7 instanceof com.tencent.p014mm.plugin.appbrand.utils.C2036f1.C2037a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.tencent.mm.plugin.appbrand.utils.f1$a r0 = (com.tencent.p014mm.plugin.appbrand.utils.C2036f1.C2037a) r0
            int r1 = r0.f11985g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f11985g = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.plugin.appbrand.utils.f1$a r0 = new com.tencent.mm.plugin.appbrand.utils.f1$a
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f11984f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f11985g
            java.lang.String r3 = "MicroMsg.AppBrand.IconAttacher"
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r5 = r0.f11983e
            r6 = r5
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            java.lang.Object r5 = r0.f11982d
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ IOException -> 0x0032 }
            goto L_0x007a
        L_0x0032:
            r5 = move-exception
            goto L_0x0090
        L_0x0034:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r7)
            if (r6 != 0) goto L_0x0049
            java.lang.String r5 = "attachTo, imageView is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r5)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        L_0x0049:
            r6.setTag(r5)
            r0.f11982d = r5     // Catch:{ IOException -> 0x0032 }
            r0.f11983e = r6     // Catch:{ IOException -> 0x0032 }
            r0.f11985g = r4     // Catch:{ IOException -> 0x0032 }
            a14.m r7 = new a14.m     // Catch:{ IOException -> 0x0032 }
            wx3.d r0 = xx3.C66447b.m78392b(r0)     // Catch:{ IOException -> 0x0032 }
            r7.<init>(r0, r4)     // Catch:{ IOException -> 0x0032 }
            r7.mo74609p()     // Catch:{ IOException -> 0x0032 }
            com.tencent.mm.plugin.appbrand.utils.h1 r0 = new com.tencent.mm.plugin.appbrand.utils.h1     // Catch:{ IOException -> 0x0032 }
            r0.<init>(r5, r7)     // Catch:{ IOException -> 0x0032 }
            java.lang.String r2 = lb0.C88394b.f255384g     // Catch:{ IOException -> 0x0032 }
            lb0.b r2 = lb0.C88394b.C88418q.f255427a     // Catch:{ IOException -> 0x0032 }
            r4 = 0
            r2.mo122796o(r0, r5, r4)     // Catch:{ IOException -> 0x0032 }
            com.tencent.mm.plugin.appbrand.utils.g1 r2 = new com.tencent.mm.plugin.appbrand.utils.g1     // Catch:{ IOException -> 0x0032 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0032 }
            r7.mo74599v(r2)     // Catch:{ IOException -> 0x0032 }
            java.lang.Object r7 = r7.mo74608o()     // Catch:{ IOException -> 0x0032 }
            if (r7 != r1) goto L_0x007a
            return r1
        L_0x007a:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch:{ IOException -> 0x0032 }
            java.lang.Object r0 = r6.getTag()     // Catch:{ IOException -> 0x0032 }
            boolean r5 = gy3.C87412m.m108589b(r5, r0)     // Catch:{ IOException -> 0x0032 }
            if (r5 == 0) goto L_0x008a
            r6.setImageBitmap(r7)     // Catch:{ IOException -> 0x0032 }
            goto L_0x00a4
        L_0x008a:
            java.lang.String r5 = "attachTo, imageView already reused"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)     // Catch:{ IOException -> 0x0032 }
            goto L_0x00a4
        L_0x0090:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "attachTo, loadIcon fail since "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r5)
        L_0x00a4:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.utils.C2036f1.m1986a(java.lang.String, android.widget.ImageView, wx3.d):java.lang.Object");
    }
}
