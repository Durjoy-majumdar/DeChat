package xm2;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76879j;
import te3.C52238za0;

/* renamed from: xm2.b */
public class C23106b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C23108c f66390d;

    /* renamed from: xm2.b$a */
    public class C23107a implements DialogInterface.OnCancelListener {
        public C23107a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C23108c cVar = C23106b.this.f66390d;
            C23109g gVar = cVar.f66392d;
            if (gVar != null) {
                gVar.mo24594a(cVar.f66393e, false, (C52238za0) null);
            }
            C23106b.this.f66390d.mo36514a();
        }
    }

    public C23106b(C23108c cVar) {
        this.f66390d = cVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.CheckFinderManagerSwithFun", "startShowLoading");
        C23108c cVar = this.f66390d;
        Context context = cVar.f66393e;
        cVar.f66394f = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), this.f66390d.f66393e.getString(C0966R.string.gat), true, true, new C23107a());
    }
}
