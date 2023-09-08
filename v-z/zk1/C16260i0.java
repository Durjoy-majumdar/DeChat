package zk1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53953u0;
import a14.C53973z1;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bd1.C54446b;
import bl3.C0317e;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C8761d3;
import ht1.C8777j5;
import ht1.C8801r5;
import java.util.Map;
import java.util.concurrent.CancellationException;
import je1.C9363p2;
import kotlin.ResultKt;
import mk1.C10906h;
import ob0.C11385n;
import ob0.C117747y;
import qo3.C47883u;
import qo3.C77407n;
import qo3.C77426q;
import rx3.C13598b0;
import te3.C50119ke1;
import tf0.C13883o1;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: zk1.i0 */
public final class C16260i0 extends UIComponent implements C11385n, C8761d3 {

    /* renamed from: d */
    public final String f43537d = "FinderLivePostUIC";

    /* renamed from: e */
    public final int f43538e = 10001;

    /* renamed from: f */
    public final int f43539f = 10002;

    /* renamed from: g */
    public final int f43540g = 10003;

    /* renamed from: h */
    public C77407n f43541h;

    /* renamed from: i */
    public C50119ke1 f43542i;

    /* renamed from: j */
    public C32229r<? super Integer, ? super Integer, ? super String, ? super C8801r5, C13598b0> f43543j;

    /* renamed from: n */
    public C32224a<C13598b0> f43544n;

    /* renamed from: o */
    public final C10906h f43545o;

    /* renamed from: p */
    public C53953u0<C10906h.C10907a> f43546p;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLivePostBtnUIC$onLivePostBtnClick$1", mo125469f = "FinderLivePostBtnUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: zk1.i0$a */
    public static final class C16261a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C16260i0 f43547d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16261a(C16260i0 i0Var, C15601d<? super C16261a> dVar) {
            super(2, dVar);
            this.f43547d = i0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C16261a(this.f43547d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C16261a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C16260i0 i0Var = this.f43547d;
            C53953u0<C10906h.C10907a> u0Var = i0Var.f43546p;
            if (u0Var != null) {
                C53973z1.C53974a.m60623a(u0Var, (CancellationException) null, 1, (Object) null);
            }
            i0Var.f43546p = C53895h.m60464b(i0Var.getMainScope(), (C66212f) null, (C53934p0) null, new C16264j0(i0Var, (C15601d<? super C16264j0>) null), 3, (Object) null);
            C16260i0 i0Var2 = this.f43547d;
            Class cls = C8761d3.class;
            C77407n nVar = new C77407n((Context) i0Var2.getActivity(), 1, false);
            i0Var2.f43541h = nVar;
            nVar.f225771i = new C16266k0(i0Var2);
            nVar.f225782p = new C16268l0(i0Var2);
            nVar.mo107573q();
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C39818r rVar = C39818r.f106831a;
            C8777j5.C8778a.m8601b((C8777j5) c, 3, ((C8761d3) rVar.mo62444c(i0Var2.getActivity()).mo62447c(cls)).mo9589n1(), ((C8761d3) rVar.mo62444c(i0Var2.getActivity()).mo62447c(cls)).mo9585G(), (Map) null, 8, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zk1.i0$b */
    public static final class C16262b implements C47883u {

        /* renamed from: a */
        public static final C16262b f43548a = new C16262b();

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16260i0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        this.f43545o = new C10906h((MMFragmentActivity) activity, 0, 0, 6, (C8480h) null);
    }

    /* renamed from: A0 */
    public void mo9583A0() {
        boolean z;
        Log.m105924i(this.f43537d, "FinderLive.entrance,live btn click!");
        if (NetStatusUtil.isConnected((Context) getActivity())) {
            C66785b bVar = C66785b.f191882e;
            boolean z2 = false;
            if (Util.isNullOrNil(bVar.mo90662O5())) {
                Intent intent = new Intent();
                intent.putExtra("key_router_to_profile", false);
                intent.putExtra("key_create_scene", 3);
                ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13297zc(getContext(), getIntent());
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C54446b c = C66783a.C66784a.m78800c(bVar, false, 1, (Object) null);
                if (c != null && c.mo75252n2()) {
                    z2 = true;
                }
                if (z2) {
                    C58739j4.f168176a.mo83706e0();
                    return;
                }
                C0317e.launchUI$default(this, (C66212f) null, (C53934p0) null, new C16261a(this, (C15601d<? super C16261a>) null), 3, (Object) null);
                return;
            }
            return;
        }
        C77426q qVar = new C77426q(getActivity());
        qVar.mo107595g(getActivity().getResources().getString(C0966R.string.dpr));
        qVar.mo107602n(getActivity().getResources().getString(C0966R.string.f8028zq));
        qVar.mo107600l(C16262b.f43548a);
        qVar.mo107603o();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045  */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9584C0(te3.C50119ke1 r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0035
            java.util.LinkedList<te3.zg3> r1 = r6.f136709z
            if (r1 == 0) goto L_0x0035
            java.util.Iterator r1 = r1.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r1.next()
            r3 = r2
            te3.zg3 r3 = (te3.C52261zg3) r3
            com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.f145918e
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = r3.username
            goto L_0x0020
        L_0x001f:
            r3 = r0
        L_0x0020:
            zc1.b r4 = zc1.C66785b.f191882e
            java.lang.String r4 = r4.mo90662O5()
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x000b
            goto L_0x002e
        L_0x002d:
            r2 = r0
        L_0x002e:
            te3.zg3 r2 = (te3.C52261zg3) r2
            if (r2 == 0) goto L_0x0035
            te3.jp1 r1 = r2.f145922i
            goto L_0x0036
        L_0x0035:
            r1 = r0
        L_0x0036:
            java.lang.String r2 = r5.f43537d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "setPrepareResp wxaShopInfo appId:"
            r3.append(r4)
            if (r1 == 0) goto L_0x0047
            java.lang.String r0 = r1.f136237d
        L_0x0047:
            r3.append(r0)
            r0 = 44
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r5.f43542i = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zk1.C16260i0.mo9584C0(te3.ke1):void");
    }

    /* renamed from: G */
    public long mo9585G() {
        return this.f43545o.f32536c;
    }

    /* renamed from: V2 */
    public void mo9586V2(int i) {
        this.f43545o.f32535b = i;
    }

    /* renamed from: h1 */
    public void mo9587h1(C32229r<? super Integer, ? super Integer, ? super String, ? super C8801r5, C13598b0> rVar) {
        this.f43543j = rVar;
    }

    /* renamed from: i1 */
    public C50119ke1 mo9588i1() {
        return this.f43542i;
    }

    /* renamed from: n1 */
    public int mo9589n1() {
        return this.f43545o.f32535b;
    }

    public void onResume() {
        super.onResume();
        C86709a0.m107524d().mo123455a(6653, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2 = this.f43537d;
        Log.m105924i(str2, "errType " + i + ", errCode " + i2 + ", errMsg " + str);
        C32229r<? super Integer, ? super Integer, ? super String, ? super C8801r5, C13598b0> rVar = this.f43543j;
        if (rVar != null) {
            rVar.mo162I(Integer.valueOf(i), Integer.valueOf(i2), str, yVar instanceof C9363p2 ? (C9363p2) yVar : null);
        }
    }

    public void onStop() {
        super.onStop();
        C86709a0.m107524d().mo123470p(6653, this);
    }

    /* renamed from: w0 */
    public void mo9590w0(C32224a<C13598b0> aVar) {
        this.f43544n = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16260i0(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        this.f43545o = new C10906h((MMFragmentActivity) activity, 0, 0, 6, (C8480h) null);
    }
}
