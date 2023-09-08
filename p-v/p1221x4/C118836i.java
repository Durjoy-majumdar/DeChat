package p1221x4;

import android.database.Cursor;
import android.os.CancellationSignal;
import p1188d4.C116569f;
import p1191e4.C116690e;
import p1191e4.C116691f;
import p1223z3.C119029b;
import p1223z3.C119038g;
import p1223z3.C119046i;
import p1223z3.C119048k;
import p452b4.C113139b;
import p452b4.C113140c;

/* renamed from: x4.i */
public final class C118836i implements C118835h {

    /* renamed from: a */
    public final C119038g f355531a;

    /* renamed from: b */
    public final C119029b<C118834g> f355532b;

    /* renamed from: c */
    public final C119048k f355533c;

    /* renamed from: x4.i$a */
    public class C118837a extends C119029b<C118834g> {
        public C118837a(C118836i iVar, C119038g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo183531b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        /* renamed from: d */
        public void mo183532d(C116569f fVar, Object obj) {
            C118834g gVar = (C118834g) obj;
            String str = gVar.f355529a;
            if (str == null) {
                ((C116690e) fVar).bindNull(1);
            } else {
                ((C116690e) fVar).bindString(1, str);
            }
            ((C116690e) fVar).bindLong(2, (long) gVar.f355530b);
        }
    }

    /* renamed from: x4.i$b */
    public class C118838b extends C119048k {
        public C118838b(C118836i iVar, C119038g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo183531b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C118836i(C119038g gVar) {
        this.f355531a = gVar;
        this.f355532b = new C118837a(this, gVar);
        this.f355533c = new C118838b(this, gVar);
    }

    /* renamed from: a */
    public C118834g mo183539a(String str) {
        C119046i c = C119046i.m167801c("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            c.bindNull(1);
        } else {
            c.bindString(1, str);
        }
        this.f355531a.mo183702b();
        C118834g gVar = null;
        Cursor a = C113140c.m154797a(this.f355531a, c, false, (CancellationSignal) null);
        try {
            int a2 = C113139b.m154796a(a, "work_spec_id");
            int a3 = C113139b.m154796a(a, "system_id");
            if (a.moveToFirst()) {
                gVar = new C118834g(a.getString(a2), a.getInt(a3));
            }
            return gVar;
        } finally {
            a.close();
            c.mo183710d();
        }
    }

    /* renamed from: b */
    public void mo183540b(C118834g gVar) {
        this.f355531a.mo183702b();
        this.f355531a.mo183703c();
        try {
            this.f355532b.mo183689e(gVar);
            this.f355531a.mo183706h();
        } finally {
            this.f355531a.mo183704f();
        }
    }

    /* renamed from: c */
    public void mo183541c(String str) {
        this.f355531a.mo183702b();
        C116691f a = this.f355533c.mo183713a();
        if (str == null) {
            ((C116690e) a).bindNull(1);
        } else {
            ((C116690e) a).bindString(1, str);
        }
        this.f355531a.mo183703c();
        try {
            a = (C116691f) a;
            a.mo180702a();
            this.f355531a.mo183706h();
        } finally {
            this.f355531a.mo183704f();
            this.f355533c.mo183714c(a);
        }
    }
}
