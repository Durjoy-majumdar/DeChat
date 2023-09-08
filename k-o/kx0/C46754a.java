package kx0;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.brandservice.p028ui.personalcenter.recentread.BizPCRecentReadRvUIC$buildItemConvertFactory$1;
import com.tencent.p014mm.plugin.brandservice.p028ui.personalcenter.recentread.BizPCRecentReadUI;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import mx0.C47111e;
import mx0.C47112f;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zb2.C103009m;
import zb2.C53769h;

/* renamed from: kx0.a */
public final class C46754a extends UIComponent {

    /* renamed from: d */
    public final Set<C47111e> f125844d = new LinkedHashSet();

    /* renamed from: e */
    public final C47112f f125845e = new C47112f();

    /* renamed from: f */
    public View f125846f;

    /* renamed from: g */
    public View f125847g;

    /* renamed from: h */
    public TextView f125848h;

    /* renamed from: i */
    public final C13601g f125849i = C36568h.m40985a(new C46755a(this));

    /* renamed from: j */
    public final C13601g f125850j = C36568h.m40985a(new C46759e(this));

    /* renamed from: n */
    public final C13601g f125851n;

    /* renamed from: o */
    public final C13601g f125852o;

    /* renamed from: p */
    public final C13601g f125853p;

    /* renamed from: q */
    public int f125854q;

    /* renamed from: r */
    public int f125855r;

    /* renamed from: kx0.a$a */
    public static final class C46755a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C46754a f125856d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46755a(C46754a aVar) {
            super(0);
            this.f125856d = aVar;
        }

