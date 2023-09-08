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

/* renamed from: xh.c2 */
public class C38539c2 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f101904f;

    /* renamed from: g */
    public static final String[] f101905g = new String[0];

    /* renamed from: h */
    public static final int f101906h = 1569858955;

    /* renamed from: i */
    public static final int f101907i = 951530617;

    /* renamed from: j */
    public static final int f101908j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f101909n = initAutoDBInfo(C38539c2.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38539c2> f101910o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101911d = true;

    /* renamed from: e */
    public boolean f101912e = true;
    public byte[] field_content;
    public String field_designerIDAndType;

    static {
        SingleTable singleTable = new SingleTable("EmotionDesignerInfo");
        f101904f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("designerIDAndType", "string", singleTable.getName(), "");
        new Column("content", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "designerIDAndType";
        mAutoDBInfo.colsMap.put("designerIDAndType", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "designerIDAndType";
        mAutoDBInfo.columns[1] = "content";
        mAutoDBInfo.colsMap.put("content", "BLOB default '' ");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " designerIDAndType TEXT PRIMARY KEY ,  content BLOB default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38539c2)) {
            return false;
        }
        C38539c2 c2Var = (C38539c2) iAutoDBItem;
        return C46238a.m51546a(this.field_designerIDAndType, c2Var.field_designerIDAndType) && C46238a.m51546a(this.field_content, c2Var.field_content);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101906h == hashCode) {
                    try {
                        this.field_designerIDAndType = cursor.getString(i);
                        this.f101911d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmotionDesignerInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101907i == hashCode) {
                    try {
                        this.field_content = cursor.getBlob(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmotionDesignerInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101908j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101911d) {
            contentValues.put("designerIDAndType", this.field_designerIDAndType);
        }
        if (this.f101912e) {
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
            Log.m105920e("MicroMsg.SDK.BaseEmotionDesignerInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS EmotionDesignerInfo ( " + f101909n.sql + ");");
        for (String add : f101905g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseEmotionDesignerInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("EmotionDesignerInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101909n, "EmotionDesignerInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseEmotionDesignerInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("EmotionDesignerInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseEmotionDesignerInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101909n;
    }

    public String[] getIndexCreateSQL() {
        return f101905g;
    }

    public StorageObserverOwner<C38539c2> getObserverOwner() {
        return f101910o;
    }

    public Object getPrimaryKeyValue() {
        return this.field_designerIDAndType;
    }

    public SingleTable getTable() {
        return f101904f;
    }

    public String getTableName() {
        return f101904f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("designerIDAndType")) {
            this.field_designerIDAndType = contentValues.getAsString("designerIDAndType");
            if (z) {
                this.f101911d = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsByteArray("content");
            if (z) {
                this.f101912e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
