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
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.h0 */
public class C102651h0 extends IAutoDBItem {

    /* renamed from: Q */
    public static final SingleTable f302391Q;

    /* renamed from: Q0 */
    public static final int f302392Q0 = -53394615;

    /* renamed from: R */
    public static final Column f302393R;

    /* renamed from: R0 */
    public static final int f302394R0 = -780124673;

    /* renamed from: S */
    public static final Column f302395S;

    /* renamed from: S0 */
    public static final int f302396S0 = -560290766;

    /* renamed from: T */
    public static final Column f302397T;

    /* renamed from: T0 */
    public static final int f302398T0 = -832703409;

    /* renamed from: U */
    public static final Column f302399U;

    /* renamed from: U0 */
    public static final int f302400U0 = -1301840176;

    /* renamed from: V */
    public static final String[] f302401V = {"CREATE INDEX IF NOT EXISTS BackgroundVideoInfo_Work_Id ON BackgroundVideoInfo(work_id)", "CREATE INDEX IF NOT EXISTS BackgroundVideoInfo_Local_Id ON BackgroundVideoInfo(sns_local_id)"};

    /* renamed from: V0 */
    public static final int f302402V0 = -899871772;

    /* renamed from: W */
    public static final int f302403W = 1525155081;

    /* renamed from: W0 */
    public static final int f302404W0 = 1026670573;

    /* renamed from: X */
    public static final int f302405X = 1090536360;

    /* renamed from: X0 */
    public static final int f302406X0 = -897597339;

    /* renamed from: Y */
    public static final int f302407Y = 1090019931;

    /* renamed from: Y0 */
    public static final int f302408Y0 = 2031810157;

    /* renamed from: Z */
    public static final int f302409Z = -124461209;

    /* renamed from: Z0 */
    public static final int f302410Z0 = -1115574927;

    /* renamed from: a1 */
    public static final int f302411a1 = 1354144894;

    /* renamed from: b1 */
    public static final int f302412b1 = 1286150979;

    /* renamed from: c1 */
    public static final int f302413c1 = 1209340193;

    /* renamed from: d1 */
    public static final int f302414d1 = -1598154452;

    /* renamed from: e1 */
    public static final int f302415e1 = -1800454848;

    /* renamed from: f1 */
    public static final int f302416f1 = -742865349;

    /* renamed from: g1 */
    public static final int f302417g1 = 376269419;

    /* renamed from: h1 */
    public static final int f302418h1 = -571827160;

    /* renamed from: i1 */
    public static final int f302419i1 = -2034730810;

    /* renamed from: j1 */
    public static final int f302420j1 = -1669165533;

    /* renamed from: k1 */
    public static final int f302421k1 = 1382287305;

    /* renamed from: l1 */
    public static final int f302422l1 = -996812045;

    /* renamed from: m1 */
    public static final int f302423m1 = -1564413610;

    /* renamed from: n1 */
    public static final int f302424n1 = -748076810;

    /* renamed from: o1 */
    public static final int f302425o1 = -940324046;

    /* renamed from: p0 */
    public static final int f302426p0 = -223059220;

    /* renamed from: p1 */
    public static final int f302427p1 = 55350200;

    /* renamed from: q1 */
    public static final int f302428q1 = -2073036701;

    /* renamed from: r1 */
    public static final int f302429r1 = 1295667177;

    /* renamed from: s1 */
    public static final int f302430s1 = 108705909;

    /* renamed from: t1 */
    public static final IAutoDBItem.MAutoDBInfo f302431t1 = initAutoDBInfo(C102651h0.class);

    /* renamed from: u1 */
    public static final StorageObserverOwner<C102651h0> f302432u1 = new StorageObserverOwner<>();

    /* renamed from: x0 */
    public static final int f302433x0 = -691471347;

    /* renamed from: y0 */
    public static final int f302434y0 = 230841262;

    /* renamed from: A */
    public boolean f302435A = true;

    /* renamed from: B */
    public boolean f302436B = true;

    /* renamed from: C */
    public boolean f302437C = true;

    /* renamed from: D */
    public boolean f302438D = true;

    /* renamed from: E */
    public boolean f302439E = true;

    /* renamed from: F */
    public boolean f302440F = true;

    /* renamed from: G */
    public boolean f302441G = true;

    /* renamed from: H */
    public boolean f302442H = true;

    /* renamed from: I */
    public boolean f302443I = true;

    /* renamed from: J */
    public boolean f302444J = true;

    /* renamed from: K */
    public boolean f302445K = true;

    /* renamed from: L */
    public boolean f302446L = true;

    /* renamed from: M */
    public boolean f302447M = true;

    /* renamed from: N */
    public boolean f302448N = true;

    /* renamed from: P */
    public boolean f302449P = true;

    /* renamed from: d */
    public boolean f302450d = true;

