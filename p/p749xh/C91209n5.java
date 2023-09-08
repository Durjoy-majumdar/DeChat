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
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.n5 */
public class C91209n5 extends IAutoDBItem {

    /* renamed from: D */
    public static final SingleTable f261638D;

    /* renamed from: E */
    public static final String[] f261639E = new String[0];

    /* renamed from: F */
    public static final int f261640F = 3355;

    /* renamed from: G */
    public static final int f261641G = 3575610;

    /* renamed from: H */
    public static final int f261642H = -47436342;

    /* renamed from: I */
    public static final int f261643I = 1886885691;

    /* renamed from: J */
    public static final int f261644J = -898153369;

    /* renamed from: K */
    public static final int f261645K = 852208024;

    /* renamed from: L */
    public static final int f261646L = -754157965;

    /* renamed from: M */
    public static final int f261647M = -2028139771;

    /* renamed from: N */
    public static final int f261648N = 684251083;

    /* renamed from: P */
    public static final int f261649P = 1161234575;

    /* renamed from: Q */
    public static final int f261650Q = 747805177;

    /* renamed from: Q0 */
    public static final int f261651Q0 = 108705909;

    /* renamed from: R */
    public static final int f261652R = 3079825;

    /* renamed from: R0 */
    public static final IAutoDBItem.MAutoDBInfo f261653R0 = initAutoDBInfo(C91209n5.class);

    /* renamed from: S */
    public static final int f261654S = 1307724587;

    /* renamed from: S0 */
    public static final StorageObserverOwner<C91209n5> f261655S0 = new StorageObserverOwner<>();

    /* renamed from: T */
    public static final int f261656T = -895514352;

    /* renamed from: U */
    public static final int f261657U = 321155795;

    /* renamed from: V */
    public static final int f261658V = -1616341268;

    /* renamed from: W */
    public static final int f261659W = 345449809;

    /* renamed from: X */
    public static final int f261660X = -2062150161;

    /* renamed from: Y */
    public static final int f261661Y = 1204549079;

    /* renamed from: Z */
    public static final int f261662Z = 1083065719;

    /* renamed from: p0 */
    public static final int f261663p0 = -610719393;

    /* renamed from: x0 */
    public static final int f261664x0 = 351608024;

    /* renamed from: y0 */
    public static final int f261665y0 = -754142496;

    /* renamed from: A */
    public boolean f261666A = true;

    /* renamed from: B */
    public boolean f261667B = true;

    /* renamed from: C */
    public boolean f261668C = true;

    /* renamed from: d */
    public boolean f261669d = true;

    /* renamed from: e */
    public boolean f261670e = true;

    /* renamed from: f */
    public boolean f261671f = true;
    public String field_all_heaviest_features;
    public String field_all_null_features;
    public String field_desc;
    public String field_error_on_extract_all_feature;
    public String field_error_on_predict;
    public long field_extract_time;
    public long field_happen_time;
    public String field_id;
    public boolean field_is_full_links_data_collector_finished;
    public boolean field_is_train_data_upload_finished;
    public String field_model_heaviest_features;
    public String field_model_null_features;
    public int field_positive;
    public long field_predict_time;
    public int field_predict_type;
    public float field_prediction;
    public long field_prepare_time;
    public long field_recall_time;
    public long field_time_on_extract;
    public long field_time_on_extract_all_feature;
    public long field_time_on_predict;
    public String field_type;
    public int field_version;

    /* renamed from: g */
    public boolean f261672g = true;

    /* renamed from: h */
    public boolean f261673h = true;

    /* renamed from: i */
    public boolean f261674i = true;

    /* renamed from: j */
    public boolean f261675j = true;

    /* renamed from: n */
    public boolean f261676n = true;

    /* renamed from: o */
    public boolean f261677o = true;

    /* renamed from: p */
    public boolean f261678p = true;

    /* renamed from: q */
    public boolean f261679q = true;

    /* renamed from: r */
    public boolean f261680r = true;

    /* renamed from: s */
    public boolean f261681s = true;

    /* renamed from: t */
    public boolean f261682t = true;

    /* renamed from: u */
    public boolean f261683u = true;

    /* renamed from: v */
    public boolean f261684v = true;

    /* renamed from: w */
    public boolean f261685w = true;

    /* renamed from: x */
    public boolean f261686x = true;

    /* renamed from: y */
    public boolean f261687y = true;

    /* renamed from: z */
    public boolean f261688z = true;

