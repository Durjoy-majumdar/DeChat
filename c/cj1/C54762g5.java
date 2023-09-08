package cj1;

import android.content.Context;
import android.os.Bundle;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;
import d60.C58124b;
import fj1.C45795b;

/* renamed from: cj1.g5 */
public final class C54762g5 implements AbsRequestFloatWindowPermissionDialog.C85613a {

    /* renamed from: a */
    public final /* synthetic */ Context f153484a;

    public C54762g5(Context context) {
        this.f153484a = context;
    }

    /* renamed from: a */
    public void mo247a(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        Bundle bundle = new Bundle();
        Context context = this.f153484a;
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C54991o oVar = (C54991o) finderLiveService.mo77630e(C54991o.class);
        boolean z = true;
        bundle.putBoolean("PARAM_FINDER_LIVE_FORCE_TASK", oVar != null && oVar.f154383x0);
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 3);
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 13);
        finderLiveService.mo77618U(bundle, context);
        finderLiveService.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        if (bVar != null) {
            if (finderLiveService.mo77626b() == null) {
                z = false;
            }
            finderLiveService.mo77623Z(bVar, z, C58124b.C58125b.MINI_WINDOW, bundle, ((C55001u) bVar.mo71262a(C55001u.class)).f154420q.f182392d);
        }
    }

    /* renamed from: b */
    public void mo248b(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        Bundle bundle = new Bundle();
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        if (bVar != null) {
            finderLiveService.mo77623Z(bVar, finderLiveService.mo77626b() != null, C58124b.C58125b.MINI_WINDOW_CANCEL, bundle, ((C55001u) bVar.mo71262a(C55001u.class)).f154420q.f182392d);
        }
    }

    /* renamed from: c */
    public void mo249c(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        Bundle bundle = new Bundle();
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        if (bVar != null) {
            finderLiveService.mo77623Z(bVar, finderLiveService.mo77626b() != null, C58124b.C58125b.MINI_WINDOW_REFUSE, bundle, ((C55001u) bVar.mo71262a(C55001u.class)).f154420q.f182392d);
        }
    }
}
