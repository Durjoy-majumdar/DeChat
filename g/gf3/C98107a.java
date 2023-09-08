package gf3;

import a14.C0000n0;
import b62.C92178b;
import b62.C92179c;
import com.tencent.p014mm.plugin.mediabasic.data.MediaErrorInfo;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.remux.chain.AbsRemuxChain$remux$2", mo125469f = "AbsRemuxChain.kt", mo125470l = {23, 25}, mo125471m = "invokeSuspend")
/* renamed from: gf3.a */
public final class C98107a extends C91594j implements C32227p<C0000n0, C15601d<? super MediaErrorInfo>, Object> {

    /* renamed from: d */
    public int f287581d;

    /* renamed from: e */
    public final /* synthetic */ C98108b f287582e;

    /* renamed from: f */
    public final /* synthetic */ C92178b f287583f;

    /* renamed from: g */
    public final /* synthetic */ C92179c f287584g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98107a(C98108b bVar, C92178b bVar2, C92179c cVar, C15601d<? super C98107a> dVar) {
        super(2, dVar);
        this.f287582e = bVar;
        this.f287583f = bVar2;
        this.f287584g = cVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C98107a(this.f287582e, this.f287583f, this.f287584g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C98107a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r7.f287581d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x001c
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x004d
        L_0x0010:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0018:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x002e
        L_0x001c:
            kotlin.ResultKt.throwOnFailure(r8)
            gf3.b r8 = r7.f287582e
            b62.b r1 = r7.f287583f
            b62.c r4 = r7.f287584g
            r7.f287581d = r3
            java.lang.Object r8 = r8.mo126328c(r1, r4, r7)
            if (r8 != r0) goto L_0x002e
            return r0
        L_0x002e:
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r8 = (com.tencent.p014mm.plugin.mediabasic.data.MediaErrorInfo) r8
            b62.d r1 = r8.f272116d
            b62.d r4 = b62.C92180d.MediaRemuxIgnore
            if (r1 != r4) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r3 = 0
        L_0x0038:
            if (r3 == 0) goto L_0x0061
            gf3.b r8 = r7.f287582e
            gf3.c r8 = r8.f287585a
            if (r8 == 0) goto L_0x0051
            b62.b r1 = r7.f287583f
            b62.c r3 = r7.f287584g
            r7.f287581d = r2
            java.lang.Object r8 = r8.mo137400a(r1, r3, r7)
            if (r8 != r0) goto L_0x004d
            return r0
        L_0x004d:
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r8 = (com.tencent.p014mm.plugin.mediabasic.data.MediaErrorInfo) r8
            if (r8 != 0) goto L_0x0061
        L_0x0051:
            r2 = -1
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r8 = new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo
            b62.d r1 = b62.C92180d.MediaRemuxError
            r4 = 0
            r5 = 8
            r6 = 0
            java.lang.String r3 = "no chain handle video remux"
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
        L_0x0061:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: gf3.C98107a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
