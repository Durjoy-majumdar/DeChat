package p1221x4;

import android.database.Cursor;
import android.os.CancellationSignal;
import p1188d4.C116569f;
import p1191e4.C116690e;
import p1223z3.C119029b;
import p1223z3.C119038g;
import p1223z3.C119046i;
import p452b4.C113140c;

/* renamed from: x4.f */
public final class C118832f implements C118831e {

    /* renamed from: a */
    public final C119038g f355527a;

    /* renamed from: b */
    public final C119029b<C118830d> f355528b;

    /* renamed from: x4.f$a */
    public class C118833a extends C119029b<C118830d> {
        public C118833a(C118832f fVar, C119038g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo183531b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* renamed from: d */
        public void mo183532d(C116569f fVar, Object obj) {
            C118830d dVar = (C118830d) obj;
            String str = dVar.f355525a;
            if (str == null) {
                ((C116690e) fVar).bindNull(1);
            } else {
                ((C116690e) fVar).bindString(1, str);
            }
            Long l = dVar.f355526b;
            if (l == null) {
                ((C116690e) fVar).bindNull(2);
                return;
            }
            ((C116690e) fVar).bindLong(2, l.longValue());
        }
    }

    public C118832f(C119038g gVar) {
        this.f355527a = gVar;
        this.f355528b = new C118833a(this, gVar);
    }

    /* renamed from: a */
    public Long mo183535a(String str) {
        C119046i c = C119046i.m167801c("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            c.bindNull(1);
        } else {
            c.bindString(1, str);
        }
        this.f355527a.mo183702b();
        Long l = null;
        Cursor a = C113140c.m154797a(this.f355527a, c, false, (CancellationSignal) null);
        try {
            if (a.moveToFirst()) {
                if (!a.isNull(0)) {
                    l = Long.valueOf(a.getLong(0));
                }
            }
            return l;
        } finally {
            a.close();
            c.mo183710d();
        }
    }

    /* renamed from: b */
    public void mo183536b(C118830d dVar) {
        this.f355527a.mo183702b();
        this.f355527a.mo183703c();
        try {
            this.f355528b.mo183689e(dVar);
            this.f355527a.mo183706h();
        } finally {
            this.f355527a.mo183704f();
        }
    }
}
