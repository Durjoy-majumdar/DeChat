package m30;

import com.tencent.p014mm.sdk.platformtools.Util;
import oa1.C117731d;
import zh3.C91753f;

/* renamed from: m30.d */
public class C88694d {

    /* renamed from: a */
    public static C91753f f256046a = new C91753f();

    /* renamed from: b */
    public static C91753f f256047b = new C91753f();

    /* renamed from: a */
    public static int m110638a() {
        int i = Util.getInt(C117731d.m166007c().mo182444f("clicfg_kara_data_clean_days", "-1", false, true), -1);
        if (i == -1) {
            return 30;
        }
        return i;
    }

    /* renamed from: b */
    public static long m110639b(long j) {
        return j - ((((((long) m110640c()) * 1000) * 60) * 60) * 24);
    }

    /* renamed from: c */
    public static int m110640c() {
        int i = Util.getInt(C117731d.m166007c().mo182444f("clicfg_kara_vaild_days", "-1", false, true), -1);
        if (i == -1) {
            return 21;
        }
        return i;
    }
}
