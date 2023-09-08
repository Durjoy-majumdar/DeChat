package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.dynamite.ProviderConstants;
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

/* renamed from: xh.b6 */
public class C38532b6 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f101775A = 108705909;

    /* renamed from: B */
    public static final IAutoDBItem.MAutoDBInfo f101776B = initAutoDBInfo(C38532b6.class);

    /* renamed from: C */
    public static final StorageObserverOwner<C38532b6> f101777C = new StorageObserverOwner<>();

    /* renamed from: p */
    public static final SingleTable f101778p;

    /* renamed from: q */
    public static final String[] f101779q = new String[0];

    /* renamed from: r */
    public static final int f101780r = -1867567750;

    /* renamed from: s */
    public static final int f101781s = 697998674;

    /* renamed from: t */
    public static final int f101782t = 475457099;

    /* renamed from: u */
    public static final int f101783u = -351786425;

    /* renamed from: v */
    public static final int f101784v = -55795812;

    /* renamed from: w */
    public static final int f101785w = -1973098643;

    /* renamed from: x */
    public static final int f101786x = 351608024;

    /* renamed from: y */
    public static final int f101787y = -123918962;

    /* renamed from: z */
    public static final int f101788z = -1123522877;

    /* renamed from: d */
    public boolean f101789d = true;

    /* renamed from: e */
    public boolean f101790e = true;

    /* renamed from: f */
    public boolean f101791f = true;
    public String field_bubbleMd5;
    public String field_bubbledynamicMd5;
    public String field_bubblewidgetMd5;
    public String field_coverMd5;
    public String field_coverwidgetMd5;
    public String field_detailMd5;
    public String field_minilogoMd5;
    public int field_subtype;
    public int field_version;

    /* renamed from: g */
    public boolean f101792g = true;

    /* renamed from: h */
    public boolean f101793h = true;

    /* renamed from: i */
    public boolean f101794i = true;

    /* renamed from: j */
    public boolean f101795j = true;

    /* renamed from: n */
    public boolean f101796n = true;

    /* renamed from: o */
    public boolean f101797o = true;

    static {
        SingleTable singleTable = new SingleTable("LuckyMoneyEnvelopeResource");
        f101778p = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("subtype", "int", singleTable.getName(), "");
        new Column("bubbleMd5", "string", singleTable.getName(), "");
        new Column("bubbledynamicMd5", "string", singleTable.getName(), "");
        new Column("coverMd5", "string", singleTable.getName(), "");
        new Column("minilogoMd5", "string", singleTable.getName(), "");
        new Column("detailMd5", "string", singleTable.getName(), "");
        new Column(ProviderConstants.API_COLNAME_FEATURE_VERSION, "int", singleTable.getName(), "");
        new Column("bubblewidgetMd5", "string", singleTable.getName(), "");
        new Column("coverwidgetMd5", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[9];
        String[] strArr = new String[10];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "subtype";
        mAutoDBInfo.colsMap.put("subtype", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "subtype";
        mAutoDBInfo.columns[1] = "bubbleMd5";
        mAutoDBInfo.colsMap.put("bubbleMd5", "TEXT");
        mAutoDBInfo.columns[2] = "bubbledynamicMd5";
        mAutoDBInfo.colsMap.put("bubbledynamicMd5", "TEXT");
        mAutoDBInfo.columns[3] = "coverMd5";
        mAutoDBInfo.colsMap.put("coverMd5", "TEXT");
        mAutoDBInfo.columns[4] = "minilogoMd5";
        mAutoDBInfo.colsMap.put("minilogoMd5", "TEXT");
        mAutoDBInfo.columns[5] = "detailMd5";
        mAutoDBInfo.colsMap.put("detailMd5", "TEXT");
        mAutoDBInfo.columns[6] = ProviderConstants.API_COLNAME_FEATURE_VERSION;
        mAutoDBInfo.colsMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, "INTEGER");
        mAutoDBInfo.columns[7] = "bubblewidgetMd5";
        mAutoDBInfo.colsMap.put("bubblewidgetMd5", "TEXT");
        mAutoDBInfo.columns[8] = "coverwidgetMd5";
        mAutoDBInfo.colsMap.put("coverwidgetMd5", "TEXT");
        mAutoDBInfo.columns[9] = "rowid";
        mAutoDBInfo.sql = " subtype INTEGER PRIMARY KEY ,  bubbleMd5 TEXT,  bubbledynamicMd5 TEXT,  coverMd5 TEXT,  minilogoMd5 TEXT,  detailMd5 TEXT,  version INTEGER,  bubblewidgetMd5 TEXT,  coverwidgetMd5 TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38532b6)) {
            return false;
        }
        C38532b6 b6Var = (C38532b6) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_subtype), Integer.valueOf(b6Var.field_subtype)) && C46238a.m51546a(this.field_bubbleMd5, b6Var.field_bubbleMd5) && C46238a.m51546a(this.field_bubbledynamicMd5, b6Var.field_bubbledynamicMd5) && C46238a.m51546a(this.field_coverMd5, b6Var.field_coverMd5) && C46238a.m51546a(this.field_minilogoMd5, b6Var.field_minilogoMd5) && C46238a.m51546a(this.field_detailMd5, b6Var.field_detailMd5) && C46238a.m51546a(Integer.valueOf(this.field_version), Integer.valueOf(b6Var.field_version)) && C46238a.m51546a(this.field_bubblewidgetMd5, b6Var.field_bubblewidgetMd5) && C46238a.m51546a(this.field_coverwidgetMd5, b6Var.field_coverwidgetMd5);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101780r == hashCode) {
                    try {
                        this.field_subtype = cursor.getInt(i);
                        this.f101789d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101781s == hashCode) {
                    try {
                        this.field_bubbleMd5 = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101782t == hashCode) {
                    try {
                        this.field_bubbledynamicMd5 = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101783u == hashCode) {
                    try {
                        this.field_coverMd5 = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101784v == hashCode) {
                    try {
                        this.field_minilogoMd5 = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101785w == hashCode) {
                    try {
                        this.field_detailMd5 = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101786x == hashCode) {
                    try {
                        this.field_version = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101787y == hashCode) {
                    try {
                        this.field_bubblewidgetMd5 = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101788z == hashCode) {
                    try {
                        this.field_coverwidgetMd5 = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101775A == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101789d) {
            contentValues.put("subtype", Integer.valueOf(this.field_subtype));
        }
        if (this.f101790e) {
            contentValues.put("bubbleMd5", this.field_bubbleMd5);
        }
        if (this.f101791f) {
            contentValues.put("bubbledynamicMd5", this.field_bubbledynamicMd5);
        }
        if (this.f101792g) {
            contentValues.put("coverMd5", this.field_coverMd5);
        }
        if (this.f101793h) {
            contentValues.put("minilogoMd5", this.field_minilogoMd5);
        }
        if (this.f101794i) {
            contentValues.put("detailMd5", this.field_detailMd5);
        }
        if (this.f101795j) {
            contentValues.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, Integer.valueOf(this.field_version));
        }
        if (this.f101796n) {
            contentValues.put("bubblewidgetMd5", this.field_bubblewidgetMd5);
        }
        if (this.f101797o) {
            contentValues.put("coverwidgetMd5", this.field_coverwidgetMd5);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS LuckyMoneyEnvelopeResource ( " + f101776B.sql + ");");
        for (String add : f101779q) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("LuckyMoneyEnvelopeResource", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101776B, "LuckyMoneyEnvelopeResource", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("LuckyMoneyEnvelopeResource", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101776B;
    }

    public String[] getIndexCreateSQL() {
        return f101779q;
    }

    public StorageObserverOwner<C38532b6> getObserverOwner() {
        return f101777C;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_subtype);
    }

    public SingleTable getTable() {
        return f101778p;
    }

    public String getTableName() {
        return f101778p.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("subtype")) {
            this.field_subtype = contentValues.getAsInteger("subtype").intValue();
            if (z) {
                this.f101789d = true;
            }
        }
        if (contentValues.containsKey("bubbleMd5")) {
            this.field_bubbleMd5 = contentValues.getAsString("bubbleMd5");
            if (z) {
                this.f101790e = true;
            }
        }
        if (contentValues.containsKey("bubbledynamicMd5")) {
            this.field_bubbledynamicMd5 = contentValues.getAsString("bubbledynamicMd5");
            if (z) {
                this.f101791f = true;
            }
        }
        if (contentValues.containsKey("coverMd5")) {
            this.field_coverMd5 = contentValues.getAsString("coverMd5");
            if (z) {
                this.f101792g = true;
            }
        }
        if (contentValues.containsKey("minilogoMd5")) {
            this.field_minilogoMd5 = contentValues.getAsString("minilogoMd5");
            if (z) {
                this.f101793h = true;
            }
        }
        if (contentValues.containsKey("detailMd5")) {
            this.field_detailMd5 = contentValues.getAsString("detailMd5");
            if (z) {
                this.f101794i = true;
            }
        }
        if (contentValues.containsKey(ProviderConstants.API_COLNAME_FEATURE_VERSION)) {
            this.field_version = contentValues.getAsInteger(ProviderConstants.API_COLNAME_FEATURE_VERSION).intValue();
            if (z) {
                this.f101795j = true;
            }
        }
        if (contentValues.containsKey("bubblewidgetMd5")) {
            this.field_bubblewidgetMd5 = contentValues.getAsString("bubblewidgetMd5");
            if (z) {
                this.f101796n = true;
            }
        }
        if (contentValues.containsKey("coverwidgetMd5")) {
            this.field_coverwidgetMd5 = contentValues.getAsString("coverwidgetMd5");
            if (z) {
                this.f101797o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
