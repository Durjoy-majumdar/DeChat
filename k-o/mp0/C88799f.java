package mp0;

import android.content.Context;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.performance.C83992a;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import lp0.C88620b;
import p1044ub.C90630c;
import p224ra.C89909e;
import p910lj.C76701a;
import p963fc.C86812g;
import wi0.C90989n;
import wq0.C91074l;

/* renamed from: mp0.f */
public class C88799f implements C88620b<C90630c> {

    /* renamed from: mp0.f$a */
    public class C88800a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C81879g f256207d;

        /* renamed from: e */
        public final /* synthetic */ String f256208e;

        public C88800a(C81879g gVar, String str) {
            this.f256207d = gVar;
            this.f256208e = str;
        }

        public void run() {
            C76701a.makeText(this.f256207d.getContext(), (CharSequence) this.f256208e, 0).show();
            this.f256207d.getRuntime().mo113006E();
        }
    }

    /* renamed from: d */
    public static void m110866d(C81879g gVar, String str, boolean z) {
        C90989n.m114156a(str, z);
        MMHandlerThread.postToMainThread(new C88800a(gVar, z ? gVar.getContext().getResources().getString(C0966R.string.f7648mm) : gVar.getContext().getResources().getString(C0966R.string.f7647ml)));
    }

    /* renamed from: a */
    public void mo115970a(Context context, C83780d1 d1Var, String str) {
        C90630c cVar = (C90630c) d1Var;
        m110866d(cVar, str, !cVar.getRuntime().mo113051d0().f234889w);
    }

    /* renamed from: b */
    public String mo115971b(Context context, C83780d1 d1Var, String str) {
        return (((AppBrandSysConfigLU) ((C90630c) d1Var).mo109671p(AppBrandSysConfigLU.class)).f234889w ? context.getString(C0966R.string.f7669ne) : context.getString(C0966R.string.f7672nh)).toString();
    }

    /* renamed from: c */
    public boolean mo115972c(Context context, C83780d1 d1Var, String str) {
        C86812g B1 = ((C90630c) d1Var).getRuntime();
        MultiProcessMMKV multiProcessMMKV = C90989n.f261076a;
        C83992a aVar = (C83992a) B1.mo113021O(C83992a.class, false);
        return ((aVar != null && !B1.mo113215r1()) ? aVar.f245222e : false) || ((C91074l) C89909e.m112436a(C91074l.class)).mo116969jN(str);
    }
}
