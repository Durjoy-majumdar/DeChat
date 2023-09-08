package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.text.Editable;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tenpay.miniapp.MiniAppSecureEditText;
import go3.C87283v;
import gy3.C87412m;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.p0 */
public final class C104912p0 extends C104862f0 {

    /* renamed from: v */
    public C104915c f311524v;

    /* renamed from: w */
    public final MiniAppSecureEditText f311525w;

    /* renamed from: x */
    public String f311526x;

    /* renamed from: y */
    public String f311527y;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.p0$a */
    public static final class C104913a implements MiniAppSecureEditText.OnPasswdInputListener {

        /* renamed from: a */
        public final /* synthetic */ C104912p0 f311528a;

        public C104913a(C104912p0 p0Var) {
            this.f311528a = p0Var;
        }

        public final void onDone() {
            Log.m105918d(this.f311528a.getMyTag$luggage_wxa_app_input_ext_release(), "onDone#secureInputWidgetLogic");
            C104915c listener = this.f311528a.getListener();
            if (listener != null) {
                listener.mo148885a();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.p0$b */
    public static final class C104914b extends C87283v {
        public C104914b(C104912p0 p0Var) {
        }

        public void afterTextChanged(Editable editable) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.p0$c */
    public interface C104915c {
        /* renamed from: a */
        void mo148885a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104912p0(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        MiniAppSecureEditText miniAppSecureEditText = new MiniAppSecureEditText(context);
        this.f311525w = miniAppSecureEditText;
        setImeOptions(1);
        new C104857d2(this);
        miniAppSecureEditText.setText(getText());
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart >= 0 && selectionEnd >= 0 && selectionStart <= selectionEnd) {
            try {
                miniAppSecureEditText.setSelection(selectionStart, selectionEnd);
            } catch (Exception unused) {
            }
        }
        miniAppSecureEditText.setOnPasswdInputListener(new C104913a(this));
        miniAppSecureEditText.addTextChangedListener(new C104914b(this));
    }

    /* renamed from: C */
    public void mo148888C(char c) {
        char c2 = Character.isLetterOrDigit(c) ? '*' : c;
        String myTag$luggage_wxa_app_input_ext_release = getMyTag$luggage_wxa_app_input_ext_release();
        Log.m105918d(myTag$luggage_wxa_app_input_ext_release, "saveLastKeyPressed, code: " + c + ", savedCode: " + c2);
        this.f311569u = c2;
    }

    /* renamed from: d */
    public boolean mo148800d() {
        Log.m105918d(getMyTag$luggage_wxa_app_input_ext_release(), "supportsAutoFill");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if ((29 <= r0 && r0 < 55) != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r5, r0)
            int r0 = r5.getKeyCode()
            r1 = 7
            r2 = 0
            r3 = 1
            if (r1 > r0) goto L_0x0014
            r1 = 17
            if (r0 >= r1) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 != 0) goto L_0x0028
            int r0 = r5.getKeyCode()
            r1 = 29
            if (r1 > r0) goto L_0x0025
            r1 = 55
            if (r0 >= r1) goto L_0x0025
            r0 = 1
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            r2 = 1
        L_0x0029:
            if (r2 == 0) goto L_0x0037
            android.view.KeyEvent r0 = new android.view.KeyEvent
            int r1 = r5.getAction()
            r2 = 155(0x9b, float:2.17E-43)
            r0.<init>(r1, r2)
            goto L_0x0038
        L_0x0037:
            r0 = r5
        L_0x0038:
            java.lang.String r1 = r4.getMyTag$luggage_wxa_app_input_ext_release()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "dispatchKeyEvent, event: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = ", dispatchedKeyEvent: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)
            boolean r0 = super.dispatchKeyEvent(r0)
            com.tenpay.miniapp.MiniAppSecureEditText r1 = r4.f311525w
            boolean r5 = r1.dispatchKeyEvent(r5)
            java.lang.String r1 = r4.getMyTag$luggage_wxa_app_input_ext_release()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "dispatchKeyEvent, handled: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ", handled2: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.input.C104912p0.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* renamed from: g */
    public void mo148804g(C83780d1 d1Var) {
        Log.m105918d(getMyTag$luggage_wxa_app_input_ext_release(), "onDetachedFromPage");
    }

    public final C104915c getListener() {
        return this.f311524v;
    }

    public final String getMyTag$luggage_wxa_app_input_ext_release() {
        return "MicroMsg.AppBrand.AppBrandSecureInputWidget#" + getInputId();
    }

    public final String getRealText$luggage_wxa_app_input_ext_release() {
        Editable text = this.f311525w.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final MiniAppSecureEditText getSecureInputWidgetLogic$luggage_wxa_app_input_ext_release() {
        return this.f311525w;
    }

    /* renamed from: k */
    public void mo148813k(C83780d1 d1Var) {
        Log.m105918d(getMyTag$luggage_wxa_app_input_ext_release(), "onAttachedToPage");
    }

    public void onCreateContextMenu(ContextMenu contextMenu) {
        if (contextMenu != null) {
            contextMenu.clearHeader();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        Log.m105918d(getMyTag$luggage_wxa_app_input_ext_release(), "onCreateInputConnection");
        return null;
    }

    public void onSelectionChanged(int i, int i2) {
        String myTag$luggage_wxa_app_input_ext_release = getMyTag$luggage_wxa_app_input_ext_release();
        Log.m105924i(myTag$luggage_wxa_app_input_ext_release, "onSelectionChanged, selStart: " + i + ", selEnd: " + i2);
        Editable text = getText();
        int length = text != null ? text.length() : 0;
        String myTag$luggage_wxa_app_input_ext_release2 = getMyTag$luggage_wxa_app_input_ext_release();
        Log.m105924i(myTag$luggage_wxa_app_input_ext_release2, "onSelectionChangedDisable, sel: " + length);
        if (i == length && i2 == length) {
            super.onSelectionChanged(i, i2);
            post(new C104917q0(this, i, i2));
            return;
        }
        setSelection(length, length);
    }

    public boolean onTextContextMenuItem(int i) {
        return true;
    }

    /* renamed from: r */
    public void mo148897r(CharSequence charSequence) {
        String myTag$luggage_wxa_app_input_ext_release = getMyTag$luggage_wxa_app_input_ext_release();
        Log.m105920e(myTag$luggage_wxa_app_input_ext_release, "appendText, text: " + charSequence);
    }

    public void setInputId(int i) {
        String myTag$luggage_wxa_app_input_ext_release = getMyTag$luggage_wxa_app_input_ext_release();
        Log.m105918d(myTag$luggage_wxa_app_input_ext_release, "setInputId, id: " + i);
        super.setInputId(i);
    }

    public final void setLength$luggage_wxa_app_input_ext_release(int i) {
        String myTag$luggage_wxa_app_input_ext_release = getMyTag$luggage_wxa_app_input_ext_release();
        Log.m105918d(myTag$luggage_wxa_app_input_ext_release, "setLength, length: " + i);
        this.f311525w.setInputLength(i, i);
    }

    public final void setListener(C104915c cVar) {
        this.f311524v = cVar;
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        String str;
        if (charSequence != null) {
            StringBuilder sb = new StringBuilder();
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                char charAt = charSequence.charAt(i);
                char c = Character.isLetterOrDigit(charAt) ? '*' : charAt;
                String myTag$luggage_wxa_app_input_ext_release = getMyTag$luggage_wxa_app_input_ext_release();
                Log.m105918d(myTag$luggage_wxa_app_input_ext_release, "setText, i: " + i + ", char: " + charAt + ", shownChar: " + c);
                sb.append(c);
            }
            str = sb.toString();
            C87412m.m108593f(str, "StringBuilder().apply(builderAction).toString()");
        } else {
            str = (String) charSequence;
        }
        Log.m105924i("MicroMsg.AppBrand.AppBrandSecureInputWidget", "setText, text: " + charSequence + ", shownText: " + str + ", type: " + bufferType);
        super.setText(str, bufferType);
        try {
            this.f311525w.setText(charSequence, bufferType);
        } catch (NullPointerException unused) {
        }
    }

    /* renamed from: u */
    public void mo148901u() {
        Log.m105918d(getMyTag$luggage_wxa_app_input_ext_release(), "deleteLast");
        dispatchKeyEvent(new KeyEvent(0, 67));
        dispatchKeyEvent(new KeyEvent(1, 67));
    }

    /* renamed from: v */
    public void mo148790v() {
        C104920s0 inputPanel;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145207b(this) && (inputPanel = getInputPanel()) != null) {
            inputPanel.setInputWidget(this);
        }
    }

    public C104920s0 getInputPanel() {
        C104920s0 a = C104920s0.f311539n.mo148914a(this);
        String myTag$luggage_wxa_app_input_ext_release = getMyTag$luggage_wxa_app_input_ext_release();
        Log.m105918d(myTag$luggage_wxa_app_input_ext_release, "getInputPanel, keyboardPanel: " + a);
        return a;
    }
}
