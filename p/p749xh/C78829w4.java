package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
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

/* renamed from: xh.w4 */
public class C78829w4 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f231510A = -265713450;

    /* renamed from: B */
    public static final int f231511B = 3433509;

    /* renamed from: C */
    public static final int f231512C = 1370166729;

    /* renamed from: D */
    public static final int f231513D = -294977770;

    /* renamed from: E */
    public static final int f231514E = -1581068385;

    /* renamed from: F */
    public static final int f231515F = 110371416;

    /* renamed from: G */
    public static final int f231516G = 1028554796;

    /* renamed from: H */
    public static final int f231517H = 2118164011;

    /* renamed from: I */
    public static final int f231518I = 835260333;

    /* renamed from: J */
    public static final int f231519J = -1037359300;

    /* renamed from: K */
    public static final int f231520K = 109757585;

    /* renamed from: L */
    public static final int f231521L = -282060574;

    /* renamed from: M */
    public static final int f231522M = -743778816;

    /* renamed from: N */
    public static final int f231523N = -1582221558;

    /* renamed from: P */
    public static final int f231524P = 108705909;

    /* renamed from: Q */
    public static final IAutoDBItem.MAutoDBInfo f231525Q = initAutoDBInfo(C78829w4.class);

    /* renamed from: R */
    public static final StorageObserverOwner<C78829w4> f231526R = new StorageObserverOwner<>();

    /* renamed from: w */
    public static final SingleTable f231527w;

    /* renamed from: x */
    public static final String[] f231528x = new String[0];

    /* renamed from: y */
    public static final int f231529y = -868385823;

    /* renamed from: z */
    public static final int f231530z = -172550682;

    /* renamed from: d */
    public boolean f231531d = true;

    /* renamed from: e */
    public boolean f231532e = true;

    /* renamed from: f */
    public boolean f231533f = true;
    public long field_createtime;
    public String field_creator;
    public String field_custominfo;
    public String field_manager;
    public int field_netSceneState;
    public int field_nreply;
    public String field_path;
    public String field_related_msgids;
    public String field_roomname;
    public String field_shareKey;
    public String field_shareName;
    public int field_state;
    public String field_title;
    public String field_todoid;
    public long field_updatetime;
    public String field_username;

    /* renamed from: g */
    public boolean f231534g = true;

    /* renamed from: h */
    public boolean f231535h = true;

    /* renamed from: i */
    public boolean f231536i = true;

    /* renamed from: j */
    public boolean f231537j = true;

    /* renamed from: n */
    public boolean f231538n = true;

    /* renamed from: o */
    public boolean f231539o = true;

    /* renamed from: p */
    public boolean f231540p = true;

    /* renamed from: q */
    public boolean f231541q = true;

    /* renamed from: r */
    public boolean f231542r = true;

    /* renamed from: s */
    public boolean f231543s = true;

    /* renamed from: t */
    public boolean f231544t = true;

    /* renamed from: u */
    public boolean f231545u = true;

    /* renamed from: v */
    public boolean f231546v = true;

    static {
        SingleTable singleTable = new SingleTable("GroupTodo");
        f231527w = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("todoid", "string", singleTable.getName(), "");
        new Column("roomname", "string", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("path", "string", singleTable.getName(), "");
        new Column("createtime", "long", singleTable.getName(), "");
        new Column("updatetime", "long", singleTable.getName(), "");
        new Column("custominfo", "string", singleTable.getName(), "");
        new Column(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "string", singleTable.getName(), "");
        new Column("creator", "string", singleTable.getName(), "");
        new Column("related_msgids", "string", singleTable.getName(), "");
        new Column("manager", "string", singleTable.getName(), "");
        new Column("nreply", "int", singleTable.getName(), "");
        new Column("state", "int", singleTable.getName(), "");
        new Column("netSceneState", "int", singleTable.getName(), "");
        new Column("shareKey", "string", singleTable.getName(), "");
        new Column("shareName", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[16];
        String[] strArr = new String[17];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "todoid";
        mAutoDBInfo.colsMap.put("todoid", "TEXT");
        mAutoDBInfo.columns[1] = "roomname";
        mAutoDBInfo.colsMap.put("roomname", "TEXT");
        mAutoDBInfo.columns[2] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[3] = "path";
        mAutoDBInfo.colsMap.put("path", "TEXT");
        mAutoDBInfo.columns[4] = "createtime";
        mAutoDBInfo.colsMap.put("createtime", "LONG");
        mAutoDBInfo.columns[5] = "updatetime";
        mAutoDBInfo.colsMap.put("updatetime", "LONG");
        mAutoDBInfo.columns[6] = "custominfo";
        mAutoDBInfo.colsMap.put("custominfo", "TEXT default '' ");
        mAutoDBInfo.columns[7] = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        mAutoDBInfo.colsMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT default '' ");
        mAutoDBInfo.columns[8] = "creator";
        mAutoDBInfo.colsMap.put("creator", "TEXT");
        mAutoDBInfo.columns[9] = "related_msgids";
        mAutoDBInfo.colsMap.put("related_msgids", "TEXT");
        mAutoDBInfo.columns[10] = "manager";
        mAutoDBInfo.colsMap.put("manager", "TEXT");
        mAutoDBInfo.columns[11] = "nreply";
        mAutoDBInfo.colsMap.put("nreply", "INTEGER");
        mAutoDBInfo.columns[12] = "state";
        mAutoDBInfo.colsMap.put("state", "INTEGER");
        mAutoDBInfo.columns[13] = "netSceneState";
        mAutoDBInfo.colsMap.put("netSceneState", "INTEGER");
        mAutoDBInfo.columns[14] = "shareKey";
        mAutoDBInfo.colsMap.put("shareKey", "TEXT");
        mAutoDBInfo.columns[15] = "shareName";
        mAutoDBInfo.colsMap.put("shareName", "TEXT");
        mAutoDBInfo.columns[16] = "rowid";
        mAutoDBInfo.sql = " todoid TEXT,  roomname TEXT,  username TEXT,  path TEXT,  createtime LONG,  updatetime LONG,  custominfo TEXT default '' ,  title TEXT default '' ,  creator TEXT,  related_msgids TEXT,  manager TEXT,  nreply INTEGER,  state INTEGER,  netSceneState INTEGER,  shareKey TEXT,  shareName TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78829w4)) {
            return false;
        }
        C78829w4 w4Var = (C78829w4) iAutoDBItem;
        return C46238a.m51546a(this.field_todoid, w4Var.field_todoid) && C46238a.m51546a(this.field_roomname, w4Var.field_roomname) && C46238a.m51546a(this.field_username, w4Var.field_username) && C46238a.m51546a(this.field_path, w4Var.field_path) && C46238a.m51546a(Long.valueOf(this.field_createtime), Long.valueOf(w4Var.field_createtime)) && C46238a.m51546a(Long.valueOf(this.field_updatetime), Long.valueOf(w4Var.field_updatetime)) && C46238a.m51546a(this.field_custominfo, w4Var.field_custominfo) && C46238a.m51546a(this.field_title, w4Var.field_title) && C46238a.m51546a(this.field_creator, w4Var.field_creator) && C46238a.m51546a(this.field_related_msgids, w4Var.field_related_msgids) && C46238a.m51546a(this.field_manager, w4Var.field_manager) && C46238a.m51546a(Integer.valueOf(this.field_nreply), Integer.valueOf(w4Var.field_nreply)) && C46238a.m51546a(Integer.valueOf(this.field_state), Integer.valueOf(w4Var.field_state)) && C46238a.m51546a(Integer.valueOf(this.field_netSceneState), Integer.valueOf(w4Var.field_netSceneState)) && C46238a.m51546a(this.field_shareKey, w4Var.field_shareKey) && C46238a.m51546a(this.field_shareName, w4Var.field_shareName);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f231529y == hashCode) {
                    try {
                        this.field_todoid = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231530z == hashCode) {
                    try {
                        this.field_roomname = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231510A == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231511B == hashCode) {
                    try {
                        this.field_path = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231512C == hashCode) {
                    try {
                        this.field_createtime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231513D == hashCode) {
                    try {
                        this.field_updatetime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231514E == hashCode) {
                    try {
                        this.field_custominfo = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231515F == hashCode) {
                    try {
                        this.field_title = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231516G == hashCode) {
                    try {
                        this.field_creator = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231517H == hashCode) {
                    try {
                        this.field_related_msgids = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231518I == hashCode) {
                    try {
                        this.field_manager = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231519J == hashCode) {
                    try {
                        this.field_nreply = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231520K == hashCode) {
                    try {
                        this.field_state = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231521L == hashCode) {
                    try {
                        this.field_netSceneState = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231522M == hashCode) {
                    try {
                        this.field_shareKey = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231523N == hashCode) {
                    try {
                        this.field_shareName = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231524P == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f231531d) {
            contentValues.put("todoid", this.field_todoid);
        }
        if (this.f231532e) {
            contentValues.put("roomname", this.field_roomname);
        }
        if (this.f231533f) {
            contentValues.put("username", this.field_username);
        }
        if (this.f231534g) {
            contentValues.put("path", this.field_path);
        }
        if (this.f231535h) {
            contentValues.put("createtime", Long.valueOf(this.field_createtime));
        }
        if (this.f231536i) {
            contentValues.put("updatetime", Long.valueOf(this.field_updatetime));
        }
        if (this.field_custominfo == null) {
            this.field_custominfo = "";
        }
        if (this.f231537j) {
            contentValues.put("custominfo", this.field_custominfo);
        }
        if (this.field_title == null) {
            this.field_title = "";
        }
        if (this.f231538n) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f231539o) {
            contentValues.put("creator", this.field_creator);
        }
        if (this.f231540p) {
            contentValues.put("related_msgids", this.field_related_msgids);
        }
        if (this.f231541q) {
            contentValues.put("manager", this.field_manager);
        }
        if (this.f231542r) {
            contentValues.put("nreply", Integer.valueOf(this.field_nreply));
        }
        if (this.f231543s) {
            contentValues.put("state", Integer.valueOf(this.field_state));
        }
        if (this.f231544t) {
            contentValues.put("netSceneState", Integer.valueOf(this.field_netSceneState));
        }
        if (this.f231545u) {
            contentValues.put("shareKey", this.field_shareKey);
        }
        if (this.f231546v) {
            contentValues.put("shareName", this.field_shareName);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseGroupTodo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS GroupTodo ( " + f231525Q.sql + ");");
        for (String add : f231528x) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseGroupTodo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("GroupTodo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f231525Q, "GroupTodo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseGroupTodo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("GroupTodo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseGroupTodo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f231525Q;
    }

    public String[] getIndexCreateSQL() {
        return f231528x;
    }

    public StorageObserverOwner<C78829w4> getObserverOwner() {
        return f231526R;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f231527w;
    }

    public String getTableName() {
        return f231527w.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("todoid")) {
            this.field_todoid = contentValues.getAsString("todoid");
            if (z) {
                this.f231531d = true;
            }
        }
        if (contentValues.containsKey("roomname")) {
            this.field_roomname = contentValues.getAsString("roomname");
            if (z) {
                this.f231532e = true;
            }
        }
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f231533f = true;
            }
        }
        if (contentValues.containsKey("path")) {
            this.field_path = contentValues.getAsString("path");
            if (z) {
                this.f231534g = true;
            }
        }
        if (contentValues.containsKey("createtime")) {
            this.field_createtime = contentValues.getAsLong("createtime").longValue();
            if (z) {
                this.f231535h = true;
            }
        }
        if (contentValues.containsKey("updatetime")) {
            this.field_updatetime = contentValues.getAsLong("updatetime").longValue();
            if (z) {
                this.f231536i = true;
            }
        }
        if (contentValues.containsKey("custominfo")) {
            this.field_custominfo = contentValues.getAsString("custominfo");
            if (z) {
                this.f231537j = true;
            }
        }
        if (contentValues.containsKey(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z) {
                this.f231538n = true;
            }
        }
        if (contentValues.containsKey("creator")) {
            this.field_creator = contentValues.getAsString("creator");
            if (z) {
                this.f231539o = true;
            }
        }
        if (contentValues.containsKey("related_msgids")) {
            this.field_related_msgids = contentValues.getAsString("related_msgids");
            if (z) {
                this.f231540p = true;
            }
        }
        if (contentValues.containsKey("manager")) {
            this.field_manager = contentValues.getAsString("manager");
            if (z) {
                this.f231541q = true;
            }
        }
        if (contentValues.containsKey("nreply")) {
            this.field_nreply = contentValues.getAsInteger("nreply").intValue();
            if (z) {
                this.f231542r = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z) {
                this.f231543s = true;
            }
        }
        if (contentValues.containsKey("netSceneState")) {
            this.field_netSceneState = contentValues.getAsInteger("netSceneState").intValue();
            if (z) {
                this.f231544t = true;
            }
        }
        if (contentValues.containsKey("shareKey")) {
            this.field_shareKey = contentValues.getAsString("shareKey");
            if (z) {
                this.f231545u = true;
            }
        }
        if (contentValues.containsKey("shareName")) {
            this.field_shareName = contentValues.getAsString("shareName");
            if (z) {
                this.f231546v = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
