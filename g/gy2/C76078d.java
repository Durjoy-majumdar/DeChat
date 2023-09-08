package gy2;

import android.content.Context;
import android.util.AttributeSet;
import ay2.C67113b;
import gy3.C87412m;

/* renamed from: gy2.d */
public final class C76078d extends C67113b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76078d(Context context, C67113b.C67114a aVar, int i) {
        super(context, aVar, i, (AttributeSet) null, 0);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "callback");
        getContainerView().setOnClickListener(new C76077c(aVar));
    }

    /* renamed from: b */
    public void mo91215b() {
    }

    /* renamed from: c */
    public String mo91216c() {
        return "";
    }
}
