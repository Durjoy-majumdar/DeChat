package t70;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.XWebSdk;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: t70.f */
public final class C36964f implements C36961c {

    /* renamed from: d */
    public static final C36964f f98041d = new C36964f();

    /* renamed from: a */
    public boolean mo56355a(boolean z, int i, C32226l<Object, C13598b0> lVar) {
        Log.m105924i("MicroMsg.triggers.WebView", "WebView Count = " + XWebSdk.getWebViewCount() + " force:" + z + ", type:" + i);
        return true;
    }
}
