package jh3;

import android.content.Context;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39630m0;
import bl3.C54494p;
import di3.C31194g;
import di3.C86301e;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: jh3.d */
public class C60869d extends C86301e implements C31194g, C0123n0 {

    /* renamed from: d */
    public final String f173417d;

    /* renamed from: e */
    public final Boolean[] f173418e = {Boolean.FALSE};

    /* renamed from: f */
    public final C54494p f173419f = new C54494p();

    public C60869d(String str) {
        C87412m.m108594g(str, "uicClassName");
        this.f173417d = str;
    }

    /* renamed from: LR */
    public final void mo58017LR() {
        if (!this.f173418e[0].booleanValue()) {
            synchronized (this.f173418e) {
                if (!this.f173418e[0].booleanValue()) {
                    this.f173419f.mo75333b(this.f173417d);
                    this.f173418e[0] = Boolean.TRUE;
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    public C39630m0 getViewModelStore() {
        return this.f173419f.f152776f;
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        if (this.f173418e[0].booleanValue()) {
            synchronized (this.f173418e) {
                if (this.f173418e[0].booleanValue()) {
                    this.f173419f.mo75334c();
                    this.f173418e[0] = Boolean.FALSE;
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        mo58017LR();
    }
}
