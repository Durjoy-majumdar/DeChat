package yi3;

import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.view.menu.C103456i;
import androidx.appcompat.widget.C103554o;

/* renamed from: yi3.b */
public class C112467b extends C112465a implements C103456i.C103457a, C103448e.C103449a {

    /* renamed from: h */
    public C103448e f336739h;

    /* renamed from: i */
    public ViewGroup f336740i;

    /* renamed from: j */
    public boolean f336741j;

    /* renamed from: n */
    public C112469b f336742n;

    /* renamed from: o */
    public boolean f336743o;

    /* renamed from: p */
    public final Runnable f336744p = new C112468a();

    /* renamed from: yi3.b$a */
    public class C112468a implements Runnable {
        public C112468a() {
        }

        public void run() {
            C112467b bVar = C112467b.this;
            Context context = bVar.f336733d;
            if (bVar.f336734e == null) {
                bVar.f336734e = bVar.mo164182e();
            }
            ActionBar actionBar = bVar.f336734e;
            if (actionBar != null) {
                context = actionBar.mo91102m();
            }
            C103448e eVar = new C103448e(context);
            eVar.f305239h = bVar;
            C112469b bVar2 = C112467b.this.f336742n;
            if (bVar2 == null || !bVar2.onCreatePanelMenu(0, eVar) || !C112467b.this.f336742n.onPreparePanel(0, (View) null, eVar)) {
                C112467b bVar3 = C112467b.this;
                if (bVar3.f336739h != null) {
                    bVar3.f336739h = null;
                    ActionBar actionBar2 = bVar3.f336734e;
                    if (actionBar2 != null) {
                        ((C112470d) actionBar2).f336753e.mo144352b((Menu) null, bVar3);
                    }
                }
            } else {
                C112467b bVar4 = C112467b.this;
                if (eVar != bVar4.f336739h) {
                    bVar4.f336739h = eVar;
                    ActionBar actionBar3 = bVar4.f336734e;
                    if (actionBar3 != null) {
                        ((C112470d) actionBar3).f336753e.mo144352b(eVar, bVar4);
                    }
                }
            }
            eVar.mo143611p(true);
            C112467b.this.f336743o = false;
        }
    }

    /* renamed from: yi3.b$b */
    public interface C112469b {
        /* renamed from: a */
        void mo164186a(C103448e eVar, boolean z);

        /* renamed from: b */
        boolean mo164187b(C103448e eVar, MenuItem menuItem);

        boolean onCreatePanelMenu(int i, Menu menu);

        boolean onPreparePanel(int i, View view, Menu menu);
    }

    public C112467b(Activity activity, C112469b bVar) {
        super(activity);
        this.f336742n = bVar;
    }

    /* renamed from: a */
    public void mo143414a(C103448e eVar, boolean z) {
        C112469b bVar = this.f336742n;
        if (bVar != null) {
            bVar.mo164186a(eVar, z);
        }
    }

    /* renamed from: b */
    public boolean mo143384b(C103448e eVar, MenuItem menuItem) {
        C112469b bVar = this.f336742n;
        if (bVar != null) {
            return bVar.mo164187b(eVar, menuItem);
        }
        return false;
    }

    /* renamed from: c */
    public void mo143385c(C103448e eVar) {
        C103554o oVar;
        ActionBar actionBar = this.f336734e;
        if (actionBar == null || (oVar = ((C112470d) actionBar).f336753e) == null || !oVar.mo144355d()) {
            eVar.mo143591c(true);
        } else if (oVar.mo144357f()) {
            oVar.mo144351a();
        } else if (oVar.getVisibility() == 0) {
            oVar.mo144356e();
        }
    }

    /* renamed from: d */
    public boolean mo143415d(C103448e eVar) {
        return false;
    }

    /* renamed from: e */
    public ActionBar mo164182e() {
        if (!this.f336741j) {
            this.f336741j = true;
            if (!this.f336743o) {
                this.f336743o = true;
                ((C112468a) this.f336744p).run();
            }
        }
        if (this.f336734e == null) {
            this.f336734e = new C112470d(this.f336733d, this.f336740i, (View) null);
        }
        return this.f336734e;
    }
}
