package p982if;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.resource.CanaryWorkerService;
import com.tencent.matrix.resource.MatrixJobIntentService;
import p425ze.C91671f;
import p955df.C86263c;

/* renamed from: if.b */
public class C87718b implements C86263c.C86264a {

    /* renamed from: a */
    public final /* synthetic */ C87719c f253995a;

    public C87718b(C87719c cVar) {
        this.f253995a = cVar;
    }

    /* renamed from: a */
    public void mo122136a(C91671f fVar) {
        Context context = this.f253995a.f253997a.f261442f;
        int i = CanaryWorkerService.f235510n;
        Intent intent = new Intent(context, CanaryWorkerService.class);
        intent.setAction("com.tencent.matrix.resource.worker.action.SHRINK_HPROF");
        intent.putExtra("com.tencent.matrix.resource.worker.param.HEAPDUMP", fVar);
        MatrixJobIntentService.m98098a(context, CanaryWorkerService.class, -84148995, intent);
    }
}
