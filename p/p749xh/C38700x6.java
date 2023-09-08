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

/* renamed from: xh.x6 */
public class C38700x6 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f104276f;

    /* renamed from: g */
    public static final String[] f104277g = new String[0];

    /* renamed from: h */
    public static final int f104278h = -265713450;

    /* renamed from: i */
    public static final int f104279i = 951530617;

    /* renamed from: j */
    public static final int f104280j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f104281n = initAutoDBInfo(C38700x6.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38700x6> f104282o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104283d = true;

    /* renamed from: e */
    public boolean f104284e = true;
    public String field_content;
    public String field_username;

    static {
        SingleTable singleTable = new SingleTable("OpenIMArchive");
        f104276f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("content", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "username";
        mAutoDBInfo.columns[1] = "content";
        mAutoDBInfo.colsMap.put("content", "TEXT");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " username TEXT PRIMARY KEY ,  content TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38700x6)) {
            return false;
        }
        C38700x6 x6Var = (C38700x6) iAutoDBItem;
        return C46238a.m51546a(this.field_username, x6Var.field_username) && C46238a.m51546a(this.field_content, x6Var.field_content);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104278h == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                        this.f104283d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMArchive", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104279i == hashCode) {
                    try {
                        this.field_content = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMArchive", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104280j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104283d) {
            contentValues.put("username", this.field_username);
        }
        if (this.f104284e) {
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
            Log.m105920e("MicroMsg.SDK.BaseOpenIMArchive", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS OpenIMArchive ( " + f104281n.sql + ");");
        for (String add : f104277g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseOpenIMArchive", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("OpenIMArchive", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104281n, "OpenIMArchive", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseOpenIMArchive", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("OpenIMArchive", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseOpenIMArchive", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104281n;
    }

    public String[] getIndexCreateSQL() {
        return f104277g;
    }

    public StorageObserverOwner<C38700x6> getObserverOwner() {
        return f104282o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_username;
    }

    public SingleTable getTable() {
        return f104276f;
    }

    public String getTableName() {
        return f104276f.getName();
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.m51547b(jSONObject, "username", this.field_username);
            C46238a.m51547b(jSONObject, "content", this.field_content);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f104283d = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z) {
                this.f104284e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
