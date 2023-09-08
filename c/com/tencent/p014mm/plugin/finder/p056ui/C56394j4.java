package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jq3.C60896i;
import jq3.C60905o;
import nj3.C76879j;
import nj3.C76912y0;
import pe1.C35464c;
import qo3.C77407n;
import sx3.C110818d0;
import sx3.C64187h0;
import sx3.C64197v;

/* renamed from: com.tencent.mm.plugin.finder.ui.j4 */
public final class C56394j4 extends C60896i<C35464c<?>> {

    /* renamed from: e */
    public final SettingFragment f161227e;

    /* renamed from: com.tencent.mm.plugin.finder.ui.j4$a */
    public static final class C56395a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f161228d;

        /* renamed from: e */
        public final /* synthetic */ C56394j4 f161229e;

        public C56395a(C60905o oVar, C56394j4 j4Var) {
            this.f161228d = oVar;
            this.f161229e = j4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/SettingItemConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C35464c cVar = (C35464c) this.f161228d.f173503E;
            if (!cVar.mo60272j().isEmpty()) {
                C56394j4 j4Var = this.f161229e;
                C60905o oVar = this.f161228d;
                j4Var.getClass();
                List<String> j = cVar.mo60272j();
                List y0 = C110818d0.m150953y0(C64197v.m75535d(j));
                C77407n nVar = new C77407n(oVar.f173499A, 1, true);
                nVar.mo107568m(cVar.f94903d, 17, 0);
                nVar.f225771i = new C3853k4(j, y0);
                nVar.f225782p = new C56399l4(j4Var, cVar, oVar);
                nVar.mo107573q();
            } else {
                cVar.mo60264k(0);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/SettingItemConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.j4$b */
    public static final class C56396b implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f161230d;

        /* renamed from: e */
        public final /* synthetic */ C56394j4 f161231e;

        /* renamed from: com.tencent.mm.plugin.finder.ui.j4$b$a */
        public static final class C56397a implements C76879j.C76888o {

            /* renamed from: a */
            public final /* synthetic */ HashSet<String> f161232a;

            /* renamed from: b */
            public final /* synthetic */ C35464c<?> f161233b;

            /* renamed from: c */
            public final /* synthetic */ C60905o f161234c;

            public C56397a(HashSet<String> hashSet, C35464c<?> cVar, C60905o oVar) {
                this.f161232a = hashSet;
                this.f161233b = cVar;
                this.f161234c = oVar;
            }

            /* renamed from: a */
            public final void mo5759a(int i, int i2) {
                if (i2 == -1) {
                    this.f161232a.remove(this.f161233b.f94903d);
                    MultiProcessMMKV.getSingleMMKV("finder_debug_settings_fav").putStringSet("fav_1", this.f161232a);
                    C76912y0.makeText(this.f161234c.f173499A, (CharSequence) "已取消收藏", 0).show();
                } else if (i2 == 1) {
                    this.f161232a.add(this.f161233b.f94903d);
                    MultiProcessMMKV.getSingleMMKV("finder_debug_settings_fav").putStringSet("fav_1", this.f161232a);
                    C76912y0.makeText(this.f161234c.f173499A, (CharSequence) "已收藏", 0).show();
                }
            }
        }

        public C56396b(C60905o oVar, C56394j4 j4Var) {
            this.f161230d = oVar;
            this.f161231e = j4Var;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/SettingItemConvert$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C35464c cVar = (C35464c) this.f161230d.f173503E;
            Set<String> stringSet = MultiProcessMMKV.getSingleMMKV("finder_debug_settings_fav").getStringSet("fav_1", C64187h0.f181908d);
            C87412m.m108591d(stringSet);
            HashSet hashSet = new HashSet(stringSet);
            String str = (this.f161231e.f161227e.f17334o == 2 || hashSet.contains(cVar.f94903d)) ? "取消收藏" : "收藏";
            Context context = this.f161230d.f173499A;
            List f = C64197v.m75537f(str, "关闭");
            Integer[] numArr = new Integer[2];
            numArr[0] = Integer.valueOf((this.f161231e.f161227e.f17334o == 2 || hashSet.contains(cVar.f94903d)) ? -1 : 1);
            numArr[1] = 0;
            C76879j.m92732c(context, "", f, C64197v.m75537f(numArr), "", new C56397a(hashSet, cVar, this.f161230d));
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/ui/SettingItemConvert$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    public C56394j4(SettingFragment settingFragment) {
        C87412m.m108594g(settingFragment, "fragment");
        this.f161227e = settingFragment;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cs8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0065, code lost:
        if (r2 == null) goto L_0x0067;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r1, jq3.C9493c r2, int r3, int r4, boolean r5, java.util.List r6) {
        /*
            r0 = this;
            pe1.c r2 = (pe1.C35464c) r2
            java.lang.String r3 = "holder"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "item"
            gy3.C87412m.m108594g(r2, r3)
            java.util.List r3 = r2.mo60272j()
            r4 = 2131306878(0x7f09297e, float:1.8231968E38)
            android.view.View r4 = r1.mo85812D(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r5 = ""
            gy3.C87412m.m108593f(r4, r5)
            er1.C7919x.m8091a(r4)
            java.lang.String r6 = r2.f94903d
            r4.setText(r6)
            r4 = 2131316083(0x7f094d73, float:1.8250637E38)
            android.view.View r1 = r1.mo85812D(r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            boolean r4 = r2 instanceof re1.C36316a
            if (r4 == 0) goto L_0x003f
            int r2 = r2.f94904e
            r3 = 1
            if (r2 != r3) goto L_0x003b
            java.lang.String r2 = "TRUE"
            goto L_0x003d
        L_0x003b:
            java.lang.String r2 = "FALSE"
        L_0x003d:
            r5 = r2
            goto L_0x007d
        L_0x003f:
            boolean r4 = r2 instanceof pe1.C35469d
            if (r4 != 0) goto L_0x007d
            int r4 = r2.f94904e
            if (r4 >= 0) goto L_0x006a
            qe1.a<T> r2 = r2.f94894j
            if (r2 == 0) goto L_0x0067
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r2.f95665b
            r3.append(r4)
            r4 = 58
            r3.append(r4)
            java.lang.Object r2 = r2.mo60442c()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            if (r2 != 0) goto L_0x003d
        L_0x0067:
            java.lang.String r2 = "None"
            goto L_0x003d
        L_0x006a:
            if (r4 < 0) goto L_0x007d
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            int r6 = r3.size()
            if (r4 >= r6) goto L_0x007d
            int r2 = r2.f94904e
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x003d
        L_0x007d:
            r1.setText(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.C56394j4.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        oVar.f44854d.setOnClickListener(new C56395a(oVar, this));
        oVar.f44854d.setOnLongClickListener(new C56396b(oVar, this));
    }
}
