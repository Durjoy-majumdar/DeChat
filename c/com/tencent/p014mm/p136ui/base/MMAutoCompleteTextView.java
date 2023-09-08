package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76895o;
import nj3.C76896p;
import nj3.C76897q;

/* renamed from: com.tencent.mm.ui.base.MMAutoCompleteTextView */
public class MMAutoCompleteTextView extends AutoCompleteTextView {

    /* renamed from: e */
    public static final /* synthetic */ int f214757e = 0;

    /* renamed from: d */
    public final Drawable f214758d;

    /* renamed from: com.tencent.mm.ui.base.MMAutoCompleteTextView$a */
    public class C73159a implements TextWatcher {

        /* renamed from: d */
        public String f214759d;

        public C73159a(String str) {
            this.f214759d = str;
        }

        public void afterTextChanged(Editable editable) {
            if (editable.toString().endsWith(this.f214759d)) {
                MMAutoCompleteTextView.this.showDropDown();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public MMAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable = getResources().getDrawable(C0966R.C0969drawable.abe);
        this.f214758d = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        mo101634a();
        setOnTouchListener(new C76895o(this));
        addTextChangedListener(new C76896p(this));
        setOnFocusChangeListener(new C76897q(this));
    }

    /* renamed from: a */
    public final void mo101634a() {
        if (getText().toString().equals("") || !isFocused()) {
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], (Drawable) null, getCompoundDrawables()[3]);
        } else {
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.f214758d, getCompoundDrawables()[3]);
        }
    }

    public void setSpilter(String str) {
        if (!Util.isNullOrNil(str)) {
            addTextChangedListener(new C73159a(str));
        }
    }
}
