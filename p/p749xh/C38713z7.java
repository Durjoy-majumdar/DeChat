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

/* renamed from: xh.z7 */
public class C38713z7 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f104431f;

    /* renamed from: g */
    public static final String[] f104432g = new String[0];

    /* renamed from: h */
    public static final int f104433h = 735908388;

    /* renamed from: i */
    public static final int f104434i = -1066424748;

    /* renamed from: j */
    public static final int f104435j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f104436n = initAutoDBInfo(C38713z7.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38713z7> f104437o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104438d = true;

    /* renamed from: e */
    public boolean f104439e = true;
    public int field_orderIndex;
    public String field_quickMsg;

    static {
        SingleTable singleTable = new SingleTable("RtosQuickReplyInfo");
        f104431f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("orderIndex", "int", singleTable.getName(), "");
        new Column("quickMsg", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "orderIndex";
        mAutoDBInfo.colsMap.put("orderIndex", "INTEGER");
        mAutoDBInfo.columns[1] = "quickMsg";
        mAutoDBInfo.colsMap.put("quickMsg", "TEXT");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " orderIndex INTEGER,  quickMsg TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38713z7)) {
            return false;
        }
        C38713z7 z7Var = (C38713z7) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_orderIndex), Integer.valueOf(z7Var.field_orderIndex)) && C46238a.m51546a(this.field_quickMsg, z7Var.field_quickMsg);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104433h == hashCode) {
                    try {
                        this.field_orderIndex = cursor.getInt(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRtosQuickReplyInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104434i == hashCode) {
                    try {
                        this.field_quickMsg = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRtosQuickReplyInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104435j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104438d) {
            contentValues.put("orderIndex", Integer.valueOf(this.field_orderIndex));
        }
        if (this.f104439e) {
            contentValues.put("quickMsg", this.field_quickMsg);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseRtosQuickReplyInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS RtosQuickReplyInfo ( " + f104436n.sql + ");");
        for (String add : f104432g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseRtosQuickReplyInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("RtosQuickReplyInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104436n, "RtosQuickReplyInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseRtosQuickReplyInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("RtosQuickReplyInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseRtosQuickReplyInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104436n;
    }

    public String[] getIndexCreateSQL() {
        return f104432g;
    }

    public StorageObserverOwner<C38713z7> getObserverOwner() {
        return f104437o;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f104431f;
    }

    public String getTableName() {
        return f104431f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("orderIndex")) {
            this.field_orderIndex = contentValues.getAsInteger("orderIndex").intValue();
            if (z) {
                this.f104438d = true;
            }
        }
        if (contentValues.containsKey("quickMsg")) {
            this.field_quickMsg = contentValues.getAsString("quickMsg");
            if (z) {
                this.f104439e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
