package y50;

import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: y50.k */
public final class C53496k {

    /* renamed from: a */
    public static final C53496k f150436a = new C53496k();

    /* renamed from: b */
    public static final HashMap<String, C32224a<C13598b0>> f150437b = new HashMap<>();

    /* renamed from: c */
    public static final Map<String, C32224a<C13598b0>> f150438c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    public static final HashMap<String, C32226l<String, C13598b0>> f150439d = new HashMap<>();

    /* renamed from: e */
    public static final HashMap<String, C32227p<Boolean, String, C13598b0>> f150440e = new HashMap<>();

    /* renamed from: f */
    public static final HashMap<String, C32224a<C13598b0>> f150441f = new HashMap<>();

    /* renamed from: g */
    public static final Map<String, C32224a<C13598b0>> f150442g = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public final void mo74168a(boolean z, String str) {
        C87412m.m108594g(str, "callingUser");
        for (Map.Entry<String, C32227p<Boolean, String, C13598b0>> value : f150440e.entrySet()) {
            ((C32227p) value.getValue()).invoke(Boolean.valueOf(z), str);
        }
    }

    /* renamed from: b */
    public final void mo74169b() {
        Map<String, C32224a<C13598b0>> map = f150438c;
        C87412m.m108593f(map, "liveMessageCallbacks");
        synchronized (map) {
            for (Map.Entry<String, C32224a<C13598b0>> value : map.entrySet()) {
                ((C32224a) value.getValue()).invoke();
            }
        }
    }

    /* renamed from: c */
    public final void mo74170c() {
        Map<String, C32224a<C13598b0>> map = f150442g;
        C87412m.m108593f(map, "liveSlowMessageCallbacks");
        synchronized (map) {
            for (Map.Entry<String, C32224a<C13598b0>> value : map.entrySet()) {
                ((C32224a) value.getValue()).invoke();
            }
        }
    }

    /* renamed from: d */
    public final void mo74171d(String str, C32224a<C13598b0> aVar) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(aVar, "callback");
        Map<String, C32224a<C13598b0>> map = f150438c;
        C87412m.m108593f(map, "liveMessageCallbacks");
        map.put(str, aVar);
    }

    /* renamed from: e */
    public final void mo74172e(String str, C32224a<C13598b0> aVar) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(aVar, "callback");
        Map<String, C32224a<C13598b0>> map = f150442g;
        C87412m.m108593f(map, "liveSlowMessageCallbacks");
        map.put(str, aVar);
    }

    /* renamed from: f */
    public final void mo74173f() {
        f150438c.clear();
        f150442g.clear();
        f150439d.clear();
        f150440e.clear();
        f150437b.clear();
        f150441f.clear();
    }
}
