package ll0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104873k;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104929v0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84959i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import ll0.C109395k;
import org.json.JSONException;
import org.json.JSONObject;
import p518fb.C86780b;
import p518fb.C86781c;
import rt0.C110653f;

/* renamed from: ll0.e */
public final class C109391e extends C109395k {
    public static final int CTRL_INDEX = 110;
    public static final String NAME = "insertTextArea";

    /* renamed from: ll0.e$a */
    public class C109392a implements C104873k.C104889o {

        /* renamed from: a */
        public final /* synthetic */ C104873k f327469a;

        public C109392a(C104873k kVar) {
            this.f327469a = kVar;
        }
    }

    /* renamed from: ll0.e$b */
    public class C109393b extends C104929v0 {

        /* renamed from: G */
        public final /* synthetic */ WeakReference f327471G;

        /* renamed from: H */
        public final /* synthetic */ int f327472H;

        /* renamed from: I */
        public final /* synthetic */ String f327473I;

        public C109393b(WeakReference weakReference, int i, String str) {
            this.f327471G = weakReference;
            this.f327472H = i;
            this.f327473I = str;
        }

        /* renamed from: u */
        public void mo148843u(String str) {
            C83780d1 d1Var = (C83780d1) this.f327471G.get();
            if (d1Var != null) {
                try {
                    int i = this.f311429p;
                    C109395k.C109398d dVar = new C109395k.C109398d();
                    JSONObject put = new JSONObject().put("value", C84737f0.m104397d(str)).put("data", C109391e.this.mo160598z(i)).put("cursor", 0).put("inputId", i).put("keyCode", 8);
                    dVar.mo115195q(d1Var.getRuntime().mo113047b0(), d1Var.getComponentId());
                    dVar.f242407f = put.toString();
                    dVar.mo115158h();
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.JsApiInsertTextArea", "onBackspacePressedWhileValueNoChange, e = %s", e);
                }
            }
        }

        /* renamed from: v */
        public void mo148844v(String str, int i, boolean z, boolean z2) {
            C83780d1 d1Var;
            C83797e3 e3Var;
            if (this.f327471G.get() != null) {
                try {
                    String jSONObject = new JSONObject().put("value", C84737f0.m104397d(str)).put("inputId", this.f311429p).put("cursor", i).toString();
                    if (z) {
                        ((C83780d1) this.f327471G.get()).mo109652f(C86781c.NAME, jSONObject, 0);
                    }
                    if (!z2) {
                        ((C83780d1) this.f327471G.get()).mo109652f(C86780b.NAME, jSONObject, 0);
                    }
                } catch (JSONException e) {
                    Log.m105921e("MicroMsg.JsApiInsertTextArea", "dispatch input done, exp = %s", Util.stackTraceToString(e));
                }
                if (!z2 && (d1Var = (C83780d1) this.f327471G.get()) != null && (e3Var = d1Var.f244558J) != null) {
                    C84959i.f247617b.mo117842c(e3Var);
                }
            }
        }

        /* renamed from: x */
        public void mo148846x() {
            if (this.f327471G.get() != null) {
                int i = this.f311429p;
                HashMap hashMap = new HashMap(1);
                hashMap.put("inputId", Integer.valueOf(i));
                ((C83780d1) this.f327471G.get()).mo109647a(this.f327472H, C109391e.this.mo115112m("ok", hashMap));
                C109391e.this.mo160597y(i, this.f327473I);
                C109391e.this.mo160596x(i, (C83780d1) this.f327471G.get());
            }
        }

        /* renamed from: y */
        public void mo148847y() {
            C83797e3 e3Var;
            if (this.f327471G.get() != null) {
                ((C83780d1) this.f327471G.get()).mo109647a(this.f327472H, C109391e.this.mo115109j("fail"));
                C83780d1 d1Var = (C83780d1) this.f327471G.get();
                if (d1Var != null && (e3Var = d1Var.f244558J) != null) {
                    C84959i.f247617b.mo117842c(e3Var);
                }
            }
        }
    }

    /* renamed from: ll0.e$c */
    public static final class C109394c extends C82926s {
        private static final int CTRL_INDEX = -2;
        private static final String NAME = "onTextAreaHeightChange";

        public C109394c(C109392a aVar) {
        }
    }

    /* renamed from: B */
    public void mo160599B(C104873k kVar) {
        kVar.f311421e = new C109392a(kVar);
    }

    /* renamed from: C */
    public C104873k mo160600C(WeakReference<C83780d1> weakReference, String str, int i) {
        return new C109393b(weakReference, i, str);
    }

    /* renamed from: E */
    public void mo160601E(C83780d1 d1Var, JSONObject jSONObject, int i) {
        super.mo1505u(d1Var, jSONObject, i);
    }

    /* renamed from: F */
    public boolean mo160602F(C110653f fVar, JSONObject jSONObject, C83780d1 d1Var, int i) {
        if (!super.mo160602F(fVar, jSONObject, d1Var, i)) {
            return false;
        }
        fVar.f331050u = Boolean.TRUE;
        fVar.f331018R = "textarea";
        fVar.f331019S = false;
        fVar.f331020T = false;
        fVar.f331051v = Boolean.valueOf(jSONObject.optBoolean("confirm", true));
        fVar.f226133G = Boolean.valueOf(jSONObject.optBoolean("showCoverView", false));
        fVar.f331027C = jSONObject.optString("adjustKeyboardTo", "cursor");
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u((C83780d1) fVar, jSONObject, i);
    }
}
