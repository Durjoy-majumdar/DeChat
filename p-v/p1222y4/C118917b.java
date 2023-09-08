package p1222y4;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import p1206p4.C117974f;
import p1206p4.C117979k;
import p1221x4.C118850q;

/* renamed from: y4.b */
public class C118917b extends C118919d {

    /* renamed from: e */
    public final /* synthetic */ C117979k f356192e;

    /* renamed from: f */
    public final /* synthetic */ String f356193f;

    public C118917b(C117979k kVar, String str) {
        this.f356192e = kVar;
        this.f356193f = str;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public void mo183600b() {
        WorkDatabase workDatabase = this.f356192e.f352606c;
        workDatabase.mo183703c();
        try {
            Iterator it = ((ArrayList) ((C118850q) workDatabase.mo165532n()).mo183559h(this.f356193f)).iterator();
            while (it.hasNext()) {
                mo183601a(this.f356192e, (String) it.next());
            }
            workDatabase.mo183706h();
            workDatabase.mo183704f();
            C117979k kVar = this.f356192e;
            C117974f.m166380a(kVar.f352605b, kVar.f352606c, kVar.f352608e);
        } catch (Throwable th) {
            workDatabase.mo183704f();
            throw th;
        }
    }
}
