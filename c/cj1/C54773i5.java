package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import java.util.HashMap;
import rx3.C13598b0;

/* renamed from: cj1.i5 */
public final class C54773i5 {

    /* renamed from: a */
    public static final C54773i5 f153520a = new C54773i5();

    /* renamed from: b */
    public static final HashMap<String, C32224a<C13598b0>> f153521b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<String, C32224a<C13598b0>> f153522c = new HashMap<>();

    /* renamed from: d */
    public static final HashMap<String, C32224a<C13598b0>> f153523d = new HashMap<>();

    /* renamed from: e */
    public static final HashMap<String, C32224a<C13598b0>> f153524e = new HashMap<>();

    /* renamed from: f */
    public static final HashMap<String, C32224a<C13598b0>> f153525f = new HashMap<>();

    /* renamed from: g */
    public static final HashMap<String, C32226l<Boolean, C13598b0>> f153526g = new HashMap<>();

    /* renamed from: h */
    public static final HashMap<String, C32226l<Boolean, C13598b0>> f153527h = new HashMap<>();

    /* renamed from: a */
    public final void mo75678a(String str, C32224a<C13598b0> aVar) {
        C87412m.m108594g(str, "key");
        Log.m105924i("Finder.FinderLiveSysMsgCallback", "register close live callback");
        if (aVar != null) {
            HashMap<String, C32224a<C13598b0>> hashMap = f153524e;
            if (hashMap.get(str) == null) {
                hashMap.put(str, aVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo75679b() {
        Log.m105924i("Finder.FinderLiveSysMsgCallback", "release callback");
        f153521b.clear();
        f153522c.clear();
        f153523d.clear();
        f153524e.clear();
        f153525f.clear();
        f153526g.clear();
        f153527h.clear();
    }
}
