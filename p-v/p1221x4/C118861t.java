package p1221x4;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import p1188d4.C116569f;
import p1191e4.C116690e;
import p1223z3.C119029b;
import p1223z3.C119038g;
import p1223z3.C119046i;
import p452b4.C113140c;

/* renamed from: x4.t */
public final class C118861t implements C118860s {

    /* renamed from: a */
    public final C119038g f355572a;

    /* renamed from: b */
    public final C119029b<C118859r> f355573b;

    /* renamed from: x4.t$a */
    public class C118862a extends C119029b<C118859r> {
        public C118862a(C118861t tVar, C119038g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo183531b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: d */
        public void mo183532d(C116569f fVar, Object obj) {
            C118859r rVar = (C118859r) obj;
            String str = rVar.f355570a;
            if (str == null) {
                ((C116690e) fVar).bindNull(1);
            } else {
                ((C116690e) fVar).bindString(1, str);
            }
            String str2 = rVar.f355571b;
            if (str2 == null) {
                ((C116690e) fVar).bindNull(2);
            } else {
                ((C116690e) fVar).bindString(2, str2);
            }
        }
    }

    public C118861t(C119038g gVar) {
        this.f355572a = gVar;
        this.f355573b = new C118862a(this, gVar);
    }

    /* renamed from: a */
    public List<String> mo183568a(String str) {
        C119046i c = C119046i.m167801c("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            c.bindNull(1);
        } else {
            c.bindString(1, str);
        }
        this.f355572a.mo183702b();
        Cursor a = C113140c.m154797a(this.f355572a, c, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                arrayList.add(a.getString(0));
            }
            return arrayList;
        } finally {
            a.close();
            c.mo183710d();
        }
    }
}
