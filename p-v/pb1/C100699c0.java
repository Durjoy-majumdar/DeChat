package pb1;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;
import java.util.Vector;

/* renamed from: pb1.c0 */
public class C100699c0 {

    /* renamed from: a */
    public static List<C100700a> f295044a = null;

    /* renamed from: b */
    public static String f295045b = "";

    /* renamed from: c */
    public static String f295046c = "";

    /* renamed from: d */
    public static long f295047d;

    /* renamed from: pb1.c0$a */
    public static class C100700a {

        /* renamed from: a */
        public String f295048a;

        /* renamed from: b */
        public long f295049b;

        /* renamed from: c */
        public int f295050c;

        /* renamed from: d */
        public String f295051d;
    }

    /* renamed from: a */
    public static void m131739a(String str) {
        m131740b(str, "");
    }

    /* renamed from: b */
    public static void m131740b(String str, String str2) {
        if (!Util.isNullOrNil(f295045b)) {
            m131741c(f295045b, f295046c);
        }
        f295045b = str;
        f295046c = str2;
        f295047d = System.currentTimeMillis();
    }

    /* renamed from: c */
    public static void m131741c(String str, String str2) {
        if (!Util.isNullOrNil(str) && str.equals(f295045b)) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = f295047d;
            int i = (int) (currentTimeMillis - j);
            f295047d = j / 1000;
            if (Util.isNullOrNil(str2)) {
                str2 = "-1";
            }
            long j2 = f295047d;
            if (f295044a != null) {
                C100700a aVar = new C100700a();
                aVar.f295048a = str;
                aVar.f295049b = j2;
                aVar.f295050c = i;
                if (Util.isNullOrNil(str2)) {
                    aVar.f295051d = "-1";
                } else {
                    aVar.f295051d = str2;
                }
                List<C100700a> list = f295044a;
                if (list != null) {
                    ((Vector) list).add(aVar);
                }
            }
            f295045b = "";
            f295046c = "";
            f295047d = 0;
        }
    }
}
