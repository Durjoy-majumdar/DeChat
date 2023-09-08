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
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.b1 */
public class C38528b1 extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f101725n;

    /* renamed from: o */
    public static final String[] f101726o = new String[0];

    /* renamed from: p */
    public static final int f101727p = 553933994;

    /* renamed from: q */
    public static final int f101728q = -634010944;

    /* renamed from: r */
    public static final int f101729r = -162366031;

    /* renamed from: s */
    public static final int f101730s = -22811622;

    /* renamed from: t */
    public static final int f101731t = -1056667945;

    /* renamed from: u */
    public static final int f101732u = -1255079261;

    /* renamed from: v */
    public static final int f101733v = 305998130;

    /* renamed from: w */
    public static final int f101734w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f101735x = initAutoDBInfo(C38528b1.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C38528b1> f101736y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101737d = true;

    /* renamed from: e */
    public boolean f101738e = true;

    /* renamed from: f */
    public boolean f101739f = true;
    public String field_card_id;
    public int field_expire_time_interval;
    public long field_fetch_time;
    public int field_lower_bound;
    public boolean field_need_insert_show_timestamp;
    public int field_show_expire_interval;
    public String field_show_timestamp_encrypt_key;

    /* renamed from: g */
    public boolean f101740g = true;

    /* renamed from: h */
    public boolean f101741h = true;

    /* renamed from: i */
    public boolean f101742i = true;

    /* renamed from: j */
    public boolean f101743j = true;

    static {
        SingleTable singleTable = new SingleTable("CardQrCodeConfi");
        f101725n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("card_id", "string", singleTable.getName(), "");
        new Column("lower_bound", "int", singleTable.getName(), "");
        new Column("need_insert_show_timestamp", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("show_timestamp_encrypt_key", "string", singleTable.getName(), "");
        new Column("expire_time_interval", "int", singleTable.getName(), "");
        new Column("show_expire_interval", "int", singleTable.getName(), "");
        new Column("fetch_time", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "card_id";
        mAutoDBInfo.colsMap.put("card_id", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "card_id";
        mAutoDBInfo.columns[1] = "lower_bound";
        mAutoDBInfo.colsMap.put("lower_bound", "INTEGER");
        mAutoDBInfo.columns[2] = "need_insert_show_timestamp";
        mAutoDBInfo.colsMap.put("need_insert_show_timestamp", "INTEGER default 'false' ");
        mAutoDBInfo.columns[3] = "show_timestamp_encrypt_key";
        mAutoDBInfo.colsMap.put("show_timestamp_encrypt_key", "TEXT");
        mAutoDBInfo.columns[4] = "expire_time_interval";
        mAutoDBInfo.colsMap.put("expire_time_interval", "INTEGER");
        mAutoDBInfo.columns[5] = "show_expire_interval";
        mAutoDBInfo.colsMap.put("show_expire_interval", "INTEGER");
        mAutoDBInfo.columns[6] = "fetch_time";
        mAutoDBInfo.colsMap.put("fetch_time", "LONG");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " card_id TEXT PRIMARY KEY ,  lower_bound INTEGER,  need_insert_show_timestamp INTEGER default 'false' ,  show_timestamp_encrypt_key TEXT,  expire_time_interval INTEGER,  show_expire_interval INTEGER,  fetch_time LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38528b1)) {
            return false;
        }
        C38528b1 b1Var = (C38528b1) iAutoDBItem;
        return C46238a.m51546a(this.field_card_id, b1Var.field_card_id) && C46238a.m51546a(Integer.valueOf(this.field_lower_bound), Integer.valueOf(b1Var.field_lower_bound)) && C46238a.m51546a(Boolean.valueOf(this.field_need_insert_show_timestamp), Boolean.valueOf(b1Var.field_need_insert_show_timestamp)) && C46238a.m51546a(this.field_show_timestamp_encrypt_key, b1Var.field_show_timestamp_encrypt_key) && C46238a.m51546a(Integer.valueOf(this.field_expire_time_interval), Integer.valueOf(b1Var.field_expire_time_interval)) && C46238a.m51546a(Integer.valueOf(this.field_show_expire_interval), Integer.valueOf(b1Var.field_show_expire_interval)) && C46238a.m51546a(Long.valueOf(this.field_fetch_time), Long.valueOf(b1Var.field_fetch_time));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101727p == hashCode) {
                    try {
                        this.field_card_id = cursor.getString(i);
                        this.f101737d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeConfi", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101728q == hashCode) {
                    try {
                        this.field_lower_bound = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeConfi", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101729r == hashCode) {
                    try {
                        this.field_need_insert_show_timestamp = cursor.getInt(i) != 0;
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeConfi", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101730s == hashCode) {
                    try {
                        this.field_show_timestamp_encrypt_key = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeConfi", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101731t == hashCode) {
                    try {
                        this.field_expire_time_interval = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeConfi", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101732u == hashCode) {
                    try {
                        this.field_show_expire_interval = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeConfi", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101733v == hashCode) {
                    try {
                        this.field_fetch_time = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeConfi", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101734w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101737d) {
            contentValues.put("card_id", this.field_card_id);
        }
        if (this.f101738e) {
            contentValues.put("lower_bound", Integer.valueOf(this.field_lower_bound));
        }
        if (this.f101739f) {
            if (this.field_need_insert_show_timestamp) {
                contentValues.put("need_insert_show_timestamp", 1);
            } else {
                contentValues.put("need_insert_show_timestamp", 0);
            }
        }
        if (this.f101740g) {
            contentValues.put("show_timestamp_encrypt_key", this.field_show_timestamp_encrypt_key);
        }
        if (this.f101741h) {
            contentValues.put("expire_time_interval", Integer.valueOf(this.field_expire_time_interval));
        }
        if (this.f101742i) {
            contentValues.put("show_expire_interval", Integer.valueOf(this.field_show_expire_interval));
        }
        if (this.f101743j) {
            contentValues.put("fetch_time", Long.valueOf(this.field_fetch_time));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseCardQrCodeConfi", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS CardQrCodeConfi ( " + f101735x.sql + ");");
        for (String add : f101726o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseCardQrCodeConfi", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("CardQrCodeConfi", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101735x, "CardQrCodeConfi", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseCardQrCodeConfi", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("CardQrCodeConfi", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseCardQrCodeConfi", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101735x;
    }

    public String[] getIndexCreateSQL() {
        return f101726o;
    }

    public StorageObserverOwner<C38528b1> getObserverOwner() {
        return f101736y;
    }

    public Object getPrimaryKeyValue() {
        return this.field_card_id;
    }

    public SingleTable getTable() {
        return f101725n;
    }

    public String getTableName() {
        return f101725n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("card_id")) {
            this.field_card_id = contentValues.getAsString("card_id");
            if (z) {
                this.f101737d = true;
            }
        }
        if (contentValues.containsKey("lower_bound")) {
            this.field_lower_bound = contentValues.getAsInteger("lower_bound").intValue();
            if (z) {
                this.f101738e = true;
            }
        }
        if (contentValues.containsKey("need_insert_show_timestamp")) {
            this.field_need_insert_show_timestamp = contentValues.getAsInteger("need_insert_show_timestamp").intValue() != 0;
            if (z) {
                this.f101739f = true;
            }
        }
        if (contentValues.containsKey("show_timestamp_encrypt_key")) {
            this.field_show_timestamp_encrypt_key = contentValues.getAsString("show_timestamp_encrypt_key");
            if (z) {
                this.f101740g = true;
            }
        }
        if (contentValues.containsKey("expire_time_interval")) {
            this.field_expire_time_interval = contentValues.getAsInteger("expire_time_interval").intValue();
            if (z) {
                this.f101741h = true;
            }
        }
        if (contentValues.containsKey("show_expire_interval")) {
            this.field_show_expire_interval = contentValues.getAsInteger("show_expire_interval").intValue();
            if (z) {
                this.f101742i = true;
            }
        }
        if (contentValues.containsKey("fetch_time")) {
            this.field_fetch_time = contentValues.getAsLong("fetch_time").longValue();
            if (z) {
                this.f101743j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
