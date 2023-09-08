package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.graphics.Rect;
import android.text.Editable;
import android.text.Selection;
import android.view.View;
import android.widget.EditText;
import c30.C79922d;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82540i0;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104863f1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104891k1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68712d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import go3.C87283v;
import java.lang.ref.WeakReference;
import java.util.Map;
import js0.C88020k;
import js0.C88024r;
import org.json.JSONObject;
import p1042u.C90590d;
import p518fb.C86780b;
import qn3.C77382c;
import rt0.C110653f;
import rt0.C77568i;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.c */
public abstract class C104849c<Input extends EditText & C104863f1> extends C87283v implements C84954e1 {

    /* renamed from: d */
    public C104891k1 f311374d;

    /* renamed from: e */
    public C104872j1 f311375e;

    /* renamed from: f */
    public final int f311376f;

    /* renamed from: g */
    public final String f311377g;

    /* renamed from: h */
    public final WeakReference<C83780d1> f311378h;

    /* renamed from: i */
    public final View.OnFocusChangeListener f311379i = new C104850a();

    /* renamed from: j */
    public final C77382c.C77383a f311380j = new C104851b();

    /* renamed from: n */
    public C68717h1 f311381n = null;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.c$a */
    public class C104850a implements View.OnFocusChangeListener {
        public C104850a() {
        }

