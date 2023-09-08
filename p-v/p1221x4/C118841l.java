package p1221x4;

import p1188d4.C116569f;
import p1191e4.C116690e;
import p1223z3.C119029b;
import p1223z3.C119038g;

/* renamed from: x4.l */
public final class C118841l implements C118840k {

    /* renamed from: a */
    public final C119038g f355536a;

    /* renamed from: b */
    public final C119029b<C118839j> f355537b;

    /* renamed from: x4.l$a */
    public class C118842a extends C119029b<C118839j> {
        public C118842a(C118841l lVar, C119038g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo183531b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: d */
        public void mo183532d(C116569f fVar, Object obj) {
            C118839j jVar = (C118839j) obj;
            String str = jVar.f355534a;
            if (str == null) {
                ((C116690e) fVar).bindNull(1);
            } else {
                ((C116690e) fVar).bindString(1, str);
            }
            String str2 = jVar.f355535b;
            if (str2 == null) {
                ((C116690e) fVar).bindNull(2);
            } else {
                ((C116690e) fVar).bindString(2, str2);
            }
        }
    }

    public C118841l(C119038g gVar) {
        this.f355536a = gVar;
        this.f355537b = new C118842a(this, gVar);
    }
}
