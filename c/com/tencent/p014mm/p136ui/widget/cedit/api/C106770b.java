package com.tencent.p014mm.p136ui.widget.cedit.api;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.p136ui.widget.cedit.api.PasterEditTextCompact;
import java.util.Iterator;

/* renamed from: com.tencent.mm.ui.widget.cedit.api.b */
public class C106770b implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ PasterEditTextCompact f319235d;

    public C106770b(PasterEditTextCompact pasterEditTextCompact) {
        this.f319235d = pasterEditTextCompact;
    }

    public void afterTextChanged(Editable editable) {
        PasterEditTextCompact pasterEditTextCompact = this.f319235d;
        if (pasterEditTextCompact.f319224R1) {
            pasterEditTextCompact.f319224R1 = false;
            pasterEditTextCompact.f319229W1 = pasterEditTextCompact.f319226T1;
            pasterEditTextCompact.f319228V1 = pasterEditTextCompact.f319227U1;
            Iterator<PasterEditTextCompact.C106769a> it = pasterEditTextCompact.f319234b2.iterator();
            while (it.hasNext()) {
                PasterEditTextCompact pasterEditTextCompact2 = this.f319235d;
                it.next().mo153955a(editable, pasterEditTextCompact2.f319227U1, pasterEditTextCompact2.f319225S1, pasterEditTextCompact2.f319226T1);
            }
        }
        int length = editable.length() - this.f319235d.f319231Y1.length();
        PasterEditTextCompact pasterEditTextCompact3 = this.f319235d;
        if (!pasterEditTextCompact3.f319230X1 && length >= 10) {
            pasterEditTextCompact3.f319230X1 = true;
        }
        if (length >= 10) {
            pasterEditTextCompact3.f319232Z1.add(Integer.valueOf(length));
        }
        this.f319235d.f319231Y1 = editable.toString();
        Iterator<TextWatcher> it4 = this.f319235d.f319233a2.iterator();
        while (it4.hasNext()) {
            it4.next().afterTextChanged(editable);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Iterator<TextWatcher> it = this.f319235d.f319233a2.iterator();
        while (it.hasNext()) {
            it.next().beforeTextChanged(charSequence, i, i2, i3);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        PasterEditTextCompact pasterEditTextCompact = this.f319235d;
        pasterEditTextCompact.f319225S1 = i;
        pasterEditTextCompact.f319226T1 = i3;
        pasterEditTextCompact.f319227U1 = charSequence.subSequence(i, i + i3);
        Iterator<TextWatcher> it = this.f319235d.f319233a2.iterator();
        while (it.hasNext()) {
            it.next().onTextChanged(charSequence, i, i2, i3);
        }
    }
}
