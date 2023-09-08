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

/* renamed from: xh.u3 */
public class C38674u3 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f103882f;

    /* renamed from: g */
    public static final String[] f103883g = {"CREATE INDEX IF NOT EXISTS FinderOrAliasDeletingInfo_username_index ON FinderOrAliasDeletingInfo(username)"};

    /* renamed from: h */
    public static final int f103884h = -265713450;

    /* renamed from: i */
    public static final int f103885i = 3575610;

    /* renamed from: j */
    public static final int f103886j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f103887n = initAutoDBInfo(C38674u3.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38674u3> f103888o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103889d = true;

    /* renamed from: e */
    public boolean f103890e = true;
    public int field_type;
    public String field_username;

    static {
        SingleTable singleTable = new SingleTable("FinderOrAliasDeletingInfo");
        f103882f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "username";
        mAutoDBInfo.columns[1] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " username TEXT default ''  PRIMARY KEY ,  type INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38674u3)) {
            return false;
        }
        C38674u3 u3Var = (C38674u3) iAutoDBItem;
        return C46238a.m51546a(this.field_username, u3Var.field_username) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(u3Var.field_type));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103884h == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                        this.f103889d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderOrAliasDeletingInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103885i == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderOrAliasDeletingInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103886j == hashCode) {
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
        if (this.f103889d) {
            contentValues.put("username", this.field_username);
        }
        if (this.f103890e) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderOrAliasDeletingInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderOrAliasDeletingInfo ( " + f103887n.sql + ");");
        for (String add : f103883g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderOrAliasDeletingInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderOrAliasDeletingInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103887n, "FinderOrAliasDeletingInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderOrAliasDeletingInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderOrAliasDeletingInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderOrAliasDeletingInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103887n;
    }

    public String[] getIndexCreateSQL() {
        return f103883g;
    }

    public StorageObserverOwner<C38674u3> getObserverOwner() {
        return f103888o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_username;
    }

    public SingleTable getTable() {
        return f103882f;
    }

    public String getTableName() {
        return f103882f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f103889d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f103890e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
