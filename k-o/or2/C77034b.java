package or2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44668u3;
import eb0.C45628s0;

/* renamed from: or2.b */
public class C77034b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C100381a f225045d;

    public C77034b(C100381a aVar) {
        this.f225045d = aVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$2");
        try {
            if (((int) C100381a.m131291b(this.f225045d).f108320R1) == 0) {
                C100381a aVar = this.f225045d;
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                C44668u3 u3Var = aVar.f294024g;
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                u3Var.mo69707j3(C100381a.m131291b(this.f225045d));
            }
            if (((int) C100381a.m131291b(this.f225045d).f108320R1) <= 0) {
                Log.m105920e("HalfScreenAddBrandController", "addContact : insert contact failed");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$2");
                return;
            }
            C45628s0.m50775g0(C100381a.m131291b(this.f225045d));
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$2");
        } catch (Throwable th) {
            Log.m105920e("HalfScreenAddBrandController", th.toString());
        }
    }
}
