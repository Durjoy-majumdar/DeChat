package o03;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76879j;
import te3.qo4;

/* renamed from: o03.b */
public class C47317b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C47319c f126990d;

    /* renamed from: o03.b$a */
    public class C47318a implements DialogInterface.OnCancelListener {
        public C47318a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C47317b.this.f126990d.mo72375b(false, (qo4) null);
            C47317b.this.f126990d.mo72376c();
        }
    }

    public C47317b(C47319c cVar) {
        this.f126990d = cVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.CheckFinderManagerSwithFun", "startShowLoading");
        C47319c cVar = this.f126990d;
        Context context = cVar.f126993e;
        cVar.f126994f = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), this.f126990d.f126993e.getString(C0966R.string.gat), true, true, new C47318a());
    }
}
