package com.tencent.qbar;

import android.graphics.Point;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.qbar.WxQbarNative;
import gt3.C20839a;
import java.util.List;
import vl2.C37756o;

/* renamed from: com.tencent.qbar.b */
public class C19933b {

    /* renamed from: H */
    public static C19933b f56833H = new C19933b();

    /* renamed from: I */
    public static C19933b f56834I = new C19933b();

    /* renamed from: A */
    public int f56835A;

    /* renamed from: B */
    public int f56836B = 0;

    /* renamed from: C */
    public int f56837C = 0;

    /* renamed from: D */
    public String f56838D = "";

    /* renamed from: E */
    public String f56839E = "";

    /* renamed from: F */
    public String f56840F = "";

    /* renamed from: G */
    public Object f56841G = new Object();

    /* renamed from: a */
    public long f56842a = 0;

    /* renamed from: b */
    public boolean f56843b = false;

    /* renamed from: c */
    public int f56844c = 0;

    /* renamed from: d */
    public long f56845d = 0;

    /* renamed from: e */
    public int f56846e = -1;

    /* renamed from: f */
    public Point f56847f = null;

    /* renamed from: g */
    public String f56848g;

    /* renamed from: h */
    public String f56849h;

    /* renamed from: i */
    public String f56850i;

    /* renamed from: j */
    public int f56851j;

    /* renamed from: k */
    public int f56852k;

    /* renamed from: l */
    public String f56853l;

    /* renamed from: m */
    public int f56854m = 0;

    /* renamed from: n */
    public int f56855n;

    /* renamed from: o */
    public int f56856o;

    /* renamed from: p */
    public int f56857p = 0;

    /* renamed from: q */
    public long f56858q = 0;

    /* renamed from: r */
    public int f56859r = 0;

    /* renamed from: s */
    public float f56860s = 1.0f;

    /* renamed from: t */
    public long f56861t = 0;

    /* renamed from: u */
    public int f56862u = 0;

    /* renamed from: v */
    public boolean f56863v = false;

    /* renamed from: w */
    public boolean f56864w;

    /* renamed from: x */
    public String f56865x;

    /* renamed from: y */
    public float f56866y;

    /* renamed from: z */
    public int f56867z;

    /* renamed from: a */
    public void mo27308a(float f) {
        this.f56859r++;
        this.f56860s *= f;
        this.f56861t = System.currentTimeMillis() - this.f56858q;
        Log.m105927v("MicroMsg.QBarEngineReporter", "alvinluo zoom %d, zoomFactor: %s, totalZoomFactor: %s, lastZoomCostTime: %d", Integer.valueOf(this.f56859r), Float.valueOf(f), Float.valueOf(this.f56860s), Long.valueOf(this.f56861t));
    }

