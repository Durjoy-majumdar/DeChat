package r73;

import android.webkit.JavascriptInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import sx3.C110823p;

/* renamed from: r73.h */
public final class C47932h extends C47928a<C47929b> {

    /* renamed from: d */
    public final String f128616d;

    /* renamed from: r73.h$a */
    public static final class C47933a implements C47929b {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47932h(String str) {
        super("console", new C47933a());
        C87412m.m108594g(str, "tagName");
        this.f128616d = str;
    }

    @JavascriptInterface
    public final void error(Object... objArr) {
        C87412m.m108594g(objArr, "objects");
        String str = this.f128615c;
        Log.m105920e(str, "JsError[" + this.f128616d + "]:" + C110823p.m150987M(objArr, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
    }

    @JavascriptInterface
    public final void info(Object... objArr) {
        C87412m.m108594g(objArr, "objects");
        String str = this.f128615c;
        Log.m105924i(str, "JsInfo[" + this.f128616d + "]:" + C110823p.m150987M(objArr, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
    }

    @JavascriptInterface
    public final void log(Object... objArr) {
        C87412m.m108594g(objArr, "objects");
        if (Log.getLogLevel() < 1) {
            String str = this.f128615c;
            Log.m105926v(str, "JsLog[" + this.f128616d + "]:" + C110823p.m150987M(objArr, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
        }
    }

    @JavascriptInterface
    public final void warn(Object... objArr) {
        C87412m.m108594g(objArr, "objects");
        String str = this.f128615c;
        Log.m105928w(str, "JsInfo[" + this.f128616d + "]:" + C110823p.m150987M(objArr, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
    }
}
