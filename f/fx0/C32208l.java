package fx0;

import hp3.C87581a;
import java.util.LinkedList;
import java.util.List;

/* renamed from: fx0.l */
public class C32208l implements C87581a<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ List f85610a;

    /* renamed from: b */
    public final /* synthetic */ List f85611b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f85612c;

    /* renamed from: d */
    public final /* synthetic */ C32209n f85613d;

    public C32208l(C32209n nVar, List list, List list2, Runnable runnable) {
        this.f85613d = nVar;
        this.f85610a = list;
        this.f85611b = list2;
        this.f85612c = runnable;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        ((LinkedList) this.f85613d.f85615e).clear();
        ((LinkedList) this.f85613d.f85616f).clear();
        ((LinkedList) this.f85613d.f85615e).addAll(this.f85610a);
        ((LinkedList) this.f85613d.f85616f).addAll(this.f85611b);
        this.f85612c.run();
        return null;
    }
}
