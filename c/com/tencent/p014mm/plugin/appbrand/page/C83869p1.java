package com.tencent.p014mm.plugin.appbrand.page;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.menu.C83699y;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import p225rc.C89917h;

/* renamed from: com.tencent.mm.plugin.appbrand.page.p1 */
public class C83869p1 implements View.OnClickListener {

    /* renamed from: d */
    public boolean f244860d = true;

    /* renamed from: e */
    public final Runnable f244861e = new C83870a();

    /* renamed from: f */
    public final Runnable f244862f = new C83871b();

    /* renamed from: g */
    public final /* synthetic */ C83780d1 f244863g;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.p1$a */
    public class C83870a implements Runnable {
        public C83870a() {
        }

        public void run() {
            C83869p1.this.f244860d = false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.p1$b */
    public class C83871b implements Runnable {
        public C83871b() {
        }

        public void run() {
            C83869p1.this.f244860d = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.p1$c */
    public class C83872c implements Runnable {
        public C83872c() {
        }

        public void run() {
            if (C83869p1.this.f244863g.isRunning()) {
                List<C83699y> I0 = C83869p1.this.f244863g.mo116154I0();
                if (I0 == null || I0.size() <= 0) {
                    Log.m105929w("MicroMsg.AppBrandPageView", "showPageActionSheet appId[%s], url[%s], empty list skip", C83869p1.this.f244863g.getAppId(), C83869p1.this.f244863g.mo116162Q0());
                    return;
                }
                C83869p1 p1Var = C83869p1.this;
                p1Var.f244863g.mo116181i1(I0, p1Var.f244861e, p1Var.f244862f);
            }
        }
    }

    public C83869p1(C83780d1 d1Var) {
        this.f244863g = d1Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandPageView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f244860d) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f244863g.mo109670o(new C83872c(), (long) (C89917h.m112458a(this.f244863g.getContext()) ? 100 : 0));
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
