package wb1;

import wb1.C102415t;

/* renamed from: wb1.s */
public class C102414s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C102415t.C102416a f301643d;

    /* renamed from: e */
    public final /* synthetic */ C102415t f301644e;

    public C102414s(C102415t tVar, C102415t.C102416a aVar) {
        this.f301644e = tVar;
        this.f301643d = aVar;
    }

    public void run() {
        C102415t.m135134a(this.f301644e, this.f301643d, false);
    }

    public String toString() {
        return super.toString() + "|retryJob";
    }
}
