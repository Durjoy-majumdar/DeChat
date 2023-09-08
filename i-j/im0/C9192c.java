package im0;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.C1943c3;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import im0.C9196d;
import ir0.C9237b;
import ir0.C9238c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import js0.C88020k;
import kg3.C76577a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import org.json.JSONArray;
import org.json.JSONObject;
import p225rc.C89923l;
import qo3.C77407n;

/* renamed from: im0.c */
public class C9192c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f28921d;

    /* renamed from: e */
    public final /* synthetic */ C83780d1 f28922e;

    /* renamed from: f */
    public final /* synthetic */ String f28923f;

    /* renamed from: g */
    public final /* synthetic */ JSONObject f28924g;

    /* renamed from: h */
    public final /* synthetic */ ArrayList f28925h;

    /* renamed from: i */
    public final /* synthetic */ int f28926i;

    /* renamed from: j */
    public final /* synthetic */ C9196d f28927j;

    /* renamed from: im0.c$a */
    public class C9193a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C77407n f28928d;

        /* renamed from: e */
        public final /* synthetic */ Map f28929e;

        /* renamed from: f */
        public final /* synthetic */ int f28930f;

        public C9193a(C77407n nVar, Map map, int i) {
            this.f28928d = nVar;
            this.f28929e = map;
            this.f28930f = i;
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            this.f28928d.mo107567l((View) null);
            e0Var.clear();
            for (int i = 0; i < C9192c.this.f28925h.size(); i++) {
                if (this.f28929e.containsKey(Integer.valueOf(i))) {
                    e0Var.mo107163s(i, (CharSequence) C9192c.this.f28925h.get(i), true, false);
                } else {
                    e0Var.mo107140d(i, this.f28930f, (CharSequence) C9192c.this.f28925h.get(i));
                }
            }
        }
    }

    /* renamed from: im0.c$b */
    public class C9194b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ Map f28932d;

        public C9194b(Map map) {
            this.f28932d = map;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C9196d.C9197a aVar;
            HashMap hashMap = new HashMap();
            hashMap.put("tapIndex", Integer.valueOf(menuItem.getItemId()));
            if (this.f28932d.containsKey(Integer.valueOf(i)) && (aVar = C9196d.f28935g) != null) {
                int intValue = ((Integer) this.f28932d.get(Integer.valueOf(i))).intValue();
                ((C9237b) aVar).getClass();
                C9238c.m8884a(intValue);
            }
            C9192c cVar = C9192c.this;
            cVar.f28921d.mo109647a(cVar.f28926i, cVar.f28927j.mo115112m("ok", hashMap));
        }
    }

    /* renamed from: im0.c$c */
    public class C9195c implements C77407n.C47880p {
        public C9195c() {
        }

        public void onDismiss() {
            C9192c cVar = C9192c.this;
            cVar.f28921d.mo109647a(cVar.f28926i, cVar.f28927j.mo115109j("fail cancel"));
        }
    }

    public C9192c(C9196d dVar, C81925i2 i2Var, C83780d1 d1Var, String str, JSONObject jSONObject, ArrayList arrayList, int i) {
        this.f28927j = dVar;
        this.f28921d = i2Var;
        this.f28922e = d1Var;
        this.f28923f = str;
        this.f28924g = jSONObject;
        this.f28925h = arrayList;
        this.f28926i = i;
    }

    public void run() {
        int i;
        if (this.f28921d.isRunning()) {
            this.f28922e.f244557I.mo111230d(C1943c3.ACTION_SHEET);
            Activity o0 = this.f28921d.mo114344o0();
            C77407n nVar = new C77407n((Context) o0, 1, false);
            if (!Util.isNullOrNil(this.f28923f)) {
                C9196d dVar = this.f28927j;
                String str = this.f28923f;
                dVar.getClass();
                Log.m105918d("MicroMsg.JsApiShowActionSheet", "addAlertHeaderView");
                TextView textView = new TextView(o0);
                textView.setHeight(C76577a.m92155f(o0, C0966R.dimen.f3758d_));
                textView.setGravity(17);
                textView.setTextColor(o0.getResources().getColor(C0966R.color.f3288ma));
                textView.setTextSize(0, (float) C76577a.m92157h(o0, C0966R.dimen.f3684bd));
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                int b = C76577a.m92151b(o0, 18);
                textView.setPadding(b, 0, b, 0);
                textView.setText(str);
                nVar.mo107569n(textView, false);
            }
            JSONArray optJSONArray = this.f28924g.optJSONArray("newTipsList");
            HashMap hashMap = new HashMap();
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        hashMap.put(Integer.valueOf(optJSONObject.optInt(FirebaseAnalytics.C113379b.INDEX, -1)), Integer.valueOf(optJSONObject.optInt("type", -1)));
                    }
                }
            }
            if (C89923l.f258408a.mo117499e(this.f28921d.getAppId())) {
                String optString = this.f28924g.optString("itemColorDark", "");
                i = o0.getResources().getColor(C0966R.color.a7f);
                try {
                    i = C88020k.m109562m(optString);
                } catch (Exception unused) {
                }
            } else {
                String optString2 = this.f28924g.optString("itemColor", "");
                i = o0.getResources().getColor(C0966R.color.a7f);
                i = C88020k.m109562m(optString2);
            }
            nVar.f225771i = new C9193a(nVar, hashMap, i);
            nVar.f225782p = new C9194b(hashMap);
            nVar.f225761d = new C9195c();
            nVar.mo107573q();
        }
    }
}
