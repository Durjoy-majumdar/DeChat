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

/* renamed from: xh.m3 */
public class C38610m3 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f102996f;

    /* renamed from: g */
    public static final String[] f102997g = new String[0];

    /* renamed from: h */
    public static final int f102998h = -1102434521;

    /* renamed from: i */
    public static final int f102999i = 146501250;

    /* renamed from: j */
    public static final int f103000j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f103001n = initAutoDBInfo(C38610m3.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38610m3> f103002o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103003d = true;

    /* renamed from: e */
    public boolean f103004e = true;
    public String field_liveId;
    public byte[] field_luckyMoneyData;

    static {
        SingleTable singleTable = new SingleTable("FinderLiveLuckyMoneyInfo");
        f102996f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("liveId", "string", singleTable.getName(), "");
        new Column("luckyMoneyData", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "liveId";
        mAutoDBInfo.colsMap.put("liveId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "liveId";
        mAutoDBInfo.columns[1] = "luckyMoneyData";
        mAutoDBInfo.colsMap.put("luckyMoneyData", "BLOB");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " liveId TEXT PRIMARY KEY ,  luckyMoneyData BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38610m3)) {
            return false;
        }
        C38610m3 m3Var = (C38610m3) iAutoDBItem;
        return C46238a.m51546a(this.field_liveId, m3Var.field_liveId) && C46238a.m51546a(this.field_luckyMoneyData, m3Var.field_luckyMoneyData);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102998h == hashCode) {
                    try {
                        this.field_liveId = cursor.getString(i);
                        this.f103003d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveLuckyMoneyInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102999i == hashCode) {
                    try {
                        this.field_luckyMoneyData = cursor.getBlob(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveLuckyMoneyInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103000j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103003d) {
            contentValues.put("liveId", this.field_liveId);
        }
        if (this.f103004e) {
            contentValues.put("luckyMoneyData", this.field_luckyMoneyData);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderLiveLuckyMoneyInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderLiveLuckyMoneyInfo ( " + f103001n.sql + ");");
        for (String add : f102997g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLiveLuckyMoneyInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderLiveLuckyMoneyInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103001n, "FinderLiveLuckyMoneyInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLiveLuckyMoneyInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderLiveLuckyMoneyInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderLiveLuckyMoneyInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103001n;
    }

    public String[] getIndexCreateSQL() {
        return f102997g;
    }

    public StorageObserverOwner<C38610m3> getObserverOwner() {
        return f103002o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_liveId;
    }

    public SingleTable getTable() {
        return f102996f;
    }

    public String getTableName() {
        return f102996f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("liveId")) {
            this.field_liveId = contentValues.getAsString("liveId");
            if (z) {
                this.f103003d = true;
            }
        }
        if (contentValues.containsKey("luckyMoneyData")) {
            this.field_luckyMoneyData = contentValues.getAsByteArray("luckyMoneyData");
            if (z) {
                this.f103004e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
