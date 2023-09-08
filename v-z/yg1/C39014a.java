package yg1;

import gy3.C8480h;
import gy3.C87412m;
import te3.C48742ao0;

/* renamed from: yg1.a */
public final class C39014a {

    /* renamed from: a */
    public int f105068a;

    /* renamed from: b */
    public int f105069b;

    /* renamed from: c */
    public C39015a f105070c;

    /* renamed from: d */
    public String f105071d = "";

    /* renamed from: yg1.a$a */
    public static final class C39015a {

        /* renamed from: a */
        public C48742ao0 f105072a;

        /* renamed from: b */
        public int f105073b;

        public C39015a(C48742ao0 ao02, int i) {
            this.f105072a = ao02;
            this.f105073b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C39015a)) {
                return false;
            }
            C39015a aVar = (C39015a) obj;
            return C87412m.m108589b(this.f105072a, aVar.f105072a) && this.f105073b == aVar.f105073b;
        }

        public int hashCode() {
            C48742ao0 ao02 = this.f105072a;
            return ((ao02 == null ? 0 : ao02.hashCode()) * 31) + this.f105073b;
        }

        public String toString() {
            return "FinderGetLiveMsgRespWrapper(resp=" + this.f105072a + ", reqVisitorRoleType=" + this.f105073b + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C39015a(C48742ao0 ao02, int i, int i2, C8480h hVar) {
            this(ao02, (i2 & 2) != 0 ? 4 : i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
        r1 = r1.f105072a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FinderGetLiveMsgRespWrapper: errCode:"
            r0.append(r1)
            int r1 = r2.f105068a
            r0.append(r1)
            java.lang.String r1 = ",errType:"
            r0.append(r1)
            int r1 = r2.f105069b
            r0.append(r1)
            java.lang.String r1 = ",resp:"
            r0.append(r1)
            yg1.a$a r1 = r2.f105070c
            if (r1 == 0) goto L_0x002b
            te3.ao0 r1 = r1.f105072a
            if (r1 == 0) goto L_0x002b
            org.json.JSONObject r1 = o40.C61937h.m72709h(r1)
            goto L_0x002d
        L_0x002b:
            java.lang.String r1 = ""
        L_0x002d:
            r0.append(r1)
            java.lang.String r1 = ",reqVisitorRoleType:"
            r0.append(r1)
            yg1.a$a r1 = r2.f105070c
            if (r1 == 0) goto L_0x0040
            int r1 = r1.f105073b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0041
        L_0x0040:
            r1 = 0
        L_0x0041:
            r0.append(r1)
            java.lang.String r1 = ",uniqueId:"
            r0.append(r1)
            java.lang.String r1 = r2.f105071d
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yg1.C39014a.toString():java.lang.String");
    }
}
