package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p1164y2.C112382a;
import p385u2.C111105a;
import p849e3.C107222v;

/* renamed from: androidx.appcompat.view.menu.e */
public class C103448e implements C112382a {

    /* renamed from: E */
    public static final int[] f305230E = {1, 4, 5, 3, 2, 0};

    /* renamed from: A */
    public CopyOnWriteArrayList<WeakReference<C103456i>> f305231A = new CopyOnWriteArrayList<>();

    /* renamed from: B */
    public C103452g f305232B;

    /* renamed from: C */
    public boolean f305233C = false;

    /* renamed from: D */
    public boolean f305234D;

    /* renamed from: d */
    public final Context f305235d;

    /* renamed from: e */
    public final Resources f305236e;

    /* renamed from: f */
    public boolean f305237f;

    /* renamed from: g */
    public boolean f305238g;

    /* renamed from: h */
    public C103449a f305239h;

    /* renamed from: i */
    public ArrayList<C103452g> f305240i;

    /* renamed from: j */
    public ArrayList<C103452g> f305241j;

    /* renamed from: n */
    public boolean f305242n;

    /* renamed from: o */
    public ArrayList<C103452g> f305243o;

    /* renamed from: p */
    public ArrayList<C103452g> f305244p;

    /* renamed from: q */
    public boolean f305245q;

    /* renamed from: r */
    public int f305246r = 0;

    /* renamed from: s */
    public CharSequence f305247s;

    /* renamed from: t */
    public Drawable f305248t;

    /* renamed from: u */
    public View f305249u;

    /* renamed from: v */
    public boolean f305250v = false;

    /* renamed from: w */
    public boolean f305251w = false;

    /* renamed from: x */
    public boolean f305252x = false;

    /* renamed from: y */
    public boolean f305253y = false;

    /* renamed from: z */
    public ArrayList<C103452g> f305254z = new ArrayList<>();

    /* renamed from: androidx.appcompat.view.menu.e$a */
    public interface C103449a {
        /* renamed from: b */
        boolean mo143384b(C103448e eVar, MenuItem menuItem);

        /* renamed from: c */
        void mo143385c(C103448e eVar);
    }

    /* renamed from: androidx.appcompat.view.menu.e$b */
    public interface C103450b {
        /* renamed from: c */
        boolean mo143519c(C103452g gVar);
    }

    public C103448e(Context context) {
        boolean z = false;
        this.f305235d = context;
        Resources resources = context.getResources();
        this.f305236e = resources;
        this.f305240i = new ArrayList<>();
        this.f305241j = new ArrayList<>();
        this.f305242n = true;
        this.f305243o = new ArrayList<>();
        this.f305244p = new ArrayList<>();
        this.f305245q = true;
        if (resources.getConfiguration().keyboard != 1 && C107222v.m145286e(ViewConfiguration.get(context), context)) {
            z = true;
        }
        this.f305238g = z;
    }

