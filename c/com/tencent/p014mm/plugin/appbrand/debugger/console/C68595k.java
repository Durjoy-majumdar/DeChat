package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kg3.C76577a;
import p385u2.C111105a;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.k */
public final class C68595k extends AppCompatButton {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68595k(Context context) {
        super(context, (AttributeSet) null);
        C87412m.m108594g(context, "context");
        setMinHeight(C76577a.m92155f(context, C0966R.dimen.f3953lb));
        setMinWidth(C76577a.m92155f(context, C0966R.dimen.f3952la));
        setGravity(17);
        setTextSize(0, (float) C76577a.m92155f(context, C0966R.dimen.f3951l_));
        int f = C76577a.m92155f(context, C0966R.dimen.f3950l9);
        setPadding(f, 0, f, 0);
        setAllCaps(false);
        setTextColor(C111105a.m151501c(context, C0966R.color.f3257l0));
        setBackgroundResource(C0966R.C0969drawable.f4656j8);
        setText("Console");
    }
}
