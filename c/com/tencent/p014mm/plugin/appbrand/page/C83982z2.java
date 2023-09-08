package com.tencent.p014mm.plugin.appbrand.page;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C40478h;
import gy3.C87412m;
import rq0.C90087f;

/* renamed from: com.tencent.mm.plugin.appbrand.page.z2 */
public final class C83982z2 implements C90087f {

    /* renamed from: d */
    public final C90087f f245169d;

    /* renamed from: e */
    public C40478h f245170e;

    /* renamed from: f */
    public boolean f245171f;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.z2$a */
    public static final class C83983a implements C40478h.C40479a {
        public C83983a(C83982z2 z2Var) {
        }
    }

    public C83982z2(C90087f fVar) {
        C87412m.m108594g(fVar, "originExtension");
        this.f245169d = fVar;
    }

    /* renamed from: V0 */
    public void mo63305V0() {
        this.f245171f = true;
        C40478h hVar = this.f245170e;
        if (hVar != null) {
            hVar.mo63305V0();
        }
        this.f245169d.mo63305V0();
    }

    /* renamed from: f0 */
    public void mo63313f0() {
        View androidView;
        boolean z = false;
        this.f245171f = false;
        C40478h hVar = this.f245170e;
        if (!(hVar == null || (androidView = hVar.getAndroidView()) == null || androidView.getVisibility() != 0)) {
            z = true;
        }
        if (z) {
            C40478h hVar2 = this.f245170e;
            C87412m.m108591d(hVar2);
            hVar2.mo63313f0();
            return;
        }
        this.f245169d.mo63313f0();
    }

    /* renamed from: i */
    public final void mo116617i(C40478h hVar) {
        if (!C87412m.m108589b(this.f245170e, hVar)) {
            this.f245170e = hVar;
            if (this.f245171f) {
                mo63305V0();
            } else {
                mo63313f0();
                if (this.f245170e != null) {
                    this.f245169d.mo63305V0();
                }
            }
            if (hVar != null) {
                hVar.mo63233g0(new C83983a(this));
            }
        }
    }
}
