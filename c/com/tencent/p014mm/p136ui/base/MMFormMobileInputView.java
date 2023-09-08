package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import nj3.C11185s;
import nj3.C11186t;
import wq3.C111847h;
import yo3.C79142a;

/* renamed from: com.tencent.mm.ui.base.MMFormMobileInputView */
public class MMFormMobileInputView extends LinearLayout implements C111847h {

    /* renamed from: d */
    public Context f24183d;

    /* renamed from: e */
    public EditText f24184e;

    /* renamed from: f */
    public EditText f24185f;

    /* renamed from: g */
    public int f24186g;

    /* renamed from: h */
    public int[] f24187h;

    /* renamed from: i */
    public String f24188i;

    /* renamed from: j */
    public String f24189j;

    /* renamed from: com.tencent.mm.ui.base.MMFormMobileInputView$a */
    public interface C6754a {
        /* renamed from: a */
        void mo7715a(String str);
    }

    public MMFormMobileInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f24186g = -1;
        this.f24188i = "";
        this.f24189j = "";
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C79142a.f232405d, i, 0);
        this.f24186g = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        C85868k2.m106137b(context).inflate(C0966R.C0971layout.bcj, this);
        this.f24183d = context;
    }

    /* renamed from: a */
    public void mo7705a(boolean z) {
        mo7706b(this.f24184e);
        if (z) {
            this.f24184e.setBackgroundResource(C0966R.C0969drawable.c4f);
        } else {
            this.f24184e.setBackgroundResource(C0966R.C0969drawable.c4g);
        }
        EditText editText = this.f24184e;
        int[] iArr = this.f24187h;
        if (iArr != null) {
            editText.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        mo7706b(this.f24185f);
        if (z) {
            this.f24185f.setBackgroundResource(C0966R.C0969drawable.c4f);
        } else {
            this.f24185f.setBackgroundResource(C0966R.C0969drawable.c4g);
        }
        EditText editText2 = this.f24185f;
        int[] iArr2 = this.f24187h;
        if (iArr2 != null) {
            editText2.setPadding(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
        }
    }

    /* renamed from: b */
    public final void mo7706b(View view) {
        this.f24187h = new int[]{view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom()};
    }

    public String getCountryCode() {
        EditText editText = this.f24184e;
        return editText != null ? editText.getText().toString().trim() : "";
    }

    public EditText getCountryCodeEditText() {
        return this.f24184e;
    }

    public String getMobileNumber() {
        EditText editText = this.f24185f;
        return editText != null ? PhoneFormater.pureNumber(editText.getText().toString()) : "";
    }

    public EditText getMobileNumberEditText() {
        return this.f24185f;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f24184e = (EditText) findViewById(C0966R.C0970id.bu8);
        EditText editText = (EditText) findViewById(C0966R.C0970id.gw9);
        this.f24185f = editText;
        EditText editText2 = this.f24184e;
        if (editText2 == null || editText == null) {
            Log.m105929w("MicroMsg.MMFormMobileInputView", "countryCodeET : %s, mobileNumberET : %s", editText2, editText);
        } else {
            int i = this.f24186g;
            if (i != -1) {
                editText.setHint(i);
            }
        }
        EditText editText3 = this.f24184e;
        if (editText3 != null && this.f24185f != null) {
            if (editText3.hasFocus() || this.f24185f.hasFocus()) {
                mo7705a(true);
            } else {
                mo7705a(false);
            }
            C11185s sVar = new C11185s(this);
            this.f24184e.setOnFocusChangeListener(sVar);
            this.f24185f.setOnFocusChangeListener(sVar);
            EditText editText4 = this.f24185f;
            editText4.addTextChangedListener(new MMEditText.C7040d(editText4, (TextView) null, 20));
            this.f24185f.addTextChangedListener(new C11186t(this));
            this.f24184e.addTextChangedListener(new C6757b(this));
        }
    }

    public void setCountryCode(String str) {
        EditText editText = this.f24184e;
        if (editText != null) {
            editText.setText(str);
        } else {
            Log.m105920e("MicroMsg.MMFormMobileInputView", "countryCodeET is null!");
        }
    }

    public void setHint(String str) {
        EditText editText = this.f24185f;
        if (editText != null) {
            editText.setHint(str);
        } else {
            Log.m105920e("MicroMsg.MMFormMobileInputView", "mobileNumberET is null!");
        }
    }

    public void setMobileNumber(String str) {
        EditText editText = this.f24185f;
        if (editText != null) {
            editText.setText(str);
        } else {
            Log.m105920e("MicroMsg.MMFormMobileInputView", "mobileNumberET is null!");
        }
    }

    public void setOnCountryCodeChangedListener(C6754a aVar) {
    }

    public MMFormMobileInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
