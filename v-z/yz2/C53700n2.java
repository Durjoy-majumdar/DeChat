package yz2;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C112911a0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C39622i0;
import az2.C39674e;
import bl3.C39818r;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.textstatus.conversation.p805ui.TextStatusConversationFragment;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusLikeListFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import rz2.C48203e;
import rz2.C48205g;
import uy2.C52661f;
import uy2.C52665g;
import yy2.C53658a;
import yy2.C53659b;

/* renamed from: yz2.n2 */
public final class C53700n2 extends UIComponent implements MStorage.IOnStorageChange {

    /* renamed from: d */
    public final C13601g f150794d;

    /* renamed from: e */
    public final C13601g f150795e = C36568h.m40985a(new C53708e(this));

    /* renamed from: f */
    public final C13601g f150796f = C36568h.m40985a(C53707d.f150813d);

    /* renamed from: g */
    public boolean f150797g = true;

    /* renamed from: h */
    public final C13601g f150798h = C36568h.m40985a(new C53712i(this));

    /* renamed from: i */
    public int f150799i;

    /* renamed from: j */
    public int f150800j;

    /* renamed from: n */
    public final C13601g f150801n;

    /* renamed from: yz2.n2$a */
    public final class C53701a extends C112911a0 {

        /* renamed from: d */
        public final /* synthetic */ C53700n2 f150802d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53701a(C53700n2 n2Var, FragmentManager fragmentManager) {
            super(fragmentManager);
            C87412m.m108594g(fragmentManager, "fm");
            this.f150802d = n2Var;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Integer} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final yz2.C53700n2.C53702b mo74294a(int r6) {
            /*
                r5 = this;
                yz2.n2$b r0 = new yz2.n2$b
                r1 = 0
                r2 = 3
                r3 = 0
                r0.<init>(r1, r1, r2, r3)
                r2 = 1
                if (r6 == 0) goto L_0x0050
                if (r6 == r2) goto L_0x000e
                goto L_0x0061
            L_0x000e:
                az2.e r6 = az2.C39674e.f106452d
                yy2.a r4 = r6.mo62238D()
                int r4 = r4.mo74246Lo()
                if (r4 <= 0) goto L_0x001f
                r0.f150803a = r2
                r0.f150804b = r4
                goto L_0x0061
            L_0x001f:
                r6.getClass()
                f40.o r2 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r2 = r2.mo121142i()
                com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TEXT_STATUS_LASTTIME_CONV_TAB_SHOWN_INT
                java.lang.Object r2 = r2.mo119685f(r4, r3)
                boolean r4 = r2 instanceof java.lang.Integer
                if (r4 == 0) goto L_0x0037
                r3 = r2
                java.lang.Integer r3 = (java.lang.Integer) r3
            L_0x0037:
                if (r3 == 0) goto L_0x003e
                int r2 = r3.intValue()
                goto L_0x003f
            L_0x003e:
                r2 = 0
            L_0x003f:
                nz2.a$a r6 = r6.mo62245Q(r2)
                if (r6 == 0) goto L_0x004b
                r6 = 2
                r0.f150803a = r6
                r0.f150804b = r1
                goto L_0x0061
            L_0x004b:
                r0.f150803a = r1
                r0.f150804b = r1
                goto L_0x0061
            L_0x0050:
                az2.e r6 = az2.C39674e.f106452d
                int r6 = r6.mo62240H0()
                if (r6 <= 0) goto L_0x005d
                r0.f150803a = r2
                r0.f150804b = r6
                goto L_0x0061
            L_0x005d:
                r0.f150803a = r1
                r0.f150804b = r1
            L_0x0061:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: yz2.C53700n2.C53701a.mo74294a(int):yz2.n2$b");
        }

        public int getCount() {
            return ((Number) ((C36570n) this.f150802d.f150801n).getValue()).intValue();
        }

        public Fragment getItem(int i) {
            return i == 0 ? (Fragment) ((C36570n) this.f150802d.f150795e).getValue() : (Fragment) ((C36570n) this.f150802d.f150796f).getValue();
        }

        public CharSequence getPageTitle(int i) {
            return i != 0 ? i != 1 ? String.valueOf(i) : this.f150802d.getString(C0966R.string.k1i) : this.f150802d.getString(C0966R.string.k1u);
        }
    }

    /* renamed from: yz2.n2$b */
    public static final class C53702b {

        /* renamed from: a */
        public int f150803a;

        /* renamed from: b */
        public int f150804b;

        public C53702b() {
            this(0, 0, 3, (C8480h) null);
        }

        public C53702b(int i, int i2, int i3, C8480h hVar) {
            i = (i3 & 1) != 0 ? 0 : i;
            i2 = (i3 & 2) != 0 ? 0 : i2;
            this.f150803a = i;
            this.f150804b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C53702b)) {
                return false;
            }
            C53702b bVar = (C53702b) obj;
            return this.f150803a == bVar.f150803a && this.f150804b == bVar.f150804b;
        }

