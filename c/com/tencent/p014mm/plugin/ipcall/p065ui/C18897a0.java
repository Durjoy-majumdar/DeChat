package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;
import kv1.C99254i;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.a0 */
public class C18897a0 extends BaseAdapter {

    /* renamed from: d */
    public List<C18896a> f52993d = new ArrayList();

    /* renamed from: e */
    public List<C18896a> f52994e;

    /* renamed from: f */
    public IPCallCountryCodeSelectUI f52995f;

    /* renamed from: g */
    public String f52996g;

    /* renamed from: h */
    public int[] f52997h;

    /* renamed from: i */
    public boolean f52998i;

    /* renamed from: j */
    public boolean f52999j;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.a0$a */
    public static class C18898a {

        /* renamed from: a */
        public TextView f53000a;

        /* renamed from: b */
        public TextView f53001b;

        /* renamed from: c */
        public TextView f53002c;
    }

    public C18897a0(IPCallCountryCodeSelectUI iPCallCountryCodeSelectUI, List<C18896a> list) {
        this.f52998i = false;
        this.f52999j = false;
        this.f52995f = iPCallCountryCodeSelectUI;
        this.f52994e = list;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.f52993d.add(this.f52994e.get(i));
        }
        this.f52995f.f52983q.setVisibility(8);
        mo23896b();
    }

    /* renamed from: a */
    public final String mo23895a(int i) {
        char c = (char) i;
        String valueOf = String.valueOf(c);
        String[] strArr = IPCallCountryCodeScrollbar.f198432r;
        for (int i2 = 0; i2 < 26; i2++) {
            if (strArr[i2].equals(String.valueOf(c))) {
                return valueOf;
            }
        }
        return "#";
    }

    /* renamed from: b */
    public final void mo23896b() {
        this.f52997h = new int[this.f52994e.size()];
        int size = this.f52994e.size();
        for (int i = 0; i < size; i++) {
            this.f52997h[i] = this.f52994e.get(i).mo23894a();
        }
    }

    public int getCount() {
        return this.f52994e.size();
    }

    public Object getItem(int i) {
        return this.f52994e.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C18898a aVar;
        C18896a aVar2 = (C18896a) getItem(i);
        if (view == null) {
            view = View.inflate(this.f52995f, C0966R.C0971layout.b26, (ViewGroup) null);
            aVar = new C18898a();
            aVar.f53000a = (TextView) view.findViewById(C0966R.C0970id.bqq);
            aVar.f53001b = (TextView) view.findViewById(C0966R.C0970id.bqu);
            aVar.f53002c = (TextView) view.findViewById(C0966R.C0970id.bqz);
            view.setTag(aVar);
        } else {
            aVar = (C18898a) view.getTag();
        }
        int i2 = i >= 1 ? this.f52997h[i - 1] : -1;
        if (i == 0) {
            aVar.f53000a.setVisibility(0);
            if (this.f52999j) {
                aVar.f53000a.setText(C0966R.string.hlv);
            } else {
                aVar.f53000a.setText(mo23895a(this.f52997h[i]));
            }
        } else if (i <= 0 || this.f52997h[i] == i2) {
            aVar.f53000a.setVisibility(8);
        } else {
            aVar.f53000a.setVisibility(0);
            aVar.f53000a.setText(mo23895a(this.f52997h[i]));
        }
        if (!Util.isNullOrNil(this.f52996g)) {
            aVar.f53001b.setText(C99254i.m129306c(this.f52995f, aVar2.f52989a, this.f52996g));
            IPCallCountryCodeSelectUI iPCallCountryCodeSelectUI = this.f52995f;
            aVar.f53002c.setText(C99254i.m129306c(iPCallCountryCodeSelectUI, " (+" + aVar2.f52990b + ")", this.f52996g));
        } else {
            aVar.f53001b.setText(aVar2.f52989a);
            TextView textView = aVar.f53002c;
            textView.setText(" (+" + aVar2.f52990b + ")");
        }
        if (this.f52998i) {
            aVar.f53002c.setVisibility(0);
        } else {
            aVar.f53002c.setVisibility(4);
        }
        return view;
    }
}
