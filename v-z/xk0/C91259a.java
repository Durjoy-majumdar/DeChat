package xk0;

import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: xk0.a */
public final class C91259a {

    /* renamed from: c */
    public static final C91261b f261849c = new C91261b((C8480h) null);

    /* renamed from: d */
    public static final HashMap<String, C91259a> f261850d = new HashMap<>();

    /* renamed from: a */
    public final String f261851a;

    /* renamed from: b */
    public final ConcurrentHashMap<Integer, C91262c> f261852b = new ConcurrentHashMap<>();

    /* renamed from: xk0.a$a */
    public static final class C91260a extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ C91259a f261853d;

        public C91260a(C91259a aVar) {
            this.f261853d = aVar;
        }

        /* renamed from: c */
        public void mo109497c() {
            C91261b bVar = C91259a.f261849c;
            String str = this.f261853d.f261851a;
            C87412m.m108594g(str, "appId");
            HashMap<String, C91259a> hashMap = C91259a.f261850d;
            synchronized (hashMap) {
                C91259a remove = hashMap.remove(str);
            }
        }
    }

    /* renamed from: xk0.a$b */
    public static final class C91261b {
        public C91261b(C8480h hVar) {
        }

        /* renamed from: a */
        public final C91259a mo125282a(String str) {
            C87412m.m108594g(str, "appId");
            HashMap<String, C91259a> hashMap = C91259a.f261850d;
            synchronized (hashMap) {
                C91259a aVar = hashMap.get(str);
                if (aVar != null) {
                    return aVar;
                }
                C91259a aVar2 = new C91259a(str);
                hashMap.put(str, aVar2);
                return aVar2;
            }
        }
    }

    /* renamed from: xk0.a$c */
    public static final class C91262c {

        /* renamed from: a */
        public final MagicBrushView f261854a;

        /* renamed from: b */
        public boolean f261855b;

        public C91262c(MagicBrushView magicBrushView) {
            C87412m.m108594g(magicBrushView, "view");
            this.f261854a = magicBrushView;
        }
    }

    public C91259a(String str) {
        C87412m.m108594g(str, "appId");
        this.f261851a = str;
        C83231l.m102140a(str, new C91260a(this));
    }

    /* renamed from: a */
    public final void mo125278a(int i, MagicBrushView magicBrushView) {
        C87412m.m108594g(magicBrushView, "view");
        this.f261852b.put(Integer.valueOf(i), new C91262c(magicBrushView));
    }

    /* renamed from: b */
    public final void mo125279b(int i) {
        C91262c cVar = this.f261852b.get(Integer.valueOf(i));
        if (cVar != null) {
            cVar.f261855b = false;
        }
    }

    /* renamed from: c */
    public final void mo125280c(int i) {
        C91262c cVar = this.f261852b.get(Integer.valueOf(i));
        if (cVar != null) {
            cVar.f261855b = true;
        }
    }

    /* renamed from: d */
    public final int mo125281d() {
        ConcurrentHashMap<Integer, C91262c> concurrentHashMap = this.f261852b;
        int i = 0;
        if (!concurrentHashMap.isEmpty()) {
            for (Map.Entry<Integer, C91262c> value : concurrentHashMap.entrySet()) {
                if (((C91262c) value.getValue()).f261855b) {
                    i++;
                }
            }
        }
        return i;
    }
}