        public int hashCode() {
            return (this.f150803a * 31) + this.f150804b;
        }

        public String toString() {
            return "RedInfo(showType=" + this.f150803a + ", count=" + this.f150804b + ')';
        }
    }

    /* renamed from: yz2.n2$c */
    public static final class C53703c {

        /* renamed from: a */
        public final TabLayout.C55061f f150805a;

        /* renamed from: b */
        public final C13601g f150806b = C36568h.m40985a(new C53705b(this));

        /* renamed from: c */
        public final C13601g f150807c = C36568h.m40985a(new C53704a(this));

        /* renamed from: d */
        public final C13601g f150808d = C36568h.m40985a(new C53706c(this));

        /* renamed from: e */
        public C53702b f150809e;

        /* renamed from: yz2.n2$c$a */
        public static final class C53704a extends C87413o implements C32224a<TextView> {

            /* renamed from: d */
            public final /* synthetic */ C53703c f150810d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C53704a(C53703c cVar) {
                super(0);
                this.f150810d = cVar;
            }

            public Object invoke() {
                View view = this.f150810d.f150805a.f154605f;
                if (view != null) {
                    return (TextView) view.findViewById(C0966R.C0970id.kv6);
                }
                return null;
            }
        }

        /* renamed from: yz2.n2$c$b */
        public static final class C53705b extends C87413o implements C32224a<TextView> {

            /* renamed from: d */
            public final /* synthetic */ C53703c f150811d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C53705b(C53703c cVar) {
                super(0);
                this.f150811d = cVar;
            }

            public Object invoke() {
                View view = this.f150811d.f150805a.f154605f;
                if (view != null) {
                    return (TextView) view.findViewById(C0966R.C0970id.kv9);
                }
                return null;
            }
        }

        /* renamed from: yz2.n2$c$c */
        public static final class C53706c extends C87413o implements C32224a<View> {

            /* renamed from: d */
            public final /* synthetic */ C53703c f150812d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C53706c(C53703c cVar) {
                super(0);
                this.f150812d = cVar;
            }

            public Object invoke() {
                View view = this.f150812d.f150805a.f154605f;
                if (view != null) {
                    return view.findViewById(C0966R.C0970id.l2r);
                }
                return null;
            }
        }

        public C53703c(TabLayout.C55061f fVar) {
            C87412m.m108594g(fVar, "tab");
            this.f150805a = fVar;
            fVar.mo76122c(C0966R.C0971layout.c_4);
            fVar.f154600a = this;
        }

        /* renamed from: a */
        public final void mo74298a(boolean z) {
            TextView textView = (TextView) ((C36570n) this.f150806b).getValue();
            if (textView == null) {
                return;
            }
            if (z) {
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
                return;
            }
            textView.getPaint().setFakeBoldText(false);
            textView.getPaint().setStrokeWidth(0.0f);
        }

        /* renamed from: b */
        public final void mo74299b(int i) {
            TextView textView = (TextView) ((C36570n) this.f150806b).getValue();
            if (textView != null) {
                View view = this.f150805a.f154605f;
                C87412m.m108591d(view);
                textView.setTextColor(view.getContext().getResources().getColor(i));
            }
        }
    }

