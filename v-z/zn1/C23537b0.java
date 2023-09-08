package zn1;

import a14.C0000n0;
import a14.C53930o0;
import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.playlist.FinderPlayListPresenter$getAdapter$1;
import com.tencent.p014mm.plugin.finder.view.FinderRefreshLayout;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import pe3.C89349b;

/* renamed from: zn1.b0 */
public final class C23537b0 extends UIComponent {

    /* renamed from: d */
    public C23541z f67494d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23537b0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d2c;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f67494d = new C23541z(getContext());
        Activity context = getContext();
        C23541z zVar = this.f67494d;
        if (zVar != null) {
            C23538d0 d0Var = new C23538d0(context, zVar);
            C23541z zVar2 = this.f67494d;
            if (zVar2 != null) {
                zVar2.f67512f = zVar2.f67507a.getIntent().getStringExtra("finder_username");
                byte[] byteArrayExtra = zVar2.f67507a.getIntent().getByteArrayExtra("KEY_LAST_BUFFER");
                if (byteArrayExtra != null) {
                    zVar2.f67513g = new C89349b(byteArrayExtra, 0, byteArrayExtra.length);
                }
                zVar2.f67509c = d0Var;
                View findViewById = d0Var.f67495a.findViewById(C0966R.C0970id.ivb);
                C87412m.m108593f(findViewById, "context.findViewById(R.id.rl_layout)");
                d0Var.f67497c = (FinderRefreshLayout) findViewById;
                FinderProfileLoaderMoreFooter finderProfileLoaderMoreFooter = new FinderProfileLoaderMoreFooter(d0Var.f67495a, (AttributeSet) null);
                finderProfileLoaderMoreFooter.removeAllViews();
                View.inflate(finderProfileLoaderMoreFooter.getContext(), C0966R.C0971layout.ctn, finderProfileLoaderMoreFooter);
                d0Var.mo36998d().mo26641y(finderProfileLoaderMoreFooter);
                View findViewById2 = d0Var.f67495a.findViewById(C0966R.C0970id.iiq);
                C87412m.m108593f(findViewById2, "context.findViewById(R.id.recycler_view)");
                d0Var.f67498d = (WxRecyclerView) findViewById2;
                d0Var.mo36996b().setHasFixedSize(true);
                d0Var.mo36996b().setItemViewCacheSize(4);
                RecyclerView.C16616j itemAnimator = d0Var.mo36996b().getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.f44810f = 0;
                }
                d0Var.mo36996b().setLayoutManager(new FinderLinearLayoutManager(d0Var.f67495a));
                WxRecyclerView b = d0Var.mo36996b();
                C23541z zVar3 = d0Var.f67496b;
                zVar3.getClass();
                WxRecyclerAdapter<?> wxRecyclerAdapter = new WxRecyclerAdapter<>(new FinderPlayListPresenter$getAdapter$1(), zVar3.f67508b, false);
                zVar3.f67510d = wxRecyclerAdapter;
                wxRecyclerAdapter.f173488o = new C16342x(zVar3);
                b.setAdapter(wxRecyclerAdapter);
                View findViewById3 = d0Var.f67495a.findViewById(C0966R.C0970id.noo);
                C87412m.m108593f(findViewById3, "context.findViewById(R.i…_loading_state_container)");
                d0Var.f67499e = (FrameLayout) findViewById3;
                View findViewById4 = d0Var.f67495a.findViewById(C0966R.C0970id.kne);
                C87412m.m108593f(findViewById4, "context.findViewById(R.id.tips_loading)");
                d0Var.f67500f = findViewById4;
                View findViewById5 = d0Var.f67495a.findViewById(C0966R.C0970id.knh);
                C87412m.m108593f(findViewById5, "context.findViewById(R.id.tips_no_content)");
                d0Var.f67501g = findViewById5;
                View findViewById6 = d0Var.f67495a.findViewById(C0966R.C0970id.knl);
                C87412m.m108593f(findViewById6, "context.findViewById(R.id.tips_retry)");
                d0Var.f67502h = findViewById6;
                C23538d0 d0Var2 = zVar2.f67509c;
                if (d0Var2 != null) {
                    d0Var2.mo36998d().setOnSimpleAction(new C23540y(zVar2));
                    C23538d0 d0Var3 = zVar2.f67509c;
                    if (d0Var3 != null) {
                        d0Var3.mo36999e();
                        zVar2.mo37001b();
                        return;
                    }
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C23541z zVar = this.f67494d;
        if (zVar != null) {
            C0000n0 n0Var = zVar.f67511e;
            C53930o0.m60557d(n0Var, zVar + " onDetach", (Throwable) null, 2, (Object) null);
            return;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23537b0(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
