package com.tencent.p014mm.plugin.product.p087ui;

import af2.C39560p;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.product.ui.p */
public class C70118p extends BaseAdapter {

    /* renamed from: d */
    public Context f202405d;

    /* renamed from: e */
    public List<C39560p> f202406e;

    /* renamed from: f */
    public AdapterView.OnItemClickListener f202407f;

    /* renamed from: com.tencent.mm.plugin.product.ui.p$a */
    public class C70119a {

        /* renamed from: a */
        public TextView f202408a = null;

        /* renamed from: b */
        public MaxGridView f202409b = null;

        /* renamed from: c */
        public C70120q f202410c = null;

        public C70119a(C70118p pVar) {
        }
    }

    public C70118p(Context context) {
        this.f202405d = context;
    }

    public int getCount() {
        List<C39560p> list = this.f202406e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public Object getItem(int i) {
        return this.f202406e.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C70119a aVar;
        C39560p pVar = this.f202406e.get(i);
        if (view == null || view.getTag() == null) {
            aVar = new C70119a(this);
            view = View.inflate(this.f202405d, C0966R.C0971layout.boc, (ViewGroup) null);
            aVar.f202408a = (TextView) view.findViewById(C0966R.C0970id.gn7);
            aVar.f202409b = (MaxGridView) view.findViewById(C0966R.C0970id.gn6);
            aVar.f202410c = new C70120q(this.f202405d);
            view.setTag(aVar);
        } else {
            aVar = (C70119a) view.getTag();
        }
        aVar.f202408a.setText(pVar.f106202a);
        aVar.f202409b.setOnItemClickListener(this.f202407f);
        C70120q qVar = aVar.f202410c;
        qVar.f202412e = pVar.f106203b;
        qVar.notifyDataSetChanged();
        aVar.f202409b.setAdapter(aVar.f202410c);
        return view;
    }
}
