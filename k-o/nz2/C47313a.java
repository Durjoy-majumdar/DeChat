package nz2;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: nz2.a */
public final class C47313a {

    /* renamed from: a */
    public C47314a f126985a;

    /* renamed from: b */
    public int f126986b;

    /* renamed from: c */
    public String f126987c;

    /* renamed from: nz2.a$a */
    public static final class C47314a {

        /* renamed from: a */
        public final String f126988a;

        public C47314a(String str) {
            this.f126988a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C47314a) && C87412m.m108589b(this.f126988a, ((C47314a) obj).f126988a);
        }

        public int hashCode() {
            String str = this.f126988a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "NewMsgInfo(sessionId=" + this.f126988a + ')';
        }
    }

    public C47313a() {
        this((C47314a) null, 0, (String) null, 7, (C8480h) null);
    }

    public C47313a(C47314a aVar, int i, String str, int i2, C8480h hVar) {
        aVar = (i2 & 1) != 0 ? null : aVar;
        i = (i2 & 2) != 0 ? 0 : i;
        str = (i2 & 4) != 0 ? "" : str;
        this.f126985a = aVar;
        this.f126986b = i;
        this.f126987c = str;
    }

    /* renamed from: a */
    public final int mo72361a() {
        if (this.f126986b > 0) {
            return 1;
        }
        return this.f126985a != null ? 2 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47313a)) {
            return false;
        }
        C47313a aVar = (C47313a) obj;
        return C87412m.m108589b(this.f126985a, aVar.f126985a) && this.f126986b == aVar.f126986b && C87412m.m108589b(this.f126987c, aVar.f126987c);
    }

    public int hashCode() {
        C47314a aVar = this.f126985a;
        int i = 0;
        int hashCode = (((aVar == null ? 0 : aVar.hashCode()) * 31) + this.f126986b) * 31;
        String str = this.f126987c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "TextStatusNotifyShowInfo(latestNewMsgInfo=" + this.f126985a + ", notifyUnreadCount=" + this.f126986b + ", notifyUnreadCountUser=" + this.f126987c + ')';
    }
}
