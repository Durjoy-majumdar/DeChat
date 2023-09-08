package xn0;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.internal.ProxyWebViewClientExtension;
import gy3.C87412m;

/* renamed from: xn0.p */
public final class C53438p extends ProxyWebViewClientExtension {
    public Object onMiscCallBack(String str, Bundle bundle) {
        if (Util.isNullOrNil(str) || bundle == null) {
            return null;
        }
        Log.m105925i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "method = %s", str);
        if (C87412m.m108589b("onJavascriptCloseWindow", str)) {
            return Boolean.TRUE;
        }
        return null;
    }
}
