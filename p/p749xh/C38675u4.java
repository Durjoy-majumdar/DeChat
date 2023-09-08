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

/* renamed from: xh.u4 */
public class C38675u4 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f103891f;

    /* renamed from: g */
    public static final String[] f103892g = new String[0];

    /* renamed from: h */
    public static final int f103893h = 787786110;

    /* renamed from: i */
    public static final int f103894i = 307311182;

    /* renamed from: j */
    public static final int f103895j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f103896n = initAutoDBInfo(C38675u4.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38675u4> f103897o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103898d = true;

    /* renamed from: e */
    public boolean f103899e = true;
    public byte[] field_BindAppData;
    public String field_chatRoomName;

    static {
        SingleTable singleTable = new SingleTable("GroupBindApp");
        f103891f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("chatRoomName", "string", singleTable.getName(), "");
        new Column("BindAppData", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "chatRoomName";
        mAutoDBInfo.colsMap.put("chatRoomName", "TEXT default '群username'  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "chatRoomName";
        mAutoDBInfo.columns[1] = "BindAppData";
        mAutoDBInfo.colsMap.put("BindAppData", "BLOB");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " chatRoomName TEXT default '群username'  PRIMARY KEY ,  BindAppData BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38675u4)) {
            return false;
        }
        C38675u4 u4Var = (C38675u4) iAutoDBItem;
        return C46238a.m51546a(this.field_chatRoomName, u4Var.field_chatRoomName) && C46238a.m51546a(this.field_BindAppData, u4Var.field_BindAppData);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103893h == hashCode) {
                    try {
                        this.field_chatRoomName = cursor.getString(i);
                        this.f103898d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupBindApp", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103894i == hashCode) {
                    try {
                        this.field_BindAppData = cursor.getBlob(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupBindApp", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103895j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_chatRoomName == null) {
            this.field_chatRoomName = "群username";
        }
        if (this.f103898d) {
            contentValues.put("chatRoomName", this.field_chatRoomName);
        }
        if (this.f103899e) {
            contentValues.put("BindAppData", this.field_BindAppData);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseGroupBindApp", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS GroupBindApp ( " + f103896n.sql + ");");
        for (String add : f103892g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseGroupBindApp", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("GroupBindApp", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103896n, "GroupBindApp", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseGroupBindApp", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("GroupBindApp", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseGroupBindApp", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103896n;
    }

    public String[] getIndexCreateSQL() {
        return f103892g;
    }

    public StorageObserverOwner<C38675u4> getObserverOwner() {
        return f103897o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_chatRoomName;
    }

    public SingleTable getTable() {
        return f103891f;
    }

    public String getTableName() {
        return f103891f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("chatRoomName")) {
            this.field_chatRoomName = contentValues.getAsString("chatRoomName");
            if (z) {
                this.f103898d = true;
            }
        }
        if (contentValues.containsKey("BindAppData")) {
            this.field_BindAppData = contentValues.getAsByteArray("BindAppData");
            if (z) {
                this.f103899e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
