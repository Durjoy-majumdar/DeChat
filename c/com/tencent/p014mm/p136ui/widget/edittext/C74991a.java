package com.tencent.p014mm.p136ui.widget.edittext;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.p136ui.widget.edittext.PasterEditText;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.ui.widget.edittext.a */
public class C74991a implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ PasterEditText f220607d;

    public C74991a(PasterEditText pasterEditText) {
        this.f220607d = pasterEditText;
    }

    public void afterTextChanged(Editable editable) {
        PasterEditText pasterEditText = this.f220607d;
        if (pasterEditText.f220596e) {
            pasterEditText.f220596e = false;
            pasterEditText.f220601j = pasterEditText.f220598g;
            pasterEditText.f220600i = pasterEditText.f220599h;
            for (PasterEditText.C74990a a : pasterEditText.f220606r) {
                PasterEditText pasterEditText2 = this.f220607d;
                a.mo94888a(editable, pasterEditText2.f220599h, pasterEditText2.f220597f, pasterEditText2.f220598g);
            }
        }
        int length = editable.length() - this.f220607d.f220603o.length();
        PasterEditText pasterEditText3 = this.f220607d;
        if (!pasterEditText3.f220602n && length >= 10) {
            pasterEditText3.f220602n = true;
        }
        if (length >= 10) {
            ((ArrayList) pasterEditText3.f220604p).add(Integer.valueOf(length));
        }
        this.f220607d.f220603o = editable.toString();
        Iterator<TextWatcher> it = this.f220607d.f220605q.iterator();
        while (it.hasNext()) {
            it.next().afterTextChanged(editable);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Iterator<TextWatcher> it = this.f220607d.f220605q.iterator();
        while (it.hasNext()) {
            it.next().beforeTextChanged(charSequence, i, i2, i3);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        PasterEditText pasterEditText = this.f220607d;
        pasterEditText.f220597f = i;
        pasterEditText.f220598g = i3;
        pasterEditText.f220599h = charSequence.subSequence(i, i + i3);
        Iterator<TextWatcher> it = this.f220607d.f220605q.iterator();
        while (it.hasNext()) {
            it.next().onTextChanged(charSequence, i, i2, i3);
        }
    }
}
