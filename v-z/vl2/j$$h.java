package vl2;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import nj3.C76879j;
import qy2.C63349b0;
import uz2.C65489g0;

public class j$$h implements C63349b0 {

    /* renamed from: a */
    public final /* synthetic */ Activity f300964a;

    /* renamed from: e */
    public final /* synthetic */ C102212j f300965e;

    /* renamed from: vl2.j$$h$a */
    public class C27697a implements DialogInterface.OnClickListener {
        public C27697a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            j$$h.this.f300965e.mo141756s(true);
        }
    }

    public j$$h(C102212j jVar, Activity activity) {
        this.f300965e = jVar;
        this.f300964a = activity;
    }

    public void onFinishAction(int i, String str, C65489g0 g0Var) {
        if (i == 1) {
            Activity activity = this.f300964a;
            if (activity != null && !activity.isFinishing()) {
                Activity activity2 = this.f300964a;
                C76879j.m92749t(activity2, activity2.getString(C0966R.string.k6q), "", new C27697a());
            }
            this.f300965e.mo141741d();
            return;
        }
        this.f300965e.mo141741d();
        this.f300965e.mo141750n(true, (Bundle) null);
    }
}
