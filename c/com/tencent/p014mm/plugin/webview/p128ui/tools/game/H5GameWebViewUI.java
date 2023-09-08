package com.tencent.p014mm.plugin.webview.p128ui.tools.game;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import d93.C45310h;
import nj3.C88989a;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.H5GameWebViewUI */
public class H5GameWebViewUI extends GameWebViewUI {

    /* renamed from: c3 */
    public static final String f119256c3 = (HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.flk) + "/cgi-bin/h5/static/gameloading/index.html");

    /* renamed from: b3 */
    public int f119257b3;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.H5GameWebViewUI$a */
    public class C44018a implements C45310h.C45313c {
        public C44018a() {
        }

        /* renamed from: a */
        public String mo67770a() {
            H5GameWebViewUI h5GameWebViewUI = H5GameWebViewUI.this;
            String str = H5GameWebViewUI.f119256c3;
            return h5GameWebViewUI.f118523f.getUrl();
        }

        /* renamed from: b */
        public String mo67771b() {
            H5GameWebViewUI h5GameWebViewUI = H5GameWebViewUI.this;
            String str = H5GameWebViewUI.f119256c3;
            return h5GameWebViewUI.f118523f.getUrl();
        }
    }

    /* renamed from: S7 */
    public boolean mo63702S7() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.H5GameWebViewUI", "onCreate");
        this.f118470K = false;
        this.f119257b3 = this.f118447A;
    }

    public void onNewIntent(Intent intent) {
        Log.m105924i("MicroMsg.H5GameWebViewUI", "onNewIntent");
        super.onNewIntent(intent);
        boolean booleanExtra = getIntent().getBooleanExtra("show_full_screen", false);
        setIntent(intent);
        String stringExtra = intent.getStringExtra("rawUrl");
        Log.m105918d("MicroMsg.H5GameWebViewUI", "url = " + stringExtra);
        if (!this.f118468J.equals(stringExtra)) {
            if (stringExtra.startsWith(f119256c3)) {
                this.f118468J = stringExtra;
            }
            if (!mo6901n0().equals(stringExtra)) {
                this.f118447A = getIntent().getIntExtra("screen_orientation", -1);
                C45310h hVar = this.f118491T0;
                if (hVar == null) {
                    this.f118491T0 = new C45310h(new C44018a());
                } else {
                    hVar.mo70864g(stringExtra, (JsapiPermissionWrapper) null, (GeneralControlWrapper) null);
                }
                this.f118491T0.mo70865h((JsapiPermissionWrapper) getIntent().getParcelableExtra("hardcode_jspermission"), (GeneralControlWrapper) getIntent().getParcelableExtra("hardcode_general_ctrl"));
                this.f118523f.loadUrl("about:blank");
                this.f118513b1.mo67677I(intent);
                return;
            }
            this.f118447A = this.f119257b3;
            getIntent().putExtra("show_full_screen", booleanExtra);
            mo68223A8();
        }
    }

    public void onResume() {
        setMMOrientation();
        super.onResume();
    }
}
