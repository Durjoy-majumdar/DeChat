package it0;

import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.widget.C84927e;
import com.tencent.p014mm.plugin.appbrand.widget.C84933h;
import com.tencent.p014mm.plugin.appbrand.widget.C85006j;
import com.tencent.p014mm.plugin.appbrand.widget.C85007k;
import com.tencent.p014mm.plugin.appbrand.widget.C85012q;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: it0.k */
public final class C87811k implements C85007k {

    /* renamed from: a */
    public final AppBrandRuntimeWC f254214a;

    /* renamed from: b */
    public final C85007k f254215b;

    /* renamed from: c */
    public View.OnAttachStateChangeListener f254216c;

    /* renamed from: it0.k$a */
    public static final class C87812a implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C87811k f254217d;

        /* renamed from: e */
        public final /* synthetic */ C84933h f254218e;

        /* renamed from: f */
        public final /* synthetic */ AnimatorListenerAdapter f254219f;

        public C87812a(C87811k kVar, C84933h hVar, AnimatorListenerAdapter animatorListenerAdapter) {
            this.f254217d = kVar;
            this.f254218e = hVar;
            this.f254219f = animatorListenerAdapter;
        }

        public void onViewAttachedToWindow(View view) {
            this.f254217d.f254215b.mo117953h(this.f254218e, this.f254219f);
            C84927e eVar = this.f254217d.f254214a.f238153r;
            if (eVar != null) {
                eVar.removeOnAttachStateChangeListener(this);
            }
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public C87811k(AppBrandRuntimeWC appBrandRuntimeWC, C85007k kVar, C8480h hVar) {
        this.f254214a = appBrandRuntimeWC;
        this.f254215b = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo117946a(android.view.MotionEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "ev"
            gy3.C87412m.m108594g(r5, r0)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r4.f254214a
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r0 = r0.mo113212m1()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003e
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r4.f254214a
            com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger r0 = r0.f238298z1
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = r0.f247568a
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = r3.mo113210l1()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r3 = r3.f234815R0
            boolean r3 = r3.f157951n
            if (r3 == 0) goto L_0x0020
            goto L_0x0029
        L_0x0020:
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.mo117782e()
            int r0 = r0.f157944d
            r3 = -1
            if (r0 == r3) goto L_0x002b
        L_0x0029:
            r0 = 1
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r0 == 0) goto L_0x003e
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r4.f254214a
            com.tencent.mm.plugin.appbrand.widget.e r0 = r0.f238153r
            if (r0 == 0) goto L_0x0039
            boolean r0 = r0.isAttachedToWindow()
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 == 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 != 0) goto L_0x0042
            return r2
        L_0x0042:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r4.f254214a
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r0 = r0.mo113212m1()
            int r3 = r5.getAction()
            if (r3 != 0) goto L_0x0081
            int r3 = r0.getPageCount()
            if (r3 != r1) goto L_0x0081
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = r4.f254214a
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = r3.mo113210l1()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r3 = r3.f234815R0
            boolean r3 = r3.mo76931c()
            if (r3 == 0) goto L_0x0078
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = r4.f254214a
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = r3.mo113210l1()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r3 = r3.f234815R0
            boolean r3 = r3.f157951n
            if (r3 == 0) goto L_0x0078
            com.tencent.mm.plugin.appbrand.page.i0 r0 = r0.getCurrentPage()
            if (r0 == 0) goto L_0x0081
            r0.setEnableGesture(r2)
            goto L_0x0081
        L_0x0078:
            com.tencent.mm.plugin.appbrand.page.i0 r0 = r0.getCurrentPage()
            if (r0 == 0) goto L_0x0081
            r0.setEnableGesture(r1)
        L_0x0081:
            com.tencent.mm.plugin.appbrand.widget.k r0 = r4.f254215b
            boolean r5 = r0.mo117946a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: it0.C87811k.mo117946a(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if ((r0 != null ? r0.isAttachedToWindow() : false) != false) goto L_0x003e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo117947b(android.view.MotionEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "ev"
            gy3.C87412m.m108594g(r5, r0)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r4.f254214a
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r0 = r0.mo113212m1()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003d
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r4.f254214a
            com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger r0 = r0.f238298z1
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = r0.f247568a
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = r3.mo113210l1()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r3 = r3.f234815R0
            boolean r3 = r3.f157951n
            if (r3 == 0) goto L_0x0020
            goto L_0x0029
        L_0x0020:
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.mo117782e()
            int r0 = r0.f157944d
            r3 = -1
            if (r0 == r3) goto L_0x002b
        L_0x0029:
            r0 = 1
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r0 == 0) goto L_0x003d
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r4.f254214a
            com.tencent.mm.plugin.appbrand.widget.e r0 = r0.f238153r
            if (r0 == 0) goto L_0x0039
            boolean r0 = r0.isAttachedToWindow()
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            if (r1 != 0) goto L_0x0041
            return r2
        L_0x0041:
            com.tencent.mm.plugin.appbrand.widget.k r0 = r4.f254215b
            boolean r5 = r0.mo117947b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: it0.C87811k.mo117947b(android.view.MotionEvent):boolean");
    }

    /* renamed from: c */
    public void mo117948c(int i, int i2, int i3, int i4) {
        this.f254215b.mo117948c(i, i2, i3, i4);
    }

    /* renamed from: d */
    public void mo117949d(int i, int i2) {
        this.f254215b.mo117949d(i, i2);
    }

    /* renamed from: e */
    public void mo117950e(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (this.f254214a.mo113210l1().f234815R0.mo76931c()) {
            this.f254215b.mo117950e(z, z2, z3, z4, z5);
        }
    }

    /* renamed from: f */
    public void mo117951f(C85006j jVar) {
        this.f254215b.mo117951f(jVar);
    }

    public C85012q getCurrentStatus() {
        return this.f254215b.getCurrentStatus();
    }

    /* renamed from: h */
    public void mo117953h(C84933h hVar, AnimatorListenerAdapter animatorListenerAdapter) {
        C84927e eVar;
        C87412m.m108594g(hVar, "type");
        C84927e eVar2 = this.f254214a.f238153r;
        if (!(eVar2 != null ? eVar2.isAttachedToWindow() : false)) {
            View.OnAttachStateChangeListener onAttachStateChangeListener = this.f254216c;
            if (!(onAttachStateChangeListener == null || (eVar = this.f254214a.f238153r) == null)) {
                eVar.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            }
            C87812a aVar = new C87812a(this, hVar, animatorListenerAdapter);
            this.f254216c = aVar;
            C84927e eVar3 = this.f254214a.f238153r;
            if (eVar3 != null) {
                eVar3.addOnAttachStateChangeListener(aVar);
                return;
            }
            return;
        }
        this.f254215b.mo117953h(hVar, animatorListenerAdapter);
    }
}
