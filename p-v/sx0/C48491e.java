package sx0;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83164h;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Arrays;
import kj2.C117407d;
import s73.C48262e;
import s73.C48273f;
import u24.C90598g;
import z04.C112551y;

/* renamed from: sx0.e */
public final class C48491e implements C83164h {

    /* renamed from: a */
    public final /* synthetic */ C40480g f129694a;

    /* renamed from: b */
    public final /* synthetic */ C48489d f129695b;

    public C48491e(C40480g gVar, C48489d dVar) {
        this.f129694a = gVar;
        this.f129695b = dVar;
    }

    /* renamed from: a */
    public final void mo69211a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        Log.m105921e("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "[game-web-prefetch] handleException, message : %s\n, stackTrace : %s", str3, str4);
        String format = String.format("try {WxGameJsCoreBridge.invokeError(\"%s\");} catch(e) {console.log(e);}", Arrays.copyOf(new Object[]{C90598g.m113502a("exception : " + str3 + " ; stack : " + str4)}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        Log.m105925i("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "[game-web-prefetch] handleException, js = %s", format);
        String str5 = null;
        this.f129694a.evaluateJavascript(format, (ValueCallback<String>) null);
        C48489d dVar = this.f129695b;
        C48273f fVar = dVar.f129688e;
        C48273f.C48275b bVar = new C48273f.C48275b();
        String str6 = dVar.f129690g;
        String str7 = dVar.f129691h;
        String str8 = str3 + 9 + str4;
        if (str8 != null) {
            str5 = C112551y.m153815o(str8, ',', '.', false, 4, (Object) null);
        }
        C117407d.INSTANCE.mo160131h(20821, str6, str7, str5);
        fVar.mo73006a(bVar);
        this.f129695b.f129689f.mo73005a(new C48262e.C48266d());
    }
}
