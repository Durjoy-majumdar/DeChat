package p443as;

import com.tencent.p014mm.sdk.storage.MAutoStorage;
import f40.C31887k0;
import java.util.HashMap;
import p248ug.C37467u;
import zh3.C91753f;

/* renamed from: as.c */
public class C28119c implements C31887k0.C31890c {

    /* renamed from: d */
    public HashMap<Integer, C91753f.C66827b> f77524d = new HashMap<>();

    /* renamed from: as.c$a */
    public class C28120a implements C91753f.C66827b {

        /* renamed from: a */
        public final /* synthetic */ String[] f77525a;

        public C28120a(C28119c cVar, String[] strArr) {
            this.f77525a = strArr;
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return this.f77525a;
        }
    }

    public C28119c() {
        this.f77524d.put(-1948956900, new C28120a(this, new String[]{MAutoStorage.getCreateSQLs(C37467u.f99010R0, "FunctionMsgItem")}));
    }

    /* renamed from: Rg */
    public HashMap<Integer, C91753f.C66827b> mo9070Rg() {
        return this.f77524d;
    }
}
