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

/* renamed from: xh.v1 */
public class C38681v1 extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f103922g;

    /* renamed from: h */
    public static final String[] f103923h = new String[0];

    /* renamed from: i */
    public static final int f103924i = -897316497;

    /* renamed from: j */
    public static final int f103925j = -1051830678;

    /* renamed from: n */
    public static final int f103926n = 1816730632;

    /* renamed from: o */
    public static final int f103927o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f103928p = initAutoDBInfo(C38681v1.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38681v1> f103929q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103930d = true;

    /* renamed from: e */
    public boolean f103931e = true;

    /* renamed from: f */
    public boolean f103932f = true;
    public int field_designerUin;
    public String field_productId;
    public int field_syncTime;

    static {
        SingleTable singleTable = new SingleTable("EmojiDesignerProduct");
        f103922g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("designerUin", "int", singleTable.getName(), "");
        new Column("productId", "string", singleTable.getName(), "");
        new Column("syncTime", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "designerUin";
        mAutoDBInfo.colsMap.put("designerUin", "INTEGER");
        mAutoDBInfo.columns[1] = "productId";
        mAutoDBInfo.colsMap.put("productId", "TEXT");
        mAutoDBInfo.columns[2] = "syncTime";
        mAutoDBInfo.colsMap.put("syncTime", "INTEGER");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " designerUin INTEGER,  productId TEXT,  syncTime INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38681v1)) {
            return false;
        }
        C38681v1 v1Var = (C38681v1) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_designerUin), Integer.valueOf(v1Var.field_designerUin)) && C46238a.m51546a(this.field_productId, v1Var.field_productId) && C46238a.m51546a(Integer.valueOf(this.field_syncTime), Integer.valueOf(v1Var.field_syncTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103924i == hashCode) {
                    try {
                        this.field_designerUin = cursor.getInt(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiDesignerProduct", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103925j == hashCode) {
                    try {
                        this.field_productId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiDesignerProduct", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103926n == hashCode) {
                    try {
                        this.field_syncTime = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiDesignerProduct", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103927o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103930d) {
            contentValues.put("designerUin", Integer.valueOf(this.field_designerUin));
        }
        if (this.f103931e) {
            contentValues.put("productId", this.field_productId);
        }
        if (this.f103932f) {
            contentValues.put("syncTime", Integer.valueOf(this.field_syncTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseEmojiDesignerProduct", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS EmojiDesignerProduct ( " + f103928p.sql + ");");
        for (String add : f103923h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseEmojiDesignerProduct", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("EmojiDesignerProduct", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103928p, "EmojiDesignerProduct", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseEmojiDesignerProduct", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("EmojiDesignerProduct", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseEmojiDesignerProduct", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103928p;
    }

    public String[] getIndexCreateSQL() {
        return f103923h;
    }

    public StorageObserverOwner<C38681v1> getObserverOwner() {
        return f103929q;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103922g;
    }

    public String getTableName() {
        return f103922g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("designerUin")) {
            this.field_designerUin = contentValues.getAsInteger("designerUin").intValue();
            if (z) {
                this.f103930d = true;
            }
        }
        if (contentValues.containsKey("productId")) {
            this.field_productId = contentValues.getAsString("productId");
            if (z) {
                this.f103931e = true;
            }
        }
        if (contentValues.containsKey("syncTime")) {
            this.field_syncTime = contentValues.getAsInteger("syncTime").intValue();
            if (z) {
                this.f103932f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
