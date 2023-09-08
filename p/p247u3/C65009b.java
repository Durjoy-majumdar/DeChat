package p247u3;

import androidx.recyclerview.widget.C54230b;
import androidx.recyclerview.widget.C54231c;
import androidx.recyclerview.widget.C54248l;
import androidx.recyclerview.widget.C54258u;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p247u3.C65035c1;
import p856m.C61417a;
import sx3.C64175a0;

/* renamed from: u3.b */
public class C65009b<T> {

    /* renamed from: a */
    public final C54258u f187143a;

    /* renamed from: b */
    public final C54231c<T> f187144b;

    /* renamed from: c */
    public Executor f187145c = C61417a.f174665c;

    /* renamed from: d */
    public C65013c<T> f187146d;

    /* renamed from: e */
    public boolean f187147e;

    /* renamed from: f */
    public C65035c1<T> f187148f;

    /* renamed from: g */
    public C65035c1<T> f187149g;

    /* renamed from: h */
    public int f187150h;

    /* renamed from: i */
    public C65035c1.C65037b f187151i = new C65010a();

    /* renamed from: u3.b$a */
    public class C65010a extends C65035c1.C65037b {
        public C65010a() {
        }

        /* renamed from: a */
        public void mo89227a(int i, int i2) {
            ((C54230b) C65009b.this.f187143a).mo2862c(i, i2, (Object) null);
        }

        /* renamed from: b */
        public void mo89228b(int i, int i2) {
            ((C54230b) C65009b.this.f187143a).mo2861b(i, i2);
        }

        /* renamed from: c */
        public void mo89229c(int i, int i2) {
            ((C54230b) C65009b.this.f187143a).mo2860a(i, i2);
        }
    }

    /* renamed from: u3.b$b */
    public class C65011b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C65035c1 f187153d;

        /* renamed from: e */
        public final /* synthetic */ C65035c1 f187154e;

        /* renamed from: f */
        public final /* synthetic */ int f187155f;

        /* renamed from: g */
        public final /* synthetic */ C65035c1 f187156g;

        /* renamed from: u3.b$b$a */
        public class C65012a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C54248l.C54251c f187158d;

            public C65012a(C54248l.C54251c cVar) {
                this.f187158d = cVar;
            }

            public void run() {
                C65011b bVar = C65011b.this;
                C65009b bVar2 = C65009b.this;
                if (bVar2.f187150h == bVar.f187155f) {
                    bVar2.mo89225a(bVar.f187156g, bVar.f187154e, this.f187158d, bVar.f187153d.mLastLoad);
                }
            }
        }

        public C65011b(C65035c1 c1Var, C65035c1 c1Var2, int i, C65035c1 c1Var3) {
            this.f187153d = c1Var;
            this.f187154e = c1Var2;
            this.f187155f = i;
            this.f187156g = c1Var3;
        }

        public void run() {
            C54248l.C54251c a = C65070i1.m76685a(this.f187153d.mStorage, this.f187154e.mStorage, C65009b.this.f187144b.f152203b);
            C65009b.this.getClass();
            C61417a.m72117a().mo86364c(new C65012a(a));
        }
    }

    /* renamed from: u3.b$c */
    public interface C65013c<T> {
    }

    public C65009b(RecyclerView.C16613e eVar, C54248l.C54252d<T> dVar) {
        this.f187143a = new C54230b(eVar);
        C54231c.C54232a aVar = new C54231c.C54232a(dVar);
        if (aVar.f152206a == null) {
            synchronized (C54231c.C54232a.f152204b) {
                if (C54231c.C54232a.f152205c == null) {
                    C54231c.C54232a.f152205c = Executors.newFixedThreadPool(2);
                }
            }
            aVar.f152206a = C54231c.C54232a.f152205c;
        }
        this.f187144b = new C54231c<>((Executor) null, aVar.f152206a, dVar);
    }

    /* renamed from: a */
    public void mo89225a(C65035c1<T> c1Var, C65035c1<T> c1Var2, C54248l.C54251c cVar, int i) {
        C65035c1<T> c1Var3 = this.f187149g;
        if (c1Var3 == null || this.f187148f != null) {
            throw new IllegalStateException("must be in snapshot state to apply diff");
        }
        this.f187148f = c1Var;
        this.f187149g = null;
        C65070i1.m76686b(this.f187143a, c1Var3.mStorage, c1Var.mStorage, cVar);
        c1Var.mo89235h(c1Var2, this.f187151i);
        int c = C65070i1.m76687c(cVar, c1Var3.mStorage, c1Var2.mStorage, i);
        C65035c1<T> c1Var4 = this.f187148f;
        c1Var4.mLastLoad = Math.max(0, Math.min(c1Var4.size(), c));
        C65013c<T> cVar2 = this.f187146d;
        if (cVar2 != null) {
            C65064g1.this.getClass();
        }
    }

    /* renamed from: b */
    public void mo89226b(C65035c1<T> c1Var) {
        int i;
        if (c1Var != null) {
            if (this.f187148f == null && this.f187149g == null) {
                this.f187147e = c1Var.isContiguous();
            } else if (c1Var.isContiguous() != this.f187147e) {
                throw new IllegalArgumentException("AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists.");
            }
        }
        int i2 = this.f187150h + 1;
        this.f187150h = i2;
        C65035c1<T> c1Var2 = this.f187148f;
        if (c1Var != c1Var2) {
            if (c1Var == null) {
                if (c1Var2 != null) {
                    i = c1Var2.size();
                } else {
                    C65035c1<T> c1Var3 = this.f187149g;
                    i = c1Var3 == null ? 0 : c1Var3.size();
                }
                C65035c1<T> c1Var4 = this.f187148f;
                if (c1Var4 != null) {
                    C65035c1.C65037b bVar = this.f187151i;
                    C87412m.m108594g(bVar, "callback");
                    C64175a0.m75512t(c1Var4.f187203d, new C37335f1(bVar));
                    this.f187148f = null;
                } else if (this.f187149g != null) {
                    this.f187149g = null;
                }
                ((C54230b) this.f187143a).mo2860a(0, i);
                C65013c<T> cVar = this.f187146d;
                if (cVar != null) {
                    C65064g1.this.getClass();
                }
            } else if (c1Var2 == null && this.f187149g == null) {
                this.f187148f = c1Var;
                c1Var.mo89235h((List<? extends T>) null, this.f187151i);
                ((C54230b) this.f187143a).mo2861b(0, c1Var.size());
                C65013c<T> cVar2 = this.f187146d;
                if (cVar2 != null) {
                    C65064g1.this.getClass();
                }
            } else {
                if (c1Var2 != null) {
                    C65035c1.C65037b bVar2 = this.f187151i;
                    C87412m.m108594g(bVar2, "callback");
                    C64175a0.m75512t(c1Var2.f187203d, new C37335f1(bVar2));
                    C65035c1<T> c1Var5 = this.f187148f;
                    if (!c1Var5.mo89239m()) {
                        c1Var5 = new C65208z1<>(c1Var5);
                    }
                    this.f187149g = c1Var5;
                    this.f187148f = null;
                }
                C65035c1<T> c1Var6 = this.f187149g;
                if (c1Var6 == null || this.f187148f != null) {
                    throw new IllegalStateException("must be in snapshot state to diff");
                }
                this.f187144b.f152202a.execute(new C65011b(c1Var6, c1Var.mo89239m() ? c1Var : new C65208z1(c1Var), i2, c1Var));
            }
        }
    }
}
