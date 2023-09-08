package bv2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$startProgressMonitor$1", mo125469f = "VideoResourceDownloaderDelegate.kt", mo125470l = {66}, mo125471m = "invokeSuspend")
/* renamed from: bv2.i */
public final class C92323i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f264179d;

    /* renamed from: e */
    public /* synthetic */ Object f264180e;

    /* renamed from: f */
    public final /* synthetic */ C92320h f264181f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92323i(C92320h hVar, C15601d<? super C92323i> dVar) {
        super(2, dVar);
        this.f264181f = hVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$startProgressMonitor$1");
        C92323i iVar = new C92323i(this.f264181f, dVar);
        iVar.f264180e = obj;
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$startProgressMonitor$1");
        return iVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$startProgressMonitor$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$startProgressMonitor$1");
        Object invokeSuspend = ((C92323i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$startProgressMonitor$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$startProgressMonitor$1");
        return invokeSuspend;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: a14.n0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$startProgressMonitor$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r8.f264179d
            r4 = 1
            if (r3 == 0) goto L_0x0024
            if (r3 != r4) goto L_0x0019
            java.lang.Object r3 = r8.f264180e
            a14.n0 r3 = (a14.C0000n0) r3
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x002c
        L_0x0019:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r9
        L_0x0024:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.f264180e
            r3 = r9
            a14.n0 r3 = (a14.C0000n0) r3
        L_0x002c:
            boolean r9 = a14.C53930o0.m60560g(r3)
            if (r9 == 0) goto L_0x005d
            bv2.h r9 = r8.f264181f
            bv2.h$a r9 = bv2.C92320h.m116113a(r9)
            bv2.h r5 = r8.f264181f
            java.lang.String r6 = "access$getDownloader$p"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            f03.h r5 = r5.f264173a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            float r5 = r5.mo134531d()
            r9.onProgress(r5)
            r5 = 500(0x1f4, double:2.47E-321)
            r8.f264180e = r3
            r8.f264179d = r4
            java.lang.Object r9 = a14.C53965x0.m60607b(r5, r8)
            if (r9 != r2) goto L_0x002c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x005d:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bv2.C92323i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
