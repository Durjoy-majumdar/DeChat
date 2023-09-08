package p903ij;

import android.util.SparseArray;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.pointers.PInt;
import java.util.Locale;

/* renamed from: ij.a */
public class C98696a {

    /* renamed from: a */
    public static Boolean f289423a;

    /* renamed from: ij.a$b */
    public static class C98698b {

        /* renamed from: a */
        public String f289424a;

        /* renamed from: b */
        public int f289425b;

        /* renamed from: c */
        public int f289426c;

        /* renamed from: d */
        public int f289427d;

        /* renamed from: e */
        public SparseArray<String> f289428e;

        public C98698b(C98697a aVar) {
        }

        public String toString() {
            return String.format(Locale.US, "pkgname: %s, minCode:%d, maxCode: %d, value: %s, chkExp: %d", new Object[]{this.f289424a, Integer.valueOf(this.f289425b), Integer.valueOf(this.f289426c), this.f289428e, Integer.valueOf(this.f289427d)});
        }
    }

    /* renamed from: ij.a$c */
    public static class C98699c {

        /* renamed from: a */
        public String f289429a;

        /* renamed from: b */
        public String f289430b;

        /* renamed from: c */
        public String f289431c;

        /* renamed from: d */
        public int f289432d;

        /* renamed from: e */
        public SparseArray<String> f289433e;

        public String toString() {
            return String.format(Locale.US, "manufacture: %s, model: %s, version: %s, value: %s, chkExp: %d", new Object[]{this.f289429a, this.f289430b, this.f289431c, this.f289433e, Integer.valueOf(this.f289432d)});
        }
    }

    /* renamed from: a */
    public static boolean m128468a(String str, String str2, PInt pInt, PBool pBool) {
        if (str == null) {
            pBool.value = false;
            return false;
        } else if (str2 == null) {
            pBool.value = true;
            return false;
        } else if (str.equals(str2)) {
            pInt.value++;
            pBool.value = true;
            return true;
        } else {
            pBool.value = false;
            return false;
        }
    }
}
