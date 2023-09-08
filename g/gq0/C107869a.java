package gq0;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.tools.C7007c1;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel;
import com.tencent.p014mm.plugin.appbrand.openmaterial.p470ui.hybrid.OpenMaterialJsBridge;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gq0.C107879e0;
import gy3.C8480h;
import gy3.C87412m;
import iq0.C98783b;
import java.util.List;
import jq0.C108762a;
import kq0.C109031a;
import lq0.C109412a;
import lq0.C109415b;
import qo3.C77407n;

/* renamed from: gq0.a */
public final class C107869a implements C107879e0 {

    /* renamed from: o */
    public static final C107870a f323008o = new C107870a((C8480h) null);

    /* renamed from: p */
    public static C98783b f323009p;

    /* renamed from: d */
    public final Context f323010d;

    /* renamed from: e */
    public final C77407n f323011e;

    /* renamed from: f */
    public final AppBrandOpenMaterialCollection f323012f;

    /* renamed from: g */
    public final C45944i0 f323013g;

    /* renamed from: h */
    public final C107884f0 f323014h;

    /* renamed from: i */
    public C109031a f323015i;

    /* renamed from: j */
    public OpenMaterialJsBridge f323016j;

    /* renamed from: n */
    public C107879e0.C107882c f323017n;

    /* renamed from: gq0.a$a */
    public static final class C107870a implements C107879e0.C107881b {
        public C107870a(C8480h hVar) {
        }

        /* renamed from: a */
        public C107879e0.C107881b mo158295a(C98783b bVar) {
            C87412m.m108594g(bVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            Log.m105918d("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "setScene, scene: " + bVar);
            C107869a.f323009p = bVar;
            return this;
        }

        /* renamed from: b */
        public C107879e0 mo158296b(Context context, C77407n nVar, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection, C45944i0 i0Var, C107884f0 f0Var) {
            C108762a aVar;
            AppBrandOpenMaterialCollection appBrandOpenMaterialCollection2 = appBrandOpenMaterialCollection;
            Context context2 = context;
            C87412m.m108594g(context, "context");
            C87412m.m108594g(appBrandOpenMaterialCollection, "openMaterialCollection");
            Log.m105918d("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "create");
            if (!mo158297c(appBrandOpenMaterialCollection)) {
                Log.m105924i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "create, can not create, use dummy");
                return C107879e0.f323038r0;
            } else if (C98168o.m126815a(context)) {
                C45944i0 i0Var2 = i0Var == null ? C45944i0.f123944a : i0Var;
                if (f0Var == null) {
                    C98783b bVar = C107869a.f323009p;
                    C87412m.m108591d(bVar);
                    aVar = new C108762a(bVar, appBrandOpenMaterialCollection, (String) null, 4, (C8480h) null);
                } else {
                    aVar = f0Var;
                }
                return new C107869a(context, nVar, appBrandOpenMaterialCollection, i0Var2, aVar);
            } else {
                Log.m105924i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "create, context is invalid, use dummy");
                return C107879e0.f323038r0;
            }
        }

        /* renamed from: c */
        public boolean mo158297c(AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
            C87412m.m108594g(appBrandOpenMaterialCollection, "openMaterialCollection");
            List<AppBrandOpenMaterialDetailModel> list = appBrandOpenMaterialCollection.f311217f;
            C87412m.m108593f(list, "openMaterialCollection.a…dOpenMaterialDetailModels");
            return !list.isEmpty();
        }
    }

