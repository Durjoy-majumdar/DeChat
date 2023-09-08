package gt0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.widget.dialog.C84926a;
import j20.C117292a;
import java.util.ArrayList;
import te3.C64280c93;
import te3.c85;

/* renamed from: gt0.n */
public class C59703n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f170558d;

    /* renamed from: e */
    public final /* synthetic */ c85 f170559e;

    /* renamed from: f */
    public final /* synthetic */ Runnable f170560f;

    /* renamed from: g */
    public final /* synthetic */ C84926a f170561g;

    public C59703n(C84926a aVar, AppBrandRuntimeWC appBrandRuntimeWC, c85 c85, Runnable runnable) {
        this.f170561g = aVar;
        this.f170558d = appBrandRuntimeWC;
        this.f170559e = c85;
        this.f170560f = runnable;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f170561g.mo117760g(this.f170558d, true, (C64280c93) null, this.f170559e);
        this.f170561g.mo117754a();
        this.f170560f.run();
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
