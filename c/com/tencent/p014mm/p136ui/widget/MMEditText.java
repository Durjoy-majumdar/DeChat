package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import cj3.C67383b;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.p136ui.C85975v4;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.p136ui.widget.edittext.PasterEditText;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72808m;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72836v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Arrays;
import ko3.C76621b;
import p206nj.C11171e;
import ro3.C110587i;
import ro3.C110588j;
import ro3.C77558f;
import vl3.C102226d;

/* renamed from: com.tencent.mm.ui.widget.MMEditText */
public class MMEditText extends PasterEditText implements C74974a, InputFilter {

    /* renamed from: D */
    public static final /* synthetic */ int f220378D = 0;

    /* renamed from: A */
    public C74951e f220379A;

    /* renamed from: B */
    public C110588j f220380B;

    /* renamed from: C */
    public C77558f f220381C = null;

    /* renamed from: s */
    public InputConnection f220382s;

    /* renamed from: t */
    public boolean f220383t = false;

    /* renamed from: u */
    public C74974a.C74975a f220384u;

    /* renamed from: v */
    public C74974a.C74977c f220385v;

    /* renamed from: w */
    public boolean f220386w = true;

    /* renamed from: x */
    public int f220387x = 0;

    /* renamed from: y */
    public boolean f220388y = false;

    /* renamed from: z */
    public C74949b f220389z;

    /* renamed from: com.tencent.mm.ui.widget.MMEditText$d */
    public static class C7040d implements TextWatcher {

        /* renamed from: d */
        public EditText f24820d;

        /* renamed from: e */
        public TextView f24821e;

        /* renamed from: f */
        public final int f24822f;

        /* renamed from: g */
        public boolean f24823g = false;

        public C7040d(EditText editText, TextView textView, int i) {
            this.f24820d = editText;
            this.f24821e = textView;
            this.f24822f = i;
        }

