package ux0;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import ea3.C45596j;
import gy3.C87412m;
import java.util.Arrays;
import js0.C46574u;
import js0.C88016e;
import kg3.C76577a;
import p156gj.C87203t;
import p822sa.C48319p;
import p828wa.C53102g;
import qe3.C89625d;
import r73.C47934j;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36570n;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;

/* renamed from: ux0.e */
public final class C52633e implements C53102g {

    /* renamed from: d */
    public static final C52633e f146959d = new C52633e();

    /* renamed from: e */
    public static C40480g f146960e = null;

    /* renamed from: f */
    public static C48319p f146961f = null;

    /* renamed from: g */
    public static String f146962g = "";

    /* renamed from: h */
    public static String f146963h = "";

    /* renamed from: a */
    public static final Object m58972a(C52633e eVar, C15601d dVar) {
        eVar.getClass();
        Point b = C75044y4.m89990b(MMApplicationContext.getContext());
        int a = ((b.y - C75044y4.m89989a(MMApplicationContext.getContext())) - C75044y4.m89994f(MMApplicationContext.getContext())) - C75044y4.m89991c(MMApplicationContext.getContext());
        float g = C76577a.m92156g(MMApplicationContext.getContext());
        String formatedNetType = NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext());
        String e = C88016e.m109548e("game_jscore_system_info.js");
        C87412m.m108593f(e, "systemInfoFormat");
        String format = String.format("0x%08X", Arrays.copyOf(new Object[]{new Integer(C89625d.f257841g)}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        String format2 = String.format(e, Arrays.copyOf(new Object[]{String.valueOf(b.x), String.valueOf(a), String.valueOf(b.x), String.valueOf(b.y), String.valueOf(g), formatedNetType, Build.BRAND, C87203t.m108275k(), format, "Android-" + Build.VERSION.SDK_INT, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()), Boolean.valueOf(C85875k4.m106211z())}, 12));
        C87412m.m108593f(format2, "format(format, *args)");
        C14390d dVar2 = C14390d.f39962d;
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        C40480g gVar = f146960e;
        if (gVar != null) {
            gVar.evaluateJavascript(format2, new C37603b(dVar2, hVar));
        }
        Object b2 = hVar.mo90314b();
        return b2 == C15911a.COROUTINE_SUSPENDED ? b2 : C13598b0.f38549a;
    }

    /* renamed from: B */
    public void mo73582B() {
    }

    public void addJavascriptInterface(Object obj, String str) {
        C40480g gVar = f146960e;
        if (gVar != null) {
            gVar.addJavascriptInterface(obj, str);
        }
    }

    public void destroy() {
        f146961f = null;
        C40480g gVar = f146960e;
        if (gVar != null) {
            gVar.destroy();
        }
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        C40480g gVar = f146960e;
        if (gVar != null) {
            gVar.evaluateJavascript(str, valueCallback);
        }
    }

    public Context getContext() {
        return null;
    }

    public String getUserAgent() {
        Context context = MMApplicationContext.getContext();
        String a = C45596j.f123315f.mo71117a();
        C13601g<C45596j> gVar = C47934j.f128617d;
        String a2 = C46574u.m51897a(context, a, (C45596j) ((C36570n) C47934j.f128617d).getValue());
        Log.m105918d("MicroMsg.GamePrefetchJsCoreAdapter", "[game-web-prefetch] userAgent=" + a2);
        return a2;
    }
}
