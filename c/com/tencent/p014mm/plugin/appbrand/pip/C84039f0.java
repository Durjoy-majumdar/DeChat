package com.tencent.p014mm.plugin.appbrand.pip;

import android.graphics.Point;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.pip.C84059t;
import com.tencent.p014mm.plugin.appbrand.widget.AppBrandPipContainerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import gy3.C87412m;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.pip.f0 */
public final class C84039f0 extends C84032c0 {

    /* renamed from: b */
    public volatile Point f245379b;

    /* renamed from: com.tencent.mm.plugin.appbrand.pip.f0$a */
    public static final class C84040a<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C84039f0 f245380d;

        /* renamed from: e */
        public final /* synthetic */ C84027b0 f245381e;

        public C84040a(C84039f0 f0Var, C84027b0 b0Var) {
            this.f245380d = f0Var;
            this.f245381e = b0Var;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Point point = (Point) obj;
            this.f245380d.f245379b = point;
            C84059t.C84062c cVar = (C84059t.C84062c) this.f245381e;
            if (point == null) {
                Log.m105924i(C84059t.this.f245415a, "onPipStablePosGot, point is null");
                return;
            }
            cVar.getClass();
            ((C119157j) C119157j.f356862d).mo183895z(new C84066w(cVar, point));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.pip.f0$b */
    public static final class C84041b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C84039f0 f245382d;

        /* renamed from: e */
        public final /* synthetic */ Point f245383e;

        public C84041b(C84039f0 f0Var, Point point) {
            this.f245382d = f0Var;
            this.f245383e = point;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            this.f245382d.f245379b = this.f245383e;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84039f0(String str, AppBrandPipContainerView appBrandPipContainerView) {
        super(str, appBrandPipContainerView);
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(appBrandPipContainerView, "pipContainerView");
    }

    /* renamed from: a */
    public void mo116689a(C84027b0 b0Var) {
        C87412m.m108594g(b0Var, "callback");
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCString(this.f245369a), C29617h0.class, new C84040a(this, b0Var));
    }

    /* renamed from: b */
    public void mo116690b(Point point) {
        C87412m.m108594g(point, "point");
        if (C87412m.m108589b(point, this.f245379b)) {
            Log.m105924i("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "saveStablePos, same pos");
        } else {
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new PipStablePos(this.f245369a, point), C29619j0.class, new C84041b(this, point));
        }
    }
}
