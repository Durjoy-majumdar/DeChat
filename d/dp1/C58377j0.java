package dp1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeAffinityUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderMultiTaskRouterUI;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.service.C56294r0;
import di3.C86312j;
import dp1.C58373i0;
import gy3.C87412m;
import h81.C59774i;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.Set;
import l31.C61212e;

/* renamed from: dp1.j0 */
public final class C58377j0 implements MMFinderUI.C56369a {

    /* renamed from: a */
    public C58373i0.C58374a f167210a = C58373i0.C58374a.FINDER_TASK_ON_RESUME_UNKNOWN;

    /* renamed from: b */
    public boolean f167211b;

    /* renamed from: c */
    public final /* synthetic */ AppCompatActivity f167212c;

    /* renamed from: d */
    public final /* synthetic */ C56294r0 f167213d;

    public C58377j0(AppCompatActivity appCompatActivity, C56294r0 r0Var) {
        this.f167212c = appCompatActivity;
        this.f167213d = r0Var;
    }

    /* renamed from: a */
    public void mo79125a(String str) {
        C58373i0.C58374a aVar = C58373i0.C58374a.FINDER_TASK_ON_RESUME_FROM_NEW_INTENT;
        C58373i0.C58374a aVar2 = C58373i0.C58374a.FINDER_TASK_ON_RESUME_UNKNOWN;
        C87412m.m108594g(str, "lifecycle");
        boolean z = false;
        switch (str.hashCode()) {
            case -1340212393:
                if (str.equals("onPause")) {
                    this.f167210a = aVar2;
                    this.f167211b = false;
                    return;
                }
                return;
            case -918269635:
                if (str.equals("onNewIntent")) {
                    this.f167210a = aVar;
                    return;
                }
                return;
            case 94292548:
                if (str.equals("onScreenOff")) {
                    this.f167210a = C58373i0.C58374a.FINDER_TASK_ON_RESUME_FROM_SCREEN_OFF;
                    return;
                }
                return;
            case 1046116283:
                if (str.equals("onCreate")) {
                    if ((this.f167212c.getIntent().getFlags() & 1048576) <= 0) {
                        aVar2 = C58373i0.C58374a.FINDER_TASK_ON_RESUME_FROM_ON_CREATE;
                    }
                    this.f167210a = aVar2;
                    return;
                }
                return;
            case 1463983852:
                if (str.equals("onResume") && !this.f167211b) {
                    this.f167211b = true;
                    if (this.f167213d.f160892r.size() == 2) {
                        Set<AppCompatActivity> set = this.f167213d.f160892r;
                        C87412m.m108593f(set, "finderMultiTaskService.foregroundFinderActivity");
                        ArrayList arrayList = new ArrayList();
                        for (T next : set) {
                            if (next instanceof FinderMultiTaskRouterUI) {
                                arrayList.add(next);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            z = true;
                        }
                    }
                    if (this.f167213d.f160892r.size() == 1 || z || (C87412m.m108589b(this.f167212c.getClass(), FinderHomeAffinityUI.class) && this.f167210a == aVar)) {
                        if (z) {
                            this.f167210a = C58373i0.C58374a.FINDER_TASK_ON_RESUME_FROM_LAUNCHER;
                        }
                        C58373i0 i0Var = C58373i0.f167182a;
                        i0Var.mo83139a(C58373i0.C58374a.FINDER_TASK_ON_RESUME_TOTAL);
                        i0Var.mo83139a(this.f167210a);
                        if (this.f167210a == aVar2) {
                            AppCompatActivity appCompatActivity = this.f167212c;
                            C87412m.m108594g(appCompatActivity, "finder");
                            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76876sZ(3, (Intent) null);
                            ((C61212e) C86312j.m106911c(C61212e.class)).y50(appCompatActivity, "special_enter_source", Integer.valueOf(((C59774i) C86312j.m106911c(C59774i.class)).mo84748Ps()));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