        public void onFocusChange(View view, boolean z) {
            if (C104849c.this.mo148744m(z) && z) {
                C83780d1 d1Var = C104849c.this.f311378h.get();
                C104863f1 f1Var = (C104863f1) C104849c.this.mo148742k();
                Map<String, Integer> map = C84947c0.f247596d;
                if (d1Var != null) {
                    C88024r.m109572b(new C84945a0(d1Var, f1Var));
                }
                ((C104863f1) C104849c.this.mo148742k()).setInputId(C104849c.this.f311376f);
                C104849c cVar = C104849c.this;
                C84955f.f247608a.mo122464e(C104849c.this.f311378h.get(), cVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.c$b */
    public class C104851b extends C68712d0.C68713a {
        public C104851b() {
        }

        /* renamed from: L0 */
        public void mo4083L0(String str) {
            if (C104849c.this.mo148742k() != null) {
                C104849c cVar = C104849c.this;
                Editable editableText = cVar.mo148742k().getEditableText();
                C104891k1 k1Var = cVar.f311374d;
                if (k1Var != null) {
                    ((C104919s) k1Var).mo148904a(editableText == null ? "" : editableText.toString(), Selection.getSelectionEnd(editableText), C104891k1.C104892a.CHANGED);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.c$c */
    public enum C104852c {
        ;
        

        /* renamed from: d */
        public static final C90590d<C104853a> f311384d = null;

        /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.c$c$a */
        public interface C104853a {
            /* renamed from: a */
            C104849c mo148749a(String str, C83780d1 d1Var, C110653f fVar);
        }

        /* access modifiers changed from: public */
        static {
            f311384d = new C90590d<>();
        }
    }

    public C104849c(String str, C83780d1 d1Var, int i) {
        this.f311377g = str;
        this.f311378h = new WeakReference<>(d1Var);
        this.f311376f = i;
    }

    /* renamed from: a */
    public boolean mo117815a() {
        return mo148745n();
    }

    public final void afterTextChanged(Editable editable) {
        C104891k1 k1Var = this.f311374d;
        if (k1Var != null) {
            ((C104919s) k1Var).mo148904a(editable == null ? "" : editable.toString(), Selection.getSelectionEnd(editable), C104891k1.C104892a.CHANGED);
        }
    }

    public Editable currentValue() {
        if (mo148742k() == null) {
            return null;
        }
        return mo148742k().getEditableText();
    }

    /* renamed from: e */
    public final void mo117820e(String str, Integer num) {
        mo148747p(str);
        Integer valueOf = Integer.valueOf(num == null ? -1 : num.intValue());
        C104848b.m140516b(mo148742k(), valueOf.intValue(), valueOf.intValue());
    }

    /* renamed from: f */
    public final void mo117821f(int i) {
        C104872j1 j1Var = this.f311375e;
        if (j1Var != null) {
            C104923t tVar = (C104923t) j1Var;
            tVar.getClass();
            try {
                C83780d1 d1Var = (C83780d1) tVar.f311547a.get();
                if (d1Var != null) {
                    int f = C88020k.m109555f(i);
                    C79922d dVar = new C79922d();
                    dVar.put("inputId", tVar.f311548b);
                    dVar.put("height", f);
                    d1Var.mo109652f("onKeyboardShow", dVar.toString(), 0);
                    new C82540i0().mo114873s(i, d1Var.mo116160O0(), d1Var, Integer.valueOf(tVar.f311548b));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    public boolean mo117822g(C83780d1 d1Var) {
        return d1Var != null && d1Var == this.f311378h.get();
    }

    public final int getInputId() {
        return this.f311376f;
    }

    /* renamed from: h */
    public Input mo117825h() {
        return mo148742k();
    }

    /* renamed from: i */
    public final boolean mo148740i(C77568i iVar) {
        C77568i o = mo148746o(iVar);
        if (o == null) {
            return false;
        }
        Integer num = o.f331043n;
        if (num == null) {
            o.f331043n = 140;
        } else if (num.intValue() <= 0) {
            o.f331043n = Integer.MAX_VALUE;
        }
        if (mo148742k() == null) {
            return false;
        }
        C68712d0 g = C68712d0.m80987g(mo148742k());
        int intValue = o.f331043n.intValue();
        g.f225611e = 0;
        g.f225610d = intValue;
        g.f225607a = false;
        g.f225612f = C45078p0.C45079a.MODE_CHINESE_AS_1;
        g.mo107499d(this.f311380j);
        return true;
    }

    /* renamed from: j */
    public final void mo148741j(Editable editable, String str, String str2) {
        C104891k1 k1Var = this.f311374d;
        if (k1Var != null) {
            String obj = editable == null ? "" : editable.toString();
            int selectionEnd = Selection.getSelectionEnd(editable);
            C104919s sVar = (C104919s) k1Var;
            sVar.getClass();
            try {
                C83780d1 d1Var = (C83780d1) sVar.f311535a.get();
                if (d1Var != null) {
                    JSONObject put = new JSONObject().put("value", obj).put("keyCode", ((C104863f1) sVar.f311536b.mo148742k()).getLastKeyPressed()).put("inputId", sVar.f311537c).put("cursor", selectionEnd);
                    if (str != null) {
                        put.put("encryptValue", str);
                    }
                    if (str2 != null) {
                        put.put("encryptError", str2);
                    }
                    String jSONObject = put.toString();
                    Log.m105924i("MicroMsg.AppBrandInputJsApiHandler", "onKeyboardCompleteWithEncryptedValue, eventData: " + jSONObject);
                    d1Var.mo109652f(C86780b.NAME, jSONObject, 0);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: k */
    public abstract Input mo148742k();

    /* renamed from: l */
    public abstract Rect mo148743l();

    /* renamed from: m */
    public abstract boolean mo148744m(boolean z);

    /* renamed from: n */
    public final boolean mo148745n() {
        C84957h hVar;
        EditText k = mo148742k();
        if (k == null) {
            return false;
        }
        ((C104863f1) k).mo148799c(this.f311379i);
        k.removeTextChangedListener(this);
        C104863f1 f1Var = (C104863f1) k;
        f1Var.destroy();
        C83780d1 d1Var = this.f311378h.get();
        if (d1Var == null || (hVar = (C84957h) d1Var.mo116152G0()) == null) {
            return false;
        }
        hVar.mo117830l(k);
        C84947c0.m104720i(d1Var, f1Var);
        return true;
    }

    /* renamed from: o */
    public abstract C77568i mo148746o(C77568i iVar);

    /* renamed from: p */
    public abstract boolean mo148747p(String str);
}
