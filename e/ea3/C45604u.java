package ea3;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.WebView;
import fy3.C32226l;
import gy3.C87412m;
import i93.C46206e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import rx3.C13604l;
import s24.C90125c;
import sx3.C110818d0;
import sx3.C36907w;
import t83.C36979g1;
import wc3.C53143h0;
import z04.C112551y;
import z04.C119027c;

/* renamed from: ea3.u */
public final class C45604u extends C53143h0 {

    /* renamed from: d */
    public String[][] f123337d;

    /* renamed from: e */
    public boolean f123338e;

    /* renamed from: f */
    public boolean f123339f;

    /* renamed from: g */
    public boolean f123340g;

    /* renamed from: h */
    public String f123341h = "";

    /* renamed from: i */
    public boolean f123342i;

    /* renamed from: j */
    public long f123343j;

    /* renamed from: k */
    public boolean f123344k = true;

    /* renamed from: l */
    public LinkedList<String> f123345l = new LinkedList<>();

    /* renamed from: m */
    public LinkedList<String> f123346m = new LinkedList<>();

    /* renamed from: n */
    public HashMap<String, String> f123347n = new HashMap<>();

    /* renamed from: o */
    public String f123348o = "";

    /* renamed from: p */
    public boolean f123349p;

    /* renamed from: q */
    public C46206e.C46207a f123350q = C46206e.C46207a.None;

    /* renamed from: r */
    public C46206e.C46211d f123351r = C46206e.C46211d.Unknown;

    /* renamed from: s */
    public long f123352s;

    /* renamed from: t */
    public int f123353t;

    /* renamed from: u */
    public String f123354u = "";

    /* renamed from: v */
    public long f123355v;

    /* renamed from: w */
    public String f123356w = "";

    /* renamed from: x */
    public int f123357x;

    /* renamed from: c */
    public final void mo71121c(String str, String str2, WebView webView, List<C13604l<String, String>> list) {
        String str3;
        String str4 = str2;
        WebView webView2 = webView;
        List<C13604l<String, String>> list2 = list;
        C87412m.m108594g(str, "titles");
        C87412m.m108594g(str4, "data");
        C87412m.m108594g(webView2, "webview");
        if (C36979g1.m41111a()) {
            String r = C112551y.m153818r(C112551y.m153817q(new String(C90125c.m112776c(MMApplicationContext.getContext().getAssets().open("jsapi/vconsole_performance.js")), C119027c.f356488a), "$WF_DATAS$", str4, false), "$WF_TITLES$", str, false, 4, (Object) null);
            if (list2 != null) {
                ArrayList arrayList = new ArrayList(C36907w.m41090l(list2, 10));
                for (C13604l lVar : list) {
                    arrayList.add("{k:'" + ((String) lVar.f38555d) + "', v:'" + C112551y.m153816p((String) lVar.f38556e, "'", "\\'", false, 4, (Object) null) + "'}");
                }
                str3 = C110818d0.m150921S(arrayList, ",", "[", "]", 0, (CharSequence) null, (C32226l) null, 56, (Object) null);
            } else {
                str3 = "[]";
            }
            webView2.evaluateJavascript(C112551y.m153818r(r, "$WF_LOG$", str3, false, 4, (Object) null), (ValueCallback<String>) null);
        }
    }
}
