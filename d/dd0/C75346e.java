package dd0;

import al3.C0086a;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import ed0.C75610d;
import qo3.C77389a;
import qo3.C77398g;
import t22.C77833z;

/* renamed from: dd0.e */
public class C75346e {

    /* renamed from: dd0.e$a */
    public class C75347a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Runnable f221510d;

        public C75347a(Runnable runnable) {
            this.f221510d = runnable;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Runnable runnable = this.f221510d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: dd0.e$b */
    public class C75348b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ Runnable f221511d;

        public C75348b(Runnable runnable) {
            this.f221511d = runnable;
        }

        public void onCancel(DialogInterface dialogInterface) {
            Runnable runnable = this.f221511d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: a */
    public static boolean m90355a() {
        return C75610d.m90859a() != null && ((C77833z) C75610d.m90859a()).mo107953f();
    }

    /* renamed from: b */
    public static C77398g m90356b(Context context, int i, Runnable runnable) {
        C77389a aVar = new C77389a();
        aVar.f225644a = C0086a.m38a(context).getString(C0966R.string.a3h);
        aVar.f225660q = C0086a.m38a(context).getString(i);
        aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.f8029zr);
        aVar.f225620C = new C75347a(runnable);
        aVar.f225668y = true;
        aVar.f225622E = new C75348b(runnable);
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        return gVar;
    }
}
