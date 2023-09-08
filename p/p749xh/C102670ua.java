package p749xh;

import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import eb0.C86484b;
import f40.C86709a0;
import java.util.HashMap;
import junit.framework.Assert;
import p156gj.C87203t;
import zh3.C91753f;

/* renamed from: xh.ua */
public class C102670ua extends C91753f {

    /* renamed from: i */
    public static C102670ua f303014i;

    /* renamed from: j */
    public static HashMap<Integer, C91753f.C66827b> f303015j;

    /* renamed from: xh.ua$b */
    public class C38677b implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return new String[]{MAutoStorage.getCreateSQLs(C38666t2.initAutoDBInfo(C38666t2.class), "FavSearchInfo")};
        }
    }

    /* renamed from: xh.ua$c */
    public class C38678c implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return new String[]{MAutoStorage.getCreateSQLs(C38641q2.initAutoDBInfo(C38641q2.class), "FavEditInfo")};
        }
    }

    /* renamed from: xh.ua$e */
    public class C38679e implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return new String[]{MAutoStorage.getCreateSQLs(C38623o2.initAutoDBInfo(C38623o2.class), "FavConfigInfo")};
        }
    }

    /* renamed from: xh.ua$a */
    public class C102671a implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return new String[]{MAutoStorage.getCreateSQLs(C102666r2.initAutoDBInfo(C102666r2.class), "FavItemInfo")};
        }
    }

    /* renamed from: xh.ua$d */
    public class C102672d implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return new String[]{MAutoStorage.getCreateSQLs(C102657n2.initAutoDBInfo(C102657n2.class), "FavCdnInfo")};
        }
    }

    /* renamed from: xh.ua$f */
    public class C102673f implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return new String[]{MAutoStorage.getCreateSQLs(C102660p2.initAutoDBInfo(C102660p2.class), "FavDelInfo")};
        }
    }

    static {
        HashMap<Integer, C91753f.C66827b> hashMap = new HashMap<>();
        f303015j = hashMap;
        hashMap.put(-403906948, new C102671a());
        f303015j.put(268557265, new C38677b());
        f303015j.put(20610547, new C38678c());
        f303015j.put(1692712704, new C102672d());
        f303015j.put(1810537579, new C38679e());
        f303015j.put(-1687968802, new C102673f());
    }

    public C102670ua() {
        long currentTimeMillis = System.currentTimeMillis();
        Assert.assertTrue(C86709a0.m107523b().mo121110g() != 0);
        String str = C86709a0.m107535s().mo121141h() + "enFavorite.db";
        Log.m105919d("MicroMsg.FavoriteDataBase", "db path", str);
        if (mo125623m("", str, (long) C86709a0.m107523b().mo121110g(), C87203t.m108270f(true), f303015j, true)) {
            String g = mo125617g();
            if (!Util.isNullOrNil(g)) {
                Log.m105920e("MicroMsg.FavoriteDataBase", "dbinit failed :" + g);
                CrashReportFactory.reportRawMessage("init db Favorite Failed: [ " + g + "]", "DBinit");
            }
            Log.m105919d("MicroMsg.FavoriteDataBase", "init db Favorite time:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return;
        }
        throw new C86484b(1);
    }

    /* renamed from: c */
    public void mo124433c(String str) {
        super.mo124433c(str);
        f303014i = null;
    }
}
