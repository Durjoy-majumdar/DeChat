package wi0;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: wi0.d */
public class C38158d extends MAutoStorage<C38154c> {

    /* renamed from: e */
    public static final String[] f100816e = {MAutoStorage.getCreateSQLs(C38154c.f100810p, "AppBrandCommonKVData")};

    /* renamed from: d */
    public final ISQLiteDatabase f100817d;

    public C38158d(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C38154c.f100810p, "AppBrandCommonKVData", (String[]) null);
        this.f100817d = iSQLiteDatabase;
    }

    /* renamed from: B9 */
    public boolean mo61552B9(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C38154c cVar = new C38154c();
        cVar.field_key = str;
        cVar.field_value = str2;
        return Util.isNullOrNil(str2) ? !super.delete(cVar, new String[0]) : super.replace(cVar);
    }

    /* renamed from: Lo */
    public String mo61553Lo(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            return str2;
        }
        C38154c cVar = new C38154c();
        cVar.field_key = str;
        return super.get(cVar, new String[0]) ? cVar.field_value : str2;
    }

    /* renamed from: c */
    public boolean mo61554c(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C38154c cVar = new C38154c();
        cVar.field_key = str;
        String Lo = mo61553Lo(str, "");
        cVar.field_value = Lo;
        return TextUtils.isEmpty(Lo) || super.delete(cVar, new String[0]);
    }

    /* renamed from: jo */
    public void mo61555jo(String str) {
        super.execSQL("AppBrandCommonKVData", String.format("delete from %s where %s like '%s%%'", new Object[]{"AppBrandCommonKVData", "key", str}));
    }
}
