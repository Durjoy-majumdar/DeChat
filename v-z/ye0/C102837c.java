package ye0;

import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k14.C60949f;
import k14.C99088c;
import org.libpag.PAGView;
import rx3.C13598b0;
import rx3.C13605o;
import wx3.C15601d;
import xe0.C102626e;
import xe0.C102629f;
import ye0.C102831a;
import ze0.C103012b;

/* renamed from: ye0.c */
public final class C102837c extends C102831a {

    /* renamed from: o */
    public final C103012b f303575o;

    /* renamed from: p */
    public final C102629f f303576p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102837c(C103012b bVar, C102629f fVar) {
        super(bVar);
        C87412m.m108594g(bVar, "playConfig");
        C87412m.m108594g(fVar, "dispatcher");
        this.f303575o = bVar;
        this.f303576p = fVar;
        String str = bVar.f303964b;
        PAGView pAGView = bVar.f303961d;
        String str2 = bVar.f303962e;
        C87412m.m108594g(str, "path");
        C87412m.m108594g(pAGView, "pagView");
        String str3 = fVar.f302220a;
        Log.m105924i(str3, "[register] tag = " + str2 + ", path:" + str);
        fVar.f302221b.put(Integer.valueOf(pAGView.hashCode()), new C13605o(str, new WeakReference(pAGView), str2 == null ? "" : str2));
    }

    /* renamed from: e */
    public void mo142557e(C102831a.C102832a aVar) {
        C13598b0 b0Var;
        C102831a.C102832a aVar2 = aVar;
        C87412m.m108594g(aVar2, "result");
        C102629f fVar = this.f303576p;
        String str = this.f303575o.f303962e;
        fVar.getClass();
        Log.m105924i(fVar.f302220a, "[dispatch] tag = " + str + "，result.path = " + aVar2);
        if (aVar2 instanceof C102831a.C102832a.C102834b) {
            ConcurrentHashMap<Integer, C13605o<String, WeakReference<PAGView>, String>> concurrentHashMap = fVar.f302221b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : concurrentHashMap.entrySet()) {
                if (C87412m.m108589b(((C102831a.C102832a.C102834b) aVar2).f303570a, ((C13605o) next.getValue()).f38557d)) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                PAGView pAGView = (PAGView) ((WeakReference) ((C13605o) entry.getValue()).f38558e).get();
                if (pAGView != null) {
                    String str2 = ((C102831a.C102832a.C102834b) aVar2).f303570a;
                    C87412m.m108594g(str2, "path");
                    C99088c cVar = fVar.f302222c.get(Integer.valueOf(pAGView.hashCode()));
                    if (!(cVar != null)) {
                        cVar = null;
                    }
                    C99088c cVar2 = cVar;
                    if (cVar2 == null) {
                        cVar2 = null;
                    }
                    if (cVar2 == null) {
                        cVar2 = C60949f.m71437a(false, 1, (Object) null);
                        fVar.f302222c.put(Integer.valueOf(pAGView.hashCode()), cVar2);
                    }
                    C99088c cVar3 = cVar2;
                    Log.m105924i(fVar.f302220a, "[playPag-enter] tag:" + str + ", path:" + str2);
                    C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C102626e(cVar3, fVar, pAGView, str, str2, (C15601d<? super C102626e>) null), 2, (Object) null);
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    String str3 = fVar.f302220a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("[dispatch] not found， path:");
                    C102831a.C102832a.C102834b bVar = (C102831a.C102832a.C102834b) aVar2;
                    sb.append(bVar.f303570a);
                    Log.m105918d(str3, sb.toString());
                    fVar.mo142285a(bVar.f303570a, ((Number) entry.getKey()).intValue(), (String) null);
                }
            }
        } else if (aVar2 instanceof C102831a.C102832a.C102833a) {
            Log.m105924i(fVar.f302220a, "load pag failed result = " + aVar2);
            ConcurrentHashMap<Integer, C13605o<String, WeakReference<PAGView>, String>> concurrentHashMap2 = fVar.f302221b;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry next2 : concurrentHashMap2.entrySet()) {
                if (C87412m.m108589b(((C102831a.C102832a.C102833a) aVar2).f303568a, ((C13605o) next2.getValue()).f38557d)) {
                    linkedHashMap2.put(next2.getKey(), next2.getValue());
                }
            }
            for (Map.Entry key : linkedHashMap2.entrySet()) {
                fVar.mo142285a(((C102831a.C102832a.C102833a) aVar2).f303568a, ((Number) key.getKey()).intValue(), str);
            }
        }
    }
}
