package en3;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

/* renamed from: en3.h */
public class C97680h extends RecyclerView.C16623q {

    /* renamed from: c */
    public final ConcurrentHashMap<Integer, ConcurrentLinkedDeque<RecyclerView.C16631z>> f286506c = new ConcurrentHashMap<>();

    /* renamed from: a */
    public void mo17334a() {
        this.f286506c.clear();
    }

    /* renamed from: b */
    public RecyclerView.C16631z mo10383b(int i) {
        ConcurrentLinkedDeque concurrentLinkedDeque = this.f286506c.get(Integer.valueOf(i));
        if (concurrentLinkedDeque != null) {
            return (RecyclerView.C16631z) concurrentLinkedDeque.pollFirst();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        r2 = new java.util.concurrent.ConcurrentLinkedDeque<>();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10384d(androidx.recyclerview.widget.RecyclerView.C16631z r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0022
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.concurrent.ConcurrentLinkedDeque<androidx.recyclerview.widget.RecyclerView$z>> r0 = r3.f286506c
            int r1 = r4.f44859i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r0.get(r1)
            if (r2 != 0) goto L_0x001d
            java.util.concurrent.ConcurrentLinkedDeque r2 = new java.util.concurrent.ConcurrentLinkedDeque
            r2.<init>()
            java.lang.Object r0 = r0.putIfAbsent(r1, r2)
            if (r0 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r2 = r0
        L_0x001d:
            java.util.concurrent.ConcurrentLinkedDeque r2 = (java.util.concurrent.ConcurrentLinkedDeque) r2
            r2.offerLast(r4)
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: en3.C97680h.mo10384d(androidx.recyclerview.widget.RecyclerView$z):void");
    }
}
