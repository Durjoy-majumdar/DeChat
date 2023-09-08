package p911ml;

import fy3.C32226l;
import gy3.C87413o;
import p911ml.C99914f;
import rx3.C13598b0;

/* renamed from: ml.n */
public final class C99926n implements C99914f.C99915a {

    /* renamed from: a */
    public final /* synthetic */ C99924m f292788a;

    /* renamed from: ml.n$a */
    public static final class C99927a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C99924m f292789d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99927a(C99924m mVar) {
            super(1);
            this.f292789d = mVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                this.f292789d.mo139265a(0, (String) null);
            } else {
                this.f292789d.mo139265a(-1, (String) null);
            }
            return C13598b0.f38549a;
        }
    }

    public C99926n(C99924m mVar) {
        this.f292788a = mVar;
    }

    /* renamed from: a */
    public final void mo91183a(int i, String str) {
        if (i == 0) {
            C99924m mVar = this.f292788a;
            mVar.mo139267c(new C99927a(mVar));
            return;
        }
        this.f292788a.mo139265a(i, (String) null);
    }
}
