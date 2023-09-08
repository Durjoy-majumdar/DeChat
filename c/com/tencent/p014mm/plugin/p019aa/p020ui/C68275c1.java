package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.view.MaxHeightScrollView;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import di3.C86312j;
import e21.C75473a;
import eb0.C75592q0;
import j20.C117292a;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import p768ys.C79152e;
import qo3.C12925w;
import xz1.C79013a;
import xz1.C79014b;

/* renamed from: com.tencent.mm.plugin.aa.ui.c1 */
public class C68275c1 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ LaunchAAUI f196287d;

    /* renamed from: com.tencent.mm.plugin.aa.ui.c1$a */
    public class C68276a implements Comparator<C79013a> {
        public C68276a(C68275c1 c1Var) {
        }

        public int compare(Object obj, Object obj2) {
            C79014b bVar = ((C79013a) obj).f232007N.get(1);
            C79014b bVar2 = ((C79013a) obj2).f232007N.get(1);
            if (bVar == null || bVar2 == null) {
                return 0;
            }
            return Long.compare(bVar2.f232013d, bVar.f232013d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.c1$b */
    public class C68277b extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ C12925w f196288g;

        public C68277b(C68275c1 c1Var, C12925w wVar) {
            this.f196288g = wVar;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            this.f196288g.mo5085n();
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.c1$c */
    public class C68278c implements C75473a.C75475b {

        /* renamed from: a */
        public final /* synthetic */ C12925w f196289a;

        public C68278c(C12925w wVar) {
            this.f196289a = wVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.c1$d */
    public class C68279d implements C75473a.C75474a {
        public C68279d() {
        }
    }

    public C68275c1(LaunchAAUI launchAAUI) {
        this.f196287d = launchAAUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        boolean z;
        View view;
        List<C79013a> rF = ((C79152e) C86312j.m106911c(C79152e.class)).mo109136rF(this.f196287d.f196141j, C75592q0.m90789s());
        Collections.sort(rF, new C68276a(this));
        C12925w wVar = new C12925w(this.f196287d);
        View inflate = View.inflate(this.f196287d.getContext(), C0966R.C0971layout.d0s, (ViewGroup) null);
        ((ImageView) inflate.findViewById(C0966R.C0970id.lme)).setOnClickListener(new C68277b(this, wVar));
        C85875k4.m106189j0(((TextView) inflate.findViewById(C0966R.C0970id.lmf)).getPaint(), 0.8f);
        View findViewById = inflate.findViewById(C0966R.C0970id.f357441hx3);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0966R.C0970id.f27);
        MaxHeightScrollView maxHeightScrollView = (MaxHeightScrollView) inflate.findViewById(C0966R.C0970id.ao8);
        maxHeightScrollView.setMaxHeight((C75044y4.m89990b(this.f196287d.getContext()).y * 2) / 3);
        if (rF.size() <= 0) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = findViewById;
            z = false;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/aa/ui/LaunchAAUI$56", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/aa/ui/LaunchAAUI$56", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            maxHeightScrollView.setVisibility(8);
            view = inflate;
        } else {
            z = false;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = findViewById;
            View view4 = inflate;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/aa/ui/LaunchAAUI$56", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/aa/ui/LaunchAAUI$56", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            maxHeightScrollView.setVisibility(0);
            C75473a aVar3 = new C75473a(this.f196287d.getContext());
            aVar3.f221788e = rF;
            aVar3.notifyDataSetChanged();
            recyclerView.setAdapter(aVar3);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f196287d));
            aVar3.f221790g = new C68278c(wVar);
            aVar3.f221789f = new C68279d();
            view = view4;
        }
        wVar.mo12471k(view);
        wVar.f36927f.setFocusable(z);
        wVar.mo5086o();
        return true;
    }
}
