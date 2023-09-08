package p849e3;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: e3.b */
public abstract class C107170b {

    /* renamed from: a */
    public final Context f320758a;

    /* renamed from: b */
    public C107171a f320759b;

    /* renamed from: c */
    public C107172b f320760c;

    /* renamed from: e3.b$a */
    public interface C107171a {
    }

    /* renamed from: e3.b$b */
    public interface C107172b {
    }

    public C107170b(Context context) {
        this.f320758a = context;
    }

    /* renamed from: a */
    public boolean mo157613a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo157614b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo157615c();

    /* renamed from: d */
    public View mo157616d(MenuItem menuItem) {
        return mo157615c();
    }

    /* renamed from: e */
    public boolean mo157617e() {
        return false;
    }

    /* renamed from: f */
    public void mo157618f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo157619g() {
        return false;
    }

    /* renamed from: h */
    public void mo157620h(C107172b bVar) {
        C107172b bVar2 = this.f320760c;
        this.f320760c = bVar;
    }
}
