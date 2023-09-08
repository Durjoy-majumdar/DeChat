package com.tencent.p014mm.plugin.sns.model;

import android.text.TextUtils;
import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import hd0.C98398h0;
import hd0.C98408n0;
import hd0.C98429r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import te3.C101789j00;
import te3.C101804kv2;
import vr2.C102236a0;
import xb0.C102609h;

/* renamed from: com.tencent.mm.plugin.sns.model.e2 */
public class C94867e2 {

    /* renamed from: a */
    public static final LruCache<String, String> f274913a = new LruCache<>(10);

    /* renamed from: a */
    public static boolean m120282a() {
        SnsMethodCalculate.markStartTimeMs("checkCanSnsOnlineVideo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        C102609h.Fx0();
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_VDIEO_PLAYTYPE_INT_SYNC, -1);
        boolean z = false;
        if (j == 0) {
            Log.m105924i("MicroMsg.SubCoreVideoControl", "checkCanSnsOnlineVideo by local enable");
            z = true;
        } else if (j == 1) {
            Log.m105924i("MicroMsg.SubCoreVideoControl", "checkCanSnsOnlineVideo by local disable");
        } else {
            int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_ONLINE_VIDEO_INT, -1)).intValue();
            boolean Am = C102609h.m135509Am();
            boolean z2 = intValue != 0 && Am;
            Log.m105925i("MicroMsg.SubCoreVideoControl", "check can sns online play video [%b] mmvideoplayer[%b] opcode[%d] abTestFlag[%d]", Boolean.valueOf(z2), Boolean.valueOf(Am), Integer.valueOf(intValue), 1);
            z = z2;
        }
        SnsMethodCalculate.markEndTimeMs("checkCanSnsOnlineVideo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return z;
    }

    /* renamed from: b */
    public static String m120283b(int i, C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("genCdnMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        String b = C1297x.m1387b("snsvideo", (long) i, "sns", kv22.f298689d);
        if (Util.isNullOrNil(b)) {
            SnsMethodCalculate.markEndTimeMs("genCdnMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        if (!Util.isNullOrNil(kv22.f298689d, b) && kv22.f298689d.contains("SlideFullCardAd_")) {
            b = b + "_" + kv22.f298689d;
        }
        if (TextUtils.isEmpty(kv22.f298687U)) {
            SnsMethodCalculate.markEndTimeMs("genCdnMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return b;
        }
        String str = b + "_" + kv22.f298687U;
        SnsMethodCalculate.markEndTimeMs("genCdnMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return str;
    }

    /* renamed from: c */
    public static String m120284c(String str) {
        SnsMethodCalculate.markStartTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return "";
        }
        String str2 = "SNS_" + str;
        Log.m105919d("MicroMsg.SnsVideoLogic", "gen sns[%s] video file name [%s]", str, str2);
        SnsMethodCalculate.markEndTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return str2;
    }

    /* renamed from: d */
    public static String m120285d(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return "";
        } else if (TextUtils.isEmpty(str2)) {
            String c = m120284c(str);
            SnsMethodCalculate.markEndTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return c;
        } else {
            String str3 = "SNS_" + str + "_" + str2;
            Log.m105919d("MicroMsg.SnsVideoLogic", "gen sns[%s] video file name [%s]", str, str3);
            SnsMethodCalculate.markEndTimeMs("genFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return str3;
        }
    }

    /* renamed from: e */
    public static C98408n0 m120286e(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("getDownloadVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("getDownloadVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        } else if (TextUtils.isEmpty(str3)) {
            C98408n0 i = m120290i(str, str2);
            SnsMethodCalculate.markEndTimeMs("getDownloadVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return i;
        } else {
            ArrayList<C98408n0> p = C98429r0.m127825p(str2);
            if (p == null) {
                SnsMethodCalculate.markEndTimeMs("getDownloadVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                return null;
            }
            Iterator<C98408n0> it = p.iterator();
            while (it.hasNext()) {
                C98408n0 next = it.next();
                String str4 = next.f288533A;
                if (str4 != null && str4.equalsIgnoreCase(str3)) {
                    SnsMethodCalculate.markEndTimeMs("getDownloadVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                    return next;
                }
            }
            SnsMethodCalculate.markEndTimeMs("getDownloadVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
    }

    /* renamed from: f */
    public static String m120287f(String str, C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getDownloadVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        String str2 = "";
        String str3 = kv22 != null ? kv22.f298689d : str2;
        if (kv22 != null) {
            str2 = kv22.f298687U;
        }
        Log.m105925i("MicroMsg.SnsVideoLogic", "[%s]getDownloadVideoPath snsLocalId:%s videoFlag:%s", str3, str, str2);
        String p = m120297p(kv22);
        if (C86013q1.m106450k(p)) {
            Log.m105925i("MicroMsg.SnsVideoLogic", "it needn't download video[%s] because of the video is self. %s", str, p);
            SnsMethodCalculate.markEndTimeMs("getDownloadVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return p;
        }
        ArrayList<C98408n0> p2 = C98429r0.m127825p(str3);
        if (p2 == null || p2.isEmpty()) {
            Log.m105924i("MicroMsg.SnsVideoLogic", "getDownloadVideoPath info null");
            String t = m120301t(str, kv22);
            SnsMethodCalculate.markEndTimeMs("getDownloadVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return t;
        }
        Iterator<C98408n0> it = p2.iterator();
        while (it.hasNext()) {
            C98408n0 next = it.next();
            boolean k = C86013q1.m106450k(next.f288534B);
            Log.m105925i("MicroMsg.SnsVideoLogic", "getDownloadVideoPath snsLocalId:%s request-flag:%s dbflag:%s fileExists:%b path:%s", str, kv22.f298687U, next.f288533A, Boolean.valueOf(k), next.f288534B);
            if (C102236a0.m134704A0(next.f288533A, kv22.f298687U) && k) {
                if (next.mo137710n()) {
                    String str4 = next.f288534B;
                    SnsMethodCalculate.markEndTimeMs("getDownloadVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                    return str4;
                }
                SnsMethodCalculate.markEndTimeMs("getDownloadVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                return null;
            }
        }
        Log.m105924i("MicroMsg.SnsVideoLogic", "getDownloadVideoPath not find select videoFlag");
        String t2 = m120301t(str, kv22);
        SnsMethodCalculate.markEndTimeMs("getDownloadVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return t2;
    }

    /* renamed from: g */
    public static C98408n0 m120288g(String str) {
        SnsMethodCalculate.markStartTimeMs("getInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        String c = m120284c(str);
        SnsMethodCalculate.markStartTimeMs("getInfoByFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        C98408n0 i = C98429r0.m127818i(c);
        SnsMethodCalculate.markEndTimeMs("getInfoByFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return i;
    }

    /* renamed from: h */
    public static C98408n0 m120289h(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        } else if (TextUtils.isEmpty(str2)) {
            C98408n0 g = m120288g(str);
            SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return g;
        } else {
            String d = m120285d(str, str2);
            SnsMethodCalculate.markStartTimeMs("getInfoByFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            C98408n0 i = C98429r0.m127818i(d);
            SnsMethodCalculate.markEndTimeMs("getInfoByFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return i;
        }
    }

    /* renamed from: i */
    public static C98408n0 m120290i(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getInfoBySnsLocalIdOrMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalIdOrMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        } else if (TextUtils.isEmpty(str2)) {
            C98408n0 g = m120288g(str);
            SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalIdOrMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return g;
        } else {
            C98408n0 k = C98429r0.m127820k(m120284c(str), str2);
            SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalIdOrMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return k;
        }
    }

    /* renamed from: j */
    public static C98408n0 m120291j(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("getInfoBySnsLocalIdOrMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (TextUtils.isEmpty(str3)) {
            C98408n0 i = m120290i(str, str2);
            SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalIdOrMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return i;
        } else if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalIdOrMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        } else if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_video_info_error_repair, true)) {
            C98408n0 j = C98429r0.m127819j(m120285d(str, str3), str2, str3);
            SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalIdOrMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return j;
        } else {
            C98408n0 j2 = C98429r0.m127819j(m120284c(str), str2, str3);
            SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalIdOrMediaId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return j2;
        }
    }

    /* renamed from: k */
    public static String m120292k(String str) {
        C101789j00 j002;
        LinkedList<C101804kv2> linkedList;
        SnsMethodCalculate.markStartTimeMs("getRelocatedVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        Log.m105925i("MicroMsg.SnsVideoLogic", "getRelocatedVideoPath >> localId: %s", str);
        SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
        if (DN == null) {
            SnsMethodCalculate.markEndTimeMs("getRelocatedVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        TimeLineObject timeLine = DN.getTimeLine();
        if (timeLine == null || (j002 = timeLine.ContentObj) == null || (linkedList = j002.f298427h) == null || linkedList.isEmpty()) {
            Log.m105928w("MicroMsg.SnsVideoLogic", "getRelocatedVideoPath but no valid media found");
            SnsMethodCalculate.markEndTimeMs("getRelocatedVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        String m = m120294m(str, timeLine.ContentObj.f298427h.get(0));
        SnsMethodCalculate.markEndTimeMs("getRelocatedVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return m;
    }

    /* renamed from: l */
    public static String m120293l(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsVideoDir", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("getSnsVideoDir", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        String e = C94938q1.m120518e(C94866e1.m120262YO(), str);
        Log.m105925i("MicroMsg.SnsVideoLogic", "get sns video dir %s mediaId %s", e, str);
        SnsMethodCalculate.markEndTimeMs("getSnsVideoDir", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return e;
    }

    /* renamed from: m */
    public static String m120294m(String str, C101804kv2 kv22) {
        C98408n0 n0Var;
        SnsMethodCalculate.markStartTimeMs("getSnsVideoFullPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (kv22 == null) {
            SnsMethodCalculate.markEndTimeMs("getSnsVideoFullPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        String p = m120297p(kv22);
        if (C86013q1.m106450k(p)) {
            Log.m105925i("MicroMsg.SnsVideoLogic", "getSnsVideoFullPath >> it needn't download video[%s] because of the video is self. %s", str, p);
            SnsMethodCalculate.markEndTimeMs("getSnsVideoFullPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return p;
        } else if (!TextUtils.isEmpty(kv22.f298687U)) {
            SnsMethodCalculate.markStartTimeMs("getSuggestPlayVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            Log.m105925i("MicroMsg.SnsVideoLogic", "getSuggestPlayVideoInfo >> %s, %s", kv22.f298689d, kv22.f298687U);
            ArrayList<C98408n0> p2 = C98429r0.m127825p(kv22.f298689d);
            if (p2 == null || p2.size() == 0) {
                SnsMethodCalculate.markEndTimeMs("getSuggestPlayVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            } else {
                Iterator<C98408n0> it = p2.iterator();
                while (it.hasNext()) {
                    n0Var = it.next();
                    String str2 = n0Var.f288533A;
                    if (str2 != null && str2.compareTo("xV2") <= 0 && C86013q1.m106450k(n0Var.f288534B) && n0Var.mo137710n()) {
                        Log.m105925i("MicroMsg.SnsVideoLogic", "getSuggestPlayVideoInfo mediaid:%s flag:%s path:%s", kv22.f298689d, n0Var.f288533A, n0Var.f288534B);
                        SnsMethodCalculate.markEndTimeMs("getSuggestPlayVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                        break;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("getSuggestPlayVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            }
            n0Var = null;
            if (n0Var != null) {
                Log.m105925i("MicroMsg.SnsVideoLogic", "getSnsVideoFullPath have flag %s, %s >>", kv22.f298689d, n0Var);
                String str3 = n0Var.f288534B;
                SnsMethodCalculate.markEndTimeMs("getSnsVideoFullPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                return str3;
            }
            Log.m105925i("MicroMsg.SnsVideoLogic", "getSnsVideoFullPath have flag but result is null %s>>", kv22.f298689d);
            SnsMethodCalculate.markEndTimeMs("getSnsVideoFullPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        } else {
            String f = m120287f(str, kv22);
            Log.m105925i("MicroMsg.SnsVideoLogic", "getSnsVideoFullPath no have flag %s, %s >>", kv22.f298689d, f);
            SnsMethodCalculate.markEndTimeMs("getSnsVideoFullPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return f;
        }
    }

    /* renamed from: n */
    public static String m120295n(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (kv22 == null) {
            SnsMethodCalculate.markEndTimeMs("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        String str = f274913a.get(kv22.f298689d + kv22.f298687U);
        if (!TextUtils.isEmpty(str)) {
            Log.m105925i("MicroMsg.SnsVideoLogic", "getSnsVideoPath by cache:%s,[%s][%s]", str, kv22.f298689d, kv22.f298687U);
            SnsMethodCalculate.markEndTimeMs("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return str;
        }
        Log.m105925i("MicroMsg.SnsVideoLogic", "[%s]getSnsVideoPath flag:%s", kv22.f298689d, kv22.f298687U);
        String str2 = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134725T(kv22);
        if (TextUtils.isEmpty(kv22.f298687U)) {
            Log.m105925i("MicroMsg.SnsVideoLogic", "get sns video path1 %s", str2);
            SnsMethodCalculate.markEndTimeMs("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return str2;
        }
        ArrayList<C98408n0> p = C98429r0.m127825p(kv22.f298689d);
        if (p != null) {
            Iterator<C98408n0> it = p.iterator();
            while (it.hasNext()) {
                C98408n0 next = it.next();
                String str3 = next.f288534B;
                Log.m105925i("MicroMsg.SnsVideoLogic", "[%s]select dbflag:%s path:%s", kv22.f298689d, next.f288533A, str3);
                if (TextUtils.isEmpty(next.f288533A)) {
                    f274913a.put(kv22.f298689d + kv22.f298687U, str2);
                    SnsMethodCalculate.markEndTimeMs("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                    return str2;
                } else if (C102236a0.m134704A0(next.f288533A, kv22.f298687U)) {
                    f274913a.put(kv22.f298689d + kv22.f298687U, str3);
                    SnsMethodCalculate.markEndTimeMs("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                    return str3;
                }
            }
        }
        String str4 = str2 + "_" + kv22.f298687U;
        Log.m105925i("MicroMsg.SnsVideoLogic", "get sns video flag path3 %s", str4);
        f274913a.put(kv22.f298689d + kv22.f298687U, str4);
        SnsMethodCalculate.markEndTimeMs("getSnsVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return str4;
    }

    /* renamed from: o */
    public static String m120296o(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getSnsVideoThumbImagePath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (kv22 == null) {
            SnsMethodCalculate.markEndTimeMs("getSnsVideoThumbImagePath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return "";
        }
        String e = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d);
        String str = e + C102236a0.m134729X(kv22);
        boolean k = C86013q1.m106450k(str);
        Log.m105919d("MicroMsg.SnsVideoLogic", "get sns video thumb path %s [%b]", str, Boolean.valueOf(k));
        if (!k) {
            str = e + C102236a0.m134739d0(kv22);
            Log.m105925i("MicroMsg.SnsVideoLogic", "get sns video thumb path %s", str);
        }
        SnsMethodCalculate.markEndTimeMs("getSnsVideoThumbImagePath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return str;
    }

    /* renamed from: p */
    public static String m120297p(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getSnsVideoTmpPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (kv22 == null) {
            SnsMethodCalculate.markEndTimeMs("getSnsVideoTmpPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        String str = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134735b0(kv22);
        Log.m105925i("MicroMsg.SnsVideoLogic", "get sns video tmp path %s", str);
        SnsMethodCalculate.markEndTimeMs("getSnsVideoTmpPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return str;
    }

    /* renamed from: q */
    public static C98408n0 m120298q(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getSuggestPlayVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        Log.m105925i("MicroMsg.SnsVideoLogic", "getSuggestPlayVideoInfo for play >> %s, %s", kv22.f298689d, kv22.f298687U);
        ArrayList<C98408n0> p = C98429r0.m127825p(kv22.f298689d);
        if (p == null || p.size() == 0) {
            SnsMethodCalculate.markEndTimeMs("getSuggestPlayVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return null;
        }
        Iterator<C98408n0> it = p.iterator();
        while (it.hasNext()) {
            C98408n0 next = it.next();
            if ((TextUtils.isEmpty(next.f288533A) || next.f288533A.contains("V2") || next.f288533A.contains("V1") || next.f288533A.contains("V0")) && C86013q1.m106450k(next.f288534B) && next.mo137710n()) {
                Log.m105925i("MicroMsg.SnsVideoLogic", "getSuggestPlayVideoInfo for play mediaid:%s flag:%s path:%s", kv22.f298689d, next.f288533A, next.f288534B);
                SnsMethodCalculate.markEndTimeMs("getSuggestPlayVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                return next;
            }
        }
        SnsMethodCalculate.markEndTimeMs("getSuggestPlayVideoInfo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return null;
    }

    /* renamed from: r */
    public static boolean m120299r(String str, String str2, int i) {
        SnsMethodCalculate.markStartTimeMs("initSnsRecord", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.SnsVideoLogic", "init sns record, but snsLocalId is null");
            SnsMethodCalculate.markEndTimeMs("initSnsRecord", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return false;
        }
        String c = m120284c(str);
        C98408n0 n0Var = new C98408n0();
        n0Var.f288554a = c;
        n0Var.f288563j = Util.nowSecond();
        n0Var.f288562i = 130;
        n0Var.f288537E = i;
        n0Var.f288544L = str2;
        n0Var.f288545M = true;
        boolean s = C98398h0.Bx0().mo137730s(n0Var);
        Log.m105925i("MicroMsg.SnsVideoLogic", "init sns Record filename %s, insert %b", c, Boolean.valueOf(s));
        SnsMethodCalculate.markEndTimeMs("initSnsRecord", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return s;
    }

    /* renamed from: s */
    public static boolean m120300s(String str, String str2, int i, String str3, String str4) {
        SnsMethodCalculate.markStartTimeMs("initSnsRecord", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.SnsVideoLogic", "init sns record, but snsLocalId is null");
            SnsMethodCalculate.markEndTimeMs("initSnsRecord", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return false;
        }
        String d = m120285d(str, str3);
        C98408n0 n0Var = new C98408n0();
        n0Var.f288554a = d;
        n0Var.f288563j = Util.nowSecond();
        n0Var.f288562i = 130;
        String str5 = "x" + str3;
        n0Var.f288533A = str5;
        n0Var.f288537E = i;
        n0Var.f288544L = str2;
        n0Var.f288545M = true;
        n0Var.f288534B = str4;
        boolean s = C98398h0.Bx0().mo137730s(n0Var);
        Log.m105925i("MicroMsg.SnsVideoLogic", "init sns Record filename %s videoFlag:%s insert %b", d, str5, Boolean.valueOf(s));
        if (!s) {
            SnsMethodCalculate.markStartTimeMs("getInfoByFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            C98408n0 i2 = C98429r0.m127818i(d);
            SnsMethodCalculate.markEndTimeMs("getInfoByFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            Log.printInfoStack("MicroMsg.SnsVideoLogic", "initSnsRecord error!insert info:%s exist info:%s", n0Var.toString(), i2 != null ? i2.toString() : "");
        }
        SnsMethodCalculate.markEndTimeMs("initSnsRecord", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return s;
    }

    /* renamed from: t */
    public static String m120301t(String str, C101804kv2 kv22) {
        C98408n0 e;
        SnsMethodCalculate.markStartTimeMs("isDownloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        String p = m120297p(kv22);
        if (C86013q1.m106450k(p)) {
            Log.m105925i("MicroMsg.SnsVideoLogic", "it needn't download video[%s] because of the video is self. %s", str, p);
            SnsMethodCalculate.markEndTimeMs("isDownloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return p;
        } else if (kv22 == null || TextUtils.isEmpty(kv22.f298687U) || (e = m120286e(str, kv22.f298689d, kv22.f298687U)) == null) {
            String n = m120295n(kv22);
            boolean k = C86013q1.m106450k(n);
            C98408n0 i = m120290i(str, kv22 != null ? kv22.f298689d : null);
            if (i == null) {
                if (k) {
                    Log.m105925i("MicroMsg.SnsVideoLogic", "it old version already download video[%s]. path :%s", str, n);
                    if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_disable_sns_video_info_fix, false)) {
                        SnsMethodCalculate.markEndTimeMs("isDownloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                        return n;
                    }
                    m120299r(str, kv22 != null ? kv22.f298689d : null, 30);
                    Log.m105929w("MicroMsg.SnsVideoLogic", "recreate VideoInfo for %s", str);
                    SnsMethodCalculate.markEndTimeMs("isDownloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                    return null;
                }
                Log.m105925i("MicroMsg.SnsVideoLogic", "video info is null and file is no exists, return null.[%s]", str);
                SnsMethodCalculate.markEndTimeMs("isDownloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                return null;
            } else if (!k || !i.mo137710n() || (!TextUtils.isEmpty(i.f288533A) && !TextUtils.isEmpty(kv22.f298687U))) {
                Log.m105925i("MicroMsg.SnsVideoLogic", "it don't download video[%s] finish. file[%b] status[%d], return null.", str, Boolean.valueOf(k), Integer.valueOf(i.f288562i));
                SnsMethodCalculate.markEndTimeMs("isDownloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                return null;
            } else {
                Log.m105925i("MicroMsg.SnsVideoLogic", "it had download sns video[%s] finish. %s", str, n);
                SnsMethodCalculate.markEndTimeMs("isDownloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                return n;
            }
        } else {
            String str2 = e.f288534B;
            if (!C86013q1.m106450k(str2) || !e.mo137710n()) {
                SnsMethodCalculate.markEndTimeMs("isDownloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                return null;
            }
            Log.m105925i("MicroMsg.SnsVideoLogic", "isDownloadFinish return 1:%s", str2);
            SnsMethodCalculate.markEndTimeMs("isDownloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            return str2;
        }
    }

    /* renamed from: u */
    public static boolean m120302u(String str, String str2) {
        boolean z;
        boolean z2;
        SnsMethodCalculate.markStartTimeMs("postSnsVideo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        C98408n0 g = m120288g(str);
        if (g == null) {
            g = new C98408n0();
            g.f288554a = m120284c(str);
            z = true;
        } else {
            z = false;
        }
        g.f288563j = Util.nowSecond();
        g.f288579z = str2;
        g.f288562i = WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE;
        if (z) {
            z2 = C98398h0.Bx0().mo137730s(g);
        } else {
            g.f288548P = 33555200;
            z2 = C98398h0.Bx0().mo137733w(g);
        }
        Log.m105925i("MicroMsg.SnsVideoLogic", "post sns video snsLocalId %s, md5 %s ret %b", str, str2, Boolean.valueOf(z2));
        SnsMethodCalculate.markEndTimeMs("postSnsVideo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return z2;
    }

    /* renamed from: v */
    public static boolean m120303v(C98408n0 n0Var, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("updateSnsRecord", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        n0Var.f288562i = 130;
        n0Var.f288537E = i;
        n0Var.f288548P = 268435712;
        n0Var.f288544L = str;
        n0Var.f288545M = true;
        boolean w = C98398h0.Bx0().mo137733w(n0Var);
        Log.m105925i("MicroMsg.SnsVideoLogic", "update sns Record filename %s, update %b", n0Var.mo137700d(), Boolean.valueOf(w));
        SnsMethodCalculate.markEndTimeMs("updateSnsRecord", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        return w;
    }
}
