package p632o5;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103757e;
import androidx.lifecycle.C39623j;
import gy3.C87412m;

/* renamed from: o5.g */
public final class C109955g extends C39623j {

    /* renamed from: a */
    public static final C109955g f328982a = new C109955g();

    /* renamed from: b */
    public static final C0125s f328983b = new g$$a();

    public void addObserver(C0124r rVar) {
        C87412m.m108594g(rVar, "observer");
        if (rVar instanceof C103757e) {
            C103757e eVar = (C103757e) rVar;
            C0125s sVar = f328983b;
            eVar.onCreate(sVar);
            eVar.onStart(sVar);
            eVar.onResume(sVar);
            return;
        }
        throw new IllegalArgumentException((rVar + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
    }

    public C39623j.C39626c getCurrentState() {
        return C39623j.C39626c.RESUMED;
    }

    public void removeObserver(C0124r rVar) {
        C87412m.m108594g(rVar, "observer");
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
