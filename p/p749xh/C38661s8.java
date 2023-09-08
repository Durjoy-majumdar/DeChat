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

/* renamed from: xh.s8 */
public class C38661s8 extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f103693h;

    /* renamed from: i */
    public static final String[] f103694i = new String[0];

    /* renamed from: j */
    public static final int f103695j = 110119509;

    /* renamed from: n */
    public static final int f103696n = -1549184699;

    /* renamed from: o */
    public static final int f103697o = 94851343;

    /* renamed from: p */
    public static final int f103698p = -1341402536;

    /* renamed from: q */
    public static final int f103699q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f103700r = initAutoDBInfo(C38661s8.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38661s8> f103701s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103702d = true;

    /* renamed from: e */
    public boolean f103703e = true;

    /* renamed from: f */
    public boolean f103704f = true;
    public int field_count;
    public String field_memberList;
    public long field_tagId;
    public String field_tagName;

    /* renamed from: g */
    public boolean f103705g = true;

    static {
        SingleTable singleTable = new SingleTable("SnsTagInfo");
        f103693h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("tagId", "long", singleTable.getName(), "");
        new Column("tagName", "string", singleTable.getName(), "");
        new Column("count", "int", singleTable.getName(), "");
        new Column("memberList", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "tagId";
        mAutoDBInfo.colsMap.put("tagId", "LONG default '0' ");
        mAutoDBInfo.columns[1] = "tagName";
        mAutoDBInfo.colsMap.put("tagName", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "count";
        mAutoDBInfo.colsMap.put("count", "INTEGER default '0' ");
        mAutoDBInfo.columns[3] = "memberList";
        mAutoDBInfo.colsMap.put("memberList", "TEXT default '' ");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " tagId LONG default '0' ,  tagName TEXT default '' ,  count INTEGER default '0' ,  memberList TEXT default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38661s8)) {
            return false;
        }
        C38661s8 s8Var = (C38661s8) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_tagId), Long.valueOf(s8Var.field_tagId)) && C46238a.m51546a(this.field_tagName, s8Var.field_tagName) && C46238a.m51546a(Integer.valueOf(this.field_count), Integer.valueOf(s8Var.field_count)) && C46238a.m51546a(this.field_memberList, s8Var.field_memberList);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103695j == hashCode) {
                    try {
                        this.field_tagId = cursor.getLong(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsTagInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103696n == hashCode) {
                    try {
                        this.field_tagName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsTagInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103697o == hashCode) {
                    try {
                        this.field_count = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsTagInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103698p == hashCode) {
                    try {
                        this.field_memberList = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSnsTagInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103699q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103702d) {
            contentValues.put("tagId", Long.valueOf(this.field_tagId));
        }
        if (this.field_tagName == null) {
            this.field_tagName = "";
        }
        if (this.f103703e) {
            contentValues.put("tagName", this.field_tagName);
        }
        if (this.f103704f) {
            contentValues.put("count", Integer.valueOf(this.field_count));
        }
        if (this.field_memberList == null) {
            this.field_memberList = "";
        }
        if (this.f103705g) {
            contentValues.put("memberList", this.field_memberList);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseSnsTagInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS SnsTagInfo ( " + f103700r.sql + ");");
        for (String add : f103694i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseSnsTagInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("SnsTagInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103700r, "SnsTagInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseSnsTagInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("SnsTagInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseSnsTagInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103700r;
    }

    public String[] getIndexCreateSQL() {
        return f103694i;
    }

    public StorageObserverOwner<C38661s8> getObserverOwner() {
        return f103701s;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103693h;
    }

    public String getTableName() {
        return f103693h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("tagId")) {
            this.field_tagId = contentValues.getAsLong("tagId").longValue();
            if (z) {
                this.f103702d = true;
            }
        }
        if (contentValues.containsKey("tagName")) {
            this.field_tagName = contentValues.getAsString("tagName");
            if (z) {
                this.f103703e = true;
            }
        }
        if (contentValues.containsKey("count")) {
            this.field_count = contentValues.getAsInteger("count").intValue();
            if (z) {
                this.f103704f = true;
            }
        }
        if (contentValues.containsKey("memberList")) {
            this.field_memberList = contentValues.getAsString("memberList");
            if (z) {
                this.f103705g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
