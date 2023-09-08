package p184kp;

import cc3.C26835d;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86301e;
import ei3.C86522b;
import p455bn.C54500b;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C86522b
/* renamed from: kp.a */
public final class C61128a extends C86301e implements C54500b {

    @C91590f(mo125468c = "com.tencent.mm.feature.common.AppMsgFeatureService", mo125469f = "AppMsgFeatureService.kt", mo125470l = {32}, mo125471m = "sendAppMsg")
    /* renamed from: kp.a$a */
    public static final class C61129a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f174041d;

        /* renamed from: e */
        public final /* synthetic */ C61128a f174042e;

        /* renamed from: f */
        public int f174043f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61129a(C61128a aVar, C15601d<? super C61129a> dVar) {
            super(dVar);
            this.f174042e = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f174041d = obj;
            this.f174043f |= Integer.MIN_VALUE;
            return this.f174042e.mo75336ON((C72963f4) null, (C26835d) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: ON */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo75336ON(com.tencent.p014mm.storage.C72963f4 r11, cc3.C26835d r12, wx3.C15601d<? super te3.C64596nz3> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof p184kp.C61128a.C61129a
            if (r0 == 0) goto L_0x0013
            r0 = r13
            kp.a$a r0 = (p184kp.C61128a.C61129a) r0
            int r1 = r0.f174043f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f174043f = r1
            goto L_0x0018
        L_0x0013:
            kp.a$a r0 = new kp.a$a
            r0.<init>(r10, r13)
        L_0x0018:
            r7 = r0
            java.lang.Object r13 = r7.f174041d
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r7.f174043f
            r2 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r2) goto L_0x0028
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0065
        L_0x0028:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = 2
            java.lang.Class[] r13 = new java.lang.Class[r13]
            r1 = 0
            java.lang.Class<kd3.b> r3 = kd3.C99127b.class
            r13[r1] = r3
            java.lang.Class<kd3.a> r1 = kd3.C61000a.class
            r13[r2] = r1
            java.util.List r13 = sx3.C64197v.m75537f(r13)
            com.tencent.mm.sdk.pipeline.PipelineState r3 = new com.tencent.mm.sdk.pipeline.PipelineState
            r3.<init>()
            java.lang.String r1 = "MsgInfo"
            r3.put(r1, r11)
            java.lang.String r11 = "AppMsgObj"
            r3.put(r11, r12)
            com.tencent.mm.sdk.pipeline.Pipeline$Companion r1 = com.tencent.p014mm.sdk.pipeline.Pipeline.Companion
            r5 = 0
            r8 = 8
            r9 = 0
            r7.f174043f = r2
            java.lang.String r4 = "SendAppMsg"
            r2 = r13
            java.lang.Object r13 = com.tencent.p014mm.sdk.pipeline.Pipeline.Companion.startSyncPipelineForResult$default(r1, r2, r3, r4, r5, r7, r8, r9)
            if (r13 != r0) goto L_0x0065
            return r0
        L_0x0065:
            com.tencent.mm.sdk.pipeline.PipelineResult r13 = (com.tencent.p014mm.sdk.pipeline.PipelineResult) r13
            com.tencent.mm.sdk.pipeline.PipelineState r11 = r13.getData()
            java.lang.String r12 = "AppMsgResponse"
            java.lang.Object r11 = r11.get(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p184kp.C61128a.mo75336ON(com.tencent.mm.storage.f4, cc3.d, wx3.d):java.lang.Object");
    }
}
