package p515f2;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p146e2.C107162e;
import p486d2.C106971a;
import p486d2.C106974e;
import p486d2.C31047d;
import sx3.C36907w;

/* renamed from: f2.a */
public final class C107446a {

    /* renamed from: a */
    public static final C107446a f321465a = new C107446a();

    /* renamed from: a */
    public final Object mo157833a(C106974e eVar) {
        C87412m.m108594g(eVar, "localeList");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(eVar, 10));
        Iterator<C31047d> it = eVar.iterator();
        while (it.hasNext()) {
            C31047d next = it.next();
            C87412m.m108594g(next, "<this>");
            arrayList.add(((C106971a) next.f83288a).f320204a);
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        if (array != null) {
            Locale[] localeArr = (Locale[]) array;
            return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    /* renamed from: b */
    public final void mo157834b(C107162e eVar, C106974e eVar2) {
        C87412m.m108594g(eVar, "textPaint");
        C87412m.m108594g(eVar2, "localeList");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(eVar2, 10));
        Iterator<C31047d> it = eVar2.iterator();
        while (it.hasNext()) {
            C31047d next = it.next();
            C87412m.m108594g(next, "<this>");
            arrayList.add(((C106971a) next.f83288a).f320204a);
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        if (array != null) {
            Locale[] localeArr = (Locale[]) array;
            eVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
