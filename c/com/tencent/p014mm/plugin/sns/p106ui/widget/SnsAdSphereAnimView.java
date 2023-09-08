package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p104ad.widget.gllib.GLViewContainer;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr2.C97357a;
import cr2.C97358b;
import cr2.C97360c;
import cr2.C97361d;
import cr2.C97362e;
import cr2.C97363f;
import di3.C86312j;
import dr2.C97521a;
import dr2.C97522b;
import dr2.C97523c;
import dr2.C97524d;
import dr2.C97525e;
import h81.C32735h;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView */
public class SnsAdSphereAnimView extends FrameLayout {

    /* renamed from: d */
    public Context f281490d;

    /* renamed from: e */
    public FrameLayout f281491e;

    /* renamed from: f */
    public GLViewContainer f281492f;

    /* renamed from: g */
    public C97357a f281493g;

    /* renamed from: h */
    public C97521a f281494h;

    /* renamed from: i */
    public Handler f281495i = null;

    /* renamed from: j */
    public HandlerThread f281496j = null;

    /* renamed from: n */
    public Handler f281497n;

    /* renamed from: o */
    public boolean f281498o = false;

    /* renamed from: p */
    public int f281499p;

    /* renamed from: q */
    public int f281500q;

    /* renamed from: r */
    public int f281501r;

    /* renamed from: s */
    public int f281502s;

    /* renamed from: t */
    public int f281503t;

    /* renamed from: u */
    public boolean f281504u;

    /* renamed from: v */
    public Bitmap f281505v;

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView$a */
    public class C96291a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C97358b.C97359a f281506d;

        public C96291a(C97358b.C97359a aVar) {
            this.f281506d = aVar;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView$1");
            if (SnsAdSphereAnimView.m123463a(SnsAdSphereAnimView.this) == 1) {
                SnsAdSphereAnimView snsAdSphereAnimView = SnsAdSphereAnimView.this;
                SnsAdSphereAnimView.m123464b(snsAdSphereAnimView, new C97522b(SnsAdSphereAnimView.m123465c(snsAdSphereAnimView), SnsAdSphereAnimView.m123466d(SnsAdSphereAnimView.this), this.f281506d));
            } else if (SnsAdSphereAnimView.m123463a(SnsAdSphereAnimView.this) == 2) {
                SnsAdSphereAnimView snsAdSphereAnimView2 = SnsAdSphereAnimView.this;
                SnsAdSphereAnimView.m123464b(snsAdSphereAnimView2, new C97523c(SnsAdSphereAnimView.m123465c(snsAdSphereAnimView2), SnsAdSphereAnimView.m123466d(SnsAdSphereAnimView.this), this.f281506d));
            } else if (SnsAdSphereAnimView.m123463a(SnsAdSphereAnimView.this) == 3) {
                SnsAdSphereAnimView snsAdSphereAnimView3 = SnsAdSphereAnimView.this;
                SnsAdSphereAnimView.m123464b(snsAdSphereAnimView3, new C97525e(SnsAdSphereAnimView.m123465c(snsAdSphereAnimView3), SnsAdSphereAnimView.m123466d(SnsAdSphereAnimView.this), this.f281506d));
            } else if (SnsAdSphereAnimView.m123463a(SnsAdSphereAnimView.this) == 4) {
                SnsAdSphereAnimView snsAdSphereAnimView4 = SnsAdSphereAnimView.this;
                SnsAdSphereAnimView.m123464b(snsAdSphereAnimView4, new C97524d(SnsAdSphereAnimView.m123465c(snsAdSphereAnimView4), SnsAdSphereAnimView.m123466d(SnsAdSphereAnimView.this), this.f281506d));
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView$b */
    public class C96292b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C97358b.C97359a f281508d;

        public C96292b(C97358b.C97359a aVar) {
            this.f281508d = aVar;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView$2");
            if (SnsAdSphereAnimView.m123463a(SnsAdSphereAnimView.this) == 1) {
                SnsAdSphereAnimView snsAdSphereAnimView = SnsAdSphereAnimView.this;
                SnsAdSphereAnimView.m123467e(snsAdSphereAnimView, new C97360c(SnsAdSphereAnimView.m123465c(snsAdSphereAnimView), SnsAdSphereAnimView.m123468f(SnsAdSphereAnimView.this), this.f281508d));
            } else if (SnsAdSphereAnimView.m123463a(SnsAdSphereAnimView.this) == 2) {
                SnsAdSphereAnimView snsAdSphereAnimView2 = SnsAdSphereAnimView.this;
                SnsAdSphereAnimView.m123467e(snsAdSphereAnimView2, new C97361d(SnsAdSphereAnimView.m123465c(snsAdSphereAnimView2), SnsAdSphereAnimView.m123468f(SnsAdSphereAnimView.this), this.f281508d));
            } else if (SnsAdSphereAnimView.m123463a(SnsAdSphereAnimView.this) == 3) {
                SnsAdSphereAnimView snsAdSphereAnimView3 = SnsAdSphereAnimView.this;
                SnsAdSphereAnimView.m123467e(snsAdSphereAnimView3, new C97363f(SnsAdSphereAnimView.m123465c(snsAdSphereAnimView3), SnsAdSphereAnimView.m123468f(SnsAdSphereAnimView.this), this.f281508d));
            } else if (SnsAdSphereAnimView.m123463a(SnsAdSphereAnimView.this) == 4) {
                SnsAdSphereAnimView snsAdSphereAnimView4 = SnsAdSphereAnimView.this;
                SnsAdSphereAnimView.m123467e(snsAdSphereAnimView4, new C97362e(SnsAdSphereAnimView.m123465c(snsAdSphereAnimView4), SnsAdSphereAnimView.m123468f(SnsAdSphereAnimView.this), this.f281508d));
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView$2");
        }
    }

    public SnsAdSphereAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo134033h(context);
    }

    /* renamed from: a */
    public static /* synthetic */ int m123463a(SnsAdSphereAnimView snsAdSphereAnimView) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        int i = snsAdSphereAnimView.f281501r;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        return i;
    }

