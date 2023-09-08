package p157gk;

import android.util.Pair;
import com.tencent.p014mm.api.QueryImageData;
import d14.C45253g;
import fy3.C32227p;
import java.util.ArrayList;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.data.ImageDataManager$getAllOldDataByPersonReq$1", mo125469f = "ImageDataManager.kt", mo125470l = {279}, mo125471m = "invokeSuspend")
/* renamed from: gk.g */
public final class C59486g extends C91594j implements C32227p<C45253g<? super Pair<ArrayList<C32466a>, ArrayList<QueryImageData>>>, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f169980d;

    /* renamed from: e */
    public Object f169981e;

    /* renamed from: f */
    public int f169982f;

    /* renamed from: g */
    public int f169983g;

    /* renamed from: h */
    public /* synthetic */ Object f169984h;

    public C59486g(C15601d<? super C59486g> dVar) {
        super(2, dVar);
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C59486g gVar = new C59486g(dVar);
        gVar.f169984h = obj;
        return gVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59486g) create((C45253g) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x006a  */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r10.f169983g
            java.lang.String r2 = "MicroMsg.ImageDataManager"
            r3 = 4
            r4 = 1
            if (r1 == 0) goto L_0x0027
            if (r1 != r4) goto L_0x001f
            int r1 = r10.f169982f
            java.lang.Object r5 = r10.f169981e
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r10.f169980d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r7 = r10.f169984h
            d14.g r7 = (d14.C45253g) r7
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r10
            goto L_0x0080
        L_0x001f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0027:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.f169984h
            d14.g r11 = (d14.C45253g) r11
            r1 = 0
            com.tencent.mm.storage.a4 r5 = com.tencent.p014mm.storage.C57593a4.f164912a
            java.lang.String r6 = p157gk.C59491j.f169997b
            java.util.ArrayList r5 = r5.mo81942g(r6)
            r7 = r11
            r6 = r5
            r11 = r10
        L_0x003a:
            com.tencent.mm.storage.a4 r5 = com.tencent.p014mm.storage.C57593a4.f164912a
            java.lang.String r8 = p157gk.C59491j.f169997b
            java.util.ArrayList r5 = r5.mo81941f(r8, r3, r1)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getAllOldDataByPersonReq >> emit list size: "
            r8.append(r9)
            int r9 = r5.size()
            r8.append(r9)
            java.lang.String r9 = ", offset: "
            r8.append(r9)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            int r1 = r1 + r3
            boolean r8 = r5.isEmpty()
            r8 = r8 ^ r4
            if (r8 == 0) goto L_0x0080
            android.util.Pair r8 = new android.util.Pair
            r8.<init>(r6, r5)
            r11.f169984h = r7
            r11.f169980d = r6
            r11.f169981e = r5
            r11.f169982f = r1
            r11.f169983g = r4
            java.lang.Object r8 = r7.emit(r8, r11)
            if (r8 != r0) goto L_0x0080
            return r0
        L_0x0080:
            int r5 = r5.size()
            if (r5 >= r3) goto L_0x003a
            java.lang.String r11 = "getAllOldDataByPersonReq >> emit all data"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r11)
            long r0 = (long) r4
            ig3.C60283e.f171891n = r0
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p157gk.C59486g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
