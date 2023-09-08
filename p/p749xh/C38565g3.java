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

/* renamed from: xh.g3 */
public class C38565g3 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f102334f;

    /* renamed from: g */
    public static final String[] f102335g = new String[0];

    /* renamed from: h */
    public static final int f102336h = 198284676;

    /* renamed from: i */
    public static final int f102337i = 1851865635;

    /* renamed from: j */
    public static final int f102338j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f102339n = initAutoDBInfo(C38565g3.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38565g3> f102340o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102341d = true;

    /* renamed from: e */
    public boolean f102342e = true;
    public String field_actionTag;
    public long field_actionTime;

    static {
        SingleTable singleTable = new SingleTable("FinderLiveActionRecord");
        f102334f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("actionTag", "string", singleTable.getName(), "");
        new Column("actionTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "actionTag";
        mAutoDBInfo.colsMap.put("actionTag", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "actionTag";
        mAutoDBInfo.columns[1] = "actionTime";
        mAutoDBInfo.colsMap.put("actionTime", "LONG");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " actionTag TEXT PRIMARY KEY ,  actionTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38565g3)) {
            return false;
        }
        C38565g3 g3Var = (C38565g3) iAutoDBItem;
        return C46238a.m51546a(this.field_actionTag, g3Var.field_actionTag) && C46238a.m51546a(Long.valueOf(this.field_actionTime), Long.valueOf(g3Var.field_actionTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102336h == hashCode) {
                    try {
                        this.field_actionTag = cursor.getString(i);
                        this.f102341d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveActionRecord", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102337i == hashCode) {
                    try {
                        this.field_actionTime = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveActionRecord", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102338j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102341d) {
            contentValues.put("actionTag", this.field_actionTag);
        }
        if (this.f102342e) {
            contentValues.put("actionTime", Long.valueOf(this.field_actionTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderLiveActionRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderLiveActionRecord ( " + f102339n.sql + ");");
        for (String add : f102335g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLiveActionRecord", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderLiveActionRecord", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102339n, "FinderLiveActionRecord", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLiveActionRecord", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderLiveActionRecord", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderLiveActionRecord", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102339n;
    }

    public String[] getIndexCreateSQL() {
        return f102335g;
    }

    public StorageObserverOwner<C38565g3> getObserverOwner() {
        return f102340o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_actionTag;
    }

    public SingleTable getTable() {
        return f102334f;
    }

    public String getTableName() {
        return f102334f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("actionTag")) {
            this.field_actionTag = contentValues.getAsString("actionTag");
            if (z) {
                this.f102341d = true;
            }
        }
        if (contentValues.containsKey("actionTime")) {
            this.field_actionTime = contentValues.getAsLong("actionTime").longValue();
            if (z) {
                this.f102342e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