    /* renamed from: a */
    public MenuItem mo143580a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = (-65536 & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = f305230E;
            if (i5 < 6) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                C103452g gVar = new C103452g(this, i, i2, i3, i6, charSequence, this.f305246r);
                ArrayList<C103452g> arrayList = this.f305240i;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (arrayList.get(size).f305270g <= i6) {
                            i4 = size + 1;
                            break;
                        }
                    } else {
                        i4 = 0;
                        break;
                    }
                }
                arrayList.add(i4, gVar);
                mo143611p(true);
                return gVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public MenuItem add(CharSequence charSequence) {
        return mo143580a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f305235d.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = mo143580a(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo143590b(C103456i iVar, Context context) {
        this.f305231A.add(new WeakReference(iVar));
        iVar.mo143564h(context, this);
        this.f305245q = true;
    }

    /* renamed from: c */
    public final void mo143591c(boolean z) {
        if (!this.f305253y) {
            this.f305253y = true;
            Iterator<WeakReference<C103456i>> it = this.f305231A.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C103456i iVar = (C103456i) next.get();
                if (iVar == null) {
                    this.f305231A.remove(next);
                } else {
                    iVar.mo143537a(this, z);
                }
            }
            this.f305253y = false;
        }
    }

    public void clear() {
        C103452g gVar = this.f305232B;
        if (gVar != null) {
            mo143595d(gVar);
        }
        this.f305240i.clear();
        mo143611p(true);
    }

    public void clearHeader() {
        this.f305248t = null;
        this.f305247s = null;
        this.f305249u = null;
        mo143611p(false);
    }

    public void close() {
        mo143591c(true);
    }

    /* renamed from: d */
    public boolean mo143595d(C103452g gVar) {
        boolean z = false;
        if (!this.f305231A.isEmpty() && this.f305232B == gVar) {
            mo143631z();
            Iterator<WeakReference<C103456i>> it = this.f305231A.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C103456i iVar = (C103456i) next.get();
                if (iVar == null) {
                    this.f305231A.remove(next);
                } else {
                    z = iVar.mo143534g(this, gVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo143630y();
            if (z) {
                this.f305232B = null;
            }
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo143596e(C103448e eVar, MenuItem menuItem) {
        C103449a aVar = this.f305239h;
        return aVar != null && aVar.mo143384b(eVar, menuItem);
    }

    /* renamed from: f */
    public boolean mo143597f(C103452g gVar) {
        boolean z = false;
        if (this.f305231A.isEmpty()) {
            return false;
        }
        mo143631z();
        Iterator<WeakReference<C103456i>> it = this.f305231A.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C103456i iVar = (C103456i) next.get();
            if (iVar == null) {
                this.f305231A.remove(next);
            } else {
                z = iVar.mo143533e(this, gVar);
                if (z) {
                    break;
                }
            }
        }
        mo143630y();
        if (z) {
            this.f305232B = gVar;
        }
        return z;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C103452g gVar = this.f305240i.get(i2);
            if (gVar.f305267d == i) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.f305281u.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public C103452g mo143599g(int i, KeyEvent keyEvent) {
        ArrayList<C103452g> arrayList = this.f305254z;
        arrayList.clear();
        mo143601h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n = mo143609n();
        for (int i2 = 0; i2 < size; i2++) {
            C103452g gVar = arrayList.get(i2);
            char c = n ? gVar.f305276p : gVar.f305274n;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (n && c == 8 && i == 67))) {
                return gVar;
            }
        }
        return null;
    }

    public MenuItem getItem(int i) {
        return this.f305240i.get(i);
    }

    /* renamed from: h */
    public void mo143601h(List<C103452g> list, int i, KeyEvent keyEvent) {
        boolean n = mo143609n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f305240i.size();
            for (int i2 = 0; i2 < size; i2++) {
                C103452g gVar = this.f305240i.get(i2);
                if (gVar.hasSubMenu()) {
                    gVar.f305281u.mo143601h(list, i, keyEvent);
                }
                char c = n ? gVar.f305276p : gVar.f305274n;
                if (((modifiers & 69647) == ((n ? gVar.f305277q : gVar.f305275o) & 69647)) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (n && c == 8 && i == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.f305234D) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f305240i.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void mo143603i() {
        ArrayList<C103452g> l = mo143607l();
        if (this.f305245q) {
            Iterator<WeakReference<C103456i>> it = this.f305231A.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C103456i iVar = (C103456i) next.get();
                if (iVar == null) {
                    this.f305231A.remove(next);
                } else {
                    z |= iVar.mo143542f();
                }
            }
            if (z) {
                this.f305243o.clear();
                this.f305244p.clear();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    C103452g gVar = l.get(i);
                    if ((gVar.f305261D & 32) == 32) {
                        this.f305243o.add(gVar);
                    } else {
                        this.f305244p.add(gVar);
                    }
                }
            } else {
                this.f305243o.clear();
                this.f305244p.clear();
                this.f305244p.addAll(mo143607l());
            }
            this.f305245q = false;
        }
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo143599g(i, keyEvent) != null;
    }

    /* renamed from: j */
    public String mo143605j() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: k */
    public C103448e mo143606k() {
        return this;
    }

    /* renamed from: l */
    public ArrayList<C103452g> mo143607l() {
        if (!this.f305242n) {
            return this.f305241j;
        }
        this.f305241j.clear();
        int size = this.f305240i.size();
        for (int i = 0; i < size; i++) {
            C103452g gVar = this.f305240i.get(i);
            if (gVar.isVisible()) {
                this.f305241j.add(gVar);
            }
        }
        this.f305242n = false;
        this.f305245q = true;
        return this.f305241j;
    }

    /* renamed from: m */
    public boolean mo143608m() {
        return this.f305233C;
    }

    /* renamed from: n */
    public boolean mo143609n() {
        return this.f305237f;
    }

    /* renamed from: o */
    public boolean mo143610o() {
        return this.f305238g;
    }

    /* renamed from: p */
    public void mo143611p(boolean z) {
        if (!this.f305250v) {
            if (z) {
                this.f305242n = true;
                this.f305245q = true;
            }
            if (!this.f305231A.isEmpty()) {
                mo143631z();
                Iterator<WeakReference<C103456i>> it = this.f305231A.iterator();
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    C103456i iVar = (C103456i) next.get();
                    if (iVar == null) {
                        this.f305231A.remove(next);
                    } else {
                        iVar.mo143539c(z);
                    }
                }
                mo143630y();
                return;
            }
            return;
        }
        this.f305251w = true;
        if (z) {
            this.f305252x = true;
        }
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo143614q(findItem(i), (C103456i) null, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C103452g g = mo143599g(i, keyEvent);
        boolean q = g != null ? mo143614q(g, (C103456i) null, i2) : false;
        if ((i2 & 2) != 0) {
            mo143591c(true);
        }
        return q;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo143614q(android.view.MenuItem r17, androidx.appcompat.view.menu.C103456i r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r17
            androidx.appcompat.view.menu.g r2 = (androidx.appcompat.view.menu.C103452g) r2
            r3 = 0
            if (r2 == 0) goto L_0x0103
            boolean r4 = r2.isEnabled()
            if (r4 != 0) goto L_0x0013
            goto L_0x0103
        L_0x0013:
            android.view.MenuItem$OnMenuItemClickListener r4 = r2.f305282v
            r5 = 1
            if (r4 == 0) goto L_0x001f
            boolean r4 = r4.onMenuItemClick(r2)
            if (r4 == 0) goto L_0x001f
            goto L_0x0071
        L_0x001f:
            androidx.appcompat.view.menu.e r4 = r2.f305280t
            boolean r4 = r4.mo143596e(r4, r2)
            if (r4 == 0) goto L_0x0028
            goto L_0x0071
        L_0x0028:
            android.content.Intent r4 = r2.f305273j
            if (r4 == 0) goto L_0x0067
            androidx.appcompat.view.menu.e r6 = r2.f305280t     // Catch:{ ActivityNotFoundException -> 0x0066 }
            android.content.Context r6 = r6.f305235d     // Catch:{ ActivityNotFoundException -> 0x0066 }
            k20.a r15 = new k20.a     // Catch:{ ActivityNotFoundException -> 0x0066 }
            r15.<init>()     // Catch:{ ActivityNotFoundException -> 0x0066 }
            r15.mo10233c(r4)     // Catch:{ ActivityNotFoundException -> 0x0066 }
            java.lang.Object[] r8 = r15.mo10232b()     // Catch:{ ActivityNotFoundException -> 0x0066 }
            java.lang.String r9 = "androidx/appcompat/view/menu/MenuItemImpl"
            java.lang.String r10 = "invoke"
            java.lang.String r11 = "()Z"
            java.lang.String r12 = "Undefined"
            java.lang.String r13 = "startActivity"
            java.lang.String r14 = "(Landroid/content/Intent;)V"
            r7 = r6
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ ActivityNotFoundException -> 0x0066 }
            java.lang.Object r4 = r15.mo10231a(r3)     // Catch:{ ActivityNotFoundException -> 0x0066 }
            android.content.Intent r4 = (android.content.Intent) r4     // Catch:{ ActivityNotFoundException -> 0x0066 }
            r6.startActivity(r4)     // Catch:{ ActivityNotFoundException -> 0x0066 }
            java.lang.String r8 = "androidx/appcompat/view/menu/MenuItemImpl"
            java.lang.String r9 = "invoke"
            java.lang.String r10 = "()Z"
            java.lang.String r11 = "Undefined"
            java.lang.String r12 = "startActivity"
            java.lang.String r13 = "(Landroid/content/Intent;)V"
            r7 = r6
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ ActivityNotFoundException -> 0x0066 }
            goto L_0x0071
        L_0x0066:
        L_0x0067:
            e3.b r4 = r2.f305264G
            if (r4 == 0) goto L_0x0073
            boolean r4 = r4.mo157617e()
            if (r4 == 0) goto L_0x0073
        L_0x0071:
            r4 = 1
            goto L_0x0074
        L_0x0073:
            r4 = 0
        L_0x0074:
            e3.b r6 = r2.f305264G
            if (r6 == 0) goto L_0x0080
            boolean r7 = r6.mo157613a()
            if (r7 == 0) goto L_0x0080
            r7 = 1
            goto L_0x0081
        L_0x0080:
            r7 = 0
        L_0x0081:
            boolean r8 = r2.mo143639e()
            if (r8 == 0) goto L_0x0093
            boolean r1 = r2.expandActionView()
            r4 = r4 | r1
            if (r4 == 0) goto L_0x0102
            r0.mo143591c(r5)
            goto L_0x0102
        L_0x0093:
            boolean r8 = r2.hasSubMenu()
            if (r8 != 0) goto L_0x00a4
            if (r7 == 0) goto L_0x009c
            goto L_0x00a4
        L_0x009c:
            r1 = r19 & 1
            if (r1 != 0) goto L_0x0102
            r0.mo143591c(r5)
            goto L_0x0102
        L_0x00a4:
            r8 = r19 & 4
            if (r8 != 0) goto L_0x00ab
            r0.mo143591c(r3)
        L_0x00ab:
            boolean r8 = r2.hasSubMenu()
            if (r8 != 0) goto L_0x00bf
            androidx.appcompat.view.menu.l r8 = new androidx.appcompat.view.menu.l
            android.content.Context r9 = r0.f305235d
            r8.<init>(r9, r0, r2)
            r2.f305281u = r8
            java.lang.CharSequence r9 = r2.f305271h
            r8.setHeaderTitle((java.lang.CharSequence) r9)
        L_0x00bf:
            androidx.appcompat.view.menu.l r2 = r2.f305281u
            if (r7 == 0) goto L_0x00c6
            r6.mo157618f(r2)
        L_0x00c6:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r6 = r0.f305231A
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00cf
            goto L_0x00fc
        L_0x00cf:
            if (r1 == 0) goto L_0x00d5
            boolean r3 = r1.mo143540d(r2)
        L_0x00d5:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r1 = r0.f305231A
            java.util.Iterator r1 = r1.iterator()
        L_0x00db:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00fc
            java.lang.Object r6 = r1.next()
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6
            java.lang.Object r7 = r6.get()
            androidx.appcompat.view.menu.i r7 = (androidx.appcompat.view.menu.C103456i) r7
            if (r7 != 0) goto L_0x00f5
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r7 = r0.f305231A
            r7.remove(r6)
            goto L_0x00db
        L_0x00f5:
            if (r3 != 0) goto L_0x00db
            boolean r3 = r7.mo143540d(r2)
            goto L_0x00db
        L_0x00fc:
            r4 = r4 | r3
            if (r4 != 0) goto L_0x0102
            r0.mo143591c(r5)
        L_0x0102:
            return r4
        L_0x0103:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C103448e.mo143614q(android.view.MenuItem, androidx.appcompat.view.menu.i, int):boolean");
    }

    /* renamed from: r */
    public void mo143615r(C103456i iVar) {
        Iterator<WeakReference<C103456i>> it = this.f305231A.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C103456i iVar2 = (C103456i) next.get();
            if (iVar2 == null || iVar2 == iVar) {
                this.f305231A.remove(next);
            }
        }
    }

    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.f305240i.get(i3).f305268e == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = this.f305240i.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || this.f305240i.get(i3).f305268e != i) {
                    mo143611p(true);
                } else {
                    if (i3 >= 0 && i3 < this.f305240i.size()) {
                        this.f305240i.remove(i3);
                    }
                    i2 = i4;
                }
            }
            mo143611p(true);
        }
    }

    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f305240i.get(i2).f305267d == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0 && i2 < this.f305240i.size()) {
            this.f305240i.remove(i2);
            mo143611p(true);
        }
    }

    /* renamed from: s */
    public void mo143618s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo143605j());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C103463l) item.getSubMenu()).mo143618s(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f305240i.size();
        for (int i2 = 0; i2 < size; i2++) {
            C103452g gVar = this.f305240i.get(i2);
            if (gVar.f305268e == i) {
                gVar.mo143641f(z2);
                gVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f305233C = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f305240i.size();
        for (int i2 = 0; i2 < size; i2++) {
            C103452g gVar = this.f305240i.get(i2);
            if (gVar.f305268e == i) {
                gVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f305240i.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C103452g gVar = this.f305240i.get(i2);
            if (gVar.f305268e == i) {
                int i3 = gVar.f305261D;
                int i4 = (i3 & -9) | (z ? 0 : 8);
                gVar.f305261D = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            mo143611p(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f305237f = z;
        mo143611p(false);
    }

    public int size() {
        return this.f305240i.size();
    }

    /* renamed from: t */
    public void mo143625t(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f305231A.isEmpty()) {
            Iterator<WeakReference<C103456i>> it = this.f305231A.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C103456i iVar = (C103456i) next.get();
                if (iVar == null) {
                    this.f305231A.remove(next);
                } else {
                    int id = iVar.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        iVar.mo143545j(parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: u */
    public void mo143626u(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C103463l) item.getSubMenu()).mo143626u(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo143605j(), sparseArray);
        }
    }

    /* renamed from: v */
    public void mo143627v(Bundle bundle) {
        Parcelable b;
        if (!this.f305231A.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<C103456i>> it = this.f305231A.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C103456i iVar = (C103456i) next.get();
                if (iVar == null) {
                    this.f305231A.remove(next);
                } else {
                    int id = iVar.getId();
                    if (id > 0 && (b = iVar.mo143538b()) != null) {
                        sparseArray.put(id, b);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* renamed from: w */
    public void mo143628w(C103449a aVar) {
        this.f305239h = aVar;
    }

    /* renamed from: x */
    public final void mo143629x(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f305236e;
        if (view != null) {
            this.f305249u = view;
            this.f305247s = null;
            this.f305248t = null;
        } else {
            if (i > 0) {
                this.f305247s = resources.getText(i);
            } else if (charSequence != null) {
                this.f305247s = charSequence;
            }
            if (i2 > 0) {
                Context context = this.f305235d;
                Object obj = C111105a.f332697a;
                this.f305248t = C111105a.C111110c.m151511b(context, i2);
            } else if (drawable != null) {
                this.f305248t = drawable;
            }
            this.f305249u = null;
        }
        mo143611p(false);
    }

    /* renamed from: y */
    public void mo143630y() {
        this.f305250v = false;
        if (this.f305251w) {
            this.f305251w = false;
            mo143611p(this.f305252x);
        }
    }

    /* renamed from: z */
    public void mo143631z() {
        if (!this.f305250v) {
            this.f305250v = true;
            this.f305251w = false;
            this.f305252x = false;
        }
    }

    public MenuItem add(int i) {
        return mo143580a(0, 0, 0, this.f305236e.getString(i));
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f305236e.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo143580a(i, i2, i3, charSequence);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C103452g gVar = (C103452g) mo143580a(i, i2, i3, charSequence);
        C103463l lVar = new C103463l(this.f305235d, this, gVar);
        gVar.f305281u = lVar;
        lVar.setHeaderTitle(gVar.f305271h);
        return lVar;
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo143580a(i, i2, i3, this.f305236e.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f305236e.getString(i4));
    }
}
