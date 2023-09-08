package ep3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import np3.C89049b;

/* renamed from: ep3.b */
public class C97686b {

    /* renamed from: d */
    public static C97686b f286528d = new C97686b();

    /* renamed from: a */
    public Map<C97688c, C97683a> f286529a = new ConcurrentHashMap();

    /* renamed from: b */
    public final SparseIntArray f286530b = new SparseIntArray();

    /* renamed from: c */
    public final Handler f286531c = new C97687a(this, C89049b.f256699b.f256700a.getLooper());

    /* renamed from: ep3.b$a */
    public class C97687a extends Handler {
        public C97687a(C97686b bVar, Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C97683a aVar = (C97683a) message.obj;
            int i = message.what;
            if (i == 1) {
                aVar.getClass();
                aVar.mo67526d();
                synchronized (aVar.f286520g) {
                    aVar.f286523j = true;
                    aVar.f286520g.notify();
                }
            } else if (i == 2) {
                aVar.getClass();
            } else if (i == 3) {
                aVar.getClass();
            } else if (i == 4) {
                aVar.mo67531e();
            }
        }
    }

    /* renamed from: a */
    public C97683a mo136937a(C97688c cVar) {
        return (C97683a) ((ConcurrentHashMap) this.f286529a).get(cVar);
    }
}
