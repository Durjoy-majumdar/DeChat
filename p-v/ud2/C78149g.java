package ud2;

import java.util.LinkedList;

/* renamed from: ud2.g */
public class C78149g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C78150h f229002d;

    public C78149g(C78150h hVar) {
        this.f229002d = hVar;
    }

    public void run() {
        if (this.f229002d.xx0() != null) {
            LinkedList linkedList = new LinkedList();
            this.f229002d.requireAccountInitialized();
            int i = 0;
            while (i < 100 && i < this.f229002d.f229005f.size()) {
                linkedList.add(this.f229002d.f229005f.get(i));
                i++;
            }
            this.f229002d.f229004e.mo73083c(linkedList);
        }
    }
}