        public void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            int i = 0;
            String str = "";
            int i2 = 0;
            for (int i3 = 0; i3 < obj.length(); i3++) {
                i2 = Util.isChinese(obj.charAt(i3)) ? i2 + 2 : i2 + 1;
                if (i2 > this.f24822f) {
                    break;
                }
                str = str + obj.charAt(i3);
            }
            if (i2 > this.f24822f) {
                try {
                    this.f24820d.setText(str);
                    if (!this.f24823g) {
                        this.f24820d.setSelection(this.f24820d.getText().toString().length());
                    } else {
                        this.f24820d.setSelection(0);
                    }
                    this.f24823g = false;
                } catch (Exception e) {
                    this.f24823g = true;
                    Log.m105920e("MicroMsg.MMEditText", "error " + e.getMessage());
                    this.f24820d.setText(str);
                    this.f24820d.setSelection(0);
                }
            }
            int i4 = this.f24822f - i2;
            if (i4 >= 0) {
                i = i4;
            }
            TextView textView = this.f24821e;
            if (textView != null) {
                textView.setText("" + (i / 2));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.MMEditText$a */
    public class C74948a implements TextView.OnEditorActionListener {

        /* renamed from: d */
        public final /* synthetic */ C74974a.C74976b f220390d;

        public C74948a(MMEditText mMEditText, C74974a.C74976b bVar) {
            this.f220390d = bVar;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (textView instanceof C74974a) {
                return this.f220390d.mo93502a((C74974a) textView, i, keyEvent);
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.MMEditText$b */
    public interface C74949b {
        /* renamed from: a */
        void mo65425a();
    }

    /* renamed from: com.tencent.mm.ui.widget.MMEditText$c */
    public interface C74950c {
    }

    /* renamed from: com.tencent.mm.ui.widget.MMEditText$e */
    public interface C74951e {
    }

    public MMEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo104239a(boolean z) {
    }

    /* renamed from: b */
    public void mo104240b() {
        C110588j jVar = this.f220380B;
        if (jVar != null) {
            jVar.mo148755a();
        }
    }

    /* renamed from: c */
    public void mo104241c() {
        requestLayout();
    }

    /* renamed from: d */
    public void mo104242d(C77558f fVar) {
        this.f220381C = fVar;
    }

    public void destroy() {
        C110588j jVar = this.f220380B;
        if (jVar != null) {
            jVar.mo162134b();
        }
    }

    /* renamed from: e */
    public void mo104244e(String str, String str2, C110588j.C110590c cVar, C110588j.C77559a.C77560a aVar) {
        C110588j.C77559a aVar2 = new C110588j.C77559a(this);
        aVar2.f226122g = str;
        aVar2.f226121f = str2;
        if (aVar != null) {
            aVar.mo97976a(aVar2);
        }
        C110588j jVar = new C110588j(aVar2);
        this.f220380B = jVar;
        jVar.f330844s = cVar;
    }

    /* renamed from: f */
    public void mo104245f(boolean z) {
        C110588j jVar = this.f220380B;
        if (jVar == null) {
            return;
        }
        if (!z) {
            jVar.f330817R = true;
            jVar.mo148755a();
            return;
        }
        jVar.mo148755a();
        jVar.f330817R = false;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (!this.f220386w || !(charSequence instanceof String)) {
            return null;
        }
        return ((String) charSequence).replaceAll(APLogFileUtil.SEPARATOR_LINE, "\n").replaceAll("\r", "\n");
    }

    /* renamed from: g */
    public void mo104247g() {
        C110588j jVar = this.f220380B;
        if (jVar != null) {
            jVar.mo148755a();
        }
    }

    public InputConnection getInputConnection() {
        return this.f220382s;
    }

    public C110588j getSelectHelper() {
        return this.f220380B;
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
        return false;
    }

    /* renamed from: j */
    public ViewParent mo104253j() {
        return getParent();
    }

    /* renamed from: k */
    public void mo104254k(C74974a.C74976b bVar) {
        if (bVar != null) {
            setOnEditorActionListener(new C74948a(this, bVar));
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
        Log.m105919d("MicroMsg.MMEditText", "exceed :%s, %s", Integer.valueOf(i), Integer.valueOf(length));
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null) {
            this.f220382s = new C110587i(onCreateInputConnection);
        } else {
            this.f220382s = onCreateInputConnection;
        }
        if (this.f220382s != null && this.f220383t) {
            editorInfo.imeOptions &= -1073741825;
            editorInfo.inputType &= -131073;
        }
        if (editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putInt("SUPPORT_SOGOU_EXPRESSION", 1);
        }
        return this.f220382s;
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(this.f220389z == null);
        objArr[1] = Integer.valueOf(i);
        Log.m105927v("MicroMsg.MMEditText", "on onKeyPreIme, listener null ? %B keycode:%s", objArr);
        if (this.f220389z != null && i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Log.m105926v("MicroMsg.MMEditText", "on onKeyPreIme action down");
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1) {
                Log.m105926v("MicroMsg.MMEditText", "on onKeyPreIme action up");
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    Log.m105926v("MicroMsg.MMEditText", "on onKeyPreIme action up is tracking");
                    this.f220389z.mo65425a();
                    InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                    }
                    return true;
                }
            }
        }
        C74951e eVar = this.f220379A;
        if (eVar == null || !((C72836v) eVar).mo100676a(i, keyEvent)) {
            return super.onKeyPreIme(i, keyEvent);
        }
        return true;
    }

    public void onPause() {
        C110588j jVar = this.f220380B;
        if (jVar != null) {
            jVar.mo148755a();
        }
    }

    public boolean onPrivateIMECommand(String str, Bundle bundle) {
        if (C76621b.m92255a(str, bundle, this.f220384u)) {
            return true;
        }
        C77558f fVar = this.f220381C;
        return fVar != null ? ((C72808m) fVar).mo100632a(str, bundle) : super.onPrivateIMECommand(str, bundle);
    }

    public void onSelectionChanged(int i, int i2) {
        int i3;
        int i4;
        super.onSelectionChanged(i, i2);
        if (this.f220385v != null && !this.f220388y) {
            Layout layout = getLayout();
            int i5 = -1;
            if (layout == null || layout.getLineCount() < 0) {
                i4 = -1;
                i3 = -1;
            } else {
                i5 = layout.getLineForOffset(i);
                i4 = layout.getLineTop(i5);
                i3 = layout.getLineBottom(i5);
            }
            Log.m105919d("MicroMsg.MMEditText", "onSelectionChanged: selStart:%d, selEnd:%d, line:%d, lineTop:%d, lineBottom:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3));
            this.f220385v.mo71794a(i, i2, layout);
        }
    }

    public boolean onTextContextMenuItem(int i) {
        boolean z;
        try {
            z = super.onTextContextMenuItem(i);
        } catch (IndexOutOfBoundsException e) {
            Log.m105921e("MicroMsg.MMEditText", "!!MMEditText IndexOutOfBoundsException %s", e);
            z = false;
        } catch (NullPointerException e2) {
            Log.m105921e("MicroMsg.MMEditText", "!!MMEditText NullPointerException %s", e2);
            return false;
        }
        if (i == 16908322) {
            this.f220387x = 0;
            String obj = getText().toString();
            try {
                mo104212q(obj);
            } catch (IndexOutOfBoundsException e3) {
                Log.m105921e("MicroMsg.MMEditText", "!!MMEditText Exception %d", Integer.valueOf(this.f220387x));
                if (this.f220387x < 3) {
                    this.f220387x++;
                    mo104212q(" " + obj);
                } else {
                    throw e3;
                }
            }
        }
        return z;
    }

    public boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: q */
    public void mo104212q(String str) {
        this.f220388y = true;
        int selectionStart = getSelectionStart();
        setText(C102226d.m134696a(getContext(), str));
        int length = getText().length() - str.length();
        if (length > 0) {
            int i = selectionStart + length;
            if (i <= getText().length()) {
                setSelection(i);
            }
        } else {
            setSelection(selectionStart);
        }
        this.f220388y = false;
    }

    /* renamed from: r */
    public void mo104263r() {
        if (getInputConnection() != null) {
            getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
            getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
            return;
        }
        dispatchKeyEvent(new KeyEvent(0, 67));
        dispatchKeyEvent(new KeyEvent(1, 67));
    }

    public boolean requestFocus(int i, Rect rect) {
        try {
            return super.requestFocus(i, rect);
        } catch (IllegalStateException e) {
            Log.m105921e("MicroMsg.MMEditText", "[requestFocus] error:%s", e);
            return false;
        }
    }

    public void setAutoCompactLineBreak(boolean z) {
        this.f220386w = z;
    }

    public void setBackListener(C74949b bVar) {
        this.f220389z = bVar;
    }

    public void setEnableSendBtn(boolean z) {
        this.f220383t = z;
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        InputFilter[] inputFilterArr2;
        try {
            boolean z = false;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this) {
                    z = true;
                }
            }
            if (z) {
                inputFilterArr2 = inputFilterArr;
            } else {
                ArrayList arrayList = new ArrayList(Arrays.asList(inputFilterArr));
                arrayList.add(this);
                inputFilterArr2 = (InputFilter[]) arrayList.toArray(new InputFilter[0]);
            }
            super.setFilters(inputFilterArr2);
        } catch (Throwable th) {
            C85975v4.m106307d("MicroMsg.MMEditText", th, "set Filters err", new Object[0]);
            super.setFilters(inputFilterArr);
        }
    }

