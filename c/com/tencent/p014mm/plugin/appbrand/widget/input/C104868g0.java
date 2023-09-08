package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.graphics.Rect;
import android.text.InputFilter;
import android.text.method.NumberKeyListener;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.tencent.p014mm.C0966R;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;
import pt0.C110246a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.g0 */
public final class C104868g0 extends C104862f0 implements C110246a {

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.g0$a */
    public class C104869a extends NumberKeyListener {
        public C104869a() {
        }

        public char[] getAcceptedChars() {
            return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.', 'X', 'x', ' '};
        }

        public int getInputType() {
            return (C104868g0.this.f311556e ? 16 : 0) | 2;
        }
    }

    public C104868g0(Context context) {
        super(context);
        setKeyListener(new C104869a());
    }

    public void clearFocus() {
        mo148944x();
    }

    /* renamed from: i */
    public InputConnection mo148821i() {
        return super.onCreateInputConnection(new EditorInfo());
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return null;
    }

    public boolean requestFocus(int i, Rect rect) {
        return mo148945y(i, rect);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        int i = 0;
        if (inputFilterArr == null) {
            inputFilterArr = new InputFilter[0];
        }
        InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
        while (i < inputFilterArr.length) {
            inputFilterArr2[i] = inputFilterArr[i];
            i++;
        }
        inputFilterArr2[i] = new InputFilter.AllCaps();
        super.setFilters(inputFilterArr2);
    }

    public /* bridge */ /* synthetic */ void setGravity(int i) {
        super.setGravity(i);
    }

    public void setPasswordMode(boolean z) {
        mo148943w();
        int inputType = getInputType() | 2;
        setInputType(z ? inputType | 16 : inputType & -17);
        super.setPasswordMode(z);
        mo148918A();
    }

    /* renamed from: v */
    public void mo148790v() {
        C104901n0 inputPanel;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145207b(this) && (inputPanel = getInputPanel()) != null) {
            inputPanel.setInputEditText(this);
        }
    }

    public C104901n0 getInputPanel() {
        int i = C104901n0.f311479o;
        return (C104901n0) getRootView().findViewById(C0966R.C0970id.f5933so);
    }
}
