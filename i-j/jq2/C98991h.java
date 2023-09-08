package jq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import d14.C45253g;
import te3.C101804kv2;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: jq2.h */
public final class C98991h<T> implements C45253g {

    /* renamed from: d */
    public final /* synthetic */ C45253g f290249d;

    /* renamed from: e */
    public final /* synthetic */ C101804kv2 f290250e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3$invokeSuspend$$inlined$map$1$2", mo125469f = "AdMediaDownloadHelper.kt", mo125470l = {231}, mo125471m = "emit")
    /* renamed from: jq2.h$a */
    public static final class C98992a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f290251d;

        /* renamed from: e */
        public int f290252e;

        /* renamed from: f */
        public final /* synthetic */ C98991h f290253f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98992a(C98991h hVar, C15601d dVar) {
            super(dVar);
            this.f290253f = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3$invokeSuspend$$inlined$map$1$2$1");
            this.f290251d = obj;
            this.f290252e |= Integer.MIN_VALUE;
            Object emit = this.f290253f.emit((Object) null, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3$invokeSuspend$$inlined$map$1$2$1");
            return emit;
        }
    }

    public C98991h(C45253g gVar, C101804kv2 kv22) {
        this.f290249d = gVar;
        this.f290250e = kv22;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(java.lang.Object r9, wx3.C15601d r10) {
        /*
            r8 = this;
            java.lang.String r0 = "emit"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3$invokeSuspend$$inlined$map$1$2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r10 instanceof jq2.C98991h.C98992a
            if (r2 == 0) goto L_0x001a
            r2 = r10
            jq2.h$a r2 = (jq2.C98991h.C98992a) r2
            int r3 = r2.f290252e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.f290252e = r3
            goto L_0x001f
        L_0x001a:
            jq2.h$a r2 = new jq2.h$a
            r2.<init>(r8, r10)
        L_0x001f:
            java.lang.Object r10 = r2.f290251d
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f290252e
            r5 = 1
            if (r4 == 0) goto L_0x0039
            if (r4 != r5) goto L_0x002e
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x008c
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r9
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r10)
            d14.g r10 = r8.f290249d
            jq2.g$c r9 = (jq2.C98985g.C98988c) r9
            java.lang.String r4 = r9.mo138347a()
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r4 == 0) goto L_0x004b
            goto L_0x005d
        L_0x004b:
            jq2.g$c r9 = new jq2.g$c
            te3.kv2 r4 = r8.f290250e
            java.lang.String r4 = r4.f298689d
            java.lang.String r6 = "media.Id"
            gy3.C87412m.m108593f(r4, r6)
            r6 = 0
            jq2.g$a r7 = jq2.C98985g.C98986a.RESULT_STATE_ERROR
            r9.<init>(r4, r6, r7)
        L_0x005d:
            jq2.g r4 = jq2.C98985g.f290230a
            java.lang.String r4 = "access$getTAG$p"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "sight downloaded "
            r4.append(r6)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "AdMediaDownloadHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r4)
            r2.f290252e = r5
            java.lang.Object r9 = r10.emit(r9, r2)
            if (r9 != r3) goto L_0x008c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L_0x008c:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: jq2.C98991h.emit(java.lang.Object, wx3.d):java.lang.Object");
    }
}
