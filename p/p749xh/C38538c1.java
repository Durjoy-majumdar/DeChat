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

/* renamed from: xh.c1 */
public class C38538c1 extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f101891h;

    /* renamed from: i */
    public static final String[] f101892i = {"CREATE INDEX IF NOT EXISTS CardQrCodeDataInfo_card_id_index ON CardQrCodeDataInfo(card_id)"};

    /* renamed from: j */
    public static final int f101893j = 941842605;

    /* renamed from: n */
    public static final int f101894n = 553933994;

    /* renamed from: o */
    public static final int f101895o = 3059181;

    /* renamed from: p */
    public static final int f101896p = -892481550;

    /* renamed from: q */
    public static final int f101897q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f101898r = initAutoDBInfo(C38538c1.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38538c1> f101899s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101900d = true;

    /* renamed from: e */
    public boolean f101901e = true;

    /* renamed from: f */
    public boolean f101902f = true;
    public String field_card_id;
    public String field_code;
    public String field_code_id;
    public int field_status;

    /* renamed from: g */
    public boolean f101903g = true;

    static {
        SingleTable singleTable = new SingleTable("CardQrCodeDataInfo");
        f101891h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("code_id", "string", singleTable.getName(), "");
        new Column("card_id", "string", singleTable.getName(), "");
        new Column("code", "string", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "code_id";
        mAutoDBInfo.colsMap.put("code_id", "TEXT");
        mAutoDBInfo.columns[1] = "card_id";
        mAutoDBInfo.colsMap.put("card_id", "TEXT");
        mAutoDBInfo.columns[2] = "code";
        mAutoDBInfo.colsMap.put("code", "TEXT");
        mAutoDBInfo.columns[3] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " code_id TEXT,  card_id TEXT,  code TEXT,  status INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38538c1)) {
            return false;
        }
        C38538c1 c1Var = (C38538c1) iAutoDBItem;
        return C46238a.m51546a(this.field_code_id, c1Var.field_code_id) && C46238a.m51546a(this.field_card_id, c1Var.field_card_id) && C46238a.m51546a(this.field_code, c1Var.field_code) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(c1Var.field_status));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101893j == hashCode) {
                    try {
                        this.field_code_id = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeDataInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101894n == hashCode) {
                    try {
                        this.field_card_id = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeDataInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101895o == hashCode) {
                    try {
                        this.field_code = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeDataInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101896p == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardQrCodeDataInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101897q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101900d) {
            contentValues.put("code_id", this.field_code_id);
        }
        if (this.f101901e) {
            contentValues.put("card_id", this.field_card_id);
        }
        if (this.f101902f) {
            contentValues.put("code", this.field_code);
        }
        if (this.f101903g) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseCardQrCodeDataInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS CardQrCodeDataInfo ( " + f101898r.sql + ");");
        for (String add : f101892i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseCardQrCodeDataInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("CardQrCodeDataInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101898r, "CardQrCodeDataInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseCardQrCodeDataInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("CardQrCodeDataInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseCardQrCodeDataInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101898r;
    }

    public String[] getIndexCreateSQL() {
        return f101892i;
    }

    public StorageObserverOwner<C38538c1> getObserverOwner() {
        return f101899s;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f101891h;
    }

    public String getTableName() {
        return f101891h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("code_id")) {
            this.field_code_id = contentValues.getAsString("code_id");
            if (z) {
                this.f101900d = true;
            }
        }
        if (contentValues.containsKey("card_id")) {
            this.field_card_id = contentValues.getAsString("card_id");
            if (z) {
                this.f101901e = true;
            }
        }
        if (contentValues.containsKey("code")) {
            this.field_code = contentValues.getAsString("code");
            if (z) {
                this.f101902f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f101903g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
