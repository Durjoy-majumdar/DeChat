package com.tencent.p014mm.plugin.sns.p106ui.widget;

import a14.C0000n0;
import a14.C53916l;
import a14.C53921m;
import a14.C53930o0;
import a14.C53959v2;
import a14.C53973z1;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import c14.C54624g;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p104ad.widget.alphavideo.AdAlphaPlayerView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import com.tencent.xweb.IXWebBroadcastListener;
import d14.C58017a1;
import d14.C58085t0;
import d14.C58097y0;
import d14.C58100z0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gv2.C98232g;
import gy3.C87412m;
import gy3.C87413o;
import j03.C21147f;
import j03.C60698b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import ou2.C100508k;
import ou2.C100509l;
import p329d3.C86165a;
import rx3.C13598b0;
import sx3.C64175a0;
import wq2.C111834f;
import wq2.C111835g;
import wq2.C111836h;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010S\u001a\u00020R\u0012\b\u0010U\u001a\u0004\u0018\u00010T¢\u0006\u0004\bV\u0010WJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R,\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R,\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019R(\u0010(\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u00101\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00109\u001a\u0004\u0018\u0001028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010A\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010H\u001a\u00020B2\u0006\u0010C\u001a\u00020B8V@VX\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001c\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0I8VX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u001c\u0010N\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010I8VX\u0004¢\u0006\u0006\u001a\u0004\bM\u0010KR\u0014\u0010Q\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006X"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/SnsAdBreakFrameVideoView;", "Landroid/widget/FrameLayout;", "Lou2/l;", "Lou2/k;", "", "alpha", "Lrx3/b0;", "setFrameLayoutAlpha", "", "getCurrentPosInMills", "Lcom/tencent/mm/plugin/sns/ad/widget/alphavideo/AdAlphaPlayerView;", "d", "Lcom/tencent/mm/plugin/sns/ad/widget/alphavideo/AdAlphaPlayerView;", "getMPlayerView", "()Lcom/tencent/mm/plugin/sns/ad/widget/alphavideo/AdAlphaPlayerView;", "setMPlayerView", "(Lcom/tencent/mm/plugin/sns/ad/widget/alphavideo/AdAlphaPlayerView;)V", "mPlayerView", "Ld3/a;", "Ljava/lang/Void;", "e", "Ld3/a;", "getDetachedListener", "()Ld3/a;", "setDetachedListener", "(Ld3/a;)V", "detachedListener", "Landroid/content/res/Configuration;", "f", "getOnConfigurationChangeListener", "setOnConfigurationChangeListener", "onConfigurationChangeListener", "", "Landroid/view/View;", "g", "Ljava/util/List;", "getToRemoveViewList", "()Ljava/util/List;", "setToRemoveViewList", "(Ljava/util/List;)V", "toRemoveViewList", "Lkotlin/Function0;", "", "h", "Lfy3/a;", "getCanClickAction", "()Lfy3/a;", "setCanClickAction", "(Lfy3/a;)V", "canClickAction", "Landroid/graphics/Rect;", "i", "Landroid/graphics/Rect;", "getCanClickArea", "()Landroid/graphics/Rect;", "setCanClickArea", "(Landroid/graphics/Rect;)V", "canClickArea", "La14/n0;", "j", "La14/n0;", "getScope", "()La14/n0;", "setScope", "(La14/n0;)V", "scope", "", "value", "getRenderMode", "()I", "setRenderMode", "(I)V", "renderMode", "Ld14/y0;", "getCompletionFlow", "()Ld14/y0;", "completionFlow", "getRenderFlow", "renderFlow", "getDurationMs", "()J", "durationMs", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView */
public final class SnsAdBreakFrameVideoView extends FrameLayout implements C100509l, C100508k {

    /* renamed from: p */
    public static final /* synthetic */ int f281420p = 0;

    /* renamed from: d */
    public AdAlphaPlayerView f281421d;

    /* renamed from: e */
    public C86165a<Void> f281422e;

    /* renamed from: f */
    public C86165a<Configuration> f281423f;

    /* renamed from: g */
    public List<View> f281424g = new ArrayList();

    /* renamed from: h */
    public C32224a<Boolean> f281425h;

    /* renamed from: i */
    public Rect f281426i;

    /* renamed from: j */
    public C0000n0 f281427j;

    /* renamed from: n */
    public int f281428n;

    /* renamed from: o */
    public C58085t0<Boolean> f281429o = C58017a1.m67173b(1, 0, (C54624g) null, 6, (Object) null);

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2", mo125469f = "SnsAdBreakFrameVideoView.kt", mo125470l = {352}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$a */
    public static final class C96279a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f281430d;

        /* renamed from: e */
        public Object f281431e;

        /* renamed from: f */
        public Object f281432f;

        /* renamed from: g */
        public Object f281433g;

        /* renamed from: h */
        public int f281434h;

        /* renamed from: i */
        public final /* synthetic */ SnsAdBreakFrameVideoView f281435i;

        /* renamed from: j */
        public final /* synthetic */ String f281436j;

        /* renamed from: n */
        public final /* synthetic */ FrameLayout.LayoutParams f281437n;

        /* renamed from: o */
        public final /* synthetic */ String f281438o;

        /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$a$a */
        public static final class C30471a extends C87413o implements C32226l<Throwable, C13598b0> {

            /* renamed from: d */
            public static final C30471a f82129d = new C30471a();

            public C30471a() {
                super(1);
            }

            public Object invoke(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2$1$1");
                Throwable th = (Throwable) obj;
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2$1$1");
                Log.m105921e("SnsAdCoverVideoView", "prepare called with Exception " + th, th);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2$1$1");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2$1$1");
                return b0Var;
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$a$b */
        public static final class C30472b<T> implements C86165a {

            /* renamed from: a */
            public final /* synthetic */ C53916l<C13598b0> f82130a;

            public C30472b(C53916l<? super C13598b0> lVar) {
                this.f82130a = lVar;
            }

            public void accept(Object obj) {
                SnsMethodCalculate.markStartTimeMs("accept", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2$1$2");
                Void voidR = (Void) obj;
                SnsMethodCalculate.markStartTimeMs("accept", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2$1$2");
                C53916l<C13598b0> lVar = this.f82130a;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
                SnsMethodCalculate.markEndTimeMs("accept", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2$1$2");
                SnsMethodCalculate.markEndTimeMs("accept", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2$1$2");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96279a(SnsAdBreakFrameVideoView snsAdBreakFrameVideoView, String str, FrameLayout.LayoutParams layoutParams, String str2, C15601d<? super C96279a> dVar) {
            super(2, dVar);
            this.f281435i = snsAdBreakFrameVideoView;
            this.f281436j = str;
            this.f281437n = layoutParams;
            this.f281438o = str2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2");
            C96279a aVar = new C96279a(this.f281435i, this.f281436j, this.f281437n, this.f281438o, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2");
            Object invokeSuspend = ((C96279a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2");
            int i = this.f281434h;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SnsAdBreakFrameVideoView snsAdBreakFrameVideoView = this.f281435i;
                String str = this.f281436j;
                FrameLayout.LayoutParams layoutParams = this.f281437n;
                String str2 = this.f281438o;
                this.f281430d = snsAdBreakFrameVideoView;
                this.f281431e = str;
                this.f281432f = layoutParams;
                this.f281433g = str2;
                this.f281434h = 1;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                mVar.mo74599v(C30471a.f82129d);
                if (str == null) {
                    str = "";
                }
                C30472b bVar = new C30472b(mVar);
                snsAdBreakFrameVideoView.getClass();
                SnsMethodCalculate.markStartTimeMs("startPrepare", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
                Log.m105918d("SnsAdCoverVideoView", "startPrepare() called with: videoPath = " + str);
                C0000n0 n0Var = snsAdBreakFrameVideoView.f281427j;
                if (n0Var != null) {
                    C53930o0.m60556c(n0Var, (CancellationException) null);
                }
                snsAdBreakFrameVideoView.f281427j = C53930o0.m60561h(C53930o0.m60555b(), C53959v2.m60598a((C53973z1) null, 1, (Object) null));
                AdAlphaPlayerView adAlphaPlayerView = snsAdBreakFrameVideoView.f281421d;
                if (adAlphaPlayerView != null) {
                    adAlphaPlayerView.mo151886g();
                }
                snsAdBreakFrameVideoView.removeView(snsAdBreakFrameVideoView.f281421d);
                AdAlphaPlayerView adAlphaPlayerView2 = new AdAlphaPlayerView(snsAdBreakFrameVideoView.getContext());
                snsAdBreakFrameVideoView.f281421d = adAlphaPlayerView2;
                adAlphaPlayerView2.setOnPrepared(bVar);
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-1, -1);
                }
                snsAdBreakFrameVideoView.addView(snsAdBreakFrameVideoView.f281421d, 0, layoutParams);
                Log.m105918d("SnsAdCoverVideoView", "startPrepare() called with: videoPath = " + str);
                C115669n.INSTANCE.mo175911u(1913, 0);
                AdAlphaPlayerView adAlphaPlayerView3 = snsAdBreakFrameVideoView.f281421d;
                if (adAlphaPlayerView3 != null) {
                    String i2 = C86013q1.m106448i(str, false);
                    int i3 = snsAdBreakFrameVideoView.f281428n;
                    C98232g gVar = new C98232g(snsAdBreakFrameVideoView);
                    SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                    adAlphaPlayerView3.f316173h = i2;
                    if (str2 != null) {
                        adAlphaPlayerView3.f316179q = str2;
                    }
                    SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                    adAlphaPlayerView3.f316175j = i3;
                    adAlphaPlayerView3.f316174i = false;
                    adAlphaPlayerView3.f316172g = gVar;
                    gVar.mo137531c(1);
                    SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                    SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                }
                try {
                    AdAlphaPlayerView adAlphaPlayerView4 = snsAdBreakFrameVideoView.f281421d;
                    if (adAlphaPlayerView4 != null) {
                        adAlphaPlayerView4.mo151883d();
                    }
                } catch (Throwable th) {
                    Log.m105920e("SnsAdCoverVideoView", th.toString());
                }
                Log.m105924i("SnsAdCoverVideoView", "startPrepare() init end ");
                SnsMethodCalculate.markEndTimeMs("startPrepare", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
                if (mVar.mo74608o() == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2");
                    return aVar;
                }
            } else if (i == 1) {
                String str3 = (String) this.f281433g;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f281432f;
                String str4 = (String) this.f281431e;
                SnsAdBreakFrameVideoView snsAdBreakFrameVideoView2 = (SnsAdBreakFrameVideoView) this.f281430d;
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2");
                throw illegalStateException;
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2");
            return b0Var;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView", mo125469f = "SnsAdBreakFrameVideoView.kt", mo125470l = {173}, mo125471m = "seek")
    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$b */
    public static final class C96280b extends C66704d {

        /* renamed from: d */
        public Object f281439d;

        /* renamed from: e */
        public Object f281440e;

        /* renamed from: f */
        public /* synthetic */ Object f281441f;

        /* renamed from: g */
        public final /* synthetic */ SnsAdBreakFrameVideoView f281442g;

        /* renamed from: h */
        public int f281443h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96280b(SnsAdBreakFrameVideoView snsAdBreakFrameVideoView, C15601d<? super C96280b> dVar) {
            super(dVar);
            this.f281442g = snsAdBreakFrameVideoView;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$1");
            this.f281441f = obj;
            this.f281443h |= Integer.MIN_VALUE;
            Object c = this.f281442g.mo133979c(0, false, (C32224a<Boolean>) null, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$1");
            return c;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2", mo125469f = "SnsAdBreakFrameVideoView.kt", mo125470l = {352, 199, 210, 222}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$c */
    public static final class C96281c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public long f281444d;

        /* renamed from: e */
        public Object f281445e;

        /* renamed from: f */
        public int f281446f;

        /* renamed from: g */
        public int f281447g;

        /* renamed from: h */
        public final /* synthetic */ SnsAdBreakFrameVideoView f281448h;

        /* renamed from: i */
        public final /* synthetic */ long f281449i;

        /* renamed from: j */
        public final /* synthetic */ boolean f281450j;

        /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$c$a */
        public static final class C96282a implements ITPPlayerListener.IOnSeekCompleteListener {

            /* renamed from: d */
            public final /* synthetic */ C53916l<C13598b0> f281451d;

            /* renamed from: e */
            public final /* synthetic */ SnsAdBreakFrameVideoView f281452e;

            public C96282a(C53916l<? super C13598b0> lVar, SnsAdBreakFrameVideoView snsAdBreakFrameVideoView) {
                this.f281451d = lVar;
                this.f281452e = snsAdBreakFrameVideoView;
            }

            public final void onSeekComplete(ITPPlayer iTPPlayer) {
                C60698b bVar;
                SnsMethodCalculate.markStartTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2$1$1");
                C53916l<C13598b0> lVar = this.f281451d;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
                AdAlphaPlayerView mPlayerView = this.f281452e.getMPlayerView();
                if (!(mPlayerView == null || (bVar = mPlayerView.f316170e) == null)) {
                    ((C21147f) bVar).setOnSeekCompleteListener((ITPPlayerListener.IOnSeekCompleteListener) null);
                }
                SnsMethodCalculate.markEndTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2$1$1");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$c$b */
        public static final class C96283b extends C87413o implements C32226l<Throwable, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ SnsAdBreakFrameVideoView f281453d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C96283b(SnsAdBreakFrameVideoView snsAdBreakFrameVideoView) {
                super(1);
                this.f281453d = snsAdBreakFrameVideoView;
            }

            public Object invoke(Object obj) {
                C60698b bVar;
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2$1$2");
                Throwable th = (Throwable) obj;
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2$1$2");
                AdAlphaPlayerView mPlayerView = this.f281453d.getMPlayerView();
                if (!(mPlayerView == null || (bVar = mPlayerView.f316170e) == null)) {
                    ((C21147f) bVar).setOnSeekCompleteListener((ITPPlayerListener.IOnSeekCompleteListener) null);
                }
                Log.m105921e("SnsAdCoverVideoView", "seek called with Exception " + th, th);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2$1$2");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2$1$2");
                return b0Var;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96281c(SnsAdBreakFrameVideoView snsAdBreakFrameVideoView, long j, boolean z, C15601d<? super C96281c> dVar) {
            super(2, dVar);
            this.f281448h = snsAdBreakFrameVideoView;
            this.f281449i = j;
            this.f281450j = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2");
            C96281c cVar = new C96281c(this.f281448h, this.f281449i, this.f281450j, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2");
            return cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2");
            Object invokeSuspend = ((C96281c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2");
            return invokeSuspend;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:59:0x011d, code lost:
            r5 = r5.f316170e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00d8  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00df  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00e7  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x010f  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0121  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0128  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0130  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0156  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x015f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r1 = r16
                xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
                java.lang.String r3 = "invokeSuspend"
                java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                int r0 = r1.f281447g
                r7 = 2
                r8 = 4
                r12 = 1
                r13 = 3
                r14 = 0
                java.lang.String r15 = "SnsAdCoverVideoView"
                if (r0 == 0) goto L_0x0055
                if (r0 == r12) goto L_0x004b
                if (r0 == r7) goto L_0x003f
                if (r0 == r13) goto L_0x0032
                if (r0 != r8) goto L_0x0027
                kotlin.ResultKt.throwOnFailure(r17)
                r5 = r17
                r0 = r1
                goto L_0x0191
            L_0x0027:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                throw r0
            L_0x0032:
                int r0 = r1.f281446f
                kotlin.ResultKt.throwOnFailure(r17)
                r7 = r4
                r5 = 50
                r4 = r3
                r3 = r2
                r2 = r1
                goto L_0x0148
            L_0x003f:
                int r0 = r1.f281446f
                kotlin.ResultKt.throwOnFailure(r17)
                r6 = r4
                r5 = 2
                r4 = r3
                r3 = r2
                r2 = r1
                goto L_0x0100
            L_0x004b:
                long r10 = r1.f281444d
                java.lang.Object r0 = r1.f281445e
                com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r0 = (com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdBreakFrameVideoView) r0
                kotlin.ResultKt.throwOnFailure(r17)
                goto L_0x00c5
            L_0x0055:
                kotlin.ResultKt.throwOnFailure(r17)
                com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r0 = r1.f281448h
                com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView r0 = r0.getMPlayerView()
                if (r0 == 0) goto L_0x006b
                j03.b r0 = r0.f316170e
                if (r0 == 0) goto L_0x006b
                j03.f r0 = (j03.C21147f) r0
                long r10 = r0.getCurrentPositionMs()
                goto L_0x006d
            L_0x006b:
                r10 = 0
            L_0x006d:
                com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r0 = r1.f281448h
                long r5 = r1.f281449i
                r1.f281445e = r0
                r1.f281444d = r10
                r1.f281447g = r12
                a14.m r8 = new a14.m
                wx3.d r7 = xx3.C66447b.m78392b(r16)
                r8.<init>(r7, r12)
                r8.mo74609p()
                com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView r7 = r0.getMPlayerView()
                if (r7 == 0) goto L_0x0097
                j03.b r7 = r7.f316170e
                if (r7 == 0) goto L_0x0097
                com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$c$a r9 = new com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$c$a
                r9.<init>(r8, r0)
                j03.f r7 = (j03.C21147f) r7
                r7.setOnSeekCompleteListener(r9)
            L_0x0097:
                com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$c$b r7 = new com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$c$b
                r7.<init>(r0)
                r8.mo74599v(r7)
                com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView r0 = r0.getMPlayerView()     // Catch:{ all -> 0x00b0 }
                if (r0 == 0) goto L_0x00bb
                j03.b r0 = r0.f316170e     // Catch:{ all -> 0x00b0 }
                if (r0 == 0) goto L_0x00bb
                int r6 = (int) r5     // Catch:{ all -> 0x00b0 }
                j03.f r0 = (j03.C21147f) r0     // Catch:{ all -> 0x00b0 }
                r0.seekTo(r6, r13)     // Catch:{ all -> 0x00b0 }
                goto L_0x00bb
            L_0x00b0:
                r0 = move-exception
                java.lang.Object[] r5 = new java.lang.Object[r12]
                r5[r14] = r0
                java.lang.String r0 = "seek() called with: error"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r0, r5)
            L_0x00bb:
                java.lang.Object r0 = r8.mo74608o()
                if (r0 != r2) goto L_0x00c5
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                return r2
            L_0x00c5:
                long r5 = r1.f281449i
                int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0114
                r0 = r1
            L_0x00cc:
                com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r5 = r0.f281448h
                com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView r5 = r5.getMPlayerView()
                if (r5 == 0) goto L_0x00df
                j03.b r5 = r5.f316170e
                if (r5 == 0) goto L_0x00df
                j03.f r5 = (j03.C21147f) r5
                long r5 = r5.getCurrentPositionMs()
                goto L_0x00e1
            L_0x00df:
                r5 = 0
            L_0x00e1:
                long r7 = r0.f281449i
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 >= 0) goto L_0x015b
                r5 = 0
                r0.f281445e = r5
                r0.f281446f = r14
                r5 = 2
                r0.f281447g = r5
                r6 = 50
                java.lang.Object r8 = a14.C53965x0.m60607b(r6, r0)
                if (r8 != r2) goto L_0x00fb
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                return r2
            L_0x00fb:
                r6 = r4
                r4 = r3
                r3 = r2
                r2 = r0
                r0 = r14
            L_0x0100:
                int r14 = r0 + 1
                if (r14 <= r13) goto L_0x010f
                java.lang.String r0 = "beforeSeekPos < to: delay but current time is not greater than to seek time"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
                r0 = r2
                r2 = r3
                r3 = r4
                r4 = r6
                goto L_0x015b
            L_0x010f:
                r0 = r2
                r2 = r3
                r3 = r4
                r4 = r6
                goto L_0x00cc
            L_0x0114:
                r0 = r1
            L_0x0115:
                com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r5 = r0.f281448h
                com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView r5 = r5.getMPlayerView()
                if (r5 == 0) goto L_0x0128
                j03.b r5 = r5.f316170e
                if (r5 == 0) goto L_0x0128
                j03.f r5 = (j03.C21147f) r5
                long r5 = r5.getCurrentPositionMs()
                goto L_0x012a
            L_0x0128:
                r5 = 0
            L_0x012a:
                long r7 = r0.f281449i
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 <= 0) goto L_0x015b
                r5 = 0
                r0.f281445e = r5
                r0.f281446f = r14
                r0.f281447g = r13
                r5 = 50
                java.lang.Object r7 = a14.C53965x0.m60607b(r5, r0)
                if (r7 != r2) goto L_0x0143
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                return r2
            L_0x0143:
                r7 = r4
                r4 = r3
                r3 = r2
                r2 = r0
                r0 = r14
            L_0x0148:
                int r14 = r0 + 1
                if (r14 <= r13) goto L_0x0156
                java.lang.String r0 = "beforeSeekPos > to: delay but current time is greater than to seek time"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
                r0 = r2
                r2 = r3
                r3 = r4
                r4 = r7
                goto L_0x015b
            L_0x0156:
                r0 = r2
                r2 = r3
                r3 = r4
                r4 = r7
                goto L_0x0115
            L_0x015b:
                boolean r5 = r0.f281450j
                if (r5 == 0) goto L_0x01b8
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "before wait "
                r5.append(r6)
                com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r6 = r0.f281448h
                d14.y0 r6 = r6.getRenderFlow()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r5)
                com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r5 = r0.f281448h
                d14.y0 r5 = r5.getRenderFlow()
                r6 = 0
                if (r5 == 0) goto L_0x0195
                r0.f281445e = r6
                r6 = 4
                r0.f281447g = r6
                java.lang.Object r5 = d14.C58042h.m67199h(r5, r0)
                if (r5 != r2) goto L_0x0191
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                return r2
            L_0x0191:
                r9 = r5
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                goto L_0x0196
            L_0x0195:
                r9 = r6
            L_0x0196:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "end wait "
                r2.append(r5)
                com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r0 = r0.f281448h
                d14.y0 r0 = r0.getRenderFlow()
                r2.append(r0)
                r0 = 32
                r2.append(r0)
                r2.append(r9)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            L_0x01b8:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdBreakFrameVideoView.C96281c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$d */
    public static final class C96284d extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ SnsAdBreakFrameVideoView f281454d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96284d(SnsAdBreakFrameVideoView snsAdBreakFrameVideoView) {
            super(1);
            this.f281454d = snsAdBreakFrameVideoView;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$stop$1");
            View view = (View) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$stop$1");
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            this.f281454d.removeView(view);
            Boolean bool = Boolean.TRUE;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$stop$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$stop$1");
            return bool;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsAdBreakFrameVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
    }

    /* renamed from: a */
    public void mo133977a(FrameLayout.LayoutParams layoutParams) {
        SnsMethodCalculate.markStartTimeMs("updateLayoutParams", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        if (layoutParams == null) {
            SnsMethodCalculate.markEndTimeMs("updateLayoutParams", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
            return;
        }
        AdAlphaPlayerView adAlphaPlayerView = this.f281421d;
        if (adAlphaPlayerView != null) {
            adAlphaPlayerView.setLayoutParams(layoutParams);
        }
        requestLayout();
        SnsMethodCalculate.markEndTimeMs("updateLayoutParams", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r2 == true) goto L_0x001f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo133978b(java.lang.String r12, android.widget.FrameLayout.LayoutParams r13, java.lang.String r14, wx3.C15601d<? super rx3.C13598b0> r15) {
        /*
            r11 = this;
            java.lang.String r0 = "prepare"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView r2 = r11.f281421d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x001e
            java.lang.String r5 = "isPrepared"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            boolean r2 = r2.f316176n
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            if (r2 != r3) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            if (r3 == 0) goto L_0x0027
            rx3.b0 r12 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r12
        L_0x0027:
            r2 = 10000(0x2710, double:4.9407E-320)
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$a r10 = new com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$a
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r12 = a14.C53860b3.m60375c(r2, r10, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdBreakFrameVideoView.mo133978b(java.lang.String, android.widget.FrameLayout$LayoutParams, java.lang.String, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo133979c(long r16, boolean r18, fy3.C32224a<java.lang.Boolean> r19, wx3.C15601d<? super rx3.C13598b0> r20) {
        /*
            r15 = this;
            r6 = r15
            r0 = r20
            java.lang.String r7 = "seek"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdBreakFrameVideoView.C96280b
            if (r1 == 0) goto L_0x001e
            r1 = r0
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$b r1 = (com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdBreakFrameVideoView.C96280b) r1
            int r2 = r1.f281443h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001e
            int r2 = r2 - r3
            r1.f281443h = r2
            goto L_0x0023
        L_0x001e:
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$b r1 = new com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$b
            r1.<init>(r15, r0)
        L_0x0023:
            r9 = r1
            java.lang.Object r0 = r9.f281441f
            xx3.a r10 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r9.f281443h
            r11 = 1
            if (r1 == 0) goto L_0x0047
            if (r1 != r11) goto L_0x003c
            java.lang.Object r1 = r9.f281440e
            fy3.a r1 = (fy3.C32224a) r1
            java.lang.Object r2 = r9.f281439d
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r2 = (com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdBreakFrameVideoView) r2
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r1
            goto L_0x006b
        L_0x003c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            throw r0
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r0)
            r12 = 1000(0x3e8, double:4.94E-321)
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$c r14 = new com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$c
            r5 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r4 = r18
            r0.<init>(r1, r2, r4, r5)
            r9.f281439d = r6
            r0 = r19
            r9.f281440e = r0
            r9.f281443h = r11
            java.lang.Object r1 = a14.C53860b3.m60375c(r12, r14, r9)
            if (r1 != r10) goto L_0x006a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r10
        L_0x006a:
            r2 = r6
        L_0x006b:
            if (r0 == 0) goto L_0x0084
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = "SnsAdCoverVideoView"
            java.lang.String r1 = "try resume play"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r2.resume()
        L_0x0084:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdBreakFrameVideoView.mo133979c(long, boolean, fy3.a, wx3.d):java.lang.Object");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        C32224a<Boolean> aVar = this.f281425h;
        Rect rect = this.f281426i;
        if (motionEvent == null || aVar == null || rect == null) {
            Log.m105918d("SnsAdCoverVideoView", "dispatchTouchEvent() called with: ev = " + motionEvent);
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
            return dispatchTouchEvent;
        } else if (motionEvent.getX() <= ((float) rect.left) || motionEvent.getX() >= ((float) rect.right) || motionEvent.getY() <= ((float) rect.top) || motionEvent.getY() >= ((float) rect.bottom) || !aVar.invoke().booleanValue()) {
            Log.m105918d("SnsAdCoverVideoView", "dispatchTouchEvent dont try call click");
            SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
            return false;
        } else {
            Log.m105918d("SnsAdCoverVideoView", "dispatchTouchEvent() called with: ev = " + motionEvent);
            boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
            SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
            return dispatchTouchEvent2;
        }
    }

    public final C32224a<Boolean> getCanClickAction() {
        SnsMethodCalculate.markStartTimeMs("getCanClickAction", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        C32224a<Boolean> aVar = this.f281425h;
        SnsMethodCalculate.markEndTimeMs("getCanClickAction", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        return aVar;
    }

    public final Rect getCanClickArea() {
        SnsMethodCalculate.markStartTimeMs("getCanClickArea", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        Rect rect = this.f281426i;
        SnsMethodCalculate.markEndTimeMs("getCanClickArea", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        return rect;
    }

    public C58097y0<Boolean> getCompletionFlow() {
        SnsMethodCalculate.markStartTimeMs("getCompletionFlow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        C58085t0<Boolean> t0Var = this.f281429o;
        SnsMethodCalculate.markEndTimeMs("getCompletionFlow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        return t0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = r2.f316170e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long getCurrentPosInMills() {
        /*
            r4 = this;
            java.lang.String r0 = "getCurrentPosInMills"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView r2 = r4.f281421d
            if (r2 == 0) goto L_0x0016
            j03.b r2 = r2.f316170e
            if (r2 == 0) goto L_0x0016
            j03.f r2 = (j03.C21147f) r2
            long r2 = r2.getCurrentPositionMs()
            goto L_0x0018
        L_0x0016:
            r2 = -1
        L_0x0018:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdBreakFrameVideoView.getCurrentPosInMills():long");
    }

    public final C86165a<Void> getDetachedListener() {
        SnsMethodCalculate.markStartTimeMs("getDetachedListener", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        C86165a<Void> aVar = this.f281422e;
        SnsMethodCalculate.markEndTimeMs("getDetachedListener", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = r2.f316170e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long getDurationMs() {
        /*
            r4 = this;
            java.lang.String r0 = "getDurationMs"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView r2 = r4.f281421d
            if (r2 == 0) goto L_0x0016
            j03.b r2 = r2.f316170e
            if (r2 == 0) goto L_0x0016
            j03.f r2 = (j03.C21147f) r2
            long r2 = r2.getDurationMs()
            goto L_0x0018
        L_0x0016:
            r2 = 0
        L_0x0018:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdBreakFrameVideoView.getDurationMs():long");
    }

    public final AdAlphaPlayerView getMPlayerView() {
        SnsMethodCalculate.markStartTimeMs("getMPlayerView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        AdAlphaPlayerView adAlphaPlayerView = this.f281421d;
        SnsMethodCalculate.markEndTimeMs("getMPlayerView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        return adAlphaPlayerView;
    }

    public final C86165a<Configuration> getOnConfigurationChangeListener() {
        SnsMethodCalculate.markStartTimeMs("getOnConfigurationChangeListener", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        C86165a<Configuration> aVar = this.f281423f;
        SnsMethodCalculate.markEndTimeMs("getOnConfigurationChangeListener", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        return aVar;
    }

    public C58097y0<Boolean> getRenderFlow() {
        SnsMethodCalculate.markStartTimeMs("getRenderFlow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        AdAlphaPlayerView adAlphaPlayerView = this.f281421d;
        C58097y0<Boolean> onFrameRenderedFlow = adAlphaPlayerView != null ? adAlphaPlayerView.getOnFrameRenderedFlow() : null;
        SnsMethodCalculate.markEndTimeMs("getRenderFlow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        return onFrameRenderedFlow;
    }

    public int getRenderMode() {
        SnsMethodCalculate.markStartTimeMs("getRenderMode", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        int i = this.f281428n;
        SnsMethodCalculate.markEndTimeMs("getRenderMode", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        return i;
    }

    public final C0000n0 getScope() {
        SnsMethodCalculate.markStartTimeMs("getScope", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        C0000n0 n0Var = this.f281427j;
        SnsMethodCalculate.markEndTimeMs("getScope", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        return n0Var;
    }

    public final List<View> getToRemoveViewList() {
        SnsMethodCalculate.markStartTimeMs("getToRemoveViewList", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        List<View> list = this.f281424g;
        SnsMethodCalculate.markEndTimeMs("getToRemoveViewList", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        return list;
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        super.onAttachedToWindow();
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        super.onConfigurationChanged(configuration);
        Log.m105924i("SnsAdCoverVideoView", "onConfigurationChanged");
        C86165a<Configuration> aVar = this.f281423f;
        if (aVar != null) {
            aVar.accept(configuration);
        }
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        super.onDetachedFromWindow();
        C86165a<Void> aVar = this.f281422e;
        if (aVar != null) {
            aVar.accept(null);
        }
        this.f281422e = null;
        this.f281423f = null;
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
    }

    public void pause() {
        SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        AdAlphaPlayerView adAlphaPlayerView = this.f281421d;
        if (adAlphaPlayerView != null) {
            SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            C111836h.m152498e("AdAlphaPlayerView", "pauseAd");
            adAlphaPlayerView.f316177o = false;
            C111834f fVar = adAlphaPlayerView.f316172g;
            if (fVar != null) {
                fVar.mo137531c(3);
            }
            try {
                C60698b bVar = adAlphaPlayerView.f316170e;
                if (bVar != null) {
                    ((C21147f) bVar).pause();
                }
                C111835g gVar = adAlphaPlayerView.f316169d;
                if (gVar != null) {
                    SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
                    gVar.f316198o = true;
                    SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
                }
            } catch (Throwable th) {
                C111836h.m152496c("AdAlphaPlayerView", "pause failed", th);
            }
            SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        }
        Log.m105924i("SnsAdCoverVideoView", "pause");
        SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
    }

    public void resume() {
        SnsMethodCalculate.markStartTimeMs("resume", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        AdAlphaPlayerView adAlphaPlayerView = this.f281421d;
        if (adAlphaPlayerView != null) {
            adAlphaPlayerView.mo151884e();
        }
        Log.m105924i("SnsAdCoverVideoView", "resume");
        SnsMethodCalculate.markEndTimeMs("resume", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
    }

    public final void setCanClickAction(C32224a<Boolean> aVar) {
        SnsMethodCalculate.markStartTimeMs("setCanClickAction", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        this.f281425h = aVar;
        SnsMethodCalculate.markEndTimeMs("setCanClickAction", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
    }

    public final void setCanClickArea(Rect rect) {
        SnsMethodCalculate.markStartTimeMs("setCanClickArea", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        this.f281426i = rect;
        SnsMethodCalculate.markEndTimeMs("setCanClickArea", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
    }

    public final void setDetachedListener(C86165a<Void> aVar) {
        SnsMethodCalculate.markStartTimeMs("setDetachedListener", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        this.f281422e = aVar;
        SnsMethodCalculate.markEndTimeMs("setDetachedListener", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
    }

    public void setFrameLayoutAlpha(float f) {
        SnsMethodCalculate.markStartTimeMs("setFrameLayoutAlpha", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        Log.m105924i("SnsAdCoverVideoView", "setFrameLayoutAlpha " + f);
        setAlpha(f);
        SnsMethodCalculate.markEndTimeMs("setFrameLayoutAlpha", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
    }

    public final void setMPlayerView(AdAlphaPlayerView adAlphaPlayerView) {
        SnsMethodCalculate.markStartTimeMs("setMPlayerView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        this.f281421d = adAlphaPlayerView;
        SnsMethodCalculate.markEndTimeMs("setMPlayerView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
    }

    public final void setOnConfigurationChangeListener(C86165a<Configuration> aVar) {
        SnsMethodCalculate.markStartTimeMs("setOnConfigurationChangeListener", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        this.f281423f = aVar;
        SnsMethodCalculate.markEndTimeMs("setOnConfigurationChangeListener", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
    }

    public void setRenderMode(int i) {
        SnsMethodCalculate.markStartTimeMs("setRenderMode", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        this.f281428n = i;
        SnsMethodCalculate.markEndTimeMs("setRenderMode", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
    }

    public final void setScope(C0000n0 n0Var) {
        SnsMethodCalculate.markStartTimeMs("setScope", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        this.f281427j = n0Var;
        SnsMethodCalculate.markEndTimeMs("setScope", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
    }

    public final void setToRemoveViewList(List<View> list) {
        SnsMethodCalculate.markStartTimeMs("setToRemoveViewList", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        C87412m.m108594g(list, "<set-?>");
        this.f281424g = list;
        SnsMethodCalculate.markEndTimeMs("setToRemoveViewList", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
    }

    public void start() {
        SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        AdAlphaPlayerView adAlphaPlayerView = this.f281421d;
        if (adAlphaPlayerView != null) {
            adAlphaPlayerView.mo151884e();
        }
        Log.m105924i("SnsAdCoverVideoView", IXWebBroadcastListener.STAGE_START);
        SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
    }

    public void stop() {
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
        C0000n0 n0Var = this.f281427j;
        if (n0Var != null) {
            C53930o0.m60556c(n0Var, (CancellationException) null);
        }
        this.f281427j = null;
        AdAlphaPlayerView adAlphaPlayerView = this.f281421d;
        if (adAlphaPlayerView != null) {
            adAlphaPlayerView.setPrepared(false);
        }
        ((C58100z0) this.f281429o).mo82832d(null);
        AdAlphaPlayerView adAlphaPlayerView2 = this.f281421d;
        if (adAlphaPlayerView2 != null) {
            adAlphaPlayerView2.mo151886g();
        }
        removeView(this.f281421d);
        C64175a0.m75512t(this.f281424g, new C96284d(this));
        this.f281421d = null;
        this.f281426i = null;
        this.f281425h = null;
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
    }
}
