package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import java.util.ArrayList;
import java.util.List;
import nc0.C76850a;

/* renamed from: com.tencent.mm.ui.tools.r */
public class C74852r extends BaseAdapter {

    /* renamed from: d */
    public List<C76850a.C76851a> f220082d = new ArrayList();

    /* renamed from: e */
    public List<C76850a.C76851a> f220083e;

    /* renamed from: f */
    public Context f220084f;

    /* renamed from: g */
    public String f220085g;

    /* renamed from: h */
    public int[] f220086h;

    /* renamed from: i */
    public boolean f220087i;

    /* renamed from: com.tencent.mm.ui.tools.r$a */
    public static class C74853a {

        /* renamed from: a */
        public TextView f220088a;

        /* renamed from: b */
        public TextView f220089b;

        /* renamed from: c */
        public TextView f220090c;
    }

    public C74852r(Context context, List<C76850a.C76851a> list) {
        this.f220087i = false;
        this.f220084f = context;
        this.f220083e = list;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.f220082d.add(this.f220083e.get(i));
        }
        mo104075b();
    }

    /* renamed from: a */
    public final String mo104074a(int i) {
        if (!LocaleUtil.isTraditionalChineseAppLang()) {
            return String.valueOf((char) i);
        }
        return Integer.toString(i) + "劃";
    }

    /* renamed from: b */
    public final void mo104075b() {
        this.f220086h = new int[this.f220083e.size()];
        int size = this.f220083e.size();
        for (int i = 0; i < size; i++) {
            this.f220086h[i] = this.f220083e.get(i).f224679e;
        }
    }

    public int getCount() {
        return this.f220083e.size();
    }

    public Object getItem(int i) {
        return this.f220083e.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C74853a aVar;
        C76850a.C76851a aVar2 = (C76850a.C76851a) getItem(i);
        if (view == null) {
            view = !LocaleUtil.isTraditionalChineseAppLang() ? View.inflate(this.f220084f, C0966R.C0971layout.f7100ya, (ViewGroup) null) : View.inflate(this.f220084f, C0966R.C0971layout.f7101yb, (ViewGroup) null);
            aVar = new C74853a();
            aVar.f220088a = (TextView) view.findViewById(C0966R.C0970id.bqq);
            aVar.f220089b = (TextView) view.findViewById(C0966R.C0970id.bqu);
            aVar.f220090c = (TextView) view.findViewById(C0966R.C0970id.bqz);
            view.setTag(aVar);
        } else {
            aVar = (C74853a) view.getTag();
        }
        int i2 = i >= 1 ? this.f220086h[i - 1] : -1;
        if (i == 0) {
            aVar.f220088a.setVisibility(0);
            aVar.f220088a.setText(mo104074a(this.f220086h[i]));
        } else if (i <= 0 || this.f220086h[i] == i2) {
            aVar.f220088a.setVisibility(8);
        } else {
            aVar.f220088a.setVisibility(0);
            aVar.f220088a.setText(mo104074a(this.f220086h[i]));
        }
        aVar.f220089b.setText(aVar2.f224677c);
        aVar.f220090c.setText(aVar2.f224676b);
        if (this.f220087i) {
            aVar.f220090c.setVisibility(0);
        } else {
            aVar.f220090c.setVisibility(4);
        }
        return view;
    }
}
