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

/* renamed from: xh.h5 */
public class C38574h5 extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f102451h;

    /* renamed from: i */
    public static final String[] f102452i = new String[0];

    /* renamed from: j */
    public static final int f102453j = 1094709788;

    /* renamed from: n */
    public static final int f102454n = -929414588;

    /* renamed from: o */
    public static final int f102455o = -411130533;

    /* renamed from: p */
    public static final int f102456p = -2024610847;

    /* renamed from: q */
    public static final int f102457q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f102458r = initAutoDBInfo(C38574h5.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38574h5> f102459s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102460d = true;

    /* renamed from: e */
    public boolean f102461e = true;

    /* renamed from: f */
    public boolean f102462f = true;
    public String field_contactId;
    public String field_sortKey;
    public String field_systemAddressBookUsername;
    public String field_wechatUsername;

    /* renamed from: g */
    public boolean f102463g = true;

    static {
        SingleTable singleTable = new SingleTable("IPCallAddressItem");
        f102451h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("wechatUsername", "string", singleTable.getName(), "");
        new Column("systemAddressBookUsername", "string", singleTable.getName(), "");
        new Column("contactId", "string", singleTable.getName(), "");
        new Column("sortKey", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "wechatUsername";
        mAutoDBInfo.colsMap.put("wechatUsername", "TEXT");
        mAutoDBInfo.columns[1] = "systemAddressBookUsername";
        mAutoDBInfo.colsMap.put("systemAddressBookUsername", "TEXT");
        mAutoDBInfo.columns[2] = "contactId";
        mAutoDBInfo.colsMap.put("contactId", "TEXT");
        mAutoDBInfo.columns[3] = "sortKey";
        mAutoDBInfo.colsMap.put("sortKey", "TEXT");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " wechatUsername TEXT,  systemAddressBookUsername TEXT,  contactId TEXT,  sortKey TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38574h5)) {
            return false;
        }
        C38574h5 h5Var = (C38574h5) iAutoDBItem;
        return C46238a.m51546a(this.field_wechatUsername, h5Var.field_wechatUsername) && C46238a.m51546a(this.field_systemAddressBookUsername, h5Var.field_systemAddressBookUsername) && C46238a.m51546a(this.field_contactId, h5Var.field_contactId) && C46238a.m51546a(this.field_sortKey, h5Var.field_sortKey);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102453j == hashCode) {
                    try {
                        this.field_wechatUsername = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallAddressItem", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102454n == hashCode) {
                    try {
                        this.field_systemAddressBookUsername = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallAddressItem", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102455o == hashCode) {
                    try {
                        this.field_contactId = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallAddressItem", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102456p == hashCode) {
                    try {
                        this.field_sortKey = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallAddressItem", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102457q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102460d) {
            contentValues.put("wechatUsername", this.field_wechatUsername);
        }
        if (this.f102461e) {
            contentValues.put("systemAddressBookUsername", this.field_systemAddressBookUsername);
        }
        if (this.f102462f) {
            contentValues.put("contactId", this.field_contactId);
        }
        if (this.f102463g) {
            contentValues.put("sortKey", this.field_sortKey);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseIPCallAddressItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS IPCallAddressItem ( " + f102458r.sql + ");");
        for (String add : f102452i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseIPCallAddressItem", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("IPCallAddressItem", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102458r, "IPCallAddressItem", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseIPCallAddressItem", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("IPCallAddressItem", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseIPCallAddressItem", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102458r;
    }

    public String[] getIndexCreateSQL() {
        return f102452i;
    }

    public StorageObserverOwner<C38574h5> getObserverOwner() {
        return f102459s;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f102451h;
    }

    public String getTableName() {
        return f102451h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("wechatUsername")) {
            this.field_wechatUsername = contentValues.getAsString("wechatUsername");
            if (z) {
                this.f102460d = true;
            }
        }
        if (contentValues.containsKey("systemAddressBookUsername")) {
            this.field_systemAddressBookUsername = contentValues.getAsString("systemAddressBookUsername");
            if (z) {
                this.f102461e = true;
            }
        }
        if (contentValues.containsKey("contactId")) {
            this.field_contactId = contentValues.getAsString("contactId");
            if (z) {
                this.f102462f = true;
            }
        }
        if (contentValues.containsKey("sortKey")) {
            this.field_sortKey = contentValues.getAsString("sortKey");
            if (z) {
                this.f102463g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
