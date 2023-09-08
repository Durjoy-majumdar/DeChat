package p178ju;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7240a;
import d62.C7241k;
import java.lang.ref.WeakReference;
import java.util.Map;
import ke3.C88144b;
import wd3.C53155r0;

/* renamed from: ju.q */
public class C9524q implements C7241k.C7244c {

    /* renamed from: ju.q$a */
    public class C9525a extends C7240a {

        /* renamed from: e */
        public final /* synthetic */ WeakReference f29704e;

        /* renamed from: f */
        public final /* synthetic */ String f29705f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9525a(C9524q qVar, int i, C53155r0 r0Var, WeakReference weakReference, String str) {
            super(i, r0Var);
            this.f29704e = weakReference;
            this.f29705f = str;
        }

        /* renamed from: a */
        public void mo1118a(View view) {
            Context context = (Context) this.f29704e.get();
            if (context != null) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", this.f29705f);
                C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: G4 */
    public CharSequence mo8417G4(Map<String, String> map, String str, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2) {
        if (map == null) {
            return null;
        }
        if (map.containsKey(str + ".redpacketinfo")) {
            return "";
        }
        String nullAsNil = Util.nullAsNil(map.get(str + ".title"));
        String str2 = map.get(str + ".url");
        SpannableString spannableString = new SpannableString(nullAsNil);
        if (!TextUtils.isEmpty(str2)) {
            spannableString.setSpan(new C9525a(this, 1, (C53155r0) null, weakReference, str2), 0, nullAsNil.length(), 33);
        }
        return spannableString;
    }
}
