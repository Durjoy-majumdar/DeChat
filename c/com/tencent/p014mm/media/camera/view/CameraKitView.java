package com.tencent.p014mm.media.camera.view;

import a14.C53895h;
import a14.C53973z1;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Range;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import b14.C54392a;
import b14.C54394c;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.CameraReportStruct;
import com.tencent.p014mm.media.camera.lifecycle.CameraLifecycleProxy;
import com.tencent.p014mm.media.camera.view.control.CameraFocusAndMeteringView;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C58050i1;
import d14.C58092w0;
import e80.C107254b;
import e80.C107258f;
import e80.C107259g;
import f80.C107486a;
import f80.C107488c;
import f80.C107490e;
import f80.C107491f;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h80.C108171a;
import i80.C108398a;
import i80.C108399b;
import i80.C108400c;
import i80.C108401d;
import j80.C108654b;
import kotlin.Metadata;
import o40.C61926c;
import p192l4.C10462b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import v70.C111387b;
import v70.C111407t;
import v70.C111411x;
import w70.C111737a;
import wx3.C15601d;
import wx3.C66218h;
import x70.C112041b;
import x70.C112042c;
import x70.C112043d;
import x70.C112055i;
import x70.C112056j;
import x70.C112057k;
import x70.C112058l;
import x70.C112059m;
import x70.C112060n;
import x70.C112061o;
import x70.C112062p;
import x70.C112063q;
import x70.C112064r;
import x70.C112065s;
import xx3.C15911a;
import xx3.C66447b;
import y70.C38971a;
import z70.C112607b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\u0012\u0006\u0010'\u001a\u00020&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u001c\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r0\fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0012\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0005R!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010%\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010$¨\u0006,"}, mo182094d2 = {"Lcom/tencent/mm/media/camera/view/CameraKitView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$b;", "Lcom/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$a;", "Li80/c;", "", "orientation", "Lrx3/b0;", "setCurrentOrientation", "", "torchOn", "setLightTorch", "Ld14/i1;", "Lrx3/l;", "Li80/b;", "Landroid/os/Bundle;", "getCameraState", "Le80/g;", "setting", "setCameraKitSetting", "Lv70/b;", "render", "setCustomRender", "Li80/a;", "callback", "setDoubleClickCallback", "getCurrentExpo", "Lf80/e;", "Lx70/d;", "e", "Lrx3/g;", "getCameraKitModel", "()Lf80/e;", "cameraKitModel", "f", "getCameraKit", "()Lx70/d;", "cameraKit", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-camera_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.media.camera.view.CameraKitView */
public final class CameraKitView extends RelativeLayout implements CameraFocusAndMeteringView.C104642b, CameraFocusAndMeteringView.C104641a, C108400c {

    /* renamed from: d */
    public final C112607b f310708d;

    /* renamed from: e */
    public final C13601g f310709e;

    /* renamed from: f */
    public final C13601g f310710f;

    /* renamed from: g */
    public final C108401d f310711g;

    /* renamed from: h */
    public float f310712h;

    /* renamed from: i */
    public C108398a f310713i;

    /* renamed from: com.tencent.mm.media.camera.view.CameraKitView$a */
    public static final class C104639a extends C87413o implements C32224a<C112043d> {

        /* renamed from: d */
        public final /* synthetic */ CameraKitView f310714d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104639a(CameraKitView cameraKitView) {
            super(0);
            this.f310714d = cameraKitView;
        }

        public Object invoke() {
            return (C112043d) this.f310714d.getCameraKitModel().f321599a;
        }
    }

    /* renamed from: com.tencent.mm.media.camera.view.CameraKitView$b */
    public static final class C104640b extends C87413o implements C32224a<C107490e<C112043d>> {

        /* renamed from: d */
        public static final C104640b f310715d = new C104640b();

        public C104640b() {
            super(0);
        }

