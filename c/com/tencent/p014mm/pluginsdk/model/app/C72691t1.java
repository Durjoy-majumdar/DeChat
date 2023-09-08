package com.tencent.p014mm.pluginsdk.model.app;

/* renamed from: com.tencent.mm.pluginsdk.model.app.t1 */
public class C72691t1 {

    /* renamed from: a */
    public C72692a f211511a = C72692a.UNKNOWN;

    /* renamed from: com.tencent.mm.pluginsdk.model.app.t1$a */
    public enum C72692a {
        UNKNOWN(-1),
        SUCCESS(0),
        SUCCESS_BY_TOKEN(1),
        FAIL_BY_LOCAL(2),
        FAIL_BY_TOKEN(3),
        NO_TOKEN_SIGNATURE(4);
        

        /* renamed from: d */
        public int f211519d;

        /* access modifiers changed from: public */
        C72692a(int i) {
            this.f211519d = i;
        }

        /* renamed from: a */
        public static C72692a m85046a(int i) {
            C72692a aVar = SUCCESS;
            if (i == 0) {
                return aVar;
            }
            C72692a aVar2 = SUCCESS_BY_TOKEN;
            if (i == 1) {
                return aVar2;
            }
            C72692a aVar3 = FAIL_BY_LOCAL;
            if (i == 2) {
                return aVar3;
            }
            C72692a aVar4 = FAIL_BY_TOKEN;
            if (i == 3) {
                return aVar4;
            }
            return i == 4 ? NO_TOKEN_SIGNATURE : UNKNOWN;
        }

        public String toString() {
            return String.format("%s(%s)", new Object[]{super.toString(), Integer.valueOf(this.f211519d)});
        }
    }
}
