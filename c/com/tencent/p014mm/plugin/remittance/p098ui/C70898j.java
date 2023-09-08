package com.tencent.p014mm.plugin.remittance.p098ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.remittance.ui.j */
public class C70898j implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ EditText f205314d;

    /* renamed from: e */
    public final /* synthetic */ C77398g f205315e;

    /* renamed from: f */
    public final /* synthetic */ C70900k f205316f;

    public C70898j(C70900k kVar, EditText editText, C77398g gVar) {
        this.f205316f = kVar;
        this.f205314d = editText;
        this.f205315e = gVar;
    }

    public void afterTextChanged(Editable editable) {
        if (this.f205314d.length() > 0) {
            this.f205315e.mo107543y(this.f205316f.f205319a.getResources().getColor(C0966R.color.Link_100));
        } else {
            this.f205315e.mo107543y(-2141754475);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
