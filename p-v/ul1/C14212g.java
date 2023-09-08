package ul1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C54219z;
import bl3.C39818r;
import cj1.C54795n5;
import cj1.C54820t;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import dj1.C58271a0;
import dj1.C58274b0;
import f40.C86709a0;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32227p;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import jp3.C9487b;
import nr3.C89059e;
import o40.C61937h;
import pe3.C89349b;
import qo3.C89779i0;
import rl1.C13020c0;
import rl1.C13022d0;
import rx3.C13598b0;
import rx3.C36570n;
import te3.C48659a31;
import te3.C49882ip2;
import te3.C50189kx0;
import te3.C51483u21;
import te3.C51633v21;
import te3.C64273c21;
import tf0.C13883o1;
import tf0.C64916p1;
import ul1.C14205c;
import ul1.C14210f;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ul1.g */
public final class C14212g implements C14209e {

    /* renamed from: z */
    public static final int f39679z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_live_lottery_duration, 15);

    /* renamed from: d */
    public final AppCompatActivity f39680d;

    /* renamed from: e */
    public final String f39681e = "FinderLiveLotteryCreatePresenter";

    /* renamed from: f */
    public final boolean f39682f;

    /* renamed from: g */
    public C14210f f39683g;

    /* renamed from: h */
    public int f39684h;

    /* renamed from: i */
    public String f39685i;

    /* renamed from: j */
    public String f39686j;

    /* renamed from: n */
    public int f39687n;

    /* renamed from: o */
    public int f39688o;

    /* renamed from: p */
    public String f39689p;

    /* renamed from: q */
    public String f39690q;

    /* renamed from: r */
    public boolean f39691r;

    /* renamed from: s */
    public boolean f39692s;

    /* renamed from: t */
    public long f39693t;

    /* renamed from: u */
    public String f39694u;

    /* renamed from: v */
    public long f39695v;

    /* renamed from: w */
    public int f39696w;

    /* renamed from: x */
    public C14205c f39697x;

    /* renamed from: y */
    public final C0000n0 f39698y;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.lottery.create.FinderLiveLotteryCreatePresenter$1", mo125469f = "FinderLiveLotteryCreatePresenter.kt", mo125470l = {93}, mo125471m = "invokeSuspend")
    /* renamed from: ul1.g$a */
    public static final class C14213a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f39699d;

        /* renamed from: e */
        public /* synthetic */ Object f39700e;

        /* renamed from: f */
        public final /* synthetic */ C14212g f39701f;

        /* renamed from: ul1.g$a$a */
        public static final class C14214a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C14212g f39702d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C14214a(C14212g gVar) {
                super(0);
                this.f39702d = gVar;
            }

            public Object invoke() {
                C14212g gVar = this.f39702d;
                int i = C14212g.f39679z;
                gVar.mo13605e();
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14213a(C14212g gVar, C15601d<? super C14213a> dVar) {
            super(2, dVar);
            this.f39701f = gVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C14213a aVar = new C14213a(this.f39701f, dVar);
            aVar.f39700e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C14213a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r5.f39699d
                r2 = 1
                if (r1 == 0) goto L_0x0019
                if (r1 != r2) goto L_0x0011
                java.lang.Object r0 = r5.f39700e
                a14.n0 r0 = (a14.C0000n0) r0
                kotlin.ResultKt.throwOnFailure(r6)
                goto L_0x0039
            L_0x0011:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x0019:
                kotlin.ResultKt.throwOnFailure(r6)
                java.lang.Object r6 = r5.f39700e
                a14.n0 r6 = (a14.C0000n0) r6
                fj1.b r1 = fj1.C45795b.f123698n
                if (r1 == 0) goto L_0x003f
                java.lang.Class<rl1.d0> r3 = rl1.C13022d0.class
                androidx.lifecycle.i0 r1 = r1.mo71262a(r3)
                rl1.d0 r1 = (rl1.C13022d0) r1
                r5.f39700e = r6
                r5.f39699d = r2
                java.lang.Object r1 = r1.mo12546m3(r2, r5)
                if (r1 != r0) goto L_0x0037
                return r0
            L_0x0037:
                r0 = r6
                r6 = r1
            L_0x0039:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x0040
            L_0x003f:
                r0 = 0
            L_0x0040:
                wx3.f r6 = r6.getCoroutineContext()
                a14.C53873d2.m60392d(r6)
                java.lang.Boolean r6 = java.lang.Boolean.TRUE
                boolean r6 = gy3.C87412m.m108589b(r0, r6)
                if (r6 == 0) goto L_0x0059
                ul1.g$a$a r6 = new ul1.g$a$a
                ul1.g r0 = r5.f39701f
                r6.<init>(r0)
                o40.C61926c.m72668M(r6)
            L_0x0059:
                rx3.b0 r6 = rx3.C13598b0.f38549a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ul1.C14212g.C14213a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: ul1.g$b */
    public static final class C14215b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14212g f39703d;

        public C14215b(C14212g gVar) {
            this.f39703d = gVar;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            Class cls = C54991o.class;
            Intent intent = new Intent();
            C45795b.C32059a aVar = C45795b.f123697j;
            C45795b bVar = C45795b.f123698n;
            boolean z = false;
            if (bVar != null && ((C54991o) bVar.mo71262a(cls)).f154190D) {
                z = true;
            }
            intent.putExtra("KEY_LOTTERY_HISTORY_SCENE", z ? 3 : 1);
            intent.putExtra("KEY_LOTTERY_HISTORY_LIVE_ID", this.f39703d.f39693t);
            intent.putExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", this.f39703d.f39695v);
            intent.putExtra("KEY_LOTTERY_HISTORY_OBJECT_NONCE_ID", this.f39703d.f39694u);
            C45795b bVar2 = C45795b.f123698n;
            intent.putExtra("KEY_LIVE_ANCHOR_USERNAME", bVar2 != null ? ((C54991o) bVar2.mo71262a(cls)).f154345o : null);
            C7335d c = C86312j.m106911c(C64916p1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            C64916p1.C64917a.m76443j((C64916p1) c, this.f39703d.f39680d, intent, 0, (String) null, 0, 0, false, 124, (Object) null);
            ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13295yB(this.f39703d.f39680d, intent, true);
            ((C54108o) C86312j.m106911c(C54108o.class)).Mx0(C54067f0.C0051c.CLICK_ENTER_LOTTERY_RECORD_BY_RIGHT, "");
            return true;
        }
    }

    static {
        C32444a aVar = C32444a.f86121a;
    }

    public C14212g(AppCompatActivity appCompatActivity) {
        String str;
        C54219z<Boolean> zVar;
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f39680d = appCompatActivity;
        C32444a aVar = C32444a.f86121a;
        boolean z = false;
        int i = 1;
        boolean z2 = C32444a.f86215x1.mo60266n().intValue() == 1;
        this.f39682f = z2;
        String str2 = "";
        this.f39685i = str2;
        this.f39686j = str2;
        this.f39687n = 3;
        this.f39689p = str2;
        this.f39690q = str2;
        this.f39694u = str2;
        this.f39697x = new C14205c();
        C0000n0 b = C53930o0.m60555b();
        this.f39698y = b;
        this.f39693t = appCompatActivity.getIntent().getLongExtra("KEY_PARAMS_LIVE_ID", 0);
        this.f39695v = appCompatActivity.getIntent().getLongExtra("KEY_PARAMS_OBJECT_ID", 0);
        String stringExtra = appCompatActivity.getIntent().getStringExtra("KEY_PARAMS_NONCE_ID");
        this.f39694u = stringExtra != null ? stringExtra : str2;
        this.f39696w = appCompatActivity.getIntent().getIntExtra("KEY_PARAMS_LOTTERY_SOURCE", 0);
        C14205c.C14206a a = this.f39697x.mo13578a();
        if (a != null) {
            a.f39676e = true;
        }
        this.f39684h = a != null ? a.f39674c : i;
        if (a == null || (str = a.f39672a) == null) {
            str = appCompatActivity.getResources().getString(C0966R.string.f360605dt0);
            C87412m.m108593f(str, "activity.resources.getSt…chooser_type_any_comment)");
        }
        this.f39685i = str;
        C45795b.C32059a aVar2 = C45795b.f123697j;
        C45795b bVar = C45795b.f123698n;
        if (!(bVar == null || (zVar = ((C13022d0) bVar.mo71262a(C13022d0.class)).f37101q) == null)) {
            z = C87412m.m108589b(zVar.getValue(), Boolean.TRUE);
        }
        if (z) {
            mo13605e();
        } else {
            C53895h.m60466d(b, (C66212f) null, (C53934p0) null, new C14213a(this, (C15601d<? super C14213a>) null), 3, (Object) null);
        }
        Log.m105924i("FinderLiveLotteryCreatePresenter", "showAttendTypeCompatibility: " + z2 + ",lotterySource:" + this.f39696w);
    }

    /* renamed from: C0 */
    public void mo13585C0(String str) {
        C87412m.m108594g(str, "wording");
        this.f39686j = str;
        mo13606n(this.f39684h);
    }

    /* renamed from: H */
    public boolean mo13586H() {
        return this.f39697x.f39671i;
    }

    /* renamed from: O0 */
    public void mo13587O0(boolean z) {
        C14205c cVar = this.f39697x;
        cVar.getClass();
        Log.m105924i("FinderLiveLotteryCreateConfig", "setEnableRepeatLottery enableRepeatLottery:" + z);
        cVar.f39671i = z;
    }

    /* renamed from: Q */
    public C14205c.C14206a mo13588Q() {
        return this.f39697x.mo13578a();
    }

    /* renamed from: Q0 */
    public void mo13589Q0(String str) {
        C87412m.m108594g(str, "desc");
        this.f39689p = str;
        mo13606n(this.f39684h);
    }

    /* renamed from: S */
    public boolean mo13590S() {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.f39684h;
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                z3 = this.f39691r & this.f39692s & mo13608t();
                z2 = mo13607q();
                z = z3 & z2;
                String str = this.f39681e;
                Log.m105924i(str, "checkLotteryState type:" + this.f39684h + ",canConfirm:" + z + '!');
                return z;
            } else if (!(i == 4 || i == 5)) {
                z = false;
                String str2 = this.f39681e;
                Log.m105924i(str2, "checkLotteryState type:" + this.f39684h + ",canConfirm:" + z + '!');
                return z;
            }
        }
        z3 = this.f39691r & this.f39692s;
        z2 = mo13607q();
        z = z3 & z2;
        String str22 = this.f39681e;
        Log.m105924i(str22, "checkLotteryState type:" + this.f39684h + ",canConfirm:" + z + '!');
        return z;
    }

    /* renamed from: W */
    public void mo13591W(C14205c.C14206a aVar) {
        C87412m.m108594g(aVar, "type");
        this.f39697x.mo13581d(aVar.f39674c);
        mo13606n(this.f39684h);
    }

    /* renamed from: d0 */
    public void mo13592d0(int i) {
        this.f39687n = i;
        mo13606n(this.f39684h);
    }

    /* renamed from: e */
    public final void mo13605e() {
        AppCompatActivity appCompatActivity = this.f39680d;
        MMActivity mMActivity = appCompatActivity instanceof MMActivity ? (MMActivity) appCompatActivity : null;
        if (mMActivity != null) {
            mMActivity.addTextOptionMenu(0, ((MMActivity) appCompatActivity).getResources().getString(C0966R.string.dxq), new C14215b(this));
        }
    }

    /* renamed from: h0 */
    public int mo13593h0() {
        return this.f39687n;
    }

    /* renamed from: i1 */
    public void mo13594i1(String str) {
        C87412m.m108594g(str, "content");
        this.f39690q = str;
        mo13606n(this.f39684h);
    }

    /* renamed from: j1 */
    public List<C14205c.C14206a> mo13595j1() {
        return (ArrayList) ((C36570n) this.f39697x.f39668f).getValue();
    }

    /* renamed from: k0 */
    public void mo13596k0(C14205c.C14206a aVar) {
        C14210f fVar;
        C87412m.m108594g(aVar, "type");
        C14205c cVar = this.f39697x;
        cVar.getClass();
        Iterator<T> it = cVar.f39665c.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            C14205c.C14206a aVar2 = (C14205c.C14206a) it.next();
            if (aVar2.f39674c == aVar.f39674c) {
                z = true;
            }
            aVar2.f39676e = z;
        }
        cVar.f39669g = aVar.f39674c;
        cVar.f39667e.clear();
        cVar.f39667e.addAll(cVar.f39665c);
        cVar.f39667e.addAll(cVar.f39666d);
        int i = aVar.f39674c;
        if (i != 3) {
            this.f39686j = "";
        }
        this.f39684h = i;
        this.f39685i = aVar.f39672a;
        mo13606n(i);
        if (this.f39682f && this.f39684h == 4 && (fVar = this.f39683g) != null) {
            fVar.mo13604t0(0, 0, MMApplicationContext.getResources().getString(C0966R.string.dsm), (C50189kx0) null);
        }
    }

    /* renamed from: l0 */
    public List<C14205c.C14206a> mo13597l0() {
        C14205c cVar = this.f39697x;
        if (cVar.f39667e.isEmpty()) {
            cVar.mo13580c();
        }
        return cVar.f39667e;
    }

    /* renamed from: n */
    public final void mo13606n(int i) {
        String str = this.f39681e;
        Log.m105924i(str, "checkLotteryState type:" + i);
        int i2 = f39679z;
        int i3 = this.f39687n;
        boolean z = 1 <= i3 && i3 <= i2;
        String str2 = this.f39681e;
        Log.m105924i(str2, "isValidDuration duration:" + this.f39687n + " valid:" + z);
        this.f39691r = z;
        int i4 = this.f39688o;
        boolean z2 = 1 <= i4 && i4 <= Integer.MAX_VALUE;
        String str3 = this.f39681e;
        Log.m105924i(str3, "isValidWinnerNumber winnerNumber:" + this.f39688o + " valid:" + z2);
        this.f39692s = z2;
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                C14210f fVar = this.f39683g;
                if (fVar != null) {
                    C14210f.C14211a.m13552a(fVar, z2 & this.f39691r & mo13608t() & mo13607q(), 0, 2, (Object) null);
                }
                C14210f fVar2 = this.f39683g;
                if (fVar2 != null) {
                    fVar2.mo13600I(this.f39691r);
                    return;
                }
                return;
            } else if (!(i == 4 || i == 5)) {
                C14210f fVar3 = this.f39683g;
                if (fVar3 != null) {
                    C14210f.C14211a.m13552a(fVar3, false, 0, 2, (Object) null);
                    return;
                }
                return;
            }
        }
        C14210f fVar4 = this.f39683g;
        if (fVar4 != null) {
            C14210f.C14211a.m13552a(fVar4, z2 & this.f39691r & mo13607q(), 0, 2, (Object) null);
        }
        C14210f fVar5 = this.f39683g;
        if (fVar5 != null) {
            fVar5.mo13600I(this.f39691r);
        }
    }

    public void onAttach(Object obj) {
        Object obj2;
        String str;
        boolean z;
        C14210f fVar = (C14210f) obj;
        C87412m.m108594g(fVar, "callback");
        this.f39683g = fVar;
        int i = this.f39696w;
        C14205c cVar = this.f39697x;
        Iterator it = ((ArrayList) ((C36570n) cVar.f39668f).getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((C14205c.C14206a) obj2).f39674c == cVar.f39670h) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C14205c.C14206a aVar = (C14205c.C14206a) obj2;
        if (aVar == null || (str = aVar.f39672a) == null) {
            str = "";
        }
        fVar.mo13601U(i, str);
        mo13606n(this.f39684h);
    }

    public void onDetach() {
        C13598b0 b0Var;
        C64273c21 c212;
        C14210f fVar = this.f39683g;
        if (fVar != null) {
            fVar.destroy();
        }
        this.f39683g = null;
        C14205c cVar = this.f39697x;
        cVar.getClass();
        Class cls = C55001u.class;
        FinderLiveService.f159376d.getClass();
        C54795n5 n5Var = FinderLiveService.f159396y;
        C45795b bVar = C45795b.f123698n;
        C49882ip2 ip22 = bVar != null ? ((C13022d0) bVar.mo71262a(C13022d0.class)).f37103s : null;
        C45795b bVar2 = C45795b.f123698n;
        Long valueOf = (bVar2 == null || (c212 = ((C55001u) bVar2.mo71262a(cls)).f154420q) == null) ? null : Long.valueOf(c212.f182392d);
        C45795b bVar3 = C45795b.f123698n;
        Long valueOf2 = bVar3 != null ? Long.valueOf(((C55001u) bVar3.mo71262a(cls)).f154416j) : null;
        C45795b bVar4 = C45795b.f123698n;
        Integer valueOf3 = bVar4 != null ? Integer.valueOf(((C54991o) bVar4.mo71262a(C54991o.class)).f154354q) : null;
        if (n5Var == null || ip22 == null || valueOf == null || valueOf2 == null || valueOf3 == null) {
            b0Var = null;
        } else {
            valueOf3.intValue();
            long longValue = valueOf2.longValue();
            long longValue2 = valueOf.longValue();
            ip22.f135572e = cVar.f39669g;
            ip22.f135571d = (long) (cVar.f39671i ? ((int) ip22.f135571d) | 1 : ((int) ip22.f135571d) & -2);
            ((C54820t) n5Var).mo75783s0(longValue2, longValue, ip22, new C14208d(ip22));
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105920e("FinderLiveLotteryCreateConfig", "setLiveLotterySetting error!");
        }
        C53930o0.m60558e(this.f39698y, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: q */
    public final boolean mo13607q() {
        String str = this.f39681e;
        Log.m105924i(str, "isValidClaimPrize lastLotteryClaimPrizeType:" + this.f39697x.f39670h + ",customClaimPrizeContent:" + this.f39690q);
        if (this.f39697x.f39670h == 2) {
            return this.f39690q.length() > 0;
        }
    }

    /* renamed from: t */
    public final boolean mo13608t() {
        String str = this.f39681e;
        Log.m105924i(str, "isValidWording wording:" + this.f39686j);
        return this.f39686j.length() > 0;
    }

    /* renamed from: y */
    public void mo13598y() {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_LOTTERY_LICENSE_BOOLEAN_SYNC, Boolean.TRUE);
        if (this.f39696w == 0) {
            AppCompatActivity appCompatActivity = this.f39680d;
            byte[] bArr = null;
            boolean z = true;
            C89779i0 e = C89779i0.m112248e(appCompatActivity, appCompatActivity.getString(C0966R.string.a4d), true, 3, (DialogInterface.OnCancelListener) null);
            C45795b bVar = C45795b.f123698n;
            if (bVar != null && ((C54991o) bVar.mo71262a(C54991o.class)).f154190D) {
                ((C54116w) C86312j.m106911c(C54116w.class)).Gx0(2);
            } else if (this.f39684h == 1) {
                if (this.f39686j.length() <= 0) {
                    z = false;
                }
                if (z) {
                    ((C54108o) C86312j.m106911c(C54108o.class)).Mx0(C54067f0.C0051c.WRITE_SPECIFY_COMMENT_CONTENT_SUCC, this.f39686j);
                }
            }
            long j = this.f39693t;
            long j2 = this.f39695v;
            String str = this.f39694u;
            int i = this.f39687n * 60;
            String str2 = this.f39689p;
            int i2 = this.f39684h;
            String str3 = this.f39686j;
            int i3 = C58271a0.f166853v;
            int i4 = this.f39688o;
            long b = (long) this.f39697x.mo13579b();
            C45795b bVar2 = C45795b.f123698n;
            if (bVar2 != null) {
                bArr = ((C55001u) bVar2.mo71262a(C55001u.class)).f154417n;
            }
            C89349b a = C89349b.m111674a(bArr);
            C51633v21 v212 = r3;
            C51633v21 v213 = new C51633v21();
            v213.f143256d = this.f39697x.f39670h;
            v213.f143257e = this.f39690q;
            C13598b0 b0Var = C13598b0.f38549a;
            C89059e i5 = new C58271a0(new C58274b0(j, j2, str, i, str2, i2, str3, 0, i4, b, a, v212, 0)).mo9225i();
            i5.mo123420E(new C14217i(e, this));
            AppCompatActivity appCompatActivity2 = this.f39680d;
            if (appCompatActivity2 instanceof C9487b) {
                i5.mo11397F((C9487b) appCompatActivity2);
                return;
            }
            return;
        }
        C13020c0 c0Var = (C13020c0) C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C13020c0.class);
        C48659a31 a312 = new C48659a31();
        a312.f130268e = this.f39687n * 60;
        a312.f130269f = this.f39689p;
        C51483u21 u212 = new C51483u21();
        u212.f142563d = this.f39684h;
        u212.f142564e = this.f39686j;
        u212.f142565f = this.f39685i;
        a312.f130270g = u212;
        a312.f130271h = this.f39688o;
        a312.f130272i = (long) this.f39697x.mo13579b();
        C51633v21 v214 = new C51633v21();
        v214.f143256d = this.f39697x.f39670h;
        v214.f143257e = this.f39690q;
        a312.f130273j = v214;
        c0Var.getClass();
        String str4 = c0Var.f37082d;
        Log.m105924i(str4, "saveLotteryPrepareItem suc,add item:" + C61937h.m72709h(a312) + " to index:" + c0Var.f37083e.size());
        c0Var.f37083e.add(a312);
        C14210f fVar = this.f39683g;
        if (fVar != null) {
            fVar.destroy();
        }
        AppCompatActivity appCompatActivity3 = this.f39680d;
        appCompatActivity3.setResult(-1, appCompatActivity3.getIntent());
        this.f39680d.finish();
    }

    /* renamed from: y0 */
    public void mo13599y0(int i) {
        this.f39688o = i;
        mo13606n(this.f39684h);
    }
}
