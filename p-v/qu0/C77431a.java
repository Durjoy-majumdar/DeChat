package qu0;

import com.tencent.p014mm.autogen.mmdata.rpt.AudioDeviceInfoKvReportStruct;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: qu0.a */
public final class C77431a {

    /* renamed from: a */
    public static final C77431a f225845a = new C77431a();

    /* renamed from: b */
    public static long f225846b = 0;

    /* renamed from: c */
    public static int f225847c = -1;

    /* renamed from: a */
    public final void mo107610a(int i) {
        int i2 = f225847c;
        if (i2 == -1) {
            f225847c = i;
            f225846b = Util.currentTicks();
            return;
        }
        AudioDeviceInfoKvReportStruct audioDeviceInfoKvReportStruct = new AudioDeviceInfoKvReportStruct();
        audioDeviceInfoKvReportStruct.f194142d = i2;
        audioDeviceInfoKvReportStruct.f194143e = Util.ticksToNow(f225846b) / ((long) 1000);
        audioDeviceInfoKvReportStruct.mo86054n();
        f225847c = i;
        f225846b = Util.currentTicks();
    }
}
