package com.tencent.p014mm.plugin.appbrand.p026ui;

import al3.C0086a;
import android.app.Activity;
import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.p026ui.banner.C68645f;
import com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84498l;
import j20.C117292a;
import java.util.HashSet;
import java.util.Set;
import k20.C9556a;
import kg3.C76577a;
import kj2.C117407d;
import nj3.C88989a;
import qo3.C77389a;
import qo3.C77398g;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI */
public final class AppBrandGuideUI extends MMActivity implements C84498l {

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI$a */
    public class C68634a implements DialogInterface.OnDismissListener {
        public C68634a() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            AppBrandGuideUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI$b */
    public class C68635b implements DialogInterface.OnClickListener {
        public C68635b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C117407d.INSTANCE.mo160131h(14750, 2, "");
            AppBrandGuideUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI$c */
    public class C68636c implements DialogInterface.OnClickListener {
        public C68636c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AppBrandGuideUI appBrandGuideUI = AppBrandGuideUI.this;
            Intent putExtra = new Intent(AppBrandGuideUI.this, AppBrandLauncherUI.class).putExtra("extra_enter_scene", 11);
            C9556a aVar = new C9556a();
            aVar.mo10233c(putExtra);
            C117292a.m165358d(appBrandGuideUI, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandGuideUI$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            appBrandGuideUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(appBrandGuideUI, "com/tencent/mm/plugin/appbrand/ui/AppBrandGuideUI$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117407d.INSTANCE.mo160131h(14750, 3, "");
            AppBrandGuideUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI$d */
    public class C68637d implements DialogInterface.OnKeyListener {
        public C68637d() {
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (4 != i) {
                return false;
            }
            if (1 == keyEvent.getAction()) {
                C117407d.INSTANCE.mo160131h(14750, 4, "");
                AppBrandGuideUI.this.finish();
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI$e */
    public enum C68638e implements Application.ActivityLifecycleCallbacks, C84498l {
        INSTANCE;
        

        /* renamed from: d */
        public boolean f197175d;

        /* renamed from: e */
        public String f197176e;

        /* renamed from: R3 */
        public void mo94342R3(String str, int i) {
            this.f197175d = false;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof AppBrandGuideUI) {
                this.f197175d = false;
            }
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
            if (r0.baseActivity.getClassName().contains(".AppBrandUI") == false) goto L_0x0041;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onActivityResumed(android.app.Activity r12) {
            /*
                r11 = this;
                boolean r0 = r12 instanceof com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandGuideUI
                r1 = 0
                if (r0 != 0) goto L_0x0009
                boolean r0 = r12 instanceof com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherUI
                if (r0 == 0) goto L_0x000b
            L_0x0009:
                r11.f197175d = r1
            L_0x000b:
                boolean r0 = f40.C86709a0.m107522a()
                if (r0 == 0) goto L_0x0083
                boolean r0 = r11.f197175d
                if (r0 == 0) goto L_0x0083
                int r0 = r12.getTaskId()
                android.app.ActivityManager$RunningTaskInfo r0 = com.tencent.p014mm.sdk.platformtools.Util.getCurrentTaskInfo(r12, r0)
                if (r0 == 0) goto L_0x0040
                android.content.ComponentName r2 = r0.baseActivity
                if (r2 != 0) goto L_0x0024
                goto L_0x0040
            L_0x0024:
                java.lang.String r2 = r2.getClassName()
                java.lang.String r3 = ".LauncherUI"
                boolean r2 = r2.endsWith(r3)
                r3 = 1
                if (r2 == 0) goto L_0x0032
                goto L_0x0041
            L_0x0032:
                android.content.ComponentName r0 = r0.baseActivity
                java.lang.String r0 = r0.getClassName()
                java.lang.String r2 = ".AppBrandUI"
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto L_0x0041
            L_0x0040:
                r3 = 0
            L_0x0041:
                if (r3 == 0) goto L_0x0083
                r11.f197175d = r1
                android.content.Intent r0 = new android.content.Intent
                java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI> r2 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandGuideUI.class
                r0.<init>(r12, r2)
                k20.a r2 = new k20.a
                r2.<init>()
                r2.mo10233c(r0)
                java.lang.Object[] r4 = r2.mo10232b()
                java.lang.String r5 = "com/tencent/mm/plugin/appbrand/ui/AppBrandGuideUI$AppBrandGuideController"
                java.lang.String r6 = "onActivityResumed"
                java.lang.String r7 = "(Landroid/app/Activity;)V"
                java.lang.String r8 = "Undefined"
                java.lang.String r9 = "startActivity"
                java.lang.String r10 = "(Landroid/content/Intent;)V"
                r3 = r12
                j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.Object r0 = r2.mo10231a(r1)
                android.content.Intent r0 = (android.content.Intent) r0
                r12.startActivity(r0)
                java.lang.String r2 = "com/tencent/mm/plugin/appbrand/ui/AppBrandGuideUI$AppBrandGuideController"
                java.lang.String r3 = "onActivityResumed"
                java.lang.String r4 = "(Landroid/app/Activity;)V"
                java.lang.String r5 = "Undefined"
                java.lang.String r6 = "startActivity"
                java.lang.String r7 = "(Landroid/content/Intent;)V"
                r1 = r12
                j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            L_0x0083:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandGuideUI.C68638e.onActivityResumed(android.app.Activity):void");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: R3 */
    public void mo94342R3(String str, int i) {
        finish();
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        setTheme(C0966R.style.f8648pu);
        super.onCreate(bundle);
        C85875k4.m106177d0(getWindow());
        C68638e yx02 = C81161g2.yx0();
        if (yx02 == null) {
            super.finish();
            return;
        }
        Set<C84498l> set = C68645f.f197194a;
        synchronized (set) {
            ((HashSet) set).add(this);
        }
        C77389a aVar = new C77389a();
        aVar.f225644a = C0086a.m38a(this).getString(C0966R.string.f7674nk);
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(C0966R.C0969drawable.bu5);
        TextView textView = new TextView(this);
        textView.setText(C0966R.string.f7712p1);
        textView.setTextSize(2, 14.0f);
        textView.setTextColor(Color.argb(Math.round(137.70001f), 0, 0, 0));
        textView.setLineSpacing(0.0f, 1.2f);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
        ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = C76577a.m92151b(this, 16);
        aVar.f225627J = linearLayout;
        aVar.f225623F = new C68634a();
        aVar.f225664u = C0086a.m38a(this).getString(C0966R.string.bfj);
        aVar.f225621D = new C68635b();
        aVar.f225663t = C0086a.m38a(this).getString(C0966R.string.f7711p0);
        aVar.f225620C = new C68636c();
        aVar.f225641X = false;
        aVar.f225668y = false;
        aVar.f225669z = true;
        C77398g gVar = new C77398g(this, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.setOnKeyListener(new C68637d());
        gVar.show();
        String str = yx02.f197176e;
        C117407d.INSTANCE.mo160131h(14750, 1, str);
        yx02.f197175d = false;
        yx02.f197176e = null;
    }

    public void onDestroy() {
        super.onDestroy();
        Set<C84498l> set = C68645f.f197194a;
        synchronized (set) {
            ((HashSet) set).remove(this);
        }
    }
}