    /* renamed from: b */
    public void mo27309b() {
        synchronized (this.f56841G) {
            if (this.f56863v) {
                Log.m105924i("MicroMsg.QBarEngineReporter", "doReport, already report");
                return;
            }
            int e = C37756o.m41531e();
            boolean z = C20839a.f58861k;
            boolean z2 = C20839a.f58860j;
            Object[] objArr = new Object[27];
            objArr[0] = Integer.valueOf(this.f56844c);
            objArr[1] = Long.valueOf(this.f56842a);
            objArr[2] = Long.valueOf(this.f56845d);
            objArr[3] = Integer.valueOf(this.f56846e);
            objArr[4] = this.f56847f;
            objArr[5] = 0;
            objArr[6] = Boolean.valueOf(this.f56843b);
            objArr[7] = this.f56848g;
            objArr[8] = this.f56849h;
            objArr[9] = this.f56850i;
            objArr[10] = Integer.valueOf(this.f56851j);
            objArr[11] = Integer.valueOf(this.f56852k);
            objArr[12] = this.f56853l;
            objArr[13] = Integer.valueOf(!Util.isNullOrNil(this.f56849h) ? this.f56849h.length() : 0);
            objArr[14] = "0";
            objArr[15] = Integer.valueOf(this.f56856o);
            objArr[16] = Integer.valueOf(this.f56857p);
            objArr[17] = Integer.valueOf(this.f56859r);
            objArr[18] = Long.valueOf(this.f56861t);
            objArr[19] = Float.valueOf(this.f56860s);
            objArr[20] = Integer.valueOf(this.f56862u);
            objArr[21] = Integer.valueOf(e);
            objArr[22] = this.f56838D;
            objArr[23] = this.f56839E;
            objArr[24] = Integer.valueOf(z ? 1 : 0);
            objArr[25] = Integer.valueOf(z2 ? 1 : 0);
            objArr[26] = this.f56840F;
            Log.m105925i("MicroMsg.QBarEngineReporter", "doReport, scanTotalFrames: %s, totalScanTime: %s, scanSuccessTime: %s, scanScene: %s, scanResolution: %s, retryCount: %s, scanSuccess: %s, decodeTypeName: %s, dataContent: %s, dataCharSet: %s, qrCodeVersion: %s, pyramidLv: %s, binarizerMethod: %s,dataContentLen: %d,zoomLog: %s,lightMode: %d, tabType: %d,zoomCount: %s, zoomLastCostTime: %s, totalZoomFactor: %s, waitingFrame: %s, qbarBackend:%d, tabSession:%s, scanSession:%s, qBarOptDet:%s, qBarOptSr:%s, callSnapShot:%s", objArr);
            String str = "";
            if (this.f56847f != null) {
                str = this.f56847f.x + "x" + this.f56847f.y;
            }
            boolean z3 = this.f56843b;
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr2 = new Object[41];
            objArr2[0] = Integer.valueOf(this.f56844c);
            C115669n nVar2 = nVar;
            objArr2[1] = Long.valueOf(this.f56842a);
            objArr2[2] = Long.valueOf(this.f56845d);
            objArr2[3] = Integer.valueOf(this.f56846e);
            objArr2[4] = str;
            objArr2[5] = 0;
            objArr2[6] = Integer.valueOf(this.f56843b ? 0 : 1);
            objArr2[7] = this.f56848g;
            objArr2[8] = "";
            objArr2[9] = this.f56850i;
            objArr2[10] = Integer.valueOf(this.f56851j);
            objArr2[11] = Integer.valueOf(this.f56852k);
            objArr2[12] = this.f56853l;
            objArr2[13] = Integer.valueOf(!Util.isNullOrNil(this.f56849h) ? this.f56849h.length() : 0);
            objArr2[14] = "0";
            objArr2[15] = Integer.valueOf(this.f56856o);
            objArr2[16] = Integer.valueOf(this.f56864w ? 1 : 0);
            objArr2[17] = 0;
            objArr2[18] = QbarNative.GetVersion();
            objArr2[19] = Integer.valueOf(this.f56854m);
            objArr2[20] = Integer.valueOf(this.f56855n);
            objArr2[21] = 0;
            objArr2[22] = "";
            objArr2[23] = this.f56865x;
            objArr2[24] = Integer.valueOf((int) (this.f56866y * 10.0f));
            objArr2[25] = Integer.valueOf(this.f56867z);
            objArr2[26] = Integer.valueOf(this.f56835A);
            objArr2[27] = Integer.valueOf(this.f56836B);
            objArr2[28] = Integer.valueOf(this.f56837C);
            objArr2[29] = Integer.valueOf(this.f56857p);
            objArr2[30] = Integer.valueOf(this.f56854m);
            objArr2[31] = Integer.valueOf(this.f56859r);
            objArr2[32] = Long.valueOf(this.f56861t);
            objArr2[33] = Integer.valueOf((int) (this.f56860s * 100.0f));
            objArr2[34] = Integer.valueOf(this.f56862u);
            objArr2[35] = Integer.valueOf(e);
            objArr2[36] = this.f56838D;
            objArr2[37] = this.f56839E;
            objArr2[38] = Integer.valueOf(z);
            objArr2[39] = Integer.valueOf(z2);
            objArr2[40] = this.f56840F;
            nVar2.mo160131h(13233, objArr2);
            this.f56863v = true;
        }
    }

