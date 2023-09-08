package p157gk;

import com.tencent.p014mm.api.QueryImageData;
import d14.C45253g;
import fy3.C32227p;
import java.util.ArrayList;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.data.ImageDataManager$getAllOldDataByNormalReq$1", mo125469f = "ImageDataManager.kt", mo125470l = {261}, mo125471m = "invokeSuspend")
/* renamed from: gk.f */
public final class C59485f extends C91594j implements C32227p<C45253g<? super ArrayList<QueryImageData>>, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f169976d;

    /* renamed from: e */
    public int f169977e;

    /* renamed from: f */
    public int f169978f;

    /* renamed from: g */
    public /* synthetic */ Object f169979g;

    public C59485f(C15601d<? super C59485f> dVar) {
        super(2, dVar);
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C59485f fVar = new C59485f(dVar);
        fVar.f169979g = obj;
        return fVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59485f) create((C45253g) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005d  */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r9.f169978f
            java.lang.String r2 = "MicroMsg.ImageDataManager"
            r3 = 4
            r4 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 != r4) goto L_0x001b
            int r1 = r9.f169977e
            java.lang.Object r5 = r9.f169976d
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r9.f169979g
            d14.g r6 = (d14.C45253g) r6
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r9
            goto L_0x006c
        L_0x001b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0023:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.f169979g
            d14.g r10 = (d14.C45253g) r10
            r1 = 0
            r6 = r10
            r10 = r9
        L_0x002d:
            com.tencent.mm.storage.a4 r5 = com.tencent.p014mm.storage.C57593a4.f164912a
            java.lang.String r7 = p157gk.C59491j.f169997b
            java.util.ArrayList r5 = r5.mo81941f(r7, r3, r1)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "getAllOldDataByNormalReq >> emit list size: "
            r7.append(r8)
            int r8 = r5.size()
            r7.append(r8)
            java.lang.String r8 = ", offset: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            int r1 = r1 + r3
            boolean r7 = r5.isEmpty()
            r7 = r7 ^ r4
            if (r7 == 0) goto L_0x006c
            r10.f169979g = r6
            r10.f169976d = r5
            r10.f169977e = r1
            r10.f169978f = r4
            java.lang.Object r7 = r6.emit(r5, r10)
            if (r7 != r0) goto L_0x006c
            return r0
        L_0x006c:
            int r5 = r5.size()
            if (r5 >= r3) goto L_0x002d
            java.lang.String r10 = "getAllOldDataByNormalReq >> emit all data"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            long r0 = (long) r4
            ig3.C60283e.f171891n = r0
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p157gk.C59485f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
