package wh3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import te3.C49817i92;

/* renamed from: wh3.w */
public final class C38148w extends MAutoStorage<C38147v> {

    /* renamed from: f */
    public static final String[] f100797f;

    /* renamed from: d */
    public ISQLiteDatabase f100798d;

    /* renamed from: e */
    public final String f100799e = "MicroMsg.GetEmotionStoreRecListCacheStorage";

    static {
        String createSQLs = MAutoStorage.getCreateSQLs(C38147v.f100796p, "GetEmotionStoreRecListCache");
        C87412m.m108593f(createSQLs, "getCreateSQLs(GetEmotion…eRecListCacheTableName())");
        f100797f = new String[]{createSQLs};
    }

    public C38148w(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
        this.f100798d = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public final boolean mo61548jo(int i, C49817i92 i922) {
        Integer num;
        if (i922 == null) {
            return false;
        }
        try {
            ISQLiteDatabase iSQLiteDatabase = this.f100798d;
            if (iSQLiteDatabase != null) {
                num = Integer.valueOf(iSQLiteDatabase.delete("GetEmotionStoreRecListCache", "reqType=?", new String[]{String.valueOf(i)}));
            } else {
                num = null;
            }
            if (num != null) {
                num.intValue();
            }
            String str = i + "";
            byte[] byteArray = i922.toByteArray();
            C87412m.m108594g(str, "reqType");
            C38147v vVar = new C38147v();
            vVar.field_reqType = str;
            vVar.field_cache = byteArray;
            Log.m105919d(this.f100799e, "insert cache: %d", Integer.valueOf(i));
            return insert(vVar);
        } catch (Exception e) {
            Log.m105921e(this.f100799e, "exception:%s", Util.stackTraceToString(e));
            return false;
        }
    }
}
