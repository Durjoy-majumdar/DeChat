package p1221x4;

import java.util.concurrent.atomic.AtomicBoolean;
import p1191e4.C116690e;
import p1191e4.C116691f;
import p1223z3.C119038g;
import p1223z3.C119048k;

/* renamed from: x4.n */
public final class C118844n implements C118843m {

    /* renamed from: a */
    public final C119038g f355538a;

    /* renamed from: b */
    public final C119048k f355539b;

    /* renamed from: c */
    public final C119048k f355540c;

    /* renamed from: x4.n$a */
    public class C118845a extends C119048k {
        public C118845a(C118844n nVar, C119038g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo183531b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: x4.n$b */
    public class C118846b extends C119048k {
        public C118846b(C118844n nVar, C119038g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo183531b() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C118844n(C119038g gVar) {
        this.f355538a = gVar;
        new AtomicBoolean(false);
        this.f355539b = new C118845a(this, gVar);
        this.f355540c = new C118846b(this, gVar);
    }

    /* renamed from: a */
    public void mo183542a(String str) {
        this.f355538a.mo183702b();
        C116691f a = this.f355539b.mo183713a();
        if (str == null) {
            ((C116690e) a).bindNull(1);
        } else {
            ((C116690e) a).bindString(1, str);
        }
        this.f355538a.mo183703c();
        try {
            a = (C116691f) a;
            a.mo180702a();
            this.f355538a.mo183706h();
        } finally {
            this.f355538a.mo183704f();
            this.f355539b.mo183714c(a);
        }
    }

    /* renamed from: b */
    public void mo183543b() {
        this.f355538a.mo183702b();
        C116691f a = this.f355540c.mo183713a();
        this.f355538a.mo183703c();
        try {
            a = (C116691f) a;
            a.mo180702a();
            this.f355538a.mo183706h();
        } finally {
            this.f355538a.mo183704f();
            this.f355540c.mo183714c(a);
        }
    }
}
