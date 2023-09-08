package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.C85864g1;
import com.tencent.p014mm.p136ui.MMActivity;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import nj3.C88990b;
import org.xwalk.core.XWalkEnvironment;
import zb3.C66782d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandAuthRealNameProxyEmptyUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthRealNameProxyEmptyUI */
public final class AppBrandAuthRealNameProxyEmptyUI extends MMActivity {

    /* renamed from: d */
    public static final /* synthetic */ int f11889d = 0;

    /* renamed from: H7 */
    public final void mo1877H7() {
        C85864g1.m106129d(getWindow());
        C85864g1.m106127b(getWindow(), false);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        C88990b.m111194c(this, (C88990b.C61771c) null);
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        boolean z = false;
        overridePendingTransition(0, 0);
        mo1877H7();
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("key_process_is_end", false)) {
            z = true;
        }
        if (z) {
            finish();
            return;
        }
        Intent intent2 = getIntent();
        if (intent2 == null || (str = intent2.getStringExtra("action")) == null) {
            str = "";
        }
        if (C87412m.m108589b("startRealNameVerify", str)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("realname_verify_process_jump_activity", ".ui.AppBrandAuthRealNameProxyEmptyUI");
            bundle2.putString("realname_verify_process_jump_plugin", XWalkEnvironment.MODULE_APPBRAND);
            bundle2.putInt("real_name_verify_mode", 4);
            bundle2.putInt("entry_scene", 1);
            ((C66782d) C86312j.m106911c(C66782d.class)).mo72982Co(getContext(), bundle2);
            return;
        }
        finish();
    }

    public void onResume() {
        super.onResume();
        mo1877H7();
    }
}