    /* renamed from: e */
    public boolean f302451e = true;

    /* renamed from: f */
    public boolean f302452f = true;
    public int field_aba_target_bitrate;
    public byte[] field_composition_info;
    public long field_confirm_publish_video_time_stamp;
    public long field_confirm_remux_time_stamp;
    public int field_encode_frame_rate;
    public int field_encode_qp_switch;
    public int field_encode_target_height;
    public int field_encode_target_width;
    public int field_encode_video_bitrate;
    public boolean field_is_capture_video;
    public boolean field_is_change;
    public int field_is_killed_process_restart;
    public boolean field_is_sava_to_sys_album_if_media_edited;
    public boolean field_is_save_source_media;
    public int field_is_sns_double_check;
    public String field_music_path;
    public String field_output_thumb_path;
    public String field_output_thumb_temp_path;
    public String field_output_video_path;
    public String field_output_video_temp_path;
    public String field_post_session_id;
    public long field_remux_success_time_stamp;
    public int field_sns_create_time;
    public byte[] field_sns_ext_info;
    public int field_sns_local_id;
    public String field_source_video_path;
    public int field_source_video_rotate;
    public long field_start_remux_time_stamp;
    public int field_tec_enter_scene;
    public byte[] field_video_param;
    public int field_video_param_preset_index;
    public int field_video_param_profile_index;
    public int field_work_code;
    public String field_work_id;
    public int field_work_type;

    /* renamed from: g */
    public boolean f302453g = true;

    /* renamed from: h */
    public boolean f302454h = true;

    /* renamed from: i */
    public boolean f302455i = true;

    /* renamed from: j */
    public boolean f302456j = true;

    /* renamed from: n */
    public boolean f302457n = true;

    /* renamed from: o */
    public boolean f302458o = true;

    /* renamed from: p */
    public boolean f302459p = true;

    /* renamed from: q */
    public boolean f302460q = true;

    /* renamed from: r */
    public boolean f302461r = true;

    /* renamed from: s */
    public boolean f302462s = true;

    /* renamed from: t */
    public boolean f302463t = true;

    /* renamed from: u */
    public boolean f302464u = true;

    /* renamed from: v */
    public boolean f302465v = true;

    /* renamed from: w */
    public boolean f302466w = true;

    /* renamed from: x */
    public boolean f302467x = true;

    /* renamed from: y */
    public boolean f302468y = true;

    /* renamed from: z */
    public boolean f302469z = true;

