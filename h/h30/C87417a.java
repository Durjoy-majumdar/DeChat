package h30;

import a40.C79462a;
import p1028re.C89928a;
import p1028re.C89931d;
import zt3.C119157j;

/* renamed from: h30.a */
public class C87417a {

    /* renamed from: a */
    public C79462a f253304a = null;

    /* renamed from: h30.a$a */
    public class C87418a implements C89928a {

        /* renamed from: h30.a$a$a */
        public class C87419a implements Runnable {
            public C87419a() {
            }

            public void run() {
                synchronized (C87417a.this) {
                    C79462a aVar = C87417a.this.f253304a;
                    if (aVar != null) {
                        aVar.mo109458d();
                        C87417a.this.f253304a = null;
                    }
                }
            }
        }

        public C87418a() {
        }

        /* renamed from: a */
        public void mo391a(int i) {
        }

        /* renamed from: b */
        public void mo392b() {
            ((C119157j) C119157j.f356862d).mo183884o(new C87419a());
        }
    }

    public C87417a() {
        C89931d.f258426c.mo124252b(new C87418a());
    }
}
