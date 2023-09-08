package bv2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import f03.C97787h;
import fy3.C32227p;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: bv2.h */
public final class C92320h {

    /* renamed from: a */
    public C97787h f264173a;

    /* renamed from: b */
    public final C92321a f264174b;

    /* renamed from: c */
    public final C0000n0 f264175c = C53930o0.m60555b();

    /* renamed from: d */
    public C53973z1 f264176d;

    /* renamed from: bv2.h$a */
    public interface C92321a {
        /* renamed from: a */
        void mo126322a();

        /* renamed from: b */
        void mo126323b(Exception exc);

        /* renamed from: c */
        void mo126324c(CdnLogic.VideoInfo videoInfo);

        void onProgress(float f);
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1", mo125469f = "VideoResourceDownloaderDelegate.kt", mo125470l = {46}, mo125471m = "invokeSuspend")
    /* renamed from: bv2.h$b */
    public static final class C92322b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f264177d;

        /* renamed from: e */
        public final /* synthetic */ C92320h f264178e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92322b(C92320h hVar, C15601d<? super C92322b> dVar) {
            super(2, dVar);
            this.f264178e = hVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
            C92322b bVar = new C92322b(this.f264178e, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
            Object invokeSuspend = ((C92322b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f264177d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C92320h hVar = this.f264178e;
                SnsMethodCalculate.markStartTimeMs("access$getDownloader$p", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                C97787h hVar2 = hVar.f264173a;
                SnsMethodCalculate.markEndTimeMs("access$getDownloader$p", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                this.f264177d = 1;
                if (hVar2.mo134530c(this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (CancellationException unused) {
                    Log.m105928w("MicroMsg.VideoResourceDownloaderDelegate", "waitForComplete job is canceled");
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
                    return b0Var;
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.VideoResourceDownloaderDelegate", e, "waitForComplete", new Object[0]);
                    C92320h.m116113a(this.f264178e).mo126323b(e);
                    C13598b0 b0Var2 = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
                    return b0Var2;
                }
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
                throw illegalStateException;
            }
            Log.m105924i("MicroMsg.VideoResourceDownloaderDelegate", "video is downloaded completely");
            C92320h.m116113a(this.f264178e).mo126322a();
            C13598b0 b0Var3 = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
            return b0Var3;
        }
    }

    public C92320h(C97787h hVar, C92321a aVar) {
        C87412m.m108594g(hVar, "downloader");
        C87412m.m108594g(aVar, "callback");
        this.f264173a = hVar;
        this.f264174b = aVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ C92321a m116113a(C92320h hVar) {
        SnsMethodCalculate.markStartTimeMs("access$getCallback$p", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
        C92321a aVar = hVar.f264174b;
        SnsMethodCalculate.markEndTimeMs("access$getCallback$p", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
        return aVar;
    }

    /* renamed from: b */
    public final void mo126321b() {
        SnsMethodCalculate.markStartTimeMs("waitForComplete", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
        Log.m105924i("MicroMsg.VideoResourceDownloaderDelegate", "waitForComplete");
        C53895h.m60466d(this.f264175c, (C66212f) null, (C53934p0) null, new C92322b(this, (C15601d<? super C92322b>) null), 3, (Object) null);
        SnsMethodCalculate.markEndTimeMs("waitForComplete", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
    }
}
