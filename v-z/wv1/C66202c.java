package wv1;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.plugin.websearch.webview.WebSearchWebView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import g83.C98091e;
import g83.C98092k;
import g83.C98093l;
import gy3.C87412m;
import iy3.C60641c;
import kg3.C76577a;
import uv1.C65479a;
import vv1.C65886a;

/* renamed from: wv1.c */
public final class C66202c implements C98091e<C65479a> {

    /* renamed from: d */
    public final AppCompatActivity f190243d;

    /* renamed from: e */
    public int f190244e;

    public C66202c(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f190243d = appCompatActivity;
    }

    /* renamed from: a */
    public WebSearchWebView getWebView() {
        if (C93938f0.m118697e()) {
            return ((C65886a) C39818r.f106831a.mo62444c(this.f190243d).mo62447c(C65886a.class)).mo89942y0();
        }
        return null;
    }

    /* renamed from: d3 */
    public void mo90298d3(String str, boolean z) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
    }

    public void hideVKB() {
    }

    /* renamed from: k0 */
    public Context mo24908k0() {
        return this.f190243d;
    }

    public void showVKB() {
    }

    /* renamed from: v5 */
    public int mo24915v5() {
        return C60641c.m70921b(((float) this.f190244e) / C76577a.m92156g(this.f190243d));
    }

    /* renamed from: c */
    public C98092k<C65479a> m78129c() {
        if (C93938f0.m118697e()) {
            return ((C65886a) C39818r.f106831a.mo62444c(this.f190243d).mo62447c(C65886a.class)).mo89940c();
        }
        return null;
    }

    /* renamed from: g */
    public C98093l<C65479a> m78133g() {
        return ((C65886a) C39818r.f106831a.mo62444c(this.f190243d).mo62447c(C65886a.class)).mo89941h2();
    }
}
