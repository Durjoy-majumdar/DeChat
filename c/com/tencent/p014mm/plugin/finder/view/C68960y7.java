package com.tencent.p014mm.plugin.finder.view;

import android.text.Editable;
import com.tencent.p014mm.p136ui.widget.edittext.PasterEditText;
import gy3.C87412m;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.plugin.finder.view.y7 */
public final class C68960y7 implements PasterEditText.C74990a {

    /* renamed from: a */
    public final /* synthetic */ SignatureEditText f198165a;

    public C68960y7(SignatureEditText signatureEditText) {
        this.f198165a = signatureEditText;
    }

    /* renamed from: a */
    public void mo94888a(Editable editable, CharSequence charSequence, int i, int i2) {
        if (charSequence != null && editable != null) {
            Pattern compile = Pattern.compile("(?m)^[ \t]*\r?\n");
            C87412m.m108593f(compile, "compile(pattern)");
            String replaceAll = compile.matcher(charSequence).replaceAll("");
            C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
            this.f198165a.setText(editable.replace(i, i2 + i, replaceAll));
        }
    }
}
