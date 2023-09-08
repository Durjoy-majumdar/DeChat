package pk1;

import android.view.MenuItem;
import cl1.C0653a0;
import cl1.C54991o;
import nj3.C11182m0;
import nj3.C76874e0;
import nj3.C76875f0;

/* renamed from: pk1.b */
public final class C11944b implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C11947c f34878d;

    /* renamed from: pk1.b$a */
    public static final class C11945a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C11947c f34879d;

        public C11945a(C11947c cVar) {
            this.f34879d = cVar;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            C11947c cVar = this.f34879d;
            ((C0653a0) cVar.f34882b.mo71262a(C0653a0.class)).f1542f.postValue(C11947c.m11654a(cVar));
            return true;
        }
    }

    /* renamed from: pk1.b$b */
    public static final class C11946b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C11947c f34880d;

        public C11946b(C11947c cVar) {
            this.f34880d = cVar;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            ((C54991o) this.f34880d.f34882b.mo71262a(C54991o.class)).f154215J1 = C11947c.m11654a(this.f34880d);
            return true;
        }
    }

    public C11944b(C11947c cVar) {
        this.f34878d = cVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        if (e0Var.mo107176v()) {
            ((C76875f0) e0Var.mo107142f(1, "礼物条通知")).f224729x = new C11945a(this.f34878d);
            ((C76875f0) e0Var.mo107142f(2, "banner通知")).f224729x = new C11946b(this.f34878d);
        }
    }
}