    /* renamed from: yz2.n2$d */
    public static final class C53707d extends C87413o implements C32224a<TextStatusConversationFragment> {

        /* renamed from: d */
        public static final C53707d f150813d = new C53707d();

        public C53707d() {
            super(0);
        }

        public Object invoke() {
            return new TextStatusConversationFragment();
        }
    }

    /* renamed from: yz2.n2$e */
    public static final class C53708e extends C87413o implements C32224a<TextStatusLikeListFragment> {

        /* renamed from: d */
        public final /* synthetic */ C53700n2 f150814d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53708e(C53700n2 n2Var) {
            super(0);
            this.f150814d = n2Var;
        }

        public Object invoke() {
            TextStatusLikeListFragment textStatusLikeListFragment = new TextStatusLikeListFragment();
            textStatusLikeListFragment.setArguments(this.f150814d.getIntent().getExtras());
            return textStatusLikeListFragment;
        }
    }

    /* renamed from: yz2.n2$f */
    public static final class C53709f extends C87413o implements C32224a<C53701a> {

        /* renamed from: d */
        public final /* synthetic */ C53700n2 f150815d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f150816e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53709f(C53700n2 n2Var, AppCompatActivity appCompatActivity) {
            super(0);
            this.f150815d = n2Var;
            this.f150816e = appCompatActivity;
        }

        public Object invoke() {
            C53700n2 n2Var = this.f150815d;
            FragmentManager supportFragmentManager = this.f150816e.getSupportFragmentManager();
            C87412m.m108593f(supportFragmentManager, "activity.supportFragmentManager");
            return new C53701a(n2Var, supportFragmentManager);
        }
    }

    /* renamed from: yz2.n2$g */
    public static final class C53710g extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C53700n2 f150817d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53710g(C53700n2 n2Var) {
            super(0);
            this.f150817d = n2Var;
        }

