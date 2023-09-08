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

/* renamed from: xh.k8 */
public class C38599k8 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f102862f;

    /* renamed from: g */
    public static final String[] f102863g = new String[0];

    /* renamed from: h */
    public static final int f102864h = 106079;

    /* renamed from: i */
    public static final int f102865i = 747804969;

    /* renamed from: j */
    public static final int f102866j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f102867n = initAutoDBInfo(C38599k8.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38599k8> f102868o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102869d = true;

    /* renamed from: e */
    public boolean f102870e = true;
    public String field_key;
    public int field_position;

    static {
        SingleTable singleTable = new SingleTable("SmileyPanelConfigInfo");
        f102862f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("key", "string", singleTable.getName(), "");
        new Column("position", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "key";
        mAutoDBInfo.colsMap.put("key", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "key";
        mAutoDBInfo.columns[1] = "position";
        mAutoDBInfo.colsMap.put("position", "INTEGER");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " key TEXT PRIMARY KEY ,  position INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38599k8)) {
            return false;
        }
        C38599k8 k8Var = (C38599k8) iAutoDBItem;
        return C46238a.m51546a(this.field_key, k8Var.field_key) && C46238a.m51546a(Integer.valueOf(this.field_position), Integer.valueOf(k8Var.field_position));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102864h == hashCode) {
                    try {
                        this.field_key = cursor.getString(i);
                        this.f102869d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyPanelConfigInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102865i == hashCode) {
                    try {
                        this.field_position = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSmileyPanelConfigInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102866j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102869d) {
            contentValues.put("key", this.field_key);
        }
        if (this.f102870e) {
            contentValues.put("position", Integer.valueOf(this.field_position));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseSmileyPanelConfigInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS SmileyPanelConfigInfo ( " + f102867n.sql + ");");
        for (String add : f102863g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseSmileyPanelConfigInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("SmileyPanelConfigInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102867n, "SmileyPanelConfigInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseSmileyPanelConfigInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("SmileyPanelConfigInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseSmileyPanelConfigInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102867n;
    }

    public String[] getIndexCreateSQL() {
        return f102863g;
    }

    public StorageObserverOwner<C38599k8> getObserverOwner() {
        return f102868o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_key;
    }

    public SingleTable getTable() {
        return f102862f;
    }

    public String getTableName() {
        return f102862f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z) {
                this.f102869d = true;
            }
        }
        if (contentValues.containsKey("position")) {
            this.field_position = contentValues.getAsInteger("position").intValue();
            if (z) {
                this.f102870e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
