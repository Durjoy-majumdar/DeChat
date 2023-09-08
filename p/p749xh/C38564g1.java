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

/* renamed from: xh.g1 */
public class C38564g1 extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f102317i;

    /* renamed from: j */
    public static final Column f102318j;

    /* renamed from: n */
    public static final Column f102319n;

    /* renamed from: o */
    public static final String[] f102320o = new String[0];

    /* renamed from: p */
    public static final int f102321p = 104191100;

    /* renamed from: q */
    public static final int f102322q = -1338919323;

    /* renamed from: r */
    public static final int f102323r = 1788928751;

    /* renamed from: s */
    public static final int f102324s = 1329639195;

    /* renamed from: t */
    public static final int f102325t = 3530753;

    /* renamed from: u */
    public static final int f102326u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f102327v = initAutoDBInfo(C38564g1.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C38564g1> f102328w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102329d = true;

    /* renamed from: e */
    public boolean f102330e = true;

    /* renamed from: f */
    public boolean f102331f = true;
    public String field_dataId;
    public String field_dataPath;
    public long field_msgId;
    public long field_size;
    public String field_thumbPath;

    /* renamed from: g */
    public boolean f102332g = true;

    /* renamed from: h */
    public boolean f102333h = true;

    static {
        SingleTable singleTable = new SingleTable("ChatroomNoticeAttachIndex");
        f102317i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        f102318j = new Column("msgId", "long", singleTable.getName(), "");
        f102319n = new Column("dataId", "string", singleTable.getName(), "");
        new Column("dataPath", "string", singleTable.getName(), "");
        new Column("thumbPath", "string", singleTable.getName(), "");
        new Column("size", "long", singleTable.getName(), "");
    }

    public static void createTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ChatroomNoticeAttachIndex ( " + f102327v.sql + ");");
        for (String add : f102320o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ChatroomNoticeAttachIndex", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102327v, "ChatroomNoticeAttachIndex", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ChatroomNoticeAttachIndex", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "msgId";
        mAutoDBInfo.colsMap.put("msgId", "LONG");
        mAutoDBInfo.columns[1] = "dataId";
        mAutoDBInfo.colsMap.put("dataId", "TEXT");
        mAutoDBInfo.columns[2] = "dataPath";
        mAutoDBInfo.colsMap.put("dataPath", "TEXT");
        mAutoDBInfo.columns[3] = "thumbPath";
        mAutoDBInfo.colsMap.put("thumbPath", "TEXT");
        mAutoDBInfo.columns[4] = "size";
        mAutoDBInfo.colsMap.put("size", "LONG");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " msgId LONG,  dataId TEXT,  dataPath TEXT,  thumbPath TEXT,  size LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38564g1)) {
            return false;
        }
        C38564g1 g1Var = (C38564g1) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_msgId), Long.valueOf(g1Var.field_msgId)) && C46238a.m51546a(this.field_dataId, g1Var.field_dataId) && C46238a.m51546a(this.field_dataPath, g1Var.field_dataPath) && C46238a.m51546a(this.field_thumbPath, g1Var.field_thumbPath) && C46238a.m51546a(Long.valueOf(this.field_size), Long.valueOf(g1Var.field_size));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102321p == hashCode) {
                    try {
                        this.field_msgId = cursor.getLong(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102322q == hashCode) {
                    try {
                        this.field_dataId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102323r == hashCode) {
                    try {
                        this.field_dataPath = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102324s == hashCode) {
                    try {
                        this.field_thumbPath = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102325t == hashCode) {
                    try {
                        this.field_size = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102326u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102329d) {
            contentValues.put("msgId", Long.valueOf(this.field_msgId));
        }
        if (this.f102330e) {
            contentValues.put("dataId", this.field_dataId);
        }
        if (this.f102331f) {
            contentValues.put("dataPath", this.field_dataPath);
        }
        if (this.f102332g) {
            contentValues.put("thumbPath", this.field_thumbPath);
        }
        if (this.f102333h) {
            contentValues.put("size", Long.valueOf(this.field_size));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        createTable(iSQLiteDatabase);
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102327v;
    }

    public String[] getIndexCreateSQL() {
        return f102320o;
    }

    public StorageObserverOwner<C38564g1> getObserverOwner() {
        return f102328w;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f102317i;
    }

    public String getTableName() {
        return f102317i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z) {
                this.f102329d = true;
            }
        }
        if (contentValues.containsKey("dataId")) {
            this.field_dataId = contentValues.getAsString("dataId");
            if (z) {
                this.f102330e = true;
            }
        }
        if (contentValues.containsKey("dataPath")) {
            this.field_dataPath = contentValues.getAsString("dataPath");
            if (z) {
                this.f102331f = true;
            }
        }
        if (contentValues.containsKey("thumbPath")) {
            this.field_thumbPath = contentValues.getAsString("thumbPath");
            if (z) {
                this.f102332g = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsLong("size").longValue();
            if (z) {
                this.f102333h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
