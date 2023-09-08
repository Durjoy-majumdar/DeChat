package k31;

import a41.C112755a;
import a41.C112756b;
import java.util.List;
import java.util.Map;
import p31.C117921a;
import r31.C118219b;
import u24.C90599h;
import y31.C118914a;
import y31.C118915b;

public final /* synthetic */ class a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117373a f351387d;

    /* renamed from: e */
    public final /* synthetic */ C117921a f351388e;

    /* renamed from: f */
    public final /* synthetic */ C112756b f351389f;

    /* renamed from: g */
    public final /* synthetic */ List f351390g;

    /* renamed from: h */
    public final /* synthetic */ boolean f351391h;

    /* renamed from: i */
    public final /* synthetic */ long f351392i;

    /* renamed from: j */
    public final /* synthetic */ List f351393j;

    public /* synthetic */ a$$a(C117373a aVar, C117921a aVar2, C112756b bVar, List list, boolean z, long j, List list2) {
        this.f351387d = aVar;
        this.f351388e = aVar2;
        this.f351389f = bVar;
        this.f351390g = list;
        this.f351391h = z;
        this.f351392i = j;
        this.f351393j = list2;
    }

    public final void run() {
        Map<String, Object> map;
        C117373a aVar = this.f351387d;
        C117921a aVar2 = this.f351388e;
        C112756b bVar = this.f351389f;
        List list = this.f351390g;
        boolean z = this.f351391h;
        long j = this.f351392i;
        List list2 = this.f351393j;
        aVar.getClass();
        if (C90599h.m113509b(aVar2.f352454b, "view_clk") && (map = aVar2.f352455c) != null) {
            Object obj = map.get("view_id");
            if (obj == null || !(obj instanceof String)) {
                aVar.f351384j.f353464h = "";
            } else {
                aVar.f351384j.f353464h = (String) obj;
            }
        }
        C112755a aVar3 = new C112755a();
        String str = aVar2.f352454b;
        aVar3.f337630a = str;
        C118915b bVar2 = aVar.f351380f.f353453c;
        if (bVar2 != null) {
            if (bVar == null && aVar2.f352457e) {
                aVar3.mo164511a(((C118914a) bVar2).mo183599a(list, C118219b.m166774a(str, C118219b.m166776c(aVar.f351384j.f353458b)), aVar2.f352455c, true));
            } else if (z) {
                aVar3.mo164511a(((C118914a) bVar2).mo183599a(list, C118219b.m166774a(str, bVar), aVar2.f352455c, false));
            } else {
                aVar3.mo164511a(((C118914a) bVar2).mo183599a(list, C118219b.m166774a(str, C118219b.m166776c(bVar)), aVar2.f352455c, false));
            }
        }
        aVar.Dx0(j, aVar3, list2);
    }
}
