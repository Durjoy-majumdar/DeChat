package er1;

import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C31543z5;
import eb0.C75592q0;
import gy3.C87412m;
import ht1.C60216z4;
import java.util.HashMap;
import je1.C46533r1;
import jp3.C9486a;
import jp3.C9487b;
import nr3.C89059e;
import te3.fp4;

/* renamed from: er1.w4 */
public final class C45690w4 {

    /* renamed from: a */
    public static final C45690w4 f123497a = new C45690w4();

    /* renamed from: b */
    public static final HashMap<String, fp4> f123498b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<String, Integer> f123499c = new HashMap<>();

    /* renamed from: d */
    public static int f123500d;

    /* renamed from: a */
    public final fp4 mo71189a(String str, C9487b<C9486a> bVar, C60216z4.C8821a<Object> aVar, C60216z4.C8821a<Integer> aVar2, boolean z, int i) {
        Integer num;
        C89059e eVar;
        if (str != null && !Util.isNullOrNil(str)) {
            if (C87412m.m108589b(str, C75592q0.m90789s()) || (num = f123499c.get(str)) == null) {
                num = 0;
            }
            int intValue = num.intValue();
            if (z) {
                intValue = 0;
            }
            if (C31543z5.m39455e() - intValue > f123500d) {
                if (bVar != null) {
                    eVar = new C46533r1(str, i, "", 0).mo9225i();
                    eVar.mo11397F(bVar);
                } else {
                    eVar = new C46533r1(str, i, "", 0).mo9225i();
                }
                eVar.mo123420E(new C45689t4(str, aVar, aVar2));
            }
            return f123498b.get(str);
        } else if (aVar2 == null) {
            return null;
        } else {
            aVar2.mo6382a(-1000);
            return null;
        }
    }
}
