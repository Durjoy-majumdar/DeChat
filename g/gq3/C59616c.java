package gq3;

import android.graphics.RectF;
import d14.C45253g;
import fy3.C32227p;
import java.util.ArrayList;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.view.page.ImageQueryGalleryViewModel$getImageKeywordPoint$1", mo125469f = "ImageQueryGalleryViewModel.kt", mo125470l = {17, 20, 38, 41}, mo125471m = "invokeSuspend")
/* renamed from: gq3.c */
public final class C59616c extends C91594j implements C32227p<C45253g<? super C13604l<? extends String, ? extends ArrayList<RectF>>>, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f170345d;

    /* renamed from: e */
    public int f170346e;

    /* renamed from: f */
    public /* synthetic */ Object f170347f;

    /* renamed from: g */
    public final /* synthetic */ String f170348g;

    /* renamed from: h */
    public final /* synthetic */ String f170349h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59616c(String str, String str2, C15601d<? super C59616c> dVar) {
        super(2, dVar);
        this.f170348g = str;
        this.f170349h = str2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C59616c cVar = new C59616c(this.f170348g, this.f170349h, dVar);
        cVar.f170347f = obj;
        return cVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59616c) create((C45253g) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0156 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f170346e
            r3 = 4
            r4 = 3
            java.lang.String r5 = "MicroMsg.ImageQueryGalleryViewModel"
            r6 = 2
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r8) goto L_0x0037
            if (r2 == r6) goto L_0x0032
            if (r2 == r4) goto L_0x0020
            if (r2 != r3) goto L_0x0018
            goto L_0x0032
        L_0x0018:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0020:
            java.lang.Object r2 = r0.f170345d
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f170347f
            d14.g r4 = (d14.C45253g) r4
            kotlin.ResultKt.throwOnFailure(r18)     // Catch:{ f -> 0x002d }
            goto L_0x0157
        L_0x002d:
            r16 = r5
            goto L_0x0137
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r18)
            goto L_0x0157
        L_0x0037:
            java.lang.Object r2 = r0.f170347f
            d14.g r2 = (d14.C45253g) r2
            kotlin.ResultKt.throwOnFailure(r18)
            r9 = r18
            goto L_0x0063
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r18)
            java.lang.Object r2 = r0.f170347f
            d14.g r2 = (d14.C45253g) r2
            gk.r r9 = p157gk.C59503r.f170040a
            java.lang.String r10 = r0.f170348g
            java.lang.String r11 = r0.f170349h
            r0.f170347f = r2
            r0.f170346e = r8
            r9.getClass()
            a14.h0 r9 = a14.C53872d1.f151119c
            gk.n r12 = new gk.n
            r12.<init>(r10, r11, r7)
            java.lang.Object r9 = a14.C53895h.m60469g(r9, r12, r0)
            if (r9 != r1) goto L_0x0063
            return r1
        L_0x0063:
            java.lang.String r10 = r0.f170348g
            java.lang.String r11 = r0.f170349h
            java.lang.String r9 = (java.lang.String) r9
            r12 = 0
            if (r9 == 0) goto L_0x0075
            int r13 = r9.length()
            if (r13 != 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r13 = 0
            goto L_0x0076
        L_0x0075:
            r13 = 1
        L_0x0076:
            java.lang.String r14 = ", keyword: "
            java.lang.String r15 = "getImageKeywordPoint >> imagePath: "
            if (r13 == 0) goto L_0x00ae
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r15)
            r3.append(r10)
            r3.append(r14)
            r3.append(r11)
            java.lang.String r4 = ", result is null"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            rx3.l r3 = new rx3.l
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.<init>(r10, r4)
            r0.f170347f = r7
            r0.f170346e = r6
            java.lang.Object r2 = r2.emit(r3, r0)
            if (r2 != r1) goto L_0x0157
            return r1
        L_0x00ae:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r15)
            r13.append(r10)
            r13.append(r14)
            r13.append(r11)
            java.lang.String r11 = ", result: "
            r13.append(r11)
            r13.append(r9)
            java.lang.String r11 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ f -> 0x0132 }
            r11.<init>()     // Catch:{ f -> 0x0132 }
            c30.g r13 = new c30.g     // Catch:{ f -> 0x0132 }
            r13.<init>((java.lang.String) r9)     // Catch:{ f -> 0x0132 }
            java.lang.String r9 = "data"
            c30.e r9 = r13.mo110108i(r9)     // Catch:{ f -> 0x0132 }
            int r13 = r9.length()     // Catch:{ f -> 0x0132 }
            r14 = 0
        L_0x00e3:
            if (r14 >= r13) goto L_0x011d
            c30.e r15 = r9.mo53807h(r14)     // Catch:{ f -> 0x0132 }
            c30.e r3 = r15.mo53807h(r12)     // Catch:{ f -> 0x0132 }
            c30.e r15 = r15.mo53807h(r6)     // Catch:{ f -> 0x0132 }
            android.graphics.RectF r6 = new android.graphics.RectF     // Catch:{ f -> 0x0132 }
            r16 = r5
            double r4 = r3.getDouble(r12)     // Catch:{ f -> 0x0134 }
            float r4 = (float) r4     // Catch:{ f -> 0x0134 }
            r5 = r13
            double r12 = r3.getDouble(r8)     // Catch:{ f -> 0x0134 }
            float r3 = (float) r12     // Catch:{ f -> 0x0134 }
            r12 = 0
            double r7 = r15.getDouble(r12)     // Catch:{ f -> 0x0134 }
            float r7 = (float) r7     // Catch:{ f -> 0x0134 }
            r8 = 1
            double r12 = r15.getDouble(r8)     // Catch:{ f -> 0x0134 }
            float r12 = (float) r12     // Catch:{ f -> 0x0134 }
            r6.<init>(r4, r3, r7, r12)     // Catch:{ f -> 0x0134 }
            r11.add(r6)     // Catch:{ f -> 0x0134 }
            int r14 = r14 + 1
            r13 = r5
            r5 = r16
            r3 = 4
            r4 = 3
            r6 = 2
            r7 = 0
            r12 = 0
            goto L_0x00e3
        L_0x011d:
            r16 = r5
            rx3.l r3 = new rx3.l     // Catch:{ f -> 0x0134 }
            r3.<init>(r10, r11)     // Catch:{ f -> 0x0134 }
            r0.f170347f = r2     // Catch:{ f -> 0x0134 }
            r0.f170345d = r10     // Catch:{ f -> 0x0134 }
            r4 = 3
            r0.f170346e = r4     // Catch:{ f -> 0x0134 }
            java.lang.Object r2 = r2.emit(r3, r0)     // Catch:{ f -> 0x0134 }
            if (r2 != r1) goto L_0x0157
            return r1
        L_0x0132:
            r16 = r5
        L_0x0134:
            r4 = r2
            r2 = r10
        L_0x0137:
            java.lang.String r3 = "parse json error"
            r5 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            rx3.l r3 = new rx3.l
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3.<init>(r2, r5)
            r2 = 0
            r0.f170347f = r2
            r0.f170345d = r2
            r2 = 4
            r0.f170346e = r2
            java.lang.Object r2 = r4.emit(r3, r0)
            if (r2 != r1) goto L_0x0157
            return r1
        L_0x0157:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gq3.C59616c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
