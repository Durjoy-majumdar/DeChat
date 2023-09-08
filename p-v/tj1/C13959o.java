package tj1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import cl1.C0700z;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.plugin.view.gift.FinderLiveLevelProgressView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fj1.C45795b;
import gg1.C32444a;
import gy3.C8479f0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import ok1.C62042e;
import p565ir.C60606n;
import te3.C51909x11;
import te3.C64273c21;
import wf1.C15193l;

/* renamed from: tj1.o */
public final class C13959o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<C51909x11> f39203d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveLevelProgressView f39204e;

    /* renamed from: f */
    public final /* synthetic */ C51909x11 f39205f;

    /* renamed from: g */
    public final /* synthetic */ boolean f39206g;

    public C13959o(C8479f0<C51909x11> f0Var, FinderLiveLevelProgressView finderLiveLevelProgressView, C51909x11 x112, boolean z) {
        this.f39203d = f0Var;
        this.f39204e = finderLiveLevelProgressView;
        this.f39205f = x112;
        this.f39206g = z;
    }

    public final void onClick(View view) {
        String str;
        C0700z zVar;
        LiveMutableData<Boolean> c3;
        String str2;
        C64273c21 c212;
        C64273c21 c213;
        Class cls = C55001u.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveLevelProgressView$update$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C51909x11 x112 = (C51909x11) this.f39203d.f27484d;
        C15193l.f41362N = x112 != null ? x112.f144398d : 0;
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C55001u uVar = (C55001u) finderLiveService.mo77630e(cls);
        C15193l.f41363P = uVar != null ? uVar.f154417n : null;
        C55001u uVar2 = (C55001u) finderLiveService.mo77630e(cls);
        long j = 0;
        C15193l.f41364Q = uVar2 != null ? uVar2.f154416j : 0;
        C55001u uVar3 = (C55001u) finderLiveService.mo77630e(cls);
        C15193l.f41365R = (uVar3 == null || (c213 = uVar3.f154420q) == null) ? 0 : c213.f182392d;
        finderLiveService.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        C15193l.f41366S = bVar != null ? C62042e.f176370a.mo87031P(bVar) : 2;
        C55001u uVar4 = (C55001u) finderLiveService.mo77630e(cls);
        String str3 = "";
        if (uVar4 == null || (str = uVar4.f154423t) == null) {
            str = str3;
        }
        C15193l.f41367T = str;
        String str4 = this.f39204e.f15192d;
        Log.m105924i(str4, "FinderLiveGiftPkgUIC.currentLevel = " + C15193l.f41362N);
        C32444a aVar = C32444a.f86121a;
        if (((Boolean) C32444a.f86055F2.mo60266n()).booleanValue()) {
            Activity activity = AppForegroundDelegate.INSTANCE.mo174211e().get();
            if (activity != null) {
                ((C60606n) C86312j.m106911c(C60606n.class)).mo85070k4(activity, (Intent) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveLevelProgressView$update$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        String str5 = this.f39204e.f15192d;
        Log.m105924i(str5, "url: " + this.f39205f.f144401g);
        Uri.Builder buildUpon = Uri.parse(this.f39205f.f144401g).buildUpon();
        C87412m.m108593f(buildUpon, "parse(data.rights_detail_url).buildUpon()");
        C55001u uVar5 = (C55001u) finderLiveService.mo77630e(cls);
        if (!(uVar5 == null || (c212 = uVar5.f154420q) == null)) {
            j = c212.f182392d;
        }
        buildUpon.appendQueryParameter("live_id", String.valueOf(j));
        C54991o oVar = (C54991o) finderLiveService.mo77630e(C54991o.class);
        if (!(oVar == null || (str2 = oVar.f154345o) == null)) {
            str3 = str2;
        }
        buildUpon.appendQueryParameter("finder_username", str3);
        buildUpon.appendQueryParameter("pack_entrance", "1");
        if (this.f39206g) {
            buildUpon.appendQueryParameter("float_msg", "1");
        }
        String uri = buildUpon.build().toString();
        C87412m.m108593f(uri, "builder.build().toString()");
        Intent intent = new Intent();
        intent.putExtra("rawUrl", uri);
        intent.putExtra("convertActivityFromTranslucent", true);
        C88144b.m109795m(this.f39204e.getContext(), "webview", ".ui.tools.WebViewUI", intent, 1016);
        if (!(finderLiveService == null || (zVar = (C0700z) finderLiveService.mo77630e(C0700z.class)) == null || (c3 = zVar.mo665c3()) == null)) {
            c3.postValue(Boolean.FALSE);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveLevelProgressView$update$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
