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

/* renamed from: xh.p0 */
public class C38631p0 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f103287f;

    /* renamed from: g */
    public static final String[] f103288g = new String[0];

    /* renamed from: h */
    public static final int f103289h = -64277091;

    /* renamed from: i */
    public static final int f103290i = -836030906;

    /* renamed from: j */
    public static final int f103291j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f103292n = initAutoDBInfo(C38631p0.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38631p0> f103293o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103294d = true;

    /* renamed from: e */
    public boolean f103295e = true;
    public String field_brandUserName;
    public String field_userId;

    static {
        SingleTable singleTable = new SingleTable("BizChatMyUserInfo");
        f103287f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("brandUserName", "string", singleTable.getName(), "");
        new Column("userId", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "brandUserName";
        mAutoDBInfo.colsMap.put("brandUserName", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "brandUserName";
        mAutoDBInfo.columns[1] = "userId";
        mAutoDBInfo.colsMap.put("userId", "TEXT");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " brandUserName TEXT PRIMARY KEY ,  userId TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38631p0)) {
            return false;
        }
        C38631p0 p0Var = (C38631p0) iAutoDBItem;
        return C46238a.m51546a(this.field_brandUserName, p0Var.field_brandUserName) && C46238a.m51546a(this.field_userId, p0Var.field_userId);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103289h == hashCode) {
                    try {
                        this.field_brandUserName = cursor.getString(i);
                        this.f103294d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatMyUserInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103290i == hashCode) {
                    try {
                        this.field_userId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBizChatMyUserInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103291j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103294d) {
            contentValues.put("brandUserName", this.field_brandUserName);
        }
        if (this.f103295e) {
            contentValues.put("userId", this.field_userId);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseBizChatMyUserInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS BizChatMyUserInfo ( " + f103292n.sql + ");");
        for (String add : f103288g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseBizChatMyUserInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("BizChatMyUserInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103292n, "BizChatMyUserInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseBizChatMyUserInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("BizChatMyUserInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseBizChatMyUserInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103292n;
    }

    public String[] getIndexCreateSQL() {
        return f103288g;
    }

    public StorageObserverOwner<C38631p0> getObserverOwner() {
        return f103293o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_brandUserName;
    }

    public SingleTable getTable() {
        return f103287f;
    }

    public String getTableName() {
        return f103287f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("brandUserName")) {
            this.field_brandUserName = contentValues.getAsString("brandUserName");
            if (z) {
                this.f103294d = true;
            }
        }
        if (contentValues.containsKey("userId")) {
            this.field_userId = contentValues.getAsString("userId");
            if (z) {
                this.f103295e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
