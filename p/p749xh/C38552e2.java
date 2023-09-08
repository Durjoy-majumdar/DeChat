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

/* renamed from: xh.e2 */
public class C38552e2 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f102130f;

    /* renamed from: g */
    public static final String[] f102131g = new String[0];

    /* renamed from: h */
    public static final int f102132h = -1051830710;

    /* renamed from: i */
    public static final int f102133i = 951530617;

    /* renamed from: j */
    public static final int f102134j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f102135n = initAutoDBInfo(C38552e2.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38552e2> f102136o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102137d = true;

    /* renamed from: e */
    public boolean f102138e = true;
    public byte[] field_content;
    public String field_productID;

    static {
        SingleTable singleTable = new SingleTable("EmotionRewardInfo");
        f102130f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("productID", "string", singleTable.getName(), "");
        new Column("content", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "productID";
        mAutoDBInfo.colsMap.put("productID", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "productID";
        mAutoDBInfo.columns[1] = "content";
        mAutoDBInfo.colsMap.put("content", "BLOB default '' ");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " productID TEXT PRIMARY KEY ,  content BLOB default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38552e2)) {
            return false;
        }
        C38552e2 e2Var = (C38552e2) iAutoDBItem;
        return C46238a.m51546a(this.field_productID, e2Var.field_productID) && C46238a.m51546a(this.field_content, e2Var.field_content);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102132h == hashCode) {
                    try {
                        this.field_productID = cursor.getString(i);
                        this.f102137d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmotionRewardInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102133i == hashCode) {
                    try {
                        this.field_content = cursor.getBlob(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmotionRewardInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102134j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102137d) {
            contentValues.put("productID", this.field_productID);
        }
        if (this.f102138e) {
            contentValues.put("content", this.field_content);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseEmotionRewardInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS EmotionRewardInfo ( " + f102135n.sql + ");");
        for (String add : f102131g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseEmotionRewardInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("EmotionRewardInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102135n, "EmotionRewardInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseEmotionRewardInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("EmotionRewardInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseEmotionRewardInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102135n;
    }

    public String[] getIndexCreateSQL() {
        return f102131g;
    }

    public StorageObserverOwner<C38552e2> getObserverOwner() {
        return f102136o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_productID;
    }

    public SingleTable getTable() {
        return f102130f;
    }

    public String getTableName() {
        return f102130f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("productID")) {
            this.field_productID = contentValues.getAsString("productID");
            if (z) {
                this.f102137d = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsByteArray("content");
            if (z) {
                this.f102138e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
