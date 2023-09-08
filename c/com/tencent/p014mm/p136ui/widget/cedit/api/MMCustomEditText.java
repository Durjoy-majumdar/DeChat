package com.tencent.p014mm.p136ui.widget.cedit.api;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import cj3.C67383b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72808m;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72836v;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import jo3.C76429a;
import jo3.C76430b;
import jo3.C76432d;
import ko3.C76621b;
import p206nj.C11171e;
import ro3.C110588j;
import ro3.C77558f;
import vl3.C102226d;

/* renamed from: com.tencent.mm.ui.widget.cedit.api.MMCustomEditText */
public class MMCustomEditText extends PasterEditTextCompact implements C74974a {

    /* renamed from: l2 */
    public static final String f220511l2 = "^[\\u0001-\\u00b7\\u4E00-\\u9FA5\\ue001-\\ue537\\u2005-\\u2027\\u3001-\\u3011\\uff01-\\uffe5\\u2100-\\u2900[\\ud83c\\udc00-\\ud83c\\udfff]|[\\ud83d\\udc00-\\ud83d\\udfff]]+$".substring(1, 149);

    /* renamed from: c2 */
    public InputConnection f220512c2;

    /* renamed from: d2 */
    public boolean f220513d2;

    /* renamed from: e2 */
    public boolean f220514e2;

    /* renamed from: f2 */
    public C74974a.C74975a f220515f2;

    /* renamed from: g2 */
    public int f220516g2;

    /* renamed from: h2 */
    public MMEditText.C74949b f220517h2;

    /* renamed from: i2 */
    public MMEditText.C74951e f220518i2;

    /* renamed from: j2 */
    public C76429a f220519j2;

    /* renamed from: k2 */
    public C77558f f220520k2;

    /* renamed from: com.tencent.mm.ui.widget.cedit.api.MMCustomEditText$a */
    public class C74973a implements CustomTextView.C74978g {

        /* renamed from: a */
        public final /* synthetic */ C74974a.C74976b f220521a;

        public C74973a(MMCustomEditText mMCustomEditText, C74974a.C74976b bVar) {
            this.f220521a = bVar;
        }
    }

