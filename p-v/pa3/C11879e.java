package pa3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import c00.C0405n;
import c00.C0406o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.Map;
import ke3.C88144b;
import na3.C117620h;
import u73.C101987v0;

/* renamed from: pa3.e */
public class C11879e implements C117620h {
    /* renamed from: Is */
    public String mo11753Is(String str) {
        String optString = ((C0406o) C86312j.m106911c(C0406o.class)).mo448p4("discoverSearchEntry").optString("wording");
        return Util.isNullOrNil(optString) ? MMApplicationContext.getContext().getString(C0966R.string.cwb) : optString;
    }

    public void dh0(Activity activity, String str) {
        Class cls = C0405n.class;
        if (!C43471q.m46984h(0)) {
            Log.m105920e("MicroMsg.FTS.SearchOneSearchOpener", "fts h5 template not avail");
            return;
        }
        Intent O20 = ((C0405n) C86312j.m106911c(cls)).O20();
        O20.putExtra("ftsbizscene", 20);
        Map<String, String> hn = ((C0405n) C86312j.m106911c(cls)).mo280hn(20, true, 0);
        O20.putExtra("ftsneedkeyboard", true);
        O20.putExtra("rawUrl", C101987v0.m134270d(hn, 0));
        C88144b.m109791i(activity, "webview", ".ui.tools.fts.FTSSearchOneSearchWebViewUI", O20, (Bundle) null);
    }

    public String nl0(String str) {
        return ((C0406o) C86312j.m106911c(C0406o.class)).mo448p4("discoverSearchEntry").optString("labIcon");
    }
}
