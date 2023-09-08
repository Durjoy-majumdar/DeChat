package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.r4 */
public class C38650r4 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f103498f;

    /* renamed from: g */
    public static final String[] f103499g = new String[0];

    /* renamed from: h */
    public static final int f103500h = 1094728952;

    /* renamed from: i */
    public static final int f103501i = 94416770;

    /* renamed from: j */
    public static final int f103502j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f103503n = initAutoDBInfo(C38650r4.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38650r4> f103504o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103505d = true;

    /* renamed from: e */
    public boolean f103506e = true;
    public byte[] field_cache;
    public String field_reqType;

    static {
        SingleTable singleTable = new SingleTable("GetEmotionStoreRecListCache");
        f103498f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("reqType", "string", singleTable.getName(), "");
        new Column(XWalkPlugin.PRIVATE_CACHE_DIR_NAME, "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "reqType";
        mAutoDBInfo.colsMap.put("reqType", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "reqType";
        mAutoDBInfo.columns[1] = XWalkPlugin.PRIVATE_CACHE_DIR_NAME;
        mAutoDBInfo.colsMap.put(XWalkPlugin.PRIVATE_CACHE_DIR_NAME, "BLOB default '' ");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " reqType TEXT PRIMARY KEY ,  cache BLOB default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38650r4)) {
            return false;
        }
        C38650r4 r4Var = (C38650r4) iAutoDBItem;
        return C46238a.m51546a(this.field_reqType, r4Var.field_reqType) && C46238a.m51546a(this.field_cache, r4Var.field_cache);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103500h == hashCode) {
                    try {
                        this.field_reqType = cursor.getString(i);
                        this.f103505d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGetEmotionStoreRecListCache", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103501i == hashCode) {
                    try {
                        this.field_cache = cursor.getBlob(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGetEmotionStoreRecListCache", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103502j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103505d) {
            contentValues.put("reqType", this.field_reqType);
        }
        if (this.f103506e) {
            contentValues.put(XWalkPlugin.PRIVATE_CACHE_DIR_NAME, this.field_cache);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseGetEmotionStoreRecListCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS GetEmotionStoreRecListCache ( " + f103503n.sql + ");");
        for (String add : f103499g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseGetEmotionStoreRecListCache", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("GetEmotionStoreRecListCache", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103503n, "GetEmotionStoreRecListCache", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseGetEmotionStoreRecListCache", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("GetEmotionStoreRecListCache", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseGetEmotionStoreRecListCache", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103503n;
    }

    public String[] getIndexCreateSQL() {
        return f103499g;
    }

    public StorageObserverOwner<C38650r4> getObserverOwner() {
        return f103504o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_reqType;
    }

    public SingleTable getTable() {
        return f103498f;
    }

    public String getTableName() {
        return f103498f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("reqType")) {
            this.field_reqType = contentValues.getAsString("reqType");
            if (z) {
                this.f103505d = true;
            }
        }
        if (contentValues.containsKey(XWalkPlugin.PRIVATE_CACHE_DIR_NAME)) {
            this.field_cache = contentValues.getAsByteArray(XWalkPlugin.PRIVATE_CACHE_DIR_NAME);
            if (z) {
                this.f103506e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
