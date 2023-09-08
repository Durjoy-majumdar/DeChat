package sf0;

import android.util.SparseBooleanArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86484b;
import f40.C86709a0;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;
import p156gj.C87203t;
import zh3.C91753f;

/* renamed from: sf0.z */
public class C90189z {

    /* renamed from: a */
    public static ConcurrentHashMap<Integer, C90190a> f258959a = new ConcurrentHashMap<>();

    /* renamed from: sf0.z$a */
    public static final class C90190a extends C91753f {

        /* renamed from: i */
        public final boolean f258960i;

        /* renamed from: j */
        public final String f258961j;

        /* renamed from: k */
        public SparseBooleanArray f258962k = new SparseBooleanArray();

        public C90190a(String str, boolean z) {
            Log.m105919d("MicroMsg.GeneralDBHelper", "create db %s", str);
            this.f258960i = z;
            this.f258961j = str;
        }

        @Deprecated
        /* renamed from: b */
        public void mo124432b() {
            Log.m105921e("MicroMsg.GeneralDBHelper", "forbid to use this method %s", Util.getStack());
            if (this.f258962k.size() <= 1) {
                mo124433c((String) null);
            }
        }

        @Deprecated
        /* renamed from: c */
        public void mo124433c(String str) {
            Log.m105920e("MicroMsg.GeneralDBHelper", "forbid to use this method");
            if (this.f258962k.size() <= 1) {
                super.mo124433c(str);
            }
        }

        /* renamed from: s */
        public void mo124434s(int i) {
            Log.m105919d("MicroMsg.GeneralDBHelper", "addRef %d", Integer.valueOf(i));
            this.f258962k.put(i, true);
        }

        /* renamed from: t */
        public void mo124435t(int i) {
            Log.m105919d("MicroMsg.GeneralDBHelper", "try close db %d", Integer.valueOf(i));
            this.f258962k.delete(i);
            if (this.f258962k.size() < 1) {
                Log.m105919d("MicroMsg.GeneralDBHelper", "close db %d succ", Integer.valueOf(i));
                mo124433c((String) null);
                C90189z.f258959a.remove(Integer.valueOf(this.f258961j.hashCode()));
            }
        }
    }

    /* renamed from: a */
    public static final C90190a m112866a(int i, String str, HashMap<Integer, C91753f.C66827b> hashMap, boolean z) {
        String str2 = str;
        boolean z2 = z;
        boolean z3 = true;
        Assert.assertTrue(!Util.isNullOrNil(str) && hashMap != null);
        int hashCode = str.hashCode();
        C90190a aVar = f258959a.get(Integer.valueOf(hashCode));
        if (aVar == null) {
            C90190a aVar2 = new C90190a(str, z2);
            if (z2) {
                if (!aVar2.mo125624n("", str, "", (long) C86709a0.m107523b().mo121110g(), C87203t.m108270f(true), hashMap, true)) {
                    throw new C86484b(1);
                }
            } else if (!aVar2.mo125625o(str, hashMap, true)) {
                throw new C86484b(1);
            }
            f258959a.put(Integer.valueOf(hashCode), aVar2);
            int i2 = i;
            aVar = aVar2;
        } else {
            if (z2 != aVar.f258960i) {
                z3 = false;
            }
            Assert.assertTrue(z3);
            long a = aVar.mo125613a();
            for (C91753f.C66827b a2 : hashMap.values()) {
                for (String str3 : a2.mo6410a()) {
                    Log.m105918d("MicroMsg.GeneralDBHelper", "init sql:" + str3);
                    try {
                        aVar.execSQL((String) null, str3);
                    } catch (Exception e) {
                        Exception exc = e;
                        Assert.assertTrue("CreateTable failed:[" + str3 + "][" + exc.getMessage() + "]", false);
                    }
                }
            }
            aVar.endTransaction(a);
            int i3 = i;
        }
        aVar.mo124434s(i);
        return aVar;
    }
}
