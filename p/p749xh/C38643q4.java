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

/* renamed from: xh.q4 */
public class C38643q4 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f103398f;

    /* renamed from: g */
    public static final String[] f103399g = new String[0];

    /* renamed from: h */
    public static final int f103400h = 1094728952;

    /* renamed from: i */
    public static final int f103401i = 94416770;

    /* renamed from: j */
    public static final int f103402j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f103403n = initAutoDBInfo(C38643q4.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38643q4> f103404o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103405d = true;

    /* renamed from: e */
    public boolean f103406e = true;
    public byte[] field_cache;
    public String field_reqType;

    static {
        SingleTable singleTable = new SingleTable("GetEmotionListCache");
        f103398f = singleTable;
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
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38643q4)) {
            return false;
        }
        C38643q4 q4Var = (C38643q4) iAutoDBItem;
        return C46238a.m51546a(this.field_reqType, q4Var.field_reqType) && C46238a.m51546a(this.field_cache, q4Var.field_cache);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103400h == hashCode) {
                    try {
                        this.field_reqType = cursor.getString(i);
                        this.f103405d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGetEmotionListCache", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103401i == hashCode) {
                    try {
                        this.field_cache = cursor.getBlob(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGetEmotionListCache", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103402j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103405d) {
            contentValues.put("reqType", this.field_reqType);
        }
        if (this.f103406e) {
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
            Log.m105920e("MicroMsg.SDK.BaseGetEmotionListCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS GetEmotionListCache ( " + f103403n.sql + ");");
        for (String add : f103399g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseGetEmotionListCache", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("GetEmotionListCache", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103403n, "GetEmotionListCache", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseGetEmotionListCache", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("GetEmotionListCache", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseGetEmotionListCache", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103403n;
    }

    public String[] getIndexCreateSQL() {
        return f103399g;
    }

    public StorageObserverOwner<C38643q4> getObserverOwner() {
        return f103404o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_reqType;
    }

    public SingleTable getTable() {
        return f103398f;
    }

    public String getTableName() {
        return f103398f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("reqType")) {
            this.field_reqType = contentValues.getAsString("reqType");
            if (z) {
                this.f103405d = true;
            }
        }
        if (contentValues.containsKey(XWalkPlugin.PRIVATE_CACHE_DIR_NAME)) {
            this.field_cache = contentValues.getAsByteArray(XWalkPlugin.PRIVATE_CACHE_DIR_NAME);
            if (z) {
                this.f103406e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
