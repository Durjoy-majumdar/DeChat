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

/* renamed from: xh.l3 */
public class C38605l3 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f102933f;

    /* renamed from: g */
    public static final String[] f102934g = {"CREATE INDEX IF NOT EXISTS FinderLiveLastRewardInfo_liveId_index ON FinderLiveLastRewardInfo(liveId)"};

    /* renamed from: h */
    public static final int f102935h = -1102434521;

    /* renamed from: i */
    public static final int f102936i = 1899996083;

    /* renamed from: j */
    public static final int f102937j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f102938n = initAutoDBInfo(C38605l3.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38605l3> f102939o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102940d = true;

    /* renamed from: e */
    public boolean f102941e = true;
    public byte[] field_lastRewardInfo;
    public String field_liveId;

    static {
        SingleTable singleTable = new SingleTable("FinderLiveLastRewardInfo");
        f102933f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("liveId", "string", singleTable.getName(), "");
        new Column("lastRewardInfo", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "liveId";
        mAutoDBInfo.colsMap.put("liveId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "liveId";
        mAutoDBInfo.columns[1] = "lastRewardInfo";
        mAutoDBInfo.colsMap.put("lastRewardInfo", "BLOB");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " liveId TEXT PRIMARY KEY ,  lastRewardInfo BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38605l3)) {
            return false;
        }
        C38605l3 l3Var = (C38605l3) iAutoDBItem;
        return C46238a.m51546a(this.field_liveId, l3Var.field_liveId) && C46238a.m51546a(this.field_lastRewardInfo, l3Var.field_lastRewardInfo);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102935h == hashCode) {
                    try {
                        this.field_liveId = cursor.getString(i);
                        this.f102940d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveLastRewardInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102936i == hashCode) {
                    try {
                        this.field_lastRewardInfo = cursor.getBlob(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveLastRewardInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102937j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102940d) {
            contentValues.put("liveId", this.field_liveId);
        }
        if (this.f102941e) {
            contentValues.put("lastRewardInfo", this.field_lastRewardInfo);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderLiveLastRewardInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderLiveLastRewardInfo ( " + f102938n.sql + ");");
        for (String add : f102934g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLiveLastRewardInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderLiveLastRewardInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102938n, "FinderLiveLastRewardInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLiveLastRewardInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderLiveLastRewardInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderLiveLastRewardInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102938n;
    }

    public String[] getIndexCreateSQL() {
        return f102934g;
    }

    public StorageObserverOwner<C38605l3> getObserverOwner() {
        return f102939o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_liveId;
    }

    public SingleTable getTable() {
        return f102933f;
    }

    public String getTableName() {
        return f102933f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("liveId")) {
            this.field_liveId = contentValues.getAsString("liveId");
            if (z) {
                this.f102940d = true;
            }
        }
        if (contentValues.containsKey("lastRewardInfo")) {
            this.field_lastRewardInfo = contentValues.getAsByteArray("lastRewardInfo");
            if (z) {
                this.f102941e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
