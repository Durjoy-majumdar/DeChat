package o34;

import l34.C117454g;
import l34.C117456i;
import l34.C117458j;
import n34.C117603a;

/* renamed from: o34.p */
public class C117673p implements C117603a {

    /* renamed from: d */
    public final /* synthetic */ C117458j f351972d;

    /* renamed from: e */
    public final /* synthetic */ C117456i.C117457a f351973e;

    /* renamed from: f */
    public final /* synthetic */ C117677q f351974f;

    /* renamed from: o34.p$a */
    public class C117674a extends C117458j<Object> {

        /* renamed from: h */
        public final /* synthetic */ Thread f351975h;

        /* renamed from: o34.p$a$a */
        public class C117675a implements C117454g {

            /* renamed from: d */
            public final /* synthetic */ C117454g f351977d;

            /* renamed from: o34.p$a$a$a */
            public class C117676a implements C117603a {

                /* renamed from: d */
                public final /* synthetic */ long f351979d;

                public C117676a(long j) {
                    this.f351979d = j;
                }

                public void call() {
                    C117675a.this.f351977d.mo123768h(this.f351979d);
                }
            }

            public C117675a(C117454g gVar) {
                this.f351977d = gVar;
            }

            /* renamed from: h */
            public void mo123768h(long j) {
                if (C117674a.this.f351975h == Thread.currentThread()) {
                    this.f351977d.mo123768h(j);
                } else {
                    C117673p.this.f351973e.mo182162b(new C117676a(j));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C117674a(C117458j jVar, Thread thread) {
            super(jVar, true);
            this.f351975h = thread;
        }

        /* renamed from: a */
        public void mo122780a() {
            try {
                C117673p.this.f351972d.mo122780a();
            } finally {
                C117673p.this.f351973e.mo182165d();
            }
        }

        /* renamed from: b */
        public void mo122781b(Object obj) {
            C117673p.this.f351972d.mo122781b(obj);
        }

        /* renamed from: h */
        public void mo182169h(C117454g gVar) {
            C117673p.this.f351972d.mo182169h(new C117675a(gVar));
        }

        public void onError(Throwable th) {
            try {
                C117673p.this.f351972d.onError(th);
            } finally {
                C117673p.this.f351973e.mo182165d();
            }
        }
    }

    public C117673p(C117677q qVar, C117458j jVar, C117456i.C117457a aVar) {
        this.f351974f = qVar;
        this.f351972d = jVar;
        this.f351973e = aVar;
    }

    public void call() {
        this.f351974f.f351982e.mo182157h(new C117674a(this.f351972d, Thread.currentThread()));
    }
}
