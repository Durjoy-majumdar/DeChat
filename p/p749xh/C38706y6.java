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

/* renamed from: xh.y6 */
public class C38706y6 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f104332f;

    /* renamed from: g */
    public static final String[] f104333g = new String[0];

    /* renamed from: h */
    public static final int f104334h = -2124225564;

    /* renamed from: i */
    public static final int f104335i = 1804799183;

    /* renamed from: j */
    public static final int f104336j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f104337n = initAutoDBInfo(C38706y6.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38706y6> f104338o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104339d = true;

    /* renamed from: e */
    public boolean f104340e = true;
    public String field_finder_username;
    public String field_openIMUsername;

    static {
        SingleTable singleTable = new SingleTable("OpenIMFinderInfoNew");
        f104332f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("openIMUsername", "string", singleTable.getName(), "");
        new Column("finder_username", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "openIMUsername";
        mAutoDBInfo.colsMap.put("openIMUsername", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "openIMUsername";
        mAutoDBInfo.columns[1] = "finder_username";
        mAutoDBInfo.colsMap.put("finder_username", "TEXT");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " openIMUsername TEXT PRIMARY KEY ,  finder_username TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38706y6)) {
            return false;
        }
        C38706y6 y6Var = (C38706y6) iAutoDBItem;
        return C46238a.m51546a(this.field_openIMUsername, y6Var.field_openIMUsername) && C46238a.m51546a(this.field_finder_username, y6Var.field_finder_username);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104334h == hashCode) {
                    try {
                        this.field_openIMUsername = cursor.getString(i);
                        this.f104339d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMFinderInfoNew", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104335i == hashCode) {
                    try {
                        this.field_finder_username = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOpenIMFinderInfoNew", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104336j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104339d) {
            contentValues.put("openIMUsername", this.field_openIMUsername);
        }
        if (this.f104340e) {
            contentValues.put("finder_username", this.field_finder_username);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseOpenIMFinderInfoNew", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS OpenIMFinderInfoNew ( " + f104337n.sql + ");");
        for (String add : f104333g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseOpenIMFinderInfoNew", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("OpenIMFinderInfoNew", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104337n, "OpenIMFinderInfoNew", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseOpenIMFinderInfoNew", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("OpenIMFinderInfoNew", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseOpenIMFinderInfoNew", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104337n;
    }

    public String[] getIndexCreateSQL() {
        return f104333g;
    }

    public StorageObserverOwner<C38706y6> getObserverOwner() {
        return f104338o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_openIMUsername;
    }

    public SingleTable getTable() {
        return f104332f;
    }

    public String getTableName() {
        return f104332f.getName();
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.m51547b(jSONObject, "openIMUsername", this.field_openIMUsername);
            C46238a.m51547b(jSONObject, "finder_username", this.field_finder_username);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("openIMUsername")) {
            this.field_openIMUsername = contentValues.getAsString("openIMUsername");
            if (z) {
                this.f104339d = true;
            }
        }
        if (contentValues.containsKey("finder_username")) {
            this.field_finder_username = contentValues.getAsString("finder_username");
            if (z) {
                this.f104340e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
