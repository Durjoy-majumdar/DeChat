package mo1;

import android.app.Activity;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import dp1.C58363h;
import er1.C58684b;
import er1.C58784w3;
import er1.C7780a4;
import er1.C7928z3;
import fe1.C58969q;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p823sg.C101614i;
import qo3.C77426q;
import zc1.C66785b;

/* renamed from: mo1.k0 */
public final class C11012k0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f32732d;

    public C11012k0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
        this.f32732d = finderProfileHeaderUIC;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleMessageBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C58784w3 w3Var = C58784w3.f168295a;
        Activity context = this.f32732d.getContext();
        FinderProfileHeaderUIC finderProfileHeaderUIC = this.f32732d;
        C101614i<String, FinderProfileHeaderUIC.C3463b> iVar = FinderProfileHeaderUIC.f16192h1;
        C58969q profileContact = finderProfileHeaderUIC.getProfileContact();
        boolean z = false;
        int i = profileContact != null ? profileContact.field_extFlag : 0;
        w3Var.getClass();
        C87412m.m108594g(context, "context");
        if ((i & 64) != 0) {
            z = true;
        }
        if (z) {
            C77426q qVar = new C77426q(MMApplicationContext.getContext());
            qVar.mo107595g(context.getResources().getString(C0966R.string.f360713ec0));
            qVar.mo107589a(true);
            qVar.mo107601m(C0966R.string.lkg);
            qVar.mo107600l(C7928z3.f26614a);
            qVar.mo107593e(C7780a4.f26280d);
            qVar.mo107603o();
        }
        if (!z) {
            C58363h hVar = C58363h.f167137a;
            C58363h.C58364b bVar = C58363h.f167143g;
            bVar.mo83123c(C66785b.f191882e.mo90662O5(), "", this.f32732d.f16213S0);
            C58363h.C58364b.m67608a(bVar, this.f32732d.getContextObj(), 3, 2, (Long) null, 8, (Object) null);
            ((C58684b) C86312j.m106911c(C58684b.class)).Ro0(this.f32732d.getContext(), this.f32732d.f16213S0, 2);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleMessageBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
