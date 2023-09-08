package qe3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import java.util.List;

/* renamed from: qe3.b0 */
public final class C89623b0 {

    /* renamed from: a */
    public int f257828a;

    /* renamed from: b */
    public int f257829b;

    /* renamed from: c */
    public String f257830c;

    /* renamed from: d */
    public String f257831d;

    /* renamed from: qe3.b0$a */
    public static class C89624a {

        /* renamed from: a */
        public final int[] f257832a;

        /* renamed from: b */
        public final int f257833b;

        /* renamed from: c */
        public final int f257834c;

        public C89624a(int[] iArr, int[] iArr2, int i, int i2) {
            this.f257832a = iArr2;
            this.f257833b = i;
            this.f257834c = i2;
        }

        /* renamed from: a */
        public int[] mo123920a() {
            return this.f257832a;
        }

        /* renamed from: b */
        public int mo123921b() {
            return this.f257834c;
        }

        /* renamed from: c */
        public int[] mo123922c() {
            return null;
        }

        /* renamed from: d */
        public int mo123923d() {
            return this.f257833b;
        }
    }

    public C89623b0() {
        this.f257828a = 0;
        this.f257829b = 80;
        this.f257830c = "";
        this.f257831d = "";
    }

    /* renamed from: a */
    public static C89623b0 m112052a(String str) {
        String[] split = str.split(",");
        if (split.length < 4) {
            return null;
        }
        C89623b0 b0Var = new C89623b0();
        try {
            b0Var.f257828a = Util.getInt(split[0], 0);
            b0Var.f257830c = Util.nullAsNil(split[1]);
            b0Var.f257829b = Util.getInt(split[2], 0);
            b0Var.f257831d = Util.nullAsNil(split[3]);
            return b0Var;
        } catch (NumberFormatException e) {
            Log.m105921e("MicroMsg.MMBuiltInIP", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: b */
    public static C89624a m112053b(String str, String str2) {
        Log.m105918d("MicroMsg.MMBuiltInIP", "parsing network control params:");
        Log.m105918d("MicroMsg.MMBuiltInIP", "ports = " + str);
        Log.m105918d("MicroMsg.MMBuiltInIP", "timeouts = " + str2);
        int[] splitToIntArray = Util.splitToIntArray(str);
        int[] splitToIntArray2 = Util.splitToIntArray(str2);
        if (splitToIntArray2 == null || splitToIntArray2.length < 2) {
            splitToIntArray2 = new int[]{0, 0};
            Log.m105920e("MicroMsg.MMBuiltInIP", "invalid timeouts");
        }
        return new C89624a((int[]) null, splitToIntArray, (int) (((long) splitToIntArray2[0]) * 1000), (int) (((long) splitToIntArray2[1]) * 1000));
    }

    /* renamed from: c */
    public static String m112054c(List<C89623b0> list) {
        String str = "";
        for (C89623b0 b0Var : list) {
            str = str + b0Var.toString() + "|";
        }
        return str;
    }

    /* renamed from: d */
    public static List<C89623b0> m112055d(String str) {
        LinkedList linkedList = new LinkedList();
        if (Util.isNullOrNil(str)) {
            return linkedList;
        }
        try {
            for (String a : str.split("\\|")) {
                C89623b0 a2 = m112052a(a);
                if (a2 != null) {
                    linkedList.add(a2);
                }
            }
        } catch (Exception e) {
            Log.m105919d("MicroMsg.MMBuiltInIP", "unserialize split failed str[%s]", str);
            Log.m105921e("MicroMsg.MMBuiltInIP", "exception:%s", Util.stackTraceToString(e));
        }
        return linkedList;
    }

    public String toString() {
        return this.f257828a + "," + this.f257830c + "," + this.f257829b + "," + this.f257831d;
    }

    public C89623b0(int i, String str, int i2, String str2) {
        this.f257828a = i;
        this.f257830c = str;
        this.f257829b = i2;
        this.f257831d = str2;
    }
}
