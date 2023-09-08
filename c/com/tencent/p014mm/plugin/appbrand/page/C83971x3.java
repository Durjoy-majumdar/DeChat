package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import bt0.C79808b;
import bt0.C79811f;
import bt0.b$$l;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView;
import gy3.C87412m;
import java.util.WeakHashMap;
import js0.C88020k;
import p849e3.C107168a0;
import p849e3.C107207u;
import qq0.C89796d;
import qq0.C89797e;

/* renamed from: com.tencent.mm.plugin.appbrand.page.x3 */
public class C83971x3 extends FrameLayout implements b$$l {

    /* renamed from: d */
    public C83780d1 f245154d;

    /* renamed from: e */
    public C79811f f245155e;

    /* renamed from: f */
    public C79808b f245156f;

    /* renamed from: g */
    public boolean f245157g = false;

    public C83971x3(Context context, C83780d1 d1Var) {
        super(context);
        this.f245154d = d1Var;
        C81634a.C81639e L0 = d1Var.mo116157L0();
        if (L0 != null) {
            int i = -1;
            if ("custom".equalsIgnoreCase(L0.f239653c)) {
                C79811f fVar = new C79811f(getContext());
                this.f245155e = fVar;
                fVar.setActuallyVisible(false);
                C79808b bVar = (C79808b) this.f245154d.f244576W.mo116271a(getContext(), C79808b.class);
                this.f245156f = bVar;
                bVar.setFullscreenMode(false);
                this.f245156f.mo109614d(true);
                try {
                    C89797e eVar = this.f245154d.getRuntime().f238159x;
                    AppBrandCapsuleBarPlaceHolderView capsuleView = this.f245156f.getCapsuleView();
                    if (capsuleView != null) {
                        C89796d dVar = eVar.f258188c;
                        if (dVar != null) {
                            capsuleView.setFixedWidth(dVar.getCapsuleContentAreaView().getMeasuredWidth());
                        } else {
                            C87412m.m108603p("capsuleBarView");
                            throw null;
                        }
                    } else {
                        eVar.getClass();
                    }
                } catch (NullPointerException unused) {
                }
                mo116606b();
                this.f245155e.addView(this.f245156f);
                addView(this.f245155e, -1, -2);
            }
            try {
                i = C88020k.m109562m(L0.f239657g);
            } catch (Exception unused2) {
            }
            setBackgroundColor(i);
        }
    }

    /* renamed from: a */
    public final void mo116605a() {
        if (this.f245156f != null) {
            if (getVisibility() == 0) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                if (C107207u.C107211e.m145207b(this)) {
                    this.f245156f.setLoadingIconVisibility(true);
                    this.f245155e.setActuallyVisible(true);
                    return;
                }
            }
            this.f245156f.setLoadingIconVisibility(false);
            this.f245155e.setActuallyVisible(false);
        }
    }

    /* renamed from: b */
    public final void mo116606b() {
        if (this.f245156f != null) {
            if (!TextUtils.isEmpty(this.f245154d.f244554F.getMainTitle())) {
                this.f245156f.setMainTitle(this.f245154d.f244554F.getMainTitle());
            } else {
                this.f245156f.setMainTitle(getContext().getString(C0966R.string.f7587kf));
            }
            this.f245156f.setNavHidden(this.f245154d.f244554F.f233902u);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo116605a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo116605a();
    }

    public void setBackgroundColor(int i) {
        if (i == 0) {
            setWillNotDraw(true);
            return;
        }
        int i2 = i | -16777216;
        setWillNotDraw(false);
        super.setBackgroundColor(i2);
        C79808b bVar = this.f245156f;
        if (bVar != null) {
            bVar.setBackgroundAlpha(1.0d);
            this.f245156f.setBackgroundColor(i2);
            this.f245156f.setForegroundStyle(!C74933u4.m89770g(i2));
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo116605a();
    }
}
