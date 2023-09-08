package p212oe;

import java.util.LinkedHashMap;
import p210o.C11323a;
import p329d3.C86165a;

/* renamed from: oe.q$$w */
public final /* synthetic */ class q$$w implements C11323a {

    /* renamed from: a */
    public final /* synthetic */ C86165a f352262a;

    public /* synthetic */ q$$w(C86165a aVar) {
        this.f352262a = aVar;
    }

    public final Object apply(Object obj) {
        C86165a aVar = this.f352262a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ((C86165a) obj).accept(linkedHashMap);
        if (aVar != null) {
            aVar.accept(linkedHashMap);
        }
        return linkedHashMap;
    }
}
