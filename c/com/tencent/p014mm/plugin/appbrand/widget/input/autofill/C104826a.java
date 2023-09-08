package com.tencent.p014mm.plugin.appbrand.widget.input.autofill;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.widget.input.autofill.C104846k;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import rt0.C110652b;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.a */
public final class C104826a extends ArrayAdapter<C110652b> implements C104845j {

    /* renamed from: d */
    public final LayoutInflater f311327d;

    /* renamed from: e */
    public C104829b f311328e;

    /* renamed from: f */
    public C104846k f311329f;

    /* renamed from: g */
    public boolean f311330g = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.a$a */
    public class C104827a implements PopupWindow.OnDismissListener {
        public C104827a() {
        }

        public void onDismiss() {
            C104826a aVar = C104826a.this;
            C104846k kVar = aVar.f311329f;
            if (kVar != null && !aVar.f311330g) {
                kVar.mo148734a("", C104846k.C104847a.CANCEL);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.a$b */
    public final class C104828b implements View.OnClickListener {

        /* renamed from: d */
        public View f311332d;

        /* renamed from: e */
        public TextView f311333e;

        /* renamed from: f */
        public TextView f311334f;

        /* renamed from: g */
        public View f311335g;

        /* renamed from: h */
        public View f311336h;

        /* renamed from: i */
        public C110652b f311337i;

        public C104828b(View view) {
            this.f311332d = view;
            this.f311333e = (TextView) view.findViewById(C0966R.C0970id.knx);
            this.f311334f = (TextView) view.findViewById(C0966R.C0970id.br8);
            this.f311335g = view.findViewById(C0966R.C0970id.be4);
            this.f311336h = view.findViewById(C0966R.C0970id.c7p);
            view.setBackgroundResource(C0966R.C0969drawable.am7);
            view.setOnClickListener(this);
            this.f311335g.setOnClickListener(this);
        }

        public void onClick(View view) {
            C104846k kVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillAdapter$AutoFillViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f311337i != null) {
                if (view.getId() == C0966R.C0970id.be4) {
                    C104826a.this.remove(this.f311337i);
                    C104846k kVar2 = C104826a.this.f311329f;
                    if (kVar2 != null) {
                        kVar2.mo148734a(this.f311337i.f331013a, C104846k.C104847a.DELETE);
                    }
                } else if (view == this.f311332d && (kVar = C104826a.this.f311329f) != null) {
                    C110652b bVar = this.f311337i;
                    if (bVar != null) {
                        kVar.mo148734a(bVar.f331013a, C104846k.C104847a.SELECT);
                    }
                    C104826a aVar = C104826a.this;
                    aVar.f311330g = true;
                    C104829b bVar2 = aVar.f311328e;
                    if (bVar2 != null) {
                        bVar2.f311339a.getView().clearFocus();
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillAdapter$AutoFillViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C104826a(Context context, List<C110652b> list) {
        super(context, C0966R.C0971layout.f6420ed, list);
        this.f311327d = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public void mo148716a(C104829b bVar) {
        this.f311328e.f311340b.f197357b.setOnDismissListener((PopupWindow.OnDismissListener) null);
        this.f311328e = null;
    }

    /* renamed from: b */
    public void mo148717b(C104829b bVar) {
        this.f311328e = bVar;
        bVar.f311340b.f197357b.setOnDismissListener(new C104827a());
    }

    public Filter getFilter() {
        return super.getFilter();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f311327d.inflate(C0966R.C0971layout.f6420ed, viewGroup, false);
        }
        C104828b bVar = (C104828b) view.getTag();
        if (bVar == null) {
            bVar = new C104828b(view);
            view.setTag(bVar);
        }
        C110652b bVar2 = (C110652b) getItem(i);
        bVar.f311337i = bVar2;
        bVar.f311333e.setText(bVar2.f331014b);
        bVar.f311334f.setText(bVar2.f331015c);
        int i2 = 8;
        bVar.f311334f.setVisibility(Util.isNullOrNil(bVar2.f331015c) ? 8 : 0);
        View view2 = bVar.f311336h;
        if (i != getCount() - 1) {
            i2 = 0;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return view;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
