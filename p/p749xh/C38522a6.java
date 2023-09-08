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

/* renamed from: xh.a6 */
public class C38522a6 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f101647f;

    /* renamed from: g */
    public static final String[] f101648g = new String[0];

    /* renamed from: h */
    public static final int f101649h = 1979913522;

    /* renamed from: i */
    public static final int f101650i = 676362970;

    /* renamed from: j */
    public static final int f101651j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f101652n = initAutoDBInfo(C38522a6.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38522a6> f101653o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101654d = true;

    /* renamed from: e */
    public boolean f101655e = true;
    public int field_open_count;
    public String field_send_id;

    static {
        SingleTable singleTable = new SingleTable("LuckyMoneyDetailOpenRecord");
        f101647f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("send_id", "string", singleTable.getName(), "");
        new Column("open_count", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "send_id";
        mAutoDBInfo.colsMap.put("send_id", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "send_id";
        mAutoDBInfo.columns[1] = "open_count";
        mAutoDBInfo.colsMap.put("open_count", "INTEGER");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " send_id TEXT PRIMARY KEY ,  open_count INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38522a6)) {
            return false;
        }
        C38522a6 a6Var = (C38522a6) iAutoDBItem;
        return C46238a.m51546a(this.field_send_id, a6Var.field_send_id) && C46238a.m51546a(Integer.valueOf(this.field_open_count), Integer.valueOf(a6Var.field_open_count));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101649h == hashCode) {
                    try {
                        this.field_send_id = cursor.getString(i);
                        this.f101654d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyDetailOpenRecord", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101650i == hashCode) {
                    try {
                        this.field_open_count = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyDetailOpenRecord", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101651j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101654d) {
            contentValues.put("send_id", this.field_send_id);
        }
        if (this.f101655e) {
            contentValues.put("open_count", Integer.valueOf(this.field_open_count));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseLuckyMoneyDetailOpenRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS LuckyMoneyDetailOpenRecord ( " + f101652n.sql + ");");
        for (String add : f101648g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseLuckyMoneyDetailOpenRecord", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("LuckyMoneyDetailOpenRecord", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101652n, "LuckyMoneyDetailOpenRecord", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseLuckyMoneyDetailOpenRecord", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("LuckyMoneyDetailOpenRecord", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseLuckyMoneyDetailOpenRecord", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101652n;
    }

    public String[] getIndexCreateSQL() {
        return f101648g;
    }

    public StorageObserverOwner<C38522a6> getObserverOwner() {
        return f101653o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_send_id;
    }

    public SingleTable getTable() {
        return f101647f;
    }

    public String getTableName() {
        return f101647f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("send_id")) {
            this.field_send_id = contentValues.getAsString("send_id");
            if (z) {
                this.f101654d = true;
            }
        }
        if (contentValues.containsKey("open_count")) {
            this.field_open_count = contentValues.getAsInteger("open_count").intValue();
            if (z) {
                this.f101655e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
