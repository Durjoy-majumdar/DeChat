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

/* renamed from: xh.y5 */
public class C78831y5 extends IAutoDBItem {

    /* renamed from: A */
    public static final SingleTable f231568A;

    /* renamed from: B */
    public static final String[] f231569B = {"CREATE INDEX IF NOT EXISTS LocalRedPacketStoryInfoPacketIdIndex ON LocalRedPacketStoryInfo(packet_id)"};

    /* renamed from: C */
    public static final int f231570C = 110371416;

    /* renamed from: D */
    public static final int f231571D = 2027875547;

    /* renamed from: E */
    public static final int f231572E = 2027867370;

    /* renamed from: F */
    public static final int f231573F = -1724546052;

    /* renamed from: G */
    public static final int f231574G = -1272136192;

    /* renamed from: H */
    public static final int f231575H = 1583758243;

    /* renamed from: I */
    public static final int f231576I = 1852205030;

    /* renamed from: J */
    public static final int f231577J = 1843611805;

    /* renamed from: K */
    public static final int f231578K = -2114951115;

    /* renamed from: L */
    public static final int f231579L = 1806137394;

    /* renamed from: M */
    public static final int f231580M = -573446013;

    /* renamed from: N */
    public static final int f231581N = 295606784;

    /* renamed from: P */
    public static final int f231582P = -1534620461;

    /* renamed from: Q */
    public static final int f231583Q = -2067848235;

    /* renamed from: R */
    public static final int f231584R = -673617299;

    /* renamed from: S */
    public static final int f231585S = 1746815759;

    /* renamed from: T */
    public static final int f231586T = -318659967;

    /* renamed from: U */
    public static final int f231587U = -1647381305;

    /* renamed from: V */
    public static final int f231588V = 485096696;

    /* renamed from: W */
    public static final int f231589W = 138923273;

    /* renamed from: X */
    public static final int f231590X = 108705909;

    /* renamed from: Y */
    public static final IAutoDBItem.MAutoDBInfo f231591Y = initAutoDBInfo(C78831y5.class);

    /* renamed from: Z */
    public static final StorageObserverOwner<C78831y5> f231592Z = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f231593d = true;

    /* renamed from: e */
    public boolean f231594e = true;

    /* renamed from: f */
    public boolean f231595f = true;
    public String field_action_app_nickname;
    public String field_action_app_username;
    public String field_action_before_jump_text;
    public String field_action_dark_icon_url;
    public int field_action_emotion_designer_uin;
    public String field_action_jump_text;
    public String field_action_normal_icon_url;
    public int field_action_type;
    public String field_action_url;
    public String field_corp_name;
    public String field_description;
    public String field_detail_dynamic_url;
    public String field_joint_label_text;
    public String field_logo_md5;
    public String field_logo_url;
    public String field_packet_id;
    public String field_same_receive_link;
    public int field_subtype_id;
    public String field_title;
    public long field_update_time;

    /* renamed from: g */
    public boolean f231596g = true;

    /* renamed from: h */
    public boolean f231597h = true;

    /* renamed from: i */
    public boolean f231598i = true;

    /* renamed from: j */
    public boolean f231599j = true;

    /* renamed from: n */
    public boolean f231600n = true;

    /* renamed from: o */
    public boolean f231601o = true;

    /* renamed from: p */
    public boolean f231602p = true;

    /* renamed from: q */
    public boolean f231603q = true;

    /* renamed from: r */
    public boolean f231604r = true;

    /* renamed from: s */
    public boolean f231605s = true;

    /* renamed from: t */
    public boolean f231606t = true;

    /* renamed from: u */
    public boolean f231607u = true;

    /* renamed from: v */
    public boolean f231608v = true;

    /* renamed from: w */
    public boolean f231609w = true;

    /* renamed from: x */
    public boolean f231610x = true;

    /* renamed from: y */
    public boolean f231611y = true;

    /* renamed from: z */
    public boolean f231612z = true;

