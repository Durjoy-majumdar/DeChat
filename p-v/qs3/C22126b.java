package qs3;

import android.graphics.Point;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.qbar.C19931a;
import com.tencent.qbar.QbarNative;
import com.tencent.qbar.WxQbarNative;
import com.tencent.tav.coremedia.TimeUtil;
import gt3.C20839a;
import gy3.C87412m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import rx3.C13598b0;
import rx3.C36570n;
import vl2.C37756o;
import z04.C112551y;

/* renamed from: qs3.b */
public final class C22126b {

    /* renamed from: D */
    public static final C22126b f62576D = new C22126b(new C22127a("scan"));

    /* renamed from: E */
    public static final C22126b f62577E = new C22126b(new C22127a("file"));

    /* renamed from: A */
    public int f62578A;

    /* renamed from: B */
    public int f62579B;

    /* renamed from: C */
    public int f62580C;

    /* renamed from: a */
    public final C22127a f62581a;

    /* renamed from: b */
    public long f62582b;

    /* renamed from: c */
    public long f62583c;

    /* renamed from: d */
    public int f62584d;

    /* renamed from: e */
    public long f62585e;

    /* renamed from: f */
    public int f62586f;

    /* renamed from: g */
    public Point f62587g;

    /* renamed from: h */
    public Point f62588h;

    /* renamed from: i */
    public boolean f62589i;

    /* renamed from: j */
    public String f62590j = "";

    /* renamed from: k */
    public List<? extends C19931a.C19932a> f62591k;

    /* renamed from: l */
    public String f62592l = "";

    /* renamed from: m */
    public String f62593m = "";

    /* renamed from: n */
    public String f62594n = "";

    /* renamed from: o */
    public String f62595o = "";

    /* renamed from: p */
    public boolean f62596p;

    /* renamed from: q */
    public int f62597q;

    /* renamed from: r */
    public int f62598r;

    /* renamed from: s */
    public int f62599s;

    /* renamed from: t */
    public long f62600t;

    /* renamed from: u */
    public long f62601u;

    /* renamed from: v */
    public int f62602v;

    /* renamed from: w */
    public int f62603w;

    /* renamed from: x */
    public int f62604x;

    /* renamed from: y */
    public int f62605y;

    /* renamed from: z */
    public int f62606z;

    /* renamed from: qs3.b$a */
    public static final class C22127a {

        /* renamed from: a */
        public final String f62607a;

        /* renamed from: b */
        public long f62608b;

        /* renamed from: c */
        public int f62609c;

        /* renamed from: d */
        public float f62610d;

        /* renamed from: e */
        public float f62611e;

        /* renamed from: f */
        public int f62612f;

        /* renamed from: g */
        public float f62613g;

        public C22127a(String str) {
            C87412m.m108594g(str, "type");
            this.f62607a = str;
        }
    }

    public C22126b(C22127a aVar) {
        C87412m.m108594g(aVar, "scanStats");
        this.f62581a = aVar;
    }

    /* renamed from: a */
    public final void mo35207a() {
        Log.m105918d("MicroMsg.ScanCodeReporter", "addScanFrame, current scan frame: " + this.f62584d);
        this.f62584d = this.f62584d + 1;
    }

    /* renamed from: b */
    public final void mo35208b(long j, boolean z) {
        Log.m105918d("MicroMsg.ScanCodeReporter", "addScanTime: " + j + "  tryHarder:" + z);
        this.f62583c = this.f62583c + j;
        if (z) {
            this.f62599s++;
            this.f62601u += j;
            return;
        }
        this.f62598r++;
        this.f62600t += j;
    }

