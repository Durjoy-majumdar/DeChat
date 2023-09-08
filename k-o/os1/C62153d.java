package os1;

import a14.C0000n0;
import a14.C53934p0;
import android.content.DialogInterface;
import android.os.Build;
import bl3.C0317e;
import bl3.C0327w;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderLocationRefreshEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C31543z5;
import f40.C86709a0;
import fe1.C8014g;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C59740b0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import je1.C60810v1;
import kotlin.Result;
import kotlin.ResultKt;
import mp3.C88819d;
import nj3.C76879j;
import o40.C61926c;
import p447aw.C103918d;
import p702ts.C78085c;
import q40.C89456b;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C64742ty1;
import up1.C37521f;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;
import z04.C66730w;

/* renamed from: os1.d */
public final class C62153d extends C0327w<FinderCommonFeatureService> implements C8014g {

    /* renamed from: e */
    public C64742ty1 f176721e;

    /* renamed from: f */
    public final C62154a f176722f = new C62154a(this);

    /* renamed from: os1.d$a */
    public static final class C62154a implements C92411b.C92412a {

        /* renamed from: d */
        public final /* synthetic */ C62153d f176723d;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.FinderGlobalLocationVM$locationListener$1$onGetLocation$1", mo125469f = "FinderGlobalLocationVM.kt", mo125470l = {81}, mo125471m = "invokeSuspend")
        /* renamed from: os1.d$a$a */
        public static final class C62155a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f176724d;

            /* renamed from: e */
            public int f176725e;

            /* renamed from: f */
            public /* synthetic */ Object f176726f;

            /* renamed from: g */
            public final /* synthetic */ C62153d f176727g;

            /* renamed from: h */
            public final /* synthetic */ C59740b0 f176728h;

            /* renamed from: i */
            public final /* synthetic */ C59740b0 f176729i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62155a(C62153d dVar, C59740b0 b0Var, C59740b0 b0Var2, C15601d<? super C62155a> dVar2) {
                super(2, dVar2);
                this.f176727g = dVar;
                this.f176728h = b0Var;
                this.f176729i = b0Var2;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C62155a aVar = new C62155a(this.f176727g, this.f176728h, this.f176729i, dVar);
                aVar.f176726f = obj;
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C62155a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                C62153d dVar;
                C62153d dVar2;
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f176725e;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C0000n0 n0Var = (C0000n0) this.f176726f;
                    C62153d dVar3 = this.f176727g;
                    C59740b0 b0Var = this.f176728h;
                    C59740b0 b0Var2 = this.f176729i;
                    Result.Companion companion = Result.Companion;
                    C60810v1 v1Var = new C60810v1(b0Var.f170633d, b0Var2.f170633d);
                    this.f176726f = dVar3;
                    this.f176724d = dVar3;
                    this.f176725e = 1;
                    Object a = C89456b.m111831a(v1Var, 0, (C88819d) null, this, 3, (Object) null);
                    if (a == aVar) {
                        return aVar;
                    }
                    dVar2 = dVar3;
                    obj = a;
                    dVar = dVar2;
                } else if (i == 1) {
                    dVar2 = (C62153d) this.f176724d;
                    dVar = (C62153d) this.f176726f;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        obj2 = Result.m168114constructorimpl(ResultKt.createFailure(th));
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar2.f176721e = (C64742ty1) obj;
                C64742ty1 ty12 = dVar.f176721e;
                C13598b0 b0Var3 = null;
                if (ty12 != null) {
                    if (Util.isNullOrNil(ty12.f185694d)) {
                        dVar.f176721e = null;
                        Log.m105924i("Finder.GlobalLocationVM", "Get Location Fail");
                    } else {
                        String str = ty12.f185695e;
                        if (str == null) {
                            str = "";
                        }
                        ty12.f185695e = str;
                        String str2 = ty12.f185696f;
                        if (str2 == null) {
                            str2 = "";
                        }
                        ty12.f185696f = str2;
                        Log.m105924i("Finder.GlobalLocationVM", "Get Location " + ty12.f185694d + ' ' + ty12.f185695e + ' ' + ty12.f185696f);
                    }
                    b0Var3 = C13598b0.f38549a;
                }
                if (b0Var3 == null) {
                    Log.m105924i("Finder.GlobalLocationVM", "Get Location Fail");
                }
                obj2 = Result.m168114constructorimpl(C13598b0.f38549a);
                Throwable r15 = Result.m168117exceptionOrNullimpl(obj2);
                if (r15 != null) {
                    Log.printErrStackTrace("Finder.GlobalLocationVM", r15, "", new Object[0]);
                }
                return C13598b0.f38549a;
            }
        }

