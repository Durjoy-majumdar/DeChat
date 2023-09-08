package yi3;

import android.app.Activity;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import p990k.C108781a;
import p990k.C108785e;
import p990k.C108787f;

/* renamed from: yi3.a */
public abstract class C112465a {

    /* renamed from: d */
    public final Activity f336733d;

    /* renamed from: e */
    public ActionBar f336734e;

    /* renamed from: f */
    public MenuInflater f336735f;

    /* renamed from: g */
    public C108781a f336736g = null;

    /* renamed from: yi3.a$a */
    public class C112466a implements C108781a.C108782a {

        /* renamed from: a */
        public C108781a.C108782a f336737a;

        public C112466a(C108781a.C108782a aVar) {
            this.f336737a = aVar;
        }

        /* renamed from: a */
        public boolean mo143416a(C108781a aVar, MenuItem menuItem) {
            return this.f336737a.mo143416a(aVar, menuItem);
        }

        /* renamed from: b */
        public boolean mo143417b(C108781a aVar, Menu menu) {
            return this.f336737a.mo143417b(aVar, menu);
        }

        /* renamed from: c */
        public boolean mo143418c(C108781a aVar, Menu menu) {
            return this.f336737a.mo143418c(aVar, menu);
        }

        /* renamed from: d */
        public void mo143419d(C108781a aVar) {
            this.f336737a.mo143419d(aVar);
            C112465a.this.f336736g = null;
        }
    }

    public C112465a(Activity activity) {
        this.f336733d = activity;
    }

    /* renamed from: e */
    public abstract ActionBar mo164182e();

    /* renamed from: f */
    public MenuInflater mo164183f() {
        if (this.f336735f == null) {
            if (this.f336734e == null) {
                this.f336734e = mo164182e();
            }
            ActionBar actionBar = this.f336734e;
            if (actionBar != null) {
                this.f336735f = new C108787f(actionBar.mo91102m());
            } else {
                this.f336735f = new C108787f(this.f336733d);
            }
        }
        return this.f336735f;
    }

    /* renamed from: g */
    public ActionMode mo164184g(ActionMode.Callback callback) {
        C108785e.C108786a aVar = new C108785e.C108786a(this.f336733d, callback);
        C108781a aVar2 = this.f336736g;
        if (aVar2 != null) {
            aVar2.mo143484a();
        }
        C112466a aVar3 = new C112466a(aVar);
        if (this.f336734e == null) {
            this.f336734e = mo164182e();
        }
        ActionBar actionBar = this.f336734e;
        if (actionBar != null) {
            this.f336736g = actionBar.mo91095M(aVar3);
        }
        C108781a aVar4 = this.f336736g;
        if (aVar4 != null) {
            return aVar.mo159832e(aVar4);
        }
        return null;
    }
}
