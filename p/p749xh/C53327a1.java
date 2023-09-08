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
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.a1 */
public class C53327a1 extends IAutoDBItem {

    /* renamed from: C */
    public static final SingleTable f148933C;

    /* renamed from: D */
    public static final String[] f148934D = new String[0];

    /* renamed from: E */
    public static final int f148935E = -245025015;

    /* renamed from: F */
    public static final int f148936F = 110371416;

    /* renamed from: G */
    public static final int f148937G = -1724546052;

    /* renamed from: H */
    public static final int f148938H = 2027875547;

    /* renamed from: I */
    public static final int f148939I = 3560141;

    /* renamed from: J */
    public static final int f148940J = 553933994;

    /* renamed from: K */
    public static final int f148941K = 993874895;

    /* renamed from: L */
    public static final int f148942L = -1065021799;

    /* renamed from: M */
    public static final int f148943M = -1283380936;

    /* renamed from: N */
    public static final int f148944N = 685162667;

    /* renamed from: P */
    public static final int f148945P = 116079;

    /* renamed from: Q */
    public static final int f148946Q = 358064636;

    /* renamed from: Q0 */
    public static final StorageObserverOwner<C53327a1> f148947Q0 = new StorageObserverOwner<>();

    /* renamed from: R */
    public static final int f148948R = -501435624;

    /* renamed from: S */
    public static final int f148949S = 945560001;

    /* renamed from: T */
    public static final int f148950T = -157517656;

    /* renamed from: U */
    public static final int f148951U = 867734346;

    /* renamed from: V */
    public static final int f148952V = 299753542;

    /* renamed from: W */
    public static final int f148953W = -1204007824;

    /* renamed from: X */
    public static final int f148954X = -1143460913;

    /* renamed from: Y */
    public static final int f148955Y = 1797885601;

    /* renamed from: Z */
    public static final int f148956Z = -1472379214;

    /* renamed from: p0 */
    public static final int f148957p0 = -456281900;

    /* renamed from: x0 */
    public static final int f148958x0 = 108705909;

    /* renamed from: y0 */
    public static final IAutoDBItem.MAutoDBInfo f148959y0 = initAutoDBInfo(C53327a1.class);

    /* renamed from: A */
    public boolean f148960A = true;

    /* renamed from: B */
    public boolean f148961B = true;

    /* renamed from: d */
    public boolean f148962d = true;

    /* renamed from: e */
    public boolean f148963e = true;

    /* renamed from: f */
    public boolean f148964f = true;
    public String field_accept_buttons;
    public boolean field_all_unavailable;
    public byte[] field_buttonData;
    public String field_card_id;
    public String field_card_tp_id;
    public int field_card_type;
    public String field_consumed_box_id;
    public String field_description;
    public String field_jump_buttons;
    public int field_jump_type;
    public String field_logo_color;
    public String field_logo_url;
    public String field_msg_id;
    public int field_msg_type;
    public boolean field_need_pull_card_entrance;
    public byte[] field_operData;
    public int field_read_state;
    public int field_report_scene;
    public int field_time;
    public String field_title;
    public String field_unavailable_qr_code_list;
    public String field_url;

    /* renamed from: g */
    public boolean f148965g = true;

    /* renamed from: h */
    public boolean f148966h = true;

    /* renamed from: i */
    public boolean f148967i = true;

    /* renamed from: j */
    public boolean f148968j = true;

    /* renamed from: n */
    public boolean f148969n = true;

    /* renamed from: o */
    public boolean f148970o = true;

    /* renamed from: p */
    public boolean f148971p = true;

    /* renamed from: q */
    public boolean f148972q = true;

    /* renamed from: r */
    public boolean f148973r = true;

    /* renamed from: s */
    public boolean f148974s = true;

    /* renamed from: t */
    public boolean f148975t = true;

    /* renamed from: u */
    public boolean f148976u = true;

    /* renamed from: v */
    public boolean f148977v = true;

    /* renamed from: w */
    public boolean f148978w = true;

    /* renamed from: x */
    public boolean f148979x = true;

    /* renamed from: y */
    public boolean f148980y = true;

