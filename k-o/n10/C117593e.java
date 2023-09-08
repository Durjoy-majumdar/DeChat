package n10;

import gy3.C8480h;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.renderer.RenderSurface;

/* renamed from: n10.e */
public final class C117593e {

    /* renamed from: e */
    public static final C117594a f351816e = new C117594a((C8480h) null);

    /* renamed from: f */
    public static final HashMap<String, C117593e> f351817f = new HashMap<>();

    /* renamed from: a */
    public final String f351818a = "MicroMsg.FlutterViewEngine.Stack";

    /* renamed from: b */
    public final ArrayList<C117595b> f351819b = new ArrayList<>();

    /* renamed from: c */
    public final HashSet<Integer> f351820c = new HashSet<>();

    /* renamed from: d */
    public int f351821d;

    /* renamed from: n10.e$a */
    public static final class C117594a {
        public C117594a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C117593e mo182322a(String str) {
            C87412m.m108594g(str, "engineGroupId");
            if (str.length() == 0) {
                return null;
            }
            HashMap<String, C117593e> hashMap = C117593e.f351817f;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new C117593e());
            }
            return hashMap.get(str);
        }
    }

    /* renamed from: n10.e$b */
    public static final class C117595b {

        /* renamed from: a */
        public final int f351822a;

        /* renamed from: b */
        public final WeakReference<FlutterEngine> f351823b;

        /* renamed from: c */
        public final RenderSurface f351824c;

        /* renamed from: d */
        public boolean f351825d;

        public C117595b(int i, WeakReference weakReference, RenderSurface renderSurface, boolean z, int i2, C8480h hVar) {
            z = (i2 & 8) != 0 ? false : z;
            C87412m.m108594g(weakReference, "engine");
            this.f351822a = i;
            this.f351823b = weakReference;
            this.f351824c = renderSurface;
            this.f351825d = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C117595b)) {
                return false;
            }
            C117595b bVar = (C117595b) obj;
            return this.f351822a == bVar.f351822a && C87412m.m108589b(this.f351823b, bVar.f351823b) && C87412m.m108589b(this.f351824c, bVar.f351824c) && this.f351825d == bVar.f351825d;
        }

        public int hashCode() {
            int hashCode = ((this.f351822a * 31) + this.f351823b.hashCode()) * 31;
            RenderSurface renderSurface = this.f351824c;
            int hashCode2 = (hashCode + (renderSurface == null ? 0 : renderSurface.hashCode())) * 31;
            boolean z = this.f351825d;
            if (z) {
                z = true;
            }
            return hashCode2 + (z ? 1 : 0);
        }

        public String toString() {
            return "ViewStackData(hash=" + this.f351822a + ", engine=" + this.f351823b + ", renderSurface=" + this.f351824c + ", finishing=" + this.f351825d + ')';
        }
    }

    /* renamed from: a */
    public final C117595b mo182321a() {
        C117595b bVar;
        ArrayList<C117595b> arrayList = this.f351819b;
        ListIterator<C117595b> listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                bVar = null;
                break;
            }
            bVar = listIterator.previous();
            if (!bVar.f351825d) {
                break;
            }
        }
        return bVar;
    }
}
