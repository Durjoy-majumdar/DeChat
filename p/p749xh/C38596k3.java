package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;
import te3.C51044r11;
import te3.C51905x03;

/* renamed from: xh.k3 */
public class C38596k3 extends IAutoDBItem {

    /* renamed from: H */
    public static final SingleTable f102773H;

    /* renamed from: I */
    public static final String[] f102774I = new String[0];

    /* renamed from: J */
    public static final int f102775J = -592065541;

    /* renamed from: K */
    public static final int f102776K = -672734438;

    /* renamed from: L */
    public static final int f102777L = -825279545;

    /* renamed from: M */
    public static final int f102778M = 259761889;

    /* renamed from: N */
    public static final int f102779N = 1936466333;

    /* renamed from: P */
    public static final int f102780P = -356768526;

    /* renamed from: Q */
    public static final int f102781Q = 259753712;

    /* renamed from: Q0 */
    public static final int f102782Q0 = -789827607;

    /* renamed from: R */
    public static final int f102783R = 1936458156;

    /* renamed from: R0 */
    public static final int f102784R0 = -1549001753;

    /* renamed from: S */
    public static final int f102785S = 849368202;

    /* renamed from: S0 */
    public static final int f102786S0 = 761309736;

    /* renamed from: T */
    public static final int f102787T = 3373707;

    /* renamed from: T0 */
    public static final int f102788T0 = -1724546052;

    /* renamed from: U */
    public static final int f102789U = 106934601;

    /* renamed from: U0 */
    public static final int f102790U0 = -255654404;

    /* renamed from: V */
    public static final int f102791V = 869112476;

    /* renamed from: V0 */
    public static final int f102792V0 = -1281291398;

    /* renamed from: W */
    public static final int f102793W = 3145580;

    /* renamed from: W0 */
    public static final int f102794W0 = -1011896442;

    /* renamed from: X */
    public static final int f102795X = 109757585;

    /* renamed from: X0 */
    public static final int f102796X0 = -1118159479;

    /* renamed from: Y */
    public static final int f102797Y = 550112642;

    /* renamed from: Y0 */
    public static final int f102798Y0 = 108705909;

    /* renamed from: Z */
    public static final int f102799Z = 1673556884;

    /* renamed from: Z0 */
    public static final IAutoDBItem.MAutoDBInfo f102800Z0 = initAutoDBInfo(C38596k3.class);

    /* renamed from: a1 */
    public static final StorageObserverOwner<C38596k3> f102801a1 = new StorageObserverOwner<>();

    /* renamed from: p0 */
    public static final int f102802p0 = 1673548707;

    /* renamed from: x0 */
    public static final int f102803x0 = -1582021697;

    /* renamed from: y0 */
    public static final int f102804y0 = -662649091;

    /* renamed from: A */
    public boolean f102805A = true;

    /* renamed from: B */
    public boolean f102806B = true;

    /* renamed from: C */
    public boolean f102807C = true;

    /* renamed from: D */
    public boolean f102808D = true;

    /* renamed from: E */
    public boolean f102809E = true;

    /* renamed from: F */
    public boolean f102810F = true;

    /* renamed from: G */
    public boolean f102811G = true;

    /* renamed from: d */
    public boolean f102812d = true;

    /* renamed from: e */
    public boolean f102813e = true;

    /* renamed from: f */
    public boolean f102814f = true;
    public String field_animationPagMd5;
    public String field_animationPagUrl;
    public C51044r11 field_batchConfigLive;
    public int field_businessType;
    public byte[] field_customInfo;
    public String field_description;
    public boolean field_disableCombo;
    public int field_flag;
    public int field_giftIndex;
    public int field_giftType;
    public int field_globalUnlockLevel;
    public FinderJumpInfo field_jumpInfo;
    public String field_landscapePagMd5;
    public String field_landscapePagUrl;
    public C51905x03 field_multiAnimationList;
    public String field_name;
    public int field_needUnlock;
    public String field_previewPagMd5;
    public String field_previewPagUrl;
    public float field_price;
    public String field_rewardProductId;
    public int field_state;
    public String field_tagColor;
    public String field_tagText;
    public String field_thumbnailFileUrl;
    public String field_thumbnailMd5;
    public int field_unlockIntimacyLevel;