    /* renamed from: c */
    public void mo27310c() {
        synchronized (this.f56841G) {
            this.f56842a = 0;
            this.f56843b = false;
            this.f56844c = 0;
            this.f56846e = -1;
            this.f56847f = null;
            this.f56848g = "";
            this.f56849h = "";
            this.f56850i = "";
            this.f56851j = 0;
            this.f56852k = 0;
            this.f56853l = "";
            this.f56845d = 0;
            this.f56863v = false;
            this.f56856o = 0;
            this.f56864w = false;
            this.f56854m = 0;
            this.f56855n = 0;
            this.f56865x = "";
            this.f56866y = 0.0f;
            this.f56867z = 0;
            this.f56835A = 0;
            this.f56836B = 0;
            this.f56837C = 0;
            this.f56857p = 0;
            this.f56858q = 0;
            this.f56859r = 0;
            this.f56861t = 0;
            this.f56862u = 0;
            this.f56838D = "";
            this.f56839E = "";
            this.f56840F = "";
            Log.m105924i("MicroMsg.QBarEngineReporter", "reset");
        }
    }

    /* renamed from: d */
    public void mo27311d(String str, String str2, String str3, WxQbarNative.QBarReportMsg qBarReportMsg, int i, int i2, List<WxQbarNative.QBarReportMsg> list) {
        this.f56848g = str;
        this.f56849h = str2;
        this.f56850i = str3;
        this.f56854m = i;
        this.f56855n = i2;
        if (qBarReportMsg != null) {
            this.f56851j = qBarReportMsg.qrcodeVersion;
            this.f56852k = qBarReportMsg.pyramidLv;
            this.f56853l = qBarReportMsg.binaryMethod;
            this.f56865x = qBarReportMsg.scaleList;
            this.f56866y = qBarReportMsg.decodeScale;
            this.f56867z = qBarReportMsg.detectTime;
            this.f56835A = qBarReportMsg.srTime;
        }
        this.f56836B = 0;
        this.f56837C = 0;
        if (list != null) {
            for (WxQbarNative.QBarReportMsg next : list) {
                if (next.inWhiteList) {
                    this.f56836B++;
                } else if (next.inBlackList) {
                    this.f56837C++;
                }
            }
        }
        Log.m105925i("MicroMsg.QBarEngineReporter", "setDecodeResult, decodeTypeName: %s, dataContent: %s, dataCharSet: %s, qrCodeVersion: %s, pyramidLv: %s, binarizerMethod: %s, resultSize %d, isFilterResult %d,scaleList %s,decodeScale %f,detectTime %d,srTime %d, whiteListHit %d, blackListHit %d", str, str2, str3, Integer.valueOf(this.f56851j), Integer.valueOf(this.f56852k), this.f56853l, Integer.valueOf(i), Integer.valueOf(i2), this.f56865x, Float.valueOf(this.f56866y), Integer.valueOf(this.f56867z), Integer.valueOf(this.f56835A), Integer.valueOf(this.f56836B), Integer.valueOf(this.f56837C));
    }

    /* renamed from: e */
    public void mo27312e(int i, int i2) {
        Log.m105925i("MicroMsg.QBarEngineReporter", "setScanResolution, width: %s, height: %s", Integer.valueOf(i), Integer.valueOf(i2));
        this.f56847f = new Point(i, i2);
    }

    /* renamed from: f */
    public void mo27313f(int i) {
        Log.m105925i("MicroMsg.QBarEngineReporter", "setScanScene, scene: %s", Integer.valueOf(i));
        this.f56846e = i;
    }
}
