package ss3;

import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import iy3.C60641c;

/* renamed from: ss3.e */
public final class C36794e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C36788a f97711d;

    public C36794e(C36788a aVar) {
        this.f97711d = aVar;
    }

    public final void run() {
        SharedPreferences.Editor putInt;
        SharedPreferences.Editor putInt2;
        SharedPreferences.Editor putInt3;
        C36788a aVar = this.f97711d;
        int i = aVar.f97698d;
        if (i > 0) {
            float f = (((float) aVar.f97699e) * 1.0f) / ((float) i);
            Log.m105924i("MicroMsg.ScanCostManager", "dumpScanCost decodeCostTotal: " + this.f97711d.f97699e + ", decodeFrameCount: " + this.f97711d.f97698d + ", decodeCostAvg: " + f);
            MultiProcessMMKV multiProcessMMKV = C36788a.f97694i;
            if (!(multiProcessMMKV == null || (putInt3 = multiProcessMMKV.putInt("scan_code_decode_cost", (int) f)) == null)) {
                putInt3.apply();
            }
        }
        C36788a aVar2 = this.f97711d;
        long j = aVar2.f97696b;
        if (j > 0) {
            float f2 = (((float) aVar2.f97695a) * 1.0f) / ((float) j);
            MultiProcessMMKV multiProcessMMKV2 = C36788a.f97694i;
            int i2 = multiProcessMMKV2 != null ? multiProcessMMKV2.getInt("scan_code_last_frame_cost", 0) : 0;
            int b = C60641c.m70921b(f2);
            MultiProcessMMKV multiProcessMMKV3 = C36788a.f97694i;
            if (!(multiProcessMMKV3 == null || (putInt = multiProcessMMKV3.putInt("scan_code_last_frame_cost", i2)) == null || (putInt2 = putInt.putInt("scan_code_last_frame_cost", b)) == null)) {
                putInt2.apply();
            }
            Log.m105924i("MicroMsg.ScanCostManager", "dumpScanCost scanCodeFrameCostTotal: " + this.f97711d.f97695a + ", scanCodeFrameCount: " + this.f97711d.f97696b + ", scanCodeFrameCostAvg: " + f2 + ", lastCost: " + i2);
        }
        C36788a aVar3 = this.f97711d;
        aVar3.f97701g = true;
        aVar3.f97699e = 0;
        aVar3.f97698d = 0;
        aVar3.f97695a = 0;
        aVar3.f97696b = 0;
        aVar3.f97697c = -1;
        aVar3.f97700f.clear();
    }
}
