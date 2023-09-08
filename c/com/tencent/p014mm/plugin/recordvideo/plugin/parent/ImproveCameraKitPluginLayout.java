package com.tencent.p014mm.plugin.recordvideo.plugin.parent;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.autogen.mmdata.rpt.CameraActionsLogStruct;
import com.tencent.p014mm.media.camera.view.CameraKitView;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.wxmm.v2helper;
import e80.C107254b;
import e80.C107256d;
import e80.C107257e;
import e80.C107258f;
import e80.C107259g;
import e80.C107260h;
import f14.C58901s;
import fh2.C107542g;
import fh2.C32053h;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i80.C108398a;
import ih2.C60287a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import kotlin.ResultKt;
import lh2.C109337b;
import lh2.C109345h0;
import lh2.C109381y0;
import lh2.C34276c;
import nj3.C76879j;
import o40.C61926c;
import qh2.C101198e;
import qo3.C77398g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import th2.C101891f;
import th2.C110990b;
import th2.C110992d;
import v70.C111386a;
import wg2.C102440a;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import y70.C38971a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0014J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0011\u001a\u00020\t8DX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001b\u0010\u0014\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001b\u0010\u0017\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u001b\u0010\u001a\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\r¨\u0006!"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/ImproveCameraKitPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/CameraKitPluginLayout;", "Li80/a;", "", "visible", "Lrx3/b0;", "setPluginVisibility", "getLayoutId", "setPluginViewVisible", "Landroid/view/View;", "B", "Lrx3/g;", "getCaptureLayout", "()Landroid/view/View;", "captureLayout", "C", "getCameraView", "cameraView", "D", "getCloseView", "closeView", "E", "getCaptureHintView", "captureHintView", "F", "getCapturePermissionJumperView", "capturePermissionJumperView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout */
public class ImproveCameraKitPluginLayout extends CameraKitPluginLayout implements C108398a {

    /* renamed from: L */
    public static final /* synthetic */ int f315352L = 0;

    /* renamed from: A */
    public final C109381y0 f315353A;

    /* renamed from: B */
    public final C13601g f315354B = C36568h.m40985a(new C105958c(this));

    /* renamed from: C */
    public final C13601g f315355C = C36568h.m40985a(new C105956a(this));

    /* renamed from: D */
    public final C13601g f315356D = C36568h.m40985a(new C105960e(this));

    /* renamed from: E */
    public final C13601g f315357E = C36568h.m40985a(new C105957b(this));

    /* renamed from: F */
    public final C13601g f315358F = C36568h.m40985a(new C105959d(this));

    /* renamed from: G */
    public int f315359G = -1;

    /* renamed from: H */
    public int f315360H = -1;

    /* renamed from: I */
    public int f315361I = -1;

    /* renamed from: J */
    public int f315362J = -1;

    /* renamed from: K */
    public C53973z1 f315363K;

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$a */
    public static final class C105956a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ ImproveCameraKitPluginLayout f315364d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105956a(ImproveCameraKitPluginLayout improveCameraKitPluginLayout) {
            super(0);
            this.f315364d = improveCameraKitPluginLayout;
        }

