package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.measurement.AppMeasurement;
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

/* renamed from: xh.j1 */
public class C66267j1 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f190591A = -327408711;

    /* renamed from: B */
    public static final int f190592B = 108705909;

    /* renamed from: C */
    public static final IAutoDBItem.MAutoDBInfo f190593C = initAutoDBInfo(C66267j1.class);

    /* renamed from: D */
    public static final StorageObserverOwner<C66267j1> f190594D = new StorageObserverOwner<>();

    /* renamed from: p */
    public static final SingleTable f190595p;

    /* renamed from: q */
    public static final Column f190596q;

    /* renamed from: r */
    public static final String[] f190597r = {"CREATE INDEX IF NOT EXISTS ClsLabelInfo_Room_Id ON ClsLabelInfo(chat_room_id)", "CREATE INDEX IF NOT EXISTS ClsLabelInfo_Is_Rec ON ClsLabelInfo(is_recognize)"};

    /* renamed from: s */
    public static final int f190598s = 339796248;

    /* renamed from: t */
    public static final int f190599t = -1065021799;

    /* renamed from: u */
    public static final int f190600u = -1959256506;

    /* renamed from: v */
    public static final int f190601v = -1448118507;

    /* renamed from: w */
    public static final int f190602w = -296568226;

    /* renamed from: x */
    public static final int f190603x = 55126294;

    /* renamed from: y */
    public static final int f190604y = -780359764;

    /* renamed from: z */
    public static final int f190605z = 885450562;

    /* renamed from: d */
    public boolean f190606d = true;

    /* renamed from: e */
    public boolean f190607e = true;

    /* renamed from: f */
    public boolean f190608f = true;
    public String field_chat_room_id;
    public String field_crop_label_id;
    public String field_hd_image_path;
    public String field_is_recognize;
    public String field_label_id;
    public long field_msg_id;
    public String field_ocr_result;
    public String field_origin_image_path;
    public long field_timestamp;

    /* renamed from: g */
    public boolean f190609g = true;

    /* renamed from: h */
    public boolean f190610h = true;

    /* renamed from: i */
    public boolean f190611i = true;

    /* renamed from: j */
    public boolean f190612j = true;

    /* renamed from: n */
    public boolean f190613n = true;

    /* renamed from: o */
    public boolean f190614o = true;

    static {
        SingleTable singleTable = new SingleTable("ClsLabelInfo");
        f190595p = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("chat_room_id", "string", singleTable.getName(), "");
        new Column("msg_id", "long", singleTable.getName(), "");
        new Column("label_id", "string", singleTable.getName(), "");
        new Column("crop_label_id", "string", singleTable.getName(), "");
        new Column("ocr_result", "string", singleTable.getName(), "");
        f190596q = new Column(AppMeasurement.Param.TIMESTAMP, "long", singleTable.getName(), "");
        new Column("hd_image_path", "string", singleTable.getName(), "");
        new Column("origin_image_path", "string", singleTable.getName(), "");
        new Column("is_recognize", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[9];
        String[] strArr = new String[10];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "chat_room_id";
        mAutoDBInfo.colsMap.put("chat_room_id", "TEXT");
        mAutoDBInfo.columns[1] = "msg_id";
        mAutoDBInfo.colsMap.put("msg_id", "LONG");
        mAutoDBInfo.columns[2] = "label_id";
        mAutoDBInfo.colsMap.put("label_id", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "crop_label_id";
        mAutoDBInfo.colsMap.put("crop_label_id", "TEXT default '' ");
        mAutoDBInfo.columns[4] = "ocr_result";
        mAutoDBInfo.colsMap.put("ocr_result", "TEXT default '' ");
        mAutoDBInfo.columns[5] = AppMeasurement.Param.TIMESTAMP;
        mAutoDBInfo.colsMap.put(AppMeasurement.Param.TIMESTAMP, "LONG");
        mAutoDBInfo.columns[6] = "hd_image_path";
        mAutoDBInfo.colsMap.put("hd_image_path", "TEXT");
        mAutoDBInfo.columns[7] = "origin_image_path";
        mAutoDBInfo.colsMap.put("origin_image_path", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "origin_image_path";
        mAutoDBInfo.columns[8] = "is_recognize";
        mAutoDBInfo.colsMap.put("is_recognize", "TEXT");
        mAutoDBInfo.columns[9] = "rowid";
        mAutoDBInfo.sql = " chat_room_id TEXT,  msg_id LONG,  label_id TEXT default '' ,  crop_label_id TEXT default '' ,  ocr_result TEXT default '' ,  timestamp LONG,  hd_image_path TEXT,  origin_image_path TEXT default ''  PRIMARY KEY ,  is_recognize TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C66267j1)) {
            return false;
        }
        C66267j1 j1Var = (C66267j1) iAutoDBItem;
        return C46238a.m51546a(this.field_chat_room_id, j1Var.field_chat_room_id) && C46238a.m51546a(Long.valueOf(this.field_msg_id), Long.valueOf(j1Var.field_msg_id)) && C46238a.m51546a(this.field_label_id, j1Var.field_label_id) && C46238a.m51546a(this.field_crop_label_id, j1Var.field_crop_label_id) && C46238a.m51546a(this.field_ocr_result, j1Var.field_ocr_result) && C46238a.m51546a(Long.valueOf(this.field_timestamp), Long.valueOf(j1Var.field_timestamp)) && C46238a.m51546a(this.field_hd_image_path, j1Var.field_hd_image_path) && C46238a.m51546a(this.field_origin_image_path, j1Var.field_origin_image_path) && C46238a.m51546a(this.field_is_recognize, j1Var.field_is_recognize);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f190598s == hashCode) {
                    try {
                        this.field_chat_room_id = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseClsLabelInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190599t == hashCode) {
                    try {
                        this.field_msg_id = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseClsLabelInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190600u == hashCode) {
                    try {
                        this.field_label_id = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseClsLabelInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190601v == hashCode) {
                    try {
                        this.field_crop_label_id = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseClsLabelInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190602w == hashCode) {
                    try {
                        this.field_ocr_result = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseClsLabelInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190603x == hashCode) {
                    try {
                        this.field_timestamp = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseClsLabelInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190604y == hashCode) {
                    try {
                        this.field_hd_image_path = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseClsLabelInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190605z == hashCode) {
                    try {
                        this.field_origin_image_path = cursor.getString(i);
                        this.f190613n = true;
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseClsLabelInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190591A == hashCode) {
                    try {
                        this.field_is_recognize = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseClsLabelInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f190592B == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f190606d) {
            contentValues.put("chat_room_id", this.field_chat_room_id);
        }
        if (this.f190607e) {
            contentValues.put("msg_id", Long.valueOf(this.field_msg_id));
        }
        if (this.field_label_id == null) {
            this.field_label_id = "";
        }
        if (this.f190608f) {
            contentValues.put("label_id", this.field_label_id);
        }
        if (this.field_crop_label_id == null) {
            this.field_crop_label_id = "";
        }
        if (this.f190609g) {
            contentValues.put("crop_label_id", this.field_crop_label_id);
        }
        if (this.field_ocr_result == null) {
            this.field_ocr_result = "";
        }
        if (this.f190610h) {
            contentValues.put("ocr_result", this.field_ocr_result);
        }
        if (this.f190611i) {
            contentValues.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(this.field_timestamp));
        }
        if (this.f190612j) {
            contentValues.put("hd_image_path", this.field_hd_image_path);
        }
        if (this.field_origin_image_path == null) {
            this.field_origin_image_path = "";
        }
        if (this.f190613n) {
            contentValues.put("origin_image_path", this.field_origin_image_path);
        }
        if (this.f190614o) {
            contentValues.put("is_recognize", this.field_is_recognize);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseClsLabelInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ClsLabelInfo ( " + f190593C.sql + ");");
        for (String add : f190597r) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseClsLabelInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ClsLabelInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f190593C, "ClsLabelInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseClsLabelInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ClsLabelInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseClsLabelInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f190593C;
    }

    public String[] getIndexCreateSQL() {
        return f190597r;
    }

    public StorageObserverOwner<C66267j1> getObserverOwner() {
        return f190594D;
    }

    public Object getPrimaryKeyValue() {
        return this.field_origin_image_path;
    }

    public SingleTable getTable() {
        return f190595p;
    }

    public String getTableName() {
        return f190595p.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("chat_room_id")) {
            this.field_chat_room_id = contentValues.getAsString("chat_room_id");
            if (z) {
                this.f190606d = true;
            }
        }
        if (contentValues.containsKey("msg_id")) {
            this.field_msg_id = contentValues.getAsLong("msg_id").longValue();
            if (z) {
                this.f190607e = true;
            }
        }
        if (contentValues.containsKey("label_id")) {
            this.field_label_id = contentValues.getAsString("label_id");
            if (z) {
                this.f190608f = true;
            }
        }
        if (contentValues.containsKey("crop_label_id")) {
            this.field_crop_label_id = contentValues.getAsString("crop_label_id");
            if (z) {
                this.f190609g = true;
            }
        }
        if (contentValues.containsKey("ocr_result")) {
            this.field_ocr_result = contentValues.getAsString("ocr_result");
            if (z) {
                this.f190610h = true;
            }
        }
        if (contentValues.containsKey(AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(AppMeasurement.Param.TIMESTAMP).longValue();
            if (z) {
                this.f190611i = true;
            }
        }
        if (contentValues.containsKey("hd_image_path")) {
            this.field_hd_image_path = contentValues.getAsString("hd_image_path");
            if (z) {
                this.f190612j = true;
            }
        }
        if (contentValues.containsKey("origin_image_path")) {
            this.field_origin_image_path = contentValues.getAsString("origin_image_path");
            if (z) {
                this.f190613n = true;
            }
        }
        if (contentValues.containsKey("is_recognize")) {
            this.field_is_recognize = contentValues.getAsString("is_recognize");
            if (z) {
                this.f190614o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
