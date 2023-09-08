package op1;

import ak1.C0073g0;
import ak1.C54108o;
import android.view.View;
import c30.C104289g;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import sk1.C48416t;
import te3.C50626o21;

/* renamed from: op1.m */
public final class C62106m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C104289g f176606d;

    /* renamed from: e */
    public final /* synthetic */ C48416t f176607e;

    /* renamed from: f */
    public final /* synthetic */ C62084h f176608f;

    public C62106m(C104289g gVar, C48416t tVar, C62084h hVar) {
        this.f176606d = gVar;
        this.f176607e = tVar;
        this.f176608f = hVar;
    }

    public final void onClick(View view) {
        FinderJumpInfo finderJumpInfo;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$bindRetentionItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f176606d.mo145953n("click_type", 1);
        this.f176606d.mo145953n("type", 18);
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_ANCHOR_ACTION_COMMERCE, this.f176606d.toString(), (String) null, 4, (Object) null);
        C50626o21 o212 = this.f176607e.f129597d.f139534d;
        if (!(o212 == null || (finderJumpInfo = o212.f138912d) == null)) {
            C62084h hVar = this.f176608f;
            finderJumpInfo.business_type = 36;
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76780ML(hVar.f176531e, finderJumpInfo, 0);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$bindRetentionItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
