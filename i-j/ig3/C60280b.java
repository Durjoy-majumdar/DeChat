package ig3;

import com.tencent.p014mm.autogen.mmdata.rpt.IntelligentMsgConsumingTimeLogStruct;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ig3.b */
public final class C60280b {

    /* renamed from: a */
    public static final C60280b f171844a = new C60280b();

    /* renamed from: b */
    public static long f171845b;

    /* renamed from: c */
    public static long f171846c;

    /* renamed from: d */
    public static long f171847d;

    /* renamed from: e */
    public static long f171848e;

    /* renamed from: f */
    public static long f171849f;

    /* renamed from: g */
    public static long f171850g;

    /* renamed from: h */
    public static long f171851h;

    /* renamed from: i */
    public static long f171852i;

    /* renamed from: j */
    public static long f171853j;

    /* renamed from: k */
    public static long f171854k;

    /* renamed from: l */
    public static boolean f171855l;

    /* renamed from: a */
    public final void mo85256a(int i) {
        if (f171855l) {
            Log.m105924i("MicroMsg.ImageQueryConsumeTimeReporter", "report is done, no to do again");
            return;
        }
        f171855l = true;
        long j = f171848e;
        long j2 = j != 0 ? f171847d / j : 0;
        long j3 = f171851h;
        long j4 = j3 != 0 ? f171850g / j3 : 0;
        long j5 = f171854k;
        long j6 = j5 != 0 ? f171853j / j5 : 0;
        long j7 = j + j5;
        Log.m105924i("MicroMsg.ImageQueryConsumeTimeReporter", "report >> clsTime: " + f171847d + ", clsNum: " + f171848e + ", ocrTime: " + f171850g + ", ocrNum: " + f171851h + ", clusterTime: " + f171853j + ", clusterNum: " + f171854k + ", action: " + i + ", clsAverTime: " + j2 + ", ocrAverTime: " + j4 + ", clusterAverTime:" + j6);
        if (!(f171845b == 0 || j7 == 0)) {
            long currentTimeMillis = System.currentTimeMillis() - f171845b;
            Log.m105924i("MicroMsg.ImageQueryConsumeTimeReporter", "total struct >> startTime: " + f171845b + ", totalNum: " + j7 + ", time: " + currentTimeMillis);
            IntelligentMsgConsumingTimeLogStruct intelligentMsgConsumingTimeLogStruct = new IntelligentMsgConsumingTimeLogStruct();
            intelligentMsgConsumingTimeLogStruct.f156335f = 0;
            intelligentMsgConsumingTimeLogStruct.f156334e = currentTimeMillis / j7;
            intelligentMsgConsumingTimeLogStruct.f156333d = j7;
            intelligentMsgConsumingTimeLogStruct.mo86054n();
        }
        IntelligentMsgConsumingTimeLogStruct intelligentMsgConsumingTimeLogStruct2 = new IntelligentMsgConsumingTimeLogStruct();
        intelligentMsgConsumingTimeLogStruct2.f156335f = 1;
        intelligentMsgConsumingTimeLogStruct2.f156334e = j2;
        intelligentMsgConsumingTimeLogStruct2.f156333d = f171848e;
        intelligentMsgConsumingTimeLogStruct2.mo86054n();
        C60283e eVar = C60283e.f171878a;
        long j8 = j6;
        eVar.mo85272c(f171848e, j2, 1, i);
        IntelligentMsgConsumingTimeLogStruct intelligentMsgConsumingTimeLogStruct3 = new IntelligentMsgConsumingTimeLogStruct();
        intelligentMsgConsumingTimeLogStruct3.f156335f = 2;
        intelligentMsgConsumingTimeLogStruct3.f156334e = j4;
        intelligentMsgConsumingTimeLogStruct3.f156333d = f171851h;
        intelligentMsgConsumingTimeLogStruct3.mo86054n();
        eVar.mo85272c(f171851h, j4, 2, i);
        IntelligentMsgConsumingTimeLogStruct intelligentMsgConsumingTimeLogStruct4 = new IntelligentMsgConsumingTimeLogStruct();
        intelligentMsgConsumingTimeLogStruct4.f156335f = 3;
        intelligentMsgConsumingTimeLogStruct4.f156334e = j8;
        intelligentMsgConsumingTimeLogStruct4.f156333d = f171854k;
        intelligentMsgConsumingTimeLogStruct4.mo86054n();
        eVar.mo85272c(f171854k, j8, 3, i);
    }

    /* renamed from: b */
    public final void mo85257b() {
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105924i("MicroMsg.ImageQueryConsumeTimeReporter", "stopPerOCR >> startTimeStamp: " + f171849f + ", stopTimeStamp: " + currentTimeMillis + ", before totalNum: " + f171851h + ", before totalTime: " + f171850g);
        long j = f171849f;
        if (currentTimeMillis < j) {
            Log.m105920e("MicroMsg.ImageQueryConsumeTimeReporter", "stopPerOCR >> time error");
            return;
        }
        f171851h++;
        f171850g += currentTimeMillis - j;
    }
}
