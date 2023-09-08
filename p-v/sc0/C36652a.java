package sc0;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import junit.framework.Assert;

/* renamed from: sc0.a */
public abstract class C36652a {

    /* renamed from: j */
    public static String f97416j = "";

    /* renamed from: k */
    public static String f97417k = "";

    /* renamed from: a */
    public Map<String, String> f97418a;

    /* renamed from: b */
    public C72963f4 f97419b;

    /* renamed from: c */
    public String f97420c = "";

    /* renamed from: d */
    public String f97421d;

    /* renamed from: e */
    public String f97422e;

    /* renamed from: f */
    public String f97423f;

    /* renamed from: g */
    public LinkedList<String> f97424g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<Integer> f97425h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<Integer> f97426i = new LinkedList<>();

    /* renamed from: sc0.a$a */
    public static abstract class C36653a {

        /* renamed from: a */
        public static HashMap<String, C36653a> f97427a = new HashMap<>();

        /* renamed from: b */
        public static void m41027b(String str, C36653a aVar) {
            Assert.assertNotNull(str);
            Assert.assertNotNull(aVar);
            synchronized (f97427a) {
                f97427a.put(str.toLowerCase(), aVar);
            }
        }

        /* renamed from: a */
        public abstract C36652a mo58186a(Map<String, String> map, C72963f4 f4Var);
    }

    /* renamed from: sc0.a$b */
    public interface C36654b {
        /* renamed from: y5 */
        void mo60786y5(View view, C72963f4 f4Var, int i, C36652a aVar, int i2);
    }

    public C36652a(Map<String, String> map) {
        this.f97418a = map;
    }

    /* renamed from: a */
    public boolean mo60785a() {
        Map<String, String> map = this.f97418a;
        if (map == null || map.size() <= 0) {
            Log.m105920e("MicroMsg.BaseNewXmlMsg", "values == null || values.size() == 0 ");
            return false;
        }
        if (this.f97418a.containsKey(".sysmsg.$type")) {
            this.f97421d = this.f97418a.get(".sysmsg.$type");
        }
        String str = ".sysmsg." + this.f97421d + ".text";
        f97416j = str;
        if (this.f97418a.containsKey(str)) {
            this.f97422e = this.f97418a.get(f97416j);
        }
        String str2 = ".sysmsg." + this.f97421d + ".link" + ".scene";
        f97417k = str2;
        if (this.f97418a.containsKey(str2)) {
            this.f97423f = this.f97418a.get(f97417k);
        }
        return mo58201b();
    }

    /* renamed from: b */
    public abstract boolean mo58201b();

    public C36652a(Map<String, String> map, C72963f4 f4Var) {
        this.f97418a = map;
        this.f97419b = f4Var;
    }
}
