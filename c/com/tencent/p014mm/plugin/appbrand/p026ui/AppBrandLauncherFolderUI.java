package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.collection.CollectionFolderActivityContext;
import com.tencent.p014mm.plugin.appbrand.p026ui.launcher.FolderActivityContextWithLifecycle;
import com.tencent.p014mm.plugin.appbrand.p026ui.recents.RecentsFolderActivityContext;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86737h0;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C88990b;
import zr0.C91931a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandLauncherFolderUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lzr0/a;", "<init>", "()V", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C86737h0
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI */
public final class AppBrandLauncherFolderUI extends MMActivity implements C91931a {

    /* renamed from: f */
    public static final C29657a f246377f = new C29657a((C8480h) null);

    /* renamed from: d */
    public FolderActivityContextWithLifecycle f246378d;

    /* renamed from: e */
    public boolean f246379e;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI$a */
    public static final class C29657a {
        public C29657a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo56887a(Context context, Intent intent) {
            Bundle bundle;
            C87412m.m108594g(context, "context");
            Intent intent2 = new Intent(context, AppBrandLauncherFolderUI.class);
            if (!(context instanceof Activity)) {
                intent2.addFlags(268435456);
            }
            if (intent == null || (bundle = intent.getExtras()) == null) {
                bundle = Bundle.EMPTY;
            }
            intent2.putExtras(bundle);
            intent2.putExtra("KEY_MODE", 2);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherFolderUI$Companion", "startCollectionList", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherFolderUI$Companion", "startCollectionList", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }

        /* renamed from: b */
        public final void mo56888b(Context context, Intent intent) {
            Bundle bundle;
            C87412m.m108594g(context, "context");
            Intent intent2 = new Intent(context, AppBrandLauncherFolderUI.class);
            if (!(context instanceof Activity)) {
                intent2.addFlags(268435456);
            }
            if (intent == null || (bundle = intent.getExtras()) == null) {
                bundle = Bundle.EMPTY;
            }
            intent2.putExtras(bundle);
            intent2.putExtra("KEY_MODE", 1);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherFolderUI$Companion", "startRecentsList", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherFolderUI$Companion", "startRecentsList", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI$b */
    public static final class C84433b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ AppBrandLauncherFolderUI f246380d;

        public C84433b(AppBrandLauncherFolderUI appBrandLauncherFolderUI) {
            this.f246380d = appBrandLauncherFolderUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            AppBrandLauncherFolderUI appBrandLauncherFolderUI = this.f246380d;
            if (appBrandLauncherFolderUI.f246379e) {
                Intent intent = new Intent(appBrandLauncherFolderUI, AppBrandLauncherUI.class);
                intent.putExtra("extra_start_activity_click_timestamp_ms", Util.nowMilliSecond());
                intent.putExtra("extra_enter_scene", 6);
                intent.putExtra("extra_show_recommend", false);
                intent.addFlags(67108864);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(appBrandLauncherFolderUI, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherFolderUI", "dealWidgetBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                appBrandLauncherFolderUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(appBrandLauncherFolderUI, "com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherFolderUI", "dealWidgetBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                appBrandLauncherFolderUI.overridePendingTransition(MMFragmentActivity$$c.f318646c, MMFragmentActivity$$c.f318651h);
            }
            appBrandLauncherFolderUI.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI$c */
    public static final class C84434c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandLauncherFolderUI f246381d;

        public C84434c(AppBrandLauncherFolderUI appBrandLauncherFolderUI) {
            this.f246381d = appBrandLauncherFolderUI;
        }

        public final void run() {
            Fragment findFragmentById = this.f246381d.getSupportFragmentManager().findFragmentById(16908290);
            AppBrandLauncherUI.Fragment fragment = findFragmentById instanceof AppBrandLauncherUI.Fragment ? (AppBrandLauncherUI.Fragment) findFragmentById : null;
            if (fragment != null) {
                fragment.mo117065L();
            }
        }
    }

    /* renamed from: A2 */
    public void mo117057A2(boolean z) {
        FolderActivityContextWithLifecycle folderActivityContextWithLifecycle = this.f246378d;
        if (folderActivityContextWithLifecycle != null) {
            folderActivityContextWithLifecycle.mo117057A2(z);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isFinishing()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void finish() {
        if (!isFinishing() && !isDestroyed()) {
            super.finish();
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        FolderActivityContextWithLifecycle folderActivityContextWithLifecycle;
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            return;
        }
        overridePendingTransition(0, 0);
        if (((C88990b.m111195d(AppBrandLauncherFolderUI.class) & 2) == 0) && !C85875k4.m106197n0()) {
            overridePendingTransition(MMFragmentActivity$$c.f318644a, MMFragmentActivity$$c.f318645b);
        }
        this.f246379e = getIntent().getBooleanExtra("extra_is_from_widget", false);
        int intExtra = getIntent().getIntExtra("KEY_MODE", 0);
        if (intExtra == 1) {
            folderActivityContextWithLifecycle = new RecentsFolderActivityContext(this);
        } else if (intExtra != 2) {
            Log.m105920e("MicroMsg.AppBrandLauncherFolderUI", "onCreate with invalid mode(" + intExtra + ')');
            finish();
            setActionbarColor(getContext().getResources().getColor(C0966R.color.a7_));
            getContentView().setBackgroundColor(getActionbarColor());
            setBackBtn(new C84433b(this));
            setTitleBarDoubleClickListener(new C84434c(this));
            C39623j lifecycle = getLifecycle();
            FolderActivityContextWithLifecycle folderActivityContextWithLifecycle2 = this.f246378d;
            C87412m.m108591d(folderActivityContextWithLifecycle2);
            lifecycle.addObserver(folderActivityContextWithLifecycle2);
        } else {
            folderActivityContextWithLifecycle = new CollectionFolderActivityContext(this);
        }
        this.f246378d = folderActivityContextWithLifecycle;
        setActionbarColor(getContext().getResources().getColor(C0966R.color.a7_));
        getContentView().setBackgroundColor(getActionbarColor());
        setBackBtn(new C84433b(this));
        setTitleBarDoubleClickListener(new C84434c(this));
        C39623j lifecycle2 = getLifecycle();
        FolderActivityContextWithLifecycle folderActivityContextWithLifecycle22 = this.f246378d;
        C87412m.m108591d(folderActivityContextWithLifecycle22);
        lifecycle2.addObserver(folderActivityContextWithLifecycle22);
    }
}
