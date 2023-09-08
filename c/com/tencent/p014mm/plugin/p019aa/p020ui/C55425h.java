package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C75339i;
import di3.C86312j;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import p196ln.C76705f;
import p629ny.C76979h;
import te3.C64566n;
import yf0.C79104i;

/* renamed from: com.tencent.mm.plugin.aa.ui.h */
public class C55425h extends BaseAdapter {

    /* renamed from: d */
    public List<C64566n> f157896d = new ArrayList();

    /* renamed from: e */
    public Context f157897e;

    /* renamed from: f */
    public int f157898f;

    /* renamed from: com.tencent.mm.plugin.aa.ui.h$a */
    public class C55426a {

        /* renamed from: a */
        public ImageView f157899a;

        /* renamed from: b */
        public TextView f157900b;

        /* renamed from: c */
        public TextView f157901c;

        /* renamed from: d */
        public TextView f157902d;

        /* renamed from: e */
        public TextView f157903e;

        /* renamed from: f */
        public TextView f157904f;

        public C55426a(C55425h hVar, View view) {
            this.f157899a = (ImageView) view.findViewById(C0966R.C0970id.f5269ah);
            this.f157900b = (TextView) view.findViewById(C0966R.C0970id.f5270ai);
            this.f157901c = (TextView) view.findViewById(C0966R.C0970id.f5274am);
            this.f157902d = (TextView) view.findViewById(C0966R.C0970id.f5271aj);
            this.f157903e = (TextView) view.findViewById(C0966R.C0970id.f5268ag);
            this.f157904f = (TextView) view.findViewById(C0966R.C0970id.f5273al);
        }
    }

    public C55425h(Context context, int i) {
        this.f157897e = context;
        this.f157898f = i;
    }

    public int getCount() {
        return ((ArrayList) this.f157896d).size();
    }

    public Object getItem(int i) {
        return ((ArrayList) this.f157896d).get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Class cls = C76979h.class;
        if (view == null) {
            view = C85868k2.m106137b(this.f157897e).inflate(C0966R.C0971layout.f6263a1, viewGroup, false);
            view.setTag(new C55426a(this, view));
        }
        C55426a aVar = (C55426a) view.getTag();
        C64566n nVar = (C64566n) getItem(i);
        if (!Util.isNullOrNil(nVar.f184416n)) {
            ((C76705f) C86312j.m106911c(C76705f.class)).D20(aVar.f157899a, nVar.f184416n, 0.1f);
        } else {
            aVar.f157899a.setImageResource(C0966R.raw.aa_record_default_icon);
        }
        aVar.f157901c.setText(((C76979h) C86312j.m106911c(cls)).yp0(this.f157897e, nVar.f184410e, aVar.f157901c.getTextSize()));
        String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(nVar.f184416n);
        if (Util.isNullOrNil(displayName) || displayName.endsWith("@chatroom")) {
            displayName = this.f157897e.getString(C0966R.string.f7277b_);
        }
        aVar.f157900b.setText(((C76979h) C86312j.m106911c(cls)).yp0(this.f157897e, displayName, aVar.f157900b.getTextSize()));
        if (this.f157898f == 2) {
            aVar.f157902d.setText(nVar.f184417o);
        } else {
            aVar.f157902d.setText(nVar.f184412g);
        }
        String bigDecimal = new BigDecimal(C79104i.m95673r((double) nVar.f184411f)).setScale(2, 4).toString();
        aVar.f157903e.setText(String.format("%s%s", new Object[]{this.f157897e.getString(C0966R.string.f7324cs), bigDecimal}));
        C85875k4.m106189j0(aVar.f157903e.getPaint(), 0.8f);
        aVar.f157904f.setVisibility(0);
        if (this.f157898f == 2) {
            int i2 = nVar.f184413h;
            if (i2 == 1) {
                aVar.f157904f.setText(C0966R.string.f7294bu);
                aVar.f157904f.setTextColor(this.f157897e.getResources().getColor(C0966R.color.f2982bc));
            } else if (i2 != 2) {
                aVar.f157904f.setVisibility(4);
            } else {
                aVar.f157904f.setText(C0966R.string.f7292bs);
                aVar.f157904f.setTextColor(this.f157897e.getResources().getColor(C0966R.color.f2982bc));
            }
        } else {
            int i3 = nVar.f184413h;
            if (i3 == 1) {
                aVar.f157904f.setText(C0966R.string.f7293bt);
                aVar.f157904f.setTextColor(this.f157897e.getResources().getColor(C0966R.color.f2982bc));
            } else if (i3 == 2) {
                aVar.f157904f.setText(C0966R.string.f7291br);
                aVar.f157904f.setTextColor(this.f157897e.getResources().getColor(C0966R.color.f2939n));
            } else if (i3 == 3) {
                aVar.f157904f.setText(C0966R.string.f7289bp);
                aVar.f157904f.setTextColor(this.f157897e.getResources().getColor(C0966R.color.Red_100));
            } else if (i3 != 4) {
                aVar.f157904f.setVisibility(4);
            } else {
                aVar.f157904f.setText(C0966R.string.f7290bq);
                aVar.f157904f.setTextColor(this.f157897e.getResources().getColor(C0966R.color.Red_100));
            }
        }
        return view;
    }
}
