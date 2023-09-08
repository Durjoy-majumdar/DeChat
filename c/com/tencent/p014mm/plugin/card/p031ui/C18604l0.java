package com.tencent.p014mm.plugin.card.p031ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Util;
import hz0.C21034b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import wz0.C22945n;
import wz0.C53263p;

/* renamed from: com.tencent.mm.plugin.card.ui.l0 */
public class C18604l0 extends BaseAdapter {

    /* renamed from: d */
    public List<C21034b> f51947d = new ArrayList();

    /* renamed from: e */
    public Context f51948e;

    /* renamed from: f */
    public boolean f51949f = false;

    /* renamed from: g */
    public boolean f51950g = false;

    /* renamed from: com.tencent.mm.plugin.card.ui.l0$c */
    public class C18605c {

        /* renamed from: a */
        public TextView f51951a;

        /* renamed from: b */
        public TextView f51952b;

        /* renamed from: c */
        public TextView f51953c;

        /* renamed from: d */
        public ImageView f51954d;

        /* renamed from: e */
        public View f51955e;

        /* renamed from: f */
        public CheckBox f51956f;

        /* renamed from: g */
        public WeImageView f51957g;

        /* renamed from: h */
        public View f51958h;

        public C18605c(C18604l0 l0Var, C18606a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.l0$a */
    public class C18606a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.card.ui.l0$a$a */
        public class C18607a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ String f51960d;

            public C18607a(String str) {
                this.f51960d = str;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setFlags(268435456);
                intent.setData(Uri.parse("tel:" + this.f51960d));
                Context context = C18604l0.this.f51948e;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CellAdapter$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/card/ui/CellAdapter$1$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }

        public C18606a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CellAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String str = (String) view.getTag();
            if (!TextUtils.isEmpty(str)) {
                if (str.contains(";")) {
                    str = str.substring(0, str.indexOf(";"));
                }
                String str2 = str;
                Context context = C18604l0.this.f51948e;
                C76879j.m92717K(context, true, str2, "", context.getString(C0966R.string.awn), C18604l0.this.f51948e.getString(C0966R.string.bj_), new C18607a(str2), (DialogInterface.OnClickListener) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CellAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.l0$b */
    public class C18608b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C21034b f51962d;

        public C18608b(C18604l0 l0Var, C21034b bVar) {
            this.f51962d = bVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CellAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (((CheckBox) view).isChecked()) {
                this.f51962d.f59504w = true;
            } else {
                this.f51962d.f59504w = false;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CellAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C18604l0(Context context) {
        this.f51948e = context;
    }

    /* renamed from: a */
    public final void mo23410a(View view, boolean z, boolean z2) {
        Rect rect = new Rect();
        rect.left = view.getPaddingLeft();
        rect.right = view.getPaddingRight();
        rect.top = view.getPaddingTop();
        rect.bottom = view.getPaddingBottom();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (z) {
            view.setBackgroundResource(C0966R.C0969drawable.ags);
        } else {
            view.setBackgroundResource(z2 ? C0966R.C0969drawable.c4v : C0966R.C0969drawable.bcr);
        }
        view.setLayoutParams(layoutParams);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public int getCount() {
        return ((ArrayList) this.f51947d).size();
    }

    public Object getItem(int i) {
        return (C21034b) ((ArrayList) this.f51947d).get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C18605c cVar;
        View view2;
        int i2 = i;
        C21034b bVar = (C21034b) ((ArrayList) this.f51947d).get(i2);
        if (bVar.f59501t != 2) {
            C18605c cVar2 = view != null ? (C18605c) view.getTag() : null;
            if (view == null || cVar2 == null) {
                view2 = View.inflate(this.f51948e, C0966R.C0971layout.f6692lx, (ViewGroup) null);
                cVar = new C18605c(this, (C18606a) null);
                cVar.f51951a = (TextView) view2.findViewById(C0966R.C0970id.f357619at2);
                cVar.f51952b = (TextView) view2.findViewById(C0966R.C0970id.f357618at1);
                cVar.f51953c = (TextView) view2.findViewById(C0966R.C0970id.asx);
                cVar.f51954d = (ImageView) view2.findViewById(C0966R.C0970id.asz);
                cVar.f51955e = view2.findViewById(C0966R.C0970id.asv);
                cVar.f51956f = (CheckBox) view2.findViewById(C0966R.C0970id.asy);
                cVar.f51957g = (WeImageView) view2.findViewById(C0966R.C0970id.asu);
                cVar.f51958h = view2.findViewById(C0966R.C0970id.f357620at3);
                if (this.f51950g) {
                    view2.findViewById(C0966R.C0970id.ave).setBackgroundResource(C0966R.C0969drawable.f4707kl);
                    cVar.f51957g.setIconColor(this.f51948e.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_3));
                }
                view2.setTag(cVar);
            } else {
                cVar = cVar2;
                view2 = view;
            }
            if (i2 == 0 && ((MMFragmentActivity) this.f51948e).findViewById(C0966R.C0970id.aty) == null) {
                View view3 = cVar.f51958h;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CellAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/card/ui/CellAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view5 = cVar.f51958h;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/CellAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/card/ui/CellAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            cVar.f51951a.setText(bVar.f64746d);
            if (bVar.f59503v) {
                cVar.f51956f.setVisibility(0);
                cVar.f51956f.setChecked(bVar.f59504w);
                cVar.f51956f.setOnClickListener(new C18608b(this, bVar));
            } else {
                cVar.f51956f.setVisibility(8);
            }
            if (TextUtils.isEmpty(bVar.f64747e)) {
                cVar.f51952b.setVisibility(4);
            } else {
                cVar.f51952b.setVisibility(0);
                cVar.f51952b.setText(bVar.f64747e);
            }
            boolean z = (bVar.f64750h & 1) > 0;
            int i3 = C0966R.color.UN_BW_0_Alpha_0_5;
            if (z) {
                cVar.f51951a.setGravity(17);
                cVar.f51951a.setTextColor(this.f51948e.getResources().getColor(C0966R.color.a1d));
                cVar.f51952b.setVisibility(8);
            } else {
                cVar.f51951a.setGravity(3);
                cVar.f51951a.setTextColor(this.f51948e.getResources().getColor(bVar.f59505x ? C0966R.color.a7f : C0966R.color.UN_BW_0_Alpha_0_9));
                if (bVar.f59505x) {
                    view2.setBackgroundColor(this.f51948e.getResources().getColor(C0966R.color.al6));
                } else {
                    view2.setBackgroundColor(this.f51948e.getResources().getColor(C0966R.color.UN_BW_97));
                    cVar.f51957g.setIconColor(this.f51948e.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_5));
                }
            }
            if (bVar.f59502u) {
                cVar.f51953c.setVisibility(0);
            } else {
                cVar.f51953c.setVisibility(8);
            }
            TextView textView = cVar.f51952b;
            Resources resources = this.f51948e.getResources();
            if (bVar.f59505x) {
                i3 = C0966R.color.f3288ma;
            }
            textView.setTextColor(resources.getColor(i3));
            if (!Util.isNullOrNil(bVar.f64753n)) {
                cVar.f51954d.setVisibility(0);
                C53263p.m59701b(cVar.f51954d, bVar.f64753n, C76577a.m92151b(this.f51948e, 20), C0966R.C0969drawable.f357296c91, false);
            } else {
                cVar.f51954d.setVisibility(8);
            }
            int i4 = i2 + 1;
            if (i4 < getCount()) {
                C21034b bVar2 = (C21034b) ((ArrayList) this.f51947d).get(i2);
                View view7 = cVar.f51955e;
                boolean z2 = !bVar.f59505x;
                if (bVar2 != null) {
                    mo23410a(view7, bVar2.f59502u, z2);
                }
                C21034b bVar3 = (C21034b) ((ArrayList) this.f51947d).get(i4);
                View view8 = cVar.f51955e;
                boolean z3 = !bVar.f59505x;
                if (bVar3 != null) {
                    mo23410a(view8, bVar3.f59502u, z3);
                }
            } else if (i4 == getCount()) {
                if (this.f51949f) {
                    mo23410a(cVar.f51955e, true, !bVar.f59505x);
                } else {
                    mo23410a(cVar.f51955e, false, !bVar.f59505x);
                }
            }
            return view2;
        }
        View inflate = View.inflate(this.f51948e, C0966R.C0971layout.f6691lw, (ViewGroup) null);
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.at6);
        TextView textView3 = (TextView) inflate.findViewById(C0966R.C0970id.at5);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.jja);
        if (this.f51950g) {
            inflate.setBackgroundResource(C0966R.C0969drawable.f4707kl);
        }
        if (!TextUtils.isEmpty(bVar.f59506y)) {
            linearLayout.setTag(bVar.f59506y);
            linearLayout.setOnClickListener(new C18606a());
            ((ImageView) inflate.findViewById(C0966R.C0970id.at4)).setBackgroundColor(C22945n.m27004d(bVar.f59507z));
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
        textView2.setText(bVar.f64746d);
        textView3.setText(bVar.f64747e);
        return inflate;
    }
}
