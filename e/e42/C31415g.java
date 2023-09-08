package e42;

import gy3.C87412m;
import java.util.Objects;

/* renamed from: e42.g */
public final class C31415g {

    /* renamed from: a */
    public final int f84089a;

    /* renamed from: b */
    public final String f84090b;

    /* renamed from: e42.g$b */
    public static final class C7595b {

        /* renamed from: a */
        public static final C31415g f25862a = new C31415g(0, "ok");

        /* renamed from: b */
        public static final C31415g f25863b = new C31415g(1, "cancel");

        /* renamed from: c */
        public static final C31415g f25864c = new C31415g(4, "fail:internal error");

        /* renamed from: d */
        public static final C31415g f25865d = new C31415g(6, "fail:param invalid");

        static {
            new C31415g(5, "fail:time out");
        }
    }

    /* renamed from: e42.g$a */
    public static final class C31416a {

        /* renamed from: a */
        public static final C31415g f84091a = new C31415g(500001, "fail: no view id provided");

        /* renamed from: b */
        public static final C31415g f84092b = new C31415g(500002, "fail: no corresponding parent");

        /* renamed from: c */
        public static final C31415g f84093c = new C31415g(500003, "fail: parent is not a legal view group for adding subviews");
    }

    /* renamed from: e42.g$c */
    public static final class C31417c {

        /* renamed from: a */
        public static final C31415g f84094a = new C31415g(400001, "fail:get storage failed");

        /* renamed from: b */
        public static final C31415g f84095b = new C31415g(400002, "fail:missing params");

        /* renamed from: c */
        public static final C31415g f84096c = new C31415g(400003, "fail:quota reached");

        /* renamed from: d */
        public static final C31415g f84097d = new C31415g(400004, "fail:no such key");

        static {
            new C31415g(400005, "fail:value process fail");
        }
    }

    public C31415g(int i, String str) {
        this.f84089a = i;
        this.f84090b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C87412m.m108589b(C31415g.class, obj.getClass()) && this.f84089a == ((C31415g) obj).f84089a;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f84089a)});
    }

    public String toString() {
        return "MBErrorInfo{errno=" + this.f84089a + ", errMsg='" + this.f84090b + "'}";
    }
}
