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

/* renamed from: xh.r3 */
public class C38649r3 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f103474A = -1244645884;

    /* renamed from: B */
    public static final int f103475B = 108705909;

    /* renamed from: C */
    public static final IAutoDBItem.MAutoDBInfo f103476C = initAutoDBInfo(C38649r3.class);

    /* renamed from: D */
    public static final StorageObserverOwner<C38649r3> f103477D = new StorageObserverOwner<>();

    /* renamed from: p */
    public static final SingleTable f103478p;

    /* renamed from: q */
    public static final Column f103479q;

    /* renamed from: r */
    public static final String[] f103480r = new String[0];

    /* renamed from: s */
    public static final int f103481s = 106844421;

    /* renamed from: t */
    public static final int f103482t = 426235222;

    /* renamed from: u */
    public static final int f103483u = -673101372;

    /* renamed from: v */
    public static final int f103484v = -1192969641;

    /* renamed from: w */
    public static final int f103485w = -2125747167;

    /* renamed from: x */
    public static final int f103486x = -1937827168;

    /* renamed from: y */
    public static final int f103487y = -1439978388;

    /* renamed from: z */
    public static final int f103488z = 137365935;

    /* renamed from: d */
    public boolean f103489d = true;

    /* renamed from: e */
    public boolean f103490e = true;

    /* renamed from: f */
    public boolean f103491f = true;
    public String field_businessHour;
    public String field_categoryTips;
    public String field_fromType;
    public float field_latitude;
    public float field_longitude;
    public String field_noticeWording;
    public String field_phoneNumber;
    public String field_poiId;
    public String field_priceTips;

    /* renamed from: g */
    public boolean f103492g = true;

    /* renamed from: h */
    public boolean f103493h = true;

    /* renamed from: i */
    public boolean f103494i = true;

    /* renamed from: j */
    public boolean f103495j = true;

    /* renamed from: n */
    public boolean f103496n = true;

    /* renamed from: o */
    public boolean f103497o = true;

    static {
        SingleTable singleTable = new SingleTable("FinderMapPoiInfo");
        f103478p = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        f103479q = new Column("poiId", "string", singleTable.getName(), "");
        new Column("categoryTips", "string", singleTable.getName(), "");
        new Column("businessHour", "string", singleTable.getName(), "");
        new Column("phoneNumber", "string", singleTable.getName(), "");
        new Column("priceTips", "string", singleTable.getName(), "");
        new Column("noticeWording", "string", singleTable.getName(), "");
        new Column("latitude", "float", singleTable.getName(), "");
        new Column("longitude", "float", singleTable.getName(), "");
        new Column("fromType", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[9];
        String[] strArr = new String[10];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "poiId";
        mAutoDBInfo.colsMap.put("poiId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "poiId";
        mAutoDBInfo.columns[1] = "categoryTips";
        mAutoDBInfo.colsMap.put("categoryTips", "TEXT");
        mAutoDBInfo.columns[2] = "businessHour";
        mAutoDBInfo.colsMap.put("businessHour", "TEXT");
        mAutoDBInfo.columns[3] = "phoneNumber";
        mAutoDBInfo.colsMap.put("phoneNumber", "TEXT");
        mAutoDBInfo.columns[4] = "priceTips";
        mAutoDBInfo.colsMap.put("priceTips", "TEXT");
        mAutoDBInfo.columns[5] = "noticeWording";
        mAutoDBInfo.colsMap.put("noticeWording", "TEXT");
        mAutoDBInfo.columns[6] = "latitude";
        mAutoDBInfo.colsMap.put("latitude", "FLOAT");
        mAutoDBInfo.columns[7] = "longitude";
        mAutoDBInfo.colsMap.put("longitude", "FLOAT");
        mAutoDBInfo.columns[8] = "fromType";
        mAutoDBInfo.colsMap.put("fromType", "TEXT");
        mAutoDBInfo.columns[9] = "rowid";
        mAutoDBInfo.sql = " poiId TEXT PRIMARY KEY ,  categoryTips TEXT,  businessHour TEXT,  phoneNumber TEXT,  priceTips TEXT,  noticeWording TEXT,  latitude FLOAT,  longitude FLOAT,  fromType TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38649r3)) {
            return false;
        }
        C38649r3 r3Var = (C38649r3) iAutoDBItem;
        return C46238a.m51546a(this.field_poiId, r3Var.field_poiId) && C46238a.m51546a(this.field_categoryTips, r3Var.field_categoryTips) && C46238a.m51546a(this.field_businessHour, r3Var.field_businessHour) && C46238a.m51546a(this.field_phoneNumber, r3Var.field_phoneNumber) && C46238a.m51546a(this.field_priceTips, r3Var.field_priceTips) && C46238a.m51546a(this.field_noticeWording, r3Var.field_noticeWording) && C46238a.m51546a(Float.valueOf(this.field_latitude), Float.valueOf(r3Var.field_latitude)) && C46238a.m51546a(Float.valueOf(this.field_longitude), Float.valueOf(r3Var.field_longitude)) && C46238a.m51546a(this.field_fromType, r3Var.field_fromType);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103481s == hashCode) {
                    try {
                        this.field_poiId = cursor.getString(i);
                        this.f103489d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMapPoiInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103482t == hashCode) {
                    try {
                        this.field_categoryTips = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMapPoiInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103483u == hashCode) {
                    try {
                        this.field_businessHour = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMapPoiInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103484v == hashCode) {
                    try {
                        this.field_phoneNumber = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMapPoiInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103485w == hashCode) {
                    try {
                        this.field_priceTips = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMapPoiInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103486x == hashCode) {
                    try {
                        this.field_noticeWording = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMapPoiInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103487y == hashCode) {
                    try {
                        this.field_latitude = cursor.getFloat(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMapPoiInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103488z == hashCode) {
                    try {
                        this.field_longitude = cursor.getFloat(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMapPoiInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103474A == hashCode) {
                    try {
                        this.field_fromType = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderMapPoiInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103475B == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103489d) {
            contentValues.put("poiId", this.field_poiId);
        }
        if (this.f103490e) {
            contentValues.put("categoryTips", this.field_categoryTips);
        }
        if (this.f103491f) {
            contentValues.put("businessHour", this.field_businessHour);
        }
        if (this.f103492g) {
            contentValues.put("phoneNumber", this.field_phoneNumber);
        }
        if (this.f103493h) {
            contentValues.put("priceTips", this.field_priceTips);
        }
        if (this.f103494i) {
            contentValues.put("noticeWording", this.field_noticeWording);
        }
        if (this.f103495j) {
            contentValues.put("latitude", Float.valueOf(this.field_latitude));
        }
        if (this.f103496n) {
            contentValues.put("longitude", Float.valueOf(this.field_longitude));
        }
        if (this.f103497o) {
            contentValues.put("fromType", this.field_fromType);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderMapPoiInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderMapPoiInfo ( " + f103476C.sql + ");");
        for (String add : f103480r) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderMapPoiInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderMapPoiInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103476C, "FinderMapPoiInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderMapPoiInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderMapPoiInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderMapPoiInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103476C;
    }

    public String[] getIndexCreateSQL() {
        return f103480r;
    }

    public StorageObserverOwner<C38649r3> getObserverOwner() {
        return f103477D;
    }

    public Object getPrimaryKeyValue() {
        return this.field_poiId;
    }

    public SingleTable getTable() {
        return f103478p;
    }

    public String getTableName() {
        return f103478p.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("poiId")) {
            this.field_poiId = contentValues.getAsString("poiId");
            if (z) {
                this.f103489d = true;
            }
        }
        if (contentValues.containsKey("categoryTips")) {
            this.field_categoryTips = contentValues.getAsString("categoryTips");
            if (z) {
                this.f103490e = true;
            }
        }
        if (contentValues.containsKey("businessHour")) {
            this.field_businessHour = contentValues.getAsString("businessHour");
            if (z) {
                this.f103491f = true;
            }
        }
        if (contentValues.containsKey("phoneNumber")) {
            this.field_phoneNumber = contentValues.getAsString("phoneNumber");
            if (z) {
                this.f103492g = true;
            }
        }
        if (contentValues.containsKey("priceTips")) {
            this.field_priceTips = contentValues.getAsString("priceTips");
            if (z) {
                this.f103493h = true;
            }
        }
        if (contentValues.containsKey("noticeWording")) {
            this.field_noticeWording = contentValues.getAsString("noticeWording");
            if (z) {
                this.f103494i = true;
            }
        }
        if (contentValues.containsKey("latitude")) {
            this.field_latitude = contentValues.getAsFloat("latitude").floatValue();
            if (z) {
                this.f103495j = true;
            }
        }
        if (contentValues.containsKey("longitude")) {
            this.field_longitude = contentValues.getAsFloat("longitude").floatValue();
            if (z) {
                this.f103496n = true;
            }
        }
        if (contentValues.containsKey("fromType")) {
            this.field_fromType = contentValues.getAsString("fromType");
            if (z) {
                this.f103497o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
