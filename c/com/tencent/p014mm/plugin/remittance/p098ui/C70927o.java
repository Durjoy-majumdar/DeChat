package com.tencent.p014mm.plugin.remittance.p098ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.remittance.ui.o */
public class C70927o implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ EditText f205369d;

    /* renamed from: e */
    public final /* synthetic */ C77398g f205370e;

    /* renamed from: f */
    public final /* synthetic */ C70900k f205371f;

    public C70927o(C70900k kVar, EditText editText, C77398g gVar) {
        this.f205371f = kVar;
        this.f205369d = editText;
        this.f205370e = gVar;
    }

    public void afterTextChanged(Editable editable) {
        if (this.f205369d.length() > 0) {
            this.f205370e.mo107543y(this.f205371f.f205319a.getResources().getColor(C0966R.color.Link_100));
        } else {
            this.f205370e.mo107543y(-2141754475);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