    static {
        SingleTable singleTable = new SingleTable("BackgroundVideoInfo");
        f302391Q = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        f302393R = new Column("work_id", "string", singleTable.getName(), "");
        new Column("work_type", "int", singleTable.getName(), "");
        f302395S = new Column("work_code", "int", singleTable.getName(), "");
        new Column("output_video_path", "string", singleTable.getName(), "");
        new Column("output_thumb_path", "string", singleTable.getName(), "");
        new Column("source_video_path", "string", singleTable.getName(), "");
        new Column("output_video_temp_path", "string", singleTable.getName(), "");
        new Column("output_thumb_temp_path", "string", singleTable.getName(), "");
        new Column("music_path", "string", singleTable.getName(), "");
        new Column("confirm_remux_time_stamp", "long", singleTable.getName(), "");
        f302397T = new Column("remux_success_time_stamp", "long", singleTable.getName(), "");
        new Column("start_remux_time_stamp", "long", singleTable.getName(), "");
        new Column("confirm_publish_video_time_stamp", "long", singleTable.getName(), "");
        new Column("is_capture_video", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("is_change", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("is_save_source_media", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("is_sava_to_sys_album_if_media_edited", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("aba_target_bitrate", "int", singleTable.getName(), "");
        new Column("source_video_rotate", "int", singleTable.getName(), "");
        new Column("encode_target_width", "int", singleTable.getName(), "");
        new Column("encode_target_height", "int", singleTable.getName(), "");
        new Column("encode_video_bitrate", "int", singleTable.getName(), "");
        new Column("encode_frame_rate", "int", singleTable.getName(), "");
        new Column("encode_qp_switch", "int", singleTable.getName(), "");
        new Column("video_param_preset_index", "int", singleTable.getName(), "");
        new Column("video_param_profile_index", "int", singleTable.getName(), "");
        new Column("composition_info", "byte[]", singleTable.getName(), "");
        new Column("video_param", "byte[]", singleTable.getName(), "");
        f302399U = new Column("sns_ext_info", "byte[]", singleTable.getName(), "");
        new Column("sns_local_id", "int", singleTable.getName(), "");
        new Column("is_sns_double_check", "int", singleTable.getName(), "");
        new Column("is_killed_process_restart", "int", singleTable.getName(), "");
        new Column("tec_enter_scene", "int", singleTable.getName(), "");
        new Column("post_session_id", "string", singleTable.getName(), "");
        new Column("sns_create_time", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[35];
        String[] strArr = new String[36];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "work_id";
        mAutoDBInfo.colsMap.put("work_id", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "work_id";
        mAutoDBInfo.columns[1] = "work_type";
        mAutoDBInfo.colsMap.put("work_type", "INTEGER");
        mAutoDBInfo.columns[2] = "work_code";
        mAutoDBInfo.colsMap.put("work_code", "INTEGER default '-1' ");
        mAutoDBInfo.columns[3] = "output_video_path";
        mAutoDBInfo.colsMap.put("output_video_path", "TEXT");
        mAutoDBInfo.columns[4] = "output_thumb_path";
        mAutoDBInfo.colsMap.put("output_thumb_path", "TEXT");
        mAutoDBInfo.columns[5] = "source_video_path";
        mAutoDBInfo.colsMap.put("source_video_path", "TEXT");
        mAutoDBInfo.columns[6] = "output_video_temp_path";
        mAutoDBInfo.colsMap.put("output_video_temp_path", "TEXT");
        mAutoDBInfo.columns[7] = "output_thumb_temp_path";
        mAutoDBInfo.colsMap.put("output_thumb_temp_path", "TEXT");
        mAutoDBInfo.columns[8] = "music_path";
        mAutoDBInfo.colsMap.put("music_path", "TEXT default '' ");
        mAutoDBInfo.columns[9] = "confirm_remux_time_stamp";
        mAutoDBInfo.colsMap.put("confirm_remux_time_stamp", "LONG default '0' ");
        mAutoDBInfo.columns[10] = "remux_success_time_stamp";
        mAutoDBInfo.colsMap.put("remux_success_time_stamp", "LONG default '0' ");
        mAutoDBInfo.columns[11] = "start_remux_time_stamp";
        mAutoDBInfo.colsMap.put("start_remux_time_stamp", "LONG default '0' ");
        mAutoDBInfo.columns[12] = "confirm_publish_video_time_stamp";
        mAutoDBInfo.colsMap.put("confirm_publish_video_time_stamp", "LONG default '0' ");
        mAutoDBInfo.columns[13] = "is_capture_video";
        mAutoDBInfo.colsMap.put("is_capture_video", "INTEGER");
        mAutoDBInfo.columns[14] = "is_change";
        mAutoDBInfo.colsMap.put("is_change", "INTEGER");
        mAutoDBInfo.columns[15] = "is_save_source_media";
        mAutoDBInfo.colsMap.put("is_save_source_media", "INTEGER");
        mAutoDBInfo.columns[16] = "is_sava_to_sys_album_if_media_edited";
        mAutoDBInfo.colsMap.put("is_sava_to_sys_album_if_media_edited", "INTEGER");
        mAutoDBInfo.columns[17] = "aba_target_bitrate";
        mAutoDBInfo.colsMap.put("aba_target_bitrate", "INTEGER");
        mAutoDBInfo.columns[18] = "source_video_rotate";
        mAutoDBInfo.colsMap.put("source_video_rotate", "INTEGER");
        mAutoDBInfo.columns[19] = "encode_target_width";
        mAutoDBInfo.colsMap.put("encode_target_width", "INTEGER");
        mAutoDBInfo.columns[20] = "encode_target_height";
        mAutoDBInfo.colsMap.put("encode_target_height", "INTEGER");
        mAutoDBInfo.columns[21] = "encode_video_bitrate";
        mAutoDBInfo.colsMap.put("encode_video_bitrate", "INTEGER");
        mAutoDBInfo.columns[22] = "encode_frame_rate";
        mAutoDBInfo.colsMap.put("encode_frame_rate", "INTEGER");
        mAutoDBInfo.columns[23] = "encode_qp_switch";
        mAutoDBInfo.colsMap.put("encode_qp_switch", "INTEGER");
        mAutoDBInfo.columns[24] = "video_param_preset_index";
        mAutoDBInfo.colsMap.put("video_param_preset_index", "INTEGER");
        mAutoDBInfo.columns[25] = "video_param_profile_index";
        mAutoDBInfo.colsMap.put("video_param_profile_index", "INTEGER");
        mAutoDBInfo.columns[26] = "composition_info";
        mAutoDBInfo.colsMap.put("composition_info", "BLOB");
        mAutoDBInfo.columns[27] = "video_param";
        mAutoDBInfo.colsMap.put("video_param", "BLOB");
        mAutoDBInfo.columns[28] = "sns_ext_info";
        mAutoDBInfo.colsMap.put("sns_ext_info", "BLOB");
        mAutoDBInfo.columns[29] = "sns_local_id";
        mAutoDBInfo.colsMap.put("sns_local_id", "INTEGER default '-1' ");
        mAutoDBInfo.columns[30] = "is_sns_double_check";
        mAutoDBInfo.colsMap.put("is_sns_double_check", "INTEGER default '0' ");
        mAutoDBInfo.columns[31] = "is_killed_process_restart";
        mAutoDBInfo.colsMap.put("is_killed_process_restart", "INTEGER default '0' ");
        mAutoDBInfo.columns[32] = "tec_enter_scene";
        mAutoDBInfo.colsMap.put("tec_enter_scene", "INTEGER default '0' ");
        mAutoDBInfo.columns[33] = "post_session_id";
        mAutoDBInfo.colsMap.put("post_session_id", "TEXT default '' ");
        mAutoDBInfo.columns[34] = "sns_create_time";
        mAutoDBInfo.colsMap.put("sns_create_time", "INTEGER default '0' ");
        mAutoDBInfo.columns[35] = "rowid";
        mAutoDBInfo.sql = " work_id TEXT default ''  PRIMARY KEY ,  work_type INTEGER,  work_code INTEGER default '-1' ,  output_video_path TEXT,  output_thumb_path TEXT,  source_video_path TEXT,  output_video_temp_path TEXT,  output_thumb_temp_path TEXT,  music_path TEXT default '' ,  confirm_remux_time_stamp LONG default '0' ,  remux_success_time_stamp LONG default '0' ,  start_remux_time_stamp LONG default '0' ,  confirm_publish_video_time_stamp LONG default '0' ,  is_capture_video INTEGER,  is_change INTEGER,  is_save_source_media INTEGER,  is_sava_to_sys_album_if_media_edited INTEGER,  aba_target_bitrate INTEGER,  source_video_rotate INTEGER,  encode_target_width INTEGER,  encode_target_height INTEGER,  encode_video_bitrate INTEGER,  encode_frame_rate INTEGER,  encode_qp_switch INTEGER,  video_param_preset_index INTEGER,  video_param_profile_index INTEGER,  composition_info BLOB,  video_param BLOB,  sns_ext_info BLOB,  sns_local_id INTEGER default '-1' ,  is_sns_double_check INTEGER default '0' ,  is_killed_process_restart INTEGER default '0' ,  tec_enter_scene INTEGER default '0' ,  post_session_id TEXT default '' ,  sns_create_time INTEGER default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102651h0)) {
            return false;
        }
        C102651h0 h0Var = (C102651h0) iAutoDBItem;
        return C46238a.m51546a(this.field_work_id, h0Var.field_work_id) && C46238a.m51546a(Integer.valueOf(this.field_work_type), Integer.valueOf(h0Var.field_work_type)) && C46238a.m51546a(Integer.valueOf(this.field_work_code), Integer.valueOf(h0Var.field_work_code)) && C46238a.m51546a(this.field_output_video_path, h0Var.field_output_video_path) && C46238a.m51546a(this.field_output_thumb_path, h0Var.field_output_thumb_path) && C46238a.m51546a(this.field_source_video_path, h0Var.field_source_video_path) && C46238a.m51546a(this.field_output_video_temp_path, h0Var.field_output_video_temp_path) && C46238a.m51546a(this.field_output_thumb_temp_path, h0Var.field_output_thumb_temp_path) && C46238a.m51546a(this.field_music_path, h0Var.field_music_path) && C46238a.m51546a(Long.valueOf(this.field_confirm_remux_time_stamp), Long.valueOf(h0Var.field_confirm_remux_time_stamp)) && C46238a.m51546a(Long.valueOf(this.field_remux_success_time_stamp), Long.valueOf(h0Var.field_remux_success_time_stamp)) && C46238a.m51546a(Long.valueOf(this.field_start_remux_time_stamp), Long.valueOf(h0Var.field_start_remux_time_stamp)) && C46238a.m51546a(Long.valueOf(this.field_confirm_publish_video_time_stamp), Long.valueOf(h0Var.field_confirm_publish_video_time_stamp)) && C46238a.m51546a(Boolean.valueOf(this.field_is_capture_video), Boolean.valueOf(h0Var.field_is_capture_video)) && C46238a.m51546a(Boolean.valueOf(this.field_is_change), Boolean.valueOf(h0Var.field_is_change)) && C46238a.m51546a(Boolean.valueOf(this.field_is_save_source_media), Boolean.valueOf(h0Var.field_is_save_source_media)) && C46238a.m51546a(Boolean.valueOf(this.field_is_sava_to_sys_album_if_media_edited), Boolean.valueOf(h0Var.field_is_sava_to_sys_album_if_media_edited)) && C46238a.m51546a(Integer.valueOf(this.field_aba_target_bitrate), Integer.valueOf(h0Var.field_aba_target_bitrate)) && C46238a.m51546a(Integer.valueOf(this.field_source_video_rotate), Integer.valueOf(h0Var.field_source_video_rotate)) && C46238a.m51546a(Integer.valueOf(this.field_encode_target_width), Integer.valueOf(h0Var.field_encode_target_width)) && C46238a.m51546a(Integer.valueOf(this.field_encode_target_height), Integer.valueOf(h0Var.field_encode_target_height)) && C46238a.m51546a(Integer.valueOf(this.field_encode_video_bitrate), Integer.valueOf(h0Var.field_encode_video_bitrate)) && C46238a.m51546a(Integer.valueOf(this.field_encode_frame_rate), Integer.valueOf(h0Var.field_encode_frame_rate)) && C46238a.m51546a(Integer.valueOf(this.field_encode_qp_switch), Integer.valueOf(h0Var.field_encode_qp_switch)) && C46238a.m51546a(Integer.valueOf(this.field_video_param_preset_index), Integer.valueOf(h0Var.field_video_param_preset_index)) && C46238a.m51546a(Integer.valueOf(this.field_video_param_profile_index), Integer.valueOf(h0Var.field_video_param_profile_index)) && C46238a.m51546a(this.field_composition_info, h0Var.field_composition_info) && C46238a.m51546a(this.field_video_param, h0Var.field_video_param) && C46238a.m51546a(this.field_sns_ext_info, h0Var.field_sns_ext_info) && C46238a.m51546a(Integer.valueOf(this.field_sns_local_id), Integer.valueOf(h0Var.field_sns_local_id)) && C46238a.m51546a(Integer.valueOf(this.field_is_sns_double_check), Integer.valueOf(h0Var.field_is_sns_double_check)) && C46238a.m51546a(Integer.valueOf(this.field_is_killed_process_restart), Integer.valueOf(h0Var.field_is_killed_process_restart)) && C46238a.m51546a(Integer.valueOf(this.field_tec_enter_scene), Integer.valueOf(h0Var.field_tec_enter_scene)) && C46238a.m51546a(this.field_post_session_id, h0Var.field_post_session_id) && C46238a.m51546a(Integer.valueOf(this.field_sns_create_time), Integer.valueOf(h0Var.field_sns_create_time));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f302403W == hashCode) {
                    try {
                        this.field_work_id = cursor.getString(i);
                        this.f302450d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302405X == hashCode) {
                    try {
                        this.field_work_type = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302407Y == hashCode) {
                    try {
                        this.field_work_code = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302409Z == hashCode) {
                    try {
                        this.field_output_video_path = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302426p0 == hashCode) {
                    try {
                        this.field_output_thumb_path = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302433x0 == hashCode) {
                    try {
                        this.field_source_video_path = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302434y0 == hashCode) {
                    try {
                        this.field_output_video_temp_path = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302392Q0 == hashCode) {
                    try {
                        this.field_output_thumb_temp_path = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302394R0 == hashCode) {
                    try {
                        this.field_music_path = cursor.getString(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302396S0 == hashCode) {
                    try {
                        this.field_confirm_remux_time_stamp = cursor.getLong(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302398T0 == hashCode) {
                    try {
                        this.field_remux_success_time_stamp = cursor.getLong(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302400U0 == hashCode) {
                    try {
                        this.field_start_remux_time_stamp = cursor.getLong(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302402V0 == hashCode) {
                    try {
                        this.field_confirm_publish_video_time_stamp = cursor.getLong(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302404W0 == hashCode) {
                    try {
                        this.field_is_capture_video = cursor.getInt(i) != 0;
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302406X0 == hashCode) {
                    try {
                        this.field_is_change = cursor.getInt(i) != 0;
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302408Y0 == hashCode) {
                    try {
                        this.field_is_save_source_media = cursor.getInt(i) != 0;
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302410Z0 == hashCode) {
                    try {
                        this.field_is_sava_to_sys_album_if_media_edited = cursor.getInt(i) != 0;
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302411a1 == hashCode) {
                    try {
                        this.field_aba_target_bitrate = cursor.getInt(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302412b1 == hashCode) {
                    try {
                        this.field_source_video_rotate = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302413c1 == hashCode) {
                    try {
                        this.field_encode_target_width = cursor.getInt(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302414d1 == hashCode) {
                    try {
                        this.field_encode_target_height = cursor.getInt(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302415e1 == hashCode) {
                    try {
                        this.field_encode_video_bitrate = cursor.getInt(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302416f1 == hashCode) {
                    try {
                        this.field_encode_frame_rate = cursor.getInt(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302417g1 == hashCode) {
                    try {
                        this.field_encode_qp_switch = cursor.getInt(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302418h1 == hashCode) {
                    try {
                        this.field_video_param_preset_index = cursor.getInt(i);
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302419i1 == hashCode) {
                    try {
                        this.field_video_param_profile_index = cursor.getInt(i);
                    } catch (Throwable th28) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th28, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302420j1 == hashCode) {
                    try {
                        this.field_composition_info = cursor.getBlob(i);
                    } catch (Throwable th29) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th29, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302421k1 == hashCode) {
                    try {
                        this.field_video_param = cursor.getBlob(i);
                    } catch (Throwable th30) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th30, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302422l1 == hashCode) {
                    try {
                        this.field_sns_ext_info = cursor.getBlob(i);
                    } catch (Throwable th31) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th31, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302423m1 == hashCode) {
                    try {
                        this.field_sns_local_id = cursor.getInt(i);
                    } catch (Throwable th32) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th32, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302424n1 == hashCode) {
                    try {
                        this.field_is_sns_double_check = cursor.getInt(i);
                    } catch (Throwable th33) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th33, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302425o1 == hashCode) {
                    try {
                        this.field_is_killed_process_restart = cursor.getInt(i);
                    } catch (Throwable th34) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th34, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302427p1 == hashCode) {
                    try {
                        this.field_tec_enter_scene = cursor.getInt(i);
                    } catch (Throwable th35) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th35, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302428q1 == hashCode) {
                    try {
                        this.field_post_session_id = cursor.getString(i);
                    } catch (Throwable th36) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th36, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302429r1 == hashCode) {
                    try {
                        this.field_sns_create_time = cursor.getInt(i);
                    } catch (Throwable th37) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseBackgroundVideoInfo", th37, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302430s1 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.field_work_id == null) {
            this.field_work_id = "";
        }
        if (this.f302450d) {
            contentValues.put("work_id", this.field_work_id);
        }
        if (this.f302451e) {
            contentValues.put("work_type", Integer.valueOf(this.field_work_type));
        }
        if (this.f302452f) {
            contentValues.put("work_code", Integer.valueOf(this.field_work_code));
        }
        if (this.f302453g) {
            contentValues.put("output_video_path", this.field_output_video_path);
        }
        if (this.f302454h) {
            contentValues.put("output_thumb_path", this.field_output_thumb_path);
        }
        if (this.f302455i) {
            contentValues.put("source_video_path", this.field_source_video_path);
        }
        if (this.f302456j) {
            contentValues.put("output_video_temp_path", this.field_output_video_temp_path);
        }
        if (this.f302457n) {
            contentValues.put("output_thumb_temp_path", this.field_output_thumb_temp_path);
        }
        if (this.field_music_path == null) {
            this.field_music_path = "";
        }
        if (this.f302458o) {
            contentValues.put("music_path", this.field_music_path);
        }
        if (this.f302459p) {
            contentValues.put("confirm_remux_time_stamp", Long.valueOf(this.field_confirm_remux_time_stamp));
        }
        if (this.f302460q) {
            contentValues.put("remux_success_time_stamp", Long.valueOf(this.field_remux_success_time_stamp));
        }
        if (this.f302461r) {
            contentValues.put("start_remux_time_stamp", Long.valueOf(this.field_start_remux_time_stamp));
        }
        if (this.f302462s) {
            contentValues.put("confirm_publish_video_time_stamp", Long.valueOf(this.field_confirm_publish_video_time_stamp));
        }
        if (this.f302463t) {
            if (this.field_is_capture_video) {
                contentValues.put("is_capture_video", 1);
            } else {
                contentValues.put("is_capture_video", 0);
            }
        }
        if (this.f302464u) {
            if (this.field_is_change) {
                contentValues.put("is_change", 1);
            } else {
                contentValues.put("is_change", 0);
            }
        }
        if (this.f302465v) {
            if (this.field_is_save_source_media) {
                contentValues.put("is_save_source_media", 1);
            } else {
                contentValues.put("is_save_source_media", 0);
            }
        }
        if (this.f302466w) {
            if (this.field_is_sava_to_sys_album_if_media_edited) {
                contentValues.put("is_sava_to_sys_album_if_media_edited", 1);
            } else {
                contentValues.put("is_sava_to_sys_album_if_media_edited", 0);
            }
        }
        if (this.f302467x) {
            contentValues.put("aba_target_bitrate", Integer.valueOf(this.field_aba_target_bitrate));
        }
        if (this.f302468y) {
            contentValues.put("source_video_rotate", Integer.valueOf(this.field_source_video_rotate));
        }
        if (this.f302469z) {
            contentValues.put("encode_target_width", Integer.valueOf(this.field_encode_target_width));
        }
        if (this.f302435A) {
            contentValues.put("encode_target_height", Integer.valueOf(this.field_encode_target_height));
        }
        if (this.f302436B) {
            contentValues.put("encode_video_bitrate", Integer.valueOf(this.field_encode_video_bitrate));
        }
        if (this.f302437C) {
            contentValues.put("encode_frame_rate", Integer.valueOf(this.field_encode_frame_rate));
        }
        if (this.f302438D) {
            contentValues.put("encode_qp_switch", Integer.valueOf(this.field_encode_qp_switch));
        }
        if (this.f302439E) {
            contentValues.put("video_param_preset_index", Integer.valueOf(this.field_video_param_preset_index));
        }
        if (this.f302440F) {
            contentValues.put("video_param_profile_index", Integer.valueOf(this.field_video_param_profile_index));
        }
        if (this.f302441G) {
            contentValues.put("composition_info", this.field_composition_info);
        }
        if (this.f302442H) {
            contentValues.put("video_param", this.field_video_param);
        }
        if (this.f302443I) {
            contentValues.put("sns_ext_info", this.field_sns_ext_info);
        }
        if (this.f302444J) {
            contentValues.put("sns_local_id", Integer.valueOf(this.field_sns_local_id));
        }
        if (this.f302445K) {
            contentValues.put("is_sns_double_check", Integer.valueOf(this.field_is_sns_double_check));
        }
        if (this.f302446L) {
            contentValues.put("is_killed_process_restart", Integer.valueOf(this.field_is_killed_process_restart));
        }
        if (this.f302447M) {
            contentValues.put("tec_enter_scene", Integer.valueOf(this.field_tec_enter_scene));
        }
        if (this.field_post_session_id == null) {
            this.field_post_session_id = "";
        }
        if (this.f302448N) {
            contentValues.put("post_session_id", this.field_post_session_id);
        }
        if (this.f302449P) {
            contentValues.put("sns_create_time", Integer.valueOf(this.field_sns_create_time));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseBackgroundVideoInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS BackgroundVideoInfo ( " + f302431t1.sql + ");");
        for (String add : f302401V) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseBackgroundVideoInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("BackgroundVideoInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f302431t1, "BackgroundVideoInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseBackgroundVideoInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("BackgroundVideoInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseBackgroundVideoInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f302431t1;
    }

    public String[] getIndexCreateSQL() {
        return f302401V;
    }

    public StorageObserverOwner<C102651h0> getObserverOwner() {
        return f302432u1;
    }

    public Object getPrimaryKeyValue() {
        return this.field_work_id;
    }

    public SingleTable getTable() {
        return f302391Q;
    }

    public String getTableName() {
        return f302391Q.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("work_id")) {
            this.field_work_id = contentValues.getAsString("work_id");
            if (z) {
                this.f302450d = true;
            }
        }
        if (contentValues.containsKey("work_type")) {
            this.field_work_type = contentValues.getAsInteger("work_type").intValue();
            if (z) {
                this.f302451e = true;
            }
        }
        if (contentValues.containsKey("work_code")) {
            this.field_work_code = contentValues.getAsInteger("work_code").intValue();
            if (z) {
                this.f302452f = true;
            }
        }
        if (contentValues.containsKey("output_video_path")) {
            this.field_output_video_path = contentValues.getAsString("output_video_path");
            if (z) {
                this.f302453g = true;
            }
        }
        if (contentValues.containsKey("output_thumb_path")) {
            this.field_output_thumb_path = contentValues.getAsString("output_thumb_path");
            if (z) {
                this.f302454h = true;
            }
        }
        if (contentValues.containsKey("source_video_path")) {
            this.field_source_video_path = contentValues.getAsString("source_video_path");
            if (z) {
                this.f302455i = true;
            }
        }
        if (contentValues.containsKey("output_video_temp_path")) {
            this.field_output_video_temp_path = contentValues.getAsString("output_video_temp_path");
            if (z) {
                this.f302456j = true;
            }
        }
        if (contentValues.containsKey("output_thumb_temp_path")) {
            this.field_output_thumb_temp_path = contentValues.getAsString("output_thumb_temp_path");
            if (z) {
                this.f302457n = true;
            }
        }
        if (contentValues.containsKey("music_path")) {
            this.field_music_path = contentValues.getAsString("music_path");
            if (z) {
                this.f302458o = true;
            }
        }
        if (contentValues.containsKey("confirm_remux_time_stamp")) {
            this.field_confirm_remux_time_stamp = contentValues.getAsLong("confirm_remux_time_stamp").longValue();
            if (z) {
                this.f302459p = true;
            }
        }
        if (contentValues.containsKey("remux_success_time_stamp")) {
            this.field_remux_success_time_stamp = contentValues.getAsLong("remux_success_time_stamp").longValue();
            if (z) {
                this.f302460q = true;
            }
        }
        if (contentValues.containsKey("start_remux_time_stamp")) {
            this.field_start_remux_time_stamp = contentValues.getAsLong("start_remux_time_stamp").longValue();
            if (z) {
                this.f302461r = true;
            }
        }
        if (contentValues.containsKey("confirm_publish_video_time_stamp")) {
            this.field_confirm_publish_video_time_stamp = contentValues.getAsLong("confirm_publish_video_time_stamp").longValue();
            if (z) {
                this.f302462s = true;
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("is_capture_video")) {
            this.field_is_capture_video = contentValues.getAsInteger("is_capture_video").intValue() != 0;
            if (z) {
                this.f302463t = true;
            }
        }
        if (contentValues.containsKey("is_change")) {
            this.field_is_change = contentValues.getAsInteger("is_change").intValue() != 0;
            if (z) {
                this.f302464u = true;
            }
        }
        if (contentValues.containsKey("is_save_source_media")) {
            this.field_is_save_source_media = contentValues.getAsInteger("is_save_source_media").intValue() != 0;
            if (z) {
                this.f302465v = true;
            }
        }
        if (contentValues.containsKey("is_sava_to_sys_album_if_media_edited")) {
            if (contentValues.getAsInteger("is_sava_to_sys_album_if_media_edited").intValue() != 0) {
                z2 = true;
            }
            this.field_is_sava_to_sys_album_if_media_edited = z2;
            if (z) {
                this.f302466w = true;
            }
        }
        if (contentValues.containsKey("aba_target_bitrate")) {
            this.field_aba_target_bitrate = contentValues.getAsInteger("aba_target_bitrate").intValue();
            if (z) {
                this.f302467x = true;
            }
        }
        if (contentValues.containsKey("source_video_rotate")) {
            this.field_source_video_rotate = contentValues.getAsInteger("source_video_rotate").intValue();
            if (z) {
                this.f302468y = true;
            }
        }
        if (contentValues.containsKey("encode_target_width")) {
            this.field_encode_target_width = contentValues.getAsInteger("encode_target_width").intValue();
            if (z) {
                this.f302469z = true;
            }
        }
        if (contentValues.containsKey("encode_target_height")) {
            this.field_encode_target_height = contentValues.getAsInteger("encode_target_height").intValue();
            if (z) {
                this.f302435A = true;
            }
        }
        if (contentValues.containsKey("encode_video_bitrate")) {
            this.field_encode_video_bitrate = contentValues.getAsInteger("encode_video_bitrate").intValue();
            if (z) {
                this.f302436B = true;
            }
        }
        if (contentValues.containsKey("encode_frame_rate")) {
            this.field_encode_frame_rate = contentValues.getAsInteger("encode_frame_rate").intValue();
            if (z) {
                this.f302437C = true;
            }
        }
        if (contentValues.containsKey("encode_qp_switch")) {
            this.field_encode_qp_switch = contentValues.getAsInteger("encode_qp_switch").intValue();
            if (z) {
                this.f302438D = true;
            }
        }
        if (contentValues.containsKey("video_param_preset_index")) {
            this.field_video_param_preset_index = contentValues.getAsInteger("video_param_preset_index").intValue();
            if (z) {
                this.f302439E = true;
            }
        }
        if (contentValues.containsKey("video_param_profile_index")) {
            this.field_video_param_profile_index = contentValues.getAsInteger("video_param_profile_index").intValue();
            if (z) {
                this.f302440F = true;
            }
        }
        if (contentValues.containsKey("composition_info")) {
            this.field_composition_info = contentValues.getAsByteArray("composition_info");
            if (z) {
                this.f302441G = true;
            }
        }
        if (contentValues.containsKey("video_param")) {
            this.field_video_param = contentValues.getAsByteArray("video_param");
            if (z) {
                this.f302442H = true;
            }
        }
        if (contentValues.containsKey("sns_ext_info")) {
            this.field_sns_ext_info = contentValues.getAsByteArray("sns_ext_info");
            if (z) {
                this.f302443I = true;
            }
        }
        if (contentValues.containsKey("sns_local_id")) {
            this.field_sns_local_id = contentValues.getAsInteger("sns_local_id").intValue();
            if (z) {
                this.f302444J = true;
            }
        }
        if (contentValues.containsKey("is_sns_double_check")) {
            this.field_is_sns_double_check = contentValues.getAsInteger("is_sns_double_check").intValue();
            if (z) {
                this.f302445K = true;
            }
        }
        if (contentValues.containsKey("is_killed_process_restart")) {
            this.field_is_killed_process_restart = contentValues.getAsInteger("is_killed_process_restart").intValue();
            if (z) {
                this.f302446L = true;
            }
        }
        if (contentValues.containsKey("tec_enter_scene")) {
            this.field_tec_enter_scene = contentValues.getAsInteger("tec_enter_scene").intValue();
            if (z) {
                this.f302447M = true;
            }
        }
        if (contentValues.containsKey("post_session_id")) {
            this.field_post_session_id = contentValues.getAsString("post_session_id");
            if (z) {
                this.f302448N = true;
            }
        }
        if (contentValues.containsKey("sns_create_time")) {
            this.field_sns_create_time = contentValues.getAsInteger("sns_create_time").intValue();
            if (z) {
                this.f302449P = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
