package p870za;

import fy3.C32227p;
import lp3.C88631d;
import rx3.C13598b0;
import zp0.C91829i;

/* renamed from: za.b */
public final class C91625b<T> implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ C32227p<Boolean, C91829i, C13598b0> f262483a;

    public C91625b(C32227p<? super Boolean, ? super C91829i, C13598b0> pVar) {
        this.f262483a = pVar;
    }

    /* renamed from: a */
    public final void mo1720a(Object obj) {
        if (obj instanceof C91829i) {
            this.f262483a.invoke(Boolean.FALSE, obj);
        } else if (obj instanceof Throwable) {
            this.f262483a.invoke(Boolean.FALSE, new C91829i(C91829i.C91830a.SEND, 0, ((Throwable) obj).getMessage()));
        } else {
            this.f262483a.invoke(Boolean.FALSE, new C91829i(C91829i.C91830a.SEND, 0, obj != null ? obj.toString() : null));
        }
    }
}
