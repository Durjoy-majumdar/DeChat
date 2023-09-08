package wq3;

import com.tencent.p014mm.sdk.platformtools.LruCache;
import gy3.C87412m;

/* renamed from: wq3.w */
public final class C66178w implements C91096l {

    /* renamed from: a */
    public static final C66178w f190194a = new C66178w();

    /* renamed from: b */
    public static final LruCache<Integer, Object> f190195b = new LruCache<>(100);

    /* renamed from: a */
    public Object mo90274a(int i) {
        return f190195b.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public void mo90275b() {
        f190195b.evictAll();
    }

    /* renamed from: c */
    public void mo90276c(int i, Object obj) {
        C87412m.m108594g(obj, "resValue");
        f190195b.put(Integer.valueOf(i), obj);
    }
}
