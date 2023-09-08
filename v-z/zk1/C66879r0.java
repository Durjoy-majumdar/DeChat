package zk1;

import al1.C54129i;
import android.util.Base64;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.live.FinderLivePresenter;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eg1.C58597v;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import je1.C46526n3;
import o40.C61926c;
import pe3.C89349b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C51652v61;
import te3.C52005xq0;

/* renamed from: zk1.r0 */
public final class C66879r0 extends UIComponent {

    /* renamed from: d */
    public final String f192128d = ("FinderLiveVisitorLoadDataUIC@" + hashCode() + '}');

    /* renamed from: e */
    public C51652v61 f192129e;

    /* renamed from: f */
    public C89349b f192130f;

    /* renamed from: g */
    public boolean f192131g;

    /* renamed from: h */
    public FinderLivePresenter f192132h;

    /* renamed from: i */
    public final C13601g f192133i = C36568h.m40985a(C39366a.f105795d);

    /* renamed from: zk1.r0$a */
    public static final class C39366a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C39366a f105795d = new C39366a();

        public C39366a() {
            super(0);
        }

        public Object invoke() {
            return C32444a.f86115Y.mo60266n();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66879r0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo90872c3(C46526n3 n3Var) {
        C87412m.m108594g(n3Var, "netScene");
        C51652v61 v612 = this.f192129e;
        C89349b bVar = this.f192130f;
        if (v612 != null && bVar != null) {
            String str = this.f192128d;
            Log.m105924i(str, "fillRelatedCgi pullType:" + v612.f143343e + ", liveCookies:" + Base64.encodeToString(bVar.mo123703f(), 0));
            n3Var.mo71876o1().f134767E = bVar;
            this.f192129e = null;
            this.f192130f = null;
        }
    }

    /* renamed from: d3 */
    public final int mo90873d3() {
        return ((Number) ((C36570n) this.f192133i).getValue()).intValue();
    }

    /* renamed from: e3 */
    public final void mo90874e3(C52005xq0 xq02) {
        FinderLivePresenter finderLivePresenter;
        RefreshLoadMoreLayout M;
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        boolean z = true;
        if (mo90873d3() == 1 && this.f192131g) {
            byte[] bArr = null;
            this.f192129e = xq02 != null ? xq02.f144838Z0 : null;
            this.f192130f = xq02 != null ? xq02.f144842d : null;
            C32444a aVar = C32444a.f86121a;
            long j = 0;
            if (C32444a.f86118Z.mo60266n().intValue() == 1) {
                Log.m105924i(this.f192128d, "FINDER_LIVE_LOAD_DATA_NEW_STRATEGY_BAN_PRELOAD preload_flag 0");
                C51652v61 v612 = this.f192129e;
                if (v612 != null) {
                    v612.f143342d = 0;
                }
            }
            String str = this.f192128d;
            StringBuilder sb = new StringBuilder();
            sb.append("onJoinLiveResp preload_flag:");
            C51652v61 v613 = this.f192129e;
            sb.append(v613 != null ? Long.valueOf(v613.f143342d) : null);
            sb.append(" pullType:");
            C51652v61 v614 = this.f192129e;
            sb.append(v614 != null ? Integer.valueOf(v614.f143343e) : null);
            sb.append(", liveCookies:");
            C89349b bVar = this.f192130f;
            if (bVar != null) {
                bArr = bVar.mo123703f();
            }
            int i = 0;
            sb.append(Base64.encodeToString(bArr, 0));
            Log.m105924i(str, sb.toString());
            this.f192131g = false;
            C51652v61 v615 = this.f192129e;
            if (v615 != null) {
                j = v615.f143342d;
            }
            boolean v = C61926c.m72697v(j, 1);
            FinderLivePresenter finderLivePresenter2 = this.f192132h;
            boolean z2 = finderLivePresenter2 != null ? finderLivePresenter2.f159181g : false;
            String str2 = this.f192128d;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("checkCanAutoPreload ");
            sb4.append(v);
            sb4.append(", ");
            sb4.append(!z2);
            Log.m105924i(str2, sb4.toString());
            if (!v || z2) {
                z = false;
            }
            if (z && (finderLivePresenter = this.f192132h) != null) {
                Log.m105924i("FinderLivePresenter", "preloadFirstPageData");
                C54129i q = finderLivePresenter.mo77507q();
                int c = q != null ? q.mo74925c() : 0;
                C58597v vVar = finderLivePresenter.f159179e;
                if (!(vVar == null || (M = vVar.mo77517M()) == null || (recyclerView = M.getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null)) {
                    i = adapter.getItemCount();
                }
                FinderLiveService.f159376d.getClass();
                finderLivePresenter.mo77496b1(c, i, FinderLiveService.f159348A);
            }
        }
    }
}
