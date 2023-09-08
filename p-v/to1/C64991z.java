package to1;

import android.graphics.Bitmap;
import android.view.View;
import fy3.C32224a;
import gy3.C87413o;
import ic0.C21070h;
import jc0.C21210b;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: to1.z */
public final class C64991z implements C21070h {

    /* renamed from: a */
    public final /* synthetic */ C64962b0 f187115a;

    /* renamed from: to1.z$a */
    public static final class C64992a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C64962b0 f187116d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64992a(C64962b0 b0Var) {
            super(0);
            this.f187116d = b0Var;
        }

        public Object invoke() {
            this.f187116d.f187046A.setVisibility(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: to1.z$b */
    public static final class C64993b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C64962b0 f187117d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64993b(C64962b0 b0Var) {
            super(0);
            this.f187117d = b0Var;
        }

        public Object invoke() {
            this.f187117d.f187046A.setVisibility(0);
            return C13598b0.f38549a;
        }
    }

    public C64991z(C64962b0 b0Var) {
        this.f187115a = b0Var;
    }

    /* renamed from: a */
    public void mo6676a(String str, View view) {
        C61926c.m72668M(new C64993b(this.f187115a));
    }

    /* renamed from: b */
    public void mo6677b(String str, View view, C21210b bVar) {
        C61926c.m72668M(new C64992a(this.f187115a));
    }

    /* renamed from: c */
    public Bitmap mo6678c(String str, View view, C21210b bVar) {
        return null;
    }
}
