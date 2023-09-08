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

/* renamed from: xh.b4 */
public class C38530b4 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f101753g;

    /* renamed from: h */
    public static final String[] f101754h = new String[0];

    /* renamed from: i */
    public static final int f101755i = -1914377637;

    /* renamed from: j */
    public static final int f101756j = -265713450;

    /* renamed from: n */
    public static final int f101757n = 1211388583;

    /* renamed from: o */
    public static final int f101758o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f101759p = initAutoDBInfo(C38530b4.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38530b4> f101760q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101761d = true;

    /* renamed from: e */
    public boolean f101762e = true;

    /* renamed from: f */
    public boolean f101763f = true;
    public String field_encryptUsername;
    public long field_modifyTime;
    public String field_username;

    static {
        SingleTable singleTable = new SingleTable("FriendUser");
        f101753g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("encryptUsername", "string", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("modifyTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "encryptUsername";
        mAutoDBInfo.colsMap.put("encryptUsername", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "encryptUsername";
        mAutoDBInfo.columns[1] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "modifyTime";
        mAutoDBInfo.colsMap.put("modifyTime", "LONG default '0' ");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " encryptUsername TEXT default ''  PRIMARY KEY ,  username TEXT default '' ,  modifyTime LONG default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38530b4)) {
            return false;
        }
        C38530b4 b4Var = (C38530b4) iAutoDBItem;
        return C46238a.m51546a(this.field_encryptUsername, b4Var.field_encryptUsername) && C46238a.m51546a(this.field_username, b4Var.field_username) && C46238a.m51546a(Long.valueOf(this.field_modifyTime), Long.valueOf(b4Var.field_modifyTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101755i == hashCode) {
                    try {
                        this.field_encryptUsername = cursor.getString(i);
                        this.f101761d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFriendUser", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101756j == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFriendUser", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101757n == hashCode) {
                    try {
                        this.field_modifyTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFriendUser", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101758o == hashCode) {
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
        if (this.f101761d) {
            contentValues.put("encryptUsername", this.field_encryptUsername);
        }
        if (this.field_username == null) {
            this.field_username = "";
        }
        if (this.f101762e) {
            contentValues.put("username", this.field_username);
        }
        if (this.f101763f) {
            contentValues.put("modifyTime", Long.valueOf(this.field_modifyTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFriendUser", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FriendUser ( " + f101759p.sql + ");");
        for (String add : f101754h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFriendUser", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FriendUser", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101759p, "FriendUser", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFriendUser", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FriendUser", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFriendUser", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101759p;
    }

    public String[] getIndexCreateSQL() {
        return f101754h;
    }

    public StorageObserverOwner<C38530b4> getObserverOwner() {
        return f101760q;
    }

    public Object getPrimaryKeyValue() {
        return this.field_encryptUsername;
    }

    public SingleTable getTable() {
        return f101753g;
    }

    public String getTableName() {
        return f101753g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("encryptUsername")) {
            this.field_encryptUsername = contentValues.getAsString("encryptUsername");
            if (z) {
                this.f101761d = true;
            }
        }
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f101762e = true;
            }
        }
        if (contentValues.containsKey("modifyTime")) {
            this.field_modifyTime = contentValues.getAsLong("modifyTime").longValue();
            if (z) {
                this.f101763f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
