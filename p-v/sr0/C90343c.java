package sr0;

import java.util.HashMap;
import java.util.List;
import sr0.C90341b;

/* renamed from: sr0.c */
public class C90343c {

    /* renamed from: sr0.c$a */
    public static final class C90344a {

        /* renamed from: a */
        public static final C90343c f259327a = new C90343c();
    }

    /* renamed from: sr0.c$b */
    public enum C90345b {
        PREPARE_RESOUCE,
        INJECT_JS
    }

    /* renamed from: a */
    public void mo124565a(String str, String str2, C90345b bVar) {
        List list = (List) ((HashMap) C90341b.C90342a.f259326a.f259325a).get(str);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                ((C90346d) list.get(i)).mo124567b(str2, bVar, 20);
            }
        }
    }
}
