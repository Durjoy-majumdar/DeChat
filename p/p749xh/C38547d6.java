package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
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

/* renamed from: xh.d6 */
public class C38547d6 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f102066f;

    /* renamed from: g */
    public static final String[] f102067g = new String[0];

    /* renamed from: h */
    public static final int f102068h = 3076014;

    /* renamed from: i */
    public static final int f102069i = 94851343;

    /* renamed from: j */
    public static final int f102070j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f102071n = initAutoDBInfo(C38547d6.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38547d6> f102072o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102073d = true;

    /* renamed from: e */
    public boolean f102074e = true;
    public int field_count;
    public String field_date;

    static {
        SingleTable singleTable = new SingleTable("MMStoryHistoryItem");
        f102066f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column(FFmpegMetadataRetriever.METADATA_KEY_DATE, "string", singleTable.getName(), "");
        new Column("count", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = FFmpegMetadataRetriever.METADATA_KEY_DATE;
        mAutoDBInfo.colsMap.put(FFmpegMetadataRetriever.METADATA_KEY_DATE, "TEXT");
        mAutoDBInfo.columns[1] = "count";
        mAutoDBInfo.colsMap.put("count", "INTEGER");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " date TEXT,  count INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38547d6)) {
            return false;
        }
        C38547d6 d6Var = (C38547d6) iAutoDBItem;
        return C46238a.m51546a(this.field_date, d6Var.field_date) && C46238a.m51546a(Integer.valueOf(this.field_count), Integer.valueOf(d6Var.field_count));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102068h == hashCode) {
                    try {
                        this.field_date = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryHistoryItem", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102069i == hashCode) {
                    try {
                        this.field_count = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMMStoryHistoryItem", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102070j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102073d) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_DATE, this.field_date);
        }
        if (this.f102074e) {
            contentValues.put("count", Integer.valueOf(this.field_count));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseMMStoryHistoryItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS MMStoryHistoryItem ( " + f102071n.sql + ");");
        for (String add : f102067g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseMMStoryHistoryItem", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("MMStoryHistoryItem", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102071n, "MMStoryHistoryItem", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseMMStoryHistoryItem", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("MMStoryHistoryItem", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseMMStoryHistoryItem", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102071n;
    }

    public String[] getIndexCreateSQL() {
        return f102067g;
    }

    public StorageObserverOwner<C38547d6> getObserverOwner() {
        return f102072o;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f102066f;
    }

    public String getTableName() {
        return f102066f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey(FFmpegMetadataRetriever.METADATA_KEY_DATE)) {
            this.field_date = contentValues.getAsString(FFmpegMetadataRetriever.METADATA_KEY_DATE);
            if (z) {
                this.f102073d = true;
            }
        }
        if (contentValues.containsKey("count")) {
            this.field_count = contentValues.getAsInteger("count").intValue();
            if (z) {
                this.f102074e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
