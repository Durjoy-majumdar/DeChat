package q52;

import android.webkit.JavascriptInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import p248ug.C90658d0;
import p248ug.C90659e0;

/* renamed from: q52.v */
public final class C89481v {

    /* renamed from: a */
    public final C90658d0 f257540a;

    public C89481v(C90658d0 d0Var) {
        C87412m.m108594g(d0Var, "attachable");
        this.f257540a = d0Var;
    }

    @JavascriptInterface
    public final void sendMessage(String str) {
        C87412m.m108594g(str, "payload");
        Log.m105924i("MagicBrushDevTools", "sendMessage " + str);
        ((C90659e0) C86312j.m106911c(C90659e0.class)).mo124804t6(this.f257540a, str);
    }
}
