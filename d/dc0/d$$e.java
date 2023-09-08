package dc0;

import eb0.C75597w2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class d$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f83428d;

    /* renamed from: e */
    public final /* synthetic */ boolean f83429e;

    /* renamed from: f */
    public final /* synthetic */ C31113d f83430f;

    public d$$e(C31113d dVar, String str, boolean z) {
        this.f83430f = dVar;
        this.f83428d = str;
        this.f83429e = z;
    }

    public void run() {
        LinkedList linkedList;
        if (((HashMap) this.f83430f.f83417c).containsKey(this.f83428d)) {
            synchronized (this) {
                linkedList = (LinkedList) ((HashMap) this.f83430f.f83417c).get(this.f83428d);
                ((HashMap) this.f83430f.f83417c).remove(this.f83428d);
            }
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((C75597w2.C31525a) it.next()).mo1109a(this.f83428d, this.f83429e);
                }
            }
        }
    }
}
