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

/* renamed from: xh.b2 */
public class C38529b2 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f101744f;

    /* renamed from: g */
    public static final String[] f101745g = new String[0];

    /* renamed from: h */
    public static final int f101746h = 293428186;

    /* renamed from: i */
    public static final int f101747i = 3079825;

    /* renamed from: j */
    public static final int f101748j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f101749n = initAutoDBInfo(C38529b2.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38529b2> f101750o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101751d = true;

    /* renamed from: e */
    public boolean f101752e = true;
    public String field_desc;
    public String field_groupID;

    static {
        SingleTable singleTable = new SingleTable("EmojiSuggestDescInfo");
        f101744f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("groupID", "string", singleTable.getName(), "");
        new Column("desc", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "groupID";
        mAutoDBInfo.colsMap.put("groupID", "TEXT");
        mAutoDBInfo.columns[1] = "desc";
        mAutoDBInfo.colsMap.put("desc", "TEXT");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " groupID TEXT,  desc TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38529b2)) {
            return false;
        }
        C38529b2 b2Var = (C38529b2) iAutoDBItem;
        return C46238a.m51546a(this.field_groupID, b2Var.field_groupID) && C46238a.m51546a(this.field_desc, b2Var.field_desc);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101746h == hashCode) {
                    try {
                        this.field_groupID = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiSuggestDescInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101747i == hashCode) {
                    try {
                        this.field_desc = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiSuggestDescInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101748j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101751d) {
            contentValues.put("groupID", this.field_groupID);
        }
        if (this.f101752e) {
            contentValues.put("desc", this.field_desc);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseEmojiSuggestDescInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS EmojiSuggestDescInfo ( " + f101749n.sql + ");");
        for (String add : f101745g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseEmojiSuggestDescInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("EmojiSuggestDescInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101749n, "EmojiSuggestDescInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseEmojiSuggestDescInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("EmojiSuggestDescInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseEmojiSuggestDescInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101749n;
    }

    public String[] getIndexCreateSQL() {
        return f101745g;
    }

    public StorageObserverOwner<C38529b2> getObserverOwner() {
        return f101750o;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f101744f;
    }

    public String getTableName() {
        return f101744f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("groupID")) {
            this.field_groupID = contentValues.getAsString("groupID");
            if (z) {
                this.f101751d = true;
            }
        }
        if (contentValues.containsKey("desc")) {
            this.field_desc = contentValues.getAsString("desc");
            if (z) {
                this.f101752e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
