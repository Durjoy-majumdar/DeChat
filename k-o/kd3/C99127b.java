package kd3;

import com.tencent.p014mm.sdk.pipeline.Pipeline;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import com.tencent.p014mm.sdk.pipeline.ProcessorPipelineComponent;
import gy3.C87412m;
import p455bn.C54501c;
import p455bn.C54502d;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: kd3.b */
public final class C99127b extends ProcessorPipelineComponent<C54501c, C54502d> {

    @C91590f(mo125468c = "com.tencent.mm.pluginsdk.model.ppc.SendAppMsgPPC", mo125469f = "SendAppMsgPPC.kt", mo125470l = {26}, mo125471m = "processAction")
    /* renamed from: kd3.b$a */
    public static final class C99128a extends C66704d {

        /* renamed from: d */
        public Object f290650d;

        /* renamed from: e */
        public Object f290651e;

        /* renamed from: f */
        public /* synthetic */ Object f290652f;

        /* renamed from: g */
        public final /* synthetic */ C99127b f290653g;

        /* renamed from: h */
        public int f290654h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99128a(C99127b bVar, C15601d<? super C99128a> dVar) {
            super(dVar);
            this.f290653g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f290652f = obj;
            this.f290654h |= Integer.MIN_VALUE;
            return this.f290653g.processAction((PipelineState) null, (C54501c) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99127b(Pipeline pipeline) {
        super(pipeline);
        C87412m.m108594g(pipeline, "pipeline");
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [rx3.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object processAction(com.tencent.p014mm.sdk.pipeline.PipelineState r7, p455bn.C54501c r8, wx3.C15601d<? super p455bn.C54502d> r9) {
        /*
            r6 = this;
            java.lang.Class<com.tencent.mm.plugin.messenger.foundation.t> r7 = com.tencent.p014mm.plugin.messenger.foundation.C69843t.class
            boolean r0 = r9 instanceof kd3.C99127b.C99128a
            if (r0 == 0) goto L_0x0015
            r0 = r9
            kd3.b$a r0 = (kd3.C99127b.C99128a) r0
            int r1 = r0.f290654h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0015
            int r1 = r1 - r2
            r0.f290654h = r1
            goto L_0x001a
        L_0x0015:
            kd3.b$a r0 = new kd3.b$a
            r0.<init>(r6, r9)
        L_0x001a:
            java.lang.Object r9 = r0.f290652f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f290654h
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r8 = r0.f290651e
            bn.c r8 = (p455bn.C54501c) r8
            java.lang.Object r0 = r0.f290650d
            kd3.b r0 = (kd3.C99127b) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0055
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r9)
            com.tencent.mm.storage.f4 r9 = r8.f152779a
            cc3.d r2 = r8.f152780b
            te3.mz3 r9 = com.tencent.p014mm.pluginsdk.model.app.C96762a0.m124215a(r9, r2)
            ob0.b r9 = r9.mo141225b()
            r0.f290650d = r6
            r0.f290651e = r8
            r0.f290654h = r3
            java.lang.Object r9 = q40.C89456b.m111832b(r9, r0)
            if (r9 != r1) goto L_0x0055
            return r1
        L_0x0055:
            ob0.b$c r9 = (ob0.C89132b.C89134c) r9
            T r9 = r9.f256796d
            te3.nz3 r9 = (te3.C64596nz3) r9
            di3.d r0 = di3.C86312j.m106911c(r7)
            com.tencent.mm.plugin.messenger.foundation.t r0 = (com.tencent.p014mm.plugin.messenger.foundation.C69843t) r0
            com.tencent.mm.storage.g4 r0 = r0.mo96095LE()
            com.tencent.mm.storage.f4 r8 = r8.f152779a
            long r1 = r8.getMsgId()
            com.tencent.mm.storage.f4 r8 = r0.b00(r1)
            r0 = 0
            if (r9 == 0) goto L_0x0107
            java.lang.String r1 = r8.f230724G
            gc3.a r2 = new gc3.a
            r2.<init>()
            java.lang.String r3 = "msgSourceBefore"
            gy3.C87412m.m108593f(r1, r3)
            r2.mo141099d(r1)
            java.lang.String r3 = r9.f184597p
            if (r3 == 0) goto L_0x00be
            gc3.a r3 = new gc3.a
            r3.<init>()
            java.lang.String r4 = r9.f184597p
            java.lang.String r5 = "resp.MsgSource"
            gy3.C87412m.m108593f(r4, r5)
            r3.mo141099d(r4)
            gc3.t r4 = r2.f75285f
            if (r4 == 0) goto L_0x00aa
            gc3.t r5 = r3.f75285f
            if (r5 == 0) goto L_0x00a3
            java.lang.String r5 = r5.mo54669L()
            goto L_0x00a4
        L_0x00a3:
            r5 = r0
        L_0x00a4:
            r4.mo54681X(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x00ab
        L_0x00aa:
            r4 = r0
        L_0x00ab:
            if (r4 != 0) goto L_0x00be
            gc3.t r4 = new gc3.t
            r4.<init>()
            gc3.t r3 = r3.f75285f
            if (r3 == 0) goto L_0x00ba
            java.lang.String r0 = r3.mo54669L()
        L_0x00ba:
            r4.f75395f = r0
            r2.f75285f = r4
        L_0x00be:
            java.lang.String r0 = r2.mo141118z()
            r8.mo101012p4(r0)
            r2 = 2
            r8.mo100991d(r2)
            long r2 = r9.f184595n
            r8.mo108745Y2(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "sendAppMsg MsgId:"
            r2.append(r3)
            long r3 = r8.getMsgId()
            r2.append(r3)
            java.lang.String r3 = " SvrId: "
            r2.append(r3)
            long r3 = r8.mo108774y2()
            r2.append(r3)
            java.lang.String r3 = " msgSourceBefore:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " msgSourceAfter:"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "MicroMsg.SendAppMsgPPC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0107:
            if (r0 != 0) goto L_0x010d
            r0 = 5
            r8.mo100991d(r0)
        L_0x010d:
            di3.d r7 = di3.C86312j.m106911c(r7)
            com.tencent.mm.plugin.messenger.foundation.t r7 = (com.tencent.p014mm.plugin.messenger.foundation.C69843t) r7
            com.tencent.mm.storage.g4 r7 = r7.mo96095LE()
            long r0 = r8.getMsgId()
            r7.xy0(r0, r8)
            java.lang.Class<pw.c> r7 = p654pw.C100971c.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            pw.c r7 = (p654pw.C100971c) r7
            long r0 = r8.getMsgId()
            r7.Bh0(r0)
            com.tencent.mm.modelstat.ChattingOperationUitl r7 = com.tencent.p014mm.modelstat.ChattingOperationUitl.f48963f
            int r0 = com.tencent.p014mm.message.C40339m.m43520a(r8)
            r7.mo21922e(r8, r0)
            bn.d r7 = new bn.d
            r7.<init>(r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kd3.C99127b.processAction(com.tencent.mm.sdk.pipeline.PipelineState, bn.c, wx3.d):java.lang.Object");
    }
}
