package er1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import java.util.List;
import sx3.C26236u;

/* renamed from: er1.b0 */
public final class C58695b0 {

    /* renamed from: a */
    public static final C58695b0 f168022a = new C58695b0();

    /* renamed from: b */
    public static final C58696a f168023b;

    /* renamed from: c */
    public static final List<C58696a> f168024c;

    /* renamed from: er1.b0$a */
    public static final class C58696a {

        /* renamed from: a */
        public final long f168025a;

        /* renamed from: b */
        public final long f168026b;

        /* renamed from: c */
        public final String f168027c;

        public C58696a(long j, long j2, String str) {
            C87412m.m108594g(str, "mmkvKey");
            this.f168025a = j;
            this.f168026b = j2;
            this.f168027c = str;
        }
    }

    static {
        C58696a aVar = new C58696a(1253, 37, "Finder_UploadBigFileConfig");
        f168023b = aVar;
        f168024c = C26236u.m33719b(aVar);
    }

    /* renamed from: a */
    public final void mo83612a(C58696a aVar) {
        C87412m.m108594g(aVar, "config");
        MultiProcessMMKV singleDefault = MultiProcessMMKV.getSingleDefault();
        C87412m.m108593f(singleDefault, "mmkv");
        singleDefault.putLong(aVar.f168027c, System.currentTimeMillis());
        singleDefault.commit();
        Log.m105924i("Finder.FinderCrashChecker", "mark " + aVar.f168027c);
    }
}
