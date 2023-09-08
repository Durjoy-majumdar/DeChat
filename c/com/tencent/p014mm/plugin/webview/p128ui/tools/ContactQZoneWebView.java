package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import j83.C9286a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.ContactQZoneWebView */
public class ContactQZoneWebView extends WebViewUI {

    /* renamed from: I2 */
    public boolean f118312I2 = false;

    /* renamed from: J2 */
    public String f118313J2 = "";

    /* renamed from: K2 */
    public String f118314K2 = "";

    /* renamed from: I9 */
    public void mo68165I9(String str) {
        if (!this.f118312I2) {
            this.f118312I2 = true;
            String substring = str.substring(19);
            Log.m105918d("MicroMsg.ContactQZoneWebView", "get url :" + substring);
            Intent intent = new Intent();
            intent.putExtra("nowUrl", substring);
            intent.putExtra("tweetid", Util.nullAsNil(getIntent().getStringExtra("tweetid")));
            intent.putExtra("htmlData", this.f118313J2);
            intent.putExtra("type", getIntent().getIntExtra("type", 0));
            Bundle bundle = new Bundle();
            bundle.putInt("stat_scene", 4);
            bundle.putString("stat_url", getCurrentURL());
            intent.putExtra("_stat_obj", bundle);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/ContactQZoneWebView", "gotoImageView", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/webview/ui/tools/ContactQZoneWebView", "gotoImageView", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((C67654r1) C9286a.f29044a).mo93182o(intent, this);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(getString(C0966R.string.llz));
        this.f118523f.setWebViewClient(new C43833b(this));
        this.f118523f.loadUrl(mo6901n0());
        Log.m105918d("MicroMsg.ContactQZoneWebView", "loadUrl:loadUrl, url = " + mo6901n0());
    }

    public void onResume() {
        super.onResume();
        this.f118312I2 = false;
    }
}
