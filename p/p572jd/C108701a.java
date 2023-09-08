package p572jd;

import android.content.Context;
import android.text.Editable;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104857d2;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104920s0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104930w0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tenpay.miniapp.MiniAppSecureEditText;
import go3.C87283v;
import gy3.C87412m;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;
import rt0.C110653f;

/* renamed from: jd.a */
public final class C108701a extends C104930w0 {

    /* renamed from: A */
    public C110653f f325541A;

    /* renamed from: v */
    public final InputConnection f325542v;

    /* renamed from: w */
    public final MiniAppSecureEditText f325543w;

    /* renamed from: x */
    public C108704c f325544x;

    /* renamed from: y */
    public String f325545y;

    /* renamed from: z */
    public String f325546z;

    /* renamed from: jd.a$a */
    public static final class C108702a implements MiniAppSecureEditText.OnPasswdInputListener {

        /* renamed from: a */
        public final /* synthetic */ C108701a f325547a;

        public C108702a(C108701a aVar) {
            this.f325547a = aVar;
        }

        public final void onDone() {
            Log.m105918d("MicroMsg.DelegateEditText", "onDone#secureInputWidgetLogic");
            C108704c listener = this.f325547a.getListener();
            if (listener != null) {
                listener.mo159728a();
            }
        }
    }

    /* renamed from: jd.a$b */
    public static final class C108703b extends C87283v {
        public void afterTextChanged(Editable editable) {
        }
    }

    /* renamed from: jd.a$c */
    public interface C108704c {
        /* renamed from: a */
        void mo159728a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108701a(Context context, InputConnection inputConnection) {
        super(context);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(inputConnection, "sameLayerInputConnection");
        this.f325542v = inputConnection;
        MiniAppSecureEditText miniAppSecureEditText = new MiniAppSecureEditText(context);
        this.f325543w = miniAppSecureEditText;
        setImeOptions(1);
        new C104857d2(this);
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart >= 0 && selectionEnd >= 0 && selectionStart <= selectionEnd) {
            try {
                miniAppSecureEditText.setSelection(selectionStart, selectionEnd);
            } catch (Exception unused) {
            }
        }
        miniAppSecureEditText.setOnPasswdInputListener(new C108702a(this));
        miniAppSecureEditText.addTextChangedListener(new C108703b());
    }

    /* renamed from: C */
    public void mo148888C(char c) {
        char c2 = Character.isLetterOrDigit(c) ? '*' : c;
        Log.m105918d("MicroMsg.DelegateEditText", "saveLastKeyPressed, code: " + c + ", savedCode: " + c2);
        this.f311569u = c2;
    }

    /* renamed from: D */
    public final boolean mo159718D(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (7 <= keyCode && keyCode < 17) {
            return true;
        }
        int keyCode2 = keyEvent.getKeyCode();
        return 29 <= keyCode2 && keyCode2 < 55;
    }

    /* renamed from: d */
    public boolean mo148800d() {
        Log.m105918d("MicroMsg.DelegateEditText", "supportsAutoFill");
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        KeyEvent keyEvent2 = mo159718D(keyEvent) ? new KeyEvent(keyEvent.getAction(), 155) : keyEvent;
        Log.m105918d("MicroMsg.DelegateEditText", "dispatchKeyEvent, event: " + keyEvent + ", dispatchedKeyEvent: " + keyEvent2);
        if (mo159718D(keyEvent) && keyEvent.getAction() == 0) {
            Editable text = getText();
            if ((text != null ? text.length() : 0) >= getMaxEms()) {
                Log.m105924i("MicroMsg.DelegateEditText", "over max ems, return");
                return false;
            }
        }
        super.dispatchKeyEvent(keyEvent2);
        this.f325543w.requestFocus();
        boolean dispatchKeyEvent = this.f325543w.dispatchKeyEvent(keyEvent);
        this.f325543w.clearFocus();
        InputConnection inputConnection = this.f325542v;
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(keyEvent2);
        }
        return dispatchKeyEvent;
    }

    /* renamed from: g */
    public void mo148804g(C83780d1 d1Var) {
        Log.m105918d("MicroMsg.DelegateEditText", "onDetachedFromPage");
    }

    public final C108704c getListener() {
        return this.f325544x;
    }

    public final Editable getRealText$luggage_xweb_ext_release() {
        return this.f325543w.getText();
    }

    public final MiniAppSecureEditText getSecureInputWidgetLogic$luggage_xweb_ext_release() {
        return this.f325543w;
    }

    /* renamed from: k */
    public void mo148813k(C83780d1 d1Var) {
        Log.m105918d("MicroMsg.DelegateEditText", "onAttachedToPage");
    }

    /* renamed from: o */
    public boolean mo148774o() {
        return false;
    }

    public void onCreateContextMenu(ContextMenu contextMenu) {
        if (contextMenu != null) {
            contextMenu.clearHeader();
        }
    }

    public void onSelectionChanged(int i, int i2) {
        Log.m105924i("MicroMsg.DelegateEditText", "onSelectionChanged, selStart: " + i + ", selEnd: " + i2);
        Editable text = getText();
        int length = text != null ? text.length() : 0;
        Log.m105924i("MicroMsg.DelegateEditText", "onSelectionChangedDisable, sel: " + length);
        if (i == length && i2 == length) {
            super.onSelectionChanged(i, i2);
            post(new C108705b(this, i, i2));
            return;
        }
        setSelection(length, length);
    }

    public boolean onTextContextMenuItem(int i) {
        return true;
    }

    /* renamed from: r */
    public void mo148897r(CharSequence charSequence) {
        Log.m105920e("MicroMsg.DelegateEditText", "appendText, text: " + charSequence);
    }

    public void setInputId(int i) {
        Log.m105918d("MicroMsg.DelegateEditText", "setInputId, id: " + i);
        super.setInputId(i);
    }

    public final void setListener(C108704c cVar) {
        this.f325544x = cVar;
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        String str;
        if (charSequence != null) {
            StringBuilder sb = new StringBuilder();
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                char charAt = charSequence.charAt(i);
                char c = Character.isLetterOrDigit(charAt) ? '*' : charAt;
                Log.m105918d("MicroMsg.DelegateEditText", "setText, i: " + i + ", char: " + charAt + ", shownChar: " + c);
                sb.append(c);
            }
            str = sb.toString();
            C87412m.m108593f(str, "StringBuilder().apply(builderAction).toString()");
        } else {
            str = (String) charSequence;
        }
        Log.m105924i("MicroMsg.DelegateEditText", "setText, text: " + charSequence + ", shownText: " + str + ", type: " + bufferType);
        super.setText(str, bufferType);
        try {
            this.f325543w.setText(charSequence, bufferType);
        } catch (NullPointerException unused) {
        }
        InputConnection inputConnection = this.f325542v;
        if (inputConnection != null) {
            inputConnection.deleteSurroundingText(Integer.MAX_VALUE, Integer.MAX_VALUE);
            inputConnection.commitText(str, 1);
        }
    }

    /* renamed from: u */
    public void mo148901u() {
        Log.m105918d("MicroMsg.DelegateEditText", "deleteLast");
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
        Log.m105918d("MicroMsg.DelegateEditText", "getInputPanel, keyboardPanel: " + a);
        return a;
    }
}
