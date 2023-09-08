package kc3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C6716r1;
import f40.C31887k0;
import java.util.HashMap;
import zh3.C91753f;

/* renamed from: kc3.e */
public class C33880e implements C31887k0.C31890c {

    /* renamed from: kc3.e$a */
    public class C33881a implements C91753f.C66827b {
        public C33881a(C33880e eVar) {
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return C6716r1.f24128e;
        }
    }

    /* renamed from: Rg */
    public HashMap<Integer, C91753f.C66827b> mo9070Rg() {
        Log.m105924i("MicroMsg.PluginZero", "CleanDeleteItemStorage collectDatabaseFactory");
        HashMap<Integer, C91753f.C66827b> hashMap = new HashMap<>();
        hashMap.put(-1405195673, new C33881a(this));
        return hashMap;
    }
}
