package p1164y2;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import p849e3.C107170b;

/* renamed from: y2.b */
public interface C112383b extends MenuItem {
    /* renamed from: a */
    C107170b mo143635a();

    /* renamed from: b */
    C112383b mo143636b(C107170b bVar);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    C112383b setContentDescription(CharSequence charSequence);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);

    C112383b setTooltipText(CharSequence charSequence);
}
