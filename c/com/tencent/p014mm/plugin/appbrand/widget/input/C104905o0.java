package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Selection;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104891k1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104912p0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104920s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C86493v0;
import gy3.C87412m;
import java.util.Arrays;
import ll0.C88573d;
import qn3.C77382c;
import rt0.C110653f;
import rt0.C77568i;
import to0.C90561a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.o0 */
public final class C104905o0 extends C104849c<C104912p0> {

    /* renamed from: o */
    public final String f311507o;

    /* renamed from: p */
    public final String f311508p;

    /* renamed from: q */
    public C104912p0 f311509q;

    /* renamed from: r */
    public C104920s0 f311510r;

    /* renamed from: s */
    public C77568i f311511s;

    /* renamed from: t */
    public boolean f311512t;

    /* renamed from: u */
    public boolean f311513u;

    /* renamed from: v */
    public boolean f311514v;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.o0$d */
    public static final class C68718d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C104905o0 f197393d;

        /* renamed from: e */
        public final /* synthetic */ Integer f197394e;

        public C68718d(C104905o0 o0Var, Integer num) {
            this.f197393d = o0Var;
            this.f197394e = num;
        }

        public final void run() {
            Integer num;
            C104912p0 p0Var = this.f197393d.f311509q;
            if (p0Var != null && (num = this.f197394e) != null) {
                int intValue = num.intValue();
                String str = this.f197393d.f311507o;
                Log.m105924i(str, "updateStyle, maxLength: " + intValue);
                C68712d0 g = C68712d0.m80987g(p0Var);
                g.f225611e = 0;
                g.f225610d = intValue;
                g.f225607a = false;
                g.f225612f = C45078p0.C45079a.MODE_CHINESE_AS_1;
                g.mo107499d((C77382c.C77383a) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.o0$a */
    public static final class C104906a implements C82531i.C82534c {

        /* renamed from: d */
        public final /* synthetic */ C104905o0 f311515d;

        public C104906a(C104905o0 o0Var) {
            this.f311515d = o0Var;
        }

        public final void onDestroy() {
            Log.m105924i(this.f311515d.f311507o, "onDestroy");
            C86493v0.m107224d().mo120948e(this.f311515d.f311508p);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.o0$b */
    public static final class C104907b implements C104912p0.C104915c {

        /* renamed from: a */
        public final /* synthetic */ C104905o0 f311516a;

        public C104907b(C104905o0 o0Var) {
            this.f311516a = o0Var;
        }

        /* renamed from: a */
        public void mo148885a() {
            this.f311516a.mo148882q(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.o0$c */
    public static final class C104908c implements C104920s0.C104922b {

        /* renamed from: a */
        public final /* synthetic */ C104905o0 f311517a;

        public C104908c(C104905o0 o0Var) {
            this.f311517a = o0Var;
        }

        public void onDone() {
            Log.m105918d(this.f311517a.f311507o, "onDone#OnDoneListener");
            this.f311517a.mo148744m(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104905o0(String str, C83780d1 d1Var, C110653f fVar) {
        super(str, d1Var, fVar.f331017Q);
        String str2;
        C104912p0 p0Var;
        C86493v0.C86495c b;
        C87412m.m108594g(str, "inputType");
        C87412m.m108594g(d1Var, "pageView");
        C87412m.m108594g(fVar, "inputParams");
        String str3 = "MicroMsg.AppBrand.AppBrandSecureInputComponent#" + this.f311376f;
        this.f311507o = str3;
        Integer num = fVar.f331024X;
        boolean z = true;
        String str4 = null;
        if (num != null) {
            str2 = String.format("AppBrandSecureInput#%s#%s", Arrays.copyOf(new Object[]{Integer.valueOf(d1Var.getComponentId()), num}, 2));
            C87412m.m108593f(str2, "format(this, *args)");
        } else {
            str2 = null;
        }
        this.f311508p = str2;
        Context context = d1Var.getContext();
        C87412m.m108593f(context, "pageView.context");
        this.f311509q = new C104912p0(context);
        Log.m105918d(str3, "<init>, inputType: " + str + ", inputId: " + this.f311376f + ", sessionId: " + str2);
        d1Var.mo114865m(new C104906a(this));
        C104912p0 p0Var2 = this.f311509q;
        if (p0Var2 != null) {
            p0Var2.setListener(new C104907b(this));
        }
        if (!(str2 == null || (b = C86493v0.m107224d().mo120946b(str2)) == null)) {
            str4 = b.mo120959f("SecureInputValue", (String) null);
        }
        if (!(str4 == null || str4.length() == 0)) {
            z = false;
        }
        if (!z && (p0Var = this.f311509q) != null) {
            p0Var.setText(str4);
        }
    }

    /* renamed from: b */
    public boolean mo117816b() {
        C77568i iVar = this.f311511s;
        boolean b = iVar != null ? C87412m.m108589b(Boolean.TRUE, iVar.f331026B) : false;
        String str = this.f311507o;
        Log.m105918d(str, "adjustPositionOnFocused, adjustPos: " + b);
        return b;
    }

    /* renamed from: c */
    public int mo117817c() {
        C77568i iVar = this.f311511s;
        Integer num = iVar != null ? iVar.f331054y : null;
        int intValue = num == null ? 0 : num.intValue();
        String str = this.f311507o;
        Log.m105918d(str, "getInputPanelMarginBottom, marginBottom: " + intValue);
        return intValue;
    }

    public Editable currentValue() {
        Editable currentValue = super.currentValue();
        String str = this.f311507o;
        Log.m105918d(str, "currentValue, curVal: " + currentValue);
        return currentValue;
    }

    /* renamed from: d */
    public boolean mo117819d(int i, int i2, boolean z) {
        C104920s0 s0Var;
        C83797e3 e3Var;
        String str = this.f311507o;
        Log.m105918d(str, "showKeyboard, selectionStart: " + i + ", selectionEnd: " + i2 + ", forceLightMode: " + z);
        if (this.f311509q == null) {
            Log.m105924i(this.f311507o, "showKeyboard, inputWidget is null");
            return false;
        }
        C83780d1 d1Var = this.f311378h.get();
        C90561a aVar = null;
        ViewGroup viewGroup = d1Var != null ? d1Var.f244552D : null;
        if (viewGroup == null) {
            Log.m105928w(this.f311507o, "showKeyboard, pageContentView is null");
            return false;
        }
        C104920s0.C104921a aVar2 = C104920s0.f311539n;
        C77568i iVar = this.f311511s;
        Boolean bool = iVar != null ? iVar.f226133G : null;
        boolean booleanValue = bool == null ? false : bool.booleanValue();
        C83780d1 d1Var2 = this.f311378h.get();
        if (d1Var2 != null) {
            aVar = d1Var2.mo116161P0();
        }
        C104920s0 b = aVar2.mo148915b(viewGroup, booleanValue, aVar);
        this.f311510r = b;
        if (b == null) {
            Log.m105928w(this.f311507o, "showKeyboard, keyboardPanel is null");
            return false;
        }
        this.f311513u = true;
        C83780d1 d1Var3 = this.f311378h.get();
        if (!(d1Var3 == null || (e3Var = d1Var3.f244558J) == null)) {
            C84959i.f247617b.mo117841b(e3Var);
        }
        this.f311512t = z;
        if (z && (s0Var = this.f311510r) != null) {
            Log.m105918d(s0Var.f311541e, "forceLightMode");
            AppBrandSecureKeyboard appBrandSecureKeyboard = s0Var.f311543g;
            TextView textView = (TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_0"));
            textView.setTextColor(appBrandSecureKeyboard.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            textView.setBackgroundResource(C0966R.C0969drawable.f357378ax0);
            TextView textView2 = (TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_1"));
            textView2.setTextColor(appBrandSecureKeyboard.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            textView2.setBackgroundResource(C0966R.C0969drawable.f357378ax0);
            TextView textView3 = (TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_2"));
            textView3.setTextColor(appBrandSecureKeyboard.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            textView3.setBackgroundResource(C0966R.C0969drawable.f357378ax0);
            TextView textView4 = (TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_3"));
            textView4.setTextColor(appBrandSecureKeyboard.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            textView4.setBackgroundResource(C0966R.C0969drawable.f357378ax0);
            TextView textView5 = (TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_4"));
            textView5.setTextColor(appBrandSecureKeyboard.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            textView5.setBackgroundResource(C0966R.C0969drawable.f357378ax0);
            TextView textView6 = (TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_5"));
            textView6.setTextColor(appBrandSecureKeyboard.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            textView6.setBackgroundResource(C0966R.C0969drawable.f357378ax0);
            TextView textView7 = (TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_6"));
            textView7.setTextColor(appBrandSecureKeyboard.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            textView7.setBackgroundResource(C0966R.C0969drawable.f357378ax0);
            TextView textView8 = (TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_7"));
            textView8.setTextColor(appBrandSecureKeyboard.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            textView8.setBackgroundResource(C0966R.C0969drawable.f357378ax0);
            TextView textView9 = (TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_8"));
            textView9.setTextColor(appBrandSecureKeyboard.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            textView9.setBackgroundResource(C0966R.C0969drawable.f357378ax0);
            TextView textView10 = (TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_9"));
            textView10.setTextColor(appBrandSecureKeyboard.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            textView10.setBackgroundResource(C0966R.C0969drawable.f357378ax0);
            TextView textView11 = (TextView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_x"));
            textView11.setTextColor(appBrandSecureKeyboard.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            textView11.setBackgroundResource(C0966R.C0969drawable.awv);
            appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_d")).setBackgroundResource(C0966R.C0969drawable.awv);
            ((WeImageView) appBrandSecureKeyboard.findViewById(appBrandSecureKeyboard.getId("tenpay_keyboard_d_inner"))).setIconColor(appBrandSecureKeyboard.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            appBrandSecureKeyboard.findViewById(C0966R.C0970id.iwq).setBackgroundResource(C0966R.color.BW_BG_100);
            appBrandSecureKeyboard.findViewById(C0966R.C0970id.c7q).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(C0966R.C0970id.c7v).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(C0966R.C0970id.c7w).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(C0966R.C0970id.c7x).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(C0966R.C0970id.c7y).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(C0966R.C0970id.c7z).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(C0966R.C0970id.f357875c80).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(C0966R.C0970id.f357876c81).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(C0966R.C0970id.f357877c82).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(C0966R.C0970id.c7r).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(C0966R.C0970id.c7s).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
            appBrandSecureKeyboard.findViewById(C0966R.C0970id.c7t).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
        }
        C104920s0 s0Var2 = this.f311510r;
        if (s0Var2 != null) {
            s0Var2.mo148911t(this.f311509q);
        }
        C104920s0 s0Var3 = this.f311510r;
        if (s0Var3 != null) {
            s0Var3.setOnDoneListener(new C104908c(this));
        }
        C104848b.m140516b(mo148742k(), i, i2);
        C84996v.m104811c(this.f311378h).mo117906e(this.f311376f);
        this.f311513u = false;
        return true;
    }

    public <P extends View & C84956g1> View getInputPanel() {
        C104920s0 r = mo148883r();
        String str = this.f311507o;
        Log.m105918d(str, "getInputPanel, keyboardPanel: " + r);
        return r;
    }

    public boolean hideKeyboard() {
        C83797e3 e3Var;
        Log.m105918d(this.f311507o, C88573d.NAME);
        C104920s0 r = mo148883r();
        if (r == null) {
            Log.m105924i(this.f311507o, "hideKeyboardInternal, keyboardPanel is null");
            return false;
        } else if (!mo148884s()) {
            return false;
        } else {
            Log.m105918d(r.f311541e, "hide");
            r.setVisibility(8);
            Log.m105918d(r.f311541e, "resetFocusStatus");
            EditText editText = r.f311544h;
            if (editText != null) {
                editText.clearFocus();
                r.f311544h = null;
                r.f311545i = null;
                r.f311546j = false;
            }
            String str = this.f311507o;
            Log.m105918d(str, "clearInputWidgetFocus, inputWidget: " + this.f311509q);
            C104912p0 p0Var = this.f311509q;
            if (p0Var != null) {
                p0Var.setFocusable(false);
                p0Var.setFocusableInTouchMode(false);
                p0Var.setEnabled(false);
            }
            C83780d1 d1Var = this.f311378h.get();
            if (!(d1Var == null || (e3Var = d1Var.f244558J) == null)) {
                C84959i.f247617b.mo117842c(e3Var);
            }
            C84996v.m104811c(this.f311378h).mo117905d(this.f311376f);
            return true;
        }
    }

    /* renamed from: k */
    public EditText mo148742k() {
        String str = this.f311507o;
        Log.m105918d(str, "getInput, inputWidget: " + this.f311509q);
        return this.f311509q;
    }

    /* renamed from: l */
    public Rect mo148743l() {
        C77568i iVar = this.f311511s;
        if (iVar == null) {
            return null;
        }
        Integer num = iVar.f331034e;
        C87412m.m108593f(num, "styleSnapshot.inputLeft");
        int intValue = num.intValue();
        Integer num2 = iVar.f331033d;
        C87412m.m108593f(num2, "styleSnapshot.inputTop");
        int intValue2 = num2.intValue();
        int intValue3 = iVar.f331034e.intValue();
        Integer num3 = iVar.f331031b;
        C87412m.m108593f(num3, "styleSnapshot.inputWidth");
        int intValue4 = intValue3 + num3.intValue();
        int intValue5 = iVar.f331033d.intValue();
        Integer num4 = iVar.f331032c;
        C87412m.m108593f(num4, "styleSnapshot.inputHeight");
        return new Rect(intValue, intValue2, intValue4, intValue5 + num4.intValue());
    }

    /* renamed from: m */
    public boolean mo148744m(boolean z) {
        String str = this.f311507o;
        Log.m105918d(str, "onFocusChanged, hasFocus: " + z);
        if (!z) {
            mo148882q(false);
        } else {
            boolean s = mo148884s();
            if (this.f311513u || s) {
                String str2 = this.f311507o;
                Log.m105924i(str2, "doShowKeyboard, performingShowKeyboard: " + this.f311513u + ", isFocused: " + s);
            } else {
                this.f311513u = true;
                mo117819d(-2, -2, this.f311512t);
                this.f311513u = false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public C77568i mo148746o(C77568i iVar) {
        C104912p0 p0Var;
        C87412m.m108594g(iVar, "params");
        Log.m105918d(this.f311507o, "updateStyle");
        C77568i iVar2 = this.f311511s;
        if (iVar2 == null) {
            this.f311511s = iVar;
        } else if (iVar2 != null) {
            iVar2.mo162196a(iVar);
            C68711c2.f197387a.mo94511a(iVar2, iVar);
        }
        C104912p0 p0Var2 = this.f311509q;
        Integer num = null;
        if (p0Var2 == null) {
            return null;
        }
        C104848b.m140515a(p0Var2, this.f311511s);
        C77568i iVar3 = this.f311511s;
        if (iVar3 != null) {
            num = iVar3.f226135I;
        }
        if (!(num == null || (p0Var = this.f311509q) == null)) {
            p0Var.setLength$luggage_wxa_app_input_ext_release(num.intValue());
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C68718d(this, num));
        return this.f311511s;
    }

    /* renamed from: p */
    public boolean mo148747p(String str) {
        String str2 = this.f311507o;
        Log.m105918d(str2, "updateValue, value: " + str);
        if (!(str == null || str.length() == 0)) {
            return false;
        }
        C104912p0 p0Var = this.f311509q;
        if (p0Var != null) {
            p0Var.setText(str);
        }
        return true;
    }

    /* renamed from: q */
    public final void mo148882q(boolean z) {
        String str;
        String str2;
        String str3;
        Log.m105918d(this.f311507o, "doHideKeyboard, isInputDone: " + z);
        boolean s = mo148884s();
        if (this.f311514v || !s) {
            Log.m105924i(this.f311507o, "doHideKeyboard, performingHideKeyboard: " + this.f311514v + ", isFocused: " + s);
            return;
        }
        this.f311514v = true;
        if (!z) {
            Editable currentValue = currentValue();
            C104891k1 k1Var = this.f311374d;
            if (k1Var != null) {
                ((C104919s) k1Var).mo148904a(currentValue == null ? "" : currentValue.toString(), Selection.getSelectionEnd(currentValue), C104891k1.C104892a.COMPLETE);
            }
        } else {
            try {
                str2 = C68719r0.m80993a(this.f311509q, this.f311378h.get(), this.f311511s);
                str3 = null;
            } catch (IllegalStateException e) {
                String message = e.getMessage();
                Log.m105924i(this.f311507o, "dispatchKeyboardComplete, encryptErrorMsg: " + message);
                str3 = message;
                str2 = null;
            }
            mo148741j(currentValue(), str2, str3);
        }
        C104912p0 p0Var = this.f311509q;
        String realText$luggage_wxa_app_input_ext_release = p0Var != null ? p0Var.getRealText$luggage_wxa_app_input_ext_release() : null;
        if (!(realText$luggage_wxa_app_input_ext_release == null || (str = this.f311508p) == null)) {
            C86493v0.m107224d().mo120947c(str, true).mo120964k("SecureInputValue", realText$luggage_wxa_app_input_ext_release);
        }
        hideKeyboard();
        mo148745n();
        this.f311514v = false;
        this.f311509q = null;
    }

    /* renamed from: r */
    public final C104920s0 mo148883r() {
        if (this.f311510r == null) {
            C104912p0 p0Var = this.f311509q;
            this.f311510r = p0Var != null ? p0Var.getInputPanel() : null;
        }
        return this.f311510r;
    }

    /* renamed from: s */
    public boolean mo148884s() {
        Log.m105918d(this.f311507o, "isFocused");
        C104912p0 p0Var = this.f311509q;
        if (p0Var == null) {
            Log.m105918d(this.f311507o, "isFocused, inputWidget is null");
            return false;
        }
        if (p0Var != null && true == p0Var.isFocused()) {
            Log.m105918d(this.f311507o, "isFocused, inputWidget focused");
            return true;
        }
        C104920s0 r = mo148883r();
        if (r == null) {
            Log.m105918d(this.f311507o, "isFocused, keyboardPanel is null");
            return false;
        } else if (r.isShown()) {
            return C87412m.m108589b(r.getAttachedInputWidget(), this.f311509q);
        } else {
            Log.m105918d(this.f311507o, "isFocused, keyboardPanel is not shown");
            return false;
        }
    }
}