        public C62154a(C62153d dVar) {
            this.f176723d = dVar;
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            float f3 = f;
            float f4 = f2;
            ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126408b(this);
            C59740b0 b0Var = new C59740b0();
            double d4 = (double) f3;
            b0Var.f170633d = d4;
            C59740b0 b0Var2 = new C59740b0();
            double d5 = (double) f4;
            b0Var2.f170633d = d5;
            if (z) {
                this.f176723d.getClass();
                long c = C31543z5.m39453c();
                Log.m105924i("Finder.GlobalLocationVM", "[storeLocation] longitude=" + f3 + " latitude=" + f4 + " time=" + c);
                C85801v1 i2 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_LOCATION_STRING;
                StringBuilder sb = new StringBuilder();
                sb.append(f3);
                sb.append(';');
                sb.append(f4);
                i2.mo119677K(aVar, sb.toString());
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LOCATION_TIME_LONG, Long.valueOf(c));
                Log.m105924i("Finder.GlobalLocationVM", "[onGetLocation] longitude=" + b0Var.f170633d + " latitude=" + b0Var2.f170633d);
                FinderLocationRefreshEvent finderLocationRefreshEvent = new FinderLocationRefreshEvent();
                FinderLocationRefreshEvent.C55132a aVar2 = finderLocationRefreshEvent.f154801d;
                aVar2.f154802a = d4;
                aVar2.f154803b = d5;
                finderLocationRefreshEvent.publish();
            } else {
                C13604l<Float, Float> X0 = this.f176723d.mo9104X0();
                b0Var.f170633d = (double) ((Number) X0.f38555d).floatValue();
                b0Var2.f170633d = (double) ((Number) X0.f38556e).floatValue();
                Log.m105924i("Finder.GlobalLocationVM", "[onGetLocation] from cache. longitude=" + b0Var.f170633d + " latitude=" + b0Var2.f170633d);
            }
            C62153d dVar = this.f176723d;
            C0317e.launch$default(dVar, (C66212f) null, (C53934p0) null, new C62155a(dVar, b0Var2, b0Var, (C15601d<? super C62155a>) null), 3, (Object) null);
            return true;
        }
    }

    /* renamed from: os1.d$b */
    public static final class C62156b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62153d f176730d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62156b(C62153d dVar) {
            super(0);
            this.f176730d = dVar;
        }

        public Object invoke() {
            ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126407a(this.f176730d.f176722f, true);
            C5139t.m5183e(5, 10);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: os1.d$c */
    public static final class C62157c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f176731d;

        public C62157c(MMActivity mMActivity) {
            this.f176731d = mMActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((C58417y0) C86312j.m106911c(C58417y0.class)).Hx0(this.f176731d, 4);
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f176731d);
        }
    }

    /* renamed from: os1.d$d */
    public static final class C62158d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f176732d;

        public C62158d(MMActivity mMActivity) {
            this.f176732d = mMActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((C58417y0) C86312j.m106911c(C58417y0.class)).Hx0(this.f176732d, 3);
        }
    }

    public C62153d() {
        Log.m105924i("Finder.GlobalLocationVM", "isGetGps=" + C37521f.f99374d.mo61170X());
    }

    /* renamed from: H */
    public boolean mo9103H() {
        return ((C103918d) C86312j.m106911c(C103918d.class)).Un0(MMApplicationContext.getContext(), "android.permission.ACCESS_FINE_LOCATION", false);
    }

    /* renamed from: X0 */
    public C13604l<Float, Float> mo9104X0() {
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_LOCATION_STRING, ";");
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
        List T = C112550d0.m153784T((String) f, new char[]{';'}, false, 0, 6, (Object) null);
        Float d = C66730w.m78730d((String) T.get(0));
        float f2 = 0.0f;
        float floatValue = d != null ? d.floatValue() : 0.0f;
        Float d2 = C66730w.m78730d((String) T.get(1));
        if (d2 != null) {
            f2 = d2.floatValue();
        }
        return new C13604l<>(Float.valueOf(floatValue), Float.valueOf(f2));
    }

    /* renamed from: q2 */
    public boolean mo9105q2(boolean z) {
        if (!z && !C37521f.f99374d.mo61170X()) {
            Log.m105928w("Finder.GlobalLocationVM", "[requestLocation] is not enabel");
            return false;
        } else if (!mo9103H()) {
            Log.m105928w("Finder.GlobalLocationVM", "[requestLocation] without perssion.");
            return false;
        } else {
            Log.m105924i("Finder.GlobalLocationVM", "[requestLocation]... " + Util.getStack());
            C61926c.m72661F("Finder.GlobalLocationVM#RequestLocation", new C62156b(this));
            return true;
        }
    }

    /* renamed from: t1 */
    public long mo9106t1() {
        long G = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_LOCATION_TIME_LONG, 0);
        Log.m105924i("Finder.GlobalLocationVM", "[lastLocationTime] time=" + G);
        return G;
    }

    /* renamed from: u */
    public void mo9107u(MMActivity mMActivity) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (Build.VERSION.SDK_INT <= 23 || mMActivity.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(mMActivity, "android.permission.ACCESS_FINE_LOCATION", 79, (String) null, (String) null);
            return;
        }
        C76879j.m92709C(mMActivity, mMActivity.getString(C0966R.string.f361129hi0), mMActivity.getString(C0966R.string.hif), mMActivity.getString(C0966R.string.fyd), mMActivity.getString(C0966R.string.f7926wf), false, new C62157c(mMActivity), new C62158d(mMActivity));
    }
}
