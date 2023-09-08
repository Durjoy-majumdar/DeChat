package gv2;

import a14.C0000n0;
import a14.C53860b3;
import a14.C53916l;
import a14.C53921m;
import android.widget.FrameLayout;
import c14.C54624g;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdTimelineVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;
import d14.C58017a1;
import d14.C58085t0;
import d14.C58097y0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Result;
import kotlin.ResultKt;
import ou2.C100509l;
import p329d3.C86165a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: gv2.j */
public final class C98235j implements C100509l {

    /* renamed from: d */
    public final SnsAdTimelineVideoView f288016d;

    /* renamed from: e */
    public final C13601g f288017e = C36568h.m40985a(C98236a.f288018d);

    /* renamed from: gv2.j$a */
    public static final class C98236a extends C87413o implements C32224a<C58085t0<Boolean>> {

        /* renamed from: d */
        public static final C98236a f288018d = new C98236a();

        public C98236a() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$completionFlow$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$completionFlow$2");
            C58085t0 b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$completionFlow$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$completionFlow$2");
            return b;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2", mo125469f = "SnsAdTimelineVideoViewKtProxy.kt", mo125470l = {86}, mo125471m = "invokeSuspend")
    /* renamed from: gv2.j$b */
    public static final class C98237b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f288019d;

        /* renamed from: e */
        public Object f288020e;

        /* renamed from: f */
        public int f288021f;

        /* renamed from: g */
        public final /* synthetic */ C98235j f288022g;

        /* renamed from: h */
        public final /* synthetic */ String f288023h;

        /* renamed from: gv2.j$b$a */
        public static final class C32557a<T> implements C86165a {

            /* renamed from: a */
            public final /* synthetic */ C53916l<C13598b0> f86432a;

            public C32557a(C53916l<? super C13598b0> lVar) {
                this.f86432a = lVar;
            }

