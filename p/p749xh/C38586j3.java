package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.measurement.AppMeasurement;
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

/* renamed from: xh.j3 */
public class C38586j3 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f102605f;

    /* renamed from: g */
    public static final String[] f102606g = new String[0];

    /* renamed from: h */
    public static final int f102607h = 1647778220;

    /* renamed from: i */
    public static final int f102608i = 55126294;

    /* renamed from: j */
    public static final int f102609j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f102610n = initAutoDBInfo(C38586j3.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38586j3> f102611o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102612d = true;

    /* renamed from: e */
    public boolean f102613e = true;
    public String field_dislikeBannerId;
    public long field_timestamp;

    static {
        SingleTable singleTable = new SingleTable("FinderLiveDislikeBannerRecord");
        f102605f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("dislikeBannerId", "string", singleTable.getName(), "");
        new Column(AppMeasurement.Param.TIMESTAMP, "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "dislikeBannerId";
        mAutoDBInfo.colsMap.put("dislikeBannerId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "dislikeBannerId";
        mAutoDBInfo.columns[1] = AppMeasurement.Param.TIMESTAMP;
        mAutoDBInfo.colsMap.put(AppMeasurement.Param.TIMESTAMP, "LONG");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " dislikeBannerId TEXT PRIMARY KEY ,  timestamp LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38586j3)) {
            return false;
        }
        C38586j3 j3Var = (C38586j3) iAutoDBItem;
        return C46238a.m51546a(this.field_dislikeBannerId, j3Var.field_dislikeBannerId) && C46238a.m51546a(Long.valueOf(this.field_timestamp), Long.valueOf(j3Var.field_timestamp));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102607h == hashCode) {
                    try {
                        this.field_dislikeBannerId = cursor.getString(i);
                        this.f102612d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveDislikeBannerRecord", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102608i == hashCode) {
                    try {
                        this.field_timestamp = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveDislikeBannerRecord", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102609j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102612d) {
            contentValues.put("dislikeBannerId", this.field_dislikeBannerId);
        }
        if (this.f102613e) {
            contentValues.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(this.field_timestamp));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderLiveDislikeBannerRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderLiveDislikeBannerRecord ( " + f102610n.sql + ");");
        for (String add : f102606g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLiveDislikeBannerRecord", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderLiveDislikeBannerRecord", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102610n, "FinderLiveDislikeBannerRecord", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLiveDislikeBannerRecord", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderLiveDislikeBannerRecord", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderLiveDislikeBannerRecord", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102610n;
    }

    public String[] getIndexCreateSQL() {
        return f102606g;
    }

    public StorageObserverOwner<C38586j3> getObserverOwner() {
        return f102611o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_dislikeBannerId;
    }

    public SingleTable getTable() {
        return f102605f;
    }

    public String getTableName() {
        return f102605f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("dislikeBannerId")) {
            this.field_dislikeBannerId = contentValues.getAsString("dislikeBannerId");
            if (z) {
                this.f102612d = true;
            }
        }
        if (contentValues.containsKey(AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(AppMeasurement.Param.TIMESTAMP).longValue();
            if (z) {
                this.f102613e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
