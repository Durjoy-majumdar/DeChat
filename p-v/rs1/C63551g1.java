package rs1;

import android.content.DialogInterface;
import co1.C55048e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58741j5;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import jq3.C60905o;
import pl1.C62367r0;
import qo3.C77398g;
import te3.C64689rq2;
import wp1.C66167g;

/* renamed from: rs1.g1 */
public final class C63551g1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<String> f180236d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f180237e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<C77398g> f180238f;

    public C63551g1(LinkedList<String> linkedList, C60905o oVar, C8479f0<C77398g> f0Var) {
        this.f180236d = linkedList;
        this.f180237e = oVar;
        this.f180238f = f0Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Class cls = FinderCommonFeatureService.class;
        String str = this.f180236d.get(i);
        C87412m.m108593f(str, "specStringList[which]");
        String str2 = str;
        Log.m105924i("MicroMsg.FinderDebugUIC", "onClickOk spec:" + str2);
        C58741j5.f168184a.mo83727a();
        C66167g.f190173a.mo90233a();
        C55048e Hx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Hx0();
        Hx0.getClass();
        Hx0.f154536B = str2;
        FinderVideoLayout finderVideoLayout = (FinderVideoLayout) this.f180237e.f44854d.findViewById(C0966R.C0970id.d7a);
        FinderVideoLayout.C56521b bVar = finderVideoLayout.f161854J;
        if (bVar == null) {
            Log.m105928w(finderVideoLayout.getFTPPTag(), "retryFindSpecPlay return for playInfo null");
        } else {
            LinkedList<C64689rq2> linkedList = bVar.f161896e;
            FinderVideoLayout.C56521b bVar2 = finderVideoLayout.f161854J;
            C87412m.m108591d(bVar2);
            C64689rq2 rq22 = linkedList.get(bVar2.f161895d);
            C87412m.m108593f(rq22, "playInfo!!.mediaList[playInfo!!.position]");
            C64689rq2 rq23 = rq22;
            FinderVideoLayout.C56521b bVar3 = finderVideoLayout.f161854J;
            C87412m.m108591d(bVar3);
            long id = bVar3.f161892a.getId();
            String str3 = rq23.f185275p;
            if (str3 == null) {
                str3 = "";
            }
            C62367r0 t = finderVideoLayout.mo79595t(id, str3, rq23);
            FinderVideoLayout.C56521b bVar4 = finderVideoLayout.f161854J;
            C87412m.m108591d(bVar4);
            FeedData feedData = bVar4.f161892a;
            String b = t.mo11841b();
            FinderVideoLayout.C56521b bVar5 = finderVideoLayout.f161854J;
            C87412m.m108591d(bVar5);
            int i2 = bVar5.f161895d;
            LinkedList<C64689rq2> linkedList2 = finderVideoLayout.f161846B;
            FinderVideoLayout.C56521b bVar6 = finderVideoLayout.f161854J;
            C87412m.m108591d(bVar6);
            boolean z = bVar6.f161897f;
            C64689rq2 rq24 = t.f177253e;
            finderVideoLayout.f161854J = new FinderVideoLayout.C56521b(feedData, b, t, i2, linkedList2, z, true, false, false, rq24.f185280t ? rq24.f185281u : null, false, 1408, (C8480h) null);
            finderVideoLayout.getRetryBtn().performClick();
        }
        C77398g gVar = (C77398g) this.f180238f.f27484d;
        if (gVar != null) {
            gVar.setTitle((CharSequence) C13176d1.m12587e3(this.f180237e));
        }
        C55048e Hx02 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Hx0();
        Hx02.getClass();
        Hx02.f154536B = "";
    }
}
