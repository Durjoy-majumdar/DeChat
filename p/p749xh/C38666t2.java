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
import org.json.JSONObject;

/* renamed from: xh.t2 */
public class C38666t2 extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f103758j;

    /* renamed from: n */
    public static final String[] f103759n = {"CREATE INDEX IF NOT EXISTS FavSearchInfo_Content_Index ON FavSearchInfo(content)", "CREATE INDEX IF NOT EXISTS FavSearchInfo_TagContent_Index ON FavSearchInfo(tagContent)", "CREATE INDEX IF NOT EXISTS FavSearchInfo_SubType_Index ON FavSearchInfo(subtype)"};

    /* renamed from: o */
    public static final int f103760o = 338409958;

    /* renamed from: p */
    public static final int f103761p = 951530617;

    /* renamed from: q */
    public static final int f103762q = 1186868095;

    /* renamed from: r */
    public static final int f103763r = 3560141;

    /* renamed from: s */
    public static final int f103764s = 3575610;

    /* renamed from: t */
    public static final int f103765t = -1867567750;

    /* renamed from: u */
    public static final int f103766u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f103767v = initAutoDBInfo(C38666t2.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C38666t2> f103768w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103769d = true;

    /* renamed from: e */
    public boolean f103770e = true;

    /* renamed from: f */
    public boolean f103771f = true;
    public String field_content;
    public long field_localId;
    public int field_subtype;
    public String field_tagContent;
    public long field_time;
    public int field_type;

    /* renamed from: g */
    public boolean f103772g = true;

    /* renamed from: h */
    public boolean f103773h = true;

    /* renamed from: i */
    public boolean f103774i = true;

    static {
        SingleTable singleTable = new SingleTable("FavSearchInfo");
        f103758j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column(C66261f3.COL_LOCALID, "long", singleTable.getName(), "");
        new Column("content", "string", singleTable.getName(), "");
        new Column("tagContent", "string", singleTable.getName(), "");
        new Column("time", "long", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("subtype", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = C66261f3.COL_LOCALID;
        mAutoDBInfo.colsMap.put(C66261f3.COL_LOCALID, "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = C66261f3.COL_LOCALID;
        mAutoDBInfo.columns[1] = "content";
        mAutoDBInfo.colsMap.put("content", "TEXT");
        mAutoDBInfo.columns[2] = "tagContent";
        mAutoDBInfo.colsMap.put("tagContent", "TEXT");
        mAutoDBInfo.columns[3] = "time";
        mAutoDBInfo.colsMap.put("time", "LONG");
        mAutoDBInfo.columns[4] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[5] = "subtype";
        mAutoDBInfo.colsMap.put("subtype", "INTEGER default '0' ");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " localId LONG PRIMARY KEY ,  content TEXT,  tagContent TEXT,  time LONG,  type INTEGER,  subtype INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38666t2)) {
            return false;
        }
        C38666t2 t2Var = (C38666t2) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_localId), Long.valueOf(t2Var.field_localId)) && C46238a.m51546a(this.field_content, t2Var.field_content) && C46238a.m51546a(this.field_tagContent, t2Var.field_tagContent) && C46238a.m51546a(Long.valueOf(this.field_time), Long.valueOf(t2Var.field_time)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(t2Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_subtype), Integer.valueOf(t2Var.field_subtype));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103760o == hashCode) {
                    try {
                        this.field_localId = cursor.getLong(i);
                        this.f103769d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavSearchInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103761p == hashCode) {
                    try {
                        this.field_content = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavSearchInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103762q == hashCode) {
                    try {
                        this.field_tagContent = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavSearchInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103763r == hashCode) {
                    try {
                        this.field_time = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavSearchInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103764s == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavSearchInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103765t == hashCode) {
                    try {
                        this.field_subtype = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFavSearchInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103766u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103769d) {
            contentValues.put(C66261f3.COL_LOCALID, Long.valueOf(this.field_localId));
        }
        if (this.f103770e) {
            contentValues.put("content", this.field_content);
        }
        if (this.f103771f) {
            contentValues.put("tagContent", this.field_tagContent);
        }
        if (this.f103772g) {
            contentValues.put("time", Long.valueOf(this.field_time));
        }
        if (this.f103773h) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f103774i) {
            contentValues.put("subtype", Integer.valueOf(this.field_subtype));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFavSearchInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FavSearchInfo ( " + f103767v.sql + ");");
        for (String add : f103759n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFavSearchInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FavSearchInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103767v, "FavSearchInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFavSearchInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FavSearchInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFavSearchInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103767v;
    }

    public String[] getIndexCreateSQL() {
        return f103759n;
    }

    public StorageObserverOwner<C38666t2> getObserverOwner() {
        return f103768w;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_localId);
    }

    public SingleTable getTable() {
        return f103758j;
    }

    public String getTableName() {
        return f103758j.getName();
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.m51547b(jSONObject, C66261f3.COL_LOCALID, Long.valueOf(this.field_localId));
            C46238a.m51547b(jSONObject, "content", this.field_content);
            C46238a.m51547b(jSONObject, "tagContent", this.field_tagContent);
            C46238a.m51547b(jSONObject, "time", Long.valueOf(this.field_time));
            C46238a.m51547b(jSONObject, "type", Integer.valueOf(this.field_type));
            C46238a.m51547b(jSONObject, "subtype", Integer.valueOf(this.field_subtype));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey(C66261f3.COL_LOCALID)) {
            this.field_localId = contentValues.getAsLong(C66261f3.COL_LOCALID).longValue();
            if (z) {
                this.f103769d = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z) {
                this.f103770e = true;
            }
        }
        if (contentValues.containsKey("tagContent")) {
            this.field_tagContent = contentValues.getAsString("tagContent");
            if (z) {
                this.f103771f = true;
            }
        }
        if (contentValues.containsKey("time")) {
            this.field_time = contentValues.getAsLong("time").longValue();
            if (z) {
                this.f103772g = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f103773h = true;
            }
        }
        if (contentValues.containsKey("subtype")) {
            this.field_subtype = contentValues.getAsInteger("subtype").intValue();
            if (z) {
                this.f103774i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
