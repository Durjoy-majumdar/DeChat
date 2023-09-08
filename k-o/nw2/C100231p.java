package nw2;

import android.view.View;
import android.view.ViewConfiguration;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: nw2.p */
public final class C100231p {

    /* renamed from: a */
    public final View f293657a;

    /* renamed from: b */
    public C32226l<? super View, C13598b0> f293658b;

    /* renamed from: c */
    public C32226l<? super View, C13598b0> f293659c;

    /* renamed from: d */
    public int f293660d;

    /* renamed from: e */
    public final long f293661e = ((long) ViewConfiguration.getDoubleTapTimeout());

    /* renamed from: f */
    public Runnable f293662f = new C100232a(this);

    /* renamed from: nw2.p$a */
    public static final class C100232a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C100231p f293663d;

        public C100232a(C100231p pVar) {
            this.f293663d = pVar;
        }

        public final void run() {
            this.f293663d.mo139522a();
        }
    }

    public C100231p(View view) {
        C87412m.m108594g(view, "view");
        this.f293657a = view;
    }

    /* renamed from: a */
    public final void mo139522a() {
        int i = this.f293660d;
        if (i == 1) {
            C32226l<? super View, C13598b0> lVar = this.f293658b;
            if (lVar != null) {
                lVar.invoke(this.f293657a);
            }
        } else if (i == 2) {
            C32226l<? super View, C13598b0> lVar2 = this.f293659c;
            if (lVar2 != null) {
                lVar2.invoke(this.f293657a);
            }
        }
        this.f293660d = 0;
    }
}
