package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.ui.tools.y0 */
public class C74866y0 extends C74850p1 {

    /* renamed from: q */
    public LayoutInflater f220113q;

    /* renamed from: r */
    public C74868b f220114r;

    /* renamed from: s */
    public boolean f220115s = true;

    /* renamed from: t */
    public C76874e0 f220116t;

    /* renamed from: u */
    public C11182m0 f220117u;

    /* renamed from: v */
    public C11184p0 f220118v;

    /* renamed from: com.tencent.mm.ui.tools.y0$b */
    public class C74868b extends BaseAdapter {

        /* renamed from: com.tencent.mm.ui.tools.y0$b$a */
        public class C74869a {

            /* renamed from: a */
            public TextView f220120a;

            /* renamed from: b */
            public ImageView f220121b;

            /* renamed from: c */
            public View f220122c;

            public C74869a(C74868b bVar, C74867a aVar) {
            }
        }

        public C74868b(C74867a aVar) {
        }

        public int getCount() {
            C74866y0 y0Var = C74866y0.this;
            return y0Var.f220115s ? y0Var.f220116t.size() + 1 : y0Var.f220116t.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public int getItemViewType(int i) {
            return (!C74866y0.this.f220115s || i != 0) ? 1 : 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C74869a aVar;
            C74869a aVar2;
            C74866y0 y0Var = C74866y0.this;
            boolean z = y0Var.f220115s;
            if (!z || i != 0) {
                if (z) {
                    i--;
                }
                if (view == null) {
                    view = y0Var.f220113q.inflate(C0966R.C0971layout.bfl, viewGroup, false);
                    aVar = new C74869a(this, (C74867a) null);
                    aVar.f220120a = (TextView) view.findViewById(C0966R.C0970id.knx);
                    aVar.f220121b = (ImageView) view.findViewById(C0966R.C0970id.f15);
                    aVar.f220122c = view.findViewById(C0966R.C0970id.iwc);
                    view.setTag(aVar);
                } else {
                    aVar = (C74869a) view.getTag();
                }
                MenuItem item = C74866y0.this.f220116t.getItem(i);
                aVar.f220120a.setText(item.getTitle());
                if (item.getIcon() != null) {
                    aVar.f220121b.setVisibility(0);
                    aVar.f220121b.setImageDrawable(item.getIcon());
                } else {
                    C74866y0.this.getClass();
                    aVar.f220121b.setVisibility(8);
                }
                C74866y0.this.getClass();
                if (i == C74866y0.this.f220116t.size() - 1) {
                    aVar.f220122c.setBackgroundResource(C0966R.C0969drawable.avo);
                } else {
                    aVar.f220122c.setBackgroundResource(C0966R.C0969drawable.avn);
                }
            } else {
                if (view == null) {
                    view = y0Var.f220113q.inflate(C0966R.C0971layout.bfm, viewGroup, false);
                    aVar2 = new C74869a(this, (C74867a) null);
                    aVar2.f220120a = (TextView) view.findViewById(C0966R.C0970id.knx);
                    aVar2.f220121b = (ImageView) view.findViewById(C0966R.C0970id.f15);
                    view.setTag(aVar2);
                } else {
                    aVar2 = (C74869a) view.getTag();
                }
                TextView textView = aVar2.f220120a;
                C74866y0 y0Var2 = C74866y0.this;
                CharSequence charSequence = y0Var2.f220116t.f224705e;
                textView.setText((charSequence == null || charSequence.length() == 0) ? y0Var2.f220072e.getResources().getString(C0966R.string.f7929wj) : y0Var2.f220116t.f224705e);
            }
            return view;
        }

        public int getViewTypeCount() {
            return C74866y0.this.f220115s ? 2 : 1;
        }
    }

    public C74866y0(Context context) {
        super(context);
        this.f220113q = C85868k2.m106137b(context);
        this.f220116t = new C76874e0(context);
    }

    /* renamed from: b */
    public BaseAdapter mo103922b() {
        if (this.f220114r == null) {
            this.f220114r = new C74868b((C74867a) null);
        }
        return this.f220114r;
    }

    /* renamed from: d */
    public boolean mo103923d() {
        C11182m0 m0Var = this.f220117u;
        if (m0Var != null) {
            m0Var.onCreateMMMenu(this.f220116t);
        }
        CharSequence charSequence = this.f220116t.f224705e;
        this.f220115s = charSequence != null && charSequence.length() > 0;
        super.mo103923d();
        return true;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean z = this.f220115s;
        if (!z || i != 0) {
            if (z) {
                i--;
            }
            C11184p0 p0Var = this.f220118v;
            if (p0Var != null) {
                p0Var.onMMMenuItemSelected(this.f220116t.getItem(i), i);
            }
            mo104068a();
        }
    }
}
