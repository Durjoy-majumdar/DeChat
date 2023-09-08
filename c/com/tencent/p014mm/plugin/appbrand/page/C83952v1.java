package com.tencent.p014mm.plugin.appbrand.page;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import bt0.C79811f;
import bt0.b$$h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.weishi.C84905f;
import com.tencent.p014mm.sdk.platformtools.Log;
import hi3.C87515a;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.page.v1 */
public class C83952v1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83928t1 f245098d;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.v1$a */
    public class C83953a extends b$$h {
        public C83953a() {
        }

        /* renamed from: a */
        public int mo109966a() {
            return C0966R.dimen.f4063q_;
        }

        /* renamed from: d */
        public void mo109969d(ImageView imageView, ImageView imageView2, View view, View view2) {
            if (imageView != null) {
                imageView.setVisibility(0);
                imageView.clearColorFilter();
                Log.m105924i("MicroMsg.AppBrandPageViewWC", "[weishi] set close button");
                imageView.setImageDrawable(C87515a.m108835e(C83952v1.this.f245098d.getContext().getResources(), C0966R.raw.app_brand_weishi_video_btn_close, 0.0f));
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -2;
                imageView.setLayoutParams(layoutParams);
            }
            if (view != null) {
                view.setBackground((Drawable) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.v1$b */
    public class C83954b implements View.OnClickListener {
        public C83954b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$11$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.AppBrandPageViewWC", "[weishi] pageview click close button");
            C84905f.m104622c();
            C83928t1 t1Var = C83952v1.this.f245098d;
            if (t1Var.f245017a1 != null) {
                C83231l.m102146g(t1Var.getAppId(), C83231l.C83235e.CLOSE);
                C83952v1.this.f245098d.f245017a1.mo113063k();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$11$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C83952v1(C83928t1 t1Var) {
        this.f245098d = t1Var;
    }

    public void run() {
        if (this.f245098d.f244554F != null) {
            Log.m105924i("MicroMsg.AppBrandPageViewWC", "weishi customActionBar");
            this.f245098d.f244554F.setNavResetStyleListener(new C83953a());
            this.f245098d.f244554F.setFullscreenMode(true);
            this.f245098d.f244554F.setForegroundStyle(false);
            this.f245098d.f244554F.mo109614d(false);
            this.f245098d.f244554F.mo109949q(true);
            this.f245098d.f244554F.setBackButtonClickListener(new C83954b());
        }
        C83928t1 t1Var = this.f245098d;
        C79811f fVar = t1Var.f244553E;
        if (fVar != null) {
            fVar.setForceTopInsetsHeight(t1Var.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f4140tw));
        }
    }
}
