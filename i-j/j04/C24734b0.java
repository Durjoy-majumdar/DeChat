package j04;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32226l;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import qz3.C26019c;
import qz3.C26049m;
import sx3.C36907w;
import sx3.C90363p0;
import sz3.C110828a;
import sz3.C26243c;
import vz3.C26408b;
import wy3.C26521y0;

/* renamed from: j04.b0 */
public final class C24734b0 implements C24755h {

    /* renamed from: a */
    public final C26243c f70572a;

    /* renamed from: b */
    public final C110828a f70573b;

    /* renamed from: c */
    public final C32226l<C26408b, C26521y0> f70574c;

    /* renamed from: d */
    public final Map<C26408b, C26019c> f70575d;

    public C24734b0(C26049m mVar, C26243c cVar, C110828a aVar, C32226l<? super C26408b, ? extends C26521y0> lVar) {
        C87412m.m108594g(mVar, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(cVar, "nameResolver");
        C87412m.m108594g(aVar, "metadataVersion");
        C87412m.m108594g(lVar, "classSource");
        this.f70572a = cVar;
        this.f70573b = aVar;
        this.f70574c = lVar;
        List<C26019c> list = mVar.f72684j;
        C87412m.m108593f(list, "proto.class_List");
        int a = C90363p0.m113142a(C36907w.m41090l(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(a < 16 ? 16 : a);
        for (T next : list) {
            linkedHashMap.put(C24732a0.m31109a(this.f70572a, ((C26019c) next).f72491h), next);
        }
        this.f70575d = linkedHashMap;
    }

    /* renamed from: a */
    public C24747g mo51710a(C26408b bVar) {
        C87412m.m108594g(bVar, "classId");
        C26019c cVar = (C26019c) ((LinkedHashMap) this.f70575d).get(bVar);
        if (cVar == null) {
            return null;
        }
        return new C24747g(this.f70572a, cVar, this.f70573b, this.f70574c.invoke(bVar));
    }
}
