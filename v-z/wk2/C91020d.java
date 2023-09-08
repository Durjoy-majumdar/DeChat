package wk2;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kl2.C10355a;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import te3.C101801kd0;
import te3.C101835rd0;
import xk2.C15805b;

/* renamed from: wk2.d */
public final class C91020d extends C15805b {

    /* renamed from: f */
    public static final C91020d f261144f = new C91020d();

    /* renamed from: g */
    public static final String f261145g = "collect";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        String str;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        String str2 = (String) ((HashMap) h1Var.f38983a).get("sessionId");
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        String str4 = (String) ((HashMap) h1Var.f38983a).get("content");
        if (str4 == null) {
            str4 = str3;
        }
        Log.m105925i("MicroMsg.JsApiCollect", "ScanJsApi-Call:collect sessionId: %s, content: %s", str2, str4);
        if (str4.length() == 0) {
            Log.m105920e("MicroMsg.JsApiCollect", "ScanJsApi-Call collect content is empty");
        } else {
            ConcurrentHashMap<String, C10355a.C10356a> concurrentHashMap = C10355a.f31535a;
            C10355a.C10356a aVar = C10355a.f31535a.get(str2);
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            Log.m105919d("MicroMsg.JsApiCollect", "fillTextEventInfo text: %s, sourceType %d", str4, 27);
            C101801kd0 kd02 = new C101801kd0();
            C101835rd0 rd02 = new C101835rd0();
            rd02.mo141277m(27);
            rd02.mo141273f(Util.nowMilliSecond());
            kd02.mo141219q(rd02);
            DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
            aVar2.f264680e = str4;
            aVar2.f264676a = kd02;
            aVar2.f264678c = 1;
            Object[] objArr = new Object[1];
            objArr[0] = aVar != null ? aVar.f31536a : null;
            Log.m105927v("MicroMsg.JsApiCollect", "ScanJsApi-Call:collect fromUser: %s", objArr);
            C101801kd0 kd03 = doFavoriteEvent.f264674d.f264676a;
            C101835rd0 rd03 = kd03 != null ? kd03.f298616d : null;
            if (rd03 != null) {
                if (!(aVar == null || (str = aVar.f31536a) == null)) {
                    str3 = str;
                }
                rd03.mo141275k(str3);
            }
            Context context = jVar.f38998a;
            if (context instanceof Activity) {
                DoFavoriteEvent.C92474a aVar3 = doFavoriteEvent.f264674d;
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                aVar3.f264684i = (Activity) context;
            }
            DoFavoriteEvent.C92474a aVar4 = doFavoriteEvent.f264674d;
            MMWebView mMWebView = jVar.f39002e;
            View view = (View) (mMWebView != null ? mMWebView.getParent() : null);
            ViewGroup viewGroup = (ViewGroup) (view != null ? view.getRootView() : null);
            aVar4.f264686k = viewGroup != null ? viewGroup.getChildAt(0) : null;
            doFavoriteEvent.f264674d.f264688m = 43;
            doFavoriteEvent.publish();
        }
        C13849g gVar = jVar.f39001d;
        String str5 = h1Var.f38990c;
        gVar.mo10774a(str5, h1Var.f38996i + ":ok", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f261145g;
    }
}
