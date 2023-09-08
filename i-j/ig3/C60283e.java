package ig3;

import com.tencent.p014mm.autogen.mmdata.rpt.ImageQueryTecLogStruct;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ig3.e */
public final class C60283e {

    /* renamed from: a */
    public static final C60283e f171878a = new C60283e();

    /* renamed from: b */
    public static long f171879b = 0;

    /* renamed from: c */
    public static String f171880c = "";

    /* renamed from: d */
    public static String f171881d = "";

    /* renamed from: e */
    public static long f171882e = 0;

    /* renamed from: f */
    public static long f171883f = 0;

    /* renamed from: g */
    public static long f171884g = 0;

    /* renamed from: h */
    public static long f171885h = 0;

    /* renamed from: i */
    public static long f171886i = 0;

    /* renamed from: j */
    public static long f171887j = 0;

    /* renamed from: k */
    public static long f171888k = 0;

    /* renamed from: l */
    public static String f171889l = "";

    /* renamed from: m */
    public static long f171890m = 0;

    /* renamed from: n */
    public static long f171891n = 0;

    /* renamed from: o */
    public static String f171892o = "";

    /* renamed from: p */
    public static String f171893p = "";

    /* renamed from: q */
    public static long f171894q = 0;

    /* renamed from: r */
    public static String f171895r = "";

    /* renamed from: s */
    public static long f171896s = 0;

    /* renamed from: t */
    public static long f171897t = 0;

    /* renamed from: u */
    public static long f171898u = 0;

    /* renamed from: v */
    public static long f171899v = 0;

    /* renamed from: w */
    public static String f171900w = "";

    /* renamed from: x */
    public static String f171901x = "";

    /* renamed from: a */
    public final void mo85270a(int i, int i2, long j) {
        Log.m105924i("MicroMsg.ImageQueryTecReporter", "doReportIdentifyFinish >> " + f171900w);
        ImageQueryTecLogStruct imageQueryTecLogStruct = new ImageQueryTecLogStruct();
        imageQueryTecLogStruct.f156290d = (long) i;
        imageQueryTecLogStruct.f156288G = imageQueryTecLogStruct.mo86045b("SessionId", f171900w, true);
        imageQueryTecLogStruct.f156312z = f171894q;
        imageQueryTecLogStruct.f156292f = f171879b;
        imageQueryTecLogStruct.f156293g = imageQueryTecLogStruct.mo86045b("LatestIdenImage", f171880c, true);
        imageQueryTecLogStruct.f156294h = imageQueryTecLogStruct.mo86045b("LatestHistoryIdenedImage", f171881d, true);
        imageQueryTecLogStruct.f156282A = imageQueryTecLogStruct.mo86045b("LatestClsHistoryIdenedImage", f171895r, true);
        imageQueryTecLogStruct.f156295i = 0;
        imageQueryTecLogStruct.f156296j = f171882e;
        imageQueryTecLogStruct.f156303q = f171886i;
        imageQueryTecLogStruct.f156304r = f171887j;
        if (i != 6) {
            imageQueryTecLogStruct.f156297k = f171883f;
            imageQueryTecLogStruct.f156298l = f171884g;
            long j2 = (long) i2;
            imageQueryTecLogStruct.f156300n = j2;
            imageQueryTecLogStruct.f156301o = j;
            imageQueryTecLogStruct.f156299m = f171885h;
            if (i2 != 0) {
                long j3 = f171879b;
                if (j3 != 0) {
                    imageQueryTecLogStruct.f156302p = (j - j3) / j2;
                }
            }
        }
        imageQueryTecLogStruct.mo86054n();
    }

    /* renamed from: b */
    public final void mo85271b(int i) {
        Log.m105924i("MicroMsg.ImageQueryTecReporter", "doReportSearch: >> ready report action: " + i + ", " + f171900w);
        ImageQueryTecLogStruct imageQueryTecLogStruct = new ImageQueryTecLogStruct();
        boolean z = false;
        if (f171890m == 2) {
            if (f171901x.length() == 0) {
                Log.m105924i("MicroMsg.ImageQueryTecReporter", "do report text is empty");
                f171888k = 0;
                f171889l = "";
                f171890m = 0;
                f171891n = 0;
                f171892o = "";
                f171893p = "";
                f171896s = 0;
                f171901x = "";
                return;
            }
        }
        if (f171889l.length() > 0) {
            z = true;
        }
        if (z) {
            Log.m105924i("MicroMsg.ImageQueryTecReporter", "doReportSearch: >> to report action: " + i + ", " + f171900w);
            imageQueryTecLogStruct.f156290d = (long) i;
            imageQueryTecLogStruct.f156305s = f171888k;
            imageQueryTecLogStruct.f156288G = imageQueryTecLogStruct.mo86045b("SessionId", f171900w, true);
            imageQueryTecLogStruct.f156306t = imageQueryTecLogStruct.mo86045b("SearchSessionId", f171889l, true);
            imageQueryTecLogStruct.f156307u = f171890m;
            imageQueryTecLogStruct.f156308v = f171891n;
            imageQueryTecLogStruct.f156309w = imageQueryTecLogStruct.mo86045b("SugText", f171892o, true);
            imageQueryTecLogStruct.f156310x = imageQueryTecLogStruct.mo86045b("SearchConnectText", f171893p, true);
            imageQueryTecLogStruct.f156311y = f171896s;
            imageQueryTecLogStruct.f156289H = imageQueryTecLogStruct.mo86045b("SearchQueryText", f171901x, true);
            imageQueryTecLogStruct.mo86054n();
            f171888k = 0;
            f171889l = "";
            f171890m = 0;
            f171891n = 0;
            f171892o = "";
            f171893p = "";
            f171896s = 0;
            f171901x = "";
        }
    }

    /* renamed from: c */
    public final void mo85272c(long j, long j2, int i, int i2) {
        Log.m105924i("MicroMsg.ImageQueryTecReporter", "reportPerIdentify >> perNum: " + j + ", averPerTime: " + j2 + ", model: " + i + ", action: " + i2 + ", sessionId: " + f171900w);
        ImageQueryTecLogStruct imageQueryTecLogStruct = new ImageQueryTecLogStruct();
        imageQueryTecLogStruct.f156290d = (long) i2;
        imageQueryTecLogStruct.f156288G = imageQueryTecLogStruct.mo86045b("SessionId", f171900w, true);
        imageQueryTecLogStruct.f156285D = j;
        imageQueryTecLogStruct.f156286E = j2;
        imageQueryTecLogStruct.f156287F = (long) i;
        imageQueryTecLogStruct.mo86054n();
    }
}
