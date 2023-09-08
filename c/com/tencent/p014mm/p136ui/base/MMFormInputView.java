package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85975v4;
import nj3.C76899r;
import wq3.C111847h;
import yo3.C79142a;

/* renamed from: com.tencent.mm.ui.base.MMFormInputView */
public class MMFormInputView extends LinearLayout implements C111847h {

    /* renamed from: d */
    public Context f214790d;

    /* renamed from: e */
    public TextView f214791e;

    /* renamed from: f */
    public EditText f214792f;

    /* renamed from: g */
    public int f214793g;

    /* renamed from: h */
    public int f214794h;

    /* renamed from: i */
    public int f214795i;

    /* renamed from: j */
    public int[] f214796j;

    /* renamed from: n */
    public View.OnFocusChangeListener f214797n;

    public MMFormInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f214793g = -1;
        this.f214794h = -1;
        this.f214795i = -1;
        this.f214797n = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C79142a.f232405d, i, 0);
        this.f214794h = obtainStyledAttributes.getResourceId(1, -1);
        this.f214793g = obtainStyledAttributes.getResourceId(3, -1);
        this.f214795i = obtainStyledAttributes.getResourceId(2, this.f214795i);
        obtainStyledAttributes.recycle();
        View.inflate(context, this.f214795i, this);
        this.f214790d = context;
    }

    /* renamed from: a */
    public void mo101680a(TextWatcher textWatcher) {
        EditText editText;
        if (textWatcher == null || (editText = this.f214792f) == null) {
            C85975v4.m106309f("MicroMsg.MMFormInputView", "watcher : %s, contentET : %s", textWatcher, this.f214792f);
            return;
        }
        editText.addTextChangedListener(textWatcher);
    }

    public EditText getContentEditText() {
        return this.f214792f;
    }

    public Editable getText() {
        EditText editText = this.f214792f;
        if (editText != null) {
            return editText.getText();
        }
        C85975v4.m106305b("MicroMsg.MMFormInputView", "contentET is null!", new Object[0]);
        return null;
    }

    public TextView getTitleTextView() {
        return this.f214791e;
    }

    public void onFinishInflate() {
        this.f214791e = (TextView) findViewById(C0966R.C0970id.knx);
        EditText editText = (EditText) findViewById(C0966R.C0970id.cd7);
        this.f214792f = editText;
        TextView textView = this.f214791e;
        if (textView == null || editText == null) {
            C85975v4.m106309f("MicroMsg.MMFormInputView", "titleTV : %s, contentET : %s", textView, editText);
        } else {
            int i = this.f214793g;
            if (i != -1) {
                textView.setText(i);
            }
            int i2 = this.f214794h;
            if (i2 != -1) {
                this.f214792f.setHint(i2);
            }
        }
        EditText editText2 = this.f214792f;
        if (editText2 != null) {
            editText2.setOnFocusChangeListener(new C76899r(this));
        }
    }

    public void setFocusListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f214797n = onFocusChangeListener;
    }

    public void setHint(String str) {
        EditText editText = this.f214792f;
        if (editText != null) {
            editText.setHint(str);
        } else {
            C85975v4.m106305b("MicroMsg.MMFormInputView", "contentET is null!", new Object[0]);
        }
    }

    public void setImeOption(int i) {
        EditText editText = this.f214792f;
        if (editText != null) {
            editText.setImeOptions(i);
        } else {
            C85975v4.m106305b("MicroMsg.MMFormInputView", "contentET is null!", new Object[0]);
        }
    }

    public void setInputType(int i) {
        EditText editText = this.f214792f;
        if (editText != null) {
            editText.setInputType(i);
        } else {
            C85975v4.m106305b("MicroMsg.MMFormInputView", "contentET is null!", new Object[0]);
        }
    }

    public void setText(String str) {
        EditText editText = this.f214792f;
        if (editText != null) {
            editText.setText(str);
        } else {
            C85975v4.m106305b("MicroMsg.MMFormInputView", "contentET is null!", new Object[0]);
        }
    }

    public void setTitle(String str) {
        TextView textView = this.f214791e;
        if (textView != null) {
            textView.setText(str);
        } else {
            C85975v4.m106305b("MicroMsg.MMFormInputView", "titleTV is null!", new Object[0]);
        }
    }

    public void setHint(int i) {
        EditText editText = this.f214792f;
        if (editText != null) {
            editText.setHint(i);
        } else {
            C85975v4.m106305b("MicroMsg.MMFormInputView", "contentET is null!", new Object[0]);
        }
    }

    public void setTitle(int i) {
        TextView textView = this.f214791e;
        if (textView != null) {
            textView.setText(i);
        } else {
            C85975v4.m106305b("MicroMsg.MMFormInputView", "titleTV is null!", new Object[0]);
        }
    }

    public MMFormInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
