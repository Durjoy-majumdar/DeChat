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

/* renamed from: xh.qa */
public class C38646qa extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f103431j;

    /* renamed from: n */
    public static final String[] f103432n = new String[0];

    /* renamed from: o */
    public static final int f103433o = -1234040018;

    /* renamed from: p */
    public static final int f103434p = 2097344405;

    /* renamed from: q */
    public static final int f103435q = -1294486128;

    /* renamed from: r */
    public static final int f103436r = 951530617;

    /* renamed from: s */
    public static final int f103437s = 805826154;

    /* renamed from: t */
    public static final int f103438t = -1039977034;

    /* renamed from: u */
    public static final int f103439u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f103440v = initAutoDBInfo(C38646qa.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C38646qa> f103441w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103442d = true;

    /* renamed from: e */
    public boolean f103443e = true;

    /* renamed from: f */
    public boolean f103444f = true;
    public int field_btnState;
    public String field_content;
    public String field_contentColor;
    public int field_msgState;
    public int field_shareKeyHash;
    public int field_updatePeroid;

    /* renamed from: g */
    public boolean f103445g = true;

    /* renamed from: h */
    public boolean f103446h = true;

    /* renamed from: i */
    public boolean f103447i = true;

    static {
        SingleTable singleTable = new SingleTable("WxaUpdateableMsg");
        f103431j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("shareKeyHash", "int", singleTable.getName(), "");
        new Column("btnState", "int", singleTable.getName(), "");
        new Column("msgState", "int", singleTable.getName(), "");
        new Column("content", "string", singleTable.getName(), "");
        new Column("contentColor", "string", singleTable.getName(), "");
        new Column("updatePeroid", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "shareKeyHash";
        mAutoDBInfo.colsMap.put("shareKeyHash", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "shareKeyHash";
        mAutoDBInfo.columns[1] = "btnState";
        mAutoDBInfo.colsMap.put("btnState", "INTEGER");
        mAutoDBInfo.columns[2] = "msgState";
        mAutoDBInfo.colsMap.put("msgState", "INTEGER");
        mAutoDBInfo.columns[3] = "content";
        mAutoDBInfo.colsMap.put("content", "TEXT");
        mAutoDBInfo.columns[4] = "contentColor";
        mAutoDBInfo.colsMap.put("contentColor", "TEXT");
        mAutoDBInfo.columns[5] = "updatePeroid";
        mAutoDBInfo.colsMap.put("updatePeroid", "INTEGER");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " shareKeyHash INTEGER PRIMARY KEY ,  btnState INTEGER,  msgState INTEGER,  content TEXT,  contentColor TEXT,  updatePeroid INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38646qa)) {
            return false;
        }
        C38646qa qaVar = (C38646qa) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_shareKeyHash), Integer.valueOf(qaVar.field_shareKeyHash)) && C46238a.m51546a(Integer.valueOf(this.field_btnState), Integer.valueOf(qaVar.field_btnState)) && C46238a.m51546a(Integer.valueOf(this.field_msgState), Integer.valueOf(qaVar.field_msgState)) && C46238a.m51546a(this.field_content, qaVar.field_content) && C46238a.m51546a(this.field_contentColor, qaVar.field_contentColor) && C46238a.m51546a(Integer.valueOf(this.field_updatePeroid), Integer.valueOf(qaVar.field_updatePeroid));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103433o == hashCode) {
                    try {
                        this.field_shareKeyHash = cursor.getInt(i);
                        this.f103442d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaUpdateableMsg", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103434p == hashCode) {
                    try {
                        this.field_btnState = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaUpdateableMsg", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103435q == hashCode) {
                    try {
                        this.field_msgState = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaUpdateableMsg", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103436r == hashCode) {
                    try {
                        this.field_content = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaUpdateableMsg", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103437s == hashCode) {
                    try {
                        this.field_contentColor = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaUpdateableMsg", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103438t == hashCode) {
                    try {
                        this.field_updatePeroid = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxaUpdateableMsg", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103439u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103442d) {
            contentValues.put("shareKeyHash", Integer.valueOf(this.field_shareKeyHash));
        }
        if (this.f103443e) {
            contentValues.put("btnState", Integer.valueOf(this.field_btnState));
        }
        if (this.f103444f) {
            contentValues.put("msgState", Integer.valueOf(this.field_msgState));
        }
        if (this.f103445g) {
            contentValues.put("content", this.field_content);
        }
        if (this.f103446h) {
            contentValues.put("contentColor", this.field_contentColor);
        }
        if (this.f103447i) {
            contentValues.put("updatePeroid", Integer.valueOf(this.field_updatePeroid));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWxaUpdateableMsg", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WxaUpdateableMsg ( " + f103440v.sql + ");");
        for (String add : f103432n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWxaUpdateableMsg", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WxaUpdateableMsg", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103440v, "WxaUpdateableMsg", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWxaUpdateableMsg", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WxaUpdateableMsg", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWxaUpdateableMsg", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103440v;
    }

    public String[] getIndexCreateSQL() {
        return f103432n;
    }

    public StorageObserverOwner<C38646qa> getObserverOwner() {
        return f103441w;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_shareKeyHash);
    }

    public SingleTable getTable() {
        return f103431j;
    }

    public String getTableName() {
        return f103431j.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("shareKeyHash")) {
            this.field_shareKeyHash = contentValues.getAsInteger("shareKeyHash").intValue();
            if (z) {
                this.f103442d = true;
            }
        }
        if (contentValues.containsKey("btnState")) {
            this.field_btnState = contentValues.getAsInteger("btnState").intValue();
            if (z) {
                this.f103443e = true;
            }
        }
        if (contentValues.containsKey("msgState")) {
            this.field_msgState = contentValues.getAsInteger("msgState").intValue();
            if (z) {
                this.f103444f = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z) {
                this.f103445g = true;
            }
        }
        if (contentValues.containsKey("contentColor")) {
            this.field_contentColor = contentValues.getAsString("contentColor");
            if (z) {
                this.f103446h = true;
            }
        }
        if (contentValues.containsKey("updatePeroid")) {
            this.field_updatePeroid = contentValues.getAsInteger("updatePeroid").intValue();
            if (z) {
                this.f103447i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
