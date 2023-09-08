package com.tencent.p014mm.plugin.product.p087ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ze2.C79322b;

/* renamed from: com.tencent.mm.plugin.product.ui.k */
public class C70111k extends BaseAdapter implements Filterable {

    /* renamed from: d */
    public Context f202390d;

    /* renamed from: e */
    public List<String> f202391e = null;

    /* renamed from: f */
    public List<String> f202392f = null;

    /* renamed from: g */
    public Filter f202393g = new C70112a();

    /* renamed from: com.tencent.mm.plugin.product.ui.k$a */
    public class C70112a extends Filter {
        public C70112a() {
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) C70111k.this.f202391e).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!(str == null || charSequence == null || !str.contains(charSequence))) {
                    arrayList.add(str);
                }
            }
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
            return filterResults;
        }

        public synchronized void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            C70111k kVar = C70111k.this;
            kVar.f202392f = (List) filterResults.values;
            kVar.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.k$b */
    public class C70113b {

        /* renamed from: a */
        public TextView f202395a;

        public C70113b(C70111k kVar) {
        }
    }

    public C70111k(Context context) {
        this.f202390d = context;
        this.f202391e = C79322b.vx0().xx0().f43a;
    }

    public int getCount() {
        List<String> list = this.f202392f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public Filter getFilter() {
        return this.f202393g;
    }

    public Object getItem(int i) {
        return this.f202392f.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        C70113b bVar;
        if (view == null) {
            bVar = new C70113b(this);
            view2 = LayoutInflater.from(this.f202390d).inflate(17367043, (ViewGroup) null);
            bVar.f202395a = (TextView) view2.findViewById(16908308);
            view2.setTag(bVar);
        } else {
            view2 = view;
            bVar = (C70113b) view.getTag();
        }
        bVar.f202395a.setText(this.f202392f.get(i));
        return view2;
    }
}
