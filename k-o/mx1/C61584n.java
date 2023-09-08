package mx1;

import a14.C53872d1;
import a14.C53901i0;
import androidx.lifecycle.C39622i0;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import wx3.C66212f;

/* renamed from: mx1.n */
public final class C61584n extends C39622i0 {

    /* renamed from: d */
    public final C13601g f175163d;

    /* renamed from: e */
    public final C13601g f175164e;

    /* renamed from: mx1.n$a */
    public static final class C61585a extends C87413o implements C32224a<C66212f> {

        /* renamed from: d */
        public final /* synthetic */ C61584n f175165d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61585a(C61584n nVar) {
            super(0);
            this.f175165d = nVar;
        }

        public Object invoke() {
            return C53872d1.f151119c.plus((C53901i0) this.f175165d.f175163d.getValue());
        }
    }

    /* renamed from: mx1.n$b */
    public static final class C61586b extends C87413o implements C32224a<C53901i0> {

        /* renamed from: d */
        public static final C61586b f175166d = new C61586b();

        public C61586b() {
            super(0);
        }

        public Object invoke() {
            int i = C53901i0.f151153a0;
            return new C61587o(C53901i0.C39480a.f106019d);
        }
    }

    public C61584n() {
        C13602i iVar = C13602i.NONE;
        this.f175163d = C36568h.m40986b(iVar, C61586b.f175166d);
        this.f175164e = C36568h.m40986b(iVar, new C61585a(this));
    }
}
