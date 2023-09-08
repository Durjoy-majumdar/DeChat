package p990k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p1042u.C111059i;
import p1130l.C109064e;
import p1130l.C109067g;
import p1164y2.C112382a;
import p1164y2.C112383b;
import p990k.C108781a;

/* renamed from: k.e */
public class C108785e extends ActionMode {

    /* renamed from: a */
    public final Context f325727a;

    /* renamed from: b */
    public final C108781a f325728b;

    /* renamed from: k.e$a */
    public static class C108786a implements C108781a.C108782a {

        /* renamed from: a */
        public final ActionMode.Callback f325729a;

        /* renamed from: b */
        public final Context f325730b;

        /* renamed from: c */
        public final ArrayList<C108785e> f325731c = new ArrayList<>();

        /* renamed from: d */
        public final C111059i<Menu, Menu> f325732d = new C111059i<>();

        public C108786a(Context context, ActionMode.Callback callback) {
            this.f325730b = context;
            this.f325729a = callback;
        }

        /* renamed from: a */
        public boolean mo143416a(C108781a aVar, MenuItem menuItem) {
            return this.f325729a.onActionItemClicked(mo159832e(aVar), new C109064e(this.f325730b, (C112383b) menuItem));
        }

        /* renamed from: b */
        public boolean mo143417b(C108781a aVar, Menu menu) {
            ActionMode.Callback callback = this.f325729a;
            ActionMode e = mo159832e(aVar);
            Menu orDefault = this.f325732d.getOrDefault(menu, null);
            if (orDefault == null) {
                C109067g gVar = new C109067g(this.f325730b, (C112382a) menu);
                this.f325732d.put(menu, gVar);
                orDefault = gVar;
            }
            return callback.onCreateActionMode(e, orDefault);
        }

        /* renamed from: c */
        public boolean mo143418c(C108781a aVar, Menu menu) {
            ActionMode.Callback callback = this.f325729a;
            ActionMode e = mo159832e(aVar);
            Menu orDefault = this.f325732d.getOrDefault(menu, null);
            if (orDefault == null) {
                C109067g gVar = new C109067g(this.f325730b, (C112382a) menu);
                this.f325732d.put(menu, gVar);
                orDefault = gVar;
            }
            return callback.onPrepareActionMode(e, orDefault);
        }

        /* renamed from: d */
        public void mo143419d(C108781a aVar) {
            this.f325729a.onDestroyActionMode(mo159832e(aVar));
        }

        /* renamed from: e */
        public ActionMode mo159832e(C108781a aVar) {
            int size = this.f325731c.size();
            for (int i = 0; i < size; i++) {
                C108785e eVar = this.f325731c.get(i);
                if (eVar != null && eVar.f325728b == aVar) {
                    return eVar;
                }
            }
            C108785e eVar2 = new C108785e(this.f325730b, aVar);
            this.f325731c.add(eVar2);
            return eVar2;
        }
    }

    public C108785e(Context context, C108781a aVar) {
        this.f325727a = context;
        this.f325728b = aVar;
    }

    public void finish() {
        this.f325728b.mo143484a();
    }

    public View getCustomView() {
        return this.f325728b.mo143485d();
    }

    public Menu getMenu() {
        return new C109067g(this.f325727a, (C112382a) this.f325728b.mo143486e());
    }

    public MenuInflater getMenuInflater() {
        return this.f325728b.mo143487f();
    }

    public CharSequence getSubtitle() {
        return this.f325728b.mo143488g();
    }

    public Object getTag() {
        return this.f325728b.f325719d;
    }

    public CharSequence getTitle() {
        return this.f325728b.mo143489h();
    }

    public boolean getTitleOptionalHint() {
        return this.f325728b.f325720e;
    }

    public void invalidate() {
        this.f325728b.mo143490i();
    }

    public boolean isTitleOptional() {
        return this.f325728b.mo143491j();
    }

    public void setCustomView(View view) {
        this.f325728b.mo143492k(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f325728b.mo143494m(charSequence);
    }

    public void setTag(Object obj) {
        this.f325728b.f325719d = obj;
    }

    public void setTitle(CharSequence charSequence) {
        this.f325728b.mo143496o(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f325728b.mo143497p(z);
    }

    public void setSubtitle(int i) {
        this.f325728b.mo143493l(i);
    }

    public void setTitle(int i) {
        this.f325728b.mo143495n(i);
    }
}