            public void accept(Object obj) {
                SnsMethodCalculate.markStartTimeMs("accept", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2$1$1");
                Void voidR = (Void) obj;
                SnsMethodCalculate.markStartTimeMs("accept", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2$1$1");
                C53916l<C13598b0> lVar = this.f86432a;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
                SnsMethodCalculate.markEndTimeMs("accept", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2$1$1");
                SnsMethodCalculate.markEndTimeMs("accept", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2$1$1");
            }
        }

        /* renamed from: gv2.j$b$b */
        public static final class C98238b extends C87413o implements C32226l<Throwable, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C98235j f288024d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C98238b(C98235j jVar) {
                super(1);
                this.f288024d = jVar;
            }

            public Object invoke(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2$1$2");
                Throwable th = (Throwable) obj;
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2$1$2");
                C98235j jVar = this.f288024d;
                jVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getVideoView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
                SnsAdTimelineVideoView snsAdTimelineVideoView = jVar.f288016d;
                SnsMethodCalculate.markEndTimeMs("getVideoView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
                snsAdTimelineVideoView.setOnPrepared((C86165a<Void>) null);
                Log.m105921e("SnsAdTimelineVideoViewKtProxy", "prepare called with Exception " + th, th);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2$1$2");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2$1$2");
                return b0Var;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98237b(C98235j jVar, String str, C15601d<? super C98237b> dVar) {
            super(2, dVar);
            this.f288022g = jVar;
            this.f288023h = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2");
            C98237b bVar = new C98237b(this.f288022g, this.f288023h, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2");
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2");
            Object invokeSuspend = ((C98237b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f288021f;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C98235j jVar = this.f288022g;
                String str = this.f288023h;
                this.f288019d = jVar;
                this.f288020e = str;
                this.f288021f = 1;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                jVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getVideoView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
                SnsAdTimelineVideoView snsAdTimelineVideoView = jVar.f288016d;
                SnsMethodCalculate.markEndTimeMs("getVideoView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
                snsAdTimelineVideoView.setOnPrepared(new C32557a(mVar));
                mVar.mo74599v(new C98238b(jVar));
                SnsMethodCalculate.markStartTimeMs("getVideoView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
                SnsAdTimelineVideoView snsAdTimelineVideoView2 = jVar.f288016d;
                SnsMethodCalculate.markEndTimeMs("getVideoView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
                snsAdTimelineVideoView2.setVideoPath(str);
                if (mVar.mo74608o() == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2");
                throw illegalStateException;
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2");
            return b0Var;
        }
    }

    public C98235j(SnsAdTimelineVideoView snsAdTimelineVideoView) {
        C87412m.m108594g(snsAdTimelineVideoView, "videoView");
        this.f288016d = snsAdTimelineVideoView;
    }

    /* renamed from: a */
    public void mo133977a(FrameLayout.LayoutParams layoutParams) {
        SnsMethodCalculate.markStartTimeMs("updateLayoutParams", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        SnsMethodCalculate.markEndTimeMs("updateLayoutParams", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
    }

    /* renamed from: b */
    public Object mo133978b(String str, FrameLayout.LayoutParams layoutParams, String str2, C15601d<? super C13598b0> dVar) {
        SnsMethodCalculate.markStartTimeMs("prepare", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        SnsAdTimelineVideoView snsAdTimelineVideoView = this.f288016d;
        snsAdTimelineVideoView.getClass();
        SnsMethodCalculate.markStartTimeMs("isPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        boolean z = snsAdTimelineVideoView.f281516C;
        SnsMethodCalculate.markEndTimeMs("isPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        if (z) {
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("prepare", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
            return b0Var;
        }
        Object c = C53860b3.m60375c(10000, new C98237b(this, str, (C15601d<? super C98237b>) null), dVar);
        SnsMethodCalculate.markEndTimeMs("prepare", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        return c;
    }

    /* renamed from: c */
    public Object mo133979c(long j, boolean z, C32224a<Boolean> aVar, C15601d<? super C13598b0> dVar) {
        SnsMethodCalculate.markStartTimeMs("seek", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        SnsAdTimelineVideoView snsAdTimelineVideoView = this.f288016d;
        snsAdTimelineVideoView.getClass();
        SnsMethodCalculate.markStartTimeMs("seekTo", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        snsAdTimelineVideoView.mo132294l((int) j, true);
        SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("seek", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        return b0Var;
    }

    public C58097y0<Boolean> getCompletionFlow() {
        SnsMethodCalculate.markStartTimeMs("getCompletionFlow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        C58097y0<Boolean> y0Var = (C58097y0) ((C36570n) this.f288017e).getValue();
        SnsMethodCalculate.markEndTimeMs("getCompletionFlow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        return y0Var;
    }

    public long getCurrentPosInMills() {
        SnsMethodCalculate.markStartTimeMs("getCurrentPosInMills", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        long currentPositionMs = (long) this.f288016d.getCurrentPositionMs();
        SnsMethodCalculate.markEndTimeMs("getCurrentPosInMills", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        return currentPositionMs;
    }

    public long getDurationMs() {
        SnsMethodCalculate.markStartTimeMs("getDurationMs", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        long durationMs = (long) this.f288016d.getDurationMs();
        SnsMethodCalculate.markEndTimeMs("getDurationMs", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        return durationMs;
    }

    public void pause() {
        SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        SnsAdTimelineVideoView snsAdTimelineVideoView = this.f288016d;
        snsAdTimelineVideoView.getClass();
        SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        Log.m105924i("MicroMsg.SnsAdTimelineVideoView", "pause");
        snsAdTimelineVideoView.mo132300r();
        SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
    }

    public void resume() {
        SnsMethodCalculate.markStartTimeMs("resume", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        this.f288016d.mo132296n();
        SnsMethodCalculate.markEndTimeMs("resume", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
    }

    public void setFrameLayoutAlpha(float f) {
        SnsMethodCalculate.markStartTimeMs("setFrameLayoutAlpha", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        Log.m105924i("SnsAdTimelineVideoViewKtProxy", "setFrameLayoutAlpha " + f);
        this.f288016d.setAlpha(f);
        SnsMethodCalculate.markEndTimeMs("setFrameLayoutAlpha", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
    }

    public void start() {
        SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        this.f288016d.mo132296n();
        SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
    }

    public void stop() {
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        this.f288016d.mo134051v();
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
    }
}