    /* renamed from: b */
    public static /* synthetic */ C97521a m123464b(SnsAdSphereAnimView snsAdSphereAnimView, C97521a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        snsAdSphereAnimView.f281494h = aVar;
        SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        return aVar;
    }

    /* renamed from: c */
    public static /* synthetic */ Context m123465c(SnsAdSphereAnimView snsAdSphereAnimView) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        Context context = snsAdSphereAnimView.f281490d;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        return context;
    }

    /* renamed from: d */
    public static /* synthetic */ GLViewContainer m123466d(SnsAdSphereAnimView snsAdSphereAnimView) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        GLViewContainer gLViewContainer = snsAdSphereAnimView.f281492f;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        return gLViewContainer;
    }

    /* renamed from: e */
    public static /* synthetic */ C97357a m123467e(SnsAdSphereAnimView snsAdSphereAnimView, C97357a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        snsAdSphereAnimView.f281493g = aVar;
        SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        return aVar;
    }

    /* renamed from: f */
    public static /* synthetic */ FrameLayout m123468f(SnsAdSphereAnimView snsAdSphereAnimView) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        FrameLayout frameLayout = snsAdSphereAnimView.f281491e;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        return frameLayout;
    }

    /* renamed from: g */
    public final void mo134032g(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("doStartAnim", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        this.f281504u = false;
        C97357a aVar = this.f281493g;
        if (aVar != null) {
            aVar.mo136627c();
        }
        C97521a aVar2 = this.f281494h;
        if (aVar2 != null) {
            aVar2.mo136627c();
        }
        C97358b.C97359a aVar3 = new C97358b.C97359a();
        aVar3.f285841a = this.f281505v;
        aVar3.f285844d = this.f281502s;
        aVar3.f285845e = i;
        aVar3.f285846f = i2;
        Context context = this.f281490d;
        int i3 = this.f281503t;
        SnsMethodCalculate.markStartTimeMs("getSpriteNum", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        float c = (float) C76577a.m92152c(context, i);
        float c2 = (float) C76577a.m92152c(context, i2);
        float f = (c * c2) / 304500.0f;
        int i4 = 12;
        if (i3 != 0) {
            if (i3 == 1) {
                i4 = 10;
            } else if (i3 == 2) {
                i4 = 16;
            }
        }
        int round = Math.round(((float) i4) * f);
        Log.m105924i("SnsAdSphereAnimView", "getSpriteNum, raw=" + i4 + ", ret=" + round + ", dpW=" + c + ", dpH=" + c2 + ", rate=" + f);
        SnsMethodCalculate.markEndTimeMs("getSpriteNum", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        aVar3.f285847g = round;
        int b = C76577a.m92151b(this.f281490d, 40);
        int b2 = C76577a.m92151b(this.f281490d, 80);
        int i5 = this.f281503t;
        if (i5 == 0) {
            this.f281499p = b;
            this.f281500q = b2;
        } else if (i5 == 1) {
            this.f281499p = b2;
            this.f281500q = b2;
        } else if (i5 == 2) {
            this.f281499p = b;
            this.f281500q = b;
        } else {
            this.f281499p = b;
            this.f281500q = b2;
        }
        aVar3.f285843c = this.f281500q;
        aVar3.f285842b = this.f281499p;
        Log.m105924i("SnsAdSphereAnimView", "doStartAnim, params=" + aVar3);
        if (this.f281498o) {
            Handler handler = this.f281495i;
            if (handler != null) {
                handler.post(new C96291a(aVar3));
            }
        } else {
            this.f281497n.postDelayed(new C96292b(aVar3), 100);
        }
        SnsMethodCalculate.markEndTimeMs("doStartAnim", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
    }

    /* renamed from: h */
    public void mo134033h(Context context) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        this.f281490d = context;
        this.f281497n = new Handler(Looper.getMainLooper());
        SnsMethodCalculate.markStartTimeMs("isUseGLAnimView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        boolean z = false;
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_longpress_anim_gl, 0);
            boolean z2 = Qe > 0;
            Log.m105924i("SnsAdSphereAnimView", "isUseGLAnimView, exptValue=" + Qe);
            SnsMethodCalculate.markEndTimeMs("isUseGLAnimView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
            z = z2;
        } catch (Throwable th) {
            Log.m105920e("SnsAdSphereAnimView", "isUseGLAnimView, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("isUseGLAnimView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        }
        this.f281498o = z;
        if (z) {
            GLViewContainer gLViewContainer = new GLViewContainer(context, (AttributeSet) null);
            this.f281492f = gLViewContainer;
            addView(gLViewContainer, new FrameLayout.LayoutParams(-1, -1));
            if (this.f281496j == null) {
                HandlerThread handlerThread = new HandlerThread("ad_press_anim");
                this.f281496j = handlerThread;
                handlerThread.start();
                this.f281495i = new Handler(this.f281496j.getLooper());
                Log.m105924i("SnsAdSphereAnimView", "new Thread, hash=" + this.f281496j.hashCode());
            }
            C115669n.INSTANCE.mo175911u(1572, 16);
        } else {
            this.f281491e = this;
        }
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        super.onDetachedFromWindow();
        SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        Log.m105924i("SnsAdSphereAnimView", "clear");
        this.f281504u = false;
        C97357a aVar = this.f281493g;
        if (aVar != null) {
            aVar.mo136627c();
            this.f281493g = null;
        }
        C97521a aVar2 = this.f281494h;
        if (aVar2 != null) {
            aVar2.mo136627c();
            this.f281494h = null;
        }
        HandlerThread handlerThread = this.f281496j;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            Log.m105924i("SnsAdSphereAnimView", "exit Thread, hash=" + this.f281496j.hashCode());
        }
        Handler handler = this.f281495i;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        this.f281497n.removeCallbacksAndMessages((Object) null);
        SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        super.onLayout(z, i, i2, i3, i4);
        Log.m105918d("SnsAdSphereAnimView", "onLayout, changed=" + z + ", w=" + getWidth() + ", h=" + getHeight());
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        super.onMeasure(i, i2);
        Log.m105918d("SnsAdSphereAnimView", "onMeasure, w=" + getMeasuredWidth() + ", h=" + getMeasuredHeight());
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
        super.onSizeChanged(i, i2, i3, i4);
        Log.m105924i("SnsAdSphereAnimView", "onSizeChanged, w=" + i + ", h=" + i2 + ", isAppendAnim=" + this.f281504u);
        if (!(i == 0 || i2 == 0 || !this.f281504u)) {
            mo134032g(i, i2);
        }
        SnsMethodCalculate.markEndTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
    }

    public SnsAdSphereAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo134033h(context);
    }
}
