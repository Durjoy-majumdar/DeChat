package w12;

import com.tencent.p014mm.plugin.report.service.C115669n;
import gy3.C87412m;

/* renamed from: w12.b */
public final class C53066b {

    /* renamed from: a */
    public static final C53066b f148113a = new C53066b();

    /* renamed from: w12.b$a */
    public enum C53067a {
        ACCOUNT_TYPE_NORMAL(0),
        ACCOUNT_TYPE_KIDS(1);
        

        /* renamed from: d */
        public final int f148117d;

        /* access modifiers changed from: public */
        C53067a(int i) {
            this.f148117d = i;
        }
    }

    /* renamed from: w12.b$b */
    public enum C53068b {
        LOGIN_RESULT_SUCCESS(1),
        LOGIN_RESULT_TURN_TO_REG(2),
        LOGIN_RESULT_CANCEL(3),
        LOGIN_RESULT_FAIL(4);
        

        /* renamed from: d */
        public final int f148123d;

        /* access modifiers changed from: public */
        C53068b(int i) {
            this.f148123d = i;
        }
    }

    /* renamed from: w12.b$c */
    public enum C53069c {
        LOGIN_TYPE_DEFAULT(0),
        LOGIN_TYPE_BOTH(1),
        LOGIN_TYPE_WATCH_ONLY(2);
        

        /* renamed from: d */
        public final int f148128d;

        /* access modifiers changed from: public */
        C53069c(int i) {
            this.f148128d = i;
        }
    }

    /* renamed from: a */
    public final void mo73761a(C53067a aVar, String str, C53069c cVar, C53068b bVar, int i, int i2) {
        C87412m.m108594g(aVar, "accountType");
        C87412m.m108594g(str, "loginUrl");
        C87412m.m108594g(cVar, "type");
        C87412m.m108594g(bVar, "result");
        C115669n.INSTANCE.mo160128e(21127, true, true, false, Integer.valueOf(bVar.f148123d), Integer.valueOf(cVar.f148128d), str, Integer.valueOf(i), Integer.valueOf(aVar.f148117d), Integer.valueOf(i2));
    }
}
