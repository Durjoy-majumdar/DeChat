package com.tencent.p014mm.p136ui.widget.picker;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6432f3;
import com.tencent.wxmm.v2helper;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import qf0.C22082c;

/* renamed from: com.tencent.mm.ui.widget.picker.j */
public class C7045j implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: A */
    public boolean f24853A = false;

    /* renamed from: B */
    public C7054i f24854B;

    /* renamed from: C */
    public C7057l f24855C;

    /* renamed from: d */
    public C104428a f24856d;

    /* renamed from: e */
    public View f24857e;

    /* renamed from: f */
    public Context f24858f;

    /* renamed from: g */
    public int f24859g;

    /* renamed from: h */
    public BottomSheetBehavior f24860h;

    /* renamed from: i */
    public Button f24861i;

    /* renamed from: j */
    public Button f24862j;

    /* renamed from: n */
    public String[] f24863n;

    /* renamed from: o */
    public ArrayList<List<String>> f24864o = null;

    /* renamed from: p */
    public ArrayList<List<String>> f24865p = null;

    /* renamed from: q */
    public CustomOptionPickNew f24866q;

    /* renamed from: r */
    public CustomOptionPickNew f24867r;

    /* renamed from: s */
    public CustomOptionPickNew f24868s;

    /* renamed from: t */
    public C7056k f24869t;

    /* renamed from: u */
    public C7055j f24870u;

    /* renamed from: v */
    public LinearLayout f24871v;

    /* renamed from: w */
    public LinearLayout f24872w;

    /* renamed from: x */
    public LinearLayout f24873x;

    /* renamed from: y */
    public LinearLayout f24874y;

    /* renamed from: z */
    public LinearLayout f24875z;

    /* renamed from: com.tencent.mm.ui.widget.picker.j$a */
    public class C7046a implements C22082c {
        public C7046a() {
        }

        /* renamed from: a */
        public void mo8111a(int i) {
            C7054i iVar = C7045j.this.f24854B;
            if (iVar != null) {
                iVar.mo7435a(i);
            }
            C7045j jVar = C7045j.this;
            if (!jVar.f24853A) {
                jVar.f24867r.setOptionsArray(jVar.mo8098a(i));
                C7045j jVar2 = C7045j.this;
                if (jVar2.f24865p != null && jVar2.f24868s != null) {
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        i2 += C7045j.this.f24864o.get(i3).size();
                    }
                    int value = i2 + C7045j.this.f24867r.getValue();
                    C7045j jVar3 = C7045j.this;
                    jVar3.f24868s.setOptionsArray(jVar3.mo8100c(value));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.picker.j$b */
    public class C7047b implements C22082c {
        public C7047b() {
        }

        /* renamed from: a */
        public void mo8111a(int i) {
            C7054i iVar = C7045j.this.f24854B;
            if (iVar != null) {
                iVar.mo7435a(i);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.picker.j$c */
    public class C7048c implements C22082c {
        public C7048c() {
        }

        /* renamed from: a */
        public void mo8111a(int i) {
            C7057l lVar = C7045j.this.f24855C;
            if (lVar != null) {
                ((C6432f3.C6434b) lVar).mo7436a(i);
            }
            C7045j jVar = C7045j.this;
            if (!jVar.f24853A) {
                int value = jVar.f24866q.getValue();
                int i2 = 0;
                for (int i3 = 0; i3 < value; i3++) {
                    i2 += C7045j.this.f24864o.get(i3).size();
                }
                int i4 = i2 + i;
                C7045j jVar2 = C7045j.this;
                jVar2.f24868s.setOptionsArray(jVar2.mo8100c(i4));
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.picker.j$d */
    public class C7049d implements C22082c {
        public C7049d() {
        }

        /* renamed from: a */
        public void mo8111a(int i) {
            C7057l lVar = C7045j.this.f24855C;
            if (lVar != null) {
                ((C6432f3.C6434b) lVar).mo7436a(i);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.picker.j$e */
    public class C7050e implements View.OnClickListener {
        public C7050e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/picker/MMOptionPicker$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7045j jVar = C7045j.this;
            CustomOptionPickNew customOptionPickNew = jVar.f24866q;
            String str = null;
            String a = customOptionPickNew == null ? null : customOptionPickNew.mo26472a();
            CustomOptionPickNew customOptionPickNew2 = C7045j.this.f24867r;
            String a2 = customOptionPickNew2 == null ? null : customOptionPickNew2.mo26472a();
            C7056k kVar = jVar.f24869t;
            if (kVar != null) {
                kVar.onResult(true, a, a2);
            }
            C7045j jVar2 = C7045j.this;
            CustomOptionPickNew customOptionPickNew3 = jVar2.f24866q;
            String a3 = customOptionPickNew3 == null ? null : customOptionPickNew3.mo26472a();
            CustomOptionPickNew customOptionPickNew4 = C7045j.this.f24867r;
            String a4 = customOptionPickNew4 == null ? null : customOptionPickNew4.mo26472a();
            CustomOptionPickNew customOptionPickNew5 = C7045j.this.f24868s;
            if (customOptionPickNew5 != null) {
                str = customOptionPickNew5.mo26472a();
            }
            C7055j jVar3 = jVar2.f24870u;
            if (jVar3 != null) {
                jVar3.mo494a(true, a3, a4, str);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/picker/MMOptionPicker$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.picker.j$f */
    public class C7051f implements View.OnClickListener {
        public C7051f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/picker/MMOptionPicker$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7056k kVar = C7045j.this.f24869t;
            if (kVar != null) {
                kVar.onResult(false, null, null);
            }
            C7055j jVar = C7045j.this.f24870u;
            if (jVar != null) {
                jVar.mo494a(false, null, null, null);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/picker/MMOptionPicker$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.picker.j$g */
    public class C7052g implements View.OnClickListener {
        public C7052g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/picker/MMOptionPicker$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7045j jVar = C7045j.this;
            CustomOptionPickNew customOptionPickNew = jVar.f24866q;
            String str = null;
            String a = customOptionPickNew == null ? null : customOptionPickNew.mo26472a();
            CustomOptionPickNew customOptionPickNew2 = C7045j.this.f24867r;
            String a2 = customOptionPickNew2 == null ? null : customOptionPickNew2.mo26472a();
            C7056k kVar = jVar.f24869t;
            if (kVar != null) {
                kVar.onResult(true, a, a2);
            }
            C7045j jVar2 = C7045j.this;
            CustomOptionPickNew customOptionPickNew3 = jVar2.f24866q;
            String a3 = customOptionPickNew3 == null ? null : customOptionPickNew3.mo26472a();
            CustomOptionPickNew customOptionPickNew4 = C7045j.this.f24867r;
            String a4 = customOptionPickNew4 == null ? null : customOptionPickNew4.mo26472a();
            CustomOptionPickNew customOptionPickNew5 = C7045j.this.f24868s;
            if (customOptionPickNew5 != null) {
                str = customOptionPickNew5.mo26472a();
            }
            C7055j jVar3 = jVar2.f24870u;
            if (jVar3 != null) {
                jVar3.mo494a(true, a3, a4, str);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/picker/MMOptionPicker$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.picker.j$h */
    public class C7053h implements DialogInterface.OnDismissListener {
        public C7053h() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            C7045j jVar = C7045j.this;
            jVar.f24856d = null;
            C7056k kVar = jVar.f24869t;
            if (kVar != null) {
                kVar.onResult(false, null, null);
            }
            C7055j jVar2 = C7045j.this.f24870u;
            if (jVar2 != null) {
                jVar2.mo494a(false, null, null, null);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.picker.j$i */
    public interface C7054i {
        /* renamed from: a */
        void mo7435a(int i);
    }

    /* renamed from: com.tencent.mm.ui.widget.picker.j$j */
    public interface C7055j<T> {
        /* renamed from: a */
        void mo494a(boolean z, T t, T t2, T t3);
    }

    /* renamed from: com.tencent.mm.ui.widget.picker.j$k */
    public interface C7056k<T> {
        void onResult(boolean z, T t, T t2);
    }

    /* renamed from: com.tencent.mm.ui.widget.picker.j$l */
    public interface C7057l {
    }

    public C7045j(Context context, String[] strArr) {
        this.f24858f = context;
        this.f24863n = strArr;
        mo8102e();
    }

    /* renamed from: a */
    public final String[] mo8098a(int i) {
        ArrayList arrayList;
        ArrayList<List<String>> arrayList2 = this.f24864o;
        if (arrayList2 == null || (arrayList = (ArrayList) arrayList2.get(i)) == null) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: b */
    public int mo8099b() {
        CustomOptionPickNew customOptionPickNew = this.f24866q;
        if (customOptionPickNew != null) {
            return customOptionPickNew.getValue();
        }
        return 0;
    }

    /* renamed from: c */
    public final String[] mo8100c(int i) {
        ArrayList arrayList;
        ArrayList<List<String>> arrayList2 = this.f24865p;
        if (arrayList2 == null || (arrayList = (ArrayList) arrayList2.get(i)) == null) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: d */
    public void mo8101d() {
        C104428a aVar = this.f24856d;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: e */
    public final void mo8102e() {
        this.f24856d = new C104428a(this.f24858f, 0);
        View inflate = View.inflate(this.f24858f, C0966R.C0971layout.bcv, (ViewGroup) null);
        this.f24857e = inflate;
        this.f24874y = (LinearLayout) inflate.findViewById(C0966R.C0970id.hnf);
        this.f24875z = (LinearLayout) this.f24857e.findViewById(C0966R.C0970id.hne);
        this.f24871v = (LinearLayout) this.f24857e.findViewById(C0966R.C0970id.hnd);
        CustomOptionPickNew customOptionPickNew = new CustomOptionPickNew(this.f24858f);
        this.f24866q = customOptionPickNew;
        customOptionPickNew.setOptionsArray(this.f24863n);
        this.f24871v.removeAllViews();
        this.f24871v.setGravity(17);
        this.f24871v.addView(this.f24866q.getView(), new LinearLayout.LayoutParams(-2, -1));
        this.f24872w = (LinearLayout) this.f24857e.findViewById(C0966R.C0970id.hng);
        this.f24873x = (LinearLayout) this.f24857e.findViewById(C0966R.C0970id.hni);
        if (this.f24864o != null) {
            this.f24872w.setVisibility(0);
            this.f24867r = new CustomOptionPickNew(this.f24858f);
            this.f24872w.removeAllViews();
            this.f24872w.setGravity(17);
            this.f24872w.addView(this.f24867r.getView(), new LinearLayout.LayoutParams(-2, -1));
            this.f24867r.setOptionsArray(mo8098a(this.f24866q.getValue()));
            this.f24866q.setOnValueChangedListener(new C7046a());
        } else {
            this.f24872w.setVisibility(8);
            CustomOptionPickNew customOptionPickNew2 = this.f24866q;
            if (customOptionPickNew2 != null) {
                customOptionPickNew2.setOnValueChangedListener(new C7047b());
            }
        }
        if (this.f24865p != null) {
            this.f24873x.setVisibility(0);
            this.f24868s = new CustomOptionPickNew(this.f24858f);
            this.f24873x.removeAllViews();
            this.f24873x.setGravity(17);
            this.f24873x.addView(this.f24868s.getView(), new LinearLayout.LayoutParams(-2, -1));
            this.f24868s.setOptionsArray(mo8100c(this.f24867r.getValue()));
            this.f24867r.setOnValueChangedListener(new C7048c());
        } else {
            this.f24873x.setVisibility(8);
            CustomOptionPickNew customOptionPickNew3 = this.f24867r;
            if (customOptionPickNew3 != null) {
                customOptionPickNew3.setOnValueChangedListener(new C7049d());
            }
        }
        Button button = (Button) this.f24857e.findViewById(C0966R.C0970id.hll);
        this.f24861i = button;
        button.setOnClickListener(new C7050e());
        Button button2 = (Button) this.f24857e.findViewById(C0966R.C0970id.apy);
        this.f24862j = button2;
        button2.setOnClickListener(new C7051f());
        ((Button) this.f24857e.findViewById(C0966R.C0970id.amg)).setOnClickListener(new C7052g());
        this.f24856d.setContentView(this.f24857e);
        this.f24859g = C74942w4.m89784a(this.f24858f, v2helper.EMethodSetPlayerPreCorrectCofOn);
        BottomSheetBehavior y = BottomSheetBehavior.m139527y((View) this.f24857e.getParent());
        this.f24860h = y;
        if (y != null) {
            y.mo146383A(this.f24859g);
            this.f24860h.f309230p = false;
        }
        this.f24856d.setOnDismissListener(new C7053h());
    }

    /* renamed from: f */
    public boolean mo8103f() {
        return this.f24868s != null;
    }

    /* renamed from: g */
    public void mo8104g(View view) {
        LinearLayout linearLayout = this.f24874y;
        if (linearLayout == null) {
            return;
        }
        if (view == null) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        this.f24874y.removeAllViews();
        this.f24874y.setGravity(17);
        this.f24874y.addView(view, new LinearLayout.LayoutParams(-1, -2));
    }

    /* renamed from: h */
    public void mo8105h(int i) {
        Button button = this.f24861i;
        if (button != null) {
            button.setTextColor(this.f24858f.getResources().getColor(C0966R.color.f3257l0));
            if (i == 0) {
                this.f24861i.setBackgroundResource(C0966R.C0969drawable.f4653j6);
            } else if (i == 1) {
                this.f24861i.setBackgroundResource(C0966R.C0969drawable.f4659ja);
                this.f24861i.setTextColor(this.f24858f.getResources().getColor(C0966R.color.al7));
            } else if (i == 2) {
                this.f24861i.setBackgroundResource(C0966R.C0969drawable.f4663je);
            }
        }
    }

    /* renamed from: i */
    public void mo8106i(int i) {
        CustomOptionPickNew customOptionPickNew = this.f24866q;
        if (customOptionPickNew != null) {
            customOptionPickNew.setValue(i);
            this.f24866q.mo26473c(i);
            CustomOptionPickNew customOptionPickNew2 = this.f24867r;
            if (customOptionPickNew2 != null && this.f24864o != null) {
                customOptionPickNew2.setOptionsArray(mo8098a(i));
            }
        }
    }

    /* renamed from: j */
    public void mo8107j(int i, int i2) {
        CustomOptionPickNew customOptionPickNew = this.f24866q;
        if (customOptionPickNew != null && this.f24867r != null) {
            customOptionPickNew.setValue(i);
            this.f24866q.mo26473c(i);
            this.f24867r.setOptionsArray(mo8098a(i));
            this.f24867r.setValue(i2);
            this.f24867r.mo26473c(i2);
            this.f24867r.invalidate();
        }
    }

    /* renamed from: k */
    public void mo8108k(int i, int i2, int i3) {
        CustomOptionPickNew customOptionPickNew = this.f24866q;
        if (customOptionPickNew != null && this.f24867r != null && this.f24868s != null) {
            customOptionPickNew.setValue(i);
            this.f24866q.mo26473c(i);
            this.f24867r.setOptionsArray(mo8098a(i));
            this.f24867r.setValue(i2);
            this.f24867r.mo26473c(i2);
            this.f24867r.invalidate();
            this.f24868s.setOptionsArray(mo8100c(i2));
            this.f24868s.setValue(i3);
            this.f24868s.mo26473c(i3);
            this.f24868s.invalidate();
        }
    }

    /* renamed from: l */
    public void mo8109l() {
        C104428a aVar = this.f24856d;
        if (aVar != null) {
            aVar.show();
        }
    }

    public void onGlobalLayout() {
    }

    public C7045j(Context context, ArrayList<String> arrayList) {
        this.f24858f = context;
        if (arrayList != null) {
            this.f24863n = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        mo8102e();
    }

    public C7045j(Context context, ArrayList<String> arrayList, ArrayList<List<String>> arrayList2) {
        this.f24858f = context;
        if (arrayList != null) {
            this.f24863n = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.f24864o = arrayList2;
        mo8102e();
    }

    public C7045j(Context context, ArrayList<String> arrayList, ArrayList<List<String>> arrayList2, ArrayList<List<String>> arrayList3, boolean z) {
        this.f24858f = context;
        if (arrayList != null) {
            this.f24863n = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.f24864o = arrayList2;
        this.f24865p = arrayList3;
        this.f24853A = z;
        mo8102e();
    }
}
