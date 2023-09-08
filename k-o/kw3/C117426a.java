package kw3;

import gw3.C117003g;
import gw3.C117004h;
import gw3.C117005i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import uv3.C118616f;
import vv3.C118702d;

/* renamed from: kw3.a */
public abstract class C117426a {

    /* renamed from: a */
    public C118702d f351470a;

    /* renamed from: b */
    public C117428b f351471b;

    /* renamed from: c */
    public C117427a f351472c = new C117427a();

    /* renamed from: d */
    public C118616f f351473d;

    /* renamed from: kw3.a$a */
    public class C117427a {

        /* renamed from: a */
        public final HashMap<Integer, List<C117003g>> f351474a = new HashMap<>();

        /* renamed from: b */
        public final List<C117005i> f351475b = new ArrayList();

        /* renamed from: c */
        public final List<C117004h> f351476c = new ArrayList();

        /* renamed from: d */
        public HashMap<String, ArrayList<Object>> f351477d = new HashMap<>();

        public C117427a() {
        }

        /* renamed from: a */
        public final String mo182121a(int i, int i2) {
            String valueOf = String.valueOf(i);
            if (i != 1) {
                return valueOf;
            }
            return valueOf + "_" + String.valueOf(i2);
        }

        /* renamed from: b */
        public void mo182122b() {
            this.f351474a.clear();
            ((ArrayList) this.f351475b).clear();
            ((ArrayList) this.f351476c).clear();
        }
    }

    public C117426a(C118702d dVar) {
        this.f351470a = dVar;
    }
}
