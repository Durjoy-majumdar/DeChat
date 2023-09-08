package cp3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ke3.C88144b;
import qo3.C47883u;

/* renamed from: cp3.b */
public final class C7122b implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ Context f25084a;

    /* renamed from: b */
    public final /* synthetic */ String f25085b;

    public C7122b(Context context, String str) {
        this.f25084a = context;
        this.f25085b = str;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        if (z) {
            Context context = this.f25084a;
            String str2 = this.f25085b;
            if (!(str2 == null || str2.length() == 0) && context != null) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", str2);
                C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
    }
}
