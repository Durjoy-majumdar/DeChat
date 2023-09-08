package l12;

import com.tencent.p014mm.plugin.voip.model.C106336d;
import j12.C108528a;

/* renamed from: l12.b */
public class C109121b {

    /* renamed from: a */
    public C106336d f326750a = null;

    /* renamed from: b */
    public final Object f326751b = new Object();

    /* renamed from: c */
    public boolean f326752c = false;

    /* renamed from: d */
    public boolean f326753d = false;

    /* renamed from: e */
    public C108528a f326754e;

    /* renamed from: l12.b$a */
    public class C109122a implements Runnable {

        /* renamed from: d */
        public C106336d f326755d;

        public C109122a(C106336d dVar) {
            this.f326755d = dVar;
        }

        public void run() {
            C106336d dVar = this.f326755d;
            if (dVar != null) {
                dVar.mo152546e();
                this.f326755d.mo152547f();
                this.f326755d = null;
                C109121b.this.f326753d = false;
            }
            C109121b.this.f326754e.mo157511t();
        }
    }

    public C109121b(C108528a aVar) {
        this.f326754e = aVar;
    }
}
