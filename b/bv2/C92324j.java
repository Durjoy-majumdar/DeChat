package bv2;

import a14.C0000n0;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import f03.C97787h;
import fy3.C32227p;
import gy3.C8479f0;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1", mo125469f = "VideoResourceDownloaderDelegate.kt", mo125470l = {28}, mo125471m = "invokeSuspend")
/* renamed from: bv2.j */
public final class C92324j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f264182d;

    /* renamed from: e */
    public int f264183e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<CdnLogic.VideoInfo> f264184f;

    /* renamed from: g */
    public final /* synthetic */ C92320h f264185g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92324j(C8479f0<CdnLogic.VideoInfo> f0Var, C92320h hVar, C15601d<? super C92324j> dVar) {
        super(2, dVar);
        this.f264184f = f0Var;
        this.f264185g = hVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        C92324j jVar = new C92324j(this.f264184f, this.f264185g, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        return jVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        Object invokeSuspend = ((C92324j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(T t) {
        C8479f0<CdnLogic.VideoInfo> f0Var;
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        T t2 = C15911a.COROUTINE_SUSPENDED;
        int i = this.f264183e;
        if (i == 0) {
            ResultKt.throwOnFailure(t);
            C8479f0<CdnLogic.VideoInfo> f0Var2 = this.f264184f;
            C92320h hVar = this.f264185g;
            SnsMethodCalculate.markStartTimeMs("access$getDownloader$p", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
            C97787h hVar2 = hVar.f264173a;
            SnsMethodCalculate.markEndTimeMs("access$getDownloader$p", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
            this.f264182d = f0Var2;
            this.f264183e = 1;
            T k = hVar2.mo134539k(this);
            if (k == t2) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
                return t2;
            }
            f0Var = f0Var2;
            t = k;
        } else if (i == 1) {
            f0Var = (C8479f0) this.f264182d;
            try {
                ResultKt.throwOnFailure(t);
            } catch (CancellationException unused) {
                Log.m105928w("MicroMsg.VideoResourceDownloaderDelegate", "waitForMoovReady job is canceled");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
                return b0Var;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.VideoResourceDownloaderDelegate", e, "waitForMoovReady", new Object[0]);
                C92320h.m116113a(this.f264185g).mo126323b(e);
                C13598b0 b0Var2 = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
                return b0Var2;
            }
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
            throw illegalStateException;
        }
        f0Var.f27484d = t;
        Log.m105924i("MicroMsg.VideoResourceDownloaderDelegate", "onMoovReady");
        C92320h.m116113a(this.f264185g).mo126324c((CdnLogic.VideoInfo) this.f264184f.f27484d);
        C13598b0 b0Var3 = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        return b0Var3;
    }
}
