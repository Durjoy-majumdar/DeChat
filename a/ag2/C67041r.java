package ag2;

import ag2.C67042s;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ag2.r */
public class C67041r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C67042s.C67043a f192586d;

    public C67041r(C67042s.C67043a aVar) {
        this.f192586d = aVar;
    }

    public void run() {
        Iterator it = ((ArrayList) C67042s.this.f192589c).iterator();
        while (it.hasNext()) {
            ((C67042s.C67044b) it.next()).mo91029a();
        }
    }
}
