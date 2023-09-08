package op1;

import ak1.C54067f0;
import ak1.C54116w;
import android.view.View;
import c30.C104289g;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.MiniAppInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import p185kq.C10383h;
import sk1.C48416t;
import t91.C64208c;
import te3.C50626o21;

/* renamed from: op1.n */
public final class C62107n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C48416t f176609d;

    /* renamed from: e */
    public final /* synthetic */ C62084h f176610e;

    /* renamed from: f */
    public final /* synthetic */ C104289g f176611f;

    public C62107n(C48416t tVar, C62084h hVar, C104289g gVar) {
        this.f176609d = tVar;
        this.f176610e = hVar;
        this.f176611f = gVar;
    }

    public final void onClick(View view) {
        FinderJumpInfo finderJumpInfo;
        String str;
        Class cls = C10383h.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$bindRetentionItem$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C58739j4.f168176a.mo83683L()) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$bindRetentionItem$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C50626o21 o212 = this.f176609d.f129597d.f139534d;
        if (!(o212 == null || (finderJumpInfo = o212.f138912d) == null)) {
            C62084h hVar = this.f176610e;
            C104289g gVar = this.f176611f;
            C64208c.C64209a aVar = C64208c.f181951a;
            String obj = Util.getUuidRandom().toString();
            MiniAppInfo miniAppInfo = finderJumpInfo.mini_app_info;
            if (miniAppInfo == null || (str = miniAppInfo.app_id) == null) {
                str = "";
            }
            aVar.mo89033h(obj, str, ((C10383h) C86312j.m106911c(cls)).mo10700XQ(((C55001u) hVar.f176533g.mo71262a(C55001u.class)).f154420q.f182392d), "", ((C10383h) C86312j.m106911c(cls)).mo10700XQ(((C54991o) hVar.f176533g.mo71262a(C54991o.class)).f154325i1));
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.Rx0((C54116w) c, C54067f0.C54081r0.CommerceActionRetentionItemClick, (String) null, "", (String) null, (String) null, (String) null, 0, 0, gVar, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (Object) null);
            finderJumpInfo.business_type = 36;
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76780ML(hVar.f176531e, finderJumpInfo, 0);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$bindRetentionItem$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