    static {
        SingleTable singleTable = new SingleTable("LocalRedPacketStoryInfo");
        f231568A = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "string", singleTable.getName(), "");
        new Column("logo_url", "string", singleTable.getName(), "");
        new Column("logo_md5", "string", singleTable.getName(), "");
        new Column("description", "string", singleTable.getName(), "");
        new Column("corp_name", "string", singleTable.getName(), "");
        new Column("action_type", "int", singleTable.getName(), "");
        new Column("action_url", "string", singleTable.getName(), "");
        new Column("action_app_username", "string", singleTable.getName(), "");
        new Column("action_app_nickname", "string", singleTable.getName(), "");
        new Column("packet_id", "string", singleTable.getName(), "");
        new Column("update_time", "long", singleTable.getName(), "");
        new Column("subtype_id", "int", singleTable.getName(), "");
        new Column("action_emotion_designer_uin", "int", singleTable.getName(), "");
        new Column("action_jump_text", "string", singleTable.getName(), "");
        new Column("joint_label_text", "string", singleTable.getName(), "");
        new Column("same_receive_link", "string", singleTable.getName(), "");
        new Column("detail_dynamic_url", "string", singleTable.getName(), "");
        new Column("action_before_jump_text", "string", singleTable.getName(), "");
        new Column("action_normal_icon_url", "string", singleTable.getName(), "");
        new Column("action_dark_icon_url", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[20];
        String[] strArr = new String[21];
        mAutoDBInfo.columns = strArr;
        strArr[0] = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        mAutoDBInfo.colsMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        mAutoDBInfo.columns[1] = "logo_url";
        mAutoDBInfo.colsMap.put("logo_url", "TEXT");
        mAutoDBInfo.columns[2] = "logo_md5";
        mAutoDBInfo.colsMap.put("logo_md5", "TEXT");
        mAutoDBInfo.columns[3] = "description";
        mAutoDBInfo.colsMap.put("description", "TEXT");
        mAutoDBInfo.columns[4] = "corp_name";
        mAutoDBInfo.colsMap.put("corp_name", "TEXT");
        mAutoDBInfo.columns[5] = "action_type";
        mAutoDBInfo.colsMap.put("action_type", "INTEGER");
        mAutoDBInfo.columns[6] = "action_url";
        mAutoDBInfo.colsMap.put("action_url", "TEXT");
        mAutoDBInfo.columns[7] = "action_app_username";
        mAutoDBInfo.colsMap.put("action_app_username", "TEXT");
        mAutoDBInfo.columns[8] = "action_app_nickname";
        mAutoDBInfo.colsMap.put("action_app_nickname", "TEXT");
        mAutoDBInfo.columns[9] = "packet_id";
        mAutoDBInfo.colsMap.put("packet_id", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "packet_id";
        mAutoDBInfo.columns[10] = "update_time";
        mAutoDBInfo.colsMap.put("update_time", "LONG");
        mAutoDBInfo.columns[11] = "subtype_id";
        mAutoDBInfo.colsMap.put("subtype_id", "INTEGER");
        mAutoDBInfo.columns[12] = "action_emotion_designer_uin";
        mAutoDBInfo.colsMap.put("action_emotion_designer_uin", "INTEGER");
        mAutoDBInfo.columns[13] = "action_jump_text";
        mAutoDBInfo.colsMap.put("action_jump_text", "TEXT");
        mAutoDBInfo.columns[14] = "joint_label_text";
        mAutoDBInfo.colsMap.put("joint_label_text", "TEXT");
        mAutoDBInfo.columns[15] = "same_receive_link";
        mAutoDBInfo.colsMap.put("same_receive_link", "TEXT");
        mAutoDBInfo.columns[16] = "detail_dynamic_url";
        mAutoDBInfo.colsMap.put("detail_dynamic_url", "TEXT");
        mAutoDBInfo.columns[17] = "action_before_jump_text";
        mAutoDBInfo.colsMap.put("action_before_jump_text", "TEXT");
        mAutoDBInfo.columns[18] = "action_normal_icon_url";
        mAutoDBInfo.colsMap.put("action_normal_icon_url", "TEXT");
        mAutoDBInfo.columns[19] = "action_dark_icon_url";
        mAutoDBInfo.colsMap.put("action_dark_icon_url", "TEXT");
        mAutoDBInfo.columns[20] = "rowid";
        mAutoDBInfo.sql = " title TEXT,  logo_url TEXT,  logo_md5 TEXT,  description TEXT,  corp_name TEXT,  action_type INTEGER,  action_url TEXT,  action_app_username TEXT,  action_app_nickname TEXT,  packet_id TEXT PRIMARY KEY ,  update_time LONG,  subtype_id INTEGER,  action_emotion_designer_uin INTEGER,  action_jump_text TEXT,  joint_label_text TEXT,  same_receive_link TEXT,  detail_dynamic_url TEXT,  action_before_jump_text TEXT,  action_normal_icon_url TEXT,  action_dark_icon_url TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78831y5)) {
            return false;
        }
        C78831y5 y5Var = (C78831y5) iAutoDBItem;
        return C46238a.m51546a(this.field_title, y5Var.field_title) && C46238a.m51546a(this.field_logo_url, y5Var.field_logo_url) && C46238a.m51546a(this.field_logo_md5, y5Var.field_logo_md5) && C46238a.m51546a(this.field_description, y5Var.field_description) && C46238a.m51546a(this.field_corp_name, y5Var.field_corp_name) && C46238a.m51546a(Integer.valueOf(this.field_action_type), Integer.valueOf(y5Var.field_action_type)) && C46238a.m51546a(this.field_action_url, y5Var.field_action_url) && C46238a.m51546a(this.field_action_app_username, y5Var.field_action_app_username) && C46238a.m51546a(this.field_action_app_nickname, y5Var.field_action_app_nickname) && C46238a.m51546a(this.field_packet_id, y5Var.field_packet_id) && C46238a.m51546a(Long.valueOf(this.field_update_time), Long.valueOf(y5Var.field_update_time)) && C46238a.m51546a(Integer.valueOf(this.field_subtype_id), Integer.valueOf(y5Var.field_subtype_id)) && C46238a.m51546a(Integer.valueOf(this.field_action_emotion_designer_uin), Integer.valueOf(y5Var.field_action_emotion_designer_uin)) && C46238a.m51546a(this.field_action_jump_text, y5Var.field_action_jump_text) && C46238a.m51546a(this.field_joint_label_text, y5Var.field_joint_label_text) && C46238a.m51546a(this.field_same_receive_link, y5Var.field_same_receive_link) && C46238a.m51546a(this.field_detail_dynamic_url, y5Var.field_detail_dynamic_url) && C46238a.m51546a(this.field_action_before_jump_text, y5Var.field_action_before_jump_text) && C46238a.m51546a(this.field_action_normal_icon_url, y5Var.field_action_normal_icon_url) && C46238a.m51546a(this.field_action_dark_icon_url, y5Var.field_action_dark_icon_url);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f231570C == hashCode) {
                    try {
                        this.field_title = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231571D == hashCode) {
                    try {
                        this.field_logo_url = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231572E == hashCode) {
                    try {
                        this.field_logo_md5 = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231573F == hashCode) {
                    try {
                        this.field_description = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231574G == hashCode) {
                    try {
                        this.field_corp_name = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231575H == hashCode) {
                    try {
                        this.field_action_type = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231576I == hashCode) {
                    try {
                        this.field_action_url = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231577J == hashCode) {
                    try {
                        this.field_action_app_username = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231578K == hashCode) {
                    try {
                        this.field_action_app_nickname = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231579L == hashCode) {
                    try {
                        this.field_packet_id = cursor.getString(i);
                        this.f231602p = true;
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231580M == hashCode) {
                    try {
                        this.field_update_time = cursor.getLong(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231581N == hashCode) {
                    try {
                        this.field_subtype_id = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231582P == hashCode) {
                    try {
                        this.field_action_emotion_designer_uin = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231583Q == hashCode) {
                    try {
                        this.field_action_jump_text = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231584R == hashCode) {
                    try {
                        this.field_joint_label_text = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231585S == hashCode) {
                    try {
                        this.field_same_receive_link = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231586T == hashCode) {
                    try {
                        this.field_detail_dynamic_url = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231587U == hashCode) {
                    try {
                        this.field_action_before_jump_text = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231588V == hashCode) {
                    try {
                        this.field_action_normal_icon_url = cursor.getString(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231589W == hashCode) {
                    try {
                        this.field_action_dark_icon_url = cursor.getString(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231590X == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f231593d) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f231594e) {
            contentValues.put("logo_url", this.field_logo_url);
        }
        if (this.f231595f) {
            contentValues.put("logo_md5", this.field_logo_md5);
        }
        if (this.f231596g) {
            contentValues.put("description", this.field_description);
        }
        if (this.f231597h) {
            contentValues.put("corp_name", this.field_corp_name);
        }
        if (this.f231598i) {
            contentValues.put("action_type", Integer.valueOf(this.field_action_type));
        }
        if (this.f231599j) {
            contentValues.put("action_url", this.field_action_url);
        }
        if (this.f231600n) {
            contentValues.put("action_app_username", this.field_action_app_username);
        }
        if (this.f231601o) {
            contentValues.put("action_app_nickname", this.field_action_app_nickname);
        }
        if (this.f231602p) {
            contentValues.put("packet_id", this.field_packet_id);
        }
        if (this.f231603q) {
            contentValues.put("update_time", Long.valueOf(this.field_update_time));
        }
        if (this.f231604r) {
            contentValues.put("subtype_id", Integer.valueOf(this.field_subtype_id));
        }
        if (this.f231605s) {
            contentValues.put("action_emotion_designer_uin", Integer.valueOf(this.field_action_emotion_designer_uin));
        }
        if (this.f231606t) {
            contentValues.put("action_jump_text", this.field_action_jump_text);
        }
        if (this.f231607u) {
            contentValues.put("joint_label_text", this.field_joint_label_text);
        }
        if (this.f231608v) {
            contentValues.put("same_receive_link", this.field_same_receive_link);
        }
        if (this.f231609w) {
            contentValues.put("detail_dynamic_url", this.field_detail_dynamic_url);
        }
        if (this.f231610x) {
            contentValues.put("action_before_jump_text", this.field_action_before_jump_text);
        }
        if (this.f231611y) {
            contentValues.put("action_normal_icon_url", this.field_action_normal_icon_url);
        }
        if (this.f231612z) {
            contentValues.put("action_dark_icon_url", this.field_action_dark_icon_url);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS LocalRedPacketStoryInfo ( " + f231591Y.sql + ");");
        for (String add : f231569B) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("LocalRedPacketStoryInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f231591Y, "LocalRedPacketStoryInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("LocalRedPacketStoryInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseLocalRedPacketStoryInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f231591Y;
    }

    public String[] getIndexCreateSQL() {
        return f231569B;
    }

    public StorageObserverOwner<C78831y5> getObserverOwner() {
        return f231592Z;
    }

    public Object getPrimaryKeyValue() {
        return this.field_packet_id;
    }

    public SingleTable getTable() {
        return f231568A;
    }

    public String getTableName() {
        return f231568A.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z) {
                this.f231593d = true;
            }
        }
        if (contentValues.containsKey("logo_url")) {
            this.field_logo_url = contentValues.getAsString("logo_url");
            if (z) {
                this.f231594e = true;
            }
        }
        if (contentValues.containsKey("logo_md5")) {
            this.field_logo_md5 = contentValues.getAsString("logo_md5");
            if (z) {
                this.f231595f = true;
            }
        }
        if (contentValues.containsKey("description")) {
            this.field_description = contentValues.getAsString("description");
            if (z) {
                this.f231596g = true;
            }
        }
        if (contentValues.containsKey("corp_name")) {
            this.field_corp_name = contentValues.getAsString("corp_name");
            if (z) {
                this.f231597h = true;
            }
        }
        if (contentValues.containsKey("action_type")) {
            this.field_action_type = contentValues.getAsInteger("action_type").intValue();
            if (z) {
                this.f231598i = true;
            }
        }
        if (contentValues.containsKey("action_url")) {
            this.field_action_url = contentValues.getAsString("action_url");
            if (z) {
                this.f231599j = true;
            }
        }
        if (contentValues.containsKey("action_app_username")) {
            this.field_action_app_username = contentValues.getAsString("action_app_username");
            if (z) {
                this.f231600n = true;
            }
        }
        if (contentValues.containsKey("action_app_nickname")) {
            this.field_action_app_nickname = contentValues.getAsString("action_app_nickname");
            if (z) {
                this.f231601o = true;
            }
        }
        if (contentValues.containsKey("packet_id")) {
            this.field_packet_id = contentValues.getAsString("packet_id");
            if (z) {
                this.f231602p = true;
            }
        }
        if (contentValues.containsKey("update_time")) {
            this.field_update_time = contentValues.getAsLong("update_time").longValue();
            if (z) {
                this.f231603q = true;
            }
        }
        if (contentValues.containsKey("subtype_id")) {
            this.field_subtype_id = contentValues.getAsInteger("subtype_id").intValue();
            if (z) {
                this.f231604r = true;
            }
        }
        if (contentValues.containsKey("action_emotion_designer_uin")) {
            this.field_action_emotion_designer_uin = contentValues.getAsInteger("action_emotion_designer_uin").intValue();
            if (z) {
                this.f231605s = true;
            }
        }
        if (contentValues.containsKey("action_jump_text")) {
            this.field_action_jump_text = contentValues.getAsString("action_jump_text");
            if (z) {
                this.f231606t = true;
            }
        }
        if (contentValues.containsKey("joint_label_text")) {
            this.field_joint_label_text = contentValues.getAsString("joint_label_text");
            if (z) {
                this.f231607u = true;
            }
        }
        if (contentValues.containsKey("same_receive_link")) {
            this.field_same_receive_link = contentValues.getAsString("same_receive_link");
            if (z) {
                this.f231608v = true;
            }
        }
        if (contentValues.containsKey("detail_dynamic_url")) {
            this.field_detail_dynamic_url = contentValues.getAsString("detail_dynamic_url");
            if (z) {
                this.f231609w = true;
            }
        }
        if (contentValues.containsKey("action_before_jump_text")) {
            this.field_action_before_jump_text = contentValues.getAsString("action_before_jump_text");
            if (z) {
                this.f231610x = true;
            }
        }
        if (contentValues.containsKey("action_normal_icon_url")) {
            this.field_action_normal_icon_url = contentValues.getAsString("action_normal_icon_url");
            if (z) {
                this.f231611y = true;
            }
        }
        if (contentValues.containsKey("action_dark_icon_url")) {
            this.field_action_dark_icon_url = contentValues.getAsString("action_dark_icon_url");
            if (z) {
                this.f231612z = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
