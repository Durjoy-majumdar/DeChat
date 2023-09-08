package com.tencent.p014mm.plugin.appbrand.utils;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p225rc.C12969d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wq0.C91075m;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.b0 */
public final class C84718b0 {

    /* renamed from: a */
    public static final C84718b0 f247110a = new C84718b0();

    /* renamed from: b */
    public static final C13601g f247111b = C36568h.m40985a(C84719a.f247112d);

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.b0$a */
    public static final class C84719a extends C87413o implements C32224a<C84714a0> {

        /* renamed from: d */
        public static final C84719a f247112d = new C84719a();

        public C84719a() {
            super(0);
        }

        public Object invoke() {
            return new C84714a0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.b0$b */
    public static final class C84720b implements C91075m.C91076a {

        /* renamed from: a */
        public final /* synthetic */ Runnable f247113a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f247114b;

        /* renamed from: com.tencent.mm.plugin.appbrand.utils.b0$b$a */
        public static final class C84721a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ int f247115d;

            /* renamed from: e */
            public final /* synthetic */ Runnable f247116e;

            /* renamed from: f */
            public final /* synthetic */ Runnable f247117f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C84721a(int i, Runnable runnable, Runnable runnable2) {
                super(0);
                this.f247115d = i;
                this.f247116e = runnable;
                this.f247117f = runnable2;
            }

            public Object invoke() {
                if (this.f247115d == 0) {
                    Runnable runnable = this.f247116e;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    Runnable runnable2 = this.f247117f;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C84720b(Runnable runnable, Runnable runnable2) {
            this.f247113a = runnable;
            this.f247114b = runnable2;
        }

        /* renamed from: a */
        public final void mo117448a(int i) {
            C12969d.m12411e(new C84721a(i, this.f247113a, this.f247114b));
        }
    }

    /* renamed from: a */
    public final void mo117447a(Context context, C82381f fVar, String str, Runnable runnable, Runnable runnable2) {
        C87412m.m108594g(context, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(fVar, "component");
        C87412m.m108594g(str, "permission");
        if (context instanceof Activity) {
            ((C84714a0) ((C36570n) f247111b).getValue()).mo117443a((Activity) context, fVar, str, new C84720b(runnable, runnable2));
        } else if (runnable2 != null) {
            runnable2.run();
        }
    }
}