        public Object invoke() {
            return Integer.valueOf(C75044y4.m89989a(this.f125856d.getContext()) + C75044y4.m89994f(this.f125856d.getContext()));
        }
    }

    /* renamed from: kx0.a$b */
    public static final class C46756b extends C87413o implements C32224a<LinearLayoutManager> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f125857d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46756b(AppCompatActivity appCompatActivity) {
            super(0);
            this.f125857d = appCompatActivity;
        }

        public Object invoke() {
            return new LinearLayoutManager(this.f125857d);
        }
    }

    /* renamed from: kx0.a$c */
    public static final class C46757c extends C87413o implements C32224a<C103009m<C47111e>> {

        /* renamed from: d */
        public final /* synthetic */ C46754a f125858d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46757c(C46754a aVar) {
            super(0);
            this.f125858d = aVar;
        }

        public Object invoke() {
            MvvmList<C47111e> d3 = this.f125858d.mo72005d3();
            this.f125858d.getClass();
            return new C103009m(d3, new BizPCRecentReadRvUIC$buildItemConvertFactory$1(), true);
        }
    }

    /* renamed from: kx0.a$d */
    public static final class C46758d extends C87413o implements C32224a<MvvmList<C47111e>> {

        /* renamed from: d */
        public final /* synthetic */ C46754a f125859d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f125860e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46758d(C46754a aVar, AppCompatActivity appCompatActivity) {
            super(0);
            this.f125859d = aVar;
            this.f125860e = appCompatActivity;
        }

        public Object invoke() {
            C47112f fVar = this.f125859d.f125845e;
            AppCompatActivity appCompatActivity = this.f125860e;
            C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI");
            C53769h hVar = new C53769h();
            hVar.f150920a = false;
            return new MvvmList(fVar, hVar, (BizPCRecentReadUI) appCompatActivity, (LifecycleScope) null, (List) null, 24, (C8480h) null);
        }
    }

    /* renamed from: kx0.a$e */
    public static final class C46759e extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C46754a f125861d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46759e(C46754a aVar) {
            super(0);
            this.f125861d = aVar;
        }

        public Object invoke() {
            return (WxRecyclerView) this.f125861d.findViewById(C0966R.C0970id.ny8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46754a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f125851n = C36568h.m40985a(new C46756b(appCompatActivity));
        this.f125852o = C36568h.m40985a(new C46758d(this, appCompatActivity));
        this.f125853p = C36568h.m40985a(new C46757c(this));
    }

    /* renamed from: c3 */
    public final C103009m<C47111e> mo72004c3() {
        return (C103009m) ((C36570n) this.f125853p).getValue();
    }

    /* renamed from: d3 */
    public final MvvmList<C47111e> mo72005d3() {
        return (MvvmList) ((C36570n) this.f125852o).getValue();
    }

    public final WxRecyclerView getRecyclerView() {
        Object value = ((C36570n) this.f125850j).getValue();
        C87412m.m108593f(value, "<get-recyclerView>(...)");
        return (WxRecyclerView) value;
    }

    /* JADX WARNING: type inference failed for: r6v21, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateAfter(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreateAfter(r6)
            mx0.f r6 = r5.f125845e
            com.tencent.mm.plugin.mvvmlist.MvvmList r0 = r5.mo72005d3()
            r6.f126590d = r0
            com.tencent.mm.view.recyclerview.WxRecyclerView r6 = r5.getRecyclerView()
            rx3.g r0 = r5.f125851n
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            r6.setLayoutManager(r0)
            com.tencent.mm.view.recyclerview.WxRecyclerView r6 = r5.getRecyclerView()
            zb2.m r0 = r5.mo72004c3()
            r6.setAdapter(r0)
            com.tencent.mm.view.recyclerview.WxRecyclerView r6 = r5.getRecyclerView()
            androidx.recyclerview.widget.f r0 = new androidx.recyclerview.widget.f
            r0.<init>()
            r1 = 100
            r0.f44807c = r1
            r3 = 150(0x96, double:7.4E-322)
            r0.f44808d = r3
            r0.f44809e = r1
            r6.setItemAnimator(r0)
            com.tencent.mm.view.recyclerview.WxRecyclerView r6 = r5.getRecyclerView()
            r0 = 80
            r6.setFlingSpeedFactor(r0)
            zb2.m r6 = r5.mo72004c3()
            kx0.b r0 = new kx0.b
            r0.<init>(r5)
            r6.f165746y = r0
            android.app.Activity r6 = r5.getContext()
            android.view.LayoutInflater r6 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r6)
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r5.getRecyclerView()
            r1 = 2131493300(0x7f0c01b4, float:1.8610076E38)
            r2 = 0
            android.view.View r6 = r6.inflate(r1, r0, r2)
            r5.f125846f = r6
            android.app.Activity r6 = r5.getContext()
            android.view.LayoutInflater r6 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r6)
            r0 = 2131493298(0x7f0c01b2, float:1.8610072E38)
            r1 = 0
            android.view.View r6 = r6.inflate(r0, r1, r2)
            r5.f125847g = r6
            if (r6 == 0) goto L_0x0085
            r0 = 2131311874(0x7f093d02, float:1.82421E38)
            android.view.View r6 = r6.findViewById(r0)
            r1 = r6
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x0085:
            r5.f125848h = r1
            fy0.i r6 = fy0.C8219i.f27144a
            r6.mo9271b(r1)
            androidx.appcompat.app.AppCompatActivity r6 = r5.getActivity()
            java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI"
            gy3.C87412m.m108592e(r6, r0)
            com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI r6 = (com.tencent.p014mm.plugin.brandservice.p028ui.personalcenter.recentread.BizPCRecentReadUI) r6
            android.view.Window r6 = r6.getWindow()
            android.view.View r6 = r6.getDecorView()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r6, r0)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            rx3.g r1 = r5.f125849i
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.topMargin = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "layoutParams.topMargin = "
            r1.append(r2)
            int r2 = r0.topMargin
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "SimpleUIComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            android.view.View r1 = r5.f125847g
            r6.addView(r1, r0)
            zb2.m r6 = r5.mo72004c3()
            kx0.c r0 = new kx0.c
            r0.<init>(r5)
            r6.f165737C = r0
            com.tencent.mm.view.recyclerview.WxRecyclerView r6 = r5.getRecyclerView()
            kx0.d r0 = new kx0.d
            r0.<init>(r5)
            r6.mo17043c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kx0.C46754a.onCreateAfter(android.os.Bundle):void");
    }
}
