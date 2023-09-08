package xk1;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import je1.C60797c3;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import qk1.C63193a;
import rx3.C13598b0;
import te3.C49110d81;
import te3.C49712hj1;
import te3.C50173ks1;
import zp3.C23564m;

/* renamed from: xk1.u0 */
public final class C66350u0 extends UIComponent implements C11385n {

    /* renamed from: d */
    public final int f190983d = ((int) getContext().getResources().getDimension(C0966R.dimen.f3736cp));

    /* renamed from: e */
    public final int f190984e = ((int) getContext().getResources().getDimension(C0966R.dimen.f3738cr));

    /* renamed from: f */
    public final float f190985f = getContext().getResources().getDimension(C0966R.dimen.f3750d1);

    /* renamed from: g */
    public LinearLayout f190986g;

    /* renamed from: h */
    public RecyclerView f190987h;

    /* renamed from: i */
    public C60797c3 f190988i;

    /* renamed from: j */
    public final ArrayList<C50173ks1> f190989j = new ArrayList<>();

    /* renamed from: n */
    public final C63193a f190990n = new C63193a();

    /* renamed from: xk1.u0$a */
    public static final class C66351a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66350u0 f190991d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66351a(C66350u0 u0Var) {
            super(0);
            this.f190991d = u0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0069, code lost:
            r0 = r0.getText();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r6 = this;
                xk1.u0 r0 = r6.f190991d
                java.util.ArrayList<te3.ks1> r0 = r0.f190989j
                boolean r0 = r0.isEmpty()
                r1 = 1
                r0 = r0 ^ r1
                if (r0 == 0) goto L_0x009a
                xk1.u0 r0 = r6.f190991d
                qk1.a r2 = r0.f190990n
                java.util.ArrayList<te3.ks1> r0 = r0.f190989j
                r3 = 8
                java.util.List r0 = sx3.C110818d0.m150947s0(r0, r3)
                java.util.ArrayList r3 = new java.util.ArrayList
                r4 = 10
                int r4 = sx3.C36907w.m41090l(r0, r4)
                r3.<init>(r4)
                java.util.Iterator r0 = r0.iterator()
            L_0x0027:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L_0x003c
                java.lang.Object r4 = r0.next()
                te3.ks1 r4 = (te3.C50173ks1) r4
                sk1.b r5 = new sk1.b
                r5.<init>(r4)
                r3.add(r5)
                goto L_0x0027
            L_0x003c:
                r2.getClass()
                java.util.ArrayList<sk1.b> r0 = r2.f179293d
                r0.clear()
                java.util.ArrayList<sk1.b> r0 = r2.f179293d
                r0.addAll(r3)
                xk1.u0 r0 = r6.f190991d
                qk1.a r0 = r0.f190990n
                r0.notifyDataSetChanged()
                bl3.r r0 = bl3.C39818r.f106831a
                xk1.u0 r2 = r6.f190991d
                android.app.Activity r2 = r2.getContext()
                bl3.r$a r0 = r0.mo62443b(r2)
                java.lang.Class<xk1.v0> r2 = xk1.C66352v0.class
                androidx.lifecycle.i0 r0 = r0.mo75002a(r2)
                xk1.v0 r0 = (xk1.C66352v0) r0
                android.widget.EditText r0 = r0.f190998j
                r2 = 0
                if (r0 == 0) goto L_0x0074
                android.text.Editable r0 = r0.getText()
                if (r0 == 0) goto L_0x0074
                java.lang.String r0 = r0.toString()
                goto L_0x0075
            L_0x0074:
                r0 = r2
            L_0x0075:
                r3 = 0
                if (r0 == 0) goto L_0x0080
                int r0 = r0.length()
                if (r0 != 0) goto L_0x007f
                goto L_0x0080
            L_0x007f:
                r1 = 0
            L_0x0080:
                if (r1 == 0) goto L_0x009a
                xk1.u0 r0 = r6.f190991d
                qk1.a r1 = r0.f190990n
                int r1 = r1.getItemCount()
                if (r1 <= 0) goto L_0x009a
                android.widget.LinearLayout r0 = r0.f190986g
                if (r0 == 0) goto L_0x0094
                r0.setVisibility(r3)
                goto L_0x009a
            L_0x0094:
                java.lang.String r0 = "container"
                gy3.C87412m.m108603p(r0)
                throw r2
            L_0x009a:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: xk1.C66350u0.C66351a.invoke():java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66350u0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = getActivity().findViewById(C0966R.C0970id.g1f);
        C87412m.m108593f(findViewById, "activity.findViewById(R.id.ll_recent_play)");
        this.f190986g = (LinearLayout) findViewById;
        View findViewById2 = getActivity().findViewById(C0966R.C0970id.ifk);
        C87412m.m108593f(findViewById2, "activity.findViewById(R.id.recent_play_rl_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        this.f190987h = recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));
        RecyclerView recyclerView2 = this.f190987h;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f190990n);
            this.f190990n.f179294e = new C66345r0(this);
            RecyclerView recyclerView3 = this.f190987h;
            if (recyclerView3 != null) {
                recyclerView3.mo17085h0(new C66347s0(this));
                RecyclerView recyclerView4 = this.f190987h;
                if (recyclerView4 != null) {
                    C23564m.m28137g(recyclerView4, new C66348t0());
                    this.f190988i = new C60797c3("", "", 0, (C49712hj1) null, 12, (C8480h) null);
                    C86709a0.m107524d().mo123460f(this.f190988i);
                    C86709a0.m107524d().mo123455a(4140, this);
                    return;
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
            C87412m.m108603p("recyclerView");
            throw null;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C49110d81 d812;
        C86709a0.m107524d().mo123470p(4140, this);
        if (i == 0 && i2 == 0) {
            C60797c3 c3Var = yVar instanceof C60797c3 ? (C60797c3) yVar : null;
            if (!(c3Var == null || (d812 = c3Var.f173168i) == null)) {
                this.f190989j.addAll(d812.f132181d);
            }
        }
        Log.m105924i("Finder.FinderGameLiveRecentPlayUIC", "recentPlayList.size:" + this.f190989j.size());
        C61926c.m72668M(new C66351a(this));
    }
}
