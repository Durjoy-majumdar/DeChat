package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.z0 */
public final class C4231z0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderChooseOriginalView f18545d;

    /* renamed from: com.tencent.mm.plugin.finder.view.z0$a */
    public static final class C4232a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderChooseOriginalView f18546d;

        /* renamed from: e */
        public final /* synthetic */ C4191v0 f18547e;

        public C4232a(FinderChooseOriginalView finderChooseOriginalView, C4191v0 v0Var) {
            this.f18546d = finderChooseOriginalView;
            this.f18547e = v0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f18546d.setOriginalFlag(2);
            this.f18547e.mo5072g();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.z0$b */
    public static final class C4233b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderChooseOriginalView f18548d;

        /* renamed from: e */
        public final /* synthetic */ C4191v0 f18549e;

        public C4233b(FinderChooseOriginalView finderChooseOriginalView, C4191v0 v0Var) {
            this.f18548d = finderChooseOriginalView;
            this.f18549e = v0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f18548d.setOriginalFlag(1);
            this.f18549e.mo5072g();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.z0$c */
    public static final class C4234c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderChooseOriginalView f18550d;

        /* renamed from: e */
        public final /* synthetic */ C4191v0 f18551e;

        /* renamed from: com.tencent.mm.plugin.finder.view.z0$c$a */
        public static final class C4235a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C4191v0 f18552d;

            public C4235a(C4191v0 v0Var) {
                this.f18552d = v0Var;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1$1$3$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f18552d.mo5072g();
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1$1$3$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C4234c(FinderChooseOriginalView finderChooseOriginalView, C4191v0 v0Var) {
            this.f18550d = finderChooseOriginalView;
            this.f18551e = v0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C4191v0 v0Var = new C4191v0(this.f18550d.getContext());
            v0Var.mo5070e(C0966R.C0971layout.amv);
            v0Var.f18463f.findViewById(C0966R.C0970id.beb).setOnClickListener(new C4235a(v0Var));
            v0Var.mo5073h();
            this.f18551e.mo5072g();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C4231z0(FinderChooseOriginalView finderChooseOriginalView) {
        this.f18545d = finderChooseOriginalView;
    }

    /* JADX WARNING: type inference failed for: r15v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r15v2 */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0172, code lost:
        r2 = r2.field_originalInfo;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r18) {
        /*
            r17 = this;
            r6 = r17
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r18
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r17
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.finder.view.v0 r0 = new com.tencent.mm.plugin.finder.view.v0
            com.tencent.mm.plugin.finder.view.FinderChooseOriginalView r1 = r6.f18545d
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            com.tencent.mm.plugin.finder.view.FinderChooseOriginalView r1 = r6.f18545d
            r2 = 2131495391(0x7f0c09df, float:1.8614317E38)
            r0.mo5070e(r2)
            android.view.View r2 = r0.f18463f
            r3 = 2131310669(0x7f09384d, float:1.8239657E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.text.TextPaint r2 = r2.getPaint()
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r2, r3)
            android.view.View r2 = r0.f18463f
            r3 = 2131310670(0x7f09384e, float:1.8239659E38)
            android.view.View r2 = r2.findViewById(r3)
            android.view.View r3 = r0.f18463f
            r4 = 2131310668(0x7f09384c, float:1.8239655E38)
            android.view.View r3 = r3.findViewById(r4)
            int r4 = r1.getFlag()
            r5 = 8
            r15 = 1
            r14 = 0
            if (r4 != r15) goto L_0x00e7
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r4.mo10233c(r7)
            java.lang.Object[] r8 = r4.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1"
            java.lang.String r10 = "onClick"
            java.lang.String r11 = "(Landroid/view/View;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r7 = r2
            r15 = 0
            r14 = r16
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r4 = r4.mo10231a(r15)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1"
            java.lang.String r9 = "onClick"
            java.lang.String r10 = "(Landroid/view/View;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r2.mo10233c(r4)
            java.lang.Object[] r8 = r2.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1"
            java.lang.String r10 = "onClick"
            java.lang.String r11 = "(Landroid/view/View;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r3
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r2 = r2.mo10231a(r15)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3.setVisibility(r2)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1"
            java.lang.String r9 = "onClick"
            java.lang.String r10 = "(Landroid/view/View;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0166
        L_0x00e7:
            r15 = 0
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r5)
            java.lang.Object[] r8 = r4.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1"
            java.lang.String r10 = "onClick"
            java.lang.String r11 = "(Landroid/view/View;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r2
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r4 = r4.mo10231a(r15)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1"
            java.lang.String r9 = "onClick"
            java.lang.String r10 = "(Landroid/view/View;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r2.mo10233c(r4)
            java.lang.Object[] r8 = r2.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1"
            java.lang.String r10 = "onClick"
            java.lang.String r11 = "(Landroid/view/View;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r3
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r2 = r2.mo10231a(r15)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3.setVisibility(r2)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1"
            java.lang.String r9 = "onClick"
            java.lang.String r10 = "(Landroid/view/View;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
        L_0x0166:
            er1.t1 r2 = er1.C7879t1.f26497a
            zc1.b r2 = zc1.C66785b.f191882e
            r3 = 0
            r4 = 1
            bd1.b r2 = zc1.C66783a.C66784a.m78800c(r2, r15, r4, r3)
            if (r2 == 0) goto L_0x017a
            te3.jg1 r2 = r2.field_originalInfo
            if (r2 == 0) goto L_0x017a
            int r2 = r2.f136104d
            r14 = r2
            goto L_0x017b
        L_0x017a:
            r14 = 1
        L_0x017b:
            if (r14 >= 0) goto L_0x017e
            r14 = 0
        L_0x017e:
            android.view.View r2 = r0.f18463f
            r3 = 2131310301(0x7f0936dd, float:1.823891E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r3 = r1.getContext()
            r4 = 2131829398(0x7f112296, float:1.9291764E38)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r7 = java.lang.String.valueOf(r14)
            r5[r15] = r7
            java.lang.String r3 = r3.getString(r4, r5)
            r2.setText(r3)
            r2 = 2131310656(0x7f093840, float:1.823963E38)
            if (r14 <= 0) goto L_0x01b4
            android.view.View r3 = r0.f18463f
            android.view.View r2 = r3.findViewById(r2)
            com.tencent.mm.plugin.finder.view.z0$a r3 = new com.tencent.mm.plugin.finder.view.z0$a
            r3.<init>(r1, r0)
            r2.setOnClickListener(r3)
            goto L_0x01da
        L_0x01b4:
            android.view.View r3 = r0.f18463f
            android.view.View r2 = r3.findViewById(r2)
            r2.setClickable(r15)
            android.view.View r2 = r0.f18463f
            r3 = 2131310302(0x7f0936de, float:1.8238912E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r3 = r1.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131099712(0x7f060040, float:1.7811785E38)
            int r3 = r3.getColor(r4)
            r2.setTextColor(r3)
        L_0x01da:
            android.view.View r2 = r0.f18463f
            r3 = 2131310671(0x7f09384f, float:1.823966E38)
            android.view.View r2 = r2.findViewById(r3)
            com.tencent.mm.plugin.finder.view.z0$b r3 = new com.tencent.mm.plugin.finder.view.z0$b
            r3.<init>(r1, r0)
            r2.setOnClickListener(r3)
            android.view.View r2 = r0.f18463f
            r3 = 2131310667(0x7f09384b, float:1.8239653E38)
            android.view.View r2 = r2.findViewById(r3)
            com.tencent.mm.plugin.finder.view.z0$c r3 = new com.tencent.mm.plugin.finder.view.z0$c
            r3.<init>(r1, r0)
            r2.setOnClickListener(r3)
            r0.mo5073h()
            java.lang.String r0 = "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r6, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.C4231z0.onClick(android.view.View):void");
    }
}
