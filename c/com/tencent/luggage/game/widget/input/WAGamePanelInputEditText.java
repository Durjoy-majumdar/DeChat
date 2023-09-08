package com.tencent.luggage.game.widget.input;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104936z0;
import com.tencent.p014mm.pointers.PInt;
import mt0.C88844a;
import mt0.C88846b;
import ot0.C110064b;
import p224ra.C89909e;

public class WAGamePanelInputEditText extends EditText {

    /* renamed from: d */
    public final C104936z0 f234791d;

    /* renamed from: e */
    public final InputFilter f234792e;

    /* renamed from: f */
    public int f234793f;

    /* renamed from: g */
    public final Spannable.Factory f234794g;

    /* renamed from: com.tencent.luggage.game.widget.input.WAGamePanelInputEditText$a */
    public class C80220a extends Editable.Factory {
        public C80220a() {
        }

        public Editable newEditable(CharSequence charSequence) {
            WAGamePanelInputEditText wAGamePanelInputEditText = WAGamePanelInputEditText.this;
            C104936z0 z0Var = wAGamePanelInputEditText.f234791d;
            Editable editable = (Editable) WAGamePanelInputEditText.m97599a(wAGamePanelInputEditText, super.newEditable(charSequence));
            z0Var.mo148956a(editable);
            return editable;
        }
    }

    /* renamed from: com.tencent.luggage.game.widget.input.WAGamePanelInputEditText$b */
    public class C80221b implements InputFilter {
        public C80221b() {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (TextUtils.isEmpty(charSequence)) {
                return null;
            }
            return WAGamePanelInputEditText.m97599a(WAGamePanelInputEditText.this, charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableStringBuilder(charSequence.subSequence(i, i2)));
        }
    }

    /* renamed from: com.tencent.luggage.game.widget.input.WAGamePanelInputEditText$c */
    public class C80222c extends Spannable.Factory {
        public C80222c(WAGamePanelInputEditText wAGamePanelInputEditText) {
        }

        public Spannable newSpannable(CharSequence charSequence) {
            return new SpannableStringBuilder(charSequence);
        }
    }

    public WAGamePanelInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2794kn);
    }

    /* renamed from: a */
    public static Spannable m97599a(WAGamePanelInputEditText wAGamePanelInputEditText, Spannable spannable) {
        wAGamePanelInputEditText.getClass();
        PInt pInt = new PInt();
        pInt.value = wAGamePanelInputEditText.f234793f;
        C88846b bVar = (C88846b) C89909e.m112436a(C88846b.class);
        if (bVar == null) {
            bVar = C88844a.f256275a;
        }
        return bVar.qu0(wAGamePanelInputEditText.getContext(), spannable, Math.round(wAGamePanelInputEditText.getTextSize()), pInt, wAGamePanelInputEditText.f234794g);
    }

    public int getMaxLength() {
        return this.f234793f;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo.imeOptions |= 268435456;
        return onCreateInputConnection;
    }

    public void setComposingDismissedListener(C110064b bVar) {
        this.f234791d.f311583f = bVar;
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        if (this.f234792e != null) {
            int i = 0;
            if (inputFilterArr == null) {
                inputFilterArr = new InputFilter[0];
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            while (i < inputFilterArr.length) {
                inputFilterArr2[i] = inputFilterArr[i];
                i++;
            }
            inputFilterArr2[i] = this.f234792e;
            inputFilterArr = inputFilterArr2;
        }
        super.setFilters(inputFilterArr);
    }

    public void setMaxLength(int i) {
        this.f234793f = i;
    }

    public void setSingleLine(boolean z) {
        int maxHeight = getMaxHeight();
        super.setSingleLine(z);
        if (maxHeight > 0) {
            setMaxHeight(maxHeight);
        }
    }

    public WAGamePanelInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C80221b bVar = new C80221b();
        this.f234792e = bVar;
        this.f234793f = Integer.MAX_VALUE;
        this.f234794g = new C80222c(this);
        this.f234791d = new C104936z0(this);
        super.setEditableFactory(new C80220a());
        super.setFilters(new InputFilter[]{bVar});
    }
}
