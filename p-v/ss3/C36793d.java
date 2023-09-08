package ss3;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ss3.d */
public final class C36793d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C36788a f97709d;

    /* renamed from: e */
    public final /* synthetic */ long f97710e;

    public C36793d(C36788a aVar, long j) {
        this.f97709d = aVar;
        this.f97710e = j;
    }

    public final void run() {
        C36788a aVar = this.f97709d;
        if (!aVar.f97701g) {
            long j = aVar.f97697c;
            if (j > 0) {
                long j2 = this.f97710e - j;
                if (j2 > 1000) {
                    Log.m105928w("MicroMsg.ScanCostManager", "recordScanCodeFrame invalid cost: " + j2 + " and ignore");
                    this.f97709d.f97697c = this.f97710e;
                    return;
                }
                aVar.f97695a += j2;
                aVar.f97696b++;
                Log.m105926v("MicroMsg.ScanCostManager", "recordScanCodeFrame cost: " + j2 + ", costTotal: " + this.f97709d.f97695a + ", count: " + this.f97709d.f97696b);
            }
            this.f97709d.f97697c = this.f97710e;
        }
    }
}
