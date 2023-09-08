package yw1;

import com.tencent.p014mm.sdk.platformtools.Util;
import j61.C46435b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import te3.C101800k70;
import te3.C51365ta;

/* renamed from: yw1.j */
public class C53603j {

    /* renamed from: a */
    public Map<String, List<C53605b>> f150638a = new HashMap();

    /* renamed from: b */
    public C11385n f150639b = new C53604a();

    /* renamed from: yw1.j$a */
    public class C53604a implements C11385n {
        public C53604a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C51365ta B0;
            if (Util.isEqual(yVar.getType(), 697) && (yVar instanceof C46435b)) {
                C46435b bVar = (C46435b) yVar;
                if (i == 0 && i2 == 0 && (B0 = bVar.mo71832B0()) != null && !Util.isNullOrNil((List) B0.f142064g)) {
                    Iterator<C101800k70> it = B0.f142064g.iterator();
                    while (it.hasNext()) {
                        C53603j jVar = C53603j.this;
                        String str2 = it.next().f298586d;
                        jVar.getClass();
                        if (!Util.isNullOrNil(str2)) {
                            List<C53605b> list = (List) ((HashMap) jVar.f150638a).get(str2);
                            if (!Util.isNullOrNil((List) list)) {
                                for (C53605b a : list) {
                                    a.mo74232a(false, str2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: yw1.j$b */
    public interface C53605b {
        /* renamed from: a */
        void mo74232a(boolean z, String str);
    }

    /* renamed from: yw1.j$c */
    public static class C53606c {

        /* renamed from: a */
        public static C53603j f150641a = new C53603j((C53604a) null);
    }

    public C53603j(C53604a aVar) {
    }

    /* renamed from: a */
    public static String m60139a(String str, String str2) {
        return Util.isNullOrNil(str) ? str2 == null ? "" : str2 : str;
    }
}
