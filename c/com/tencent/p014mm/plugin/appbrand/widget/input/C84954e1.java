package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104863f1;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.e1 */
public interface C84954e1<Input extends EditText & C104863f1> {
    /* renamed from: a */
    boolean mo117815a();

    /* renamed from: b */
    boolean mo117816b();

    /* renamed from: c */
    int mo117817c();

    Editable currentValue();

    /* renamed from: d */
    boolean mo117819d(int i, int i2, boolean z);

    /* renamed from: e */
    void mo117820e(String str, Integer num);

    /* renamed from: f */
    void mo117821f(int i);

    /* renamed from: g */
    boolean mo117822g(C83780d1 d1Var);

    int getInputId();

    <P extends View & C84956g1> P getInputPanel();

    /* renamed from: h */
    Input mo117825h();

    boolean hideKeyboard();
}
