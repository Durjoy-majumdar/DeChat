package wj2;

import c30.C104289g;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import wj2.C66135h;

/* renamed from: wj2.a */
public final class C66128a implements Comparable<C66128a> {

    /* renamed from: d */
    public C66132f f190059d;

    /* renamed from: e */
    public String f190060e;

    /* renamed from: f */
    public long f190061f;

    public C66128a() {
        this((C66132f) null, (String) null, 0, 7, (C8480h) null);
    }

    public C66128a(C66132f fVar, String str, long j, int i, C8480h hVar) {
        fVar = (i & 1) != 0 ? null : fVar;
        str = (i & 2) != 0 ? null : str;
        j = (i & 4) != 0 ? 0 : j;
        this.f190059d = fVar;
        this.f190060e = str;
        this.f190061f = j;
    }

    /* renamed from: a */
    public final C66128a mo90165a(String str) {
        C87412m.m108594g(str, "json");
        C66128a aVar = new C66128a((C66132f) null, (String) null, 0, 7, (C8480h) null);
        C104289g gVar = new C104289g(str);
        try {
            C66135h.C66136a aVar2 = C66135h.f190107E;
            String string = gVar.getString("info");
            C87412m.m108593f(string, "jsonObject.getString(\"info\")");
            aVar.f190059d = aVar2.mo90190f(string);
            aVar.f190060e = gVar.getString("name");
            aVar.f190061f = gVar.getLong("order");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.ExclusiveInfo", "ExclusiveInfo fromJson fail:" + e);
        }
        return aVar;
    }

    public int compareTo(Object obj) {
        C66128a aVar = (C66128a) obj;
        C87412m.m108594g(aVar, "other");
        return C87412m.m108597j(this.f190061f, aVar.f190061f);
    }
}
