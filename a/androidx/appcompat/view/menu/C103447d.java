package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.C103458j;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.d */
public class C103447d extends BaseAdapter {

    /* renamed from: d */
    public C103448e f305224d;

    /* renamed from: e */
    public int f305225e = -1;

    /* renamed from: f */
    public boolean f305226f;

    /* renamed from: g */
    public final boolean f305227g;

    /* renamed from: h */
    public final LayoutInflater f305228h;

    /* renamed from: i */
    public final int f305229i;

    public C103447d(C103448e eVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f305227g = z;
        this.f305228h = layoutInflater;
        this.f305224d = eVar;
        this.f305229i = i;
        mo143573a();
    }

    /* renamed from: a */
    public void mo143573a() {
        C103448e eVar = this.f305224d;
        C103452g gVar = eVar.f305232B;
        if (gVar != null) {
            eVar.mo143603i();
            ArrayList<C103452g> arrayList = eVar.f305244p;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == gVar) {
                    this.f305225e = i;
                    return;
                }
            }
        }
        this.f305225e = -1;
    }

    /* renamed from: b */
    public C103452g getItem(int i) {
        ArrayList<C103452g> arrayList;
        if (this.f305227g) {
            C103448e eVar = this.f305224d;
            eVar.mo143603i();
            arrayList = eVar.f305244p;
        } else {
            arrayList = this.f305224d.mo143607l();
        }
        int i2 = this.f305225e;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayList.get(i);
    }

    public int getCount() {
        ArrayList<C103452g> arrayList;
        if (this.f305227g) {
            C103448e eVar = this.f305224d;
            eVar.mo143603i();
            arrayList = eVar.f305244p;
        } else {
            arrayList = this.f305224d.mo143607l();
        }
        return this.f305225e < 0 ? arrayList.size() : arrayList.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f305228h.inflate(this.f305229i, viewGroup, false);
        }
        int i2 = getItem(i).f305268e;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f305224d.mo143608m() && i2 != (i3 >= 0 ? getItem(i3).f305268e : i2));
        C103458j.C103459a aVar = (C103458j.C103459a) view;
        if (this.f305226f) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo143501d(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo143573a();
        super.notifyDataSetChanged();
    }
}
