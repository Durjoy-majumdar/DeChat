package e60;

import a11.C39479c;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;

/* renamed from: e60.a */
public final class C7599a {

    /* renamed from: a */
    public static final C7600a f25866a = new C7600a((C8480h) null);

    /* renamed from: e60.a$a */
    public static final class C7600a {
        public C7600a(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo8727a(String str) {
            List<String> r2;
            C87412m.m108594g(str, "roomId");
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
            if (Lo == null || (r2 = Lo.mo69790r2()) == null) {
                return 0;
            }
            return r2.size();
        }

        /* renamed from: b */
        public final int mo8728b(String str, String str2) {
            C87412m.m108594g(str, "userName");
            C87412m.m108594g(str2, "roomId");
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str2);
            boolean z = false;
            if (Lo != null && Lo.mo69793u2(str)) {
                return 2;
            }
            if (Lo != null && Lo.mo69796x2(str)) {
                z = true;
            }
            return z ? 1 : 3;
        }

        /* renamed from: c */
        public final int mo8729c(String str, String str2) {
            C87412m.m108594g(str, "userName");
            C87412m.m108594g(str2, "anchorName");
            return C87412m.m108589b(str, str2) ? 1 : 2;
        }
    }
}
