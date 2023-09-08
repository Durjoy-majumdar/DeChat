package p1222y4;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import p1206p4.C117974f;
import p1206p4.C117979k;

/* renamed from: y4.a */
public class C118916a extends C118919d {

    /* renamed from: e */
    public final /* synthetic */ C117979k f356190e;

    /* renamed from: f */
    public final /* synthetic */ UUID f356191f;

    public C118916a(C117979k kVar, UUID uuid) {
        this.f356190e = kVar;
        this.f356191f = uuid;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public void mo183600b() {
        WorkDatabase workDatabase = this.f356190e.f352606c;
        workDatabase.mo183703c();
        try {
            mo183601a(this.f356190e, this.f356191f.toString());
            workDatabase.mo183706h();
            workDatabase.mo183704f();
            C117979k kVar = this.f356190e;
            C117974f.m166380a(kVar.f352605b, kVar.f352606c, kVar.f352608e);
        } catch (Throwable th) {
            workDatabase.mo183704f();
            throw th;
        }
    }
}
