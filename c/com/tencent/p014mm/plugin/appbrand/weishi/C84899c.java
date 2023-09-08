package com.tencent.p014mm.plugin.appbrand.weishi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bt0.C79808b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84570o4;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import p1136n3.C109677a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.weishi.c */
public class C84899c extends FrameLayout implements C84570o4 {

    /* renamed from: d */
    public AppBrandRuntime f247426d;

    /* renamed from: e */
    public View f247427e;

    /* renamed from: f */
    public ImageView f247428f;

    /* renamed from: g */
    public C79808b f247429g;

    /* renamed from: h */
    public boolean f247430h = false;

    /* renamed from: i */
    public boolean f247431i = false;

    /* renamed from: j */
    public C32224a<C13598b0> f247432j = null;

    /* renamed from: n */
    public boolean f247433n = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.weishi.c$a */
    public class C84900a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f247434d;

        /* renamed from: com.tencent.mm.plugin.appbrand.weishi.c$a$a */
        public class C84901a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            public final /* synthetic */ ViewParent f247436d;

            /* renamed from: com.tencent.mm.plugin.appbrand.weishi.c$a$a$a */
            public class C84902a implements Runnable {
                public C84902a() {
                }

                public void run() {
                    C84899c.this.setVisibility(8);
                    C79808b bVar = C84899c.this.f247429g;
                    if (bVar != null) {
                        bVar.mo109942k();
                    }
                    C84901a aVar = C84901a.this;
                    ((ViewGroup) aVar.f247436d).removeView(C84899c.this);
                    C32224a aVar2 = C84900a.this.f247434d;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                }
            }

            public C84901a(ViewParent viewParent) {
                this.f247436d = viewParent;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C84899c.this.f247427e.setBackgroundColor(Color.argb(intValue, 0, 0, 0));
                if (intValue == 0) {
                    C84899c.this.post(new C84902a());
                }
            }
        }

        public C84900a(C32224a aVar) {
            this.f247434d = aVar;
        }

        public void run() {
            ViewParent parent = C84899c.this.getParent();
            if (parent instanceof ViewGroup) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{255, 0});
                ofInt.addUpdateListener(new C84901a(parent));
                ofInt.setStartDelay((long) Math.round(((float) ofInt.getDuration()) * 0.8f));
                ofInt.setDuration((long) Math.round(((float) ofInt.getDuration()) * 0.2f));
                ofInt.setInterpolator(new C109677a());
                ofInt.start();
            }
        }
    }

    public C84899c(Context context, AppBrandRuntime appBrandRuntime) {
        super(context);
        this.f247426d = appBrandRuntime;
        setClickable(true);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6476fv, this);
        this.f247427e = findViewById(C0966R.C0970id.jzk);
        this.f247428f = (ImageView) findViewById(C0966R.C0970id.f359370kk0);
        C79808b bVar = new C79808b(getContext());
        this.f247429g = bVar;
        bVar.setFullscreenMode(true);
        ((LinearLayout) findViewById(C0966R.C0970id.f5941sw)).addView(this.f247429g.getActionView());
        this.f247429g.setNavResetStyleListener(new C84897a(this));
        this.f247429g.setFullscreenMode(true);
        this.f247429g.setForegroundStyle(false);
        this.f247429g.mo109614d(false);
        this.f247429g.mo109949q(true);
        this.f247429g.setBackButtonClickListener(new C84898b(this));
        C84905f.m104623d(this.f247426d, this.f247428f, (Runnable) null);
    }

    /* renamed from: D */
    public void mo1911D(C32224a<C13598b0> aVar) {
        post(new C84900a(aVar));
    }

    /* renamed from: e */
    public void mo117197e(C32224a<C13598b0> aVar) {
        Log.m105925i("MicroMsg.AppBrandThumbLoadingSplash", "[weishi] hideLoadingSplashFromRuntime, alreadyHide: %b, canHide: %b", Boolean.valueOf(this.f247433n), Boolean.valueOf(this.f247430h));
        if (!this.f247433n) {
            if (this.f247430h) {
                mo1911D(aVar);
                this.f247433n = true;
                return;
            }
            this.f247431i = true;
            this.f247432j = aVar;
        }
    }

    public View getView() {
        return this;
    }

    /* renamed from: k */
    public void mo117201k(boolean z, String str) {
        Log.m105925i("MicroMsg.AppBrandThumbLoadingSplash", "[weishi] markCanHide, alreadyHide: %b, hideFromRuntime: %b", Boolean.valueOf(this.f247433n), Boolean.valueOf(this.f247431i));
        if (!this.f247433n) {
            if (this.f247431i) {
                mo1911D(this.f247432j);
                this.f247433n = true;
                return;
            }
            this.f247430h = true;
        }
    }

    /* renamed from: q */
    public void mo1912q(String str, String str2) {
    }

    /* renamed from: r */
    public void mo1913r(int i) {
    }

    public void setProgress(int i) {
    }
}
