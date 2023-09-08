package md1;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import qo3.C77407n;
import zd1.C16144b;

/* renamed from: md1.c */
public class C10779c {

    /* renamed from: d */
    public final AppCompatActivity f32250d;

    /* renamed from: e */
    public C77407n f32251e;

    /* renamed from: md1.c$a */
    public static final class C10780a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C10779c f32252d;

        public C10780a(C10779c cVar) {
            this.f32252d = cVar;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            if (e0Var.mo107176v()) {
                boolean d = this.f32252d.mo11013d();
                this.f32252d.getClass();
                C10779c cVar = this.f32252d;
                cVar.getClass();
                if (!(cVar instanceof C16144b)) {
                    e0Var.mo107151k(10005, this.f32252d.f32250d.getResources().getString(C0966R.string.dxw), C0966R.raw.icons_outlined_report_problem, d);
                }
            }
        }
    }

    /* renamed from: md1.c$b */
    public static final class C10781b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C10779c f32253d;

        public C10781b(C10779c cVar) {
            this.f32253d = cVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 10005) {
                this.f32253d.mo11012c();
            }
        }
    }

    /* renamed from: md1.c$c */
    public static final class C10782c implements C77407n.C47880p {

        /* renamed from: a */
        public final /* synthetic */ C10779c f32254a;

        public C10782c(C10779c cVar) {
            this.f32254a = cVar;
        }

        public final void onDismiss() {
            this.f32254a.f32251e = null;
        }
    }

    public C10779c(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f32250d = appCompatActivity;
    }

    /* renamed from: a */
    public void mo11010a(C77407n nVar) {
        C87412m.m108594g(nVar, "bottomSheet");
        nVar.f225773j = new C10780a(this);
        nVar.f225787r = new C10781b(this);
    }

    /* renamed from: b */
    public View mo11011b() {
        return null;
    }

    /* renamed from: c */
    public void mo11012c() {
    }

    /* renamed from: d */
    public boolean mo11013d() {
        return false;
    }

    /* renamed from: e */
    public void mo11014e() {
    }

    /* renamed from: f */
    public void mo11015f() {
    }

    /* renamed from: g */
    public void mo11016g() {
    }

    /* renamed from: h */
    public void mo11017h() {
    }

    /* renamed from: i */
    public void mo11018i() {
        if (this.f32251e == null) {
            C77407n nVar = new C77407n((Context) this.f32250d, 0, true);
            if (mo11019j()) {
                nVar.mo107569n(mo11011b(), true);
            }
            nVar.f225771i = new C10777a(this);
            nVar.f225782p = new C10778b(this);
            mo11010a(nVar);
            nVar.f225761d = new C10782c(this);
            this.f32251e = nVar;
        }
        C77407n nVar2 = this.f32251e;
        if (nVar2 != null) {
            nVar2.mo107573q();
        }
    }

    /* renamed from: j */
    public boolean mo11019j() {
        return false;
    }
}
