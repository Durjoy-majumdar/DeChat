package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
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

/* renamed from: xh.b5 */
public class C38531b5 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f101764g;

    /* renamed from: h */
    public static final String[] f101765h = new String[0];

    /* renamed from: i */
    public static final int f101766i = 417550839;

    /* renamed from: j */
    public static final int f101767j = 110371416;

    /* renamed from: n */
    public static final int f101768n = 109264530;

    /* renamed from: o */
    public static final int f101769o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f101770p = initAutoDBInfo(C38531b5.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38531b5> f101771q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101772d = true;

    /* renamed from: e */
    public boolean f101773e = true;

    /* renamed from: f */
    public boolean f101774f = true;
    public String field_appusername;
    public int field_score;
    public String field_title;

    static {
        SingleTable singleTable = new SingleTable("HardDeviceProfileRankDetail");
        f101764g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appusername", "string", singleTable.getName(), "");
        new Column(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "string", singleTable.getName(), "");
        new Column(FirebaseAnalytics.C113379b.SCORE, "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appusername";
        mAutoDBInfo.colsMap.put("appusername", "TEXT");
        mAutoDBInfo.columns[1] = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        mAutoDBInfo.colsMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        mAutoDBInfo.columns[2] = FirebaseAnalytics.C113379b.SCORE;
        mAutoDBInfo.colsMap.put(FirebaseAnalytics.C113379b.SCORE, "INTEGER");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " appusername TEXT,  title TEXT,  score INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38531b5)) {
            return false;
        }
        C38531b5 b5Var = (C38531b5) iAutoDBItem;
        return C46238a.m51546a(this.field_appusername, b5Var.field_appusername) && C46238a.m51546a(this.field_title, b5Var.field_title) && C46238a.m51546a(Integer.valueOf(this.field_score), Integer.valueOf(b5Var.field_score));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101766i == hashCode) {
                    try {
                        this.field_appusername = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101767j == hashCode) {
                    try {
                        this.field_title = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101768n == hashCode) {
                    try {
                        this.field_score = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101769o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101772d) {
            contentValues.put("appusername", this.field_appusername);
        }
        if (this.f101773e) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f101774f) {
            contentValues.put(FirebaseAnalytics.C113379b.SCORE, Integer.valueOf(this.field_score));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS HardDeviceProfileRankDetail ( " + f101770p.sql + ");");
        for (String add : f101765h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("HardDeviceProfileRankDetail", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101770p, "HardDeviceProfileRankDetail", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("HardDeviceProfileRankDetail", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101770p;
    }

    public String[] getIndexCreateSQL() {
        return f101765h;
    }

    public StorageObserverOwner<C38531b5> getObserverOwner() {
        return f101771q;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f101764g;
    }

    public String getTableName() {
        return f101764g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appusername")) {
            this.field_appusername = contentValues.getAsString("appusername");
            if (z) {
                this.f101772d = true;
            }
        }
        if (contentValues.containsKey(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z) {
                this.f101773e = true;
            }
        }
        if (contentValues.containsKey(FirebaseAnalytics.C113379b.SCORE)) {
            this.field_score = contentValues.getAsInteger(FirebaseAnalytics.C113379b.SCORE).intValue();
            if (z) {
                this.f101774f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
