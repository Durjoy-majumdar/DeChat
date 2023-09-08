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

/* renamed from: xh.a4 */
public class C38520a4 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f101609A = 108705909;

    /* renamed from: B */
    public static final IAutoDBItem.MAutoDBInfo f101610B = initAutoDBInfo(C38520a4.class);

    /* renamed from: C */
    public static final StorageObserverOwner<C38520a4> f101611C = new StorageObserverOwner<>();

    /* renamed from: p */
    public static final SingleTable f101612p;

    /* renamed from: q */
    public static final String[] f101613q = new String[0];

    /* renamed from: r */
    public static final int f101614r = 1122917504;

    /* renamed from: s */
    public static final int f101615s = -932289015;

    /* renamed from: t */
    public static final int f101616t = 1575353202;

    /* renamed from: u */
    public static final int f101617u = -56677412;

    /* renamed from: v */
    public static final int f101618v = -202169596;

    /* renamed from: w */
    public static final int f101619w = -202022634;

    /* renamed from: x */
    public static final int f101620x = 358154831;

    /* renamed from: y */
    public static final int f101621y = -1808614382;

    /* renamed from: z */
    public static final int f101622z = 2622298;

    /* renamed from: d */
    public boolean f101623d = true;

    /* renamed from: e */
    public boolean f101624e = true;

    /* renamed from: f */
    public boolean f101625f = true;
    public long field_CreateTime;
    public String field_Description;
    public long field_ExpiredTime;
    public String field_ExtInfo;
    public String field_ForcePushId;
    public int field_Status;
    public int field_Type;
    public String field_UserIcon;
    public String field_UserName;

    /* renamed from: g */
    public boolean f101626g = true;

    /* renamed from: h */
    public boolean f101627h = true;

    /* renamed from: i */
    public boolean f101628i = true;

    /* renamed from: j */
    public boolean f101629j = true;

    /* renamed from: n */
    public boolean f101630n = true;

    /* renamed from: o */
    public boolean f101631o = true;

    static {
        SingleTable singleTable = new SingleTable("ForceNotifyData");
        f101612p = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("ForcePushId", "string", singleTable.getName(), "");
        new Column("CreateTime", "long", singleTable.getName(), "");
        new Column("ExpiredTime", "long", singleTable.getName(), "");
        new Column("Description", "string", singleTable.getName(), "");
        new Column("UserIcon", "string", singleTable.getName(), "");
        new Column("UserName", "string", singleTable.getName(), "");
        new Column("ExtInfo", "string", singleTable.getName(), "");
        new Column("Status", "int", singleTable.getName(), "");
        new Column("Type", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[9];
        String[] strArr = new String[10];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "ForcePushId";
        mAutoDBInfo.colsMap.put("ForcePushId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "ForcePushId";
        mAutoDBInfo.columns[1] = "CreateTime";
        mAutoDBInfo.colsMap.put("CreateTime", "LONG");
        mAutoDBInfo.columns[2] = "ExpiredTime";
        mAutoDBInfo.colsMap.put("ExpiredTime", "LONG");
        mAutoDBInfo.columns[3] = "Description";
        mAutoDBInfo.colsMap.put("Description", "TEXT");
        mAutoDBInfo.columns[4] = "UserIcon";
        mAutoDBInfo.colsMap.put("UserIcon", "TEXT");
        mAutoDBInfo.columns[5] = "UserName";
        mAutoDBInfo.colsMap.put("UserName", "TEXT");
        mAutoDBInfo.columns[6] = "ExtInfo";
        mAutoDBInfo.colsMap.put("ExtInfo", "TEXT");
        mAutoDBInfo.columns[7] = "Status";
        mAutoDBInfo.colsMap.put("Status", "INTEGER default '0' ");
        mAutoDBInfo.columns[8] = "Type";
        mAutoDBInfo.colsMap.put("Type", "INTEGER default '0' ");
        mAutoDBInfo.columns[9] = "rowid";
        mAutoDBInfo.sql = " ForcePushId TEXT PRIMARY KEY ,  CreateTime LONG,  ExpiredTime LONG,  Description TEXT,  UserIcon TEXT,  UserName TEXT,  ExtInfo TEXT,  Status INTEGER default '0' ,  Type INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38520a4)) {
            return false;
        }
        C38520a4 a4Var = (C38520a4) iAutoDBItem;
        return C46238a.m51546a(this.field_ForcePushId, a4Var.field_ForcePushId) && C46238a.m51546a(Long.valueOf(this.field_CreateTime), Long.valueOf(a4Var.field_CreateTime)) && C46238a.m51546a(Long.valueOf(this.field_ExpiredTime), Long.valueOf(a4Var.field_ExpiredTime)) && C46238a.m51546a(this.field_Description, a4Var.field_Description) && C46238a.m51546a(this.field_UserIcon, a4Var.field_UserIcon) && C46238a.m51546a(this.field_UserName, a4Var.field_UserName) && C46238a.m51546a(this.field_ExtInfo, a4Var.field_ExtInfo) && C46238a.m51546a(Integer.valueOf(this.field_Status), Integer.valueOf(a4Var.field_Status)) && C46238a.m51546a(Integer.valueOf(this.field_Type), Integer.valueOf(a4Var.field_Type));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101614r == hashCode) {
                    try {
                        this.field_ForcePushId = cursor.getString(i);
                        this.f101623d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseForceNotifyData", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101615s == hashCode) {
                    try {
                        this.field_CreateTime = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseForceNotifyData", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101616t == hashCode) {
                    try {
                        this.field_ExpiredTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseForceNotifyData", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101617u == hashCode) {
                    try {
                        this.field_Description = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseForceNotifyData", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101618v == hashCode) {
                    try {
                        this.field_UserIcon = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseForceNotifyData", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101619w == hashCode) {
                    try {
                        this.field_UserName = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseForceNotifyData", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101620x == hashCode) {
                    try {
                        this.field_ExtInfo = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseForceNotifyData", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101621y == hashCode) {
                    try {
                        this.field_Status = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseForceNotifyData", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101622z == hashCode) {
                    try {
                        this.field_Type = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseForceNotifyData", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101609A == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101623d) {
            contentValues.put("ForcePushId", this.field_ForcePushId);
        }
        if (this.f101624e) {
            contentValues.put("CreateTime", Long.valueOf(this.field_CreateTime));
        }
        if (this.f101625f) {
            contentValues.put("ExpiredTime", Long.valueOf(this.field_ExpiredTime));
        }
        if (this.f101626g) {
            contentValues.put("Description", this.field_Description);
        }
        if (this.f101627h) {
            contentValues.put("UserIcon", this.field_UserIcon);
        }
        if (this.f101628i) {
            contentValues.put("UserName", this.field_UserName);
        }
        if (this.f101629j) {
            contentValues.put("ExtInfo", this.field_ExtInfo);
        }
        if (this.f101630n) {
            contentValues.put("Status", Integer.valueOf(this.field_Status));
        }
        if (this.f101631o) {
            contentValues.put("Type", Integer.valueOf(this.field_Type));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseForceNotifyData", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ForceNotifyData ( " + f101610B.sql + ");");
        for (String add : f101613q) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseForceNotifyData", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ForceNotifyData", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101610B, "ForceNotifyData", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseForceNotifyData", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ForceNotifyData", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseForceNotifyData", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101610B;
    }

    public String[] getIndexCreateSQL() {
        return f101613q;
    }

    public StorageObserverOwner<C38520a4> getObserverOwner() {
        return f101611C;
    }

    public Object getPrimaryKeyValue() {
        return this.field_ForcePushId;
    }

    public SingleTable getTable() {
        return f101612p;
    }

    public String getTableName() {
        return f101612p.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("ForcePushId")) {
            this.field_ForcePushId = contentValues.getAsString("ForcePushId");
            if (z) {
                this.f101623d = true;
            }
        }
        if (contentValues.containsKey("CreateTime")) {
            this.field_CreateTime = contentValues.getAsLong("CreateTime").longValue();
            if (z) {
                this.f101624e = true;
            }
        }
        if (contentValues.containsKey("ExpiredTime")) {
            this.field_ExpiredTime = contentValues.getAsLong("ExpiredTime").longValue();
            if (z) {
                this.f101625f = true;
            }
        }
        if (contentValues.containsKey("Description")) {
            this.field_Description = contentValues.getAsString("Description");
            if (z) {
                this.f101626g = true;
            }
        }
        if (contentValues.containsKey("UserIcon")) {
            this.field_UserIcon = contentValues.getAsString("UserIcon");
            if (z) {
                this.f101627h = true;
            }
        }
        if (contentValues.containsKey("UserName")) {
            this.field_UserName = contentValues.getAsString("UserName");
            if (z) {
                this.f101628i = true;
            }
        }
        if (contentValues.containsKey("ExtInfo")) {
            this.field_ExtInfo = contentValues.getAsString("ExtInfo");
            if (z) {
                this.f101629j = true;
            }
        }
        if (contentValues.containsKey("Status")) {
            this.field_Status = contentValues.getAsInteger("Status").intValue();
            if (z) {
                this.f101630n = true;
            }
        }
        if (contentValues.containsKey("Type")) {
            this.field_Type = contentValues.getAsInteger("Type").intValue();
            if (z) {
                this.f101631o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
