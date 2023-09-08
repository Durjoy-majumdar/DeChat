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

/* renamed from: xh.c8 */
public class C38543c8 extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f101994i;

    /* renamed from: j */
    public static final String[] f101995j = new String[0];

    /* renamed from: n */
    public static final int f101996n = -199335784;

    /* renamed from: o */
    public static final int f101997o = -572269767;

    /* renamed from: p */
    public static final int f101998p = -1244907336;

    /* renamed from: q */
    public static final int f101999q = -869114103;

    /* renamed from: r */
    public static final int f102000r = 93997959;

    /* renamed from: s */
    public static final int f102001s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f102002t = initAutoDBInfo(C38543c8.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C38543c8> f102003u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102004d = true;

    /* renamed from: e */
    public boolean f102005e = true;

    /* renamed from: f */
    public boolean f102006f = true;
    public String field_brand;
    public String field_fromLang;
    public String field_originMD5;
    public String field_resultFile;
    public String field_toLang;

    /* renamed from: g */
    public boolean f102007g = true;

    /* renamed from: h */
    public boolean f102008h = true;

    static {
        SingleTable singleTable = new SingleTable("ScanTranslationResult");
        f101994i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("originMD5", "string", singleTable.getName(), "");
        new Column("resultFile", "string", singleTable.getName(), "");
        new Column("fromLang", "string", singleTable.getName(), "");
        new Column("toLang", "string", singleTable.getName(), "");
        new Column("brand", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "originMD5";
        mAutoDBInfo.colsMap.put("originMD5", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "originMD5";
        mAutoDBInfo.columns[1] = "resultFile";
        mAutoDBInfo.colsMap.put("resultFile", "TEXT");
        mAutoDBInfo.columns[2] = "fromLang";
        mAutoDBInfo.colsMap.put("fromLang", "TEXT");
        mAutoDBInfo.columns[3] = "toLang";
        mAutoDBInfo.colsMap.put("toLang", "TEXT");
        mAutoDBInfo.columns[4] = "brand";
        mAutoDBInfo.colsMap.put("brand", "TEXT");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " originMD5 TEXT PRIMARY KEY ,  resultFile TEXT,  fromLang TEXT,  toLang TEXT,  brand TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38543c8)) {
            return false;
        }
        C38543c8 c8Var = (C38543c8) iAutoDBItem;
        return C46238a.m51546a(this.field_originMD5, c8Var.field_originMD5) && C46238a.m51546a(this.field_resultFile, c8Var.field_resultFile) && C46238a.m51546a(this.field_fromLang, c8Var.field_fromLang) && C46238a.m51546a(this.field_toLang, c8Var.field_toLang) && C46238a.m51546a(this.field_brand, c8Var.field_brand);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101996n == hashCode) {
                    try {
                        this.field_originMD5 = cursor.getString(i);
                        this.f102004d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseScanTranslationResult", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101997o == hashCode) {
                    try {
                        this.field_resultFile = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseScanTranslationResult", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101998p == hashCode) {
                    try {
                        this.field_fromLang = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseScanTranslationResult", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101999q == hashCode) {
                    try {
                        this.field_toLang = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseScanTranslationResult", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102000r == hashCode) {
                    try {
                        this.field_brand = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseScanTranslationResult", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102001s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102004d) {
            contentValues.put("originMD5", this.field_originMD5);
        }
        if (this.f102005e) {
            contentValues.put("resultFile", this.field_resultFile);
        }
        if (this.f102006f) {
            contentValues.put("fromLang", this.field_fromLang);
        }
        if (this.f102007g) {
            contentValues.put("toLang", this.field_toLang);
        }
        if (this.f102008h) {
            contentValues.put("brand", this.field_brand);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseScanTranslationResult", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ScanTranslationResult ( " + f102002t.sql + ");");
        for (String add : f101995j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseScanTranslationResult", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ScanTranslationResult", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102002t, "ScanTranslationResult", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseScanTranslationResult", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ScanTranslationResult", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseScanTranslationResult", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102002t;
    }

    public String[] getIndexCreateSQL() {
        return f101995j;
    }

    public StorageObserverOwner<C38543c8> getObserverOwner() {
        return f102003u;
    }

    public Object getPrimaryKeyValue() {
        return this.field_originMD5;
    }

    public SingleTable getTable() {
        return f101994i;
    }

    public String getTableName() {
        return f101994i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("originMD5")) {
            this.field_originMD5 = contentValues.getAsString("originMD5");
            if (z) {
                this.f102004d = true;
            }
        }
        if (contentValues.containsKey("resultFile")) {
            this.field_resultFile = contentValues.getAsString("resultFile");
            if (z) {
                this.f102005e = true;
            }
        }
        if (contentValues.containsKey("fromLang")) {
            this.field_fromLang = contentValues.getAsString("fromLang");
            if (z) {
                this.f102006f = true;
            }
        }
        if (contentValues.containsKey("toLang")) {
            this.field_toLang = contentValues.getAsString("toLang");
            if (z) {
                this.f102007g = true;
            }
        }
        if (contentValues.containsKey("brand")) {
            this.field_brand = contentValues.getAsString("brand");
            if (z) {
                this.f102008h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