        public Object invoke() {
            return this.f315364d.findViewById(C0966R.C0970id.apr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$b */
    public static final class C105957b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ ImproveCameraKitPluginLayout f315365d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105957b(ImproveCameraKitPluginLayout improveCameraKitPluginLayout) {
            super(0);
            this.f315365d = improveCameraKitPluginLayout;
        }

        public Object invoke() {
            return this.f315365d.findViewById(C0966R.C0970id.ar7);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$c */
    public static final class C105958c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ ImproveCameraKitPluginLayout f315366d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105958c(ImproveCameraKitPluginLayout improveCameraKitPluginLayout) {
            super(0);
            this.f315366d = improveCameraKitPluginLayout;
        }

        public Object invoke() {
            return this.f315366d.findViewById(C0966R.C0970id.ihq);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$d */
    public static final class C105959d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ ImproveCameraKitPluginLayout f315367d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105959d(ImproveCameraKitPluginLayout improveCameraKitPluginLayout) {
            super(0);
            this.f315367d = improveCameraKitPluginLayout;
        }

        public Object invoke() {
            return this.f315367d.findViewById(C0966R.C0970id.ar8);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$e */
    public static final class C105960e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ ImproveCameraKitPluginLayout f315368d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105960e(ImproveCameraKitPluginLayout improveCameraKitPluginLayout) {
            super(0);
            this.f315368d = improveCameraKitPluginLayout;
        }

        public Object invoke() {
            return this.f315368d.findViewById(C0966R.C0970id.bex);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout", mo125469f = "ImproveCameraKitPluginLayout.kt", mo125470l = {281, 283}, mo125471m = "dealSwitchCameraState$suspendImpl")
    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$f */
    public static final class C105961f extends C66704d {

        /* renamed from: d */
        public Object f315369d;

        /* renamed from: e */
        public boolean f315370e;

        /* renamed from: f */
        public /* synthetic */ Object f315371f;

        /* renamed from: g */
        public final /* synthetic */ ImproveCameraKitPluginLayout f315372g;

        /* renamed from: h */
        public int f315373h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105961f(ImproveCameraKitPluginLayout improveCameraKitPluginLayout, C15601d<? super C105961f> dVar) {
            super(dVar);
            this.f315372g = improveCameraKitPluginLayout;
        }

        public final Object invokeSuspend(Object obj) {
            this.f315371f = obj;
            this.f315373h |= Integer.MIN_VALUE;
            return ImproveCameraKitPluginLayout.m142505A(this.f315372g, false, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$dealSwitchCameraState$2", mo125469f = "ImproveCameraKitPluginLayout.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$g */
    public static final class C105962g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ ImproveCameraKitPluginLayout f315374d;

        /* renamed from: e */
        public final /* synthetic */ boolean f315375e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105962g(ImproveCameraKitPluginLayout improveCameraKitPluginLayout, boolean z, C15601d<? super C105962g> dVar) {
            super(2, dVar);
            this.f315374d = improveCameraKitPluginLayout;
            this.f315375e = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C105962g(this.f315374d, this.f315375e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C105962g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f315374d.f315353A.f327451d.setVisibility(this.f315375e ? 4 : 0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$h */
    public static final class C105963h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ImproveCameraKitPluginLayout f315376d;

        /* renamed from: e */
        public final /* synthetic */ int f315377e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105963h(ImproveCameraKitPluginLayout improveCameraKitPluginLayout, int i) {
            super(0);
            this.f315376d = improveCameraKitPluginLayout;
            this.f315377e = i;
        }

        public Object invoke() {
            boolean z = false;
            int i = this.f315376d.getEnableLandscape() ? 0 : this.f315377e;
            float f = (float) i;
            this.f315376d.getCameraSwitchPlugin().mo138906b(f);
            C109381y0 y0Var = this.f315376d.f315353A;
            if (y0Var.f327454g == f) {
                z = true;
            }
            if (!z && AppForegroundDelegate.INSTANCE.f343454n) {
                Log.m105924i("MicroMsg.RecordSwitchFlashPlugin", "updateOrientation " + f + "  " + y0Var.f327451d.getRotation());
                y0Var.f327454g = f;
                y0Var.f327451d.animate().cancel();
                y0Var.f327451d.animate().rotation(f).setDuration(100).start();
            }
            View cameraView = this.f315376d.getCameraView();
            C87412m.m108592e(cameraView, "null cannot be cast to non-null type com.tencent.mm.media.camera.view.CameraKitView");
            ((CameraKitView) cameraView).setCurrentOrientation(i);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$statusChange$1", mo125469f = "ImproveCameraKitPluginLayout.kt", mo125470l = {298}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$i */
    public static final class C105964i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f315378d;

        /* renamed from: e */
        public final /* synthetic */ ImproveCameraKitPluginLayout f315379e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$statusChange$1$1", mo125469f = "ImproveCameraKitPluginLayout.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$i$a */
        public static final class C105965a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ ImproveCameraKitPluginLayout f315380d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C105965a(ImproveCameraKitPluginLayout improveCameraKitPluginLayout, C15601d<? super C105965a> dVar) {
                super(2, dVar);
                this.f315380d = improveCameraKitPluginLayout;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C105965a(this.f315380d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C105965a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f315380d.getClosePlugin().setVisibility(8);
                this.f315380d.getCameraSwitchPlugin().f291647d.setVisibility(8);
                this.f315380d.f315353A.f327451d.setVisibility(8);
                ImproveCameraKitPluginLayout.m142506y(this.f315380d);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105964i(ImproveCameraKitPluginLayout improveCameraKitPluginLayout, C15601d<? super C105964i> dVar) {
            super(2, dVar);
            this.f315379e = improveCameraKitPluginLayout;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C105964i(this.f315379e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C105964i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f315378d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i("MicroMsg.ImproveCameraKitPluginLayout", JsApiStartRecordVoice.NAME);
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C105965a aVar2 = new C105965a(this.f315379e, (C15601d<? super C105965a>) null);
                this.f315378d = 1;
                if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = ((-this.f315379e.getOrientationPlugin().f291643f) + v2helper.VOIP_ENC_HEIGHT_LV1) % v2helper.VOIP_ENC_HEIGHT_LV1;
            boolean z = (this.f315379e.getOrientationPlugin().f291643f + v2helper.VOIP_ENC_HEIGHT_LV1) % 180 != 0;
            this.f315379e.getCameraUsage().setLightTorch(this.f315379e.f315353A.f327453f == C34276c.FLASH_ON);
            if (this.f315379e.getEnableLandscape()) {
                this.f315379e.getRecorder().mo162059k(0, false);
            } else {
                this.f315379e.getRecorder().mo162059k(i2, z);
            }
            C101891f fVar = C101891f.f300035a;
            fVar.mo141387u(SystemClock.elapsedRealtime());
            fVar.mo141381o(true);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$statusChange$2", mo125469f = "ImproveCameraKitPluginLayout.kt", mo125470l = {323, 329, 341, 348}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$j */
    public static final class C105966j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public long f315381d;

        /* renamed from: e */
        public int f315382e;

        /* renamed from: f */
        public final /* synthetic */ ImproveCameraKitPluginLayout f315383f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$statusChange$2$1", mo125469f = "ImproveCameraKitPluginLayout.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$j$a */
        public static final class C105967a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ ImproveCameraKitPluginLayout f315384d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C105967a(ImproveCameraKitPluginLayout improveCameraKitPluginLayout, C15601d<? super C105967a> dVar) {
                super(2, dVar);
                this.f315384d = improveCameraKitPluginLayout;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C105967a(this.f315384d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C105967a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C109337b recordPlugin = this.f315384d.getRecordPlugin();
                if (recordPlugin != null) {
                    recordPlugin.reset();
                }
                C109337b recordPlugin2 = this.f315384d.getRecordPlugin();
                if (recordPlugin2 == null) {
                    return null;
                }
                recordPlugin2.mo160529d();
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$statusChange$2$2", mo125469f = "ImproveCameraKitPluginLayout.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$j$b */
        public static final class C105968b extends C91594j implements C32227p<C0000n0, C15601d<? super C77398g>, Object> {

            /* renamed from: d */
            public final /* synthetic */ ImproveCameraKitPluginLayout f315385d;

            /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$j$b$a */
            public static final class C105969a implements DialogInterface.OnClickListener {

                /* renamed from: d */
                public final /* synthetic */ ImproveCameraKitPluginLayout f315386d;

                public C105969a(ImproveCameraKitPluginLayout improveCameraKitPluginLayout) {
                    this.f315386d = improveCameraKitPluginLayout;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    this.f315386d.setPluginViewVisible(0);
                    C109337b recordPlugin = this.f315386d.getRecordPlugin();
                    if (recordPlugin != null) {
                        recordPlugin.mo160530f(true);
                    }
                    C109337b recordPlugin2 = this.f315386d.getRecordPlugin();
                    if (recordPlugin2 != null) {
                        recordPlugin2.reset();
                    }
                    this.f315386d.getRecorder().reset();
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C105968b(ImproveCameraKitPluginLayout improveCameraKitPluginLayout, C15601d<? super C105968b> dVar) {
                super(2, dVar);
                this.f315385d = improveCameraKitPluginLayout;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C105968b(this.f315385d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C105968b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i("MicroMsg.ImproveCameraKitPluginLayout", "record error");
                return C76879j.m92711E(this.f315385d.getContext(), C76577a.m92166q(this.f315385d.getContext(), C0966R.string.f8182u_), "", C76577a.m92166q(this.f315385d.getContext(), C0966R.string.f8181u4), false, new C105969a(this.f315385d));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105966j(ImproveCameraKitPluginLayout improveCameraKitPluginLayout, C15601d<? super C105966j> dVar) {
            super(2, dVar);
            this.f315383f = improveCameraKitPluginLayout;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C105966j(this.f315383f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C105966j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x00f0  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x016f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r13.f315382e
                java.lang.String r2 = "MicroMsg.ImproveCameraKitPluginLayout"
                r3 = 4
                r4 = 3
                r5 = 0
                r6 = 0
                r7 = 1
                r8 = 2
                if (r1 == 0) goto L_0x0032
                if (r1 == r7) goto L_0x002e
                if (r1 == r8) goto L_0x0028
                if (r1 == r4) goto L_0x0023
                if (r1 != r3) goto L_0x001b
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x0185
            L_0x001b:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x0023:
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x0183
            L_0x0028:
                long r9 = r13.f315381d
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x0086
            L_0x002e:
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x005b
            L_0x0032:
                kotlin.ResultKt.throwOnFailure(r14)
                com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout r14 = r13.f315383f
                a14.z1 r14 = r14.f315363K
                if (r14 == 0) goto L_0x0043
                boolean r14 = r14.mo74466a()
                if (r14 != r7) goto L_0x0043
                r14 = 1
                goto L_0x0044
            L_0x0043:
                r14 = 0
            L_0x0044:
                if (r14 == 0) goto L_0x005b
                java.lang.String r14 = "when stopRecord the startJob is no finish"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r14)
                com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout r14 = r13.f315383f
                a14.z1 r14 = r14.f315363K
                if (r14 == 0) goto L_0x005b
                r13.f315382e = r7
                java.lang.Object r14 = r14.mo74521O(r13)
                if (r14 != r0) goto L_0x005b
                return r0
            L_0x005b:
                com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout r14 = r13.f315383f
                r14.f315363K = r5
                th2.f r14 = th2.C101891f.f300035a
                long r9 = android.os.SystemClock.elapsedRealtime()
                r14.mo141376j(r9)
                long r9 = java.lang.System.currentTimeMillis()
                com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout r14 = r13.f315383f
                i80.e r14 = r14.getCameraUsage()
                r14.setLightTorch(r6)
                com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout r14 = r13.f315383f
                rh2.b r14 = r14.getRecorder()
                r13.f315381d = r9
                r13.f315382e = r8
                java.lang.Object r14 = r14.mo162060l(r13)
                if (r14 != r0) goto L_0x0086
                return r0
            L_0x0086:
                rx3.l r14 = (rx3.C13604l) r14
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r11 = "stopRecord result:"
                r1.append(r11)
                A r11 = r14.f38555d
                java.lang.Number r11 = (java.lang.Number) r11
                int r11 = r11.intValue()
                r1.append(r11)
                java.lang.String r11 = " info:"
                r1.append(r11)
                B r11 = r14.f38556e
                r1.append(r11)
                java.lang.String r11 = " cost:"
                r1.append(r11)
                long r11 = java.lang.System.currentTimeMillis()
                long r11 = r11 - r9
                r1.append(r11)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                A r1 = r14.f38555d
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r9 = "setRecordVideoResult >> code: "
                r2.append(r9)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                java.lang.String r9 = "MicroMsg.ImproveRecordReporter"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
                com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct
                r2.<init>()
                r2.f310051v = r1
                r2.mo86054n()
                A r1 = r14.f38555d
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r2 = -4
                if (r1 == r2) goto L_0x016f
                if (r1 == 0) goto L_0x0106
                a14.h0 r14 = a14.C53872d1.f151117a
                a14.k2 r14 = f14.C58901s.f168555a
                com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$j$b r1 = new com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$j$b
                com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout r2 = r13.f315383f
                r1.<init>(r2, r5)
                r13.f315382e = r3
                java.lang.Object r14 = a14.C53895h.m60469g(r14, r1, r13)
                if (r14 != r0) goto L_0x0185
                return r0
            L_0x0106:
                B r0 = r14.f38556e
                h90.b r0 = (h90.C98324b) r0
                if (r0 == 0) goto L_0x010e
                int r6 = r0.f288184e
            L_0x010e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "setVideoDuration >> "
                r0.append(r1)
                com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct r1 = th2.C110990b.f332422a
                if (r1 == 0) goto L_0x011f
                java.lang.String r5 = r1.f310044o
            L_0x011f:
                r0.append(r5)
                java.lang.String r1 = ", "
                r0.append(r1)
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
                com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct r0 = th2.C110990b.f332422a
                if (r0 != 0) goto L_0x0136
                goto L_0x0139
            L_0x0136:
                long r1 = (long) r6
                r0.f310043n = r1
            L_0x0139:
                th2.d r0 = th2.C110992d.f332425a
                java.lang.String r1 = th2.C110990b.f332423b
                java.lang.String r2 = "KEY_CAMERA_SESSION_ID"
                r0.mo162677k(r2, r1)
                com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout r1 = r13.f315383f
                lh2.x0 r1 = r1.getCameraSwitchPlugin()
                boolean r1 = r1.f291651h
                if (r1 == 0) goto L_0x014d
                goto L_0x014e
            L_0x014d:
                r7 = 2
            L_0x014e:
                java.lang.Integer r1 = new java.lang.Integer
                r1.<init>(r7)
                java.lang.String r2 = "KEY_MEDIA_SOURCE_INT"
                r0.mo162677k(r2, r1)
                com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout r0 = r13.f315383f
                int r1 = com.tencent.p014mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout.f315352L
                r0.mo151256C(r8, r8)
                com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout r0 = r13.f315383f
                wg2.a r0 = r0.getNavigator()
                if (r0 == 0) goto L_0x0185
                B r14 = r14.f38556e
                h90.b r14 = (h90.C98324b) r14
                r0.mo142012b(r8, r14)
                goto L_0x0185
            L_0x016f:
                a14.h0 r14 = a14.C53872d1.f151117a
                a14.k2 r14 = f14.C58901s.f168555a
                com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$j$a r1 = new com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$j$a
                com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout r2 = r13.f315383f
                r1.<init>(r2, r5)
                r13.f315382e = r4
                java.lang.Object r14 = a14.C53895h.m60469g(r14, r1, r13)
                if (r14 != r0) goto L_0x0183
                return r0
            L_0x0183:
                rx3.b0 r14 = (rx3.C13598b0) r14
            L_0x0185:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout.C105966j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$statusChange$3", mo125469f = "ImproveCameraKitPluginLayout.kt", mo125470l = {370, 380}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$k */
    public static final class C105970k extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f315387d;

        /* renamed from: e */
        public final /* synthetic */ ImproveCameraKitPluginLayout f315388e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$statusChange$3$1", mo125469f = "ImproveCameraKitPluginLayout.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$k$a */
        public static final class C105971a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ ImproveCameraKitPluginLayout f315389d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C105971a(ImproveCameraKitPluginLayout improveCameraKitPluginLayout, C15601d<? super C105971a> dVar) {
                super(2, dVar);
                this.f315389d = improveCameraKitPluginLayout;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C105971a(this.f315389d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C105971a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f315389d.getClosePlugin().setVisibility(8);
                this.f315389d.getCameraSwitchPlugin().f291647d.setVisibility(8);
                this.f315389d.f315353A.f327451d.setVisibility(8);
                C110992d dVar = C110992d.f332425a;
                dVar.mo162677k("KEY_CAMERA_SESSION_ID", C110990b.f332423b);
                dVar.mo162677k("KEY_MEDIA_SOURCE_INT", new Integer(this.f315389d.getCameraSwitchPlugin().f291651h ? 1 : 2));
                this.f315389d.mo151256C(1, 2);
                ImproveCameraKitPluginLayout.m142506y(this.f315389d);
                C109337b recordPlugin = this.f315389d.getRecordPlugin();
                if (recordPlugin == null) {
                    return null;
                }
                recordPlugin.mo160530f(false);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105970k(ImproveCameraKitPluginLayout improveCameraKitPluginLayout, C15601d<? super C105970k> dVar) {
            super(2, dVar);
            this.f315388e = improveCameraKitPluginLayout;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C105970k(this.f315388e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C105970k) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f315387d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C105971a aVar2 = new C105971a(this.f315388e, (C15601d<? super C105971a>) null);
                this.f315387d = 1;
                if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ImproveCameraKitPluginLayout improveCameraKitPluginLayout = this.f315388e;
            this.f315387d = 2;
            if (ImproveCameraKitPluginLayout.m142507z(improveCameraKitPluginLayout, this) == aVar) {
                return aVar;
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$statusChange$4", mo125469f = "ImproveCameraKitPluginLayout.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$l */
    public static final class C105972l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ ImproveCameraKitPluginLayout f315390d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105972l(ImproveCameraKitPluginLayout improveCameraKitPluginLayout, C15601d<? super C105972l> dVar) {
            super(2, dVar);
            this.f315390d = improveCameraKitPluginLayout;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C105972l(this.f315390d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C105972l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            ImproveCameraKitPluginLayout improveCameraKitPluginLayout = this.f315390d;
            int i = ImproveCameraKitPluginLayout.f315352L;
            improveCameraKitPluginLayout.mo151256C(0, 1);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveCameraKitPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C32053h hVar;
        C87412m.m108594g(context, "context");
        View findViewById = findViewById(C0966R.C0970id.f358296l72);
        C87412m.m108593f(findViewById, "findViewById(R.id.flash_plugin)");
        this.f315353A = new C109381y0((WeImageView) findViewById, this);
        int i = C60287a.f171906a;
        C74783i3.C6978a a = C74783i3.m89537a((Context) null);
        C107542g.f321757d = a.f24705b;
        int i2 = a.f24704a;
        C107542g.f321758e = (i2 * 16) / 9;
        C107542g.f321754a = C75044y4.m89991c(MMApplicationContext.getContext());
        Log.m105924i("MicroMsg.ImproveRecordRatioConfigManager", "updateNavigationBarHeight >> " + C107542g.f321754a);
        int a2 = C74942w4.m89784a(MMApplicationContext.getContext(), 116);
        C107542g.f321756c = (C107542g.f321757d - C107542g.f321758e) - C107542g.f321754a;
        Log.m105924i("MicroMsg.ImproveRecordRatioConfigManager", "calculateImproveRadioConfig >> captureSafetyHeight: " + a2 + " currentBottomHeight: " + -1 + ", longSide: " + C107542g.f321757d + ", shortSide: " + i2 + ", cameraViewHeight: " + C107542g.f321758e + ", xStrategy: " + C107542g.f321756c + ", navigationBarHeight: " + C107542g.f321754a);
        int i3 = C107542g.f321756c;
        if (i3 >= a2) {
            Log.m105924i("MicroMsg.ImproveRecordRatioConfigManager", "ratio strategy is CameraView_TOP");
            hVar = C32053h.CameraView_TOP;
        } else if (i3 >= C107542g.f321754a + C74942w4.m89784a(MMApplicationContext.getContext(), 88)) {
            Log.m105924i("MicroMsg.ImproveRecordRatioConfigManager", "ratio strategy is CameraView_Bottom");
            hVar = C32053h.CameraView_Bottom;
        } else {
            Log.m105924i("MicroMsg.ImproveRecordRatioConfigManager", "ratio strategy is CameraView_Center");
            hVar = C32053h.CameraView_Center;
        }
        C107542g.f321755b = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m142505A(com.tencent.p014mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout r7, boolean r8, wx3.C15601d r9) {
        /*
            boolean r0 = r9 instanceof com.tencent.p014mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout.C105961f
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$f r0 = (com.tencent.p014mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout.C105961f) r0
            int r1 = r0.f315373h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f315373h = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$f r0 = new com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$f
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f315371f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f315373h
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0043
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            boolean r7 = r0.f315370e
            java.lang.Object r8 = r0.f315369d
            com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout r8 = (com.tencent.p014mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x007d
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            boolean r8 = r0.f315370e
            java.lang.Object r7 = r0.f315369d
            com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout r7 = (com.tencent.p014mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout) r7
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0053
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r9)
            r0.f315369d = r7
            r0.f315370e = r8
            r0.f315373h = r4
            java.lang.Object r9 = super.mo151234r(r8, r0)
            if (r9 != r1) goto L_0x0053
            return r1
        L_0x0053:
            lh2.b r9 = r7.getRecordPlugin()
            if (r9 == 0) goto L_0x0060
            boolean r9 = r9.mo160528c()
            if (r9 != 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r4 = 0
        L_0x0061:
            if (r4 == 0) goto L_0x0097
            a14.h0 r9 = a14.C53872d1.f151117a
            a14.k2 r9 = f14.C58901s.f168555a
            com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$g r2 = new com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout$g
            r4 = 0
            r2.<init>(r7, r8, r4)
            r0.f315369d = r7
            r0.f315370e = r8
            r0.f315373h = r3
            java.lang.Object r9 = a14.C53895h.m60469g(r9, r2, r0)
            if (r9 != r1) goto L_0x007a
            return r1
        L_0x007a:
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x007d:
            if (r7 == 0) goto L_0x0097
            lh2.y0 r7 = r8.f315353A
            lh2.c r9 = lh2.C34276c.FLASH_OFF
            r7.f327453f = r9
            r9 = 2131755972(0x7f1003c4, float:1.9142838E38)
            com.tencent.mm.ui.widget.imageview.WeImageView r7 = r7.f327451d
            r0 = 2131099707(0x7f06003b, float:1.7811775E38)
            r7.mo104518r(r9, r0)
            i80.e r7 = r8.getCameraUsage()
            r7.mo148273i(r5)
        L_0x0097:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout.m142505A(com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout, boolean, wx3.d):java.lang.Object");
    }

    private final View getCaptureHintView() {
        Object value = ((C36570n) this.f315357E).getValue();
        C87412m.m108593f(value, "<get-captureHintView>(...)");
        return (View) value;
    }

    private final View getCaptureLayout() {
        Object value = ((C36570n) this.f315354B).getValue();
        C87412m.m108593f(value, "<get-captureLayout>(...)");
        return (View) value;
    }

    private final View getCapturePermissionJumperView() {
        Object value = ((C36570n) this.f315358F).getValue();
        C87412m.m108593f(value, "<get-capturePermissionJumperView>(...)");
        return (View) value;
    }

    private final View getCloseView() {
        Object value = ((C36570n) this.f315356D).getValue();
        C87412m.m108593f(value, "<get-closeView>(...)");
        return (View) value;
    }

    /* renamed from: y */
    public static final void m142506y(ImproveCameraKitPluginLayout improveCameraKitPluginLayout) {
        Bundle bundle;
        Bundle bundle2;
        boolean z = (improveCameraKitPluginLayout.getOrientationPlugin().f291643f + v2helper.VOIP_ENC_HEIGHT_LV1) % 180 != 0;
        if (improveCameraKitPluginLayout.getEnableLandscape() || !z) {
            RecordConfigProvider configProvider = improveCameraKitPluginLayout.getConfigProvider();
            if (configProvider != null && (bundle = configProvider.f272912M) != null) {
                bundle.putInt("key_preview_location_type", improveCameraKitPluginLayout.f315359G);
                bundle.putInt("key_preview_margin_top", improveCameraKitPluginLayout.f315360H);
                bundle.putInt("key_back_margin_top", improveCameraKitPluginLayout.f315361I);
                bundle.putInt("key_edit_control_margin_bottom", improveCameraKitPluginLayout.f315362J);
                return;
            }
            return;
        }
        RecordConfigProvider configProvider2 = improveCameraKitPluginLayout.getConfigProvider();
        if (configProvider2 != null && (bundle2 = configProvider2.f272912M) != null) {
            bundle2.putInt("key_preview_location_type", 2);
            bundle2.putInt("key_preview_margin_top", 0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m142507z(com.tencent.p014mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout r36, wx3.C15601d r37) {
        /*
            r0 = r36
            r1 = r37
            r36.getClass()
            boolean r2 = r1 instanceof qh2.C110401f
            if (r2 == 0) goto L_0x001a
            r2 = r1
            qh2.f r2 = (qh2.C110401f) r2
            int r3 = r2.f330276h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.f330276h = r3
            goto L_0x001f
        L_0x001a:
            qh2.f r2 = new qh2.f
            r2.<init>(r0, r1)
        L_0x001f:
            java.lang.Object r1 = r2.f330274f
            xx3.a r12 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r2.f330276h
            java.lang.String r13 = "path"
            r14 = 2
            r15 = 1
            if (r3 == 0) goto L_0x0057
            if (r3 == r15) goto L_0x0045
            if (r3 != r14) goto L_0x003d
            java.lang.Object r0 = r2.f330273e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r2.f330272d
            com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout r2 = (com.tencent.p014mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x00a9
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0045:
            java.lang.Object r0 = r2.f330273e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r3 = r2.f330272d
            com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout r3 = (com.tencent.p014mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout) r3
            kotlin.ResultKt.throwOnFailure(r1)
            r35 = r1
            r1 = r0
            r0 = r3
            r3 = r35
            goto L_0x0088
        L_0x0057:
            kotlin.ResultKt.throwOnFailure(r1)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r36.getConfigProvider()
            gy3.C87412m.m108591d(r1)
            java.lang.String r1 = r1.f272903D
            i80.e r3 = r36.getCameraUsage()
            r4 = 0
            r5 = 1920(0x780, float:2.69E-42)
            lh2.w0 r6 = r36.getOrientationPlugin()
            int r6 = r6.f291643f
            gy3.C87412m.m108593f(r1, r13)
            boolean r8 = r36.getEnableLandscape()
            r10 = 1
            r11 = 0
            r2.f330272d = r0
            r2.f330273e = r1
            r2.f330276h = r15
            r7 = r1
            r9 = r2
            java.lang.Object r3 = i80.C108402e.C108403a.m146864a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r3 != r12) goto L_0x0088
            goto L_0x00e3
        L_0x0088:
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x00e1
            a14.h0 r3 = a14.C53872d1.f151117a
            a14.k2 r3 = f14.C58901s.f168555a
            qh2.g r4 = new qh2.g
            r5 = 0
            r4.<init>(r0, r5)
            r2.f330272d = r0
            r2.f330273e = r1
            r2.f330276h = r14
            java.lang.Object r2 = a14.C53895h.m60469g(r3, r4, r2)
            if (r2 != r12) goto L_0x00a7
            goto L_0x00e3
        L_0x00a7:
            r2 = r0
            r0 = r1
        L_0x00a9:
            gy3.C87412m.m108593f(r0, r13)
            h90.b r1 = new h90.b
            r16 = r1
            r17 = 0
            r18 = 0
            r19 = 1
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 65019(0xfdfb, float:9.1111E-41)
            r34 = 0
            r26 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            wg2.a r0 = r2.getNavigator()
            if (r0 == 0) goto L_0x00e1
            r0.mo142012b(r15, r1)
        L_0x00e1:
            rx3.b0 r12 = rx3.C13598b0.f38549a
        L_0x00e3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout.m142507z(com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout, wx3.d):java.lang.Object");
    }

    /* renamed from: B */
    public void mo151255B() {
        getPluginList().add(this.f315353A);
    }

    /* renamed from: C */
    public final void mo151256C(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("setContentType >> ");
        sb.append(i);
        sb.append(", ");
        CameraActionsLogStruct cameraActionsLogStruct = C110990b.f332422a;
        String str = null;
        sb.append(cameraActionsLogStruct != null ? cameraActionsLogStruct.f310044o : null);
        Log.m105924i("MicroMsg.ImproveRecordReporter", sb.toString());
        CameraActionsLogStruct cameraActionsLogStruct2 = C110990b.f332422a;
        if (cameraActionsLogStruct2 != null) {
            cameraActionsLogStruct2.f310038i = (long) i;
        }
        View cameraView = getCameraView();
        C87412m.m108592e(cameraView, "null cannot be cast to non-null type com.tencent.mm.media.camera.view.CameraKitView");
        int currentExpo = ((CameraKitView) cameraView).getCurrentExpo();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("setCurrentLight >> ");
        CameraActionsLogStruct cameraActionsLogStruct3 = C110990b.f332422a;
        sb4.append(cameraActionsLogStruct3 != null ? cameraActionsLogStruct3.f310044o : null);
        sb4.append(", ");
        sb4.append(currentExpo);
        Log.m105924i("MicroMsg.ImproveRecordReporter", sb4.toString());
        CameraActionsLogStruct cameraActionsLogStruct4 = C110990b.f332422a;
        if (cameraActionsLogStruct4 != null) {
            cameraActionsLogStruct4.f310045p = currentExpo;
        }
        int i3 = 1;
        int i4 = this.f315353A.f327453f == C34276c.FLASH_ON ? 1 : 2;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("setFlashLightStatus >> ");
        sb5.append(i4);
        sb5.append(", ");
        CameraActionsLogStruct cameraActionsLogStruct5 = C110990b.f332422a;
        sb5.append(cameraActionsLogStruct5 != null ? cameraActionsLogStruct5.f310044o : null);
        Log.m105924i("MicroMsg.ImproveRecordReporter", sb5.toString());
        CameraActionsLogStruct cameraActionsLogStruct6 = C110990b.f332422a;
        if (cameraActionsLogStruct6 != null) {
            cameraActionsLogStruct6.f310039j = (long) i4;
        }
        if (!getCameraSwitchPlugin().f291651h) {
            i3 = 2;
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append("setFinalContentSource >> ");
        sb6.append(i3);
        sb6.append(", ");
        CameraActionsLogStruct cameraActionsLogStruct7 = C110990b.f332422a;
        sb6.append(cameraActionsLogStruct7 != null ? cameraActionsLogStruct7.f310044o : null);
        Log.m105924i("MicroMsg.ImproveRecordReporter", sb6.toString());
        CameraActionsLogStruct cameraActionsLogStruct8 = C110990b.f332422a;
        if (cameraActionsLogStruct8 != null) {
            cameraActionsLogStruct8.f310037h = (long) i3;
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb7 = new StringBuilder();
        sb7.append("setExitResult >> ");
        sb7.append(i2);
        sb7.append(", ");
        CameraActionsLogStruct cameraActionsLogStruct9 = C110990b.f332422a;
        if (cameraActionsLogStruct9 != null) {
            str = cameraActionsLogStruct9.f310044o;
        }
        sb7.append(str);
        sb7.append(", ");
        sb7.append(currentTimeMillis);
        Log.m105924i("MicroMsg.ImproveRecordReporter", sb7.toString());
        CameraActionsLogStruct cameraActionsLogStruct10 = C110990b.f332422a;
        if (cameraActionsLogStruct10 != null) {
            cameraActionsLogStruct10.f310034e = (long) i2;
        }
        if (cameraActionsLogStruct10 != null) {
            cameraActionsLogStruct10.f310036g = currentTimeMillis;
        }
        if (cameraActionsLogStruct10 != null) {
            cameraActionsLogStruct10.mo86054n();
        }
    }

    /* renamed from: e */
    public boolean mo78564e() {
        mo151256C(0, 1);
        return super.mo78564e();
    }

    /* renamed from: g */
    public void mo151257g() {
        StringBuilder sb = new StringBuilder();
        sb.append("setSwitchCameraByDoubleClickCount >> ");
        CameraActionsLogStruct cameraActionsLogStruct = C110990b.f332422a;
        String str = null;
        sb.append(cameraActionsLogStruct != null ? Long.valueOf(cameraActionsLogStruct.f310041l) : null);
        sb.append(", ");
        CameraActionsLogStruct cameraActionsLogStruct2 = C110990b.f332422a;
        if (cameraActionsLogStruct2 != null) {
            str = cameraActionsLogStruct2.f310044o;
        }
        sb.append(str);
        Log.m105924i("MicroMsg.ImproveRecordReporter", sb.toString());
        CameraActionsLogStruct cameraActionsLogStruct3 = C110990b.f332422a;
        if (cameraActionsLogStruct3 != null) {
            cameraActionsLogStruct3.f310041l++;
        }
    }

    public final View getCameraView() {
        Object value = ((C36570n) this.f315355C).getValue();
        C87412m.m108593f(value, "<get-cameraView>(...)");
        return (View) value;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d6g;
    }

    /* renamed from: k */
    public void mo128671k(C102440a aVar, RecordConfigProvider recordConfigProvider) {
        VideoTransPara videoTransPara;
        int i;
        int i2;
        int i3;
        C87412m.m108594g(aVar, "navigator");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        super.mo128671k(aVar, recordConfigProvider);
        ((WeImageView) findViewById(C0966R.C0970id.kaw)).mo104518r(C0966R.raw.icons_filled_improve_switch_camera, C0966R.color.BW_100_Alpha_0_9);
        C32053h hVar = C107542g.f321755b;
        Log.m105924i("MicroMsg.ImproveCameraKitPluginLayout", "initViewWithRadioStrategy >> " + hVar);
        if (hVar != null) {
            int ordinal = hVar.ordinal();
            if (ordinal == 0) {
                int i4 = C107542g.f321756c;
                int a = i4 - C74942w4.m89784a(MMApplicationContext.getContext(), 108);
                if (a < 0) {
                    Log.m105920e("MicroMsg.ImproveCameraKitPluginLayout", "gotoTopRatioHandler xStrategy is small than xToRealHeight >> " + i4 + ", " + a);
                } else {
                    int i5 = C107542g.f321754a;
                    float f = ((float) i5) + (((float) a) / 2.0f);
                    ViewGroup.LayoutParams layoutParams = getCaptureLayout().getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    int i6 = (int) f;
                    layoutParams2.bottomMargin = i6;
                    getCaptureLayout().setLayoutParams(layoutParams2);
                    ViewGroup.LayoutParams layoutParams3 = getCaptureHintView().getLayoutParams();
                    C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                    layoutParams4.bottomMargin = a;
                    getCaptureHintView().setLayoutParams(layoutParams4);
                    ViewGroup.LayoutParams layoutParams5 = getCapturePermissionJumperView().getLayoutParams();
                    C87412m.m108592e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
                    layoutParams6.bottomMargin = a;
                    getCapturePermissionJumperView().setLayoutParams(layoutParams6);
                    Log.m105924i("MicroMsg.ImproveCameraKitPluginLayout", "gotoTopRatioHandler >> " + i5 + ", " + i4 + ", " + a + ", " + f);
                    this.f315359G = 1;
                    this.f315360H = 0;
                    this.f315361I = C74942w4.m89784a(getContext(), 56);
                    this.f315362J = i6 + ((C74942w4.m89784a(MMApplicationContext.getContext(), 108) - C74942w4.m89784a(getContext(), 30)) / 2);
                }
            } else if (ordinal == 1) {
                int i7 = C107542g.f321757d;
                int a2 = C74942w4.m89784a(MMApplicationContext.getContext(), 88);
                int i8 = C107542g.f321754a;
                int i9 = C107542g.f321758e;
                if (i7 == 0 || a2 == 0 || i8 == 0 || i9 == 0) {
                    Log.m105920e("MicroMsg.ImproveCameraKitPluginLayout", "gotoCenterRatioHandler data is error " + i7 + ", " + a2 + ", " + i8 + ", " + i9);
                } else {
                    float f2 = ((float) (i7 - i9)) / 2.0f;
                    float a3 = ((float) (C74942w4.m89784a(MMApplicationContext.getContext(), 116) - C74942w4.m89784a(MMApplicationContext.getContext(), 108))) / 2.0f;
                    if (f2 > 0.0f) {
                        ViewGroup.LayoutParams layoutParams7 = getCameraView().getLayoutParams();
                        C87412m.m108592e(layoutParams7, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) layoutParams7;
                        i2 = (int) f2;
                        layoutParams8.topMargin = i2;
                        getCameraView().setLayoutParams(layoutParams8);
                        i3 = C74942w4.m89784a(getContext(), 24) + i2;
                        i = C74942w4.m89784a(getContext(), 24) + ((int) a3);
                    } else {
                        i3 = C74942w4.m89784a(getContext(), 24);
                        i = C74942w4.m89784a(getContext(), 24);
                        i2 = (int) a3;
                    }
                    int i15 = i + i2;
                    ViewGroup.LayoutParams layoutParams9 = getCloseView().getLayoutParams();
                    C87412m.m108592e(layoutParams9, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams10 = (RelativeLayout.LayoutParams) layoutParams9;
                    layoutParams10.topMargin = i3;
                    getCloseView().setLayoutParams(layoutParams10);
                    boolean z = i15 < i8;
                    if (z) {
                        i15 = ((int) a3) + i8;
                    }
                    ViewGroup.LayoutParams layoutParams11 = getCaptureLayout().getLayoutParams();
                    C87412m.m108592e(layoutParams11, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams12 = (RelativeLayout.LayoutParams) layoutParams11;
                    layoutParams12.bottomMargin = i15;
                    getCaptureLayout().setLayoutParams(layoutParams12);
                    Log.m105924i("MicroMsg.ImproveCameraKitPluginLayout", "gotoCenterRatioHandler >> " + i7 + ", " + a2 + ", " + i8 + ", " + f2 + ", " + a3 + ", " + i3 + ", " + i15 + ", " + z + ", " + i9 + ' ');
                    this.f315359G = 2;
                    this.f315360H = 0;
                    this.f315361I = i3;
                    this.f315362J = i15 + ((C74942w4.m89784a(MMApplicationContext.getContext(), 108) - C74942w4.m89784a(getContext(), 30)) / 2);
                }
            } else if (ordinal == 2) {
                int i16 = C107542g.f321757d;
                int i17 = C107542g.f321754a;
                int i18 = C107542g.f321758e;
                int i19 = (i16 - i17) - i18;
                if (i17 == 0 || i16 == 0 || i18 == 0 || i19 < 0) {
                    Log.m105920e("MicroMsg.ImproveCameraKitPluginLayout", "gotoBottomRatioHandler data is error >> " + i17 + ", " + i16 + ", " + i18);
                } else {
                    ViewGroup.LayoutParams layoutParams13 = getCameraView().getLayoutParams();
                    C87412m.m108592e(layoutParams13, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams14 = (RelativeLayout.LayoutParams) layoutParams13;
                    layoutParams14.topMargin = i19;
                    getCameraView().setLayoutParams(layoutParams14);
                    int a4 = C74942w4.m89784a(getContext(), 24) + i17;
                    ViewGroup.LayoutParams layoutParams15 = getCaptureLayout().getLayoutParams();
                    C87412m.m108592e(layoutParams15, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams16 = (RelativeLayout.LayoutParams) layoutParams15;
                    layoutParams16.bottomMargin = a4;
                    getCaptureLayout().setLayoutParams(layoutParams16);
                    Log.m105924i("MicroMsg.ImproveCameraKitPluginLayout", "gotoBottomRatioHandler >> " + i17 + ", " + i16 + ", " + a4 + ", " + i19);
                    this.f315359G = 3;
                    this.f315360H = i19;
                    this.f315361I = C74942w4.m89784a(getContext(), 56);
                    this.f315362J = a4 + ((C74942w4.m89784a(MMApplicationContext.getContext(), 108) - C74942w4.m89784a(getContext(), 30)) / 2);
                }
            }
        }
        mo151255B();
        RecordConfigProvider configProvider = getConfigProvider();
        if (!(configProvider == null || (videoTransPara = configProvider.f272926n) == null)) {
            videoTransPara.f267167e = (videoTransPara.f267166d * 16) / 9;
            Log.m105924i("MicroMsg.ImproveCameraKitPluginLayout", "updateRecordVideoParams width:" + videoTransPara.f267166d + " height:" + videoTransPara.f267167e);
        }
        View cameraView = getCameraView();
        C87412m.m108592e(cameraView, "null cannot be cast to non-null type com.tencent.mm.media.camera.view.CameraKitView");
        ((CameraKitView) cameraView).setDoubleClickCallback(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x005a, code lost:
        r0 = r0.f272908I;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttach() {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.ImproveCameraKitPluginLayout"
            java.lang.String r1 = "onAttach: "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            lh2.b r0 = r7.getRecordPlugin()
            r1 = 1
            if (r0 == 0) goto L_0x0012
            r0.mo160530f(r1)
        L_0x0012:
            super.onAttach()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r2)
            th2.C110990b.f332423b = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "setEnterTimeStamp >> "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = ", "
            r0.append(r4)
            java.lang.String r5 = th2.C110990b.f332423b
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "MicroMsg.ImproveRecordReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct
            r0.<init>()
            th2.C110990b.f332422a = r0
            r0.f310035f = r2
            java.lang.String r2 = th2.C110990b.f332423b
            java.lang.String r3 = "CameraSessionID"
            java.lang.String r2 = r0.mo86045b(r3, r2, r1)
            r0.f310044o = r2
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r0 = r7.getConfigProvider()
            r2 = 0
            if (r0 == 0) goto L_0x0061
            com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo r0 = r0.f272908I
            if (r0 == 0) goto L_0x0061
            int r0 = r0.f272940d
            goto L_0x0062
        L_0x0061:
            r0 = 0
        L_0x0062:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "setEnterScene >> "
            r3.append(r6)
            r3.append(r0)
            r3.append(r4)
            com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct r4 = th2.C110990b.f332422a
            if (r4 == 0) goto L_0x007a
            java.lang.String r4 = r4.f310044o
            goto L_0x007b
        L_0x007a:
            r4 = 0
        L_0x007b:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct r3 = th2.C110990b.f332422a
            if (r3 != 0) goto L_0x008a
            goto L_0x008d
        L_0x008a:
            long r4 = (long) r0
            r3.f310033d = r4
        L_0x008d:
            com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct r0 = th2.C110990b.f332422a
            if (r0 != 0) goto L_0x0092
            goto L_0x0094
        L_0x0092:
            r0.f310050u = r1
        L_0x0094:
            r7.setPluginVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout.onAttach():void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        StringBuilder sb = new StringBuilder();
        sb.append("onConfigurationChanged >> ");
        sb.append(configuration != null ? Integer.valueOf(configuration.orientation) : null);
        Log.m105924i("MicroMsg.ImproveCameraKitPluginLayout", sb.toString());
    }

    public void onDetach() {
        Log.m105924i("MicroMsg.ImproveCameraKitPluginLayout", "onDetach: ");
        super.onDetach();
        setPluginVisibility(4);
    }

    public void onOrientationChange(int i) {
        C61926c.m72668M(new C105963h(this, i));
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 5) {
            this.f315363K = C53895h.m60466d(getScope(), (C66212f) null, (C53934p0) null, new C105964i(this, (C15601d<? super C105964i>) null), 3, (Object) null);
        } else if (ordinal == 6) {
            C53895h.m60466d(getScope(), (C66212f) null, (C53934p0) null, new C105966j(this, (C15601d<? super C105966j>) null), 3, (Object) null);
        } else if (ordinal == 7) {
            C53895h.m60466d(getScope(), (C66212f) null, (C53934p0) null, new C105972l(this, (C15601d<? super C105972l>) null), 3, (Object) null);
        } else if (ordinal != 14) {
            super.mo14585p(bVar, bundle);
        } else {
            C53895h.m60466d(getScope(), (C66212f) null, (C53934p0) null, new C105970k(this, (C15601d<? super C105970k>) null), 3, (Object) null);
        }
    }

    /* renamed from: r */
    public Object mo151234r(boolean z, C15601d<? super C13598b0> dVar) {
        return m142505A(this, z, dVar);
    }

    public void release() {
        super.release();
        Log.m105924i("MicroMsg.Camera.CameraKitConfig", "setCameraInstance >> " + -1);
        boolean a = C111386a.f333469a.mo163052a();
        C38971a.f104995c = -1;
    }

    public void setPluginViewVisible(int i) {
        getClosePlugin().setVisibility(i);
        getCameraSwitchPlugin().f291647d.setVisibility(i);
        C109337b recordPlugin = getRecordPlugin();
        if (recordPlugin != null) {
            recordPlugin.setVisibility(i);
        }
        if (!getCameraSwitchPlugin().f291651h) {
            this.f315353A.f327451d.setVisibility(i);
        }
    }

    public void setPluginVisibility(int i) {
        if (!getCameraSwitchPlugin().f291651h) {
            this.f315353A.f327451d.setVisibility(i);
        }
        if (i == 0) {
            View cameraView = getCameraView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view = cameraView;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveCameraKitPluginLayout", "setPluginVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            cameraView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveCameraKitPluginLayout", "setPluginVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: t */
    public boolean mo133885t() {
        return false;
    }

    /* renamed from: w */
    public void mo151239w() {
        Bundle bundle;
        Bundle bundle2;
        RecordConfigProvider configProvider = getConfigProvider();
        int i = -1;
        int i2 = configProvider != null ? configProvider.f272905F : -1;
        RecordConfigProvider configProvider2 = getConfigProvider();
        if (!(configProvider2 == null || (bundle2 = configProvider2.f272912M) == null)) {
            i = bundle2.getInt("key_sub_scene", -1);
        }
        RecordConfigProvider configProvider3 = getConfigProvider();
        getCameraUsage().setCameraKitSetting(new C107259g((C107260h) null, new C107254b(0, 0, (C107256d) null, (C107257e) null, ((configProvider3 == null || (bundle = configProvider3.f272912M) == null) ? 2 : bundle.getInt("key_camera_select", 2)) == 2, true, true, true, 15, (C8480h) null), new C107258f(i2, i), 1, (C8480h) null));
    }

    /* renamed from: x */
    public C109337b mo151240x() {
        return new C109345h0(this, this);
    }
}
