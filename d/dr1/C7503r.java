package dr1;

import android.content.Intent;
import android.os.Bundle;
import fy3.C32224a;
import gy3.C87413o;
import ke3.C88144b;
import rx3.C13598b0;

/* renamed from: dr1.r */
public final class C7503r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f25754d;

    /* renamed from: e */
    public final /* synthetic */ C7493o f25755e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7503r(String str, C7493o oVar) {
        super(0);
        this.f25754d = str;
        this.f25755e = oVar;
    }

    public Object invoke() {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", this.f25754d);
        C88144b.m109791i(this.f25755e.f25729a, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        return C13598b0.f38549a;
    }
}
