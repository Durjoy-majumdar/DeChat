package l93;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.p128ui.tools.bag.C96657c;
import com.tencent.p014mm.plugin.webview.p128ui.tools.bag.WebViewBag;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import p447aw.C103918d;
import p447aw.C54369c;
import vc3.C78382a;

/* renamed from: l93.h */
public class C99354h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f291345d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f291346e;

    public C99354h(int i, Bundle bundle) {
        this.f291345d = i;
        this.f291346e = bundle;
    }

    public void run() {
        int i = this.f291345d;
        if (i == 1) {
            String string = this.f291346e.getString("key_url");
            String string2 = this.f291346e.getString("key_bag_icon");
            int i2 = this.f291346e.getInt("key_scene", 0);
            boolean z = this.f291346e.getBoolean("key_from_bag", false);
            Bundle bundle = this.f291346e.getBundle("key_extras");
            C96657c cVar = C96657c.INSTANCE;
            cVar.getClass();
            if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext())) {
                Log.m105928w("MicroMsg.WebViewBagMgr", "showBag: no float window permission");
                Context context = MMApplicationContext.getContext();
                ((C54369c) C86312j.m106911c(C54369c.class)).mo75135iA(context, context.getString(C0966R.string.lep), new C99350e(cVar, string, i2, string2, bundle, z), C78382a.m94650b());
                return;
            }
            cVar.mo134832f(string, i2, string2, bundle, z);
            cVar.mo134835i(false);
        } else if (i == 2) {
            WebViewBag webViewBag = C96657c.INSTANCE.f283098d;
            if (webViewBag != null) {
                webViewBag.setVisibility(8);
            }
        } else if (i == 3) {
            C96657c.INSTANCE.mo134829b();
        } else if (i == 4) {
            C96657c.INSTANCE.mo134830c();
        } else if (i == 9) {
            C96657c.INSTANCE.mo134834h(this.f291346e.getFloat("key_alpha", 1.0f));
        }
    }
}
