package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.C103412e;
import androidx.appcompat.view.menu.C103456i;
import androidx.appcompat.view.menu.C103458j;
import com.tencent.p014mm.C0966R;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.c */
public class C103445c implements C103456i, AdapterView.OnItemClickListener {

    /* renamed from: d */
    public Context f305216d;

    /* renamed from: e */
    public LayoutInflater f305217e;

    /* renamed from: f */
    public C103448e f305218f;

    /* renamed from: g */
    public ExpandedMenuView f305219g;

    /* renamed from: h */
    public C103456i.C103457a f305220h;

    /* renamed from: i */
    public C103446a f305221i;

    /* renamed from: androidx.appcompat.view.menu.c$a */
    public class C103446a extends BaseAdapter {

        /* renamed from: d */
        public int f305222d = -1;

        public C103446a() {
            mo143566a();
        }

        /* renamed from: a */
        public void mo143566a() {
            C103448e eVar = C103445c.this.f305218f;
            C103452g gVar = eVar.f305232B;
            if (gVar != null) {
                eVar.mo143603i();
                ArrayList<C103452g> arrayList = eVar.f305244p;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == gVar) {
                        this.f305222d = i;
                        return;
                    }
                }
            }
            this.f305222d = -1;
        }

        /* renamed from: b */
        public C103452g getItem(int i) {
            C103448e eVar = C103445c.this.f305218f;
            eVar.mo143603i();
            ArrayList<C103452g> arrayList = eVar.f305244p;
            C103445c.this.getClass();
            int i2 = i + 0;
            int i3 = this.f305222d;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayList.get(i2);
        }

        public int getCount() {
            C103448e eVar = C103445c.this.f305218f;
            eVar.mo143603i();
            int size = eVar.f305244p.size();
            C103445c.this.getClass();
            int i = size + 0;
            return this.f305222d < 0 ? i : i - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = C103445c.this.f305217e.inflate(C0966R.C0971layout.f6285an, viewGroup, false);
            }
            ((C103458j.C103459a) view).mo143501d(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo143566a();
            super.notifyDataSetChanged();
        }
    }

    public C103445c(Context context, int i) {
        this.f305216d = context;
        this.f305217e = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public void mo143537a(C103448e eVar, boolean z) {
        C103456i.C103457a aVar = this.f305220h;
        if (aVar != null) {
            aVar.mo143414a(eVar, z);
        }
    }

    /* renamed from: b */
    public Parcelable mo143538b() {
        if (this.f305219g == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f305219g;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    /* renamed from: c */
    public void mo143539c(boolean z) {
        C103446a aVar = this.f305221i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: d */
    public boolean mo143540d(C103463l lVar) {
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        C103451f fVar = new C103451f(lVar);
        C103412e.C103413a aVar = new C103412e.C103413a(lVar.f305235d);
        C103445c cVar = new C103445c(aVar.f305071a.f304976a, C0966R.C0971layout.f6285an);
        fVar.f305257f = cVar;
        cVar.f305220h = fVar;
        C103448e eVar = fVar.f305255d;
        eVar.mo143590b(cVar, eVar.f305235d);
        C103445c cVar2 = fVar.f305257f;
        if (cVar2.f305221i == null) {
            cVar2.f305221i = new C103446a();
        }
        C103446a aVar2 = cVar2.f305221i;
        AlertController.C103396b bVar = aVar.f305071a;
        bVar.f304985j = aVar2;
        bVar.f304986k = fVar;
        View view = lVar.f305249u;
        if (view != null) {
            bVar.f304980e = view;
        } else {
            bVar.f304978c = lVar.f305248t;
            bVar.f304979d = lVar.f305247s;
        }
        bVar.f304984i = fVar;
        C103412e a = aVar.mo143455a();
        fVar.f305256e = a;
        a.setOnDismissListener(fVar);
        WindowManager.LayoutParams attributes = fVar.f305256e.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        fVar.f305256e.show();
        C103456i.C103457a aVar3 = this.f305220h;
        if (aVar3 == null) {
            return true;
        }
        aVar3.mo143415d(lVar);
        return true;
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
        return 0;
    }

    /* renamed from: h */
    public void mo143564h(Context context, C103448e eVar) {
        if (this.f305216d != null) {
            this.f305216d = context;
            if (this.f305217e == null) {
                this.f305217e = LayoutInflater.from(context);
            }
        }
        this.f305218f = eVar;
        C103446a aVar = this.f305221i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: i */
    public void mo143536i(C103456i.C103457a aVar) {
        this.f305220h = aVar;
    }

    /* renamed from: j */
    public void mo143545j(Parcelable parcelable) {
        SparseArray sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f305219g.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f305218f.mo143614q(this.f305221i.getItem(i), this, 0);
    }
}
