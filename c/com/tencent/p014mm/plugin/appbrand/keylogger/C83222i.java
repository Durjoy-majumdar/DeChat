package com.tencent.p014mm.plugin.appbrand.keylogger;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75054z4;
import vo0.C78458a;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.i */
public class C83222i implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ C78458a f243068d;

    /* renamed from: e */
    public final /* synthetic */ Context f243069e;

    /* renamed from: f */
    public final /* synthetic */ KeyStepAnalyserDetailActivity f243070f;

    public C83222i(KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity, C78458a aVar, Context context) {
        this.f243070f = keyStepAnalyserDetailActivity;
        this.f243068d = aVar;
        this.f243069e = context;
    }

    public void onGlobalLayout() {
        this.f243068d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (this.f243068d.getWidth() > 0) {
            Point a = C75054z4.m90003a(this.f243069e);
            this.f243070f.f243033i = (float) ((a.x / 2) - (this.f243068d.getWidth() / 2));
            this.f243070f.f243034j = (float) ((((a.y / 2) - (this.f243068d.getHeight() / 2)) - this.f243070f.findViewById(C0966R.C0970id.eu_).getHeight()) - this.f243070f.findViewById(C0966R.C0970id.f5380dl).getHeight());
            this.f243070f.f243035n = ((float) this.f243068d.getWidth()) / 2.0f;
            this.f243070f.f243036o = ((float) this.f243068d.getHeight()) / 2.0f;
            KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity = this.f243070f;
            float width = ((float) a.x) / ((float) this.f243068d.getWidth());
            keyStepAnalyserDetailActivity.f243038q = width;
            keyStepAnalyserDetailActivity.f243037p = width;
            KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity2 = this.f243070f;
            keyStepAnalyserDetailActivity2.f243031g.setTranslationX(keyStepAnalyserDetailActivity2.f243033i);
            KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity3 = this.f243070f;
            keyStepAnalyserDetailActivity3.f243031g.setTranslationY(keyStepAnalyserDetailActivity3.f243034j);
            KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity4 = this.f243070f;
            keyStepAnalyserDetailActivity4.f243031g.setPivotX(keyStepAnalyserDetailActivity4.f243035n);
            KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity5 = this.f243070f;
            keyStepAnalyserDetailActivity5.f243031g.setPivotY(keyStepAnalyserDetailActivity5.f243036o);
            KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity6 = this.f243070f;
            keyStepAnalyserDetailActivity6.f243031g.setScaleX(keyStepAnalyserDetailActivity6.f243037p);
            KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity7 = this.f243070f;
            keyStepAnalyserDetailActivity7.f243031g.setScaleY(keyStepAnalyserDetailActivity7.f243037p);
            this.f243070f.f243029e.requestLayout();
        }
    }
}
