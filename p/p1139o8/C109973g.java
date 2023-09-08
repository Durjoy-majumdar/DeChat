package p1139o8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.view.menu.C103452g;
import androidx.appcompat.view.menu.C103456i;
import androidx.appcompat.view.menu.C103463l;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ParcelableSparseArray;
import com.tencent.p014mm.C0966R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: o8.g */
public class C109973g implements C103456i {

    /* renamed from: d */
    public NavigationMenuView f329122d;

    /* renamed from: e */
    public LinearLayout f329123e;

    /* renamed from: f */
    public C103448e f329124f;

    /* renamed from: g */
    public int f329125g;

    /* renamed from: h */
    public C109976c f329126h;

    /* renamed from: i */
    public LayoutInflater f329127i;

    /* renamed from: j */
    public int f329128j;

    /* renamed from: n */
    public boolean f329129n;

    /* renamed from: o */
    public ColorStateList f329130o;

    /* renamed from: p */
    public ColorStateList f329131p;

    /* renamed from: q */
    public Drawable f329132q;

    /* renamed from: r */
    public int f329133r;

    /* renamed from: s */
    public int f329134s;

    /* renamed from: t */
    public int f329135t;

    /* renamed from: u */
    public int f329136u;

    /* renamed from: v */
    public final View.OnClickListener f329137v = new C109974a();

    /* renamed from: o8.g$a */
    public class C109974a implements View.OnClickListener {
        public C109974a() {
        }

