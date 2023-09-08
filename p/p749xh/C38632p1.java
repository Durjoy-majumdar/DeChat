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

/* renamed from: xh.p1 */
public class C38632p1 extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f103296h;

    /* renamed from: i */
    public static final String[] f103297i = {"CREATE INDEX IF NOT EXISTS CropCenterLabelInfo_Room_Id ON CropCenterLabelInfo(chat_room_id)"};

    /* renamed from: j */
    public static final int f103298j = 339796248;

    /* renamed from: n */
    public static final int f103299n = -1959256506;

    /* renamed from: o */
    public static final int f103300o = 134444440;

    /* renamed from: p */
    public static final int f103301p = 885450562;

    /* renamed from: q */
    public static final int f103302q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f103303r = initAutoDBInfo(C38632p1.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38632p1> f103304s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103305d = true;

    /* renamed from: e */
    public boolean f103306e = true;

    /* renamed from: f */
    public boolean f103307f = true;
    public String field_chat_room_id;
    public String field_crop_image_path;
    public String field_label_id;
    public String field_origin_image_path;

    /* renamed from: g */
    public boolean f103308g = true;

    static {
        SingleTable singleTable = new SingleTable("CropCenterLabelInfo");
        f103296h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("chat_room_id", "string", singleTable.getName(), "");
        new Column("label_id", "string", singleTable.getName(), "");
        new Column("crop_image_path", "string", singleTable.getName(), "");
        new Column("origin_image_path", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "chat_room_id";
        mAutoDBInfo.colsMap.put("chat_room_id", "TEXT");
        mAutoDBInfo.columns[1] = "label_id";
        mAutoDBInfo.colsMap.put("label_id", "TEXT");
        mAutoDBInfo.columns[2] = "crop_image_path";
        mAutoDBInfo.colsMap.put("crop_image_path", "TEXT");
        mAutoDBInfo.columns[3] = "origin_image_path";
        mAutoDBInfo.colsMap.put("origin_image_path", "TEXT");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " chat_room_id TEXT,  label_id TEXT,  crop_image_path TEXT,  origin_image_path TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38632p1)) {
            return false;
        }
        C38632p1 p1Var = (C38632p1) iAutoDBItem;
        return C46238a.m51546a(this.field_chat_room_id, p1Var.field_chat_room_id) && C46238a.m51546a(this.field_label_id, p1Var.field_label_id) && C46238a.m51546a(this.field_crop_image_path, p1Var.field_crop_image_path) && C46238a.m51546a(this.field_origin_image_path, p1Var.field_origin_image_path);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103298j == hashCode) {
                    try {
                        this.field_chat_room_id = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCropCenterLabelInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103299n == hashCode) {
                    try {
                        this.field_label_id = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCropCenterLabelInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103300o == hashCode) {
                    try {
                        this.field_crop_image_path = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCropCenterLabelInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103301p == hashCode) {
                    try {
                        this.field_origin_image_path = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCropCenterLabelInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103302q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103305d) {
            contentValues.put("chat_room_id", this.field_chat_room_id);
        }
        if (this.f103306e) {
            contentValues.put("label_id", this.field_label_id);
        }
        if (this.f103307f) {
            contentValues.put("crop_image_path", this.field_crop_image_path);
        }
        if (this.f103308g) {
            contentValues.put("origin_image_path", this.field_origin_image_path);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseCropCenterLabelInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS CropCenterLabelInfo ( " + f103303r.sql + ");");
        for (String add : f103297i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseCropCenterLabelInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("CropCenterLabelInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103303r, "CropCenterLabelInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseCropCenterLabelInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("CropCenterLabelInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseCropCenterLabelInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103303r;
    }

    public String[] getIndexCreateSQL() {
        return f103297i;
    }

    public StorageObserverOwner<C38632p1> getObserverOwner() {
        return f103304s;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103296h;
    }

    public String getTableName() {
        return f103296h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("chat_room_id")) {
            this.field_chat_room_id = contentValues.getAsString("chat_room_id");
            if (z) {
                this.f103305d = true;
            }
        }
        if (contentValues.containsKey("label_id")) {
            this.field_label_id = contentValues.getAsString("label_id");
            if (z) {
                this.f103306e = true;
            }
        }
        if (contentValues.containsKey("crop_image_path")) {
            this.field_crop_image_path = contentValues.getAsString("crop_image_path");
            if (z) {
                this.f103307f = true;
            }
        }
        if (contentValues.containsKey("origin_image_path")) {
            this.field_origin_image_path = contentValues.getAsString("origin_image_path");
            if (z) {
                this.f103308g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
