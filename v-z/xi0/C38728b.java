package xi0;

import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import java.util.List;
import p749xh.C38694x;
import rx3.C13598b0;

/* renamed from: xi0.b */
public final class C38728b extends MAutoStorage<C38727a> {

    /* renamed from: d */
    public final ISQLiteDatabase f104496d;

    /* renamed from: xi0.b$a */
    public static abstract class C38729a {

        /* renamed from: xi0.b$a$a */
        public static final class C38730a extends C38729a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C38730a)) {
                    return false;
                }
                ((C38730a) obj).getClass();
                return C87412m.m108589b((Object) null, (Object) null);
            }

            public int hashCode() {
                throw null;
            }

            public String toString() {
                return "APPID(value=null)";
            }
        }

        /* renamed from: xi0.b$a$b */
        public static final class C38731b extends C38729a {

            /* renamed from: a */
            public final String f104497a;

            public C38731b(String str) {
                C87412m.m108594g(str, "value");
                this.f104497a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C38731b) && C87412m.m108589b(this.f104497a, ((C38731b) obj).f104497a);
            }

            public int hashCode() {
                return this.f104497a.hashCode();
            }

            public String toString() {
                return "USERNAME(value=" + this.f104497a + ')';
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38728b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C38727a.f104494r, "AppBrandPrefetchWxaAttrsMarkTable", C38694x.f104174h);
        C87412m.m108594g(iSQLiteDatabase, "db");
        this.f104496d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final void mo61739Lo(C38729a aVar) {
        C87412m.m108594g(aVar, "key");
        long nowSecond = Util.nowSecond();
        C38727a aVar2 = new C38727a();
        aVar2.field_prefetchUpdateTime = nowSecond;
        if (aVar instanceof C38729a.C38731b) {
            String str = ((C38729a.C38731b) aVar).f104497a;
            aVar2.field_username = str;
            aVar2.field_appId = C81661j.m100180e(str);
        } else if (aVar instanceof C38729a.C38730a) {
            C38729a.C38730a aVar3 = (C38729a.C38730a) aVar;
            aVar2.field_appId = null;
            aVar2.field_username = C81661j.m100181f((String) null);
        }
        super.replace(aVar2);
    }

    /* renamed from: jo */
    public final void mo61740jo(List<String> list) {
        C87412m.m108594g(list, "usernameList");
        ISQLiteDatabase iSQLiteDatabase = this.f104496d;
        long beginTransaction = iSQLiteDatabase.beginTransaction(Thread.currentThread().getId());
        for (String str : list) {
            if (!(str == null || str.length() == 0)) {
                mo61739Lo(new C38729a.C38731b(str));
            }
        }
        C13598b0 b0Var = C13598b0.f38549a;
        iSQLiteDatabase.endTransaction(beginTransaction);
    }
}