        public void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            C109976c cVar = C109973g.this.f329126h;
            if (cVar != null) {
                cVar.f329141f = true;
            }
            C103452g itemData = navigationMenuItemView.getItemData();
            C109973g gVar = C109973g.this;
            boolean q = gVar.f329124f.mo143614q(itemData, gVar, 0);
            if (itemData != null && itemData.isCheckable() && q) {
                C109973g.this.f329126h.mo161320G4(itemData);
            }
            C109973g gVar2 = C109973g.this;
            C109976c cVar2 = gVar2.f329126h;
            if (cVar2 != null) {
                cVar2.f329141f = false;
            }
            gVar2.mo143539c(false);
        }
    }

    /* renamed from: o8.g$b */
    public static class C109975b extends C109984k {
        public C109975b(View view) {
            super(view);
        }
    }

    /* renamed from: o8.g$c */
    public class C109976c extends RecyclerView.C16613e<C109984k> {

        /* renamed from: d */
        public final ArrayList<C109978e> f329139d = new ArrayList<>();

        /* renamed from: e */
        public C103452g f329140e;

        /* renamed from: f */
        public boolean f329141f;

        public C109976c() {
            mo161319F4();
        }

        /* renamed from: F4 */
        public final void mo161319F4() {
            if (!this.f329141f) {
                this.f329141f = true;
                this.f329139d.clear();
                this.f329139d.add(new C109977d());
                int i = -1;
                int size = C109973g.this.f329124f.mo143607l().size();
                boolean z = false;
                int i2 = 0;
                boolean z2 = false;
                int i3 = 0;
                while (i2 < size) {
                    C103452g gVar = C109973g.this.f329124f.mo143607l().get(i2);
                    if (gVar.isChecked()) {
                        mo161320G4(gVar);
                    }
                    if (gVar.isCheckable()) {
                        gVar.mo143641f(z);
                    }
                    if (gVar.hasSubMenu()) {
                        C103463l lVar = gVar.f305281u;
                        if (lVar.hasVisibleItems()) {
                            if (i2 != 0) {
                                this.f329139d.add(new C109979f(C109973g.this.f329136u, z ? 1 : 0));
                            }
                            this.f329139d.add(new C109980g(gVar));
                            int size2 = lVar.size();
                            int i4 = 0;
                            boolean z3 = false;
                            while (i4 < size2) {
                                C103452g gVar2 = (C103452g) lVar.getItem(i4);
                                if (gVar2.isVisible()) {
                                    if (!z3 && gVar2.getIcon() != null) {
                                        z3 = true;
                                    }
                                    if (gVar2.isCheckable()) {
                                        gVar2.mo143641f(z);
                                    }
                                    if (gVar.isChecked()) {
                                        mo161320G4(gVar);
                                    }
                                    this.f329139d.add(new C109980g(gVar2));
                                }
                                i4++;
                                z = false;
                            }
                            if (z3) {
                                int size3 = this.f329139d.size();
                                for (int size4 = this.f329139d.size(); size4 < size3; size4++) {
                                    ((C109980g) this.f329139d.get(size4)).f329146b = true;
                                }
                            }
                        }
                    } else {
                        int i5 = gVar.f305268e;
                        if (i5 != i) {
                            i3 = this.f329139d.size();
                            z2 = gVar.getIcon() != null;
                            if (i2 != 0) {
                                i3++;
                                ArrayList<C109978e> arrayList = this.f329139d;
                                int i6 = C109973g.this.f329136u;
                                arrayList.add(new C109979f(i6, i6));
                            }
                        } else if (!z2 && gVar.getIcon() != null) {
                            int size5 = this.f329139d.size();
                            for (int i7 = i3; i7 < size5; i7++) {
                                ((C109980g) this.f329139d.get(i7)).f329146b = true;
                            }
                            z2 = true;
                        }
                        C109980g gVar3 = new C109980g(gVar);
                        gVar3.f329146b = z2;
                        this.f329139d.add(gVar3);
                        i = i5;
                    }
                    i2++;
                    z = false;
                }
                this.f329141f = false;
            }
        }

        /* renamed from: G4 */
        public void mo161320G4(C103452g gVar) {
            if (this.f329140e != gVar && gVar.isCheckable()) {
                C103452g gVar2 = this.f329140e;
                if (gVar2 != null) {
                    gVar2.setChecked(false);
                }
                this.f329140e = gVar;
                gVar.setChecked(true);
            }
        }

        public int getItemCount() {
            return this.f329139d.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            C109978e eVar = this.f329139d.get(i);
            if (eVar instanceof C109979f) {
                return 2;
            }
            if (eVar instanceof C109977d) {
                return 3;
            }
            if (eVar instanceof C109980g) {
                return ((C109980g) eVar).f329145a.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C109984k kVar = (C109984k) zVar;
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) kVar.f44854d;
                navigationMenuItemView.setIconTintList(C109973g.this.f329131p);
                C109973g gVar = C109973g.this;
                if (gVar.f329129n) {
                    navigationMenuItemView.setTextAppearance(gVar.f329128j);
                }
                ColorStateList colorStateList = C109973g.this.f329130o;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = C109973g.this.f329132q;
                Drawable newDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145189q(navigationMenuItemView, newDrawable);
                C109980g gVar2 = (C109980g) this.f329139d.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(gVar2.f329146b);
                navigationMenuItemView.setHorizontalPadding(C109973g.this.f329133r);
                navigationMenuItemView.setIconPadding(C109973g.this.f329134s);
                navigationMenuItemView.mo143501d(gVar2.f329145a, 0);
            } else if (itemViewType == 1) {
                ((TextView) kVar.f44854d).setText(((C109980g) this.f329139d.get(i)).f329145a.f305271h);
            } else if (itemViewType == 2) {
                C109979f fVar = (C109979f) this.f329139d.get(i);
                kVar.f44854d.setPadding(0, fVar.f329143a, 0, fVar.f329144b);
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C16631z zVar;
            if (i == 0) {
                C109973g gVar = C109973g.this;
                zVar = new C109981h(gVar.f329127i, viewGroup, gVar.f329137v);
            } else if (i == 1) {
                zVar = new C109983j(C109973g.this.f329127i, viewGroup);
            } else if (i == 2) {
                zVar = new C109982i(C109973g.this.f329127i, viewGroup);
            } else if (i != 3) {
                return null;
            } else {
                return new C109975b(C109973g.this.f329123e);
            }
            return zVar;
        }

        public void onViewRecycled(RecyclerView.C16631z zVar) {
            C109984k kVar = (C109984k) zVar;
            if (kVar instanceof C109981h) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) kVar.f44854d;
                FrameLayout frameLayout = navigationMenuItemView.f309451F;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.f309450E.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
    }

    /* renamed from: o8.g$d */
    public static class C109977d implements C109978e {
    }

    /* renamed from: o8.g$e */
    public interface C109978e {
    }

    /* renamed from: o8.g$f */
    public static class C109979f implements C109978e {

        /* renamed from: a */
        public final int f329143a;

        /* renamed from: b */
        public final int f329144b;

        public C109979f(int i, int i2) {
            this.f329143a = i;
            this.f329144b = i2;
        }
    }

    /* renamed from: o8.g$g */
    public static class C109980g implements C109978e {

        /* renamed from: a */
        public final C103452g f329145a;

        /* renamed from: b */
        public boolean f329146b;

        public C109980g(C103452g gVar) {
            this.f329145a = gVar;
        }
    }

    /* renamed from: o8.g$h */
    public static class C109981h extends C109984k {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C109981h(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.view.View.OnClickListener r5) {
            /*
                r2 = this;
                r0 = 2131494038(0x7f0c0496, float:1.8611573E38)
                r1 = 0
                android.view.View r3 = r3.inflate(r0, r4, r1)
                r2.<init>(r3)
                r3.setOnClickListener(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p1139o8.C109973g.C109981h.<init>(android.view.LayoutInflater, android.view.ViewGroup, android.view.View$OnClickListener):void");
        }
    }

    /* renamed from: o8.g$i */
    public static class C109982i extends C109984k {
        public C109982i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0966R.C0971layout.f7131z9, viewGroup, false));
        }
    }

    /* renamed from: o8.g$j */
    public static class C109983j extends C109984k {
        public C109983j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0966R.C0971layout.f7132z_, viewGroup, false));
        }
    }

    /* renamed from: o8.g$k */
    public static abstract class C109984k extends RecyclerView.C16631z {
        public C109984k(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public void mo143537a(C103448e eVar, boolean z) {
    }

    /* renamed from: b */
    public Parcelable mo143538b() {
        Bundle bundle = new Bundle();
        if (this.f329122d != null) {
            SparseArray sparseArray = new SparseArray();
            this.f329122d.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C109976c cVar = this.f329126h;
        if (cVar != null) {
            cVar.getClass();
            Bundle bundle2 = new Bundle();
            C103452g gVar = cVar.f329140e;
            if (gVar != null) {
                bundle2.putInt("android:menu:checked", gVar.f305267d);
            }
            SparseArray sparseArray2 = new SparseArray();
            int size = cVar.f329139d.size();
            for (int i = 0; i < size; i++) {
                C109978e eVar = cVar.f329139d.get(i);
                if (eVar instanceof C109980g) {
                    C103452g gVar2 = ((C109980g) eVar).f329145a;
                    View actionView = gVar2 != null ? gVar2.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray2.put(gVar2.f305267d, parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f329123e != null) {
            SparseArray sparseArray3 = new SparseArray();
            this.f329123e.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    /* renamed from: c */
    public void mo143539c(boolean z) {
        C109976c cVar = this.f329126h;
        if (cVar != null) {
            cVar.mo161319F4();
            cVar.notifyDataSetChanged();
        }
    }

    /* renamed from: d */
    public boolean mo143540d(C103463l lVar) {
        return false;
    }

    /* renamed from: e */
    public boolean mo143533e(C103448e eVar, C103452g gVar) {
        return false;
    }

    /* renamed from: f */
    public boolean mo143542f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo143534g(C103448e eVar, C103452g gVar) {
        return false;
    }

    public int getId() {
        return this.f329125g;
    }

    /* renamed from: h */
    public void mo143564h(Context context, C103448e eVar) {
        this.f329127i = LayoutInflater.from(context);
        this.f329124f = eVar;
        this.f329136u = context.getResources().getDimensionPixelOffset(C0966R.dimen.a0z);
    }

    /* renamed from: j */
    public void mo143545j(Parcelable parcelable) {
        C103452g gVar;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        C103452g gVar2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f329122d.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                C109976c cVar = this.f329126h;
                cVar.getClass();
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    cVar.f329141f = true;
                    int size = cVar.f329139d.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        C109978e eVar = cVar.f329139d.get(i2);
                        if ((eVar instanceof C109980g) && (gVar2 = ((C109980g) eVar).f329145a) != null && gVar2.f305267d == i) {
                            cVar.mo161320G4(gVar2);
                            break;
                        }
                        i2++;
                    }
                    cVar.f329141f = false;
                    cVar.mo161319F4();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = cVar.f329139d.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        C109978e eVar2 = cVar.f329139d.get(i3);
                        if (!(!(eVar2 instanceof C109980g) || (gVar = ((C109980g) eVar2).f329145a) == null || (actionView = gVar.getActionView()) == null || (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(gVar.f305267d)) == null)) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f329123e.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }
}
