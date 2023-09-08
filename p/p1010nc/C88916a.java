package p1010nc;

import android.content.Context;
import android.view.View;
import android.webkit.ValueCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.utils.C84751i1;
import com.tencent.p014mm.plugin.appbrand.widget.C68694g;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.xweb.WebView;
import java.util.LinkedList;

/* renamed from: nc.a */
public class C88916a {

    /* renamed from: i */
    public static final String f256450i = ("wagame://" + WeChatHosts.domainString(C0966R.string.fme) + "/WAGameVConsole.html");

    /* renamed from: a */
    public C88923h f256451a;

    /* renamed from: b */
    public C82554k f256452b;

    /* renamed from: c */
    public Context f256453c;

    /* renamed from: d */
    public int f256454d;

    /* renamed from: e */
    public boolean f256455e = false;

    /* renamed from: f */
    public View f256456f;

    /* renamed from: g */
    public LinkedList<String> f256457g;

    /* renamed from: h */
    public boolean f256458h = false;

    public C88916a(C88923h hVar, Context context, C82554k kVar) {
        this.f256452b = kVar;
        this.f256451a = hVar;
        this.f256453c = context;
        C88922g gVar = (C88922g) hVar;
        gVar.getClass();
        gVar.f256467a = new WebView(context);
        ((C88922g) this.f256451a).f256467a.getSettings().setJavaScriptEnabled(true);
        C68694g gVar2 = new C68694g(this.f256453c.getApplicationContext(), false);
        this.f256456f = gVar2;
        gVar2.setOnClickListener(new a$$a(this));
        this.f256456f.addOnAttachStateChangeListener(new C88917b(this));
        C88923h hVar2 = this.f256451a;
        C88922g gVar3 = (C88922g) hVar2;
        gVar3.f256467a.setWebViewClient(new C88921f(gVar3, new C88918c(this)));
        C88923h hVar3 = this.f256451a;
        ((C88922g) hVar3).f256467a.loadUrl(f256450i);
        ((C88922g) this.f256451a).f256467a.setTranslationY(100000.0f);
        ((C88922g) this.f256451a).f256467a.setVisibility(8);
    }

    /* renamed from: a */
    public final int mo123302a() {
        int i = this.f256454d;
        if (i > 0) {
            return i;
        }
        try {
            int i2 = this.f256452b.getRuntime().mo113054f0().getVDisplayMetrics().heightPixels;
            this.f256454d = i2;
            return i2;
        } catch (NullPointerException unused) {
            return this.f256453c.getResources().getDisplayMetrics().heightPixels;
        }
    }

    /* renamed from: b */
    public final void mo123303b(String str) {
        String a = C84751i1.m104412a(str);
        C88923h hVar = this.f256451a;
        ((C88922g) hVar).f256467a.evaluateJavascript("console._log('" + a + "')", (ValueCallback<String>) null);
    }
}