    /* renamed from: z */
    public boolean f148981z = true;

    static {
        SingleTable singleTable = new SingleTable("CardMsgInfo");
        f148933C = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("card_type", "int", singleTable.getName(), "");
        new Column(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "string", singleTable.getName(), "");
        new Column("description", "string", singleTable.getName(), "");
        new Column("logo_url", "string", singleTable.getName(), "");
        new Column("time", "int", singleTable.getName(), "");
        new Column("card_id", "string", singleTable.getName(), "");
        new Column("card_tp_id", "string", singleTable.getName(), "");
        new Column("msg_id", "string", singleTable.getName(), "");
        new Column("msg_type", "int", singleTable.getName(), "");
        new Column("jump_type", "int", singleTable.getName(), "");
        new Column("url", "string", singleTable.getName(), "");
        new Column("buttonData", "byte[]", singleTable.getName(), "");
        new Column("operData", "byte[]", singleTable.getName(), "");
        new Column("report_scene", "int", singleTable.getName(), "");
        new Column("read_state", "int", singleTable.getName(), "");
        new Column("accept_buttons", "string", singleTable.getName(), "");
        new Column("consumed_box_id", "string", singleTable.getName(), "");
        new Column("jump_buttons", "string", singleTable.getName(), "");
        new Column("logo_color", "string", singleTable.getName(), "");
        new Column("unavailable_qr_code_list", "string", singleTable.getName(), "");
        new Column("all_unavailable", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("need_pull_card_entrance", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[22];
        String[] strArr = new String[23];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "card_type";
        mAutoDBInfo.colsMap.put("card_type", "INTEGER");
        mAutoDBInfo.columns[1] = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        mAutoDBInfo.colsMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        mAutoDBInfo.columns[2] = "description";
        mAutoDBInfo.colsMap.put("description", "TEXT");
        mAutoDBInfo.columns[3] = "logo_url";
        mAutoDBInfo.colsMap.put("logo_url", "TEXT");
        mAutoDBInfo.columns[4] = "time";
        mAutoDBInfo.colsMap.put("time", "INTEGER");
        mAutoDBInfo.columns[5] = "card_id";
        mAutoDBInfo.colsMap.put("card_id", "TEXT");
        mAutoDBInfo.columns[6] = "card_tp_id";
        mAutoDBInfo.colsMap.put("card_tp_id", "TEXT");
        mAutoDBInfo.columns[7] = "msg_id";
        mAutoDBInfo.colsMap.put("msg_id", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "msg_id";
        mAutoDBInfo.columns[8] = "msg_type";
        mAutoDBInfo.colsMap.put("msg_type", "INTEGER");
        mAutoDBInfo.columns[9] = "jump_type";
        mAutoDBInfo.colsMap.put("jump_type", "INTEGER");
        mAutoDBInfo.columns[10] = "url";
        mAutoDBInfo.colsMap.put("url", "TEXT");
        mAutoDBInfo.columns[11] = "buttonData";
        mAutoDBInfo.colsMap.put("buttonData", "BLOB");
        mAutoDBInfo.columns[12] = "operData";
        mAutoDBInfo.colsMap.put("operData", "BLOB");
        mAutoDBInfo.columns[13] = "report_scene";
        mAutoDBInfo.colsMap.put("report_scene", "INTEGER");
        mAutoDBInfo.columns[14] = "read_state";
        mAutoDBInfo.colsMap.put("read_state", "INTEGER default '0' ");
        mAutoDBInfo.columns[15] = "accept_buttons";
        mAutoDBInfo.colsMap.put("accept_buttons", "TEXT");
        mAutoDBInfo.columns[16] = "consumed_box_id";
        mAutoDBInfo.colsMap.put("consumed_box_id", "TEXT");
        mAutoDBInfo.columns[17] = "jump_buttons";
        mAutoDBInfo.colsMap.put("jump_buttons", "TEXT");
        mAutoDBInfo.columns[18] = "logo_color";
        mAutoDBInfo.colsMap.put("logo_color", "TEXT");
        mAutoDBInfo.columns[19] = "unavailable_qr_code_list";
        mAutoDBInfo.colsMap.put("unavailable_qr_code_list", "TEXT");
        mAutoDBInfo.columns[20] = "all_unavailable";
        mAutoDBInfo.colsMap.put("all_unavailable", "INTEGER default 'false' ");
        mAutoDBInfo.columns[21] = "need_pull_card_entrance";
        mAutoDBInfo.colsMap.put("need_pull_card_entrance", "INTEGER default 'false' ");
        mAutoDBInfo.columns[22] = "rowid";
        mAutoDBInfo.sql = " card_type INTEGER,  title TEXT,  description TEXT,  logo_url TEXT,  time INTEGER,  card_id TEXT,  card_tp_id TEXT,  msg_id TEXT PRIMARY KEY ,  msg_type INTEGER,  jump_type INTEGER,  url TEXT,  buttonData BLOB,  operData BLOB,  report_scene INTEGER,  read_state INTEGER default '0' ,  accept_buttons TEXT,  consumed_box_id TEXT,  jump_buttons TEXT,  logo_color TEXT,  unavailable_qr_code_list TEXT,  all_unavailable INTEGER default 'false' ,  need_pull_card_entrance INTEGER default 'false' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C53327a1)) {
            return false;
        }
        C53327a1 a1Var = (C53327a1) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_card_type), Integer.valueOf(a1Var.field_card_type)) && C46238a.m51546a(this.field_title, a1Var.field_title) && C46238a.m51546a(this.field_description, a1Var.field_description) && C46238a.m51546a(this.field_logo_url, a1Var.field_logo_url) && C46238a.m51546a(Integer.valueOf(this.field_time), Integer.valueOf(a1Var.field_time)) && C46238a.m51546a(this.field_card_id, a1Var.field_card_id) && C46238a.m51546a(this.field_card_tp_id, a1Var.field_card_tp_id) && C46238a.m51546a(this.field_msg_id, a1Var.field_msg_id) && C46238a.m51546a(Integer.valueOf(this.field_msg_type), Integer.valueOf(a1Var.field_msg_type)) && C46238a.m51546a(Integer.valueOf(this.field_jump_type), Integer.valueOf(a1Var.field_jump_type)) && C46238a.m51546a(this.field_url, a1Var.field_url) && C46238a.m51546a(this.field_buttonData, a1Var.field_buttonData) && C46238a.m51546a(this.field_operData, a1Var.field_operData) && C46238a.m51546a(Integer.valueOf(this.field_report_scene), Integer.valueOf(a1Var.field_report_scene)) && C46238a.m51546a(Integer.valueOf(this.field_read_state), Integer.valueOf(a1Var.field_read_state)) && C46238a.m51546a(this.field_accept_buttons, a1Var.field_accept_buttons) && C46238a.m51546a(this.field_consumed_box_id, a1Var.field_consumed_box_id) && C46238a.m51546a(this.field_jump_buttons, a1Var.field_jump_buttons) && C46238a.m51546a(this.field_logo_color, a1Var.field_logo_color) && C46238a.m51546a(this.field_unavailable_qr_code_list, a1Var.field_unavailable_qr_code_list) && C46238a.m51546a(Boolean.valueOf(this.field_all_unavailable), Boolean.valueOf(a1Var.field_all_unavailable)) && C46238a.m51546a(Boolean.valueOf(this.field_need_pull_card_entrance), Boolean.valueOf(a1Var.field_need_pull_card_entrance));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f148935E == hashCode) {
                    try {
                        this.field_card_type = cursor.getInt(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148936F == hashCode) {
                    try {
                        this.field_title = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148937G == hashCode) {
                    try {
                        this.field_description = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148938H == hashCode) {
                    try {
                        this.field_logo_url = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148939I == hashCode) {
                    try {
                        this.field_time = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148940J == hashCode) {
                    try {
                        this.field_card_id = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148941K == hashCode) {
                    try {
                        this.field_card_tp_id = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148942L == hashCode) {
                    try {
                        this.field_msg_id = cursor.getString(i);
                        this.f148969n = true;
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148943M == hashCode) {
                    try {
                        this.field_msg_type = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148944N == hashCode) {
                    try {
                        this.field_jump_type = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148945P == hashCode) {
                    try {
                        this.field_url = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148946Q == hashCode) {
                    try {
                        this.field_buttonData = cursor.getBlob(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148948R == hashCode) {
                    try {
                        this.field_operData = cursor.getBlob(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148949S == hashCode) {
                    try {
                        this.field_report_scene = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148950T == hashCode) {
                    try {
                        this.field_read_state = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148951U == hashCode) {
                    try {
                        this.field_accept_buttons = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148952V == hashCode) {
                    try {
                        this.field_consumed_box_id = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148953W == hashCode) {
                    try {
                        this.field_jump_buttons = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148954X == hashCode) {
                    try {
                        this.field_logo_color = cursor.getString(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148955Y == hashCode) {
                    try {
                        this.field_unavailable_qr_code_list = cursor.getString(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148956Z == hashCode) {
                    try {
                        this.field_all_unavailable = cursor.getInt(i) != 0;
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148957p0 == hashCode) {
                    try {
                        this.field_need_pull_card_entrance = cursor.getInt(i) != 0;
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseCardMsgInfo", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f148958x0 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f148962d) {
            contentValues.put("card_type", Integer.valueOf(this.field_card_type));
        }
        if (this.f148963e) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f148964f) {
            contentValues.put("description", this.field_description);
        }
        if (this.f148965g) {
            contentValues.put("logo_url", this.field_logo_url);
        }
        if (this.f148966h) {
            contentValues.put("time", Integer.valueOf(this.field_time));
        }
        if (this.f148967i) {
            contentValues.put("card_id", this.field_card_id);
        }
        if (this.f148968j) {
            contentValues.put("card_tp_id", this.field_card_tp_id);
        }
        if (this.f148969n) {
            contentValues.put("msg_id", this.field_msg_id);
        }
        if (this.f148970o) {
            contentValues.put("msg_type", Integer.valueOf(this.field_msg_type));
        }
        if (this.f148971p) {
            contentValues.put("jump_type", Integer.valueOf(this.field_jump_type));
        }
        if (this.f148972q) {
            contentValues.put("url", this.field_url);
        }
        if (this.f148973r) {
            contentValues.put("buttonData", this.field_buttonData);
        }
        if (this.f148974s) {
            contentValues.put("operData", this.field_operData);
        }
        if (this.f148975t) {
            contentValues.put("report_scene", Integer.valueOf(this.field_report_scene));
        }
        if (this.f148976u) {
            contentValues.put("read_state", Integer.valueOf(this.field_read_state));
        }
        if (this.f148977v) {
            contentValues.put("accept_buttons", this.field_accept_buttons);
        }
        if (this.f148978w) {
            contentValues.put("consumed_box_id", this.field_consumed_box_id);
        }
        if (this.f148979x) {
            contentValues.put("jump_buttons", this.field_jump_buttons);
        }
        if (this.f148980y) {
            contentValues.put("logo_color", this.field_logo_color);
        }
        if (this.f148981z) {
            contentValues.put("unavailable_qr_code_list", this.field_unavailable_qr_code_list);
        }
        if (this.f148960A) {
            if (this.field_all_unavailable) {
                contentValues.put("all_unavailable", 1);
            } else {
                contentValues.put("all_unavailable", 0);
            }
        }
        if (this.f148961B) {
            if (this.field_need_pull_card_entrance) {
                contentValues.put("need_pull_card_entrance", 1);
            } else {
                contentValues.put("need_pull_card_entrance", 0);
            }
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseCardMsgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS CardMsgInfo ( " + f148959y0.sql + ");");
        for (String add : f148934D) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseCardMsgInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("CardMsgInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f148959y0, "CardMsgInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseCardMsgInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("CardMsgInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseCardMsgInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f148959y0;
    }

    public String[] getIndexCreateSQL() {
        return f148934D;
    }

    public StorageObserverOwner<C53327a1> getObserverOwner() {
        return f148947Q0;
    }

    public Object getPrimaryKeyValue() {
        return this.field_msg_id;
    }

    public SingleTable getTable() {
        return f148933C;
    }

    public String getTableName() {
        return f148933C.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("card_type")) {
            this.field_card_type = contentValues.getAsInteger("card_type").intValue();
            if (z) {
                this.f148962d = true;
            }
        }
        if (contentValues.containsKey(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z) {
                this.f148963e = true;
            }
        }
        if (contentValues.containsKey("description")) {
            this.field_description = contentValues.getAsString("description");
            if (z) {
                this.f148964f = true;
            }
        }
        if (contentValues.containsKey("logo_url")) {
            this.field_logo_url = contentValues.getAsString("logo_url");
            if (z) {
                this.f148965g = true;
            }
        }
        if (contentValues.containsKey("time")) {
            this.field_time = contentValues.getAsInteger("time").intValue();
            if (z) {
                this.f148966h = true;
            }
        }
        if (contentValues.containsKey("card_id")) {
            this.field_card_id = contentValues.getAsString("card_id");
            if (z) {
                this.f148967i = true;
            }
        }
        if (contentValues.containsKey("card_tp_id")) {
            this.field_card_tp_id = contentValues.getAsString("card_tp_id");
            if (z) {
                this.f148968j = true;
            }
        }
        if (contentValues.containsKey("msg_id")) {
            this.field_msg_id = contentValues.getAsString("msg_id");
            if (z) {
                this.f148969n = true;
            }
        }
        if (contentValues.containsKey("msg_type")) {
            this.field_msg_type = contentValues.getAsInteger("msg_type").intValue();
            if (z) {
                this.f148970o = true;
            }
        }
        if (contentValues.containsKey("jump_type")) {
            this.field_jump_type = contentValues.getAsInteger("jump_type").intValue();
            if (z) {
                this.f148971p = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.field_url = contentValues.getAsString("url");
            if (z) {
                this.f148972q = true;
            }
        }
        if (contentValues.containsKey("buttonData")) {
            this.field_buttonData = contentValues.getAsByteArray("buttonData");
            if (z) {
                this.f148973r = true;
            }
        }
        if (contentValues.containsKey("operData")) {
            this.field_operData = contentValues.getAsByteArray("operData");
            if (z) {
                this.f148974s = true;
            }
        }
        if (contentValues.containsKey("report_scene")) {
            this.field_report_scene = contentValues.getAsInteger("report_scene").intValue();
            if (z) {
                this.f148975t = true;
            }
        }
        if (contentValues.containsKey("read_state")) {
            this.field_read_state = contentValues.getAsInteger("read_state").intValue();
            if (z) {
                this.f148976u = true;
            }
        }
        if (contentValues.containsKey("accept_buttons")) {
            this.field_accept_buttons = contentValues.getAsString("accept_buttons");
            if (z) {
                this.f148977v = true;
            }
        }
        if (contentValues.containsKey("consumed_box_id")) {
            this.field_consumed_box_id = contentValues.getAsString("consumed_box_id");
            if (z) {
                this.f148978w = true;
            }
        }
        if (contentValues.containsKey("jump_buttons")) {
            this.field_jump_buttons = contentValues.getAsString("jump_buttons");
            if (z) {
                this.f148979x = true;
            }
        }
        if (contentValues.containsKey("logo_color")) {
            this.field_logo_color = contentValues.getAsString("logo_color");
            if (z) {
                this.f148980y = true;
            }
        }
        if (contentValues.containsKey("unavailable_qr_code_list")) {
            this.field_unavailable_qr_code_list = contentValues.getAsString("unavailable_qr_code_list");
            if (z) {
                this.f148981z = true;
            }
        }
        if (contentValues.containsKey("all_unavailable")) {
            this.field_all_unavailable = contentValues.getAsInteger("all_unavailable").intValue() != 0;
            if (z) {
                this.f148960A = true;
            }
        }
        if (contentValues.containsKey("need_pull_card_entrance")) {
            this.field_need_pull_card_entrance = contentValues.getAsInteger("need_pull_card_entrance").intValue() != 0;
            if (z) {
                this.f148961B = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
