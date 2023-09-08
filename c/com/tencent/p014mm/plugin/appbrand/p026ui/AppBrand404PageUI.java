package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C9556a;
import nj3.C88989a;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI */
public final class AppBrand404PageUI extends MMActivity {

    /* renamed from: d */
    public static final /* synthetic */ int f11886d = 0;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI$a */
    public class C1974a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Intent f11887d;

        public C1974a(Intent intent) {
            this.f11887d = intent;
        }

        public void run() {
            this.f11887d.addFlags(268435456);
            Context context = MMApplicationContext.getContext();
            Intent intent = this.f11887d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrand404PageUI$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/appbrand/ui/AppBrand404PageUI$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI$b */
    public class C1975b implements MenuItem.OnMenuItemClickListener {
        public C1975b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AppBrand404PageUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public static void m1962H7(int i) {
        m1963I7(MMApplicationContext.getContext().getString(i), (String) null, (ActivityStarterIpcDelegate) null);
    }

    /* renamed from: I7 */
    public static void m1963I7(String str, String str2, ActivityStarterIpcDelegate activityStarterIpcDelegate) {
        Intent putExtra = new Intent(MMApplicationContext.getContext(), AppBrand404PageUI.class).putExtra("key_wording", str).putExtra("key_icon_url", str2);
        if (activityStarterIpcDelegate != null) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(putExtra);
            ActivityStarterIpcDelegate activityStarterIpcDelegate2 = activityStarterIpcDelegate;
            C117292a.m165358d(activityStarterIpcDelegate2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrand404PageUI", "show", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityStarterIpcDelegate.mo880b((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activityStarterIpcDelegate2, "com/tencent/mm/plugin/appbrand/ui/AppBrand404PageUI", "show", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        MMHandlerThread.postToMainThread(new C1974a(putExtra));
    }

    public void finish() {
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6376d6;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.f7675nl);
        setBackBtn(new C1975b());
        TextView textView = (TextView) findViewById(C0966R.C0970id.f5885rd);
        String stringExtra = getIntent().getStringExtra("key_wording");
        Util.isNullOrNil(stringExtra);
        if (textView != null) {
            textView.setText(stringExtra);
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
