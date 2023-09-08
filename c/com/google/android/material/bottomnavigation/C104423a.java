package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.view.menu.C103452g;

/* renamed from: com.google.android.material.bottomnavigation.a */
public final class C104423a extends C103448e {
    public C104423a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public MenuItem mo143580a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            mo143631z();
            MenuItem a = super.mo143580a(i, i2, i3, charSequence);
            ((C103452g) a).mo143641f(true);
            mo143630y();
            return a;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