    public C107869a(Context context, C77407n nVar, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection, C45944i0 i0Var, C107884f0 f0Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(appBrandOpenMaterialCollection, "openMaterialCollection");
        C87412m.m108594g(i0Var, "launchAppBrandExecutor");
        C87412m.m108594g(f0Var, "openMaterialReporter");
        this.f323010d = context;
        this.f323011e = nVar;
        this.f323012f = appBrandOpenMaterialCollection;
        this.f323013g = i0Var;
        this.f323014h = f0Var;
        if (context instanceof MMFragmentActivity) {
            ((MMFragmentActivity) context).keep(this);
        } else {
            Log.m105920e("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "<init>, context is not lifecycle keeper");
        }
    }

    /* renamed from: G */
    public void mo158290G(C107879e0.C107882c cVar) {
        this.f323017n = cVar;
    }

    /* renamed from: a */
    public final void mo158291a() {
        Window window;
        C109031a aVar = this.f323015i;
        View view = null;
        C109412a aVar2 = aVar;
        if (aVar == null) {
            C109412a aVar3 = new C109412a(this.f323010d, new C107878e(this));
            aVar3.f327528f.f327536g = new C107883f(this);
            View inflate = LayoutInflater.from(this.f323010d).inflate(C0966R.C0971layout.blx, (ViewGroup) null);
            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.fcm);
            if (imageView != null) {
                imageView.setImageResource(C85875k4.m106211z() ? C0966R.C0969drawable.f357090bt2 : C0966R.C0969drawable.bsy);
                imageView.setOnClickListener(new C76021g(this));
                C7007c1.m7256a(imageView);
            }
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kyn);
            if (textView != null) {
                textView.setText(C0966R.string.f7767r2);
            }
            aVar3.f327528f.f327535f.setTitleView(inflate);
            aVar3.f327527e = inflate;
            aVar3.f327528f.setOnDismissListener(new C107889i(this));
            this.f323015i = aVar3;
            aVar2 = aVar3;
        }
        C109412a aVar4 = (C109412a) aVar2;
        C109415b bVar = aVar4.f327528f;
        Window window2 = bVar.getWindow();
        if (window2 != null) {
            window2.addFlags(Integer.MIN_VALUE);
        }
        C77407n nVar = this.f323011e;
        boolean z = true;
        if ((nVar != null && true == nVar.f225774j1) && (window = bVar.getWindow()) != null) {
            window.addFlags(1024);
        }
        C77407n nVar2 = this.f323011e;
        if (nVar2 != null && true == nVar2.f225779n1) {
            Window window3 = bVar.getWindow();
            if (window3 != null) {
                window3.setFlags(8, 8);
            }
            Window window4 = bVar.getWindow();
            if (window4 != null) {
                window4.addFlags(131200);
            }
            Window window5 = bVar.getWindow();
            if (window5 != null) {
                view = window5.getDecorView();
            }
            if (view != null) {
                view.setSystemUiVisibility(6);
            }
        } else {
            Window window6 = bVar.getWindow();
            if (window6 != null) {
                window6.clearFlags(8);
            }
            Window window7 = bVar.getWindow();
            if (window7 != null) {
                window7.clearFlags(131072);
            }
            Window window8 = bVar.getWindow();
            if (window8 != null) {
                window8.clearFlags(128);
            }
            Window window9 = bVar.getWindow();
            if (window9 != null) {
                view = window9.getDecorView();
            }
            if (view != null) {
                view.setSystemUiVisibility(0);
            }
        }
        Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialBottomSheet", "show");
        aVar4.f327531i = 2 == aVar4.f327526d.getResources().getConfiguration().orientation;
        Context context = aVar4.f327526d;
        aVar4.f327532j = context instanceof Activity ? ((Activity) context).getWindowManager().getDefaultDisplay().getRotation() : 0;
        View view2 = (View) aVar4.f327529g.getValue();
        if (view2 != null) {
            if (aVar4.f327530h != null) {
                z = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            aVar4.f327530h = viewTreeObserver;
            if (z && viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(aVar4);
            }
        }
        Context context2 = aVar4.f327526d;
        if (!(context2 instanceof Activity) || ((Activity) context2).isFinishing() || ((Activity) aVar4.f327526d).isDestroyed()) {
            aVar4.f327528f.show();
        } else {
            aVar4.f327528f.show();
        }
    }

    public void dead() {
        C109031a aVar = this.f323015i;
        if (aVar != null) {
            ((C109412a) aVar).dead();
        }
    }

    public void hide() {
        C109031a aVar = this.f323015i;
        if (aVar != null) {
            aVar.hide();
        }
    }

    public void show() {
        Log.m105924i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "show");
        this.f323014h.mo158309g();
        mo158291a();
    }

    /* renamed from: x */
    public void mo158294x() {
        Log.m105924i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "showDirectly");
        this.f323014h.mo158306d();
        mo158291a();
    }
}
