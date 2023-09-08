package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.j0 */
public final class C84639j0 extends RecyclerView.C16613e {

    /* renamed from: d */
    public final SparseArray<C84642k0> f246944d = new SparseArray<>();

    /* renamed from: e */
    public final ArrayList<?> f246945e;

    /* renamed from: f */
    public LayoutInflater f246946f;

    public C84639j0(ArrayList<?> arrayList) {
        this.f246945e = arrayList;
    }

    /* renamed from: F4 */
    public Object mo117348F4(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        return this.f246945e.get(i);
    }

    /* renamed from: G4 */
    public boolean mo117349G4() {
        ArrayList<?> arrayList = this.f246945e;
        return arrayList == null || Util.isNullOrNil((List) arrayList);
    }

    public int getItemCount() {
        ArrayList<?> arrayList = this.f246945e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public long getItemId(int i) {
        Object F4 = mo117348F4(i);
        C84642k0 k0Var = this.f246944d.get(getItemViewType(i));
        if (F4 == null || k0Var == null) {
            return 0;
        }
        return k0Var.mo117296a(F4);
    }

    public int getItemViewType(int i) {
        Object F4 = mo117348F4(i);
        if (F4 == null) {
            return 0;
        }
        return F4.getClass().hashCode();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C84642k0 k0Var = this.f246944d.get(getItemViewType(i));
        if (k0Var != null) {
            k0Var.mo117298c(zVar, mo117348F4(i));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C84642k0 k0Var = this.f246944d.get(i);
        if (k0Var == null) {
            return null;
        }
        Context context = viewGroup.getContext();
        if (this.f246946f == null) {
            this.f246946f = LayoutInflater.from(context);
        }
        return k0Var.mo117299d(this.f246946f, viewGroup);
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        C84642k0 k0Var = this.f246944d.get(getItemViewType(i));
        if (k0Var == null) {
            super.onBindViewHolder(zVar, i, list);
        } else if (list.size() <= 0 || !k0Var.mo117297b(zVar, mo117348F4(i), list.get(0))) {
            k0Var.mo117298c(zVar, mo117348F4(i));
        }
    }
}
