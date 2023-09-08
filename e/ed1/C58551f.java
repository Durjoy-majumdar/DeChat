package ed1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bd1.C54446b;
import bl3.C39818r;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C7446m0;
import f40.C86709a0;
import gd1.C45905a;
import gy3.C87412m;
import ht1.C60177j4;
import ht1.C60200t1;
import ht1.C8786n1;
import ht1.C8794p5;
import it1.C9247b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import lc3.C10485b;
import nj3.C76912y0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C90363p0;
import te3.C50009jm1;
import te3.C50119ke1;
import te3.C50542nh0;
import te3.C51141rq3;
import te3.C64586nn1;
import tf0.C13883o1;
import zc1.C66785b;

/* renamed from: ed1.f */
public final class C58551f extends UIComponent implements C8786n1 {

    /* renamed from: d */
    public View f167590d;

    /* renamed from: e */
    public C104428a f167591e;

    /* renamed from: f */
    public C9247b f167592f;

    /* renamed from: g */
    public List<? extends C54446b> f167593g;

    /* renamed from: h */
    public ArrayList<C45905a> f167594h;

    /* renamed from: i */
    public WxRecyclerAdapter<C45905a> f167595i;

    /* renamed from: j */
    public final C58547b f167596j = new C58547b();

    /* renamed from: n */
    public C51141rq3 f167597n;

    /* renamed from: o */
    public String f167598o;

    /* renamed from: p */
    public int f167599p;

    /* renamed from: q */
    public boolean f167600q;

    /* renamed from: r */
    public final C58552a f167601r = new C58552a(this);

    /* renamed from: ed1.f$a */
    public static final class C58552a implements C8794p5<C50009jm1> {

        /* renamed from: d */
        public final /* synthetic */ C58551f f167602d;

        public C58552a(C58551f fVar) {
            this.f167602d = fVar;
        }

        /* renamed from: c5 */
        public void mo705c5(Object obj, C50542nh0 nh02) {
            C50009jm1 jm12 = (C50009jm1) obj;
            C87412m.m108594g(jm12, "req");
            C87412m.m108594g(nh02, "ret");
            Log.m105924i("FinderAccountSwitchUIC", "switchAccountCallback, " + nh02.f138603e);
            C9247b bVar = this.f167602d.f167592f;
            if (bVar != null) {
                bVar.mo8913b();
            }
            if (nh02.f138603e == 0) {
                String str = jm12.f136196d;
                if (str == null) {
                    str = "";
                }
                this.f167602d.f167598o = str;
                C66785b.f191882e.mo90667X1(str);
                C58551f fVar = this.f167602d;
                fVar.getClass();
                ((C60177j4) C39818r.f106831a.mo62444c(fVar.getActivity()).mo62447c(C60177j4.class)).mo12645O();
                C76912y0.m92773l(this.f167602d.getContext(), this.f167602d.getResources().getString(C0966R.string.f360786mp2));
                return;
            }
            C76912y0.m92773l(this.f167602d.getContext(), this.f167602d.getResources().getString(C0966R.string.f360787mp3));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58551f(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: o2 */
    public void mo9623o2(C50119ke1 ke12) {
        C50119ke1 ke13 = ke12;
        C66785b bVar = C66785b.f191882e;
        this.f167598o = bVar.mo90662O5();
        int i = 1;
        this.f167593g = C110818d0.m150936h0(bVar.mo90668b2(true));
        this.f167599p = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderMultiUserQuota", 2);
        List<? extends C54446b> list = this.f167593g;
        int size = list != null ? list.size() : 0;
        Integer num = null;
        this.f167597n = ke13 != null ? ke13.f136687D : null;
        boolean z = ke13 != null && ke13.f136688E == 1;
        this.f167600q = z;
        if (size >= 2 || z) {
            View view = this.f167590d;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUIC", "refreshAccountSwitch", "(Lcom/tencent/mm/protocal/protobuf/FinderNewUserPrepareResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUIC", "refreshAccountSwitch", "(Lcom/tencent/mm/protocal/protobuf/FinderNewUserPrepareResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C87412m.m108603p("switchLayout");
                throw null;
            }
        } else {
            View view3 = this.f167590d;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUIC", "refreshAccountSwitch", "(Lcom/tencent/mm/protocal/protobuf/FinderNewUserPrepareResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUIC", "refreshAccountSwitch", "(Lcom/tencent/mm/protocal/protobuf/FinderNewUserPrepareResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C87412m.m108603p("switchLayout");
                throw null;
            }
        }
        C64586nn1 d6 = ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77262d6("FinderSwitchAccount", this.f167598o);
        C7446m0 m0Var = C7446m0.f25635a;
        View view5 = this.f167590d;
        if (view5 != null) {
            if (d6 == null) {
                i = 0;
            }
            C7446m0.m7572b(m0Var, view5, "switch_account", 0, 0, C90363p0.m113143b(new C13604l("is_red_dot", Integer.valueOf(i))), 12, (Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append("[refreshAccountSwitch] curUserName:");
            sb.append(this.f167598o);
            sb.append(" account.size:");
            List<? extends C54446b> list2 = this.f167593g;
            if (list2 != null) {
                num = Integer.valueOf(list2.size());
            }
            sb.append(num);
            Log.m105924i("FinderAccountSwitchUIC", sb.toString());
            return;
        }
        C87412m.m108603p("switchLayout");
        throw null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105924i("FinderAccountSwitchUIC", "onActivityResult, requestCode:" + i + ", resultCode:" + i2);
        if (i != 702) {
            if (i == 11103 || i == 11104) {
                ((C60177j4) C39818r.f106831a.mo62444c(getActivity()).mo62447c(C60177j4.class)).mo12646Y0();
            }
        } else if (i2 == -1) {
            ((C13883o1) C86312j.m106911c(C13883o1.class)).Mc0(getActivity(), intent, 11103);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(C0966R.C0970id.n7k);
        C87412m.m108593f(findViewById, "findViewById(com.tencent…id.finder_account_switch)");
        this.f167590d = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.n7m);
        C87412m.m108593f(findViewById2, "findViewById(com.tencent…finder_account_switch_tv)");
        C85875k4.m106191k0(((TextView) findViewById2).getPaint());
        View view = this.f167590d;
        if (view != null) {
            view.setOnClickListener(new C58549d(this));
            mo9623o2((C50119ke1) null);
            return;
        }
        C87412m.m108603p("switchLayout");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58551f(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
