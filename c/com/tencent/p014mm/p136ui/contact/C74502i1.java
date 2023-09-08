package com.tencent.p014mm.p136ui.contact;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import com.tencent.p014mm.sdk.platformtools.Log;
import gl3.C75922b;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.ui.contact.i1 */
public abstract class C74502i1 extends BaseAdapter {

    /* renamed from: d */
    public C74493g1 f219055d;

    /* renamed from: e */
    public SparseArray<C75922b> f219056e = new SparseArray<>();

    /* renamed from: f */
    public boolean f219057f;

    /* renamed from: g */
    public boolean f219058g;

    /* renamed from: h */
    public int f219059h;

    public C74502i1(C74493g1 g1Var, boolean z, int i, boolean z2) {
        this.f219055d = g1Var;
        this.f219057f = z;
        this.f219059h = i;
        this.f219058g = z2;
    }

    /* renamed from: g */
    public void mo103564g() {
        SparseArray<C75922b> sparseArray = this.f219056e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public long getItemId(int i) {
        return -1;
    }

    public int getItemViewType(int i) {
        if (getItem(i) != null) {
            return getItem(i).f222604a;
        }
        Log.m105921e("MicroMsg.MMSelectContactAdapter", "getItemViewType: get data item fail, return unkown Type, totalCount=%d | position = %s", Integer.valueOf(getCount()), Integer.valueOf(i));
        return -1;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C75922b j = getItem(i);
        if (view == null) {
            view = j.mo67028b().mo67030b(this.f219055d.getActivity(), viewGroup, view);
        }
        C75922b.C75923a aVar = (C75922b.C75923a) view.getTag();
        Assert.assertNotNull(aVar);
        if (!j.mo106183d()) {
            j.mo67027a(this.f219055d.getActivity(), aVar);
            j.mo106186g(true);
        }
        j.mo106187h(mo103570o());
        j.mo106185f(this.f219055d.mo7833n1(j));
        j.mo67028b().mo67029a(this.f219055d.getActivity(), aVar, j, this.f219055d.mo7830D6(j), this.f219055d.mo7834x7(j));
        return view;
    }

    public int getViewTypeCount() {
        return 10;
    }

    /* renamed from: h */
    public abstract C75922b mo7850h(int i);

    /* renamed from: i */
    public void mo7851i() {
        mo103564g();
    }

    /* renamed from: j */
    public C75922b getItem(int i) {
        if (this.f219056e.indexOfKey(i) >= 0) {
            return this.f219056e.get(i);
        }
        if (i < 0 || i >= getCount()) {
            Log.m105921e("MicroMsg.MMSelectContactAdapter", "getItem Occur error !!!!!!!!! position = %d", Integer.valueOf(i));
            return null;
        }
        C75922b h = mo7850h(i);
        if (h != null) {
            h.f222612i = mo70169n(h);
            this.f219056e.put(i, h);
            Log.m105919d("MicroMsg.MMSelectContactAdapter", "put item to cache viewType=%d|position=%d", Integer.valueOf(h.f222604a), Integer.valueOf(i));
        } else {
            Log.m105921e("MicroMsg.MMSelectContactAdapter", "createDataItem Occur error !!!!!!!!! position = %d", Integer.valueOf(i));
        }
        return h;
    }

    /* renamed from: k */
    public int mo103530k() {
        return 0;
    }

    /* renamed from: l */
    public boolean mo103531l(AdapterView<?> adapterView, View view, int i, long j) {
        return false;
    }

    /* renamed from: n */
    public boolean mo70169n(C75922b bVar) {
        return false;
    }

    /* renamed from: o */
    public boolean mo103570o() {
        return this.f219057f;
    }

    /* renamed from: p */
    public void mo103548p(boolean z) {
        this.f219057f = z;
        notifyDataSetChanged();
    }
}
