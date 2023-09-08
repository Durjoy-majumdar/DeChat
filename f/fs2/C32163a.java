package fs2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.systemservicecache.NetworkCache;
import di3.C86312j;
import h81.C32735h;
import java.text.DateFormat;
import java.util.Date;
import xb0.C38471b;

/* renamed from: fs2.a */
public class C32163a {

    /* renamed from: a */
    public static int f85495a = 6;

    /* renamed from: b */
    public static int f85496b = 3;

    /* renamed from: c */
    public static int f85497c = 1000;

    /* renamed from: d */
    public static boolean f85498d = true;

    /* renamed from: e */
    public static String f85499e = "";

    /* renamed from: f */
    public static int f85500f = 0;

    /* renamed from: g */
    public static int f85501g = 60;

    /* renamed from: h */
    public static int f85502h = 1200;

    /* renamed from: i */
    public static float f85503i = 4.0f;

    /* renamed from: j */
    public static float f85504j = 8.0f;

    /* renamed from: k */
    public static int f85505k = 1;

    /* renamed from: l */
    public static int f85506l = 3;

    /* renamed from: a */
    public static boolean m39640a() {
        SnsMethodCalculate.markStartTimeMs("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        if (!f85498d) {
            Log.printInfoStack("MicroMsg.SnsPreloadSwitch", "disable by TIMELINE_MAIN_SWITCH", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
            return false;
        }
        int iOSNetTypeFromCache = NetworkCache.INSTANCE.getIOSNetTypeFromCache(MMApplicationContext.getContext());
        int i = f85500f;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && iOSNetTypeFromCache != 3) {
                        SnsMethodCalculate.markEndTimeMs("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
                        return false;
                    }
                } else if (!(iOSNetTypeFromCache == 1 || iOSNetTypeFromCache == 4)) {
                    SnsMethodCalculate.markEndTimeMs("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
                    return false;
                }
            } else if (iOSNetTypeFromCache != 4) {
                SnsMethodCalculate.markEndTimeMs("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
                return false;
            }
        } else if (iOSNetTypeFromCache != 1) {
            SnsMethodCalculate.markEndTimeMs("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
            return false;
        }
        if (!TextUtils.isEmpty(f85499e) && C38471b.m41885a(f85499e)) {
            Log.printInfoStack("MicroMsg.SnsPreloadSwitch", "disable by TIMELINE_DAY_UNABLE_PRELOAD_TIME_INTERVAL %s", f85499e);
            SnsMethodCalculate.markEndTimeMs("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
            return false;
        } else if (!m39641b(0)) {
            Log.printInfoStack("MicroMsg.SnsPreloadSwitch", "disable by TIMELINE_MAX_PRELOAD_COUNT", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
            return false;
        } else {
            SnsMethodCalculate.markEndTimeMs("enableTimelinePreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
            return true;
        }
    }

    /* renamed from: b */
    public static boolean m39641b(int i) {
        SnsMethodCalculate.markStartTimeMs("updatePreloadCount", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        String format = DateFormat.getDateInstance().format(new Date());
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("MicroMsg.SnsPreloadSwitch");
        String decodeString = mmkv.decodeString("SnsPreloadSwitch_KEY_DATE");
        if (TextUtils.isEmpty(decodeString) || !decodeString.equals(format)) {
            Log.m105925i("MicroMsg.SnsPreloadSwitch", "yesterday preload count:%d", Integer.valueOf(mmkv.decodeInt("SnsPreloadSwitch_KEY_COUNT")));
            mmkv.encode("SnsPreloadSwitch_KEY_DATE", format);
            mmkv.encode("SnsPreloadSwitch_KEY_COUNT", i);
            SnsMethodCalculate.markEndTimeMs("updatePreloadCount", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
            return true;
        }
        int decodeInt = i + mmkv.decodeInt("SnsPreloadSwitch_KEY_COUNT", 0);
        if (decodeInt < f85497c) {
            mmkv.encode("SnsPreloadSwitch_KEY_COUNT", decodeInt);
            SnsMethodCalculate.markEndTimeMs("updatePreloadCount", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("updatePreloadCount", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        return false;
    }

    /* renamed from: c */
    public static void m39642c() {
        Class cls = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("updateSwitch", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        f85498d = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_timeline_preload_switch, true);
        f85499e = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_timeline_preload_time, "20:00-23:59");
        f85500f = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_timeline_preload_nettype, 1);
        f85495a = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_timeline_preload_in_queue, 6);
        f85496b = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_timeline_parallel_in_queue, 3);
        f85497c = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_timeline_max_preload, 1000);
        f85501g = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_timeline_preload_percent, 60);
        f85503i = ((C32735h) C86312j.m106911c(cls)).mo58785xe(C32735h.C32737c.clicfg_timeline_preload_time_min, 4.0f);
        f85504j = ((C32735h) C86312j.m106911c(cls)).mo58785xe(C32735h.C32737c.clicfg_timeline_preload_time_max, 8.0f);
        SnsMethodCalculate.markStartTimeMs("getSnsRedDotPreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_red_dot_preload, 1);
        f85505k = Qe;
        SnsMethodCalculate.markEndTimeMs("getSnsRedDotPreload", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        f85505k = Qe;
        SnsMethodCalculate.markStartTimeMs("getSnsPreloadVideoExpiredTime", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_sns_preload_video_expired_time, 3);
        f85506l = Qe2;
        SnsMethodCalculate.markEndTimeMs("getSnsPreloadVideoExpiredTime", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        f85506l = Qe2;
        Log.printInfoStack("MicroMsg.SnsPreloadSwitch", "TIMELINE_MAIN_SWITCH:%b\nTIMELINE_DAY_UNABLE_PRELOAD_TIME_INTERVAL:%s\nTIMELINE_PRELOAD_NET_TYPE:%d\nTIMELINE_MAX_PRELOAD_IN_QUEUE:%d\nTIMELINE_MAX_PARALLEL_IN_QUEUE:%d\n TIMELINE_MAX_PRELOAD_COUNT:%d\nTIMELINE_PRELOAD_PERCENT:%d\nTIMELINE_OUT_PRELOAD_INTERVAL:%d\nSNS_RED_DOT_PRELOAD:%d\n SNS_PRELOAD_VIDEO_EXPIRED_TIME:%d\nSNS_RED_DOT_PRELOAD_BUSY_TIME:%s", Boolean.valueOf(f85498d), f85499e, Integer.valueOf(f85500f), Integer.valueOf(f85495a), Integer.valueOf(f85496b), Integer.valueOf(f85497c), Integer.valueOf(f85501g), Integer.valueOf(f85502h), Integer.valueOf(f85505k), Integer.valueOf(f85506l), "20:00-23:59");
        SnsMethodCalculate.markEndTimeMs("updateSwitch", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
    }
}