        public Object invoke() {
            Activity context = this.f150817d.getContext();
            C87412m.m108594g(context, "context");
            C39622i0 a = C39818r.f106831a.mo62443b(context).mo75002a(C52661f.class);
            C87412m.m108593f(a, "UICProvider.of(context).…PagerDataUIC::class.java)");
            return Integer.valueOf(((Number) ((C36570n) ((C52661f) a).f147050e).getValue()).intValue());
        }
    }

    /* renamed from: yz2.n2$h */
    public static final class C53711h extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C53700n2 f150818d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53711h(C53700n2 n2Var) {
            super(0);
            this.f150818d = n2Var;
        }

        public Object invoke() {
            Activity context = this.f150818d.getContext();
            C87412m.m108594g(context, "context");
            C39622i0 a = C39818r.f106831a.mo62443b(context).mo75002a(C52661f.class);
            C87412m.m108593f(a, "UICProvider.of(context).…PagerDataUIC::class.java)");
            return Integer.valueOf(((Number) ((C36570n) ((C52661f) a).f147050e).getValue()).intValue());
        }
    }

    /* renamed from: yz2.n2$i */
    public static final class C53712i extends C87413o implements C32224a<TabLayout> {

        /* renamed from: d */
        public final /* synthetic */ C53700n2 f150819d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53712i(C53700n2 n2Var) {
            super(0);
            this.f150819d = n2Var;
        }

        public Object invoke() {
            return (TabLayout) this.f150819d.findViewById(C0966R.C0970id.fl7);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53700n2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f150794d = C36568h.m40985a(new C53709f(this, appCompatActivity));
        C36568h.m40985a(new C53711h(this));
        this.f150801n = C36568h.m40985a(new C53710g(this));
    }

    /* renamed from: c3 */
    public static final int m60208c3(C53700n2 n2Var, TabLayout.C55061f fVar) {
        C53702b bVar;
        n2Var.getClass();
        Object obj = fVar.f154600a;
        C53703c cVar = obj instanceof C53703c ? (C53703c) obj : null;
        if (cVar == null || (bVar = cVar.f150809e) == null) {
            return 0;
        }
        return bVar.f150804b;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [androidx.appcompat.app.AppCompatActivity] */
    /* JADX WARNING: type inference failed for: r2v3, types: [androidx.appcompat.app.AppCompatActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m60209d3(yz2.C53700n2 r2, com.google.android.material.tabs.TabLayout.C55061f r3, boolean r4) {
        /*
            r2.getClass()
            java.lang.Object r0 = r3.f154600a
            boolean r1 = r0 instanceof yz2.C53700n2.C53703c
            if (r1 == 0) goto L_0x004a
            r1 = 0
            if (r4 == 0) goto L_0x003f
            yz2.n2$c r0 = (yz2.C53700n2.C53703c) r0
            r4 = 2131101252(0x7f060644, float:1.7814908E38)
            r0.mo74299b(r4)
            r4 = 1
            r0.mo74298a(r4)
            int r3 = r3.f154604e
            r0 = 0
            if (r3 != 0) goto L_0x002e
            androidx.appcompat.app.AppCompatActivity r2 = r2.getActivity()
            boolean r3 = r2 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r3 == 0) goto L_0x0028
            r0 = r2
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
        L_0x0028:
            if (r0 == 0) goto L_0x004a
            r0.showOptionMenu(r4)
            goto L_0x004a
        L_0x002e:
            androidx.appcompat.app.AppCompatActivity r2 = r2.getActivity()
            boolean r3 = r2 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r3 == 0) goto L_0x0039
            r0 = r2
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
        L_0x0039:
            if (r0 == 0) goto L_0x004a
            r0.showOptionMenu(r1)
            goto L_0x004a
        L_0x003f:
            yz2.n2$c r0 = (yz2.C53700n2.C53703c) r0
            r2 = 2131100381(0x7f0602dd, float:1.7813142E38)
            r0.mo74299b(r2)
            r0.mo74298a(r1)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz2.C53700n2.m60209d3(yz2.n2, com.google.android.material.tabs.TabLayout$f, boolean):void");
    }

    /* renamed from: e3 */
    public final void mo74290e3(TabLayout.C55061f fVar, C53702b bVar) {
        ViewGroup.LayoutParams layoutParams;
        Log.m105918d("MicroMsg.TextStatus.TextStatusPagerUIC", "attachRedInfo() called with: tabpos = " + fVar.f154604e + " redInfo = " + bVar);
        Object obj = fVar.f154600a;
        TabLayout.C104475h hVar = null;
        C53703c cVar = obj instanceof C53703c ? (C53703c) obj : null;
        if (cVar != null) {
            cVar.f150809e = bVar;
            int i = bVar.f150803a;
            if (i == 0) {
                TextView textView = (TextView) ((C36570n) cVar.f150807c).getValue();
                if (textView != null) {
                    textView.setVisibility(8);
                }
                View view = (View) ((C36570n) cVar.f150808d).getValue();
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC", "attachRedInfo", "(Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC$RedInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC", "attachRedInfo", "(Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC$RedInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (i == 1) {
                TextView textView2 = (TextView) ((C36570n) cVar.f150807c).getValue();
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                TextView textView3 = (TextView) ((C36570n) cVar.f150807c).getValue();
                if (textView3 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('+');
                    sb.append(bVar.f150804b);
                    textView3.setText(sb.toString());
                }
                View view3 = (View) ((C36570n) cVar.f150808d).getValue();
                if (view3 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC", "attachRedInfo", "(Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC$RedInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC", "attachRedInfo", "(Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC$RedInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (i == 2) {
                View view5 = (View) ((C36570n) cVar.f150808d).getValue();
                if (view5 != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC", "attachRedInfo", "(Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC$RedInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC", "attachRedInfo", "(Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC$RedInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                TextView textView4 = (TextView) ((C36570n) cVar.f150807c).getValue();
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
            }
            TabLayout.C104475h hVar2 = fVar.f154607h;
            if (!(hVar2 instanceof View)) {
                hVar2 = null;
            }
            if (hVar2 != null && (layoutParams = hVar2.getLayoutParams()) != null) {
                layoutParams.width = -2;
                TabLayout.C104475h hVar3 = fVar.f154607h;
                if (hVar3 instanceof View) {
                    hVar = hVar3;
                }
                if (hVar != null) {
                    hVar.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* renamed from: f3 */
    public final C53701a mo74291f3() {
        return (C53701a) ((C36570n) this.f150794d).getValue();
    }

    /* renamed from: g3 */
    public final TabLayout mo74292g3() {
        Object value = ((C36570n) this.f150798h).getValue();
        C87412m.m108593f(value, "<get-tabLayout>(...)");
        return (TabLayout) value;
    }

    /* renamed from: i3 */
    public final void mo74293i3(int i) {
        TabLayout.C55061f k;
        if (i != -1 && (k = mo74292g3().mo146907k(i)) != null) {
            mo74290e3(k, mo74291f3().mo74294a(i));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C39674e eVar = C39674e.f106452d;
        eVar.mo62244O0();
        eVar.mo62241N0();
        eVar.mo62243O().remove(this);
        eVar.mo62238D().remove(this);
        eVar.mo62246S().remove(this);
        eVar.mo62249g0().remove(this);
    }

    public void onFinished() {
        super.onFinished();
        Activity context = getContext();
        C87412m.m108594g(context, "context");
        C39622i0 a = C39818r.f106831a.mo62443b(context).mo75002a(C52665g.class);
        C87412m.m108593f(a, "UICProvider.of(context).…tusReportUIC::class.java)");
        C52665g.m59047c3((C52665g) a, 4, 0, 0, 0, 14, (Object) null);
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        int i;
        Log.m105918d("MicroMsg.TextStatus.TextStatusPagerUIC", "onNotifyChange() called with: event = " + str + ", eventData = " + mStorageEventData);
        MStorage mStorage = mStorageEventData != null ? mStorageEventData.stg : null;
        if (mStorage instanceof C48203e ? true : mStorage instanceof C48205g) {
            i = 0;
        } else {
            i = mStorage instanceof C53658a ? true : mStorage instanceof C53659b ? 1 : -1;
        }
        mo74293i3(i);
        if (i != mo74292g3().getSelectedTabPosition()) {
            return;
        }
        if (i == 0) {
            C39674e eVar = C39674e.f106452d;
            int e = C31543z5.m39455e();
            eVar.getClass();
            Log.m105918d("MicroMsg.TextStatus.TextStatusInfoManager", "markLikeTabShown() called");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TEXT_STATUS_LASTTIME_LIKE_TAB_SHOWN_INT, Integer.valueOf(e));
        } else if (i == 1) {
            C39674e eVar2 = C39674e.f106452d;
            int e2 = C31543z5.m39455e();
            eVar2.getClass();
            Log.m105918d("MicroMsg.TextStatus.TextStatusInfoManager", "markConvTabShown() called");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TEXT_STATUS_LASTTIME_CONV_TAB_SHOWN_INT, Integer.valueOf(e2));
        }
    }

    public void onPause() {
        super.onPause();
        C39674e.f106452d.mo62241N0();
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [androidx.appcompat.app.AppCompatActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r9 = this;
            super.onResume()
            boolean r0 = r9.f150797g
            if (r0 == 0) goto L_0x011d
            androidx.appcompat.app.AppCompatActivity r0 = r9.getActivity()
            boolean r1 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
            r2 = 0
            if (r1 == 0) goto L_0x0013
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            goto L_0x0014
        L_0x0013:
            r0 = r2
        L_0x0014:
            if (r0 == 0) goto L_0x0028
            com.tencent.mm.ui.MMActivityController r0 = r0.getController()
            if (r0 == 0) goto L_0x0028
            androidx.appcompat.app.AppCompatActivity r1 = r9.getActivity()
            r3 = 2131497930(0x7f0c13ca, float:1.8619467E38)
            r0.f348097f0 = r3
            r0.mo177048H(r1)
        L_0x0028:
            yz2.n2$a r0 = r9.mo74291f3()
            int r0 = r0.getCount()
            r1 = 0
            r3 = 0
        L_0x0032:
            if (r3 >= r0) goto L_0x0083
            yz2.n2$a r4 = r9.mo74291f3()
            com.google.android.material.tabs.TabLayout r5 = r9.mo74292g3()
            r4.getClass()
            com.google.android.material.tabs.TabLayout$f r4 = r5.mo146908l()
            yz2.n2$c r5 = new yz2.n2$c
            r5.<init>(r4)
            yz2.n2$a r5 = r9.mo74291f3()
            r5.getClass()
            yz2.n2 r6 = r5.f150802d
            java.lang.CharSequence r7 = r5.getPageTitle(r3)
            r6.getClass()
            java.lang.Object r6 = r4.f154600a
            boolean r8 = r6 instanceof yz2.C53700n2.C53703c
            if (r8 == 0) goto L_0x0070
            yz2.n2$c r6 = (yz2.C53700n2.C53703c) r6
            rx3.g r6 = r6.f150806b
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 != 0) goto L_0x006d
            goto L_0x0070
        L_0x006d:
            r6.setText(r7)
        L_0x0070:
            yz2.n2 r6 = r5.f150802d
            yz2.n2$b r5 = r5.mo74294a(r3)
            r6.mo74290e3(r4, r5)
            com.google.android.material.tabs.TabLayout r5 = r9.mo74292g3()
            r5.mo146889d(r4, r1)
            int r3 = r3 + 1
            goto L_0x0032
        L_0x0083:
            androidx.appcompat.app.AppCompatActivity r0 = r9.getActivity()
            r3 = 2131310730(0x7f09388a, float:1.823978E38)
            android.view.View r0 = r0.findViewById(r3)
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            com.google.android.material.tabs.TabLayout r3 = r9.mo74292g3()
            yz2.o2 r4 = new yz2.o2
            r4.<init>(r0, r9)
            r3.mo146882a(r4)
            com.google.android.material.tabs.TabLayout r3 = r9.mo74292g3()
            yz2.p2 r4 = new yz2.p2
            r4.<init>(r3)
            r0.addOnPageChangeListener(r4)
            bl3.r r0 = bl3.C39818r.f106831a
            android.app.Activity r3 = r9.getContext()
            bl3.r$a r0 = r0.mo62443b(r3)
            java.lang.Class<uy2.f> r3 = uy2.C52661f.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r3)
            uy2.f r0 = (uy2.C52661f) r0
            rx3.g r0 = r0.f147051f
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            com.google.android.material.tabs.TabLayout r3 = r9.mo74292g3()
            com.google.android.material.tabs.TabLayout$f r0 = r3.mo146907k(r0)
            if (r0 == 0) goto L_0x00d5
            r0.mo76121b()
        L_0x00d5:
            androidx.appcompat.app.AppCompatActivity r0 = r9.getActivity()
            boolean r3 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r3 == 0) goto L_0x00e0
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            goto L_0x00e1
        L_0x00e0:
            r0 = r2
        L_0x00e1:
            if (r0 == 0) goto L_0x00e8
            java.lang.String r3 = ""
            r0.setMMTitle((java.lang.String) r3)
        L_0x00e8:
            androidx.appcompat.app.AppCompatActivity r0 = r9.getActivity()
            boolean r3 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r3 == 0) goto L_0x00f3
            r2 = r0
            com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2
        L_0x00f3:
            if (r2 == 0) goto L_0x00fd
            yz2.q2 r0 = new yz2.q2
            r0.<init>(r9)
            r2.setBackBtn(r0)
        L_0x00fd:
            az2.e r0 = az2.C39674e.f106452d
            yy2.b r2 = r0.mo62243O()
            r2.add(r9)
            yy2.a r2 = r0.mo62238D()
            r2.add(r9)
            rz2.e r2 = r0.mo62246S()
            r2.add(r9)
            rz2.g r0 = r0.mo62249g0()
            r0.add(r9)
            r9.f150797g = r1
        L_0x011d:
            az2.e r0 = az2.C39674e.f106452d
            r0.mo62244O0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz2.C53700n2.onResume():void");
    }
}
