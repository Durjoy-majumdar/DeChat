package ll0;

import android.graphics.Rect;
import android.widget.EditText;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104849c;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104863f1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104873k;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104893l;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68709b1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68711c2;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84947c0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84954e1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84955f;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84957h;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84975p1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import js0.C88024r;
import org.json.JSONException;
import org.json.JSONObject;
import rt0.C110653f;
import rt0.C77568i;

/* renamed from: ll0.o */
public class C109402o extends C109390a<C77568i> {
    private static final int CTRL_INDEX = 112;
    private static final String NAME = "updateInput";

    /* renamed from: ll0.o$a */
    public class C109403a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83780d1 f327497d;

        /* renamed from: e */
        public final /* synthetic */ int f327498e;

        /* renamed from: f */
        public final /* synthetic */ C77568i f327499f;

        /* renamed from: g */
        public final /* synthetic */ int f327500g;

        public C109403a(C83780d1 d1Var, int i, C77568i iVar, int i2) {
            this.f327497d = d1Var;
            this.f327498e = i;
            this.f327499f = iVar;
            this.f327500g = i2;
        }

        public void run() {
            C84954e1 e1Var;
            boolean z;
            Integer num;
            C83780d1 d1Var;
            C84957h hVar;
            Rect l;
            Set<C84954e1<?>> d;
            C83780d1 d1Var2 = this.f327497d;
            int i = this.f327498e;
            C77568i iVar = this.f327499f;
            C104849c cVar = null;
            if (d1Var2 != null && (d = C84955f.f247608a.mo122463d(d1Var2)) != null) {
                Iterator<C84954e1<?>> it = d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e1Var = it.next();
                    if (e1Var != null) {
                        if (e1Var.mo117825h() != null && ((C104863f1) e1Var.mo117825h()).getInputId() == i) {
                            break;
                        }
                    }
                }
            }
            e1Var = null;
            if (e1Var instanceof C104849c) {
                cVar = (C104849c) e1Var;
            }
            if (cVar != null) {
                String str = iVar.f331030a;
                if (str != null) {
                    cVar.mo148747p(str);
                }
                cVar.mo148740i(iVar);
                EditText k = cVar.mo148742k();
                if (!(k == null || (d1Var = cVar.f311378h.get()) == null || d1Var.f244558J == null || (hVar = (C84957h) d1Var.mo116152G0()) == null || (l = cVar.mo148743l()) == null)) {
                    hVar.mo117836r(d1Var.f244558J, k, l.width(), l.height(), l.left, l.top);
                }
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f327497d.mo109647a(this.f327500g, C109402o.this.mo115109j("ok"));
                return;
            }
            C84954e1<?> a = C84947c0.m104713a(this.f327497d, this.f327498e);
            if (a instanceof C104873k) {
                C104873k kVar = (C104873k) a;
                C77568i iVar2 = this.f327499f;
                C110653f fVar = kVar.f311427n;
                if (!(fVar == null || kVar.f311430q == null)) {
                    fVar.mo162196a(iVar2);
                    C68709b1.m80979a(kVar.f311427n, iVar2);
                    if (kVar.f311427n.f331021U || ((num = kVar.f311427n.f331032c) != null && num.intValue() > 0)) {
                        kVar.f311430q.setWillNotDraw(true);
                        kVar.mo148829A();
                        String str2 = kVar.f311427n.f331030a;
                        if (str2 != null) {
                            kVar.f311430q.mo148919B(Util.nullAsNil(str2));
                        }
                        if (!C84975p1.m104768c(kVar.f311427n.f331052w)) {
                            kVar.mo148831C(kVar.f311430q, kVar.f311427n);
                        } else {
                            C104893l lVar = new C104893l(kVar);
                            if (kVar.f311430q.getLayout() == null) {
                                kVar.f311430q.post(lVar);
                            } else {
                                lVar.run();
                            }
                        }
                        kVar.f311430q.setWillNotDraw(false);
                        kVar.f311430q.invalidate();
                    }
                }
                this.f327497d.mo109647a(this.f327500g, C109402o.this.mo115109j("ok"));
                return;
            }
            Locale locale = Locale.US;
            Log.m105920e("MicroMsg.AppBrand.JsApiUpdateInput", String.format(locale, "AppBrandInputInvokeHandler with inputID(%d) 404", new Object[]{Integer.valueOf(this.f327498e)}));
            this.f327497d.mo109647a(this.f327500g, C109402o.this.mo115109j(String.format(locale, "fail found no input with %d", new Object[]{Integer.valueOf(this.f327498e)})));
        }
    }

    /* renamed from: B */
    public void mo1505u(C83780d1 d1Var, JSONObject jSONObject, int i) {
        C77568i iVar = new C77568i();
        if (mo160594A(iVar, jSONObject, d1Var, i)) {
            try {
                int i2 = jSONObject.getInt("inputId");
                Integer num = iVar.f331031b;
                if (num != null && num.intValue() < 0) {
                    iVar.f331031b = 0;
                }
                Integer num2 = iVar.f331032c;
                if (num2 != null && num2.intValue() < 0) {
                    iVar.f331032c = 0;
                }
                String optString = jSONObject.optString("data", (String) null);
                if (optString != null) {
                    mo160597y(i2, optString);
                }
                C68711c2.m80983c(jSONObject, iVar);
                C68709b1.m80981c(jSONObject, iVar);
                C88024r.m109572b(new C109403a(d1Var, i2, iVar, i));
            } catch (JSONException unused) {
                d1Var.mo109647a(i, mo115109j("fail:invalid data"));
            }
        }
    }

    /* renamed from: w */
    public boolean mo160595w() {
        return true;
    }
}
