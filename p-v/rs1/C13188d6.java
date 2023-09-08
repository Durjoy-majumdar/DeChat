package rs1;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C54492n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import o40.C61926c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vp1.C65834e;
import ye1.C15978r;

/* renamed from: rs1.d6 */
public final class C13188d6 extends UIComponent {

    /* renamed from: d */
    public final C13601g f37505d = C36568h.m40985a(new C13189a(this));

    /* renamed from: e */
    public FinderItem f37506e;

    /* renamed from: rs1.d6$a */
    public static final class C13189a extends C87413o implements C32224a<C15978r> {

        /* renamed from: d */
        public final /* synthetic */ C13188d6 f37507d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13189a(C13188d6 d6Var) {
            super(0);
            this.f37507d = d6Var;
        }

        public Object invoke() {
            return C15978r.m14889a(this.f37507d.getRootView());
        }
    }

    /* renamed from: rs1.d6$b */
    public static final class C13190b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13188d6 f37508d;

        public C13190b(C13188d6 d6Var) {
            this.f37508d = d6Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderImmersiveFeedUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f37508d.getActivity().finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderImmersiveFeedUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13188d6(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.byx;
    }

    public void onCreate(Bundle bundle) {
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        View decorView = getActivity().getWindow().getDecorView();
        C87412m.m108593f(decorView, "activity.window.decorView");
        decorView.setSystemUiVisibility(1280);
        C74779i.m89536a(getActivity(), false);
        ActionBar supportActionBar2 = getActivity().getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.mo91112w(new ColorDrawable(0));
            supportActionBar2.mo91104o();
        }
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).getController().mo177105z0(getResources().getColor(C0966R.color.ahf));
        super.onCreate(bundle);
        ((C15978r) ((C36570n) this.f37505d).getValue()).f42969c.setOnClickListener(new C13190b(this));
    }

    public void onCreateBefore(Bundle bundle) {
        super.onCreateBefore(bundle);
        long longExtra = getIntent().getLongExtra("intent_feed_id", 0);
        FinderItem e = C65834e.f189316a.mo89871e(longExtra);
        if (e == null) {
            Log.m105920e(C54492n.TAG, "feedId=" + C61926c.m72691p(longExtra) + " not found in FinderCache.");
            getActivity().finish();
            return;
        }
        this.f37506e = e;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13188d6(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
