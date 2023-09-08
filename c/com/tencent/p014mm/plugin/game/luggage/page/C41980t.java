package com.tencent.p014mm.plugin.game.luggage.page;

import a93.C39517b;
import android.os.Bundle;
import android.webkit.ValueCallback;
import com.tencent.p014mm.ipcinvoker.C40319a0;
import com.tencent.p014mm.plugin.webview.model.C43692a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import js0.C88016e;
import org.json.JSONObject;
import p828wa.C53099d;
import p828wa.C53118n;
import p828wa.C53133t;
import w93.C53091f;

/* renamed from: com.tencent.mm.plugin.game.luggage.page.t */
public class C41980t extends GameWebPage {

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.t$a */
    public class C41981a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bundle f113083d;

        /* renamed from: com.tencent.mm.plugin.game.luggage.page.t$a$a */
        public class C41982a extends C53099d {
            public C41982a(C41981a aVar) {
            }

            /* renamed from: a */
            public JSONObject mo14701a() {
                return null;
            }

            /* renamed from: b */
            public String mo14702b() {
                return "onAttachedToWindow";
            }
        }

        public C41981a(Bundle bundle) {
            this.f113083d = bundle;
        }

        public void run() {
            C41980t.this.f148259i.mo73815b(new C41982a(this));
            String string = this.f113083d.getString("KGamePreloadData");
            if (!Util.isNullOrNil(string)) {
                Log.m105925i("MicroMsg.PreloadGameWebPage", "preloadData:%s", string);
                C41980t.this.mo67937p(String.format("javascript:(function() {window.__game_center_present_custom_data__=\"%s\";})();", new Object[]{string}), (ValueCallback<String>) null);
            }
            C41980t.this.mo67937p("javascript:(function() {window.__game_center_preload_page_present__=true;})();", (ValueCallback<String>) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.t$b */
    public class C41983b implements Runnable {
        public C41983b() {
        }

        public void run() {
            C39517b bVar = C41980t.this.f117947q;
            if (bVar != null) {
                String title = bVar.getTitle();
                if (!Util.isNullOrNil(title)) {
                    C41980t.this.mo65818R(title, 0);
                }
            }
        }
    }

    public C41980t(C53118n nVar, C53133t tVar, Bundle bundle) {
        super(nVar, tVar, bundle);
        Log.m105924i("MicroMsg.PreloadGameWebPage", "create");
        C43692a.m47524b(this.f117947q);
        C40319a0.m43494b(new C41981a(bundle));
        C40319a0.m43493a().f108393b.postDelayed(new C41983b(), 100);
        this.f148259i.mo73815b(new C41984u(this));
    }

    /* renamed from: H */
    public void mo65781H(String str) {
        super.mo65781H(str);
        this.f148259i.mo73815b(new C41984u(this));
    }

    /* renamed from: L */
    public void mo65785L(String str, String str2, Map<String, String> map) {
        Log.m105925i("MicroMsg.PreloadGameWebPage", "onUrlRedirect, time: %d", Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: V */
    public boolean mo65790V(String str) {
        if (str.equals(mo67941t())) {
            return false;
        }
        return super.mo65790V(str);
    }

    /* renamed from: c */
    public void mo65794c(String str, Bundle bundle) {
        super.mo65794c(str, bundle);
    }

    /* renamed from: e0 */
    public C53091f mo65798e0(String str) {
        return C53091f.m59447b(str);
    }

    /* renamed from: k */
    public String mo65883k() {
        return C88016e.m109548e("preload_game_adapter.js");
    }
}
