package jp2;

import android.database.Cursor;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.List;
import java.util.Random;
import lc3.C10485b;
import ob0.C117747y;
import ob0.C35142u;
import os2.C35292h0;
import pe3.C89349b;
import te3.C51263sl2;
import te3.l74;
import zt3.C119157j;

/* renamed from: jp2.q */
public class C33615q implements C35142u {

    /* renamed from: n */
    public static int f90975n = 20480;

    /* renamed from: o */
    public static int f90976o = 30720;

    /* renamed from: p */
    public static int f90977p = 51200;

    /* renamed from: q */
    public static int f90978q = 60;

    /* renamed from: r */
    public static int f90979r = 1800;

    /* renamed from: s */
    public static volatile boolean f90980s = false;

    /* renamed from: t */
    public static int f90981t = 43200;

    /* renamed from: d */
    public int f90982d = 0;

    /* renamed from: e */
    public long f90983e = 0;

    /* renamed from: f */
    public Random f90984f = new Random(System.currentTimeMillis());

    /* renamed from: g */
    public l74 f90985g = new l74();

    /* renamed from: h */
    public boolean f90986h = false;

    /* renamed from: i */
    public long f90987i = 0;

    /* renamed from: j */
    public int f90988j = 0;

    /* renamed from: jp2.q$a */
    public class C33616a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f90989d;

        /* renamed from: e */
        public final /* synthetic */ Object[] f90990e;

        public C33616a(int i, Object[] objArr) {
            this.f90989d = i;
            this.f90990e = objArr;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$1");
            C51263sl2 sl22 = new C51263sl2();
            sl22.f141588d = this.f90989d;
            sl22.f141590f = (int) (System.currentTimeMillis() / 1000);
            sl22.f141591g = 1;
            String B = C33615q.this.mo59223B(this.f90990e);
            sl22.f141589e = new C89349b(B.getBytes());
            C33615q.m40139d(C33615q.this).f137242d.add(sl22);
            Log.m105924i("MicroMsg.SnsLogMgr", "snsadlog " + this.f90989d + " " + B);
            C33615q qVar = C33615q.this;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            long j = qVar.f90983e;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            if (j == 0) {
                C33615q qVar2 = C33615q.this;
                long currentTimeMillis = System.currentTimeMillis();
                SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
                qVar2.f90983e = currentTimeMillis;
                SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$1");
        }
    }

    /* renamed from: jp2.q$b */
    public class C33617b implements Runnable {

        /* renamed from: jp2.q$b$a */
        public class C33618a implements Runnable {
            public C33618a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$2$1");
                C33615q qVar = C33615q.this;
                SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
                qVar.f90986h = false;
                SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
                C33615q.this.mo59224D();
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$2$1");
            }
        }

