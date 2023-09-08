package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.graphics.Rect;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104901n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import go3.C87283v;
import rt0.C110653f;
import rt0.C77568i;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.d */
public class C104854d extends C104849c<C104868g0> {

    /* renamed from: o */
    public final String f311386o;

    /* renamed from: p */
    public int f311387p = 0;

    /* renamed from: q */
    public C104868g0 f311388q;

    /* renamed from: r */
    public C104901n0 f311389r;

    /* renamed from: s */
    public C77568i f311390s;

    /* renamed from: t */
    public boolean f311391t;

    /* renamed from: u */
    public boolean f311392u;

    /* renamed from: v */
    public boolean f311393v;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.d$a */
    public class C104855a extends C87283v {
        public C104855a() {
        }

        public void afterTextChanged(Editable editable) {
            String trim;
            int length;
            int i;
            if (editable != null && (length = trim.length()) > 0) {
                int selectionEnd = C104854d.this.f311388q.getSelectionEnd();
                boolean z = 8 == C104854d.this.f311388q.getLastKeyPressed();
                StringBuilder sb = new StringBuilder(length);
                int i2 = -1;
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    char charAt = (trim = editable.toString().trim()).charAt(i4);
                    if (!z || selectionEnd - 1 != i4) {
                        if (-1 == i2 && selectionEnd == i4) {
                            i2 = sb.length();
                        }
                    } else if (Character.isDigit(charAt) && 3 == i3 && (i = i4 + 1) < length && Character.isDigit(trim.charAt(i))) {
                    } else if (!Character.isDigit(charAt) && i3 == 0) {
                        i2 = sb.length();
                    }
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                        i3++;
                        if (4 == i3) {
                            int i5 = i4 + 1;
                            if (i5 < length && Character.isDigit(trim.charAt(i5))) {
                                sb.append(' ');
                            }
                            i3 = 0;
                        }
                    } else if (i3 == 0) {
                        sb.append(charAt);
                    }
                }
                String sb4 = sb.toString();
                if (-1 == i2) {
                    i2 = sb4.length();
                }
                int i6 = C68709b1.f197385a;
                C104854d.this.f311388q.mo148943w();
                C104854d.this.f311388q.setText(sb4);
                C104854d.this.f311388q.setSelection(i2);
                C104854d.this.f311388q.mo148918A();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.d$b */
    public class C104856b implements C104901n0.C104902a {
        public C104856b() {
        }

        public void onDone() {
            C104854d.this.mo148752s();
            C104854d.this.mo148744m(false);
        }
    }

    public C104854d(String str, C83780d1 d1Var, C110653f fVar) {
        super(str, d1Var, fVar.f331017Q);
        String str2 = fVar.f331018R;
        this.f311386o = str2;
        this.f311388q = new C104868g0(d1Var.getContext());
        this.f311387p = Util.nullAs(C84947c0.f247596d.get(str), 0);
        if ("encrypt-bankcard".equalsIgnoreCase(str2)) {
            this.f311388q.addTextChangedListener(new C104855a());
        }
    }

    /* renamed from: b */
    public boolean mo117816b() {
        C77568i iVar = this.f311390s;
        return iVar != null && C84975p1.m104768c(iVar.f331026B);
    }

