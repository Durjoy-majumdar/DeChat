package lx1;

import android.database.DataSetObservable;
import android.view.View;
import android.view.ViewGroup;
import lx1.C99718b;

/* renamed from: lx1.a */
public abstract class C99717a<VH extends C99718b> {

    /* renamed from: a */
    public final DataSetObservable f292256a = new DataSetObservable();

    /* renamed from: a */
    public abstract int mo139068a();

    /* renamed from: b */
    public abstract int mo139069b(int i);

    /* renamed from: c */
    public View mo139070c(int i, View view, ViewGroup viewGroup) {
        View view2;
        C99718b bVar;
        int b = mo139069b(i);
        if (view == null) {
            bVar = mo139072e(viewGroup, b);
            view2 = bVar.f292257a;
            view2.setTag(bVar);
        } else {
            view2 = view;
            bVar = (C99718b) view.getTag();
        }
        bVar.f292258b = b;
        mo139071d(bVar, i);
        return view2;
    }

    /* renamed from: d */
    public abstract void mo139071d(VH vh, int i);

    /* renamed from: e */
    public abstract VH mo139072e(ViewGroup viewGroup, int i);
}
