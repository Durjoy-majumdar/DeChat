package o34;

import java.util.concurrent.atomic.AtomicLong;
import l34.C117454g;
import l34.C117458j;

/* renamed from: o34.r */
public class C117678r extends C117458j<Object> {

    /* renamed from: h */
    public int f351983h;

    /* renamed from: i */
    public boolean f351984i;

    /* renamed from: j */
    public final /* synthetic */ C117458j f351985j;

    /* renamed from: n */
    public final /* synthetic */ C117680s f351986n;

    /* renamed from: o34.r$a */
    public class C117679a implements C117454g {

        /* renamed from: d */
        public final AtomicLong f351987d = new AtomicLong(0);

        /* renamed from: e */
        public final /* synthetic */ C117454g f351988e;

        public C117679a(C117454g gVar) {
            this.f351988e = gVar;
        }

        /* renamed from: h */
        public void mo123768h(long j) {
            long j2;
            long min;
            if (j > 0 && !C117678r.this.f351984i) {
                do {
                    j2 = this.f351987d.get();
                    min = Math.min(j, ((long) C117678r.this.f351986n.f351990a) - j2);
                    if (min == 0) {
                        return;
                    }
                } while (!this.f351987d.compareAndSet(j2, j2 + min));
                this.f351988e.mo123768h(min);
            }
        }
    }

    public C117678r(C117680s sVar, C117458j jVar) {
        this.f351986n = sVar;
        this.f351985j = jVar;
    }

    /* renamed from: a */
    public void mo122780a() {
        if (!this.f351984i) {
            this.f351984i = true;
            this.f351985j.mo122780a();
        }
    }

    /* renamed from: b */
    public void mo122781b(Object obj) {
        if (!this.f351524d.f353197e) {
            int i = this.f351983h;
            int i2 = i + 1;
            this.f351983h = i2;
            int i3 = this.f351986n.f351990a;
            if (i < i3) {
                boolean z = i2 == i3;
                this.f351985j.mo122781b(obj);
                if (z && !this.f351984i) {
                    this.f351984i = true;
                    try {
                        this.f351985j.mo122780a();
                    } finally {
                        mo182165d();
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public void mo182169h(C117454g gVar) {
        this.f351985j.mo182169h(new C117679a(gVar));
    }

    public void onError(Throwable th) {
        if (!this.f351984i) {
            this.f351984i = true;
            try {
                this.f351985j.onError(th);
            } finally {
                mo182165d();
            }
        }
    }
}
