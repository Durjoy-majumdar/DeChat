package com.tencent.p014mm.plugin.finder.view;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.finder.view.C56664y5;
import ft3.C45807d;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60216z4;
import o40.C61926c;
import rx3.C13598b0;
import te3.fp4;

/* renamed from: com.tencent.mm.plugin.finder.view.b6 */
public final class C56587b6 implements C60216z4.C8821a<Object> {

    /* renamed from: a */
    public final /* synthetic */ Bundle f162221a;

    /* renamed from: b */
    public final /* synthetic */ C4191v0 f162222b;

    /* renamed from: com.tencent.mm.plugin.finder.view.b6$a */
    public static final class C56588a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C4191v0 f162223d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f162224e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56588a(C4191v0 v0Var, Bundle bundle) {
            super(0);
            this.f162223d = v0Var;
            this.f162224e = bundle;
        }

        public Object invoke() {
            C56664y5.C56665a aVar = C56664y5.f162421d;
            View view = this.f162223d.f18463f;
            C87412m.m108593f(view, "dialog.rootView");
            aVar.mo80022f(view, this.f162224e);
            return C13598b0.f38549a;
        }
    }

    public C56587b6(Bundle bundle, C4191v0 v0Var) {
        this.f162221a = bundle;
        this.f162222b = v0Var;
    }

    /* renamed from: a */
    public void mo6382a(Object obj) {
        C87412m.m108594g(obj, "ret");
        if (obj instanceof fp4) {
            this.f162221a.putString("UserPreviewInfo", C45807d.m51084a(((fp4) obj).toByteArray()));
            C61926c.m72668M(new C56588a(this.f162222b, this.f162221a));
        }
    }
}
