package yw1;

import com.tencent.mars.cdn.CdnLogic;
import ix1.C46300a;
import ix1.C46304b;
import ix1.C46309c;
import ix1.C46313d;
import ix1.C46318f;
import ix1.C46320g;
import ix1.C46322h;
import ix1.C46325i;
import ix1.C46327j;
import ix1.C46330k;
import ix1.C46333l;
import ix1.C46336m;
import ix1.C46337n;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: yw1.g */
public class C53600g {

    /* renamed from: a */
    public static Map<Integer, Class<? extends C46337n>> f150628a = new LinkedHashMap();

    static {
        m60121b(0, C46336m.class);
        m60121b(10000, C46330k.class);
        m60121b(10001, C46300a.class);
        m60121b(10002, C46333l.class);
        m60121b(10003, C46327j.class);
        m60121b(10004, C46322h.class);
        m60121b(10005, C46304b.class);
        m60121b(10006, C46320g.class);
        m60121b(CdnLogic.kMediaTypeFavoriteBigFile, C46325i.class);
        m60121b(10008, C46313d.class);
        m60121b(10009, C46318f.class);
        m60121b(10010, C46309c.class);
    }

    /* renamed from: a */
    public static int m60120a(int i, int i2) {
        if (i == 1) {
            return 10000;
        }
        if (i == 3) {
            return 10009;
        }
        if (i == 47) {
            return 10005;
        }
        if (i != 32) {
            return 0;
        }
        switch (i2) {
            case 1:
                return 10001;
            case 2:
                return 10002;
            case 3:
                return 10003;
            case 4:
                return 10004;
            case 5:
                return 10006;
            case 6:
                return CdnLogic.kMediaTypeFavoriteBigFile;
            case 7:
                return 10008;
            case 8:
                return 10010;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static void m60121b(int i, Class<? extends C46337n> cls) {
        if (!f150628a.containsKey(Integer.valueOf(i))) {
            f150628a.put(Integer.valueOf(i), cls);
        }
    }
}
