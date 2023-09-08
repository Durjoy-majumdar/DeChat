package p1139o8;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.view.menu.C103452g;

/* renamed from: o8.f */
public class C109972f extends C103448e {
    public C109972f(Context context) {
        super(context);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C103452g gVar = (C103452g) mo143580a(i, i2, i3, charSequence);
        C109985h hVar = new C109985h(this.f305235d, this, gVar);
        gVar.f305281u = hVar;
        hVar.setHeaderTitle(gVar.f305271h);
        return hVar;
    }
}
