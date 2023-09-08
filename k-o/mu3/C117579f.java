package mu3;

import android.os.Message;
import gy3.C87412m;
import mu3.C117561c;
import rx3.C13598b0;

/* renamed from: mu3.f */
public final class C117579f extends C117561c {

    /* renamed from: a */
    public final Object f351737a = new Object();

    /* renamed from: mu3.f$a */
    public static final class C117580a extends C117561c.C117572k {

        /* renamed from: i */
        public final /* synthetic */ C117579f f351738i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C117580a(C117579f fVar, Message message) {
            super(message);
            this.f351738i = fVar;
        }

        public void run() {
            synchronized (this.f351738i.f351737a) {
                super.run();
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117579f(C109639a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "serial");
    }

    public C117561c.C117572k createRunnable(Message message) {
        return new C117580a(this, message);
    }
}
