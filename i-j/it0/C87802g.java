package it0;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.autogen.events.AppBrandHalfScreenCloseAnimationSettingEvent;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.widget.C85006j;
import com.tencent.p014mm.plugin.appbrand.widget.C85007k;
import com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: it0.g */
public final class C87802g implements C85006j {

    /* renamed from: a */
    public final AppBrandRuntimeWC f254176a;

    /* renamed from: it0.g$a */
    public static final class C87803a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<Boolean> f254177d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87803a(C32224a<Boolean> aVar) {
            super(0);
            this.f254177d = aVar;
        }

        public Object invoke() {
            this.f254177d.invoke();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: it0.g$b */
    public static final class C87804b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C87802g f254178d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87804b(C87802g gVar) {
            super(0);
            this.f254178d = gVar;
        }

        public Object invoke() {
            Activity R = this.f254178d.f254176a.mo113026R();
            if (R == null) {
                return null;
            }
            HalfScreenConfig halfScreenConfig = this.f254178d.f254176a.mo113210l1().f234815R0;
            C60623h hVar = C60623h.f172727d;
            halfScreenConfig.getClass();
            C87412m.m108594g(hVar, "toAnimationRes");
            boolean z = false;
            if (!C87412m.m108589b(halfScreenConfig.f157949i, HalfScreenConfig.CloseWhenClickEmptyAreaConfig.f157970f)) {
                AppBrandHalfScreenCloseAnimationSettingEvent appBrandHalfScreenCloseAnimationSettingEvent = new AppBrandHalfScreenCloseAnimationSettingEvent();
                appBrandHalfScreenCloseAnimationSettingEvent.f236130d.f236131a = R.hashCode();
                AppBrandHalfScreenCloseAnimationSettingEvent.C80701a aVar = appBrandHalfScreenCloseAnimationSettingEvent.f236130d;
                aVar.getClass();
                aVar.f236132b = ((Number) hVar.invoke(halfScreenConfig.f157949i.f157972e)).intValue();
                appBrandHalfScreenCloseAnimationSettingEvent.publish();
                Intent intent = new Intent();
                intent.putExtra("extra_start_by_half_screen_empty_area_click_scene", true);
                intent.addFlags(603979776);
                intent.setClass(R, Class.forName(halfScreenConfig.f157949i.f157971d));
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent);
                C117292a.m165358d(R, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/config/HalfScreenConfig", "performCloseHalfScreen", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function1;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                R.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(R, "com/tencent/mm/plugin/appbrand/config/HalfScreenConfig", "performCloseHalfScreen", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function1;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public C87802g(AppBrandRuntimeWC appBrandRuntimeWC) {
        C87412m.m108594g(appBrandRuntimeWC, "rt");
        this.f254176a = appBrandRuntimeWC;
    }

    /* renamed from: a */
    public boolean mo117944a() {
        HalfScreenConfig halfScreenConfig = this.f254176a.mo113210l1().f234815R0;
        C87412m.m108593f(halfScreenConfig, "rt.initConfig.halfScreenConfig");
        if (!halfScreenConfig.mo76931c() || !halfScreenConfig.f157946f) {
            return true;
        }
        C85007k kVar = this.f254176a.f238298z1.f247571d;
        if (kVar != null) {
            kVar.mo117951f((C85006j) null);
        }
        C87804b bVar = new C87804b(this);
        if (this.f254176a.f238298z1.mo117792o()) {
            HalfScreenManger halfScreenManger = this.f254176a.f238298z1;
            C87803a aVar = new C87803a(bVar);
            halfScreenManger.getClass();
            halfScreenManger.f247575h.add(aVar);
        } else {
            bVar.invoke();
        }
        if (this.f254176a.f238116N) {
            this.f254176a.mo113063k();
            return true;
        }
        this.f254176a.mo113006E();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo117945b(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "ev"
            gy3.C87412m.m108594g(r4, r0)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r3.f254176a
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.mo113210l1()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.f234815R0
            java.lang.String r1 = "rt.initConfig.halfScreenConfig"
            gy3.C87412m.m108593f(r0, r1)
            boolean r1 = r0.mo76931c()
            if (r1 == 0) goto L_0x0058
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e r0 = r0.f157932C
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e r1 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55455e.EMBED
            if (r0 != r1) goto L_0x0058
            r0 = 0
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r3.f254176a     // Catch:{ all -> 0x002b }
            com.tencent.mm.plugin.appbrand.e3 r2 = r1.f238142e     // Catch:{ all -> 0x002b }
            if (r2 == 0) goto L_0x002c
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r2.mo113136o(r1)     // Catch:{ all -> 0x002b }
            goto L_0x002d
        L_0x002b:
        L_0x002c:
            r1 = r0
        L_0x002d:
            if (r1 == 0) goto L_0x0058
            qq0.e r1 = r1.f238159x
            r1.getClass()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            qq0.d r1 = r1.f258188c
            if (r1 == 0) goto L_0x0052
            r1.getHitRect(r2)
            float r0 = r4.getX()
            int r0 = (int) r0
            float r4 = r4.getY()
            int r4 = (int) r4
            boolean r4 = r2.contains(r0, r4)
            if (r4 == 0) goto L_0x0058
            r4 = 0
            return r4
        L_0x0052:
            java.lang.String r4 = "capsuleBarView"
            gy3.C87412m.m108603p(r4)
            throw r0
        L_0x0058:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: it0.C87802g.mo117945b(android.view.MotionEvent):boolean");
    }
}
