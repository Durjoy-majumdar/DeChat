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

/* renamed from: xh.da */
public class C38550da extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f102108f;

    /* renamed from: g */
    public static final String[] f102109g = new String[0];

    /* renamed from: h */
    public static final int f102110h = -1142819705;

    /* renamed from: i */
    public static final int f102111i = 3560141;

    /* renamed from: j */
    public static final int f102112j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f102113n = initAutoDBInfo(C38550da.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38550da> f102114o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102115d = true;

    /* renamed from: e */
    public boolean f102116e = true;
    public long field_time;
    public String field_weSeeUri;

    static {
        SingleTable singleTable = new SingleTable("WeseeProviderInfo");
        f102108f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("weSeeUri", "string", singleTable.getName(), "");
        new Column("time", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "weSeeUri";
        mAutoDBInfo.colsMap.put("weSeeUri", "TEXT");
        mAutoDBInfo.columns[1] = "time";
        mAutoDBInfo.colsMap.put("time", "LONG");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " weSeeUri TEXT,  time LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38550da)) {
            return false;
        }
        C38550da daVar = (C38550da) iAutoDBItem;
        return C46238a.m51546a(this.field_weSeeUri, daVar.field_weSeeUri) && C46238a.m51546a(Long.valueOf(this.field_time), Long.valueOf(daVar.field_time));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102110h == hashCode) {
                    try {
                        this.field_weSeeUri = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWeseeProviderInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102111i == hashCode) {
                    try {
                        this.field_time = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWeseeProviderInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102112j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102115d) {
            contentValues.put("weSeeUri", this.field_weSeeUri);
        }
        if (this.f102116e) {
            contentValues.put("time", Long.valueOf(this.field_time));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWeseeProviderInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WeseeProviderInfo ( " + f102113n.sql + ");");
        for (String add : f102109g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWeseeProviderInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WeseeProviderInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102113n, "WeseeProviderInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWeseeProviderInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WeseeProviderInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWeseeProviderInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102113n;
    }

    public String[] getIndexCreateSQL() {
        return f102109g;
    }

    public StorageObserverOwner<C38550da> getObserverOwner() {
        return f102114o;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f102108f;
    }

    public String getTableName() {
        return f102108f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("weSeeUri")) {
            this.field_weSeeUri = contentValues.getAsString("weSeeUri");
            if (z) {
                this.f102115d = true;
            }
        }
        if (contentValues.containsKey("time")) {
            this.field_time = contentValues.getAsLong("time").longValue();
            if (z) {
                this.f102116e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
