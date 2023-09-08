package je0;

import a14.C0000n0;
import com.tencent.p014mm.openim.api.OpenIMKefuStartConversationRequest;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.openim.model.OpenIMKefuConfirmController$start$1", mo125469f = "OpenIMKefuConfirmController.kt", mo125470l = {132}, mo125471m = "invokeSuspend")
/* renamed from: je0.h0 */
public final class C21230h0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f60026d;

    /* renamed from: e */
    public final /* synthetic */ C21216d0 f60027e;

    /* renamed from: f */
    public final /* synthetic */ OpenIMKefuStartConversationRequest f60028f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21230h0(C21216d0 d0Var, OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest, C15601d<? super C21230h0> dVar) {
        super(2, dVar);
        this.f60027e = d0Var;
        this.f60028f = openIMKefuStartConversationRequest;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C21230h0(this.f60027e, this.f60028f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C21230h0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r7.f60026d
            r2 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 != r2) goto L_0x000d
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x003e
        L_0x000d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0015:
            kotlin.ResultKt.throwOnFailure(r8)
            je0.d0 r8 = r7.f60027e
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest r1 = r8.f59999d
            r3 = 0
            if (r1 == 0) goto L_0x0025
            boolean r1 = r1.f108518g
            if (r2 != r1) goto L_0x0025
            r1 = 1
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            if (r1 == 0) goto L_0x0035
            rx3.l r8 = new rx3.l
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r3)
            java.lang.String r1 = ""
            r8.<init>(r0, r1)
            goto L_0x0040
        L_0x0035:
            r7.f60026d = r2
            java.lang.Object r8 = je0.C21216d0.m23702e(r8, r7)
            if (r8 != r0) goto L_0x003e
            return r0
        L_0x003e:
            rx3.l r8 = (rx3.C13604l) r8
        L_0x0040:
            A r0 = r8.f38555d
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x006f
            je0.d0 r0 = r7.f60027e
            android.os.ResultReceiver r1 = r0.mo33211j()
            je0.d0 r0 = r7.f60027e
            long r2 = r0.mo33212k()
            r4 = 1
            A r0 = r8.f38555d
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            B r8 = r8.f38556e
            r6 = r8
            java.lang.String r6 = (java.lang.String) r6
            je0.C21231p0.m23719a(r1, r2, r4, r5, r6)
            je0.d0 r8 = r7.f60027e
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest r0 = r7.f60028f
            r8.mo33207g(r0)
            goto L_0x009d
        L_0x006f:
            je0.d0 r0 = r7.f60027e
            A r1 = r8.f38555d
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            B r2 = r8.f38556e
            java.lang.String r2 = (java.lang.String) r2
            r0.mo33209h(r1, r2)
            je0.d0 r0 = r7.f60027e
            android.os.ResultReceiver r1 = r0.mo33211j()
            je0.d0 r0 = r7.f60027e
            long r2 = r0.mo33212k()
            r4 = 0
            A r0 = r8.f38555d
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            B r8 = r8.f38556e
            r6 = r8
            java.lang.String r6 = (java.lang.String) r6
            je0.C21231p0.m23719a(r1, r2, r4, r5, r6)
        L_0x009d:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: je0.C21230h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