        public Object invoke() {
            C107486a aVar = C107488c.f321596a;
            C107490e b = C107488c.f321597b.mo157913b((String) null, C107491f.Created);
            if (b == null) {
                b = new C107490e(new C112043d(), (C107491f) null, 2, (C8480h) null);
            }
            b.f321600b = C107491f.InUsed;
            return b;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraKitView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f6674vh, this);
        int i = C0966R.C0970id.lxr;
        CameraFocusAndMeteringView cameraFocusAndMeteringView = (CameraFocusAndMeteringView) C10462b.m10395a(this, C0966R.C0970id.lxr);
        if (cameraFocusAndMeteringView != null) {
            i = C0966R.C0970id.lxu;
            ViewStub viewStub = (ViewStub) C10462b.m10395a(this, C0966R.C0970id.lxu);
            if (viewStub != null) {
                i = C0966R.C0970id.m7q;
                ViewStub viewStub2 = (ViewStub) C10462b.m10395a(this, C0966R.C0970id.m7q);
                if (viewStub2 != null) {
                    i = C0966R.C0970id.f359366m80;
                    ViewStub viewStub3 = (ViewStub) C10462b.m10395a(this, C0966R.C0970id.f359366m80);
                    if (viewStub3 != null) {
                        this.f310708d = new C112607b(this, cameraFocusAndMeteringView, viewStub, viewStub2, viewStub3);
                        this.f310709e = C36568h.m40985a(C104640b.f310715d);
                        this.f310710f = C36568h.m40985a(new C104639a(this));
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C111411x.f333530a);
                        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr….styleable.CameraKitView)");
                        boolean z = false;
                        int i2 = obtainStyledAttributes.getInt(1, 0);
                        View inflate = i2 != 0 ? i2 != 1 ? viewStub2.inflate() : viewStub3.inflate() : viewStub2.inflate();
                        C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.media.camera.view.ICameraKitView");
                        C108401d dVar = (C108401d) inflate;
                        this.f310711g = dVar;
                        boolean z2 = obtainStyledAttributes.getInt(0, 0) == 0;
                        int i3 = obtainStyledAttributes.getInt(3, 0);
                        int i4 = obtainStyledAttributes.getInt(2, 0);
                        if (i4 > 0 && i3 > 0) {
                            this.f310712h = (((float) i4) * 1.0f) / ((float) i3);
                        }
                        Log.m105924i("MicroMsg.Camera.CameraKitView", "cameraView instance:" + dVar.getClass().getName() + " backCamera:" + z2 + " ratio:" + this.f310712h + " [w:" + i3 + " h:" + i4 + ']');
                        dVar.setCameraKitEnv(getCameraKit());
                        C112043d cameraKit = getCameraKit();
                        cameraKit.getClass();
                        cameraKit.mo163062D("setUpCamera", new C112042c(cameraKit, context, (C15601d<? super C112042c>) null));
                        cameraFocusAndMeteringView.setTouchCallback(this);
                        cameraFocusAndMeteringView.setExpoDataCallback(this);
                        C111737a.f334621a.getClass();
                        C38971a aVar = C38971a.f104993a;
                        Object a = C79758p.f233760a.mo109878a(C104160f.RepairerConfig_Camera_Debug_Int, 0);
                        C87412m.m108592e(a, "null cannot be cast to non-null type kotlin.Int");
                        z = ((Integer) a).intValue() == 1 ? true : z;
                        C111737a.f334625e = z;
                        if (z) {
                            C111737a.f334623c = (TextView) viewStub.inflate().findViewById(C0966R.C0970id.lxt);
                            C111737a.f334627g = aVar.mo61856d(true) ? "纹理预览" : "buffer预览";
                            C111737a.f334629i = aVar.mo61854b() == 1 ? "camera1" : "camerax";
                            C111737a.f334628h = (aVar.mo61854b() != 1 && aVar.mo61853a() == 2) ? "imageCapture" : "readPixel";
                            return;
                        }
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }

    private final C112043d getCameraKit() {
        return (C112043d) ((C36570n) this.f310710f).getValue();
    }

    /* access modifiers changed from: private */
    public final C107490e<C112043d> getCameraKitModel() {
        return (C107490e) ((C36570n) this.f310709e).getValue();
    }

    /* renamed from: a */
    public void mo148263a() {
        Log.printInfoStack("MicroMsg.Camera.CameraKitView", "onZoomOut", new Object[0]);
        C112043d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.mo163061C("onZoomOut", new C112060n(cameraKit, (C15601d<? super C112060n>) null));
    }

    /* renamed from: b */
    public void mo148264b() {
        Log.printInfoStack("MicroMsg.Camera.CameraKitView", "onZoomIn", new Object[0]);
        C112043d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.mo163061C("onZoomIn", new C112059m(cameraKit, (C15601d<? super C112059m>) null));
    }

    /* renamed from: c */
    public void mo148265c() {
        C108398a aVar = this.f310713i;
        if (aVar != null) {
            aVar.mo151257g();
        }
        switchCamera();
    }

    /* renamed from: d */
    public void mo148266d() {
        getCameraKit().mo163067h();
        this.f310711g.setCameraKitEnv(getCameraKit());
    }

    /* renamed from: e */
    public void mo148267e(float f, float f2) {
        C112043d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.mo163061C("focusOn", new C112055i(cameraKit, f, f2, (C15601d<? super C112055i>) null));
    }

    /* renamed from: f */
    public Object mo148268f(int i, int i2, int i3, boolean z, C15601d<? super C13604l<Integer, Bitmap>> dVar) {
        CameraFocusAndMeteringView cameraFocusAndMeteringView = this.f310708d.f337224b;
        cameraFocusAndMeteringView.getClass();
        C61926c.m72668M(new C108654b(cameraFocusAndMeteringView));
        C112043d cameraKit = getCameraKit();
        cameraKit.getClass();
        return C112065s.m152793t(cameraKit, i, i2, i3, z, dVar);
    }

    /* renamed from: g */
    public Object mo148269g(C15601d<? super C13604l<Range<Integer>, Integer>> dVar) {
        C112043d cameraKit = getCameraKit();
        cameraKit.getClass();
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        cameraKit.mo163061C("getExpoData", new C112056j(cameraKit, hVar, (C15601d<? super C112056j>) null));
        return hVar.mo90314b();
    }

    public C58050i1<C13604l<C108399b, Bundle>> getCameraState() {
        return new C58092w0(getCameraKit().f335482s, (C53973z1) null);
    }

    public final int getCurrentExpo() {
        return this.f310708d.f337224b.getCurrentExpo();
    }

    /* renamed from: h */
    public void mo148272h(int i) {
        Log.printInfoStack("MicroMsg.Camera.CameraKitView", "onReduceExpo >> multi: " + i, new Object[0]);
        C112043d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.mo163061C("onReduceExpo", new C112058l(cameraKit, i, (C15601d<? super C112058l>) null));
    }

    /* renamed from: i */
    public void mo148273i(boolean z) {
        C112043d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.mo163061C("switchFlash", new C112063q(cameraKit, z, (C15601d<? super C112063q>) null));
    }

    /* renamed from: j */
    public void mo148274j(int i) {
        Log.printInfoStack("MicroMsg.Camera.CameraKitView", "onLargeExpo >> multi: " + i, new Object[0]);
        C112043d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.mo163061C("onLargeExpo", new C112057k(cameraKit, i, (C15601d<? super C112057k>) null));
    }

    /* renamed from: k */
    public void mo148275k(C0125s sVar) {
        C87412m.m108594g(sVar, "owner");
        Log.m105924i("MicroMsg.Camera.CameraKitView", "bindLifeCycleOwner " + sVar);
        C112043d cameraKit = getCameraKit();
        cameraKit.getClass();
        CameraLifecycleProxy cameraLifecycleProxy = cameraKit.f335451t;
        cameraLifecycleProxy.getClass();
        Log.m105924i("MicroMsg.Camera.CameraLifecycleProxy", "attachLifeCycleOwner:" + sVar.getLifecycle().getCurrentState());
        sVar.getLifecycle().addObserver(cameraLifecycleProxy);
        cameraLifecycleProxy.f310699e.mo145138f(sVar.getLifecycle().getCurrentState());
        sVar.getLifecycle().addObserver(new CameraKitView$bindLifeCycleOwner$1(this, sVar));
    }

    /* renamed from: l */
    public Object mo148276l(int i, int i2, int i3, String str, boolean z, C15601d<? super Integer> dVar) {
        CameraFocusAndMeteringView cameraFocusAndMeteringView = this.f310708d.f337224b;
        cameraFocusAndMeteringView.getClass();
        C61926c.m72668M(new C108654b(cameraFocusAndMeteringView));
        C112043d cameraKit = getCameraKit();
        cameraKit.getClass();
        return C112065s.m152792s(cameraKit, i, i2, i3, str, z, dVar);
    }

    /* renamed from: m */
    public void mo148277m(Surface surface, Integer num, Integer num2) {
        C87412m.m108594g(surface, "surface");
        Log.m105924i("MicroMsg.Camera.CameraKitView", "setCustomRenderTarget width:" + num + " height:" + num2);
        this.f310711g.setCameraKitEnv((C111407t) null);
        getCameraKit().mo163067h();
        getCameraKit().mo163069o(surface, num, num2);
    }

    /* renamed from: n */
    public Object mo148278n(boolean z, C15601d<? super C13598b0> dVar) {
        C112043d cameraKit = getCameraKit();
        Handler handler = cameraKit.f335430o;
        int i = C54394c.f152601a;
        Object g = C53895h.m60469g(new C54392a(handler, (String) null, false), new C112064r(z, cameraKit, (C15601d<? super C112064r>) null), dVar);
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        if (g != aVar) {
            g = C13598b0.f38549a;
        }
        return g == aVar ? g : C13598b0.f38549a;
    }

    public void onMeasure(int i, int i2) {
        if (this.f310712h > 0.0f) {
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i);
            if (size > 0 && size2 > 0) {
                float f = (float) size;
                float f2 = (float) size2;
                float f3 = this.f310712h;
                if ((1.0f * f) / f2 > f3) {
                    size = (int) (f2 * f3);
                } else {
                    size2 = (int) (f / f3);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                return;
            }
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCameraKitSetting(C107259g gVar) {
        C87412m.m108594g(gVar, "setting");
        Log.m105924i("MicroMsg.Camera.CameraKitView", "setCameraKitSetting:" + gVar);
        CameraFocusAndMeteringView cameraFocusAndMeteringView = this.f310708d.f337224b;
        C107254b bVar = gVar.f320916b;
        boolean z = true;
        if (bVar == null || !bVar.f320905f) {
            z = false;
        }
        cameraFocusAndMeteringView.setIsShowAdjustExpo(z);
        this.f310708d.f337224b.setCameraUISetting(gVar.f320915a);
        C107258f fVar = gVar.f320917c;
        if (fVar != null) {
            C112043d cameraKit = getCameraKit();
            int i = fVar.f320913a;
            int i2 = fVar.f320914b;
            cameraKit.getClass();
            Log.m105924i("MicroMsg.Camera.CameraKit", "setScene sessionId:" + cameraKit.f335419d + " scene:" + i + " subScene:" + i2);
            CameraReportStruct a = C108171a.f323903a.mo158577a(cameraKit.f335419d);
            if (a != null) {
                a.f310093l = i;
                a.f310062E = i2;
            }
        }
        C112043d cameraKit2 = getCameraKit();
        C107254b bVar2 = gVar.f320916b;
        cameraKit2.getClass();
        cameraKit2.mo163062D("createCamera", new C112041b(cameraKit2, bVar2, (C15601d<? super C112041b>) null));
    }

    public final void setCurrentOrientation(int i) {
        this.f310708d.f337224b.setCurrentOrientation(i);
    }

    public void setCustomRender(C111387b bVar) {
        getCameraKit().setCustomRender(bVar);
    }

    public final void setDoubleClickCallback(C108398a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f310713i = aVar;
    }

    public void setLightTorch(boolean z) {
        C112043d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.mo163061C("setLightTorch", new C112061o(cameraKit, z, (C15601d<? super C112061o>) null));
    }

    public void switchCamera() {
        C112043d cameraKit = getCameraKit();
        cameraKit.getClass();
        cameraKit.mo163062D("switchCamera", new C112062p(cameraKit, (C15601d<? super C112062p>) null));
    }
}
