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

/* renamed from: xh.v2 */
public class C38682v2 extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f103933j;

    /* renamed from: n */
    public static final String[] f103934n = new String[0];

    /* renamed from: o */
    public static final int f103935o = 3560141;

    /* renamed from: p */
    public static final int f103936p = 104069929;

    /* renamed from: q */
    public static final int f103937q = 143492155;

    /* renamed from: r */
    public static final int f103938r = -376636056;

    /* renamed from: s */
    public static final int f103939s = 102727412;

    /* renamed from: t */
    public static final int f103940t = 114586;

    /* renamed from: u */
    public static final int f103941u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f103942v = initAutoDBInfo(C38682v2.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C38682v2> f103943w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103944d = true;

    /* renamed from: e */
    public boolean f103945e = true;

    /* renamed from: f */
    public boolean f103946f = true;
    public String field_feature_str;
    public int field_label;
    public String field_model;
    public String field_sample_uid;
    public int field_tag;
    public long field_time;

    /* renamed from: g */
    public boolean f103947g = true;

    /* renamed from: h */
    public boolean f103948h = true;

    /* renamed from: i */
    public boolean f103949i = true;

    static {
        SingleTable singleTable = new SingleTable("FewShotLearning");
        f103933j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("time", "long", singleTable.getName(), "");
        new Column("model", "string", singleTable.getName(), "");
        new Column("sample_uid", "string", singleTable.getName(), "");
        new Column("feature_str", "string", singleTable.getName(), "");
        new Column("label", "int", singleTable.getName(), "");
        new Column("tag", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "time";
        mAutoDBInfo.colsMap.put("time", "LONG");
        mAutoDBInfo.columns[1] = "model";
        mAutoDBInfo.colsMap.put("model", "TEXT");
        mAutoDBInfo.columns[2] = "sample_uid";
        mAutoDBInfo.colsMap.put("sample_uid", "TEXT");
        mAutoDBInfo.columns[3] = "feature_str";
        mAutoDBInfo.colsMap.put("feature_str", "TEXT");
        mAutoDBInfo.columns[4] = "label";
        mAutoDBInfo.colsMap.put("label", "INTEGER");
        mAutoDBInfo.columns[5] = "tag";
        mAutoDBInfo.colsMap.put("tag", "INTEGER");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " time LONG,  model TEXT,  sample_uid TEXT,  feature_str TEXT,  label INTEGER,  tag INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38682v2)) {
            return false;
        }
        C38682v2 v2Var = (C38682v2) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_time), Long.valueOf(v2Var.field_time)) && C46238a.m51546a(this.field_model, v2Var.field_model) && C46238a.m51546a(this.field_sample_uid, v2Var.field_sample_uid) && C46238a.m51546a(this.field_feature_str, v2Var.field_feature_str) && C46238a.m51546a(Integer.valueOf(this.field_label), Integer.valueOf(v2Var.field_label)) && C46238a.m51546a(Integer.valueOf(this.field_tag), Integer.valueOf(v2Var.field_tag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103935o == hashCode) {
                    try {
                        this.field_time = cursor.getLong(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFewShotLearning", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103936p == hashCode) {
                    try {
                        this.field_model = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFewShotLearning", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103937q == hashCode) {
                    try {
                        this.field_sample_uid = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFewShotLearning", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103938r == hashCode) {
                    try {
                        this.field_feature_str = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFewShotLearning", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103939s == hashCode) {
                    try {
                        this.field_label = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFewShotLearning", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103940t == hashCode) {
                    try {
                        this.field_tag = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFewShotLearning", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103941u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103944d) {
            contentValues.put("time", Long.valueOf(this.field_time));
        }
        if (this.f103945e) {
            contentValues.put("model", this.field_model);
        }
        if (this.f103946f) {
            contentValues.put("sample_uid", this.field_sample_uid);
        }
        if (this.f103947g) {
            contentValues.put("feature_str", this.field_feature_str);
        }
        if (this.f103948h) {
            contentValues.put("label", Integer.valueOf(this.field_label));
        }
        if (this.f103949i) {
            contentValues.put("tag", Integer.valueOf(this.field_tag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFewShotLearning", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FewShotLearning ( " + f103942v.sql + ");");
        for (String add : f103934n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFewShotLearning", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FewShotLearning", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103942v, "FewShotLearning", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFewShotLearning", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FewShotLearning", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFewShotLearning", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103942v;
    }

    public String[] getIndexCreateSQL() {
        return f103934n;
    }

    public StorageObserverOwner<C38682v2> getObserverOwner() {
        return f103943w;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103933j;
    }

    public String getTableName() {
        return f103933j.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("time")) {
            this.field_time = contentValues.getAsLong("time").longValue();
            if (z) {
                this.f103944d = true;
            }
        }
        if (contentValues.containsKey("model")) {
            this.field_model = contentValues.getAsString("model");
            if (z) {
                this.f103945e = true;
            }
        }
        if (contentValues.containsKey("sample_uid")) {
            this.field_sample_uid = contentValues.getAsString("sample_uid");
            if (z) {
                this.f103946f = true;
            }
        }
        if (contentValues.containsKey("feature_str")) {
            this.field_feature_str = contentValues.getAsString("feature_str");
            if (z) {
                this.f103947g = true;
            }
        }
        if (contentValues.containsKey("label")) {
            this.field_label = contentValues.getAsInteger("label").intValue();
            if (z) {
                this.f103948h = true;
            }
        }
        if (contentValues.containsKey("tag")) {
            this.field_tag = contentValues.getAsInteger("tag").intValue();
            if (z) {
                this.f103949i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
