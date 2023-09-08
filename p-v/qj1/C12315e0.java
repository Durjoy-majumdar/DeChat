package qj1;

import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import cl1.C54991o;
import cl1.C55001u;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import er1.C7782b1;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import nj3.C76912y0;
import p185kq.C10383h;
import rx3.C13598b0;
import te3.C64426ho2;

/* renamed from: qj1.e0 */
public final class C12315e0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAnchorAfterPlugin f35478d;

    /* renamed from: e */
    public final /* synthetic */ FinderJumpInfo f35479e;

    /* renamed from: qj1.e0$a */
    public static final class C12316a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveAnchorAfterPlugin f35480d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12316a(FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin) {
            super(1);
            this.f35480d = finderLiveAnchorAfterPlugin;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                C76912y0.m92767f(this.f35480d.f166287d.getContext(), "请稍候重试");
            }
            return C13598b0.f38549a;
        }
    }

    public C12315e0(FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin, FinderJumpInfo finderJumpInfo) {
        this.f35478d = finderLiveAnchorAfterPlugin;
        this.f35479e = finderJumpInfo;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareDataItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = ((C54991o) this.f35478d.mo87696x0(C54991o.class)).f154345o;
        long j = ((C55001u) this.f35478d.mo87696x0(C55001u.class)).f154420q.f182392d;
        ((C54116w) C86312j.m106911c(C54116w.class)).getClass();
        C87412m.m108594g(str, "username");
        HashMap hashMap = new HashMap();
        hashMap.put("finder_username", str);
        hashMap.put("liveId", String.valueOf(j));
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        C54067f0.C0064m mVar = C54067f0.C0064m.LIVE_END_PAGE_LIVE_DETAIL;
        String E = ((C10383h) C86312j.m106911c(C10383h.class)).mo10696E();
        if (E == null) {
            E = "";
        }
        C8777j5.C8778a.m8607h(j5Var, mVar, hashMap, E, "1002", (String) null, 16, (Object) null);
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23057, liveid = " + ((String) hashMap.get("liveid")));
        Bundle bundle = new Bundle();
        C64426ho2 ho22 = this.f35479e.lite_app_info;
        String str2 = null;
        bundle.putString("appId", ho22 != null ? ho22.f183521d : null);
        C64426ho2 ho23 = this.f35479e.lite_app_info;
        if (ho23 != null) {
            str2 = ho23.f183523f;
        }
        bundle.putString(SearchIntents.EXTRA_QUERY, str2);
        bundle.putInt("nextAnimIn", C0966R.C0968anim.f2326n);
        bundle.putInt("currentAnimOut", C0966R.C0968anim.f2506eu);
        C7782b1 b1Var = C7782b1.f26282a;
        Context context = this.f35478d.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        b1Var.mo8894a(context, bundle, true, new C12316a(this.f35478d));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareDataItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
