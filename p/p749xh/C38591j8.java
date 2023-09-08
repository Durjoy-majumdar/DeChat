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
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.j8 */
public class C38591j8 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f102672A = 747804969;

    /* renamed from: B */
    public static final int f102673B = 3145580;

    /* renamed from: C */
    public static final int f102674C = 108705909;

    /* renamed from: D */
    public static final IAutoDBItem.MAutoDBInfo f102675D = initAutoDBInfo(C38591j8.class);

    /* renamed from: E */
    public static final StorageObserverOwner<C38591j8> f102676E = new StorageObserverOwner<>();

    /* renamed from: q */
    public static final SingleTable f102677q;

    /* renamed from: r */
    public static final String[] f102678r = new String[0];

    /* renamed from: s */
    public static final int f102679s = 106079;

    /* renamed from: t */
    public static final int f102680t = 900177862;

    /* renamed from: u */
    public static final int f102681u = 526214961;

    /* renamed from: v */
    public static final int f102682v = -934466386;

    /* renamed from: w */
    public static final int f102683w = -1619782072;

    /* renamed from: x */
    public static final int f102684x = -1363903651;

    /* renamed from: y */
    public static final int f102685y = -735721945;

    /* renamed from: z */
    public static final int f102686z = -126620723;

    /* renamed from: d */
    public boolean f102687d = true;

    /* renamed from: e */
    public boolean f102688e = true;

    /* renamed from: f */
    public boolean f102689f = true;
    public String field_cnValue;
    public int field_eggIndex;
    public String field_enValue;
    public String field_fileName;
    public int field_flag;
    public String field_key;
    public int field_position;
    public String field_qqValue;
    public String field_thValue;
    public String field_twValue;

    /* renamed from: g */
    public boolean f102690g = true;

    /* renamed from: h */
    public boolean f102691h = true;

    /* renamed from: i */
    public boolean f102692i = true;

    /* renamed from: j */
    public boolean f102693j = true;

    /* renamed from: n */
    public boolean f102694n = true;

    /* renamed from: o */
    public boolean f102695o = true;

    /* renamed from: p */
    public boolean f102696p = true;

    static {
        SingleTable singleTable = new SingleTable("SmileyInfo");
        f102677q = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("key", "string", singleTable.getName(), "");
        new Column("cnValue", "string", singleTable.getName(), "");
        new Column("qqValue", "string", singleTable.getName(), "");
        new Column("twValue", "string", singleTable.getName(), "");
        new Column("enValue", "string", singleTable.getName(), "");
        new Column("thValue", "string", singleTable.getName(), "");
        new Column(DownloadInfo.FILENAME, "string", singleTable.getName(), "");
        new Column("eggIndex", "int", singleTable.getName(), "");
        new Column("position", "int", singleTable.getName(), "");
        new Column("flag", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[10];
        String[] strArr = new String[11];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "key";
        mAutoDBInfo.colsMap.put("key", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "key";
        mAutoDBInfo.columns[1] = "cnValue";
        mAutoDBInfo.colsMap.put("cnValue", "TEXT");
        mAutoDBInfo.columns[2] = "qqValue";
        mAutoDBInfo.colsMap.put("qqValue", "TEXT");
        mAutoDBInfo.columns[3] = "twValue";
        mAutoDBInfo.colsMap.put("twValue", "TEXT");
        mAutoDBInfo.columns[4] = "enValue";
        mAutoDBInfo.colsMap.put("enValue", "TEXT");
        mAutoDBInfo.columns[5] = "thValue";
        mAutoDBInfo.colsMap.put("thValue", "TEXT");
        mAutoDBInfo.columns[6] = DownloadInfo.FILENAME;
        mAutoDBInfo.colsMap.put(DownloadInfo.FILENAME, "TEXT");
        mAutoDBInfo.columns[7] = "eggIndex";
        mAutoDBInfo.colsMap.put("eggIndex", "INTEGER default '-1' ");
        mAutoDBInfo.columns[8] = "position";
        mAutoDBInfo.colsMap.put("position", "INTEGER default '-1' ");
        mAutoDBInfo.columns[9] = "flag";
        mAutoDBInfo.colsMap.put("flag", "INTEGER");
        mAutoDBInfo.columns[10] = "rowid";
        mAutoDBInfo.sql = " key TEXT PRIMARY KEY ,  cnValue TEXT,  qqValue TEXT,  twValue TEXT,  enValue TEXT,  thValue TEXT,  fileName TEXT,  eggIndex INTEGER default '-1' ,  position INTEGER default '-1' ,  flag INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38591j8)) {
            return false;
        }
        C38591j8 j8Var = (C38591j8) iAutoDBItem;
        return C46238a.m51546a(this.field_key, j8Var.field_key) && C46238a.m51546a(this.field_cnValue, j8Var.field_cnValue) && C46238a.m51546a(this.field_qqValue, j8Var.field_qqValue) && C46238a.m51546a(this.field_twValue, j8Var.field_twValue) && C46238a.m51546a(this.field_enValue, j8Var.field_enValue) && C46238a.m51546a(this.field_thValue, j8Var.field_thValue) && C46238a.m51546a(this.field_fileName, j8Var.field_fileName) && C46238a.m51546a(Integer.valueOf(this.field_eggIndex), Integer.valueOf(j8Var.field_eggIndex)) && C46238a.m51546a(Integer.valueOf(this.field_position), Integer.valueOf(j8Var.field_position)) && C46238a.m51546a(Integer.valueOf(this.field_flag), Integer.valueOf(j8Var.field_flag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102679s == hashCode) {
                    try {
                        this.field_key = cursor.getString(i);
                        this.f102687d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102680t == hashCode) {
                    try {
                        this.field_cnValue = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102681u == hashCode) {
                    try {
                        this.field_qqValue = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102682v == hashCode) {
                    try {
                        this.field_twValue = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102683w == hashCode) {
                    try {
                        this.field_enValue = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102684x == hashCode) {
                    try {
                        this.field_thValue = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102685y == hashCode) {
                    try {
                        this.field_fileName = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102686z == hashCode) {
                    try {
                        this.field_eggIndex = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102672A == hashCode) {
                    try {
                        this.field_position = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102673B == hashCode) {
                    try {
                        this.field_flag = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102674C == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102687d) {
            contentValues.put("key", this.field_key);
        }
        if (this.f102688e) {
            contentValues.put("cnValue", this.field_cnValue);
        }
        if (this.f102689f) {
            contentValues.put("qqValue", this.field_qqValue);
        }
        if (this.f102690g) {
            contentValues.put("twValue", this.field_twValue);
        }
        if (this.f102691h) {
            contentValues.put("enValue", this.field_enValue);
        }
        if (this.f102692i) {
            contentValues.put("thValue", this.field_thValue);
        }
        if (this.f102693j) {
            contentValues.put(DownloadInfo.FILENAME, this.field_fileName);
        }
        if (this.f102694n) {
            contentValues.put("eggIndex", Integer.valueOf(this.field_eggIndex));
        }
        if (this.f102695o) {
            contentValues.put("position", Integer.valueOf(this.field_position));
        }
        if (this.f102696p) {
            contentValues.put("flag", Integer.valueOf(this.field_flag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseSmileyInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS SmileyInfo ( " + f102675D.sql + ");");
        for (String add : f102678r) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseSmileyInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("SmileyInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102675D, "SmileyInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseSmileyInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("SmileyInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseSmileyInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102675D;
    }

    public String[] getIndexCreateSQL() {
        return f102678r;
    }

    public StorageObserverOwner<C38591j8> getObserverOwner() {
        return f102676E;
    }

    public Object getPrimaryKeyValue() {
        return this.field_key;
    }

    public SingleTable getTable() {
        return f102677q;
    }

    public String getTableName() {
        return f102677q.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z) {
                this.f102687d = true;
            }
        }
        if (contentValues.containsKey("cnValue")) {
            this.field_cnValue = contentValues.getAsString("cnValue");
            if (z) {
                this.f102688e = true;
            }
        }
        if (contentValues.containsKey("qqValue")) {
            this.field_qqValue = contentValues.getAsString("qqValue");
            if (z) {
                this.f102689f = true;
            }
        }
        if (contentValues.containsKey("twValue")) {
            this.field_twValue = contentValues.getAsString("twValue");
            if (z) {
                this.f102690g = true;
            }
        }
        if (contentValues.containsKey("enValue")) {
            this.field_enValue = contentValues.getAsString("enValue");
            if (z) {
                this.f102691h = true;
            }
        }
        if (contentValues.containsKey("thValue")) {
            this.field_thValue = contentValues.getAsString("thValue");
            if (z) {
                this.f102692i = true;
            }
        }
        if (contentValues.containsKey(DownloadInfo.FILENAME)) {
            this.field_fileName = contentValues.getAsString(DownloadInfo.FILENAME);
            if (z) {
                this.f102693j = true;
            }
        }
        if (contentValues.containsKey("eggIndex")) {
            this.field_eggIndex = contentValues.getAsInteger("eggIndex").intValue();
            if (z) {
                this.f102694n = true;
            }
        }
        if (contentValues.containsKey("position")) {
            this.field_position = contentValues.getAsInteger("position").intValue();
            if (z) {
                this.f102695o = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsInteger("flag").intValue();
            if (z) {
                this.f102696p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
