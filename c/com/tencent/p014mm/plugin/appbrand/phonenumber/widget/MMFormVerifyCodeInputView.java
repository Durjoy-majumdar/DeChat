package com.tencent.p014mm.plugin.appbrand.phonenumber.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import ar0.C67101a;
import ar0.C67102b;
import at0.C103915c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import fy3.C32224a;
import yo3.C79142a;

/* renamed from: com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView */
public class MMFormVerifyCodeInputView extends LinearLayout {

    /* renamed from: d */
    public Context f197153d;

    /* renamed from: e */
    public TextView f197154e;

    /* renamed from: f */
    public EditText f197155f;

    /* renamed from: g */
    public TextView f197156g;

    /* renamed from: h */
    public Button f197157h;

    /* renamed from: i */
    public int f197158i;

    /* renamed from: j */
    public int f197159j;

    /* renamed from: n */
    public int f197160n;

    /* renamed from: o */
    public int f197161o;

    /* renamed from: p */
    public int f197162p;

    /* renamed from: q */
    public int f197163q;

    /* renamed from: r */
    public MTimerHandler f197164r;

    /* renamed from: s */
    public int[] f197165s;

    /* renamed from: t */
    public View.OnFocusChangeListener f197166t;

    /* renamed from: u */
    public View.OnClickListener f197167u;

    public MMFormVerifyCodeInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f197158i = -1;
        this.f197159j = -1;
        this.f197160n = -1;
        this.f197161o = -1;
        this.f197162p = 60;
        this.f197163q = 60;
        this.f197166t = null;
        this.f197167u = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C79142a.f232405d, i, 0);
        this.f197159j = obtainStyledAttributes.getResourceId(1, -1);
        this.f197158i = obtainStyledAttributes.getResourceId(3, -1);
        this.f197160n = obtainStyledAttributes.getResourceId(0, -1);
        this.f197161o = obtainStyledAttributes.getResourceId(2, this.f197161o);
        obtainStyledAttributes.recycle();
        View.inflate(context, this.f197161o, this);
        this.f197153d = context;
    }

    public EditText getContentEditText() {
        return this.f197155f;
    }

    public Editable getText() {
        EditText editText = this.f197155f;
        if (editText != null) {
            return editText.getText();
        }
        Log.m105920e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "contentET is null!");
        return null;
    }

    public TextView getTitleTextView() {
        return this.f197154e;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f197154e = (TextView) findViewById(C0966R.C0970id.knx);
        this.f197155f = (EditText) findViewById(C0966R.C0970id.cd7);
        this.f197156g = (TextView) findViewById(C0966R.C0970id.kls);
        Button button = (Button) findViewById(C0966R.C0970id.jbz);
        this.f197157h = button;
        TextView textView = this.f197154e;
        if (textView == null || this.f197155f == null || this.f197156g == null || button == null) {
            Log.m105929w("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "titleTV : %s, contentET : %s, timerTv: %s, sendSmsBtn: %s", textView, this.f197155f, this.f197156g, button);
        } else {
            int i = this.f197158i;
            if (i != -1) {
                textView.setText(i);
            }
            int i2 = this.f197159j;
            if (i2 != -1) {
                this.f197155f.setHint(i2);
            }
            int i3 = this.f197160n;
            if (i3 != -1) {
                this.f197157h.setText(i3);
            }
        }
        EditText editText = this.f197155f;
        if (editText != null) {
            editText.setOnFocusChangeListener(new C67101a(this));
        }
        Button button2 = this.f197157h;
        if (button2 != null) {
            C103915c.m138604a(button2, (Class<? extends View>) null, (Integer) null, false, (Boolean) null, (Boolean) null, (Integer) null, (C32224a<Boolean>) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf(C0966R.dimen.f3723cd));
            this.f197157h.setOnClickListener(new C67102b(this));
        }
    }

    public void setFocusListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f197166t = onFocusChangeListener;
    }

    public void setHint(String str) {
        EditText editText = this.f197155f;
        if (editText != null) {
            editText.setHint(str);
        } else {
            Log.m105920e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    public void setImeOption(int i) {
        EditText editText = this.f197155f;
        if (editText != null) {
            editText.setImeOptions(i);
        } else {
            Log.m105920e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    public void setInputType(int i) {
        EditText editText = this.f197155f;
        if (editText != null) {
            editText.setInputType(i);
        } else {
            Log.m105920e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    public void setSendSmsBtnClickListener(View.OnClickListener onClickListener) {
        this.f197167u = onClickListener;
    }

    public void setSmsBtnText(int i) {
        Button button = this.f197157h;
        if (button != null) {
            button.setText(i);
        } else {
            Log.m105920e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "sendSmsBtn is null!");
        }
    }

    public void setText(String str) {
        EditText editText = this.f197155f;
        if (editText != null) {
            editText.setText(str);
        } else {
            Log.m105920e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    public void setTitle(String str) {
        TextView textView = this.f197154e;
        if (textView != null) {
            textView.setText(str);
        } else {
            Log.m105920e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "titleTV is null!");
        }
    }

    public void setHint(int i) {
        EditText editText = this.f197155f;
        if (editText != null) {
            editText.setHint(i);
        } else {
            Log.m105920e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    public void setSmsBtnText(String str) {
        Button button = this.f197157h;
        if (button != null) {
            button.setText(str);
        } else {
            Log.m105920e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "sendSmsBtn is null!");
        }
    }

    public void setTitle(int i) {
        TextView textView = this.f197154e;
        if (textView != null) {
            textView.setText(i);
        } else {
            Log.m105920e("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "titleTV is null!");
        }
    }

    public MMFormVerifyCodeInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
