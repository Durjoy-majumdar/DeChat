package cj1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d50.C58115i;
import d60.C58124b;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j50.C60735a;
import o40.C61926c;
import p447aw.C103918d;
import p447aw.C54369c;
import rx3.C13598b0;
import vc3.C78382a;

/* renamed from: cj1.r4 */
public final class C54808r4 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f153642d;

    /* renamed from: e */
    public final /* synthetic */ Context f153643e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54808r4(boolean z, Context context) {
        super(0);
        this.f153642d = z;
        this.f153643e = context;
    }

    public Object invoke() {
        C54991o oVar;
        C58115i iVar;
        C58115i iVar2;
        Class cls = C54991o.class;
        StringBuilder sb = new StringBuilder();
        sb.append("controlLiveMiniWindowVisibility, visible:");
        sb.append(this.f153642d);
        sb.append(", isLiveStarted:");
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C54991o oVar2 = (C54991o) finderLiveService.mo77630e(cls);
        Boolean bool = null;
        sb.append(oVar2 != null ? Boolean.valueOf(oVar2.mo75999e4()) : null);
        sb.append(", isLiveFinish:");
        C54991o oVar3 = (C54991o) finderLiveService.mo77630e(cls);
        sb.append(oVar3 != null ? Boolean.valueOf(oVar3.mo75997d4()) : null);
        sb.append(", isNormalMode:");
        C60735a aVar = FinderLiveService.f159378f;
        if (!(aVar == null || (iVar2 = aVar.f172989A) == null)) {
            bool = Boolean.valueOf(iVar2.mo82886h());
        }
        sb.append(bool);
        sb.append(", isRequestPermission:");
        C54991o oVar4 = (C54991o) finderLiveService.mo77630e(cls);
        boolean z = false;
        sb.append(C61926c.m72696u(oVar4 != null ? oVar4.f154291a1 : 0, 2048));
        Log.m105924i("Finder.FinderLiveService", sb.toString());
        if (this.f153642d) {
            C54991o oVar5 = (C54991o) finderLiveService.mo77630e(cls);
            if (oVar5 != null && oVar5.mo75999e4()) {
                C54991o oVar6 = (C54991o) finderLiveService.mo77630e(cls);
                if (oVar6 != null && !oVar6.mo75997d4()) {
                    C60735a aVar2 = FinderLiveService.f159378f;
                    if ((aVar2 == null || (iVar = aVar2.f172989A) == null || !iVar.mo82886h()) ? false : true) {
                        C54991o oVar7 = (C54991o) finderLiveService.mo77630e(cls);
                        if (!C61926c.m72696u(oVar7 != null ? oVar7.f154291a1 : 0, 2048)) {
                            C54991o oVar8 = (C54991o) finderLiveService.mo77630e(cls);
                            if ((oVar8 != null && oVar8.f154301c3) && (oVar = (C54991o) finderLiveService.mo77630e(cls)) != null) {
                                oVar.f154284Y2 = 0;
                            }
                            Context context = this.f153643e;
                            if (context == null) {
                                context = MMApplicationContext.getContext();
                            }
                            Context context2 = context;
                            C87412m.m108593f(context2, "context ?: MMApplicationContext.getContext()");
                            if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125776TW(context2, 21)) {
                                Log.m105920e("Finder.FinderLiveService", "showVideoTalking, permission denied");
                                C45795b bVar = FinderLiveService.f159348A;
                                if (bVar != null) {
                                    finderLiveService.mo77623Z(bVar, finderLiveService.mo77626b() != null, C58124b.C58125b.MINI_WINDOW_PERMISSION, (Bundle) null, ((C55001u) bVar.mo71262a(C55001u.class)).f154420q.f182392d);
                                }
                                ((C54369c) C86312j.m106911c(C54369c.class)).ff0(context2, 21, context2.getString(C0966R.string.g_k), new C54762g5(context2), !(context2 instanceof Activity), C78382a.m94650b());
                            } else {
                                Bundle bundle = new Bundle();
                                C54991o oVar9 = (C54991o) finderLiveService.mo77630e(cls);
                                if (oVar9 != null && oVar9.f154383x0) {
                                    z = true;
                                }
                                bundle.putBoolean("PARAM_FINDER_LIVE_FORCE_TASK", z);
                                bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 3);
                                bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 13);
                                finderLiveService.mo77618U(bundle, context2);
                            }
                        }
                    }
                }
            }
        } else {
            C60735a aVar3 = FinderLiveService.f159378f;
            if (aVar3 != null) {
                aVar3.mo85693l0();
            }
        }
        return C13598b0.f38549a;
    }
}
