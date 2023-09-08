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
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.p3 */
public class C38633p3 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f103309f;

    /* renamed from: g */
    public static final String[] f103310g = new String[0];

    /* renamed from: h */
    public static final int f103311h = -1102434521;

    /* renamed from: i */
    public static final int f103312i = -1014418093;

    /* renamed from: j */
    public static final int f103313j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f103314n = initAutoDBInfo(C38633p3.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38633p3> f103315o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103316d = true;

    /* renamed from: e */
    public boolean f103317e = true;
    public int field_definition;
    public long field_liveId;

    static {
        SingleTable singleTable = new SingleTable("FinderLiveVideoDefinitionInfo");
        f103309f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("liveId", "long", singleTable.getName(), "");
        new Column(TPReportKeys.Common.COMMON_MEDIA_RESOLUTION, "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "liveId";
        mAutoDBInfo.colsMap.put("liveId", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "liveId";
        mAutoDBInfo.columns[1] = TPReportKeys.Common.COMMON_MEDIA_RESOLUTION;
        mAutoDBInfo.colsMap.put(TPReportKeys.Common.COMMON_MEDIA_RESOLUTION, "INTEGER");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " liveId LONG PRIMARY KEY ,  definition INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38633p3)) {
            return false;
        }
        C38633p3 p3Var = (C38633p3) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_liveId), Long.valueOf(p3Var.field_liveId)) && C46238a.m51546a(Integer.valueOf(this.field_definition), Integer.valueOf(p3Var.field_definition));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103311h == hashCode) {
                    try {
                        this.field_liveId = cursor.getLong(i);
                        this.f103316d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveVideoDefinitionInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103312i == hashCode) {
                    try {
                        this.field_definition = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveVideoDefinitionInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103313j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103316d) {
            contentValues.put("liveId", Long.valueOf(this.field_liveId));
        }
        if (this.f103317e) {
            contentValues.put(TPReportKeys.Common.COMMON_MEDIA_RESOLUTION, Integer.valueOf(this.field_definition));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderLiveVideoDefinitionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderLiveVideoDefinitionInfo ( " + f103314n.sql + ");");
        for (String add : f103310g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLiveVideoDefinitionInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderLiveVideoDefinitionInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103314n, "FinderLiveVideoDefinitionInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLiveVideoDefinitionInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderLiveVideoDefinitionInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderLiveVideoDefinitionInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103314n;
    }

    public String[] getIndexCreateSQL() {
        return f103310g;
    }

    public StorageObserverOwner<C38633p3> getObserverOwner() {
        return f103315o;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_liveId);
    }

    public SingleTable getTable() {
        return f103309f;
    }

    public String getTableName() {
        return f103309f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("liveId")) {
            this.field_liveId = contentValues.getAsLong("liveId").longValue();
            if (z) {
                this.f103316d = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.Common.COMMON_MEDIA_RESOLUTION)) {
            this.field_definition = contentValues.getAsInteger(TPReportKeys.Common.COMMON_MEDIA_RESOLUTION).intValue();
            if (z) {
                this.f103317e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
