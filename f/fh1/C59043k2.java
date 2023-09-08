package fh1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import android.view.ViewGroup;
import cl1.C54979h1;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32227p;
import gh1.C8313a;
import gy3.C87412m;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import o40.C61937h;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C48978cb0;
import te3.C49466fs3;
import te3.C49712hj1;
import te3.C50784p51;
import te3.C50917q51;
import tf0.C64916p1;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;

/* renamed from: fh1.k2 */
public final class C59043k2 extends C8313a {

    /* renamed from: j */
    public final String f168941j = "LivePromoteReportController";

    /* renamed from: n */
    public final List<C49466fs3> f168942n = Collections.synchronizedList(new LinkedList());

    /* renamed from: o */
    public C53973z1 f168943o;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LivePromoteReportController$report$4$1", mo125469f = "LivePromoteReportController.kt", mo125470l = {56}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.k2$a */
    public static final class C59044a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f168944d;

        /* renamed from: e */
        public final /* synthetic */ C50917q51 f168945e;

        /* renamed from: f */
        public final /* synthetic */ C59043k2 f168946f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59044a(C50917q51 q512, C59043k2 k2Var, C15601d<? super C59044a> dVar) {
            super(2, dVar);
            this.f168945e = q512;
            this.f168946f = k2Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59044a(this.f168945e, this.f168946f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59044a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f168944d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = ((long) this.f168945e.f140153e) * 1000;
                String str = this.f168946f.f168941j;
                Log.m105924i(str, "launch delay job, delay = " + j);
                this.f168944d = 1;
                if (C53965x0.m60607b(j, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = this.f168946f.f168941j;
            Log.m105924i(str2, "doReportInternal after " + this.f168945e.f140153e + "s, report size = " + this.f168946f.f168942n.size());
            this.f168946f.mo84258o3("after delay");
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59043k2(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: m3 */
    public final void mo84256m3(List<? extends C49466fs3> list) {
        Class cls = C55001u.class;
        if (!C62042e.f176370a.mo87027N0()) {
            C64916p1 p1Var = (C64916p1) C86312j.m106911c(C64916p1.class);
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.getClass();
            C56032b bVar = FinderLiveService.f159379g;
            String str = null;
            FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = bVar instanceof FinderLiveVisitorPluginLayout ? (FinderLiveVisitorPluginLayout) bVar : null;
            C49712hj1 reportObj = finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.getReportObj() : null;
            C45795b liveRoomData = getStore().getLiveRoomData();
            C48978cb0 cb02 = new C48978cb0();
            cb02.f131608e = C66785b.f191882e.mo90662O5();
            cb02.f131607d = ((C55001u) liveRoomData.mo71262a(cls)).f154416j;
            cb02.f131609f = ((C55001u) liveRoomData.mo71262a(cls)).f154424u;
            C50784p51 p512 = new C50784p51();
            LinkedList<C49466fs3> linkedList = new LinkedList<>();
            linkedList.addAll(list);
            p512.f139591d = linkedList;
            cb02.f131614n = p512;
            C55001u uVar = (C55001u) finderLiveService.mo77630e(cls);
            if (uVar != null) {
                str = uVar.f154424u;
            }
            p1Var.m90(reportObj, 5, cb02, str);
        }
    }

    /* renamed from: n3 */
    public final void mo84257n3(C49466fs3 fs32) {
        Class cls = C54979h1.class;
        C87412m.m108594g(fs32, "item");
        String str = this.f168941j;
        StringBuilder sb = new StringBuilder();
        sb.append("[report] extInfo = ");
        C50917q51 q512 = ((C54979h1) business(cls)).f154133Z;
        sb.append(q512 != null ? C61937h.m72709h(q512) : "null");
        Log.m105924i(str, sb.toString());
        C50917q51 q513 = ((C54979h1) business(cls)).f154133Z;
        C13598b0 b0Var = null;
        if (q513 != null) {
            boolean z = false;
            if (!(q513.f140153e > 0)) {
                q513 = null;
            }
            if (q513 != null) {
                if (!q513.f140152d) {
                    this.f168942n.add(fs32);
                    C53973z1 z1Var = this.f168943o;
                    if (z1Var != null) {
                        z = z1Var.mo74466a();
                    }
                    if (!z) {
                        Log.m105924i(this.f168941j, "no delay job, launch it");
                        this.f168943o = C53895h.m60466d(getStore().getLiveRoomData().f123702i, (C66212f) null, (C53934p0) null, new C59044a(q513, this, (C15601d<? super C59044a>) null), 3, (Object) null);
                    } else {
                        Log.m105924i(this.f168941j, "delay job running, so add to list enough");
                    }
                }
                b0Var = C13598b0.f38549a;
            }
        }
        if (b0Var == null) {
            Log.m105924i(this.f168941j, "doReportInternal immediately");
            LinkedList linkedList = new LinkedList();
            linkedList.add(fs32);
            mo84256m3(linkedList);
        }
    }

    /* renamed from: o3 */
    public final void mo84258o3(String str) {
        String str2 = this.f168941j;
        Log.m105924i(str2, "[reportAllItem] fromScene = " + str + ", size = " + this.f168942n.size());
        List<C49466fs3> list = this.f168942n;
        C87412m.m108593f(list, LocaleUtil.ITALIAN);
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list != null) {
            LinkedList linkedList = new LinkedList();
            linkedList.addAll(list);
            mo84256m3(linkedList);
            this.f168942n.clear();
        }
    }

    public void onLiveActivate() {
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f27265i = null;
        C53973z1 z1Var = this.f168943o;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        mo84258o3("onExitLive");
    }
}
