package com.tencent.p014mm.plugin.sns.model;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.xweb.util.FrequentLimiter;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.concurrent.CopyOnWriteArrayList;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.model.k2 */
public final class C94891k2 {

    /* renamed from: a */
    public static final C94891k2 f274975a = new C94891k2();

    /* renamed from: b */
    public static final MultiProcessMMKV f274976b;

    /* renamed from: c */
    public static int f274977c = 2;

    /* renamed from: d */
    public static long f274978d = FrequentLimiter.WEEK_MILLS;

    /* renamed from: e */
    public static long f274979e = FrequentLimiter.WEEK_MILLS;

    /* renamed from: f */
    public static CopyOnWriteArrayList<String> f274980f = new CopyOnWriteArrayList<>();

    static {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("SnsWsFoldManager");
        C87412m.m108593f(mmkv, "getMMKV(\"SnsWsFoldManager\")");
        f274976b = mmkv;
    }

    /* renamed from: a */
    public final void mo131068a(SnsInfo snsInfo, int i) {
        SnsInfo snsInfo2 = snsInfo;
        SnsMethodCalculate.markStartTimeMs("clickWsFriendDetails", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        C87412m.m108594g(snsInfo2, "snsInfo");
        if (mo131072e(snsInfo2, "clickWsFriendDetails")) {
            SnsMethodCalculate.markEndTimeMs("clickWsFriendDetails", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            return;
        }
        String userName = snsInfo.getUserName();
        C87412m.m108593f(userName, "userName");
        String d = mo131071d(userName);
        MultiProcessMMKV multiProcessMMKV = f274976b;
        String string = multiProcessMMKV.getString(d, "");
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(string)) {
            Log.m105924i("MicroMsg.SnsWsFoldManager", "userName=" + userName + ", first clickWsFriendDetails and record, now = " + currentTimeMillis);
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
            multiProcessMMKV.encode(d, userName + ',' + currentTimeMillis + ',' + -1 + ',' + 0);
        } else {
            Log.m105924i("MicroMsg.SnsWsFoldManager", "userName=" + userName + ", second clickWsFriendDetails and record, now = " + currentTimeMillis);
            C94955u2 a = C94955u2.f275271e.mo131291a(string);
            a.mo131287b(currentTimeMillis);
            String g = C102236a0.m134744g(C31543z5.m39453c());
            Log.m105924i("MicroMsg.SnsWsFoldManager", "[clickWsFriendDetails] report27795 feedId = " + snsInfo2.field_snsId + ", userName = " + userName + ", scene = " + i + ", session = " + g);
            C115669n.INSTANCE.mo160131h(27795, 2, Long.valueOf(snsInfo2.field_snsId), userName, g, Integer.valueOf(i));
            multiProcessMMKV.encode(d, a.toString());
        }
        SnsMethodCalculate.markEndTimeMs("clickWsFriendDetails", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
    }

    /* renamed from: b */
    public final void mo131069b(SnsInfo snsInfo, int i) {
        SnsInfo snsInfo2 = snsInfo;
        SnsMethodCalculate.markStartTimeMs("doWsFriendInteractive", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        C87412m.m108594g(snsInfo2, "snsInfo");
        if (mo131072e(snsInfo2, "doWsFriendInteractive")) {
            SnsMethodCalculate.markEndTimeMs("doWsFriendInteractive", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            return;
        }
        String userName = snsInfo.getUserName();
        C87412m.m108593f(userName, "userName");
        String d = mo131071d(userName);
        MultiProcessMMKV multiProcessMMKV = f274976b;
        String string = multiProcessMMKV.getString(d, "");
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(string)) {
            Log.m105924i("MicroMsg.SnsWsFoldManager", "userName=" + userName + ", first doWsFriendInteractive and record, now = " + currentTimeMillis);
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
            multiProcessMMKV.encode(d, userName + ',' + currentTimeMillis + ',' + -1 + ',' + 0);
        } else {
            Log.m105924i("MicroMsg.SnsWsFoldManager", "userName=" + userName + ", second doWsFriendInteractive and record, now = " + currentTimeMillis);
            C94955u2 a = C94955u2.f275271e.mo131291a(string);
            a.mo131287b(currentTimeMillis);
            String g = C102236a0.m134744g(C31543z5.m39453c());
            Log.m105924i("MicroMsg.SnsWsFoldManager", "[doWsFriendInteractive] report27795 feedId = " + snsInfo2.field_snsId + ", userName = " + userName + ", scene = " + i + ", session = " + g);
            C115669n.INSTANCE.mo160131h(27795, 3, Long.valueOf(snsInfo2.field_snsId), userName, g, Integer.valueOf(i));
            multiProcessMMKV.encode(d, a.toString());
        }
        SnsMethodCalculate.markEndTimeMs("doWsFriendInteractive", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
    }

    /* renamed from: c */
    public final void mo131070c(SnsInfo snsInfo, int i) {
        SnsInfo snsInfo2 = snsInfo;
        SnsMethodCalculate.markStartTimeMs("forwardWsFriendContent", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        C87412m.m108594g(snsInfo2, "snsInfo");
        if (mo131072e(snsInfo2, "forwardWsFriendContent")) {
            SnsMethodCalculate.markEndTimeMs("forwardWsFriendContent", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            return;
        }
        String userName = snsInfo.getUserName();
        C87412m.m108593f(userName, "userName");
        String d = mo131071d(userName);
        MultiProcessMMKV multiProcessMMKV = f274976b;
        String string = multiProcessMMKV.getString(d, "");
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(string)) {
            Log.m105924i("MicroMsg.SnsWsFoldManager", "userName=" + userName + ", first forwardWsFriendContent and record, now = " + currentTimeMillis);
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
            multiProcessMMKV.encode(d, userName + ',' + currentTimeMillis + ',' + -1 + ',' + 0);
        } else {
            C94955u2 a = C94955u2.f275271e.mo131291a(string);
            Log.m105924i("MicroMsg.SnsWsFoldManager", "userName=" + userName + ", first forwardWsFriendContent and record, now = " + currentTimeMillis);
            a.mo131287b(currentTimeMillis);
            String g = C102236a0.m134744g(C31543z5.m39453c());
            Log.m105924i("MicroMsg.SnsWsFoldManager", "[doWsFriendInteractive] report27795 feedId = " + snsInfo2.field_snsId + ", userName = " + userName + ", scene = " + i + ", session = " + g);
            C115669n.INSTANCE.mo160131h(27795, 4, Long.valueOf(snsInfo2.field_snsId), userName, g, Integer.valueOf(i));
            multiProcessMMKV.encode(d, a.toString());
        }
        SnsMethodCalculate.markEndTimeMs("forwardWsFriendContent", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
    }

    /* renamed from: d */
    public final String mo131071d(String str) {
        SnsMethodCalculate.markStartTimeMs("generateMMKVKey", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        String str2 = "key_prefix_username_" + str;
        SnsMethodCalculate.markEndTimeMs("generateMMKVKey", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        return str2;
    }

    /* renamed from: e */
    public final boolean mo131072e(SnsInfo snsInfo, String str) {
        SnsMethodCalculate.markStartTimeMs("isSnsInfoInValid", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        if (snsInfo == null) {
            Log.m105920e("MicroMsg.SnsWsFoldManager", '[' + str + "] snsInfo empty and return function");
            SnsMethodCalculate.markEndTimeMs("isSnsInfoInValid", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            return true;
        }
        if (!snsInfo.isWsFeedType()) {
            Log.m105920e("MicroMsg.SnsWsFoldManager", '[' + str + "] snsInfo is not wsFeedType and return function");
        }
        if (TextUtils.isEmpty(snsInfo.getUserName())) {
            Log.m105920e("MicroMsg.SnsWsFoldManager", '[' + str + "] userName empty and return function");
            SnsMethodCalculate.markEndTimeMs("isSnsInfoInValid", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("isSnsInfoInValid", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        return false;
    }
}
