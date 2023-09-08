package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C103448e;
import com.tencent.xweb.file.XVFSFile;

/* renamed from: androidx.appcompat.view.menu.l */
public class C103463l extends C103448e implements SubMenu {

    /* renamed from: F */
    public C103448e f305323F;

    /* renamed from: G */
    public C103452g f305324G;

    public C103463l(Context context, C103448e eVar, C103452g gVar) {
        super(context);
        this.f305323F = eVar;
        this.f305324G = gVar;
    }

    /* renamed from: d */
    public boolean mo143595d(C103452g gVar) {
        return this.f305323F.mo143595d(gVar);
    }

    /* renamed from: e */
    public boolean mo143596e(C103448e eVar, MenuItem menuItem) {
        return super.mo143596e(eVar, menuItem) || this.f305323F.mo143596e(eVar, menuItem);
    }

    /* renamed from: f */
    public boolean mo143597f(C103452g gVar) {
        return this.f305323F.mo143597f(gVar);
    }

    public MenuItem getItem() {
        return this.f305324G;
    }

    /* renamed from: j */
    public String mo143605j() {
        C103452g gVar = this.f305324G;
        int i = gVar != null ? gVar.f305267d : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates" + XVFSFile.PATH_SEPARATOR + i;
    }

    /* renamed from: k */
    public C103448e mo143606k() {
        return this.f305323F.mo143606k();
    }

    /* renamed from: m */
    public boolean mo143608m() {
        return this.f305323F.mo143608m();
    }

    /* renamed from: n */
    public boolean mo143609n() {
        return this.f305323F.mo143609n();
    }

    /* renamed from: o */
    public boolean mo143610o() {
        return this.f305323F.mo143610o();
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f305323F.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        mo143629x(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        mo143629x(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        mo143629x(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f305324G.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f305323F.setQwertyMode(z);
    }

    /* renamed from: w */
    public void mo143628w(C103448e.C103449a aVar) {
        this.f305323F.mo143628w(aVar);
    }

    public SubMenu setHeaderIcon(int i) {
        mo143629x(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        mo143629x(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f305324G.setIcon(i);
        return this;
    }
}
