package zk1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C8763e3;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import rn1.C13091a;
import up1.C37521f;

/* renamed from: zk1.p0 */
public final class C16274p0 extends UIComponent implements C8763e3 {

    /* renamed from: d */
    public static int f43566d;

    /* renamed from: zk1.p0$a */
    public static final class C16275a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C16274p0 f43567d;

        public C16275a(C16274p0 p0Var) {
            this.f43567d = p0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveSelfUIC$refreshLiveOrder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("ORDER_FROM_SCENE", 1);
            C13091a.f37264a.mo12593a(this.f43567d.getActivity(), intent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveSelfUIC$refreshLiveOrder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16274p0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C37521f.f99374d.getClass();
        if (C37521f.f99173F8.mo60266n().intValue() == 1) {
            f43566d = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_SELF_UI_SHOW_ORDER_INT_SYNC, 0);
        }
        mo9591w2(f43566d, true);
    }

    /* renamed from: w2 */
    public void mo9591w2(int i, boolean z) {
        f43566d = i;
        Log.m105924i("FinderLiveSelfUIC", "flag:" + i + ", isFromCache:" + z);
        if (!z) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_SELF_UI_SHOW_ORDER_INT_SYNC, Integer.valueOf(i));
        }
        View findViewById = findViewById(C0966R.C0970id.fes);
        if (findViewById != null) {
            C37521f.f99374d.getClass();
            if (C37521f.f99563y0.mo60266n().intValue() == 1 && f43566d == 1) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveSelfUIC", "refreshLiveOrder", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveSelfUIC", "refreshLiveOrder", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setOnClickListener(new C16275a(this));
                return;
            }
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveSelfUIC", "refreshLiveOrder", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveSelfUIC", "refreshLiveOrder", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
