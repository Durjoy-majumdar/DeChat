package zl3;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import fy3.C32224a;
import gy3.C87412m;

/* renamed from: zl3.d */
public class C79402d extends Dialog {

    /* renamed from: d */
    public C32224a<Boolean> f232922d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C79402d(android.content.Context r1, int r2, int r3, gy3.C8480h r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0007
            r2 = 2131886608(0x7f120210, float:1.94078E38)
        L_0x0007:
            java.lang.String r3 = "context"
            gy3.C87412m.m108594g(r1, r3)
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zl3.C79402d.<init>(android.content.Context, int, int, gy3.h):void");
    }

    public void onBackPressed() {
        C32224a<Boolean> aVar = this.f232922d;
        boolean z = true;
        if (aVar == null || !aVar.invoke().booleanValue()) {
            z = false;
        }
        if (!z) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.addFlags(67108864);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        C87412m.m108593f(getContext(), "context");
        super.onWindowAttributesChanged(layoutParams);
    }

    public void show() {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        super.show();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79402d(Context context, int i) {
        super(context, i);
        C87412m.m108594g(context, "context");
    }
}
