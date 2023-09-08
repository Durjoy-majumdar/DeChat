package p541gv;

import com.tencent.p014mm.sdk.storage.MAutoStorage;
import f40.C31887k0;
import java.util.HashMap;
import p749xh.C102658n6;
import p749xh.C38590j7;
import zh3.C91753f;

/* renamed from: gv.f */
public class C32542f implements C31887k0.C31890c {

    /* renamed from: gv.f$a */
    public class C32543a implements C91753f.C66827b {
        public C32543a(C32542f fVar) {
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return new String[]{MAutoStorage.getCreateSQLs(C102658n6.initAutoDBInfo(C102658n6.class), "Music")};
        }
    }

    /* renamed from: gv.f$b */
    public class C32544b implements C91753f.C66827b {
        public C32544b(C32542f fVar) {
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return new String[]{MAutoStorage.getCreateSQLs(C38590j7.initAutoDBInfo(C38590j7.class), "PieceMusicInfo")};
        }
    }

    /* renamed from: Rg */
    public HashMap<Integer, C91753f.C66827b> mo9070Rg() {
        HashMap<Integer, C91753f.C66827b> hashMap = new HashMap<>();
        hashMap.put(74710533, new C32543a(this));
        hashMap.put(-163841723, new C32544b(this));
        return hashMap;
    }
}
