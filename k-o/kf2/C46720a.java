package kf2;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: kf2.a */
public final class C46720a {

    /* renamed from: a */
    public static final C46720a f125771a = new C46720a();

    /* renamed from: b */
    public static long f125772b;

    /* renamed from: c */
    public static final Map<Integer, C46721b> f125773c = new HashMap();

    /* renamed from: d */
    public static final ArrayList<C46721b> f125774d = new ArrayList<>();

    /* renamed from: a */
    public final void mo71961a(C46721b bVar) {
        C87412m.m108594g(bVar, "event");
        if (bVar.f125776b) {
            ((HashMap) f125773c).put(Integer.valueOf(bVar.f125775a), bVar);
            return;
        }
        f125774d.add(bVar);
    }
}
