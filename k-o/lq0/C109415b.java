package lq0;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.app.C103422m;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.appbrand.openmaterial.p470ui.hybrid.C104800a;
import com.tencent.p014mm.plugin.appbrand.openmaterial.p470ui.hybrid.HybridOpenMaterialView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kq0.C109031a;

/* renamed from: lq0.b */
public final class C109415b extends C103422m {

    /* renamed from: f */
    public final HybridOpenMaterialView f327535f;

    /* renamed from: g */
    public C109031a.C109032a f327536g;

    /* renamed from: lq0.b$a */
    public static final class C109416a extends HybridOpenMaterialView.C104799k {

        /* renamed from: a */
        public Integer f327537a;

        /* renamed from: b */
        public final /* synthetic */ C109415b f327538b;

        public C109416a(C109415b bVar) {
            this.f327538b = bVar;
        }

        /* renamed from: a */
        public void mo148671a() {
            Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialDialog", "dismiss");
            try {
                C109415b.super.dismiss();
            } catch (Exception e) {
                Log.m105928w("MicroMsg.AppBrand.HybridOpenMaterialDialog", "super#dismiss, fail since " + e);
            }
        }

        /* renamed from: b */
        public void mo148672b(int i) {
            Integer num = this.f327537a;
            if (num == null || i != num.intValue()) {
                C109031a.C109032a aVar = this.f327538b.f327536g;
                if (aVar != null) {
                    aVar.mo158302b(i);
                }
                this.f327537a = Integer.valueOf(i);
            }
        }
    }

    /* renamed from: lq0.b$b */
    public static final class C109417b implements DialogInterface.OnShowListener {

        /* renamed from: d */
        public final /* synthetic */ C109415b f327539d;

        public C109417b(C109415b bVar) {
            this.f327539d = bVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            HybridOpenMaterialView hybridOpenMaterialView = this.f327539d.f327535f;
            hybridOpenMaterialView.f311233D = true;
            float f = (float) (hybridOpenMaterialView.f311240i ? hybridOpenMaterialView.f311244p : hybridOpenMaterialView.f311245q);
            Log.m105919d("MicroMsg.AppBrand.HybridOpenMaterialView", "show, from: %d, to: %d", Integer.valueOf(hybridOpenMaterialView.f311243o), Integer.valueOf((int) f));
            MMWebView mMWebView = hybridOpenMaterialView.f311238g;
            if (mMWebView != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mMWebView.getLayoutParams();
                if (!(-1 == layoutParams.width && -1 == layoutParams.height)) {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    hybridOpenMaterialView.f311238g.setLayoutParams(layoutParams);
                }
                hybridOpenMaterialView.f311238g.setBackgroundColor(hybridOpenMaterialView.getResources().getColor(C0966R.color.f2928b));
            }
            hybridOpenMaterialView.f311235d.setTranslationY((float) hybridOpenMaterialView.f311243o);
            hybridOpenMaterialView.f311235d.animate().translationY(f).setDuration(200).setInterpolator(new DecelerateInterpolator()).setUpdateListener(new C109418c(hybridOpenMaterialView)).setListener(new C104800a(hybridOpenMaterialView)).start();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109415b(Context context) {
        super(context, C0966R.style.f8218n);
        C87412m.m108594g(context, "context");
        this.f327535f = new HybridOpenMaterialView(context, (AttributeSet) null);
        mo143460C(1);
    }

    public void dismiss() {
        this.f327535f.hide();
    }

    public void onCreate(Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(67108864);
        }
        HybridOpenMaterialView hybridOpenMaterialView = this.f327535f;
        if (hybridOpenMaterialView.f311240i) {
            Rect rect = new Rect();
            hybridOpenMaterialView.getWindowVisibleDisplayFrame(rect);
            Log.m105918d("MicroMsg.AppBrand.HybridOpenMaterialView", "generateMyLayoutParams, windowVisibleRect: " + rect);
            layoutParams = new ViewGroup.LayoutParams((int) ((((float) rect.right) * 1.0f) / 2.0f), -1);
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(layoutParams.width, layoutParams.height);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setWindowAnimations(C0966R.style.f8219p);
        }
        this.f327535f.setListener(new C109416a(this));
        setContentView(this.f327535f, new ViewGroup.LayoutParams(-1, -1));
        setOnShowListener(new C109417b(this));
        setCancelable(true);
    }
}
