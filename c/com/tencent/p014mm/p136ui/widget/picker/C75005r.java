package com.tencent.p014mm.p136ui.widget.picker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76875f0;

/* renamed from: com.tencent.mm.ui.widget.picker.r */
public class C75005r {

    /* renamed from: a */
    public C104428a f220686a = new C104428a(this.f220688c, 0);

    /* renamed from: b */
    public View f220687b;

    /* renamed from: c */
    public Context f220688c;

    /* renamed from: d */
    public ListView f220689d;

    /* renamed from: e */
    public View f220690e;

    /* renamed from: f */
    public TextView f220691f;

    /* renamed from: g */
    public Button f220692g;

    /* renamed from: h */
    public Button f220693h;

    /* renamed from: i */
    public int f220694i;

    /* renamed from: j */
    public BottomSheetBehavior f220695j;

    /* renamed from: k */
    public C11184p0 f220696k;

    /* renamed from: l */
    public C76874e0 f220697l;

    /* renamed from: m */
    public ArrayList<Integer> f220698m;

    /* renamed from: n */
    public C75006a f220699n;

    /* renamed from: o */
    public C75009b f220700o;

    /* renamed from: com.tencent.mm.ui.widget.picker.r$a */
    public class C75006a extends BaseAdapter {

        /* renamed from: d */
        public Context f220701d;

        /* renamed from: e */
        public HashMap<Integer, Boolean> f220702e = new HashMap<>();

        /* renamed from: f */
        public ArrayList<Integer> f220703f;

        /* renamed from: com.tencent.mm.ui.widget.picker.r$a$a */
        public class C75007a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ int f220705d;

            /* renamed from: e */
            public final /* synthetic */ C76875f0 f220706e;

            public C75007a(int i, C76875f0 f0Var) {
                this.f220705d = i;
                this.f220706e = f0Var;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/widget/picker/MultiPicker$ListViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C75005r rVar = C75005r.this;
                C11184p0 p0Var = rVar.f220696k;
                if (p0Var != null) {
                    p0Var.onMMMenuItemSelected(rVar.f220697l.getItem(this.f220705d), this.f220705d);
                }
                if (this.f220706e.f224722q) {
                    C117292a.m165361g(this, "com/tencent/mm/ui/widget/picker/MultiPicker$ListViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                if (C75006a.this.f220702e.get(Integer.valueOf(this.f220705d)).booleanValue()) {
                    C75006a.this.f220702e.put(Integer.valueOf(this.f220705d), Boolean.FALSE);
                } else {
                    C75006a.this.f220702e.put(Integer.valueOf(this.f220705d), Boolean.TRUE);
                }
                C75006a aVar = C75006a.this;
                aVar.f220702e = aVar.f220702e;
                aVar.notifyDataSetChanged();
                C117292a.m165361g(this, "com/tencent/mm/ui/widget/picker/MultiPicker$ListViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.ui.widget.picker.r$a$b */
        public class C75008b {

            /* renamed from: a */
            public TextView f220708a;

            /* renamed from: b */
            public TextView f220709b;

            /* renamed from: c */
            public CheckBox f220710c;

            /* renamed from: d */
            public LinearLayout f220711d;

            public C75008b(C75006a aVar) {
            }
        }

        public C75006a(Context context) {
            this.f220701d = context;
        }

        /* renamed from: a */
        public ArrayList<Integer> mo104572a() {
            if (this.f220702e == null) {
                return null;
            }
            this.f220703f = new ArrayList<>();
            for (int i = 0; i < getCount(); i++) {
                if (this.f220702e.get(Integer.valueOf(i)).booleanValue()) {
                    this.f220703f.add(Integer.valueOf(i));
                }
            }
            return this.f220703f;
        }

        public int getCount() {
            return C75005r.this.f220697l.size();
        }

        public Object getItem(int i) {
            return ((ArrayList) C75005r.this.f220697l.f224704d).get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C75008b bVar;
            C76875f0 f0Var = (C76875f0) ((ArrayList) C75005r.this.f220697l.f224704d).get(i);
            LayoutInflater from = LayoutInflater.from(this.f220701d);
            if (view == null) {
                view = from.inflate(C0966R.C0971layout.bct, (ViewGroup) null);
                bVar = new C75008b(this);
                bVar.f220711d = (LinearLayout) view.findViewById(C0966R.C0970id.f358471fb3);
                bVar.f220710c = (CheckBox) view.findViewById(C0966R.C0970id.fa5);
                bVar.f220708a = (TextView) view.findViewById(C0966R.C0970id.f358474fc2);
                bVar.f220709b = (TextView) view.findViewById(C0966R.C0970id.faa);
                view.setTag(bVar);
            } else {
                bVar = (C75008b) view.getTag();
            }
            bVar.f220708a.setText(f0Var.getTitle());
            bVar.f220711d.setOnClickListener(new C75007a(i, f0Var));
            if (bVar.f220709b != null) {
                CharSequence charSequence = f0Var.f224721p;
                if (charSequence == null || charSequence.length() <= 0) {
                    bVar.f220709b.setVisibility(8);
                } else {
                    bVar.f220709b.setVisibility(0);
                    bVar.f220709b.setText(f0Var.f224721p);
                }
            }
            if (f0Var.f224722q) {
                bVar.f220708a.setTextColor(C75005r.this.f220688c.getResources().getColor(C0966R.color.f3148gx));
                bVar.f220709b.setTextColor(C75005r.this.f220688c.getResources().getColor(C0966R.color.f3148gx));
                bVar.f220710c.setChecked(this.f220702e.get(Integer.valueOf(i)).booleanValue());
                bVar.f220710c.setEnabled(false);
            } else {
                bVar.f220708a.setTextColor(C75005r.this.f220688c.getResources().getColor(C0966R.color.f3147gw));
                bVar.f220709b.setTextColor(C75005r.this.f220688c.getResources().getColor(C0966R.color.f3149gy));
                bVar.f220710c.setChecked(this.f220702e.get(Integer.valueOf(i)).booleanValue());
                bVar.f220710c.setEnabled(true);
            }
            return view;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.picker.r$b */
    public interface C75009b {
        /* renamed from: a */
        void mo97346a(boolean z, ArrayList<Integer> arrayList);
    }

    public C75005r(Context context) {
        this.f220688c = context;
        this.f220697l = new C76874e0(context);
        View inflate = View.inflate(this.f220688c, C0966R.C0971layout.bcu, (ViewGroup) null);
        this.f220687b = inflate;
        this.f220689d = (ListView) inflate.findViewById(C0966R.C0970id.h36);
        this.f220692g = (Button) this.f220687b.findViewById(C0966R.C0970id.hll);
        this.f220693h = (Button) this.f220687b.findViewById(C0966R.C0970id.apy);
        this.f220690e = this.f220687b.findViewById(C0966R.C0970id.euv);
        this.f220691f = (TextView) this.f220687b.findViewById(C0966R.C0970id.evd);
        this.f220686a.setContentView(this.f220687b);
        this.f220694i = C74942w4.m89786c(this.f220688c, C0966R.dimen.f3638w) + C74942w4.m89786c(this.f220688c, C0966R.dimen.f3639x);
        BottomSheetBehavior y = BottomSheetBehavior.m139527y((View) this.f220687b.getParent());
        this.f220695j = y;
        if (y != null) {
            y.mo146383A(this.f220694i);
            this.f220695j.f309230p = false;
        }
        this.f220686a.setOnDismissListener(new C75002o(this));
    }
}
