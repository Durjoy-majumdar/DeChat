package p203mi;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76879j;
import te3.C49380f50;

/* renamed from: mi.i */
public class C76764i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C76766j f224551d;

    /* renamed from: mi.i$a */
    public class C76765a implements DialogInterface.OnCancelListener {
        public C76765a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C76764i.this.f224551d.mo107021a(false, (C49380f50) null, -1);
            C76764i.this.f224551d.mo107022b();
        }
    }

    public C76764i(C76766j jVar) {
        this.f224551d = jVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.CheckFinderManagerSwithFun", "startShowLoading");
        C76766j jVar = this.f224551d;
        Context context = jVar.f224554e;
        jVar.f224555f = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), this.f224551d.f224554e.getString(C0966R.string.i6q), true, true, new C76765a());
    }
}
