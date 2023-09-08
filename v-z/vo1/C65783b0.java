package vo1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import bp1.C54519d;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveReplayUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import cp1.C57952m;
import cp1.C57957o;
import cp1.C57959q;
import d50.C58115i;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C9556a;
import ks3.C61162l;
import r50.C63363c;
import vo1.C65770a0;

/* renamed from: vo1.b0 */
public final class C65783b0 implements C57959q {

    /* renamed from: a */
    public final /* synthetic */ C65770a0 f189222a;

    public C65783b0(C65770a0 a0Var) {
        this.f189222a = a0Var;
    }

    /* renamed from: a */
    public void mo82765a(boolean z) {
    }

    /* renamed from: b */
    public void mo82766b() {
        Context context;
        C57952m mVar;
        StringBuilder sb = new StringBuilder();
        sb.append("miniWindowClickListener onClick, ");
        C65770a0 a0Var = this.f189222a;
        C65770a0.C65771b bVar = C65770a0.f189184r;
        sb.append(a0Var.mo89808i());
        Log.m105924i("FinderLiveReplayService", sb.toString());
        C65770a0 a0Var2 = this.f189222a;
        Class cls = C54519d.class;
        C54519d dVar = (C54519d) a0Var2.mo89804e(cls);
        if (dVar != null) {
            dVar.mo75368N3(C58115i.C58119d.NORMAL_MODE);
        }
        WeakReference<Activity> g = AppForegroundDelegate.m161224g();
        if ((g != null ? g.get() : null) == null) {
            g = AppForegroundDelegate.INSTANCE.mo174212f();
        }
        if (g == null || (context = g.get()) == null) {
            context = MMApplicationContext.getContext();
        }
        Intent intent = new Intent(context, FinderLiveReplayUI.class);
        boolean z = true;
        intent.putExtra("route_to_maximize", true);
        if (context instanceof Activity) {
            intent.addFlags(603979776);
        } else {
            intent.addFlags(872415232);
        }
        C57952m mVar2 = a0Var2.f189201o;
        int i = 0;
        if (mVar2 == null || mVar2.f165852a.isPlaying()) {
            z = false;
        }
        if (z && (mVar = a0Var2.f189201o) != null) {
            mVar.mo82759e((Integer) null);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/replay/FinderLiveReplayService", "startReplayUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/replay/FinderLiveReplayService", "startReplayUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C54519d dVar2 = (C54519d) a0Var2.mo89804e(cls);
        if (dVar2 != null) {
            i = dVar2.f152854q;
        }
        C54519d dVar3 = (C54519d) a0Var2.mo89804e(cls);
        a0Var2.mo89812m(i, dVar3 != null ? dVar3.mo75371d3() : 0);
        C63363c.C63364a aVar2 = C63363c.C63364a.f179734a;
        C63363c.C63364a.f179735b.mo88268b();
    }

    /* renamed from: c */
    public void mo82767c(C61162l lVar) {
        C87412m.m108594g(lVar, "mode");
        StringBuilder sb = new StringBuilder();
        sb.append("mini window close,");
        C65770a0 a0Var = this.f189222a;
        C65770a0.C65771b bVar = C65770a0.f189184r;
        sb.append(a0Var.mo89808i());
        sb.append(",mode:");
        sb.append(lVar);
        sb.append('!');
        Log.m105924i("FinderLiveReplayService", sb.toString());
        C57957o oVar = this.f189222a.f189191e;
        if (oVar != null) {
            oVar.mo78590q();
        }
        C65770a0 a0Var2 = this.f189222a;
        C54519d dVar = (C54519d) a0Var2.mo89804e(C54519d.class);
        a0Var2.mo89811l(2, dVar != null ? dVar.mo75371d3() : 0, true);
    }
}