    public void setImeSendImageCallback(C74974a.C74975a aVar) {
        this.f220384u = aVar;
    }

    public void setKeyCodeEnterListener(C74951e eVar) {
        this.f220379A = eVar;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (this.f220380B == null || onClickListener == null || onClickListener.getClass().getName().contains("SelectableEditTextHelper")) {
            super.setOnClickListener(onClickListener);
        } else {
            this.f220380B.f330843r = onClickListener;
        }
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        if (this.f220380B == null || onFocusChangeListener == null || onFocusChangeListener.getClass().getName().contains("SelectableEditTextHelper")) {
            super.setOnFocusChangeListener(onFocusChangeListener);
        } else {
            this.f220380B.f330842q = onFocusChangeListener;
        }
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        if (this.f220380B == null || onLongClickListener == null || onLongClickListener.getClass().getName().contains("SelectableEditTextHelper")) {
            super.setOnLongClickListener(onLongClickListener);
        } else {
            this.f220380B.f330840o = onLongClickListener;
        }
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        if (this.f220380B == null || onTouchListener == null || onTouchListener.getClass().getName().contains("SelectableEditTextHelper")) {
            super.setOnTouchListener(onTouchListener);
        } else {
            this.f220380B.f330841p = onTouchListener;
        }
    }

    public void setPasterLen(int i) {
    }

    public void setSelection(int i) {
        try {
            super.setSelection(i);
        } catch (IndexOutOfBoundsException e) {
            Log.printErrStackTrace("MicroMsg.MMEditText", e, "IndexOutOfBoundsExceptionindex = " + i, new Object[0]);
        }
    }

    public void setSelectionChangedListener(C74974a.C74977c cVar) {
        this.f220385v = cVar;
    }

    public View view() {
        return this;
    }

    public void setSelection(int i, int i2) {
        super.setSelection(i, i2);
    }

    public MMEditText(Context context) {
        super(context);
    }

    public MMEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
