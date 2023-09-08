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

/* renamed from: xh.d2 */
public class C38546d2 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f102055g;

    /* renamed from: h */
    public static final String[] f102056h = new String[0];

    /* renamed from: i */
    public static final int f102057i = -1051830710;

    /* renamed from: j */
    public static final int f102058j = 951530617;

    /* renamed from: n */
    public static final int f102059n = 106905;

    /* renamed from: o */
    public static final int f102060o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f102061p = initAutoDBInfo(C38546d2.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38546d2> f102062q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102063d = true;

    /* renamed from: e */
    public boolean f102064e = true;

    /* renamed from: f */
    public boolean f102065f = true;
    public byte[] field_content;
    public String field_lan;
    public String field_productID;

    static {
        SingleTable singleTable = new SingleTable("EmotionDetailInfo");
        f102055g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("productID", "string", singleTable.getName(), "");
        new Column("content", "byte[]", singleTable.getName(), "");
        new Column("lan", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "productID";
        mAutoDBInfo.colsMap.put("productID", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "productID";
        mAutoDBInfo.columns[1] = "content";
        mAutoDBInfo.colsMap.put("content", "BLOB default '' ");
        mAutoDBInfo.columns[2] = "lan";
        mAutoDBInfo.colsMap.put("lan", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " productID TEXT PRIMARY KEY ,  content BLOB default '' ,  lan TEXT default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38546d2)) {
            return false;
        }
        C38546d2 d2Var = (C38546d2) iAutoDBItem;
        return C46238a.m51546a(this.field_productID, d2Var.field_productID) && C46238a.m51546a(this.field_content, d2Var.field_content) && C46238a.m51546a(this.field_lan, d2Var.field_lan);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102057i == hashCode) {
                    try {
                        this.field_productID = cursor.getString(i);
                        this.f102063d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmotionDetailInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102058j == hashCode) {
                    try {
                        this.field_content = cursor.getBlob(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmotionDetailInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102059n == hashCode) {
                    try {
                        this.field_lan = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmotionDetailInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102060o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102063d) {
            contentValues.put("productID", this.field_productID);
        }
        if (this.f102064e) {
            contentValues.put("content", this.field_content);
        }
        if (this.field_lan == null) {
            this.field_lan = "";
        }
        if (this.f102065f) {
            contentValues.put("lan", this.field_lan);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseEmotionDetailInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS EmotionDetailInfo ( " + f102061p.sql + ");");
        for (String add : f102056h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseEmotionDetailInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("EmotionDetailInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102061p, "EmotionDetailInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseEmotionDetailInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("EmotionDetailInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseEmotionDetailInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102061p;
    }

    public String[] getIndexCreateSQL() {
        return f102056h;
    }

    public StorageObserverOwner<C38546d2> getObserverOwner() {
        return f102062q;
    }

    public Object getPrimaryKeyValue() {
        return this.field_productID;
    }

    public SingleTable getTable() {
        return f102055g;
    }

    public String getTableName() {
        return f102055g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("productID")) {
            this.field_productID = contentValues.getAsString("productID");
            if (z) {
                this.f102063d = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsByteArray("content");
            if (z) {
                this.f102064e = true;
            }
        }
        if (contentValues.containsKey("lan")) {
            this.field_lan = contentValues.getAsString("lan");
            if (z) {
                this.f102065f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
