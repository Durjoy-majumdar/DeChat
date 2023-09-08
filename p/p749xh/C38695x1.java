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

/* renamed from: xh.x1 */
public class C38695x1 extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f104184i;

    /* renamed from: j */
    public static final String[] f104185j = new String[0];

    /* renamed from: n */
    public static final int f104186n = 106079;

    /* renamed from: o */
    public static final int f104187o = 110371416;

    /* renamed from: p */
    public static final int f104188p = 3079825;

    /* renamed from: q */
    public static final int f104189q = 1638765110;

    /* renamed from: r */
    public static final int f104190r = 1060558027;

    /* renamed from: s */
    public static final int f104191s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f104192t = initAutoDBInfo(C38695x1.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C38695x1> f104193u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104194d = true;

    /* renamed from: e */
    public boolean f104195e = true;

    /* renamed from: f */
    public boolean f104196f = true;
    public String field_desc;
    public String field_iconUrl;
    public String field_key;
    public String field_panelUrl;
    public String field_title;

    /* renamed from: g */
    public boolean f104197g = true;

    /* renamed from: h */
    public boolean f104198h = true;

    static {
        SingleTable singleTable = new SingleTable("EmojiIPSetInfo");
        f104184i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("key", "string", singleTable.getName(), "");
        new Column(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "string", singleTable.getName(), "");
        new Column("desc", "string", singleTable.getName(), "");
        new Column("iconUrl", "string", singleTable.getName(), "");
        new Column("panelUrl", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "key";
        mAutoDBInfo.colsMap.put("key", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "key";
        mAutoDBInfo.columns[1] = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        mAutoDBInfo.colsMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        mAutoDBInfo.columns[2] = "desc";
        mAutoDBInfo.colsMap.put("desc", "TEXT");
        mAutoDBInfo.columns[3] = "iconUrl";
        mAutoDBInfo.colsMap.put("iconUrl", "TEXT");
        mAutoDBInfo.columns[4] = "panelUrl";
        mAutoDBInfo.colsMap.put("panelUrl", "TEXT");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " key TEXT PRIMARY KEY ,  title TEXT,  desc TEXT,  iconUrl TEXT,  panelUrl TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38695x1)) {
            return false;
        }
        C38695x1 x1Var = (C38695x1) iAutoDBItem;
        return C46238a.m51546a(this.field_key, x1Var.field_key) && C46238a.m51546a(this.field_title, x1Var.field_title) && C46238a.m51546a(this.field_desc, x1Var.field_desc) && C46238a.m51546a(this.field_iconUrl, x1Var.field_iconUrl) && C46238a.m51546a(this.field_panelUrl, x1Var.field_panelUrl);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104186n == hashCode) {
                    try {
                        this.field_key = cursor.getString(i);
                        this.f104194d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiIPSetInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104187o == hashCode) {
                    try {
                        this.field_title = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiIPSetInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104188p == hashCode) {
                    try {
                        this.field_desc = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiIPSetInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104189q == hashCode) {
                    try {
                        this.field_iconUrl = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiIPSetInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104190r == hashCode) {
                    try {
                        this.field_panelUrl = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiIPSetInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104191s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104194d) {
            contentValues.put("key", this.field_key);
        }
        if (this.f104195e) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f104196f) {
            contentValues.put("desc", this.field_desc);
        }
        if (this.f104197g) {
            contentValues.put("iconUrl", this.field_iconUrl);
        }
        if (this.f104198h) {
            contentValues.put("panelUrl", this.field_panelUrl);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseEmojiIPSetInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS EmojiIPSetInfo ( " + f104192t.sql + ");");
        for (String add : f104185j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseEmojiIPSetInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("EmojiIPSetInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104192t, "EmojiIPSetInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseEmojiIPSetInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("EmojiIPSetInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseEmojiIPSetInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104192t;
    }

    public String[] getIndexCreateSQL() {
        return f104185j;
    }

    public StorageObserverOwner<C38695x1> getObserverOwner() {
        return f104193u;
    }

    public Object getPrimaryKeyValue() {
        return this.field_key;
    }

    public SingleTable getTable() {
        return f104184i;
    }

    public String getTableName() {
        return f104184i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z) {
                this.f104194d = true;
            }
        }
        if (contentValues.containsKey(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z) {
                this.f104195e = true;
            }
        }
        if (contentValues.containsKey("desc")) {
            this.field_desc = contentValues.getAsString("desc");
            if (z) {
                this.f104196f = true;
            }
        }
        if (contentValues.containsKey("iconUrl")) {
            this.field_iconUrl = contentValues.getAsString("iconUrl");
            if (z) {
                this.f104197g = true;
            }
        }
        if (contentValues.containsKey("panelUrl")) {
            this.field_panelUrl = contentValues.getAsString("panelUrl");
            if (z) {
                this.f104198h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
