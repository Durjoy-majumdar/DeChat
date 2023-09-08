package xm2;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.setting.p102ui.setting.C71141c4;
import com.tencent.p014mm.plugin.setting.p102ui.setting.UnfamiliarContactDetailUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import lu3.C88654b;

/* renamed from: xm2.y */
public class C78866y extends C88654b {

    /* renamed from: e */
    public final /* synthetic */ C78858a0 f231712e;

    /* renamed from: xm2.y$a */
    public class C78867a implements Runnable {
        public C78867a() {
        }

        public void run() {
            C71141c4 c4Var = (C71141c4) C78866y.this.f231712e.f231692l;
            Log.m105925i("MicroMsg.UnfamiliarContactUI", "[onSuccess] size:%s cost:%sms", Integer.valueOf(c4Var.f205933b.f205874t.size()), Long.valueOf(System.currentTimeMillis() - c4Var.f205932a));
            TextView textView = c4Var.f205933b.f205865h;
            textView.setText(c4Var.f205933b.getString(C0966R.string.k6k) + "(" + c4Var.f205933b.f205874t.size() + ")");
            if (c4Var.f205933b.f205874t.size() == 0) {
                View findViewById = c4Var.f205933b.findViewById(C0966R.C0970id.kml);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = c4Var.f205933b.findViewById(C0966R.C0970id.i7m);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById3 = c4Var.f205933b.findViewById(C0966R.C0970id.fp_);
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view3 = findViewById3;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                UnfamiliarContactDetailUI unfamiliarContactDetailUI = c4Var.f205933b;
                unfamiliarContactDetailUI.f205870p.setText(unfamiliarContactDetailUI.getString(C0966R.string.gao));
                return;
            }
            View findViewById4 = c4Var.f205933b.findViewById(C0966R.C0970id.kml);
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view4 = findViewById4;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById5 = c4Var.f205933b.findViewById(C0966R.C0970id.fp_);
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            View view5 = findViewById5;
            C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            UnfamiliarContactDetailUI.C71124h hVar = c4Var.f205933b.f205871q;
            if (hVar != null) {
                hVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: xm2.y$b */
    public class C78868b implements Runnable {
        public C78868b() {
        }

        public void run() {
            C71141c4 c4Var = (C71141c4) C78866y.this.f231712e.f231692l;
            c4Var.getClass();
            Log.m105920e("MicroMsg.UnfamiliarContactUI", "[onError]");
            View findViewById = c4Var.f205933b.findViewById(C0966R.C0970id.kml);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = c4Var.f205933b.findViewById(C0966R.C0970id.i7m);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            UnfamiliarContactDetailUI unfamiliarContactDetailUI = c4Var.f205933b;
            unfamiliarContactDetailUI.f205870p.setText(unfamiliarContactDetailUI.getString(C0966R.string.k6q));
        }
    }

    public C78866y(C78858a0 a0Var) {
        this.f231712e = a0Var;
    }

    public String getKey() {
        return "MicroMsg.UnfamiliarContactEngineAwait";
    }

    public void run() {
        try {
            this.f231712e.f231684d.await();
            long currentTimeMillis = System.currentTimeMillis();
            this.f231712e.f231687g.clear();
            this.f231712e.f231688h.remove(C75592q0.m90789s());
            C78858a0 a0Var = this.f231712e;
            a0Var.f231687g.addAll(a0Var.f231688h);
            C78858a0 a0Var2 = this.f231712e;
            a0Var2.f231687g.addAll(a0Var2.f231689i);
            C78858a0 a0Var3 = this.f231712e;
            a0Var3.f231687g.addAll(a0Var3.f231690j);
            C78858a0 a0Var4 = this.f231712e;
            if (a0Var4.f231682b) {
                a0Var4.f231687g.retainAll(a0Var4.f231690j);
            }
            C78858a0 a0Var5 = this.f231712e;
            if (a0Var5.f231683c) {
                a0Var5.f231687g.retainAll(a0Var5.f231689i);
            }
            C78858a0 a0Var6 = this.f231712e;
            if (a0Var6.f231681a) {
                a0Var6.f231687g.retainAll(a0Var6.f231688h);
            }
            C78858a0 a0Var7 = this.f231712e;
            ((C71141c4) a0Var7.f231692l).mo97830b(a0Var7.f231687g);
            Log.m105925i("MicroMsg.UnfamiliarContactEngine", "[onResult] :%sms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            this.f231712e.f231685e.postUI(new C78867a());
            Log.m105925i("MicroMsg.UnfamiliarContactEngine", "all cost:%sms", Long.valueOf(System.currentTimeMillis() - this.f231712e.f231693m));
        } catch (InterruptedException e) {
            Log.printErrStackTrace("MicroMsg.UnfamiliarContactEngine", e, "", new Object[0]);
            this.f231712e.f231685e.postUI(new C78868b());
        }
    }
}
