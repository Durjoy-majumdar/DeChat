package sk3;

import a14.C0000n0;
import android.view.View;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiImageUIC$firstTimeIdentify$2", mo125469f = "FTSMultiImageUIC.kt", mo125470l = {201, 210}, mo125471m = "invokeSuspend")
/* renamed from: sk3.k */
public final class C63990k extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f181409d;

    /* renamed from: e */
    public final /* synthetic */ C63995m f181410e;

    /* renamed from: f */
    public final /* synthetic */ View f181411f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63990k(C63995m mVar, View view, C15601d<? super C63990k> dVar) {
        super(2, dVar);
        this.f181410e = mVar;
        this.f181411f = view;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C63990k(this.f181410e, this.f181411f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63990k) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r8.f181409d
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 == r4) goto L_0x001a
            if (r1 != r3) goto L_0x0012
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00ba
        L_0x0012:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x001a:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0045
        L_0x001e:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Class<ug.o0> r9 = p248ug.C65347o0.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ug.o0 r9 = (p248ug.C65347o0) r9
            sk3.m r1 = r8.f181410e
            java.lang.String r1 = r1.f181428f
            r9.mo89077gs(r1)
            sk3.m r9 = r8.f181410e
            r8.f181409d = r4
            r9.getClass()
            a14.h0 r1 = a14.C53872d1.f151119c
            sk3.l r5 = new sk3.l
            r5.<init>(r9, r4, r2)
            java.lang.Object r9 = a14.C53895h.m60469g(r1, r5, r8)
            if (r9 != r0) goto L_0x0045
            return r0
        L_0x0045:
            rx3.l r9 = (rx3.C13604l) r9
            A r1 = r9.f38555d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            B r9 = r9.f38556e
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            sk3.m r5 = r8.f181410e
            r5.mo88767j3()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "get result >> "
            r5.append(r6)
            int r6 = r1.size()
            r5.append(r6)
            java.lang.String r6 = ", "
            r5.append(r6)
            int r6 = r9.size()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.FTSMultiImageUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            fk3.b r5 = fk3.C97886b.f287172a
            sk3.m r6 = r8.f181410e
            java.lang.String r6 = r6.f181428f
            r5.mo137235v(r6)
            java.lang.String r6 = ""
            fk3.C97886b.f287174c = r6
            sk3.m r6 = r8.f181410e
            androidx.appcompat.app.AppCompatActivity r6 = r6.getActivity()
            sk3.m r7 = r8.f181410e
            androidx.appcompat.app.AppCompatActivity r7 = r7.getActivity()
            int r7 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r7)
            int r6 = kg3.C76577a.m92152c(r6, r7)
            fk3.C97886b.f287175d = r6
            sk3.m r6 = r8.f181410e
            java.lang.String r6 = r6.f181428f
            java.lang.String r7 = "<set-?>"
            gy3.C87412m.m108594g(r6, r7)
            p157gk.C59491j.f169997b = r6
            p157gk.C59492k.f169999a = r5
            r8.f181409d = r3
            a14.h0 r3 = a14.C53872d1.f151119c
            com.tencent.mm.storage.z3 r5 = new com.tencent.mm.storage.z3
            r5.<init>(r1, r9, r2)
            java.lang.Object r9 = a14.C53895h.m60469g(r3, r5, r8)
            if (r9 != r0) goto L_0x00ba
            return r0
        L_0x00ba:
            sk3.m r9 = r8.f181410e
            qo3.i0 r9 = r9.f181430h
            if (r9 == 0) goto L_0x00c7
            boolean r9 = r9.isShowing()
            if (r9 != r4) goto L_0x00c7
            goto L_0x00c8
        L_0x00c7:
            r4 = 0
        L_0x00c8:
            if (r4 == 0) goto L_0x00dc
            sk3.m r9 = r8.f181410e
            qo3.i0 r9 = r9.f181430h
            if (r9 == 0) goto L_0x00d3
            r9.dismiss()
        L_0x00d3:
            sk3.m r9 = r8.f181410e
            r9.f181430h = r2
            android.view.View r0 = r8.f181411f
            r9.mo88768k3(r0)
        L_0x00dc:
            gk.e r9 = p157gk.C59491j.f169998c
            if (r9 == 0) goto L_0x00e9
            sk3.m r0 = r8.f181410e
            androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
            r9.mo84579a(r0)
        L_0x00e9:
            sk3.m r9 = r8.f181410e
            gq3.h r9 = r9.mo88763e3()
            java.lang.String r0 = "imageDataQueryModel"
            gy3.C87412m.m108593f(r9, r0)
            sk3.m r0 = r8.f181410e
            java.lang.String r0 = r0.f181429g
            java.util.List<java.lang.String> r1 = gq3.C59629h.f170395E
            r9.mo84639e3(r0, r2)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: sk3.C63990k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
