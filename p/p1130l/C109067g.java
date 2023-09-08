package p1130l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import p1042u.C111055b;
import p1042u.C111059i;
import p1042u.C118556h;
import p1164y2.C112382a;
import p1164y2.C112383b;
import p1164y2.C112384c;

/* renamed from: l.g */
public class C109067g extends C109057b<C112382a> implements Menu {
    public C109067g(Context context, C112382a aVar) {
        super(context, aVar);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo160220c(((C112382a) this.f326624d).add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = ((C112382a) this.f326624d).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo160220c(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo160221d(((C112382a) this.f326624d).addSubMenu(charSequence));
    }

    public void clear() {
        Map<C112383b, MenuItem> map = this.f326622f;
        if (map != null) {
            ((C111059i) map).clear();
        }
        Map<C112384c, SubMenu> map2 = this.f326623g;
        if (map2 != null) {
            ((C111059i) map2).clear();
        }
        ((C112382a) this.f326624d).clear();
    }

    public void close() {
        ((C112382a) this.f326624d).close();
    }

    public MenuItem findItem(int i) {
        return mo160220c(((C112382a) this.f326624d).findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo160220c(((C112382a) this.f326624d).getItem(i));
    }

    public boolean hasVisibleItems() {
        return ((C112382a) this.f326624d).hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((C112382a) this.f326624d).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((C112382a) this.f326624d).performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((C112382a) this.f326624d).performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        Map<C112383b, MenuItem> map = this.f326622f;
        if (map != null) {
            Iterator it = ((C118556h.C118559c) ((C111055b) map).keySet()).iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
        ((C112382a) this.f326624d).removeGroup(i);
    }

    public void removeItem(int i) {
        Map<C112383b, MenuItem> map = this.f326622f;
        if (map != null) {
            Iterator it = ((C118556h.C118559c) ((C111055b) map).keySet()).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (i == ((MenuItem) it.next()).getItemId()) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        ((C112382a) this.f326624d).removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((C112382a) this.f326624d).setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((C112382a) this.f326624d).setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        ((C112382a) this.f326624d).setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        ((C112382a) this.f326624d).setQwertyMode(z);
    }

    public int size() {
        return ((C112382a) this.f326624d).size();
    }

    public MenuItem add(int i) {
        return mo160220c(((C112382a) this.f326624d).add(i));
    }

    public SubMenu addSubMenu(int i) {
        return mo160221d(((C112382a) this.f326624d).addSubMenu(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo160220c(((C112382a) this.f326624d).add(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo160221d(((C112382a) this.f326624d).addSubMenu(i, i2, i3, charSequence));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo160220c(((C112382a) this.f326624d).add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo160221d(((C112382a) this.f326624d).addSubMenu(i, i2, i3, i4));
    }
}