    /* renamed from: c */
    public final void mo35209c() {
        String str;
        String str2;
        long j;
        String str3;
        String str4;
        String str5;
        int i;
        int i2;
        String str6;
        String str7 = "MicroMsg.ScanCodeReporter";
        if (this.f62596p) {
            Log.m105918d(str7, "doReport, already report");
            return;
        }
        String str8 = this.f62595o;
        if (str8 == null || C112551y.m153811k(str8)) {
            String GetVersion = QbarNative.GetVersion();
            C87412m.m108593f(GetVersion, "getVersion()");
            this.f62595o = GetVersion;
        }
        int e = C37756o.m41531e();
        boolean z = C20839a.f58861k;
        boolean z2 = C20839a.f58860j;
        boolean z3 = C20839a.f58862l;
        boolean z4 = C20839a.f58863m;
        String d = C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, System.currentTimeMillis() / ((long) 1000));
        String str9 = "";
        if (this.f62587g != null) {
            StringBuilder sb = new StringBuilder();
            Point point = this.f62587g;
            C87412m.m108591d(point);
            sb.append(point.x);
            sb.append('*');
            Point point2 = this.f62587g;
            C87412m.m108591d(point2);
            sb.append(point2.y);
            str = sb.toString();
        } else {
            str = str9;
        }
        if (this.f62588h != null) {
            StringBuilder sb4 = new StringBuilder();
            Point point3 = this.f62588h;
            C87412m.m108591d(point3);
            sb4.append(point3.x);
            sb4.append('*');
            Point point4 = this.f62588h;
            C87412m.m108591d(point4);
            sb4.append(point4.y);
            str2 = sb4.toString();
        } else {
            str2 = str9;
        }
        long currentTimeMillis = this.f62582b == 0 ? this.f62583c : System.currentTimeMillis() - this.f62582b;
        List<? extends C19931a.C19932a> list = this.f62591k;
        if (list != null) {
            Iterator<T> it = list.iterator();
            str5 = str9;
            str4 = str5;
            int i3 = 0;
            while (it.hasNext()) {
                Iterator<T> it4 = it;
                C19931a.C19932a aVar = (C19931a.C19932a) it.next();
                if (aVar != null) {
                    i3++;
                    if (!(str4 == null || C112551y.m153811k(str4))) {
                        str6 = str7;
                        String str10 = str4 + ',';
                        str5 = str5 + ',';
                        str9 = str9 + ',';
                        str4 = str10;
                    } else {
                        str6 = str7;
                    }
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str4);
                    sb5.append(aVar.f56829f);
                    sb5.append('(');
                    String str11 = aVar.f56829f;
                    sb5.append(str11 != null ? str11.length() : 0);
                    sb5.append(')');
                    str4 = sb5.toString();
                    str9 = str9 + aVar.f56828e;
                    str5 = str5 + aVar.f56831h;
                } else {
                    str6 = str7;
                }
                str7 = str6;
                it = it4;
            }
            str3 = str7;
            C13598b0 b0Var = C13598b0.f38549a;
            j = currentTimeMillis;
            i = i3;
        } else {
            str3 = str7;
            str5 = str9;
            str4 = str5;
            j = currentTimeMillis;
            i = 0;
        }
        long j2 = this.f62600t;
        int i4 = this.f62598r;
        String str12 = str5;
        if (i4 <= 0) {
            i4 = 1;
        }
        long j3 = j2 / ((long) i4);
        long j4 = this.f62601u;
        long j5 = j3;
        int i5 = this.f62599s;
        if (i5 <= 0) {
            i5 = 1;
        }
        long j6 = j4 / ((long) i5);
        StringBuilder sb6 = new StringBuilder();
        sb6.append("doReport scanScene:");
        sb6.append(this.f62586f);
        sb6.append("  qBarBackend:");
        sb6.append(e);
        sb6.append("  qBarVersion:");
        sb6.append(this.f62595o);
        sb6.append("  qBarOptDet:");
        sb6.append(z ? 1 : 0);
        sb6.append("  qBarOptSr:");
        sb6.append(z2 ? 1 : 0);
        sb6.append("  qBarOptForceDm:");
        sb6.append(z3 ? 1 : 0);
        sb6.append("  qBarOptLibdmtx:");
        sb6.append(z4 ? 1 : 0);
        sb6.append("   isSupportWxCode:");
        sb6.append(this.f62589i);
        sb6.append("  currentTime:");
        sb6.append(d);
        sb6.append(" rawImageSizeText:");
        sb6.append(str);
        sb6.append("    decodeImageSizeText:");
        sb6.append(str2);
        sb6.append("  totalScanTime:");
        boolean z5 = z3;
        boolean z6 = z4;
        sb6.append(this.f62583c);
        sb6.append("  scanSuccessTime:");
        sb6.append(this.f62585e);
        sb6.append("  codeCount:");
        sb6.append(i);
        sb6.append("  dataContent:");
        sb6.append(str4);
        sb6.append("  typeName:");
        sb6.append(str9);
        sb6.append("  charSet:");
        sb6.append(str12);
        sb6.append("  tabSession:");
        sb6.append(this.f62592l);
        sb6.append("  scanSession:");
        sb6.append(this.f62593m);
        sb6.append("  scanTotalFrames:");
        sb6.append(this.f62584d);
        sb6.append("  totalCostTime:");
        long j7 = j;
        sb6.append(j7);
        boolean z7 = z5;
        sb6.append("  callSnapShot:");
        sb6.append(this.f62594n);
        sb6.append("  detectTime:");
        sb6.append(this.f62597q);
        sb6.append("    scanImageCountByNormal:");
        sb6.append(this.f62598r);
        sb6.append("  scanImageCountByTryHarder:");
        sb6.append(this.f62599s);
        sb6.append("  averageScanImageCostTimeByNormal:");
        String str13 = str9;
        String str14 = str4;
        sb6.append(j5);
        sb6.append("  averageScanImageCostTimeByTryHarder:");
        sb6.append(j6);
        sb6.append("  decodeSuccessByTryHarder:");
        sb6.append(this.f62602v);
        sb6.append("  decodeTime:");
        sb6.append(this.f62603w);
        sb6.append(", srTime: ");
        sb6.append(this.f62580C);
        sb6.append(", preDetectTime: ");
        sb6.append(this.f62604x);
        sb6.append(", afterDetectTime: ");
        sb6.append(this.f62605y);
        sb6.append(", segTime: ");
        sb6.append(this.f62606z);
        sb6.append(", afterSegTime: ");
        sb6.append(this.f62578A);
        sb6.append(", decodeAllTime: ");
        sb6.append(this.f62579B);
        Log.m105918d(str3, sb6.toString());
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[42];
        objArr[0] = BuildInfo.REV;
        objArr[1] = Integer.valueOf(this.f62586f);
        objArr[2] = Integer.valueOf(e);
        objArr[3] = this.f62595o;
        objArr[4] = Integer.valueOf(z);
        objArr[5] = Integer.valueOf(z2);
        objArr[6] = Boolean.valueOf(this.f62589i);
        objArr[7] = d;
        objArr[8] = str;
        objArr[9] = str2;
        List<? extends C19931a.C19932a> list2 = this.f62591k;
        objArr[10] = Integer.valueOf(((list2 == null || list2.isEmpty()) ? 1 : 0) ^ 1);
        objArr[11] = Long.valueOf(j7);
        objArr[12] = Long.valueOf(this.f62585e);
        objArr[13] = Integer.valueOf(i);
        objArr[14] = 0;
        objArr[15] = str14;
        objArr[16] = str13;
        objArr[17] = str12;
        objArr[18] = this.f62592l;
        objArr[19] = this.f62593m;
        objArr[20] = this.f62594n;
        objArr[21] = Integer.valueOf(this.f62584d);
        objArr[22] = Long.valueOf(this.f62583c);
        objArr[23] = Integer.valueOf(z7 ? 1 : 0);
        objArr[24] = Integer.valueOf(z6 ? 1 : 0);
        objArr[25] = Integer.valueOf(this.f62597q);
        objArr[26] = Integer.valueOf(this.f62598r);
        objArr[27] = Integer.valueOf(this.f62599s);
        objArr[28] = Long.valueOf(j5);
        objArr[29] = Long.valueOf(j6);
        objArr[30] = Integer.valueOf(this.f62602v);
        objArr[31] = 0;
        objArr[32] = Integer.valueOf(this.f62603w);
        C37756o oVar = C37756o.f100004a;
        objArr[33] = Integer.valueOf(!((Boolean) ((C36570n) C37756o.f100015l).getValue()).booleanValue() ? 1 : 2);
        objArr[34] = this.f62590j;
        objArr[35] = Integer.valueOf(this.f62603w);
        objArr[36] = Integer.valueOf(this.f62580C);
        objArr[37] = Integer.valueOf(this.f62604x);
        objArr[38] = Integer.valueOf(this.f62605y);
        objArr[39] = Integer.valueOf(this.f62606z);
        objArr[40] = Integer.valueOf(this.f62578A);
        objArr[41] = Integer.valueOf(this.f62579B);
        nVar.mo160131h(26196, objArr);
        this.f62596p = true;
        this.f62591k = null;
        if (BuildInfo.DEBUG && (i2 = this.f62584d) > 0) {
            float f = (((float) this.f62583c) * 1.0f) / ((float) i2);
            C22127a aVar2 = this.f62581a;
            aVar2.f62612f++;
            aVar2.f62611e += f;
            if (i > 0) {
                aVar2.f62609c++;
                aVar2.f62608b += this.f62585e;
            }
            Log.m105926v(str3, "scanStats(" + this.f62581a.f62607a + ") scanImgCost: " + f + ", scanSuccessTime: " + this.f62585e + ", sucCount: " + this.f62581a.f62609c + ", scanCount: " + this.f62581a.f62612f);
        }
    }

    /* renamed from: d */
    public final String mo35210d() {
        C22127a aVar = this.f62581a;
        aVar.f62610d = (((float) aVar.f62608b) * 1.0f) / ((float) aVar.f62609c);
        aVar.f62613g = (aVar.f62611e * 1.0f) / ((float) aVar.f62612f);
        Log.m105925i("MicroMsg.ScanCodeReporter", "scanStats(" + aVar.f62607a + ") success: (total: %s, count: %s, avg: %s), all: (total: %s, count: %s, avg: %s)", Long.valueOf(aVar.f62608b), Integer.valueOf(aVar.f62609c), Float.valueOf(aVar.f62610d), Float.valueOf(aVar.f62611e), Integer.valueOf(aVar.f62612f), Float.valueOf(aVar.f62613g));
        String format = String.format("成功耗时：" + aVar.f62610d + ", 次数：" + aVar.f62609c + "\n单帧耗时：" + aVar.f62613g + ", 次数：" + aVar.f62612f, Arrays.copyOf(new Object[0], 0));
        C87412m.m108593f(format, "format(format, *args)");
        C22127a aVar2 = this.f62581a;
        aVar2.f62608b = 0;
        aVar2.f62609c = 0;
        aVar2.f62611e = 0.0f;
        aVar2.f62612f = 0;
        return format;
    }

    /* renamed from: e */
    public final void mo35211e() {
        this.f62596p = false;
        this.f62582b = 0;
        this.f62583c = 0;
        this.f62584d = 0;
        this.f62586f = 0;
        this.f62587g = null;
        this.f62588h = null;
        this.f62591k = null;
        this.f62585e = 0;
        this.f62589i = false;
        this.f62592l = "";
        this.f62593m = "";
        this.f62594n = "";
        this.f62597q = 0;
        this.f62603w = 0;
        this.f62580C = 0;
        this.f62604x = 0;
        this.f62605y = 0;
        this.f62606z = 0;
        this.f62578A = 0;
        this.f62579B = 0;
        this.f62598r = 0;
        this.f62599s = 0;
        this.f62600t = 0;
        this.f62601u = 0;
        this.f62602v = 0;
        Log.m105924i("MicroMsg.ScanCodeReporter", "reset");
    }

    /* renamed from: f */
    public final void mo35212f(int i, int i2) {
        Log.m105918d("MicroMsg.ScanCodeReporter", "setDecodeImageSize  width: " + i + ", height: " + i2);
        this.f62588h = new Point(i, i2);
    }

    /* renamed from: g */
    public final void mo35213g(List<? extends C19931a.C19932a> list, List<? extends WxQbarNative.QBarReportMsg> list2) {
        this.f62591k = list;
        this.f62597q = 0;
        if (list2 != null && !list2.isEmpty()) {
            this.f62597q = ((WxQbarNative.QBarReportMsg) list2.get(0)).detectTime;
            this.f62603w = 0;
            this.f62580C = 0;
            this.f62604x = 0;
            this.f62605y = 0;
            this.f62606z = 0;
            this.f62578A = 0;
            this.f62579B = 0;
            for (WxQbarNative.QBarReportMsg qBarReportMsg : list2) {
                this.f62603w += qBarReportMsg.decodeTime;
                this.f62580C += qBarReportMsg.srTime;
                this.f62604x += qBarReportMsg.preDetect;
                this.f62605y += qBarReportMsg.afterDetect;
                this.f62606z += qBarReportMsg.segCost;
                this.f62578A += qBarReportMsg.afterSeg;
                this.f62579B += qBarReportMsg.decodeAll;
                Log.m105924i("MicroMsg.ScanCodeReporter", "setDecodeCost single detectTime: " + this.f62597q + ", decodeTime: " + qBarReportMsg.decodeTime + ", srTime: " + qBarReportMsg.srTime + ", preDetectTime: " + qBarReportMsg.preDetect + ", afterDetectTime: " + qBarReportMsg.afterDetect + ", segTime: " + qBarReportMsg.segCost + ", afterSegTime: " + qBarReportMsg.afterSeg + ", decodeAllTime: " + qBarReportMsg.decodeAll);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("setDecodeCost total codeCount: (");
            sb.append(list != null ? Integer.valueOf(list.size()) : null);
            sb.append(", ");
            sb.append(list2.size());
            sb.append("), detectTime: ");
            sb.append(this.f62597q);
            sb.append(", decodeTime: ");
            sb.append(this.f62603w);
            sb.append(", srTime: ");
            sb.append(this.f62580C);
            sb.append(", preDetectTime: ");
            sb.append(this.f62604x);
            sb.append(", afterDetectTime: ");
            sb.append(this.f62605y);
            sb.append(", segTime: ");
            sb.append(this.f62606z);
            sb.append(", afterSegTime: ");
            sb.append(this.f62578A);
            sb.append(", decodeAllTime: ");
            sb.append(this.f62579B);
            Log.m105924i("MicroMsg.ScanCodeReporter", sb.toString());
        }
    }

    /* renamed from: h */
    public final void mo35214h(int i, int i2) {
        Log.m105918d("MicroMsg.ScanCodeReporter", "setRawImageSize  width: " + i + ", height: " + i2);
        this.f62587g = new Point(i, i2);
    }
}
