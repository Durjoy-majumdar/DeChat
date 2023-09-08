package tf0;

import ch2.C28562b;
import ch2.C92419c;
import ch2.C92421f;
import di3.C86301e;
import ei3.C86522b;
import fy3.C32224a;
import gy3.C87413o;
import h23.C98315f;
import hd0.C32816e;
import hd0.C32828l;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import x13.C38443a;

@C86522b
/* renamed from: tf0.w1 */
public final class C37055w1 extends C86301e implements C28562b, C32828l {

    /* renamed from: d */
    public final C13601g f98219d = C36568h.m40985a(C37058c.f98224d);

    /* renamed from: e */
    public final C13601g f98220e = C36568h.m40985a(C37057b.f98223d);

    /* renamed from: f */
    public final C13601g f98221f = C36568h.m40985a(C37056a.f98222d);

    /* renamed from: tf0.w1$a */
    public static final class C37056a extends C87413o implements C32224a<C38443a> {

        /* renamed from: d */
        public static final C37056a f98222d = new C37056a();

        public C37056a() {
            super(0);
        }

        public Object invoke() {
            return C38443a.f101402a;
        }
    }

    /* renamed from: tf0.w1$b */
    public static final class C37057b extends C87413o implements C32224a<C98315f> {

        /* renamed from: d */
        public static final C37057b f98223d = new C37057b();

        public C37057b() {
            super(0);
        }

        public Object invoke() {
            return new C98315f();
        }
    }

    /* renamed from: tf0.w1$c */
    public static final class C37058c extends C87413o implements C32224a<C92421f> {

        /* renamed from: d */
        public static final C37058c f98224d = new C37058c();

        public C37058c() {
            super(0);
        }

        public Object invoke() {
            return new C92421f();
        }
    }

    /* renamed from: Pp */
    public C92419c mo56056Pp(int i) {
        if (i == 0) {
            return (C92421f) ((C36570n) this.f98219d).getValue();
        }
        if (i != 1) {
            return null;
        }
        return (C98315f) ((C36570n) this.f98220e).getValue();
    }

    /* renamed from: cN */
    public C32816e mo58824cN() {
        return (C38443a) ((C36570n) this.f98221f).getValue();
    }
}
