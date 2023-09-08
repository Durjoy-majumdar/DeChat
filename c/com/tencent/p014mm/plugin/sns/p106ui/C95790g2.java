package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import f40.C86709a0;
import java.util.HashSet;

/* renamed from: com.tencent.mm.plugin.sns.ui.g2 */
public class C95790g2 {

    /* renamed from: a */
    public long f279529a = 0;

    /* renamed from: b */
    public String f279530b = "";

    /* renamed from: c */
    public String f279531c = "";

    /* renamed from: d */
    public String f279532d = "";

    /* renamed from: e */
    public String f279533e = "";

    /* renamed from: f */
    public String f279534f = "";

    /* renamed from: g */
    public int f279535g = 0;

    /* renamed from: h */
    public int f279536h = 0;

    /* renamed from: i */
    public int f279537i = 0;

    /* renamed from: j */
    public long f279538j = 0;

    /* renamed from: k */
    public long f279539k = 0;

    /* renamed from: l */
    public boolean f279540l = false;

    /* renamed from: m */
    public HashSet<String> f279541m = new HashSet<>();

    /* renamed from: a */
    public void mo133238a() {
        SnsMethodCalculate.markStartTimeMs("cleanResume", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        this.f279529a = 0;
        SnsMethodCalculate.markEndTimeMs("cleanResume", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
    }

    /* renamed from: b */
    public boolean mo133239b() {
        SnsMethodCalculate.markStartTimeMs("getPullDownMode", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        boolean z = this.f279540l;
        SnsMethodCalculate.markEndTimeMs("getPullDownMode", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        return z;
    }

    /* renamed from: c */
    public String mo133240c() {
        SnsMethodCalculate.markStartTimeMs("getUnreadBottomSeq", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        String str = this.f279532d;
        SnsMethodCalculate.markEndTimeMs("getUnreadBottomSeq", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        return str;
    }

    /* renamed from: d */
    public String mo133241d() {
        SnsMethodCalculate.markStartTimeMs("getUnreadTopSeq", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        String str = this.f279533e;
        SnsMethodCalculate.markEndTimeMs("getUnreadTopSeq", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        return str;
    }

    /* renamed from: e */
    public String mo133242e() {
        SnsMethodCalculate.markStartTimeMs("getrespMinSeq", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        String str = this.f279531c;
        SnsMethodCalculate.markEndTimeMs("getrespMinSeq", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        return str;
    }

    /* renamed from: f */
    public boolean mo133243f() {
        SnsMethodCalculate.markStartTimeMs("resumeEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        long ticksToNow = Util.ticksToNow(this.f279529a);
        Log.m105925i("MicroMsg.ResumeSnsControl", "resume time %d", Long.valueOf(ticksToNow));
        Log.m105925i("MicroMsg.ResumeSnsControl", "lastSnsTime %s limitSeq %s respMinSeq %s timeLastId %s position %s topy %s, unreadBottomSeq:%s, unreadTopSeq:%s, timeFirstId:%s, upLimitSeq:%s, isPullDownMode:%s", Long.valueOf(this.f279529a), this.f279530b, this.f279531c, Long.valueOf(this.f279538j), Integer.valueOf(this.f279536h), Integer.valueOf(this.f279537i), this.f279532d, this.f279533e, Long.valueOf(this.f279539k), this.f279534f, Boolean.valueOf(this.f279540l));
        this.f279541m = new HashSet<>();
        if (MultiProcessMMKV.getMMKV("SnsMMKV").getBoolean("SnsMMKVDeleteTable", false)) {
            Log.m105924i("MicroMsg.ResumeSnsControl", "already delete table, need refresh");
            SnsMethodCalculate.markEndTimeMs("resumeEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            return false;
        }
        if (this.f279540l) {
            if (ticksToNow < ApkDownloadManager.INTERVAL) {
                Log.m105925i("MicroMsg.ResumeSnsControl", "timeLastId is %d ", Long.valueOf(this.f279538j));
                if (this.f279539k == 0 || this.f279538j == 0) {
                    SnsMethodCalculate.markEndTimeMs("resumeEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
                    return false;
                }
                C94866e1.dy0().mo6421r(this.f279538j, -1);
                C94866e1.dy0().mo6420q(this.f279539k);
                SnsMethodCalculate.markEndTimeMs("resumeEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
                return true;
            }
        } else if (ticksToNow < ApkDownloadManager.INTERVAL) {
            Log.m105925i("MicroMsg.ResumeSnsControl", "timeLastId is %d ", Long.valueOf(this.f279538j));
            if (this.f279538j == 0) {
                SnsMethodCalculate.markEndTimeMs("resumeEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
                return false;
            } else if (this.f279536h != 0 || Util.isNullOrNil((String) C86709a0.m107535s().mo121142i().mo119684e(68377, (Object) null))) {
                C94866e1.dy0().mo6421r(this.f279538j, -1);
                SnsMethodCalculate.markEndTimeMs("resumeEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
                return true;
            } else {
                SnsMethodCalculate.markEndTimeMs("resumeEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
                return false;
            }
        }
        SnsMethodCalculate.markEndTimeMs("resumeEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        return false;
    }
}