    public MMCustomEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f220513d2 = false;
        this.f220514e2 = false;
        this.f220516g2 = 0;
        this.f220520k2 = null;
        this.f220519j2 = new C76432d(this);
    }

    private String getFilterText() {
        Editable text = getText();
        return text == null ? "" : text.toString().replaceAll(f220511l2, "*");
    }

    /* renamed from: M */
    public void mo104412M(Context context, AttributeSet attributeSet, int i, int i2) {
        try {
            super.mo104412M(context, attributeSet, i, i2);
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.MMCustomEditText", "init crash:%s", Util.stackTraceToString(th));
            C76430b.m91852a(0);
            this.f220514e2 = true;
        }
    }

    /* renamed from: Z */
    public boolean mo104413Z(String str, Bundle bundle) {
        if (C76621b.m92255a(str, bundle, this.f220515f2)) {
            return true;
        }
        C77558f fVar = this.f220520k2;
        if (fVar != null) {
            return ((C72808m) fVar).mo100632a(str, bundle);
        }
        return false;
    }

    /* renamed from: a */
    public void mo104239a(boolean z) {
    }

    /* renamed from: a0 */
    public void mo104414a0(int i, int i2) {
        super.mo104414a0(i, i2);
    }

    /* renamed from: b */
    public void mo104240b() {
    }

    /* renamed from: b0 */
    public boolean mo97951b0(int i) {
        boolean z;
        try {
            z = super.mo97951b0(i);
        } catch (IndexOutOfBoundsException e) {
            Log.m105921e("MicroMsg.MMCustomEditText", "!!MMEditText IndexOutOfBoundsException %s", e);
            z = false;
        } catch (NullPointerException e2) {
            Log.m105921e("MicroMsg.MMCustomEditText", "!!MMEditText NullPointerException %s", e2);
            return false;
        }
        if (i == 16908322) {
            this.f220516g2 = 0;
            String obj = getText().toString();
            try {
                mo104424y0(obj);
            } catch (IndexOutOfBoundsException e3) {
                Log.m105921e("MicroMsg.MMCustomEditText", "!!MMEditText Exception %d", Integer.valueOf(this.f220516g2));
                if (this.f220516g2 < 3) {
                    this.f220516g2++;
                    mo104424y0(" " + obj);
                } else {
                    throw e3;
                }
            }
        }
        return z;
    }

    /* renamed from: c */
    public void mo104241c() {
        requestLayout();
    }

    /* renamed from: d */
    public void mo104242d(C77558f fVar) {
        this.f220520k2 = fVar;
    }

    public void destroy() {
    }

    /* renamed from: e */
    public void mo104244e(String str, String str2, C110588j.C110590c cVar, C110588j.C77559a.C77560a aVar) {
        setHighlightColor(getContext().getResources().getColor(C0966R.color.aak));
        setMenuCallback(cVar);
    }

    /* renamed from: f */
    public void mo104245f(boolean z) {
    }

    /* renamed from: g */
    public void mo104247g() {
    }

    public InputConnection getInputConnection() {
        return this.f220512c2;
    }

    public C110588j getSelectHelper() {
        return null;
    }

    public C67383b getSizeAnimController() {
        int i = C67383b.f193261a;
        return C67383b.C67384a.f193262a;
    }

    /* renamed from: h */
    public Context mo104251h() {
        return getContext();
    }

    /* renamed from: i */
    public boolean mo104252i() {
        return this.f220514e2;
    }

    /* renamed from: j */
    public ViewParent mo104253j() {
        return getParent();
    }

    /* renamed from: k */
    public void mo104254k(C74974a.C74976b bVar) {
        if (bVar != null) {
            setOnEditorActionListener(new C74973a(this, bVar));
        }
    }

    /* renamed from: l */
    public int mo104255l() {
        return getWidth();
    }

    /* renamed from: m */
    public boolean mo104256m() {
        return requestFocus();
    }

    /* renamed from: n */
    public View mo104257n() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger() == false) goto L_0x004a;
     */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo104415n0(java.lang.CharSequence r4, android.widget.TextView.BufferType r5, boolean r6, int r7) {
        /*
            r3 = this;
            super.mo104415n0(r4, r5, r6, r7)     // Catch:{ all -> 0x0004 }
            goto L_0x004c
        L_0x0004:
            r4 = move-exception
            java.lang.String r5 = r3.getFilterText()
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            r6[r7] = r5
            r0 = 1
            r6[r0] = r4
            java.lang.String r1 = "MicroMsg.MMCustomEditText"
            java.lang.String r2 = "[setText] text:%s, e:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r6)
            jo3.a r6 = r3.f220519j2
            if (r6 == 0) goto L_0x0026
            jo3.a r6 = r3.f220519j2
            jo3.d r6 = (jo3.C76432d) r6
            java.lang.String r1 = "setText"
            r6.mo106649a(r4, r5, r1)
        L_0x0026:
            r5 = 3
            jo3.C76430b.m91852a(r5)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r5 != 0) goto L_0x0049
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r5 != 0) goto L_0x0040
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r5 != 0) goto L_0x0040
            int r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
            r6 = 788529167(0x2f00000f, float:1.1641553E-10)
            if (r5 != r6) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r5 = 0
            goto L_0x0041
        L_0x0040:
            r5 = 1
        L_0x0041:
            if (r5 != 0) goto L_0x0049
            boolean r5 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r5 == 0) goto L_0x004a
        L_0x0049:
            r7 = 1
        L_0x004a:
            if (r7 != 0) goto L_0x004d
        L_0x004c:
            return
        L_0x004d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.api.MMCustomEditText.mo104415n0(java.lang.CharSequence, android.widget.TextView$BufferType, boolean, int):void");
    }

    /* renamed from: o */
    public void mo98046o(String str) {
        InputFilter[] filters;
        int b = C102226d.m134697b(getContext(), getText().toString(), getSelectionStart());
        int b2 = C102226d.m134697b(getContext(), getText().toString(), getSelectionEnd());
        StringBuffer stringBuffer = new StringBuffer(getText());
        String str2 = stringBuffer.substring(0, b) + str + stringBuffer.substring(b2, stringBuffer.length());
        int i = -1;
        if (C11171e.m11046c(21) && (filters = getFilters()) != null) {
            for (InputFilter inputFilter : filters) {
                if (inputFilter instanceof InputFilter.LengthFilter) {
                    i = ((InputFilter.LengthFilter) inputFilter).getMax();
                }
            }
        }
        int length = b + str.length();
        if (i <= 0 || length <= i) {
            setText(C102226d.m134696a(getContext(), str2));
            setSelection(length);
            return;
        }
        Log.m105919d("MicroMsg.MMCustomEditText", "exceed :%s, %s", Integer.valueOf(i), Integer.valueOf(length));
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f220512c2 = onCreateInputConnection;
        if (onCreateInputConnection != null && this.f220513d2) {
            editorInfo.imeOptions &= -1073741825;
            editorInfo.inputType &= -131073;
        }
        if (editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putInt("SUPPORT_SOGOU_EXPRESSION", 1);
        }
        return this.f220512c2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger() == false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            super.onDraw(r8)     // Catch:{ all -> 0x0004 }
            goto L_0x004b
        L_0x0004:
            r8 = move-exception
            java.lang.String r0 = r7.getFilterText()
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r0
            r4 = 1
            r2[r4] = r8
            java.lang.String r5 = "MicroMsg.MMCustomEditText"
            java.lang.String r6 = "[onDraw] text:%s, e:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r6, r2)
            jo3.a r2 = r7.f220519j2
            if (r2 == 0) goto L_0x0026
            jo3.a r2 = r7.f220519j2
            jo3.d r2 = (jo3.C76432d) r2
            java.lang.String r5 = "onDraw"
            r2.mo106649a(r8, r0, r5)
        L_0x0026:
            jo3.C76430b.m91852a(r1)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 != 0) goto L_0x0048
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r0 != 0) goto L_0x003f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r0 != 0) goto L_0x003f
            int r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
            r1 = 788529167(0x2f00000f, float:1.1641553E-10)
            if (r0 != r1) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r0 = 0
            goto L_0x0040
        L_0x003f:
            r0 = 1
        L_0x0040:
            if (r0 != 0) goto L_0x0048
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r0 == 0) goto L_0x0049
        L_0x0048:
            r3 = 1
        L_0x0049:
            if (r3 != 0) goto L_0x004c
        L_0x004b:
            return
        L_0x004c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.api.MMCustomEditText.onDraw(android.graphics.Canvas):void");
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(this.f220517h2 == null);
        objArr[1] = Integer.valueOf(i);
        Log.m105927v("MicroMsg.MMCustomEditText", "on onKeyPreIme, listener null ? %B keycode:%s", objArr);
        if (this.f220517h2 != null && i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Log.m105926v("MicroMsg.MMCustomEditText", "on onKeyPreIme action down");
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1) {
                Log.m105926v("MicroMsg.MMCustomEditText", "on onKeyPreIme action up");
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    Log.m105926v("MicroMsg.MMCustomEditText", "on onKeyPreIme action up is tracking");
                    this.f220517h2.mo65425a();
                    InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                    }
                    return true;
                }
            }
        }
        MMEditText.C74951e eVar = this.f220518i2;
        if (eVar == null || !((C72836v) eVar).mo100676a(i, keyEvent)) {
            return super.onKeyPreIme(i, keyEvent);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger() == false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            super.onMeasure(r6, r7)     // Catch:{ all -> 0x0004 }
            goto L_0x004b
        L_0x0004:
            r6 = move-exception
            java.lang.String r7 = r5.getFilterText()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r7
            r2 = 1
            r0[r2] = r6
            java.lang.String r3 = "MicroMsg.MMCustomEditText"
            java.lang.String r4 = "[onMeasure] text:%s, e:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r0)
            jo3.a r0 = r5.f220519j2
            if (r0 == 0) goto L_0x0026
            jo3.a r0 = r5.f220519j2
            jo3.d r0 = (jo3.C76432d) r0
            java.lang.String r3 = "onMeasure"
            r0.mo106649a(r6, r7, r3)
        L_0x0026:
            jo3.C76430b.m91852a(r2)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r7 != 0) goto L_0x0048
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r7 != 0) goto L_0x003f
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r7 != 0) goto L_0x003f
            int r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
            r0 = 788529167(0x2f00000f, float:1.1641553E-10)
            if (r7 != r0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r7 = 0
            goto L_0x0040
        L_0x003f:
            r7 = 1
        L_0x0040:
            if (r7 != 0) goto L_0x0048
            boolean r7 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r7 == 0) goto L_0x0049
        L_0x0048:
            r1 = 1
        L_0x0049:
            if (r1 != 0) goto L_0x004c
        L_0x004b:
            return
        L_0x004c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.api.MMCustomEditText.onMeasure(int, int):void");
    }

    public void onPause() {
    }

    public boolean onPreDraw() {
        try {
            super.onPreDraw();
            return true;
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.MMCustomEditText", "onPreDraw err:%s", Util.stackTraceToString(th));
            C76430b.m91852a(8);
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            String filterText = getFilterText();
            boolean z = true;
            Log.m105921e("MicroMsg.MMCustomEditText", "[onTouchEvent] text:%s, e:%s", filterText, th);
            if (this.f220519j2 != null) {
                ((C76432d) this.f220519j2).mo106649a(th, filterText, "onTouchEvent");
            }
            C76430b.m91852a(4);
            if (!BuildInfo.DEBUG) {
                if (!(BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED || BuildInfo.CLIENT_VERSION_INT == 788529167) && !WeChatEnvironment.hasDebugger()) {
                    z = false;
                }
            }
            if (!z) {
                return false;
            }
            throw th;
        }
    }

    public boolean requestFocus(int i, Rect rect) {
        try {
            return super.requestFocus(i, rect);
        } catch (IllegalStateException e) {
            Log.m105921e("MicroMsg.MMCustomEditText", "[requestFocus] error:%s", e);
            return false;
        }
    }

    public void setBackListener(MMEditText.C74949b bVar) {
        this.f220517h2 = bVar;
    }

    public void setEditCrashListener(C76429a aVar) {
        this.f220519j2 = aVar;
    }

    public void setEnableSendBtn(boolean z) {
        this.f220513d2 = z;
    }

    public void setImeSendImageCallback(C74974a.C74975a aVar) {
        this.f220515f2 = aVar;
    }

    public void setKeyCodeEnterListener(MMEditText.C74951e eVar) {
        this.f220518i2 = eVar;
    }

    public void setPasterLen(int i) {
    }

    public void setSelection(int i) {
        try {
            super.setSelection(i);
        } catch (IndexOutOfBoundsException e) {
            Log.printErrStackTrace("MicroMsg.MMCustomEditText", e, "IndexOutOfBoundsExceptionindex = " + i, new Object[0]);
        }
    }

    public void setSelectionChangedListener(C74974a.C74977c cVar) {
    }

    public View view() {
        return this;
    }

    /* renamed from: y0 */
    public void mo104424y0(String str) {
        int selectionStart = getSelectionStart();
        setText(C102226d.m134696a(getContext(), str));
        int length = getText().length() - str.length();
        if (length > 0) {
            int i = selectionStart + length;
            if (i <= getText().length()) {
                setSelection(i);
                return;
            }
            return;
        }
        setSelection(selectionStart);
    }

    public MMCustomEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f220513d2 = false;
        this.f220514e2 = false;
        this.f220516g2 = 0;
        this.f220520k2 = null;
    }
}