    static {
        SingleTable singleTable = new SingleTable("KeyNodeInfo");
        f261638D = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("id", "string", singleTable.getName(), "");
        new Column("type", "string", singleTable.getName(), "");
        new Column("happen_time", "long", singleTable.getName(), "");
        new Column("recall_time", "long", singleTable.getName(), "");
        new Column("is_train_data_upload_finished", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("is_full_links_data_collector_finished", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("predict_time", "long", singleTable.getName(), "");
        new Column("prepare_time", "long", singleTable.getName(), "");
        new Column("extract_time", "long", singleTable.getName(), "");
        new Column("prediction", "float", singleTable.getName(), "");
        new Column("positive", "int", singleTable.getName(), "");
        new Column("desc", "string", singleTable.getName(), "");
        new Column("time_on_predict", "long", singleTable.getName(), "");
        new Column("error_on_predict", "string", singleTable.getName(), "");
        new Column("time_on_extract", "long", singleTable.getName(), "");
        new Column("time_on_extract_all_feature", "long", singleTable.getName(), "");
        new Column("error_on_extract_all_feature", "string", singleTable.getName(), "");
        new Column("all_heaviest_features", "string", singleTable.getName(), "");
        new Column("all_null_features", "string", singleTable.getName(), "");
        new Column("model_heaviest_features", "string", singleTable.getName(), "");
        new Column("model_null_features", "string", singleTable.getName(), "");
        new Column(ProviderConstants.API_COLNAME_FEATURE_VERSION, "int", singleTable.getName(), "");
        new Column("predict_type", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[23];
        String[] strArr = new String[24];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "id";
        mAutoDBInfo.colsMap.put("id", "TEXT");
        mAutoDBInfo.columns[1] = "type";
        mAutoDBInfo.colsMap.put("type", "TEXT");
        mAutoDBInfo.columns[2] = "happen_time";
        mAutoDBInfo.colsMap.put("happen_time", "LONG");
        mAutoDBInfo.columns[3] = "recall_time";
        mAutoDBInfo.colsMap.put("recall_time", "LONG");
        mAutoDBInfo.columns[4] = "is_train_data_upload_finished";
        mAutoDBInfo.colsMap.put("is_train_data_upload_finished", "INTEGER default 'false' ");
        mAutoDBInfo.columns[5] = "is_full_links_data_collector_finished";
        mAutoDBInfo.colsMap.put("is_full_links_data_collector_finished", "INTEGER default 'false' ");
        mAutoDBInfo.columns[6] = "predict_time";
        mAutoDBInfo.colsMap.put("predict_time", "LONG");
        mAutoDBInfo.columns[7] = "prepare_time";
        mAutoDBInfo.colsMap.put("prepare_time", "LONG");
        mAutoDBInfo.columns[8] = "extract_time";
        mAutoDBInfo.colsMap.put("extract_time", "LONG");
        mAutoDBInfo.columns[9] = "prediction";
        mAutoDBInfo.colsMap.put("prediction", "FLOAT");
        mAutoDBInfo.columns[10] = "positive";
        mAutoDBInfo.colsMap.put("positive", "INTEGER");
        mAutoDBInfo.columns[11] = "desc";
        mAutoDBInfo.colsMap.put("desc", "TEXT");
        mAutoDBInfo.columns[12] = "time_on_predict";
        mAutoDBInfo.colsMap.put("time_on_predict", "LONG");
        mAutoDBInfo.columns[13] = "error_on_predict";
        mAutoDBInfo.colsMap.put("error_on_predict", "TEXT");
        mAutoDBInfo.columns[14] = "time_on_extract";
        mAutoDBInfo.colsMap.put("time_on_extract", "LONG");
        mAutoDBInfo.columns[15] = "time_on_extract_all_feature";
        mAutoDBInfo.colsMap.put("time_on_extract_all_feature", "LONG");
        mAutoDBInfo.columns[16] = "error_on_extract_all_feature";
        mAutoDBInfo.colsMap.put("error_on_extract_all_feature", "TEXT");
        mAutoDBInfo.columns[17] = "all_heaviest_features";
        mAutoDBInfo.colsMap.put("all_heaviest_features", "TEXT");
        mAutoDBInfo.columns[18] = "all_null_features";
        mAutoDBInfo.colsMap.put("all_null_features", "TEXT");
        mAutoDBInfo.columns[19] = "model_heaviest_features";
        mAutoDBInfo.colsMap.put("model_heaviest_features", "TEXT");
        mAutoDBInfo.columns[20] = "model_null_features";
        mAutoDBInfo.colsMap.put("model_null_features", "TEXT");
        mAutoDBInfo.columns[21] = ProviderConstants.API_COLNAME_FEATURE_VERSION;
        mAutoDBInfo.colsMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, "INTEGER");
        mAutoDBInfo.columns[22] = "predict_type";
        mAutoDBInfo.colsMap.put("predict_type", "INTEGER");
        mAutoDBInfo.columns[23] = "rowid";
        mAutoDBInfo.sql = " id TEXT,  type TEXT,  happen_time LONG,  recall_time LONG,  is_train_data_upload_finished INTEGER default 'false' ,  is_full_links_data_collector_finished INTEGER default 'false' ,  predict_time LONG,  prepare_time LONG,  extract_time LONG,  prediction FLOAT,  positive INTEGER,  desc TEXT,  time_on_predict LONG,  error_on_predict TEXT,  time_on_extract LONG,  time_on_extract_all_feature LONG,  error_on_extract_all_feature TEXT,  all_heaviest_features TEXT,  all_null_features TEXT,  model_heaviest_features TEXT,  model_null_features TEXT,  version INTEGER,  predict_type INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C91209n5)) {
            return false;
        }
        C91209n5 n5Var = (C91209n5) iAutoDBItem;
        return C46238a.m51546a(this.field_id, n5Var.field_id) && C46238a.m51546a(this.field_type, n5Var.field_type) && C46238a.m51546a(Long.valueOf(this.field_happen_time), Long.valueOf(n5Var.field_happen_time)) && C46238a.m51546a(Long.valueOf(this.field_recall_time), Long.valueOf(n5Var.field_recall_time)) && C46238a.m51546a(Boolean.valueOf(this.field_is_train_data_upload_finished), Boolean.valueOf(n5Var.field_is_train_data_upload_finished)) && C46238a.m51546a(Boolean.valueOf(this.field_is_full_links_data_collector_finished), Boolean.valueOf(n5Var.field_is_full_links_data_collector_finished)) && C46238a.m51546a(Long.valueOf(this.field_predict_time), Long.valueOf(n5Var.field_predict_time)) && C46238a.m51546a(Long.valueOf(this.field_prepare_time), Long.valueOf(n5Var.field_prepare_time)) && C46238a.m51546a(Long.valueOf(this.field_extract_time), Long.valueOf(n5Var.field_extract_time)) && C46238a.m51546a(Float.valueOf(this.field_prediction), Float.valueOf(n5Var.field_prediction)) && C46238a.m51546a(Integer.valueOf(this.field_positive), Integer.valueOf(n5Var.field_positive)) && C46238a.m51546a(this.field_desc, n5Var.field_desc) && C46238a.m51546a(Long.valueOf(this.field_time_on_predict), Long.valueOf(n5Var.field_time_on_predict)) && C46238a.m51546a(this.field_error_on_predict, n5Var.field_error_on_predict) && C46238a.m51546a(Long.valueOf(this.field_time_on_extract), Long.valueOf(n5Var.field_time_on_extract)) && C46238a.m51546a(Long.valueOf(this.field_time_on_extract_all_feature), Long.valueOf(n5Var.field_time_on_extract_all_feature)) && C46238a.m51546a(this.field_error_on_extract_all_feature, n5Var.field_error_on_extract_all_feature) && C46238a.m51546a(this.field_all_heaviest_features, n5Var.field_all_heaviest_features) && C46238a.m51546a(this.field_all_null_features, n5Var.field_all_null_features) && C46238a.m51546a(this.field_model_heaviest_features, n5Var.field_model_heaviest_features) && C46238a.m51546a(this.field_model_null_features, n5Var.field_model_null_features) && C46238a.m51546a(Integer.valueOf(this.field_version), Integer.valueOf(n5Var.field_version)) && C46238a.m51546a(Integer.valueOf(this.field_predict_type), Integer.valueOf(n5Var.field_predict_type));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f261640F == hashCode) {
                    try {
                        this.field_id = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261641G == hashCode) {
                    try {
                        this.field_type = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261642H == hashCode) {
                    try {
                        this.field_happen_time = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261643I == hashCode) {
                    try {
                        this.field_recall_time = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261644J == hashCode) {
                    try {
                        this.field_is_train_data_upload_finished = cursor.getInt(i) != 0;
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261645K == hashCode) {
                    try {
                        this.field_is_full_links_data_collector_finished = cursor.getInt(i) != 0;
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261646L == hashCode) {
                    try {
                        this.field_predict_time = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261647M == hashCode) {
                    try {
                        this.field_prepare_time = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261648N == hashCode) {
                    try {
                        this.field_extract_time = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261649P == hashCode) {
                    try {
                        this.field_prediction = cursor.getFloat(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261650Q == hashCode) {
                    try {
                        this.field_positive = cursor.getInt(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261652R == hashCode) {
                    try {
                        this.field_desc = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261654S == hashCode) {
                    try {
                        this.field_time_on_predict = cursor.getLong(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261656T == hashCode) {
                    try {
                        this.field_error_on_predict = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261657U == hashCode) {
                    try {
                        this.field_time_on_extract = cursor.getLong(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261658V == hashCode) {
                    try {
                        this.field_time_on_extract_all_feature = cursor.getLong(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261659W == hashCode) {
                    try {
                        this.field_error_on_extract_all_feature = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261660X == hashCode) {
                    try {
                        this.field_all_heaviest_features = cursor.getString(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261661Y == hashCode) {
                    try {
                        this.field_all_null_features = cursor.getString(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261662Z == hashCode) {
                    try {
                        this.field_model_heaviest_features = cursor.getString(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261663p0 == hashCode) {
                    try {
                        this.field_model_null_features = cursor.getString(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261664x0 == hashCode) {
                    try {
                        this.field_version = cursor.getInt(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261665y0 == hashCode) {
                    try {
                        this.field_predict_type = cursor.getInt(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseKeyNodeInfo", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f261651Q0 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f261669d) {
            contentValues.put("id", this.field_id);
        }
        if (this.f261670e) {
            contentValues.put("type", this.field_type);
        }
        if (this.f261671f) {
            contentValues.put("happen_time", Long.valueOf(this.field_happen_time));
        }
        if (this.f261672g) {
            contentValues.put("recall_time", Long.valueOf(this.field_recall_time));
        }
        if (this.f261673h) {
            if (this.field_is_train_data_upload_finished) {
                contentValues.put("is_train_data_upload_finished", 1);
            } else {
                contentValues.put("is_train_data_upload_finished", 0);
            }
        }
        if (this.f261674i) {
            if (this.field_is_full_links_data_collector_finished) {
                contentValues.put("is_full_links_data_collector_finished", 1);
            } else {
                contentValues.put("is_full_links_data_collector_finished", 0);
            }
        }
        if (this.f261675j) {
            contentValues.put("predict_time", Long.valueOf(this.field_predict_time));
        }
        if (this.f261676n) {
            contentValues.put("prepare_time", Long.valueOf(this.field_prepare_time));
        }
        if (this.f261677o) {
            contentValues.put("extract_time", Long.valueOf(this.field_extract_time));
        }
        if (this.f261678p) {
            contentValues.put("prediction", Float.valueOf(this.field_prediction));
        }
        if (this.f261679q) {
            contentValues.put("positive", Integer.valueOf(this.field_positive));
        }
        if (this.f261680r) {
            contentValues.put("desc", this.field_desc);
        }
        if (this.f261681s) {
            contentValues.put("time_on_predict", Long.valueOf(this.field_time_on_predict));
        }
        if (this.f261682t) {
            contentValues.put("error_on_predict", this.field_error_on_predict);
        }
        if (this.f261683u) {
            contentValues.put("time_on_extract", Long.valueOf(this.field_time_on_extract));
        }
        if (this.f261684v) {
            contentValues.put("time_on_extract_all_feature", Long.valueOf(this.field_time_on_extract_all_feature));
        }
        if (this.f261685w) {
            contentValues.put("error_on_extract_all_feature", this.field_error_on_extract_all_feature);
        }
        if (this.f261686x) {
            contentValues.put("all_heaviest_features", this.field_all_heaviest_features);
        }
        if (this.f261687y) {
            contentValues.put("all_null_features", this.field_all_null_features);
        }
        if (this.f261688z) {
            contentValues.put("model_heaviest_features", this.field_model_heaviest_features);
        }
        if (this.f261666A) {
            contentValues.put("model_null_features", this.field_model_null_features);
        }
        if (this.f261667B) {
            contentValues.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, Integer.valueOf(this.field_version));
        }
        if (this.f261668C) {
            contentValues.put("predict_type", Integer.valueOf(this.field_predict_type));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseKeyNodeInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS KeyNodeInfo ( " + f261653R0.sql + ");");
        for (String add : f261639E) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseKeyNodeInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("KeyNodeInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f261653R0, "KeyNodeInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseKeyNodeInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("KeyNodeInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseKeyNodeInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f261653R0;
    }

    public String[] getIndexCreateSQL() {
        return f261639E;
    }

    public StorageObserverOwner<C91209n5> getObserverOwner() {
        return f261655S0;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f261638D;
    }

    public String getTableName() {
        return f261638D.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("id")) {
            this.field_id = contentValues.getAsString("id");
            if (z) {
                this.f261669d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsString("type");
            if (z) {
                this.f261670e = true;
            }
        }
        if (contentValues.containsKey("happen_time")) {
            this.field_happen_time = contentValues.getAsLong("happen_time").longValue();
            if (z) {
                this.f261671f = true;
            }
        }
        if (contentValues.containsKey("recall_time")) {
            this.field_recall_time = contentValues.getAsLong("recall_time").longValue();
            if (z) {
                this.f261672g = true;
            }
        }
        boolean z2 = false;
        if (contentValues.containsKey("is_train_data_upload_finished")) {
            this.field_is_train_data_upload_finished = contentValues.getAsInteger("is_train_data_upload_finished").intValue() != 0;
            if (z) {
                this.f261673h = true;
            }
        }
        if (contentValues.containsKey("is_full_links_data_collector_finished")) {
            if (contentValues.getAsInteger("is_full_links_data_collector_finished").intValue() != 0) {
                z2 = true;
            }
            this.field_is_full_links_data_collector_finished = z2;
            if (z) {
                this.f261674i = true;
            }
        }
        if (contentValues.containsKey("predict_time")) {
            this.field_predict_time = contentValues.getAsLong("predict_time").longValue();
            if (z) {
                this.f261675j = true;
            }
        }
        if (contentValues.containsKey("prepare_time")) {
            this.field_prepare_time = contentValues.getAsLong("prepare_time").longValue();
            if (z) {
                this.f261676n = true;
            }
        }
        if (contentValues.containsKey("extract_time")) {
            this.field_extract_time = contentValues.getAsLong("extract_time").longValue();
            if (z) {
                this.f261677o = true;
            }
        }
        if (contentValues.containsKey("prediction")) {
            this.field_prediction = contentValues.getAsFloat("prediction").floatValue();
            if (z) {
                this.f261678p = true;
            }
        }
        if (contentValues.containsKey("positive")) {
            this.field_positive = contentValues.getAsInteger("positive").intValue();
            if (z) {
                this.f261679q = true;
            }
        }
        if (contentValues.containsKey("desc")) {
            this.field_desc = contentValues.getAsString("desc");
            if (z) {
                this.f261680r = true;
            }
        }
        if (contentValues.containsKey("time_on_predict")) {
            this.field_time_on_predict = contentValues.getAsLong("time_on_predict").longValue();
            if (z) {
                this.f261681s = true;
            }
        }
        if (contentValues.containsKey("error_on_predict")) {
            this.field_error_on_predict = contentValues.getAsString("error_on_predict");
            if (z) {
                this.f261682t = true;
            }
        }
        if (contentValues.containsKey("time_on_extract")) {
            this.field_time_on_extract = contentValues.getAsLong("time_on_extract").longValue();
            if (z) {
                this.f261683u = true;
            }
        }
        if (contentValues.containsKey("time_on_extract_all_feature")) {
            this.field_time_on_extract_all_feature = contentValues.getAsLong("time_on_extract_all_feature").longValue();
            if (z) {
                this.f261684v = true;
            }
        }
        if (contentValues.containsKey("error_on_extract_all_feature")) {
            this.field_error_on_extract_all_feature = contentValues.getAsString("error_on_extract_all_feature");
            if (z) {
                this.f261685w = true;
            }
        }
        if (contentValues.containsKey("all_heaviest_features")) {
            this.field_all_heaviest_features = contentValues.getAsString("all_heaviest_features");
            if (z) {
                this.f261686x = true;
            }
        }
        if (contentValues.containsKey("all_null_features")) {
            this.field_all_null_features = contentValues.getAsString("all_null_features");
            if (z) {
                this.f261687y = true;
            }
        }
        if (contentValues.containsKey("model_heaviest_features")) {
            this.field_model_heaviest_features = contentValues.getAsString("model_heaviest_features");
            if (z) {
                this.f261688z = true;
            }
        }
        if (contentValues.containsKey("model_null_features")) {
            this.field_model_null_features = contentValues.getAsString("model_null_features");
            if (z) {
                this.f261666A = true;
            }
        }
        if (contentValues.containsKey(ProviderConstants.API_COLNAME_FEATURE_VERSION)) {
            this.field_version = contentValues.getAsInteger(ProviderConstants.API_COLNAME_FEATURE_VERSION).intValue();
            if (z) {
                this.f261667B = true;
            }
        }
        if (contentValues.containsKey("predict_type")) {
            this.field_predict_type = contentValues.getAsInteger("predict_type").intValue();
            if (z) {
                this.f261668C = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
