package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C69236j1;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.u4 */
public class C69699u4 extends BaseAdapter {

    /* renamed from: d */
    public List<C69236j1> f201099d = new LinkedList();

    /* renamed from: e */
    public String f201100e;

    /* renamed from: f */
    public boolean f201101f;

    /* renamed from: g */
    public Context f201102g;

    /* renamed from: h */
    public LayoutInflater f201103h;

    /* renamed from: i */
    public View.OnClickListener f201104i;

    /* renamed from: j */
    public int f201105j = 1;

    /* renamed from: n */
    public C69701b f201106n = null;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.u4$a */
    public final class C69700a implements C69701b {
        public C69700a(C69699u4 u4Var) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.u4$b */
    public interface C69701b {
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.u4$c */
    public class C69702c {

        /* renamed from: a */
        public View f201107a;

        /* renamed from: b */
        public ImageView f201108b;

        /* renamed from: c */
        public TextView f201109c;

        /* renamed from: d */
        public TextView f201110d;

        /* renamed from: e */
        public TextView f201111e;

        /* renamed from: f */
        public TextView f201112f;

        /* renamed from: g */
        public TextView f201113g;

        /* renamed from: h */
        public ImageView f201114h;

        /* renamed from: i */
        public TextView f201115i;

        public C69702c(C69699u4 u4Var) {
        }
    }

    public C69699u4(Context context) {
        this.f201102g = context;
        this.f201103h = LayoutInflater.from(context);
    }

    public int getCount() {
        return this.f201099d.size();
    }

    public Object getItem(int i) {
        return this.f201099d.get(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C69702c cVar;
        if (view == null) {
            view = this.f201103h.inflate(C0966R.C0971layout.b_c, viewGroup, false);
            cVar = new C69702c(this);
            cVar.f201107a = view.findViewById(C0966R.C0970id.iwc);
            cVar.f201108b = (ImageView) view.findViewById(C0966R.C0970id.giv);
            cVar.f201109c = (TextView) view.findViewById(C0966R.C0970id.giz);
            cVar.f201110d = (TextView) view.findViewById(C0966R.C0970id.f358696gj0);
            cVar.f201111e = (TextView) view.findViewById(C0966R.C0970id.git);
            cVar.f201112f = (TextView) view.findViewById(C0966R.C0970id.giu);
            cVar.f201113g = (TextView) view.findViewById(C0966R.C0970id.f358697gj1);
            cVar.f201114h = (ImageView) view.findViewById(C0966R.C0970id.giw);
            cVar.f201115i = (TextView) view.findViewById(C0966R.C0970id.gix);
            if (this.f201106n != null) {
                Context context = this.f201102g;
                int color = context.getResources().getColor(C0966R.color.a2r);
                int color2 = context.getResources().getColor(C0966R.color.a2s);
                int color3 = context.getResources().getColor(C0966R.color.a36);
                cVar.f201107a.setBackgroundResource(C0966R.color.ahf);
                cVar.f201107a.setPadding(0, context.getResources().getDimensionPixelOffset(C0966R.dimen.f3913iq), 0, context.getResources().getDimensionPixelOffset(C0966R.dimen.f3913iq));
                cVar.f201109c.setTextColor(color);
                cVar.f201110d.setTextColor(color2);
                cVar.f201111e.setTextColor(color);
                cVar.f201112f.setTextColor(color);
                cVar.f201113g.setTextColor(color3);
            }
            view.setTag(cVar);
        } else {
            cVar = (C69702c) view.getTag();
        }
        C69236j1 j1Var = this.f201099d.get(i);
        C69242l1.m81595a(cVar.f201108b, j1Var.f199213e, j1Var.f199219n);
        if (!Util.nullAsNil(j1Var.f199217i).equals(this.f201100e) || !this.f201101f) {
            if (Util.isNullOrNil(j1Var.f199216h)) {
                cVar.f201112f.setVisibility(8);
            } else {
                C69242l1.m81616v(this.f201102g, cVar.f201112f, j1Var.f199216h);
                cVar.f201112f.setVisibility(0);
            }
            cVar.f201110d.setText(C69242l1.m81597c(this.f201102g, Util.getLong(j1Var.f199215g, 0) * 1000));
            cVar.f201110d.setVisibility(0);
            cVar.f201113g.setVisibility(8);
        } else {
            cVar.f201113g.setOnClickListener(this.f201104i);
            cVar.f201113g.setVisibility(0);
            cVar.f201112f.setVisibility(8);
            cVar.f201110d.setVisibility(8);
        }
        C69242l1.m81616v(this.f201102g, cVar.f201109c, j1Var.f199212d);
        cVar.f201111e.setText(this.f201102g.getString(C0966R.string.gin, new Object[]{C75228t.m90260n(((double) j1Var.f199214f) / 100.0d)}));
        if (Util.isNullOrNil(j1Var.f199218j)) {
            cVar.f201114h.setVisibility(8);
            cVar.f201115i.setVisibility(8);
        } else {
            cVar.f201115i.setText(j1Var.f199218j);
            if (this.f201105j == 2) {
                cVar.f201114h.setImageResource(C0966R.C0969drawable.c6v);
            } else {
                cVar.f201114h.setImageResource(C0966R.C0969drawable.c5s);
            }
            cVar.f201114h.setVisibility(0);
            cVar.f201115i.setVisibility(0);
        }
        return view;
    }
}
