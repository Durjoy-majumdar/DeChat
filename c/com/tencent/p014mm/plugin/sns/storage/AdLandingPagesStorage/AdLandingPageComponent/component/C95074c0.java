package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ps2.C100880k;
import ps2.C100891r;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c0 */
public class C95074c0 {

    /* renamed from: a */
    public Context f275960a;

    /* renamed from: b */
    public C104428a f275961b;

    /* renamed from: c */
    public View f275962c;

    /* renamed from: d */
    public int f275963d = -1;

    /* renamed from: e */
    public int f275964e = -1;

    /* renamed from: f */
    public boolean f275965f;

    /* renamed from: g */
    public boolean f275966g;

    /* renamed from: h */
    public C95078d f275967h;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c0$a */
    public class C95075a implements View.OnClickListener {
        public C95075a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet$1");
            C95074c0 c0Var = C95074c0.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
            C104428a aVar = c0Var.f275961b;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
            aVar.cancel();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c0$b */
    public class C95076b implements View.OnClickListener {
        public C95076b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBottomSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet$2");
            C95074c0 c0Var = C95074c0.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
            C104428a aVar = c0Var.f275961b;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
            aVar.cancel();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBottomSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c0$c */
    public class C95077c implements C100880k.C100881a {

        /* renamed from: a */
        public final /* synthetic */ ImageView f275970a;

        public C95077c(C95074c0 c0Var, ImageView imageView) {
            this.f275970a = imageView;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet$3");
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet$3");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet$3");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet$3");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet$3");
            try {
                this.f275970a.setImageBitmap(BitmapUtil.decodeFile(str));
                this.f275970a.setVisibility(0);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AdLandingPageBottomSheet", "%s" + Util.stackTraceToString(e));
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c0$d */
    public interface C95078d {
    }

    public C95074c0(Context context, C95295z zVar, String str, String str2, String str3, boolean z, boolean z2) {
        this.f275960a = context;
        this.f275965f = z;
        this.f275966g = z2;
        if (zVar != null && zVar.mo131855p() != null) {
            C104428a aVar = new C104428a(context, 0);
            this.f275961b = aVar;
            boolean z3 = true;
            aVar.setCanceledOnTouchOutside(true);
            View inflate = View.inflate(context, C0966R.C0971layout.f359987c10, (ViewGroup) null);
            this.f275962c = inflate;
            if (inflate == null) {
                Log.m105920e("MicroMsg.AdLandingPageBottomSheet", "mRootView init fail!");
                return;
            }
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.bkr);
            View p = zVar.mo131855p();
            if (p.getParent() != null) {
                ((ViewGroup) p.getParent()).removeView(p);
            }
            this.f275963d = (int) zVar.mo131850h().f296501g;
            this.f275964e = (int) zVar.mo131850h().f296502h;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            SnsMethodCalculate.markStartTimeMs("isSpecifiedLayoutSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
            z3 = (this.f275963d == Integer.MAX_VALUE || this.f275964e == Integer.MAX_VALUE) ? false : z3;
            SnsMethodCalculate.markEndTimeMs("isSpecifiedLayoutSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
            if (z3) {
                layoutParams.width = this.f275963d;
                layoutParams.height = this.f275964e;
            }
            linearLayout.addView(p, layoutParams);
            ((TextView) this.f275962c.findViewById(C0966R.C0970id.ahl)).setText(str2);
            View findViewById = this.f275962c.findViewById(C0966R.C0970id.bei);
            findViewById.setOnClickListener(new C95075a());
            View findViewById2 = this.f275962c.findViewById(C0966R.C0970id.aha);
            findViewById2.setOnClickListener(new C95076b());
            if (!this.f275966g) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view = findViewById2;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBottomSheet", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBaseComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBottomSheet", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBaseComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (this.f275965f) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view2 = findViewById;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBottomSheet", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBaseComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBottomSheet", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBaseComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ImageView imageView = (ImageView) this.f275962c.findViewById(C0966R.C0970id.knc);
            imageView.setVisibility(8);
            if (!Util.isNullOrNil(str3)) {
                Bitmap h = C100891r.m132213h(str3);
                if (h != null) {
                    imageView.setImageBitmap(h);
                    imageView.setVisibility(0);
                    return;
                }
                C100891r.m132208c(str3, false, 0, 0, new C95077c(this, imageView));
            }
        }
    }

    /* renamed from: a */
    public void mo131584a() {
        SnsMethodCalculate.markStartTimeMs("tryHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
        C104428a aVar = this.f275961b;
        if (aVar != null) {
            aVar.dismiss();
        }
        SnsMethodCalculate.markEndTimeMs("tryHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
    }
}
