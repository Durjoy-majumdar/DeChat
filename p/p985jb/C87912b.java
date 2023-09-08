package p985jb;

import android.content.res.Configuration;
import bt0.C79808b;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import rq0.C90084c;
import rq0.C90091i;
import tq0.C90572d;

/* renamed from: jb.b */
public class C87912b implements C90091i, C90084c {

    /* renamed from: a */
    public final C87911a f254450a;

    /* renamed from: b */
    public final C83780d1 f254451b;

    /* renamed from: jb.b$a */
    public class C87913a implements Runnable {
        public C87913a() {
        }

        public void run() {
            C87912b.this.f254450a.mo117651d();
        }
    }

    /* renamed from: jb.b$b */
    public class C87914b implements Runnable {
        public C87914b() {
        }

        public void run() {
            C87912b.this.f254450a.mo117648a();
        }
    }

    public C87912b(C83780d1 d1Var) {
        this.f254450a = new C87911a(d1Var);
        this.f254451b = d1Var;
    }

    /* renamed from: a */
    public void mo116581a() {
        this.f254451b.mo116275j0(new C87914b());
    }

    /* renamed from: b */
    public void mo116449b() {
        this.f254450a.getClass();
    }

    /* renamed from: c */
    public void mo116450c() {
        this.f254450a.mo117650c();
    }

    /* renamed from: d */
    public void mo116582d() {
        this.f254451b.mo116275j0(new C87913a());
    }

    /* renamed from: e */
    public boolean mo116583e() {
        return this.f254450a.f254449b == C90572d.C90573a.HIDDEN;
    }

    /* renamed from: h */
    public void mo116451h(C79808b bVar) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onDestroy() {
    }
}
