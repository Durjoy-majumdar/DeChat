package gx0;

import android.content.Intent;
import android.os.Bundle;
import c00.C0405n;
import com.tencent.p014mm.plugin.brandservice.p028ui.BrandServiceIndexUI;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import java.util.Map;
import ke3.C88144b;
import u73.C14136q0;

/* renamed from: gx0.e */
public class C8473e implements Runnable {
    public C8473e(BrandServiceIndexUI brandServiceIndexUI) {
    }

    public void run() {
        Class cls = C0405n.class;
        Intent O20 = ((C0405n) C86312j.m106911c(cls)).O20();
        O20.putExtra("KRightBtn", true);
        O20.putExtra("ftsneedkeyboard", true);
        O20.putExtra("key_load_js_without_delay", true);
        O20.putExtra("ftsType", 1);
        O20.putExtra("ftsbizscene", 6);
        Map<String, String> hn = ((C0405n) C86312j.m106911c(cls)).mo280hn(6, false, 1);
        String lh02 = ((C0405n) C86312j.m106911c(cls)).lh0(6);
        hn.put("sessionId", lh02);
        hn.put("subSessionId", lh02);
        O20.putExtra("sessionId", lh02);
        O20.putExtra("key_preload_biz", 4);
        O20.putExtra("rawUrl", ((C0405n) C86312j.m106911c(cls)).mo277Vw(hn));
        C88144b.m109806x(MMApplicationContext.getContext(), O20, (Bundle) null);
        C14136q0.m13469a(6, lh02, lh02, false, "", 1, "", false, "");
    }
}
