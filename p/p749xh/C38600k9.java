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

/* renamed from: xh.k9 */
public class C38600k9 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f102871g;

    /* renamed from: h */
    public static final String[] f102872h = new String[0];

    /* renamed from: i */
    public static final int f102873i = 104191100;

    /* renamed from: j */
    public static final int f102874j = -1356490247;

    /* renamed from: n */
    public static final int f102875n = 951530617;

    /* renamed from: o */
    public static final int f102876o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f102877p = initAutoDBInfo(C38600k9.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38600k9> f102878q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102879d = true;

    /* renamed from: e */
    public boolean f102880e = true;

    /* renamed from: f */
    public boolean f102881f = true;
    public String field_cmsgId;
    public String field_content;
    public long field_msgId;

    static {
        SingleTable singleTable = new SingleTable("VoiceTransText");
        f102871g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("msgId", "long", singleTable.getName(), "");
        new Column("cmsgId", "string", singleTable.getName(), "");
        new Column("content", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "msgId";
        mAutoDBInfo.colsMap.put("msgId", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "msgId";
        mAutoDBInfo.columns[1] = "cmsgId";
        mAutoDBInfo.colsMap.put("cmsgId", "TEXT");
        mAutoDBInfo.columns[2] = "content";
        mAutoDBInfo.colsMap.put("content", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " msgId LONG PRIMARY KEY ,  cmsgId TEXT,  content TEXT default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38600k9)) {
            return false;
        }
        C38600k9 k9Var = (C38600k9) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_msgId), Long.valueOf(k9Var.field_msgId)) && C46238a.m51546a(this.field_cmsgId, k9Var.field_cmsgId) && C46238a.m51546a(this.field_content, k9Var.field_content);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102873i == hashCode) {
                    try {
                        this.field_msgId = cursor.getLong(i);
                        this.f102879d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceTransText", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102874j == hashCode) {
                    try {
                        this.field_cmsgId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceTransText", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102875n == hashCode) {
                    try {
                        this.field_content = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceTransText", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102876o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102879d) {
            contentValues.put("msgId", Long.valueOf(this.field_msgId));
        }
        if (this.f102880e) {
            contentValues.put("cmsgId", this.field_cmsgId);
        }
        if (this.field_content == null) {
            this.field_content = "";
        }
        if (this.f102881f) {
            contentValues.put("content", this.field_content);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseVoiceTransText", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS VoiceTransText ( " + f102877p.sql + ");");
        for (String add : f102872h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseVoiceTransText", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("VoiceTransText", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102877p, "VoiceTransText", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseVoiceTransText", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("VoiceTransText", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseVoiceTransText", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102877p;
    }

    public String[] getIndexCreateSQL() {
        return f102872h;
    }

    public StorageObserverOwner<C38600k9> getObserverOwner() {
        return f102878q;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_msgId);
    }

    public SingleTable getTable() {
        return f102871g;
    }

    public String getTableName() {
        return f102871g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z) {
                this.f102879d = true;
            }
        }
        if (contentValues.containsKey("cmsgId")) {
            this.field_cmsgId = contentValues.getAsString("cmsgId");
            if (z) {
                this.f102880e = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z) {
                this.f102881f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
