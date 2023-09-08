package t72;

import a70.C112760b;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Debug;
import android.os.PowerManager;
import android.os.Process;
import android.os.StatFs;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.report.kvdata.HeavyDetailInfo;
import com.tencent.p014mm.plugin.report.kvdata.SDStatusInfo;
import com.tencent.p014mm.plugin.report.kvdata.SubDirInfo;
import com.tencent.p014mm.plugin.report.kvdata.WeChatSDInfo;
import com.tencent.p014mm.plugin.report.kvdata.log_14375;
import com.tencent.p014mm.plugin.report.service.C115666i;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.SdcardUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.util.FrequentLimiter;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Pattern;
import kj2.C117407d;
import lu3.C88654b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1071ae.C112785a;
import p1071ae.a$$c;
import p206nj.C88956h;
import p212oe.C117750b;
import p933be.C113173i;
import t72.C118387c;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: t72.i */
public class C118391i extends C86301e {

    /* renamed from: C */
    public static final long f353822C = System.currentTimeMillis();

    /* renamed from: D */
    public static final /* synthetic */ int f353823D = 0;

    /* renamed from: A */
    public MTimerHandler f353824A = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C118394d(), true);

    /* renamed from: B */
    public MTimerHandler f353825B = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C77875e(this), true);

    /* renamed from: d */
    public long f353826d = 4096;

    /* renamed from: e */
    public long f353827e = 30;

    /* renamed from: f */
    public long f353828f = 1536;

    /* renamed from: g */
    public long f353829g = 300000;

    /* renamed from: h */
    public long f353830h = 1000;

    /* renamed from: i */
    public long f353831i = 25000;

    /* renamed from: j */
    public long f353832j = 200;

    /* renamed from: n */
    public long f353833n = 256;

    /* renamed from: o */
    public long f353834o = 1440;

    /* renamed from: p */
    public long f353835p = 1;

    /* renamed from: q */
    public long f353836q = 1440;

    /* renamed from: r */
    public BroadcastReceiver f353837r;

    /* renamed from: s */
    public boolean f353838s = false;

    /* renamed from: t */
    public boolean f353839t = true;

    /* renamed from: u */
    public long f353840u = 0;

    /* renamed from: v */
    public C88654b f353841v;

    /* renamed from: w */
    public C118387c.C118388a f353842w;

    /* renamed from: x */
    public long f353843x = 0;

    /* renamed from: y */
    public C88654b f353844y = new C118392b();

    /* renamed from: z */
    public C88654b f353845z = new C118393c();

    /* renamed from: t72.i$e */
    public class C77875e implements MTimerHandler.CallBack {

        /* renamed from: t72.i$e$a */
        public class C77876a implements Runnable {
            public C77876a(C77875e eVar) {
            }

            public void run() {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_NEWER_RED_FLAVOR_URL_STRING, "");
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_HAS_SHOW_NEWER_RED_FLAVOR_BOOLEAN, Boolean.FALSE);
            }
        }

        public C77875e(C118391i iVar) {
        }

        public boolean onTimerExpired() {
            ((C119157j) C119157j.f356862d).mo183876g(new C77876a(this), "name_thread_get_newer_flavor_red");
            return true;
        }
    }

    /* renamed from: t72.i$a */
    public class C90381a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f259392d;

        /* renamed from: e */
        public final /* synthetic */ C72994y1.C72995a f259393e;

        /* renamed from: f */
        public final /* synthetic */ long f259394f;

        public C90381a(long j, C72994y1.C72995a aVar, long j2) {
            this.f259392d = j;
            this.f259393e = aVar;
            this.f259394f = j2;
        }

        public void run() {
            if (C86709a0.m107522a()) {
                CrashReportFactory.setHeavyUserFlag(this.f259392d);
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_HEAVY_USER_FLAG_LONG, Long.valueOf(this.f259392d));
                if (this.f259393e != null) {
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(this.f259393e, Long.valueOf(this.f259394f));
                }
                Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv resetHeavyUser heavyUser[%d, %d], fkey[%s], value[%d]", Long.valueOf(this.f259392d), Long.valueOf(C118391i.this.f353843x), this.f259393e, Long.valueOf(this.f259394f));
            }
        }
    }

    /* renamed from: t72.i$b */
    public class C118392b extends C88654b {
        public C118392b() {
        }

        public String getKey() {
            return "reportAllRunnable";
        }

        public void run() {
            C118391i iVar;
            long decodeLong;
            long decodeInt;
            int i;
            long j;
            long decodeLong2;
            long decodeInt2;
            int i2;
            long j2;
            Log.m105924i("MicroMsg.SubCoreBaseMonitor", "summerhv reportAllRunnable run");
            if (!C86709a0.m107522a()) {
                Log.m105928w("MicroMsg.SubCoreBaseMonitor", "account has not initalized!");
                return;
            }
            C118391i.this.Ax0();
            synchronized (C118391i.this) {
                if (System.currentTimeMillis() - MultiProcessMMKV.getDefault().getLong("report_duplicate_file_report_time", 0) >= 259200000) {
                    Log.m105924i("MicroMsg.SubCoreBaseMonitor", "reportDuplicateFile");
                    String string = MultiProcessMMKV.getDefault().getString("DuplicateFileDailyReport", "");
                    if (string != null && !string.isEmpty()) {
                        try {
                            JSONObject jSONObject = new JSONObject(string);
                            boolean has = jSONObject.has("v3");
                            long j3 = jSONObject.getLong("allFileSize");
                            long j4 = jSONObject.getLong("image2DuplicateFileDiskSpace");
                            long j5 = jSONObject.getLong("videoDuplicateFileDiskSpace");
                            long j6 = jSONObject.getLong("voice2DuplicateFileDiskSpace");
                            long j7 = jSONObject.getLong("recordDuplicateFileDiskSpace");
                            long j8 = jSONObject.getLong("allDuplicatedFileSize");
                            long j9 = (long) jSONObject.getInt("fileSizeRatio");
                            long j15 = jSONObject.getLong("openapiDuplicateFileDiskSpace");
                            long j16 = jSONObject.getLong("attachmentDuplicateFileDiskSpace");
                            long j17 = jSONObject.getLong("emulatedDuplicateFileDiskSpace");
                            long j18 = jSONObject.getLong("favoriteDuplicateFileDiskSpace");
                            long j19 = jSONObject.getLong("allDuplicatedDiskSpace");
                            long j25 = (long) jSONObject.getInt("fileDiskSpaceRatio");
                            long j26 = jSONObject.getLong("downloadDuplicateFileDiskSpace");
                            long j27 = jSONObject.getLong("otherDuplicateFileDiskSpace");
                            long j28 = jSONObject.getLong("wechatTotalSize");
                            long j29 = (long) jSONObject.getInt("fileDiskSpaceWechatRatio");
                            long j35 = jSONObject.getLong("allDuplicatedFileCount");
                            String str = "DuplicateFileDaily-v2";
                            if (has) {
                                str = "DuplicateFileDaily-v3";
                            }
                            C117407d.INSTANCE.mo160131h(25355, str, Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7), Long.valueOf(j8), Long.valueOf(j9), Long.valueOf(j15), Long.valueOf(j16), Long.valueOf(j17), Long.valueOf(j18), Long.valueOf(j19), Long.valueOf(j25), Long.valueOf(j26), Long.valueOf(j27), Long.valueOf(j28), Long.valueOf(j29), Long.valueOf(j35), 0, Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7));
                        } catch (JSONException e) {
                            Log.m105920e("MicroMsg.SubCoreBaseMonitor", "duplicateFileString jsonArray Failed, e = " + e.getMessage());
                        }
                    }
                    MultiProcessMMKV.getDefault().encode("report_duplicate_file_report_time", System.currentTimeMillis());
                }
            }
            C118391i iVar2 = C118391i.this;
            synchronized (iVar2) {
                try {
                    long decodeLong3 = MultiProcessMMKV.getDefault().decodeLong("report_freelist_report_time", 0);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - decodeLong3 < FrequentLimiter.WEEK_MILLS) {
                        iVar = iVar2;
                    } else if (currentTimeMillis % 100 != 0) {
                        MultiProcessMMKV.getDefault().encode("report_freelist_report_time", System.currentTimeMillis());
                    } else {
                        long decodeLong4 = MultiProcessMMKV.getDefault().decodeLong("report_freelist_daily_EnMicroMsg", -10);
                        long decodeInt3 = (long) MultiProcessMMKV.getDefault().decodeInt("report_freelist_daily_ratio_EnMicroMsg", -10);
                        int i3 = (decodeLong4 > 0 ? 1 : (decodeLong4 == 0 ? 0 : -1));
                        if (i3 >= 0) {
                            C117407d.INSTANCE.mo160131h(25824, "EnMicroMsg.db", "", 0, 0, Long.valueOf(decodeLong4), "daily", 0, 0, 0, 0, 0, 0, Long.valueOf(decodeInt3));
                        }
                        try {
                            decodeLong = MultiProcessMMKV.getDefault().decodeLong("report_freelist_daily_WxFileIndex", -10);
                            decodeInt = (long) MultiProcessMMKV.getDefault().decodeInt("report_freelist_daily_ratio_WxFileIndex", -10);
                            i = (decodeLong > 0 ? 1 : (decodeLong == 0 ? 0 : -1));
                            if (i >= 0) {
                                C117407d.INSTANCE.mo160131h(25824, "WxFileIndex.db", "", 0, 0, Long.valueOf(decodeLong), "daily", 0, 0, 0, 0, 0, 0, Long.valueOf(decodeInt));
                            }
                            j = decodeInt3;
                            decodeLong2 = MultiProcessMMKV.getDefault().decodeLong("report_freelist_daily_FTS", -10);
                            decodeInt2 = (long) MultiProcessMMKV.getDefault().decodeInt("report_freelist_daily_ratio_FTS", -10);
                            i2 = (decodeLong2 > 0 ? 1 : (decodeLong2 == 0 ? 0 : -1));
                            if (i2 >= 0) {
                                C117407d.INSTANCE.mo160131h(25824, "FTS5IndexMicroMsg_encrypt.db", "", 0, 0, Long.valueOf(decodeLong2), "daily", 0, 0, 0, 0, 0, 0, Long.valueOf(decodeInt2));
                            }
                            iVar = iVar2;
                        } catch (Throwable th) {
                            th = th;
                            iVar = iVar2;
                            throw th;
                        }
                        try {
                            long decodeLong5 = MultiProcessMMKV.getDefault().decodeLong("report_freelist_daily_NewBiz", -10);
                            long j36 = decodeInt2;
                            long decodeInt4 = (long) MultiProcessMMKV.getDefault().decodeInt("report_freelist_daily_ratio_NewBiz", -10);
                            int i4 = (decodeLong5 > 0 ? 1 : (decodeLong5 == 0 ? 0 : -1));
                            if (i4 >= 0) {
                                j2 = decodeInt;
                                C117407d.INSTANCE.mo160131h(25824, "UnEncryptNewBiz.db", "", 0, 0, Long.valueOf(decodeLong5), "daily", 0, 0, 0, 0, 0, 0, Long.valueOf(decodeInt4));
                            } else {
                                j2 = decodeInt;
                            }
                            if (i3 >= 0 && i >= 0 && i2 >= 0 && i4 >= 0) {
                                long j37 = decodeLong4 + decodeLong + decodeLong2 + decodeLong5;
                                long j38 = -1;
                                if (j >= 0 && j2 >= 0 && j36 >= 0 && decodeInt4 >= 0) {
                                    j38 = j + j2 + j36 + decodeInt4;
                                }
                                C117407d.INSTANCE.mo160131h(25824, "Total", "", 0, 0, Long.valueOf(j37), "daily", 0, 0, 0, 0, 0, 0, Long.valueOf(j38));
                            }
                            MultiProcessMMKV.getDefault().encode("report_freelist_report_time", System.currentTimeMillis());
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    iVar = iVar2;
                    throw th;
                }
            }
            C118391i iVar3 = C118391i.this;
            iVar3.getClass();
            if (C86709a0.m107522a()) {
                C86709a0.m107528h();
                C85801v1 i5 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_REPORT_SD_STATUS_TIME_LONG;
                long longValue = ((Long) i5.mo119685f(aVar, 0L)).longValue();
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 - longValue > 259200000 || longValue > currentTimeMillis2) {
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(currentTimeMillis2));
                    ((C119157j) C119157j.f356862d).mo183876g(new C90380h(iVar3), "reportSDStatus");
                }
            }
            C118391i iVar4 = C118391i.this;
            iVar4.getClass();
            C86709a0.m107528h();
            C85801v1 i6 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_WECHAT_DB_REPORT_LAST_TIME_LONG;
            long longValue2 = ((Long) i6.mo119685f(aVar2, 0L)).longValue();
            long currentTimeMillis3 = System.currentTimeMillis();
            if (currentTimeMillis3 - longValue2 > iVar4.f353836q * 60000 || longValue2 > currentTimeMillis3) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, Long.valueOf(currentTimeMillis3));
                long j39 = iVar4.f353828f * 1024 * 1024;
                long j44 = iVar4.f353829g;
                long j45 = iVar4.f353833n * 1024 * 1024;
                long j46 = iVar4.f353830h;
                long j47 = iVar4.f353831i;
                long j48 = iVar4.f353832j;
                ((C119157j) C119157j.f356862d).mo183876g(new C48554n(iVar4, j39, j45, j44, j46, j47, j48), "reportDBInfo");
            }
            C118391i iVar5 = C118391i.this;
            iVar5.getClass();
            if (C86709a0.m107522a()) {
                C86709a0.m107528h();
                C85801v1 i7 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_INSTALL_LAST_REPORT_TIME_LONG;
                long longValue3 = ((Long) i7.mo119685f(aVar3, 0L)).longValue();
                long currentTimeMillis4 = System.currentTimeMillis();
                if (currentTimeMillis4 - longValue3 > 259200000 || longValue3 > currentTimeMillis4) {
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(aVar3, Long.valueOf(currentTimeMillis4));
                    ((C119157j) C119157j.f356862d).mo183876g(new C13836f(iVar5), "reportVersion");
                }
            }
            C118391i.xx0(C118391i.this);
            C118391i iVar6 = C118391i.this;
            iVar6.getClass();
            if (C86709a0.m107523b().mo121114l()) {
                C86709a0.m107528h();
                C85801v1 i8 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar4 = C72994y1.C72995a.USERINFO_REPORT_ECDH_AUTH_TIME_LONG;
                long longValue4 = ((Long) i8.mo119685f(aVar4, 0L)).longValue();
                long currentTimeMillis5 = System.currentTimeMillis();
                if (currentTimeMillis5 - longValue4 > 86400000 || longValue4 > currentTimeMillis5) {
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(aVar4, Long.valueOf(currentTimeMillis5));
                    ((C119157j) C119157j.f356862d).mo183876g(new C118395j(iVar6), "reportECDHAuth");
                }
            }
            C112785a aVar5 = C112785a.f337705f;
            aVar5.getClass();
            C113173i e2 = C117750b.m166047e();
            if (e2 != null) {
                e2.f338613h.f339059f.post(new a$$c(aVar5));
            }
            C118391i.this.f353845z.mo97819a();
            ((C119157j) C119157j.f356862d).mo183878i(C118391i.this.f353845z, 10000);
        }
    }

    /* renamed from: t72.i$c */
    public class C118393c extends C88654b {
        public C118393c() {
        }

        public String getKey() {
            return "reportHeavyUser";
        }

        public void run() {
            Log.m105924i("MicroMsg.SubCoreBaseMonitor", "summerhv reportHeavyUserRunnable run");
            if (C86709a0.m107522a() && C118391i.this.f353843x != 0) {
                C86709a0.m107528h();
                C85801v1 i = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_HEAVY_USER_REPORT_TIME_LONG;
                long longValue = ((Long) i.mo119685f(aVar, 0L)).longValue();
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - longValue > 86400000 || longValue > currentTimeMillis) {
                    C115669n.INSTANCE.idkeyStat(509, 17, 1, true);
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(currentTimeMillis));
                    C86709a0.m107528h();
                    long longValue2 = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_HEAVY_USER_FLAG_LONG, 0L)).longValue();
                    log_14375 log_14375 = new log_14375();
                    log_14375.type_ = 4;
                    HeavyDetailInfo heavyDetailInfo = new HeavyDetailInfo();
                    log_14375.heavyDetailInfo_ = heavyDetailInfo;
                    heavyDetailInfo.flag_ = longValue2;
                    C86709a0.m107528h();
                    long longValue3 = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_HEAVY_USER_REPORT_TYPE_SD_FILE_SIZE_LONG, 0L)).longValue();
                    heavyDetailInfo.sdFileSize_ = longValue3;
                    String str = ("" + longValue2) + ";" + longValue3;
                    C86709a0.m107528h();
                    long longValue4 = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_HEAVY_USER_REPORT_TYPE_SD_FILE_RATIO_LONG, 0L)).longValue();
                    heavyDetailInfo.sdFileRatio_ = longValue4;
                    String str2 = str + ";" + longValue4;
                    C86709a0.m107528h();
                    long longValue5 = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_HEAVY_USER_REPORT_TYPE_DB_SIZE_LONG, 0L)).longValue();
                    heavyDetailInfo.dbSize_ = longValue5;
                    String str3 = str2 + ";" + longValue5;
                    C86709a0.m107528h();
                    long longValue6 = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_HEAVY_USER_REPORT_TYPE_DB_MESSAGE_LONG, 0L)).longValue();
                    heavyDetailInfo.message_ = longValue6;
                    String str4 = str3 + ";" + longValue6;
                    C86709a0.m107528h();
                    long longValue7 = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_HEAVY_USER_REPORT_TYPE_DB_CONVERSATION_LONG, 0L)).longValue();
                    heavyDetailInfo.conversation_ = longValue7;
                    String str5 = str4 + ";" + longValue7;
                    C86709a0.m107528h();
                    long longValue8 = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_HEAVY_USER_REPORT_TYPE_DB_CONTACT_LONG, 0L)).longValue();
                    heavyDetailInfo.contact_ = longValue8;
                    String str6 = str5 + ";" + longValue8;
                    C86709a0.m107528h();
                    long longValue9 = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_HEAVY_USER_REPORT_TYPE_DB_CHATROOM_LONG, 0L)).longValue();
                    heavyDetailInfo.chatroom_ = longValue9;
                    String str7 = str6 + ";" + longValue9;
                    C86709a0.m107528h();
                    long longValue10 = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_HEAVY_USER_REPORT_TYPE_FAV_DB_SIZE_LONG, 0L)).longValue();
                    heavyDetailInfo.favDbSize_ = longValue10;
                    String str8 = str7 + ";" + longValue10;
                    log_14375 log_143752 = log_14375;
                    MMApplicationContext.getContext().getSharedPreferences("heavyDetailInfo", 0).edit().putLong("sdFileSize", heavyDetailInfo.sdFileSize_).putLong("sdFileRatio", heavyDetailInfo.sdFileRatio_).putLong("dbSize", heavyDetailInfo.dbSize_).putLong(StateEvent.Name.MESSAGE, heavyDetailInfo.message_).putLong("conversation", heavyDetailInfo.conversation_).putLong("contact", heavyDetailInfo.contact_).putLong("chatroom", heavyDetailInfo.chatroom_).putLong("favDbSize", heavyDetailInfo.favDbSize_).putLong("flag", heavyDetailInfo.flag_).apply();
                    try {
                        C86013q1.m106437S(C86709a0.m107535s().f251807e + "heavyDetailInfo", new JSONObject().put("sdFileSize", heavyDetailInfo.sdFileSize_).put("sdFileRatio", heavyDetailInfo.sdFileRatio_).put("dbSize", heavyDetailInfo.dbSize_).put(StateEvent.Name.MESSAGE, heavyDetailInfo.message_).put("conversation", heavyDetailInfo.conversation_).put("contact", heavyDetailInfo.contact_).put("chatroom", heavyDetailInfo.chatroom_).put("favDbSize", heavyDetailInfo.favDbSize_).put("flag", heavyDetailInfo.flag_).toString().getBytes());
                    } catch (JSONException unused) {
                        Log.m105920e("MicroMsg.SubCoreBaseMonitor", "Failed to write heavyDetailInfo");
                    }
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.mo160128e(13778, false, false, true, 4, 1, str8);
                    nVar.mo175916z(14375, log_143752, false, false);
                    Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv reportHeavyUser report heavy result[%s]", str8);
                }
            }
        }
    }

    /* renamed from: t72.i$d */
    public class C118394d implements MTimerHandler.CallBack {
        public C118394d() {
        }

        public boolean onTimerExpired() {
            C118391i.xx0(C118391i.this);
            return true;
        }
    }

    public static void vx0(C118391i iVar, C118387c.C118388a aVar) {
        int i;
        int i2;
        long j;
        long j2;
        long j3;
        long j4;
        String str;
        String str2;
        String str3;
        int i3;
        long j5;
        boolean z;
        float f;
        long j6;
        int i4;
        long j7;
        long j8;
        int i5;
        String str4;
        String str5;
        Integer num;
        C118391i iVar2 = iVar;
        C118387c.C118388a aVar2 = aVar;
        iVar.getClass();
        log_14375 log_14375 = new log_14375();
        int i6 = 2;
        log_14375.type_ = 2;
        SDStatusInfo sDStatusInfo = new SDStatusInfo();
        log_14375.sdStatusInfo_ = sDStatusInfo;
        C118387c.C118390c cVar = new C118387c.C118390c("total/temp/acc/");
        Iterator<C118387c.C118390c> it = aVar2.f353809i.iterator();
        while (it.hasNext()) {
            C118387c.C118390c next = it.next();
            cVar.f353818b += next.f353818b;
            cVar.f353819c += next.f353819c;
            cVar.f353820d += next.f353820d;
            cVar.f353821e += next.f353821e;
        }
        String str6 = "MicroMsg.SubCoreBaseMonitor";
        Log.m105925i(str6, "summerhv doReportSDInfo total tempAccDirResult[%d][%s]", Integer.valueOf(aVar2.f353809i.size()), cVar);
        Collections.sort(aVar2.f353808h, new C118400m(iVar2));
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator<C118387c.C118389b> it4 = aVar2.f353808h.iterator();
        while (it4.hasNext()) {
            C118387c.C118389b next2 = it4.next();
            if (next2 != null) {
                int i7 = next2.f353812b;
                if (i7 > 200) {
                    arrayList.add(next2);
                } else {
                    C118387c.C118389b bVar = (C118387c.C118389b) hashMap.get(Integer.valueOf(i7));
                    if (bVar == null) {
                        hashMap.put(Integer.valueOf(next2.f353812b), next2);
                    } else {
                        num = i6;
                        str5 = str6;
                        bVar.f353815e += next2.f353815e;
                        StringBuffer stringBuffer = new StringBuffer(bVar.f353811a);
                        stringBuffer.append(", ");
                        stringBuffer.append(next2.f353811a);
                        bVar.f353811a = stringBuffer.toString();
                        i6 = num;
                        str6 = str5;
                    }
                }
            }
            num = i6;
            str5 = str6;
            i6 = num;
            str6 = str5;
        }
        Integer num2 = i6;
        String str7 = str6;
        Iterator it5 = hashMap.values().iterator();
        while (true) {
            i = 4;
            i2 = 6;
            if (!it5.hasNext()) {
                break;
            }
            C118387c.C118389b bVar2 = (C118387c.C118389b) it5.next();
            if (bVar2 != null) {
                C115669n.INSTANCE.mo160128e(13778, false, false, true, 6, Integer.valueOf(bVar2.f353812b), Long.valueOf(bVar2.f353815e), bVar2.f353811a);
                str4 = str7;
                Log.m105919d(str4, "summerhv doReportSDInfo subDirResult[%d], totalSize[%d], root[%s]", Integer.valueOf(bVar2.f353812b), Long.valueOf(bVar2.f353815e), bVar2.f353811a);
            } else {
                str4 = str7;
            }
            str7 = str4;
        }
        String str8 = str7;
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            C118387c.C118389b bVar3 = (C118387c.C118389b) it6.next();
            if (bVar3 != null) {
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[i];
                objArr[0] = Integer.valueOf(i2);
                objArr[1] = Integer.valueOf(bVar3.f353812b);
                objArr[2] = Long.valueOf(bVar3.f353815e);
                objArr[3] = bVar3.f353811a;
                nVar.mo160128e(13778, false, false, true, objArr);
                Log.m105919d(str8, "summerhv doReportSDInfo subDirResult[%d], totalSize[%d], root[%s]", Integer.valueOf(bVar3.f353812b), Long.valueOf(bVar3.f353815e), bVar3.f353811a);
            }
            i = 4;
            i2 = 6;
        }
        String str9 = aVar2.f353804d + XVFSFile.PATH_SEPARATOR + aVar2.f353802b + XVFSFile.PATH_SEPARATOR + aVar2.f353803c + XVFSFile.PATH_SEPARATOR + aVar2.f353805e + XVFSFile.PATH_SEPARATOR + aVar2.f353808h.size() + XVFSFile.PATH_SEPARATOR + aVar2.f353806f + XVFSFile.PATH_SEPARATOR + aVar2.f353807g + "|" + aVar2.f353809i.size() + XVFSFile.PATH_SEPARATOR + cVar.f353820d + XVFSFile.PATH_SEPARATOR + cVar.f353818b + XVFSFile.PATH_SEPARATOR + cVar.f353819c + XVFSFile.PATH_SEPARATOR + cVar.f353821e;
        WeChatSDInfo weChatSDInfo = new WeChatSDInfo();
        sDStatusInfo.weChatSDInfo_ = weChatSDInfo;
        weChatSDInfo.totalSize_ = aVar2.f353804d;
        weChatSDInfo.fileCount_ = aVar2.f353803c;
        weChatSDInfo.fileLenInvalidCount_ = aVar2.f353805e;
        weChatSDInfo.subDirResultsSize_ = aVar2.f353808h.size();
        weChatSDInfo.totalTime_ = aVar2.f353806f;
        weChatSDInfo.depth_ = aVar2.f353807g;
        weChatSDInfo.tempAccTotalSize_ = cVar.f353820d;
        weChatSDInfo.tempAccDirResultsSize_ = aVar2.f353809i.size();
        weChatSDInfo.tempAccDirCount_ = cVar.f353818b;
        weChatSDInfo.tempAccFileCount_ = cVar.f353819c;
        weChatSDInfo.tempAccFileLenInvalidCount_ = cVar.f353821e;
        C115669n nVar2 = C115669n.INSTANCE;
        nVar2.mo160128e(13778, false, false, true, 6, 1000, Long.valueOf(weChatSDInfo.totalSize_));
        long j9 = (weChatSDInfo.totalSize_ / 1024) / 1024;
        Log.m105919d(str8, "summerhv doReportSDInfo weChatSDInfo totolSize[%d MB]", Long.valueOf(j9));
        if (j9 <= 512) {
            nVar2.idkeyStat(1035, 1, 1, false);
        } else if (j9 <= 1024) {
            nVar2.idkeyStat(1035, 2, 1, false);
        } else if (j9 <= 2048) {
            nVar2.idkeyStat(1035, 3, 1, false);
        } else if (j9 <= 4096) {
            nVar2.idkeyStat(1035, 4, 1, false);
        } else if (j9 <= 8192) {
            nVar2.idkeyStat(1035, 5, 1, false);
        } else if (j9 <= 16384) {
            nVar2.idkeyStat(1035, 6, 1, false);
        } else if (j9 <= 32768) {
            nVar2.idkeyStat(1035, 7, 1, false);
        } else {
            nVar2.idkeyStat(1035, 8, 1, false);
        }
        nVar2.idkeyStat(1035, 100, j9, false);
        LinkedList<SubDirInfo> linkedList = new LinkedList<>();
        weChatSDInfo.subDirList_ = linkedList;
        Iterator<C118387c.C118389b> it7 = aVar2.f353808h.iterator();
        String str10 = str9;
        while (it7.hasNext()) {
            C118387c.C118389b next3 = it7.next();
            str10 = str10 + "|" + next3.f353812b + XVFSFile.PATH_SEPARATOR + next3.f353815e + XVFSFile.PATH_SEPARATOR + next3.f353813c + XVFSFile.PATH_SEPARATOR + next3.f353814d + XVFSFile.PATH_SEPARATOR + next3.f353816f;
            SubDirInfo subDirInfo = new SubDirInfo();
            linkedList.add(subDirInfo);
            int i8 = next3.f353812b;
            subDirInfo.tag_ = i8;
            String str11 = str8;
            subDirInfo.totalSize_ = next3.f353815e;
            subDirInfo.dirCount_ = next3.f353813c;
            long j15 = next3.f353814d;
            subDirInfo.fileCount_ = j15;
            long j16 = j15;
            subDirInfo.fileLenInvalidCount = next3.f353816f;
            if (i8 == 6 && j16 > 0) {
                C115669n.INSTANCE.mo175913w(857, 16, 1);
            }
            str8 = str11;
        }
        String str12 = str8;
        Log.m105925i(str12, "summerhv doReportSDInfo wechatResult[%d][%s]", Integer.valueOf(str10.length()), str10);
        String path = C88956h.m111061b().getPath();
        boolean hasUnRemovableStorage = SdcardUtil.hasUnRemovableStorage();
        String fileSystem = SdcardUtil.getFileSystem(C112760b.m154217Y());
        StatFs statFs = new StatFs(path);
        long blockSize = (long) statFs.getBlockSize();
        long blockCount = (long) statFs.getBlockCount();
        int availableBlocks = statFs.getAvailableBlocks();
        log_14375 log_143752 = log_14375;
        String str13 = XVFSFile.PATH_SEPARATOR;
        long j17 = (long) availableBlocks;
        boolean z2 = hasUnRemovableStorage;
        long j18 = blockSize * blockCount;
        long j19 = blockSize * j17;
        int round = blockCount > 0 ? Math.round((((float) j17) * 100.0f) / ((float) blockCount)) : -1;
        boolean equals = C112760b.m154217Y().equals(path);
        if (!equals) {
            z = equals;
            j5 = blockCount;
            StatFs statFs2 = new StatFs(C112760b.m154217Y());
            long blockSize2 = (long) statFs2.getBlockSize();
            i3 = round;
            str3 = str10;
            long blockCount2 = (long) statFs2.getBlockCount();
            str2 = str12;
            str = path;
            long availableBlocks2 = (long) statFs2.getAvailableBlocks();
            long j25 = blockSize2 * blockCount2;
            long j26 = blockSize2 * availableBlocks2;
            if (blockCount2 > 0) {
                f = 100.0f;
                j8 = blockSize2;
                i5 = Math.round((((float) availableBlocks2) * 100.0f) / ((float) blockCount2));
            } else {
                j8 = blockSize2;
                f = 100.0f;
                i5 = i3;
            }
            j = availableBlocks2;
            j7 = j25;
            j4 = j8;
            i4 = i5;
            j2 = blockCount2;
            j6 = j26;
            j3 = j19;
        } else {
            z = equals;
            j5 = blockCount;
            i3 = round;
            str3 = str10;
            str2 = str12;
            str = path;
            f = 100.0f;
            j = j17;
            j3 = j19;
            j4 = blockSize;
            j7 = j18;
            j2 = j5;
            i4 = i3;
            j6 = j3;
        }
        int round2 = Math.round((((float) aVar2.f353804d) * f) / ((float) j7));
        MultiProcessMMKV.getDefault().encode("storage_heavy_user_wechat_total_size", aVar2.f353804d);
        sDStatusInfo.weChatPer_ = round2;
        long j27 = j17;
        long j28 = j2;
        long j29 = j5;
        long j35 = j6;
        int i9 = i4;
        long j36 = blockSize;
        int i15 = i3;
        long j37 = j7;
        long j38 = j4;
        String str14 = fileSystem;
        String str15 = str3;
        boolean z3 = z;
        iVar.Bx0(1, aVar2.f353804d, iVar2.f353826d * 1024 * 1024);
        sDStatusInfo.sizeHeavy_ = aVar2.f353804d > (iVar2.f353826d * 1024) * 1024 ? 1 : 0;
        long j39 = (long) round2;
        long j44 = j39;
        iVar.Bx0(2, j39, iVar2.f353827e);
        sDStatusInfo.ratioHeavy_ = j44 > iVar2.f353827e ? 1 : 0;
        StringBuilder sb = new StringBuilder();
        sb.append(round2);
        sb.append(";");
        sb.append(z3 ? 1 : 0);
        sb.append(";");
        sb.append(z2 ? 1 : 0);
        sb.append(";");
        sb.append(j38);
        String str16 = str13;
        sb.append(str16);
        sb.append(j28);
        sb.append(str16);
        long j45 = j;
        sb.append(j45);
        sb.append(str16);
        long j46 = j37;
        sb.append(j46);
        sb.append(str16);
        boolean z4 = z3;
        sb.append(j35);
        sb.append(str16);
        int i16 = i9;
        sb.append(i16);
        sb.append("|");
        sb.append(j36);
        sb.append(str16);
        sb.append(j29);
        sb.append(str16);
        sb.append(j27);
        sb.append(str16);
        sb.append(j18);
        sb.append(str16);
        long j47 = j3;
        sb.append(j47);
        sb.append(str16);
        int i17 = i3;
        sb.append(i17);
        sb.append(";");
        sb.append(str);
        sb.append(";");
        sb.append(C112760b.m154217Y());
        sb.append(";");
        String str17 = str14;
        sb.append(str17);
        String sb4 = sb.toString();
        sDStatusInfo.sBlockSize_ = j38;
        sDStatusInfo.sBlockCount_ = j28;
        sDStatusInfo.sAvailableBlockCount_ = j45;
        sDStatusInfo.sTotalSize_ = j46;
        sDStatusInfo.sAvailableSize_ = j35;
        sDStatusInfo.sAvailablePer_ = i16;
        sDStatusInfo.eBlockSize_ = j36;
        sDStatusInfo.eBlockCount_ = j29;
        sDStatusInfo.eAvailableBlockCount_ = j27;
        sDStatusInfo.eTotalSize_ = j18;
        sDStatusInfo.eAvailableSize_ = j47;
        sDStatusInfo.eAvailablePer_ = i17;
        String str18 = str;
        sDStatusInfo.ePath_ = str18;
        sDStatusInfo.root_ = C112760b.m154217Y();
        sDStatusInfo.fSystem_ = str17;
        C115669n nVar3 = C115669n.INSTANCE;
        nVar3.mo160128e(13778, false, false, true, num2, 3, str18);
        nVar3.mo160128e(13778, false, false, true, num2, 4, C112760b.m154217Y());
        nVar3.mo160128e(13778, false, false, true, num2, 5, Integer.valueOf(z4 ? 1 : 0));
        nVar3.mo160128e(13778, false, false, true, num2, 6, Integer.valueOf(z2 ? 1 : 0));
        nVar3.mo160128e(13778, false, false, true, num2, 7, str17);
        nVar3.mo160128e(13778, false, false, true, num2, 8, Long.valueOf(sDStatusInfo.sTotalSize_));
        nVar3.mo160128e(13778, false, false, true, num2, 9, Long.valueOf(sDStatusInfo.sAvailableSize_));
        nVar3.mo160128e(13778, false, false, true, num2, 10, Integer.valueOf(sDStatusInfo.sAvailablePer_));
        nVar3.mo160128e(13778, false, false, true, 6, 1001, Integer.valueOf(round2));
        String str19 = str2;
        Log.m105925i(str19, "summerhv doReportSDInfo phoneResult[%d][%s]", Integer.valueOf(sb4.length()), sb4);
        String str20 = str15 + ";" + sb4;
        Log.m105925i(str19, "summerhv doReportSDInfo totalResult[%d][%s]", Integer.valueOf(str20.length()), str20);
        nVar3.idkeyStat(418, 5, 1, true);
        nVar3.mo160128e(13778, false, false, true, num2, 1, str20);
        nVar3.mo175916z(14375, log_143752, false, false);
    }

    public static long wx0(C118391i iVar) {
        iVar.getClass();
        C86709a0.m107528h();
        if (!C86709a0.m107535s().mo121147n()) {
            Log.m105924i("MicroMsg.SubCoreBaseMonitor", "summerreportVersion getOldestXlogDay failed as sdcard not available");
            return 0;
        }
        C86009m1 m1Var = new C86009m1(C112760b.m154234h0());
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            Log.m105924i("MicroMsg.SubCoreBaseMonitor", "summerreportVersion getOldestXlogDay failed as path not exist");
            return 0;
        }
        C86009m1[] u = m1Var.mo119984u();
        if (u == null || u.length == 0) {
            Log.m105924i("MicroMsg.SubCoreBaseMonitor", "summerreportVersion getOldestXlogDay failed as no files");
            return 0;
        }
        Arrays.sort(u, new C36970g(iVar));
        long j = 0;
        for (C86009m1 name : u) {
            String name2 = name.getName();
            if (!Util.isNullOrNil(name2) && name2.endsWith(".xlog")) {
                j = Util.getLong(name2.substring(name2.length() - 13, name2.length() - 5), 0);
                if (j > 0) {
                    break;
                }
            }
        }
        return j;
    }

    public static void xx0(C118391i iVar) {
        Debug.MemoryInfo memoryInfo;
        iVar.getClass();
        if (C86709a0.m107522a()) {
            C86709a0.m107528h();
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MM_LVFETIME_REPORT_PID_INT;
            int i2 = 0;
            int intValue = ((Integer) i.mo119685f(aVar, 0)).intValue();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_MM_LVFETIME_REPORT_LIFETIME_LONG;
            long longValue = ((Long) i.mo119685f(aVar2, 0L)).longValue();
            C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_MM_LVFETIME_REPORT_MEMORY_PSS_INT;
            int intValue2 = ((Integer) i.mo119685f(aVar3, 0)).intValue();
            int myPid = Process.myPid();
            int i3 = -1;
            Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getProcessMemoryInfo(new int[]{myPid});
            if (!(processMemoryInfo == null || processMemoryInfo.length <= 0 || (memoryInfo = processMemoryInfo[0]) == null)) {
                i3 = memoryInfo.getTotalPss();
            }
            if (intValue == 0) {
                i.mo119677K(aVar, Integer.valueOf(myPid));
                i.mo119677K(aVar2, Long.valueOf(System.currentTimeMillis() - f353822C));
                if (i3 > 0) {
                    i2 = i3;
                }
                i.mo119677K(aVar3, Integer.valueOf(i2));
            } else if (intValue != myPid) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160128e(13778, false, false, true, 5, 1, Long.valueOf(longValue));
                nVar.mo160128e(13778, false, false, true, 5, 2, Integer.valueOf(intValue2));
                i.mo119677K(aVar, Integer.valueOf(myPid));
                long currentTimeMillis = System.currentTimeMillis() - f353822C;
                if (i3 <= 0) {
                    i3 = 0;
                }
                i.mo119677K(aVar2, Long.valueOf(currentTimeMillis));
                i.mo119677K(aVar3, Integer.valueOf(i3));
                Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv reportLifeTime lifeTime[%d -> %d]ms,  pss[%d -> %d], pid[%d -> %d]", Long.valueOf(longValue), Long.valueOf(currentTimeMillis), Integer.valueOf(intValue2), Integer.valueOf(i3), Integer.valueOf(intValue), Integer.valueOf(myPid));
            } else {
                i.mo119677K(aVar2, Long.valueOf(System.currentTimeMillis() - f353822C));
                if (i3 > intValue2) {
                    i.mo119677K(aVar3, Integer.valueOf(i3));
                }
            }
            i.mo119681a(true);
            iVar.f353824A.startTimer(ApkDownloadManager.INTERVAL);
        }
    }

    public final synchronized void Ax0() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j44;
        long j45;
        long j46;
        long j47;
        long j48;
        long j49;
        long j54;
        long j55;
        try {
            if (System.currentTimeMillis() - MultiProcessMMKV.getDefault().getLong("extreme_storage_last_report_time", 0) > 86400000) {
                Log.m105924i("MicroMsg.SubCoreBaseMonitor", "reportExtremeStorage");
                long j56 = MultiProcessMMKV.getDefault().getLong("extreme_storage_wechat_total", -1);
                long j57 = j56 > 5368709120L ? j56 : -1;
                long j58 = MultiProcessMMKV.getDefault().getLong("daily_storage_wechat_persist", -1);
                long j59 = MultiProcessMMKV.getDefault().getLong("daily_storage_wechat_expire", -1);
                long j64 = MultiProcessMMKV.getDefault().getLong("daily_storage_wechat_lru", -1);
                long j65 = MultiProcessMMKV.getDefault().getLong("daily_storage_wechat_database", -1);
                long j66 = j64;
                long j67 = MultiProcessMMKV.getDefault().getLong("daily_other_storage_other_account", -1);
                long j68 = MultiProcessMMKV.getDefault().getLong("daily_storage_webview", -1);
                long j69 = MultiProcessMMKV.getDefault().getLong("daily_storage_not_sorted", -1);
                long j74 = MultiProcessMMKV.getDefault().getLong("daily_storage_c2c_image2", -1);
                long j75 = j59;
                long j76 = MultiProcessMMKV.getDefault().getLong("daily_storage_c2c_video", -1);
                long j77 = j58;
                long j78 = MultiProcessMMKV.getDefault().getLong("daily_storage_c2c_attachment", -1);
                long j79 = j57;
                long j84 = MultiProcessMMKV.getDefault().getLong("daily_storage_c2c_download", -1);
                long j85 = j65;
                long j86 = MultiProcessMMKV.getDefault().getLong("daily_storage_c2c_voice2", -1);
                long j87 = MultiProcessMMKV.getDefault().getLong("daily_storage_c2c_record", -1);
                int i = (j74 > 0 ? 1 : (j74 == 0 ? 0 : -1));
                if (i < 0 || j56 <= 0) {
                    j = j74;
                    j2 = -1;
                } else {
                    j = j74;
                    j2 = (long) ((((double) j74) / ((double) j56)) * 100.0d);
                }
                int i2 = (j76 > 0 ? 1 : (j76 == 0 ? 0 : -1));
                if (i2 < 0 || j56 <= 0) {
                    j4 = j2;
                    j3 = j76;
                    j5 = -1;
                } else {
                    j4 = j2;
                    j3 = j76;
                    j5 = (long) ((((double) j76) / ((double) j56)) * 100.0d);
                }
                if (j78 < 0 || j56 <= 0) {
                    j6 = j5;
                    j7 = -1;
                } else {
                    j6 = j5;
                    j7 = (long) ((((double) j78) / ((double) j56)) * 100.0d);
                }
                if (j84 < 0 || j56 <= 0) {
                    j8 = j7;
                    j9 = -1;
                } else {
                    j8 = j7;
                    j9 = (long) ((((double) j84) / ((double) j56)) * 100.0d);
                }
                int i3 = (j86 > 0 ? 1 : (j86 == 0 ? 0 : -1));
                if (i3 < 0 || j56 <= 0) {
                    j16 = j9;
                    j15 = j78;
                    j19 = j86;
                    j17 = j84;
                    j18 = -1;
                } else {
                    j16 = j9;
                    j19 = j86;
                    j17 = j84;
                    j15 = j78;
                    j18 = (long) ((((double) j19) / ((double) j56)) * 100.0d);
                }
                long j88 = (j87 < 0 || j56 <= 0) ? -1 : (long) ((((double) j87) / ((double) j56)) * 100.0d);
                long j89 = MultiProcessMMKV.getDefault().getLong("daily_storage_xlog", -1);
                long j94 = j18;
                long j95 = MultiProcessMMKV.getDefault().getLong("daily_storage_main_db", -1);
                long j96 = j89;
                long j97 = MultiProcessMMKV.getDefault().getLong("daily_storage_main_db_real_data", -1);
                long j98 = j87;
                long j99 = MultiProcessMMKV.getDefault().getLong("extreme_storage_wechat_total_webview", -1);
                long j100 = MultiProcessMMKV.getDefault().getLong("daily_storage_total_msg_count", -1);
                long j101 = j56;
                long j102 = MultiProcessMMKV.getDefault().getLong("daily_storage_image_msg_count", -1);
                long j103 = j19;
                long j104 = MultiProcessMMKV.getDefault().getLong("daily_storage_video_msg_count", -1);
                int i4 = i3;
                long j105 = MultiProcessMMKV.getDefault().getLong("daily_storage_voice_msg_count", -1);
                long j106 = MultiProcessMMKV.getDefault().getLong("daily_storage_video_msg_len", -1);
                long j107 = MultiProcessMMKV.getDefault().getLong("daily_storage_voice_msg_len", -1);
                if (j95 < 0 || j100 <= 0) {
                    j25 = j107;
                    j26 = -1;
                } else {
                    StringBuilder sb = new StringBuilder();
                    j25 = j107;
                    sb.append("mainDbSize = ");
                    sb.append(j95);
                    sb.append(", totalMsgCount = ");
                    sb.append(j100);
                    Log.m105924i("MicroMsg.SubCoreBaseMonitor", sb.toString());
                    j26 = j95 / j100;
                }
                if (j97 < 0 || j100 <= 0) {
                    j27 = -1;
                } else {
                    Log.m105924i("MicroMsg.SubCoreBaseMonitor", "realMainDbSize = " + j97 + ", totalMsgCount = " + j100);
                    j27 = j97 / j100;
                }
                if (i < 0 || j102 <= 0) {
                    j28 = j;
                    j29 = -1;
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("image2Size = ");
                    j28 = j;
                    sb4.append(j28);
                    sb4.append(", imageMsgCount = ");
                    sb4.append(j102);
                    Log.m105924i("MicroMsg.SubCoreBaseMonitor", sb4.toString());
                    j29 = j28 / j102;
                }
                long j108 = (i2 < 0 || j104 <= 0) ? -1 : j3 / j104;
                long j109 = (i4 < 0 || j105 <= 0) ? -1 : j103 / j105;
                if (i2 < 0 || j106 <= 0) {
                    j35 = j27;
                    j38 = j3;
                    j36 = j108;
                    j37 = -1;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("videoSize = ");
                    j35 = j27;
                    j38 = j3;
                    sb5.append(j38);
                    sb5.append(", videoMsgLen = ");
                    j36 = j108;
                    long j110 = j106;
                    sb5.append(j110);
                    sb5.append(", videoMsgCount = ");
                    sb5.append(j104);
                    Log.m105924i("MicroMsg.SubCoreBaseMonitor", sb5.toString());
                    j37 = j38 / j110;
                }
                if (i4 < 0 || j25 <= 0) {
                    j39 = j29;
                    j45 = j103;
                    j44 = j37;
                    j46 = -1;
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("voice2Size = ");
                    j45 = j103;
                    sb6.append(j45);
                    sb6.append(", voiceMsgLen = ");
                    j44 = j37;
                    long j111 = j25;
                    sb6.append(j111);
                    sb6.append(", voiceMsgCount = ");
                    j39 = j29;
                    sb6.append(j105);
                    Log.m105924i("MicroMsg.SubCoreBaseMonitor", sb6.toString());
                    j46 = j45 / j111;
                }
                if (j85 < 0 || j101 <= 0) {
                    j48 = j46;
                    j54 = j85;
                    j55 = j101;
                    j47 = j26;
                    j49 = -1;
                } else {
                    j54 = j85;
                    j48 = j46;
                    j47 = j26;
                    j55 = j101;
                    j49 = (long) ((((double) j54) / ((double) j55)) * 100.0d);
                }
                long j112 = MultiProcessMMKV.getDefault().getLong("image_report_bigImgTotalSize", -1);
                long j113 = MultiProcessMMKV.getDefault().getLong("image_report_bigImgYuantuTotalSize", -1);
                long j114 = MultiProcessMMKV.getDefault().getLong("image_report_hdThumbTotalSize", -1);
                long j115 = MultiProcessMMKV.getDefault().getLong("image_report_thumbTotalSize", -1);
                long j116 = (long) MultiProcessMMKV.getDefault().getInt("image_daily_bigImgTotalSizeRatio", -1);
                C117407d.INSTANCE.mo160131h(27007, Long.valueOf(j79), Long.valueOf(j55), Long.valueOf(j77), Long.valueOf(j75), Long.valueOf(j66), Long.valueOf(j67), Long.valueOf(j54), Long.valueOf(j68), Long.valueOf(j69), Long.valueOf(j28), Long.valueOf(j38), Long.valueOf(j15), Long.valueOf(j17), Long.valueOf(j45), Long.valueOf(j98), Long.valueOf(j96), Long.valueOf(j99), Long.valueOf(j47), Long.valueOf(j39), Long.valueOf(j36), Long.valueOf(j109), Long.valueOf(j44), Long.valueOf(j48), Long.valueOf(j113), Long.valueOf(j112), Long.valueOf(j114), Long.valueOf(j115), Long.valueOf((long) MultiProcessMMKV.getDefault().getInt("image_daily_bigImgYuantuTotalSizeRatio", -1)), Long.valueOf(j116), Long.valueOf((long) MultiProcessMMKV.getDefault().getInt("image_daily_hdThumbTotalSizeRatio", -1)), Long.valueOf((long) MultiProcessMMKV.getDefault().getInt("image_daily_thumbTotalSizeRatio", -1)), Long.valueOf(MultiProcessMMKV.getDefault().getLong("video_report_yuantuVideoSize", -1)), Long.valueOf(MultiProcessMMKV.getDefault().getLong("video_report_yuantuCompressVideoSize", -1)), Long.valueOf(MultiProcessMMKV.getDefault().getLong("video_report_compressVideoSize", -1)), Long.valueOf(MultiProcessMMKV.getDefault().getLong("video_report_imageSize", -1)), Long.valueOf((long) MultiProcessMMKV.getDefault().getInt("video_report_yuantuVideoSizeRatio", -1)), Long.valueOf((long) MultiProcessMMKV.getDefault().getInt("video_report_yuantuCompressVideoSizeRatio", -1)), Long.valueOf((long) MultiProcessMMKV.getDefault().getInt("video_report_compressVideoSizeRatio", -1)), Long.valueOf((long) MultiProcessMMKV.getDefault().getInt("video_report_imageSizeRatio", -1)), Long.valueOf(j35), Long.valueOf(j49), Long.valueOf(MultiProcessMMKV.getDefault().getLong("daily_storage_latest_mt_time", -1)), Long.valueOf(j4), Long.valueOf(j6), Long.valueOf(j8), Long.valueOf(j16), Long.valueOf(j94), Long.valueOf(j88));
                String string = MultiProcessMMKV.getDefault().getString("extreme_storage_single_file", "");
                if (string != null && !string.isEmpty()) {
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i5);
                        C117407d.INSTANCE.mo160131h(25984, 11, jSONObject.getString("name"), "", jSONObject.getString("path"), Long.valueOf(jSONObject.getLong("totalSize")), 0, "", 0, 0, 0, 0, 0, 0, 0);
                    }
                }
                if (MultiProcessMMKV.getDefault().getInt("extreme_storage_wechat_percentage", -1) != -1) {
                    C117407d.INSTANCE.mo160131h(25984, 12, "", "", "", 0, 0, "", 0, 0, 0, 0, 0, 0, 0);
                }
                long j117 = MultiProcessMMKV.getDefault().getLong("extreme_storage_duplicate_total_space", -1);
                if (j117 != -1) {
                    C117407d.INSTANCE.mo160131h(25984, 20, "", "", "", Long.valueOf(j117), 0, "", 0, 0, 0, 0, 0, 0, 0);
                }
                long j118 = MultiProcessMMKV.getDefault().getLong("extreme_storage_duplicate_image2_space", -1);
                if (j118 != -1) {
                    C117407d.INSTANCE.mo160131h(25984, 21, "", "", "", Long.valueOf(j118), 0, "", 0, 0, 0, 0, 0, 0, 0);
                }
                long j119 = MultiProcessMMKV.getDefault().getLong("extreme_storage_duplicate_video_space", -1);
                if (j119 != -1) {
                    C117407d.INSTANCE.mo160131h(25984, 22, "", "", "", Long.valueOf(j119), 0, "", 0, 0, 0, 0, 0, 0, 0);
                }
                long j120 = MultiProcessMMKV.getDefault().getLong("extreme_storage_duplicate_record_space", -1);
                if (j120 != -1) {
                    C117407d.INSTANCE.mo160131h(25984, 23, "", "", "", Long.valueOf(j120), 0, "", 0, 0, 0, 0, 0, 0, 0);
                }
                long j121 = MultiProcessMMKV.getDefault().getLong("extreme_storage_duplicate_attachment_space", -1);
                if (j121 != -1) {
                    C117407d.INSTANCE.mo160131h(25984, 24, "", "", "", Long.valueOf(j121), 0, "", 0, 0, 0, 0, 0, 0, 0);
                }
                long j122 = MultiProcessMMKV.getDefault().getLong("extreme_storage_duplicate_download_space", -1);
                if (j122 != -1) {
                    C117407d.INSTANCE.mo160131h(25984, 25, "", "", "", Long.valueOf(j122), 0, "", 0, 0, 0, 0, 0, 0, 0);
                }
                String string2 = MultiProcessMMKV.getDefault().getString("extreme_storage_free_list", "");
                if (string2 != null && !string2.isEmpty()) {
                    try {
                        JSONArray jSONArray2 = new JSONArray(string2);
                        for (int i6 = 0; i6 < jSONArray2.length(); i6++) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i6);
                            C117407d.INSTANCE.mo160131h(25984, 30, jSONObject2.getString("name"), "", "", Long.valueOf(jSONObject2.getLong("freeListStorageSize")), 0, "", Long.valueOf(jSONObject2.getLong("freeListCount")), 0, 0, 0, 0, 0, 0);
                        }
                    } catch (JSONException e) {
                        JSONException jSONException = e;
                        Log.m105920e("MicroMsg.SubCoreBaseMonitor", "freeListString jsonArray Failed, e = " + jSONException.getMessage());
                    }
                }
                String string3 = MultiProcessMMKV.getDefault().getString("extreme_storage_free_list_2", "");
                if (string3 != null && !string3.isEmpty()) {
                    try {
                        JSONArray jSONArray3 = new JSONArray(string3);
                        for (int i7 = 0; i7 < jSONArray3.length(); i7++) {
                            JSONObject jSONObject3 = jSONArray3.getJSONObject(i7);
                            C117407d.INSTANCE.mo160131h(25984, 31, jSONObject3.getString("name"), "", "", Long.valueOf(jSONObject3.getLong("freeListStorageSize")), 0, "", Long.valueOf(jSONObject3.getLong("freeListCount")), 0, 0, 0, 0, 0, 0);
                        }
                    } catch (JSONException e2) {
                        JSONException jSONException2 = e2;
                        Log.m105920e("MicroMsg.SubCoreBaseMonitor", "freeListString jsonArray Failed, e = " + jSONException2.getMessage());
                    }
                }
                long j123 = MultiProcessMMKV.getDefault().getLong("extreme_storage_image2_wild_file_size", -1);
                if (j123 != -1) {
                    C117407d.INSTANCE.mo160131h(25984, 40, "", "", "", Long.valueOf(j123), 0, "", 0, 0, 0, 0, 0, 0, 0);
                }
                long j124 = MultiProcessMMKV.getDefault().getLong("extreme_storage_record_wild_file_size", -1);
                if (j124 != -1) {
                    C117407d.INSTANCE.mo160131h(25984, 41, "", "", "", Long.valueOf(j124), 0, "", 0, 0, 0, 0, 0, 0, 0);
                }
                long j125 = MultiProcessMMKV.getDefault().getLong("extreme_storage_video_wild_file_size", -1);
                if (j125 != -1) {
                    C117407d.INSTANCE.mo160131h(25984, 42, "", "", "", Long.valueOf(j125), 0, "", 0, 0, 0, 0, 0, 0, 0);
                }
                long j126 = MultiProcessMMKV.getDefault().getLong("extreme_storage_attachment_wild_file_size", -1);
                if (j126 != -1) {
                    C117407d.INSTANCE.mo160131h(25984, 43, "", "", "", Long.valueOf(j126), 0, "", 0, 0, 0, 0, 0, 0, 0);
                }
                long j127 = MultiProcessMMKV.getDefault().getLong("extreme_storage_voice_wild_file_size", -1);
                if (j127 != -1) {
                    C117407d.INSTANCE.mo160131h(25984, 44, "", "", "", Long.valueOf(j127), 0, "", 0, 0, 0, 0, 0, 0, 0);
                }
                MultiProcessMMKV.getDefault().encode("extreme_storage_last_report_time", System.currentTimeMillis());
            }
        } catch (JSONException e3) {
            JSONException jSONException3 = e3;
            Log.m105920e("MicroMsg.SubCoreBaseMonitor", "singleFileString jsonArray Failed, e = " + jSONException3.getMessage());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void Bx0(int i, long j, long j2) {
        C72994y1.C72995a aVar;
        int i2 = i;
        synchronized (this) {
            boolean z = false;
            boolean z2 = j > j2;
            long j3 = z2 ? this.f353843x | ((long) i2) : this.f353843x & ((long) (~i2));
            Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv resetHeavyUser type[%d] value[%d] limit[%d] heavy[%b] mHeavyUser[%d] newHeavyUser[%d] tid[%s]", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z2), Long.valueOf(this.f353843x), Long.valueOf(j3), Long.valueOf(Thread.currentThread().getId()));
            long j4 = this.f353843x;
            if (j3 != j4) {
                if (j4 == 0) {
                    C115669n.INSTANCE.idkeyStat(509, 1, 1, true);
                }
                if (j3 == 0) {
                    C115669n.INSTANCE.idkeyStat(509, 2, 1, true);
                }
            }
            if (i2 == 1) {
                aVar = C72994y1.C72995a.USERINFO_HEAVY_USER_REPORT_TYPE_SD_FILE_SIZE_LONG;
                C115669n.INSTANCE.idkeyStat(509, z2 ? 3 : 4, 1, true);
            } else if (i2 == 2) {
                aVar = C72994y1.C72995a.USERINFO_HEAVY_USER_REPORT_TYPE_SD_FILE_RATIO_LONG;
                C115669n.INSTANCE.idkeyStat(509, z2 ? 5 : 6, 1, true);
            } else if (i2 == 4) {
                aVar = C72994y1.C72995a.USERINFO_HEAVY_USER_REPORT_TYPE_DB_SIZE_LONG;
                C115669n.INSTANCE.idkeyStat(509, z2 ? 7 : 8, 1, true);
            } else if (i2 == 8) {
                aVar = C72994y1.C72995a.USERINFO_HEAVY_USER_REPORT_TYPE_DB_MESSAGE_LONG;
                C115669n.INSTANCE.idkeyStat(509, z2 ? 9 : 10, 1, true);
            } else if (i2 == 16) {
                aVar = C72994y1.C72995a.USERINFO_HEAVY_USER_REPORT_TYPE_DB_CONVERSATION_LONG;
                C115669n.INSTANCE.idkeyStat(509, z2 ? 11 : 12, 1, true);
            } else if (i2 == 32) {
                aVar = C72994y1.C72995a.USERINFO_HEAVY_USER_REPORT_TYPE_DB_CONTACT_LONG;
                C115669n.INSTANCE.idkeyStat(509, z2 ? 13 : 14, 1, true);
            } else if (i2 == 64) {
                aVar = C72994y1.C72995a.USERINFO_HEAVY_USER_REPORT_TYPE_DB_CHATROOM_LONG;
                C115669n.INSTANCE.idkeyStat(509, z2 ? 15 : 16, 1, true);
            } else if (i2 != 128) {
                aVar = null;
            } else {
                aVar = C72994y1.C72995a.USERINFO_HEAVY_USER_REPORT_TYPE_FAV_DB_SIZE_LONG;
                C115669n.INSTANCE.idkeyStat(509, z2 ? 19 : 20, 1, true);
            }
            this.f353843x = j3;
            if (j3 != 0) {
                z = true;
            }
            C115666i.m162700g(z);
            ((C119157j) C119157j.f356862d).mo183875f(new C90381a(j3, aVar, j));
        }
    }

    public final C118387c.C118388a Cx0(C86009m1 m1Var, C118387c.C118388a aVar, C118387c.C118389b bVar, C118387c.C118390c cVar, Map<String, Integer> map, boolean z, int i) {
        C118387c.C118388a aVar2 = aVar;
        C118387c.C118389b bVar2 = bVar;
        C118387c.C118390c cVar2 = cVar;
        Map<String, Integer> map2 = map;
        int i2 = i;
        int i3 = 0;
        if (aVar2.f353810j) {
            Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summclean scanFile been canceled fileResult[%s], subDirResult[%s]", aVar2, bVar2);
            return aVar2;
        }
        int i4 = aVar2.f353807g;
        if (i4 < i2) {
            aVar2.f353807g = i4 + 1;
        }
        if (m1Var.mo119977o()) {
            String i5 = m1Var.mo119971i();
            if (bVar2 == null) {
                if (map2 == null || map.size() <= 0 || map2.get(i5) == null) {
                    if (C112760b.m154195C().equals(m1Var.mo119973k() + "/") && !zx0(i5)) {
                        bVar2 = Pattern.matches("[a-fA-F0-9]{32}temp[0-9]{13}", m1Var.getName()) ? new C118387c.C118389b(i5, 202) : Pattern.matches("[a-fA-F0-9]{32}", m1Var.getName()) ? new C118387c.C118389b(i5, 201) : new C118387c.C118389b(i5, 203);
                    } else if (zx0(m1Var.mo119973k())) {
                        bVar2 = new C118387c.C118389b(i5, 203);
                    }
                } else {
                    bVar2 = new C118387c.C118389b(i5, map2.get(i5).intValue());
                    map2.remove(i5);
                }
                if (bVar2 != null) {
                    aVar2.f353808h.add(bVar2);
                    Log.m105919d("MicroMsg.SubCoreBaseMonitor", "summerhv scanFile start scan subDir[%s], fileResult[%s], newSubDirResult[%s]", i5, aVar2, bVar2);
                }
            }
            C118387c.C118389b bVar3 = bVar2;
            aVar2.f353802b++;
            if (bVar3 != null) {
                bVar3.f353813c++;
            }
            if (cVar2 != null) {
                cVar2.f353818b++;
            }
            if (i2 > 15) {
                Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv scanFile been stopped as depth[%d] over limit path[%s], fileResult[%s]", Integer.valueOf(i), m1Var.mo119971i(), aVar2);
                return aVar2;
            }
            String[] s = m1Var.mo119981s();
            if (s == null) {
                Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv scanFile dir is empty[%s] ret", m1Var.mo119971i());
                return aVar2;
            } else if (z) {
                int length = s.length;
                while (i3 < length) {
                    String str = s[i3];
                    if (!Util.isNullOrNil(str) && Pattern.matches("[a-fA-F0-9]{32}temp[0-9]{13}", str)) {
                        C118387c.C118390c cVar3 = new C118387c.C118390c(m1Var.mo119971i() + "/" + str);
                        aVar2.f353809i.add(cVar3);
                        cVar2 = cVar3;
                    }
                    Cx0(new C86009m1(m1Var.mo119976n() + "/" + str), aVar, bVar3, cVar2, map, false, i2 + 1);
                    i3++;
                    s = s;
                    length = length;
                    bVar3 = bVar3;
                }
            } else {
                C118387c.C118389b bVar4 = bVar3;
                for (String str2 : s) {
                    Cx0(new C86009m1(m1Var.mo119971i() + "/" + str2), aVar, bVar4, cVar, map, false, i2 + 1);
                }
            }
        } else {
            aVar2.f353803c++;
            if (bVar2 != null) {
                bVar2.f353814d++;
            }
            if (cVar2 != null) {
                cVar2.f353819c++;
            }
            if (!m1Var.mo119967g()) {
                Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv scanFile file not exist[%s][%d] ret", m1Var.mo119971i(), Long.valueOf(aVar2.f353803c));
                return aVar2;
            }
            long r = m1Var.mo119980r();
            if (r <= 0 || r >= 2147483648L) {
                aVar2.f353805e++;
                if (bVar2 != null) {
                    bVar2.f353816f++;
                }
                if (cVar2 != null) {
                    cVar2.f353821e++;
                }
            } else {
                aVar2.f353804d += r;
                if (bVar2 != null) {
                    bVar2.f353815e += r;
                }
                if (cVar2 != null) {
                    cVar2.f353820d += r;
                }
            }
        }
        return aVar2;
    }

    public void onAccountInitialized(Context context) {
        Log.m105925i("MicroMsg.SubCoreBaseMonitor", "HeavyUserCfg sd[%d] sdr[%d] db[%d] fdbsize[%d] msg[%d] conv[%d] contact[%d] chatroom[%d] sditv[%d] sdwait[%d] dbitv[%d]", Long.valueOf(this.f353826d), Long.valueOf(this.f353827e), Long.valueOf(this.f353828f), Long.valueOf(this.f353833n), Long.valueOf(this.f353829g), Long.valueOf(this.f353830h), Long.valueOf(this.f353831i), Long.valueOf(this.f353832j), Long.valueOf(this.f353834o), Long.valueOf(this.f353835p), Long.valueOf(this.f353836q));
        C86709a0.m107528h();
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_HEAVY_USER_FLAG_LONG, 0L)).longValue();
        this.f353843x = longValue;
        CrashReportFactory.setHeavyUserFlag(longValue);
        C115666i.m162700g(this.f353843x != 0);
        Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv onAccountPostReset heavyuser[%d]", Long.valueOf(this.f353843x));
        C86709a0.m107528h();
        this.f353840u = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WECHAT_FILE_SCAN_LAST_TIME_LONG, 0L)).longValue();
        Context context2 = MMApplicationContext.getContext();
        Intent registerReceiver = context2.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f353838s = intExtra == 2 || intExtra == 5;
        } else {
            this.f353838s = false;
        }
        this.f353839t = ((PowerManager) context2.getSystemService("power")).isScreenOn();
        this.f353837r = new C118396k(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.DATE_CHANGED");
        context2.registerReceiver(this.f353837r, intentFilter);
        Object[] objArr = new Object[6];
        objArr[0] = this.f353842w != null ? "enabled" : "disabled";
        String str = "";
        objArr[1] = this.f353839t ? str : " not";
        if (!this.f353838s) {
            str = " not";
        }
        objArr[2] = str;
        objArr[3] = Long.valueOf(this.f353840u);
        objArr[4] = Long.valueOf(this.f353834o * 60000);
        objArr[5] = Long.valueOf(this.f353835p * 60000);
        Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv registerReceiver auto scan %s. Device status:%s interactive,%s charging mLastAutoScanTime[%d], mAutoScanInterval[%d], mAutoScanWaitTime[%d].", objArr);
        this.f353824A.stopTimer();
        if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
            this.f353825B.startTimer(3000, 10800000);
        }
    }

    public void onAccountReleased(Context context) {
        Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv onAccountRelease [%d]", Long.valueOf(f353822C), Long.valueOf(System.currentTimeMillis()));
        if (this.f353837r != null) {
            MMApplicationContext.getContext().unregisterReceiver(this.f353837r);
            Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv unregisterReceiver mChargeAndInteractiveReceiver[%s]", this.f353837r);
            this.f353837r = null;
        }
        C88654b bVar = this.f353841v;
        if (bVar != null) {
            bVar.mo97819a();
            this.f353841v = null;
            Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv unregisterReceiver remove[%s]", this.f353842w);
        }
        C118387c.C118388a aVar = this.f353842w;
        if (aVar != null) {
            aVar.f353810j = true;
            Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv unregisterReceiver canceled[%s]", aVar);
            this.f353842w = null;
        }
    }

    public final boolean yx0(HashMap<String, LinkedList<String>> hashMap, Map<String, Integer> map, String str, int i) {
        LinkedList linkedList = hashMap.get(str);
        if (linkedList == null) {
            return false;
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Integer.valueOf(i));
        }
        return true;
    }

    public final boolean zx0(String str) {
        C86709a0.m107528h();
        String str2 = C86709a0.m107535s().f251806d;
        return str2.equals(str + "/");
    }
}
