package mn2;

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

/* renamed from: mn2.b */
public class C34608b extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f93072g;

    /* renamed from: h */
    public static final String[] f93073h = new String[0];

    /* renamed from: i */
    public static final int f93074i = -265713450;

    /* renamed from: j */
    public static final int f93075j = -1284856579;

    /* renamed from: n */
    public static final int f93076n = 687022598;

    /* renamed from: o */
    public static final int f93077o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f93078p = initAutoDBInfo(C34608b.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C34608b> f93079q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f93080d = true;

    /* renamed from: e */
    public boolean f93081e = true;

    /* renamed from: f */
    public boolean f93082f = true;
    public boolean field_isshowed;
    public int field_lastshaketime;
    public String field_username;

    static {
        SingleTable singleTable = new SingleTable("ShakeNewYearFriendInfo");
        f93072g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("lastshaketime", "int", singleTable.getName(), "");
        new Column("isshowed", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "username";
        mAutoDBInfo.columns[1] = "lastshaketime";
        mAutoDBInfo.colsMap.put("lastshaketime", "INTEGER default '0' ");
        mAutoDBInfo.columns[2] = "isshowed";
        mAutoDBInfo.colsMap.put("isshowed", "INTEGER default 'false' ");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " username TEXT default ''  PRIMARY KEY ,  lastshaketime INTEGER default '0' ,  isshowed INTEGER default 'false' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C34608b)) {
            return false;
        }
        C34608b bVar = (C34608b) iAutoDBItem;
        return C46238a.m51546a(this.field_username, bVar.field_username) && C46238a.m51546a(Integer.valueOf(this.field_lastshaketime), Integer.valueOf(bVar.field_lastshaketime)) && C46238a.m51546a(Boolean.valueOf(this.field_isshowed), Boolean.valueOf(bVar.field_isshowed));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f93074i == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                        this.f93080d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeNewYearFriendInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93075j == hashCode) {
                    try {
                        this.field_lastshaketime = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeNewYearFriendInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93076n == hashCode) {
                    try {
                        this.field_isshowed = cursor.getInt(i) != 0;
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseShakeNewYearFriendInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93077o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_username == null) {
            this.field_username = "";
        }
        if (this.f93080d) {
            contentValues.put("username", this.field_username);
        }
        if (this.f93081e) {
            contentValues.put("lastshaketime", Integer.valueOf(this.field_lastshaketime));
        }
        if (this.f93082f) {
            if (this.field_isshowed) {
                contentValues.put("isshowed", 1);
            } else {
                contentValues.put("isshowed", 0);
            }
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseShakeNewYearFriendInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ShakeNewYearFriendInfo ( " + f93078p.sql + ");");
        for (String add : f93073h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseShakeNewYearFriendInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ShakeNewYearFriendInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f93078p, "ShakeNewYearFriendInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseShakeNewYearFriendInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ShakeNewYearFriendInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseShakeNewYearFriendInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f93078p;
    }

    public String[] getIndexCreateSQL() {
        return f93073h;
    }

    public StorageObserverOwner<C34608b> getObserverOwner() {
        return f93079q;
    }

    public Object getPrimaryKeyValue() {
        return this.field_username;
    }

    public SingleTable getTable() {
        return f93072g;
    }

    public String getTableName() {
        return f93072g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f93080d = true;
            }
        }
        if (contentValues.containsKey("lastshaketime")) {
            this.field_lastshaketime = contentValues.getAsInteger("lastshaketime").intValue();
            if (z) {
                this.f93081e = true;
            }
        }
        if (contentValues.containsKey("isshowed")) {
            this.field_isshowed = contentValues.getAsInteger("isshowed").intValue() != 0;
            if (z) {
                this.f93082f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
