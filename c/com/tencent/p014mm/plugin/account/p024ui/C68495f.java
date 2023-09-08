package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.account.ui.f */
public class C68495f extends BaseAdapter implements Filterable {

    /* renamed from: d */
    public List<String> f196762d;

    /* renamed from: e */
    public final Object f196763e = new Object();

    /* renamed from: f */
    public Context f196764f;

    /* renamed from: g */
    public ArrayList<String> f196765g;

    /* renamed from: h */
    public C68497b f196766h;

    /* renamed from: i */
    public String f196767i;

    /* renamed from: com.tencent.mm.plugin.account.ui.f$b */
    public class C68497b extends Filter {
        public C68497b(C68496a aVar) {
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String[] split;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            C68495f fVar = C68495f.this;
            if (fVar.f196765g == null) {
                synchronized (fVar.f196763e) {
                    C68495f.this.f196765g = new ArrayList<>(C68495f.this.f196762d);
                }
            }
            if (charSequence == null || charSequence.length() == 0) {
                synchronized (C68495f.this.f196763e) {
                    ArrayList arrayList = new ArrayList(C68495f.this.f196765g);
                    filterResults.values = arrayList;
                    filterResults.count = arrayList.size();
                }
            } else {
                String lowerCase = charSequence.toString().toLowerCase();
                String str = "";
                String str2 = C68495f.this.f196767i;
                if (str2 != null && str2.length() > 0 && (split = lowerCase.split(C68495f.this.f196767i)) != null && split.length > 1) {
                    str = split[0] + C68495f.this.f196767i;
                    lowerCase = split[1];
                }
                ArrayList<String> arrayList2 = C68495f.this.f196765g;
                int size = arrayList2.size();
                ArrayList arrayList3 = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    String str3 = arrayList2.get(i);
                    if (str3.toString().toLowerCase().startsWith(lowerCase)) {
                        arrayList3.add(str + str3);
                    }
                }
                filterResults.values = arrayList3;
                filterResults.count = arrayList3.size();
            }
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            C68495f fVar = C68495f.this;
            fVar.f196762d = (List) filterResults.values;
            if (filterResults.count > 0) {
                fVar.notifyDataSetChanged();
            } else {
                fVar.notifyDataSetInvalidated();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.f$c */
    public static class C68498c {

        /* renamed from: a */
        public TextView f196769a;
    }

    public C68495f(Context context, String[] strArr, String str) {
        this.f196764f = context;
        this.f196762d = Arrays.asList(strArr);
        this.f196767i = str;
    }

    public int getCount() {
        return this.f196762d.size();
    }

    public Filter getFilter() {
        if (this.f196766h == null) {
            this.f196766h = new C68497b((C68496a) null);
        }
        return this.f196766h;
    }

    public Object getItem(int i) {
        return this.f196762d.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C68498c cVar;
        if (view == null) {
            view = View.inflate(this.f196764f, C0966R.C0971layout.f6528hb, (ViewGroup) null);
            cVar = new C68498c();
            cVar.f196769a = (TextView) view.findViewById(C0966R.C0970id.f359367kj0);
            view.setTag(cVar);
        } else {
            cVar = (C68498c) view.getTag();
        }
        cVar.f196769a.setText(this.f196762d.get(i));
        view.setBackgroundResource(C0966R.C0969drawable.f4855pa);
        return view;
    }
}