        public C33617b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$2");
            C94866e1.ky0().execute(new C33618a());
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$2");
        }
    }

    /* renamed from: d */
    public static /* synthetic */ l74 m40139d(C33615q qVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        l74 l74 = qVar.f90985g;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        return l74;
    }

    /* renamed from: q */
    public static void m40140q(C33615q qVar) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        qVar.getClass();
        SnsMethodCalculate.markStartTimeMs("trigerSaveImp", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        if (qVar.f90985g.f137242d.size() > 0) {
            Log.m105924i("MicroMsg.SnsLogMgr", "trigerSave " + qVar.f90985g.f137242d.size());
            C94866e1.by0().mo60190jo(qVar.f90985g);
            qVar.f90985g.f137242d.clear();
        }
        SnsMethodCalculate.markEndTimeMs("trigerSaveImp", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
    }

    /* renamed from: B */
    public String mo59223B(Object... objArr) {
        String str;
        SnsMethodCalculate.markStartTimeMs("getStringFromMutilObj", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        if (objArr == null || objArr.length <= 0) {
            Log.m105928w("MicroMsg.SnsLogMgr", "vals is null, use '' as value");
            str = "";
        } else {
            StringBuilder sb = new StringBuilder();
            int length = objArr.length - 1;
            for (int i = 0; i < length; i++) {
                sb.append(String.valueOf(objArr[i]));
                sb.append(',');
            }
            sb.append(String.valueOf(objArr[length]));
            str = sb.toString();
        }
        SnsMethodCalculate.markEndTimeMs("getStringFromMutilObj", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        return str;
    }

    /* renamed from: D */
    public void mo59224D() {
        SnsMethodCalculate.markStartTimeMs("tryReport", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        int i = C94866e1.f274866V;
        SnsMethodCalculate.markStartTimeMs("canReport", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        init();
        C86709a0.m107528h();
        int i2 = 0;
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.BUSINESS_SNS_ADLOG_CNTTIME_INT, 0)).intValue();
        C86709a0.m107528h();
        int intValue2 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.BUSINESS_SNS_ADLOG_FREQUENCY_INT, -1)).intValue();
        boolean z = true;
        if (intValue2 > f90981t || intValue2 < 0) {
            intValue2 = this.f90984f.nextInt((f90979r - f90978q) + 1) + f90978q;
        }
        if ((System.currentTimeMillis() / 1000) - ((long) intValue) > ((long) intValue2)) {
            SnsMethodCalculate.markEndTimeMs("canReport", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        } else {
            SnsMethodCalculate.markEndTimeMs("canReport", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            z = false;
        }
        if (!z) {
            SnsMethodCalculate.markStartTimeMs("trySave", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            C94866e1.ky0().execute(new C33619r(this));
            SnsMethodCalculate.markEndTimeMs("trySave", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            Log.m105918d("MicroMsg.SnsLogMgr", "pass report ");
            SnsMethodCalculate.markEndTimeMs("tryReport", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            return;
        }
        C35292h0 by02 = C94866e1.by0();
        by02.getClass();
        SnsMethodCalculate.markStartTimeMs("getLast", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
        Log.m105924i("MicroMsg.SnsKvReportStg", " getLast select rowid from SnsReportKv order by rowid desc  limit 1");
        Cursor rawQuery = by02.f94552d.rawQuery("select rowid from SnsReportKv order by rowid desc  limit 1", (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            i2 = rawQuery.getInt(0);
        }
        rawQuery.close();
        SnsMethodCalculate.markEndTimeMs("getLast", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
        this.f90982d = i2;
        SnsMethodCalculate.markStartTimeMs("reportNow", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        C94866e1.ky0().execute(new C33620s(this));
        SnsMethodCalculate.markEndTimeMs("reportNow", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        SnsMethodCalculate.markStartTimeMs("trySave", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        C94866e1.ky0().execute(new C33619r(this));
        SnsMethodCalculate.markEndTimeMs("trySave", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        SnsMethodCalculate.markEndTimeMs("tryReport", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
    }

    /* renamed from: h */
    public void mo59225h(int i, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        C94866e1.ky0().execute(new C33616a(i, objArr));
        if (this.f90986h) {
            SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            return;
        }
        this.f90986h = true;
        ((C119157j) C119157j.f356862d).mo183878i(new C33617b(), 2000);
        SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
    }

    public final void init() {
        Class cls = C10485b.class;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        if (f90980s) {
            SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        } else if (!C86709a0.m107522a()) {
            Log.m105924i("MicroMsg.SnsLogMgr", "Account not ready");
            SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        } else {
            f90975n = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("MMUxAdLog2GSendSize", 20480);
            f90976o = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("MMUxAdLog3GSendSize", 30720);
            f90977p = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("MMUxAdLogWifiSendSize", 51200);
            f90978q = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("MMUxAdLogMinRandTime", 60);
            f90979r = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("MMUxAdLogMaxRandTime", 1800);
            f90981t = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("MMUxAdLogMaxExceptionTime", 43200);
            Log.m105924i("MicroMsg.SnsLogMgr", "init " + f90975n + ";" + f90976o + ";" + f90977p + ";" + f90978q + ";" + f90979r + ";" + f90981t);
            int i = f90979r;
            int i2 = f90978q;
            if (i - i2 < 0) {
                f90979r = i2;
            }
            f90980s = true;
            SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        if (yVar.getType() == 1802 && (yVar instanceof C46565k)) {
            C46565k kVar = (C46565k) yVar;
            if (i == 0 && i2 == 0) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.BUSINESS_SNS_ADLOG_CNTTIME_INT, Integer.valueOf((int) (System.currentTimeMillis() / 1000)));
                SnsMethodCalculate.markStartTimeMs("reportNow", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
                C94866e1.ky0().execute(new C33620s(this));
                SnsMethodCalculate.markEndTimeMs("reportNow", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            } else {
                SnsMethodCalculate.markStartTimeMs("getList", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
                List<C51263sl2> list = kVar.f125459f;
                SnsMethodCalculate.markEndTimeMs("getList", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
                C35292h0 by02 = C94866e1.by0();
                by02.getClass();
                SnsMethodCalculate.markStartTimeMs("addKv", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
                l74 l74 = new l74();
                for (C51263sl2 add : list) {
                    l74.f137242d.add(add);
                }
                by02.mo60190jo(l74);
                SnsMethodCalculate.markEndTimeMs("addKv", "com.tencent.mm.plugin.sns.storage.SnsKvReportStg");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
    }
}
