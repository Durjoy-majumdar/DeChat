package nv1;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import kv1.C99249c;
import kv1.C99251g;
import kv1.C99255j;
import lv1.C99681n;

/* renamed from: nv1.b */
public class C100219b implements Comparator<C99681n> {

    /* renamed from: d */
    public static final C100219b f293645d = new C100219b();

    public int compare(Object obj, Object obj2) {
        int i;
        C99681n nVar = (C99681n) obj;
        C99681n nVar2 = (C99681n) obj2;
        int i2 = nVar2.f292162p - nVar.f292162p;
        if (i2 != 0) {
            return i2;
        }
        Map<Integer, Integer> map = C99249c.f291014l;
        int i3 = nVar.f292148b;
        int i4 = nVar2.f292148b;
        HashMap<String, String> hashMap = C99251g.f291026a;
        if (i3 == i4) {
            i = 0;
        } else {
            Integer num = map.get(Integer.valueOf(i3));
            int i5 = Integer.MAX_VALUE;
            int intValue = num == null ? Integer.MAX_VALUE : num.intValue();
            Integer num2 = map.get(Integer.valueOf(i4));
            if (num2 != null) {
                i5 = num2.intValue();
            }
            i = intValue - i5;
        }
        if (i != 0) {
            return i;
        }
        int b = C99251g.m129281b(C99249c.f291016n, nVar.f292149c, nVar2.f292149c);
        if (b != 0) {
            return b;
        }
        int i6 = nVar.f292156j - nVar2.f292156j;
        if (i6 != 0) {
            return i6;
        }
        int i7 = nVar.f292149c;
        if (i7 != 11 && i7 != 17 && i7 != 18) {
            return Util.nullAs(nVar.f292157k, "").compareToIgnoreCase(nVar2.f292157k);
        }
        if (Util.isNullOrNil(nVar.f292166t)) {
            String e = C99251g.m129284e(nVar.f292151e);
            nVar.f292166t = e;
            String lowerCase = e.toLowerCase();
            nVar.f292166t = lowerCase;
            if (!C99255j.m129318b(lowerCase.charAt(0))) {
                nVar.f292166t = "~" + nVar.f292166t;
            }
        }
        if (Util.isNullOrNil(nVar2.f292166t)) {
            String e2 = C99251g.m129284e(nVar2.f292151e);
            nVar2.f292166t = e2;
            String lowerCase2 = e2.toLowerCase();
            nVar2.f292166t = lowerCase2;
            if (!C99255j.m129318b(lowerCase2.charAt(0))) {
                nVar2.f292166t = "~" + nVar2.f292166t;
            }
        }
        return nVar.f292166t.compareToIgnoreCase(nVar2.f292166t);
    }
}
