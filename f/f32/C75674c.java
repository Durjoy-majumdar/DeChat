package f32;

import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import te3.C50994qp3;
import te3.C77993rp3;

/* renamed from: f32.c */
public class C75674c {

    /* renamed from: a */
    public static Map<String, C69158a0> f222272a = new HashMap();

    /* renamed from: b */
    public static Map<String, C77993rp3> f222273b = new HashMap();

    /* renamed from: c */
    public static Map<Long, C50994qp3> f222274c = new HashMap();

    /* renamed from: a */
    public static C69158a0 m90929a(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return (C69158a0) ((HashMap) f222272a).get(str);
    }

    /* renamed from: b */
    public static void m90930b(String str, C69158a0 a0Var) {
        ((HashMap) f222272a).put(str, a0Var);
    }
}
