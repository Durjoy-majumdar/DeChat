package p935cb;

import android.content.Context;
import android.view.View;
import com.tencent.magicbrush.C80301a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.utils.C84751i1;
import com.tencent.p014mm.plugin.appbrand.widget.C68694g;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import java.util.LinkedList;

/* renamed from: cb.e */
public class C79973e {

    /* renamed from: i */
    public static final String f234246i = ("wagame://" + WeChatHosts.domainString(C0966R.string.fme) + "/WAGameVConsole.html");

    /* renamed from: a */
    public C79986k f234247a;

    /* renamed from: b */
    public C82554k f234248b;

    /* renamed from: c */
    public Context f234249c;

    /* renamed from: d */
    public boolean f234250d = false;

    /* renamed from: e */
    public View f234251e;

    /* renamed from: f */
    public LinkedList<String> f234252f;

    /* renamed from: g */
    public boolean f234253g = false;

    /* renamed from: h */
    public C80301a f234254h;

    public C79973e(C79986k kVar, C80301a aVar, Context context, C82554k kVar2) {
        this.f234248b = kVar2;
        this.f234247a = kVar;
        this.f234249c = context;
        this.f234254h = aVar;
        kVar.mo110154c(context);
        this.f234247a.mo110153b().setJavaScriptEnabled(true);
        C68694g gVar = new C68694g(this.f234249c, true);
        this.f234251e = gVar;
        gVar.setOnClickListener(new C79969a(this));
        this.f234247a.mo110157e(new C79970b(this));
        this.f234247a.loadUrl(f234246i);
        this.f234247a.mo110155d(100000.0f);
        this.f234247a.setVisibility(8);
    }

    /* renamed from: a */
    public final int mo110150a() {
        return ((int) (((float) this.f234254h.f235096l.find(0).getWidth()) * this.f234249c.getResources().getDisplayMetrics().density)) + 1;
    }

    /* renamed from: b */
    public final void mo110151b(String str) {
        String a = C84751i1.m104412a(str);
        C79986k kVar = this.f234247a;
        kVar.mo110152a("console._log('" + a + "')");
    }
}
