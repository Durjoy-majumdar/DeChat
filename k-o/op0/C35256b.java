package op0;

import java.util.LinkedList;

/* renamed from: op0.b */
public final class C35256b {

    /* renamed from: a */
    public volatile int f94478a;

    /* renamed from: b */
    public final LinkedList<Runnable> f94479b = new LinkedList<>();

    public C35256b(int i) {
        this.f94478a = i;
    }

    /* renamed from: a */
    public void mo59925a(Runnable runnable) {
        LinkedList<Runnable> linkedList;
        synchronized (this) {
            if (runnable != null) {
                this.f94479b.addLast(runnable);
            }
            int i = this.f94478a - 1;
            this.f94478a = i;
            if (i > 0 || this.f94479b.size() <= 0) {
                linkedList = null;
            } else {
                linkedList = new LinkedList<>();
                linkedList.addAll(this.f94479b);
                this.f94479b.clear();
            }
        }
        if (linkedList != null) {
            for (Runnable run : linkedList) {
                run.run();
            }
        }
    }
}
