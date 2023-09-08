package ss3;

import com.tencent.p014mm.sdk.platformtools.Log;
import ss3.C36788a;

/* renamed from: ss3.c */
public final class C36792c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C36788a f97707d;

    /* renamed from: e */
    public final /* synthetic */ long f97708e;

    public C36792c(C36788a aVar, long j) {
        this.f97707d = aVar;
        this.f97708e = j;
    }

    public final void run() {
        C36788a.C36790b remove;
        C36788a aVar = this.f97707d;
        if (!aVar.f97701g && (remove = aVar.f97700f.remove(Long.valueOf(this.f97708e))) != null) {
            C36788a aVar2 = this.f97707d;
            aVar2.f97699e += remove.f97703a;
            aVar2.f97698d++;
            Log.m105926v("MicroMsg.ScanCostManager", "finishFrameDecodeCode cost: " + remove.f97703a + ", costTotal: " + aVar2.f97699e + ", count: " + aVar2.f97698d);
        }
    }
}