    /* renamed from: c */
    public int mo117817c() {
        Integer num;
        C77568i iVar = this.f311390s;
        if (iVar == null || (num = iVar.f331054y) == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: d */
    public boolean mo117819d(int i, int i2, boolean z) {
        C83797e3 e3Var;
        if (this.f311388q == null) {
            return false;
        }
        C104901n0 v = C104901n0.m140624v(this.f311378h.get().f244552D, (this.f311378h.get() == null || !(this.f311378h.get() instanceof C83780d1)) ? null : this.f311378h.get().mo116161P0());
        this.f311389r = v;
        v.setComponentView(this.f311390s.f226133G.booleanValue());
        this.f311389r.mo148876w();
        C104901n0 n0Var = this.f311389r;
        if (n0Var == null) {
            return false;
        }
        this.f311393v = z;
        if (z) {
            n0Var.f311480d.setBackgroundResource(C0966R.color.BW_BG_100);
            n0Var.f311480d.findViewById(C0966R.C0970id.c7p).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
            n0Var.f311480d.findViewById(C0966R.C0970id.ao4).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
            n0Var.f311483g.mo148877a();
        }
        this.f311392u = true;
        C83780d1 d1Var = this.f311378h.get();
        if (!(d1Var == null || (e3Var = d1Var.f244558J) == null)) {
            C84959i.f247617b.mo117841b(e3Var);
        }
        this.f311389r.setXMode(this.f311387p);
        C104901n0 n0Var2 = this.f311389r;
        C104868g0 g0Var = this.f311388q;
        if (g0Var == null) {
            n0Var2.getClass();
        } else {
            EditText editText = n0Var2.f311484h;
            if (!(editText == g0Var || editText == null)) {
                editText.clearFocus();
                n0Var2.f311484h = null;
                n0Var2.f311482f = null;
                n0Var2.f311481e = false;
            }
            n0Var2.setInputEditText(g0Var);
            n0Var2.setVisibility(0);
        }
        this.f311389r.setOnDoneListener(new C104856b());
        C104848b.m140516b(mo148742k(), i, i2);
        C84996v.m104811c(this.f311378h).mo117906e(this.f311376f);
        this.f311392u = false;
        return true;
    }

    public View getInputPanel() {
        mo148750q();
        return this.f311389r;
    }

    public boolean hideKeyboard() {
        C83797e3 e3Var;
        if (mo148750q() == null || !mo148751r()) {
            return false;
        }
        C104901n0 n0Var = this.f311389r;
        n0Var.setVisibility(8);
        EditText editText = n0Var.f311484h;
        if (editText != null) {
            editText.clearFocus();
            n0Var.f311484h = null;
            n0Var.f311482f = null;
            n0Var.f311481e = false;
        }
        Log.m105919d("MicroMsg.AppBrandInputComponentAsNumber", "[input_switch] disableInputFocus %s", this.f311388q);
        C104868g0 g0Var = this.f311388q;
        if (g0Var != null) {
            g0Var.setFocusable(false);
            this.f311388q.setFocusableInTouchMode(false);
            this.f311388q.setEnabled(false);
        }
        C83780d1 d1Var = this.f311378h.get();
        if (!(d1Var == null || (e3Var = d1Var.f244558J) == null)) {
            C84959i.f247617b.mo117842c(e3Var);
        }
        C84996v.m104811c(this.f311378h).mo117905d(this.f311376f);
        return true;
    }

    /* renamed from: k */
    public EditText mo148742k() {
        return this.f311388q;
    }

    /* renamed from: l */
    public Rect mo148743l() {
        return new Rect(this.f311390s.f331034e.intValue(), this.f311390s.f331033d.intValue(), this.f311390s.f331034e.intValue() + this.f311390s.f331031b.intValue(), this.f311390s.f331033d.intValue() + this.f311390s.f331032c.intValue());
    }

    /* renamed from: m */
    public boolean mo148744m(boolean z) {
        Log.m105919d("MicroMsg.AppBrandInputComponentAsNumber", "[input_switch] onFocusChanged hasFocus %b, isFocused %b", Boolean.valueOf(z), Boolean.valueOf(mo148751r()));
        if (!z) {
            if (this.f311391t || !mo148751r()) {
                return true;
            }
            this.f311391t = true;
            mo148752s();
            hideKeyboard();
            mo148745n();
            this.f311391t = false;
            this.f311388q = null;
        } else if (this.f311392u || mo148751r()) {
            return true;
        } else {
            this.f311392u = true;
            mo117819d(-2, -2, this.f311393v);
            this.f311392u = false;
        }
        return true;
    }

    /* renamed from: o */
    public C77568i mo148746o(C77568i iVar) {
        C104868g0 g0Var;
        C77568i iVar2 = this.f311390s;
        if (iVar2 == null) {
            this.f311390s = iVar;
            if (C84975p1.m104768c(iVar.f226132F) && (g0Var = this.f311388q) != null) {
                g0Var.setPasswordMode(true);
            }
        } else {
            iVar2.mo162196a(iVar);
            C68709b1.m80979a(this.f311390s, iVar);
        }
        C104868g0 g0Var2 = this.f311388q;
        if (g0Var2 == null) {
            return null;
        }
        C104848b.m140515a(g0Var2, this.f311390s);
        return this.f311390s;
    }

    /* renamed from: p */
    public boolean mo148747p(String str) {
        C104868g0 g0Var = this.f311388q;
        if (g0Var == null) {
            return false;
        }
        g0Var.mo148919B(str);
        return true;
    }

    /* renamed from: q */
    public final C104901n0 mo148750q() {
        C104901n0 n0Var = this.f311389r;
        if (n0Var != null) {
            return n0Var;
        }
        C104901n0 inputPanel = this.f311388q.getInputPanel();
        this.f311389r = inputPanel;
        return inputPanel;
    }

    /* renamed from: r */
    public boolean mo148751r() {
        C104868g0 g0Var = this.f311388q;
        if (g0Var == null) {
            return false;
        }
        if (g0Var.isFocused()) {
            return true;
        }
        return mo148750q() != null && mo148750q().isShown() && this.f311389r.getAttachedEditText() == this.f311388q;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.AppBrandInputComponentAsNumber", "onKeyboardComplete, encrypt fail since %s", r0);
        r0 = r0.getMessage();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo148752s() {
        /*
            r7 = this;
            java.lang.String r0 = r7.f311386o
            boolean r0 = com.tencent.p014mm.plugin.appbrand.widget.input.C84947c0.m104716e(r0)
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "MicroMsg.AppBrandInputComponentAsNumber"
            java.lang.String r1 = "onKeyboardComplete, do encrypt"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.appbrand.page.d1> r0 = r7.f311378h
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.appbrand.page.d1 r0 = (com.tencent.p014mm.plugin.appbrand.page.C83780d1) r0
            rt0.i r1 = r7.f311390s
            r2 = 0
            monitor-enter(r7)     // Catch:{ a1 -> 0x0034 }
            com.tencent.mm.plugin.appbrand.widget.input.h1 r3 = r7.f311381n     // Catch:{ all -> 0x0031 }
            if (r3 != 0) goto L_0x0028
            com.tencent.mm.plugin.appbrand.widget.input.e r3 = new com.tencent.mm.plugin.appbrand.widget.input.e     // Catch:{ all -> 0x0031 }
            java.lang.String r4 = r7.f311377g     // Catch:{ all -> 0x0031 }
            r3.<init>(r4, r7)     // Catch:{ all -> 0x0031 }
            r7.f311381n = r3     // Catch:{ all -> 0x0031 }
        L_0x0028:
            monitor-exit(r7)     // Catch:{ a1 -> 0x0034 }
            java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.widget.input.C68709b1.m80980b(r3, r0, r1)     // Catch:{ a1 -> 0x0034 }
            r6 = r2
            r2 = r0
            r0 = r6
            goto L_0x0046
        L_0x0031:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ a1 -> 0x0034 }
            throw r0     // Catch:{ a1 -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            java.lang.String r1 = "MicroMsg.AppBrandInputComponentAsNumber"
            java.lang.String r3 = "onKeyboardComplete, encrypt fail since %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r3, r4)
            java.lang.String r0 = r0.getMessage()
        L_0x0046:
            android.text.Editable r1 = r7.currentValue()
            r7.mo148741j(r1, r2, r0)
            return
        L_0x004e:
            android.text.Editable r0 = r7.currentValue()
            com.tencent.mm.plugin.appbrand.widget.input.k1 r1 = r7.f311374d
            if (r1 == 0) goto L_0x006a
            if (r0 != 0) goto L_0x005b
            java.lang.String r2 = ""
            goto L_0x005f
        L_0x005b:
            java.lang.String r2 = r0.toString()
        L_0x005f:
            int r0 = android.text.Selection.getSelectionEnd(r0)
            com.tencent.mm.plugin.appbrand.widget.input.k1$a r3 = com.tencent.p014mm.plugin.appbrand.widget.input.C104891k1.C104892a.COMPLETE
            com.tencent.mm.plugin.appbrand.widget.input.s r1 = (com.tencent.p014mm.plugin.appbrand.widget.input.C104919s) r1
            r1.mo148904a(r2, r0, r3)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.input.C104854d.mo148752s():void");
    }
}
