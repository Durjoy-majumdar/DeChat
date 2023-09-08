package lq0;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.plugin.appbrand.openmaterial.p470ui.hybrid.HybridOpenMaterialView;
import com.tencent.p014mm.plugin.appbrand.openmaterial.p470ui.hybrid.OpenMaterialWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kq0.C109031a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;

/* renamed from: lq0.a */
public final class C109412a implements C109031a, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final Context f327526d;

    /* renamed from: e */
    public View f327527e;

    /* renamed from: f */
    public final C109415b f327528f;

    /* renamed from: g */
    public final C13601g f327529g = C36568h.m40986b(C13602i.NONE, new C109414b(this));

    /* renamed from: h */
    public ViewTreeObserver f327530h;

    /* renamed from: i */
    public boolean f327531i;

    /* renamed from: j */
    public int f327532j;

    /* renamed from: lq0.a$a */
    public static final class C109413a implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C109412a f327533d;

        public C109413a(C109412a aVar) {
            this.f327533d = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialBottomSheet", "onDismiss");
            ViewTreeObserver viewTreeObserver = this.f327533d.f327530h;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C109412a aVar = this.f327533d;
                    View view = (View) aVar.f327529g.getValue();
                    aVar.f327530h = view != null ? view.getViewTreeObserver() : null;
                    viewTreeObserver = this.f327533d.f327530h;
                }
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this.f327533d);
                }
                this.f327533d.f327530h = null;
            }
        }
    }

    /* renamed from: lq0.a$b */
    public static final class C109414b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C109412a f327534d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109414b(C109412a aVar) {
            super(0);
            this.f327534d = aVar;
        }

        public Object invoke() {
            Context context = this.f327534d.f327526d;
            if (!(context instanceof Activity)) {
                return null;
            }
            View findViewById = ((Activity) context).getWindow().getDecorView().findViewById(16908290);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.view.View");
            return findViewById;
        }
    }

    public C109412a(Context context, C32226l<? super OpenMaterialWebView, C13598b0> lVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(lVar, "contentViewConfigureAction");
        this.f327526d = context;
        C109415b bVar = new C109415b(context);
        this.f327528f = bVar;
        HybridOpenMaterialView hybridOpenMaterialView = bVar.f327535f;
        OpenMaterialWebView openMaterialWebView = new OpenMaterialWebView(context);
        lVar.invoke(openMaterialWebView);
        hybridOpenMaterialView.setContentView(openMaterialWebView);
        bVar.setOnDismissListener(new C109413a(this));
    }

    public void dead() {
        Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialBottomSheet", "dead");
        this.f327528f.f327535f.dead();
    }

    public void hide() {
        Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialBottomSheet", "hide");
        Context context = this.f327526d;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || ((Activity) this.f327526d).isDestroyed()) {
            this.f327528f.dismiss();
        } else {
            this.f327528f.dismiss();
        }
    }

    public void onGlobalLayout() {
        Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialBottomSheet", "onGlobalLayout");
        boolean isShowing = this.f327528f.isShowing();
        Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialBottomSheet", "isShowing, " + isShowing);
        if (isShowing) {
            View view = (View) this.f327529g.getValue();
            boolean z = true;
            if (!(view == null || (!view.isShown() && view.getVisibility() != 0))) {
                if (this.f327531i == (2 == this.f327526d.getResources().getConfiguration().orientation)) {
                    int i = this.f327532j;
                    Context context = this.f327526d;
                    if (i == (context instanceof Activity ? ((Activity) context).getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        z = false;
                    }
                }
                if (!z) {
                    return;
                }
            }
            hide();
        }
    }
}
