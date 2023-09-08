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

/* renamed from: xh.c7 */
public class C38542c7 extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f101977j;

    /* renamed from: n */
    public static final String[] f101978n = new String[0];

    /* renamed from: o */
    public static final int f101979o = 93028124;

    /* renamed from: p */
    public static final int f101980p = 908759025;

    /* renamed from: q */
    public static final int f101981q = -892481550;

    /* renamed from: r */
    public static final int f101982r = 1728931352;

    /* renamed from: s */
    public static final int f101983s = -1519726489;

    /* renamed from: t */
    public static final int f101984t = -1294486128;

    /* renamed from: u */
    public static final int f101985u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f101986v = initAutoDBInfo(C38542c7.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C38542c7> f101987w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101988d = true;

    /* renamed from: e */
    public boolean f101989e = true;

    /* renamed from: f */
    public boolean f101990f = true;
    public String field_appId;
    public int field_msgState;
    public int field_msgTypeFlag;
    public String field_packageName;
    public int field_sceneFlag;
    public int field_status;

    /* renamed from: g */
    public boolean f101991g = true;

    /* renamed from: h */
    public boolean f101992h = true;

    /* renamed from: i */
    public boolean f101993i = true;

    static {
        SingleTable singleTable = new SingleTable("OpenMsgListener");
        f101977j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("packageName", "string", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("sceneFlag", "int", singleTable.getName(), "");
        new Column("msgTypeFlag", "int", singleTable.getName(), "");
        new Column("msgState", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "appId";
        mAutoDBInfo.columns[1] = "packageName";
        mAutoDBInfo.colsMap.put("packageName", "TEXT");
        mAutoDBInfo.columns[2] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER default '0' ");
        mAutoDBInfo.columns[3] = "sceneFlag";
        mAutoDBInfo.colsMap.put("sceneFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[4] = "msgTypeFlag";
        mAutoDBInfo.colsMap.put("msgTypeFlag", "INTEGER default '0' ");
        mAutoDBInfo.columns[5] = "msgState";
        mAutoDBInfo.colsMap.put("msgState", "INTEGER default '0' ");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " appId TEXT PRIMARY KEY ,  packageName TEXT,  status INTEGER default '0' ,  sceneFlag INTEGER default '0' ,  msgTypeFlag INTEGER default '0' ,  msgState INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38542c7)) {
            return false;
        }
        C38542c7 c7Var = (C38542c7) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, c7Var.field_appId) && C46238a.m51546a(this.field_packageName, c7Var.field_packageName) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(c7Var.field_status)) && C46238a.m51546a(Integer.valueOf(this.field_sceneFlag), Integer.valueOf(c7Var.field_sceneFlag)) && C46238a.m51546a(Integer.valueOf(this.field_msgTypeFlag), Integer.valueOf(c7Var.field_msgTypeFlag)) && C46238a.m51546a(Integer.valueOf(this.field_msgState), Integer.valueOf(c7Var.field_msgState));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101979o == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                        this.f101988d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenMsgListener", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101980p == hashCode) {
                    try {
                        this.field_packageName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenMsgListener", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101981q == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenMsgListener", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101982r == hashCode) {
                    try {
                        this.field_sceneFlag = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenMsgListener", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101983s == hashCode) {
                    try {
                        this.field_msgTypeFlag = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenMsgListener", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101984t == hashCode) {
                    try {
                        this.field_msgState = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenMsgListener", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101985u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101988d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f101989e) {
            contentValues.put("packageName", this.field_packageName);
        }
        if (this.f101990f) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f101991g) {
            contentValues.put("sceneFlag", Integer.valueOf(this.field_sceneFlag));
        }
        if (this.f101992h) {
            contentValues.put("msgTypeFlag", Integer.valueOf(this.field_msgTypeFlag));
        }
        if (this.f101993i) {
            contentValues.put("msgState", Integer.valueOf(this.field_msgState));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseOpenMsgListener", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS OpenMsgListener ( " + f101986v.sql + ");");
        for (String add : f101978n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseOpenMsgListener", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("OpenMsgListener", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101986v, "OpenMsgListener", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseOpenMsgListener", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("OpenMsgListener", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseOpenMsgListener", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101986v;
    }

    public String[] getIndexCreateSQL() {
        return f101978n;
    }

    public StorageObserverOwner<C38542c7> getObserverOwner() {
        return f101987w;
    }

    public Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    public SingleTable getTable() {
        return f101977j;
    }

    public String getTableName() {
        return f101977j.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f101988d = true;
            }
        }
        if (contentValues.containsKey("packageName")) {
            this.field_packageName = contentValues.getAsString("packageName");
            if (z) {
                this.f101989e = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f101990f = true;
            }
        }
        if (contentValues.containsKey("sceneFlag")) {
            this.field_sceneFlag = contentValues.getAsInteger("sceneFlag").intValue();
            if (z) {
                this.f101991g = true;
            }
        }
        if (contentValues.containsKey("msgTypeFlag")) {
            this.field_msgTypeFlag = contentValues.getAsInteger("msgTypeFlag").intValue();
            if (z) {
                this.f101992h = true;
            }
        }
        if (contentValues.containsKey("msgState")) {
            this.field_msgState = contentValues.getAsInteger("msgState").intValue();
            if (z) {
                this.f101993i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
