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
import i40.C46166d;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.a9 */
public class C53328a9 extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f148982i;

    /* renamed from: j */
    public static final String[] f148983j = new String[0];

    /* renamed from: n */
    public static final int f148984n = -1914377637;

    /* renamed from: o */
    public static final int f148985o = -1380546654;

    /* renamed from: p */
    public static final int f148986p = 399038527;

    /* renamed from: q */
    public static final int f148987q = 243860762;

    /* renamed from: r */
    public static final int f148988r = -600478452;

    /* renamed from: s */
    public static final int f148989s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f148990t = initAutoDBInfo(C53328a9.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C53328a9> f148991u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f148992d = true;

    /* renamed from: e */
    public boolean f148993e = true;

    /* renamed from: f */
    public boolean f148994f = true;
    public String field_conDescription;
    public String field_conPhone;
    public String field_conRemark;
    public String field_contactLabels;
    public String field_encryptUsername;

    /* renamed from: g */
    public boolean f148995g = true;

    /* renamed from: h */
    public boolean f148996h = true;

    static {
        SingleTable singleTable = new SingleTable("Stranger");
        f148982i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("encryptUsername", "string", singleTable.getName(), "");
        new Column("conRemark", "string", singleTable.getName(), "");
        new Column("contactLabels", "string", singleTable.getName(), "");
        new Column("conDescription", "string", singleTable.getName(), "");
        new Column("conPhone", "string", singleTable.getName(), "");
        new C46166d();
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "encryptUsername";
        mAutoDBInfo.colsMap.put("encryptUsername", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "encryptUsername";
        mAutoDBInfo.columns[1] = "conRemark";
        mAutoDBInfo.colsMap.put("conRemark", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "contactLabels";
        mAutoDBInfo.colsMap.put("contactLabels", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "conDescription";
        mAutoDBInfo.colsMap.put("conDescription", "TEXT default '' ");
        mAutoDBInfo.columns[4] = "conPhone";
        mAutoDBInfo.colsMap.put("conPhone", "TEXT default '' ");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " encryptUsername TEXT default ''  PRIMARY KEY ,  conRemark TEXT default '' ,  contactLabels TEXT default '' ,  conDescription TEXT default '' ,  conPhone TEXT default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53328a9)) {
            return false;
        }
        C53328a9 a9Var = (C53328a9) iAutoDBItem;
        return C46238a.m51546a(this.field_encryptUsername, a9Var.field_encryptUsername) && C46238a.m51546a(this.field_conRemark, a9Var.field_conRemark) && C46238a.m51546a(this.field_contactLabels, a9Var.field_contactLabels) && C46238a.m51546a(this.field_conDescription, a9Var.field_conDescription) && C46238a.m51546a(this.field_conPhone, a9Var.field_conPhone);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f148984n == hashCode) {
                    try {
                        this.field_encryptUsername = cursor.getString(i);
                        this.f148992d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStranger", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148985o == hashCode) {
                    try {
                        this.field_conRemark = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStranger", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148986p == hashCode) {
                    try {
                        this.field_contactLabels = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStranger", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148987q == hashCode) {
                    try {
                        this.field_conDescription = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStranger", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148988r == hashCode) {
                    try {
                        this.field_conPhone = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseStranger", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148989s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_encryptUsername == null) {
            this.field_encryptUsername = "";
        }
        if (this.f148992d) {
            contentValues.put("encryptUsername", this.field_encryptUsername);
        }
        if (this.field_conRemark == null) {
            this.field_conRemark = "";
        }
        if (this.f148993e) {
            contentValues.put("conRemark", this.field_conRemark);
        }
        if (this.field_contactLabels == null) {
            this.field_contactLabels = "";
        }
        if (this.f148994f) {
            contentValues.put("contactLabels", this.field_contactLabels);
        }
        if (this.field_conDescription == null) {
            this.field_conDescription = "";
        }
        if (this.f148995g) {
            contentValues.put("conDescription", this.field_conDescription);
        }
        if (this.field_conPhone == null) {
            this.field_conPhone = "";
        }
        if (this.f148996h) {
            contentValues.put("conPhone", this.field_conPhone);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseStranger", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS Stranger ( " + f148990t.sql + ");");
        for (String add : f148983j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseStranger", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("Stranger", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f148990t, "Stranger", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseStranger", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("Stranger", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseStranger", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f148990t;
    }

    public String[] getIndexCreateSQL() {
        return f148983j;
    }

    public StorageObserverOwner<C53328a9> getObserverOwner() {
        return f148991u;
    }

    public Object getPrimaryKeyValue() {
        return this.field_encryptUsername;
    }

    public SingleTable getTable() {
        return f148982i;
    }

    public String getTableName() {
        return f148982i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("encryptUsername")) {
            this.field_encryptUsername = contentValues.getAsString("encryptUsername");
            if (z) {
                this.f148992d = true;
            }
        }
        if (contentValues.containsKey("conRemark")) {
            this.field_conRemark = contentValues.getAsString("conRemark");
            if (z) {
                this.f148993e = true;
            }
        }
        if (contentValues.containsKey("contactLabels")) {
            this.field_contactLabels = contentValues.getAsString("contactLabels");
            if (z) {
                this.f148994f = true;
            }
        }
        if (contentValues.containsKey("conDescription")) {
            this.field_conDescription = contentValues.getAsString("conDescription");
            if (z) {
                this.f148995g = true;
            }
        }
        if (contentValues.containsKey("conPhone")) {
            this.field_conPhone = contentValues.getAsString("conPhone");
            if (z) {
                this.f148996h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
