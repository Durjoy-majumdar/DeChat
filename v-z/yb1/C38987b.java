package yb1;

import android.content.Context;
import bc1.C92241c;
import cc1.C92414b;
import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: yb1.b */
public class C38987b extends C86301e {

    /* renamed from: d */
    public volatile C92414b f105037d = null;

    /* renamed from: e */
    public volatile C92241c f105038e = null;

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        vx0();
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        if (this.f105038e != null) {
            C92241c cVar = this.f105038e;
            cVar.getClass();
            C86709a0.m107529k().mo121129d(cVar.f264009e);
            this.f105038e = null;
        }
    }

    public C92241c vx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f105038e == null) {
            synchronized (this) {
                if (this.f105038e == null) {
                    this.f105038e = new C92241c();
                }
            }
        }
        return this.f105038e;
    }

    public C92414b wx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f105037d == null) {
            synchronized (this) {
                if (this.f105037d == null) {
                    this.f105037d = new C92414b(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f105037d;
    }
}
