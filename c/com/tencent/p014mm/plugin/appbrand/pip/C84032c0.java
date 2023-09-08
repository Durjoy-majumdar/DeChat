package com.tencent.p014mm.plugin.appbrand.pip;

import android.graphics.Point;
import com.tencent.p014mm.plugin.appbrand.widget.AppBrandPipContainerView;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.pip.c0 */
public abstract class C84032c0 {

    /* renamed from: a */
    public final String f245369a;

    /* renamed from: com.tencent.mm.plugin.appbrand.pip.c0$a */
    public static final class C84033a implements AppBrandPipContainerView.C84917d {

        /* renamed from: a */
        public final /* synthetic */ C84032c0 f245370a;

        public C84033a(C84032c0 c0Var) {
            this.f245370a = c0Var;
        }

        /* renamed from: a */
        public final void mo116688a(int i, int i2) {
            this.f245370a.mo116690b(new Point(i, i2));
        }
    }

    public C84032c0(String str, AppBrandPipContainerView appBrandPipContainerView) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(appBrandPipContainerView, "pipContainerView");
        this.f245369a = str;
        appBrandPipContainerView.mo117657a(new C84033a(this));
    }

    /* renamed from: a */
    public abstract void mo116689a(C84027b0 b0Var);

    /* renamed from: b */
    public abstract void mo116690b(Point point);
}
