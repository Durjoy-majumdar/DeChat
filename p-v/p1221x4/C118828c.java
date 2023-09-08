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

/* renamed from: x4.c */
public final class C118828c implements C118827b {

    /* renamed from: a */
    public final C119038g f355523a;

    /* renamed from: b */
    public final C119029b<C118826a> f355524b;

    /* renamed from: x4.c$a */
    public class C118829a extends C119029b<C118826a> {
        public C118829a(C118828c cVar, C119038g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo183531b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* renamed from: d */
        public void mo183532d(C116569f fVar, Object obj) {
            C118826a aVar = (C118826a) obj;
            String str = aVar.f355521a;
            if (str == null) {
                ((C116690e) fVar).bindNull(1);
            } else {
                ((C116690e) fVar).bindString(1, str);
            }
            String str2 = aVar.f355522b;
            if (str2 == null) {
                ((C116690e) fVar).bindNull(2);
            } else {
                ((C116690e) fVar).bindString(2, str2);
            }
        }
    }

    public C118828c(C119038g gVar) {
        this.f355523a = gVar;
        this.f355524b = new C118829a(this, gVar);
    }

    /* renamed from: a */
    public List<String> mo183529a(String str) {
        C119046i c = C119046i.m167801c("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c.bindNull(1);
        } else {
            c.bindString(1, str);
        }
        this.f355523a.mo183702b();
        Cursor a = C113140c.m154797a(this.f355523a, c, false, (CancellationSignal) null);
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

    /* renamed from: b */
    public boolean mo183530b(String str) {
        boolean z = true;
        C119046i c = C119046i.m167801c("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            c.bindNull(1);
        } else {
            c.bindString(1, str);
        }
        this.f355523a.mo183702b();
        boolean z2 = false;
        Cursor a = C113140c.m154797a(this.f355523a, c, false, (CancellationSignal) null);
        try {
            if (a.moveToFirst()) {
                if (a.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            a.close();
            c.mo183710d();
        }
    }
}
