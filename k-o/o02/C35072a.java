package o02;

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

/* renamed from: o02.a */
public class C35072a extends IAutoDBItem {

    /* renamed from: Z2 */
    public static final Column f94100Z2;

    /* renamed from: a3 */
    public static final int f94101a3 = -211304996;

    /* renamed from: g */
    public static final SingleTable f94102g;

    /* renamed from: h */
    public static final Column f94103h;

    /* renamed from: i */
    public static final Column f94104i;

    /* renamed from: j */
    public static final Column f94105j;

    /* renamed from: n */
    public static final String[] f94106n = new String[0];

    /* renamed from: o */
    public static final int f94107o = -202022634;

    /* renamed from: p */
    public static final int f94108p = -2124511164;

    /* renamed from: q */
    public static final int f94109q = 971458928;

    /* renamed from: r */
    public static final int f94110r = 108705909;

    /* renamed from: s */
    public static final IAutoDBItem.MAutoDBInfo f94111s = initAutoDBInfo(C35072a.class);

    /* renamed from: t */
    public static final StorageObserverOwner<C35072a> f94112t = new StorageObserverOwner<>();

    /* renamed from: Y2 */
    public boolean f94113Y2 = true;

    /* renamed from: d */
    public boolean f94114d = true;

    /* renamed from: e */
    public boolean f94115e = true;

    /* renamed from: f */
    public boolean f94116f = true;
    public String field_CommHashUserName;
    public String field_HardCodeHashUserName;
    public String field_HashUserName;
    public String field_UserName;

    static {
        SingleTable singleTable = new SingleTable("HashUserNameMap");
        f94102g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        f94103h = new Column("UserName", "string", singleTable.getName(), "");
        f94104i = new Column("HashUserName", "string", singleTable.getName(), "");
        f94105j = new Column("CommHashUserName", "string", singleTable.getName(), "");
        f94100Z2 = new Column("HardCodeHashUserName", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "UserName";
        mAutoDBInfo.colsMap.put("UserName", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "UserName";
        mAutoDBInfo.columns[1] = "HashUserName";
        mAutoDBInfo.colsMap.put("HashUserName", "TEXT");
        mAutoDBInfo.columns[2] = "CommHashUserName";
        mAutoDBInfo.colsMap.put("CommHashUserName", "TEXT");
        mAutoDBInfo.columns[3] = "HardCodeHashUserName";
        mAutoDBInfo.colsMap.put("HardCodeHashUserName", "TEXT");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " UserName TEXT PRIMARY KEY ,  HashUserName TEXT,  CommHashUserName TEXT,  HardCodeHashUserName TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C35072a)) {
            return false;
        }
        C35072a aVar = (C35072a) iAutoDBItem;
        return C46238a.m51546a(this.field_UserName, aVar.field_UserName) && C46238a.m51546a(this.field_HashUserName, aVar.field_HashUserName) && C46238a.m51546a(this.field_CommHashUserName, aVar.field_CommHashUserName) && C46238a.m51546a(this.field_HardCodeHashUserName, aVar.field_HardCodeHashUserName);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f94107o == hashCode) {
                    try {
                        this.field_UserName = cursor.getString(i);
                        this.f94114d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHashUserNameMap", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f94108p == hashCode) {
                    try {
                        this.field_HashUserName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHashUserNameMap", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f94109q == hashCode) {
                    try {
                        this.field_CommHashUserName = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHashUserNameMap", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f94101a3 == hashCode) {
                    try {
                        this.field_HardCodeHashUserName = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHashUserNameMap", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f94110r == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f94114d) {
            contentValues.put("UserName", this.field_UserName);
        }
        if (this.f94115e) {
            contentValues.put("HashUserName", this.field_HashUserName);
        }
        if (this.f94116f) {
            contentValues.put("CommHashUserName", this.field_CommHashUserName);
        }
        if (this.f94113Y2) {
            contentValues.put("HardCodeHashUserName", this.field_HardCodeHashUserName);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseHashUserNameMap", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS HashUserNameMap ( " + f94111s.sql + ");");
        for (String add : f94106n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseHashUserNameMap", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("HashUserNameMap", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f94111s, "HashUserNameMap", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseHashUserNameMap", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("HashUserNameMap", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseHashUserNameMap", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f94111s;
    }

    public String[] getIndexCreateSQL() {
        return f94106n;
    }

    public StorageObserverOwner<C35072a> getObserverOwner() {
        return f94112t;
    }

    public Object getPrimaryKeyValue() {
        return this.field_UserName;
    }

    public SingleTable getTable() {
        return f94102g;
    }

    public String getTableName() {
        return f94102g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("UserName")) {
            this.field_UserName = contentValues.getAsString("UserName");
            if (z) {
                this.f94114d = true;
            }
        }
        if (contentValues.containsKey("HashUserName")) {
            this.field_HashUserName = contentValues.getAsString("HashUserName");
            if (z) {
                this.f94115e = true;
            }
        }
        if (contentValues.containsKey("CommHashUserName")) {
            this.field_CommHashUserName = contentValues.getAsString("CommHashUserName");
            if (z) {
                this.f94116f = true;
            }
        }
        if (contentValues.containsKey("HardCodeHashUserName")) {
            this.field_HardCodeHashUserName = contentValues.getAsString("HardCodeHashUserName");
            if (z) {
                this.f94113Y2 = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
