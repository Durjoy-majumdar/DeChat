package e42;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.xweb.file.XVFSFile;
import e42.C7594e;
import f42.C7982d;
import gy3.C24564k0;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p971go.C87273a;
import sx3.C90363p0;
import sx3.C90364q0;
import z04.C112551y;

/* renamed from: e42.j */
public abstract class C86431j<T extends C7594e> {

    /* renamed from: a */
    public T f251227a;

    /* renamed from: b */
    public C7982d f251228b;

    /* renamed from: d */
    public final C7982d mo120841d() {
        C7982d dVar = this.f251228b;
        if (dVar != null) {
            return dVar;
        }
        C87412m.m108603p("meta");
        throw null;
    }

    /* renamed from: e */
    public abstract String mo16e();

    /* renamed from: f */
    public abstract boolean mo120839f();

    /* renamed from: g */
    public final C7596h mo120842g(int i, String str) {
        boolean z = BuildInfo.DEBUG;
        boolean z2 = false;
        if (str != null && !C112551y.m153819s(str, "fail", false)) {
            z2 = true;
        }
        if (z2) {
            str = "fail " + str;
        }
        C7596h hVar = new C7596h();
        hVar.put("errCode", i);
        hVar.put("errMsg", mo16e() + XVFSFile.PATH_SEPARATOR_CHAR + str);
        return hVar;
    }

    /* renamed from: h */
    public final C7596h mo120843h(C31415g gVar) {
        C87412m.m108594g(gVar, "error");
        boolean z = BuildInfo.DEBUG;
        String str = gVar.f84090b + "";
        if (gVar.f84089a != 0 && !C112551y.m153820t(str, "fail", false, 2, (Object) null)) {
            str = "fail " + str;
        }
        C7596h hVar = new C7596h();
        hVar.put("errCode", gVar.f84089a);
        hVar.put("errMsg", mo16e() + XVFSFile.PATH_SEPARATOR_CHAR + str);
        return hVar;
    }

    /* renamed from: i */
    public final C7596h mo120844i() {
        C7596h hVar = new C7596h();
        hVar.put("errCode", 0);
        hVar.put("errMsg", mo16e() + ":ok");
        return hVar;
    }

    /* renamed from: j */
    public final C7596h mo120845j(C7596h hVar) {
        C87412m.m108594g(hVar, "obj");
        if (BuildInfo.DEBUG) {
            hVar.opt("errMsg");
            hVar.opt("errCode");
        }
        hVar.put("errCode", 0);
        hVar.put("errMsg", mo16e() + ":ok");
        return hVar;
    }

    /* renamed from: k */
    public final C7596h mo120846k(HashMap<String, Object> hashMap) {
        C87412m.m108594g(hashMap, "map");
        C7596h hVar = new C7596h((Map<String, ? extends Object>) mo120848n(hashMap));
        mo120845j(hVar);
        return hVar;
    }

    /* renamed from: l */
    public boolean mo17l() {
        return this instanceof C87273a;
    }

    /* renamed from: m */
    public final void mo120847m(C7982d dVar) {
        C87412m.m108594g(dVar, "<set-?>");
        this.f251228b = dVar;
    }

    /* renamed from: n */
    public final Map<Object, Object> mo120848n(Map<?, ?> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C90363p0.m113142a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if ((key2 instanceof String) && C24564k0.m30744h(value)) {
                value = new JSONObject(mo120848n((Map) value));
            }
            linkedHashMap.put(key, value);
        }
        return C90364q0.m113155n(linkedHashMap);
    }
}
