package sk3;

import a14.C53934p0;
import a14.C53973z1;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0120a0;
import androidx.viewpager.widget.ViewPager;
import bl3.C0317e;
import bl3.C39818r;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.component.UIComponentFragment;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gq3.C59648q;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: sk3.r0 */
public final class C64009r0 extends UIComponent {

    /* renamed from: d */
    public final C13601g f181457d = C36568h.m40985a(new C64011b(this));

    /* renamed from: e */
    public final C13601g f181458e = C36568h.m40985a(new C64010a(this));

    /* renamed from: f */
    public final C13601g f181459f = C36568h.m40985a(new C64013d(this));

    /* renamed from: g */
    public final ArrayList<UIComponentFragment> f181460g = new ArrayList<>();

    /* renamed from: h */
    public View f181461h;

    /* renamed from: i */
    public TextView f181462i;

    /* renamed from: j */
    public ProgressBar f181463j;

    /* renamed from: n */
    public TextView f181464n;

    /* renamed from: o */
    public WeImageView f181465o;

    /* renamed from: p */
    public int f181466p;

    /* renamed from: q */
    public boolean f181467q = true;

    /* renamed from: r */
    public boolean f181468r = true;

    /* renamed from: s */
    public C53973z1 f181469s;

    /* renamed from: t */
    public int f181470t;

    /* renamed from: u */
    public C53973z1 f181471u;

    /* renamed from: v */
    public boolean f181472v;

    /* renamed from: w */
    public boolean f181473w;

    /* renamed from: sk3.r0$a */
    public static final class C64010a extends C87413o implements C32224a<TabLayout> {

        /* renamed from: d */
        public final /* synthetic */ C64009r0 f181474d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64010a(C64009r0 r0Var) {
            super(0);
            this.f181474d = r0Var;
        }

        public Object invoke() {
            return (TabLayout) this.f181474d.findViewById(C0966R.C0970id.n0x);
        }
    }

    /* renamed from: sk3.r0$b */
    public static final class C64011b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C64009r0 f181475d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64011b(C64009r0 r0Var) {
            super(0);
            this.f181475d = r0Var;
        }

