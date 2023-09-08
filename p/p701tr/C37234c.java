package p701tr;

import com.tencent.p014mm.sdk.storage.MAutoStorage;
import ev1.C31726h;
import f40.C31887k0;
import java.util.HashMap;
import zh3.C91753f;

/* renamed from: tr.c */
public class C37234c implements C31887k0.C31890c {

    /* renamed from: d */
    public HashMap<Integer, C91753f.C66827b> f98542d = new HashMap<>();

    /* renamed from: tr.c$a */
    public class C37235a implements C91753f.C66827b {

        /* renamed from: a */
        public final /* synthetic */ String[] f98543a;

        public C37235a(C37234c cVar, String[] strArr) {
            this.f98543a = strArr;
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return this.f98543a;
        }
    }

    public C37234c() {
        this.f98542d.put(-1597316162, new C37235a(this, new String[]{MAutoStorage.getCreateSQLs(C31726h.f84713D, "ForceNotifyData")}));
    }

    /* renamed from: Rg */
    public HashMap<Integer, C91753f.C66827b> mo9070Rg() {
        return this.f98542d;
    }
}
