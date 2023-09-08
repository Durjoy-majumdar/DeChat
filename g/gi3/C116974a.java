package gi3;

import android.os.Looper;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: gi3.a */
public class C116974a<T> {

    /* renamed from: a */
    public HashMap<Looper, LinkedList<T>> f350534a = new HashMap<>();

    /* renamed from: b */
    public Queue<T> f350535b = new ArrayDeque();

    /* renamed from: a */
    public synchronized T mo180950a(Looper looper) {
        T t;
        t = null;
        if (((ArrayDeque) this.f350535b).size() != 0) {
            t = ((ArrayDeque) this.f350535b).poll();
        }
        return t;
    }

    /* renamed from: b */
    public synchronized void mo180951b(Looper looper) {
        if (this.f350534a.containsKey(looper)) {
            LinkedList remove = this.f350534a.remove(looper);
            if (((ArrayDeque) this.f350535b).size() < 40) {
                this.f350535b.addAll(remove);
            }
        }
    }

    /* renamed from: c */
    public synchronized void mo180952c(Looper looper, T t) {
        LinkedList linkedList;
        if (!this.f350534a.containsKey(looper)) {
            linkedList = new LinkedList();
            this.f350534a.put(looper, linkedList);
        } else {
            linkedList = this.f350534a.get(looper);
        }
        if (linkedList.size() < 20) {
            linkedList.add(t);
        }
    }
}
