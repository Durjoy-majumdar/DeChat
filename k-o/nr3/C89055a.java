package nr3;

import gp3.C87314a;
import gp3.C87315b;
import java.util.Iterator;
import mp3.C88819d;

/* renamed from: nr3.a */
public class C89055a<_Callback> extends C87314a<_Callback> {

    /* renamed from: nr3.a$a */
    public interface C89056a<_Callback> {
        /* renamed from: a */
        void mo54201a(_Callback _callback);
    }

    public C89055a() {
        super((C88819d) new C89058d());
    }

    public C87315b<_Callback> add(_Callback _callback) {
        return add(new C87315b(_callback, this));
    }

    /* renamed from: n */
    public void mo123416n(C89056a<_Callback> aVar) {
        if (aVar != null) {
            Iterator<C87315b> it = getQueue().iterator();
            while (it.hasNext()) {
                C87315b next = it.next();
                if (next != null) {
                    aVar.mo54201a(next.f253059e);
                }
            }
        }
    }

    public C89055a(C88819d dVar) {
        super(dVar);
    }
}
