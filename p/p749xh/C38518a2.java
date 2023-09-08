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
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.a2 */
public class C38518a2 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f101581g;

    /* renamed from: h */
    public static final String[] f101582h = new String[0];

    /* renamed from: i */
    public static final int f101583i = 3079825;

    /* renamed from: j */
    public static final int f101584j = -295931082;

    /* renamed from: n */
    public static final int f101585n = 951530617;

    /* renamed from: o */
    public static final int f101586o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f101587p = initAutoDBInfo(C38518a2.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38518a2> f101588q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101589d = true;

    /* renamed from: e */
    public boolean f101590e = true;

    /* renamed from: f */
    public boolean f101591f = true;
    public byte[] field_content;
    public String field_desc;
    public int field_updateTime;

    static {
        SingleTable singleTable = new SingleTable("EmojiSuggestCacheInfo");
        f101581g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("desc", "string", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "int", singleTable.getName(), "");
        new Column("content", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "desc";
        mAutoDBInfo.colsMap.put("desc", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "desc";
        mAutoDBInfo.columns[1] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "INTEGER");
        mAutoDBInfo.columns[2] = "content";
        mAutoDBInfo.colsMap.put("content", "BLOB");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " desc TEXT PRIMARY KEY ,  updateTime INTEGER,  content BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38518a2)) {
            return false;
        }
        C38518a2 a2Var = (C38518a2) iAutoDBItem;
        return C46238a.m51546a(this.field_desc, a2Var.field_desc) && C46238a.m51546a(Integer.valueOf(this.field_updateTime), Integer.valueOf(a2Var.field_updateTime)) && C46238a.m51546a(this.field_content, a2Var.field_content);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101583i == hashCode) {
                    try {
                        this.field_desc = cursor.getString(i);
                        this.f101589d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101584j == hashCode) {
                    try {
                        this.field_updateTime = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101585n == hashCode) {
                    try {
                        this.field_content = cursor.getBlob(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101586o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101589d) {
            contentValues.put("desc", this.field_desc);
        }
        if (this.f101590e) {
            contentValues.put(C66261f3.COL_UPDATETIME, Integer.valueOf(this.field_updateTime));
        }
        if (this.f101591f) {
            contentValues.put("content", this.field_content);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS EmojiSuggestCacheInfo ( " + f101587p.sql + ");");
        for (String add : f101582h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("EmojiSuggestCacheInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101587p, "EmojiSuggestCacheInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("EmojiSuggestCacheInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101587p;
    }

    public String[] getIndexCreateSQL() {
        return f101582h;
    }

    public StorageObserverOwner<C38518a2> getObserverOwner() {
        return f101588q;
    }

    public Object getPrimaryKeyValue() {
        return this.field_desc;
    }

    public SingleTable getTable() {
        return f101581g;
    }

    public String getTableName() {
        return f101581g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("desc")) {
            this.field_desc = contentValues.getAsString("desc");
            if (z) {
                this.f101589d = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsInteger(C66261f3.COL_UPDATETIME).intValue();
            if (z) {
                this.f101590e = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsByteArray("content");
            if (z) {
                this.f101591f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