        public Object invoke() {
            return this.f181475d.findViewById(C0966R.C0970id.n0w);
        }
    }

    /* renamed from: sk3.r0$c */
    public static final class C64012c<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C64009r0 f181476d;

        public C64012c(C64009r0 r0Var) {
            this.f181476d = r0Var;
        }

        public void onChanged(Object obj) {
            C59648q qVar = (C59648q) obj;
            Log.m105924i("MicroMsg.FTSMultiTabViewUIC", "queryState: " + qVar);
            if (qVar == C59648q.STOP) {
                ProgressBar progressBar = this.f181476d.f181463j;
                if (progressBar != null && progressBar.getVisibility() == 0) {
                    this.f181476d.getClass();
                    ProgressBar progressBar2 = this.f181476d.f181463j;
                    if (progressBar2 != null) {
                        progressBar2.setVisibility(8);
                    }
                    int f3 = ((C63995m) C39818r.f106831a.mo62444c(this.f181476d.getActivity()).mo75002a(C63995m.class)).mo88764f3();
                    Log.m105924i("MicroMsg.FTSMultiTabViewUIC", "observeQueryState >> " + f3 + ", " + this.f181476d.f181470t);
                    C64009r0 r0Var = this.f181476d;
                    int i = f3 - r0Var.f181470t;
                    if (r0Var.f181466p == 1 || i <= 0) {
                        WeImageView weImageView = r0Var.f181465o;
                        if (weImageView != null) {
                            weImageView.setVisibility(0);
                        }
                        TextView textView = this.f181476d.f181464n;
                        if (textView != null) {
                            textView.setVisibility(8);
                        }
                        C64009r0 r0Var2 = this.f181476d;
                        r0Var2.f181469s = C0317e.launch$default(r0Var2, (C66212f) null, (C53934p0) null, new C64018t0(r0Var2, (C15601d<? super C64018t0>) null), 3, (Object) null);
                        return;
                    }
                    TextView textView2 = r0Var.f181464n;
                    if (textView2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append('+');
                        sb.append(i);
                        textView2.setText(sb.toString());
                    }
                    TextView textView3 = this.f181476d.f181464n;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                    WeImageView weImageView2 = this.f181476d.f181465o;
                    if (weImageView2 != null) {
                        weImageView2.setVisibility(8);
                    }
                    C64009r0 r0Var3 = this.f181476d;
                    r0Var3.f181471u = C0317e.launch$default(r0Var3, (C66212f) null, (C53934p0) null, new C64022u0(r0Var3, (C15601d<? super C64022u0>) null), 3, (Object) null);
                }
            }
        }
    }

    /* renamed from: sk3.r0$d */
    public static final class C64013d extends C87413o implements C32224a<ViewPager> {

        /* renamed from: d */
        public final /* synthetic */ C64009r0 f181477d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64013d(C64009r0 r0Var) {
            super(0);
            this.f181477d = r0Var;
        }

        public Object invoke() {
            return (ViewPager) this.f181477d.findViewById(C0966R.C0970id.n0y);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64009r0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final TabLayout mo88773c3() {
        Object value = ((C36570n) this.f181458e).getValue();
        C87412m.m108593f(value, "<get-ftsMainTabLayout>(...)");
        return (TabLayout) value;
    }

    /* renamed from: d3 */
    public final ViewPager mo88774d3() {
        Object value = ((C36570n) this.f181459f).getValue();
        C87412m.m108593f(value, "<get-viewPager>(...)");
        return (ViewPager) value;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88775e3() {
        /*
            r3 = this;
            boolean r0 = r3.f181472v
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "MicroMsg.FTSMultiTabViewUIC"
            java.lang.String r1 = "initTabView is init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x000c:
            r0 = 1
            r3.f181472v = r0
            androidx.appcompat.app.AppCompatActivity r0 = r3.getActivity()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131495712(0x7f0c0b20, float:1.8614968E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            r3.f181461h = r0
            if (r0 == 0) goto L_0x002d
            r1 = 2131305271(0x7f092337, float:1.8228708E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x002e
        L_0x002d:
            r0 = r2
        L_0x002e:
            r3.f181462i = r0
            android.view.View r0 = r3.f181461h
            if (r0 == 0) goto L_0x003e
            r1 = 2131305270(0x7f092336, float:1.8228706E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x003f
        L_0x003e:
            r0 = r2
        L_0x003f:
            r3.f181464n = r0
            android.view.View r0 = r3.f181461h
            if (r0 == 0) goto L_0x004f
            r1 = 2131305269(0x7f092335, float:1.8228704E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            goto L_0x0050
        L_0x004f:
            r0 = r2
        L_0x0050:
            r3.f181463j = r0
            android.view.View r0 = r3.f181461h
            if (r0 == 0) goto L_0x0060
            r1 = 2131305268(0x7f092334, float:1.8228702E38)
            android.view.View r0 = r0.findViewById(r1)
            r2 = r0
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
        L_0x0060:
            r3.f181465o = r2
            r3.mo88776f3()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sk3.C64009r0.mo88775e3():void");
    }

    /* renamed from: f3 */
    public final void mo88776f3() {
        ((C63995m) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C63995m.class)).f181432j.observe(getActivity(), new C64012c(this));
    }

    /* renamed from: g3 */
    public final void mo88777g3() {
        Log.m105924i("MicroMsg.FTSMultiTabViewUIC", "setImageTabToShowProgress");
        if (!this.f181472v) {
            mo88775e3();
            Log.m105924i("MicroMsg.FTSMultiTabViewUIC", "setImageTabToShowProgress >> is no init");
        }
        ProgressBar progressBar = this.f181463j;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        mo88776f3();
    }

    /* renamed from: i3 */
    public final void mo88778i3(int i) {
        Log.m105924i("MicroMsg.FTSMultiTabViewUIC", "setTabViewVisible >> " + i);
        Object value = ((C36570n) this.f181457d).getValue();
        C87412m.m108593f(value, "<get-ftsTabParent>(...)");
        View view = (View) value;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiTabViewUIC", "setTabViewVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiTabViewUIC", "setTabViewVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARNING: type inference failed for: r9v24, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            super.onCreate(r9)
            java.lang.Class<sk3.m> r9 = sk3.C63995m.class
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r1 = r8.getActivity()
            bl3.r$a r1 = r0.mo62444c(r1)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r9)
            sk3.m r1 = (sk3.C63995m) r1
            boolean r1 = r1.mo88765g3()
            r8.f181467q = r1
            androidx.appcompat.app.AppCompatActivity r1 = r8.getActivity()
            bl3.r$a r1 = r0.mo62444c(r1)
            androidx.lifecycle.i0 r9 = r1.mo75002a(r9)
            sk3.m r9 = (sk3.C63995m) r9
            boolean r9 = r9.mo88766i3()
            r8.f181468r = r9
            com.google.android.material.tabs.TabLayout r9 = r8.mo88773c3()
            com.google.android.material.tabs.TabLayout r1 = r8.mo88773c3()
            com.google.android.material.tabs.TabLayout$f r1 = r1.mo146908l()
            androidx.appcompat.app.AppCompatActivity r2 = r8.getActivity()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r3 = 2131495713(0x7f0c0b21, float:1.861497E38)
            r4 = 0
            android.view.View r2 = r2.inflate(r3, r4)
            r5 = 2131305271(0x7f092337, float:1.8228708E38)
            android.view.View r6 = r2.findViewById(r5)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131830519(0x7f1126f7, float:1.9294038E38)
            java.lang.String r7 = r8.getString(r7)
            r6.setText(r7)
            rx3.b0 r6 = rx3.C13598b0.f38549a
            r1.f154605f = r2
            r1.mo76124e()
            r9.mo146887b(r1)
            boolean r9 = r8.f181467q
            if (r9 == 0) goto L_0x0085
            r8.mo88775e3()
            com.google.android.material.tabs.TabLayout r9 = r8.mo88773c3()
            com.google.android.material.tabs.TabLayout r1 = r8.mo88773c3()
            com.google.android.material.tabs.TabLayout$f r1 = r1.mo146908l()
            android.view.View r2 = r8.f181461h
            r1.f154605f = r2
            r1.mo76124e()
            r9.mo146887b(r1)
        L_0x0085:
            com.google.android.material.tabs.TabLayout r9 = r8.mo88773c3()
            com.google.android.material.tabs.TabLayout r1 = r8.mo88773c3()
            com.google.android.material.tabs.TabLayout$f r1 = r1.mo146908l()
            androidx.appcompat.app.AppCompatActivity r2 = r8.getActivity()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.view.View r2 = r2.inflate(r3, r4)
            android.view.View r6 = r2.findViewById(r5)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131835384(0x7f1139f8, float:1.9303905E38)
            java.lang.String r7 = r8.getString(r7)
            r6.setText(r7)
            r1.f154605f = r2
            r1.mo76124e()
            r9.mo146887b(r1)
            com.google.android.material.tabs.TabLayout r9 = r8.mo88773c3()
            com.google.android.material.tabs.TabLayout r1 = r8.mo88773c3()
            com.google.android.material.tabs.TabLayout$f r1 = r1.mo146908l()
            androidx.appcompat.app.AppCompatActivity r2 = r8.getActivity()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.view.View r2 = r2.inflate(r3, r4)
            android.view.View r6 = r2.findViewById(r5)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131835390(0x7f1139fe, float:1.9303917E38)
            java.lang.String r7 = r8.getString(r7)
            r6.setText(r7)
            r1.f154605f = r2
            r1.mo76124e()
            r9.mo146887b(r1)
            com.google.android.material.tabs.TabLayout r9 = r8.mo88773c3()
            com.google.android.material.tabs.TabLayout r1 = r8.mo88773c3()
            com.google.android.material.tabs.TabLayout$f r1 = r1.mo146908l()
            androidx.appcompat.app.AppCompatActivity r2 = r8.getActivity()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.view.View r2 = r2.inflate(r3, r4)
            android.view.View r6 = r2.findViewById(r5)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131835388(0x7f1139fc, float:1.9303913E38)
            java.lang.String r7 = r8.getString(r7)
            r6.setText(r7)
            r1.f154605f = r2
            r1.mo76124e()
            r9.mo146887b(r1)
            com.google.android.material.tabs.TabLayout r9 = r8.mo88773c3()
            com.google.android.material.tabs.TabLayout r1 = r8.mo88773c3()
            com.google.android.material.tabs.TabLayout$f r1 = r1.mo146908l()
            androidx.appcompat.app.AppCompatActivity r2 = r8.getActivity()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.view.View r2 = r2.inflate(r3, r4)
            android.view.View r6 = r2.findViewById(r5)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131835389(0x7f1139fd, float:1.9303915E38)
            java.lang.String r7 = r8.getString(r7)
            r6.setText(r7)
            r1.f154605f = r2
            r1.mo76124e()
            r9.mo146887b(r1)
            com.google.android.material.tabs.TabLayout r9 = r8.mo88773c3()
            com.google.android.material.tabs.TabLayout r1 = r8.mo88773c3()
            com.google.android.material.tabs.TabLayout$f r1 = r1.mo146908l()
            androidx.appcompat.app.AppCompatActivity r2 = r8.getActivity()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.view.View r2 = r2.inflate(r3, r4)
            android.view.View r6 = r2.findViewById(r5)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131835382(0x7f1139f6, float:1.93039E38)
            java.lang.String r7 = r8.getString(r7)
            r6.setText(r7)
            r1.f154605f = r2
            r1.mo76124e()
            r9.mo146887b(r1)
            com.google.android.material.tabs.TabLayout r9 = r8.mo88773c3()
            com.google.android.material.tabs.TabLayout r1 = r8.mo88773c3()
            com.google.android.material.tabs.TabLayout$f r1 = r1.mo146908l()
            androidx.appcompat.app.AppCompatActivity r2 = r8.getActivity()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.view.View r2 = r2.inflate(r3, r4)
            android.view.View r3 = r2.findViewById(r5)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r5 = 2131835385(0x7f1139f9, float:1.9303907E38)
            java.lang.String r5 = r8.getString(r5)
            r3.setText(r5)
            r1.f154605f = r2
            r1.mo76124e()
            r9.mo146887b(r1)
            java.util.ArrayList<com.tencent.mm.ui.component.UIComponentFragment> r9 = r8.f181460g
            com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiAllResultFragment r1 = new com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiAllResultFragment
            r1.<init>()
            r9.add(r1)
            boolean r9 = r8.f181467q
            if (r9 == 0) goto L_0x01bd
            java.util.ArrayList<com.tencent.mm.ui.component.UIComponentFragment> r9 = r8.f181460g
            com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiImageResultFragment r1 = new com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiImageResultFragment
            r1.<init>()
            r9.add(r1)
        L_0x01bd:
            java.util.ArrayList<com.tencent.mm.ui.component.UIComponentFragment> r9 = r8.f181460g
            com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment r1 = new com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment
            r2 = 1
            r1.<init>(r2)
            r9.add(r1)
            java.util.ArrayList<com.tencent.mm.ui.component.UIComponentFragment> r9 = r8.f181460g
            com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment r1 = new com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment
            r2 = 2
            r1.<init>(r2)
            r9.add(r1)
            java.util.ArrayList<com.tencent.mm.ui.component.UIComponentFragment> r9 = r8.f181460g
            com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment r1 = new com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment
            r2 = 3
            r1.<init>(r2)
            r9.add(r1)
            java.util.ArrayList<com.tencent.mm.ui.component.UIComponentFragment> r9 = r8.f181460g
            com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment r1 = new com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment
            r2 = 4
            r1.<init>(r2)
            r9.add(r1)
            java.util.ArrayList<com.tencent.mm.ui.component.UIComponentFragment> r9 = r8.f181460g
            com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment r1 = new com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment
            r2 = 5
            r1.<init>(r2)
            r9.add(r1)
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r1 = "detail_username"
            java.lang.String r9 = r9.getStringExtra(r1)
            if (r9 != 0) goto L_0x0202
            java.lang.String r9 = ""
        L_0x0202:
            java.lang.Class<fr.c> r1 = p525fr.C59312c.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            fr.c r1 = (p525fr.C59312c) r1
            fr.b r9 = r1.mo78739dq(r9)
            androidx.appcompat.app.AppCompatActivity r1 = r8.getActivity()
            bl3.r$a r0 = r0.mo62444c(r1)
            java.lang.Class<sk3.b0> r1 = sk3.C63970b0.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            sk3.b0 r0 = (sk3.C63970b0) r0
            r0.getClass()
            java.lang.String r1 = "finderFeedFragment"
            gy3.C87412m.m108594g(r9, r1)
            r0.f181365r = r9
            androidx.fragment.app.Fragment r9 = r9.mo79133c()
            boolean r0 = r9 instanceof com.tencent.p014mm.p136ui.component.UIComponentFragment
            if (r0 == 0) goto L_0x0233
            r4 = r9
            com.tencent.mm.ui.component.UIComponentFragment r4 = (com.tencent.p014mm.p136ui.component.UIComponentFragment) r4
        L_0x0233:
            if (r4 == 0) goto L_0x023a
            java.util.ArrayList<com.tencent.mm.ui.component.UIComponentFragment> r9 = r8.f181460g
            r9.add(r4)
        L_0x023a:
            androidx.viewpager.widget.ViewPager r9 = r8.mo88774d3()
            nk3.i r0 = new nk3.i
            androidx.appcompat.app.AppCompatActivity r1 = r8.getActivity()
            androidx.fragment.app.FragmentManager r1 = r1.getSupportFragmentManager()
            java.lang.String r2 = "activity.supportFragmentManager"
            gy3.C87412m.m108593f(r1, r2)
            java.util.ArrayList<com.tencent.mm.ui.component.UIComponentFragment> r2 = r8.f181460g
            r0.<init>(r1, r2)
            r9.setAdapter(r0)
            androidx.viewpager.widget.ViewPager r9 = r8.mo88774d3()
            com.google.android.material.tabs.TabLayout$g r0 = new com.google.android.material.tabs.TabLayout$g
            com.google.android.material.tabs.TabLayout r1 = r8.mo88773c3()
            r0.<init>(r1)
            r9.addOnPageChangeListener(r0)
            androidx.viewpager.widget.ViewPager r9 = r8.mo88774d3()
            int r0 = r8.f181466p
            r9.setCurrentItem(r0)
            com.google.android.material.tabs.TabLayout r9 = r8.mo88773c3()
            sk3.s0 r0 = new sk3.s0
            r0.<init>(r8)
            r9.setOnTabSelectedListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sk3.C64009r0.onCreate(android.os.Bundle):void");
    }
}
