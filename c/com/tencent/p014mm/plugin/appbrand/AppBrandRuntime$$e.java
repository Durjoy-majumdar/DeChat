package com.tencent.p014mm.plugin.appbrand;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.appbrand.widget.C84927e;
import j20.C117292a;
import java.util.ArrayList;
import li0.C88508b;
import li0.C88509c;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$e */
public class AppBrandRuntime$$e implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: d */
    public final /* synthetic */ int f238171d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandRuntime f238172e;

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$e$a */
    public class C81067a implements Runnable {

        /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$e$a$a */
        public class C81068a implements C88509c.C88512b {
            public C81068a() {
            }

            /* renamed from: b */
            public void mo113102b(String str, C88508b bVar) {
                if (C88508b.FOREGROUND == bVar) {
                    AppBrandRuntime$$e.this.f238172e.mo113042Z().setActuallyVisible(true);
                    AppBrandRuntime$$e.this.f238172e.f238113K.mo122982e(this);
                }
            }
        }

        public C81067a() {
        }

        public void run() {
            AppBrandRuntime appBrandRuntime = AppBrandRuntime$$e.this.f238172e;
            if (appBrandRuntime.f238122S) {
                appBrandRuntime.mo113042Z().setActuallyVisible(true);
            } else {
                appBrandRuntime.f238113K.mo122978a(new C81068a());
            }
        }
    }

    public AppBrandRuntime$$e(AppBrandRuntime appBrandRuntime, int i) {
        this.f238172e = appBrandRuntime;
        this.f238171d = i;
    }

    public void onChildViewAdded(View view, View view2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/AppBrandRuntime$11", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        if (view2.hashCode() != this.f238171d && this.f238172e.f238155t) {
            view2.setImportantForAccessibility(4);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/AppBrandRuntime$11", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V");
    }

    public void onChildViewRemoved(View view, View view2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/AppBrandRuntime$11", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        if (this.f238172e.f238155t) {
            view2.setImportantForAccessibility(0);
        }
        if (view2.hashCode() == this.f238171d) {
            AppBrandRuntime appBrandRuntime = this.f238172e;
            appBrandRuntime.f238155t = false;
            C84927e eVar = appBrandRuntime.f238153r;
            eVar.f247549g = false;
            eVar.f247550h = null;
            for (int i = 0; i < this.f238172e.f238153r.getChildCount(); i++) {
                this.f238172e.f238153r.getChildAt(i).setImportantForAccessibility(0);
            }
            if (!this.f238172e.mo113064k0()) {
                C81067a aVar = new C81067a();
                this.f238172e.mo113011G0();
                if (this.f238172e.mo113042Z() == null) {
                    this.f238172e.mo113020N0(aVar);
                } else {
                    aVar.run();
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/AppBrandRuntime$11", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
    }
}
