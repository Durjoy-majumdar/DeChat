package jg0;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import f40.C86709a0;
import hg0.C8521g0;
import jg0.C117355j;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: jg0.k */
public class C9399k implements C117355j.C9398c, C11385n {
    /* renamed from: a */
    public void mo779a(int i, String str) {
        Log.m105920e("MicroMsg.RefreshTokenListener", "onError : errType = " + i + ", errMsg = " + str);
    }

    /* renamed from: b */
    public void mo780b(Bundle bundle) {
        String string = bundle.getString("access_token");
        String string2 = bundle.getString("expires");
        Log.m105924i("MicroMsg.RefreshTokenListener", "onComplete : newToken = " + string + ", expires = " + string2);
        if (string2 != null) {
            C86709a0.m107535s().mo121142i().mo119676J(65832, string2);
        }
        C86709a0.m107535s().mo121142i().mo119676J(65830, string);
        C86709a0.m107535s().mo121142i().mo119676J(65831, Long.valueOf(System.currentTimeMillis()));
        C86709a0.m107524d().mo123455a(WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_FAILED, this);
        C86709a0.m107524d().mo123460f(new C8521g0(2, string));
    }

    public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() == 183) {
            C86709a0.m107524d().mo123470p(WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_FAILED, this);
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.RefreshTokenListener", "update token success");
            } else {
                Log.m105920e("MicroMsg.RefreshTokenListener", "update token fail");
            }
        }
    }
}