    /* renamed from: g */
    public boolean f102815g = true;

    /* renamed from: h */
    public boolean f102816h = true;

    /* renamed from: i */
    public boolean f102817i = true;

    /* renamed from: j */
    public boolean f102818j = true;

    /* renamed from: n */
    public boolean f102819n = true;

    /* renamed from: o */
    public boolean f102820o = true;

    /* renamed from: p */
    public boolean f102821p = true;

    /* renamed from: q */
    public boolean f102822q = true;

    /* renamed from: r */
    public boolean f102823r = true;

    /* renamed from: s */
    public boolean f102824s = true;

    /* renamed from: t */
    public boolean f102825t = true;

    /* renamed from: u */
    public boolean f102826u = true;

    /* renamed from: v */
    public boolean f102827v = true;

    /* renamed from: w */
    public boolean f102828w = true;

    /* renamed from: x */
    public boolean f102829x = true;

    /* renamed from: y */
    public boolean f102830y = true;

    /* renamed from: z */
    public boolean f102831z = true;

    static {
        SingleTable singleTable = new SingleTable("FinderLiveGiftInfo");
        f102773H = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("rewardProductId", "string", singleTable.getName(), "");
        new Column("businessType", "int", singleTable.getName(), "");
        new Column("thumbnailFileUrl", "string", singleTable.getName(), "");
        new Column("previewPagUrl", "string", singleTable.getName(), "");
        new Column("animationPagUrl", "string", singleTable.getName(), "");
        new Column("thumbnailMd5", "string", singleTable.getName(), "");
        new Column("previewPagMd5", "string", singleTable.getName(), "");
        new Column("animationPagMd5", "string", singleTable.getName(), "");
        new Column("giftType", "int", singleTable.getName(), "");
        new Column("name", "string", singleTable.getName(), "");
        new Column(FirebaseAnalytics.C113379b.PRICE, "float", singleTable.getName(), "");
        new Column("unlockIntimacyLevel", "int", singleTable.getName(), "");
        new Column("flag", "int", singleTable.getName(), "");
        new Column("state", "int", singleTable.getName(), "");
        new Column("giftIndex", "int", singleTable.getName(), "");
        new Column("landscapePagUrl", "string", singleTable.getName(), "");
        new Column("landscapePagMd5", "string", singleTable.getName(), "");
        new Column("customInfo", "byte[]", singleTable.getName(), "");
        new Column("globalUnlockLevel", "int", singleTable.getName(), "");
        new Column("tagColor", "string", singleTable.getName(), "");
        new Column("tagText", "string", singleTable.getName(), "");
        new Column("batchConfigLive", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderLiveGiftBatchGiveConfigList");
        new Column("description", "string", singleTable.getName(), "");
        new Column("jumpInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.FinderJumpInfo");
        new Column("needUnlock", "int", singleTable.getName(), "");
        new Column("disableCombo", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("multiAnimationList", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.MultiAnimationItemList");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[27];
        String[] strArr = new String[28];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "rewardProductId";
        mAutoDBInfo.colsMap.put("rewardProductId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "rewardProductId";
        mAutoDBInfo.columns[1] = "businessType";
        mAutoDBInfo.colsMap.put("businessType", "INTEGER default '' ");
        mAutoDBInfo.columns[2] = "thumbnailFileUrl";
        mAutoDBInfo.colsMap.put("thumbnailFileUrl", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "previewPagUrl";
        mAutoDBInfo.colsMap.put("previewPagUrl", "TEXT default '' ");
        mAutoDBInfo.columns[4] = "animationPagUrl";
        mAutoDBInfo.colsMap.put("animationPagUrl", "TEXT default '' ");
        mAutoDBInfo.columns[5] = "thumbnailMd5";
        mAutoDBInfo.colsMap.put("thumbnailMd5", "TEXT default '' ");
        mAutoDBInfo.columns[6] = "previewPagMd5";
        mAutoDBInfo.colsMap.put("previewPagMd5", "TEXT default '' ");
        mAutoDBInfo.columns[7] = "animationPagMd5";
        mAutoDBInfo.colsMap.put("animationPagMd5", "TEXT default '' ");
        mAutoDBInfo.columns[8] = "giftType";
        mAutoDBInfo.colsMap.put("giftType", "INTEGER default '' ");
        mAutoDBInfo.columns[9] = "name";
        mAutoDBInfo.colsMap.put("name", "TEXT default '' ");
        mAutoDBInfo.columns[10] = FirebaseAnalytics.C113379b.PRICE;
        mAutoDBInfo.colsMap.put(FirebaseAnalytics.C113379b.PRICE, "FLOAT");
        mAutoDBInfo.columns[11] = "unlockIntimacyLevel";
        mAutoDBInfo.colsMap.put("unlockIntimacyLevel", "INTEGER");
        mAutoDBInfo.columns[12] = "flag";
        mAutoDBInfo.colsMap.put("flag", "INTEGER");
        mAutoDBInfo.columns[13] = "state";
        mAutoDBInfo.colsMap.put("state", "INTEGER");
        mAutoDBInfo.columns[14] = "giftIndex";
        mAutoDBInfo.colsMap.put("giftIndex", "INTEGER");
        mAutoDBInfo.columns[15] = "landscapePagUrl";
        mAutoDBInfo.colsMap.put("landscapePagUrl", "TEXT default '' ");
        mAutoDBInfo.columns[16] = "landscapePagMd5";
        mAutoDBInfo.colsMap.put("landscapePagMd5", "TEXT default '' ");
        mAutoDBInfo.columns[17] = "customInfo";
        mAutoDBInfo.colsMap.put("customInfo", "BLOB");
        mAutoDBInfo.columns[18] = "globalUnlockLevel";
        mAutoDBInfo.colsMap.put("globalUnlockLevel", "INTEGER");
        mAutoDBInfo.columns[19] = "tagColor";
        mAutoDBInfo.colsMap.put("tagColor", "TEXT default '' ");
        mAutoDBInfo.columns[20] = "tagText";
        mAutoDBInfo.colsMap.put("tagText", "TEXT default '' ");
        mAutoDBInfo.columns[21] = "batchConfigLive";
        mAutoDBInfo.colsMap.put("batchConfigLive", "BLOB");
        mAutoDBInfo.columns[22] = "description";
        mAutoDBInfo.colsMap.put("description", "TEXT default '' ");
        mAutoDBInfo.columns[23] = "jumpInfo";
        mAutoDBInfo.colsMap.put("jumpInfo", "BLOB");
        mAutoDBInfo.columns[24] = "needUnlock";
        mAutoDBInfo.colsMap.put("needUnlock", "INTEGER");
        mAutoDBInfo.columns[25] = "disableCombo";
        mAutoDBInfo.colsMap.put("disableCombo", "INTEGER default 'false' ");
        mAutoDBInfo.columns[26] = "multiAnimationList";
        mAutoDBInfo.colsMap.put("multiAnimationList", "BLOB");
        mAutoDBInfo.columns[27] = "rowid";
        mAutoDBInfo.sql = " rewardProductId TEXT PRIMARY KEY ,  businessType INTEGER default '' ,  thumbnailFileUrl TEXT default '' ,  previewPagUrl TEXT default '' ,  animationPagUrl TEXT default '' ,  thumbnailMd5 TEXT default '' ,  previewPagMd5 TEXT default '' ,  animationPagMd5 TEXT default '' ,  giftType INTEGER default '' ,  name TEXT default '' ,  price FLOAT,  unlockIntimacyLevel INTEGER,  flag INTEGER,  state INTEGER,  giftIndex INTEGER,  landscapePagUrl TEXT default '' ,  landscapePagMd5 TEXT default '' ,  customInfo BLOB,  globalUnlockLevel INTEGER,  tagColor TEXT default '' ,  tagText TEXT default '' ,  batchConfigLive BLOB,  description TEXT default '' ,  jumpInfo BLOB,  needUnlock INTEGER,  disableCombo INTEGER default 'false' ,  multiAnimationList BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38596k3)) {
            return false;
        }
        C38596k3 k3Var = (C38596k3) iAutoDBItem;
        return C46238a.m51546a(this.field_rewardProductId, k3Var.field_rewardProductId) && C46238a.m51546a(Integer.valueOf(this.field_businessType), Integer.valueOf(k3Var.field_businessType)) && C46238a.m51546a(this.field_thumbnailFileUrl, k3Var.field_thumbnailFileUrl) && C46238a.m51546a(this.field_previewPagUrl, k3Var.field_previewPagUrl) && C46238a.m51546a(this.field_animationPagUrl, k3Var.field_animationPagUrl) && C46238a.m51546a(this.field_thumbnailMd5, k3Var.field_thumbnailMd5) && C46238a.m51546a(this.field_previewPagMd5, k3Var.field_previewPagMd5) && C46238a.m51546a(this.field_animationPagMd5, k3Var.field_animationPagMd5) && C46238a.m51546a(Integer.valueOf(this.field_giftType), Integer.valueOf(k3Var.field_giftType)) && C46238a.m51546a(this.field_name, k3Var.field_name) && C46238a.m51546a(Float.valueOf(this.field_price), Float.valueOf(k3Var.field_price)) && C46238a.m51546a(Integer.valueOf(this.field_unlockIntimacyLevel), Integer.valueOf(k3Var.field_unlockIntimacyLevel)) && C46238a.m51546a(Integer.valueOf(this.field_flag), Integer.valueOf(k3Var.field_flag)) && C46238a.m51546a(Integer.valueOf(this.field_state), Integer.valueOf(k3Var.field_state)) && C46238a.m51546a(Integer.valueOf(this.field_giftIndex), Integer.valueOf(k3Var.field_giftIndex)) && C46238a.m51546a(this.field_landscapePagUrl, k3Var.field_landscapePagUrl) && C46238a.m51546a(this.field_landscapePagMd5, k3Var.field_landscapePagMd5) && C46238a.m51546a(this.field_customInfo, k3Var.field_customInfo) && C46238a.m51546a(Integer.valueOf(this.field_globalUnlockLevel), Integer.valueOf(k3Var.field_globalUnlockLevel)) && C46238a.m51546a(this.field_tagColor, k3Var.field_tagColor) && C46238a.m51546a(this.field_tagText, k3Var.field_tagText) && C46238a.m51546a(this.field_batchConfigLive, k3Var.field_batchConfigLive) && C46238a.m51546a(this.field_description, k3Var.field_description) && C46238a.m51546a(this.field_jumpInfo, k3Var.field_jumpInfo) && C46238a.m51546a(Integer.valueOf(this.field_needUnlock), Integer.valueOf(k3Var.field_needUnlock)) && C46238a.m51546a(Boolean.valueOf(this.field_disableCombo), Boolean.valueOf(k3Var.field_disableCombo)) && C46238a.m51546a(this.field_multiAnimationList, k3Var.field_multiAnimationList);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102775J == hashCode) {
                    try {
                        this.field_rewardProductId = cursor.getString(i);
                        this.f102812d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102776K == hashCode) {
                    try {
                        this.field_businessType = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102777L == hashCode) {
                    try {
                        this.field_thumbnailFileUrl = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102778M == hashCode) {
                    try {
                        this.field_previewPagUrl = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102779N == hashCode) {
                    try {
                        this.field_animationPagUrl = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102780P == hashCode) {
                    try {
                        this.field_thumbnailMd5 = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102781Q == hashCode) {
                    try {
                        this.field_previewPagMd5 = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102783R == hashCode) {
                    try {
                        this.field_animationPagMd5 = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102785S == hashCode) {
                    try {
                        this.field_giftType = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102787T == hashCode) {
                    try {
                        this.field_name = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102789U == hashCode) {
                    try {
                        this.field_price = cursor.getFloat(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102791V == hashCode) {
                    try {
                        this.field_unlockIntimacyLevel = cursor.getInt(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102793W == hashCode) {
                    try {
                        this.field_flag = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102795X == hashCode) {
                    try {
                        this.field_state = cursor.getInt(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102797Y == hashCode) {
                    try {
                        this.field_giftIndex = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102799Z == hashCode) {
                    try {
                        this.field_landscapePagUrl = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102802p0 == hashCode) {
                    try {
                        this.field_landscapePagMd5 = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102803x0 == hashCode) {
                    try {
                        this.field_customInfo = cursor.getBlob(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102804y0 == hashCode) {
                    try {
                        this.field_globalUnlockLevel = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102782Q0 == hashCode) {
                    try {
                        this.field_tagColor = cursor.getString(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102784R0 == hashCode) {
                    try {
                        this.field_tagText = cursor.getString(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102786S0 == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_batchConfigLive = (C51044r11) new C51044r11().parseFrom(blob);
                        }
                    } catch (Throwable th24) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102788T0 == hashCode) {
                    try {
                        this.field_description = cursor.getString(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102790U0 == hashCode) {
                    try {
                        byte[] blob2 = cursor.getBlob(i);
                        if (blob2 != null && blob2.length > 0) {
                            this.field_jumpInfo = (FinderJumpInfo) new FinderJumpInfo().parseFrom(blob2);
                        }
                    } catch (Throwable th26) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th26, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102792V0 == hashCode) {
                    try {
                        this.field_needUnlock = cursor.getInt(i);
                    } catch (Throwable th27) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th27, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102794W0 == hashCode) {
                    try {
                        this.field_disableCombo = cursor.getInt(i) != 0;
                    } catch (Throwable th28) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th28, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102796X0 == hashCode) {
                    try {
                        byte[] blob3 = cursor.getBlob(i);
                        if (blob3 != null && blob3.length > 0) {
                            this.field_multiAnimationList = (C51905x03) new C51905x03().parseFrom(blob3);
                        }
                    } catch (Throwable th29) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveGiftInfo", th29, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102798Y0 == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C51905x03 x032;
        FinderJumpInfo finderJumpInfo;
        C51044r11 r112;
        ContentValues contentValues = new ContentValues();
        if (this.f102812d) {
            contentValues.put("rewardProductId", this.field_rewardProductId);
        }
        if (this.f102813e) {
            contentValues.put("businessType", Integer.valueOf(this.field_businessType));
        }
        if (this.field_thumbnailFileUrl == null) {
            this.field_thumbnailFileUrl = "";
        }
        if (this.f102814f) {
            contentValues.put("thumbnailFileUrl", this.field_thumbnailFileUrl);
        }
        if (this.field_previewPagUrl == null) {
            this.field_previewPagUrl = "";
        }
        if (this.f102815g) {
            contentValues.put("previewPagUrl", this.field_previewPagUrl);
        }
        if (this.field_animationPagUrl == null) {
            this.field_animationPagUrl = "";
        }
        if (this.f102816h) {
            contentValues.put("animationPagUrl", this.field_animationPagUrl);
        }
        if (this.field_thumbnailMd5 == null) {
            this.field_thumbnailMd5 = "";
        }
        if (this.f102817i) {
            contentValues.put("thumbnailMd5", this.field_thumbnailMd5);
        }
        if (this.field_previewPagMd5 == null) {
            this.field_previewPagMd5 = "";
        }
        if (this.f102818j) {
            contentValues.put("previewPagMd5", this.field_previewPagMd5);
        }
        if (this.field_animationPagMd5 == null) {
            this.field_animationPagMd5 = "";
        }
        if (this.f102819n) {
            contentValues.put("animationPagMd5", this.field_animationPagMd5);
        }
        if (this.f102820o) {
            contentValues.put("giftType", Integer.valueOf(this.field_giftType));
        }
        if (this.field_name == null) {
            this.field_name = "";
        }
        if (this.f102821p) {
            contentValues.put("name", this.field_name);
        }
        if (this.f102822q) {
            contentValues.put(FirebaseAnalytics.C113379b.PRICE, Float.valueOf(this.field_price));
        }
        if (this.f102823r) {
            contentValues.put("unlockIntimacyLevel", Integer.valueOf(this.field_unlockIntimacyLevel));
        }
        if (this.f102824s) {
            contentValues.put("flag", Integer.valueOf(this.field_flag));
        }
        if (this.f102825t) {
            contentValues.put("state", Integer.valueOf(this.field_state));
        }
        if (this.f102826u) {
            contentValues.put("giftIndex", Integer.valueOf(this.field_giftIndex));
        }
        if (this.field_landscapePagUrl == null) {
            this.field_landscapePagUrl = "";
        }
        if (this.f102827v) {
            contentValues.put("landscapePagUrl", this.field_landscapePagUrl);
        }
        if (this.field_landscapePagMd5 == null) {
            this.field_landscapePagMd5 = "";
        }
        if (this.f102828w) {
            contentValues.put("landscapePagMd5", this.field_landscapePagMd5);
        }
        if (this.f102829x) {
            contentValues.put("customInfo", this.field_customInfo);
        }
        if (this.f102830y) {
            contentValues.put("globalUnlockLevel", Integer.valueOf(this.field_globalUnlockLevel));
        }
        if (this.field_tagColor == null) {
            this.field_tagColor = "";
        }
        if (this.f102831z) {
            contentValues.put("tagColor", this.field_tagColor);
        }
        if (this.field_tagText == null) {
            this.field_tagText = "";
        }
        if (this.f102805A) {
            contentValues.put("tagText", this.field_tagText);
        }
        if (this.f102806B && (r112 = this.field_batchConfigLive) != null) {
            try {
                contentValues.put("batchConfigLive", r112.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseFinderLiveGiftInfo", e.getMessage());
            }
        }
        if (this.field_description == null) {
            this.field_description = "";
        }
        if (this.f102807C) {
            contentValues.put("description", this.field_description);
        }
        if (this.f102808D && (finderJumpInfo = this.field_jumpInfo) != null) {
            try {
                contentValues.put("jumpInfo", finderJumpInfo.toByteArray());
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseFinderLiveGiftInfo", e2.getMessage());
            }
        }
        if (this.f102809E) {
            contentValues.put("needUnlock", Integer.valueOf(this.field_needUnlock));
        }
        if (this.f102810F) {
            if (this.field_disableCombo) {
                contentValues.put("disableCombo", 1);
            } else {
                contentValues.put("disableCombo", 0);
            }
        }
        if (this.f102811G && (x032 = this.field_multiAnimationList) != null) {
            try {
                contentValues.put("multiAnimationList", x032.toByteArray());
            } catch (IOException e3) {
                Log.m105920e("MicroMsg.SDK.BaseFinderLiveGiftInfo", e3.getMessage());
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
            Log.m105920e("MicroMsg.SDK.BaseFinderLiveGiftInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderLiveGiftInfo ( " + f102800Z0.sql + ");");
        for (String add : f102774I) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLiveGiftInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderLiveGiftInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102800Z0, "FinderLiveGiftInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLiveGiftInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderLiveGiftInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderLiveGiftInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102800Z0;
    }

    public String[] getIndexCreateSQL() {
        return f102774I;
    }

    public StorageObserverOwner<C38596k3> getObserverOwner() {
        return f102801a1;
    }

    public Object getPrimaryKeyValue() {
        return this.field_rewardProductId;
    }

    public SingleTable getTable() {
        return f102773H;
    }

    public String getTableName() {
        return f102773H.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("rewardProductId")) {
            this.field_rewardProductId = contentValues.getAsString("rewardProductId");
            if (z) {
                this.f102812d = true;
            }
        }
        if (contentValues.containsKey("businessType")) {
            this.field_businessType = contentValues.getAsInteger("businessType").intValue();
            if (z) {
                this.f102813e = true;
            }
        }
        if (contentValues.containsKey("thumbnailFileUrl")) {
            this.field_thumbnailFileUrl = contentValues.getAsString("thumbnailFileUrl");
            if (z) {
                this.f102814f = true;
            }
        }
        if (contentValues.containsKey("previewPagUrl")) {
            this.field_previewPagUrl = contentValues.getAsString("previewPagUrl");
            if (z) {
                this.f102815g = true;
            }
        }
        if (contentValues.containsKey("animationPagUrl")) {
            this.field_animationPagUrl = contentValues.getAsString("animationPagUrl");
            if (z) {
                this.f102816h = true;
            }
        }
        if (contentValues.containsKey("thumbnailMd5")) {
            this.field_thumbnailMd5 = contentValues.getAsString("thumbnailMd5");
            if (z) {
                this.f102817i = true;
            }
        }
        if (contentValues.containsKey("previewPagMd5")) {
            this.field_previewPagMd5 = contentValues.getAsString("previewPagMd5");
            if (z) {
                this.f102818j = true;
            }
        }
        if (contentValues.containsKey("animationPagMd5")) {
            this.field_animationPagMd5 = contentValues.getAsString("animationPagMd5");
            if (z) {
                this.f102819n = true;
            }
        }
        if (contentValues.containsKey("giftType")) {
            this.field_giftType = contentValues.getAsInteger("giftType").intValue();
            if (z) {
                this.f102820o = true;
            }
        }
        if (contentValues.containsKey("name")) {
            this.field_name = contentValues.getAsString("name");
            if (z) {
                this.f102821p = true;
            }
        }
        if (contentValues.containsKey(FirebaseAnalytics.C113379b.PRICE)) {
            this.field_price = contentValues.getAsFloat(FirebaseAnalytics.C113379b.PRICE).floatValue();
            if (z) {
                this.f102822q = true;
            }
        }
        if (contentValues.containsKey("unlockIntimacyLevel")) {
            this.field_unlockIntimacyLevel = contentValues.getAsInteger("unlockIntimacyLevel").intValue();
            if (z) {
                this.f102823r = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsInteger("flag").intValue();
            if (z) {
                this.f102824s = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z) {
                this.f102825t = true;
            }
        }
        if (contentValues.containsKey("giftIndex")) {
            this.field_giftIndex = contentValues.getAsInteger("giftIndex").intValue();
            if (z) {
                this.f102826u = true;
            }
        }
        if (contentValues.containsKey("landscapePagUrl")) {
            this.field_landscapePagUrl = contentValues.getAsString("landscapePagUrl");
            if (z) {
                this.f102827v = true;
            }
        }
        if (contentValues.containsKey("landscapePagMd5")) {
            this.field_landscapePagMd5 = contentValues.getAsString("landscapePagMd5");
            if (z) {
                this.f102828w = true;
            }
        }
        if (contentValues.containsKey("customInfo")) {
            this.field_customInfo = contentValues.getAsByteArray("customInfo");
            if (z) {
                this.f102829x = true;
            }
        }
        if (contentValues.containsKey("globalUnlockLevel")) {
            this.field_globalUnlockLevel = contentValues.getAsInteger("globalUnlockLevel").intValue();
            if (z) {
                this.f102830y = true;
            }
        }
        if (contentValues.containsKey("tagColor")) {
            this.field_tagColor = contentValues.getAsString("tagColor");
            if (z) {
                this.f102831z = true;
            }
        }
        if (contentValues.containsKey("tagText")) {
            this.field_tagText = contentValues.getAsString("tagText");
            if (z) {
                this.f102805A = true;
            }
        }
        if (contentValues.containsKey("batchConfigLive")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("batchConfigLive");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_batchConfigLive = (C51044r11) new C51044r11().parseFrom(asByteArray);
                    if (z) {
                        this.f102806B = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseFinderLiveGiftInfo", e.getMessage());
            }
        }
        if (contentValues.containsKey("description")) {
            this.field_description = contentValues.getAsString("description");
            if (z) {
                this.f102807C = true;
            }
        }
        if (contentValues.containsKey("jumpInfo")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("jumpInfo");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.field_jumpInfo = (FinderJumpInfo) new FinderJumpInfo().parseFrom(asByteArray2);
                    if (z) {
                        this.f102808D = true;
                    }
                }
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.SDK.BaseFinderLiveGiftInfo", e2.getMessage());
            }
        }
        if (contentValues.containsKey("needUnlock")) {
            this.field_needUnlock = contentValues.getAsInteger("needUnlock").intValue();
            if (z) {
                this.f102809E = true;
            }
        }
        if (contentValues.containsKey("disableCombo")) {
            this.field_disableCombo = contentValues.getAsInteger("disableCombo").intValue() != 0;
            if (z) {
                this.f102810F = true;
            }
        }
        if (contentValues.containsKey("multiAnimationList")) {
            try {
                byte[] asByteArray3 = contentValues.getAsByteArray("multiAnimationList");
                if (asByteArray3 != null && asByteArray3.length > 0) {
                    this.field_multiAnimationList = (C51905x03) new C51905x03().parseFrom(asByteArray3);
                    if (z) {
                        this.f102811G = true;
                    }
                }
            } catch (IOException e3) {
                Log.m105920e("MicroMsg.SDK.BaseFinderLiveGiftInfo", e3.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
