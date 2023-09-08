package com.tencent.p014mm.qqlogin;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WebViewExWindowCloseEvent;
import com.tencent.p014mm.plugin.account.p024ui.RegByMobileSetPwdUI;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kotlin.Metadata;
import ye3.C79087l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/qqlogin/LogoutEmptyUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-account_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.qqlogin.LogoutEmptyUI */
public final class LogoutEmptyUI extends MMSecDataActivity {
    public int getLayoutId() {
        return -1;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            new C79087l().mo109028c();
            ChangeQQLoginTypeManager changeQQLoginTypeManager = ChangeQQLoginTypeManager.f24095a;
            WebViewExWindowCloseEvent webViewExWindowCloseEvent = ChangeQQLoginTypeManager.f24098d;
            if (webViewExWindowCloseEvent != null) {
                changeQQLoginTypeManager.mo7624b(webViewExWindowCloseEvent);
            }
            ChangeQQLoginTypeManager.f24098d = null;
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(MMApplicationContext.getContext(), RegByMobileSetPwdUI.class);
        intent.putExtra("kintent_hint", MMApplicationContext.getContext().getString(C0966R.string.hxz));
        startActivityForResult(intent, 5);
    }
}
