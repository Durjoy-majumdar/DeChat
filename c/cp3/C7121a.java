package cp3;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import ke3.C88144b;

/* renamed from: cp3.a */
public final class C7121a implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f25082d;

    /* renamed from: e */
    public final /* synthetic */ String f25083e;

    public C7121a(Context context, String str) {
        this.f25082d = context;
        this.f25083e = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.f25082d;
        String str = this.f25083e;
        if (!(str == null || str.length() == 0) && context != null) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }
}
