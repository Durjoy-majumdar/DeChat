package s31;

import java.util.ArrayList;
import java.util.List;
import n31.C117600a;
import q31.C118149b;
import y31.C118914a;
import y31.C118915b;

/* renamed from: s31.a */
public class C118260a {

    /* renamed from: a */
    public List<C117600a> f353451a = new ArrayList();

    /* renamed from: b */
    public C118149b f353452b;

    /* renamed from: c */
    public C118915b f353453c = new C118914a();

    /* renamed from: s31.a$b */
    public static final class C118262b {

        /* renamed from: a */
        public List<C117600a> f353454a = new ArrayList();

        /* renamed from: b */
        public C118149b f353455b;

        /* renamed from: c */
        public C118915b f353456c = new C118914a();

        public C118262b(C118261a aVar) {
        }
    }

    public C118260a(C118262b bVar, C118261a aVar) {
        if (bVar != null) {
            List<C117600a> list = bVar.f353454a;
            if (list != null && ((ArrayList) list).size() > 0) {
                ((ArrayList) this.f353451a).addAll(bVar.f353454a);
            }
            C118915b bVar2 = bVar.f353456c;
            if (bVar2 != null) {
                this.f353453c = bVar2;
            }
            this.f353452b = bVar.f353455b;
        }
    }
}
